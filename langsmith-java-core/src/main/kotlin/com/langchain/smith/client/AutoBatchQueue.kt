package com.langchain.smith.client

import com.fasterxml.jackson.databind.node.ObjectNode
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.Timeout
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.jsonMapper
import com.langchain.smith.models.runs.RunIngest
import com.langchain.smith.models.runs.RunIngestBatchParams
import java.util.concurrent.CompletionException
import java.util.concurrent.CompletionStage
import java.util.concurrent.ConcurrentLinkedQueue
import java.util.concurrent.ExecutionException
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.Phaser
import java.util.concurrent.RejectedExecutionException
import java.util.concurrent.ScheduledExecutorService
import java.util.concurrent.ScheduledFuture
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock
import kotlin.jvm.optionals.getOrNull
import org.slf4j.LoggerFactory

/**
 * Batches run create/update operations and sends them to LangSmith in a single `ingestBatch`
 * request, reducing HTTP overhead.
 *
 * Operations are buffered and flushed either:
 * - When the buffer reaches [batchSizeLimit] operations
 * - After [aggregationDelayMs] milliseconds of inactivity (timer-based drain)
 * - When [flush] is called explicitly
 *
 * @param sendBatch sends a batch and completes when the send has finished
 * @param batchSizeLimit max operations before auto-flush (default 100)
 * @param aggregationDelayMs inactivity delay before timer-based flush (default 250ms, matching JS
 *   auto-batch aggregation and Python's initial queue wait)
 * @param sendParallelism max number of batch requests to send concurrently (default 4)
 * @param maxAggregationDelayMs max delay before timer-based flush after first item in a burst
 *   (default 500ms, matching Python's background flush interval)
 * @param batchSizeLimitBytes max serialized JSON body size per batch (default 20 MiB)
 */
class AutoBatchQueue(
    private val sendBatch: (RunIngestBatchParams, RequestOptions) -> CompletionStage<Void?>,
    private val batchSizeLimit: Int = DEFAULT_BATCH_SIZE_LIMIT,
    private val aggregationDelayMs: Long = DEFAULT_AGGREGATION_DELAY_MS,
    private val sendParallelism: Int = DEFAULT_SEND_PARALLELISM,
    private val maxAggregationDelayMs: Long = DEFAULT_MAX_AGGREGATION_DELAY_MS,
    private val batchSizeLimitBytes: Int,
) {
    private val items = ConcurrentLinkedQueue<BatchItem>()
    private val queuedCount = AtomicInteger(0)
    private val shutdown = AtomicBoolean(false)
    private val enqueueShutdownLock = ReentrantLock()
    private val delayedFlushLock = ReentrantLock()
    private var delayedFlushFuture: ScheduledFuture<*>? = null
    private var firstQueuedAtNanos: Long? = null
    private val activeSends =
        object : Phaser(0) {
            override fun onAdvance(phase: Int, registeredParties: Int): Boolean = false
        }

    private val coordinator: ScheduledExecutorService =
        Executors.newSingleThreadScheduledExecutor { r ->
            Thread(r, "langsmith-batch-coordinator").apply { isDaemon = true }
        }

    private val sendExecutor: ExecutorService =
        Executors.newFixedThreadPool(sendParallelism) { r ->
            Thread(r, "langsmith-batch-sender").apply { isDaemon = true }
        }

    /** Enqueues a run create operation. */
    fun post(
        run: RunIngest,
        headers: Headers = Headers.builder().build(),
        queryParams: QueryParams = QueryParams.builder().build(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) {
        enqueue(BatchOp.Post, run, headers, queryParams, requestOptions)
    }

    /** Enqueues a run update (patch) operation. */
    fun patch(
        run: RunIngest,
        headers: Headers = Headers.builder().build(),
        queryParams: QueryParams = QueryParams.builder().build(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) {
        enqueue(BatchOp.Patch, run, headers, queryParams, requestOptions)
    }

    /**
     * Flushes all queued operations immediately, blocking until batch requests that were queued or
     * already in-flight have completed.
     *
     * Safe to call from any thread. No-op if the queue is empty.
     */
    fun flush() {
        cancelDelayedFlush()
        while (true) {
            if (queuedCount.get() > 0 && !drainOnCoordinator()) {
                return
            }

            if (!waitForActiveSends()) {
                return
            }

            if (queuedCount.get() == 0 && !hasActiveSends()) {
                return
            }
        }
    }

    /**
     * Flushes remaining operations and shuts down the background executors.
     *
     * After calling this, the queue will no longer accept new operations.
     */
    fun shutdown() {
        val startedShutdown =
            enqueueShutdownLock.withLock {
                // Serialize with enqueue's check-and-add so flush cannot miss an item that observed
                // shutdown=false but has not yet been queued.
                shutdown.compareAndSet(false, true)
            }
        if (!startedShutdown) return

        flush()
        coordinator.shutdown()
        sendExecutor.shutdown()

        try {
            if (!coordinator.awaitTermination(5, TimeUnit.SECONDS)) {
                coordinator.shutdownNow()
            }
            if (!sendExecutor.awaitTermination(5, TimeUnit.SECONDS)) {
                sendExecutor.shutdownNow()
            }
        } catch (_: InterruptedException) {
            coordinator.shutdownNow()
            sendExecutor.shutdownNow()
            Thread.currentThread().interrupt()
        }
    }

    constructor(
        sendBatch: (RunIngestBatchParams, RequestOptions) -> CompletionStage<Void?>,
        batchSizeLimit: Int = DEFAULT_BATCH_SIZE_LIMIT,
        aggregationDelayMs: Long = DEFAULT_AGGREGATION_DELAY_MS,
        sendParallelism: Int = DEFAULT_SEND_PARALLELISM,
    ) : this(
        sendBatch = sendBatch,
        batchSizeLimit = batchSizeLimit,
        aggregationDelayMs = aggregationDelayMs,
        sendParallelism = sendParallelism,
        maxAggregationDelayMs = DEFAULT_MAX_AGGREGATION_DELAY_MS,
        batchSizeLimitBytes = DEFAULT_BATCH_SIZE_LIMIT_BYTES,
    )

    /** Returns the number of queued operations (for testing). */
    internal fun size(): Int = queuedCount.get()

    private fun enqueue(
        op: BatchOp,
        run: RunIngest,
        headers: Headers,
        queryParams: QueryParams,
        requestOptions: RequestOptions,
    ) {
        val count =
            enqueueShutdownLock.withLock {
                check(!shutdown.get()) { "AutoBatchQueue is shut down" }
                items.add(
                    BatchItem(
                        op = op,
                        run = run,
                        headers = headers,
                        queryParams = queryParams,
                        requestOptions = requestOptions,
                    )
                )
                queuedCount.incrementAndGet()
            }

        afterEnqueue(count)
    }

    private fun afterEnqueue(count: Int) {
        if (count >= batchSizeLimit) {
            triggerFlush()
        } else {
            scheduleFlush()
        }
    }

    private fun scheduleFlush() {
        delayedFlushLock.withLock {
            try {
                val now = System.nanoTime()
                val firstQueuedAt = firstQueuedAtNanos ?: now.also { firstQueuedAtNanos = it }
                val elapsedMs = TimeUnit.NANOSECONDS.toMillis(now - firstQueuedAt)
                val remainingMaxDelayMs = (maxAggregationDelayMs - elapsedMs).coerceAtLeast(0)
                val delayMs = minOf(aggregationDelayMs, remainingMaxDelayMs)

                delayedFlushFuture?.cancel(false)
                delayedFlushFuture =
                    coordinator.schedule(
                        {
                            clearDelayedFlushState()
                            drainAndSubmitSends()
                        },
                        delayMs,
                        TimeUnit.MILLISECONDS,
                    )
            } catch (e: RejectedExecutionException) {
                delayedFlushFuture = null
                firstQueuedAtNanos = null
                logger.warn("Batch queue coordinator rejected delayed flush", e)
            }
        }
    }

    private fun clearDelayedFlushState() {
        delayedFlushLock.withLock {
            delayedFlushFuture = null
            firstQueuedAtNanos = null
        }
    }

    private fun triggerFlush() {
        cancelDelayedFlush()
        try {
            coordinator.execute { drainAndSubmitSends() }
        } catch (e: RejectedExecutionException) {
            logger.warn("Batch queue coordinator rejected flush", e)
        }
    }

    private fun cancelDelayedFlush() {
        delayedFlushLock.withLock {
            delayedFlushFuture?.cancel(false)
            delayedFlushFuture = null
            firstQueuedAtNanos = null
        }
    }

    private fun drainOnCoordinator(): Boolean {
        val drainFuture =
            try {
                coordinator.submit { drainAndSubmitSends() }
            } catch (e: RejectedExecutionException) {
                throw IllegalStateException("Batch queue coordinator rejected flush", e)
            }

        try {
            drainFuture.get()
            return true
        } catch (_: InterruptedException) {
            Thread.currentThread().interrupt()
            return false
        } catch (e: ExecutionException) {
            throw RuntimeException("Failed to flush batch queue", e.cause)
        }
    }

    private fun drainAndSubmitSends() {
        var remainingToDrain = queuedCount.get()
        while (remainingToDrain > 0) {
            val drainResult = drainUpTo(minOf(batchSizeLimit, remainingToDrain))
            if (drainResult.itemCount == 0) break

            drainResult.batches.forEach(::submitBatch)
            remainingToDrain -= drainResult.itemCount
        }

        when {
            queuedCount.get() >= batchSizeLimit -> triggerFlush()
            queuedCount.get() > 0 && !shutdown.get() -> scheduleFlush()
            queuedCount.get() > 0 && shutdown.get() -> triggerFlush()
        }
    }

    /**
     * Drains up to [maxItems] queued operations and returns batch params grouped by request
     * options.
     *
     * Multipart ingest compression is applied at send time; legacy `/runs/batch` remains
     * uncompressed.
     *
     * TODO: Support attachment parts in multipart ingest.
     */
    private fun drainUpTo(maxItems: Int): DrainResult {
        val openGroups = linkedMapOf<RequestOptionsKey, BatchGroup>()
        var drained = 0

        val batches = buildList {
            while (drained < maxItems) {
                val item = items.poll() ?: break
                queuedCount.decrementAndGet()
                drained++

                val key = item.requestOptions.key()
                val itemSerializedSize = objectMapper.writeValueAsBytes(item.run).size
                var group = openGroups.getOrPut(key) { BatchGroup(item.requestOptions) }
                if (
                    group.isNotEmpty() &&
                        group.serializedSizeWith(item, itemSerializedSize) > batchSizeLimitBytes
                ) {
                    add(group.toBatch())
                    group = BatchGroup(item.requestOptions)
                    openGroups[key] = group
                }
                group.add(item, itemSerializedSize)
            }

            addAll(openGroups.values.map { it.toBatch() })
        }
        return DrainResult(batches = batches, itemCount = drained)
    }

    private fun submitBatch(batch: Batch) {
        activeSends.register()
        try {
            sendExecutor.execute {
                try {
                    sendBatch(batch.params, batch.requestOptions).toCompletableFuture().join()
                } catch (e: CompletionException) {
                    logger.warn("Failed to send batch of runs", e.cause ?: e)
                } catch (e: Exception) {
                    logger.warn("Failed to send batch of runs", e)
                } finally {
                    activeSends.arriveAndDeregister()
                }
            }
        } catch (e: RejectedExecutionException) {
            activeSends.arriveAndDeregister()
            logger.warn(
                "Batch queue sender rejected a batch; dropping {} run operations",
                operationCount(batch.params),
                e,
            )
        }
    }

    private fun waitForActiveSends(): Boolean {
        while (hasActiveSends()) {
            val phase = activeSends.phase
            try {
                activeSends.awaitAdvanceInterruptibly(phase)
            } catch (_: InterruptedException) {
                Thread.currentThread().interrupt()
                return false
            }
        }
        return true
    }

    private fun hasActiveSends(): Boolean = activeSends.registeredParties > 0

    private fun operationCount(params: RunIngestBatchParams): Int =
        params.post().orElse(emptyList()).size + params.patch().orElse(emptyList()).size

    private enum class BatchOp {
        Post,
        Patch,
    }

    private data class DrainResult(val batches: List<Batch>, val itemCount: Int)

    private data class Batch(val params: RunIngestBatchParams, val requestOptions: RequestOptions)

    private class BatchGroup(
        val requestOptions: RequestOptions,
        val posts: MutableList<RunIngest> = mutableListOf(),
        val patches: MutableList<RunIngest> = mutableListOf(),
        val headers: Headers.Builder = Headers.builder(),
        val queryParams: QueryParams.Builder = QueryParams.builder(),
    ) {
        private var postSerializedSizeBytes = 0
        private var patchSerializedSizeBytes = 0

        fun add(item: BatchItem, serializedSizeBytes: Int) {
            when (item.op) {
                BatchOp.Post -> {
                    posts.add(item.run)
                    postSerializedSizeBytes += serializedSizeBytes
                }
                BatchOp.Patch -> {
                    patches.add(item.run)
                    patchSerializedSizeBytes += serializedSizeBytes
                }
            }
            headers.putAll(item.headers)
            queryParams.putAll(item.queryParams)
        }

        fun isNotEmpty(): Boolean = posts.isNotEmpty() || patches.isNotEmpty()

        fun serializedSizeWith(item: BatchItem, itemSerializedSizeBytes: Int): Int =
            estimatedBodySizeBytes(
                postCount = posts.size + if (item.op == BatchOp.Post) 1 else 0,
                postItemsSizeBytes =
                    postSerializedSizeBytes +
                        if (item.op == BatchOp.Post) itemSerializedSizeBytes else 0,
                patchCount = patches.size + if (item.op == BatchOp.Patch) 1 else 0,
                patchItemsSizeBytes =
                    patchSerializedSizeBytes +
                        if (item.op == BatchOp.Patch) itemSerializedSizeBytes else 0,
            )

        private fun estimatedBodySizeBytes(
            postCount: Int,
            postItemsSizeBytes: Int,
            patchCount: Int,
            patchItemsSizeBytes: Int,
        ): Int {
            var size = 2 // Opening and closing braces.
            var fieldCount = 0
            if (patchCount > 0) {
                size += fieldSizeBytes("patch", patchCount, patchItemsSizeBytes)
                fieldCount++
            }
            if (postCount > 0) {
                if (fieldCount > 0) size++ // Comma between top-level fields.
                size += fieldSizeBytes("post", postCount, postItemsSizeBytes)
            }
            return size
        }

        private fun fieldSizeBytes(name: String, count: Int, itemsSizeBytes: Int): Int =
            name.length + 5 + itemsSizeBytes + (count - 1) // `"name":[]` + item commas.

        fun toBatch(): Batch {
            val mergeResult = mergePostsAndPatches()
            val builder = RunIngestBatchParams.builder()
            if (mergeResult.posts.isNotEmpty()) builder.post(mergeResult.posts)
            if (mergeResult.patches.isNotEmpty()) builder.patch(mergeResult.patches)
            builder.additionalHeaders(headers.build())
            builder.additionalQueryParams(queryParams.build())
            return Batch(params = builder.build(), requestOptions = requestOptions)
        }

        private fun mergePostsAndPatches(): MergeResult {
            if (posts.isEmpty() || patches.isEmpty()) {
                return MergeResult(posts = posts, patches = patches)
            }

            val postsById =
                posts.mapNotNull { post -> post.id().getOrNull()?.let { it to post } }.toMap()
            val postsWithoutId = posts.filter { it.id().getOrNull() == null }
            val patchesByPostId =
                patches.mapNotNull { patch ->
                    patch.id().getOrNull()?.takeIf(postsById::containsKey)?.let { it to patch }
                }
            val patchesByPostIdMap = patchesByPostId.toMap()
            val standalonePatches =
                patches.filter { patch ->
                    patch.id().getOrNull()?.let(postsById::containsKey) != true
                }

            return MergeResult(
                posts =
                    postsWithoutId +
                        postsById.map { (id, post) ->
                            patchesByPostIdMap[id]?.let { mergePostAndPatch(post, it) } ?: post
                        },
                patches = standalonePatches,
                mergedRunIds = patchesByPostId.map { it.first },
            )
        }

        private fun mergePostAndPatch(post: RunIngest, patch: RunIngest): RunIngest {
            val merged = objectMapper.valueToTree<ObjectNode>(post)
            val patchFields = objectMapper.valueToTree<ObjectNode>(patch)
            patchFields.fields().forEach { (field, value) -> merged.set<ObjectNode>(field, value) }
            val mergedRun = objectMapper.treeToValue(merged, RunIngest::class.java)
            return mergedRun
                .toBuilder()
                .attachments(post.attachments() + patch.attachments())
                .build()
        }
    }

    private data class MergeResult(
        val posts: List<RunIngest>,
        val patches: List<RunIngest>,
        val mergedRunIds: List<String> = emptyList(),
    )

    private data class BatchItem(
        val op: BatchOp,
        val run: RunIngest,
        val headers: Headers,
        val queryParams: QueryParams,
        val requestOptions: RequestOptions,
    )

    private data class RequestOptionsKey(val responseValidation: Boolean?, val timeout: Timeout?)

    private fun RequestOptions.key(): RequestOptionsKey =
        RequestOptionsKey(responseValidation = responseValidation, timeout = timeout)

    companion object {
        private val logger = LoggerFactory.getLogger(AutoBatchQueue::class.java)
        private val objectMapper = jsonMapper()

        const val DEFAULT_BATCH_SIZE_LIMIT = 100
        const val DEFAULT_BATCH_SIZE_LIMIT_BYTES = 20_971_520
        const val DEFAULT_AGGREGATION_DELAY_MS = 250L
        const val DEFAULT_MAX_AGGREGATION_DELAY_MS = 500L
        const val DEFAULT_SEND_PARALLELISM = 4
    }
}

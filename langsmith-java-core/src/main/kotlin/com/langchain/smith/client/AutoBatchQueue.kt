package com.langchain.smith.client

import com.langchain.smith.models.runs.Run
import com.langchain.smith.models.runs.RunIngestBatchParams
import com.langchain.smith.services.blocking.RunService
import java.util.concurrent.Executors
import java.util.concurrent.RejectedExecutionException
import java.util.concurrent.ScheduledExecutorService
import java.util.concurrent.ScheduledFuture
import java.util.concurrent.TimeUnit
import java.util.concurrent.locks.Condition
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock
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
 * @param runService the run service to send batches through
 * @param batchSizeLimit max operations before auto-flush (default 100)
 * @param aggregationDelayMs delay before timer-based flush (default 250ms)
 */
class AutoBatchQueue(
    private val runService: RunService,
    private val batchSizeLimit: Int = DEFAULT_BATCH_SIZE_LIMIT,
    private val aggregationDelayMs: Long = DEFAULT_AGGREGATION_DELAY_MS,
) {
    private val lock = ReentrantLock()
    private val sendCompleted: Condition = lock.newCondition()
    private val posts = mutableListOf<Run>()
    private val patches = mutableListOf<Run>()
    private var pendingFlush: ScheduledFuture<*>? = null
    private var activeSends = 0
    private var shutdown = false

    private val scheduler: ScheduledExecutorService =
        Executors.newSingleThreadScheduledExecutor { r ->
            Thread(r, "langsmith-batch-queue").apply { isDaemon = true }
        }

    /** Enqueues a run create operation. */
    fun post(run: Run) {
        lock.withLock {
            check(!shutdown) { "AutoBatchQueue is shut down" }
            posts.add(run)
            scheduleOrFlush()
        }
    }

    /** Enqueues a run update (patch) operation. */
    fun patch(run: Run) {
        lock.withLock {
            check(!shutdown) { "AutoBatchQueue is shut down" }
            patches.add(run)
            scheduleOrFlush()
        }
    }

    /**
     * Flushes all queued operations immediately, blocking until the batch request completes.
     *
     * Safe to call from any thread. No-op if the queue is empty.
     */
    fun flush() {
        val batch = lock.withLock { drain() }
        if (batch != null) sendBatchTracked(batch)
        waitForActiveSends()
    }

    /**
     * Flushes remaining operations and shuts down the background timer.
     *
     * After calling this, the queue will no longer accept new operations.
     */
    fun shutdown() {
        lock.withLock { shutdown = true }
        flush()
        scheduler.shutdown()
        try {
            if (!scheduler.awaitTermination(5, TimeUnit.SECONDS)) {
                scheduler.shutdownNow()
            }
        } catch (_: InterruptedException) {
            scheduler.shutdownNow()
            Thread.currentThread().interrupt()
        }
    }

    /** Returns the number of queued operations (for testing). */
    internal fun size(): Int = lock.withLock { posts.size + patches.size }

    private fun scheduleOrFlush() {
        // Already holding lock
        if (posts.size + patches.size >= batchSizeLimit) {
            val batch = drain() ?: return
            submitBatch(batch)
        } else {
            pendingFlush?.cancel(false)
            pendingFlush =
                scheduler.schedule(
                    {
                        // Drain and send inline on the scheduler thread; track via activeSends so
                        // flush() can wait for completion.
                        val batch =
                            lock.withLock { drain()?.also { activeSends++ } } ?: return@schedule
                        try {
                            sendBatch(batch)
                        } finally {
                            markSendComplete()
                        }
                    },
                    aggregationDelayMs,
                    TimeUnit.MILLISECONDS,
                )
        }
    }

    /**
     * Drains the queue and returns the batch params, or null if empty. Must hold lock.
     *
     * TODO: Merge create + update for the same run ID before sending (like the JS/Python SDKs).
     *   This would reduce the number of operations in each batch when a run is created and
     *   immediately updated (common for short-lived runs).
     * TODO: Support multipart ingest endpoint for large payloads with attachments.
     * TODO: Support gzip compression for batch requests.
     */
    private fun drain(): RunIngestBatchParams? {
        if (posts.isEmpty() && patches.isEmpty()) return null

        pendingFlush?.cancel(false)
        pendingFlush = null

        val builder = RunIngestBatchParams.builder()
        if (posts.isNotEmpty()) {
            builder.post(posts.toList())
            posts.clear()
        }
        if (patches.isNotEmpty()) {
            builder.patch(patches.toList())
            patches.clear()
        }
        return builder.build()
    }

    /** Submits a batch for async send on the scheduler thread. Caller must hold the lock. */
    private fun submitBatch(params: RunIngestBatchParams) {
        // Already holding lock
        activeSends++
        try {
            scheduler.execute {
                try {
                    sendBatch(params)
                } finally {
                    markSendComplete()
                }
            }
        } catch (e: RejectedExecutionException) {
            // scheduler is shut down; decrement and log dropped runs
            activeSends--
            sendCompleted.signalAll()
            val dropped =
                (params.post().orElse(null)?.size ?: 0) + (params.patch().orElse(null)?.size ?: 0)
            logger.warn(
                "Batch queue scheduler rejected a batch; dropping {} run operations",
                dropped,
                e,
            )
        }
    }

    private fun sendBatchTracked(params: RunIngestBatchParams) {
        lock.withLock { activeSends++ }
        try {
            sendBatch(params)
        } finally {
            markSendComplete()
        }
    }

    private fun waitForActiveSends() {
        lock.withLock {
            while (activeSends > 0) {
                try {
                    sendCompleted.await()
                } catch (_: InterruptedException) {
                    Thread.currentThread().interrupt()
                    return
                }
            }
        }
    }

    private fun markSendComplete() {
        lock.withLock {
            activeSends--
            sendCompleted.signalAll()
        }
    }

    private fun sendBatch(params: RunIngestBatchParams) {
        try {
            runService.ingestBatch(params)
        } catch (e: Exception) {
            logger.warn("Failed to send batch of runs", e)
        }
    }

    companion object {
        private val logger = LoggerFactory.getLogger(AutoBatchQueue::class.java)

        const val DEFAULT_BATCH_SIZE_LIMIT = 100
        const val DEFAULT_AGGREGATION_DELAY_MS = 250L
    }
}

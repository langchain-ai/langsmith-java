package com.langchain.smith.client

import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.Timeout
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.models.runs.Run
import com.langchain.smith.models.runs.RunIngestBatchParams
import com.langchain.smith.testutils.CapturingLangsmithClient
import java.time.Duration
import java.util.concurrent.CompletableFuture
import java.util.concurrent.ConcurrentLinkedQueue
import java.util.concurrent.CountDownLatch
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicBoolean
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

/** Unit tests for [AutoBatchQueue]. */
internal class AutoBatchQueueTest {

    private fun testRun(id: String = "run-1"): Run =
        Run.builder().id(id).traceId(id).dottedOrder("order").name("test").build()

    private fun testQueue(
        capture: CapturingLangsmithClient,
        batchSizeLimit: Int = AutoBatchQueue.DEFAULT_BATCH_SIZE_LIMIT,
        aggregationDelayMs: Long = AutoBatchQueue.DEFAULT_AGGREGATION_DELAY_MS,
    ): AutoBatchQueue =
        AutoBatchQueue(
            sendBatch = { params, _ ->
                capture.client.runs().ingestBatch(params)
                CompletableFuture.completedFuture(null)
            },
            batchSizeLimit = batchSizeLimit,
            aggregationDelayMs = aggregationDelayMs,
        )

    private fun operationCount(params: RunIngestBatchParams): Int =
        params.post().orElse(emptyList()).size + params.patch().orElse(emptyList()).size

    private fun runIds(params: RunIngestBatchParams): List<String> =
        params.post().orElse(emptyList()).mapNotNull { it.id().getOrNull() } +
            params.patch().orElse(emptyList()).mapNotNull { it.id().getOrNull() }

    @Test
    fun `post and flush sends batch with post`() {
        val capture = CapturingLangsmithClient()
        val queue = testQueue(capture)

        queue.post(testRun("r1"))
        queue.post(testRun("r2"))
        queue.flush()

        assertThat(capture.postedRuns).hasSize(2)
        val ids = capture.postedRuns.mapNotNull { it.id().getOrNull() }
        assertThat(ids).isEqualTo(listOf("r1", "r2"))
    }

    @Test
    fun `patch and flush sends batch with patch`() {
        val capture = CapturingLangsmithClient()
        val queue = testQueue(capture)

        queue.patch(testRun("r1"))
        queue.flush()

        assertThat(capture.patchedRuns).hasSize(1)
        assertThat(capture.patchedRuns[0].id().getOrNull()).isEqualTo("r1")
    }

    @Test
    fun `mixed post and patch sent in single batch`() {
        val capture = CapturingLangsmithClient()
        val queue = testQueue(capture)

        queue.post(testRun("r1"))
        queue.patch(testRun("r2"))
        queue.flush()

        assertThat(capture.postedRuns).hasSize(1)
        assertThat(capture.patchedRuns).hasSize(1)
    }

    @Test
    fun `merges post and patch for same run id`() {
        val capture = CapturingLangsmithClient()
        val queue = testQueue(capture)
        val post =
            testRun("r1")
                .toBuilder()
                .inputs(
                    Run.Inputs.builder()
                        .putAdditionalProperty("question", JsonValue.from("hello"))
                        .build()
                )
                .build()
        val patch =
            Run.builder()
                .id("r1")
                .outputs(
                    Run.Outputs.builder()
                        .putAdditionalProperty("answer", JsonValue.from("world"))
                        .build()
                )
                .endTime("2024-01-01T00:00:01Z")
                .build()

        queue.post(post)
        queue.patch(patch)
        queue.flush()

        assertThat(capture.postedRuns).hasSize(1)
        assertThat(capture.patchedRuns).isEmpty()
        val mergedRun = capture.postedRuns.single()
        assertThat(mergedRun.id().getOrNull()).isEqualTo("r1")
        assertThat(mergedRun.inputs().get()._additionalProperties()["question"])
            .isEqualTo(JsonValue.from("hello"))
        assertThat(mergedRun.outputs().get()._additionalProperties()["answer"])
            .isEqualTo(JsonValue.from("world"))
        assertThat(mergedRun.endTime().getOrNull()).isEqualTo("2024-01-01T00:00:01Z")
    }

    @Test
    fun `flush is no-op when queue is empty`() {
        val capture = CapturingLangsmithClient()
        val queue = testQueue(capture)

        queue.flush()

        assertThat(capture.postedRuns).isEmpty()
        assertThat(capture.patchedRuns).isEmpty()
    }

    @Test
    fun `auto-flushes when batch size limit reached`() {
        val capture = CapturingLangsmithClient()
        val queue = testQueue(capture = capture, batchSizeLimit = 3, aggregationDelayMs = 10_000)

        queue.post(testRun("r1"))
        queue.post(testRun("r2"))
        assertThat(queue.size()).isEqualTo(2)

        queue.post(testRun("r3"))
        Thread.sleep(100)

        assertThat(capture.postedRuns).hasSize(3)
        assertThat(queue.size()).isEqualTo(0)
    }

    @Test
    fun `timer-based drain fires after delay`() {
        val capture = CapturingLangsmithClient()
        val queue = testQueue(capture = capture, batchSizeLimit = 100, aggregationDelayMs = 100)

        queue.post(testRun("r1"))
        assertThat(capture.postedRuns).isEmpty()

        Thread.sleep(300)

        assertThat(capture.postedRuns).hasSize(1)
    }

    @Test
    fun `propagates operation headers and query params to batch request`() {
        var capturedParams: RunIngestBatchParams? = null
        val queue =
            AutoBatchQueue(
                sendBatch = { params, _ ->
                    capturedParams = params
                    CompletableFuture.completedFuture(null)
                }
            )

        queue.post(
            testRun("r1"),
            headers = Headers.builder().put("X-Test", "post").build(),
            queryParams = QueryParams.builder().put("post_param", "1").build(),
        )
        queue.patch(
            testRun("r2"),
            headers = Headers.builder().put("X-Test", "patch").build(),
            queryParams = QueryParams.builder().put("patch_param", "2").build(),
        )
        queue.flush()

        assertThat(capturedParams?._additionalHeaders()?.values("X-Test"))
            .containsExactly("post", "patch")
        assertThat(capturedParams?._additionalQueryParams()?.values("post_param"))
            .containsExactly("1")
        assertThat(capturedParams?._additionalQueryParams()?.values("patch_param"))
            .containsExactly("2")
    }

    @Test
    fun `groups operations by request options and applies them to batch requests`() {
        val sentBatches = ConcurrentLinkedQueue<Pair<RunIngestBatchParams, RequestOptions>>()
        val fastOptions =
            RequestOptions.builder()
                .timeout(Timeout.builder().request(Duration.ofSeconds(1)).build())
                .build()
        val slowOptions =
            RequestOptions.builder()
                .timeout(Timeout.builder().request(Duration.ofSeconds(10)).build())
                .build()
        val queue =
            AutoBatchQueue(
                sendBatch = { params, requestOptions ->
                    sentBatches.add(params to requestOptions)
                    CompletableFuture.completedFuture(null)
                }
            )

        queue.post(testRun("r1"), requestOptions = fastOptions)
        queue.post(testRun("r2"), requestOptions = slowOptions)
        queue.patch(testRun("r3"), requestOptions = fastOptions)
        queue.flush()

        assertThat(sentBatches).hasSize(2)
        val fastBatch = sentBatches.single { it.second === fastOptions }.first
        val slowBatch = sentBatches.single { it.second === slowOptions }.first
        assertThat(fastBatch.post().get().map { it.id().getOrNull() }).containsExactly("r1")
        assertThat(fastBatch.patch().get().map { it.id().getOrNull() }).containsExactly("r3")
        assertThat(slowBatch.post().get().map { it.id().getOrNull() }).containsExactly("r2")
        assertThat(slowBatch.patch().isPresent).isFalse()
    }

    @Test
    fun `load test splits many queued runs into size limited batches`() {
        val sentBatches = ConcurrentLinkedQueue<RunIngestBatchParams>()
        val queue =
            AutoBatchQueue(
                sendBatch = { params, _ ->
                    sentBatches.add(params)
                    CompletableFuture.completedFuture(null)
                },
                batchSizeLimit = 100,
                aggregationDelayMs = 10_000,
            )

        repeat(250) { index -> queue.post(testRun("r$index")) }
        queue.flush()

        assertThat(sentBatches.flatMap { runIds(it) }.toSet()).hasSize(250)
        assertThat(sentBatches.all { operationCount(it) <= 100 }).isTrue()
    }

    @Test
    fun `load test accepts concurrent producers and flushes all runs`() {
        val sentBatches = ConcurrentLinkedQueue<RunIngestBatchParams>()
        val queue =
            AutoBatchQueue(
                sendBatch = { params, _ ->
                    sentBatches.add(params)
                    CompletableFuture.completedFuture(null)
                },
                batchSizeLimit = 50,
                aggregationDelayMs = 10_000,
            )
        val executor = Executors.newFixedThreadPool(8)

        try {
            repeat(1_000) { index -> executor.submit { queue.post(testRun("r$index")) } }
            executor.shutdown()
            assertThat(executor.awaitTermination(10, TimeUnit.SECONDS)).isTrue()
            queue.flush()
        } finally {
            executor.shutdownNow()
            queue.shutdown()
        }

        assertThat(sentBatches.flatMap { runIds(it) }.toSet()).hasSize(1_000)
        assertThat(sentBatches.all { operationCount(it) <= 50 }).isTrue()
    }

    @Test
    fun `flush waits for size triggered sends already in flight`() {
        val sendStarted = CountDownLatch(1)
        val sendCompleted = CompletableFuture<Void?>()
        val flushReturned = AtomicBoolean(false)
        val queue =
            AutoBatchQueue(
                sendBatch = { _, _ ->
                    sendStarted.countDown()
                    sendCompleted
                },
                batchSizeLimit = 1,
                aggregationDelayMs = 10_000,
            )

        try {
            queue.post(testRun("r1"))
            assertThat(sendStarted.await(10, TimeUnit.SECONDS)).isTrue()

            val flushThread = Thread {
                queue.flush()
                flushReturned.set(true)
            }
            flushThread.start()

            Thread.sleep(100)
            assertThat(flushReturned.get()).isFalse()

            sendCompleted.complete(null)
            flushThread.join(10_000)
            assertThat(flushReturned.get()).isTrue()
        } finally {
            sendCompleted.complete(null)
            queue.shutdown()
        }
    }

    @Test
    fun `shutdown flushes and stops`() {
        val capture = CapturingLangsmithClient()
        val queue = testQueue(capture)

        queue.post(testRun("r1"))
        queue.shutdown()

        assertThat(capture.postedRuns).hasSize(1)
    }

    @Test
    fun `multiple flushes are safe`() {
        val capture = CapturingLangsmithClient()
        val queue = testQueue(capture)

        queue.post(testRun("r1"))
        queue.flush()
        queue.flush()

        assertThat(capture.postedRuns).hasSize(1)
    }
}

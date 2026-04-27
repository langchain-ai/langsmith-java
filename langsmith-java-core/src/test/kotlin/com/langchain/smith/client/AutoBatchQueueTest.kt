package com.langchain.smith.client

import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.models.runs.Run
import com.langchain.smith.models.runs.RunIngestBatchParams
import com.langchain.smith.testutils.CapturingLangsmithClient
import java.util.concurrent.CompletableFuture
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
            sendBatch = { params ->
                capture.client.runs().ingestBatch(params)
                CompletableFuture.completedFuture(null)
            },
            batchSizeLimit = batchSizeLimit,
            aggregationDelayMs = aggregationDelayMs,
        )

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
                sendBatch = { params ->
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

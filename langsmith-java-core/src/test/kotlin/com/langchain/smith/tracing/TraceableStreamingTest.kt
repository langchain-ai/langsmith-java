package com.langchain.smith.tracing

import java.util.stream.Collectors
import java.util.stream.Stream
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

/** Unit tests for streaming support in [traceable]. */
internal class TraceableStreamingTest {

    interface StreamLike<T> : AutoCloseable {
        fun stream(): Stream<T>
    }

    private fun fakeStream(items: List<String>): StreamLike<String> =
        object : StreamLike<String> {
            override fun stream(): Stream<String> = items.stream()

            override fun close() {}
        }

    private fun failingStream(): StreamLike<String> =
        object : StreamLike<String> {
            override fun stream(): Stream<String> =
                Stream.of("ok", "boom").map {
                    if (it == "boom") throw RuntimeException("stream failed")
                    it
                }

            override fun close() {}
        }

    private fun failingCloseStream(): StreamLike<String> =
        object : StreamLike<String> {
            override fun stream(): Stream<String> = listOf("a", "b").stream()

            override fun close() {
                throw RuntimeException("close failed")
            }
        }

    private fun parentRun() = RunTree(name = "parent", runType = RunType.CHAIN)

    /** Traces a function, capturing the child [RunTree] for inspection. */
    private fun traceCapturingRun(
        config: TraceConfig,
        streamFactory: () -> StreamLike<String>,
    ): Pair<(String) -> StreamLike<String>, () -> RunTree?> {
        var childRun: RunTree? = null
        val traced =
            traceable(
                { _: String ->
                    childRun = getCurrentRunTree()
                    streamFactory()
                },
                config,
            )
        return traced to { childRun }
    }

    private fun configWithAggregator(): TraceConfig =
        TraceConfig.builder()
            .name("stream-test")
            .tracingEnabled(true)
            .processTracedIO(
                TraceProcessIO<String, Any>(
                    aggregator = java.util.function.Function { chunks -> chunks.joinToString("") }
                )
            )
            .build()

    @Test
    fun `stream passthrough when tracing disabled`() {
        val config = TraceConfig.builder().name("test").tracingEnabled(false).build()
        val traced = traceable({ _: String -> fakeStream(listOf("a", "b", "c")) }, config)

        val result = traced("input")
        val collected = result.stream().collect(Collectors.toList())
        result.close()

        assertThat(collected).isEqualTo(listOf("a", "b", "c"))
    }

    @Test
    fun `stream proxy collects chunks and aggregates on close`() {
        val config = configWithAggregator()

        withParent(parentRun()) {
            val (traced, getRun) = traceCapturingRun(config) { fakeStream(listOf("x", "y", "z")) }
            val stream = traced("input")
            stream.stream().collect(Collectors.toList())
            stream.close()

            val run = getRun()!!
            assertThat(run.endTime).isNotNull()
            assertThat(run.outputs).isNotNull()
            assertThat(run.outputs!!["outputs"]).isEqualTo("xyz")
            assertThat(run.error).isNull()
        }
    }

    @Test
    fun `stream proxy records raw chunks when no aggregator set`() {
        val config = TraceConfig.builder().name("no-agg").tracingEnabled(true).build()

        withParent(parentRun()) {
            val (traced, getRun) = traceCapturingRun(config) { fakeStream(listOf("a", "b")) }
            val stream = traced("input")
            stream.stream().collect(Collectors.toList())
            stream.close()

            val run = getRun()!!
            assertThat(run.endTime).isNotNull()
            assertThat(run.outputs!!["outputs"]).isEqualTo(listOf("a", "b"))
            assertThat(run.error).isNull()
        }
    }

    @Test
    fun `repeated stream() calls only count last consumption`() {
        val config = configWithAggregator()

        withParent(parentRun()) {
            val (traced, getRun) = traceCapturingRun(config) { fakeStream(listOf("a", "b")) }
            val stream = traced("input")

            stream.stream().collect(Collectors.toList())
            stream.stream().collect(Collectors.toList())
            stream.close()

            val run = getRun()!!
            // Should be "ab" not "abab" — chunks reset on each stream() call
            assertThat(run.outputs!!["outputs"]).isEqualTo("ab")
        }
    }

    @Test
    fun `close is idempotent`() {
        val config = configWithAggregator()

        withParent(parentRun()) {
            val (traced, getRun) = traceCapturingRun(config) { fakeStream(listOf("a")) }
            val stream = traced("input")
            stream.stream().collect(Collectors.toList())

            stream.close()
            stream.close()

            val run = getRun()!!
            assertThat(run.endTime).isNotNull()
        }
    }

    @Test
    fun `non-stream AutoCloseable is not wrapped`() {
        val config = TraceConfig.builder().name("non-stream").tracingEnabled(true).build()

        val closeable =
            object : AutoCloseable {
                override fun close() {}

                override fun toString() = "not-a-stream"
            }

        withParent(parentRun()) {
            val traced = traceable({ _: String -> closeable }, config)
            val result = traced("input")

            assertThat(java.lang.reflect.Proxy.isProxyClass(result::class.java)).isFalse()
        }
    }

    @Test
    fun `stream proxy implements same interfaces as delegate`() {
        val config = configWithAggregator()

        withParent(parentRun()) {
            val traced = traceable({ _: String -> fakeStream(listOf("a")) }, config)
            val result = traced("input")

            assertThat(result).isInstanceOf(StreamLike::class.java)
            assertThat(result).isInstanceOf(AutoCloseable::class.java)

            result.stream().collect(Collectors.toList())
            result.close()
        }
    }

    @Test
    fun `iteration error is captured on run`() {
        val config = configWithAggregator()

        withParent(parentRun()) {
            val (traced, getRun) = traceCapturingRun(config) { failingStream() }
            val stream = traced("input")
            try {
                stream.stream().collect(Collectors.toList())
            } catch (_: RuntimeException) {}
            stream.close()

            val run = getRun()!!
            assertThat(run.endTime).isNotNull()
            assertThat(run.error).contains("stream failed")
        }
    }

    @Test
    fun `aggregator error is captured on run`() {
        val config =
            TraceConfig.builder()
                .name("bad-agg")
                .tracingEnabled(true)
                .processTracedIO(
                    TraceProcessIO<String, Any>(
                        aggregator =
                            java.util.function.Function { throw RuntimeException("agg failed") }
                    )
                )
                .build()

        withParent(parentRun()) {
            val (traced, getRun) = traceCapturingRun(config) { fakeStream(listOf("a")) }
            val stream = traced("input")
            stream.stream().collect(Collectors.toList())
            stream.close()

            val run = getRun()!!
            assertThat(run.endTime).isNotNull()
            assertThat(run.error).contains("agg failed")
        }
    }

    @Test
    fun `delegate close error is recorded on run and rethrown`() {
        val config = configWithAggregator()

        withParent(parentRun()) {
            val (traced, getRun) = traceCapturingRun(config) { failingCloseStream() }
            val stream = traced("input")
            stream.stream().collect(Collectors.toList())

            assertThatThrownBy { stream.close() }
                .isInstanceOf(RuntimeException::class.java)
                .hasMessage("close failed")

            val run = getRun()!!
            assertThat(run.endTime).isNotNull()
            assertThat(run.error).contains("close failed")
        }
    }
}

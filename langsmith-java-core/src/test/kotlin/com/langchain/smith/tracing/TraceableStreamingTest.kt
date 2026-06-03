package com.langchain.smith.tracing

import java.util.stream.Collectors
import java.util.stream.Stream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

/** Unit tests for streaming support in [traceable]. */
internal class TraceableStreamingTest {

    private fun parentRun() = RunTree(name = "parent", runType = RunType.CHAIN)

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

    /** Traces a function returning a Stream, capturing the child RunTree for inspection. */
    private fun traceCapturingRun(
        config: TraceConfig,
        streamFactory: () -> Stream<String>,
    ): Pair<(String) -> Stream<String>, () -> RunTree?> {
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

    @Test
    fun `stream passthrough when tracing disabled`() {
        val config = TraceConfig.builder().name("test").tracingEnabled(false).build()
        val traced = traceable({ _: String -> Stream.of("a", "b", "c") }, config)

        val collected = traced("input").collect(Collectors.toList())

        assertThat(collected).isEqualTo(listOf("a", "b", "c"))
    }

    @Test
    fun `non-stream return is not affected by aggregator`() {
        val config =
            TraceConfig.builder()
                .name("non-stream")
                .tracingEnabled(true)
                .processTracedIO(
                    TraceProcessIO<String, Any>(aggregator = java.util.function.Function { it })
                )
                .build()

        withParent(parentRun()) {
            val traced = traceable({ input: String -> input.uppercase() }, config)
            val result = traced("hello")

            assertThat(result).isEqualTo("HELLO")
        }
    }

    @Test
    fun `stream is instrumented and aggregated on close`() {
        val config = configWithAggregator()

        withParent(parentRun()) {
            val (traced, getRun) = traceCapturingRun(config) { Stream.of("x", "y", "z") }
            val stream = traced("input")
            val collected = stream.collect(Collectors.toList())
            stream.close()

            assertThat(collected).isEqualTo(listOf("x", "y", "z"))

            val run = getRun()!!
            assertThat(run.endTime).isNotNull()
            assertThat(run.outputs).isNotNull()
            assertThat(run.outputs!!["outputs"]).isEqualTo("xyz")
            assertThat(run.error).isNull()
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
            val (traced, getRun) = traceCapturingRun(config) { Stream.of("a") }
            val stream = traced("input")
            stream.collect(Collectors.toList())
            stream.close()

            val run = getRun()!!
            assertThat(run.endTime).isNotNull()
            assertThat(run.error).contains("agg failed")
        }
    }

    @Test
    fun `iteration error is recorded on run`() {
        val config = configWithAggregator()

        withParent(parentRun()) {
            val (traced, getRun) =
                traceCapturingRun(config) {
                    Stream.of("ok", "boom").map {
                        if (it == "boom") throw RuntimeException("stream failed")
                        it
                    }
                }
            val stream = traced("input")
            try {
                stream.collect(Collectors.toList())
            } catch (_: RuntimeException) {}
            stream.close()

            val run = getRun()!!
            assertThat(run.endTime).isNotNull()
            assertThat(run.error).contains("stream failed")
        }
    }

    @Test
    fun `return type is a real Stream not a proxy`() {
        val config = configWithAggregator()

        withParent(parentRun()) {
            val traced = traceable({ _: String -> Stream.of("a") }, config)
            val result = traced("input")

            assertThat(result).isInstanceOf(Stream::class.java)
            assertThat(java.lang.reflect.Proxy.isProxyClass(result::class.java)).isFalse()

            result.collect(Collectors.toList())
            result.close()
        }
    }

    @Test
    fun `early close records partial chunks`() {
        val config = configWithAggregator()

        withParent(parentRun()) {
            val (traced, getRun) = traceCapturingRun(config) { Stream.of("a", "b", "c", "d", "e") }
            val stream = traced("input")

            // Consume only first 2 elements then close
            val iter = stream.iterator()
            val partial = listOf(iter.next(), iter.next())
            stream.close()

            assertThat(partial).isEqualTo(listOf("a", "b"))

            val run = getRun()!!
            assertThat(run.endTime).isNotNull()
            assertThat(run.error).isEqualTo("Stream cancelled")
            // Partial output is still aggregated
            assertThat(run.outputs!!["outputs"]).isEqualTo("ab")
        }
    }

    @Test
    fun `without aggregator stream return completes run immediately`() {
        val config = TraceConfig.builder().name("no-agg").tracingEnabled(true).build()

        withParent(parentRun()) {
            val (traced, getRun) = traceCapturingRun(config) { Stream.of("a", "b") }
            val stream = traced("input")

            // Run should be completed immediately (no deferred close)
            val run = getRun()!!
            assertThat(run.endTime).isNotNull()

            // Stream still works
            val collected = stream.collect(Collectors.toList())
            assertThat(collected).isEqualTo(listOf("a", "b"))
        }
    }
}

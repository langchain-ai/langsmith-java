package com.langchain.smith.tracing

import java.util.stream.Collectors
import java.util.stream.Stream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

/** Unit tests for streaming support in [traceable]. */
internal class TraceableStreamingTest {

    /** Minimal AutoCloseable with a `stream()` method, mimicking OpenAI's StreamResponse. */
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

    private fun parentRun() = RunTree(name = "parent", runType = RunType.CHAIN)

    private fun configWithAggregator(
        capturedOutputs: MutableList<Map<String, Any?>>? = null
    ): TraceConfig =
        TraceConfig.builder()
            .name("stream-test")
            .tracingEnabled(true)
            .processTracedIO(
                TraceProcessIO<String, Any>(
                    aggregator = java.util.function.Function { chunks -> chunks.joinToString("") },
                    processOutputs =
                        java.util.function.Function { output ->
                            val map = mapOf("result" to output)
                            capturedOutputs?.add(map)
                            map
                        },
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
        val capturedOutputs = mutableListOf<Map<String, Any?>>()
        val config = configWithAggregator(capturedOutputs)

        withParent(parentRun()) {
            val traced = traceable({ _: String -> fakeStream(listOf("x", "y", "z")) }, config)
            val stream = traced("input")
            stream.stream().collect(Collectors.toList())
            stream.close()
        }

        assertThat(capturedOutputs).hasSize(1)
        assertThat(capturedOutputs[0]["result"]).isEqualTo("xyz")
    }

    @Test
    fun `stream proxy records raw chunks when no aggregator set`() {
        val capturedOutputs = mutableListOf<Map<String, Any?>>()
        val config =
            TraceConfig.builder()
                .name("no-agg")
                .tracingEnabled(true)
                .processTracedIO(
                    TraceProcessIO<String, Any>(
                        processOutputs =
                            java.util.function.Function { output ->
                                val map = mapOf("result" to output)
                                capturedOutputs.add(map)
                                map
                            }
                    )
                )
                .build()

        withParent(parentRun()) {
            val traced = traceable({ _: String -> fakeStream(listOf("a", "b")) }, config)
            val stream = traced("input")
            stream.stream().collect(Collectors.toList())
            stream.close()
        }

        assertThat(capturedOutputs).hasSize(1)
        assertThat(capturedOutputs[0]["result"]).isEqualTo(listOf("a", "b"))
    }

    @Test
    fun `stream() returns fresh stream per call`() {
        val config = configWithAggregator()

        withParent(parentRun()) {
            val traced = traceable({ _: String -> fakeStream(listOf("a", "b")) }, config)
            val stream = traced("input")

            val first = stream.stream().collect(Collectors.toList())
            val second = stream.stream().collect(Collectors.toList())

            assertThat(first).isEqualTo(listOf("a", "b"))
            assertThat(second).isEqualTo(listOf("a", "b"))
            stream.close()
        }
    }

    @Test
    fun `close is idempotent`() {
        val capturedOutputs = mutableListOf<Map<String, Any?>>()
        val config = configWithAggregator(capturedOutputs)

        withParent(parentRun()) {
            val traced = traceable({ _: String -> fakeStream(listOf("a")) }, config)
            val stream = traced("input")
            stream.stream().collect(Collectors.toList())

            stream.close()
            stream.close()
        }

        assertThat(capturedOutputs).hasSize(1)
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
    fun `iteration error is captured on close`() {
        val config =
            TraceConfig.builder()
                .name("iter-error")
                .tracingEnabled(true)
                .processTracedIO(
                    TraceProcessIO<String, Any>(
                        aggregator = java.util.function.Function { it },
                    )
                )
                .build()

        withParent(parentRun()) {
            val traced =
                traceable(
                    { _: String -> failingStream() },
                    config,
                )
            val stream = traced("input")
            try {
                stream.stream().collect(Collectors.toList())
            } catch (_: RuntimeException) {
                // expected
            }
            // close() should record the error, not throw
            stream.close()
        }
    }

    @Test
    fun `aggregator error is captured in run`() {
        val config =
            TraceConfig.builder()
                .name("bad-agg")
                .tracingEnabled(true)
                .processTracedIO(
                    TraceProcessIO<String, StreamLike<String>>(
                        aggregator =
                            java.util.function.Function { throw RuntimeException("agg failed") }
                    )
                )
                .build()

        withParent(parentRun()) {
            val traced = traceable({ _: String -> fakeStream(listOf("a")) }, config)
            val stream = traced("input")
            stream.stream().collect(Collectors.toList())
            // close() should not throw — error is captured on the run
            stream.close()
        }
    }
}

package com.langchain.smith.wrappers.openai

import com.langchain.smith.tracing.RunTree
import com.langchain.smith.tracing.RunType
import com.langchain.smith.tracing.withParent
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

/**
 * Unit tests for the tracing utility functions in [TracingUtils].
 *
 * These tests do NOT require API keys — they validate pure transformation logic and metadata
 * population in isolation.
 */
internal class TracingUtilsTest {

    // ---------------------------------------------------------------------------
    // processChatCompletionOutput
    // ---------------------------------------------------------------------------

    @Test
    fun `processChatCompletionOutput restructures usage into usage_metadata`() {
        val raw =
            mapOf(
                "id" to "chatcmpl-123",
                "model" to "gpt-4.1-mini",
                "usage" to
                    mapOf("prompt_tokens" to 10, "completion_tokens" to 20, "total_tokens" to 30),
            )

        val result = processChatCompletionOutput(raw)

        assertThat(result).doesNotContainKey("usage")
        assertThat(result).containsKey("usage_metadata")
        val meta = result["usage_metadata"] as Map<*, *>
        assertThat(meta["input_tokens"]).isEqualTo(10)
        assertThat(meta["output_tokens"]).isEqualTo(20)
        assertThat(meta["total_tokens"]).isEqualTo(30)
        assertThat(meta.keys).doesNotContain("input_token_details")
        assertThat(meta.keys).doesNotContain("output_token_details")
    }

    @Test
    fun `processChatCompletionOutput handles responses API token keys`() {
        val raw =
            mapOf(
                "id" to "resp-123",
                "usage" to mapOf("input_tokens" to 15, "output_tokens" to 25, "total_tokens" to 40),
            )

        val result = processChatCompletionOutput(raw)

        val meta = result["usage_metadata"] as Map<*, *>
        assertThat(meta["input_tokens"]).isEqualTo(15)
        assertThat(meta["output_tokens"]).isEqualTo(25)
        assertThat(meta["total_tokens"]).isEqualTo(40)
    }

    @Test
    fun `processChatCompletionOutput extracts token details`() {
        val raw =
            mapOf(
                "id" to "chatcmpl-123",
                "usage" to
                    mapOf(
                        "prompt_tokens" to 100,
                        "completion_tokens" to 50,
                        "total_tokens" to 150,
                        "prompt_tokens_details" to
                            mapOf("cached_tokens" to 30, "audio_tokens" to 5),
                        "completion_tokens_details" to
                            mapOf("reasoning_tokens" to 10, "audio_tokens" to 3),
                    ),
            )

        val result = processChatCompletionOutput(raw)

        val meta = result["usage_metadata"] as Map<*, *>
        assertThat(meta["input_tokens"]).isEqualTo(100)
        assertThat(meta["output_tokens"]).isEqualTo(50)

        val inputDetails = meta["input_token_details"] as Map<*, *>
        assertThat(inputDetails["cache_read"]).isEqualTo(30)
        assertThat(inputDetails["audio"]).isEqualTo(5)

        val outputDetails = meta["output_token_details"] as Map<*, *>
        assertThat(outputDetails["reasoning"]).isEqualTo(10)
        assertThat(outputDetails["audio"]).isEqualTo(3)
    }

    @Test
    fun `processChatCompletionOutput extracts responses API token details`() {
        val raw =
            mapOf(
                "id" to "resp-123",
                "usage" to
                    mapOf(
                        "input_tokens" to 100,
                        "output_tokens" to 50,
                        "total_tokens" to 150,
                        "input_tokens_details" to mapOf("cached_tokens" to 20),
                        "output_tokens_details" to mapOf("reasoning_tokens" to 15),
                    ),
            )

        val result = processChatCompletionOutput(raw)

        val meta = result["usage_metadata"] as Map<*, *>
        val inputDetails = meta["input_token_details"] as Map<*, *>
        assertThat(inputDetails["cache_read"]).isEqualTo(20)

        val outputDetails = meta["output_token_details"] as Map<*, *>
        assertThat(outputDetails["reasoning"]).isEqualTo(15)
    }

    @Test
    fun `processChatCompletionOutput handles priority service tier`() {
        val raw =
            mapOf(
                "id" to "chatcmpl-123",
                "service_tier" to "priority",
                "usage" to
                    mapOf(
                        "prompt_tokens" to 100,
                        "completion_tokens" to 50,
                        "total_tokens" to 150,
                        "prompt_tokens_details" to mapOf("cached_tokens" to 30),
                        "completion_tokens_details" to mapOf("reasoning_tokens" to 10),
                    ),
            )

        val result = processChatCompletionOutput(raw)

        val meta = result["usage_metadata"] as Map<*, *>
        val inputDetails = meta["input_token_details"] as Map<*, *>
        assertThat(inputDetails["priority_cache_read"]).isEqualTo(30)
        // priority = input_tokens - cache_read = 100 - 30 = 70
        assertThat(inputDetails["priority"]).isEqualTo(70L)

        val outputDetails = meta["output_token_details"] as Map<*, *>
        assertThat(outputDetails["priority_reasoning"]).isEqualTo(10)
        // priority = output_tokens - reasoning = 50 - 10 = 40
        assertThat(outputDetails["priority"]).isEqualTo(40L)
    }

    @Test
    fun `processChatCompletionOutput handles flex service tier`() {
        val raw =
            mapOf(
                "id" to "chatcmpl-123",
                "service_tier" to "flex",
                "usage" to
                    mapOf("prompt_tokens" to 80, "completion_tokens" to 40, "total_tokens" to 120),
            )

        val result = processChatCompletionOutput(raw)

        val meta = result["usage_metadata"] as Map<*, *>
        val inputDetails = meta["input_token_details"] as Map<*, *>
        // No cache_read, so flex = input_tokens - 0 = 80
        assertThat(inputDetails["flex"]).isEqualTo(80L)

        val outputDetails = meta["output_token_details"] as Map<*, *>
        // No reasoning, so flex = output_tokens - 0 = 40
        assertThat(outputDetails["flex"]).isEqualTo(40L)
    }

    @Test
    fun `processChatCompletionOutput ignores unrecognized service tier`() {
        val raw =
            mapOf(
                "id" to "chatcmpl-123",
                "service_tier" to "default",
                "usage" to
                    mapOf("prompt_tokens" to 10, "completion_tokens" to 20, "total_tokens" to 30),
            )

        val result = processChatCompletionOutput(raw)

        val meta = result["usage_metadata"] as Map<*, *>
        // No tier-specific details should be added
        assertThat(meta.keys).doesNotContain("input_token_details")
        assertThat(meta.keys).doesNotContain("output_token_details")
    }

    @Test
    fun `processChatCompletionOutput passes through when no usage`() {
        val raw =
            mapOf("id" to "chatcmpl-123", "model" to "gpt-4.1-mini", "choices" to listOf("hello"))

        val result = processChatCompletionOutput(raw)

        assertThat(result).doesNotContainKey("usage_metadata")
        assertThat(result["id"]).isEqualTo("chatcmpl-123")
        assertThat(result["model"]).isEqualTo("gpt-4.1-mini")
        assertThat(result["choices"]).isEqualTo(listOf("hello"))
    }

    @Test
    fun `processChatCompletionOutput preserves non-usage fields`() {
        val raw =
            mapOf(
                "id" to "chatcmpl-123",
                "model" to "gpt-4.1-mini",
                "service_tier" to "priority",
                "choices" to listOf("result"),
                "usage" to
                    mapOf("prompt_tokens" to 5, "completion_tokens" to 10, "total_tokens" to 15),
            )

        val result = processChatCompletionOutput(raw)

        assertThat(result["id"]).isEqualTo("chatcmpl-123")
        assertThat(result["model"]).isEqualTo("gpt-4.1-mini")
        assertThat(result["service_tier"]).isEqualTo("priority")
        assertThat(result["choices"]).isEqualTo(listOf("result"))
    }

    // ---------------------------------------------------------------------------
    // setInvocationParams
    // ---------------------------------------------------------------------------

    @Test
    fun `setInvocationParams sets ls metadata on current run`() {
        val run = RunTree(name = "test-run", runType = RunType.LLM)

        withParent(run) {
            setInvocationParams(
                mapOf(
                    "model" to "gpt-4.1-mini",
                    "temperature" to 0.5,
                    "max_completion_tokens" to 100,
                    "stop" to listOf("END"),
                    "frequency_penalty" to 0.1,
                    "top_p" to 0.9,
                    "seed" to 42,
                ),
                useResponsesApi = false,
            )
        }

        assertThat(run.metadata["ls_provider"]).isEqualTo("openai")
        assertThat(run.metadata["ls_model_type"]).isEqualTo("chat")
        assertThat(run.metadata["ls_model_name"]).isEqualTo("gpt-4.1-mini")
        assertThat(run.metadata["ls_temperature"]).isEqualTo(0.5)
        assertThat(run.metadata["ls_max_tokens"]).isEqualTo(100)
        assertThat(run.metadata["ls_stop"]).isEqualTo(listOf("END"))

        val invocationParams = run.metadata["ls_invocation_params"] as Map<*, *>
        assertThat(invocationParams["frequency_penalty"]).isEqualTo(0.1)
        assertThat(invocationParams["top_p"]).isEqualTo(0.9)
        assertThat(invocationParams["seed"]).isEqualTo(42)
    }

    @Test
    fun `setInvocationParams uses max_tokens fallback`() {
        val run = RunTree(name = "test-run", runType = RunType.LLM)

        withParent(run) {
            setInvocationParams(
                mapOf("model" to "gpt-4", "max_tokens" to 200),
                useResponsesApi = false,
            )
        }

        assertThat(run.metadata["ls_max_tokens"]).isEqualTo(200)
    }

    @Test
    fun `setInvocationParams prefers max_completion_tokens over max_tokens`() {
        val run = RunTree(name = "test-run", runType = RunType.LLM)

        withParent(run) {
            setInvocationParams(
                mapOf("model" to "gpt-4", "max_completion_tokens" to 150, "max_tokens" to 200),
                useResponsesApi = false,
            )
        }

        assertThat(run.metadata["ls_max_tokens"]).isEqualTo(150)
    }

    @Test
    fun `setInvocationParams wraps string stop as list`() {
        val run = RunTree(name = "test-run", runType = RunType.LLM)

        withParent(run) {
            setInvocationParams(
                mapOf("model" to "gpt-4", "stop" to "DONE"),
                useResponsesApi = false,
            )
        }

        assertThat(run.metadata["ls_stop"]).isEqualTo(listOf("DONE"))
    }

    @Test
    fun `setInvocationParams sets use_responses_api when true`() {
        val run = RunTree(name = "test-run", runType = RunType.LLM)

        withParent(run) {
            setInvocationParams(
                mapOf("model" to "gpt-4.1-mini", "reasoning_effort" to "high"),
                useResponsesApi = true,
            )
        }

        val invocationParams = run.metadata["ls_invocation_params"] as Map<*, *>
        assertThat(invocationParams["use_responses_api"]).isEqualTo(true)
        assertThat(invocationParams["reasoning_effort"]).isEqualTo("high")
    }

    @Test
    fun `setInvocationParams omits optional fields when not present`() {
        val run = RunTree(name = "test-run", runType = RunType.LLM)

        withParent(run) {
            setInvocationParams(
                mapOf("model" to "gpt-4.1-mini", "messages" to listOf("hello")),
                useResponsesApi = false,
            )
        }

        assertThat(run.metadata["ls_provider"]).isEqualTo("openai")
        assertThat(run.metadata["ls_model_name"]).isEqualTo("gpt-4.1-mini")
        assertThat(run.metadata).doesNotContainKey("ls_temperature")
        assertThat(run.metadata).doesNotContainKey("ls_max_tokens")
        assertThat(run.metadata).doesNotContainKey("ls_stop")
        assertThat(run.metadata).doesNotContainKey("ls_invocation_params")
    }

    @Test
    fun `setInvocationParams is no-op when no current run`() {
        // Should not throw — just returns silently
        setInvocationParams(mapOf("model" to "gpt-4"), useResponsesApi = false)
    }
}

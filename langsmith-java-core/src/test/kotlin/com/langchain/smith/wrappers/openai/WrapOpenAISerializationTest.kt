package com.langchain.smith.wrappers.openai

import com.fasterxml.jackson.core.type.TypeReference
import com.openai.core.jsonMapper
import com.openai.models.ChatModel
import com.openai.models.chat.completions.ChatCompletionCreateParams
import com.openai.models.responses.ResponseCreateParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

/**
 * Unit tests verifying that the OpenAI wrapper's input serialization produces the correct
 * snake_case keys matching the OpenAI REST API wire format.
 *
 * These tests do NOT require API keys and validate the serialization logic in isolation.
 */
internal class WrapOpenAISerializationTest {

    private val mapper = jsonMapper()
    private val mapType = object : TypeReference<Map<String, Any?>>() {}

    private fun toMap(value: Any): Map<String, Any?> = mapper.convertValue(value, mapType)

    @Test
    fun `chatParamsToMap produces snake_case keys`() {
        val params =
            ChatCompletionCreateParams.builder()
                .model(ChatModel.GPT_4_1_MINI)
                .addUserMessage("Hello")
                .maxCompletionTokens(100)
                .temperature(0.5)
                .topP(0.9)
                .frequencyPenalty(0.1)
                .presencePenalty(0.2)
                .seed(42)
                .build()

        val map = toMap(params._body())

        // Verify snake_case keys are used (not camelCase)
        assertThat(map).containsKey("model")
        assertThat(map).containsKey("messages")
        assertThat(map).containsKey("max_completion_tokens")
        assertThat(map).containsKey("temperature")
        assertThat(map).containsKey("top_p")
        assertThat(map).containsKey("frequency_penalty")
        assertThat(map).containsKey("presence_penalty")
        assertThat(map).containsKey("seed")

        // Verify camelCase keys are NOT present
        assertThat(map).doesNotContainKey("maxCompletionTokens")
        assertThat(map).doesNotContainKey("topP")
        assertThat(map).doesNotContainKey("frequencyPenalty")
        assertThat(map).doesNotContainKey("presencePenalty")

        // Verify values
        assertThat(map["max_completion_tokens"]).isEqualTo(100L)
        assertThat(map["temperature"]).isEqualTo(0.5)
        assertThat(map["top_p"]).isEqualTo(0.9)
        assertThat(map["frequency_penalty"]).isEqualTo(0.1)
        assertThat(map["presence_penalty"]).isEqualTo(0.2)
        assertThat(map["seed"]).isEqualTo(42L)

        // Verify unset optional fields are not present (not null, just absent)
        assertThat(map).doesNotContainKey("logprobs")
        assertThat(map).doesNotContainKey("stop")
        assertThat(map).doesNotContainKey("tools")
        assertThat(map).doesNotContainKey("tool_choice")
        assertThat(map).doesNotContainKey("stream_options")

        // Verify messages structure
        val messages = map["messages"] as List<*>
        assertThat(messages).hasSize(1)
        val message = messages[0] as Map<*, *>
        assertThat(message["role"]).isEqualTo("user")
    }

    @Test
    fun `responseParamsToMap produces snake_case keys`() {
        val params =
            ResponseCreateParams.builder()
                .model(ChatModel.GPT_4_1_MINI)
                .input("What is the capital of France?")
                .temperature(0.7)
                .topP(0.95)
                .build()

        val map = toMap(params._body())

        // Verify snake_case keys
        assertThat(map).containsKey("model")
        assertThat(map).containsKey("input")
        assertThat(map).containsKey("temperature")
        assertThat(map).containsKey("top_p")

        // Verify camelCase keys are NOT present
        assertThat(map).doesNotContainKey("topP")

        // Verify values
        assertThat(map["temperature"]).isEqualTo(0.7)
        assertThat(map["top_p"]).isEqualTo(0.95)

        // Verify unset optional fields are not present
        assertThat(map).doesNotContainKey("max_output_tokens")
        assertThat(map).doesNotContainKey("tools")
        assertThat(map).doesNotContainKey("instructions")
    }

    @Test
    fun `chatParamsToMap only includes set fields`() {
        val params =
            ChatCompletionCreateParams.builder()
                .model(ChatModel.GPT_4_1_MINI)
                .addUserMessage("test")
                .build()

        val map = toMap(params._body())

        // Only messages and model should be present (required fields)
        assertThat(map).containsKey("messages")
        assertThat(map).containsKey("model")

        // Optional fields that were not set should NOT be present
        assertThat(map).doesNotContainKey("temperature")
        assertThat(map).doesNotContainKey("max_completion_tokens")
        assertThat(map).doesNotContainKey("max_tokens")
        assertThat(map).doesNotContainKey("top_p")
        assertThat(map).doesNotContainKey("frequency_penalty")
        assertThat(map).doesNotContainKey("presence_penalty")
        assertThat(map).doesNotContainKey("seed")
        assertThat(map).doesNotContainKey("stop")
        assertThat(map).doesNotContainKey("tools")
        assertThat(map).doesNotContainKey("n")
    }

    @Test
    fun `chatParamsToMap with tools produces correct structure`() {
        val params =
            ChatCompletionCreateParams.builder()
                .model(ChatModel.GPT_4_1_MINI)
                .addUserMessage("What is the weather?")
                .addTool(
                    com.openai.models.chat.completions.ChatCompletionFunctionTool.builder()
                        .function(
                            com.openai.models.FunctionDefinition.builder()
                                .name("get_weather")
                                .description("Get weather for a location")
                                .parameters(
                                    com.openai.models.FunctionParameters.builder()
                                        .putAdditionalProperty(
                                            "type",
                                            com.openai.core.JsonValue.from("object"),
                                        )
                                        .putAdditionalProperty(
                                            "properties",
                                            com.openai.core.JsonValue.from(
                                                mapOf("location" to mapOf("type" to "string"))
                                            ),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val map = toMap(params._body())

        assertThat(map).containsKey("tools")
        val tools = map["tools"] as List<*>
        assertThat(tools).hasSize(1)
        val tool = tools[0] as Map<*, *>
        assertThat(tool["type"]).isEqualTo("function")
        val function = tool["function"] as Map<*, *>
        assertThat(function["name"]).isEqualTo("get_weather")
    }
}

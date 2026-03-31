package com.langchain.smith.wrappers.openai

import com.langchain.smith.testutils.CapturingLangsmithClient
import com.langchain.smith.tracing.RunType
import com.langchain.smith.tracing.TraceConfig
import com.langchain.smith.tracing.getCurrentRunTree
import com.langchain.smith.tracing.traceable
import com.openai.client.OpenAIClient
import com.openai.client.okhttp.OpenAIOkHttpClient
import com.openai.models.ChatModel
import com.openai.models.chat.completions.ChatCompletionCreateParams
import com.openai.models.chat.completions.ChatCompletionMessageParam
import com.openai.models.chat.completions.ChatCompletionToolMessageParam
import com.openai.models.responses.ResponseCreateParams
import java.util.stream.Stream
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assumptions.assumeTrue
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

/**
 * Integration tests for [wrapOpenAI].
 *
 * Requires `OPENAI_API_KEY` to be set. Tests are skipped if missing. Uses
 * [CapturingLangsmithClient] to capture and assert on traced run data without requiring a real
 * LangSmith server.
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class WrapOpenAITest {

    @BeforeAll
    fun setUp() {
        assumeTrue(
            !System.getenv("OPENAI_API_KEY").isNullOrBlank(),
            "Skipping: OPENAI_API_KEY must be set",
        )
    }

    /** Abstracts over Chat Completions vs Responses API for parameterized tests. */
    sealed interface ApiMode {
        val name: String

        fun create(client: OpenAIClient): String

        fun createStreaming(client: OpenAIClient): Pair<String, Int>

        fun createNested(client: OpenAIClient, config: TraceConfig): Pair<String, String?>
    }

    class ChatCompletionsMode : ApiMode {
        override val name = "chat completions"

        override fun create(client: OpenAIClient): String =
            client
                .chat()
                .completions()
                .create(chatParams())
                .choices()[0]
                .message()
                .content()
                .getOrNull() ?: ""

        override fun createStreaming(client: OpenAIClient): Pair<String, Int> {
            val chunks = mutableListOf<String>()
            client.chat().completions().createStreaming(chatParams(streaming = true)).use { stream
                ->
                stream.stream().forEach { chunk ->
                    chunk.choices().firstOrNull()?.delta()?.content()?.ifPresent { chunks.add(it) }
                }
            }
            return chunks.joinToString("") to chunks.size
        }

        override fun createNested(
            client: OpenAIClient,
            config: TraceConfig,
        ): Pair<String, String?> {
            var parentRunId: String? = null
            val agent =
                traceable(
                    { question: String ->
                        parentRunId = getCurrentRunTree()?.id
                        client
                            .chat()
                            .completions()
                            .create(
                                ChatCompletionCreateParams.builder()
                                    .model(ChatModel.GPT_4_1_MINI)
                                    .addUserMessage("$question Answer in one word.")
                                    .maxCompletionTokens(10)
                                    .build()
                            )
                            .choices()[0]
                            .message()
                            .content()
                            .getOrNull() ?: ""
                    },
                    config,
                )
            return agent("What is 2+2?") to parentRunId
        }

        private fun chatParams(streaming: Boolean = false) =
            ChatCompletionCreateParams.builder()
                .model(ChatModel.GPT_4_1_MINI)
                .addUserMessage("What is 2+2? Answer in one word.")
                .maxCompletionTokens(10)
                .apply {
                    if (streaming) {
                        streamOptions(
                            com.openai.models.chat.completions.ChatCompletionStreamOptions.builder()
                                .includeUsage(true)
                                .build()
                        )
                    }
                }
                .build()

        override fun toString() = name
    }

    class ResponsesMode : ApiMode {
        override val name = "responses"

        override fun create(client: OpenAIClient): String {
            val response = client.responses().create(responsesParams())
            return response.output().firstNotNullOfOrNull { item ->
                item.message().getOrNull()?.content()?.firstNotNullOfOrNull { block ->
                    block.outputText().getOrNull()?.text()
                }
            } ?: ""
        }

        override fun createStreaming(client: OpenAIClient): Pair<String, Int> {
            var eventCount = 0
            client.responses().createStreaming(responsesParams()).use { stream ->
                stream.stream().forEach { eventCount++ }
            }
            return "($eventCount events)" to eventCount
        }

        override fun createNested(
            client: OpenAIClient,
            config: TraceConfig,
        ): Pair<String, String?> {
            var parentRunId: String? = null
            val agent =
                traceable(
                    { _: String ->
                        parentRunId = getCurrentRunTree()?.id
                        val response = client.responses().create(responsesParams())
                        response.output().firstNotNullOfOrNull { item ->
                            item.message().getOrNull()?.content()?.firstNotNullOfOrNull { block ->
                                block.outputText().getOrNull()?.text()
                            }
                        } ?: ""
                    },
                    config,
                )
            return agent("question") to parentRunId
        }

        private fun responsesParams() =
            ResponseCreateParams.builder()
                .model(ChatModel.GPT_4_1_MINI)
                .input("What is the capital of France? Answer in one word.")
                .build()

        override fun toString() = name
    }

    companion object {
        @JvmStatic
        fun apiModes(): Stream<ApiMode> = Stream.of(ChatCompletionsMode(), ResponsesMode())
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("apiModes")
    fun tracedWithInputsAndOutputs(mode: ApiMode) {
        val capture = CapturingLangsmithClient()
        val config =
            TraceConfig(
                client = capture.client,
                projectName = "wrapOpenAI-tests",
                tracingEnabled = true,
            )
        val openai = wrapOpenAI(OpenAIOkHttpClient.fromEnv(), config)
        val answer = mode.create(openai)

        assertThat(answer).isNotBlank()

        val posted = capture.awaitAndGetPostedRuns()
        assertThat(posted).isNotEmpty()
        val postedRun = posted[0]
        assertThat(postedRun.name().orElse(null)).isEqualTo("ChatOpenAI")
        assertThat(postedRun.runType().orElse(null)?.asString()).isEqualTo("llm")

        // Inputs should contain model and messages/input
        val inputs = postedRun.inputs().get()._additionalProperties()
        assertThat(inputs).containsKey("model")

        val patched = capture.awaitAndGetPatchedRuns()
        assertThat(patched).isNotEmpty()
        val patchedRun = patched[0]

        // Outputs should contain choices/output and usage_metadata
        val outputs = patchedRun.outputs().get()._additionalProperties()
        assertThat(outputs).isNotEmpty()
        assertThat(outputs).containsKey("usage_metadata")

        // Extra should contain metadata with ls_provider, ls_model_name
        val extra = patchedRun.extra().get()._additionalProperties()
        val metadata = extra["metadata"]
        assertThat(metadata).isNotNull()

        println("[wrapOpenAI ${mode.name}] Result: $answer")
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("apiModes")
    fun streamingTracedWithAggregatedOutput(mode: ApiMode) {
        val capture = CapturingLangsmithClient()
        val config =
            TraceConfig(
                client = capture.client,
                projectName = "wrapOpenAI-tests",
                tracingEnabled = true,
            )
        val openai = wrapOpenAI(OpenAIOkHttpClient.fromEnv(), config)
        val (answer, count) = mode.createStreaming(openai)

        assertThat(answer).isNotBlank()
        assertThat(count).isGreaterThan(0)

        val posted = capture.awaitAndGetPostedRuns()
        assertThat(posted).isNotEmpty()
        val postedRun = posted[0]
        assertThat(postedRun.name().orElse(null)).isEqualTo("ChatOpenAI")
        assertThat(postedRun.runType().orElse(null)?.asString()).isEqualTo("llm")

        // Inputs should contain model
        val inputs = postedRun.inputs().get()._additionalProperties()
        assertThat(inputs).containsKey("model")

        val patched = capture.awaitAndGetPatchedRuns()
        assertThat(patched).isNotEmpty()
        val patchedRun = patched[0]

        // Outputs should have aggregated result with usage_metadata
        val outputs = patchedRun.outputs().get()._additionalProperties()
        assertThat(outputs).isNotEmpty()
        assertThat(outputs).containsKey("usage_metadata")

        println("[wrapOpenAI streaming ${mode.name}] Result: $answer ($count chunks/events)")
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("apiModes")
    fun nestsUnderParentTrace(mode: ApiMode) {
        val capture = CapturingLangsmithClient()
        val config =
            TraceConfig(
                name = "agent",
                client = capture.client,
                projectName = "wrapOpenAI-tests",
                tracingEnabled = true,
            )
        val openai = wrapOpenAI(OpenAIOkHttpClient.fromEnv(), config)
        val (result, parentRunId) = mode.createNested(openai, config)

        assertThat(result).isNotBlank()
        assertThat(parentRunId).isNotNull()

        // Should have at least 2 posted runs: the parent agent + the child LLM call
        val posted = capture.awaitAndGetPostedRuns()
        assertThat(posted.size).isGreaterThanOrEqualTo(2)

        println("[wrapOpenAI nested ${mode.name}] Result: $result")
    }

    @org.junit.jupiter.api.Test
    fun chatCompletions_toolCallLoop() {
        val capture = CapturingLangsmithClient()
        val toolConfig =
            TraceConfig(
                name = "get_weather",
                client = capture.client,
                projectName = "wrapOpenAI-tests",
                runType = RunType.TOOL,
                tracingEnabled = true,
            )
        val openai =
            wrapOpenAI(
                OpenAIOkHttpClient.fromEnv(),
                TraceConfig(
                    client = capture.client,
                    projectName = "wrapOpenAI-tests",
                    tracingEnabled = true,
                ),
            )

        val executeTool =
            traceable(
                { _: String -> """{"location":"San Francisco","temp_f":72,"condition":"sunny"}""" },
                toolConfig,
            )

        val agent =
            traceable(
                { question: String ->
                    val messages = mutableListOf<ChatCompletionMessageParam>()
                    messages +=
                        ChatCompletionMessageParam.ofUser(
                            com.openai.models.chat.completions.ChatCompletionUserMessageParam
                                .builder()
                                .content("$question Use the get_weather tool.")
                                .build()
                        )

                    val weatherTool =
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
                                                    mapOf(
                                                        "location" to
                                                            mapOf(
                                                                "type" to "string",
                                                                "description" to "City name",
                                                            )
                                                    )
                                                ),
                                            )
                                            .putAdditionalProperty(
                                                "required",
                                                com.openai.core.JsonValue.from(listOf("location")),
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .build()

                    repeat(3) {
                        val completion =
                            openai
                                .chat()
                                .completions()
                                .create(
                                    ChatCompletionCreateParams.builder()
                                        .model(ChatModel.GPT_4_1_MINI)
                                        .messages(messages)
                                        .addTool(weatherTool)
                                        .maxCompletionTokens(150)
                                        .build()
                                )

                        val message = completion.choices()[0].message()
                        val toolCalls = message.toolCalls().getOrNull().orEmpty()

                        if (toolCalls.isEmpty()) {
                            return@traceable message.content().getOrNull() ?: ""
                        }

                        messages += ChatCompletionMessageParam.ofAssistant(message.toParam())
                        toolCalls.forEach { toolCall ->
                            val fn = toolCall.asFunction()
                            val result = executeTool(fn.function().arguments())
                            messages +=
                                ChatCompletionMessageParam.ofTool(
                                    ChatCompletionToolMessageParam.builder()
                                        .toolCallId(fn.id())
                                        .content(result)
                                        .build()
                                )
                        }
                    }

                    error("Model did not finish tool loop in time")
                },
                TraceConfig(
                    name = "weather-agent",
                    client = capture.client,
                    projectName = "wrapOpenAI-tests",
                    tracingEnabled = true,
                ),
            )

        val result = agent("What is the weather in San Francisco?")
        assertThat(result).isNotBlank()

        // Should have: weather-agent + at least 1 ChatOpenAI + at least 1 get_weather
        val posted = capture.awaitAndGetPostedRuns()
        val runNames = posted.mapNotNull { it.name().orElse(null) }
        assertThat(runNames).contains("weather-agent")
        assertThat(runNames).contains("ChatOpenAI")
        assertThat(runNames).contains("get_weather")

        println("[wrapOpenAI tool loop] Result: $result, runs: $runNames")
    }
}

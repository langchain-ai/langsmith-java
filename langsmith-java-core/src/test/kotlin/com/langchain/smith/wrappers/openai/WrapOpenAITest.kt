package com.langchain.smith.wrappers.openai

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.tracing.RunType
import com.langchain.smith.tracing.TraceConfig
import com.langchain.smith.tracing.getCurrentRunTree
import com.langchain.smith.tracing.traceable
import com.openai.client.okhttp.OpenAIOkHttpClient
import com.openai.models.ChatModel
import com.openai.models.chat.completions.ChatCompletionCreateParams
import com.openai.models.chat.completions.ChatCompletionMessageParam
import com.openai.models.chat.completions.ChatCompletionToolMessageParam
import com.openai.models.responses.ResponseCreateParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assumptions.assumeTrue
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

/**
 * Integration tests for [wrapOpenAI].
 *
 * Requires `LANGSMITH_API_KEY` and `OPENAI_API_KEY` to be set. Tests are skipped if either is
 * missing.
 *
 * Run with:
 * ```bash
 * ./gradlew :langsmith-java-core:test --tests "com.langchain.smith.wrappers.openai.WrapOpenAITest"
 * ```
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class WrapOpenAITest {

    private lateinit var langsmith: com.langchain.smith.client.LangsmithClient

    private fun awaitPendingRuns() = Thread.sleep(2000)

    private fun baseConfig() =
        TraceConfig(client = langsmith, projectName = "wrapOpenAI-tests", tracingEnabled = true)

    @BeforeAll
    fun setUp() {
        assumeTrue(
            !System.getenv("LANGSMITH_API_KEY").isNullOrBlank(),
            "Skipping: LANGSMITH_API_KEY must be set",
        )
        assumeTrue(
            !System.getenv("OPENAI_API_KEY").isNullOrBlank(),
            "Skipping: OPENAI_API_KEY must be set",
        )
        langsmith = LangsmithOkHttpClient.fromEnv()
    }

    @Test
    fun chatCompletions_tracedWithInputsAndOutputs() {
        val openai = wrapOpenAI(OpenAIOkHttpClient.fromEnv(), baseConfig())

        val completion =
            openai
                .chat()
                .completions()
                .create(
                    ChatCompletionCreateParams.builder()
                        .model(ChatModel.GPT_4_1_MINI)
                        .addUserMessage("What is 2+2? Answer in one word.")
                        .maxCompletionTokens(10)
                        .build()
                )

        val answer = completion.choices()[0].message().content().getOrNull() ?: ""
        assertThat(answer).isNotBlank()
        println("[wrapOpenAI chat] Result: $answer")
        awaitPendingRuns()
    }

    @Test
    fun responses_tracedWithInputsAndOutputs() {
        val openai = wrapOpenAI(OpenAIOkHttpClient.fromEnv(), baseConfig())

        val response =
            openai
                .responses()
                .create(
                    ResponseCreateParams.builder()
                        .model(ChatModel.GPT_4_1_MINI)
                        .input("What is the capital of France? Answer in one word.")
                        .build()
                )

        val answer =
            response.output().firstNotNullOfOrNull { item ->
                item.message().getOrNull()?.content()?.firstNotNullOfOrNull { block ->
                    block.outputText().getOrNull()?.text()
                }
            } ?: ""
        assertThat(answer).containsIgnoringCase("Paris")
        println("[wrapOpenAI responses] Result: $answer")
        awaitPendingRuns()
    }

    @Test
    fun chatCompletions_nestsUnderParentTrace() {
        val openai = wrapOpenAI(OpenAIOkHttpClient.fromEnv(), baseConfig())

        var parentRunId: String? = null

        val agent =
            traceable(
                { question: String ->
                    parentRunId = getCurrentRunTree()?.id
                    openai
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
                TraceConfig(
                    name = "agent",
                    client = langsmith,
                    projectName = "wrapOpenAI-tests",
                    tracingEnabled = true,
                ),
            )

        val result = agent("What is 2+2?")
        assertThat(result).isNotBlank()
        assertThat(parentRunId).isNotNull()
        println("[wrapOpenAI nested] Result: $result")
        awaitPendingRuns()
    }

    @Test
    fun chatCompletions_toolCallLoop() {
        val openai = wrapOpenAI(OpenAIOkHttpClient.fromEnv(), baseConfig())

        val executeTool =
            traceable(
                { _: String -> """{"location":"San Francisco","temp_f":72,"condition":"sunny"}""" },
                TraceConfig(
                    name = "get_weather",
                    client = langsmith,
                    projectName = "wrapOpenAI-tests",
                    runType = RunType.TOOL,
                    tracingEnabled = true,
                ),
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
                    client = langsmith,
                    projectName = "wrapOpenAI-tests",
                    tracingEnabled = true,
                ),
            )

        val result = agent("What is the weather in San Francisco?")
        assertThat(result).isNotBlank()
        println("[wrapOpenAI tool loop] Result: $result")
        awaitPendingRuns()
    }
}

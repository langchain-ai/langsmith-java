package com.langchain.smith.example

import com.langchain.smith.tracing.RunType
import com.langchain.smith.tracing.TraceConfig
import com.langchain.smith.tracing.traceable
import com.langchain.smith.wrappers.openai.wrapOpenAI
import com.openai.client.okhttp.OpenAIOkHttpClient
import com.openai.core.JsonValue
import com.openai.models.ChatModel
import com.openai.models.FunctionDefinition
import com.openai.models.FunctionParameters
import com.openai.models.chat.completions.ChatCompletionCreateParams
import com.openai.models.chat.completions.ChatCompletionFunctionTool
import com.openai.models.chat.completions.ChatCompletionMessageParam
import com.openai.models.chat.completions.ChatCompletionToolMessageParam
import com.openai.models.chat.completions.ChatCompletionUserMessageParam
import kotlin.jvm.optionals.getOrNull

/**
 * Demonstrates a simple agent loop using [wrapOpenAI] plus a traced tool call.
 *
 * The OpenAI client traces LLM calls automatically, and the tool is traced explicitly with
 * [traceable], so the final trace in LangSmith shows both the agent call and the tool call.
 *
 * ## Running
 * ```bash
 * export LANGSMITH_TRACING=true
 * ./gradlew :langsmith-java-example:run -Pexample=WrapOpenAIAgent
 * ```
 */
fun main() {
    println("=== wrapOpenAI Agent Example ===\n")

    val openai = wrapOpenAI(
        OpenAIOkHttpClient.fromEnv()
    )

    val getWeather =
        traceable(
            { _: String ->
                """{"location":"San Francisco","temp_f":72,"condition":"sunny"}"""
            },
            TraceConfig.builder()
                .name("get_weather")
                .runType(RunType.TOOL)
                .build(),
        )

    val weatherTool =
        ChatCompletionFunctionTool.builder()
            .function(
                FunctionDefinition.builder()
                    .name("get_weather")
                    .description("Get weather for a location")
                    .parameters(
                        FunctionParameters.builder()
                            .putAdditionalProperty("type", JsonValue.from("object"))
                            .putAdditionalProperty(
                                "properties",
                                JsonValue.from(
                                    mapOf(
                                        "location" to
                                            mapOf(
                                                "type" to "string",
                                                "description" to "City name",
                                            )
                                    )
                                ),
                            )
                            .putAdditionalProperty("required", JsonValue.from(listOf("location")))
                            .build(),
                    )
                    .build(),
            )
            .build()

    val messages = mutableListOf<ChatCompletionMessageParam>()

    val agent =
        traceable(
            { question: String ->
                messages +=
                    ChatCompletionMessageParam.ofUser(
                        ChatCompletionUserMessageParam.builder().content(question).build(),
                    )

                var iterations = 0
                while (iterations < 10) {
                    iterations++

                    val completion =
                        openai
                            .chat()
                            .completions()
                            .create(
                                ChatCompletionCreateParams.builder()
                                    .model(ChatModel.GPT_4_1_MINI)
                                    .messages(messages)
                                    .addTool(weatherTool)
                                    .build(),
                            )

                    val message = completion.choices()[0].message()
                    val toolCalls = message.toolCalls().getOrNull().orEmpty()

                    if (toolCalls.isEmpty()) {
                        return@traceable message.content().getOrNull().orEmpty()
                    }

                    messages += ChatCompletionMessageParam.ofAssistant(message.toParam())
                    toolCalls.forEach { toolCall ->
                        val fn = toolCall.asFunction()
                        val toolResult = getWeather(fn.function().arguments())
                        println("  Tool ${fn.function().name()} -> $toolResult")
                        messages +=
                            ChatCompletionMessageParam.ofTool(
                                ChatCompletionToolMessageParam.builder()
                                    .toolCallId(fn.id())
                                    .content(toolResult)
                                    .build(),
                            )
                    }
                }

                error("Model did not finish tool loop within 10 iterations")
            },
            TraceConfig.builder()
                .name("weather-agent")
                .projectName("wrapOpenAI-agent-example")
                .build(),
        )

    println("Running agent...\n")
    val answer = agent("What's the weather in San Francisco? Use the get_weather tool.")
    println("\nFinal answer: $answer")
    println("\nTrace recorded to LangSmith:")
    println("  weather-agent (chain)")
    println("    ├── ChatOpenAI (llm)")
    println("    ├── get_weather (tool)")
    println("    └── ChatOpenAI (llm)")
}

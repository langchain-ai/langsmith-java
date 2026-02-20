package com.langchain.smith.example.otel

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.langchain.smith.wrappers.openai.OpenTelemetryConfig
import com.langchain.smith.wrappers.openai.WrappedOpenAIClient
import com.openai.models.ChatModel
import com.openai.models.FunctionDefinition
import com.openai.models.FunctionParameters
import com.openai.models.chat.completions.ChatCompletionAssistantMessageParam
import com.openai.models.chat.completions.ChatCompletionCreateParams
import com.openai.models.chat.completions.ChatCompletionFunctionTool
import com.openai.models.chat.completions.ChatCompletionMessageParam
import com.openai.models.chat.completions.ChatCompletionMessageToolCall
import com.openai.models.chat.completions.ChatCompletionTool
import com.openai.models.chat.completions.ChatCompletionToolChoiceOption
import com.openai.models.chat.completions.ChatCompletionToolMessageParam
import io.opentelemetry.api.OpenTelemetry
import io.opentelemetry.api.common.AttributeKey
import io.opentelemetry.api.trace.Span
import io.opentelemetry.api.trace.SpanKind
import io.opentelemetry.api.trace.StatusCode
import io.opentelemetry.api.trace.Tracer
import io.opentelemetry.context.Scope
import java.util.concurrent.TimeUnit
import kotlin.system.exitProcess

/**
 * Example: Make real OpenAI API calls with OpenTelemetry tracing to LangSmith.
 *
 * Demonstrates:
 * - Configuring OpenTelemetry to send traces to LangSmith
 * - Using the wrapped OpenAI client for automatic tracing
 * - Making actual API calls to OpenAI with tool definitions
 * - Automatic tool call span creation
 * - Multi-turn conversations with tool execution
 *
 * Usage:
 *   export OPENAI_API_KEY=your_openai_api_key
 *   export LANGSMITH_API_KEY=your_langsmith_api_key
 *   export LANGSMITH_PROJECT=your_project_name
 *   ./gradlew :langsmith-java-example:run -Pexample=OtelOpenAI
 */
private const val SEPARATOR = "============================================================"

fun main() {
    println("=== OpenAI + LangSmith OpenTelemetry Example ===\n")

    val openaiKey = System.getenv("OPENAI_API_KEY")
    if (openaiKey.isNullOrEmpty()) {
        System.err.println("ERROR: OPENAI_API_KEY environment variable is required!")
        System.err.println("Get your API key from: https://platform.openai.com/api-keys")
        exitProcess(1)
    }

    val langsmithKey = System.getenv("LANGSMITH_API_KEY")
    if (langsmithKey.isNullOrEmpty()) {
        System.err.println("ERROR: LANGSMITH_API_KEY environment variable is required!")
        System.err.println("Get your API key from: https://smith.langchain.com/settings")
        exitProcess(1)
    }

    val projectName = System.getenv("LANGSMITH_PROJECT") ?: "default"

    println("Configuration:")
    println("  LangSmith Project: $projectName")
    println("  Service Name: langsmith-kotlin-openai-example")
    println()

    try {
        OpenTelemetryConfig.builder()
            .apiKey(langsmithKey)
            .projectName(projectName)
            .serviceName("langsmith-kotlin-openai-example")
            .processorType(OpenTelemetryConfig.SpanProcessorType.SIMPLE)
            .maxBatchSize(1)
            .build()
        println("✓ OpenTelemetry configured for LangSmith\n")
    } catch (e: Exception) {
        System.err.println("✗ Failed to configure OpenTelemetry: ${e.message}")
        e.printStackTrace()
        exitProcess(1)
    }

    val client = WrappedOpenAIClient.fromEnv()
    val openTelemetry: OpenTelemetry = io.opentelemetry.api.GlobalOpenTelemetry.get()
    val tracer: Tracer = openTelemetry.getTracer("langsmith-kotlin-openai-example")

    val workflowSpan = tracer.spanBuilder("openai_agent_workflow")
        .setSpanKind(SpanKind.INTERNAL)
        .setAttribute("gen_ai.operation.name", "agent_workflow")
        .setAttribute("langsmith.span.kind", "chain")
        .setAttribute("langsmith.trace.name", "OpenAI Agent with Tools")
        .startSpan()

    try {
        workflowSpan.makeCurrent().use { _ ->
            val span = workflowSpan
            println(SEPARATOR)
            println("Agent Workflow: Chat with Tool Calls")
            println(SEPARATOR)

            val locationProperty = mapOf(
                "type" to com.openai.core.JsonValue.from("string"),
                "description" to com.openai.core.JsonValue.from("The city and state, e.g., San Francisco, CA")
            )
            val properties = mapOf("location" to com.openai.core.JsonValue.from(locationProperty))
            val parametersJson = mapOf(
                "type" to com.openai.core.JsonValue.from("object"),
                "properties" to com.openai.core.JsonValue.from(properties),
                "required" to com.openai.core.JsonValue.from(listOf("location"))
            )

            val initialUserMessage = "What is the capital of France and what's the current weather there?"
            val params = ChatCompletionCreateParams.builder()
                .model(ChatModel.GPT_4O_MINI)
                .addUserMessage(initialUserMessage)
                .tools(
                    listOf(
                        ChatCompletionTool.ofFunction(
                            ChatCompletionFunctionTool.builder()
                                .function(
                                    FunctionDefinition.builder()
                                        .name("get_weather")
                                        .description("Get the current weather for a given location")
                                        .parameters(FunctionParameters.builder().putAllAdditionalProperties(parametersJson).build())
                                        .build()
                                )
                                .build()
                        )
                    )
                )
                .toolChoice(ChatCompletionToolChoiceOption.ofAuto(ChatCompletionToolChoiceOption.Auto.AUTO))
                .build()

            span.setAttribute(AttributeKey.stringKey("gen_ai.prompt"), initialUserMessage)

            println("\n1. Making initial API call with tool definitions...")
            var completion = client.chat().completions().create(params)
            val message = completion.choices()[0].message()
            val toolCallsOpt = message.toolCalls()

            val finalContent = if (toolCallsOpt.isPresent && toolCallsOpt.get().isNotEmpty()) {
                println("   ✓ Tool calls detected in response!")
                val toolCalls = toolCallsOpt.get()
                val messages = mutableListOf<ChatCompletionMessageParam>()
                messages.add(params.messages()[0])
                messages.add(
                    ChatCompletionMessageParam.ofAssistant(
                        ChatCompletionAssistantMessageParam.builder()
                            .content(message.content().orElse(""))
                            .toolCalls(toolCalls)
                            .build()
                    )
                )

                println("\n2. Executing tool calls...")
                for (toolCall in toolCalls) {
                    if (toolCall.isFunction()) {
                        val functionToolCall = toolCall.asFunction()
                        val toolName = functionToolCall.function().name()
                        val toolArguments = functionToolCall.function().arguments()
                        val toolCallId = functionToolCall.id()

                        println("   - Tool: $toolName | Args: $toolArguments")

                        val toolExecutionSpan = tracer.spanBuilder("tool_execution $toolName")
                            .setSpanKind(SpanKind.INTERNAL)
                            .setAttribute(AttributeKey.stringKey("gen_ai.operation.name"), "tool")
                            .setAttribute(AttributeKey.stringKey("gen_ai.tool.name"), toolName)
                            .setAttribute(AttributeKey.stringKey("gen_ai.tool.call.id"), toolCallId)
                            .setAttribute(AttributeKey.stringKey("gen_ai.tool.arguments"), toolArguments)
                            .setAttribute(AttributeKey.stringKey("langsmith.span.kind"), "tool")
                            .setAttribute(AttributeKey.stringKey("gen_ai.prompt"), toolArguments)
                            .startSpan()

                        val toolResult = try {
                            toolExecutionSpan.makeCurrent().use {
                                val result = executeTool(toolName, toolArguments)
                                println("   - Result: $result")
                                toolExecutionSpan.setAttribute(AttributeKey.stringKey("gen_ai.completion"), result)
                                toolExecutionSpan.setStatus(StatusCode.OK)
                                result
                            }
                        } catch (e: Exception) {
                            toolExecutionSpan.recordException(e)
                            toolExecutionSpan.setStatus(StatusCode.ERROR)
                            "{\"error\": \"${e.message}\"}"
                        } finally {
                            toolExecutionSpan.end()
                        }

                        messages.add(
                            ChatCompletionMessageParam.ofTool(
                                ChatCompletionToolMessageParam.builder()
                                    .toolCallId(functionToolCall.id())
                                    .content(toolResult)
                                    .build()
                            )
                        )
                    }
                }

                println("\n3. Sending follow-up request with tool results...")
                val followUpParams = ChatCompletionCreateParams.builder()
                    .model(ChatModel.GPT_4O_MINI)
                    .messages(messages)
                    .build()
                completion = client.chat().completions().create(followUpParams)
                completion.choices()[0].message().content().orElse("No content")
            } else {
                message.content().orElse("No content")
            }

            println("\n$SEPARATOR")
            println("Final Response:")
            println(finalContent)
            println(SEPARATOR)

            completion.usage().ifPresent { usage ->
                println("\nTotal Token Usage:")
                println("  Input:  ${usage.promptTokens()}")
                println("  Output: ${usage.completionTokens()}")
                println("  Total:  ${usage.totalTokens()}")
            }

            span.setAttribute(AttributeKey.stringKey("gen_ai.completion"), finalContent)
            span.setAttribute("response.content", finalContent)
            span.setStatus(StatusCode.OK)
        }
    } catch (e: Exception) {
        workflowSpan.recordException(e)
        System.err.println("\n✗ Error during API call: ${e.message}")
        e.printStackTrace()
        workflowSpan.recordException(e)
        workflowSpan.setStatus(StatusCode.ERROR)
    } finally {
        workflowSpan.end()
    }

    client.close()

    println("\n$SEPARATOR")
    println("Flushing traces to LangSmith...")
    val flushed = OpenTelemetryConfig.flush(10, TimeUnit.SECONDS)

    if (flushed) {
        println("✓ Traces sent successfully!")
        println("\nView your traces at:")
        println("  https://smith.langchain.com/projects/$projectName")
    } else {
        System.err.println("✗ Warning: Flush may not have completed successfully")
    }

    println(SEPARATOR)
    println("\nNote: Check the trace waterfall in LangSmith UI to see:")
    println("  - Parent workflow span (chain)")
    println("  - Child LLM spans (automatically created)")
    println("  - Tool call spans (automatically created by wrapper)")
}

private fun executeTool(toolName: String, arguments: String): String {
    return try {
        val mapper = ObjectMapper()
        val args = mapper.readTree(arguments)

        if (toolName == "get_weather") {
            val location = if (args.has("location")) args.get("location").asText() else "unknown"
            val result = mapOf(
                "location" to location,
                "temperature" to "18°C",
                "condition" to "Partly Cloudy",
                "humidity" to "65%",
                "wind" to "15 km/h"
            )
            mapper.writeValueAsString(result)
        } else {
            val errorMap = mapOf("error" to "Unknown tool: $toolName")
            mapper.writeValueAsString(errorMap)
        }
    } catch (e: Exception) {
        "{\"error\": \"${e.message}\"}"
    }
}


package com.langchain.smith.example.otel;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.langchain.smith.wrappers.openai.OpenTelemetryConfig;
import com.langchain.smith.wrappers.openai.WrappedOpenAIClient;
import com.openai.core.JsonValue;
import com.openai.models.ChatModel;
import com.openai.models.FunctionDefinition;
import com.openai.models.FunctionParameters;
import com.openai.models.chat.completions.ChatCompletion;
import com.openai.models.chat.completions.ChatCompletionAssistantMessageParam;
import com.openai.models.chat.completions.ChatCompletionCreateParams;
import com.openai.models.chat.completions.ChatCompletionFunctionTool;
import com.openai.models.chat.completions.ChatCompletionMessage;
import com.openai.models.chat.completions.ChatCompletionMessageFunctionToolCall;
import com.openai.models.chat.completions.ChatCompletionMessageParam;
import com.openai.models.chat.completions.ChatCompletionMessageToolCall;
import com.openai.models.chat.completions.ChatCompletionTool;
import com.openai.models.chat.completions.ChatCompletionToolChoiceOption;
import com.openai.models.chat.completions.ChatCompletionToolMessageParam;
import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Example: Make real OpenAI API calls with OpenTelemetry tracing to LangSmith.
 *
 * <p>This example demonstrates:
 * <ul>
 *   <li>Configuring OpenTelemetry to send traces to LangSmith</li>
 *   <li>Using the wrapped OpenAI client for automatic tracing</li>
 *   <li>Making actual API calls to OpenAI with tool definitions</li>
 *   <li>Manual tool execution span creation with input/output</li>
 *   <li>Multi-turn conversations with tool execution</li>
 *   <li>Viewing rich traces in the LangSmith dashboard</li>
 * </ul>
 *
 * <p>Usage:
 * <pre>
 * export OPENAI_API_KEY=your_openai_api_key
 * export LANGSMITH_API_KEY=your_langsmith_api_key
 * export LANGSMITH_PROJECT=your_project_name
 * ./gradlew :langsmith-java-example:run -Pexample=OtelOpenAI
 * </pre>
 */
public class OtelOpenAIExample {
    private static final String SEPARATOR = "============================================================";

    public static void main(String[] args) {
        System.out.println("=== OpenAI + LangSmith OpenTelemetry Example ===\n");

        // Check for required environment variables
        String openaiKey = System.getenv("OPENAI_API_KEY");
        if (openaiKey == null || openaiKey.isEmpty()) {
            System.err.println("ERROR: OPENAI_API_KEY environment variable is required!");
            System.err.println("Get your API key from: https://platform.openai.com/api-keys");
            return;
        }

        String langsmithKey = System.getenv("LANGSMITH_API_KEY");
        if (langsmithKey == null || langsmithKey.isEmpty()) {
            System.err.println("ERROR: LANGSMITH_API_KEY environment variable is required!");
            System.err.println("Get your API key from: https://smith.langchain.com/settings");
            return;
        }

        String projectName = System.getenv("LANGSMITH_PROJECT");
        if (projectName == null || projectName.isEmpty()) {
            projectName = "default";
        }

        System.out.println("Configuration:");
        System.out.println("  LangSmith Project: " + projectName);
        System.out.println("  Service Name: langsmith-java-openai-example");
        System.out.println();

        // Configure OpenTelemetry to send traces to LangSmith
        // Using SIMPLE processor for immediate export (best for short-lived examples)
        try {
            OpenTelemetryConfig.builder()
                    .apiKey(langsmithKey)
                    .projectName(projectName)
                    .serviceName("langsmith-java-openai-example")
                    .processorType(OpenTelemetryConfig.SpanProcessorType.SIMPLE)
                    .maxBatchSize(1)
                    .build();
            System.out.println("✓ OpenTelemetry configured for LangSmith\n");
        } catch (Exception e) {
            System.err.println("✗ Failed to configure OpenTelemetry: " + e.getMessage());
            e.printStackTrace();
            return;
        }

        // Create wrapped OpenAI client - all calls will automatically be traced
        WrappedOpenAIClient client = WrappedOpenAIClient.fromEnv();

        // Create a parent span to wrap the workflow
        OpenTelemetry openTelemetry = io.opentelemetry.api.GlobalOpenTelemetry.get();
        Tracer tracer = openTelemetry.getTracer("langsmith-java-openai-example");

        Span workflowSpan = tracer.spanBuilder("openai_agent_workflow")
                .setSpanKind(SpanKind.INTERNAL)
                .setAttribute("gen_ai.operation.name", "agent_workflow")
                .setAttribute("langsmith.span.kind", "chain")
                .setAttribute("langsmith.trace.name", "OpenAI Agent with Tools")
                .startSpan();

        try (Scope scope = workflowSpan.makeCurrent()) {
            System.out.println(SEPARATOR);
            System.out.println("Agent Workflow: Chat with Tool Calls");
            System.out.println(SEPARATOR);

            // Build tool (function) definition for weather API
            Map<String, JsonValue> properties = new HashMap<>();
            Map<String, JsonValue> locationProperty = new HashMap<>();
            locationProperty.put("type", JsonValue.from("string"));
            locationProperty.put("description", JsonValue.from("The city and state, e.g., San Francisco, CA"));
            properties.put("location", JsonValue.from(locationProperty));

            Map<String, JsonValue> parametersJson = new HashMap<>();
            parametersJson.put("type", JsonValue.from("object"));
            parametersJson.put("properties", JsonValue.from(properties));
            parametersJson.put("required", JsonValue.from(Arrays.asList("location")));

            // Create initial request with tool definitions
            String initialUserMessage = "What is the capital of France and what's the current weather there?";
            ChatCompletionCreateParams params = ChatCompletionCreateParams.builder()
                    .model(ChatModel.GPT_4O_MINI)
                    .addUserMessage(initialUserMessage)
                    .tools(Arrays.asList(ChatCompletionTool.ofFunction(ChatCompletionFunctionTool.builder()
                            .function(FunctionDefinition.builder()
                                    .name("get_weather")
                                    .description("Get the current weather for a given location")
                                    .parameters(FunctionParameters.builder()
                                            .putAllAdditionalProperties(parametersJson)
                                            .build())
                                    .build())
                            .build())))
                    .toolChoice(
                            ChatCompletionToolChoiceOption.Companion.ofAuto(ChatCompletionToolChoiceOption.Auto.AUTO))
                    .build();

            // Set input on workflow span
            workflowSpan.setAttribute(AttributeKey.stringKey("gen_ai.prompt"), initialUserMessage);

            System.out.println("\n1. Making initial API call with tool definitions...");
            ChatCompletion completion = client.chat().completions().create(params);

            // Check if the response contains tool calls
            ChatCompletionMessage message = completion.choices().get(0).message();
            java.util.Optional<List<ChatCompletionMessageToolCall>> toolCallsOpt = message.toolCalls();

            String finalContent;

            if (toolCallsOpt.isPresent() && !toolCallsOpt.get().isEmpty()) {
                System.out.println("   ✓ Tool calls detected in response!");
                List<ChatCompletionMessageToolCall> toolCalls = toolCallsOpt.get();

                // Build messages list for follow-up request
                List<ChatCompletionMessageParam> messages = new ArrayList<>();
                messages.add(params.messages().get(0)); // Original user message

                // Add assistant message with tool calls
                messages.add(ChatCompletionMessageParam.ofAssistant(ChatCompletionAssistantMessageParam.builder()
                        .content(message.content().orElse(""))
                        .toolCalls(toolCalls)
                        .build()));

                // Execute each tool call
                System.out.println("\n2. Executing tool calls...");
                for (ChatCompletionMessageToolCall toolCall : toolCalls) {
                    if (toolCall.isFunction()) {
                        ChatCompletionMessageFunctionToolCall functionToolCall = toolCall.asFunction();
                        String toolName = functionToolCall.function().name();
                        String toolArguments = functionToolCall.function().arguments();
                        String toolCallId = functionToolCall.id();

                        System.out.println("   - Tool: " + toolName + " | Args: " + toolArguments);

                        // Create a tool execution span to capture the tool execution and result
                        Span toolExecutionSpan = tracer.spanBuilder("tool_execution " + toolName)
                                .setSpanKind(SpanKind.INTERNAL)
                                .setAttribute(AttributeKey.stringKey("gen_ai.operation.name"), "tool")
                                .setAttribute(AttributeKey.stringKey("gen_ai.tool.name"), toolName)
                                .setAttribute(AttributeKey.stringKey("gen_ai.tool.call.id"), toolCallId)
                                .setAttribute(AttributeKey.stringKey("gen_ai.tool.arguments"), toolArguments)
                                .setAttribute(AttributeKey.stringKey("langsmith.span.kind"), "tool")
                                .setAttribute(AttributeKey.stringKey("gen_ai.prompt"), toolArguments)
                                .startSpan();

                        String toolResult;
                        try (Scope toolExecutionScope = toolExecutionSpan.makeCurrent()) {
                            // Execute the tool (simulated weather API)
                            toolResult = executeTool(toolName, toolArguments);
                            System.out.println("   - Result: " + toolResult);

                            // Set tool execution result as output
                            toolExecutionSpan.setAttribute(AttributeKey.stringKey("gen_ai.completion"), toolResult);
                            toolExecutionSpan.setStatus(StatusCode.OK);
                        } catch (Exception e) {
                            toolExecutionSpan.recordException(e);
                            toolExecutionSpan.setStatus(StatusCode.ERROR);
                            toolResult = "{\"error\": \"" + e.getMessage() + "\"}";
                        } finally {
                            toolExecutionSpan.end();
                        }

                        // Add tool result message
                        messages.add(ChatCompletionMessageParam.ofTool(ChatCompletionToolMessageParam.builder()
                                .toolCallId(functionToolCall.id())
                                .content(toolResult)
                                .build()));
                    }
                }

                // Send follow-up request with tool results
                System.out.println("\n3. Sending follow-up request with tool results...");
                ChatCompletionCreateParams followUpParams = ChatCompletionCreateParams.builder()
                        .model(ChatModel.GPT_4O_MINI)
                        .messages(messages)
                        .build();

                completion = client.chat().completions().create(followUpParams);
                finalContent = completion.choices().get(0).message().content().orElse("No content");
            } else {
                finalContent = message.content().orElse("No content");
            }

            // Display final response
            System.out.println("\n" + SEPARATOR);
            System.out.println("Final Response:");
            System.out.println(finalContent);
            System.out.println(SEPARATOR);

            // Display token usage
            completion.usage().ifPresent(usage -> {
                System.out.println("\nTotal Token Usage:");
                System.out.println("  Input:  " + usage.promptTokens());
                System.out.println("  Output: " + usage.completionTokens());
                System.out.println("  Total:  " + usage.totalTokens());
            });

            // Set output on workflow span
            workflowSpan.setAttribute(AttributeKey.stringKey("gen_ai.completion"), finalContent);
            workflowSpan.setStatus(StatusCode.OK);

        } catch (Exception e) {
            System.err.println("\n✗ Error during API call: " + e.getMessage());
            e.printStackTrace();
            workflowSpan.recordException(e);
            workflowSpan.setStatus(StatusCode.ERROR);
        } finally {
            workflowSpan.end();
        }

        // Close the client
        client.close();

        // Flush traces to ensure they're sent to LangSmith
        System.out.println("\n" + SEPARATOR);
        System.out.println("Flushing traces to LangSmith...");
        boolean flushed = OpenTelemetryConfig.flush(10, java.util.concurrent.TimeUnit.SECONDS);

        if (flushed) {
            System.out.println("✓ Traces sent successfully!");
            System.out.println("\nView your traces at:");
            System.out.println("  https://smith.langchain.com/projects/" + projectName);
        } else {
            System.err.println("✗ Warning: Flush may not have completed successfully");
        }

        System.out.println(SEPARATOR);
        System.out.println("\nNote: Check the trace waterfall in LangSmith UI to see:");
        System.out.println("  - Parent workflow span (chain)");
        System.out.println("  - Child LLM spans (automatically created by wrapper)");
        System.out.println("  - Tool execution spans (created when tools are executed)");
    }

    /**
     * Simulates executing a tool based on its name and arguments.
     *
     * @param toolName the name of the tool to execute
     * @param arguments JSON string containing the tool arguments
     * @return JSON string containing the tool result
     */
    private static String executeTool(String toolName, String arguments) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode args = mapper.readTree(arguments);

            if ("get_weather".equals(toolName)) {
                String location = args.has("location") ? args.get("location").asText() : "unknown";

                // Simulate weather API call
                Map<String, Object> result = new HashMap<>();
                result.put("location", location);
                result.put("temperature", "18°C");
                result.put("condition", "Partly Cloudy");
                result.put("humidity", "65%");
                result.put("wind", "15 km/h");

                return mapper.writeValueAsString(result);
            } else {
                Map<String, Object> errorMap = new HashMap<>();
                errorMap.put("error", "Unknown tool: " + toolName);
                return mapper.writeValueAsString(errorMap);
            }
        } catch (Exception e) {
            return "{\"error\": \"" + e.getMessage() + "\"}";
        }
    }
}

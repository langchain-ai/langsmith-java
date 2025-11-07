package com.langchain.smith.wrappers.openai.examples;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.langchain.smith.wrappers.openai.OpenAIWrappers;
import com.langchain.smith.wrappers.openai.OpenTelemetryConfig;
import com.langchain.smith.wrappers.openai.WrappedOpenAIClient;
import com.openai.core.JsonValue;
import com.openai.models.ChatModel;
import com.openai.models.FunctionDefinition;
import com.openai.models.FunctionParameters;
import com.openai.models.chat.completions.ChatCompletion;
import com.openai.models.chat.completions.ChatCompletionCreateParams;
import com.openai.models.chat.completions.ChatCompletionFunctionTool;
import com.openai.models.chat.completions.ChatCompletionMessageFunctionToolCall;
import com.openai.models.chat.completions.ChatCompletionMessageToolCall;
import com.openai.models.chat.completions.ChatCompletionTool;
import com.openai.models.chat.completions.ChatCompletionToolChoiceOption;
import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Example demonstrating how to configure OpenTelemetry to send traces to
 * LangSmith.
 *
 * <p>
 * This example shows how to:
 * <ul>
 * <li>Configure OpenTelemetry to export traces to LangSmith</li>
 * <li>Use the wrapped OpenAI client with automatic tracing</li>
 * <li>Traces will appear in your LangSmith dashboard</li>
 * </ul>
 */
public class WithLangSmithExample {

    /**
     * Main method demonstrating LangSmith integration.
     *
     * <p>
     * Prerequisites:
     * <ol>
     * <li>Set OPENAI_API_KEY environment variable</li>
     * <li>Set LANGSMITH_API_KEY environment variable (your LangSmith API key)</li>
     * <li>Optionally set LANGSMITH_PROJECT environment variable</li>
     * <li>Optionally set LANGSMITH_OTLP_ENDPOINT environment variable to override
     * the default endpoint</li>
     * <li>Optionally set LANGSMITH_DEBUG=true environment variable for detailed
     * logging</li>
     * </ol>
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Configure OpenTelemetry for LangSmith with SimpleSpanProcessor for immediate
        // export
        // This ensures spans are sent immediately without buffering
        // To enable debug logging, set LANGSMITH_DEBUG=true environment variable
        System.out.println("Configuring OpenTelemetry for LangSmith...");
        try {
            String apiKey = System.getenv("LANGSMITH_API_KEY");
            if (apiKey == null || apiKey.isEmpty()) {
                throw new IllegalStateException("LANGSMITH_API_KEY environment variable is required");
            }
            String projectName = System.getenv("LANGSMITH_PROJECT");
            String serviceName = System.getenv("OTEL_SERVICE_NAME");
            String endpoint = System.getenv("LANGSMITH_OTLP_ENDPOINT");

            // Option 1: Use SimpleSpanProcessor for synchronous, immediate export
            // This ensures spans are sent immediately without buffering
            // SimpleSpanProcessor blocks on span.end() until export completes
            // This is the recommended configuration for examples and short-lived
            // applications
            OpenTelemetryConfig.configureForLangSmith(
                    apiKey, projectName, serviceName, endpoint, OpenTelemetryConfig.SpanProcessorType.SIMPLE, 1);
            System.out.println("✓ OpenTelemetry configured with SimpleSpanProcessor (immediate export)\n");

            // Option 2: Use BatchSpanProcessor with batch size = 1 for non-blocking
            // immediate export
            // Uncomment this line and comment the SimpleSpanProcessor configuration above
            // to test
            // This is non-blocking but still exports immediately due to batch size = 1
            // OpenTelemetryConfig.configureForLangSmith(apiKey, projectName, serviceName,
            // endpoint,
            // OpenTelemetryConfig.SpanProcessorType.BATCH, 1);
            // System.out.println("✓ OpenTelemetry configured with BatchSpanProcessor (batch
            // size = 1)\n");
        } catch (IllegalStateException e) {
            System.err.println("✗ Error configuring OpenTelemetry: " + e.getMessage());
            System.err.println("\nPlease set the following environment variables:");
            System.err.println("  - LANGSMITH_API_KEY (required)");
            System.err.println("  - LANGSMITH_PROJECT (optional)");
            return;
        }

        // Now use the wrapped client - all API calls will automatically create spans
        // that are sent to LangSmith
        WrappedOpenAIClient client = OpenAIWrappers.wrapFromEnv();

        // Create a chat completion request with tool definitions
        // This will trigger tool calls when the model needs to use the get_weather tool
        // Build function parameters as JSON schema
        Map<String, JsonValue> properties = new HashMap<>();
        Map<String, JsonValue> locationProperty = new HashMap<>();
        locationProperty.put("type", JsonValue.from("string"));
        locationProperty.put(
                "description", JsonValue.from("The location to get weather for, e.g., 'Paris arrondissement 9'"));
        properties.put("location", JsonValue.from(locationProperty));

        Map<String, JsonValue> parametersJson = new HashMap<>();
        parametersJson.put("type", JsonValue.from("object"));
        parametersJson.put("properties", JsonValue.from(properties));
        parametersJson.put("required", JsonValue.from(Arrays.asList("location")));

        ChatCompletionCreateParams params = ChatCompletionCreateParams.builder()
                .model(ChatModel.GPT_4O_MINI)
                .addUserMessage("What is the capital of France and what was the temperature there today?")
                .tools(Arrays.asList(ChatCompletionTool.ofFunction(ChatCompletionFunctionTool.builder()
                        .function(FunctionDefinition.builder()
                                .name("get_weather")
                                .description("Get the current weather for a given location")
                                .parameters(FunctionParameters.builder()
                                        .putAllAdditionalProperties(parametersJson)
                                        .build())
                                .build())
                        .build())))
                .toolChoice(ChatCompletionToolChoiceOption.Companion.ofAuto(ChatCompletionToolChoiceOption.Auto.AUTO))
                .build();

        // Create a parent span (chain/workflow) that wraps the entire operation
        OpenTelemetry openTelemetry = io.opentelemetry.api.GlobalOpenTelemetry.get();
        Tracer tracer = openTelemetry.getTracer("langsmith-java-otel-wrappers");

        Span parentSpan = tracer.spanBuilder("with_langsmith_example_workflow")
                .setSpanKind(SpanKind.INTERNAL)
                .setAttribute("gen_ai.operation.name", "chat_completion_workflow")
                .setAttribute("langsmith.span.kind", "chain")
                .setAttribute("langsmith.trace.name", "with_langsmith_example_workflow")
                .startSpan();

        try (Scope parentScope = parentSpan.makeCurrent()) {
            System.out.println("\n" + repeatString("=", 60));
            System.out.println("Workflow: Chat Completion with Tool Call");
            System.out.println(repeatString("=", 60));
            System.out.println("Parent Span ID: " + parentSpan.getSpanContext().getSpanId());
            System.out.println("Parent Trace ID: " + parentSpan.getSpanContext().getTraceId());

            // Execute the request - this will automatically create an OpenTelemetry span
            // that gets sent to LangSmith (as a child of the parent span)
            System.out.println("\nSending chat completion request (traces will be sent to LangSmith)...");
            ChatCompletion completion = client.chat().completions().create(params);

            // Check if the response contains tool calls
            com.openai.models.chat.completions.ChatCompletionMessage message =
                    completion.choices().get(0).message();
            java.util.Optional<java.util.List<ChatCompletionMessageToolCall>> toolCallsOpt = message.toolCalls();

            if (toolCallsOpt.isPresent() && !toolCallsOpt.get().isEmpty()) {
                System.out.println("\n--- Tool calls detected, executing tools ---");
                java.util.List<ChatCompletionMessageToolCall> toolCalls = toolCallsOpt.get();

                // Build messages list for follow-up request
                List<com.openai.models.chat.completions.ChatCompletionMessageParam> messages = new ArrayList<>();

                // Add original user message
                messages.add(params.messages().get(0));

                // Add assistant message with tool calls
                messages.add(com.openai.models.chat.completions.ChatCompletionMessageParam.ofAssistant(
                        com.openai.models.chat.completions.ChatCompletionAssistantMessageParam.builder()
                                .content(message.content().orElse(""))
                                .toolCalls(toolCalls)
                                .build()));

                // Execute each tool call and add results
                for (ChatCompletionMessageToolCall toolCall : toolCalls) {
                    if (toolCall.isFunction()) {
                        ChatCompletionMessageFunctionToolCall functionToolCall = toolCall.asFunction();
                        String toolName = functionToolCall.function().name();
                        String toolArguments = functionToolCall.function().arguments();

                        System.out.println("Executing tool: " + toolName + " with arguments: " + toolArguments);

                        // Execute the tool
                        String toolResult = executeTool(toolName, toolArguments);

                        System.out.println("Tool result: " + toolResult);

                        // Add tool result message
                        messages.add(com.openai.models.chat.completions.ChatCompletionMessageParam.ofTool(
                                com.openai.models.chat.completions.ChatCompletionToolMessageParam.builder()
                                        .toolCallId(functionToolCall.id())
                                        .content(toolResult)
                                        .build()));
                    }
                }

                // Send follow-up request with tool results
                System.out.println("\nSending follow-up request with tool results...");
                ChatCompletionCreateParams followUpParams = ChatCompletionCreateParams.builder()
                        .model(ChatModel.GPT_4O_MINI)
                        .messages(messages)
                        .tools(params.tools().orElse(null))
                        .build();

                completion = client.chat().completions().create(followUpParams);
            }

            // Display the result
            String content = completion.choices().get(0).message().content().orElse("No content");
            System.out.println("\nFinal Response: " + content);

            // Usage information
            completion.usage().ifPresent(usage -> {
                System.out.println("\nToken usage:");
                System.out.println("  Input tokens: " + usage.promptTokens());
                System.out.println("  Output tokens: " + usage.completionTokens());
                System.out.println("  Total tokens: " + usage.totalTokens());
            });

            // Note: Tool call spans are automatically created by WrappedChatService
            // when tool calls are detected in the response. No manual span creation needed!

            System.out.println("\n✓ Workflow completed successfully");
            System.out.println("  - Parent span: workflow (chain)");
            System.out.println("  - Child span: Chat completion (LLM) - automatically created by WrappedChatService");
            System.out.println("  - Tool call spans: Automatically created if tool calls are present in the response");
        } catch (Exception e) {
            parentSpan.recordException(e);
            parentSpan.setAttribute("error", true);
            System.err.println("✗ Error in workflow: " + e.getMessage());
            e.printStackTrace();
        } finally {
            parentSpan.end();
            System.out.println("\n✓ Parent span ended");
        }

        // Close the client when done
        client.close();

        // Force flush to ensure all spans are exported
        System.out.println("\n" + repeatString("=", 60));
        boolean flushed = OpenTelemetryConfig.flush(10, java.util.concurrent.TimeUnit.SECONDS);
        if (!flushed) {
            System.err.println("✗ Warning: Flush did not complete successfully");
            System.err.println("  Some spans may not have been exported to LangSmith");
        } else {
            System.out.println("✓ Spans flushed successfully");
        }

        System.out.println("\n✓ Check your LangSmith dashboard to see the traces!");
        System.out.println("  Endpoint: "
                + (System.getenv("LANGSMITH_OTLP_ENDPOINT") != null
                        ? System.getenv("LANGSMITH_OTLP_ENDPOINT")
                        : OpenTelemetryConfig.LANGSMITH_OTLP_ENDPOINT));
    }

    /**
     * Repeats a string a given number of times (Java 8 compatible replacement for
     * String.repeat()).
     *
     * @param str   the string to repeat
     * @param count the number of times to repeat
     * @return the repeated string
     */
    private static String repeatString(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    /**
     * Executes a tool based on its name and arguments.
     *
     * @param toolName  the name of the tool to execute
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
                // In a real implementation, this would call an actual weather API
                Map<String, Object> result = new HashMap<>();
                result.put("location", location);
                result.put("temperature", "15°C");
                result.put("condition", "Sunny");
                result.put("humidity", "65%");

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

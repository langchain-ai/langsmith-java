package com.langchain.smith.wrappers.openai.examples;

import com.langchain.smith.wrappers.openai.OpenTelemetryConfig;
import com.openai.client.OpenAIClient;
import com.openai.client.okhttp.OpenAIOkHttpClient;
import com.openai.models.ChatModel;
import com.openai.models.chat.completions.ChatCompletion;
import com.openai.models.chat.completions.ChatCompletionCreateParams;
import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Scope;

/**
 * Example demonstrating manual OpenTelemetry span creation for LangSmith
 * tracing.
 *
 * <p>
 * This example shows how to manually create spans with proper gen_ai attributes
 * that will be correctly interpreted by LangSmith. It demonstrates:
 * <ul>
 * <li>Single span LLM invocation wrapped in a manually created span</li>
 * <li>Nested spans with parent-child relationships (root with two
 * children)</li>
 * </ul>
 *
 * <p>
 * The spans created here follow the LangSmith OTEL conventions documented in
 * LANGSMITH_OTEL.md, ensuring proper mapping to LangSmith runs.
 */
public class ManualSpansExample {

    private static final String INSTRUMENTATION_NAME = "langsmith-java-otel-wrappers";

    /**
     * Main method demonstrating manual span creation.
     *
     * <p>
     * Prerequisites:
     * <ol>
     * <li>Set OPENAI_API_KEY environment variable</li>
     * <li>Set LANGSMITH_API_KEY environment variable (your LangSmith API key)</li>
     * <li>Optionally set LANGSMITH_PROJECT environment variable</li>
     * </ol>
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Configure OpenTelemetry for LangSmith with batch size 1 for immediate export
        // This eliminates the need for sleep delays before flush
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
            OpenTelemetryConfig.configureForLangSmith(
                    apiKey, projectName, serviceName, endpoint, OpenTelemetryConfig.SpanProcessorType.SIMPLE, 1);
            System.out.println("✓ OpenTelemetry configured with SimpleSpanProcessor (immediate export)\n");

            // Option 2: Use BatchSpanProcessor with batch size = 1 for non-blocking
            // immediate export
            // Uncomment this line and comment Option 1 above to test BatchSpanProcessor
            // This is non-blocking but still exports immediately due to batch size = 1
            // OpenTelemetryConfig.configureForLangSmith(apiKey, projectName, serviceName,
            // endpoint,
            // OpenTelemetryConfig.SpanProcessorType.BATCH, 1);
            // System.out.println("✓ OpenTelemetry configured with BatchSpanProcessor
            // (batch size = 1)\n");
        } catch (IllegalStateException e) {
            System.err.println("✗ Error configuring OpenTelemetry: " + e.getMessage());
            System.err.println("\nPlease set the following environment variables:");
            System.err.println("  - LANGSMITH_API_KEY (required)");
            System.err.println("  - LANGSMITH_PROJECT (optional)");
            return;
        }

        // Get OpenAI API key
        String openaiApiKey = System.getenv("OPENAI_API_KEY");
        if (openaiApiKey == null || openaiApiKey.isEmpty()) {
            System.err.println("✗ OPENAI_API_KEY environment variable is required");
            return;
        }

        // Create OpenAI client (not wrapped - we'll create spans manually)
        OpenAIClient client = OpenAIOkHttpClient.builder().apiKey(openaiApiKey).build();

        try {
            // Example 1: Single span LLM invocation
            System.out.println(repeatString("=", 60));
            System.out.println("Example 1: Single Span LLM Invocation");
            System.out.println(repeatString("=", 60));
            exampleSingleSpan(client);

            // Example 2: Nested spans (root with two children)
            System.out.println("\n" + repeatString("=", 60));
            System.out.println("Example 2: Nested Spans (Root with Two Children)");
            System.out.println(repeatString("=", 60));
            exampleNestedSpans(client);

        } catch (Exception e) {
            System.err.println("✗ Error during execution: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Close the client
            client.close();

            System.out.println("\n" + repeatString("=", 60));
            boolean flushed = OpenTelemetryConfig.flush(10, java.util.concurrent.TimeUnit.SECONDS);
            if (!flushed) {
                System.err.println("✗ Warning: Flush did not complete successfully");
                System.err.println("  Some spans may not have been exported to LangSmith");
            } else {
                System.out.println("✓ Spans flushed successfully");
            }

            System.out.println("\n✓ Check your LangSmith dashboard to see the traces!");
        }
    }

    /**
     * Example 1: Single span LLM invocation.
     *
     * <p>
     * Creates a single span wrapping an OpenAI chat completion call with all
     * required gen_ai attributes according to LangSmith conventions.
     */
    private static void exampleSingleSpan(OpenAIClient client) {
        OpenTelemetry openTelemetry = io.opentelemetry.api.GlobalOpenTelemetry.get();
        Tracer tracer = openTelemetry.getTracer(INSTRUMENTATION_NAME);

        // Create span builder for LLM operation
        Span span = tracer.spanBuilder("chat gpt-4o-mini")
                .setSpanKind(SpanKind.CLIENT)
                .startSpan();

        try (Scope scope = span.makeCurrent()) {
            // Set core gen_ai attributes for LLM type detection
            span.setAttribute("gen_ai.system", "openai");
            span.setAttribute("gen_ai.operation.name", "chat");
            span.setAttribute("gen_ai.provider.name", "openai");

            // Create chat completion request
            String userMessage = "What is the capital of France?";
            ChatCompletionCreateParams params = ChatCompletionCreateParams.builder()
                    .model(ChatModel.GPT_4O_MINI)
                    .addUserMessage(userMessage)
                    .temperature(0.7)
                    .build();

            // Set request attributes
            span.setAttribute("gen_ai.request.model", "gpt-4o-mini");
            span.setAttribute("gen_ai.request.temperature", 0.7);

            // Set input messages as JSON array (following LangSmith format)
            String inputMessagesJson =
                    String.format("[{\"role\":\"user\",\"content\":\"%s\"}]", escapeJsonString(userMessage));
            span.setAttribute("gen_ai.input.messages", inputMessagesJson);

            System.out.println("Making OpenAI API call...");
            // Make the actual API call
            ChatCompletion completion = client.chat().completions().create(params);

            // Extract response data
            String assistantContent =
                    completion.choices().get(0).message().content().orElse("No content");
            String finishReason = completion.choices().get(0).finishReason() != null
                    ? completion.choices().get(0).finishReason().toString()
                    : "stop";

            // Set response attributes
            String responseModel = completion.model().toString();
            span.setAttribute("gen_ai.response.model", responseModel);
            span.setAttribute("gen_ai.response.finish_reason", finishReason);

            // Set output messages as JSON array
            String outputMessagesJson =
                    String.format("[{\"role\":\"assistant\",\"content\":\"%s\"}]", escapeJsonString(assistantContent));
            span.setAttribute("gen_ai.output.messages", outputMessagesJson);

            // Set token usage attributes
            completion.usage().ifPresent(usage -> {
                span.setAttribute("gen_ai.usage.input_tokens", (long) usage.promptTokens());
                span.setAttribute("gen_ai.usage.output_tokens", (long) usage.completionTokens());
                span.setAttribute("gen_ai.usage.total_tokens", (long) usage.totalTokens());
            });

            System.out.println("Response: " + assistantContent);
            completion.usage().ifPresent(usage -> {
                System.out.println("Tokens - Input: " + usage.promptTokens()
                        + ", Output: " + usage.completionTokens()
                        + ", Total: " + usage.totalTokens());
            });

            System.out.println("✓ Single span created successfully");

        } catch (Exception e) {
            // Record exception on span
            span.recordException(e);
            span.setAttribute("error", true);
            throw e;
        } finally {
            span.end();
        }
    }

    /**
     * Example 2: Nested spans (root with two children).
     *
     * <p>
     * Creates a root span representing a workflow/chain, with two child spans
     * representing individual LLM calls. This demonstrates parent-child
     * relationships in LangSmith.
     */
    private static void exampleNestedSpans(OpenAIClient client) {

        OpenTelemetry openTelemetry = io.opentelemetry.api.GlobalOpenTelemetry.get();
        Tracer tracer = openTelemetry.getTracer(INSTRUMENTATION_NAME);

        // Create root span (chain/workflow)
        Span rootSpan = tracer.spanBuilder("nested_spans_chain")
                .setSpanKind(SpanKind.INTERNAL)
                .setAttribute("gen_ai.operation.name", "nested_spans")
                .setAttribute("langsmith.span.kind", "chain")
                .setAttribute("langsmith.trace.name", "nested_spans_chain_" + System.currentTimeMillis())
                .startSpan();

        try (Scope rootScope = rootSpan.makeCurrent()) {
            // Set attributes for root span (chain type)

            System.out.println("Creating root span: nested_spans_chain");
            System.out.println("Root Span ID: " + rootSpan.getSpanContext().getSpanId());
            System.out.println("Root Trace ID: " + rootSpan.getSpanContext().getTraceId());

            // Child span 1: First LLM call
            System.out.println("\n--- Child Span 1: First Query ---");
            Span childSpan1 = tracer.spanBuilder("chat gpt-4o-mini (step 1)")
                    .setSpanKind(SpanKind.CLIENT)
                    .setAttribute("gen_ai.operation.name", "chat")
                    .setAttribute("langsmith.span.kind", "llm")
                    .setAttribute("langsmith.trace.name", "First LLM Call")
                    .startSpan();

            try (Scope childScope1 = childSpan1.makeCurrent()) {
                // Set LLM attributes for child span 1
                childSpan1.setAttribute("gen_ai.system", "openai");
                childSpan1.setAttribute("gen_ai.operation.name", "chat");
                childSpan1.setAttribute("gen_ai.provider.name", "openai");
                childSpan1.setAttribute("gen_ai.request.model", "gpt-4o-mini");
                childSpan1.setAttribute("gen_ai.request.temperature", 0.7);

                String query1 = "What is the capital of France?";
                ChatCompletionCreateParams params1 = ChatCompletionCreateParams.builder()
                        .model(ChatModel.GPT_4O_MINI)
                        .addUserMessage(query1)
                        .temperature(0.7)
                        .build();

                String inputMessages1 =
                        String.format("[{\"role\":\"user\",\"content\":\"%s\"}]", escapeJsonString(query1));
                childSpan1.setAttribute("gen_ai.input.messages", inputMessages1);

                ChatCompletion completion1 = client.chat().completions().create(params1);
                String response1 =
                        completion1.choices().get(0).message().content().orElse("No content");

                childSpan1.setAttribute(
                        "gen_ai.response.model", completion1.model().toString());
                String outputMessages1 =
                        String.format("[{\"role\":\"assistant\",\"content\":\"%s\"}]", escapeJsonString(response1));
                childSpan1.setAttribute("gen_ai.output.messages", outputMessages1);

                completion1.usage().ifPresent(usage -> {
                    childSpan1.setAttribute("gen_ai.usage.input_tokens", (long) usage.promptTokens());
                    childSpan1.setAttribute("gen_ai.usage.output_tokens", (long) usage.completionTokens());
                    childSpan1.setAttribute("gen_ai.usage.total_tokens", (long) usage.totalTokens());
                });

                System.out.println("Query 1: " + query1);
                System.out.println("Response 1: " + response1);
                System.out.println(
                        "Child Span 1 ID: " + childSpan1.getSpanContext().getSpanId());
                System.out.println(
                        "Child Span 1 Parent: " + rootSpan.getSpanContext().getSpanId());
            } catch (Exception e) {
                childSpan1.recordException(e);
                childSpan1.setAttribute("error", true);
                throw e;
            } finally {
                childSpan1.end();
            }

            // Child span 2: Second LLM call
            System.out.println("\n--- Child Span 2: Follow-up Query ---");
            Span childSpan2 = tracer.spanBuilder("chat gpt-4o-mini (step 2)")
                    .setSpanKind(SpanKind.CLIENT)
                    .setAttribute("gen_ai.operation.name", "chat")
                    .setAttribute("langsmith.span.kind", "llm")
                    .setAttribute("langsmith.trace.name", "Second LLM Call")
                    .startSpan();

            try (Scope childScope2 = childSpan2.makeCurrent()) {
                // Set LLM attributes for child span 2
                childSpan2.setAttribute("gen_ai.system", "openai");
                childSpan2.setAttribute("gen_ai.operation.name", "chat");
                childSpan2.setAttribute("gen_ai.provider.name", "openai");
                childSpan2.setAttribute("gen_ai.request.model", "gpt-4o-mini");
                childSpan2.setAttribute("gen_ai.request.temperature", 0.7);

                String query2 = "What is the population of that city?";
                ChatCompletionCreateParams params2 = ChatCompletionCreateParams.builder()
                        .model(ChatModel.GPT_4O_MINI)
                        .addUserMessage(query2)
                        .temperature(0.7)
                        .build();

                String inputMessages2 =
                        String.format("[{\"role\":\"user\",\"content\":\"%s\"}]", escapeJsonString(query2));
                childSpan2.setAttribute("gen_ai.input.messages", inputMessages2);

                ChatCompletion completion2 = client.chat().completions().create(params2);
                String response2 =
                        completion2.choices().get(0).message().content().orElse("No content");

                childSpan2.setAttribute(
                        "gen_ai.response.model", completion2.model().toString());
                String outputMessages2 =
                        String.format("[{\"role\":\"assistant\",\"content\":\"%s\"}]", escapeJsonString(response2));
                childSpan2.setAttribute("gen_ai.output.messages", outputMessages2);

                completion2.usage().ifPresent(usage -> {
                    childSpan2.setAttribute("gen_ai.usage.input_tokens", (long) usage.promptTokens());
                    childSpan2.setAttribute("gen_ai.usage.output_tokens", (long) usage.completionTokens());
                    childSpan2.setAttribute("gen_ai.usage.total_tokens", (long) usage.totalTokens());
                });

                System.out.println("Query 2: " + query2);
                System.out.println("Response 2: " + response2);
                System.out.println(
                        "Child Span 2 ID: " + childSpan2.getSpanContext().getSpanId());
                System.out.println(
                        "Child Span 2 Parent: " + rootSpan.getSpanContext().getSpanId());

            } catch (Exception e) {
                childSpan2.recordException(e);
                childSpan2.setAttribute("error", true);
                throw e;
            } finally {
                childSpan2.end();
            }

            // Child span 3: Tool call
            System.out.println("\n--- Child Span 3: Tool call ---");
            Span childSpan3 = tracer.spanBuilder("tool_call")
                    .setSpanKind(SpanKind.CLIENT)
                    .setAttribute("gen_ai.operation.name", "tool_call")
                    .setAttribute("langsmith.span.kind", "tool")
                    .setAttribute("langsmith.trace.name", "Tool Call")
                    .startSpan();

            try (Scope childScope3 = childSpan3.makeCurrent()) {
                // Set tool call attributes for child span 3
                childSpan3.setAttribute("gen_ai.system", "openai");
                childSpan3.setAttribute("gen_ai.operation.name", "tool_call");
                childSpan3.setAttribute("gen_ai.provider.name", "openai");
                childSpan3.setAttribute("gen_ai.request.model", "gpt-4o-mini");
                childSpan3.setAttribute("gen_ai.request.temperature", 0.7);

                String toolName = "get_weather";
                String toolDescription = "Get the weather for a given city";
                String toolArguments = "{\"city\":\"Paris\"}";

                childSpan3.setAttribute("gen_ai.tool.name", toolName);
                childSpan3.setAttribute("gen_ai.tool.description", toolDescription);
                childSpan3.setAttribute("gen_ai.tool.arguments", toolArguments);

                System.out.println("Tool Name: " + toolName);
                System.out.println("Tool Description: " + toolDescription);
                System.out.println("Tool Arguments: " + toolArguments);
                System.out.println(
                        "Child Span 3 ID: " + childSpan3.getSpanContext().getSpanId());
                System.out.println(
                        "Child Span 3 Parent: " + rootSpan.getSpanContext().getSpanId());
            } catch (Exception e) {
                childSpan3.recordException(e);
                childSpan3.setAttribute("error", true);
                throw e;
            } finally {
                childSpan3.end();
            }

            System.out.println("\n✓ Nested spans created successfully");
            System.out.println("  - Root span: multi-step-query (chain)");
            System.out.println("  - Child span 1: First LLM call");
            System.out.println("  - Child span 2: Second LLM call");
            System.out.println("\nAll spans ended, will be exported on flush...");

        } catch (Exception e) {
            rootSpan.recordException(e);
            rootSpan.setAttribute("error", true);
            throw e;
        } finally {
            rootSpan.end();
        }
    }

    /**
     * Repeats a string a given number of times (Java 8 compatible replacement for String.repeat()).
     *
     * @param str the string to repeat
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
     * Escapes a JSON string by replacing special characters.
     *
     * @param str the string to escape
     * @return the escaped string
     */
    private static String escapeJsonString(String str) {
        if (str == null) {
            return "";
        }
        return str.replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\n", "\\n")
                .replace("\r", "\\r")
                .replace("\t", "\\t");
    }
}

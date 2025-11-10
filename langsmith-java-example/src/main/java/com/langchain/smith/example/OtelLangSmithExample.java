package com.langchain.smith.example;

import com.langchain.smith.otel.OtelConfig;
import com.langchain.smith.otel.OtelSpanCreator;
import com.langchain.smith.otel.OtelTraceExporter;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Scope;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Example: Send OpenTelemetry traces to LangSmith UI.
 *
 * This is a mock/demo example that simulates LLM calls without requiring API keys.
 * It demonstrates the tracing structure and waterfall visualization.
 *
 * Usage:
 *   export LANGSMITH_API_KEY=your_api_key
 *   ./gradlew :langsmith-java-example:run -Pexample=OtelLangSmith
 */
public class OtelLangSmithExample {
    public static void main(String[] args) throws Exception {
        System.out.println("=== LangSmith OpenTelemetry Example ===\n");

        // Get LangSmith API key
        String apiKey = System.getenv("LANGSMITH_API_KEY");
        if (apiKey == null || apiKey.isEmpty()) {
            apiKey = System.getProperty("langsmith.api.key");
        }
        if (apiKey == null || apiKey.isEmpty()) {
            System.err.println(
                    "ERROR: LANGSMITH_API_KEY environment variable or langsmith.api.key system property is required!");
            return;
        }

        String projectName = System.getenv("LANGSMITH_PROJECT");
        if (projectName == null || projectName.isEmpty()) {
            projectName = System.getProperty("langsmith.project.name", "default");
        }

        System.out.println("Configuration:");
        System.out.println("  Endpoint: https://api.smith.langchain.com/otel/v1/traces");
        System.out.println("  Project: " + projectName);
        System.out.println("  Service name: langsmith-java");
        System.out.println();

        // Configure the exporter for LangSmith
        Map<String, String> headers = new HashMap<>();
        headers.put("x-api-key", apiKey);
        headers.put("Langsmith-Project", projectName);

        OtelConfig config = OtelConfig.builder()
                .enabled(true)
                .endpoint("https://api.smith.langchain.com/otel/v1/traces")
                .headers(headers)
                .timeout(Duration.ofSeconds(30))
                .serviceName("langsmith-java")
                .build();

        OtelTraceExporter exporter = OtelTraceExporter.fromConfig(config);
        Tracer tracer = exporter.getTracer();

        // Create a session ID for grouping
        String sessionId = UUID.randomUUID().toString();

        System.out.println("Creating waterfall with 5 spans:");
        System.out.println("  1. agent.chain (root, 2s)");
        System.out.println("     ├─ 2. openai.llm (500ms)");
        System.out.println("     ├─ 3. weather.tool (300ms)");
        System.out.println("     └─ 4. openai.llm (600ms)");
        System.out.println("        └─ 5. database.retriever (200ms)\n");

        // ROOT SPAN: Main agent chain
        Span rootSpan = OtelSpanCreator.createChainSpan(tracer, "langsmith.java.exmaple", projectName, sessionId);

        try (Scope rootScope = rootSpan.makeCurrent()) {
            // CHILD 1: First LLM call
            Span llmSpan1 =
                    OtelSpanCreator.createLlmSpan(tracer, "openai.llm.call", "openai", "gpt-4", projectName, sessionId);
            try (Scope llmScope1 = llmSpan1.makeCurrent()) {
                OtelSpanCreator.setInput(llmSpan1, "What's the weather in San Francisco?");
                Thread.sleep(500);
                OtelSpanCreator.setOutput(llmSpan1, "Let me check the weather for you.");
                OtelSpanCreator.setTokenUsage(llmSpan1, 15, 12);
                llmSpan1.setStatus(StatusCode.OK);
            } finally {
                llmSpan1.end();
            }

            // CHILD 2: Tool call
            Span toolSpan =
                    OtelSpanCreator.createToolSpan(tracer, "weather.tool", "get_weather", projectName, sessionId);
            try (Scope toolScope = toolSpan.makeCurrent()) {
                toolSpan.setAttribute(AttributeKey.stringKey("tool.input"), "{\"location\":\"San Francisco\"}");
                Thread.sleep(300);
                toolSpan.setStatus(StatusCode.OK);
            } finally {
                toolSpan.end();
            }

            // CHILD 3: Second LLM call with nested retriever
            Span llmSpan2 = OtelSpanCreator.createLlmSpan(
                    tracer, "openai.llm.final", "openai", "gpt-4", projectName, sessionId);
            try (Scope llmScope2 = llmSpan2.makeCurrent()) {
                OtelSpanCreator.setInput(llmSpan2, "Based on the weather data, provide a summary.");

                // NESTED CHILD: Retriever call inside LLM
                Span retrieverSpan =
                        OtelSpanCreator.createRetrievalSpan(tracer, "database.retriever", projectName, sessionId);
                try (Scope retrieverScope = retrieverSpan.makeCurrent()) {
                    OtelSpanCreator.setInput(retrieverSpan, "weather forecast data");
                    Thread.sleep(200);
                    OtelSpanCreator.setOutput(retrieverSpan, "Temperature: 72F, Sunny");
                    retrieverSpan.setStatus(StatusCode.OK);
                } finally {
                    retrieverSpan.end();
                }

                Thread.sleep(400);
                OtelSpanCreator.setOutput(
                        llmSpan2, "The weather in San Francisco is sunny with a temperature of 72°F.");
                OtelSpanCreator.setTokenUsage(llmSpan2, 25, 18);
                llmSpan2.setStatus(StatusCode.OK);
            } finally {
                llmSpan2.end();
            }

            rootSpan.setStatus(StatusCode.OK);

        } finally {
            rootSpan.end();
        }

        System.out.println("\nAll spans ended. Flushing to LangSmith...");

        // Force flush to send the span immediately
        exporter.flush().join(10, java.util.concurrent.TimeUnit.SECONDS);

        // Wait for batch to be sent
        Thread.sleep(6000);
        exporter.shutdown().join(5, java.util.concurrent.TimeUnit.SECONDS);
    }
}

package com.langchain.smith.example.otel;

import com.langchain.smith.otel.OtelSpanCreator;
import com.langchain.smith.otel.OtelTraceExporter;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Scope;
import java.time.Duration;

/**
 * Example: Send live OpenTelemetry traces to Jaeger.
 *
 * Start Jaeger: docker run -d --name jaeger -p 16686:16686 -p 4318:4318 jaegertracing/all-in-one:latest
 * Run: ./gradlew :langsmith-java-example:run -Pexample=OtelJaegerExample
 * View: http://localhost:16686
 */
public class OtelJaegerExample {
    public static void main(String[] args) throws Exception {
        System.out.println("=== LangSmith to Jaeger Example ===\n");

        OtelTraceExporter exporter = OtelTraceExporter.builder()
                .endpoint("http://localhost:4318/v1/traces")
                .enabled(true)
                .timeout(Duration.ofSeconds(10))
                .serviceName("langsmith-java-example")
                .build();

        Tracer tracer = exporter.getTracer();
        String projectName = exporter.getProjectName();

        System.out.println("Creating waterfall trace with 5 spans...\n");

        // ROOT SPAN: Main chain
        Span rootSpan = OtelSpanCreator.createChainSpan(tracer, "langchain.chain", projectName, null);
        try (Scope rootScope = rootSpan.makeCurrent()) {
            System.out.println("→ Root span: langchain.chain started");

            // CHILD 1: First LLM call
            Span llmSpan1 = OtelSpanCreator.createLlmSpan(tracer, "openai.chat", "openai", "gpt-4", projectName, null);
            try (Scope scope = llmSpan1.makeCurrent()) {
                OtelSpanCreator.setInput(llmSpan1, "What's the weather?");

                System.out.println("  → Child span 1: openai.chat started");
                Thread.sleep(500);

                OtelSpanCreator.setOutput(llmSpan1, "I'll check the weather for you.");
                OtelSpanCreator.setTokenUsage(llmSpan1, 10, 8);
                llmSpan1.setStatus(StatusCode.OK);
                System.out.println("  ← Child span 1: openai.chat completed");
            } finally {
                llmSpan1.end();
            }

            // CHILD 2: Tool call
            Span toolSpan = OtelSpanCreator.createToolSpan(tracer, "weather.tool", "get_weather", projectName, null);
            try (Scope scope = toolSpan.makeCurrent()) {

                System.out.println("  → Child span 2: weather.tool started");
                Thread.sleep(300);
                toolSpan.setStatus(StatusCode.OK);
                System.out.println("  ← Child span 2: weather.tool completed");
            } finally {
                toolSpan.end();
            }

            // CHILD 3: Second LLM call with nested database query
            Span llmSpan2 = OtelSpanCreator.createLlmSpan(tracer, "openai.chat", "openai", "gpt-4", projectName, null);
            try (Scope scope2 = llmSpan2.makeCurrent()) {
                OtelSpanCreator.setInput(llmSpan2, "Provide a detailed weather summary.");

                System.out.println("  → Child span 3: openai.chat started");

                // NESTED CHILD: Database query
                Span dbSpan =
                        OtelSpanCreator.createToolSpan(tracer, "database.query", "postgresql_query", projectName, null);
                try (Scope dbScope = dbSpan.makeCurrent()) {
                    dbSpan.setAttribute(AttributeKey.stringKey("db.system"), "postgresql");
                    OtelSpanCreator.setInput(dbSpan, "SELECT * FROM weather_data WHERE city='SF'");

                    System.out.println("    → Nested span: database.query started");
                    Thread.sleep(200);

                    // Simulate error
                    dbSpan.setStatus(StatusCode.ERROR, "Connection timeout");
                    dbSpan.setAttribute(AttributeKey.booleanKey("error"), true);
                    dbSpan.setAttribute(AttributeKey.stringKey("error.type"), "timeout");

                    System.out.println("    ← Nested span: database.query failed");
                } finally {
                    dbSpan.end();
                }

                Thread.sleep(400);
                OtelSpanCreator.setOutput(llmSpan2, "Unable to retrieve detailed data due to database error.");
                OtelSpanCreator.setTokenUsage(llmSpan2, 20, 15);
                llmSpan2.setStatus(StatusCode.OK);
                System.out.println("  ← Child span 3: openai.chat completed");
            } finally {
                llmSpan2.end();
            }

            rootSpan.setStatus(StatusCode.OK);
            System.out.println("← Root span: langchain.chain completed");
        } finally {
            rootSpan.end();
        }

        System.out.println("\nFlushing to Jaeger...");
        exporter.flush().join(10, java.util.concurrent.TimeUnit.SECONDS);
        Thread.sleep(6000);
        exporter.shutdown().join(5, java.util.concurrent.TimeUnit.SECONDS);

        System.out.println("\n✓ Complete! View at: http://localhost:16686");
    }
}

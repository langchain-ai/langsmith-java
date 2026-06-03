package com.langchain.smith.example.otel

import com.langchain.smith.otel.OtelConfig
import com.langchain.smith.otel.OtelSpanCreator
import com.langchain.smith.otel.OtelTraceExporter
import io.opentelemetry.api.common.AttributeKey
import io.opentelemetry.api.trace.Span
import io.opentelemetry.api.trace.StatusCode
import io.opentelemetry.api.trace.Tracer
import io.opentelemetry.context.Scope
import java.time.Duration
import java.util.UUID
import java.util.concurrent.TimeUnit
import kotlin.system.exitProcess

/**
 * Example: Send OpenTelemetry traces to LangSmith UI.
 *
 * Mock/demo example that simulates LLM calls without requiring API keys.
 * Demonstrates the tracing structure and waterfall visualization.
 *
 * Usage:
 *   export LANGSMITH_API_KEY=your_api_key
 *   ./gradlew :langsmith-java-example:run -Pexample=OtelLangSmith
 */
fun main() {
    println("=== LangSmith OpenTelemetry Example ===\n")

    var apiKey = System.getenv("LANGSMITH_API_KEY")
    if (apiKey.isNullOrEmpty()) {
        apiKey = System.getProperty("langsmith.api.key")
    }
    if (apiKey.isNullOrEmpty()) {
        System.err.println(
            "ERROR: LANGSMITH_API_KEY environment variable or langsmith.api.key system property is required!"
        )
        exitProcess(1)
    }

    var projectName = System.getenv("LANGSMITH_PROJECT")
    if (projectName.isNullOrEmpty()) {
        projectName = System.getProperty("langsmith.project.name", "default")
    }

    println("Configuration:")
    println("  Endpoint: https://api.smith.langchain.com/otel/v1/traces")
    println("  Project: $projectName")
    println("  Service name: langsmith-kotlin")
    println()

    val headers = mapOf(
        "x-api-key" to apiKey,
        "Langsmith-Project" to projectName
    )

    val config = OtelConfig.builder()
        .enabled(true)
        .endpoint("https://api.smith.langchain.com/otel/v1/traces")
        .headers(headers)
        .timeout(Duration.ofSeconds(30))
        .serviceName("langsmith-kotlin")
        .build()

    val exporter = OtelTraceExporter.fromConfig(config)
    val tracer = exporter.tracer
    val sessionId = UUID.randomUUID().toString()

    println("Creating waterfall with 5 spans:")
    println("  1. agent.chain (root, 2s)")
    println("     ├─ 2. openai.llm (500ms)")
    println("     ├─ 3. weather.tool (300ms)")
    println("     └─ 4. openai.llm (600ms)")
    println("        └─ 5. database.retriever (200ms)\n")

    val initialPrompt = "What's the weather in San Francisco?"
    val rootSpan = OtelSpanCreator.createChainSpan(tracer, "langsmith.kotlin.example", projectName, sessionId)

    try {
        rootSpan.makeCurrent().use {
            OtelSpanCreator.setInput(rootSpan, initialPrompt)

            val llmSpan1 = OtelSpanCreator.createLlmSpan(
                tracer, "openai.llm.call", "openai", "gpt-4", projectName, sessionId
            )
            try {
                llmSpan1.makeCurrent().use {
                    OtelSpanCreator.setInput(llmSpan1, "What's the weather in San Francisco?")
                    Thread.sleep(500)
                    OtelSpanCreator.setOutput(llmSpan1, "Let me check the weather for you.")
                    OtelSpanCreator.setTokenUsage(llmSpan1, 15, 12)
                    llmSpan1.setStatus(StatusCode.OK)
                }
            } finally {
                llmSpan1.end()
            }

            val toolInput = "{\"location\":\"San Francisco\"}"
            val toolOutput = "{\"temperature\":\"72°F\",\"condition\":\"Sunny\",\"humidity\":\"65%\"}"
            val toolSpan = OtelSpanCreator.createToolSpan(
                tracer, "weather.tool", "get_weather", projectName, sessionId
            )
            try {
                toolSpan.makeCurrent().use {
                    OtelSpanCreator.setInput(toolSpan, toolInput)
                    toolSpan.setAttribute(AttributeKey.stringKey("gen_ai.tool.arguments"), toolInput)
                    Thread.sleep(300)
                    OtelSpanCreator.setOutput(toolSpan, toolOutput)
                    toolSpan.setStatus(StatusCode.OK)
                }
            } finally {
                toolSpan.end()
            }

            val llmSpan2 = OtelSpanCreator.createLlmSpan(
                tracer, "openai.llm.final", "openai", "gpt-4", projectName, sessionId
            )
            try {
                llmSpan2.makeCurrent().use {
                    OtelSpanCreator.setInput(llmSpan2, "Based on the weather data, provide a summary.")

                    val retrieverSpan = OtelSpanCreator.createRetrievalSpan(
                        tracer, "database.retriever", projectName, sessionId
                    )
                    try {
                        retrieverSpan.makeCurrent().use {
                            OtelSpanCreator.setInput(retrieverSpan, "weather forecast data")
                            Thread.sleep(200)
                            OtelSpanCreator.setOutput(retrieverSpan, "Temperature: 72F, Sunny")
                            retrieverSpan.setStatus(StatusCode.OK)
                        }
                    } finally {
                        retrieverSpan.end()
                    }

                    Thread.sleep(400)
                    OtelSpanCreator.setOutput(
                        llmSpan2,
                        "The weather in San Francisco is sunny with a temperature of 72°F."
                    )
                    OtelSpanCreator.setTokenUsage(llmSpan2, 25, 18)
                    llmSpan2.setStatus(StatusCode.OK)
                }
            } finally {
                llmSpan2.end()
            }

            val finalOutput = "The weather in San Francisco is sunny with a temperature of 72°F."
            OtelSpanCreator.setOutput(rootSpan, finalOutput)
            rootSpan.setStatus(StatusCode.OK)
        }
    } finally {
        rootSpan.end()
    }

    println("\nAll spans ended. Flushing to LangSmith...")

    exporter.flush().join(10, TimeUnit.SECONDS)
    Thread.sleep(6000)
    exporter.shutdown().join(5, TimeUnit.SECONDS)
}

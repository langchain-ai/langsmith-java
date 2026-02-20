package com.langchain.smith.example.otel

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import kotlin.system.exitProcess

/**
 * Spring Boot example: Send OpenTelemetry traces to LangSmith.
 *
 * Usage:
 *   export LANGSMITH_API_KEY=your_api_key
 *   export LANGSMITH_PROJECT=my-project  # optional, defaults to "default"
 *   ./gradlew :langsmith-java-example:run -Pexample=SpringBootLangSmith
 *
 * Then make requests to:
 *   http://localhost:8080/api/chat
 *   http://localhost:8080/api/analyze?text=hello
 */
@SpringBootApplication
class SpringBootLangSmithExample

fun main(args: Array<String>) {
    println("=== Spring Boot + LangSmith OpenTelemetry Example ===\n")

    val apiKey = System.getenv("LANGSMITH_API_KEY")
    if (apiKey.isNullOrEmpty()) {
        System.err.println("ERROR: LANGSMITH_API_KEY environment variable is required!")
        System.err.println("\nUsage:")
        System.err.println("  export LANGSMITH_API_KEY=your_api_key_here")
        System.err.println("  export LANGSMITH_PROJECT=my-project  # optional")
        System.err.println("  ./gradlew :langsmith-java-example:run -Pexample=SpringBootLangSmith")
        exitProcess(1)
    }

    val projectName = System.getenv("LANGSMITH_PROJECT") ?: "default"

    println("Configuration:")
    println("  Project: $projectName")
    println("  Endpoint: https://api.smith.langchain.com/otel/v1/traces")
    println("\nStarting Spring Boot application...")
    println("Try these endpoints:")
    println("  POST http://localhost:8080/api/chat")
    println("  GET  http://localhost:8080/api/analyze?text=hello")
    println()

    SpringApplication.run(SpringBootLangSmithExample::class.java, *args)
}

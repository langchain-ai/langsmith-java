package com.langchain.smith.example

import com.langchain.smith.wrappers.openai.OpenTelemetryConfig
import com.langchain.smith.wrappers.openai.WrappedOpenAIClient
import com.openai.models.ChatModel
import com.openai.models.chat.completions.ChatCompletionCreateParams
import kotlin.jvm.optionals.getOrNull
import java.util.concurrent.TimeUnit
import kotlin.system.exitProcess

/**
 * Example: Stream chat completions and send traces to LangSmith.
 *
 * - Creates a streaming chat completion request ("Count from 1 to 10", max tokens 50, temperature 0)
 * - Consumes the full stream (all chunks until done), accumulates content, counts chunks
 * - Closes the stream so the span is ended and completion/usage are written
 * - Flushes traces to LangSmith
 *
 * Uses the wrapped OpenAI client so streaming calls are traced and exported via OpenTelemetry.
 * In LangSmith, streaming traces have span attribute `gen_ai.streaming` = true.
 *
 * ## Prerequisites
 * Export these environment variables before running:
 * - `OPENAI_API_KEY`: Your OpenAI API key
 * - `LANGSMITH_API_KEY`: Your LangSmith API key
 * - `LANGSMITH_PROJECT`: (optional) LangSmith project name; defaults to "default"
 * - `LANGSMITH_ENDPOINT`: (optional) LangSmith API base URL; defaults to production. Use
 *   `https://beta.api.smith.langchain.com` for beta; view those traces at https://beta.smith.langchain.com
 *
 * ## Running
 * ```bash
 * export OPENAI_API_KEY=your_openai_key
 * export LANGSMITH_API_KEY=your_langsmith_key
 * export LANGSMITH_PROJECT=my-project   # optional
 * export LANGSMITH_ENDPOINT=https://beta.api.smith.langchain.com   # optional, for beta
 * ./gradlew :langsmith-java-example:run -Pexample=StreamingLangSmith
 * ```
 */

/** Maps LangSmith API base URL to the UI base URL where traces are viewed (e.g. beta API -> beta UI). */
private fun traceViewBaseUrl(apiBaseUrl: String): String {
    val base = apiBaseUrl.trim().removeSuffix("/")
    return when {
        base.startsWith("https://beta.api.smith.langchain.com") -> "https://beta.smith.langchain.com"
        base.startsWith("http") && "smith.langchain.com" in base -> "https://smith.langchain.com"
        else -> "https://smith.langchain.com"
    }
}

fun main() {
    println("=== Streaming Chat + LangSmith Traces Example ===\n")

    val openaiKey = System.getenv("OPENAI_API_KEY")
    if (openaiKey.isNullOrEmpty()) {
        System.err.println("ERROR: OPENAI_API_KEY environment variable is required!")
        System.err.println("  export OPENAI_API_KEY=your_openai_api_key")
        exitProcess(1)
    }

    val langsmithKey = System.getenv("LANGSMITH_API_KEY")
    if (langsmithKey.isNullOrEmpty()) {
        System.err.println("ERROR: LANGSMITH_API_KEY environment variable is required!")
        System.err.println("  export LANGSMITH_API_KEY=your_langsmith_api_key")
        exitProcess(1)
    }

    val projectName = System.getenv("LANGSMITH_PROJECT") ?: "default"

    val traceEndpoint = System.getenv("LANGSMITH_ENDPOINT") ?: OpenTelemetryConfig.DEFAULT_BASE_URL
    val viewTracesBaseUrl = traceViewBaseUrl(traceEndpoint)
    println("Configuration:")
    println("  LangSmith project: $projectName")
    println("  Trace endpoint: $traceEndpoint/otel/v1/traces")
    println("  View traces at: $viewTracesBaseUrl")
    println()

    try {
        OpenTelemetryConfig.builder()
            .apiKey(langsmithKey)
            .projectName(projectName)
            .serviceName("streaming-langsmith-example")
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


    val prompt = "Count from 1 to 10"
    println("Prompt: \"$prompt\"")
    println("Streamed reply: ")

    var chunkCount = 0
    val fullContent = StringBuilder()

    try {
        val params = ChatCompletionCreateParams.builder()
            .model(ChatModel.GPT_4O_MINI)
            .addUserMessage(prompt)
            .maxCompletionTokens(50)
            .temperature(0.0)
            .build()

        // This uses the streaming API (createStreaming). Traces will have gen_ai.streaming=true.
        val streamResponse = client.chat().completions().createStreaming(params)
        try {
            streamResponse.stream().forEach { chunk ->
                chunkCount++
                val choices = chunk.choices()
                if (choices.isNotEmpty()) {
                    val delta = choices[0].delta()
                    delta.content().getOrNull()?.let { content ->
                        fullContent.append(content)
                        print(content)
                    }
                }
            }
        } finally {
            streamResponse.close()
        }
        println("\n")
    } catch (e: Exception) {
        System.err.println("\n✗ Error during streaming: ${e.message}")
        e.printStackTrace()
        client.close()
        exitProcess(1)
    }

    client.close()

    println("Chunks received: $chunkCount")
    println("Full content: \"${fullContent}\"")
    println("(Trace was streaming: see gen_ai.streaming=true on the span in LangSmith)")
    if (chunkCount == 0) {
        System.err.println("✗ Expected at least one chunk")
    }
    if (fullContent.isEmpty()) {
        System.err.println("✗ Expected non-empty streamed content")
    }

    println("\nFlushing traces to LangSmith...")
    val flushed = OpenTelemetryConfig.flush(10, TimeUnit.SECONDS)
    OpenTelemetryConfig.shutdown()
    if (flushed) {
        println("✓ Flush completed. View traces: $viewTracesBaseUrl/projects/$projectName")
        println("  (If you don't see traces, set LANGSMITH_DEBUG=true and run again to see export errors.)")
    } else {
        System.err.println("✗ Warning: Flush may not have completed. Set LANGSMITH_DEBUG=true to see export errors.")
    }
}

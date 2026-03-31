package com.langchain.smith.example

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.tracing.TraceConfig
import com.langchain.smith.wrappers.openai.wrapOpenAI
import com.openai.client.okhttp.OpenAIOkHttpClient
import com.openai.models.ChatModel
import com.openai.models.chat.completions.ChatCompletionCreateParams
import com.openai.models.chat.completions.ChatCompletionStreamOptions

/**
 * Demonstrates tracing OpenAI streaming calls with LangSmith.
 *
 * Streaming calls are automatically traced — chunks are aggregated and the final result is recorded
 * when the stream closes.
 *
 * ## Prerequisites
 * - `LANGSMITH_API_KEY`: Your LangSmith API key
 * - `OPENAI_API_KEY`: Your OpenAI API key
 * - `LANGSMITH_TRACING`: Set to "true" to enable tracing
 *
 * ## Running
 * ```bash
 * export LANGSMITH_TRACING=true
 * ./gradlew :langsmith-java-example:run -Pexample=WrapOpenAIStreaming
 * ```
 */
fun main() {
    println("=== wrapOpenAI Streaming Example ===\n")

    val langsmith = LangsmithOkHttpClient.fromEnv()
    val openai = wrapOpenAI(
        OpenAIOkHttpClient.fromEnv(),
        TraceConfig.builder().client(langsmith).build(),
    )

    val params = ChatCompletionCreateParams.builder()
        .model(ChatModel.GPT_4_1_MINI)
        .addUserMessage("Tell me a short joke.")
        .streamOptions(ChatCompletionStreamOptions.builder().includeUsage(true).build())
        .build()

    println("Streaming response:\n")
    openai.chat().completions().createStreaming(params).use { stream ->
        stream.stream().forEach { chunk ->
            chunk.choices().firstOrNull()?.delta()?.content()?.ifPresent { print(it) }
        }
    }

    println("\n\nTrace recorded to LangSmith with aggregated output (check your dashboard)")

    // Wait for async run posting
    Thread.sleep(2000)
}

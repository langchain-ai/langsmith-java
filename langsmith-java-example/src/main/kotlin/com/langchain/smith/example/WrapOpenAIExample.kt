package com.langchain.smith.example

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.tracing.TraceConfig
import com.langchain.smith.wrappers.openai.wrapOpenAI
import com.openai.client.okhttp.OpenAIOkHttpClient
import com.openai.models.ChatModel
import com.openai.models.chat.completions.ChatCompletionCreateParams

/**
 * Demonstrates tracing OpenAI calls with LangSmith using [wrapOpenAI].
 *
 * Wrap your OpenAI client once, then use it normally — all `chat().completions().create()` and
 * `responses().create()` calls are automatically traced to LangSmith.
 *
 * ## Prerequisites
 * - `LANGSMITH_API_KEY`: Your LangSmith API key
 * - `OPENAI_API_KEY`: Your OpenAI API key
 * - `LANGSMITH_TRACING`: Set to "true" to enable tracing
 *
 * ## Running
 * ```bash
 * export LANGSMITH_TRACING=true
 * ./gradlew :langsmith-java-example:run -Pexample=WrapOpenAI
 * ```
 */
fun main() {
    println("=== wrapOpenAI Example ===\n")

    // 1. Create clients
    val langsmith = LangsmithOkHttpClient.fromEnv()
    val openai = wrapOpenAI(
        OpenAIOkHttpClient.fromEnv(),
        TraceConfig.builder().client(langsmith).build(),
    )

    // 2. Use the wrapped client normally — calls are traced automatically
    val params = ChatCompletionCreateParams.builder()
        .model(ChatModel.GPT_4_1_MINI)
        .addUserMessage("What is the capital of France? Reply in one word.")
        .build()

    println("Sending chat completion request...")
    val completion = openai.chat().completions().create(params)

    val reply = completion.choices().firstOrNull()?.message()?.content()?.orElse(null)
    println("Response: $reply")
    println("\nTrace recorded to LangSmith (check your dashboard)")
}

package com.langchain.smith.example

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.prompts.PromptClient
import com.langchain.smith.prompts.convertToAnthropicParams
import com.langchain.smith.prompts.convertToOpenAIParams

/**
 * Demonstrates pulling prompts from the LangSmith hub and converting them
 * to OpenAI and Anthropic API formats.
 *
 * This example shows the simplified high-level prompt API, which mirrors
 * the experience in the Python and TypeScript SDKs:
 *
 * ```java
 * Prompt prompt = promptClient.pull("jacob/joke-generator");
 * PromptValue formattedPrompt = prompt.invoke(Map.of("topic", "cats"));
 * OpenAiPayload openAi = convertToOpenAIParams(formattedPrompt);
 * AnthropicPayload anthropic = convertToAnthropicParams(formattedPrompt);
 * ```
 *
 * Prerequisites:
 * - `LANGSMITH_API_KEY`: Your LangSmith API key
 * - A prompt must already exist in your LangSmith hub (e.g., "joke-generator").
 *   You can create one via the UI or using the PromptManagementExample.
 *
 * Running:
 * ```bash
 * ./gradlew :langsmith-java-example:run -Pexample=PromptPull
 * ```
 */
fun main() {
    println("=== LangSmith Prompt Pull Example ===\n")

    val client = LangsmithOkHttpClient.fromEnv()
    val promptClient = PromptClient.create(client)

    try {
        // -------------------------------------------------------
        // 1. Pull a prompt (like hub.pull() in TS/Python)
        // -------------------------------------------------------
        val owner = System.getenv("LANGSMITH_OWNER")?.takeIf { it.isNotEmpty() } ?: "-"
        val promptIdentifier = "$owner/joke-generator"

        println("1. Pulling prompt: '$promptIdentifier'")
        val prompt = promptClient.pull(promptIdentifier)
        println("   ✓ Pulled prompt (commit: ${prompt.commitHash})")
        println("   ✓ Input variables: ${prompt.inputVariables}")
        if (prompt.hasOutputSchema()) {
            println("   ✓ Has structured output schema")
        }
        println()

        // -------------------------------------------------------
        // 2. Invoke with variables (like prompt.invoke() in TS/Python)
        // -------------------------------------------------------
        println("2. Invoking prompt with topic='cats'...")
        val formattedPrompt = prompt.invoke(mapOf("topic" to "cats"))
        println("   ✓ Formatted ${formattedPrompt.messages.size} message(s):")
        for (msg in formattedPrompt.messages) {
            println("     [${msg.role}] ${msg.template}")
        }
        println()

        // -------------------------------------------------------
        // 3. Convert to OpenAI format
        // -------------------------------------------------------
        println("3. Use with OpenAI:")
        println("   // ChatCompletion completion = openai.chat().completions().create(")
        println("   //     convertToOpenAIParams(formattedPrompt)")
        println("   //         .model(ChatModel.GPT_4_1_MINI)")
        println("   //         .build());")
        println()

        // -------------------------------------------------------
        // 4. Convert to Anthropic format
        // -------------------------------------------------------
        println("4. Use with Anthropic:")
        println("   // Message message = anthropic.messages().create(")
        println("   //     convertToAnthropicParams(formattedPrompt)")
        println("   //         .model(Model.CLAUDE_SONNET_4_6)")
        println("   //         .maxTokens(1024)")
        println("   //         .build());")
        println()

        // -------------------------------------------------------
        // Summary
        // -------------------------------------------------------
        println("=== Summary ===")
        println("✓ Pulled prompt from hub")
        println("✓ Invoked with variables (${formattedPrompt.messages.size} messages)")
        if (formattedPrompt.hasOutputSchema()) {
            println("✓ Includes structured output schema")
        }

    } catch (e: Exception) {
        System.err.println("\nError: ${e.message}")
        e.printStackTrace()
        System.exit(1)
    } finally {
        client.close()
    }
}

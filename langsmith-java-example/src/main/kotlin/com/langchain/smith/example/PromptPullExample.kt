package com.langchain.smith.example

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.prompts.PromptClient
import com.langchain.smith.prompts.convertPromptToAnthropic
import com.langchain.smith.prompts.convertPromptToOpenAI

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
 * OpenAiPayload openAi = convertPromptToOpenAI(formattedPrompt);
 * AnthropicPayload anthropic = convertPromptToAnthropic(formattedPrompt);
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
        // 3. Convert to OpenAI format (like convertPromptToOpenAI() in TS)
        // -------------------------------------------------------
        println("3. Converting to OpenAI format...")
        val openAi = convertPromptToOpenAI(formattedPrompt)
        println("   ✓ Messages:")
        for (msg in openAi.messages) {
            println("     {role: \"${msg["role"]}\", content: \"${msg["content"]}\"}")
        }
        if (openAi.hasOutputSchema()) {
            println("   ✓ Structured output schema: ${openAi.outputSchema}")
        }
        println()
        println("   // Use with the OpenAI Java SDK:")
        println("   // OpenAIClient openai = OpenAIOkHttpClient.fromEnv();")
        println("   // ChatCompletionCreateParams.Builder params = ChatCompletionCreateParams.builder()")
        println("   //     .model(\"gpt-4.1-mini\")")
        println("   //     .messages(openAi.getMessages());  // add messages")
        println("   // Or use toOpenAiParams() for typed SDK integration:")
        println("   // ChatCompletion completion = openai.chat().completions().create(")
        println("   //     openAi.toOpenAiParams().model(ChatModel.GPT_4_1_MINI).build());")
        println("   // // Structured output schema is automatically included")
        println()

        // -------------------------------------------------------
        // 4. Convert to Anthropic format (like convertPromptToAnthropic() in TS)
        // -------------------------------------------------------
        println("4. Converting to Anthropic format...")
        val anthropic = convertPromptToAnthropic(formattedPrompt)
        println("   ✓ System: \"${anthropic.system}\"")
        println("   ✓ Messages:")
        for (msg in anthropic.messages) {
            println("     {role: \"${msg["role"]}\", content: \"${msg["content"]}\"}")
        }
        if (anthropic.hasOutputSchema()) {
            println("   ✓ Structured output schema: ${anthropic.outputSchema}")
        }
        println()
        println("   // Use with the Anthropic Java SDK:")
        println("   // AnthropicClient anthropicClient = AnthropicOkHttpClient.fromEnv();")
        println("   // MessageCreateParams.Builder params = MessageCreateParams.builder()")
        println("   //     .model(\"claude-haiku-4-5-20251001\")")
        println("   //     .system(anthropic.getSystem())")
        println("   //     .messages(anthropic.getMessages())")
        println("   //     .maxTokens(1024);")
        println("   // if (anthropic.hasTool()) {")
        println("   //     params.tools(List.of(anthropic.getTool()));")
        println("   //     params.toolChoice(Map.of(\"type\", \"any\"));")
        println("   // }")
        println()

        // -------------------------------------------------------
        // Summary
        // -------------------------------------------------------
        println("=== Summary ===")
        println("✓ Pulled prompt from hub")
        println("✓ Invoked with variables")
        println("✓ Converted to OpenAI format (${openAi.messages.size} messages)")
        println("✓ Converted to Anthropic format (system + ${anthropic.messages.size} messages)")
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

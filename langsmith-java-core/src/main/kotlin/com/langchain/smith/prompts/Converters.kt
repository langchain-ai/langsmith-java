@file:JvmName("PromptConverters")

package com.langchain.smith.prompts

/**
 * Converts a formatted [PromptValue] to OpenAI chat completion API format.
 *
 * Returns an [OpenAiPayload] containing:
 * - `messages` — a list of `{role, content}` maps ready for the OpenAI messages parameter
 * - `responseFormat` — if the prompt has a structured output schema, the `response_format`
 *   parameter for OpenAI's structured outputs feature; `null` otherwise
 *
 * ## Example (Java)
 *
 * ```java
 * import static com.langchain.smith.prompts.PromptConverters.convertPromptToOpenAI;
 *
 * Prompt prompt = promptClient.pull("my-org/joke-generator");
 * PromptValue formattedPrompt = prompt.invoke(Map.of("topic", "cats"));
 * OpenAiPayload openAi = convertPromptToOpenAI(formattedPrompt);
 *
 * // Use with OpenAI Java SDK
 * OpenAIClient openai = OpenAIOkHttpClient.fromEnv();
 * // openai.chat().completions().create(params) using openAi.messages and openAi.responseFormat
 * ```
 *
 * ## Example (Kotlin)
 *
 * ```kotlin
 * import com.langchain.smith.prompts.convertPromptToOpenAI
 *
 * val prompt = promptClient.pull("my-org/joke-generator")
 * val formattedPrompt = prompt.invoke(mapOf("topic" to "cats"))
 * val openAi = convertPromptToOpenAI(formattedPrompt)
 * ```
 *
 * @param promptValue the formatted prompt value from [Prompt.invoke]
 * @return an [OpenAiPayload] with messages and optional response format
 * @see Prompt.invoke
 * @see OpenAiPayload
 */
fun convertPromptToOpenAI(promptValue: PromptValue): OpenAiPayload {
    val pm = promptValue.promptMessages
    val messages =
        pm.messages.map { msg ->
            val base =
                mutableMapOf<String, String>(
                    "role" to msg.effectiveOpenAiRole(),
                    "content" to msg.template,
                )
            if (msg.toolCallId != null) {
                base["tool_call_id"] = msg.toolCallId
            }
            base.toMap()
        }
    return OpenAiPayload(messages, pm.outputSchema)
}

/**
 * Converts a formatted [PromptValue] to Anthropic messages API format.
 *
 * Returns an [AnthropicPayload] containing:
 * - `system` — the concatenated system message text (extracted from messages, since Anthropic
 *   requires system messages as a separate top-level parameter)
 * - `messages` — a list of `{role, content}` maps for the Anthropic messages parameter (system
 *   messages excluded)
 * - `tool` — if the prompt has a structured output schema, an Anthropic tool definition that can be
 *   passed in the `tools` array; `null` otherwise
 *
 * ## Example (Java)
 *
 * ```java
 * import static com.langchain.smith.prompts.PromptConverters.convertPromptToAnthropic;
 *
 * Prompt prompt = promptClient.pull("my-org/joke-generator");
 * PromptValue formattedPrompt = prompt.invoke(Map.of("topic", "cats"));
 * AnthropicPayload anthropic = convertPromptToAnthropic(formattedPrompt);
 *
 * // Use with Anthropic Java SDK
 * AnthropicClient client = AnthropicOkHttpClient.fromEnv();
 * // client.messages().create(...) using:
 * //   anthropic.system   → system parameter
 * //   anthropic.messages → messages parameter
 * //   anthropic.tool     → tools parameter (if structured prompt)
 * ```
 *
 * ## Example (Kotlin)
 *
 * ```kotlin
 * import com.langchain.smith.prompts.convertPromptToAnthropic
 *
 * val prompt = promptClient.pull("my-org/joke-generator")
 * val formattedPrompt = prompt.invoke(mapOf("topic" to "cats"))
 * val (system, messages) = convertPromptToAnthropic(formattedPrompt)
 * ```
 *
 * @param promptValue the formatted prompt value from [Prompt.invoke]
 * @return an [AnthropicPayload] with system, messages, and optional tool
 * @see Prompt.invoke
 * @see AnthropicPayload
 */
fun convertPromptToAnthropic(promptValue: PromptValue): AnthropicPayload {
    val pm = promptValue.promptMessages
    val systemMessages = pm.messages.filter { it.role == PromptMessage.Role.SYSTEM }
    val nonSystemMessages = pm.messages.filter { it.role != PromptMessage.Role.SYSTEM }

    val system = systemMessages.joinToString("\n") { it.template }
    val messages =
        nonSystemMessages.map { msg ->
            val role =
                when (msg.role) {
                    PromptMessage.Role.HUMAN -> "user"
                    PromptMessage.Role.AI -> "assistant"
                    PromptMessage.Role.TOOL ->
                        "user" // Anthropic doesn't have tool role in messages
                    PromptMessage.Role.CHAT -> msg.customRole ?: "user"
                    PromptMessage.Role.SYSTEM -> "user" // shouldn't happen — filtered above
                    PromptMessage.Role.PLACEHOLDER ->
                        "user" // shouldn't happen — expanded by invoke()
                }
            mapOf("role" to role, "content" to msg.template)
        }
    return AnthropicPayload(system, messages, pm.outputSchema)
}

package com.langchain.smith.prompts

/**
 * The result of invoking a [Prompt] with input variables.
 *
 * A `PromptValue` holds the formatted messages (with variables substituted) and any structured
 * output schema from the original prompt. It is the input to the conversion functions
 * [convertToOpenAIParams] and [convertToAnthropicParams].
 *
 * This is analogous to LangChain's `ChatPromptValue` — it represents a fully-resolved prompt ready
 * to be sent to a model provider.
 *
 * ## Example (Java)
 *
 * ```java
 * Prompt prompt = promptClient.pull("my-org/joke-generator");
 * PromptValue formatted = prompt.invoke(Map.of("topic", "cats"));
 *
 * // Inspect the messages
 * for (PromptMessage msg : formatted.getMessages()) {
 *     System.out.println(msg.getRole() + ": " + msg.getTemplate());
 * }
 *
 * // Convert to provider format
 * OpenAiPayload openAi = convertToOpenAIParams(formatted);
 * AnthropicPayload anthropic = convertToAnthropicParams(formatted);
 * ```
 *
 * @see Prompt.invoke
 * @see convertToOpenAIParams
 * @see convertToAnthropicParams
 */
class PromptValue internal constructor(internal val promptMessages: PromptMessages) {

    /**
     * The formatted messages in this prompt value.
     *
     * Each message has a [role][PromptMessage.role] and the formatted
     * [content][PromptMessage.template] (with variables already substituted).
     */
    val messages: List<PromptMessage>
        get() = promptMessages.messages

    /** The structured output JSON Schema, or `null` if this is not a structured prompt. */
    val outputSchema: Map<String, Any?>?
        get() = promptMessages.outputSchema

    /** Returns `true` if this prompt value includes a structured output schema. */
    fun hasOutputSchema(): Boolean = promptMessages.hasOutputSchema()

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PromptValue) return false
        return promptMessages == other.promptMessages
    }

    override fun hashCode(): Int = promptMessages.hashCode()

    override fun toString(): String {
        val parts = buildList {
            add("messages=[${messages.joinToString(", ")}]")
            outputSchema?.let { add("outputSchema=${it["title"] ?: "..."}") }
        }
        return "PromptValue{${parts.joinToString(", ")}}"
    }
}

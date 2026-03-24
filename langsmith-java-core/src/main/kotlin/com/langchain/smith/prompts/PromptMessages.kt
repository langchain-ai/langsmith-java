package com.langchain.smith.prompts

/**
 * Internal representation of parsed prompt messages from a LangChain manifest.
 *
 * This is not part of the public API. Users interact with [Prompt] (before formatting)
 * and [PromptValue] (after formatting), and use [convertPromptToOpenAI] /
 * [convertPromptToAnthropic] for provider conversion.
 *
 * @see ManifestParser
 */
internal class PromptMessages(
    val messages: List<PromptMessage>,
    val inputVariables: List<String>,
    val outputSchema: Map<String, Any?>? = null,
) {

    fun hasOutputSchema(): Boolean = outputSchema != null

    fun format(variables: Map<String, Any>): PromptMessages {
        val formatted = messages.map { msg ->
            PromptMessage.of(msg.role, msg.format(variables))
        }
        return PromptMessages(formatted, inputVariables, outputSchema)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PromptMessages) return false
        return messages == other.messages &&
                inputVariables == other.inputVariables &&
                outputSchema == other.outputSchema
    }

    override fun hashCode(): Int {
        var result = messages.hashCode()
        result = 31 * result + inputVariables.hashCode()
        result = 31 * result + (outputSchema?.hashCode() ?: 0)
        return result
    }

    override fun toString(): String =
        "PromptMessages{messages=$messages, inputVariables=$inputVariables" +
                if (outputSchema != null) ", outputSchema=$outputSchema}" else "}"
}

/**
 * The result of converting a [PromptValue] to OpenAI API format via [convertPromptToOpenAI].
 *
 * @property messages the messages as maps with `"role"` and `"content"` keys
 * @property responseFormat the `response_format` parameter for OpenAI structured outputs,
 *     or `null` if this is not a structured prompt. When present, pass this as the
 *     `response_format` parameter to `chat.completions.create()`.
 */
data class OpenAiPayload(
    val messages: List<Map<String, String>>,
    val responseFormat: Map<String, Any?>? = null,
) {
    /** Returns `true` if this payload includes a structured output response format. */
    fun hasResponseFormat(): Boolean = responseFormat != null
}

/**
 * The result of converting a [PromptValue] to Anthropic API format via [convertPromptToAnthropic].
 *
 * Anthropic requires system messages to be passed separately from the messages array.
 * For structured prompts, a tool definition is included that can be passed to the
 * `tools` parameter, with `tool_choice: {"type": "any"}` to force tool use.
 *
 * @property system the concatenated system message text (empty string if no system messages)
 * @property messages the non-system messages as maps with `"role"` and `"content"` keys
 * @property tool the Anthropic tool definition for structured output, or `null` if this
 *     is not a structured prompt. When present, pass this in the `tools` array and set
 *     `tool_choice` to `{"type": "any"}`.
 */
data class AnthropicPayload(
    val system: String,
    val messages: List<Map<String, String>>,
    val tool: Map<String, Any?>? = null,
) {
    /** Returns `true` if this payload includes a structured output tool definition. */
    fun hasTool(): Boolean = tool != null
}

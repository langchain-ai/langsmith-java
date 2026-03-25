package com.langchain.smith.prompts

import com.langchain.smith.core.JsonValue

/**
 * A prompt pulled from the LangSmith hub that can be invoked with input variables.
 *
 * This is the primary object returned by [PromptClient.pull]. It wraps a parsed prompt manifest and
 * provides an [invoke] method to format the prompt with variable values, producing a [PromptValue]
 * that can then be converted to provider-specific formats using [convertToOpenAIParams] or
 * [convertToAnthropicParams].
 *
 * ## Example (Java)
 *
 * ```java
 * PromptClient promptClient = PromptClient.create(langsmithClient);
 * Prompt prompt = promptClient.pull("my-org/joke-generator");
 *
 * PromptValue formattedPrompt = prompt.invoke(Map.of("topic", "cats"));
 *
 * // Convert to OpenAI format
 * OpenAiPayload openAi = convertToOpenAIParams(formattedPrompt);
 *
 * // Convert to Anthropic format
 * AnthropicPayload anthropic = convertToAnthropicParams(formattedPrompt);
 * ```
 *
 * ## Example (Kotlin)
 *
 * ```kotlin
 * val prompt = promptClient.pull("my-org/joke-generator")
 * val formattedPrompt = prompt.invoke(mapOf("topic" to "cats"))
 * val (messages, system) = convertToAnthropicParams(formattedPrompt)
 * ```
 *
 * @see PromptClient.pull
 * @see PromptValue
 * @see convertToOpenAIParams
 * @see convertToAnthropicParams
 */
class Prompt
internal constructor(
    /** The parsed prompt messages (unformatted templates). */
    private val promptMessages: PromptMessages,
    /** The commit metadata, if available. */
    private val commit: PromptCommit?,
) {

    /**
     * The input variable names expected by this prompt.
     *
     * These are the `{variable}` placeholders found in the message templates.
     */
    val inputVariables: List<String>
        get() = promptMessages.inputVariables

    /** The structured output JSON Schema, or `null` if this is not a structured prompt. */
    val outputSchema: Map<String, Any?>?
        get() = promptMessages.outputSchema

    /** Returns `true` if this prompt includes a structured output schema. */
    fun hasOutputSchema(): Boolean = promptMessages.hasOutputSchema()

    /** The commit hash of the pulled prompt, if available. */
    val commitHash: String?
        get() = commit?.commitHash

    /** The raw manifest JSON, if available. */
    val manifest: JsonValue?
        get() = commit?.manifest

    /**
     * Formats this prompt with the given input variables, producing a [PromptValue].
     *
     * Each `{variable_name}` placeholder in the message templates is replaced with the
     * corresponding value from [variables]. Variables not present in the map are left as-is.
     *
     * @param variables a map from variable name to its substitution value. Values are converted to
     *   strings via [Any.toString].
     * @return a [PromptValue] containing the formatted messages
     */
    fun invoke(variables: Map<String, Any>): PromptValue {
        val formatted = promptMessages.format(variables)
        return PromptValue(formatted)
    }

    /**
     * Produces a [PromptValue] with no variable substitution.
     *
     * Use this when the prompt has no input variables. Placeholders (if any) will be dropped since
     * no variables are provided.
     *
     * @return a [PromptValue] containing the messages
     */
    fun invoke(): PromptValue = invoke(emptyMap())

    override fun toString(): String {
        val parts = buildList {
            add("messages=[${promptMessages.messages.joinToString(", ")}]")
            if (inputVariables.isNotEmpty()) add("inputVariables=$inputVariables")
            commitHash?.let { add("commitHash=$it") }
            outputSchema?.let { add("outputSchema=${it["title"] ?: "..."}") }
        }
        return "Prompt{${parts.joinToString(", ")}}"
    }

    companion object {

        /**
         * Creates a [Prompt] from a [PromptCommit].
         *
         * The commit's manifest is parsed into typed messages. This is called internally by
         * [PromptClient.pull].
         */
        @JvmStatic
        internal fun fromCommit(commit: PromptCommit): Prompt {
            val messages = commit.toMessages()
            return Prompt(messages, commit)
        }

        /**
         * Creates a [Prompt] directly from a list of messages.
         *
         * Useful for testing or when constructing prompts programmatically without pulling from the
         * hub.
         *
         * @param messages the prompt messages
         * @param inputVariables the input variable names (optional)
         * @param outputSchema the JSON Schema for structured output (optional)
         */
        @JvmStatic
        @JvmOverloads
        fun of(
            messages: List<PromptMessage>,
            inputVariables: List<String> = emptyList(),
            outputSchema: Map<String, Any?>? = null,
        ): Prompt = Prompt(PromptMessages(messages, inputVariables, outputSchema), null)
    }
}

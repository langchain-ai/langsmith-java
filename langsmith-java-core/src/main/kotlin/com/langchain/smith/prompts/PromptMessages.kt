package com.langchain.smith.prompts

/**
 * Internal representation of parsed prompt messages from a LangChain manifest.
 *
 * This is not part of the public API. Users interact with [Prompt] (before formatting) and
 * [PromptValue] (after formatting), and use [convertPromptToOpenAI] / [convertPromptToAnthropic]
 * for provider conversion.
 *
 * @see ManifestParser
 */
internal class PromptMessages(
    val messages: List<PromptMessage>,
    val inputVariables: List<String>,
    val outputSchema: Map<String, Any?>? = null,
) {

    fun hasOutputSchema(): Boolean = outputSchema != null

    @Suppress("UNCHECKED_CAST")
    fun format(variables: Map<String, Any>): PromptMessages {
        val formatted = mutableListOf<PromptMessage>()
        for (msg in messages) {
            if (msg.isPlaceholder()) {
                // Expand placeholder: look up the variable and inject messages
                val value = variables[msg.template]
                if (value is List<*>) {
                    for (item in value) {
                        when (item) {
                            is PromptMessage -> formatted.add(item)
                            is Map<*, *> -> {
                                // Support Map<String, String> with "role" and "content" keys
                                val role = (item["role"] as? String) ?: continue
                                val content = (item["content"] as? String) ?: continue
                                val parsedRole =
                                    when (role) {
                                        "system" -> PromptMessage.Role.SYSTEM
                                        "user",
                                        "human" -> PromptMessage.Role.HUMAN
                                        "assistant",
                                        "ai" -> PromptMessage.Role.AI
                                        "tool" -> PromptMessage.Role.TOOL
                                        else -> PromptMessage.Role.CHAT
                                    }
                                if (parsedRole == PromptMessage.Role.CHAT) {
                                    formatted.add(PromptMessage.chat(content, role))
                                } else {
                                    formatted.add(PromptMessage.of(parsedRole, content))
                                }
                            }
                        }
                    }
                }
                // If variable not found or not a list, the placeholder is silently dropped
            } else {
                formatted.add(PromptMessage.withTemplate(msg, msg.format(variables)))
            }
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
 * Use [toOpenAiParams] to get a typed [ChatCompletionCreateParams.Builder] that can be passed
 * directly to the OpenAI Java SDK.
 *
 * @property messages the messages as maps with `"role"` and `"content"` keys
 * @property responseFormat the `response_format` parameter for OpenAI structured outputs, or `null`
 *   if this is not a structured prompt.
 */
data class OpenAiPayload(
    val messages: List<Map<String, String>>,
    val responseFormat: Map<String, Any?>? = null,
) {
    /** Returns `true` if this payload includes a structured output response format. */
    fun hasResponseFormat(): Boolean = responseFormat != null

    /**
     * Converts this payload to a typed OpenAI [ChatCompletionCreateParams.Builder] with messages
     * and (if structured) response format already set.
     *
     * Call `.model(...)` and any other options on the returned builder, then `.build()`.
     *
     * ```java
     * OpenAiPayload openAi = convertPromptToOpenAI(formattedPrompt);
     * ChatCompletion completion = openAiClient.chat().completions().create(
     *     openAi.toOpenAiParams()
     *         .model(ChatModel.GPT_4_1_MINI)
     *         .build()
     * );
     * ```
     */
    fun toOpenAiParams(): com.openai.models.chat.completions.ChatCompletionCreateParams.Builder {
        val builder = com.openai.models.chat.completions.ChatCompletionCreateParams.builder()
        for (msg in messages) {
            val role = msg["role"] ?: continue
            val content = msg["content"] ?: ""
            when (role) {
                "system" ->
                    builder.addMessage(
                        com.openai.models.chat.completions.ChatCompletionMessageParam.ofSystem(
                            com.openai.models.chat.completions.ChatCompletionSystemMessageParam
                                .builder()
                                .content(content)
                                .build()
                        )
                    )
                "assistant" ->
                    builder.addMessage(
                        com.openai.models.chat.completions.ChatCompletionMessageParam.ofAssistant(
                            com.openai.models.chat.completions.ChatCompletionAssistantMessageParam
                                .builder()
                                .content(content)
                                .build()
                        )
                    )
                "tool" -> {
                    val toolCallId = msg["tool_call_id"] ?: ""
                    builder.addMessage(
                        com.openai.models.chat.completions.ChatCompletionMessageParam.ofTool(
                            com.openai.models.chat.completions.ChatCompletionToolMessageParam
                                .builder()
                                .toolCallId(toolCallId)
                                .content(content)
                                .build()
                        )
                    )
                }
                else ->
                    builder.addMessage(
                        com.openai.models.chat.completions.ChatCompletionMessageParam.ofUser(
                            com.openai.models.chat.completions.ChatCompletionUserMessageParam
                                .builder()
                                .content(content)
                                .build()
                        )
                    )
            }
        }
        if (responseFormat != null) {
            @Suppress("UNCHECKED_CAST")
            val jsonSchemaMap = responseFormat["json_schema"] as? Map<String, Any?>
            if (jsonSchemaMap != null) {
                val schemaName = jsonSchemaMap["name"] as? String ?: "structured_output"
                val strict = jsonSchemaMap["strict"] as? Boolean ?: true
                @Suppress("UNCHECKED_CAST")
                val schemaObj = jsonSchemaMap["schema"] as? Map<String, Any?>

                val schemaBuilder =
                    com.openai.models.ResponseFormatJsonSchema.JsonSchema.Schema.builder()
                schemaObj?.forEach { (k, v) ->
                    schemaBuilder.putAdditionalProperty(k, com.openai.core.JsonValue.from(v))
                }

                builder.responseFormat(
                    com.openai.models.chat.completions.ChatCompletionCreateParams.ResponseFormat
                        .ofJsonSchema(
                            com.openai.models.ResponseFormatJsonSchema.builder()
                                .jsonSchema(
                                    com.openai.models.ResponseFormatJsonSchema.JsonSchema.builder()
                                        .name(schemaName)
                                        .strict(strict)
                                        .schema(schemaBuilder.build())
                                        .build()
                                )
                                .build()
                        )
                )
            }
        }
        return builder
    }
}

/**
 * The result of converting a [PromptValue] to Anthropic API format via [convertPromptToAnthropic].
 *
 * Anthropic requires system messages to be passed separately from the messages array. For
 * structured prompts, a tool definition is included that can be passed to the `tools` parameter,
 * with `tool_choice: {"type": "any"}` to force tool use.
 *
 * @property system the concatenated system message text (empty string if no system messages)
 * @property messages the non-system messages as maps with `"role"` and `"content"` keys
 * @property tool the Anthropic tool definition for structured output, or `null` if this is not a
 *   structured prompt. When present, pass this in the `tools` array and set `tool_choice` to
 *   `{"type": "any"}`.
 */
data class AnthropicPayload(
    val system: String,
    val messages: List<Map<String, String>>,
    val tool: Map<String, Any?>? = null,
) {
    /** Returns `true` if this payload includes a structured output tool definition. */
    fun hasTool(): Boolean = tool != null
}

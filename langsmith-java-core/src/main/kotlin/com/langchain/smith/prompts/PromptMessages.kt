package com.langchain.smith.prompts

/**
 * Recursively adds `"additionalProperties": false` to every object-type schema node. Both OpenAI
 * and Anthropic structured outputs require this.
 */
internal fun strictSchemaForStructuredOutput(schema: Map<String, Any?>): Map<String, Any?> {
    val result = schema.toMutableMap()
    if (result["type"] == "object") {
        result["additionalProperties"] = false
        val properties = result["properties"]
        if (properties is Map<*, *>) {
            result["properties"] =
                properties.entries.associate { (k, v) ->
                    val key = k as? String ?: k.toString()
                    val value =
                        if (v is Map<*, *>) {
                            // Recurse into nested property schemas
                            val nested =
                                v.entries.associate { (nk, nv) ->
                                    (nk as? String ?: nk.toString()) to nv
                                }
                            strictSchemaForStructuredOutput(nested)
                        } else {
                            v
                        }
                    key to value
                }
        }
    }
    return result
}

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
 * @property outputSchema the raw JSON Schema for structured output, or `null`
 */
data class OpenAiPayload(
    val messages: List<Map<String, String>>,
    val outputSchema: Map<String, Any?>? = null,
) {
    /** Returns `true` if this payload includes a structured output schema. */
    fun hasOutputSchema(): Boolean = outputSchema != null

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
        if (outputSchema != null) {
            val schemaName = (outputSchema["title"] as? String) ?: "structured_output"
            val strictSchema = strictSchemaForStructuredOutput(outputSchema)
            val schemaBuilder =
                com.openai.models.ResponseFormatJsonSchema.JsonSchema.Schema.builder()
            strictSchema.forEach { (k, v) ->
                schemaBuilder.putAdditionalProperty(k, com.openai.core.JsonValue.from(v))
            }
            builder.responseFormat(
                com.openai.models.chat.completions.ChatCompletionCreateParams.ResponseFormat
                    .ofJsonSchema(
                        com.openai.models.ResponseFormatJsonSchema.builder()
                            .jsonSchema(
                                com.openai.models.ResponseFormatJsonSchema.JsonSchema.builder()
                                    .name(schemaName)
                                    .strict(true)
                                    .schema(schemaBuilder.build())
                                    .build()
                            )
                            .build()
                    )
            )
        }
        return builder
    }
}

/**
 * The result of converting a [PromptValue] to Anthropic API format via [convertPromptToAnthropic].
 *
 * Use [toAnthropicParams] to get a typed [MessageCreateParams.Builder] that can be passed directly
 * to the Anthropic Java SDK. Requires `com.anthropic:anthropic-java` as a dependency.
 *
 * Anthropic requires system messages to be passed separately from the messages array. For
 * structured prompts, the [outputSchema] is included and [toAnthropicParams] will automatically
 * configure tool use.
 *
 * @property system the concatenated system message text (empty string if no system messages)
 * @property messages the non-system messages as maps with `"role"` and `"content"` keys
 * @property outputSchema the raw JSON Schema for structured output, or `null`
 */
data class AnthropicPayload(
    val system: String,
    val messages: List<Map<String, String>>,
    val outputSchema: Map<String, Any?>? = null,
) {
    /** Returns `true` if this payload includes a structured output schema. */
    fun hasOutputSchema(): Boolean = outputSchema != null

    /**
     * Converts this payload to a typed Anthropic [MessageCreateParams.Builder] with system,
     * messages, and (if structured) output config already set.
     *
     * Call `.model(...)` and any other options on the returned builder, then `.build()`.
     *
     * Requires `com.anthropic:anthropic-java` (>= 2.18.0) as a dependency.
     *
     * ```java
     * AnthropicPayload anthropic = convertPromptToAnthropic(formattedPrompt);
     * Message message = anthropicClient.messages().create(
     *     anthropic.toAnthropicParams()
     *         .model(Model.CLAUDE_HAIKU_4_5_20251001)
     *         .maxTokens(1024)
     *         .build()
     * );
     * ```
     */
    fun toAnthropicParams(): com.anthropic.models.messages.MessageCreateParams.Builder {
        val builder =
            try {
                com.anthropic.models.messages.MessageCreateParams.builder()
            } catch (e: NoClassDefFoundError) {
                throw IllegalStateException(
                    "Anthropic SDK not found. Add com.anthropic:anthropic-java to your dependencies.",
                    e,
                )
            }

        if (system.isNotEmpty()) {
            builder.system(system)
        }

        for (msg in messages) {
            val role = msg["role"] ?: continue
            val content = msg["content"] ?: ""
            val messageRole =
                when (role) {
                    "user" -> com.anthropic.models.messages.MessageParam.Role.USER
                    "assistant" -> com.anthropic.models.messages.MessageParam.Role.ASSISTANT
                    else -> continue
                }
            builder.addMessage(
                com.anthropic.models.messages.MessageParam.builder()
                    .role(messageRole)
                    .content(content)
                    .build()
            )
        }

        if (outputSchema != null) {
            val strictSchema = strictSchemaForStructuredOutput(outputSchema)
            val schemaBuilder = com.anthropic.models.messages.JsonOutputFormat.Schema.builder()
            strictSchema.forEach { (k, v) ->
                schemaBuilder.putAdditionalProperty(k, com.anthropic.core.JsonValue.from(v))
            }
            builder.outputConfig(
                com.anthropic.models.messages.OutputConfig.builder()
                    .format(
                        com.anthropic.models.messages.JsonOutputFormat.builder()
                            .schema(schemaBuilder.build())
                            .build()
                    )
                    .build()
            )
        }

        return builder
    }
}

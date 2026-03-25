package com.langchain.smith.prompts

/**
 * Injects `"additionalProperties": false` into every object node in a JSON Schema. This is required
 * when using strict mode for structured outputs — OpenAI requires it when `strict: true` is set,
 * and Anthropic requires it for `output_config` schemas.
 *
 * We enable strict mode by default because it guarantees the response matches the schema exactly.
 *
 * See:
 * https://community.openai.com/t/schema-additionalproperties-must-be-false-when-strict-is-true/929996
 *
 * Returns a new map — the input is not modified.
 */
internal fun strictSchemaForStructuredOutput(schema: Map<String, Any?>): Map<String, Any?> =
    buildMap {
        putAll(schema)
        if (schema["type"] == "object") {
            put("additionalProperties", false)
            val properties = schema["properties"]
            if (properties is Map<*, *>) {
                put(
                    "properties",
                    buildMap {
                        for ((key, value) in properties) {
                            val k = key?.toString() ?: continue
                            // Each property value is itself a schema — recurse if it's a map
                            put(
                                k,
                                if (value is Map<*, *>) {
                                    val nested =
                                        buildMap<String, Any?> {
                                            for ((nk, nv) in value) {
                                                put(nk?.toString() ?: continue, nv)
                                            }
                                        }
                                    strictSchemaForStructuredOutput(nested)
                                } else {
                                    value
                                },
                            )
                        }
                    },
                )
            }
        }
    }

/**
 * Internal representation of parsed prompt messages from a LangChain manifest.
 *
 * This is not part of the public API. Users interact with [Prompt] (before formatting) and
 * [PromptValue] (after formatting), and use [convertToOpenAIParams] / [convertToAnthropicParams]
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
        val formatted =
            messages.flatMap { msg ->
                if (msg.isPlaceholder()) {
                    expandPlaceholder(msg, variables)
                } else {
                    listOf(PromptMessage.withTemplate(msg, msg.format(variables)))
                }
            }
        return PromptMessages(formatted, inputVariables, outputSchema)
    }

    private fun expandPlaceholder(
        msg: PromptMessage,
        variables: Map<String, Any>,
    ): List<PromptMessage> {
        val items = variables[msg.template] as? List<*> ?: return emptyList()
        return items.mapNotNull(::toPromptMessage)
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

private fun toPromptMessage(value: Any?): PromptMessage? =
    when (value) {
        is PromptMessage -> value
        is Map<*, *> -> value.toPromptMessage()
        else -> null
    }

private fun Map<*, *>.toPromptMessage(): PromptMessage? {
    val role = this["role"] as? String ?: return null
    val content = this["content"] as? String ?: return null
    return when (role) {
        "system" -> PromptMessage.system(content)
        "user",
        "human" -> PromptMessage.human(content)
        "assistant",
        "ai" -> PromptMessage.ai(content)
        "tool" -> PromptMessage.tool(content, this["tool_call_id"] as? String ?: "")
        else -> PromptMessage.chat(content, role)
    }
}

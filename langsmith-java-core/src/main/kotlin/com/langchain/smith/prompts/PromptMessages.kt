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

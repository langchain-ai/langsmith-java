package com.langchain.smith.prompts

/**
 * Injects `"additionalProperties": false` into every object node in a JSON Schema tree. This is
 * required when using strict mode for structured outputs — OpenAI requires it when `strict: true`
 * is set, and Anthropic requires it for `output_config` schemas.
 *
 * Recursion covers all schema locations where objects can appear: `properties`, `items`, `anyOf`,
 * `oneOf`, `allOf`, `$defs`, and any other nested map or list-of-maps structure.
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
        for ((key, value) in schema) {
            put(key, strictifyValue(value))
        }
        if (isObjectType(schema["type"])) {
            put("additionalProperties", false)
        }
    }

/**
 * Checks if a schema type is or includes "object". Handles both `"object"` and `["string",
 * "object"]`.
 */
private fun isObjectType(type: Any?): Boolean =
    when (type) {
        is String -> type == "object"
        is List<*> -> type.any { it == "object" }
        else -> false
    }

/**
 * Recursively processes a value within a JSON Schema, applying strict mode to any nested schemas.
 */
private fun strictifyValue(value: Any?): Any? =
    when (value) {
        is Map<*, *> -> {
            val mapWithStringKeys =
                buildMap<String, Any?> {
                    for ((k, v) in value) {
                        put(k?.toString() ?: continue, v)
                    }
                }
            strictSchemaForStructuredOutput(mapWithStringKeys)
        }
        is List<*> -> value.map { strictifyValue(it) }
        else -> value
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

    override fun toString(): String {
        val parts = buildList {
            add("messages=$messages")
            if (inputVariables.isNotEmpty()) add("inputVariables=$inputVariables")
            outputSchema?.let { add("outputSchema=${it["title"] ?: "..."}") }
        }
        return "PromptMessages{${parts.joinToString(", ")}}"
    }
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

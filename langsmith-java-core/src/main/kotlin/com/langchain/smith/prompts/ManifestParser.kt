package com.langchain.smith.prompts

import com.langchain.smith.core.JsonValue

/**
 * Parses LangChain-serialized prompt manifests into typed [PromptMessages] objects.
 *
 * The LangSmith hub stores prompts in LangChain's serialization format, which uses a nested
 * structure with `lc`, `type`, `id`, and `kwargs` fields. This parser understands that
 * format and extracts the messages, input variables, and (for structured prompts) the
 * output schema.
 *
 * Supported manifest types:
 * - `ChatPromptTemplate` — a chat prompt with multiple message templates
 * - `PromptTemplate` — a single-template prompt (converted to a single human message)
 * - `StructuredPrompt` — a chat prompt with an associated JSON Schema for structured output
 *
 * @see PromptCommit.toMessages
 */
internal object ManifestParser {

    /**
     * Parses a LangChain-serialized manifest [JsonValue] into [PromptMessages].
     *
     * @param manifest the raw JSON manifest from the LangSmith API
     * @return the parsed prompt messages
     * @throws IllegalArgumentException if the manifest format is not recognized
     */
    fun parse(manifest: JsonValue): PromptMessages {
        val obj = manifest.asObject().orElseThrow {
            IllegalArgumentException("Manifest must be a JSON object")
        }
        return parseNode(obj)
    }

    private fun parseNode(obj: Map<String, JsonValue>): PromptMessages {
        val id = extractId(obj)
        val kwargs = extractKwargs(obj)

        return when {
            id.any { it.contains("StructuredPrompt") } ->
                parseStructuredPrompt(kwargs)

            id.any { it.contains("ChatPromptTemplate") } ->
                parseChatPromptTemplate(kwargs)

            id.any { it.contains("PromptTemplate") } ->
                parsePromptTemplate(kwargs)

            else ->
                // Try to detect type from kwargs structure
                if (kwargs.containsKey("messages") && hasSchemaField(kwargs)) {
                    parseStructuredPrompt(kwargs)
                } else if (kwargs.containsKey("messages")) {
                    parseChatPromptTemplate(kwargs)
                } else if (kwargs.containsKey("template")) {
                    parsePromptTemplate(kwargs)
                } else {
                    throw IllegalArgumentException(
                        "Unrecognized manifest type. Expected ChatPromptTemplate, " +
                                "StructuredPrompt, or PromptTemplate, got id=$id"
                    )
                }
        }
    }

    private fun parseChatPromptTemplate(
        kwargs: Map<String, JsonValue>,
        outputSchema: Map<String, Any?>? = null,
    ): PromptMessages {
        val messagesValue = kwargs["messages"]
            ?: throw IllegalArgumentException("ChatPromptTemplate missing 'messages' in kwargs")

        val messagesList = messagesValue.asArray().orElseThrow {
            IllegalArgumentException("'messages' must be a JSON array")
        }

        val inputVariables = extractInputVariables(kwargs)

        val messages = messagesList.mapNotNull { msgValue ->
            val msgObj = msgValue.asObject().orElse(null) ?: return@mapNotNull null
            parseMessageTemplate(msgObj)
        }

        return PromptMessages(messages, inputVariables, outputSchema)
    }

    /**
     * Parses a `StructuredPrompt` manifest. This is like a `ChatPromptTemplate` but with
     * an additional `schema_` (or `schema`) field containing a JSON Schema object that
     * defines the expected structured output.
     */
    private fun parseStructuredPrompt(kwargs: Map<String, JsonValue>): PromptMessages {
        val outputSchema = extractOutputSchema(kwargs)
        return parseChatPromptTemplate(kwargs, outputSchema)
    }

    private fun parsePromptTemplate(kwargs: Map<String, JsonValue>): PromptMessages {
        val template = kwargs["template"]?.asString()?.orElse(null)
            ?: throw IllegalArgumentException("PromptTemplate missing 'template' in kwargs")

        val inputVariables = extractInputVariables(kwargs)

        return PromptMessages(
            listOf(PromptMessage.human(template)),
            inputVariables,
        )
    }

    private fun parseMessageTemplate(msgObj: Map<String, JsonValue>): PromptMessage? {
        val id = extractId(msgObj)
        val kwargs = extractKwargs(msgObj)

        // Determine the role from the id field
        val className = id.lastOrNull() ?: ""
        val role = PromptMessage.Role.fromLangchainClassName(className)

        // The template can be directly in kwargs, or nested in a "prompt" sub-object
        val template = extractTemplate(kwargs)
            ?: return null

        return PromptMessage.of(role, template)
    }

    /**
     * Extracts the template string from kwargs. Handles two formats:
     *
     * 1. Direct template: `kwargs.template = "..."`
     * 2. Nested prompt: `kwargs.prompt.kwargs.template = "..."`
     */
    private fun extractTemplate(kwargs: Map<String, JsonValue>): String? {
        // Check for direct template
        kwargs["template"]?.asString()?.orElse(null)?.let { return it }

        // Check for nested prompt object
        val prompt = kwargs["prompt"]?.asObject()?.orElse(null) ?: return null
        val promptKwargs = extractKwargs(prompt)
        return promptKwargs["template"]?.asString()?.orElse(null)
    }

    /** Extracts the `id` field as a list of strings. */
    private fun extractId(obj: Map<String, JsonValue>): List<String> {
        val idValue = obj["id"] ?: return emptyList()
        return idValue.asArray().orElse(emptyList()).mapNotNull { it.asString().orElse(null) }
    }

    /** Extracts the `kwargs` field as a map. */
    private fun extractKwargs(obj: Map<String, JsonValue>): Map<String, JsonValue> =
        obj["kwargs"]?.asObject()?.orElse(emptyMap()) ?: emptyMap()

    /** Extracts `input_variables` from kwargs as a list of strings. */
    private fun extractInputVariables(kwargs: Map<String, JsonValue>): List<String> {
        val vars = kwargs["input_variables"] ?: return emptyList()
        return vars.asArray().orElse(emptyList()).mapNotNull { it.asString().orElse(null) }
    }

    /** Returns `true` if kwargs contains a `schema_` or `schema` field. */
    private fun hasSchemaField(kwargs: Map<String, JsonValue>): Boolean =
        kwargs.containsKey("schema_") || kwargs.containsKey("schema")

    /**
     * Extracts the output schema from kwargs.
     *
     * StructuredPrompt manifests store the schema under `schema_` (Python-style, to avoid
     * collision with the `schema` JSON Schema keyword) or `schema`. The value is a JSON
     * Schema object, which may itself be a LangChain-serialized object or a plain JSON
     * Schema.
     *
     * @return the output schema as a `Map<String, Any?>`, or `null` if not present
     */
    @Suppress("UNCHECKED_CAST")
    private fun extractOutputSchema(kwargs: Map<String, JsonValue>): Map<String, Any?>? {
        val schemaValue = kwargs["schema_"] ?: kwargs["schema"] ?: return null
        return jsonValueToMap(schemaValue)
    }

    /**
     * Recursively converts a [JsonValue] to a plain `Map<String, Any?>` / `List` / scalar
     * structure suitable for inclusion in API payloads.
     */
    @Suppress("UNCHECKED_CAST")
    private fun jsonValueToMap(value: JsonValue): Map<String, Any?>? {
        val obj = value.asObject().orElse(null) ?: return null
        return obj.mapValues { (_, v) -> jsonValueToPlain(v) }
    }

    private fun jsonValueToPlain(value: JsonValue): Any? =
        value.asString().map { it as Any }.orElse(null)
            ?: value.asNumber().map { it as Any }.orElse(null)
            ?: value.asBoolean().map { it as Any }.orElse(null)
            ?: value.asArray().map { list -> list.map { jsonValueToPlain(it) } as Any }.orElse(null)
            ?: value.asObject().map { map -> map.mapValues { (_, v) -> jsonValueToPlain(v) } as Any }.orElse(null)
}

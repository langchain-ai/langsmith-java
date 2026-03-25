package com.langchain.smith.prompts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

/**
 * Tests the public prompt API: [Prompt.of] → [Prompt.invoke] → [convertToOpenAIParams] /
 * [convertToAnthropicParams].
 *
 * Covers formatting, OpenAI conversion, Anthropic conversion, and structured output handling.
 */
internal class PromptMessagesTest {

    // --- Formatting via Prompt.invoke ---

    @Test
    fun formatSubstitutesVariables() {
        val prompt =
            Prompt.of(
                listOf(
                    PromptMessage.system("You are a {personality} assistant."),
                    PromptMessage.human("Tell me about {topic}"),
                ),
                listOf("personality", "topic"),
            )

        val result = prompt.invoke(mapOf("personality" to "funny", "topic" to "cats"))

        assertThat(result.messages[0].template).isEqualTo("You are a funny assistant.")
        assertThat(result.messages[1].template).isEqualTo("Tell me about cats")
    }

    @Test
    fun formatPreservesUnusedVariables() {
        val prompt =
            Prompt.of(
                listOf(PromptMessage.human("Hello {name}, topic is {topic}")),
                listOf("name", "topic"),
            )

        val result = prompt.invoke(mapOf("name" to "Alice"))

        assertThat(result.messages[0].template).isEqualTo("Hello Alice, topic is {topic}")
    }

    @Test
    fun formatMustacheTemplate() {
        // Mustache templates use {{variable}} syntax
        val prompt =
            Prompt.of(
                listOf(
                    PromptMessage(
                        PromptMessage.Role.SYSTEM,
                        "You are a {{personality}} assistant.",
                        templateFormat = "mustache",
                    ),
                    PromptMessage(
                        PromptMessage.Role.HUMAN,
                        "Tell me about {{topic}}",
                        templateFormat = "mustache",
                    ),
                ),
                listOf("personality", "topic"),
            )

        val result = prompt.invoke(mapOf("personality" to "funny", "topic" to "cats"))

        assertThat(result.messages[0].template).isEqualTo("You are a funny assistant.")
        assertThat(result.messages[1].template).isEqualTo("Tell me about cats")
    }

    @Test
    fun formatFStringDoesNotCascade() {
        // If a value contains {braces}, it should NOT trigger another substitution
        val prompt = Prompt.of(listOf(PromptMessage.human("Value is: {x}")), listOf("x"))

        val result = prompt.invoke(mapOf("x" to "{y}", "y" to "WRONG"))

        assertThat(result.messages[0].template).isEqualTo("Value is: {y}")
    }

    @Test
    fun formatFStringEscapedBraces() {
        // {{ and }} are literal braces, not variable references
        val prompt =
            Prompt.of(listOf(PromptMessage.human("Use {{braces}} and {name} here")), listOf("name"))

        val result = prompt.invoke(mapOf("name" to "Alice"))

        assertThat(result.messages[0].template).isEqualTo("Use {braces} and Alice here")
    }

    @Test
    fun parseMustacheManifest() {
        // A manifest with template_format = "mustache" should be parsed and formatted correctly
        val manifest =
            mapOf(
                "lc" to 1,
                "type" to "constructor",
                "id" to listOf("langchain_core", "prompts", "chat", "ChatPromptTemplate"),
                "kwargs" to
                    mapOf(
                        "input_variables" to listOf("name"),
                        "messages" to
                            listOf(
                                mapOf(
                                    "lc" to 1,
                                    "type" to "constructor",
                                    "id" to
                                        listOf(
                                            "langchain_core",
                                            "prompts",
                                            "chat",
                                            "HumanMessagePromptTemplate",
                                        ),
                                    "kwargs" to
                                        mapOf(
                                            "prompt" to
                                                mapOf(
                                                    "lc" to 1,
                                                    "type" to "constructor",
                                                    "id" to
                                                        listOf(
                                                            "langchain_core",
                                                            "prompts",
                                                            "prompt",
                                                            "PromptTemplate",
                                                        ),
                                                    "kwargs" to
                                                        mapOf(
                                                            "template" to "Hello {{name}}!",
                                                            "template_format" to "mustache",
                                                        ),
                                                )
                                        ),
                                )
                            ),
                    ),
            )

        val parsed = ManifestParser.parse(com.langchain.smith.core.JsonValue.from(manifest))
        val prompt = Prompt.of(parsed.messages, parsed.inputVariables)

        val result = prompt.invoke(mapOf("name" to "Alice"))
        assertThat(result.messages[0].template).isEqualTo("Hello Alice!")
    }

    // --- Structured output tests ---

    private val sampleSchema =
        mapOf<String, Any?>(
            "title" to "JokeResponse",
            "description" to "A structured joke response.",
            "type" to "object",
            "properties" to
                mapOf(
                    "setup" to mapOf("type" to "string"),
                    "punchline" to mapOf("type" to "string"),
                ),
            "required" to listOf("setup", "punchline"),
        )

    @Test
    fun hasOutputSchema_true() {
        val prompt =
            Prompt.of(listOf(PromptMessage.human("Tell me a joke")), emptyList(), sampleSchema)
        assertThat(prompt.hasOutputSchema()).isTrue()
    }

    @Test
    fun hasOutputSchema_false() {
        val prompt = Prompt.of(listOf(PromptMessage.human("Tell me a joke")))
        assertThat(prompt.hasOutputSchema()).isFalse()
    }

    @Test
    fun formatPreservesOutputSchema() {
        val prompt =
            Prompt.of(
                listOf(PromptMessage.human("Tell me about {topic}")),
                listOf("topic"),
                sampleSchema,
            )

        val result = prompt.invoke(mapOf("topic" to "cats"))

        assertThat(result.hasOutputSchema()).isTrue()
        assertThat(result.outputSchema).isEqualTo(sampleSchema)
        assertThat(result.messages[0].template).isEqualTo("Tell me about cats")
    }

    // --- strictSchemaForStructuredOutput ---

    @Test
    @Suppress("UNCHECKED_CAST")
    fun strictSchema_addsAdditionalPropertiesToNestedObjects() {
        val schema =
            mapOf<String, Any?>(
                "type" to "object",
                "properties" to
                    mapOf(
                        "name" to mapOf("type" to "string"),
                        "address" to
                            mapOf(
                                "type" to "object",
                                "properties" to mapOf("street" to mapOf("type" to "string")),
                            ),
                    ),
            )

        val result = strictSchemaForStructuredOutput(schema)

        // Top-level object
        assertThat(result["additionalProperties"]).isEqualTo(false)
        // Nested object in properties
        val address = (result["properties"] as Map<String, Any?>)["address"] as Map<String, Any?>
        assertThat(address["additionalProperties"]).isEqualTo(false)
    }

    @Test
    @Suppress("UNCHECKED_CAST")
    fun strictSchema_recursesIntoArrayItems() {
        val schema =
            mapOf<String, Any?>(
                "type" to "object",
                "properties" to
                    mapOf(
                        "people" to
                            mapOf(
                                "type" to "array",
                                "items" to
                                    mapOf(
                                        "type" to "object",
                                        "properties" to mapOf("name" to mapOf("type" to "string")),
                                    ),
                            )
                    ),
            )

        val result = strictSchemaForStructuredOutput(schema)

        // The object inside array items should also get additionalProperties: false
        val people = (result["properties"] as Map<String, Any?>)["people"] as Map<String, Any?>
        val items = people["items"] as Map<String, Any?>
        assertThat(items["additionalProperties"]).isEqualTo(false)
    }

    @Test
    @Suppress("UNCHECKED_CAST")
    fun strictSchema_recursesIntoAnyOf() {
        val schema =
            mapOf<String, Any?>(
                "anyOf" to
                    listOf(
                        mapOf(
                            "type" to "object",
                            "properties" to mapOf("a" to mapOf("type" to "string")),
                        ),
                        mapOf("type" to "string"),
                    )
            )

        val result = strictSchemaForStructuredOutput(schema)

        val anyOf = result["anyOf"] as List<Map<String, Any?>>
        assertThat(anyOf[0]["additionalProperties"]).isEqualTo(false)
        // String type should not have additionalProperties
        assertThat(anyOf[1]).doesNotContainKey("additionalProperties")
    }

    @Test
    @Suppress("UNCHECKED_CAST")
    fun strictSchema_handlesUnionTypeWithObject() {
        // type can be a list like ["string", "object"]
        val schema =
            mapOf<String, Any?>(
                "type" to "object",
                "properties" to
                    mapOf(
                        "items" to
                            mapOf(
                                "type" to "array",
                                "items" to
                                    mapOf(
                                        "type" to listOf("string", "object"),
                                        "properties" to mapOf("foo" to mapOf("type" to "string")),
                                        "required" to listOf("foo"),
                                    ),
                            )
                    ),
            )

        val result = strictSchemaForStructuredOutput(schema)

        val items = (result["properties"] as Map<String, Any?>)["items"] as Map<String, Any?>
        val arrayItems = items["items"] as Map<String, Any?>
        assertThat(arrayItems["additionalProperties"]).isEqualTo(false)
    }

    @Test
    fun strictSchema_handlesUnionTypeAtTopLevel() {
        val schema =
            mapOf<String, Any?>(
                "type" to listOf("string", "object"),
                "properties" to mapOf("name" to mapOf("type" to "string")),
            )

        val result = strictSchemaForStructuredOutput(schema)

        assertThat(result["additionalProperties"]).isEqualTo(false)
    }

    @Test
    fun strictSchema_ignoresUnionTypeWithoutObject() {
        val schema = mapOf<String, Any?>("type" to listOf("string", "number"))

        val result = strictSchemaForStructuredOutput(schema)

        assertThat(result).doesNotContainKey("additionalProperties")
    }

    @Test
    fun strictSchema_leavesNonObjectSchemasAlone() {
        val schema = mapOf<String, Any?>("type" to "string")

        val result = strictSchemaForStructuredOutput(schema)

        assertThat(result).doesNotContainKey("additionalProperties")
        assertThat(result["type"]).isEqualTo("string")
    }

    // --- Tool, MessagesPlaceholder, and ChatMessage tests ---

    @Test
    fun placeholder_expandsWithPromptMessages() {
        val prompt =
            Prompt.of(
                listOf(
                    PromptMessage.system("You are helpful."),
                    PromptMessage.placeholder("chat_history"),
                    PromptMessage.human("{input}"),
                ),
                listOf("chat_history", "input"),
            )

        val chatHistory =
            listOf(PromptMessage.human("Hi"), PromptMessage.ai("Hello! How can I help?"))
        val pv = prompt.invoke(mapOf("chat_history" to chatHistory, "input" to "What is 2+2?"))

        assertThat(pv.messages).hasSize(4)
        assertThat(pv.messages[0].role).isEqualTo(PromptMessage.Role.SYSTEM)
        assertThat(pv.messages[0].template).isEqualTo("You are helpful.")
        assertThat(pv.messages[1].role).isEqualTo(PromptMessage.Role.HUMAN)
        assertThat(pv.messages[1].template).isEqualTo("Hi")
        assertThat(pv.messages[2].role).isEqualTo(PromptMessage.Role.AI)
        assertThat(pv.messages[2].template).isEqualTo("Hello! How can I help?")
        assertThat(pv.messages[3].role).isEqualTo(PromptMessage.Role.HUMAN)
        assertThat(pv.messages[3].template).isEqualTo("What is 2+2?")
    }

    @Test
    fun placeholder_expandsWithMaps() {
        val prompt =
            Prompt.of(
                listOf(PromptMessage.placeholder("history"), PromptMessage.human("Next question")),
                listOf("history"),
            )

        val history =
            listOf(
                mapOf("role" to "user", "content" to "Hello"),
                mapOf("role" to "assistant", "content" to "Hi there"),
            )
        val pv = prompt.invoke(mapOf("history" to history))

        assertThat(pv.messages).hasSize(3)
        assertThat(pv.messages[0].role).isEqualTo(PromptMessage.Role.HUMAN)
        assertThat(pv.messages[0].template).isEqualTo("Hello")
        assertThat(pv.messages[1].role).isEqualTo(PromptMessage.Role.AI)
        assertThat(pv.messages[1].template).isEqualTo("Hi there")
        assertThat(pv.messages[2].role).isEqualTo(PromptMessage.Role.HUMAN)
        assertThat(pv.messages[2].template).isEqualTo("Next question")
    }

    @Test
    fun placeholder_missingVariableDropsSilently() {
        val prompt =
            Prompt.of(
                listOf(
                    PromptMessage.system("System"),
                    PromptMessage.placeholder("missing_var"),
                    PromptMessage.human("Hello"),
                )
            )

        val pv = prompt.invoke()

        // Placeholder is dropped, other messages remain
        assertThat(pv.messages).hasSize(2)
        assertThat(pv.messages[0].role).isEqualTo(PromptMessage.Role.SYSTEM)
        assertThat(pv.messages[1].role).isEqualTo(PromptMessage.Role.HUMAN)
    }

    @Test
    fun placeholder_emptyListExpandsToNothing() {
        val prompt =
            Prompt.of(
                listOf(PromptMessage.placeholder("history"), PromptMessage.human("Hello")),
                listOf("history"),
            )

        val pv = prompt.invoke(mapOf("history" to emptyList<PromptMessage>()))

        assertThat(pv.messages).hasSize(1)
        assertThat(pv.messages[0].template).isEqualTo("Hello")
    }
}

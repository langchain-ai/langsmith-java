package com.langchain.smith.prompts

import com.langchain.smith.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

internal class ManifestParserTest {

    /** Builds a typical LangChain ChatPromptTemplate manifest as a map structure. */
    private fun buildChatPromptManifest(
        messages: List<Map<String, Any>>,
        inputVariables: List<String> = emptyList(),
    ): Map<String, Any> =
        mapOf(
            "lc" to 1,
            "type" to "constructor",
            "id" to listOf("langchain_core", "prompts", "chat", "ChatPromptTemplate"),
            "kwargs" to mapOf("input_variables" to inputVariables, "messages" to messages),
        )

    /** Builds a message prompt template entry with a nested prompt object. */
    private fun buildMessageTemplate(className: String, template: String): Map<String, Any> =
        mapOf(
            "lc" to 1,
            "type" to "constructor",
            "id" to listOf("langchain_core", "prompts", "chat", className),
            "kwargs" to
                mapOf(
                    "prompt" to
                        mapOf(
                            "lc" to 1,
                            "type" to "constructor",
                            "id" to listOf("langchain_core", "prompts", "prompt", "PromptTemplate"),
                            "kwargs" to mapOf("template" to template),
                        )
                ),
        )

    @Test
    fun parseChatPromptTemplate() {
        val manifest =
            buildChatPromptManifest(
                messages =
                    listOf(
                        buildMessageTemplate(
                            "SystemMessagePromptTemplate",
                            "You are a helpful assistant.",
                        ),
                        buildMessageTemplate("HumanMessagePromptTemplate", "Tell me about {topic}"),
                    ),
                inputVariables = listOf("topic"),
            )

        val result = ManifestParser.parse(JsonValue.from(manifest))

        assertThat(result.messages).hasSize(2)
        assertThat(result.messages[0].role).isEqualTo(PromptMessage.Role.SYSTEM)
        assertThat(result.messages[0].template).isEqualTo("You are a helpful assistant.")
        assertThat(result.messages[1].role).isEqualTo(PromptMessage.Role.HUMAN)
        assertThat(result.messages[1].template).isEqualTo("Tell me about {topic}")
        assertThat(result.inputVariables).containsExactly("topic")
    }

    @Test
    fun parseChatPromptTemplateWithAiMessage() {
        val manifest =
            buildChatPromptManifest(
                messages =
                    listOf(
                        buildMessageTemplate(
                            "SystemMessagePromptTemplate",
                            "You are an assistant.",
                        ),
                        buildMessageTemplate("HumanMessagePromptTemplate", "Hello"),
                        buildMessageTemplate(
                            "AIMessagePromptTemplate",
                            "Hi there! How can I help?",
                        ),
                        buildMessageTemplate("HumanMessagePromptTemplate", "Tell me about {topic}"),
                    ),
                inputVariables = listOf("topic"),
            )

        val result = ManifestParser.parse(JsonValue.from(manifest))

        assertThat(result.messages).hasSize(4)
        assertThat(result.messages[0].role).isEqualTo(PromptMessage.Role.SYSTEM)
        assertThat(result.messages[1].role).isEqualTo(PromptMessage.Role.HUMAN)
        assertThat(result.messages[2].role).isEqualTo(PromptMessage.Role.AI)
        assertThat(result.messages[2].template).isEqualTo("Hi there! How can I help?")
        assertThat(result.messages[3].role).isEqualTo(PromptMessage.Role.HUMAN)
    }

    @Test
    fun parsePromptTemplate() {
        val manifest =
            mapOf(
                "lc" to 1,
                "type" to "constructor",
                "id" to listOf("langchain_core", "prompts", "prompt", "PromptTemplate"),
                "kwargs" to
                    mapOf(
                        "template" to "Tell me a joke about {topic}",
                        "input_variables" to listOf("topic"),
                    ),
            )

        val result = ManifestParser.parse(JsonValue.from(manifest))

        assertThat(result.messages).hasSize(1)
        assertThat(result.messages[0].role).isEqualTo(PromptMessage.Role.HUMAN)
        assertThat(result.messages[0].template).isEqualTo("Tell me a joke about {topic}")
        assertThat(result.inputVariables).containsExactly("topic")
    }

    @Test
    fun parseDirectTemplateInKwargs() {
        // Some manifests have the template directly in the message kwargs,
        // not nested in a "prompt" sub-object
        val manifest =
            buildChatPromptManifest(
                messages =
                    listOf(
                        mapOf(
                            "lc" to 1,
                            "type" to "constructor",
                            "id" to
                                listOf(
                                    "langchain_core",
                                    "prompts",
                                    "chat",
                                    "SystemMessagePromptTemplate",
                                ),
                            "kwargs" to mapOf("template" to "Direct template text"),
                        )
                    )
            )

        val result = ManifestParser.parse(JsonValue.from(manifest))

        assertThat(result.messages).hasSize(1)
        assertThat(result.messages[0].role).isEqualTo(PromptMessage.Role.SYSTEM)
        assertThat(result.messages[0].template).isEqualTo("Direct template text")
    }

    @Test
    fun parseManifestWithoutExplicitId() {
        // Falls back to detecting type from kwargs structure
        val manifest =
            mapOf(
                "lc" to 1,
                "type" to "constructor",
                "id" to listOf<String>(), // empty id
                "kwargs" to
                    mapOf(
                        "messages" to
                            listOf(
                                buildMessageTemplate("HumanMessagePromptTemplate", "Hello {name}")
                            ),
                        "input_variables" to listOf("name"),
                    ),
            )

        val result = ManifestParser.parse(JsonValue.from(manifest))

        assertThat(result.messages).hasSize(1)
        assertThat(result.messages[0].template).isEqualTo("Hello {name}")
    }

    /** Builds a StructuredPrompt manifest with messages and an output schema. */
    private fun buildStructuredPromptManifest(
        messages: List<Map<String, Any>>,
        inputVariables: List<String> = emptyList(),
        schema: Map<String, Any>,
    ): Map<String, Any> =
        mapOf(
            "lc" to 1,
            "type" to "constructor",
            "id" to listOf("langchain", "prompts", "structured", "StructuredPrompt"),
            "kwargs" to
                mapOf(
                    "input_variables" to inputVariables,
                    "messages" to messages,
                    "schema_" to schema,
                ),
        )

    private val sampleSchema =
        mapOf<String, Any>(
            "title" to "JokeResponse",
            "description" to "A structured joke response.",
            "type" to "object",
            "properties" to
                mapOf(
                    "setup" to mapOf("type" to "string", "description" to "The joke setup"),
                    "punchline" to mapOf("type" to "string", "description" to "The punchline"),
                ),
            "required" to listOf("setup", "punchline"),
        )

    @Test
    fun parseStructuredPrompt() {
        val manifest =
            buildStructuredPromptManifest(
                messages =
                    listOf(
                        buildMessageTemplate("SystemMessagePromptTemplate", "You tell jokes."),
                        buildMessageTemplate(
                            "HumanMessagePromptTemplate",
                            "Tell me a joke about {topic}",
                        ),
                    ),
                inputVariables = listOf("topic"),
                schema = sampleSchema,
            )

        val result = ManifestParser.parse(JsonValue.from(manifest))

        assertThat(result.messages).hasSize(2)
        assertThat(result.messages[0].role).isEqualTo(PromptMessage.Role.SYSTEM)
        assertThat(result.messages[0].template).isEqualTo("You tell jokes.")
        assertThat(result.messages[1].role).isEqualTo(PromptMessage.Role.HUMAN)
        assertThat(result.messages[1].template).isEqualTo("Tell me a joke about {topic}")
        assertThat(result.inputVariables).containsExactly("topic")
        assertThat(result.hasOutputSchema()).isTrue()
        assertThat(result.outputSchema).isNotNull()
        assertThat(result.outputSchema!!["title"]).isEqualTo("JokeResponse")
        assertThat(result.outputSchema!!["type"]).isEqualTo("object")
        @Suppress("UNCHECKED_CAST")
        val properties = result.outputSchema!!["properties"] as Map<String, Any?>
        assertThat(properties).containsKey("setup")
        assertThat(properties).containsKey("punchline")
    }

    @Test
    fun parseStructuredPromptWithSchemaKeyword() {
        // Some manifests use "schema" instead of "schema_"
        val manifest =
            mapOf(
                "lc" to 1,
                "type" to "constructor",
                "id" to listOf("langchain", "prompts", "structured", "StructuredPrompt"),
                "kwargs" to
                    mapOf(
                        "input_variables" to listOf("topic"),
                        "messages" to
                            listOf(
                                buildMessageTemplate(
                                    "HumanMessagePromptTemplate",
                                    "Tell me about {topic}",
                                )
                            ),
                        "schema" to sampleSchema,
                    ),
            )

        val result = ManifestParser.parse(JsonValue.from(manifest))

        assertThat(result.hasOutputSchema()).isTrue()
        assertThat(result.outputSchema!!["title"]).isEqualTo("JokeResponse")
    }

    @Test
    fun parseStructuredPromptDetectedFromKwargs() {
        // Fallback: no StructuredPrompt in id, but has messages + schema_
        val manifest =
            mapOf(
                "lc" to 1,
                "type" to "constructor",
                "id" to listOf<String>(), // empty id
                "kwargs" to
                    mapOf(
                        "messages" to
                            listOf(
                                buildMessageTemplate(
                                    "HumanMessagePromptTemplate",
                                    "Extract info from {text}",
                                )
                            ),
                        "input_variables" to listOf("text"),
                        "schema_" to sampleSchema,
                    ),
            )

        val result = ManifestParser.parse(JsonValue.from(manifest))

        assertThat(result.messages).hasSize(1)
        assertThat(result.hasOutputSchema()).isTrue()
        assertThat(result.outputSchema!!["title"]).isEqualTo("JokeResponse")
    }

    @Test
    fun parseRegularChatPromptHasNoSchema() {
        val manifest =
            buildChatPromptManifest(
                messages = listOf(buildMessageTemplate("HumanMessagePromptTemplate", "Hello"))
            )

        val result = ManifestParser.parse(JsonValue.from(manifest))

        assertThat(result.hasOutputSchema()).isFalse()
        assertThat(result.outputSchema).isNull()
    }

    @Test
    fun parseStructuredPromptPreservesNestedSchema() {
        // Schema with nested objects and arrays
        val nestedSchema =
            mapOf<String, Any>(
                "title" to "PersonInfo",
                "type" to "object",
                "properties" to
                    mapOf(
                        "name" to mapOf("type" to "string"),
                        "age" to mapOf("type" to "integer"),
                        "hobbies" to mapOf("type" to "array", "items" to mapOf("type" to "string")),
                        "address" to
                            mapOf(
                                "type" to "object",
                                "properties" to
                                    mapOf(
                                        "street" to mapOf("type" to "string"),
                                        "city" to mapOf("type" to "string"),
                                    ),
                            ),
                    ),
                "required" to listOf("name", "age"),
            )

        val manifest =
            buildStructuredPromptManifest(
                messages =
                    listOf(buildMessageTemplate("HumanMessagePromptTemplate", "Extract: {text}")),
                inputVariables = listOf("text"),
                schema = nestedSchema,
            )

        val result = ManifestParser.parse(JsonValue.from(manifest))

        assertThat(result.hasOutputSchema()).isTrue()
        assertThat(result.outputSchema!!["title"]).isEqualTo("PersonInfo")
        @Suppress("UNCHECKED_CAST")
        val properties = result.outputSchema!!["properties"] as Map<String, Any?>
        assertThat(properties).containsKeys("name", "age", "hobbies", "address")
        @Suppress("UNCHECKED_CAST") val hobbies = properties["hobbies"] as Map<String, Any?>
        assertThat(hobbies["type"]).isEqualTo("array")
    }

    // --- Tool, MessagesPlaceholder, and ChatMessage tests ---

    @Test
    fun parseToolMessagePromptTemplate() {
        val manifest =
            buildChatPromptManifest(
                messages =
                    listOf(
                        buildMessageTemplate("HumanMessagePromptTemplate", "Use the tool"),
                        mapOf(
                            "lc" to 1,
                            "type" to "constructor",
                            "id" to
                                listOf(
                                    "langchain_core",
                                    "prompts",
                                    "chat",
                                    "ToolMessagePromptTemplate",
                                ),
                            "kwargs" to
                                mapOf(
                                    "template" to "Tool result: {result}",
                                    "tool_call_id" to "call_abc123",
                                ),
                        ),
                    ),
                inputVariables = listOf("result"),
            )

        val result = ManifestParser.parse(JsonValue.from(manifest))

        assertThat(result.messages).hasSize(2)
        assertThat(result.messages[0].role).isEqualTo(PromptMessage.Role.HUMAN)
        assertThat(result.messages[1].role).isEqualTo(PromptMessage.Role.TOOL)
        assertThat(result.messages[1].template).isEqualTo("Tool result: {result}")
        assertThat(result.messages[1].toolCallId).isEqualTo("call_abc123")
    }

    @Test
    fun parseToolMessageWithoutToolCallId() {
        val manifest =
            buildChatPromptManifest(
                messages =
                    listOf(
                        mapOf(
                            "lc" to 1,
                            "type" to "constructor",
                            "id" to
                                listOf(
                                    "langchain_core",
                                    "prompts",
                                    "chat",
                                    "ToolMessagePromptTemplate",
                                ),
                            "kwargs" to mapOf("template" to "Result text"),
                        )
                    )
            )

        val result = ManifestParser.parse(JsonValue.from(manifest))

        assertThat(result.messages).hasSize(1)
        assertThat(result.messages[0].role).isEqualTo(PromptMessage.Role.TOOL)
        assertThat(result.messages[0].toolCallId).isNull()
    }

    @Test
    fun parseMessagesPlaceholder() {
        val manifest =
            buildChatPromptManifest(
                messages =
                    listOf(
                        buildMessageTemplate("SystemMessagePromptTemplate", "You are helpful."),
                        mapOf(
                            "lc" to 1,
                            "type" to "constructor",
                            "id" to
                                listOf("langchain_core", "prompts", "chat", "MessagesPlaceholder"),
                            "kwargs" to mapOf("variable_name" to "chat_history"),
                        ),
                        buildMessageTemplate("HumanMessagePromptTemplate", "{input}"),
                    ),
                inputVariables = listOf("chat_history", "input"),
            )

        val result = ManifestParser.parse(JsonValue.from(manifest))

        assertThat(result.messages).hasSize(3)
        assertThat(result.messages[0].role).isEqualTo(PromptMessage.Role.SYSTEM)
        assertThat(result.messages[1].role).isEqualTo(PromptMessage.Role.PLACEHOLDER)
        assertThat(result.messages[1].template).isEqualTo("chat_history")
        assertThat(result.messages[1].isPlaceholder()).isTrue()
        assertThat(result.messages[2].role).isEqualTo(PromptMessage.Role.HUMAN)
    }

    @Test
    fun parseChatMessagePromptTemplate() {
        val manifest =
            buildChatPromptManifest(
                messages =
                    listOf(
                        mapOf(
                            "lc" to 1,
                            "type" to "constructor",
                            "id" to
                                listOf(
                                    "langchain_core",
                                    "prompts",
                                    "chat",
                                    "ChatMessagePromptTemplate",
                                ),
                            "kwargs" to
                                mapOf("template" to "Narrating: {scene}", "role" to "narrator"),
                        )
                    ),
                inputVariables = listOf("scene"),
            )

        val result = ManifestParser.parse(JsonValue.from(manifest))

        assertThat(result.messages).hasSize(1)
        assertThat(result.messages[0].role).isEqualTo(PromptMessage.Role.CHAT)
        assertThat(result.messages[0].template).isEqualTo("Narrating: {scene}")
        assertThat(result.messages[0].customRole).isEqualTo("narrator")
    }

    @Test
    fun parseChatMessageWithoutRole() {
        val manifest =
            buildChatPromptManifest(
                messages =
                    listOf(
                        mapOf(
                            "lc" to 1,
                            "type" to "constructor",
                            "id" to
                                listOf(
                                    "langchain_core",
                                    "prompts",
                                    "chat",
                                    "ChatMessagePromptTemplate",
                                ),
                            "kwargs" to mapOf("template" to "Just text"),
                        )
                    )
            )

        val result = ManifestParser.parse(JsonValue.from(manifest))

        assertThat(result.messages).hasSize(1)
        assertThat(result.messages[0].role).isEqualTo(PromptMessage.Role.CHAT)
        assertThat(result.messages[0].customRole).isNull()
    }

    @Test
    fun parseInvalidManifestThrows() {
        assertThatThrownBy { ManifestParser.parse(JsonValue.from("not an object")) }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("must be a JSON object")
    }

    @Test
    fun parseUnrecognizedTypeThrows() {
        val manifest =
            mapOf(
                "lc" to 1,
                "type" to "constructor",
                "id" to listOf("langchain_core", "something", "Unknown"),
                "kwargs" to mapOf<String, Any>(),
            )

        assertThatThrownBy { ManifestParser.parse(JsonValue.from(manifest)) }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("Unrecognized manifest type")
    }
}

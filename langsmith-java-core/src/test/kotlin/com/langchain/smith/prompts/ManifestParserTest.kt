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
    fun parseLegacyPromptTemplateWithTemplateFormat() {
        // Legacy PromptTemplate format with template_format field
        val manifest =
            mapOf(
                "lc" to 1,
                "type" to "constructor",
                "id" to listOf("langchain_core", "prompts", "prompt", "PromptTemplate"),
                "kwargs" to
                    mapOf(
                        "input_variables" to listOf("input"),
                        "template_format" to "f-string",
                        "template" to
                            "You are a parrot. The current date is 2026-03-29T14:26:33.834Z\n{input}",
                    ),
            )

        val result = ManifestParser.parse(JsonValue.from(manifest))

        assertThat(result.messages).hasSize(1)
        assertThat(result.messages[0].role).isEqualTo(PromptMessage.Role.HUMAN)
        assertThat(result.messages[0].template)
            .isEqualTo("You are a parrot. The current date is 2026-03-29T14:26:33.834Z\n{input}")
        assertThat(result.messages[0].templateFormat).isEqualTo("f-string")
        assertThat(result.inputVariables).containsExactly("input")
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
    fun parseDirectTemplateWithTemplateFormat() {
        // Test that template_format is preserved in direct template pattern
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
                                    "HumanMessagePromptTemplate",
                                ),
                            "kwargs" to
                                mapOf(
                                    "template" to "Hello {{name}}",
                                    "template_format" to "mustache",
                                ),
                        )
                    ),
                inputVariables = listOf("name"),
            )

        val result = ManifestParser.parse(JsonValue.from(manifest))

        assertThat(result.messages).hasSize(1)
        assertThat(result.messages[0].role).isEqualTo(PromptMessage.Role.HUMAN)
        assertThat(result.messages[0].template).isEqualTo("Hello {{name}}")
        assertThat(result.messages[0].templateFormat).isEqualTo("mustache")
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

    // --- Real-world playground manifest ---

    @Test
    fun parsePlaygroundManifestWithAllFeatures() {
        // Exact manifest from LangSmith playground: StructuredPrompt with mustache,
        // AI message, MessagesPlaceholder, and a raw ToolMessage (not a template)
        val manifest =
            mapOf(
                "lc" to 1,
                "type" to "constructor",
                "id" to listOf("langchain_core", "prompts", "structured", "StructuredPrompt"),
                "kwargs" to
                    mapOf(
                        "messages" to
                            listOf(
                                mapOf(
                                    "lc" to 1,
                                    "type" to "constructor",
                                    "id" to
                                        listOf(
                                            "langchain",
                                            "prompts",
                                            "chat",
                                            "SystemMessagePromptTemplate",
                                        ),
                                    "kwargs" to
                                        mapOf(
                                            "prompt" to
                                                mapOf(
                                                    "lc" to 1,
                                                    "type" to "constructor",
                                                    "id" to
                                                        listOf(
                                                            "langchain",
                                                            "prompts",
                                                            "prompt",
                                                            "PromptTemplate",
                                                        ),
                                                    "kwargs" to
                                                        mapOf(
                                                            "input_variables" to
                                                                emptyList<String>(),
                                                            "template_format" to "mustache",
                                                            "template" to "You are a chatbot.",
                                                        ),
                                                )
                                        ),
                                ),
                                mapOf(
                                    "lc" to 1,
                                    "type" to "constructor",
                                    "id" to
                                        listOf(
                                            "langchain",
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
                                                            "langchain",
                                                            "prompts",
                                                            "prompt",
                                                            "PromptTemplate",
                                                        ),
                                                    "kwargs" to
                                                        mapOf(
                                                            "input_variables" to listOf("question"),
                                                            "template_format" to "mustache",
                                                            "template" to "{{question}}",
                                                        ),
                                                )
                                        ),
                                ),
                                mapOf(
                                    "lc" to 1,
                                    "type" to "constructor",
                                    "id" to
                                        listOf(
                                            "langchain",
                                            "prompts",
                                            "chat",
                                            "AIMessagePromptTemplate",
                                        ),
                                    "kwargs" to
                                        mapOf(
                                            "prompt" to
                                                mapOf(
                                                    "lc" to 1,
                                                    "type" to "constructor",
                                                    "id" to
                                                        listOf(
                                                            "langchain",
                                                            "prompts",
                                                            "prompt",
                                                            "PromptTemplate",
                                                        ),
                                                    "kwargs" to
                                                        mapOf(
                                                            "input_variables" to
                                                                emptyList<String>(),
                                                            "template_format" to "mustache",
                                                            "template" to "ee",
                                                        ),
                                                )
                                        ),
                                ),
                                mapOf(
                                    "lc" to 1,
                                    "type" to "constructor",
                                    "id" to
                                        listOf(
                                            "langchain_core",
                                            "prompts",
                                            "chat",
                                            "MessagesPlaceholder",
                                        ),
                                    "kwargs" to mapOf("variable_name" to "foo"),
                                ),
                                mapOf(
                                    "lc" to 1,
                                    "type" to "constructor",
                                    "id" to listOf("langchain_core", "messages", "ToolMessage"),
                                    "kwargs" to
                                        mapOf(
                                            "content" to """{"haha":"ha"}""",
                                            "tool_call_id" to "333",
                                            "name" to "112",
                                            "additional_kwargs" to emptyMap<String, Any>(),
                                            "response_metadata" to emptyMap<String, Any>(),
                                        ),
                                ),
                            ),
                        "input_variables" to listOf("question", "foo"),
                        "template_format" to "mustache",
                        "schema_" to
                            mapOf(
                                "title" to "extract",
                                "description" to "Extract information from the user's response.",
                                "type" to "object",
                                "properties" to
                                    mapOf(
                                        "correctness" to
                                            mapOf(
                                                "type" to "boolean",
                                                "description" to
                                                    "Is the submission correct, accurate, and factual?",
                                            )
                                    ),
                                "required" to listOf("correctness"),
                            ),
                    ),
            )

        val result = ManifestParser.parse(JsonValue.from(manifest))

        // 5 messages: system, human, ai, placeholder, tool
        assertThat(result.messages).hasSize(5)

        // System message (mustache, no variables)
        assertThat(result.messages[0].role).isEqualTo(PromptMessage.Role.SYSTEM)
        assertThat(result.messages[0].template).isEqualTo("You are a chatbot.")
        assertThat(result.messages[0].templateFormat).isEqualTo("mustache")

        // Human message (mustache with variable)
        assertThat(result.messages[1].role).isEqualTo(PromptMessage.Role.HUMAN)
        assertThat(result.messages[1].template).isEqualTo("{{question}}")
        assertThat(result.messages[1].templateFormat).isEqualTo("mustache")

        // AI message
        assertThat(result.messages[2].role).isEqualTo(PromptMessage.Role.AI)
        assertThat(result.messages[2].template).isEqualTo("ee")

        // MessagesPlaceholder
        assertThat(result.messages[3].isPlaceholder()).isTrue()
        assertThat(result.messages[3].template).isEqualTo("foo")

        // Raw ToolMessage (not a prompt template — uses "content" field)
        assertThat(result.messages[4].role).isEqualTo(PromptMessage.Role.TOOL)
        assertThat(result.messages[4].template).isEqualTo("""{"haha":"ha"}""")
        assertThat(result.messages[4].toolCallId).isEqualTo("333")

        // Structured output schema
        assertThat(result.hasOutputSchema()).isTrue()
        assertThat(result.outputSchema!!["title"]).isEqualTo("extract")

        // Input variables
        assertThat(result.inputVariables).containsExactly("question", "foo")

        // End-to-end: invoke with variables and expand placeholder
        val prompt = Prompt.of(result.messages, result.inputVariables, result.outputSchema)
        val formatted =
            prompt.invoke(
                mapOf(
                    "question" to "Is 2+2=4?",
                    "foo" to
                        listOf(
                            PromptMessage.human("prior message"),
                            PromptMessage.ai("prior response"),
                        ),
                )
            )

        // Placeholder expanded: system, human, ai, human(prior), ai(prior), tool = 6 messages
        assertThat(formatted.messages).hasSize(6)
        assertThat(formatted.messages[0].template).isEqualTo("You are a chatbot.")
        assertThat(formatted.messages[1].template).isEqualTo("Is 2+2=4?") // mustache substituted
        assertThat(formatted.messages[2].template).isEqualTo("ee")
        assertThat(formatted.messages[3].template)
            .isEqualTo("prior message") // expanded from placeholder
        assertThat(formatted.messages[4].template).isEqualTo("prior response")
        assertThat(formatted.messages[5].template)
            .isEqualTo("""{"haha":"ha"}""") // tool message preserved
        assertThat(formatted.hasOutputSchema()).isTrue()
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

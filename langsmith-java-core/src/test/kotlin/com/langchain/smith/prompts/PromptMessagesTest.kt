package com.langchain.smith.prompts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

/**
 * Tests the public prompt API: [Prompt.of] → [Prompt.invoke] → [convertPromptToOpenAI] /
 * [convertPromptToAnthropic].
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

    // --- convertPromptToOpenAI ---

    @Test
    fun toOpenAiMessages() {
        val prompt =
            Prompt.of(
                listOf(
                    PromptMessage.system("You are helpful."),
                    PromptMessage.human("What is 2+2?"),
                    PromptMessage.ai("2+2 is 4."),
                    PromptMessage.human("And 3+3?"),
                )
            )

        val pv = prompt.invoke()
        val openAi = convertPromptToOpenAI(pv)

        assertThat(openAi.messages).hasSize(4)
        assertThat(openAi.messages[0])
            .isEqualTo(mapOf("role" to "system", "content" to "You are helpful."))
        assertThat(openAi.messages[1])
            .isEqualTo(mapOf("role" to "user", "content" to "What is 2+2?"))
        assertThat(openAi.messages[2])
            .isEqualTo(mapOf("role" to "assistant", "content" to "2+2 is 4."))
        assertThat(openAi.messages[3]).isEqualTo(mapOf("role" to "user", "content" to "And 3+3?"))
    }

    // --- convertPromptToAnthropic ---

    @Test
    fun toAnthropicPayload_extractsSystem() {
        val prompt =
            Prompt.of(
                listOf(
                    PromptMessage.system("You are a joke teller."),
                    PromptMessage.human("Tell me a joke about cats"),
                )
            )

        val pv = prompt.invoke()
        val payload = convertPromptToAnthropic(pv)

        assertThat(payload.system).isEqualTo("You are a joke teller.")
        assertThat(payload.messages).hasSize(1)
        assertThat(payload.messages[0])
            .isEqualTo(mapOf("role" to "user", "content" to "Tell me a joke about cats"))
    }

    @Test
    fun toAnthropicPayload_multipleSystemMessages() {
        val prompt =
            Prompt.of(
                listOf(
                    PromptMessage.system("You are helpful."),
                    PromptMessage.system("Always be concise."),
                    PromptMessage.human("Hello"),
                )
            )

        val pv = prompt.invoke()
        val payload = convertPromptToAnthropic(pv)

        assertThat(payload.system).isEqualTo("You are helpful.\nAlways be concise.")
        assertThat(payload.messages).hasSize(1)
    }

    @Test
    fun toAnthropicPayload_noSystemMessages() {
        val prompt = Prompt.of(listOf(PromptMessage.human("Hello"), PromptMessage.ai("Hi there!")))

        val pv = prompt.invoke()
        val payload = convertPromptToAnthropic(pv)

        assertThat(payload.system).isEmpty()
        assertThat(payload.messages).hasSize(2)
        assertThat(payload.messages[0]["role"]).isEqualTo("user")
        assertThat(payload.messages[1]["role"]).isEqualTo("assistant")
    }

    @Test
    fun toAnthropicPayload_preservesMessageOrder() {
        val prompt =
            Prompt.of(
                listOf(
                    PromptMessage.system("Be helpful."),
                    PromptMessage.human("Question 1"),
                    PromptMessage.ai("Answer 1"),
                    PromptMessage.human("Question 2"),
                )
            )

        val pv = prompt.invoke()
        val payload = convertPromptToAnthropic(pv)

        assertThat(payload.system).isEqualTo("Be helpful.")
        assertThat(payload.messages).hasSize(3)
        assertThat(payload.messages[0])
            .isEqualTo(mapOf("role" to "user", "content" to "Question 1"))
        assertThat(payload.messages[1])
            .isEqualTo(mapOf("role" to "assistant", "content" to "Answer 1"))
        assertThat(payload.messages[2])
            .isEqualTo(mapOf("role" to "user", "content" to "Question 2"))
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

    @Test
    fun toOpenAiPayload_withoutSchema() {
        val prompt =
            Prompt.of(
                listOf(PromptMessage.system("You are helpful."), PromptMessage.human("Hello"))
            )

        val pv = prompt.invoke()
        val payload = convertPromptToOpenAI(pv)

        assertThat(payload.hasOutputSchema()).isFalse()
        assertThat(payload.outputSchema).isNull()
        assertThat(payload.messages).hasSize(2)
        assertThat(payload.messages[0])
            .isEqualTo(mapOf("role" to "system", "content" to "You are helpful."))
        assertThat(payload.messages[1]).isEqualTo(mapOf("role" to "user", "content" to "Hello"))
    }

    @Test
    @Suppress("UNCHECKED_CAST")
    fun toOpenAiPayload_withSchema() {
        val prompt =
            Prompt.of(
                listOf(
                    PromptMessage.system("You tell jokes."),
                    PromptMessage.human("Tell me a joke about cats"),
                ),
                emptyList(),
                sampleSchema,
            )

        val pv = prompt.invoke()
        val payload = convertPromptToOpenAI(pv)

        assertThat(payload.hasOutputSchema()).isTrue()
        assertThat(payload.messages).hasSize(2)
        assertThat(payload.outputSchema).isEqualTo(sampleSchema)
    }

    @Test
    @Suppress("UNCHECKED_CAST")
    fun toAnthropicPayload_withSchema() {
        val prompt =
            Prompt.of(
                listOf(
                    PromptMessage.system("You tell jokes."),
                    PromptMessage.human("Tell me a joke about cats"),
                ),
                emptyList(),
                sampleSchema,
            )

        val pv = prompt.invoke()
        val payload = convertPromptToAnthropic(pv)

        assertThat(payload.hasOutputSchema()).isTrue()
        assertThat(payload.system).isEqualTo("You tell jokes.")
        assertThat(payload.messages).hasSize(1)
        assertThat(payload.outputSchema).isEqualTo(sampleSchema)
    }

    @Test
    fun toAnthropicPayload_withoutSchema() {
        val prompt = Prompt.of(listOf(PromptMessage.human("Hello")))

        val pv = prompt.invoke()
        val payload = convertPromptToAnthropic(pv)

        assertThat(payload.hasOutputSchema()).isFalse()
        assertThat(payload.outputSchema).isNull()
    }

    // --- End-to-end tests ---

    @Test
    fun endToEndParsing() {
        // Simulate what a user would do: create prompt → format → convert
        val prompt =
            Prompt.of(
                listOf(
                    PromptMessage.system("You are a helpful assistant that tells jokes."),
                    PromptMessage.human("Tell me a joke about {topic}"),
                ),
                listOf("topic"),
            )

        val pv = prompt.invoke(mapOf("topic" to "cats"))

        // OpenAI format
        val openAi = convertPromptToOpenAI(pv)
        assertThat(openAi.messages).hasSize(2)
        assertThat(openAi.messages[0]["role"]).isEqualTo("system")
        assertThat(openAi.messages[0]["content"])
            .isEqualTo("You are a helpful assistant that tells jokes.")
        assertThat(openAi.messages[1]["role"]).isEqualTo("user")
        assertThat(openAi.messages[1]["content"]).isEqualTo("Tell me a joke about cats")

        // Anthropic format
        val anthropic = convertPromptToAnthropic(pv)
        assertThat(anthropic.system).isEqualTo("You are a helpful assistant that tells jokes.")
        assertThat(anthropic.messages).hasSize(1)
        assertThat(anthropic.messages[0]["role"]).isEqualTo("user")
        assertThat(anthropic.messages[0]["content"]).isEqualTo("Tell me a joke about cats")
    }

    @Test
    @Suppress("UNCHECKED_CAST")
    fun endToEndStructuredPrompt() {
        // Simulate structured prompt: create → format → convert to both providers
        val prompt =
            Prompt.of(
                listOf(
                    PromptMessage.system("You extract structured data."),
                    PromptMessage.human("Extract info from: {text}"),
                ),
                listOf("text"),
                sampleSchema,
            )

        val pv = prompt.invoke(mapOf("text" to "Alice is 30"))

        // OpenAI: should have output schema
        val openAi = convertPromptToOpenAI(pv)
        assertThat(openAi.hasOutputSchema()).isTrue()
        assertThat(openAi.messages).hasSize(2)
        assertThat(openAi.outputSchema!!["title"]).isEqualTo("JokeResponse")

        // Anthropic: should have output schema
        val anthropic = convertPromptToAnthropic(pv)
        assertThat(anthropic.hasOutputSchema()).isTrue()
        assertThat(anthropic.system).isEqualTo("You extract structured data.")
        assertThat(anthropic.messages).hasSize(1)
        assertThat(anthropic.messages[0]["content"]).isEqualTo("Extract info from: Alice is 30")
        assertThat(anthropic.outputSchema!!["title"]).isEqualTo("JokeResponse")
    }

    // --- Tool, MessagesPlaceholder, and ChatMessage tests ---

    @Test
    fun toolMessage_openAiConversion() {
        val prompt =
            Prompt.of(
                listOf(
                    PromptMessage.human("Use the tool"),
                    PromptMessage.tool("Result: 42", "call_abc123"),
                )
            )

        val pv = prompt.invoke()
        val openAi = convertPromptToOpenAI(pv)

        assertThat(openAi.messages).hasSize(2)
        assertThat(openAi.messages[1]["role"]).isEqualTo("tool")
        assertThat(openAi.messages[1]["content"]).isEqualTo("Result: 42")
        assertThat(openAi.messages[1]["tool_call_id"]).isEqualTo("call_abc123")
    }

    @Test
    fun toolMessage_anthropicConversion() {
        val prompt =
            Prompt.of(
                listOf(
                    PromptMessage.human("Use the tool"),
                    PromptMessage.tool("Result: 42", "call_abc123"),
                )
            )

        val pv = prompt.invoke()
        val anthropic = convertPromptToAnthropic(pv)

        // Anthropic doesn't have a tool role — mapped to user
        assertThat(anthropic.messages).hasSize(2)
        assertThat(anthropic.messages[1]["role"]).isEqualTo("user")
        assertThat(anthropic.messages[1]["content"]).isEqualTo("Result: 42")
    }

    @Test
    fun chatMessage_openAiConversion() {
        val prompt =
            Prompt.of(
                listOf(
                    PromptMessage.chat("Narrating the scene.", "narrator"),
                    PromptMessage.human("What happens next?"),
                )
            )

        val pv = prompt.invoke()
        val openAi = convertPromptToOpenAI(pv)

        assertThat(openAi.messages).hasSize(2)
        assertThat(openAi.messages[0]["role"]).isEqualTo("narrator")
        assertThat(openAi.messages[0]["content"]).isEqualTo("Narrating the scene.")
    }

    @Test
    fun chatMessage_anthropicConversion() {
        val prompt = Prompt.of(listOf(PromptMessage.chat("Narrating the scene.", "narrator")))

        val pv = prompt.invoke()
        val anthropic = convertPromptToAnthropic(pv)

        assertThat(anthropic.messages).hasSize(1)
        assertThat(anthropic.messages[0]["role"]).isEqualTo("narrator")
    }

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

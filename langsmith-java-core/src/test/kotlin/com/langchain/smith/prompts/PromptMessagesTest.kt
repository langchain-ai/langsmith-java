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
        val prompt = Prompt.of(
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
        val prompt = Prompt.of(
            listOf(PromptMessage.human("Hello {name}, topic is {topic}")),
            listOf("name", "topic"),
        )

        val result = prompt.invoke(mapOf("name" to "Alice"))

        assertThat(result.messages[0].template)
            .isEqualTo("Hello Alice, topic is {topic}")
    }

    // --- convertPromptToOpenAI ---

    @Test
    fun toOpenAiMessages() {
        val prompt = Prompt.of(
            listOf(
                PromptMessage.system("You are helpful."),
                PromptMessage.human("What is 2+2?"),
                PromptMessage.ai("2+2 is 4."),
                PromptMessage.human("And 3+3?"),
            ),
        )

        val pv = prompt.invoke()
        val openAi = convertPromptToOpenAI(pv)

        assertThat(openAi.messages).hasSize(4)
        assertThat(openAi.messages[0]).isEqualTo(mapOf("role" to "system", "content" to "You are helpful."))
        assertThat(openAi.messages[1]).isEqualTo(mapOf("role" to "user", "content" to "What is 2+2?"))
        assertThat(openAi.messages[2]).isEqualTo(mapOf("role" to "assistant", "content" to "2+2 is 4."))
        assertThat(openAi.messages[3]).isEqualTo(mapOf("role" to "user", "content" to "And 3+3?"))
    }

    // --- convertPromptToAnthropic ---

    @Test
    fun toAnthropicPayload_extractsSystem() {
        val prompt = Prompt.of(
            listOf(
                PromptMessage.system("You are a joke teller."),
                PromptMessage.human("Tell me a joke about cats"),
            ),
        )

        val pv = prompt.invoke()
        val payload = convertPromptToAnthropic(pv)

        assertThat(payload.system).isEqualTo("You are a joke teller.")
        assertThat(payload.messages).hasSize(1)
        assertThat(payload.messages[0]).isEqualTo(
            mapOf("role" to "user", "content" to "Tell me a joke about cats")
        )
    }

    @Test
    fun toAnthropicPayload_multipleSystemMessages() {
        val prompt = Prompt.of(
            listOf(
                PromptMessage.system("You are helpful."),
                PromptMessage.system("Always be concise."),
                PromptMessage.human("Hello"),
            ),
        )

        val pv = prompt.invoke()
        val payload = convertPromptToAnthropic(pv)

        assertThat(payload.system).isEqualTo("You are helpful.\nAlways be concise.")
        assertThat(payload.messages).hasSize(1)
    }

    @Test
    fun toAnthropicPayload_noSystemMessages() {
        val prompt = Prompt.of(
            listOf(
                PromptMessage.human("Hello"),
                PromptMessage.ai("Hi there!"),
            ),
        )

        val pv = prompt.invoke()
        val payload = convertPromptToAnthropic(pv)

        assertThat(payload.system).isEmpty()
        assertThat(payload.messages).hasSize(2)
        assertThat(payload.messages[0]["role"]).isEqualTo("user")
        assertThat(payload.messages[1]["role"]).isEqualTo("assistant")
    }

    @Test
    fun toAnthropicPayload_preservesMessageOrder() {
        val prompt = Prompt.of(
            listOf(
                PromptMessage.system("Be helpful."),
                PromptMessage.human("Question 1"),
                PromptMessage.ai("Answer 1"),
                PromptMessage.human("Question 2"),
            ),
        )

        val pv = prompt.invoke()
        val payload = convertPromptToAnthropic(pv)

        assertThat(payload.system).isEqualTo("Be helpful.")
        assertThat(payload.messages).hasSize(3)
        assertThat(payload.messages[0]).isEqualTo(mapOf("role" to "user", "content" to "Question 1"))
        assertThat(payload.messages[1]).isEqualTo(mapOf("role" to "assistant", "content" to "Answer 1"))
        assertThat(payload.messages[2]).isEqualTo(mapOf("role" to "user", "content" to "Question 2"))
    }

    // --- Structured output tests ---

    private val sampleSchema = mapOf<String, Any?>(
        "title" to "JokeResponse",
        "description" to "A structured joke response.",
        "type" to "object",
        "properties" to mapOf(
            "setup" to mapOf("type" to "string"),
            "punchline" to mapOf("type" to "string"),
        ),
        "required" to listOf("setup", "punchline"),
    )

    @Test
    fun hasOutputSchema_true() {
        val prompt = Prompt.of(
            listOf(PromptMessage.human("Tell me a joke")),
            emptyList(),
            sampleSchema,
        )
        assertThat(prompt.hasOutputSchema()).isTrue()
    }

    @Test
    fun hasOutputSchema_false() {
        val prompt = Prompt.of(
            listOf(PromptMessage.human("Tell me a joke")),
        )
        assertThat(prompt.hasOutputSchema()).isFalse()
    }

    @Test
    fun formatPreservesOutputSchema() {
        val prompt = Prompt.of(
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
        val prompt = Prompt.of(
            listOf(
                PromptMessage.system("You are helpful."),
                PromptMessage.human("Hello"),
            ),
        )

        val pv = prompt.invoke()
        val payload = convertPromptToOpenAI(pv)

        assertThat(payload.hasResponseFormat()).isFalse()
        assertThat(payload.responseFormat).isNull()
        assertThat(payload.messages).hasSize(2)
        assertThat(payload.messages[0]).isEqualTo(mapOf("role" to "system", "content" to "You are helpful."))
        assertThat(payload.messages[1]).isEqualTo(mapOf("role" to "user", "content" to "Hello"))
    }

    @Test
    @Suppress("UNCHECKED_CAST")
    fun toOpenAiPayload_withSchema() {
        val prompt = Prompt.of(
            listOf(
                PromptMessage.system("You tell jokes."),
                PromptMessage.human("Tell me a joke about cats"),
            ),
            emptyList(),
            sampleSchema,
        )

        val pv = prompt.invoke()
        val payload = convertPromptToOpenAI(pv)

        assertThat(payload.hasResponseFormat()).isTrue()
        assertThat(payload.messages).hasSize(2)

        val responseFormat = payload.responseFormat!!
        assertThat(responseFormat["type"]).isEqualTo("json_schema")

        val jsonSchema = responseFormat["json_schema"] as Map<String, Any?>
        assertThat(jsonSchema["name"]).isEqualTo("JokeResponse")
        assertThat(jsonSchema["strict"]).isEqualTo(true)
        assertThat(jsonSchema["schema"]).isEqualTo(sampleSchema)
    }

    @Test
    @Suppress("UNCHECKED_CAST")
    fun toOpenAiPayload_schemaWithoutTitle() {
        val schemaNoTitle = mapOf<String, Any?>(
            "type" to "object",
            "properties" to mapOf("name" to mapOf("type" to "string")),
        )
        val prompt = Prompt.of(
            listOf(PromptMessage.human("Extract")),
            emptyList(),
            schemaNoTitle,
        )

        val pv = prompt.invoke()
        val payload = convertPromptToOpenAI(pv)

        val jsonSchema = payload.responseFormat!!["json_schema"] as Map<String, Any?>
        assertThat(jsonSchema["name"]).isEqualTo("structured_output")
    }

    @Test
    @Suppress("UNCHECKED_CAST")
    fun toAnthropicPayload_withSchema() {
        val prompt = Prompt.of(
            listOf(
                PromptMessage.system("You tell jokes."),
                PromptMessage.human("Tell me a joke about cats"),
            ),
            emptyList(),
            sampleSchema,
        )

        val pv = prompt.invoke()
        val payload = convertPromptToAnthropic(pv)

        assertThat(payload.hasTool()).isTrue()
        assertThat(payload.system).isEqualTo("You tell jokes.")
        assertThat(payload.messages).hasSize(1)

        val tool = payload.tool!!
        assertThat(tool["name"]).isEqualTo("JokeResponse")
        assertThat(tool["description"]).isEqualTo("A structured joke response.")
        assertThat(tool["input_schema"]).isEqualTo(sampleSchema)
    }

    @Test
    fun toAnthropicPayload_withoutSchema() {
        val prompt = Prompt.of(
            listOf(PromptMessage.human("Hello")),
        )

        val pv = prompt.invoke()
        val payload = convertPromptToAnthropic(pv)

        assertThat(payload.hasTool()).isFalse()
        assertThat(payload.tool).isNull()
    }

    @Test
    @Suppress("UNCHECKED_CAST")
    fun toAnthropicPayload_schemaWithoutDescription() {
        val schemaNoDesc = mapOf<String, Any?>(
            "title" to "MyTool",
            "type" to "object",
            "properties" to mapOf("x" to mapOf("type" to "string")),
        )
        val prompt = Prompt.of(
            listOf(PromptMessage.human("Do it")),
            emptyList(),
            schemaNoDesc,
        )

        val pv = prompt.invoke()
        val payload = convertPromptToAnthropic(pv)

        val tool = payload.tool!!
        assertThat(tool["name"]).isEqualTo("MyTool")
        assertThat(tool["description"]).isEqualTo("Respond with structured output matching the schema.")
    }

    // --- End-to-end tests ---

    @Test
    fun endToEndParsing() {
        // Simulate what a user would do: create prompt → format → convert
        val prompt = Prompt.of(
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
        assertThat(openAi.messages[0]["content"]).isEqualTo("You are a helpful assistant that tells jokes.")
        assertThat(openAi.messages[1]["role"]).isEqualTo("user")
        assertThat(openAi.messages[1]["content"]).isEqualTo("Tell me a joke about cats")

        // Anthropic format
        val anthropic = convertPromptToAnthropic(pv)
        assertThat(anthropic.system)
            .isEqualTo("You are a helpful assistant that tells jokes.")
        assertThat(anthropic.messages).hasSize(1)
        assertThat(anthropic.messages[0]["role"]).isEqualTo("user")
        assertThat(anthropic.messages[0]["content"]).isEqualTo("Tell me a joke about cats")
    }

    @Test
    @Suppress("UNCHECKED_CAST")
    fun endToEndStructuredPrompt() {
        // Simulate structured prompt: create → format → convert to both providers
        val prompt = Prompt.of(
            listOf(
                PromptMessage.system("You extract structured data."),
                PromptMessage.human("Extract info from: {text}"),
            ),
            listOf("text"),
            sampleSchema,
        )

        val pv = prompt.invoke(mapOf("text" to "Alice is 30"))

        // OpenAI: should have response_format with json_schema
        val openAi = convertPromptToOpenAI(pv)
        assertThat(openAi.hasResponseFormat()).isTrue()
        assertThat(openAi.messages).hasSize(2)
        val jsonSchema = openAi.responseFormat!!["json_schema"] as Map<String, Any?>
        assertThat(jsonSchema["name"]).isEqualTo("JokeResponse")
        assertThat(jsonSchema["strict"]).isEqualTo(true)

        // Anthropic: should have tool definition
        val anthropic = convertPromptToAnthropic(pv)
        assertThat(anthropic.hasTool()).isTrue()
        assertThat(anthropic.system).isEqualTo("You extract structured data.")
        assertThat(anthropic.messages).hasSize(1)
        assertThat(anthropic.messages[0]["content"]).isEqualTo("Extract info from: Alice is 30")
        assertThat(anthropic.tool!!["name"]).isEqualTo("JokeResponse")
    }
}

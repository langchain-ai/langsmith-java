package com.langchain.smith.prompts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConvertersTest {

    private fun makePromptValue(
        messages: List<PromptMessage>,
        outputSchema: Map<String, Any?>? = null,
    ): PromptValue {
        val prompt = Prompt.of(messages, emptyList(), outputSchema)
        return prompt.invoke()
    }

    // --- convertPromptToOpenAI ---

    @Test
    fun convertToOpenAI_basicMessages() {
        val pv = makePromptValue(
            listOf(
                PromptMessage.system("You are helpful."),
                PromptMessage.human("Hello"),
            )
        )

        val result = convertPromptToOpenAI(pv)

        assertThat(result.messages).hasSize(2)
        assertThat(result.messages[0]).isEqualTo(mapOf("role" to "system", "content" to "You are helpful."))
        assertThat(result.messages[1]).isEqualTo(mapOf("role" to "user", "content" to "Hello"))
        assertThat(result.hasResponseFormat()).isFalse()
        assertThat(result.responseFormat).isNull()
    }

    @Test
    @Suppress("UNCHECKED_CAST")
    fun convertToOpenAI_withStructuredOutput() {
        val schema = mapOf<String, Any?>(
            "title" to "MySchema",
            "type" to "object",
            "properties" to mapOf("name" to mapOf("type" to "string")),
        )
        val pv = makePromptValue(
            listOf(PromptMessage.human("Extract from: text")),
            outputSchema = schema,
        )

        val result = convertPromptToOpenAI(pv)

        assertThat(result.hasResponseFormat()).isTrue()
        assertThat(result.responseFormat!!["type"]).isEqualTo("json_schema")
        val jsonSchema = result.responseFormat!!["json_schema"] as Map<String, Any?>
        assertThat(jsonSchema["name"]).isEqualTo("MySchema")
        assertThat(jsonSchema["strict"]).isEqualTo(true)
        assertThat(jsonSchema["schema"]).isEqualTo(schema)
    }

    // --- convertPromptToAnthropic ---

    @Test
    fun convertToAnthropic_extractsSystem() {
        val pv = makePromptValue(
            listOf(
                PromptMessage.system("Be helpful."),
                PromptMessage.human("Hello"),
                PromptMessage.ai("Hi!"),
                PromptMessage.human("Question"),
            )
        )

        val result = convertPromptToAnthropic(pv)

        assertThat(result.system).isEqualTo("Be helpful.")
        assertThat(result.messages).hasSize(3)
        assertThat(result.messages[0]).isEqualTo(mapOf("role" to "user", "content" to "Hello"))
        assertThat(result.messages[1]).isEqualTo(mapOf("role" to "assistant", "content" to "Hi!"))
        assertThat(result.messages[2]).isEqualTo(mapOf("role" to "user", "content" to "Question"))
        assertThat(result.hasTool()).isFalse()
    }

    @Test
    fun convertToAnthropic_withStructuredOutput() {
        val schema = mapOf<String, Any?>(
            "title" to "MyTool",
            "description" to "Extracts info.",
            "type" to "object",
            "properties" to mapOf("name" to mapOf("type" to "string")),
        )
        val pv = makePromptValue(
            listOf(
                PromptMessage.system("Extract data."),
                PromptMessage.human("Extract from: text"),
            ),
            outputSchema = schema,
        )

        val result = convertPromptToAnthropic(pv)

        assertThat(result.system).isEqualTo("Extract data.")
        assertThat(result.messages).hasSize(1)
        assertThat(result.hasTool()).isTrue()
        assertThat(result.tool!!["name"]).isEqualTo("MyTool")
        assertThat(result.tool!!["description"]).isEqualTo("Extracts info.")
        assertThat(result.tool!!["input_schema"]).isEqualTo(schema)
    }

    // --- End-to-end flow test ---

    @Test
    @Suppress("UNCHECKED_CAST")
    fun endToEnd_pullInvokeConvert() {
        // Simulate the full DX: Prompt → invoke → convert
        val schema = mapOf<String, Any?>(
            "title" to "JokeResponse",
            "type" to "object",
            "properties" to mapOf(
                "setup" to mapOf("type" to "string"),
                "punchline" to mapOf("type" to "string"),
            ),
        )
        val prompt = Prompt.of(
            listOf(
                PromptMessage.system("You tell jokes."),
                PromptMessage.human("Tell me a joke about {topic}"),
            ),
            listOf("topic"),
            schema,
        )

        val formattedPrompt = prompt.invoke(mapOf("topic" to "cats"))

        // OpenAI
        val openAi = convertPromptToOpenAI(formattedPrompt)
        assertThat(openAi.messages).hasSize(2)
        assertThat(openAi.messages[0]["content"]).isEqualTo("You tell jokes.")
        assertThat(openAi.messages[1]["content"]).isEqualTo("Tell me a joke about cats")
        assertThat(openAi.hasResponseFormat()).isTrue()
        val jsonSchema = openAi.responseFormat!!["json_schema"] as Map<String, Any?>
        assertThat(jsonSchema["name"]).isEqualTo("JokeResponse")

        // Anthropic
        val anthropic = convertPromptToAnthropic(formattedPrompt)
        assertThat(anthropic.system).isEqualTo("You tell jokes.")
        assertThat(anthropic.messages).hasSize(1)
        assertThat(anthropic.messages[0]["content"]).isEqualTo("Tell me a joke about cats")
        assertThat(anthropic.hasTool()).isTrue()
        assertThat(anthropic.tool!!["name"]).isEqualTo("JokeResponse")
    }

    @Test
    fun endToEnd_regularPromptNoSchema() {
        val prompt = Prompt.of(
            listOf(
                PromptMessage.system("You are helpful."),
                PromptMessage.human("Tell me about {topic}"),
            ),
            listOf("topic"),
        )

        val formattedPrompt = prompt.invoke(mapOf("topic" to "dogs"))

        val openAi = convertPromptToOpenAI(formattedPrompt)
        assertThat(openAi.messages[1]["content"]).isEqualTo("Tell me about dogs")
        assertThat(openAi.hasResponseFormat()).isFalse()

        val anthropic = convertPromptToAnthropic(formattedPrompt)
        assertThat(anthropic.system).isEqualTo("You are helpful.")
        assertThat(anthropic.messages[0]["content"]).isEqualTo("Tell me about dogs")
        assertThat(anthropic.hasTool()).isFalse()
    }
}

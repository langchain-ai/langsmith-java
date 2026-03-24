package com.langchain.smith.prompts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PromptTest {

    @Test
    fun invokeFormatsVariables() {
        val prompt = Prompt.of(
            listOf(
                PromptMessage.system("You are a {personality} assistant."),
                PromptMessage.human("Tell me about {topic}"),
            ),
            listOf("personality", "topic"),
        )

        val result = prompt.invoke(mapOf("personality" to "funny", "topic" to "cats"))

        assertThat(result.messages).hasSize(2)
        assertThat(result.messages[0].template).isEqualTo("You are a funny assistant.")
        assertThat(result.messages[1].template).isEqualTo("Tell me about cats")
    }

    @Test
    fun invokeNoArgs() {
        val prompt = Prompt.of(
            listOf(PromptMessage.human("Hello world")),
        )

        val result = prompt.invoke()

        assertThat(result.messages).hasSize(1)
        assertThat(result.messages[0].template).isEqualTo("Hello world")
    }

    @Test
    fun inputVariables() {
        val prompt = Prompt.of(
            listOf(PromptMessage.human("Hello {name}")),
            listOf("name"),
        )

        assertThat(prompt.inputVariables).containsExactly("name")
    }

    @Test
    fun outputSchemaPreserved() {
        val schema = mapOf<String, Any?>(
            "title" to "Response",
            "type" to "object",
            "properties" to mapOf("answer" to mapOf("type" to "string")),
        )
        val prompt = Prompt.of(
            listOf(PromptMessage.human("Extract: {text}")),
            listOf("text"),
            schema,
        )

        assertThat(prompt.hasOutputSchema()).isTrue()
        assertThat(prompt.outputSchema).isEqualTo(schema)

        val result = prompt.invoke(mapOf("text" to "hello"))
        assertThat(result.hasOutputSchema()).isTrue()
        assertThat(result.outputSchema).isEqualTo(schema)
    }

    @Test
    fun noOutputSchema() {
        val prompt = Prompt.of(
            listOf(PromptMessage.human("Hello")),
        )

        assertThat(prompt.hasOutputSchema()).isFalse()
        assertThat(prompt.outputSchema).isNull()
    }
}

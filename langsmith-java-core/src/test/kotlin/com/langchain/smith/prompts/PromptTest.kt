package com.langchain.smith.prompts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PromptTest {

    @Test
    fun invokeFormatsVariables() {
        val prompt =
            Prompt.of(
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
        val prompt = Prompt.of(listOf(PromptMessage.human("Hello world")))

        val result = prompt.invoke()

        assertThat(result.messages).hasSize(1)
        assertThat(result.messages[0].template).isEqualTo("Hello world")
    }

    @Test
    fun inputVariables() {
        val prompt = Prompt.of(listOf(PromptMessage.human("Hello {name}")), listOf("name"))

        assertThat(prompt.inputVariables).containsExactly("name")
    }

    @Test
    fun outputSchemaPreserved() {
        val schema =
            mapOf<String, Any?>(
                "title" to "Response",
                "type" to "object",
                "properties" to mapOf("answer" to mapOf("type" to "string")),
            )
        val prompt =
            Prompt.of(listOf(PromptMessage.human("Extract: {text}")), listOf("text"), schema)

        assertThat(prompt.hasOutputSchema()).isTrue()
        assertThat(prompt.outputSchema).isEqualTo(schema)

        val result = prompt.invoke(mapOf("text" to "hello"))
        assertThat(result.hasOutputSchema()).isTrue()
        assertThat(result.outputSchema).isEqualTo(schema)
    }

    @Test
    fun noOutputSchema() {
        val prompt = Prompt.of(listOf(PromptMessage.human("Hello")))

        assertThat(prompt.hasOutputSchema()).isFalse()
        assertThat(prompt.outputSchema).isNull()
    }

    @Test
    fun legacyPromptTemplateEndToEnd() {
        // Test that the exact legacy format from the issue can be pulled and invoked
        val manifest =
            com.langchain.smith.core.JsonValue.from(
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
            )

        val commit =
            PromptCommit.of(
                owner = "test",
                repo = "parrot",
                commitHash = "abc123",
                manifest = manifest,
            )

        val prompt = Prompt.fromCommit(commit)

        assertThat(prompt.inputVariables).containsExactly("input")

        val result = prompt.invoke(mapOf("input" to "Hello world!"))

        assertThat(result.messages).hasSize(1)
        assertThat(result.messages[0].role).isEqualTo(PromptMessage.Role.HUMAN)
        assertThat(result.messages[0].template)
            .isEqualTo(
                "You are a parrot. The current date is 2026-03-29T14:26:33.834Z\nHello world!"
            )
    }
}

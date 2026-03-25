package com.langchain.smith.prompts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConvertersTest {

    private fun makePromptValue(
        messages: List<PromptMessage>,
        outputSchema: Map<String, Any?>? = null,
    ): PromptValue = Prompt.of(messages, emptyList(), outputSchema).invoke()

    // --- convertToOpenAIParams ---

    @Test
    fun convertToOpenAI_basicMessages() {
        val pv =
            makePromptValue(
                listOf(PromptMessage.system("You are helpful."), PromptMessage.human("Hello"))
            )

        val params = convertToOpenAIParams(pv).model("gpt-4.1-mini").build()

        assertThat(params.messages()).hasSize(2)
        assertThat(params.messages()[0].isSystem()).isTrue()
        assertThat(params.messages()[1].isUser()).isTrue()
        assertThat(params.responseFormat()).isEmpty
    }

    @Test
    fun convertToOpenAI_withStructuredOutput() {
        val schema =
            mapOf<String, Any?>(
                "title" to "MySchema",
                "type" to "object",
                "properties" to mapOf("name" to mapOf("type" to "string")),
            )
        val pv =
            makePromptValue(
                listOf(PromptMessage.human("Extract from: text")),
                outputSchema = schema,
            )

        val params = convertToOpenAIParams(pv).model("gpt-4.1-mini").build()

        assertThat(params.messages()).hasSize(1)
        assertThat(params.responseFormat()).isPresent
    }

    // --- convertToAnthropicParams ---

    @Test
    fun convertToAnthropic_extractsSystem() {
        val pv =
            makePromptValue(
                listOf(
                    PromptMessage.system("Be helpful."),
                    PromptMessage.human("Hello"),
                    PromptMessage.ai("Hi!"),
                    PromptMessage.human("Question"),
                )
            )

        val params =
            convertToAnthropicParams(pv)
                .model(com.anthropic.models.messages.Model.CLAUDE_HAIKU_4_5_20251001)
                .maxTokens(256)
                .build()

        assertThat(params.system()).isPresent
        assertThat(params.messages()).hasSize(3)
        assertThat(params.messages()[0].role())
            .isEqualTo(com.anthropic.models.messages.MessageParam.Role.USER)
        assertThat(params.messages()[1].role())
            .isEqualTo(com.anthropic.models.messages.MessageParam.Role.ASSISTANT)
        assertThat(params.messages()[2].role())
            .isEqualTo(com.anthropic.models.messages.MessageParam.Role.USER)
        assertThat(params.outputConfig()).isEmpty
    }

    @Test
    fun convertToAnthropic_withStructuredOutput() {
        val schema =
            mapOf<String, Any?>(
                "title" to "MyTool",
                "description" to "Extracts info.",
                "type" to "object",
                "properties" to mapOf("name" to mapOf("type" to "string")),
            )
        val pv =
            makePromptValue(
                listOf(
                    PromptMessage.system("Extract data."),
                    PromptMessage.human("Extract from: text"),
                ),
                outputSchema = schema,
            )

        val params =
            convertToAnthropicParams(pv)
                .model(com.anthropic.models.messages.Model.CLAUDE_HAIKU_4_5_20251001)
                .maxTokens(256)
                .build()

        assertThat(params.system()).isPresent
        assertThat(params.messages()).hasSize(1)
        assertThat(params.outputConfig()).isPresent
    }

    // --- End-to-end flow test ---

    @Test
    fun endToEnd_pullInvokeConvert() {
        val schema =
            mapOf<String, Any?>(
                "title" to "JokeResponse",
                "type" to "object",
                "properties" to
                    mapOf(
                        "setup" to mapOf("type" to "string"),
                        "punchline" to mapOf("type" to "string"),
                    ),
            )
        val prompt =
            Prompt.of(
                listOf(
                    PromptMessage.system("You tell jokes."),
                    PromptMessage.human("Tell me a joke about {topic}"),
                ),
                listOf("topic"),
                schema,
            )

        val formattedPrompt = prompt.invoke(mapOf("topic" to "cats"))

        // OpenAI
        val openAiParams = convertToOpenAIParams(formattedPrompt).model("gpt-4.1-mini").build()
        assertThat(openAiParams.messages()).hasSize(2)
        assertThat(openAiParams.responseFormat()).isPresent

        // Anthropic
        val anthropicParams =
            convertToAnthropicParams(formattedPrompt)
                .model(com.anthropic.models.messages.Model.CLAUDE_HAIKU_4_5_20251001)
                .maxTokens(256)
                .build()
        assertThat(anthropicParams.system()).isPresent
        assertThat(anthropicParams.messages()).hasSize(1)
        assertThat(anthropicParams.outputConfig()).isPresent
    }

    @Test
    fun endToEnd_regularPromptNoSchema() {
        val prompt =
            Prompt.of(
                listOf(
                    PromptMessage.system("You are helpful."),
                    PromptMessage.human("Tell me about {topic}"),
                ),
                listOf("topic"),
            )

        val formattedPrompt = prompt.invoke(mapOf("topic" to "dogs"))

        val openAiParams = convertToOpenAIParams(formattedPrompt).model("gpt-4.1-mini").build()
        assertThat(openAiParams.messages()).hasSize(2)
        assertThat(openAiParams.responseFormat()).isEmpty

        val anthropicParams =
            convertToAnthropicParams(formattedPrompt)
                .model(com.anthropic.models.messages.Model.CLAUDE_HAIKU_4_5_20251001)
                .maxTokens(256)
                .build()
        assertThat(anthropicParams.system()).isPresent
        assertThat(anthropicParams.messages()).hasSize(1)
        assertThat(anthropicParams.outputConfig()).isEmpty
    }
}

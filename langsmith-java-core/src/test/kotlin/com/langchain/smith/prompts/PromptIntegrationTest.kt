package com.langchain.smith.prompts

import com.anthropic.client.AnthropicClient
import com.anthropic.client.okhttp.AnthropicOkHttpClient
import com.anthropic.models.messages.ContentBlock
import com.anthropic.models.messages.Message
import com.anthropic.models.messages.MessageCreateParams
import com.anthropic.models.messages.MessageParam
import com.anthropic.models.messages.Model
import com.anthropic.models.messages.TextBlockParam
import com.anthropic.models.messages.ContentBlockParam
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.openai.client.OpenAIClient
import com.openai.client.okhttp.OpenAIOkHttpClient
import com.openai.models.ChatModel
import com.openai.models.chat.completions.ChatCompletion
import com.openai.models.chat.completions.ChatCompletionCreateParams
import com.openai.models.chat.completions.ChatCompletionMessageParam
import com.openai.models.chat.completions.ChatCompletionSystemMessageParam
import com.openai.models.chat.completions.ChatCompletionUserMessageParam
import com.openai.models.chat.completions.ChatCompletionAssistantMessageParam
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assumptions.assumeTrue
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

/**
 * Integration tests that pull a real prompt from LangSmith and send it to
 * the OpenAI and Anthropic APIs using their official Java SDKs.
 *
 * These tests require the following environment variables:
 * - `LANGSMITH_API_KEY` — LangSmith API key
 * - `OPENAI_API_KEY` — OpenAI API key (for OpenAI tests)
 * - `ANTHROPIC_API_KEY` — Anthropic API key (for Anthropic tests)
 *
 * The tests are skipped if the required API keys are not set.
 *
 * Run with:
 * ```bash
 * ./gradlew :langsmith-java-core:test --tests "com.langchain.smith.prompts.PromptIntegrationTest"
 * ```
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class PromptIntegrationTest {

    private val langsmithApiKey = System.getenv("LANGSMITH_API_KEY")
    private val openaiApiKey = System.getenv("OPENAI_API_KEY")
    private val anthropicApiKey = System.getenv("ANTHROPIC_API_KEY")

    /**
     * Helper: Builds OpenAI ChatCompletionCreateParams from an OpenAiPayload.
     */
    private fun buildOpenAiParams(
        payload: OpenAiPayload,
        model: ChatModel = ChatModel.GPT_4_1_MINI,
    ): ChatCompletionCreateParams {
        val builder = ChatCompletionCreateParams.builder().model(model)

        for (msg in payload.messages) {
            val role = msg["role"] ?: continue
            val content = msg["content"] ?: ""
            when (role) {
                "system" -> builder.addMessage(
                    ChatCompletionMessageParam.ofSystem(
                        ChatCompletionSystemMessageParam.builder().content(content).build()
                    )
                )

                "user" -> builder.addMessage(
                    ChatCompletionMessageParam.ofUser(
                        ChatCompletionUserMessageParam.builder().content(content).build()
                    )
                )

                "assistant" -> builder.addMessage(
                    ChatCompletionMessageParam.ofAssistant(
                        ChatCompletionAssistantMessageParam.builder().content(content).build()
                    )
                )
            }
        }

        return builder.maxCompletionTokens(256).build()
    }

    /**
     * Helper: Builds Anthropic MessageCreateParams from an AnthropicPayload.
     */
    private fun buildAnthropicParams(
        payload: AnthropicPayload,
        model: Model = Model.CLAUDE_HAIKU_4_5_20251001,
    ): MessageCreateParams {
        val builder = MessageCreateParams.builder()
            .model(model)
            .maxTokens(256)

        if (payload.system.isNotEmpty()) {
            builder.system(payload.system)
        }

        for (msg in payload.messages) {
            val role = msg["role"] ?: continue
            val content = msg["content"] ?: ""
            val messageRole = when (role) {
                "user" -> MessageParam.Role.USER
                "assistant" -> MessageParam.Role.ASSISTANT
                else -> continue
            }
            builder.addMessage(
                MessageParam.builder()
                    .role(messageRole)
                    .content(content)
                    .build()
            )
        }

        return builder.build()
    }

    // -------------------------------------------------------
    // OpenAI integration test
    // -------------------------------------------------------

    @Test
    fun openAi_pullAndInvokePrompt() {
        assumeTrue(
            !langsmithApiKey.isNullOrBlank() && !openaiApiKey.isNullOrBlank(),
            "Skipping: LANGSMITH_API_KEY and OPENAI_API_KEY must be set"
        )

        // 1. Pull prompt from LangSmith
        val langsmith = LangsmithOkHttpClient.fromEnv()
        val promptClient = PromptClient.create(langsmith)
        val prompt = promptClient.pull("joke-generator")

        // 2. Invoke with variables
        val formattedPrompt = prompt.invoke(mapOf("topic" to "cats"))
        assertThat(formattedPrompt.messages).isNotEmpty()

        // 3. Convert to OpenAI format
        val openAiPayload = convertPromptToOpenAI(formattedPrompt)
        assertThat(openAiPayload.messages).isNotEmpty()

        // 4. Build typed OpenAI SDK params and call the API
        val openai: OpenAIClient = OpenAIOkHttpClient.fromEnv()
        val params = buildOpenAiParams(openAiPayload)
        val completion: ChatCompletion = openai.chat().completions().create(params)

        // 5. Verify we got a response
        val responseText = completion.choices()[0].message().content().orElse("")
        assertThat(responseText).isNotBlank()
        println("[OpenAI] Response: $responseText")

        langsmith.close()
    }

    // -------------------------------------------------------
    // Anthropic integration test
    // -------------------------------------------------------

    @Test
    fun anthropic_pullAndInvokePrompt() {
        assumeTrue(
            !langsmithApiKey.isNullOrBlank() && !anthropicApiKey.isNullOrBlank(),
            "Skipping: LANGSMITH_API_KEY and ANTHROPIC_API_KEY must be set"
        )

        // 1. Pull prompt from LangSmith
        val langsmith = LangsmithOkHttpClient.fromEnv()
        val promptClient = PromptClient.create(langsmith)
        val prompt = promptClient.pull("joke-generator")

        // 2. Invoke with variables
        val formattedPrompt = prompt.invoke(mapOf("topic" to "dogs"))
        assertThat(formattedPrompt.messages).isNotEmpty()

        // 3. Convert to Anthropic format
        val anthropicPayload = convertPromptToAnthropic(formattedPrompt)
        assertThat(anthropicPayload.messages).isNotEmpty()

        // 4. Build typed Anthropic SDK params and call the API
        val anthropic: AnthropicClient = AnthropicOkHttpClient.fromEnv()
        val params = buildAnthropicParams(anthropicPayload)
        val message: Message = anthropic.messages().create(params)

        // 5. Verify we got a response
        val responseText = message.content()
            .filterIsInstance<ContentBlock>()
            .filter { it.isText() }
            .joinToString("") { it.asText().text() }
        assertThat(responseText).isNotBlank()
        println("[Anthropic] Response: $responseText")

        langsmith.close()
    }
}

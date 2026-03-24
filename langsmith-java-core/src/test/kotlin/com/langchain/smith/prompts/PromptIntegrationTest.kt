package com.langchain.smith.prompts

import com.anthropic.client.AnthropicClient
import com.anthropic.client.okhttp.AnthropicOkHttpClient
import com.anthropic.models.messages.ContentBlock
import com.anthropic.models.messages.Message
import com.anthropic.models.messages.MessageCreateParams
import com.anthropic.models.messages.MessageParam
import com.anthropic.models.messages.Model
import com.anthropic.models.messages.Tool
import com.anthropic.models.messages.ToolChoiceAny
import com.anthropic.models.messages.ToolUnion
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.openai.client.OpenAIClient
import com.openai.client.okhttp.OpenAIOkHttpClient
import com.openai.models.ChatModel
import com.openai.models.chat.completions.ChatCompletion
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assumptions.assumeTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

/**
 * Integration tests that pull a real prompt from LangSmith and send it to the OpenAI and Anthropic
 * APIs using their official Java SDKs.
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
     * Helper: Builds typed Anthropic MessageCreateParams from an AnthropicPayload.
     *
     * This lives in the test because the Anthropic SDK is a test-only dependency. If Anthropic
     * becomes a prod dependency, this could move to `AnthropicPayload`.
     */
    private fun buildAnthropicParams(
        payload: AnthropicPayload,
        model: Model = Model.CLAUDE_HAIKU_4_5_20251001,
    ): MessageCreateParams {
        val builder = MessageCreateParams.builder().model(model).maxTokens(256)

        if (payload.system.isNotEmpty()) {
            builder.system(payload.system)
        }

        for (msg in payload.messages) {
            val role = msg["role"] ?: continue
            val content = msg["content"] ?: ""
            val messageRole =
                when (role) {
                    "user" -> MessageParam.Role.USER
                    "assistant" -> MessageParam.Role.ASSISTANT
                    else -> continue
                }
            builder.addMessage(MessageParam.builder().role(messageRole).content(content).build())
        }

        // Add tool definition if this is a structured prompt
        if (payload.hasTool()) {
            val toolMap = payload.tool!!
            val toolName = toolMap["name"] as? String ?: "structured_output"
            val toolDescription = toolMap["description"] as? String ?: ""

            @Suppress("UNCHECKED_CAST")
            val inputSchemaMap = toolMap["input_schema"] as? Map<String, Any?>

            val inputSchemaBuilder =
                Tool.InputSchema.builder().type(com.anthropic.core.JsonValue.from("object"))
            if (inputSchemaMap != null) {
                val properties = inputSchemaMap["properties"]
                if (properties != null) {
                    inputSchemaBuilder.properties(com.anthropic.core.JsonValue.from(properties))
                }
                @Suppress("UNCHECKED_CAST")
                val required = inputSchemaMap["required"] as? List<String>
                if (required != null) {
                    inputSchemaBuilder.required(required)
                }
            }

            builder.addTool(
                ToolUnion.ofTool(
                    Tool.builder()
                        .name(toolName)
                        .description(toolDescription)
                        .inputSchema(inputSchemaBuilder.build())
                        .build()
                )
            )
            builder.toolChoice(ToolChoiceAny.builder().build())
        }

        return builder.build()
    }

    // -------------------------------------------------------
    // OpenAI integration test — uses toOpenAiParams()
    // -------------------------------------------------------

    @Test
    fun openAi_pullAndInvokePrompt() {
        assumeTrue(
            !langsmithApiKey.isNullOrBlank() && !openaiApiKey.isNullOrBlank(),
            "Skipping: LANGSMITH_API_KEY and OPENAI_API_KEY must be set",
        )

        val langsmith = LangsmithOkHttpClient.fromEnv()
        val promptClient = PromptClient.create(langsmith)

        // Pull → invoke → convert → typed SDK params in one chain
        val prompt = promptClient.pull("joke-generator")
        val formattedPrompt = prompt.invoke(mapOf("topic" to "cats"))
        val openAi = convertPromptToOpenAI(formattedPrompt)

        // toOpenAiParams() gives a typed builder — just add model and build
        val params =
            openAi.toOpenAiParams().model(ChatModel.GPT_4_1_MINI).maxCompletionTokens(256).build()

        val openai: OpenAIClient = OpenAIOkHttpClient.fromEnv()
        val completion: ChatCompletion = openai.chat().completions().create(params)

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
            "Skipping: LANGSMITH_API_KEY and ANTHROPIC_API_KEY must be set",
        )

        val langsmith = LangsmithOkHttpClient.fromEnv()
        val promptClient = PromptClient.create(langsmith)

        val prompt = promptClient.pull("joke-generator")
        val formattedPrompt = prompt.invoke(mapOf("topic" to "dogs"))
        val anthropicPayload = convertPromptToAnthropic(formattedPrompt)

        val anthropic: AnthropicClient = AnthropicOkHttpClient.fromEnv()
        val params = buildAnthropicParams(anthropicPayload)
        val message: Message = anthropic.messages().create(params)

        val responseText =
            message
                .content()
                .filterIsInstance<ContentBlock>()
                .filter { it.isText() }
                .joinToString("") { it.asText().text() }
        assertThat(responseText).isNotBlank()
        println("[Anthropic] Response: $responseText")

        langsmith.close()
    }
}

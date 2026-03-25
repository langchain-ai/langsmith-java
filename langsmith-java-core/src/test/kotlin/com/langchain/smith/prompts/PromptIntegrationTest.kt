package com.langchain.smith.prompts

import com.anthropic.client.AnthropicClient
import com.anthropic.client.okhttp.AnthropicOkHttpClient
import com.anthropic.models.messages.Message
import com.anthropic.models.messages.Model
import com.fasterxml.jackson.databind.ObjectMapper
import com.langchain.smith.client.LangsmithClient
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.commits.CommitCreateParams
import com.langchain.smith.models.repos.RepoCreateParams
import com.langchain.smith.models.repos.RepoListParams
import com.openai.client.OpenAIClient
import com.openai.client.okhttp.OpenAIOkHttpClient
import com.openai.models.ChatModel
import com.openai.models.chat.completions.ChatCompletion
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assumptions.assumeTrue
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

/**
 * Integration tests that pull real prompts from LangSmith and send them to the OpenAI and Anthropic
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
    private val objectMapper = ObjectMapper()

    /**
     * Exact manifest from a StructuredPrompt created in the LangSmith playground. Uses mustache
     * template format and the real StructuredPrompt id path.
     */
    private val STRUCTURED_EXTRACT_MANIFEST: Map<String, Any> =
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
                                                        "input_variables" to emptyList<String>(),
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
                        ),
                    "input_variables" to listOf("question"),
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

    private fun getOwner(): String =
        System.getenv("LANGSMITH_OWNER")?.takeIf { it.isNotEmpty() } ?: "-"

    /** Ensures a prompt repo exists with a latest commit, creating both if needed. */
    private fun ensurePrompt(langsmith: LangsmithClient, name: String, manifest: Map<String, Any>) {
        val repoExists =
            listOf(RepoListParams.IsPublic.FALSE, RepoListParams.IsPublic.TRUE).any { isPublic ->
                langsmith
                    .repos()
                    .list(RepoListParams.builder().query(name).isPublic(isPublic).build())
                    .repos()
                    .any { it.repoHandle() == name }
            }

        if (!repoExists) {
            langsmith
                .repos()
                .create(RepoCreateParams.builder().repoHandle(name).isPublic(false).build())
        }

        // Check if there's a latest commit; if not, push one
        val hasCommit =
            runCatching {
                    langsmith
                        .commits()
                        .retrieve(
                            com.langchain.smith.models.commits.CommitRetrieveParams.builder()
                                .owner(getOwner())
                                .repo(name)
                                .commit("latest")
                                .build()
                        )
                }
                .isSuccess

        if (!hasCommit) {
            langsmith
                .commits()
                .create(
                    CommitCreateParams.builder()
                        .owner(getOwner())
                        .repo(name)
                        .manifest(JsonValue.from(manifest))
                        .build()
                )
        }
    }

    // -- Manifest builders --

    /** Builds a LangChain ChatPromptTemplate manifest. */
    private fun chatPromptManifest(
        messages: List<Map<String, Any>>,
        inputVariables: List<String>,
    ): Map<String, Any> =
        mapOf(
            "lc" to 1,
            "type" to "constructor",
            "id" to listOf("langchain_core", "prompts", "chat", "ChatPromptTemplate"),
            "kwargs" to mapOf("input_variables" to inputVariables, "messages" to messages),
        )

    /** Builds a message template entry. */
    private fun messageTemplate(className: String, template: String): Map<String, Any> =
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

    // -- Setup: ensure prompts exist --

    @BeforeAll
    fun setUp() {
        assumeTrue(!langsmithApiKey.isNullOrBlank(), "Skipping: LANGSMITH_API_KEY must be set")

        val langsmith = LangsmithOkHttpClient.fromEnv()

        // Regular prompt
        ensurePrompt(
            langsmith,
            "joke-generator",
            chatPromptManifest(
                messages =
                    listOf(
                        messageTemplate(
                            "SystemMessagePromptTemplate",
                            "You are a helpful assistant that tells jokes.",
                        ),
                        messageTemplate(
                            "HumanMessagePromptTemplate",
                            "Tell me a joke about {topic}",
                        ),
                    ),
                inputVariables = listOf("topic"),
            ),
        )

        // Structured prompt — exact manifest format from LangSmith playground
        ensurePrompt(langsmith, "structured-extract", STRUCTURED_EXTRACT_MANIFEST)

        langsmith.close()
    }

    // -------------------------------------------------------
    // OpenAI — regular prompt
    // -------------------------------------------------------

    @Test
    fun openAi_pullAndInvokePrompt() {
        assumeTrue(
            !langsmithApiKey.isNullOrBlank() && !openaiApiKey.isNullOrBlank(),
            "Skipping: LANGSMITH_API_KEY and OPENAI_API_KEY must be set",
        )

        val langsmith = LangsmithOkHttpClient.fromEnv()
        val promptClient = PromptClient.create(langsmith)

        val prompt = promptClient.pull("joke-generator")
        val formattedPrompt = prompt.invoke(mapOf("topic" to "cats"))

        val openai: OpenAIClient = OpenAIOkHttpClient.fromEnv()
        val completion: ChatCompletion =
            openai
                .chat()
                .completions()
                .create(
                    convertToOpenAIParams(formattedPrompt)
                        .model(ChatModel.GPT_4_1_MINI)
                        .maxCompletionTokens(256)
                        .build()
                )

        val responseText = completion.choices()[0].message().content().orElse("")
        assertThat(responseText).isNotBlank()
        println("[OpenAI] Response: $responseText")

        langsmith.close()
    }

    // -------------------------------------------------------
    // OpenAI — structured prompt with output schema
    // -------------------------------------------------------

    @Test
    fun openAi_structuredPrompt() {
        assumeTrue(
            !langsmithApiKey.isNullOrBlank() && !openaiApiKey.isNullOrBlank(),
            "Skipping: LANGSMITH_API_KEY and OPENAI_API_KEY must be set",
        )

        val langsmith = LangsmithOkHttpClient.fromEnv()
        val promptClient = PromptClient.create(langsmith)

        val prompt = promptClient.pull("structured-extract")
        assertThat(prompt.hasOutputSchema()).isTrue()
        assertThat(prompt.outputSchema!!["title"]).isEqualTo("extract")

        // Uses mustache template format — {{question}}
        val formattedPrompt =
            prompt.invoke(mapOf("question" to "Is the sky blue? Answer: yes, it is blue."))

        val openai: OpenAIClient = OpenAIOkHttpClient.fromEnv()
        val completion: ChatCompletion =
            openai
                .chat()
                .completions()
                .create(
                    convertToOpenAIParams(formattedPrompt)
                        .model(ChatModel.GPT_4_1_MINI)
                        .maxCompletionTokens(256)
                        .build()
                )

        val responseText = completion.choices()[0].message().content().orElse("")
        assertThat(responseText).isNotBlank()
        println("[OpenAI Structured] Raw response: $responseText")

        // The response should be valid JSON with a "correctness" boolean field
        val json = objectMapper.readTree(responseText)
        assertThat(json.has("correctness")).isTrue()
        assertThat(json.get("correctness").isBoolean).isTrue()
        println("[OpenAI Structured] correctness: ${json.get("correctness").asBoolean()}")

        langsmith.close()
    }

    // -------------------------------------------------------
    // Anthropic — regular prompt
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

        val anthropicClient: AnthropicClient = AnthropicOkHttpClient.fromEnv()
        val message: Message =
            anthropicClient
                .messages()
                .create(
                    convertToAnthropicParams(formattedPrompt)
                        .model(Model.CLAUDE_HAIKU_4_5_20251001)
                        .maxTokens(256)
                        .build()
                )

        val responseText =
            message.content().filter { it.isText() }.joinToString("") { it.asText().text() }
        assertThat(responseText).isNotBlank()
        println("[Anthropic] Response: $responseText")

        langsmith.close()
    }

    // -------------------------------------------------------
    // Anthropic — structured prompt with output schema
    // -------------------------------------------------------

    @Test
    fun anthropic_structuredPrompt() {
        assumeTrue(
            !langsmithApiKey.isNullOrBlank() && !anthropicApiKey.isNullOrBlank(),
            "Skipping: LANGSMITH_API_KEY and ANTHROPIC_API_KEY must be set",
        )

        val langsmith = LangsmithOkHttpClient.fromEnv()
        val promptClient = PromptClient.create(langsmith)

        val prompt = promptClient.pull("structured-extract")
        assertThat(prompt.hasOutputSchema()).isTrue()
        assertThat(prompt.outputSchema!!["title"]).isEqualTo("extract")

        val formattedPrompt =
            prompt.invoke(mapOf("question" to "Is the sky blue? Answer: yes, it is blue."))

        val anthropicClient: AnthropicClient = AnthropicOkHttpClient.fromEnv()
        val message: Message =
            anthropicClient
                .messages()
                .create(
                    convertToAnthropicParams(formattedPrompt)
                        .model(Model.CLAUDE_SONNET_4_6)
                        .maxTokens(256)
                        .build()
                )

        val responseText =
            message.content().filter { it.isText() }.joinToString("") { it.asText().text() }
        assertThat(responseText).isNotBlank()
        println("[Anthropic Structured] Raw response: $responseText")

        val json = objectMapper.readTree(responseText)
        assertThat(json.has("correctness")).isTrue()
        assertThat(json.get("correctness").isBoolean).isTrue()
        println("[Anthropic Structured] correctness: ${json.get("correctness").asBoolean()}")

        langsmith.close()
    }
}

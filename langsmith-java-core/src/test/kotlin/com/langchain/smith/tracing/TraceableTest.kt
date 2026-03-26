package com.langchain.smith.tracing

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Assumptions.assumeTrue
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

/**
 * Integration tests for [traceable] that post real runs to LangSmith.
 *
 * Requires `LANGSMITH_API_KEY` to be set. Tests are skipped if the key is missing.
 *
 * Run with:
 * ```bash
 * ./gradlew :langsmith-java-core:test --tests "com.langchain.smith.tracing.TraceableTest"
 * ```
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class TraceableTest {

    private lateinit var client: com.langchain.smith.client.LangsmithClient

    /** Gives background threads time to post runs. Temporary until flush moves to the client. */
    private fun awaitPendingRuns() = Thread.sleep(2000)

    private fun config(
        name: String,
        runType: RunType = RunType.CHAIN,
        metadata: Map<String, Any>? = null,
        tags: List<String>? = null,
    ) =
        TraceConfig(
            name = name,
            client = client,
            runType = runType,
            metadata = metadata,
            tags = tags,
            projectName = "traceable-java-tests",
            tracingEnabled = true,
        )

    @BeforeAll
    fun setUp() {
        assumeTrue(
            !System.getenv("LANGSMITH_API_KEY").isNullOrBlank(),
            "Skipping: LANGSMITH_API_KEY must be set",
        )
        client = LangsmithOkHttpClient.fromEnv()
    }

    @Test
    fun basicTrace() {
        val traced = traceable({ _: Map<String, Any?> -> "hello" }, config("basic-trace-test"))
        assertThat(traced(emptyMap())).isEqualTo("hello")
    }

    @Test
    fun traceWithInputsAndOutputs() {
        val traced = traceable({ _: Map<String, Any?> -> "positive" }, config("trace-with-io"))
        assertThat(traced(mapOf("text" to "hello world"))).isEqualTo("positive")
    }

    @Test
    fun traceWithRunType() {
        val traced =
            traceable(
                { _: Map<String, Any?> -> "tool result" },
                config("tool-trace", runType = RunType.TOOL),
            )
        assertThat(traced(emptyMap())).isEqualTo("tool result")
    }

    @Test
    fun traceWithMetadataAndTags() {
        val traced =
            traceable(
                { _: Map<String, Any?> -> "tagged" },
                config(
                    "tagged-trace",
                    metadata = mapOf("version" to "1.0"),
                    tags = listOf("test", "integration"),
                ),
            )
        assertThat(traced(emptyMap())).isEqualTo("tagged")
    }

    @Test
    fun traceRecordsError() {
        val failing =
            traceable(
                { _: Unit -> throw RuntimeException("something broke") },
                config("failing-trace"),
            )
        assertThatThrownBy { failing(Unit) }
            .isInstanceOf(RuntimeException::class.java)
            .hasMessage("something broke")
    }

    @Test
    fun nestedTraces() {
        val child1 = traceable({ _: Unit -> "from child 1" }, config("child-1"))
        val child2 = traceable({ _: Unit -> "from child 2" }, config("child-2"))
        val parent =
            traceable(
                { _: Unit ->
                    val a = child1(Unit)
                    val b = child2(Unit)
                    "$a + $b"
                },
                config("parent-trace"),
            )
        val result = parent(Unit)
        assertThat(result).isEqualTo("from child 1 + from child 2")
    }

    @Test
    fun deeplyNestedTrace() {
        val level3 =
            traceable({ _: Unit -> "deep result" }, config("level-3", runType = RunType.LLM))
        val level2 = traceable({ _: Unit -> level3(Unit) }, config("level-2"))
        val level1 = traceable({ _: Unit -> level2(Unit) }, config("level-1"))
        val result = level1(Unit)
        assertThat(result).isEqualTo("deep result")
    }

    @Test
    fun traceableWithOpenAiCall() {
        assumeTrue(
            !System.getenv("OPENAI_API_KEY").isNullOrBlank(),
            "Skipping: OPENAI_API_KEY must be set",
        )

        val openai = com.openai.client.okhttp.OpenAIOkHttpClient.fromEnv()

        val callOpenAi =
            traceable(
                { question: String ->
                    val completion =
                        openai
                            .chat()
                            .completions()
                            .create(
                                com.openai.models.chat.completions.ChatCompletionCreateParams
                                    .builder()
                                    .model(com.openai.models.ChatModel.GPT_4_1_MINI)
                                    .addUserMessage("$question Answer in one word.")
                                    .maxCompletionTokens(10)
                                    .build()
                            )
                    completion.choices()[0].message().content().orElse("")
                },
                config("call-openai", runType = RunType.LLM),
            )

        val formatAnswer =
            traceable({ answer: String -> "The answer is: $answer" }, config("format-answer"))

        val agent =
            traceable(
                { input: Map<String, Any?> ->
                    val answer = callOpenAi(input["question"] as String)
                    formatAnswer(answer)
                },
                config("openai-agent"),
            )

        val result = agent(mapOf("question" to "What is 2+2?"))
        println("[Traceable+OpenAI] Result: $result")

        awaitPendingRuns()
    }

    @Test
    fun traceableWithOpenAiResponsesCall() {
        assumeTrue(
            !System.getenv("OPENAI_API_KEY").isNullOrBlank(),
            "Skipping: OPENAI_API_KEY must be set",
        )

        val openai = com.openai.client.okhttp.OpenAIOkHttpClient.fromEnv()

        val callOpenAiResponses =
            traceable(
                { question: String ->
                    val response =
                        openai
                            .responses()
                            .create(
                                com.openai.models.responses.ResponseCreateParams.builder()
                                    .model(com.openai.models.ChatModel.GPT_4_1_MINI)
                                    .input("$question Answer in one word.")
                                    .build()
                            )
                    response.output().firstNotNullOfOrNull { item ->
                        item.message().getOrNull()?.content()?.firstNotNullOfOrNull { block ->
                            block.outputText().getOrNull()?.text()
                        }
                    } ?: ""
                },
                config("call-openai-responses", runType = RunType.LLM),
            )

        val agent =
            traceable(
                { input: Map<String, Any?> -> callOpenAiResponses(input["question"] as String) },
                config("openai-responses-agent"),
            )

        val result = agent(mapOf("question" to "What is the capital of France?"))

        assertThat(result).containsIgnoringCase("Paris")
        println("[Traceable+OpenAI Responses] Result: $result")

        awaitPendingRuns()
    }

    @Test
    fun getCurrentRun_returnsRunTree() {
        var capturedRun: RunTree? = null
        val traced =
            traceable(
                { _: Unit ->
                    capturedRun = getCurrentRunTree()
                    "done"
                },
                config("get-run-test"),
            )
        traced(Unit)
        assertThat(capturedRun).isNotNull
        assertThat(capturedRun!!.id).isNotBlank()
        assertThat(capturedRun!!.traceId).isNotBlank()
        assertThat(capturedRun!!.name).isEqualTo("get-run-test")
        assertThat(capturedRun!!.parentRunId).isNull()
        awaitPendingRuns()
    }

    @Test
    fun getCurrentRun_nestedRunHasParent() {
        var parentRun: RunTree? = null
        var childRun: RunTree? = null
        val child =
            traceable(
                { _: Unit ->
                    childRun = getCurrentRunTree()
                    "child"
                },
                config("child"),
            )
        val parent =
            traceable(
                { _: Unit ->
                    parentRun = getCurrentRunTree()
                    child(Unit)
                },
                config("parent"),
            )
        parent(Unit)
        assertThat(parentRun).isNotNull
        assertThat(childRun).isNotNull
        assertThat(childRun!!.parentRunId).isEqualTo(parentRun!!.id)
        assertThat(childRun!!.traceId).isEqualTo(parentRun!!.traceId)
        awaitPendingRuns()
    }

    @Test
    fun getCurrentRun_canMutateMetadata() {
        var capturedRun: RunTree? = null
        val traced =
            traceable(
                { _: Unit ->
                    val run = getCurrentRunTree()!!
                    run.metadata["custom_key"] = "custom_value"
                    run.metadata["numeric"] = 42
                    capturedRun = run
                    "done"
                },
                config("metadata-mutation-test", metadata = mapOf("initial" to "value")),
            )
        traced(Unit)
        assertThat(capturedRun).isNotNull
        assertThat(capturedRun!!.metadata)
            .containsEntry("initial", "value")
            .containsEntry("custom_key", "custom_value")
            .containsEntry("numeric", 42)
        awaitPendingRuns()
    }

    @Test
    fun getCurrentRun_canMutateExtra() {
        var capturedRun: RunTree? = null
        val traced =
            traceable(
                { _: Unit ->
                    val run = getCurrentRunTree()!!
                    run.extra["custom_data"] = mapOf("nested" to true)
                    capturedRun = run
                    "done"
                },
                config("extra-mutation-test"),
            )
        traced(Unit)
        assertThat(capturedRun).isNotNull
        @Suppress("UNCHECKED_CAST")
        val customData = capturedRun!!.extra["custom_data"] as Map<String, Any>
        assertThat(customData).containsEntry("nested", true)
        awaitPendingRuns()
    }

    @Test
    fun getCurrentRun_outsideTracedFunction() {
        assertThat(getCurrentRunTree()).isNull()
    }
}

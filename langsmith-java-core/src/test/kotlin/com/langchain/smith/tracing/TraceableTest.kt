package com.langchain.smith.tracing

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Assumptions.assumeTrue
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

/**
 * Integration tests for [TracingContext] that post real runs to LangSmith.
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

    private lateinit var tracing: TracingContext

    @BeforeAll
    fun setUp() {
        assumeTrue(
            !System.getenv("LANGSMITH_API_KEY").isNullOrBlank(),
            "Skipping: LANGSMITH_API_KEY must be set",
        )
        val client = LangsmithOkHttpClient.fromEnv()
        tracing =
            TracingContext(client, projectName = "traceable-java-tests", tracingEnabled = true)
    }

    enum class SimpleTraceTestCase(
        val config: TraceConfig,
        val input: Map<String, Any?> = emptyMap(),
        val body: (Map<String, Any?>) -> String,
        val expectedResult: String,
    ) {
        BASIC_TRACE(
            config = TraceConfig("basic-trace-test"),
            body = { "hello" },
            expectedResult = "hello",
        ),
        TRACE_WITH_INPUTS_AND_OUTPUTS(
            config = TraceConfig("trace-with-io"),
            input = mapOf("text" to "hello world"),
            body = { "positive" },
            expectedResult = "positive",
        ),
        TRACE_WITH_RUN_TYPE(
            config = TraceConfig("tool-trace", runType = RunType.TOOL),
            body = { "tool result" },
            expectedResult = "tool result",
        ),
        TRACE_WITH_METADATA_AND_TAGS(
            config =
                TraceConfig(
                    "tagged-trace",
                    metadata = mapOf("version" to "1.0"),
                    tags = listOf("test", "integration"),
                ),
            body = { "tagged" },
            expectedResult = "tagged",
        ),
        JAVA_FRIENDLY_TRACE(
            config = TraceConfig("java-style"),
            body = { "from java" },
            expectedResult = "from java",
        ),
    }

    @ParameterizedTest
    @EnumSource
    fun simpleTrace(testCase: SimpleTraceTestCase) {
        val traced = tracing.traceable(testCase.body, testCase.config)
        val result = traced(testCase.input)
        assertThat(result).isEqualTo(testCase.expectedResult)
    }

    @Test
    fun traceRecordsError() {
        val failing =
            tracing.traceable(
                { _: Unit -> throw RuntimeException("something broke") },
                TraceConfig("failing-trace"),
            )
        assertThatThrownBy { failing(Unit) }
            .isInstanceOf(RuntimeException::class.java)
            .hasMessage("something broke")
    }

    @Test
    fun nestedTraces() {
        val child1 = tracing.traceable({ _: Unit -> "from child 1" }, TraceConfig("child-1"))
        val child2 = tracing.traceable({ _: Unit -> "from child 2" }, TraceConfig("child-2"))
        val parent =
            tracing.traceable(
                { _: Unit ->
                    val a = child1(Unit)
                    val b = child2(Unit)
                    "$a + $b"
                },
                TraceConfig("parent-trace"),
            )
        val result = parent(Unit)
        assertThat(result).isEqualTo("from child 1 + from child 2")
    }

    @Test
    fun deeplyNestedTrace() {
        val level3 =
            tracing.traceable(
                { _: Unit -> "deep result" },
                TraceConfig("level-3", runType = RunType.LLM),
            )
        val level2 = tracing.traceable({ _: Unit -> level3(Unit) }, TraceConfig("level-2"))
        val level1 = tracing.traceable({ _: Unit -> level2(Unit) }, TraceConfig("level-1"))
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
            tracing.traceable(
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
                TraceConfig("call-openai", runType = RunType.LLM),
            )

        val formatAnswer =
            tracing.traceable(
                { answer: String -> "The answer is: $answer" },
                TraceConfig("format-answer"),
            )

        val agent =
            tracing.traceable(
                { input: Map<String, Any?> ->
                    val answer = callOpenAi(input["question"] as String)
                    formatAnswer(answer)
                },
                TraceConfig("openai-agent"),
            )

        val result = agent(mapOf("question" to "What is 2+2?"))
        println("[Traceable+OpenAI] Result: $result")

        tracing.awaitPendingRuns()
    }

    @Test
    fun traceableWithOpenAiResponsesCall() {
        assumeTrue(
            !System.getenv("OPENAI_API_KEY").isNullOrBlank(),
            "Skipping: OPENAI_API_KEY must be set",
        )

        val openai = com.openai.client.okhttp.OpenAIOkHttpClient.fromEnv()

        val callOpenAiResponses =
            tracing.traceable(
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
                TraceConfig("call-openai-responses", runType = RunType.LLM),
            )

        val agent =
            tracing.traceable(
                { input: Map<String, Any?> -> callOpenAiResponses(input["question"] as String) },
                TraceConfig("openai-responses-agent"),
            )

        val result = agent(mapOf("question" to "What is the capital of France?"))

        assertThat(result).containsIgnoringCase("Paris")
        println("[Traceable+OpenAI Responses] Result: $result")

        tracing.awaitPendingRuns()
    }

    @Test
    fun getCurrentRun_returnsRunTree() {
        var capturedRun: RunTree? = null
        val traced =
            tracing.traceable(
                { _: Unit ->
                    capturedRun = tracing.getCurrentRun()
                    "done"
                },
                TraceConfig("get-run-test"),
            )
        traced(Unit)
        assertThat(capturedRun).isNotNull
        assertThat(capturedRun!!.id).isNotBlank()
        assertThat(capturedRun!!.traceId).isNotBlank()
        assertThat(capturedRun!!.name).isEqualTo("get-run-test")
        assertThat(capturedRun!!.parentRunId).isNull()
        tracing.awaitPendingRuns()
    }

    @Test
    fun getCurrentRun_nestedRunHasParent() {
        var parentRun: RunTree? = null
        var childRun: RunTree? = null
        val child =
            tracing.traceable(
                { _: Unit ->
                    childRun = tracing.getCurrentRun()
                    "child"
                },
                TraceConfig("child"),
            )
        val parent =
            tracing.traceable(
                { _: Unit ->
                    parentRun = tracing.getCurrentRun()
                    child(Unit)
                },
                TraceConfig("parent"),
            )
        parent(Unit)
        assertThat(parentRun).isNotNull
        assertThat(childRun).isNotNull
        assertThat(childRun!!.parentRunId).isEqualTo(parentRun!!.id)
        assertThat(childRun!!.traceId).isEqualTo(parentRun!!.traceId)
        tracing.awaitPendingRuns()
    }

    @Test
    fun getCurrentRun_canMutateMetadata() {
        var capturedRun: RunTree? = null
        val traced =
            tracing.traceable(
                { _: Unit ->
                    val run = tracing.getCurrentRun()!!
                    run.metadata["custom_key"] = "custom_value"
                    run.metadata["numeric"] = 42
                    capturedRun = run
                    "done"
                },
                TraceConfig("metadata-mutation-test", metadata = mapOf("initial" to "value")),
            )
        traced(Unit)
        assertThat(capturedRun).isNotNull
        assertThat(capturedRun!!.metadata)
            .containsEntry("initial", "value")
            .containsEntry("custom_key", "custom_value")
            .containsEntry("numeric", 42)
        tracing.awaitPendingRuns()
    }

    @Test
    fun getCurrentRun_canMutateExtra() {
        var capturedRun: RunTree? = null
        val traced =
            tracing.traceable(
                { _: Unit ->
                    val run = tracing.getCurrentRun()!!
                    run.extra["custom_data"] = mapOf("nested" to true)
                    capturedRun = run
                    "done"
                },
                TraceConfig("extra-mutation-test"),
            )
        traced(Unit)
        assertThat(capturedRun).isNotNull
        @Suppress("UNCHECKED_CAST")
        val customData = capturedRun!!.extra["custom_data"] as Map<String, Any>
        assertThat(customData).containsEntry("nested", true)
        tracing.awaitPendingRuns()
    }

    @Test
    fun getCurrentRun_outsideTracedFunction() {
        assertThat(tracing.getCurrentRun()).isNull()
    }
}

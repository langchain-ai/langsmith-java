package com.langchain.smith.tracing

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Assumptions.assumeTrue
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource
import kotlin.jvm.optionals.getOrNull

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
        tracing = TracingContext(client, projectName = "traceable-java-tests")
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

        assertThat(result).contains("4")
        println("[Traceable+OpenAI] Result: $result")

        // Give background threads time to post runs
        Thread.sleep(2000)
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
                { input: Map<String, Any?> ->
                    callOpenAiResponses(input["question"] as String)
                },
                TraceConfig("openai-responses-agent"),
            )

        val result = agent(mapOf("question" to "What is the capital of France?"))

        assertThat(result).containsIgnoringCase("Paris")
        println("[Traceable+OpenAI Responses] Result: $result")

        // Give background threads time to post runs
        Thread.sleep(2000)
    }
}

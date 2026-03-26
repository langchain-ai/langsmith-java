package com.langchain.smith.tracing

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.openai.client.okhttp.OpenAIOkHttpClient
import com.openai.core.JsonValue
import com.openai.models.ChatModel
import com.openai.models.FunctionDefinition
import com.openai.models.FunctionParameters
import com.openai.models.chat.completions.ChatCompletion
import com.openai.models.chat.completions.ChatCompletionCreateParams
import com.openai.models.chat.completions.ChatCompletionFunctionTool
import com.openai.models.chat.completions.ChatCompletionMessage
import com.openai.models.chat.completions.ChatCompletionMessageParam
import com.openai.models.chat.completions.ChatCompletionToolMessageParam
import java.util.function.Function as JFunction
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Assumptions.assumeTrue
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

private val testJsonMapper = jacksonObjectMapper()

private fun toJsonMap(value: Any): Map<String, Any?> =
    testJsonMapper.convertValue(value, object : TypeReference<Map<String, Any?>>() {})

private fun weatherTool(): ChatCompletionFunctionTool =
    ChatCompletionFunctionTool.builder()
        .function(
            FunctionDefinition.builder()
                .name("get_weather")
                .description("Get the weather for a location")
                .parameters(
                    FunctionParameters.builder()
                        .putAdditionalProperty("type", JsonValue.from("object"))
                        .putAdditionalProperty(
                            "properties",
                            JsonValue.from(
                                mapOf(
                                    "location" to mapOf(
                                        "type" to "string",
                                        "description" to "City and state, e.g. San Francisco, CA",
                                    )
                                )
                            ),
                        )
                        .putAdditionalProperty("required", JsonValue.from(listOf("location")))
                        .build()
                )
                .build()
        )
        .build()

private fun buildToolLoopParams(messages: List<ChatCompletionMessageParam>): ChatCompletionCreateParams =
    ChatCompletionCreateParams.builder()
        .model(ChatModel.GPT_4_1_MINI)
        .messages(messages)
        .addTool(weatherTool())
        .maxCompletionTokens(150)
        .build()

private fun toolLoopInputMap(params: ChatCompletionCreateParams): Map<String, Any?> =
    mapOf(
        "model" to params.model().toString(),
        "messages" to params.messages().map { toJsonMap(it) },
        "tools" to params.tools().getOrNull()?.map { toJsonMap(it) },
    )

private fun toolLoopOutputMap(completion: ChatCompletion): Map<String, Any?> =
    mapOf(
        "id" to completion.id(),
        "model" to completion.model().toString(),
        "choices" to completion.choices().map { choice ->
            mapOf(
                "finish_reason" to choice.finishReason().toString(),
                "message" to toJsonMap(choice.message()),
            )
        },
    )

private fun userMessage(content: String): ChatCompletionMessageParam =
    ChatCompletionMessageParam.ofUser(
        com.openai.models.chat.completions.ChatCompletionUserMessageParam.builder()
            .content(content)
            .build()
    )

private fun assistantMessage(message: ChatCompletionMessage): ChatCompletionMessageParam =
    ChatCompletionMessageParam.ofAssistant(message.toParam())

private fun toolMessage(toolCallId: String, result: Map<String, Any?>): ChatCompletionMessageParam =
    ChatCompletionMessageParam.ofTool(
        ChatCompletionToolMessageParam.builder().toolCallId(toolCallId).contentAsJson(result).build()
    )

private fun toolResult(argumentsJson: String): Map<String, Any?> =
    mapOf(
        "tool" to "get_weather",
        "arguments_json" to argumentsJson,
        "location" to "San Francisco, CA",
        "forecast" to "sunny",
        "temperature_f" to 72,
    )

private fun finalContent(message: ChatCompletionMessage): String = message.content().getOrNull() ?: ""

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
    ): TraceConfig<Any?, Any?> =
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
    fun traceableWithOpenAiToolLoop_usesProcessInputsAndOutputs() {
        assumeTrue(
            !System.getenv("OPENAI_API_KEY").isNullOrBlank(),
            "Skipping: OPENAI_API_KEY must be set",
        )

        val openai = OpenAIOkHttpClient.fromEnv()
        var capturedLlmRun: RunTree? = null
        var capturedAgentRun: RunTree? = null

        val callOpenAi =
            traceable(
                { params: ChatCompletionCreateParams ->
                    capturedLlmRun = getCurrentRunTree()
                    openai.chat().completions().create(params)
                },
                TraceConfig<ChatCompletionCreateParams, ChatCompletion>(
                    name = "call-openai-tool-loop",
                    client = client,
                    runType = RunType.LLM,
                    projectName = "traceable-java-tests",
                    tracingEnabled = true,
                    processInputs = JFunction(::toolLoopInputMap),
                    processOutputs = JFunction(::toolLoopOutputMap),
                ),
            )

        val executeTool =
            traceable(
                { argumentsJson: String -> toolResult(argumentsJson) },
                config("get_weather", runType = RunType.TOOL),
            )

        val agent =
            traceable(
                { question: String ->
                    capturedAgentRun = getCurrentRunTree()
                    val messages = mutableListOf<ChatCompletionMessageParam>()
                    messages += userMessage("$question Use the get_weather tool and then answer succinctly.")

                    repeat(3) {
                        val completion = callOpenAi(buildToolLoopParams(messages))
                        val message = completion.choices()[0].message()
                        val toolCalls = message.toolCalls().getOrNull().orEmpty()

                        if (toolCalls.isEmpty()) {
                            return@traceable finalContent(message)
                        }

                        messages += assistantMessage(message)
                        toolCalls.forEach { toolCall ->
                            val fn = toolCall.asFunction()
                            val result = executeTool(fn.function().arguments())
                            messages += toolMessage(fn.id(), result)
                        }
                    }

                    error("Model did not finish tool loop in time")
                },
                TraceConfig<String, String>(
                    name = "openai-tool-loop-agent",
                    client = client,
                    projectName = "traceable-java-tests",
                    tracingEnabled = true,
                    processInputs = JFunction { question -> mapOf("question" to question) },
                    processOutputs = JFunction { answer -> mapOf("answer" to answer) },
                ),
            )

        val result = agent("What is the weather in San Francisco?")
        assertThat(result).isNotBlank()
        assertThat(capturedAgentRun).isNotNull
        assertThat(capturedAgentRun!!.inputs).isEqualTo(mapOf("question" to "What is the weather in San Francisco?"))
        assertThat(capturedAgentRun!!.outputs).isEqualTo(mapOf("answer" to result))
        assertThat(capturedLlmRun).isNotNull
        assertThat(capturedLlmRun!!.inputs).containsKeys("model", "messages", "tools")
        assertThat(capturedLlmRun!!.outputs).containsKeys("id", "model", "choices")

        println("[Traceable+OpenAI Tool Loop] Result: $result")
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

    // TODO: Add agent loop with OpenAI tool calling integration test once
    //  the OpenAI SDK dependency is bumped (requires updating OTel wrappers
    //  for new abstract members). The tool calling API (`addTool`, `arguments()`,
    //  `contentAsJson`) requires OpenAI Java SDK 4.10+.
}

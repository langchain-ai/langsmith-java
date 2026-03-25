package com.langchain.smith.tracing

import com.fasterxml.jackson.databind.ObjectMapper
import com.langchain.smith.client.LangsmithClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.getJavaVersion
import com.langchain.smith.core.getPackageVersion
import com.langchain.smith.models.runs.Run
import com.langchain.smith.models.runs.RunIngestBatchParams
import java.time.Instant
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter
import java.util.UUID
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.function.BiFunction
import java.util.function.Function
import java.util.function.Supplier
import kotlin.reflect.KFunction

/** The type of run being traced, which maps to run_type in LangSmith. */
enum class RunType(internal val value: String) {
    /** A chain/pipeline/workflow step. */
    CHAIN("chain"),
    /** An LLM call. */
    LLM("llm"),
    /** A tool/function invocation. */
    TOOL("tool"),
    /** A retrieval operation. */
    RETRIEVER("retriever"),
}

private val jsonMapper = ObjectMapper()
private val CURRENT_RUN = ThreadLocal<RunTree?>()
private val ISO_FORMAT =
    DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSS'Z'").withZone(ZoneOffset.UTC)

private fun serializeToJson(value: Any?): String =
    when (value) {
        null -> "{}"
        is String -> jsonMapper.writeValueAsString(mapOf("output" to value))
        is Map<*, *> -> jsonMapper.writeValueAsString(value)
        else ->
            try {
                jsonMapper.writeValueAsString(value)
            } catch (_: Exception) {
                jsonMapper.writeValueAsString(mapOf("output" to value.toString()))
            }
    }

private fun nowIso(): String = ISO_FORMAT.format(Instant.now())

private fun dottedOrder(time: String, id: String): String =
    time.replace(Regex("[-:.]"), "") + id

/**
 * Internal representation of a run in the trace tree. Tracks IDs, timing, parent-child
 * relationships, and posts itself to LangSmith when complete.
 */
internal class RunTree(
    val id: String,
    val traceId: String,
    val dottedOrder: String,
    val parentRunId: String?,
    val name: String,
    val runType: RunType,
    val startTime: String,
    val projectName: String,
    var inputs: Map<String, Any?>?,
    var outputs: Map<String, Any?>?,
    var error: String?,
    var endTime: String?,
    val metadata: Map<String, String>?,
    val tags: List<String>?,
)

/**
 * Configuration for a traced run.
 *
 * @property name the name of the run, displayed in LangSmith. If not set, the name is inferred
 *   from the function reference (e.g. `::myFunction` becomes `"myFunction"`), or defaults to
 *   `"<lambda>"` for anonymous functions.
 * @property runType the type of run (defaults to [RunType.CHAIN])
 * @property metadata optional metadata to attach to the run
 * @property tags optional tags for filtering in LangSmith
 */
data class TraceConfig
@JvmOverloads
constructor(
    val name: String? = null,
    val runType: RunType = RunType.CHAIN,
    val metadata: Map<String, String>? = null,
    val tags: List<String>? = null,
)

/** A function that accepts three arguments and produces a result. */
@FunctionalInterface
fun interface TriFunction<I1, I2, I3, O> {
    fun apply(i1: I1, i2: I2, i3: I3): O
}

private const val DEFAULT_RUN_NAME = "<lambda>"

/** Resolves the run name from the config and the function being wrapped. */
private fun resolveName(config: TraceConfig, block: Any?): String {
    config.name?.let { return it }
    if (block is KFunction<*>) return block.name
    return DEFAULT_RUN_NAME
}

/**
 * Configures tracing for the current thread. Must be called before using [traceable].
 *
 * ## Example (Kotlin)
 *
 * ```kotlin
 * val langsmith = LangsmithOkHttpClient.fromEnv()
 * val tracing = TracingContext(langsmith, projectName = "my-project")
 *
 * // Wrap an existing function — name is inferred from the reference.
 * fun answerQuestion(question: String): String = "42"
 *
 * val traced = tracing.traceable(::answerQuestion)  // run name = "answerQuestion"
 * val result = traced("What is the meaning of life?")
 *
 * // Or provide explicit config:
 * val traced2 = tracing.traceable(::answerQuestion, TraceConfig(name = "my-qa-chain"))
 * ```
 *
 * ## Example (Java)
 *
 * ```java
 * LangsmithClient langsmith = LangsmithOkHttpClient.fromEnv();
 * TracingContext tracing = new TracingContext(langsmith, "my-project");
 *
 * Function<String, String> traced = tracing.traceable(
 *     (Function<String, String>) q -> "42",
 *     new TraceConfig("answer-question"));
 * String result = traced.apply("What is the meaning of life?");
 * ```
 */
class TracingContext
@JvmOverloads
constructor(
    private val client: LangsmithClient,
    private val projectName: String =
        System.getenv("LANGSMITH_PROJECT")?.takeIf { it.isNotBlank() } ?: "default",
    private val executor: ExecutorService = Executors.newCachedThreadPool(),
) {

    // ---- 0-arg overloads ----

    /** Wraps a no-arg function with LangSmith tracing (Kotlin). */
    @JvmSynthetic
    fun <O> traceable(block: () -> O, config: TraceConfig = TraceConfig()): () -> O {
        val resolvedConfig = config.copy(name = resolveName(config, block))
        return { executeTraced(resolvedConfig, emptyMap()) { block() } }
    }

    /** Wraps a no-arg function with LangSmith tracing (Java [Supplier]). */
    @JvmOverloads
    fun <O> traceable(block: Supplier<O>, config: TraceConfig = TraceConfig()): Supplier<O> {
        val resolvedConfig = config.copy(name = resolveName(config, block))
        return Supplier { executeTraced(resolvedConfig, emptyMap()) { block.get() } }
    }

    // ---- 1-arg overloads ----

    /**
     * Wraps a function with LangSmith tracing. Returns a new function with the same signature that,
     * when called, creates a traced run, records the input, executes the original function, and
     * records the output.
     *
     * Runs nest automatically — calling a traced function inside another traced function creates a
     * parent-child relationship in LangSmith.
     *
     * The input to the returned function is automatically serialized as the run's inputs. If the
     * input is a [Map], its entries are used directly; otherwise it is recorded as `{"input": ...}`.
     *
     * @param block the function to wrap
     * @param config tracing configuration (run name, type, metadata, tags)
     * @return a traced wrapper around [block]
     */
    @JvmSynthetic
    fun <I, O> traceable(block: (I) -> O, config: TraceConfig = TraceConfig()): (I) -> O {
        val resolvedConfig = config.copy(name = resolveName(config, block))
        return { input ->
            val inputs = toInputMap(input)
            executeTraced(resolvedConfig, inputs) { block(input) }
        }
    }

    /** Wraps a 1-arg function with LangSmith tracing (Java [Function]). */
    @JvmOverloads
    fun <I, O> traceable(block: Function<I, O>, config: TraceConfig = TraceConfig()): Function<I, O> {
        val traced = traceable({ i: I -> block.apply(i) }, config)
        return Function { traced(it) }
    }

    // ---- 2-arg overloads ----

    /** Wraps a 2-arg function with LangSmith tracing (Kotlin). */
    @JvmSynthetic
    fun <I1, I2, O> traceable(
        block: (I1, I2) -> O,
        config: TraceConfig = TraceConfig(),
    ): (I1, I2) -> O {
        val resolvedConfig = config.copy(name = resolveName(config, block))
        return { i1, i2 ->
            val inputs = mapOf("i1" to i1, "i2" to i2)
            executeTraced(resolvedConfig, inputs) { block(i1, i2) }
        }
    }

    /** Wraps a 2-arg function with LangSmith tracing (Java [BiFunction]). */
    @JvmOverloads
    fun <I1, I2, O> traceable(
        block: BiFunction<I1, I2, O>,
        config: TraceConfig = TraceConfig(),
    ): BiFunction<I1, I2, O> {
        val traced = traceable({ i1: I1, i2: I2 -> block.apply(i1, i2) }, config)
        return BiFunction { i1, i2 -> traced(i1, i2) }
    }

    // ---- 3-arg overloads ----

    /** Wraps a 3-arg function with LangSmith tracing (Kotlin). */
    @JvmSynthetic
    fun <I1, I2, I3, O> traceable(
        block: (I1, I2, I3) -> O,
        config: TraceConfig = TraceConfig(),
    ): (I1, I2, I3) -> O {
        val resolvedConfig = config.copy(name = resolveName(config, block))
        return { i1, i2, i3 ->
            val inputs = mapOf("i1" to i1, "i2" to i2, "i3" to i3)
            executeTraced(resolvedConfig, inputs) { block(i1, i2, i3) }
        }
    }

    /** Wraps a 3-arg function with LangSmith tracing (Java [TriFunction]). */
    @JvmOverloads
    fun <I1, I2, I3, O> traceable(
        block: TriFunction<I1, I2, I3, O>,
        config: TraceConfig = TraceConfig(),
    ): TriFunction<I1, I2, I3, O> {
        val traced = traceable({ i1: I1, i2: I2, i3: I3 -> block.apply(i1, i2, i3) }, config)
        return TriFunction { i1, i2, i3 -> traced(i1, i2, i3) }
    }

    /**
     * Converts a function input to a map suitable for recording as run inputs.
     *
     * If the input is already a [Map], its entries are used directly. Otherwise the input is
     * wrapped as `{"input": value}`.
     */
    private fun toInputMap(input: Any?): Map<String, Any?> =
        when (input) {
            is Map<*, *> -> {
                @Suppress("UNCHECKED_CAST")
                input as Map<String, Any?>
            }
            else -> mapOf("input" to input)
        }

    /** Core tracing logic shared by all overloads. */
    private fun <T> executeTraced(
        config: TraceConfig,
        inputs: Map<String, Any?>?,
        block: () -> T,
    ): T {
        val name = config.name ?: DEFAULT_RUN_NAME
        val runType = config.runType
        val metadata = config.metadata
        val tags = config.tags
        val parentRun = CURRENT_RUN.get()
        val runId = UUID.randomUUID().toString()
        val startTime = nowIso()
        val traceId = parentRun?.traceId ?: runId
        val parentDottedOrder = parentRun?.dottedOrder
        val myDottedOrder =
            if (parentDottedOrder != null) "$parentDottedOrder.${dottedOrder(startTime, runId)}"
            else dottedOrder(startTime, runId)

        val run =
            RunTree(
                id = runId,
                traceId = traceId,
                dottedOrder = myDottedOrder,
                parentRunId = parentRun?.id,
                name = name,
                runType = runType,
                startTime = startTime,
                projectName = projectName,
                inputs = inputs,
                outputs = null,
                error = null,
                endTime = null,
                metadata = metadata,
                tags = tags,
            )

        CURRENT_RUN.set(run)
        postRun(run)
        try {
            val result = block()
            run.endTime = nowIso()
            run.outputs =
                when (result) {
                    is Map<*, *> -> {
                        @Suppress("UNCHECKED_CAST") (result as Map<String, Any?>)
                    }
                    null -> mapOf("output" to null)
                    else -> mapOf("output" to result)
                }
            patchRun(run)
            return result
        } catch (e: Throwable) {
            run.endTime = nowIso()
            run.error = e.stackTraceToString()
            patchRun(run)
            throw e
        } finally {
            CURRENT_RUN.set(parentRun)
        }
    }

    /**
     * Posts a new run to LangSmith in the background (creates the run with inputs + start time).
     */
    private fun postRun(run: RunTree) {
        val runData = buildRunData(run)
        executor.submit {
            try {
                client.runs().ingestBatch(RunIngestBatchParams.builder().addPost(runData).build())
            } catch (e: Exception) {
                System.err.println("[LangSmith] Failed to post run '${run.name}': ${e.message}")
            }
        }
    }

    /** Patches a run in LangSmith in the background (updates with outputs, end time, error). */
    private fun patchRun(run: RunTree) {
        val runData = buildRunData(run)
        executor.submit {
            try {
                client.runs().ingestBatch(RunIngestBatchParams.builder().addPatch(runData).build())
            } catch (e: Exception) {
                System.err.println("[LangSmith] Failed to patch run '${run.name}': ${e.message}")
            }
        }
    }

    private fun toJsonValueMap(data: Any?): Map<String, JsonValue> {
        val json = serializeToJson(data)
        @Suppress("UNCHECKED_CAST")
        val map = jsonMapper.readValue(json, Map::class.java) as Map<String, Any?>
        return map.mapValues { JsonValue.from(it.value) }
    }

    private val runtimeMetadata: Map<String, JsonValue> by lazy {
        mapOf(
            "runtime" to JsonValue.from("java"),
            "runtime_version" to JsonValue.from(getJavaVersion()),
            "sdk" to JsonValue.from("langsmith-java"),
            "sdk_version" to JsonValue.from(getPackageVersion()),
        )
    }

    private fun buildRuntimeMetadata(
        userMetadata: Map<String, String>?,
    ): Map<String, JsonValue> =
        if (userMetadata.isNullOrEmpty()) {
            runtimeMetadata
        } else {
            buildMap {
                putAll(runtimeMetadata)
                userMetadata.forEach { (k, v) -> put(k, JsonValue.from(v)) }
            }
        }

    private fun buildRunData(run: RunTree): Run {
        val builder =
            Run.builder()
                .id(run.id)
                .traceId(run.traceId)
                .dottedOrder(run.dottedOrder)
                .name(run.name)
                .runType(Run.RunType.of(run.runType.value))
                .startTime(run.startTime)
                .sessionName(run.projectName)
                .tags(run.tags ?: emptyList())
                .inputs(
                    Run.Inputs.builder()
                        .putAllAdditionalProperties(toJsonValueMap(run.inputs))
                        .build()
                )
                .extra(
                    Run.Extra.builder()
                        .putAdditionalProperty(
                            "metadata",
                            JsonValue.from(buildRuntimeMetadata(run.metadata)),
                        )
                        .build()
                )

        run.endTime?.let { builder.endTime(it) }
        run.error?.let { builder.error(it) }
        run.parentRunId?.let { builder.parentRunId(it) }
        run.outputs?.let {
            builder.outputs(
                Run.Outputs.builder().putAllAdditionalProperties(toJsonValueMap(it)).build()
            )
        }

        return builder.build()
    }
}

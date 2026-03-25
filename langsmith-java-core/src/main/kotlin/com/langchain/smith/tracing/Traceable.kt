package com.langchain.smith.tracing

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
import java.util.concurrent.TimeUnit
import java.util.function.BiFunction
import java.util.function.Function
import java.util.function.Supplier
import kotlin.reflect.KFunction
import org.slf4j.LoggerFactory

private val logger = LoggerFactory.getLogger("com.langchain.smith.tracing.Traceable")

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

private val CURRENT_RUN = RunContext.create()
private val ISO_FORMAT =
    DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSS'Z'").withZone(ZoneOffset.UTC)

private fun nowIso(): String = ISO_FORMAT.format(Instant.now())

private val DOTTED_ORDER_STRIP = Regex("[-:.]")

private fun dottedOrder(time: String, id: String): String =
    time.replace(DOTTED_ORDER_STRIP, "") + id

/**
 * Checks whether LangSmith tracing is enabled.
 *
 * Returns `true` when any of the following environment variables is set to `"true"` (
 * case-insensitive):
 * - `LANGSMITH_TRACING_V2`
 * - `LANGSMITH_TRACING`
 * - `LANGCHAIN_TRACING_V2`
 * - `LANGCHAIN_TRACING`
 *
 * The corresponding Java system properties (`langsmith.tracing`, `langsmith.tracingV2`, etc.) are
 * also checked and take precedence.
 */
fun isTracingEnabled(): Boolean {
    val envVars =
        listOf(
            "LANGSMITH_TRACING_V2" to "langsmith.tracingV2",
            "LANGSMITH_TRACING" to "langsmith.tracing",
            "LANGCHAIN_TRACING_V2" to "langchain.tracingV2",
            "LANGCHAIN_TRACING" to "langchain.tracing",
        )
    return envVars.any { (env, prop) ->
        System.getProperty(prop)?.equals("true", ignoreCase = true) == true ||
            System.getenv(env)?.equals("true", ignoreCase = true) == true
    }
}

/**
 * Configuration for a traced run.
 *
 * @property name the name of the run, displayed in LangSmith. If not set, the name is inferred from
 *   the function reference (e.g. `::myFunction` becomes `"myFunction"`), or defaults to
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
    val metadata: Map<String, Any>? = null,
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
    config.name?.let {
        return it
    }
    if (block is KFunction<*>) return block.name
    return DEFAULT_RUN_NAME
}

/**
 * Configures tracing for the current thread. Must be called before using [traceable].
 *
 * Tracing is only active when [tracingEnabled] is `true`. By default this is determined by the
 * `LANGSMITH_TRACING` / `LANGCHAIN_TRACING` environment variables (see [isTracingEnabled]). When
 * tracing is disabled, [traceable] wrappers still execute the underlying function but skip all
 * LangSmith communication, so there is zero overhead.
 *
 * `TracingContext` implements [AutoCloseable]. Call [close] (or use Kotlin `use {}` / Java
 * try-with-resources) to wait for pending background posts and shut down the thread pool.
 *
 * ## Async / multi-thread usage
 *
 * Run context is automatically propagated to nested synchronous calls. On Java 21+, `ScopedValue`
 * is used, which also propagates context into child tasks forked via `StructuredTaskScope`. On
 * older JVMs a `ThreadLocal` is used as a fallback.
 *
 * **Neither mechanism automatically propagates context across unstructured async boundaries** such
 * as `CompletableFuture.supplyAsync`, `ExecutorService.submit`, or Kotlin coroutines. For those
 * cases, capture the current run with [getCurrentRun] and restore it on the new thread with
 * [withParent]:
 * ```kotlin
 * val run = tracing.getCurrentRun()
 * CompletableFuture.supplyAsync {
 *     tracing.withParent(run) { tracedChild("input") }
 * }
 * ```
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
 * // Access the current run inside a traced function:
 * val traced2 = tracing.traceable({ _: Unit ->
 *     val run = tracing.getCurrentRun()
 *     println("Run ID: ${run?.id}")
 *     "done"
 * })
 *
 * tracing.close() // flush pending runs
 * ```
 *
 * ## Example (Java)
 *
 * ```java
 * LangsmithClient langsmith = LangsmithOkHttpClient.fromEnv();
 * try (TracingContext tracing = new TracingContext(langsmith, "my-project")) {
 *     Function<String, String> traced = tracing.traceable(
 *         (Function<String, String>) q -> "42",
 *         new TraceConfig("answer-question"));
 *     String result = traced.apply("What is the meaning of life?");
 * } // pending runs are flushed on close
 * ```
 */
class TracingContext
@JvmOverloads
constructor(
    private val client: LangsmithClient,
    private val projectName: String =
        System.getenv("LANGSMITH_PROJECT")?.takeIf { it.isNotBlank() } ?: "default",
    private val executor: ExecutorService = Executors.newCachedThreadPool(),
    private val tracingEnabled: Boolean = isTracingEnabled(),
) : AutoCloseable {

    /**
     * Returns the [RunTree] for the currently-executing traced function on this thread, or `null`
     * if there is no active run (e.g. called outside a [traceable] wrapper, or tracing is
     * disabled).
     *
     * The returned [RunTree] is mutable — you can add entries to [RunTree.metadata] or
     * [RunTree.extra] and they will be included when the run is posted to LangSmith.
     *
     * To propagate context across async boundaries, pass the returned [RunTree] to [withParent] on
     * the new thread.
     *
     * @see withParent
     */
    fun getCurrentRun(): RunTree? = CURRENT_RUN.get()

    /**
     * Executes [block] with [parent] as the current run on this thread. Traced functions called
     * inside [block] will become children of [parent].
     *
     * Use this to propagate context across async boundaries where the run context is not
     * automatically inherited (e.g. `CompletableFuture`, `ExecutorService`, coroutines).
     *
     * ```kotlin
     * val parent = tracing.getCurrentRun()
     * CompletableFuture.supplyAsync {
     *     tracing.withParent(parent) {
     *         // child runs created here will be nested under parent
     *         tracedChild("input")
     *     }
     * }
     * ```
     *
     * @param parent the run to set as the current parent, or `null` to clear the context
     * @param block the code to execute with the given parent context
     * @return the result of [block]
     */
    @JvmSynthetic
    fun <T> withParent(parent: RunTree?, block: () -> T): T = CURRENT_RUN.runWith(parent, block)

    /**
     * Executes [block] with [parent] as the current run on this thread (Java-friendly overload).
     *
     * @see withParent
     */
    fun <T> withParent(parent: RunTree?, block: java.util.concurrent.Callable<T>): T =
        CURRENT_RUN.runWith(parent) { block.call() }

    /**
     * Blocks until all pending background run posts and patches have completed, or the timeout
     * elapses. Does **not** shut down the executor — new traced calls can still be made afterwards.
     *
     * @param timeout maximum time to wait
     * @param unit time unit for [timeout]
     * @return `true` if all pending work completed within the timeout
     */
    @JvmOverloads
    fun awaitPendingRuns(timeout: Long = 30, unit: TimeUnit = TimeUnit.SECONDS): Boolean {
        // Submit a sentinel task and wait for it — when it completes, all previously submitted
        // tasks have finished because the executor processes tasks in submission order.
        val sentinel = executor.submit {}
        return try {
            sentinel.get(timeout, unit)
            true
        } catch (_: Exception) {
            false
        }
    }

    /**
     * Waits for pending runs to flush (up to 30 seconds) and shuts down the background executor.
     *
     * After calling [close], traced functions will still execute their underlying logic but will no
     * longer post runs to LangSmith.
     */
    override fun close() {
        executor.shutdown()
        if (!executor.awaitTermination(30, TimeUnit.SECONDS)) {
            logger.warn("Timed out waiting for pending LangSmith runs to flush; some may be lost")
            executor.shutdownNow()
        }
    }

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
     * input is a [Map], its entries are used directly; otherwise it is recorded as `{"input":
     * ...}`.
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
    fun <I, O> traceable(
        block: Function<I, O>,
        config: TraceConfig = TraceConfig(),
    ): Function<I, O> {
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
     * If the input is a [Map] with all [String] keys, its entries are used directly. Otherwise the
     * input is wrapped as `{"input": value}`.
     */
    private fun toInputMap(input: Any?): Map<String, Any?> =
        toStringKeyedMap(input) ?: mapOf("input" to input)

    private fun toOutputMap(output: Any?): Map<String, Any?> =
        when (output) {
            null -> mapOf("output" to null)
            is RunTree -> mapOf("output" to output.toString())
            else -> toStringKeyedMap(output) ?: mapOf("output" to output)
        }

    /**
     * Returns the map with its entries if [value] is a [Map] whose keys are all [String]s, or
     * `null` otherwise.
     */
    private fun toStringKeyedMap(value: Any?): Map<String, Any?>? {
        if (value !is Map<*, *>) return null
        val result = mutableMapOf<String, Any?>()
        for ((k, v) in value) {
            if (k !is String) return null
            result[k] = v
        }
        return result
    }

    /** Core tracing logic shared by all overloads. */
    private fun <T> executeTraced(
        config: TraceConfig,
        inputs: Map<String, Any?>?,
        block: () -> T,
    ): T {
        if (!tracingEnabled) {
            return block()
        }

        val name = config.name ?: DEFAULT_RUN_NAME
        val runType = config.runType
        val tags = config.tags
        val parentRun = CURRENT_RUN.get()
        val runId = UUID.randomUUID().toString()
        val startTime = nowIso()
        val traceId = parentRun?.traceId ?: runId
        val parentDottedOrder = parentRun?.dottedOrder
        val myDottedOrder =
            if (parentDottedOrder != null) "$parentDottedOrder.${dottedOrder(startTime, runId)}"
            else dottedOrder(startTime, runId)

        val mergedMetadata = mutableMapOf<String, Any>()
        config.metadata?.let { mergedMetadata.putAll(it) }

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
                metadata = mergedMetadata,
                tags = tags,
                extra = mutableMapOf(),
            )

        postRun(run)
        return CURRENT_RUN.runWith(run) {
            try {
                val result = block()
                run.endTime = nowIso()
                run.outputs = toOutputMap(result)
                patchRun(run)
                result
            } catch (e: Throwable) {
                run.endTime = nowIso()
                run.error = e.stackTraceToString()
                patchRun(run)
                throw e
            }
        }
    }

    /**
     * Posts a new run to LangSmith in the background (creates the run with inputs + start time).
     */
    private fun postRun(run: RunTree) {
        val runData = buildRunData(run)
        submitSafely(run.name) {
            client.runs().ingestBatch(RunIngestBatchParams.builder().addPost(runData).build())
        }
    }

    /** Patches a run in LangSmith in the background (updates with outputs, end time, error). */
    private fun patchRun(run: RunTree) {
        val runData = buildRunData(run)
        submitSafely(run.name) {
            client.runs().ingestBatch(RunIngestBatchParams.builder().addPatch(runData).build())
        }
    }

    /**
     * Submits work to the background executor, handling both execution errors and
     * [java.util.concurrent.RejectedExecutionException] (e.g. after [close] has been called).
     */
    private fun submitSafely(runName: String, block: () -> Unit) {
        try {
            executor.submit {
                try {
                    block()
                } catch (e: Exception) {
                    logger.warn("Failed to send run '$runName'", e)
                }
            }
        } catch (e: java.util.concurrent.RejectedExecutionException) {
            logger.warn("Executor is shut down; dropping run '$runName'")
        }
    }

    private fun toJsonValueMap(data: Map<String, Any?>?): Map<String, JsonValue> =
        data?.mapValues { (_, v) -> JsonValue.from(v) } ?: emptyMap()

    private val runtimeMetadata: Map<String, JsonValue> by lazy {
        mapOf(
            "runtime" to JsonValue.from("java"),
            "runtime_version" to JsonValue.from(getJavaVersion()),
            "sdk" to JsonValue.from("langsmith-java"),
            "sdk_version" to JsonValue.from(getPackageVersion()),
        )
    }

    private fun buildRuntimeMetadata(userMetadata: Map<String, Any>?): Map<String, JsonValue> =
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
                        .apply {
                            run.extra.forEach { (k, v) ->
                                putAdditionalProperty(k, JsonValue.from(v))
                            }
                        }
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

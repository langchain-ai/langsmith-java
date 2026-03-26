@file:JvmName("Tracing")

package com.langchain.smith.tracing

import com.langchain.smith.client.LangsmithClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.getJavaVersion
import com.langchain.smith.core.getPackageVersion
import com.langchain.smith.models.runs.Run
import com.langchain.smith.models.runs.RunIngestBatchParams
import java.time.Instant
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.function.BiFunction
import java.util.function.Function
import java.util.function.Supplier
import kotlin.reflect.KFunction
import org.slf4j.LoggerFactory

private val logger = LoggerFactory.getLogger("com.langchain.smith.tracing.Traceable")

/**
 * The type of run being traced, which maps to `run_type` in LangSmith.
 *
 * Use the predefined constants ([CHAIN], [LLM], [TOOL], [RETRIEVER]) or create a custom type with
 * [of]:
 * ```kotlin
 * val custom = RunType.of("embedding")
 * ```
 */
class RunType private constructor(internal val value: String) {
    companion object {
        /** A chain/pipeline/workflow step. */
        @JvmField val CHAIN = RunType("chain")

        /** An LLM call. */
        @JvmField val LLM = RunType("llm")

        /** A tool/function invocation. */
        @JvmField val TOOL = RunType("tool")

        /** A retrieval operation. */
        @JvmField val RETRIEVER = RunType("retriever")

        /** Creates a [RunType] from an arbitrary string value. */
        @JvmStatic fun of(value: String) = RunType(value)
    }

    override fun equals(other: Any?): Boolean =
        this === other || (other is RunType && value == other.value)

    override fun hashCode(): Int = value.hashCode()

    override fun toString(): String = "RunType{$value}"
}

internal val CURRENT_RUN = RunContext.create()

@Volatile private var userDefaultClient: LangsmithClient? = null

private val autoClient: LangsmithClient? by lazy { createClientFromEnv() }

private fun createClientFromEnv(): LangsmithClient? =
    try {
        val clazz = Class.forName("com.langchain.smith.client.okhttp.LangsmithOkHttpClient")
        val fromEnv = clazz.getMethod("fromEnv")
        fromEnv.invoke(null) as? LangsmithClient
    } catch (e: Exception) {
        logger.debug("Could not create default LangSmith client from environment", e)
        null
    }

// ---------------------------------------------------------------------------
// Top-level tracing functions
// ---------------------------------------------------------------------------

/**
 * Returns the [RunTree] for the currently-executing traced function on this thread, or `null` if
 * there is no active run (e.g. called outside a [traceable] wrapper, or tracing is disabled).
 *
 * The returned [RunTree] is mutable — you can add entries to [RunTree.metadata] or [RunTree.extra]
 * and they will be included when the run is posted to LangSmith.
 *
 * To propagate context across async boundaries, pass the returned [RunTree] to [withParent] on the
 * new thread.
 *
 * @see withParent
 * @see traceable
 */
fun getCurrentRunTree(): RunTree? = CURRENT_RUN.get()

/**
 * Sets the default [LangsmithClient] used by [traceable] when no client is provided in
 * [TraceConfig] and there is no parent run to inherit from.
 *
 * This is typically called once at application startup:
 * ```kotlin
 * setDefaultClient(LangsmithOkHttpClient.fromEnv())
 * ```
 *
 * If not set explicitly, a default client is created automatically via reflection when tracing is
 * enabled and `LangsmithOkHttpClient` is on the classpath.
 *
 * @see TraceConfig.client
 */
fun setDefaultClient(client: LangsmithClient) {
    userDefaultClient = client
}

/**
 * Executes [block] with [parent] as the current run on this thread. Traced functions called inside
 * [block] will become children of [parent].
 *
 * Use this to propagate context across async boundaries where the run context is not automatically
 * inherited (e.g. `CompletableFuture`, `ExecutorService`, coroutines).
 *
 * On Java 21+, `ScopedValue` is used for context storage, which also propagates into child tasks
 * forked via `StructuredTaskScope`. On older JVMs a `ThreadLocal` is used as a fallback. **Neither
 * mechanism automatically propagates context across unstructured async boundaries** — use this
 * method for those cases.
 *
 * ```kotlin
 * val parent = getCurrentRunTree()
 * CompletableFuture.supplyAsync {
 *     withParent(parent) {
 *         tracedChild("input")
 *     }
 * }
 * ```
 *
 * @param parent the run to set as the current parent, or `null` to clear the context
 * @param block the code to execute with the given parent context
 * @return the result of [block]
 * @see getCurrentRunTree
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
 * Returns the default [LangsmithClient], resolving in order: user-set default, then auto-created
 * from environment via reflection. Returns `null` if neither is available.
 */
internal fun resolveDefaultClient(): LangsmithClient? = userDefaultClient ?: autoClient

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

internal val DEFAULT_PROJECT_NAME: String? by lazy {
    System.getenv("LANGSMITH_PROJECT")?.takeIf { it.isNotBlank() }
}

internal val DEFAULT_EXECUTOR: ExecutorService by lazy { Executors.newCachedThreadPool() }

/**
 * Configuration for a traced run.
 *
 * At the root of a trace, [client] must be provided (or set via [RunTree.setDefaultClient]). Child
 * runs inherit [client], [projectName], [executor], and [tracingEnabled] from their parent
 * automatically — you only need to specify per-run fields like [name], [runType], [metadata], and
 * [tags].
 *
 * `TraceConfig` is immutable and safe to reuse. Create a base config and derive per-run configs
 * with [toBuilder]:
 * ```kotlin
 * val base = TraceConfig.builder().client(client).projectName("my-project").build()
 * val step1 = traceable({ ... }, base.toBuilder().name("step-1").build())
 * val step2 = traceable({ ... }, base.toBuilder().name("step-2").runType(RunType.LLM).build())
 * ```
 * ```java
 * TraceConfig base = TraceConfig.builder()
 *     .client(client)
 *     .projectName("my-project")
 *     .build();
 * var step1 = Tracing.traceable(..., base.toBuilder().name("step-1").build());
 * var step2 = Tracing.traceable(..., base.toBuilder().name("step-2").runType(RunType.LLM).build());
 * ```
 */
class TraceConfig
constructor(
    /** The name of the run, displayed in LangSmith. */
    val name: String? = null,
    /** The LangSmith client used to post runs. Required at the root; inherited by children. */
    val client: LangsmithClient? = null,
    /** The type of run (defaults to [RunType.CHAIN]). */
    val runType: RunType = RunType.CHAIN,
    /** Optional metadata to attach to the run. */
    val metadata: Map<String, Any>? = null,
    /** Optional tags for filtering in LangSmith. */
    val tags: List<String>? = null,
    /** The LangSmith project name. Inherited by children. */
    val projectName: String? = null,
    /** The [ExecutorService] for background run posting. Inherited by children. */
    val executor: ExecutorService? = null,
    /** Whether tracing is active. Inherited by children. */
    val tracingEnabled: Boolean? = null,
) {
    companion object {
        /** Creates a new [Builder] for constructing a [TraceConfig]. */
        @JvmStatic fun builder() = Builder()
    }

    /** Returns a new [Builder] pre-populated with the values from this config. */
    fun toBuilder() = Builder().from(this)

    /**
     * A builder for [TraceConfig].
     *
     * ```java
     * TraceConfig config = TraceConfig.builder()
     *     .name("my-run")
     *     .client(LangsmithOkHttpClient.fromEnv())
     *     .runType(RunType.LLM)
     *     .metadata(Map.of("version", "1.0"))
     *     .tags(List.of("prod"))
     *     .projectName("my-project")
     *     .build();
     * ```
     */
    class Builder internal constructor() {
        private var name: String? = null
        private var client: LangsmithClient? = null
        private var runType: RunType = RunType.CHAIN
        private var metadata: Map<String, Any>? = null
        private var tags: List<String>? = null
        private var projectName: String? = null
        private var executor: ExecutorService? = null
        private var tracingEnabled: Boolean? = null

        @JvmSynthetic
        internal fun from(config: TraceConfig) = apply {
            name = config.name
            client = config.client
            runType = config.runType
            metadata = config.metadata
            tags = config.tags
            projectName = config.projectName
            executor = config.executor
            tracingEnabled = config.tracingEnabled
        }

        /** The name of the run, displayed in LangSmith. */
        fun name(name: String) = apply { this.name = name }

        /** The LangSmith client used to post runs. Required at the root of a trace. */
        fun client(client: LangsmithClient) = apply { this.client = client }

        /** The type of run (defaults to [RunType.CHAIN]). */
        fun runType(runType: RunType) = apply { this.runType = runType }

        /** Metadata to attach to the run. */
        fun metadata(metadata: Map<String, Any>) = apply { this.metadata = metadata }

        /** Tags for filtering in LangSmith. */
        fun tags(tags: List<String>) = apply { this.tags = tags }

        /** The LangSmith project name. Inherited by children if not set. */
        fun projectName(projectName: String) = apply { this.projectName = projectName }

        /** The [ExecutorService] for background run posting. Inherited by children if not set. */
        fun executor(executor: ExecutorService) = apply { this.executor = executor }

        /** Whether tracing is active. Inherited by children if not set. */
        fun tracingEnabled(tracingEnabled: Boolean) = apply { this.tracingEnabled = tracingEnabled }

        /** Builds the [TraceConfig]. */
        fun build() =
            TraceConfig(
                name = name,
                client = client,
                runType = runType,
                metadata = metadata,
                tags = tags,
                projectName = projectName,
                executor = executor,
                tracingEnabled = tracingEnabled,
            )
    }
}

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

// ---------------------------------------------------------------------------
// traceable overloads
// ---------------------------------------------------------------------------

/**
 * Wraps a no-arg function with LangSmith tracing (Kotlin).
 *
 * ```kotlin
 * val client = LangsmithOkHttpClient.fromEnv()
 * val traced = traceable({ "hello" }, TraceConfig("greet", client = client))
 * val result = traced()
 * ```
 */
@JvmSynthetic
fun <O> traceable(block: () -> O, config: TraceConfig): () -> O {
    val resolvedConfig = config.toBuilder().name(resolveName(config, block)).build()
    return { executeTraced(resolvedConfig, emptyMap()) { block() } }
}

/** Wraps a no-arg function with LangSmith tracing (Java [Supplier]). */
fun <O> traceable(block: Supplier<O>, config: TraceConfig): Supplier<O> {
    val resolvedConfig = config.toBuilder().name(resolveName(config, block)).build()
    return Supplier { executeTraced(resolvedConfig, emptyMap()) { block.get() } }
}

/**
 * Wraps a 1-arg function with LangSmith tracing.
 *
 * Returns a new function with the same signature that, when called, creates a traced run, records
 * the input, executes the original function, and records the output.
 *
 * Runs nest automatically — calling a traced function inside another traced function creates a
 * parent-child relationship in LangSmith.
 *
 * The input to the returned function is automatically serialized as the run's inputs. If the input
 * is a [Map] with string keys, its entries are used directly; otherwise it is recorded as
 * `{"inputs": ...}`.
 *
 * ## Example (Kotlin)
 *
 * ```kotlin
 * val client = LangsmithOkHttpClient.fromEnv()
 *
 * fun answerQuestion(question: String): String = "42"
 * val traced = traceable(::answerQuestion, TraceConfig(client = client))
 * val result = traced("What is the meaning of life?")
 * ```
 *
 * ## Example (Java)
 *
 * ```java
 * LangsmithClient client = LangsmithOkHttpClient.fromEnv();
 * Function<String, String> traced = Tracing.traceable(
 *     (Function<String, String>) q -> "42",
 *     TraceConfig.builder().name("answer-question").client(client).build());
 * String result = traced.apply("What is the meaning of life?");
 * ```
 *
 * @param block the function to wrap
 * @param config tracing configuration (client, run name, type, metadata, tags, project)
 * @return a traced wrapper around [block]
 * @see TraceConfig
 * @see RunTree.getCurrent
 * @see withParent
 */
@JvmSynthetic
fun <I, O> traceable(block: (I) -> O, config: TraceConfig): (I) -> O {
    val resolvedConfig = config.toBuilder().name(resolveName(config, block)).build()
    return { input ->
        val inputs = toInputMap(input)
        executeTraced(resolvedConfig, inputs) { block(input) }
    }
}

/** Wraps a 1-arg function with LangSmith tracing (Java [Function]). */
fun <I, O> traceable(block: Function<I, O>, config: TraceConfig): Function<I, O> {
    val traced = traceable({ i: I -> block.apply(i) }, config)
    return Function { traced(it) }
}

/** Wraps a 2-arg function with LangSmith tracing (Kotlin). */
@JvmSynthetic
fun <I1, I2, O> traceable(block: (I1, I2) -> O, config: TraceConfig): (I1, I2) -> O {
    val resolvedConfig = config.toBuilder().name(resolveName(config, block)).build()
    return { i1, i2 ->
        val inputs = mapOf("args" to listOf(i1, i2))
        executeTraced(resolvedConfig, inputs) { block(i1, i2) }
    }
}

/** Wraps a 2-arg function with LangSmith tracing (Java [BiFunction]). */
fun <I1, I2, O> traceable(
    block: BiFunction<I1, I2, O>,
    config: TraceConfig,
): BiFunction<I1, I2, O> {
    val traced = traceable({ i1: I1, i2: I2 -> block.apply(i1, i2) }, config)
    return BiFunction { i1, i2 -> traced(i1, i2) }
}

/** Wraps a 3-arg function with LangSmith tracing (Kotlin). */
@JvmSynthetic
fun <I1, I2, I3, O> traceable(block: (I1, I2, I3) -> O, config: TraceConfig): (I1, I2, I3) -> O {
    val resolvedConfig = config.toBuilder().name(resolveName(config, block)).build()
    return { i1, i2, i3 ->
        val inputs = mapOf("args" to listOf(i1, i2, i3))
        executeTraced(resolvedConfig, inputs) { block(i1, i2, i3) }
    }
}

/** Wraps a 3-arg function with LangSmith tracing (Java [TriFunction]). */
fun <I1, I2, I3, O> traceable(
    block: TriFunction<I1, I2, I3, O>,
    config: TraceConfig,
): TriFunction<I1, I2, I3, O> {
    val traced = traceable({ i1: I1, i2: I2, i3: I3 -> block.apply(i1, i2, i3) }, config)
    return TriFunction { i1, i2, i3 -> traced(i1, i2, i3) }
}

// ---------------------------------------------------------------------------
// Internal implementation
// ---------------------------------------------------------------------------

private fun toInputMap(input: Any?): Map<String, Any?> =
    toStringKeyedMap(input) ?: mapOf("inputs" to input)

private fun toOutputMap(output: Any?): Map<String, Any?> =
    when (output) {
        null -> mapOf("outputs" to null)
        is RunTree -> mapOf("outputs" to output.toString())
        else -> toStringKeyedMap(output) ?: mapOf("outputs" to output)
    }

private fun toStringKeyedMap(value: Any?): Map<String, Any?>? {
    if (value !is Map<*, *>) return null
    val result = mutableMapOf<String, Any?>()
    for ((k, v) in value) {
        if (k !is String) return null
        result[k] = v
    }
    return result
}

private fun <T> executeTraced(config: TraceConfig, inputs: Map<String, Any?>?, block: () -> T): T {
    val parentRun = CURRENT_RUN.get()

    // Merge config: child config wins, then parent, then defaults.
    val tracingEnabled = config.tracingEnabled ?: parentRun?.tracingEnabled ?: isTracingEnabled()
    if (!tracingEnabled) {
        return block()
    }

    val run =
        if (parentRun != null) {
            parentRun.createChild(config).also { it.inputs = inputs }
        } else {
            // Root run — resolve client and create the tree.
            val client =
                config.client
                    ?: resolveDefaultClient()
                    ?: throw IllegalStateException(
                        "No LangSmith client available. Either pass a client in TraceConfig, " +
                            "call RunTree.setDefaultClient(), or ensure LangsmithOkHttpClient " +
                            "is on the classpath with LANGSMITH_API_KEY set."
                    )
            val now = Instant.now()
            val runId = uuidv7(now)
            val startTime = ISO_FORMAT.format(now)

            val mergedMetadata = mutableMapOf<String, Any>()
            config.metadata?.let { mergedMetadata.putAll(it) }

            RunTree(
                id = runId,
                traceId = runId,
                dottedOrder = dottedOrderSegment(startTime, runId),
                parentRunId = null,
                name = config.name ?: DEFAULT_RUN_NAME,
                runType = config.runType,
                startTime = startTime,
                projectName = config.projectName ?: DEFAULT_PROJECT_NAME,
                inputs = inputs,
                outputs = null,
                error = null,
                endTime = null,
                metadata = mergedMetadata,
                tags = config.tags?.toMutableList() ?: mutableListOf(),
                extra = mutableMapOf(),
                client = client,
                executor = config.executor ?: DEFAULT_EXECUTOR,
                tracingEnabled = tracingEnabled,
            )
        }

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

// TODO: Delegate background posting to the client's own executor/queue once background run
//  processing is implemented there. Currently we manage our own executor and submit individual
//  ingestBatch calls per run, which means no batching and no client-level flush/shutdown.
private fun postRun(run: RunTree) {
    val client = run.client ?: return
    val executor = run.executor ?: DEFAULT_EXECUTOR
    val runData = buildRunData(run)
    submitSafely(executor, run.name) {
        client.runs().ingestBatch(RunIngestBatchParams.builder().addPost(runData).build())
    }
}

// TODO: Same as postRun — should delegate to the client once available.
private fun patchRun(run: RunTree) {
    val client = run.client ?: return
    val executor = run.executor ?: DEFAULT_EXECUTOR
    val runData = buildRunData(run)
    submitSafely(executor, run.name) {
        client.runs().ingestBatch(RunIngestBatchParams.builder().addPatch(runData).build())
    }
}

private fun submitSafely(executor: ExecutorService, runName: String, block: () -> Unit) {
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
            .apply { run.projectName?.let { sessionName(it) } }
            .tags(run.tags)
            .inputs(
                Run.Inputs.builder().putAllAdditionalProperties(toJsonValueMap(run.inputs)).build()
            )
            .extra(
                Run.Extra.builder()
                    .apply {
                        run.extra.forEach { (k, v) -> putAdditionalProperty(k, JsonValue.from(v)) }
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

package com.langchain.smith.tracing

import com.langchain.smith.client.LangsmithClient
import java.time.Instant
import java.util.concurrent.Callable
import java.util.concurrent.ExecutorService
import org.slf4j.LoggerFactory

private val logger = LoggerFactory.getLogger(RunTree::class.java)

/**
 * Represents a run in the trace tree.
 *
 * Use the static methods on the [companion object][Companion] to access the current run, set a
 * default client, or propagate context across async boundaries.
 *
 * ```kotlin
 * val traced = traceable({ input: String ->
 *     val run = RunTree.getCurrent()!!
 *     run.metadata["my_key"] = "my_value"
 *     run.extra["custom_field"] = mapOf("nested" to true)
 *     "result"
 * }, TraceConfig("my-run"))
 * ```
 */
class RunTree
internal constructor(
    /** The unique identifier of this run. */
    val id: String,
    /** The trace ID shared by all runs in the same trace tree. */
    val traceId: String,
    /**
     * The dotted order string that encodes the full path from the root run to this run, used for
     * ordering.
     */
    val dottedOrder: String,
    /** The run ID of the parent, or `null` if this is a root run. */
    val parentRunId: String?,
    /** The display name of this run. */
    val name: String,
    /** The type of run (chain, llm, tool, retriever). */
    val runType: RunType,
    /** ISO-8601 start time of this run. */
    val startTime: String,
    /** The LangSmith project name this run is posted to. */
    val projectName: String,
    /** The run's input data. Mutate to override what is sent to LangSmith. */
    var inputs: Map<String, Any?>?,
    /** The run's output data. Set automatically when the traced function returns. */
    var outputs: Map<String, Any?>?,
    /** Error string if the traced function threw. Set automatically. */
    var error: String?,
    /** ISO-8601 end time. Set automatically when the traced function completes. */
    var endTime: String?,
    /**
     * Mutable metadata attached to this run. Add entries during execution and they will be included
     * when the run is posted to LangSmith.
     */
    val metadata: MutableMap<String, Any>,
    /** Mutable tags for filtering in LangSmith. Add entries during execution. */
    val tags: MutableList<String>,
    /**
     * Mutable extra data attached to this run. Add entries during execution and they will be
     * included when the run is posted to LangSmith.
     */
    val extra: MutableMap<String, Any>,
    /** The client used to post this run. Inherited by child runs. */
    @get:JvmSynthetic internal val client: LangsmithClient,
    /** The executor used for background posting. Inherited by child runs. */
    @get:JvmSynthetic internal val executor: ExecutorService,
    /** Whether tracing is enabled. Inherited by child runs. */
    @get:JvmSynthetic internal val tracingEnabled: Boolean,
) {
    /**
     * Creates a child [RunTree] under this run. The child inherits [client], [projectName],
     * [executor], and [tracingEnabled] from this run. Per-run fields from [config] (name, runType,
     * metadata, tags) are applied to the child, and parent metadata is propagated — child metadata
     * takes precedence.
     *
     * @param config per-run configuration for the child
     * @param inputs the child's input data
     * @return a new [RunTree] that is a child of this run
     */
    @JvmOverloads
    fun createChild(config: TraceConfig, inputs: Map<String, Any?>? = null): RunTree {
        val now = Instant.now()
        val childId = uuidv7(now)
        val childStartTime = ISO_FORMAT.format(now)
        val childDottedOrder = "$dottedOrder.${dottedOrder(childStartTime, childId)}"

        // Merge metadata: parent metadata first, child config metadata on top.
        val mergedMetadata = mutableMapOf<String, Any>()
        mergedMetadata.putAll(metadata)
        config.metadata?.let { mergedMetadata.putAll(it) }

        // Merge tags: start with parent tags, add child config tags.
        val mergedTags = tags.toMutableList()
        config.tags?.let { mergedTags.addAll(it) }

        return RunTree(
            id = childId,
            traceId = traceId,
            dottedOrder = childDottedOrder,
            parentRunId = id,
            name = config.name ?: "<lambda>",
            runType = config.runType,
            startTime = childStartTime,
            projectName = config.projectName ?: projectName,
            inputs = inputs,
            outputs = null,
            error = null,
            endTime = null,
            metadata = mergedMetadata,
            tags = mergedTags,
            extra = mutableMapOf(),
            client = config.client ?: client,
            executor = config.executor ?: executor,
            tracingEnabled = config.tracingEnabled ?: tracingEnabled,
        )
    }

    override fun toString(): String =
        "RunTree{id=$id, traceId=$traceId, name=$name, parentRunId=$parentRunId}"

    companion object {
        @Volatile private var userDefaultClient: LangsmithClient? = null

        private val defaultClient: LangsmithClient? by lazy {
            userDefaultClient ?: createClientFromEnv()
        }

        /**
         * Returns the [RunTree] for the currently-executing traced function on this thread, or
         * `null` if there is no active run (e.g. called outside a [traceable] wrapper, or tracing
         * is disabled).
         *
         * The returned [RunTree] is mutable — you can add entries to [RunTree.metadata] or
         * [RunTree.extra] and they will be included when the run is posted to LangSmith.
         *
         * To propagate context across async boundaries, pass the returned [RunTree] to
         * [RunTree.withParent] on the new thread.
         *
         * @see RunTree.withParent
         * @see traceable
         */
        @JvmStatic fun getCurrent(): RunTree? = CURRENT_RUN.get()

        /**
         * Sets the default [LangsmithClient] used by [traceable] when no client is provided in
         * [TraceConfig] and there is no parent run to inherit from.
         *
         * This is typically called once at application startup:
         * ```kotlin
         * RunTree.setDefaultClient(LangsmithOkHttpClient.fromEnv())
         * ```
         *
         * If not set explicitly, a default client is created automatically via reflection when
         * tracing is enabled and `LangsmithOkHttpClient` is on the classpath.
         *
         * @see TraceConfig.client
         */
        @JvmStatic
        fun setDefaultClient(client: LangsmithClient) {
            userDefaultClient = client
        }

        /**
         * Returns the default [LangsmithClient], resolving in order: user-set default, then
         * auto-created from environment via reflection. Returns `null` if neither is available.
         */
        @JvmSynthetic internal fun getDefaultClient(): LangsmithClient? = defaultClient

        /**
         * Executes [block] with [parent] as the current run on this thread. Traced functions called
         * inside [block] will become children of [parent].
         *
         * Use this to propagate context across async boundaries where the run context is not
         * automatically inherited (e.g. `CompletableFuture`, `ExecutorService`, coroutines).
         *
         * On Java 21+, `ScopedValue` is used for context storage, which also propagates into child
         * tasks forked via `StructuredTaskScope`. On older JVMs a `ThreadLocal` is used as a
         * fallback. **Neither mechanism automatically propagates context across unstructured async
         * boundaries** — use this method for those cases.
         *
         * ```kotlin
         * val parent = RunTree.getCurrent()
         * CompletableFuture.supplyAsync {
         *     RunTree.withParent(parent) {
         *         tracedChild("input")
         *     }
         * }
         * ```
         *
         * @param parent the run to set as the current parent, or `null` to clear the context
         * @param block the code to execute with the given parent context
         * @return the result of [block]
         * @see getCurrent
         */
        @JvmStatic
        fun <T> withParent(parent: RunTree?, block: Callable<T>): T =
            CURRENT_RUN.runWith(parent) { block.call() }

        /** Kotlin-friendly overload of [withParent]. */
        @JvmSynthetic
        fun <T> withParent(parent: RunTree?, block: () -> T): T = CURRENT_RUN.runWith(parent, block)

        private fun createClientFromEnv(): LangsmithClient? =
            try {
                val clazz = Class.forName("com.langchain.smith.client.okhttp.LangsmithOkHttpClient")
                val fromEnv = clazz.getMethod("fromEnv")
                fromEnv.invoke(null) as? LangsmithClient
            } catch (e: Exception) {
                logger.debug("Could not create default LangSmith client from environment", e)
                null
            }
    }
}

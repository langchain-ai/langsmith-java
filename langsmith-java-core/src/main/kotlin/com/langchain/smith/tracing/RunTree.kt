package com.langchain.smith.tracing

import com.langchain.smith.client.LangsmithClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.getJavaVersion
import com.langchain.smith.core.getPackageVersion
import com.langchain.smith.models.runs.RunIngest
import java.time.Instant
import java.util.concurrent.ExecutorService
import org.slf4j.LoggerFactory

private val logger = LoggerFactory.getLogger(RunTree::class.java)

/**
 * Represents a run in the trace tree.
 *
 * **Thread safety:** `RunTree` is mutable — [inputs], [outputs], [error], [endTime], [metadata],
 * [tags], and [extra] can be modified after construction. A single `RunTree` instance should only
 * be accessed from one thread at a time. Within a [traceable] wrapper this is guaranteed by the
 * run-context scoping, but if you hold a reference to a `RunTree` and access it from multiple
 * threads, external synchronization is required.
 *
 * Can be created manually, via [traceable], or via [createChild]:
 * ```kotlin
 * // Via traceable (most common)
 * val traced = traceable({ input: String ->
 *     val run = getCurrentRunTree()!!
 *     run.metadata["my_key"] = "my_value"
 *     "result"
 * }, TraceConfig("my-run"))
 *
 * // Manual creation
 * val run = RunTree(name = "my-run", runType = RunType.LLM, client = myClient)
 * ```
 * ```java
 * // Java — via builder
 * RunTree run = RunTree.builder()
 *     .name("my-run")
 *     .runType(RunType.LLM)
 *     .client(client)
 *     .build();
 * ```
 */
class RunTree(
    /** The display name of this run. */
    val name: String = "<lambda>",
    /** The type of run (chain, llm, tool, retriever). */
    val runType: RunType = RunType.CHAIN,
    /** The run's input data. */
    var inputs: Map<String, Any?>? = null,
    /** The run's output data. */
    var outputs: Map<String, Any?>? = null,
    /** Error string if the run failed. */
    var error: String? = null,
    /** Mutable metadata attached to this run. */
    val metadata: MutableMap<String, Any> = mutableMapOf(),
    /** Mutable tags for filtering in LangSmith. */
    val tags: MutableList<String> = mutableListOf(),
    /** Mutable extra data attached to this run. */
    val extra: MutableMap<String, Any> = mutableMapOf(),
    /** The LangSmith project name, or `null` for the server default. */
    val projectName: String? = null,
    /** Dataset example this run is associated with, if any. */
    val referenceExampleId: String? = null,
    /** Experiment session this run belongs to, if any. */
    val sessionId: String? = null,
    /** The client used to post this run. Inherited by child runs. */
    @get:JvmSynthetic internal val client: LangsmithClient? = null,
    /** The executor used for background posting. Inherited by child runs. */
    @get:JvmSynthetic internal val executor: ExecutorService? = null,
    /** Whether tracing is enabled. Inherited by child runs. */
    @get:JvmSynthetic internal val tracingEnabled: Boolean = true,
    /** The unique identifier of this run. Auto-generated UUIDv7 if not provided. */
    val id: String = defaultId(),
    /** The trace ID shared by all runs in the same trace tree. Defaults to [id] for root runs. */
    val traceId: String = id,
    /** ISO-8601 start time of this run. Auto-generated if not provided. */
    val startTime: String = defaultStartTime(),
    /**
     * The dotted order string that encodes the full path from the root run to this run. Defaults to
     * a segment derived from [startTime] and [id].
     */
    val dottedOrder: String = dottedOrderSegment(startTime, id),
    /** The run ID of the parent, or `null` if this is a root run. */
    val parentRunId: String? = null,
    /** ISO-8601 end time. Set when the run completes. */
    var endTime: String? = null,
) {

    /**
     * Creates a child [RunTree] under this run. The child inherits [client], [projectName],
     * [executor], and [tracingEnabled] from this run. Per-run fields from [config] (name, runType,
     * metadata, tags) are applied to the child, and parent metadata is propagated — child metadata
     * takes precedence.
     *
     * @param config per-run configuration for the child
     * @return a new [RunTree] that is a child of this run
     */
    fun createChild(config: TraceConfig): RunTree {
        val now = Instant.now()
        val childId = uuidv7(now)
        val childStartTime = ISO_FORMAT.format(now)
        val childDottedOrder = "$dottedOrder.${dottedOrderSegment(childStartTime, childId)}"

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
            referenceExampleId = config.referenceExampleId ?: referenceExampleId,
            sessionId = config.sessionId ?: sessionId,
            metadata = mergedMetadata,
            tags = mergedTags,
            client = config.client ?: client,
            executor = config.executor ?: executor,
            tracingEnabled = config.tracingEnabled ?: tracingEnabled,
        )
    }

    /** Posts this run to LangSmith in the background, batched with other pending operations. */
    fun postRun() {
        val c = client ?: return
        val e = executor ?: DEFAULT_EXECUTOR
        val runData = buildRunData()
        submitSafely(e, name) { c.runs().create(runData) }
    }

    /**
     * Patches this run in LangSmith in the background, batched with other pending operations.
     *
     * Inputs are omitted by default so the patch does not duplicate or overwrite the create payload
     * if the create and patch are merged during batching.
     */
    fun patchRun() = patchRun(excludeInputs = true)

    /** Patches this run in LangSmith in the background, batched with other pending operations. */
    fun patchRun(excludeInputs: Boolean) {
        val c = client ?: return
        val e = executor ?: DEFAULT_EXECUTOR
        val runData = buildRunData(includeInputs = !excludeInputs)
        submitSafely(e, name) {
            c.runs()
                .update(
                    com.langchain.smith.models.runs.RunUpdateParams.builder()
                        .runId(id)
                        .runIngest(runData)
                        .build()
                )
        }
    }

    /** Builds the [RunIngest] data object for posting/patching to the LangSmith API. */
    fun buildRunData(): RunIngest = buildRunData(includeInputs = true)

    private fun buildRunData(includeInputs: Boolean): RunIngest {
        val builder =
            RunIngest.builder()
                .id(id)
                .traceId(traceId)
                .dottedOrder(dottedOrder)
                .name(name)
                .runType(RunIngest.RunType.of(runType.value))
                .startTime(startTime)
                .apply { this@RunTree.projectName?.let { sessionName(it) } }
                .tags(tags)
                .extra(
                    RunIngest.Extra.builder()
                        .apply {
                            this@RunTree.extra.forEach { (k, v) ->
                                putAdditionalProperty(k, JsonValue.from(v))
                            }
                        }
                        .putAdditionalProperty(
                            "metadata",
                            JsonValue.from(buildRuntimeMetadata(metadata)),
                        )
                        .build()
                )

        if (includeInputs) {
            builder.inputs(
                RunIngest.Inputs.builder()
                    .putAllAdditionalProperties(toJsonValueMap(inputs))
                    .build()
            )
        }
        endTime?.let { builder.endTime(it) }
        error?.let { builder.error(it) }
        parentRunId?.let { builder.parentRunId(it) }
        referenceExampleId?.let { builder.referenceExampleId(it) }
        sessionId?.let { builder.sessionId(it) }
        outputs?.let {
            builder.outputs(
                RunIngest.Outputs.builder().putAllAdditionalProperties(toJsonValueMap(it)).build()
            )
        }

        return builder.build()
    }

    override fun toString(): String =
        buildList {
                add("id=$id")
                add("traceId=$traceId")
                add("name=$name")
                add("runType=$runType")
                add("startTime=$startTime")
                projectName?.let { add("projectName=$it") }
                referenceExampleId?.let { add("referenceExampleId=$it") }
                sessionId?.let { add("sessionId=$it") }
                parentRunId?.let { add("parentRunId=$it") }
                add("dottedOrder=$dottedOrder")
                inputs?.let { add("inputs=$it") }
                outputs?.let { add("outputs=$it") }
                error?.let { add("error=$it") }
                endTime?.let { add("endTime=$it") }
                if (metadata.isNotEmpty()) add("metadata=$metadata")
                if (tags.isNotEmpty()) add("tags=$tags")
                if (extra.isNotEmpty()) add("extra=$extra")
            }
            .joinToString(", ", "RunTree{", "}")

    companion object {
        /** Creates a new [Builder] for constructing a [RunTree]. */
        @JvmStatic fun builder() = Builder()

        private fun defaultId(): String = uuidv7(Instant.now())

        private fun defaultStartTime(): String = ISO_FORMAT.format(Instant.now())
    }

    /** Returns a new [Builder] pre-populated with the values from this run. */
    fun toBuilder() = Builder().from(this)

    /**
     * A builder for [RunTree].
     *
     * ```java
     * RunTree run = RunTree.builder()
     *     .name("my-run")
     *     .runType(RunType.LLM)
     *     .client(client)
     *     .inputs(Map.of("question", "hello"))
     *     .build();
     * ```
     */
    class Builder internal constructor() {
        private var name: String = "<lambda>"
        private var runType: RunType = RunType.CHAIN
        private var inputs: Map<String, Any?>? = null
        private var outputs: Map<String, Any?>? = null
        private var error: String? = null
        private var metadata: MutableMap<String, Any> = mutableMapOf()
        private var tags: MutableList<String> = mutableListOf()
        private var extra: MutableMap<String, Any> = mutableMapOf()
        private var projectName: String? = null
        private var referenceExampleId: String? = null
        private var sessionId: String? = null
        private var client: LangsmithClient? = null
        private var executor: ExecutorService? = null
        private var tracingEnabled: Boolean = true
        private var id: String? = null
        private var traceId: String? = null
        private var startTime: String? = null
        private var dottedOrder: String? = null
        private var parentRunId: String? = null
        private var endTime: String? = null

        @JvmSynthetic
        internal fun from(run: RunTree) = apply {
            name = run.name
            runType = run.runType
            inputs = run.inputs
            outputs = run.outputs
            error = run.error
            metadata = run.metadata.toMutableMap()
            tags = run.tags.toMutableList()
            extra = run.extra.toMutableMap()
            projectName = run.projectName
            referenceExampleId = run.referenceExampleId
            sessionId = run.sessionId
            client = run.client
            executor = run.executor
            tracingEnabled = run.tracingEnabled
            id = run.id
            traceId = run.traceId
            startTime = run.startTime
            dottedOrder = run.dottedOrder
            parentRunId = run.parentRunId
            endTime = run.endTime
        }

        fun name(name: String) = apply { this.name = name }

        fun runType(runType: RunType) = apply { this.runType = runType }

        fun inputs(inputs: Map<String, Any?>) = apply { this.inputs = inputs }

        fun outputs(outputs: Map<String, Any?>) = apply { this.outputs = outputs }

        fun error(error: String) = apply { this.error = error }

        fun metadata(metadata: Map<String, Any>) = apply { this.metadata = metadata.toMutableMap() }

        fun tags(tags: List<String>) = apply { this.tags = tags.toMutableList() }

        fun extra(extra: Map<String, Any>) = apply { this.extra = extra.toMutableMap() }

        fun projectName(projectName: String) = apply { this.projectName = projectName }

        fun referenceExampleId(referenceExampleId: String) = apply {
            this.referenceExampleId = referenceExampleId
        }

        fun sessionId(sessionId: String) = apply { this.sessionId = sessionId }

        fun client(client: LangsmithClient) = apply { this.client = client }

        fun executor(executor: ExecutorService) = apply { this.executor = executor }

        fun tracingEnabled(tracingEnabled: Boolean) = apply { this.tracingEnabled = tracingEnabled }

        fun id(id: String) = apply { this.id = id }

        fun traceId(traceId: String) = apply { this.traceId = traceId }

        fun startTime(startTime: String) = apply { this.startTime = startTime }

        fun dottedOrder(dottedOrder: String) = apply { this.dottedOrder = dottedOrder }

        fun parentRunId(parentRunId: String) = apply { this.parentRunId = parentRunId }

        fun endTime(endTime: String) = apply { this.endTime = endTime }

        fun build(): RunTree {
            val resolvedId = id ?: defaultId()
            val resolvedStartTime = startTime ?: defaultStartTime()
            return RunTree(
                name = name,
                runType = runType,
                inputs = inputs,
                outputs = outputs,
                error = error,
                metadata = metadata,
                tags = tags,
                extra = extra,
                projectName = projectName,
                referenceExampleId = referenceExampleId,
                sessionId = sessionId,
                client = client,
                executor = executor,
                tracingEnabled = tracingEnabled,
                id = resolvedId,
                traceId = traceId ?: resolvedId,
                startTime = resolvedStartTime,
                dottedOrder = dottedOrder ?: dottedOrderSegment(resolvedStartTime, resolvedId),
                parentRunId = parentRunId,
                endTime = endTime,
            )
        }
    }
}

// ---------------------------------------------------------------------------
// Private helpers for RunTree posting
// ---------------------------------------------------------------------------

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
        logger.warn("Executor is shut down; dropping run '$runName'", e)
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

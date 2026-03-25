package com.langchain.smith.tracing

/**
 * Represents a run in the trace tree.
 *
 * Accessible during execution via [TracingContext.getCurrentRun]. You can read IDs for feedback or
 * logging, and mutate [metadata] and [extra] to attach additional data that will be sent to
 * LangSmith when the run completes.
 *
 * ```kotlin
 * val traced = tracing.traceable({ input: String ->
 *     val run = tracing.getCurrentRun()!!
 *     run.metadata["my_key"] = "my_value"
 *     run.extra["custom_field"] = mapOf("nested" to true)
 *     "result"
 * })
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
    /** Tags for filtering in LangSmith. */
    val tags: List<String>?,
    /**
     * Mutable extra data attached to this run. Add entries during execution and they will be
     * included when the run is posted to LangSmith.
     */
    val extra: MutableMap<String, Any>,
) {
    override fun toString(): String =
        "RunTree{id=$id, traceId=$traceId, name=$name, parentRunId=$parentRunId}"
}

package com.langsmith.runtree

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.langsmith.api.client.LangSmithClientAsync
import com.langsmith.api.client.okhttp.LangSmithOkHttpClientAsync
import com.langsmith.api.core.JsonValue
import com.langsmith.api.models.RunCreateParams
import com.langsmith.api.models.RunUpdateParams
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.UUID
import java.util.concurrent.CompletableFuture

fun stripNonAlphanumeric(input: String): String {
    return input.replace("[-:.]".toRegex(), "")
}

fun convertToDottedOrderFormat(epoch: Long, runId: String): String {
    val formatter =
        DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmssSSS'Z'").withZone(ZoneId.of("UTC"))
    return stripNonAlphanumeric(formatter.format(Instant.ofEpochMilli(epoch))) + runId
}

// TODO: make look more like https://opentelemetry.io/docs/languages/java/instrumentation/
// Used for maintaining the trace hierarchy
private val currentRunTree = ThreadLocal<RunTree>()

fun setSpan(runTree: RunTree?) {
    if (runTree == null) {
        clearSpan()
    } else {
        currentRunTree.set(runTree)
    }
}

fun clearSpan() {
    currentRunTree.remove()
}

fun getCurrentSpan(): RunTree? {
    return currentRunTree.get()
}

object EnvironmentInfo {
    @get:JvmName("getRuntimeEnvironmentProperty")
    val runtimeEnvironment: Map<String, Any?> by lazy { getRuntimeEnvironment() }

    private fun getRuntimeEnvironment(): Map<String, Any?> {
        return mapOf(
            "sdk" to "langsmith-java",
            "library" to "langsmith",
            "platform" to System.getProperty("os.name") + " " + System.getProperty("os.version"),
            "runtime" to "Java",
            "java_version" to System.getProperty("java.version"),
            "java_vendor" to System.getProperty("java.vendor"),
        )
    }
}

fun getTracerProject(): String {
    // Hosted LangServe projects get precedence over all other defaults.
    // This is to make sure that we always use the associated project
    // for a hosted langserve deployment even if the customer sets some
    // other project name in their environment.
    return System.getenv("HOSTED_LANGSERVE_PROJECT_NAME")
        ?: System.getenv("LANGCHAIN_PROJECT")
        ?: System.getenv("LANGCHAIN_SESSION")
        ?: "default"
}

data class EndOptions(
    val outputs: Map<String, Any>? = null,
    val errorMessage: String? = null,
    val endTime: Long? = null
) {
    companion object {
        @JvmStatic fun builder() = Builder()
    }

    class Builder {
        private var outputs: Map<String, Any>? = null
        private var errorMessage: String? = null
        private var endTime: Long? = null

        fun setOutputs(value: Map<String, Any>?) = apply { outputs = value }

        fun setErrorMessage(value: String?) = apply { errorMessage = value }

        fun setEndTime(value: Long?) = apply { endTime = value }

        fun build(): EndOptions = EndOptions(outputs, errorMessage, endTime)
    }
}

data class RunTreeConfig(
    val name: String,
    val runType: String = "chain",
    val id: String = UUID.randomUUID().toString(),
    val projectName: String = getTracerProject(),
    val parentRun: RunTree? = null,
    val parentRunId: String? = null,
    val childRuns: MutableList<RunTree> = mutableListOf(),
    val startTime: Long = System.currentTimeMillis(),
    val endTime: Long? = null,
    val extra: Map<String, Any> = emptyMap(),
    val tags: List<String> = emptyList(),
    val error: String? = null,
    val serialized: Map<String, Any> = emptyMap(),
    val inputs: Map<String, Any> = emptyMap(),
    val outputs: Map<String, Any>? = null,
    val referenceExampleId: String? = null,
    val client: LangSmithClientAsync = LangSmithOkHttpClientAsync.fromEnv(),
    val objectMapper: ObjectMapper = jacksonObjectMapper()
) {
    companion object {
        @JvmStatic fun builder() = Builder()
    }

    class Builder {
        private var name: String = ""
        private var runType: String = "chain"
        private var id: String = UUID.randomUUID().toString()
        private var projectName: String = getTracerProject()
        private var parentRun: RunTree? = null
        private var parentRunId: String? = null
        private var childRuns: MutableList<RunTree> = mutableListOf()
        private var startTime: Long = System.currentTimeMillis()
        private var endTime: Long? = null
        private var extra: Map<String, Any> = emptyMap()
        private var tags: List<String> = ArrayList()
        private var error: String? = null
        private var serialized: Map<String, Any> = emptyMap()
        private var inputs: Map<String, Any> = emptyMap()
        private var outputs: Map<String, Any>? = emptyMap()
        private var referenceExampleId: String? = null
        private var client: LangSmithClientAsync? = null
        private var objectMapper: ObjectMapper = jacksonObjectMapper()

        fun setName(value: String) = apply { name = value }

        fun setRunType(value: String) = apply { runType = value }

        fun setId(value: String) = apply { id = value }

        fun setProjectName(value: String) = apply { projectName = value }

        fun setParentRun(value: RunTree?) = apply { parentRun = value }

        fun setParentRunId(value: String?) = apply { parentRunId = value }

        fun addChildRun(value: RunTree) = apply { childRuns.add(value) }

        fun setStartTime(value: Long) = apply { startTime = value }

        fun setEndTime(value: Long?) = apply { endTime = value }

        fun setExtra(value: Map<String, Any>) = apply { extra = value }

        fun setTags(value: List<String>) = apply { tags = value }

        fun setError(value: String?) = apply { error = value }

        fun setSerialized(value: Map<String, Any>) = apply { serialized = value }

        fun setInputs(value: Map<String, Any>) = apply { inputs = value }

        fun setOutputs(value: Map<String, Any>?) = apply { outputs = value }

        fun setReferenceExampleId(value: String?) = apply { referenceExampleId = value }

        fun setClient(value: LangSmithClientAsync?) = apply { client = value }

        fun setObjectMapper(value: ObjectMapper) = apply { objectMapper = value }

        fun addExtra(key: String, value: Any) = apply { extra = extra.plus(key to value) }

        fun build(): RunTreeConfig =
            RunTreeConfig(
                name = name,
                runType = runType,
                id = id,
                projectName = projectName,
                parentRun = parentRun,
                parentRunId = parentRunId,
                childRuns = childRuns,
                startTime = startTime,
                endTime = endTime,
                extra = extra,
                tags = tags,
                error = error,
                serialized = serialized,
                inputs = inputs,
                outputs = outputs,
                referenceExampleId = referenceExampleId,
                client = client ?: LangSmithOkHttpClientAsync.fromEnv(),
                objectMapper = objectMapper
            )
    }
}

class RunTree(config: RunTreeConfig) {
    private var id: String = config.id
    private var name: String = config.name
    private var runType: String = config.runType
    private var projectName: String = config.projectName
    private var parentRun: RunTree? = config.parentRun
    private var childRuns: MutableList<RunTree> = config.childRuns
    private var startTime: Long = config.startTime
    private var endTime: Long? = config.endTime
    private var extra: Map<String, Any> = config.extra
    private var tags: List<String>? = config.tags
    private var error: String? = config.error
    private var serialized: Map<String, Any> = config.serialized
    private var inputs: Map<String, Any> = config.inputs
    private var outputs: Map<String, Any>? = config.outputs
    private var referenceExampleId: String? = config.referenceExampleId
    private var client: LangSmithClientAsync = config.client
    private var events: List<Map<String, Any>>? = null
    private var traceId: String
    private var dottedOrder: String

    init {
        traceId = parentRun?.traceId ?: id
        val currentDottedOrder = convertToDottedOrderFormat(startTime, id)
        dottedOrder =
            parentRun?.dottedOrder?.let { "$it.$currentDottedOrder" } ?: currentDottedOrder
        setSpan(this)
    }

    companion object {
        @JvmStatic
        fun fromCurrentSpan(config: RunTreeConfig): RunTree {
            val currentRunTree = getCurrentSpan()
            return if (currentRunTree != null) {
                currentRunTree.createChild(config)
            } else {
                val newRunTree = RunTree(config)
                setSpan(newRunTree)
                newRunTree
            }
        }
    }

    fun createChild(config: RunTreeConfig): RunTree {
        val child =
            RunTree(config.copy(parentRun = this, projectName = projectName, client = client))
        childRuns.add(child)
        return child
    }

    private fun convertToCreate(run: RunTree): RunCreateParams {
        val runExtra = run.extra.toMutableMap()
        runExtra["runtime"] = runExtra["runtime"] ?: EnvironmentInfo.runtimeEnvironment

        val parentRunId: String? = run.parentRun?.id

        val additionalProperties =
            mapOf(
                "id" to JsonValue.from(run.id),
                "name" to JsonValue.from(run.name),
                "start_time" to JsonValue.from(run.startTime),
                "end_time" to JsonValue.from(run.endTime),
                "run_type" to JsonValue.from(run.runType),
                "reference_example_id" to JsonValue.from(run.referenceExampleId),
                "extra" to JsonValue.from(runExtra),
                "serialized" to JsonValue.from(run.serialized),
                "error" to JsonValue.from(run.error),
                "inputs" to JsonValue.from(run.inputs),
                "outputs" to JsonValue.from(run.outputs),
                "session_name" to JsonValue.from(run.projectName),
                "parent_run_id" to JsonValue.from(parentRunId),
                "trace_id" to JsonValue.from(run.traceId),
                "dotted_order" to JsonValue.from(run.dottedOrder),
                "tags" to JsonValue.from(run.tags)
            )

        val createParams =
            RunCreateParams.builder()
                .also { it.additionalBodyProperties(additionalProperties) }
                .build()

        return createParams
    }

    fun postRunAsync(): CompletableFuture<Unit> {
        val runCreate = convertToCreate(this)
        return client.runs().create(runCreate).thenApply { _ -> Unit }
    }

    fun patchRunAsync(): CompletableFuture<Unit> {
        val runUpdate =
            mapOf(
                "end_time" to JsonValue.from(endTime),
                "error" to JsonValue.from(error),
                "outputs" to JsonValue.from(outputs),
                "parent_run_id" to JsonValue.from(parentRun?.id),
                "reference_example_id" to JsonValue.from(referenceExampleId),
                "extra" to JsonValue.from(extra),
                "events" to JsonValue.from(events),
                "dotted_order" to JsonValue.from(dottedOrder),
                "trace_id" to JsonValue.from(traceId),
                "tags" to JsonValue.from(tags)
            )
        val updateParams =
            RunUpdateParams.builder()
                .runId(this.id)
                .also { it.additionalBodyProperties(runUpdate) }
                .build()

        return client.runs().update(updateParams).thenApply { _ -> Unit }
    }

    fun end(options: EndOptions = EndOptions()) {
        this.outputs = options.outputs
        this.error = options.errorMessage
        this.endTime = options.endTime ?: System.currentTimeMillis()
    }
}

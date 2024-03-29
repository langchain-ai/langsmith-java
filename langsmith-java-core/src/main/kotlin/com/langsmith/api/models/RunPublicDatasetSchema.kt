// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.langsmith.api.core.ExcludeMissing
import com.langsmith.api.core.JsonField
import com.langsmith.api.core.JsonMissing
import com.langsmith.api.core.JsonValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import com.langsmith.api.errors.LangSmithInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** Schema for a run in a publicly-shared dataset. */
@JsonDeserialize(builder = RunPublicDatasetSchema.Builder::class)
@NoAutoDetect
class RunPublicDatasetSchema
private constructor(
    private val name: JsonField<String>,
    private val inputs: JsonValue,
    private val runType: JsonField<RunType>,
    private val startTime: JsonField<OffsetDateTime>,
    private val endTime: JsonField<OffsetDateTime>,
    private val extra: JsonValue,
    private val error: JsonField<String>,
    private val executionOrder: JsonField<Long>,
    private val serialized: JsonValue,
    private val outputs: JsonValue,
    private val parentRunId: JsonField<String>,
    private val manifestId: JsonField<String>,
    private val manifestS3Id: JsonField<String>,
    private val events: JsonField<List<JsonValue>>,
    private val tags: JsonField<List<String>>,
    private val inputsS3Urls: JsonValue,
    private val outputsS3Urls: JsonValue,
    private val traceId: JsonField<String>,
    private val dottedOrder: JsonField<String>,
    private val id: JsonField<String>,
    private val status: JsonField<String>,
    private val childRunIds: JsonField<List<String>>,
    private val directChildRunIds: JsonField<List<String>>,
    private val parentRunIds: JsonField<List<String>>,
    private val feedbackStats: JsonField<FeedbackStats>,
    private val referenceExampleId: JsonField<String>,
    private val totalTokens: JsonField<Long>,
    private val promptTokens: JsonField<Long>,
    private val completionTokens: JsonField<Long>,
    private val totalCost: JsonField<Double>,
    private val promptCost: JsonField<Double>,
    private val completionCost: JsonField<Double>,
    private val firstTokenTime: JsonField<OffsetDateTime>,
    private val sessionId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun name(): String = name.getRequired("name")

    /** Enum for run types. */
    fun runType(): RunType = runType.getRequired("run_type")

    fun startTime(): Optional<OffsetDateTime> =
        Optional.ofNullable(startTime.getNullable("start_time"))

    fun endTime(): Optional<OffsetDateTime> = Optional.ofNullable(endTime.getNullable("end_time"))

    fun error(): Optional<String> = Optional.ofNullable(error.getNullable("error"))

    fun executionOrder(): Optional<Long> =
        Optional.ofNullable(executionOrder.getNullable("execution_order"))

    fun parentRunId(): Optional<String> =
        Optional.ofNullable(parentRunId.getNullable("parent_run_id"))

    fun manifestId(): Optional<String> = Optional.ofNullable(manifestId.getNullable("manifest_id"))

    fun manifestS3Id(): Optional<String> =
        Optional.ofNullable(manifestS3Id.getNullable("manifest_s3_id"))

    fun events(): Optional<List<JsonValue>> = Optional.ofNullable(events.getNullable("events"))

    fun tags(): Optional<List<String>> = Optional.ofNullable(tags.getNullable("tags"))

    fun traceId(): String = traceId.getRequired("trace_id")

    fun dottedOrder(): String = dottedOrder.getRequired("dotted_order")

    fun id(): String = id.getRequired("id")

    fun status(): String = status.getRequired("status")

    fun childRunIds(): Optional<List<String>> =
        Optional.ofNullable(childRunIds.getNullable("child_run_ids"))

    fun directChildRunIds(): Optional<List<String>> =
        Optional.ofNullable(directChildRunIds.getNullable("direct_child_run_ids"))

    fun parentRunIds(): Optional<List<String>> =
        Optional.ofNullable(parentRunIds.getNullable("parent_run_ids"))

    fun feedbackStats(): Optional<FeedbackStats> =
        Optional.ofNullable(feedbackStats.getNullable("feedback_stats"))

    fun referenceExampleId(): Optional<String> =
        Optional.ofNullable(referenceExampleId.getNullable("reference_example_id"))

    fun totalTokens(): Optional<Long> = Optional.ofNullable(totalTokens.getNullable("total_tokens"))

    fun promptTokens(): Optional<Long> =
        Optional.ofNullable(promptTokens.getNullable("prompt_tokens"))

    fun completionTokens(): Optional<Long> =
        Optional.ofNullable(completionTokens.getNullable("completion_tokens"))

    fun totalCost(): Optional<Double> = Optional.ofNullable(totalCost.getNullable("total_cost"))

    fun promptCost(): Optional<Double> = Optional.ofNullable(promptCost.getNullable("prompt_cost"))

    fun completionCost(): Optional<Double> =
        Optional.ofNullable(completionCost.getNullable("completion_cost"))

    fun firstTokenTime(): Optional<OffsetDateTime> =
        Optional.ofNullable(firstTokenTime.getNullable("first_token_time"))

    fun sessionId(): String = sessionId.getRequired("session_id")

    @JsonProperty("name") @ExcludeMissing fun _name() = name

    @JsonProperty("inputs") @ExcludeMissing fun _inputs() = inputs

    /** Enum for run types. */
    @JsonProperty("run_type") @ExcludeMissing fun _runType() = runType

    @JsonProperty("start_time") @ExcludeMissing fun _startTime() = startTime

    @JsonProperty("end_time") @ExcludeMissing fun _endTime() = endTime

    @JsonProperty("extra") @ExcludeMissing fun _extra() = extra

    @JsonProperty("error") @ExcludeMissing fun _error() = error

    @JsonProperty("execution_order") @ExcludeMissing fun _executionOrder() = executionOrder

    @JsonProperty("serialized") @ExcludeMissing fun _serialized() = serialized

    @JsonProperty("outputs") @ExcludeMissing fun _outputs() = outputs

    @JsonProperty("parent_run_id") @ExcludeMissing fun _parentRunId() = parentRunId

    @JsonProperty("manifest_id") @ExcludeMissing fun _manifestId() = manifestId

    @JsonProperty("manifest_s3_id") @ExcludeMissing fun _manifestS3Id() = manifestS3Id

    @JsonProperty("events") @ExcludeMissing fun _events() = events

    @JsonProperty("tags") @ExcludeMissing fun _tags() = tags

    @JsonProperty("inputs_s3_urls") @ExcludeMissing fun _inputsS3Urls() = inputsS3Urls

    @JsonProperty("outputs_s3_urls") @ExcludeMissing fun _outputsS3Urls() = outputsS3Urls

    @JsonProperty("trace_id") @ExcludeMissing fun _traceId() = traceId

    @JsonProperty("dotted_order") @ExcludeMissing fun _dottedOrder() = dottedOrder

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("status") @ExcludeMissing fun _status() = status

    @JsonProperty("child_run_ids") @ExcludeMissing fun _childRunIds() = childRunIds

    @JsonProperty("direct_child_run_ids")
    @ExcludeMissing
    fun _directChildRunIds() = directChildRunIds

    @JsonProperty("parent_run_ids") @ExcludeMissing fun _parentRunIds() = parentRunIds

    @JsonProperty("feedback_stats") @ExcludeMissing fun _feedbackStats() = feedbackStats

    @JsonProperty("reference_example_id")
    @ExcludeMissing
    fun _referenceExampleId() = referenceExampleId

    @JsonProperty("total_tokens") @ExcludeMissing fun _totalTokens() = totalTokens

    @JsonProperty("prompt_tokens") @ExcludeMissing fun _promptTokens() = promptTokens

    @JsonProperty("completion_tokens") @ExcludeMissing fun _completionTokens() = completionTokens

    @JsonProperty("total_cost") @ExcludeMissing fun _totalCost() = totalCost

    @JsonProperty("prompt_cost") @ExcludeMissing fun _promptCost() = promptCost

    @JsonProperty("completion_cost") @ExcludeMissing fun _completionCost() = completionCost

    @JsonProperty("first_token_time") @ExcludeMissing fun _firstTokenTime() = firstTokenTime

    @JsonProperty("session_id") @ExcludeMissing fun _sessionId() = sessionId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): RunPublicDatasetSchema = apply {
        if (!validated) {
            name()
            runType()
            startTime()
            endTime()
            error()
            executionOrder()
            parentRunId()
            manifestId()
            manifestS3Id()
            events()
            tags()
            traceId()
            dottedOrder()
            id()
            status()
            childRunIds()
            directChildRunIds()
            parentRunIds()
            feedbackStats().map { it.validate() }
            referenceExampleId()
            totalTokens()
            promptTokens()
            completionTokens()
            totalCost()
            promptCost()
            completionCost()
            firstTokenTime()
            sessionId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunPublicDatasetSchema &&
            this.name == other.name &&
            this.inputs == other.inputs &&
            this.runType == other.runType &&
            this.startTime == other.startTime &&
            this.endTime == other.endTime &&
            this.extra == other.extra &&
            this.error == other.error &&
            this.executionOrder == other.executionOrder &&
            this.serialized == other.serialized &&
            this.outputs == other.outputs &&
            this.parentRunId == other.parentRunId &&
            this.manifestId == other.manifestId &&
            this.manifestS3Id == other.manifestS3Id &&
            this.events == other.events &&
            this.tags == other.tags &&
            this.inputsS3Urls == other.inputsS3Urls &&
            this.outputsS3Urls == other.outputsS3Urls &&
            this.traceId == other.traceId &&
            this.dottedOrder == other.dottedOrder &&
            this.id == other.id &&
            this.status == other.status &&
            this.childRunIds == other.childRunIds &&
            this.directChildRunIds == other.directChildRunIds &&
            this.parentRunIds == other.parentRunIds &&
            this.feedbackStats == other.feedbackStats &&
            this.referenceExampleId == other.referenceExampleId &&
            this.totalTokens == other.totalTokens &&
            this.promptTokens == other.promptTokens &&
            this.completionTokens == other.completionTokens &&
            this.totalCost == other.totalCost &&
            this.promptCost == other.promptCost &&
            this.completionCost == other.completionCost &&
            this.firstTokenTime == other.firstTokenTime &&
            this.sessionId == other.sessionId &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    name,
                    inputs,
                    runType,
                    startTime,
                    endTime,
                    extra,
                    error,
                    executionOrder,
                    serialized,
                    outputs,
                    parentRunId,
                    manifestId,
                    manifestS3Id,
                    events,
                    tags,
                    inputsS3Urls,
                    outputsS3Urls,
                    traceId,
                    dottedOrder,
                    id,
                    status,
                    childRunIds,
                    directChildRunIds,
                    parentRunIds,
                    feedbackStats,
                    referenceExampleId,
                    totalTokens,
                    promptTokens,
                    completionTokens,
                    totalCost,
                    promptCost,
                    completionCost,
                    firstTokenTime,
                    sessionId,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "RunPublicDatasetSchema{name=$name, inputs=$inputs, runType=$runType, startTime=$startTime, endTime=$endTime, extra=$extra, error=$error, executionOrder=$executionOrder, serialized=$serialized, outputs=$outputs, parentRunId=$parentRunId, manifestId=$manifestId, manifestS3Id=$manifestS3Id, events=$events, tags=$tags, inputsS3Urls=$inputsS3Urls, outputsS3Urls=$outputsS3Urls, traceId=$traceId, dottedOrder=$dottedOrder, id=$id, status=$status, childRunIds=$childRunIds, directChildRunIds=$directChildRunIds, parentRunIds=$parentRunIds, feedbackStats=$feedbackStats, referenceExampleId=$referenceExampleId, totalTokens=$totalTokens, promptTokens=$promptTokens, completionTokens=$completionTokens, totalCost=$totalCost, promptCost=$promptCost, completionCost=$completionCost, firstTokenTime=$firstTokenTime, sessionId=$sessionId, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var name: JsonField<String> = JsonMissing.of()
        private var inputs: JsonValue = JsonMissing.of()
        private var runType: JsonField<RunType> = JsonMissing.of()
        private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var extra: JsonValue = JsonMissing.of()
        private var error: JsonField<String> = JsonMissing.of()
        private var executionOrder: JsonField<Long> = JsonMissing.of()
        private var serialized: JsonValue = JsonMissing.of()
        private var outputs: JsonValue = JsonMissing.of()
        private var parentRunId: JsonField<String> = JsonMissing.of()
        private var manifestId: JsonField<String> = JsonMissing.of()
        private var manifestS3Id: JsonField<String> = JsonMissing.of()
        private var events: JsonField<List<JsonValue>> = JsonMissing.of()
        private var tags: JsonField<List<String>> = JsonMissing.of()
        private var inputsS3Urls: JsonValue = JsonMissing.of()
        private var outputsS3Urls: JsonValue = JsonMissing.of()
        private var traceId: JsonField<String> = JsonMissing.of()
        private var dottedOrder: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var childRunIds: JsonField<List<String>> = JsonMissing.of()
        private var directChildRunIds: JsonField<List<String>> = JsonMissing.of()
        private var parentRunIds: JsonField<List<String>> = JsonMissing.of()
        private var feedbackStats: JsonField<FeedbackStats> = JsonMissing.of()
        private var referenceExampleId: JsonField<String> = JsonMissing.of()
        private var totalTokens: JsonField<Long> = JsonMissing.of()
        private var promptTokens: JsonField<Long> = JsonMissing.of()
        private var completionTokens: JsonField<Long> = JsonMissing.of()
        private var totalCost: JsonField<Double> = JsonMissing.of()
        private var promptCost: JsonField<Double> = JsonMissing.of()
        private var completionCost: JsonField<Double> = JsonMissing.of()
        private var firstTokenTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var sessionId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(runPublicDatasetSchema: RunPublicDatasetSchema) = apply {
            this.name = runPublicDatasetSchema.name
            this.inputs = runPublicDatasetSchema.inputs
            this.runType = runPublicDatasetSchema.runType
            this.startTime = runPublicDatasetSchema.startTime
            this.endTime = runPublicDatasetSchema.endTime
            this.extra = runPublicDatasetSchema.extra
            this.error = runPublicDatasetSchema.error
            this.executionOrder = runPublicDatasetSchema.executionOrder
            this.serialized = runPublicDatasetSchema.serialized
            this.outputs = runPublicDatasetSchema.outputs
            this.parentRunId = runPublicDatasetSchema.parentRunId
            this.manifestId = runPublicDatasetSchema.manifestId
            this.manifestS3Id = runPublicDatasetSchema.manifestS3Id
            this.events = runPublicDatasetSchema.events
            this.tags = runPublicDatasetSchema.tags
            this.inputsS3Urls = runPublicDatasetSchema.inputsS3Urls
            this.outputsS3Urls = runPublicDatasetSchema.outputsS3Urls
            this.traceId = runPublicDatasetSchema.traceId
            this.dottedOrder = runPublicDatasetSchema.dottedOrder
            this.id = runPublicDatasetSchema.id
            this.status = runPublicDatasetSchema.status
            this.childRunIds = runPublicDatasetSchema.childRunIds
            this.directChildRunIds = runPublicDatasetSchema.directChildRunIds
            this.parentRunIds = runPublicDatasetSchema.parentRunIds
            this.feedbackStats = runPublicDatasetSchema.feedbackStats
            this.referenceExampleId = runPublicDatasetSchema.referenceExampleId
            this.totalTokens = runPublicDatasetSchema.totalTokens
            this.promptTokens = runPublicDatasetSchema.promptTokens
            this.completionTokens = runPublicDatasetSchema.completionTokens
            this.totalCost = runPublicDatasetSchema.totalCost
            this.promptCost = runPublicDatasetSchema.promptCost
            this.completionCost = runPublicDatasetSchema.completionCost
            this.firstTokenTime = runPublicDatasetSchema.firstTokenTime
            this.sessionId = runPublicDatasetSchema.sessionId
            additionalProperties(runPublicDatasetSchema.additionalProperties)
        }

        fun name(name: String) = name(JsonField.of(name))

        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        @JsonProperty("inputs")
        @ExcludeMissing
        fun inputs(inputs: JsonValue) = apply { this.inputs = inputs }

        /** Enum for run types. */
        fun runType(runType: RunType) = runType(JsonField.of(runType))

        /** Enum for run types. */
        @JsonProperty("run_type")
        @ExcludeMissing
        fun runType(runType: JsonField<RunType>) = apply { this.runType = runType }

        fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

        @JsonProperty("start_time")
        @ExcludeMissing
        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { this.startTime = startTime }

        fun endTime(endTime: OffsetDateTime) = endTime(JsonField.of(endTime))

        @JsonProperty("end_time")
        @ExcludeMissing
        fun endTime(endTime: JsonField<OffsetDateTime>) = apply { this.endTime = endTime }

        @JsonProperty("extra")
        @ExcludeMissing
        fun extra(extra: JsonValue) = apply { this.extra = extra }

        fun error(error: String) = error(JsonField.of(error))

        @JsonProperty("error")
        @ExcludeMissing
        fun error(error: JsonField<String>) = apply { this.error = error }

        fun executionOrder(executionOrder: Long) = executionOrder(JsonField.of(executionOrder))

        @JsonProperty("execution_order")
        @ExcludeMissing
        fun executionOrder(executionOrder: JsonField<Long>) = apply {
            this.executionOrder = executionOrder
        }

        @JsonProperty("serialized")
        @ExcludeMissing
        fun serialized(serialized: JsonValue) = apply { this.serialized = serialized }

        @JsonProperty("outputs")
        @ExcludeMissing
        fun outputs(outputs: JsonValue) = apply { this.outputs = outputs }

        fun parentRunId(parentRunId: String) = parentRunId(JsonField.of(parentRunId))

        @JsonProperty("parent_run_id")
        @ExcludeMissing
        fun parentRunId(parentRunId: JsonField<String>) = apply { this.parentRunId = parentRunId }

        fun manifestId(manifestId: String) = manifestId(JsonField.of(manifestId))

        @JsonProperty("manifest_id")
        @ExcludeMissing
        fun manifestId(manifestId: JsonField<String>) = apply { this.manifestId = manifestId }

        fun manifestS3Id(manifestS3Id: String) = manifestS3Id(JsonField.of(manifestS3Id))

        @JsonProperty("manifest_s3_id")
        @ExcludeMissing
        fun manifestS3Id(manifestS3Id: JsonField<String>) = apply {
            this.manifestS3Id = manifestS3Id
        }

        fun events(events: List<JsonValue>) = events(JsonField.of(events))

        @JsonProperty("events")
        @ExcludeMissing
        fun events(events: JsonField<List<JsonValue>>) = apply { this.events = events }

        fun tags(tags: List<String>) = tags(JsonField.of(tags))

        @JsonProperty("tags")
        @ExcludeMissing
        fun tags(tags: JsonField<List<String>>) = apply { this.tags = tags }

        @JsonProperty("inputs_s3_urls")
        @ExcludeMissing
        fun inputsS3Urls(inputsS3Urls: JsonValue) = apply { this.inputsS3Urls = inputsS3Urls }

        @JsonProperty("outputs_s3_urls")
        @ExcludeMissing
        fun outputsS3Urls(outputsS3Urls: JsonValue) = apply { this.outputsS3Urls = outputsS3Urls }

        fun traceId(traceId: String) = traceId(JsonField.of(traceId))

        @JsonProperty("trace_id")
        @ExcludeMissing
        fun traceId(traceId: JsonField<String>) = apply { this.traceId = traceId }

        fun dottedOrder(dottedOrder: String) = dottedOrder(JsonField.of(dottedOrder))

        @JsonProperty("dotted_order")
        @ExcludeMissing
        fun dottedOrder(dottedOrder: JsonField<String>) = apply { this.dottedOrder = dottedOrder }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun status(status: String) = status(JsonField.of(status))

        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<String>) = apply { this.status = status }

        fun childRunIds(childRunIds: List<String>) = childRunIds(JsonField.of(childRunIds))

        @JsonProperty("child_run_ids")
        @ExcludeMissing
        fun childRunIds(childRunIds: JsonField<List<String>>) = apply {
            this.childRunIds = childRunIds
        }

        fun directChildRunIds(directChildRunIds: List<String>) =
            directChildRunIds(JsonField.of(directChildRunIds))

        @JsonProperty("direct_child_run_ids")
        @ExcludeMissing
        fun directChildRunIds(directChildRunIds: JsonField<List<String>>) = apply {
            this.directChildRunIds = directChildRunIds
        }

        fun parentRunIds(parentRunIds: List<String>) = parentRunIds(JsonField.of(parentRunIds))

        @JsonProperty("parent_run_ids")
        @ExcludeMissing
        fun parentRunIds(parentRunIds: JsonField<List<String>>) = apply {
            this.parentRunIds = parentRunIds
        }

        fun feedbackStats(feedbackStats: FeedbackStats) = feedbackStats(JsonField.of(feedbackStats))

        @JsonProperty("feedback_stats")
        @ExcludeMissing
        fun feedbackStats(feedbackStats: JsonField<FeedbackStats>) = apply {
            this.feedbackStats = feedbackStats
        }

        fun referenceExampleId(referenceExampleId: String) =
            referenceExampleId(JsonField.of(referenceExampleId))

        @JsonProperty("reference_example_id")
        @ExcludeMissing
        fun referenceExampleId(referenceExampleId: JsonField<String>) = apply {
            this.referenceExampleId = referenceExampleId
        }

        fun totalTokens(totalTokens: Long) = totalTokens(JsonField.of(totalTokens))

        @JsonProperty("total_tokens")
        @ExcludeMissing
        fun totalTokens(totalTokens: JsonField<Long>) = apply { this.totalTokens = totalTokens }

        fun promptTokens(promptTokens: Long) = promptTokens(JsonField.of(promptTokens))

        @JsonProperty("prompt_tokens")
        @ExcludeMissing
        fun promptTokens(promptTokens: JsonField<Long>) = apply { this.promptTokens = promptTokens }

        fun completionTokens(completionTokens: Long) =
            completionTokens(JsonField.of(completionTokens))

        @JsonProperty("completion_tokens")
        @ExcludeMissing
        fun completionTokens(completionTokens: JsonField<Long>) = apply {
            this.completionTokens = completionTokens
        }

        fun totalCost(totalCost: Double) = totalCost(JsonField.of(totalCost))

        @JsonProperty("total_cost")
        @ExcludeMissing
        fun totalCost(totalCost: JsonField<Double>) = apply { this.totalCost = totalCost }

        fun promptCost(promptCost: Double) = promptCost(JsonField.of(promptCost))

        @JsonProperty("prompt_cost")
        @ExcludeMissing
        fun promptCost(promptCost: JsonField<Double>) = apply { this.promptCost = promptCost }

        fun completionCost(completionCost: Double) = completionCost(JsonField.of(completionCost))

        @JsonProperty("completion_cost")
        @ExcludeMissing
        fun completionCost(completionCost: JsonField<Double>) = apply {
            this.completionCost = completionCost
        }

        fun firstTokenTime(firstTokenTime: OffsetDateTime) =
            firstTokenTime(JsonField.of(firstTokenTime))

        @JsonProperty("first_token_time")
        @ExcludeMissing
        fun firstTokenTime(firstTokenTime: JsonField<OffsetDateTime>) = apply {
            this.firstTokenTime = firstTokenTime
        }

        fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

        @JsonProperty("session_id")
        @ExcludeMissing
        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): RunPublicDatasetSchema =
            RunPublicDatasetSchema(
                name,
                inputs,
                runType,
                startTime,
                endTime,
                extra,
                error,
                executionOrder,
                serialized,
                outputs,
                parentRunId,
                manifestId,
                manifestS3Id,
                events.map { it.toUnmodifiable() },
                tags.map { it.toUnmodifiable() },
                inputsS3Urls,
                outputsS3Urls,
                traceId,
                dottedOrder,
                id,
                status,
                childRunIds.map { it.toUnmodifiable() },
                directChildRunIds.map { it.toUnmodifiable() },
                parentRunIds.map { it.toUnmodifiable() },
                feedbackStats,
                referenceExampleId,
                totalTokens,
                promptTokens,
                completionTokens,
                totalCost,
                promptCost,
                completionCost,
                firstTokenTime,
                sessionId,
                additionalProperties.toUnmodifiable(),
            )
    }

    class RunType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RunType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val TOOL = RunType(JsonField.of("tool"))

            @JvmField val CHAIN = RunType(JsonField.of("chain"))

            @JvmField val LLM = RunType(JsonField.of("llm"))

            @JvmField val RETRIEVER = RunType(JsonField.of("retriever"))

            @JvmField val EMBEDDING = RunType(JsonField.of("embedding"))

            @JvmField val PROMPT = RunType(JsonField.of("prompt"))

            @JvmField val PARSER = RunType(JsonField.of("parser"))

            @JvmStatic fun of(value: String) = RunType(JsonField.of(value))
        }

        enum class Known {
            TOOL,
            CHAIN,
            LLM,
            RETRIEVER,
            EMBEDDING,
            PROMPT,
            PARSER,
        }

        enum class Value {
            TOOL,
            CHAIN,
            LLM,
            RETRIEVER,
            EMBEDDING,
            PROMPT,
            PARSER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                TOOL -> Value.TOOL
                CHAIN -> Value.CHAIN
                LLM -> Value.LLM
                RETRIEVER -> Value.RETRIEVER
                EMBEDDING -> Value.EMBEDDING
                PROMPT -> Value.PROMPT
                PARSER -> Value.PARSER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                TOOL -> Known.TOOL
                CHAIN -> Known.CHAIN
                LLM -> Known.LLM
                RETRIEVER -> Known.RETRIEVER
                EMBEDDING -> Known.EMBEDDING
                PROMPT -> Known.PROMPT
                PARSER -> Known.PARSER
                else -> throw LangSmithInvalidDataException("Unknown RunType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = FeedbackStats.Builder::class)
    @NoAutoDetect
    class FeedbackStats
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): FeedbackStats = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FeedbackStats && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "FeedbackStats{additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(feedbackStats: FeedbackStats) = apply {
                additionalProperties(feedbackStats.additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): FeedbackStats = FeedbackStats(additionalProperties.toUnmodifiable())
        }
    }
}

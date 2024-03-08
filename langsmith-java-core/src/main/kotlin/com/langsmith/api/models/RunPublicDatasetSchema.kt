// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

// //
// templates/JavaSDK/components/file.ts:28:17
import com.fasterxml.jackson.annotation.JsonAnyGetter // templates/JavaSDK/components/file.ts:28:17
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
// templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
// templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
// templates/JavaSDK/entities/objects.ts:76:13
@JsonDeserialize(builder = RunPublicDatasetSchema.Builder::class)
@NoAutoDetect
class RunPublicDatasetSchema
private constructor( // templates/JavaSDK/entities/objects.ts:76:13
    private val name: JsonField<String>, // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13
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

    private var validated: Boolean = false // templates/JavaSDK/entities/objects.ts:94:14 //
    // templates/JavaSDK/entities/objects.ts:76:13

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

    @JsonProperty("name") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _name() = name

    @JsonProperty("inputs") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _inputs() = inputs

    /** Enum for run types. */
    @JsonProperty("run_type") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _runType() = runType

    @JsonProperty("start_time") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _startTime() = startTime

    @JsonProperty("end_time") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _endTime() = endTime

    @JsonProperty("extra") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _extra() = extra

    @JsonProperty("error") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _error() = error

    @JsonProperty("execution_order") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _executionOrder() = executionOrder

    @JsonProperty("serialized") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _serialized() = serialized

    @JsonProperty("outputs") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _outputs() = outputs

    @JsonProperty("parent_run_id") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _parentRunId() = parentRunId

    @JsonProperty("manifest_id") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _manifestId() = manifestId

    @JsonProperty("manifest_s3_id") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _manifestS3Id() = manifestS3Id

    @JsonProperty("events") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _events() = events

    @JsonProperty("tags") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _tags() = tags

    @JsonProperty("inputs_s3_urls") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _inputsS3Urls() = inputsS3Urls

    @JsonProperty("outputs_s3_urls") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _outputsS3Urls() = outputsS3Urls

    @JsonProperty("trace_id") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _traceId() = traceId

    @JsonProperty("dotted_order") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _dottedOrder() = dottedOrder

    @JsonProperty("id") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _id() = id

    @JsonProperty("status") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _status() = status

    @JsonProperty("child_run_ids") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _childRunIds() = childRunIds

    @JsonProperty("direct_child_run_ids") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _directChildRunIds() = directChildRunIds

    @JsonProperty("parent_run_ids") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _parentRunIds() = parentRunIds

    @JsonProperty("feedback_stats") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _feedbackStats() = feedbackStats

    @JsonProperty("reference_example_id") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _referenceExampleId() = referenceExampleId

    @JsonProperty("total_tokens") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _totalTokens() = totalTokens

    @JsonProperty("prompt_tokens") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _promptTokens() = promptTokens

    @JsonProperty("completion_tokens") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _completionTokens() = completionTokens

    @JsonProperty("total_cost") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _totalCost() = totalCost

    @JsonProperty("prompt_cost") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _promptCost() = promptCost

    @JsonProperty("completion_cost") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _completionCost() = completionCost

    @JsonProperty("first_token_time") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _firstTokenTime() = firstTokenTime

    @JsonProperty("session_id") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _sessionId() = sessionId

    @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
    // templates/JavaSDK/entities/objects.ts:180:12
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): RunPublicDatasetSchema = apply { // templates/JavaSDK/entities/objects.ts:198:28
        if (!validated) { // templates/JavaSDK/entities/objects.ts:201:20 //
            // templates/JavaSDK/entities/objects.ts:198:28 //
            // templates/JavaSDK/entities/objects.ts:198:28
            name() // templates/JavaSDK/entities/objects.ts:201:20 //
            // templates/JavaSDK/entities/objects.ts:201:20
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

    override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
        if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
            return true
        }

        return other is RunPublicDatasetSchema && // templates/JavaSDK/entities/fields.ts:143:33
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

    override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
        if (hashCode == 0) { // templates/JavaSDK/entities/fields.ts:175:16 //
            // templates/JavaSDK/entities/fields.ts:174:16 //
            // templates/JavaSDK/entities/fields.ts:174:16
            hashCode =
                Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
                    // templates/JavaSDK/entities/fields.ts:175:16 //
                    // templates/JavaSDK/entities/fields.ts:175:16
                    name, // templates/JavaSDK/entities/fields.ts:163:19
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

    companion object { // templates/JavaSDK/entities/objects.ts:217:10

        @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
        // templates/JavaSDK/entities/objects.ts:217:10
        fun builder() = Builder()
    }

    class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
        // templates/JavaSDK/entities/objects.ts:224:10 //
        // templates/JavaSDK/entities/objects.ts:224:10

        private var name: JsonField<String> =
            JsonMissing.of() // templates/JavaSDK/entities/objects.ts:226:16 //
        // templates/JavaSDK/entities/objects.ts:226:16 //
        // templates/JavaSDK/entities/objects.ts:224:10
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

        @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
        internal fun from(runPublicDatasetSchema: RunPublicDatasetSchema) =
            apply { // templates/JavaSDK/entities/objects.ts:240:30
                this.name =
                    runPublicDatasetSchema.name // templates/JavaSDK/entities/objects.ts:240:30 //
                // templates/JavaSDK/entities/objects.ts:240:30
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

        fun name(name: String) =
            name(JsonField.of(name)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("name") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { // templates/JavaSDK/entities/objects.ts:275:36
            this.name = name
        }

        @JsonProperty("inputs") // templates/JavaSDK/entities/objects.ts:264:20 //
        // templates/JavaSDK/entities/objects.ts:252:20
        @ExcludeMissing
        fun inputs(inputs: JsonValue) = apply { // templates/JavaSDK/entities/objects.ts:275:36
            this.inputs = inputs
        }

        /** Enum for run types. */
        // templates/JavaSDK/entities/objects.ts:252:20
        fun runType(runType: RunType) = runType(JsonField.of(runType))

        /** Enum for run types. */
        @JsonProperty("run_type") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun runType(runType: JsonField<RunType>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.runType = runType
            }

        fun startTime(startTime: OffsetDateTime) =
            startTime(JsonField.of(startTime)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("start_time") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun startTime(startTime: JsonField<OffsetDateTime>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.startTime = startTime
            }

        fun endTime(endTime: OffsetDateTime) =
            endTime(JsonField.of(endTime)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("end_time") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun endTime(endTime: JsonField<OffsetDateTime>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.endTime = endTime
            }

        @JsonProperty("extra") // templates/JavaSDK/entities/objects.ts:264:20 //
        // templates/JavaSDK/entities/objects.ts:252:20
        @ExcludeMissing
        fun extra(extra: JsonValue) = apply { // templates/JavaSDK/entities/objects.ts:275:36
            this.extra = extra
        }

        fun error(error: String) =
            error(JsonField.of(error)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("error") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun error(error: JsonField<String>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.error = error
            }

        fun executionOrder(executionOrder: Long) =
            executionOrder(
                JsonField.of(executionOrder)
            ) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("execution_order") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun executionOrder(executionOrder: JsonField<Long>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.executionOrder = executionOrder
            }

        @JsonProperty("serialized") // templates/JavaSDK/entities/objects.ts:264:20 //
        // templates/JavaSDK/entities/objects.ts:252:20
        @ExcludeMissing
        fun serialized(serialized: JsonValue) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.serialized = serialized
            }

        @JsonProperty("outputs") // templates/JavaSDK/entities/objects.ts:264:20 //
        // templates/JavaSDK/entities/objects.ts:252:20
        @ExcludeMissing
        fun outputs(outputs: JsonValue) = apply { // templates/JavaSDK/entities/objects.ts:275:36
            this.outputs = outputs
        }

        fun parentRunId(parentRunId: String) =
            parentRunId(JsonField.of(parentRunId)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("parent_run_id") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun parentRunId(parentRunId: JsonField<String>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.parentRunId = parentRunId
            }

        fun manifestId(manifestId: String) =
            manifestId(JsonField.of(manifestId)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("manifest_id") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun manifestId(manifestId: JsonField<String>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.manifestId = manifestId
            }

        fun manifestS3Id(manifestS3Id: String) =
            manifestS3Id(JsonField.of(manifestS3Id)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("manifest_s3_id") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun manifestS3Id(manifestS3Id: JsonField<String>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.manifestS3Id = manifestS3Id
            }

        fun events(events: List<JsonValue>) =
            events(JsonField.of(events)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("events") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun events(events: JsonField<List<JsonValue>>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.events = events
            }

        fun tags(tags: List<String>) =
            tags(JsonField.of(tags)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("tags") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun tags(tags: JsonField<List<String>>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.tags = tags
            }

        @JsonProperty("inputs_s3_urls") // templates/JavaSDK/entities/objects.ts:264:20 //
        // templates/JavaSDK/entities/objects.ts:252:20
        @ExcludeMissing
        fun inputsS3Urls(inputsS3Urls: JsonValue) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.inputsS3Urls = inputsS3Urls
            }

        @JsonProperty("outputs_s3_urls") // templates/JavaSDK/entities/objects.ts:264:20 //
        // templates/JavaSDK/entities/objects.ts:252:20
        @ExcludeMissing
        fun outputsS3Urls(outputsS3Urls: JsonValue) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.outputsS3Urls = outputsS3Urls
            }

        fun traceId(traceId: String) =
            traceId(JsonField.of(traceId)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("trace_id") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun traceId(traceId: JsonField<String>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.traceId = traceId
            }

        fun dottedOrder(dottedOrder: String) =
            dottedOrder(JsonField.of(dottedOrder)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("dotted_order") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun dottedOrder(dottedOrder: JsonField<String>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.dottedOrder = dottedOrder
            }

        fun id(id: String) = id(JsonField.of(id)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("id") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun id(id: JsonField<String>) = apply { // templates/JavaSDK/entities/objects.ts:275:36
            this.id = id
        }

        fun status(status: String) =
            status(JsonField.of(status)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("status") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun status(status: JsonField<String>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.status = status
            }

        fun childRunIds(childRunIds: List<String>) =
            childRunIds(JsonField.of(childRunIds)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("child_run_ids") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun childRunIds(childRunIds: JsonField<List<String>>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.childRunIds = childRunIds
            }

        fun directChildRunIds(directChildRunIds: List<String>) =
            directChildRunIds(
                JsonField.of(directChildRunIds)
            ) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("direct_child_run_ids") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun directChildRunIds(directChildRunIds: JsonField<List<String>>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.directChildRunIds = directChildRunIds
            }

        fun parentRunIds(parentRunIds: List<String>) =
            parentRunIds(JsonField.of(parentRunIds)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("parent_run_ids") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun parentRunIds(parentRunIds: JsonField<List<String>>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.parentRunIds = parentRunIds
            }

        fun feedbackStats(feedbackStats: FeedbackStats) =
            feedbackStats(
                JsonField.of(feedbackStats)
            ) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("feedback_stats") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun feedbackStats(feedbackStats: JsonField<FeedbackStats>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.feedbackStats = feedbackStats
            }

        fun referenceExampleId(referenceExampleId: String) =
            referenceExampleId(
                JsonField.of(referenceExampleId)
            ) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("reference_example_id") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun referenceExampleId(referenceExampleId: JsonField<String>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.referenceExampleId = referenceExampleId
            }

        fun totalTokens(totalTokens: Long) =
            totalTokens(JsonField.of(totalTokens)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("total_tokens") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun totalTokens(totalTokens: JsonField<Long>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.totalTokens = totalTokens
            }

        fun promptTokens(promptTokens: Long) =
            promptTokens(JsonField.of(promptTokens)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("prompt_tokens") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun promptTokens(promptTokens: JsonField<Long>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.promptTokens = promptTokens
            }

        fun completionTokens(completionTokens: Long) =
            completionTokens(
                JsonField.of(completionTokens)
            ) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("completion_tokens") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun completionTokens(completionTokens: JsonField<Long>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.completionTokens = completionTokens
            }

        fun totalCost(totalCost: Double) =
            totalCost(JsonField.of(totalCost)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("total_cost") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun totalCost(totalCost: JsonField<Double>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.totalCost = totalCost
            }

        fun promptCost(promptCost: Double) =
            promptCost(JsonField.of(promptCost)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("prompt_cost") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun promptCost(promptCost: JsonField<Double>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.promptCost = promptCost
            }

        fun completionCost(completionCost: Double) =
            completionCost(
                JsonField.of(completionCost)
            ) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("completion_cost") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun completionCost(completionCost: JsonField<Double>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.completionCost = completionCost
            }

        fun firstTokenTime(firstTokenTime: OffsetDateTime) =
            firstTokenTime(
                JsonField.of(firstTokenTime)
            ) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("first_token_time") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun firstTokenTime(firstTokenTime: JsonField<OffsetDateTime>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.firstTokenTime = firstTokenTime
            }

        fun sessionId(sessionId: String) =
            sessionId(JsonField.of(sessionId)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("session_id") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun sessionId(sessionId: JsonField<String>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.sessionId = sessionId
            }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply { // templates/JavaSDK/entities/objects.ts:290:30
                this.additionalProperties.clear() // templates/JavaSDK/entities/objects.ts:290:30 //
                // templates/JavaSDK/entities/objects.ts:290:30
                this.additionalProperties.putAll(additionalProperties)
            }

        @JsonAnySetter // templates/JavaSDK/entities/objects.ts:299:14
        fun putAdditionalProperty(key: String, value: JsonValue) =
            apply { // templates/JavaSDK/entities/objects.ts:304:30
                this.additionalProperties.put(key, value)
            }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply { // templates/JavaSDK/entities/objects.ts:316:30
                this.additionalProperties.putAll(additionalProperties)
            }

        fun build(): RunPublicDatasetSchema =
            RunPublicDatasetSchema( // templates/JavaSDK/entities/objects.ts:326:30
                name, // templates/JavaSDK/entities/objects.ts:326:30
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
    ) { // templates/JavaSDK/entities/enums.ts:56:13 // templates/JavaSDK/entities/enums.ts:56:13 //
        // templates/JavaSDK/entities/enums.ts:56:13

        @com.fasterxml.jackson.annotation.JsonValue // templates/JavaSDK/entities/enums.ts:62:10 //
        // templates/JavaSDK/entities/enums.ts:56:13
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
            if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                return true
            }

            return other is RunType && // templates/JavaSDK/entities/fields.ts:143:33
                this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object { // templates/JavaSDK/entities/enums.ts:71:10

            @JvmField
            val TOOL = RunType(JsonField.of("tool")) // templates/JavaSDK/entities/enums.ts:71:10

            @JvmField val CHAIN = RunType(JsonField.of("chain"))

            @JvmField val LLM = RunType(JsonField.of("llm"))

            @JvmField val RETRIEVER = RunType(JsonField.of("retriever"))

            @JvmField val EMBEDDING = RunType(JsonField.of("embedding"))

            @JvmField val PROMPT = RunType(JsonField.of("prompt"))

            @JvmField val PARSER = RunType(JsonField.of("parser"))

            @JvmStatic fun of(value: String) = RunType(JsonField.of(value))
        }

        enum class Known { // templates/JavaSDK/entities/enums.ts:78:10
            TOOL, // templates/JavaSDK/entities/enums.ts:78:10 //
            // templates/JavaSDK/entities/enums.ts:78:10
            CHAIN,
            LLM,
            RETRIEVER,
            EMBEDDING,
            PROMPT,
            PARSER,
        }

        enum class Value { // templates/JavaSDK/entities/enums.ts:82:10
            TOOL, // templates/JavaSDK/entities/enums.ts:82:10 //
            // templates/JavaSDK/entities/enums.ts:82:10
            CHAIN,
            LLM,
            RETRIEVER,
            EMBEDDING,
            PROMPT,
            PARSER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) { // templates/JavaSDK/entities/enums.ts:91:29
                TOOL -> Value.TOOL // templates/JavaSDK/entities/enums.ts:54:10 //
                // templates/JavaSDK/entities/enums.ts:54:10
                CHAIN -> Value.CHAIN
                LLM -> Value.LLM
                RETRIEVER -> Value.RETRIEVER
                EMBEDDING -> Value.EMBEDDING
                PROMPT -> Value.PROMPT
                PARSER -> Value.PARSER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) { // templates/JavaSDK/entities/enums.ts:104:29
                TOOL -> Known.TOOL // templates/JavaSDK/entities/enums.ts:54:10 //
                // templates/JavaSDK/entities/enums.ts:54:10
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

    @JsonDeserialize(
        builder = FeedbackStats.Builder::class
    ) // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13
    // // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13
    @NoAutoDetect
    class FeedbackStats
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false // templates/JavaSDK/entities/objects.ts:94:14 //
        // templates/JavaSDK/entities/objects.ts:76:13

        private var hashCode: Int = 0

        @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
        // templates/JavaSDK/entities/objects.ts:180:12
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): FeedbackStats = apply { // templates/JavaSDK/entities/objects.ts:198:28
            if (!validated) { // templates/JavaSDK/entities/objects.ts:201:20 //
                // templates/JavaSDK/entities/objects.ts:198:28 //
                // templates/JavaSDK/entities/objects.ts:198:28
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
            if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                return true
            }

            return other is FeedbackStats && // templates/JavaSDK/entities/fields.ts:143:33
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
            if (hashCode == 0) { // templates/JavaSDK/entities/fields.ts:175:16 //
                // templates/JavaSDK/entities/fields.ts:174:16 //
                // templates/JavaSDK/entities/fields.ts:174:16
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "FeedbackStats{additionalProperties=$additionalProperties}"

        companion object { // templates/JavaSDK/entities/objects.ts:217:10

            @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
            // templates/JavaSDK/entities/objects.ts:217:10
            fun builder() = Builder()
        }

        class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10

            private var additionalProperties: MutableMap<String, JsonValue> =
                mutableMapOf() // templates/JavaSDK/entities/objects.ts:224:10

            @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
            internal fun from(feedbackStats: FeedbackStats) =
                apply { // templates/JavaSDK/entities/objects.ts:240:30
                    additionalProperties(feedbackStats.additionalProperties)
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply { // templates/JavaSDK/entities/objects.ts:290:30
                    this.additionalProperties
                        .clear() // templates/JavaSDK/entities/objects.ts:290:30 //
                    // templates/JavaSDK/entities/objects.ts:290:30
                    this.additionalProperties.putAll(additionalProperties)
                }

            @JsonAnySetter // templates/JavaSDK/entities/objects.ts:299:14
            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply { // templates/JavaSDK/entities/objects.ts:304:30
                    this.additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply { // templates/JavaSDK/entities/objects.ts:316:30
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun build(): FeedbackStats = FeedbackStats(additionalProperties.toUnmodifiable())
        }
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.langsmith.api.core.ExcludeMissing
import com.langsmith.api.core.JsonField
import com.langsmith.api.core.JsonMissing
import com.langsmith.api.core.JsonValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** TracerSession schema. */
@JsonDeserialize(builder = TracerSession.Builder::class)
@NoAutoDetect
class TracerSession
private constructor(
    private val startTime: JsonField<OffsetDateTime>,
    private val endTime: JsonField<OffsetDateTime>,
    private val extra: JsonValue,
    private val name: JsonField<String>,
    private val description: JsonField<String>,
    private val defaultDatasetId: JsonField<String>,
    private val referenceDatasetId: JsonField<String>,
    private val id: JsonField<String>,
    private val runCount: JsonField<Long>,
    private val latencyP50: JsonField<Double>,
    private val latencyP99: JsonField<Double>,
    private val firstTokenP50: JsonField<Double>,
    private val firstTokenP99: JsonField<Double>,
    private val totalTokens: JsonField<Long>,
    private val promptTokens: JsonField<Long>,
    private val completionTokens: JsonField<Long>,
    private val totalCost: JsonField<Double>,
    private val promptCost: JsonField<Double>,
    private val completionCost: JsonField<Double>,
    private val tenantId: JsonField<String>,
    private val lastRunStartTime: JsonField<OffsetDateTime>,
    private val lastRunStartTimeLive: JsonField<OffsetDateTime>,
    private val feedbackStats: JsonValue,
    private val runFacets: JsonField<List<JsonValue>>,
    private val errorRate: JsonField<Double>,
    private val streamingRate: JsonField<Double>,
    private val testRunNumber: JsonField<Long>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun startTime(): Optional<OffsetDateTime> =
        Optional.ofNullable(startTime.getNullable("start_time"))

    fun endTime(): Optional<OffsetDateTime> = Optional.ofNullable(endTime.getNullable("end_time"))

    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    fun defaultDatasetId(): Optional<String> =
        Optional.ofNullable(defaultDatasetId.getNullable("default_dataset_id"))

    fun referenceDatasetId(): Optional<String> =
        Optional.ofNullable(referenceDatasetId.getNullable("reference_dataset_id"))

    fun id(): String = id.getRequired("id")

    fun runCount(): Optional<Long> = Optional.ofNullable(runCount.getNullable("run_count"))

    fun latencyP50(): Optional<Double> = Optional.ofNullable(latencyP50.getNullable("latency_p50"))

    fun latencyP99(): Optional<Double> = Optional.ofNullable(latencyP99.getNullable("latency_p99"))

    fun firstTokenP50(): Optional<Double> =
        Optional.ofNullable(firstTokenP50.getNullable("first_token_p50"))

    fun firstTokenP99(): Optional<Double> =
        Optional.ofNullable(firstTokenP99.getNullable("first_token_p99"))

    fun totalTokens(): Optional<Long> = Optional.ofNullable(totalTokens.getNullable("total_tokens"))

    fun promptTokens(): Optional<Long> =
        Optional.ofNullable(promptTokens.getNullable("prompt_tokens"))

    fun completionTokens(): Optional<Long> =
        Optional.ofNullable(completionTokens.getNullable("completion_tokens"))

    fun totalCost(): Optional<Double> = Optional.ofNullable(totalCost.getNullable("total_cost"))

    fun promptCost(): Optional<Double> = Optional.ofNullable(promptCost.getNullable("prompt_cost"))

    fun completionCost(): Optional<Double> =
        Optional.ofNullable(completionCost.getNullable("completion_cost"))

    fun tenantId(): String = tenantId.getRequired("tenant_id")

    fun lastRunStartTime(): Optional<OffsetDateTime> =
        Optional.ofNullable(lastRunStartTime.getNullable("last_run_start_time"))

    fun lastRunStartTimeLive(): Optional<OffsetDateTime> =
        Optional.ofNullable(lastRunStartTimeLive.getNullable("last_run_start_time_live"))

    fun runFacets(): Optional<List<JsonValue>> =
        Optional.ofNullable(runFacets.getNullable("run_facets"))

    fun errorRate(): Optional<Double> = Optional.ofNullable(errorRate.getNullable("error_rate"))

    fun streamingRate(): Optional<Double> =
        Optional.ofNullable(streamingRate.getNullable("streaming_rate"))

    fun testRunNumber(): Optional<Long> =
        Optional.ofNullable(testRunNumber.getNullable("test_run_number"))

    @JsonProperty("start_time") @ExcludeMissing fun _startTime() = startTime

    @JsonProperty("end_time") @ExcludeMissing fun _endTime() = endTime

    @JsonProperty("extra") @ExcludeMissing fun _extra() = extra

    @JsonProperty("name") @ExcludeMissing fun _name() = name

    @JsonProperty("description") @ExcludeMissing fun _description() = description

    @JsonProperty("default_dataset_id") @ExcludeMissing fun _defaultDatasetId() = defaultDatasetId

    @JsonProperty("reference_dataset_id")
    @ExcludeMissing
    fun _referenceDatasetId() = referenceDatasetId

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("run_count") @ExcludeMissing fun _runCount() = runCount

    @JsonProperty("latency_p50") @ExcludeMissing fun _latencyP50() = latencyP50

    @JsonProperty("latency_p99") @ExcludeMissing fun _latencyP99() = latencyP99

    @JsonProperty("first_token_p50") @ExcludeMissing fun _firstTokenP50() = firstTokenP50

    @JsonProperty("first_token_p99") @ExcludeMissing fun _firstTokenP99() = firstTokenP99

    @JsonProperty("total_tokens") @ExcludeMissing fun _totalTokens() = totalTokens

    @JsonProperty("prompt_tokens") @ExcludeMissing fun _promptTokens() = promptTokens

    @JsonProperty("completion_tokens") @ExcludeMissing fun _completionTokens() = completionTokens

    @JsonProperty("total_cost") @ExcludeMissing fun _totalCost() = totalCost

    @JsonProperty("prompt_cost") @ExcludeMissing fun _promptCost() = promptCost

    @JsonProperty("completion_cost") @ExcludeMissing fun _completionCost() = completionCost

    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId() = tenantId

    @JsonProperty("last_run_start_time") @ExcludeMissing fun _lastRunStartTime() = lastRunStartTime

    @JsonProperty("last_run_start_time_live")
    @ExcludeMissing
    fun _lastRunStartTimeLive() = lastRunStartTimeLive

    @JsonProperty("feedback_stats") @ExcludeMissing fun _feedbackStats() = feedbackStats

    @JsonProperty("run_facets") @ExcludeMissing fun _runFacets() = runFacets

    @JsonProperty("error_rate") @ExcludeMissing fun _errorRate() = errorRate

    @JsonProperty("streaming_rate") @ExcludeMissing fun _streamingRate() = streamingRate

    @JsonProperty("test_run_number") @ExcludeMissing fun _testRunNumber() = testRunNumber

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): TracerSession = apply {
        if (!validated) {
            startTime()
            endTime()
            name()
            description()
            defaultDatasetId()
            referenceDatasetId()
            id()
            runCount()
            latencyP50()
            latencyP99()
            firstTokenP50()
            firstTokenP99()
            totalTokens()
            promptTokens()
            completionTokens()
            totalCost()
            promptCost()
            completionCost()
            tenantId()
            lastRunStartTime()
            lastRunStartTimeLive()
            runFacets()
            errorRate()
            streamingRate()
            testRunNumber()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TracerSession &&
            this.startTime == other.startTime &&
            this.endTime == other.endTime &&
            this.extra == other.extra &&
            this.name == other.name &&
            this.description == other.description &&
            this.defaultDatasetId == other.defaultDatasetId &&
            this.referenceDatasetId == other.referenceDatasetId &&
            this.id == other.id &&
            this.runCount == other.runCount &&
            this.latencyP50 == other.latencyP50 &&
            this.latencyP99 == other.latencyP99 &&
            this.firstTokenP50 == other.firstTokenP50 &&
            this.firstTokenP99 == other.firstTokenP99 &&
            this.totalTokens == other.totalTokens &&
            this.promptTokens == other.promptTokens &&
            this.completionTokens == other.completionTokens &&
            this.totalCost == other.totalCost &&
            this.promptCost == other.promptCost &&
            this.completionCost == other.completionCost &&
            this.tenantId == other.tenantId &&
            this.lastRunStartTime == other.lastRunStartTime &&
            this.lastRunStartTimeLive == other.lastRunStartTimeLive &&
            this.feedbackStats == other.feedbackStats &&
            this.runFacets == other.runFacets &&
            this.errorRate == other.errorRate &&
            this.streamingRate == other.streamingRate &&
            this.testRunNumber == other.testRunNumber &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    startTime,
                    endTime,
                    extra,
                    name,
                    description,
                    defaultDatasetId,
                    referenceDatasetId,
                    id,
                    runCount,
                    latencyP50,
                    latencyP99,
                    firstTokenP50,
                    firstTokenP99,
                    totalTokens,
                    promptTokens,
                    completionTokens,
                    totalCost,
                    promptCost,
                    completionCost,
                    tenantId,
                    lastRunStartTime,
                    lastRunStartTimeLive,
                    feedbackStats,
                    runFacets,
                    errorRate,
                    streamingRate,
                    testRunNumber,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "TracerSession{startTime=$startTime, endTime=$endTime, extra=$extra, name=$name, description=$description, defaultDatasetId=$defaultDatasetId, referenceDatasetId=$referenceDatasetId, id=$id, runCount=$runCount, latencyP50=$latencyP50, latencyP99=$latencyP99, firstTokenP50=$firstTokenP50, firstTokenP99=$firstTokenP99, totalTokens=$totalTokens, promptTokens=$promptTokens, completionTokens=$completionTokens, totalCost=$totalCost, promptCost=$promptCost, completionCost=$completionCost, tenantId=$tenantId, lastRunStartTime=$lastRunStartTime, lastRunStartTimeLive=$lastRunStartTimeLive, feedbackStats=$feedbackStats, runFacets=$runFacets, errorRate=$errorRate, streamingRate=$streamingRate, testRunNumber=$testRunNumber, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var extra: JsonValue = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var defaultDatasetId: JsonField<String> = JsonMissing.of()
        private var referenceDatasetId: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var runCount: JsonField<Long> = JsonMissing.of()
        private var latencyP50: JsonField<Double> = JsonMissing.of()
        private var latencyP99: JsonField<Double> = JsonMissing.of()
        private var firstTokenP50: JsonField<Double> = JsonMissing.of()
        private var firstTokenP99: JsonField<Double> = JsonMissing.of()
        private var totalTokens: JsonField<Long> = JsonMissing.of()
        private var promptTokens: JsonField<Long> = JsonMissing.of()
        private var completionTokens: JsonField<Long> = JsonMissing.of()
        private var totalCost: JsonField<Double> = JsonMissing.of()
        private var promptCost: JsonField<Double> = JsonMissing.of()
        private var completionCost: JsonField<Double> = JsonMissing.of()
        private var tenantId: JsonField<String> = JsonMissing.of()
        private var lastRunStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastRunStartTimeLive: JsonField<OffsetDateTime> = JsonMissing.of()
        private var feedbackStats: JsonValue = JsonMissing.of()
        private var runFacets: JsonField<List<JsonValue>> = JsonMissing.of()
        private var errorRate: JsonField<Double> = JsonMissing.of()
        private var streamingRate: JsonField<Double> = JsonMissing.of()
        private var testRunNumber: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tracerSession: TracerSession) = apply {
            this.startTime = tracerSession.startTime
            this.endTime = tracerSession.endTime
            this.extra = tracerSession.extra
            this.name = tracerSession.name
            this.description = tracerSession.description
            this.defaultDatasetId = tracerSession.defaultDatasetId
            this.referenceDatasetId = tracerSession.referenceDatasetId
            this.id = tracerSession.id
            this.runCount = tracerSession.runCount
            this.latencyP50 = tracerSession.latencyP50
            this.latencyP99 = tracerSession.latencyP99
            this.firstTokenP50 = tracerSession.firstTokenP50
            this.firstTokenP99 = tracerSession.firstTokenP99
            this.totalTokens = tracerSession.totalTokens
            this.promptTokens = tracerSession.promptTokens
            this.completionTokens = tracerSession.completionTokens
            this.totalCost = tracerSession.totalCost
            this.promptCost = tracerSession.promptCost
            this.completionCost = tracerSession.completionCost
            this.tenantId = tracerSession.tenantId
            this.lastRunStartTime = tracerSession.lastRunStartTime
            this.lastRunStartTimeLive = tracerSession.lastRunStartTimeLive
            this.feedbackStats = tracerSession.feedbackStats
            this.runFacets = tracerSession.runFacets
            this.errorRate = tracerSession.errorRate
            this.streamingRate = tracerSession.streamingRate
            this.testRunNumber = tracerSession.testRunNumber
            additionalProperties(tracerSession.additionalProperties)
        }

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

        fun name(name: String) = name(JsonField.of(name))

        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun description(description: String) = description(JsonField.of(description))

        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun defaultDatasetId(defaultDatasetId: String) =
            defaultDatasetId(JsonField.of(defaultDatasetId))

        @JsonProperty("default_dataset_id")
        @ExcludeMissing
        fun defaultDatasetId(defaultDatasetId: JsonField<String>) = apply {
            this.defaultDatasetId = defaultDatasetId
        }

        fun referenceDatasetId(referenceDatasetId: String) =
            referenceDatasetId(JsonField.of(referenceDatasetId))

        @JsonProperty("reference_dataset_id")
        @ExcludeMissing
        fun referenceDatasetId(referenceDatasetId: JsonField<String>) = apply {
            this.referenceDatasetId = referenceDatasetId
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun runCount(runCount: Long) = runCount(JsonField.of(runCount))

        @JsonProperty("run_count")
        @ExcludeMissing
        fun runCount(runCount: JsonField<Long>) = apply { this.runCount = runCount }

        fun latencyP50(latencyP50: Double) = latencyP50(JsonField.of(latencyP50))

        @JsonProperty("latency_p50")
        @ExcludeMissing
        fun latencyP50(latencyP50: JsonField<Double>) = apply { this.latencyP50 = latencyP50 }

        fun latencyP99(latencyP99: Double) = latencyP99(JsonField.of(latencyP99))

        @JsonProperty("latency_p99")
        @ExcludeMissing
        fun latencyP99(latencyP99: JsonField<Double>) = apply { this.latencyP99 = latencyP99 }

        fun firstTokenP50(firstTokenP50: Double) = firstTokenP50(JsonField.of(firstTokenP50))

        @JsonProperty("first_token_p50")
        @ExcludeMissing
        fun firstTokenP50(firstTokenP50: JsonField<Double>) = apply {
            this.firstTokenP50 = firstTokenP50
        }

        fun firstTokenP99(firstTokenP99: Double) = firstTokenP99(JsonField.of(firstTokenP99))

        @JsonProperty("first_token_p99")
        @ExcludeMissing
        fun firstTokenP99(firstTokenP99: JsonField<Double>) = apply {
            this.firstTokenP99 = firstTokenP99
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

        fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

        @JsonProperty("tenant_id")
        @ExcludeMissing
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

        fun lastRunStartTime(lastRunStartTime: OffsetDateTime) =
            lastRunStartTime(JsonField.of(lastRunStartTime))

        @JsonProperty("last_run_start_time")
        @ExcludeMissing
        fun lastRunStartTime(lastRunStartTime: JsonField<OffsetDateTime>) = apply {
            this.lastRunStartTime = lastRunStartTime
        }

        fun lastRunStartTimeLive(lastRunStartTimeLive: OffsetDateTime) =
            lastRunStartTimeLive(JsonField.of(lastRunStartTimeLive))

        @JsonProperty("last_run_start_time_live")
        @ExcludeMissing
        fun lastRunStartTimeLive(lastRunStartTimeLive: JsonField<OffsetDateTime>) = apply {
            this.lastRunStartTimeLive = lastRunStartTimeLive
        }

        @JsonProperty("feedback_stats")
        @ExcludeMissing
        fun feedbackStats(feedbackStats: JsonValue) = apply { this.feedbackStats = feedbackStats }

        fun runFacets(runFacets: List<JsonValue>) = runFacets(JsonField.of(runFacets))

        @JsonProperty("run_facets")
        @ExcludeMissing
        fun runFacets(runFacets: JsonField<List<JsonValue>>) = apply { this.runFacets = runFacets }

        fun errorRate(errorRate: Double) = errorRate(JsonField.of(errorRate))

        @JsonProperty("error_rate")
        @ExcludeMissing
        fun errorRate(errorRate: JsonField<Double>) = apply { this.errorRate = errorRate }

        fun streamingRate(streamingRate: Double) = streamingRate(JsonField.of(streamingRate))

        @JsonProperty("streaming_rate")
        @ExcludeMissing
        fun streamingRate(streamingRate: JsonField<Double>) = apply {
            this.streamingRate = streamingRate
        }

        fun testRunNumber(testRunNumber: Long) = testRunNumber(JsonField.of(testRunNumber))

        @JsonProperty("test_run_number")
        @ExcludeMissing
        fun testRunNumber(testRunNumber: JsonField<Long>) = apply {
            this.testRunNumber = testRunNumber
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

        fun build(): TracerSession =
            TracerSession(
                startTime,
                endTime,
                extra,
                name,
                description,
                defaultDatasetId,
                referenceDatasetId,
                id,
                runCount,
                latencyP50,
                latencyP99,
                firstTokenP50,
                firstTokenP99,
                totalTokens,
                promptTokens,
                completionTokens,
                totalCost,
                promptCost,
                completionCost,
                tenantId,
                lastRunStartTime,
                lastRunStartTimeLive,
                feedbackStats,
                runFacets.map { it.toUnmodifiable() },
                errorRate,
                streamingRate,
                testRunNumber,
                additionalProperties.toUnmodifiable(),
            )
    }
}

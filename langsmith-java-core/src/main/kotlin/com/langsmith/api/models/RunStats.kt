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

@JsonDeserialize(builder = RunStats.Builder::class)
@NoAutoDetect
class RunStats
private constructor(
    private val runCount: JsonField<Long>,
    private val latencyP50: JsonField<Double>,
    private val latencyP99: JsonField<Double>,
    private val firstTokenP50: JsonField<Double>,
    private val firstTokenP99: JsonField<Double>,
    private val totalTokens: JsonField<Long>,
    private val promptTokens: JsonField<Long>,
    private val completionTokens: JsonField<Long>,
    private val medianTokens: JsonField<Long>,
    private val lastRunStartTime: JsonField<OffsetDateTime>,
    private val feedbackStats: JsonValue,
    private val runFacets: JsonField<List<JsonValue>>,
    private val errorRate: JsonField<Double>,
    private val streamingRate: JsonField<Double>,
    private val totalCost: JsonField<Double>,
    private val promptCost: JsonField<Double>,
    private val completionCost: JsonField<Double>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun runCount(): Long = runCount.getRequired("run_count")

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

    fun medianTokens(): Optional<Long> =
        Optional.ofNullable(medianTokens.getNullable("median_tokens"))

    fun lastRunStartTime(): Optional<OffsetDateTime> =
        Optional.ofNullable(lastRunStartTime.getNullable("last_run_start_time"))

    fun runFacets(): Optional<List<JsonValue>> =
        Optional.ofNullable(runFacets.getNullable("run_facets"))

    fun errorRate(): Optional<Double> = Optional.ofNullable(errorRate.getNullable("error_rate"))

    fun streamingRate(): Optional<Double> =
        Optional.ofNullable(streamingRate.getNullable("streaming_rate"))

    fun totalCost(): Optional<Double> = Optional.ofNullable(totalCost.getNullable("total_cost"))

    fun promptCost(): Optional<Double> = Optional.ofNullable(promptCost.getNullable("prompt_cost"))

    fun completionCost(): Optional<Double> =
        Optional.ofNullable(completionCost.getNullable("completion_cost"))

    @JsonProperty("run_count") @ExcludeMissing fun _runCount() = runCount

    @JsonProperty("latency_p50") @ExcludeMissing fun _latencyP50() = latencyP50

    @JsonProperty("latency_p99") @ExcludeMissing fun _latencyP99() = latencyP99

    @JsonProperty("first_token_p50") @ExcludeMissing fun _firstTokenP50() = firstTokenP50

    @JsonProperty("first_token_p99") @ExcludeMissing fun _firstTokenP99() = firstTokenP99

    @JsonProperty("total_tokens") @ExcludeMissing fun _totalTokens() = totalTokens

    @JsonProperty("prompt_tokens") @ExcludeMissing fun _promptTokens() = promptTokens

    @JsonProperty("completion_tokens") @ExcludeMissing fun _completionTokens() = completionTokens

    @JsonProperty("median_tokens") @ExcludeMissing fun _medianTokens() = medianTokens

    @JsonProperty("last_run_start_time") @ExcludeMissing fun _lastRunStartTime() = lastRunStartTime

    @JsonProperty("feedback_stats") @ExcludeMissing fun _feedbackStats() = feedbackStats

    @JsonProperty("run_facets") @ExcludeMissing fun _runFacets() = runFacets

    @JsonProperty("error_rate") @ExcludeMissing fun _errorRate() = errorRate

    @JsonProperty("streaming_rate") @ExcludeMissing fun _streamingRate() = streamingRate

    @JsonProperty("total_cost") @ExcludeMissing fun _totalCost() = totalCost

    @JsonProperty("prompt_cost") @ExcludeMissing fun _promptCost() = promptCost

    @JsonProperty("completion_cost") @ExcludeMissing fun _completionCost() = completionCost

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): RunStats = apply {
        if (!validated) {
            runCount()
            latencyP50()
            latencyP99()
            firstTokenP50()
            firstTokenP99()
            totalTokens()
            promptTokens()
            completionTokens()
            medianTokens()
            lastRunStartTime()
            runFacets()
            errorRate()
            streamingRate()
            totalCost()
            promptCost()
            completionCost()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunStats &&
            this.runCount == other.runCount &&
            this.latencyP50 == other.latencyP50 &&
            this.latencyP99 == other.latencyP99 &&
            this.firstTokenP50 == other.firstTokenP50 &&
            this.firstTokenP99 == other.firstTokenP99 &&
            this.totalTokens == other.totalTokens &&
            this.promptTokens == other.promptTokens &&
            this.completionTokens == other.completionTokens &&
            this.medianTokens == other.medianTokens &&
            this.lastRunStartTime == other.lastRunStartTime &&
            this.feedbackStats == other.feedbackStats &&
            this.runFacets == other.runFacets &&
            this.errorRate == other.errorRate &&
            this.streamingRate == other.streamingRate &&
            this.totalCost == other.totalCost &&
            this.promptCost == other.promptCost &&
            this.completionCost == other.completionCost &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    runCount,
                    latencyP50,
                    latencyP99,
                    firstTokenP50,
                    firstTokenP99,
                    totalTokens,
                    promptTokens,
                    completionTokens,
                    medianTokens,
                    lastRunStartTime,
                    feedbackStats,
                    runFacets,
                    errorRate,
                    streamingRate,
                    totalCost,
                    promptCost,
                    completionCost,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "RunStats{runCount=$runCount, latencyP50=$latencyP50, latencyP99=$latencyP99, firstTokenP50=$firstTokenP50, firstTokenP99=$firstTokenP99, totalTokens=$totalTokens, promptTokens=$promptTokens, completionTokens=$completionTokens, medianTokens=$medianTokens, lastRunStartTime=$lastRunStartTime, feedbackStats=$feedbackStats, runFacets=$runFacets, errorRate=$errorRate, streamingRate=$streamingRate, totalCost=$totalCost, promptCost=$promptCost, completionCost=$completionCost, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var runCount: JsonField<Long> = JsonMissing.of()
        private var latencyP50: JsonField<Double> = JsonMissing.of()
        private var latencyP99: JsonField<Double> = JsonMissing.of()
        private var firstTokenP50: JsonField<Double> = JsonMissing.of()
        private var firstTokenP99: JsonField<Double> = JsonMissing.of()
        private var totalTokens: JsonField<Long> = JsonMissing.of()
        private var promptTokens: JsonField<Long> = JsonMissing.of()
        private var completionTokens: JsonField<Long> = JsonMissing.of()
        private var medianTokens: JsonField<Long> = JsonMissing.of()
        private var lastRunStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var feedbackStats: JsonValue = JsonMissing.of()
        private var runFacets: JsonField<List<JsonValue>> = JsonMissing.of()
        private var errorRate: JsonField<Double> = JsonMissing.of()
        private var streamingRate: JsonField<Double> = JsonMissing.of()
        private var totalCost: JsonField<Double> = JsonMissing.of()
        private var promptCost: JsonField<Double> = JsonMissing.of()
        private var completionCost: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(runStats: RunStats) = apply {
            this.runCount = runStats.runCount
            this.latencyP50 = runStats.latencyP50
            this.latencyP99 = runStats.latencyP99
            this.firstTokenP50 = runStats.firstTokenP50
            this.firstTokenP99 = runStats.firstTokenP99
            this.totalTokens = runStats.totalTokens
            this.promptTokens = runStats.promptTokens
            this.completionTokens = runStats.completionTokens
            this.medianTokens = runStats.medianTokens
            this.lastRunStartTime = runStats.lastRunStartTime
            this.feedbackStats = runStats.feedbackStats
            this.runFacets = runStats.runFacets
            this.errorRate = runStats.errorRate
            this.streamingRate = runStats.streamingRate
            this.totalCost = runStats.totalCost
            this.promptCost = runStats.promptCost
            this.completionCost = runStats.completionCost
            additionalProperties(runStats.additionalProperties)
        }

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

        fun medianTokens(medianTokens: Long) = medianTokens(JsonField.of(medianTokens))

        @JsonProperty("median_tokens")
        @ExcludeMissing
        fun medianTokens(medianTokens: JsonField<Long>) = apply { this.medianTokens = medianTokens }

        fun lastRunStartTime(lastRunStartTime: OffsetDateTime) =
            lastRunStartTime(JsonField.of(lastRunStartTime))

        @JsonProperty("last_run_start_time")
        @ExcludeMissing
        fun lastRunStartTime(lastRunStartTime: JsonField<OffsetDateTime>) = apply {
            this.lastRunStartTime = lastRunStartTime
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

        fun build(): RunStats =
            RunStats(
                runCount,
                latencyP50,
                latencyP99,
                firstTokenP50,
                firstTokenP99,
                totalTokens,
                promptTokens,
                completionTokens,
                medianTokens,
                lastRunStartTime,
                feedbackStats,
                runFacets.map { it.toUnmodifiable() },
                errorRate,
                streamingRate,
                totalCost,
                promptCost,
                completionCost,
                additionalProperties.toUnmodifiable(),
            )
    }
}

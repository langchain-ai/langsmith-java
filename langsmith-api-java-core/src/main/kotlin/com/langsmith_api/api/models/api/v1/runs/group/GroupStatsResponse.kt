// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.runs.group

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langsmith_api.api.core.ExcludeMissing
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.core.JsonMissing
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.checkKnown
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.core.toImmutable
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class GroupStatsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val groupCount: JsonField<Long>,
    private val completionCost: JsonField<String>,
    private val completionCostDetails: JsonValue,
    private val completionTokenDetails: JsonValue,
    private val completionTokens: JsonField<Long>,
    private val completionTokensP50: JsonField<Long>,
    private val completionTokensP99: JsonField<Long>,
    private val costP50: JsonField<String>,
    private val costP99: JsonField<String>,
    private val errorRate: JsonField<Double>,
    private val feedbackStats: JsonValue,
    private val firstTokenP50: JsonField<Double>,
    private val firstTokenP99: JsonField<Double>,
    private val lastRunStartTime: JsonField<OffsetDateTime>,
    private val latencyP50: JsonField<Double>,
    private val latencyP99: JsonField<Double>,
    private val medianTokens: JsonField<Long>,
    private val promptCost: JsonField<String>,
    private val promptCostDetails: JsonValue,
    private val promptTokenDetails: JsonValue,
    private val promptTokens: JsonField<Long>,
    private val promptTokensP50: JsonField<Long>,
    private val promptTokensP99: JsonField<Long>,
    private val runCount: JsonField<Long>,
    private val runFacets: JsonField<List<JsonValue>>,
    private val streamingRate: JsonField<Double>,
    private val tokensP99: JsonField<Long>,
    private val totalCost: JsonField<String>,
    private val totalTokens: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("group_count") @ExcludeMissing groupCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("completion_cost")
        @ExcludeMissing
        completionCost: JsonField<String> = JsonMissing.of(),
        @JsonProperty("completion_cost_details")
        @ExcludeMissing
        completionCostDetails: JsonValue = JsonMissing.of(),
        @JsonProperty("completion_token_details")
        @ExcludeMissing
        completionTokenDetails: JsonValue = JsonMissing.of(),
        @JsonProperty("completion_tokens")
        @ExcludeMissing
        completionTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("completion_tokens_p50")
        @ExcludeMissing
        completionTokensP50: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("completion_tokens_p99")
        @ExcludeMissing
        completionTokensP99: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("cost_p50") @ExcludeMissing costP50: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cost_p99") @ExcludeMissing costP99: JsonField<String> = JsonMissing.of(),
        @JsonProperty("error_rate") @ExcludeMissing errorRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("feedback_stats") @ExcludeMissing feedbackStats: JsonValue = JsonMissing.of(),
        @JsonProperty("first_token_p50")
        @ExcludeMissing
        firstTokenP50: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("first_token_p99")
        @ExcludeMissing
        firstTokenP99: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("last_run_start_time")
        @ExcludeMissing
        lastRunStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("latency_p50")
        @ExcludeMissing
        latencyP50: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("latency_p99")
        @ExcludeMissing
        latencyP99: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("median_tokens")
        @ExcludeMissing
        medianTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("prompt_cost")
        @ExcludeMissing
        promptCost: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prompt_cost_details")
        @ExcludeMissing
        promptCostDetails: JsonValue = JsonMissing.of(),
        @JsonProperty("prompt_token_details")
        @ExcludeMissing
        promptTokenDetails: JsonValue = JsonMissing.of(),
        @JsonProperty("prompt_tokens")
        @ExcludeMissing
        promptTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("prompt_tokens_p50")
        @ExcludeMissing
        promptTokensP50: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("prompt_tokens_p99")
        @ExcludeMissing
        promptTokensP99: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("run_count") @ExcludeMissing runCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("run_facets")
        @ExcludeMissing
        runFacets: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonProperty("streaming_rate")
        @ExcludeMissing
        streamingRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tokens_p99") @ExcludeMissing tokensP99: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("total_cost") @ExcludeMissing totalCost: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_tokens")
        @ExcludeMissing
        totalTokens: JsonField<Long> = JsonMissing.of(),
    ) : this(
        groupCount,
        completionCost,
        completionCostDetails,
        completionTokenDetails,
        completionTokens,
        completionTokensP50,
        completionTokensP99,
        costP50,
        costP99,
        errorRate,
        feedbackStats,
        firstTokenP50,
        firstTokenP99,
        lastRunStartTime,
        latencyP50,
        latencyP99,
        medianTokens,
        promptCost,
        promptCostDetails,
        promptTokenDetails,
        promptTokens,
        promptTokensP50,
        promptTokensP99,
        runCount,
        runFacets,
        streamingRate,
        tokensP99,
        totalCost,
        totalTokens,
        mutableMapOf(),
    )

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun groupCount(): Long = groupCount.getRequired("group_count")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun completionCost(): Optional<String> = completionCost.getOptional("completion_cost")

    @JsonProperty("completion_cost_details")
    @ExcludeMissing
    fun _completionCostDetails(): JsonValue = completionCostDetails

    @JsonProperty("completion_token_details")
    @ExcludeMissing
    fun _completionTokenDetails(): JsonValue = completionTokenDetails

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun completionTokens(): Optional<Long> = completionTokens.getOptional("completion_tokens")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun completionTokensP50(): Optional<Long> =
        completionTokensP50.getOptional("completion_tokens_p50")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun completionTokensP99(): Optional<Long> =
        completionTokensP99.getOptional("completion_tokens_p99")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun costP50(): Optional<String> = costP50.getOptional("cost_p50")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun costP99(): Optional<String> = costP99.getOptional("cost_p99")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun errorRate(): Optional<Double> = errorRate.getOptional("error_rate")

    @JsonProperty("feedback_stats") @ExcludeMissing fun _feedbackStats(): JsonValue = feedbackStats

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun firstTokenP50(): Optional<Double> = firstTokenP50.getOptional("first_token_p50")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun firstTokenP99(): Optional<Double> = firstTokenP99.getOptional("first_token_p99")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun lastRunStartTime(): Optional<OffsetDateTime> =
        lastRunStartTime.getOptional("last_run_start_time")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun latencyP50(): Optional<Double> = latencyP50.getOptional("latency_p50")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun latencyP99(): Optional<Double> = latencyP99.getOptional("latency_p99")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun medianTokens(): Optional<Long> = medianTokens.getOptional("median_tokens")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun promptCost(): Optional<String> = promptCost.getOptional("prompt_cost")

    @JsonProperty("prompt_cost_details")
    @ExcludeMissing
    fun _promptCostDetails(): JsonValue = promptCostDetails

    @JsonProperty("prompt_token_details")
    @ExcludeMissing
    fun _promptTokenDetails(): JsonValue = promptTokenDetails

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun promptTokens(): Optional<Long> = promptTokens.getOptional("prompt_tokens")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun promptTokensP50(): Optional<Long> = promptTokensP50.getOptional("prompt_tokens_p50")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun promptTokensP99(): Optional<Long> = promptTokensP99.getOptional("prompt_tokens_p99")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun runCount(): Optional<Long> = runCount.getOptional("run_count")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun runFacets(): Optional<List<JsonValue>> = runFacets.getOptional("run_facets")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun streamingRate(): Optional<Double> = streamingRate.getOptional("streaming_rate")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tokensP99(): Optional<Long> = tokensP99.getOptional("tokens_p99")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun totalCost(): Optional<String> = totalCost.getOptional("total_cost")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun totalTokens(): Optional<Long> = totalTokens.getOptional("total_tokens")

    /**
     * Returns the raw JSON value of [groupCount].
     *
     * Unlike [groupCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("group_count") @ExcludeMissing fun _groupCount(): JsonField<Long> = groupCount

    /**
     * Returns the raw JSON value of [completionCost].
     *
     * Unlike [completionCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("completion_cost")
    @ExcludeMissing
    fun _completionCost(): JsonField<String> = completionCost

    /**
     * Returns the raw JSON value of [completionTokens].
     *
     * Unlike [completionTokens], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("completion_tokens")
    @ExcludeMissing
    fun _completionTokens(): JsonField<Long> = completionTokens

    /**
     * Returns the raw JSON value of [completionTokensP50].
     *
     * Unlike [completionTokensP50], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("completion_tokens_p50")
    @ExcludeMissing
    fun _completionTokensP50(): JsonField<Long> = completionTokensP50

    /**
     * Returns the raw JSON value of [completionTokensP99].
     *
     * Unlike [completionTokensP99], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("completion_tokens_p99")
    @ExcludeMissing
    fun _completionTokensP99(): JsonField<Long> = completionTokensP99

    /**
     * Returns the raw JSON value of [costP50].
     *
     * Unlike [costP50], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cost_p50") @ExcludeMissing fun _costP50(): JsonField<String> = costP50

    /**
     * Returns the raw JSON value of [costP99].
     *
     * Unlike [costP99], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cost_p99") @ExcludeMissing fun _costP99(): JsonField<String> = costP99

    /**
     * Returns the raw JSON value of [errorRate].
     *
     * Unlike [errorRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error_rate") @ExcludeMissing fun _errorRate(): JsonField<Double> = errorRate

    /**
     * Returns the raw JSON value of [firstTokenP50].
     *
     * Unlike [firstTokenP50], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("first_token_p50")
    @ExcludeMissing
    fun _firstTokenP50(): JsonField<Double> = firstTokenP50

    /**
     * Returns the raw JSON value of [firstTokenP99].
     *
     * Unlike [firstTokenP99], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("first_token_p99")
    @ExcludeMissing
    fun _firstTokenP99(): JsonField<Double> = firstTokenP99

    /**
     * Returns the raw JSON value of [lastRunStartTime].
     *
     * Unlike [lastRunStartTime], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("last_run_start_time")
    @ExcludeMissing
    fun _lastRunStartTime(): JsonField<OffsetDateTime> = lastRunStartTime

    /**
     * Returns the raw JSON value of [latencyP50].
     *
     * Unlike [latencyP50], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("latency_p50") @ExcludeMissing fun _latencyP50(): JsonField<Double> = latencyP50

    /**
     * Returns the raw JSON value of [latencyP99].
     *
     * Unlike [latencyP99], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("latency_p99") @ExcludeMissing fun _latencyP99(): JsonField<Double> = latencyP99

    /**
     * Returns the raw JSON value of [medianTokens].
     *
     * Unlike [medianTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("median_tokens")
    @ExcludeMissing
    fun _medianTokens(): JsonField<Long> = medianTokens

    /**
     * Returns the raw JSON value of [promptCost].
     *
     * Unlike [promptCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prompt_cost") @ExcludeMissing fun _promptCost(): JsonField<String> = promptCost

    /**
     * Returns the raw JSON value of [promptTokens].
     *
     * Unlike [promptTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prompt_tokens")
    @ExcludeMissing
    fun _promptTokens(): JsonField<Long> = promptTokens

    /**
     * Returns the raw JSON value of [promptTokensP50].
     *
     * Unlike [promptTokensP50], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prompt_tokens_p50")
    @ExcludeMissing
    fun _promptTokensP50(): JsonField<Long> = promptTokensP50

    /**
     * Returns the raw JSON value of [promptTokensP99].
     *
     * Unlike [promptTokensP99], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prompt_tokens_p99")
    @ExcludeMissing
    fun _promptTokensP99(): JsonField<Long> = promptTokensP99

    /**
     * Returns the raw JSON value of [runCount].
     *
     * Unlike [runCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("run_count") @ExcludeMissing fun _runCount(): JsonField<Long> = runCount

    /**
     * Returns the raw JSON value of [runFacets].
     *
     * Unlike [runFacets], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("run_facets")
    @ExcludeMissing
    fun _runFacets(): JsonField<List<JsonValue>> = runFacets

    /**
     * Returns the raw JSON value of [streamingRate].
     *
     * Unlike [streamingRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("streaming_rate")
    @ExcludeMissing
    fun _streamingRate(): JsonField<Double> = streamingRate

    /**
     * Returns the raw JSON value of [tokensP99].
     *
     * Unlike [tokensP99], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tokens_p99") @ExcludeMissing fun _tokensP99(): JsonField<Long> = tokensP99

    /**
     * Returns the raw JSON value of [totalCost].
     *
     * Unlike [totalCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_cost") @ExcludeMissing fun _totalCost(): JsonField<String> = totalCost

    /**
     * Returns the raw JSON value of [totalTokens].
     *
     * Unlike [totalTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_tokens") @ExcludeMissing fun _totalTokens(): JsonField<Long> = totalTokens

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [GroupStatsResponse].
         *
         * The following fields are required:
         * ```java
         * .groupCount()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GroupStatsResponse]. */
    class Builder internal constructor() {

        private var groupCount: JsonField<Long>? = null
        private var completionCost: JsonField<String> = JsonMissing.of()
        private var completionCostDetails: JsonValue = JsonMissing.of()
        private var completionTokenDetails: JsonValue = JsonMissing.of()
        private var completionTokens: JsonField<Long> = JsonMissing.of()
        private var completionTokensP50: JsonField<Long> = JsonMissing.of()
        private var completionTokensP99: JsonField<Long> = JsonMissing.of()
        private var costP50: JsonField<String> = JsonMissing.of()
        private var costP99: JsonField<String> = JsonMissing.of()
        private var errorRate: JsonField<Double> = JsonMissing.of()
        private var feedbackStats: JsonValue = JsonMissing.of()
        private var firstTokenP50: JsonField<Double> = JsonMissing.of()
        private var firstTokenP99: JsonField<Double> = JsonMissing.of()
        private var lastRunStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var latencyP50: JsonField<Double> = JsonMissing.of()
        private var latencyP99: JsonField<Double> = JsonMissing.of()
        private var medianTokens: JsonField<Long> = JsonMissing.of()
        private var promptCost: JsonField<String> = JsonMissing.of()
        private var promptCostDetails: JsonValue = JsonMissing.of()
        private var promptTokenDetails: JsonValue = JsonMissing.of()
        private var promptTokens: JsonField<Long> = JsonMissing.of()
        private var promptTokensP50: JsonField<Long> = JsonMissing.of()
        private var promptTokensP99: JsonField<Long> = JsonMissing.of()
        private var runCount: JsonField<Long> = JsonMissing.of()
        private var runFacets: JsonField<MutableList<JsonValue>>? = null
        private var streamingRate: JsonField<Double> = JsonMissing.of()
        private var tokensP99: JsonField<Long> = JsonMissing.of()
        private var totalCost: JsonField<String> = JsonMissing.of()
        private var totalTokens: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(groupStatsResponse: GroupStatsResponse) = apply {
            groupCount = groupStatsResponse.groupCount
            completionCost = groupStatsResponse.completionCost
            completionCostDetails = groupStatsResponse.completionCostDetails
            completionTokenDetails = groupStatsResponse.completionTokenDetails
            completionTokens = groupStatsResponse.completionTokens
            completionTokensP50 = groupStatsResponse.completionTokensP50
            completionTokensP99 = groupStatsResponse.completionTokensP99
            costP50 = groupStatsResponse.costP50
            costP99 = groupStatsResponse.costP99
            errorRate = groupStatsResponse.errorRate
            feedbackStats = groupStatsResponse.feedbackStats
            firstTokenP50 = groupStatsResponse.firstTokenP50
            firstTokenP99 = groupStatsResponse.firstTokenP99
            lastRunStartTime = groupStatsResponse.lastRunStartTime
            latencyP50 = groupStatsResponse.latencyP50
            latencyP99 = groupStatsResponse.latencyP99
            medianTokens = groupStatsResponse.medianTokens
            promptCost = groupStatsResponse.promptCost
            promptCostDetails = groupStatsResponse.promptCostDetails
            promptTokenDetails = groupStatsResponse.promptTokenDetails
            promptTokens = groupStatsResponse.promptTokens
            promptTokensP50 = groupStatsResponse.promptTokensP50
            promptTokensP99 = groupStatsResponse.promptTokensP99
            runCount = groupStatsResponse.runCount
            runFacets = groupStatsResponse.runFacets.map { it.toMutableList() }
            streamingRate = groupStatsResponse.streamingRate
            tokensP99 = groupStatsResponse.tokensP99
            totalCost = groupStatsResponse.totalCost
            totalTokens = groupStatsResponse.totalTokens
            additionalProperties = groupStatsResponse.additionalProperties.toMutableMap()
        }

        fun groupCount(groupCount: Long) = groupCount(JsonField.of(groupCount))

        /**
         * Sets [Builder.groupCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun groupCount(groupCount: JsonField<Long>) = apply { this.groupCount = groupCount }

        fun completionCost(completionCost: String?) =
            completionCost(JsonField.ofNullable(completionCost))

        /** Alias for calling [Builder.completionCost] with `completionCost.orElse(null)`. */
        fun completionCost(completionCost: Optional<String>) =
            completionCost(completionCost.getOrNull())

        /**
         * Sets [Builder.completionCost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completionCost] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun completionCost(completionCost: JsonField<String>) = apply {
            this.completionCost = completionCost
        }

        fun completionCostDetails(completionCostDetails: JsonValue) = apply {
            this.completionCostDetails = completionCostDetails
        }

        fun completionTokenDetails(completionTokenDetails: JsonValue) = apply {
            this.completionTokenDetails = completionTokenDetails
        }

        fun completionTokens(completionTokens: Long?) =
            completionTokens(JsonField.ofNullable(completionTokens))

        /**
         * Alias for [Builder.completionTokens].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun completionTokens(completionTokens: Long) = completionTokens(completionTokens as Long?)

        /** Alias for calling [Builder.completionTokens] with `completionTokens.orElse(null)`. */
        fun completionTokens(completionTokens: Optional<Long>) =
            completionTokens(completionTokens.getOrNull())

        /**
         * Sets [Builder.completionTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completionTokens] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun completionTokens(completionTokens: JsonField<Long>) = apply {
            this.completionTokens = completionTokens
        }

        fun completionTokensP50(completionTokensP50: Long?) =
            completionTokensP50(JsonField.ofNullable(completionTokensP50))

        /**
         * Alias for [Builder.completionTokensP50].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun completionTokensP50(completionTokensP50: Long) =
            completionTokensP50(completionTokensP50 as Long?)

        /**
         * Alias for calling [Builder.completionTokensP50] with `completionTokensP50.orElse(null)`.
         */
        fun completionTokensP50(completionTokensP50: Optional<Long>) =
            completionTokensP50(completionTokensP50.getOrNull())

        /**
         * Sets [Builder.completionTokensP50] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completionTokensP50] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun completionTokensP50(completionTokensP50: JsonField<Long>) = apply {
            this.completionTokensP50 = completionTokensP50
        }

        fun completionTokensP99(completionTokensP99: Long?) =
            completionTokensP99(JsonField.ofNullable(completionTokensP99))

        /**
         * Alias for [Builder.completionTokensP99].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun completionTokensP99(completionTokensP99: Long) =
            completionTokensP99(completionTokensP99 as Long?)

        /**
         * Alias for calling [Builder.completionTokensP99] with `completionTokensP99.orElse(null)`.
         */
        fun completionTokensP99(completionTokensP99: Optional<Long>) =
            completionTokensP99(completionTokensP99.getOrNull())

        /**
         * Sets [Builder.completionTokensP99] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completionTokensP99] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun completionTokensP99(completionTokensP99: JsonField<Long>) = apply {
            this.completionTokensP99 = completionTokensP99
        }

        fun costP50(costP50: String?) = costP50(JsonField.ofNullable(costP50))

        /** Alias for calling [Builder.costP50] with `costP50.orElse(null)`. */
        fun costP50(costP50: Optional<String>) = costP50(costP50.getOrNull())

        /**
         * Sets [Builder.costP50] to an arbitrary JSON value.
         *
         * You should usually call [Builder.costP50] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun costP50(costP50: JsonField<String>) = apply { this.costP50 = costP50 }

        fun costP99(costP99: String?) = costP99(JsonField.ofNullable(costP99))

        /** Alias for calling [Builder.costP99] with `costP99.orElse(null)`. */
        fun costP99(costP99: Optional<String>) = costP99(costP99.getOrNull())

        /**
         * Sets [Builder.costP99] to an arbitrary JSON value.
         *
         * You should usually call [Builder.costP99] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun costP99(costP99: JsonField<String>) = apply { this.costP99 = costP99 }

        fun errorRate(errorRate: Double?) = errorRate(JsonField.ofNullable(errorRate))

        /**
         * Alias for [Builder.errorRate].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun errorRate(errorRate: Double) = errorRate(errorRate as Double?)

        /** Alias for calling [Builder.errorRate] with `errorRate.orElse(null)`. */
        fun errorRate(errorRate: Optional<Double>) = errorRate(errorRate.getOrNull())

        /**
         * Sets [Builder.errorRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorRate] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errorRate(errorRate: JsonField<Double>) = apply { this.errorRate = errorRate }

        fun feedbackStats(feedbackStats: JsonValue) = apply { this.feedbackStats = feedbackStats }

        fun firstTokenP50(firstTokenP50: Double?) =
            firstTokenP50(JsonField.ofNullable(firstTokenP50))

        /**
         * Alias for [Builder.firstTokenP50].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun firstTokenP50(firstTokenP50: Double) = firstTokenP50(firstTokenP50 as Double?)

        /** Alias for calling [Builder.firstTokenP50] with `firstTokenP50.orElse(null)`. */
        fun firstTokenP50(firstTokenP50: Optional<Double>) =
            firstTokenP50(firstTokenP50.getOrNull())

        /**
         * Sets [Builder.firstTokenP50] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstTokenP50] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstTokenP50(firstTokenP50: JsonField<Double>) = apply {
            this.firstTokenP50 = firstTokenP50
        }

        fun firstTokenP99(firstTokenP99: Double?) =
            firstTokenP99(JsonField.ofNullable(firstTokenP99))

        /**
         * Alias for [Builder.firstTokenP99].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun firstTokenP99(firstTokenP99: Double) = firstTokenP99(firstTokenP99 as Double?)

        /** Alias for calling [Builder.firstTokenP99] with `firstTokenP99.orElse(null)`. */
        fun firstTokenP99(firstTokenP99: Optional<Double>) =
            firstTokenP99(firstTokenP99.getOrNull())

        /**
         * Sets [Builder.firstTokenP99] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstTokenP99] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstTokenP99(firstTokenP99: JsonField<Double>) = apply {
            this.firstTokenP99 = firstTokenP99
        }

        fun lastRunStartTime(lastRunStartTime: OffsetDateTime?) =
            lastRunStartTime(JsonField.ofNullable(lastRunStartTime))

        /** Alias for calling [Builder.lastRunStartTime] with `lastRunStartTime.orElse(null)`. */
        fun lastRunStartTime(lastRunStartTime: Optional<OffsetDateTime>) =
            lastRunStartTime(lastRunStartTime.getOrNull())

        /**
         * Sets [Builder.lastRunStartTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastRunStartTime] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun lastRunStartTime(lastRunStartTime: JsonField<OffsetDateTime>) = apply {
            this.lastRunStartTime = lastRunStartTime
        }

        fun latencyP50(latencyP50: Double?) = latencyP50(JsonField.ofNullable(latencyP50))

        /**
         * Alias for [Builder.latencyP50].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun latencyP50(latencyP50: Double) = latencyP50(latencyP50 as Double?)

        /** Alias for calling [Builder.latencyP50] with `latencyP50.orElse(null)`. */
        fun latencyP50(latencyP50: Optional<Double>) = latencyP50(latencyP50.getOrNull())

        /**
         * Sets [Builder.latencyP50] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latencyP50] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun latencyP50(latencyP50: JsonField<Double>) = apply { this.latencyP50 = latencyP50 }

        fun latencyP99(latencyP99: Double?) = latencyP99(JsonField.ofNullable(latencyP99))

        /**
         * Alias for [Builder.latencyP99].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun latencyP99(latencyP99: Double) = latencyP99(latencyP99 as Double?)

        /** Alias for calling [Builder.latencyP99] with `latencyP99.orElse(null)`. */
        fun latencyP99(latencyP99: Optional<Double>) = latencyP99(latencyP99.getOrNull())

        /**
         * Sets [Builder.latencyP99] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latencyP99] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun latencyP99(latencyP99: JsonField<Double>) = apply { this.latencyP99 = latencyP99 }

        fun medianTokens(medianTokens: Long?) = medianTokens(JsonField.ofNullable(medianTokens))

        /**
         * Alias for [Builder.medianTokens].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun medianTokens(medianTokens: Long) = medianTokens(medianTokens as Long?)

        /** Alias for calling [Builder.medianTokens] with `medianTokens.orElse(null)`. */
        fun medianTokens(medianTokens: Optional<Long>) = medianTokens(medianTokens.getOrNull())

        /**
         * Sets [Builder.medianTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.medianTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun medianTokens(medianTokens: JsonField<Long>) = apply { this.medianTokens = medianTokens }

        fun promptCost(promptCost: String?) = promptCost(JsonField.ofNullable(promptCost))

        /** Alias for calling [Builder.promptCost] with `promptCost.orElse(null)`. */
        fun promptCost(promptCost: Optional<String>) = promptCost(promptCost.getOrNull())

        /**
         * Sets [Builder.promptCost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promptCost] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun promptCost(promptCost: JsonField<String>) = apply { this.promptCost = promptCost }

        fun promptCostDetails(promptCostDetails: JsonValue) = apply {
            this.promptCostDetails = promptCostDetails
        }

        fun promptTokenDetails(promptTokenDetails: JsonValue) = apply {
            this.promptTokenDetails = promptTokenDetails
        }

        fun promptTokens(promptTokens: Long?) = promptTokens(JsonField.ofNullable(promptTokens))

        /**
         * Alias for [Builder.promptTokens].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun promptTokens(promptTokens: Long) = promptTokens(promptTokens as Long?)

        /** Alias for calling [Builder.promptTokens] with `promptTokens.orElse(null)`. */
        fun promptTokens(promptTokens: Optional<Long>) = promptTokens(promptTokens.getOrNull())

        /**
         * Sets [Builder.promptTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promptTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun promptTokens(promptTokens: JsonField<Long>) = apply { this.promptTokens = promptTokens }

        fun promptTokensP50(promptTokensP50: Long?) =
            promptTokensP50(JsonField.ofNullable(promptTokensP50))

        /**
         * Alias for [Builder.promptTokensP50].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun promptTokensP50(promptTokensP50: Long) = promptTokensP50(promptTokensP50 as Long?)

        /** Alias for calling [Builder.promptTokensP50] with `promptTokensP50.orElse(null)`. */
        fun promptTokensP50(promptTokensP50: Optional<Long>) =
            promptTokensP50(promptTokensP50.getOrNull())

        /**
         * Sets [Builder.promptTokensP50] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promptTokensP50] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun promptTokensP50(promptTokensP50: JsonField<Long>) = apply {
            this.promptTokensP50 = promptTokensP50
        }

        fun promptTokensP99(promptTokensP99: Long?) =
            promptTokensP99(JsonField.ofNullable(promptTokensP99))

        /**
         * Alias for [Builder.promptTokensP99].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun promptTokensP99(promptTokensP99: Long) = promptTokensP99(promptTokensP99 as Long?)

        /** Alias for calling [Builder.promptTokensP99] with `promptTokensP99.orElse(null)`. */
        fun promptTokensP99(promptTokensP99: Optional<Long>) =
            promptTokensP99(promptTokensP99.getOrNull())

        /**
         * Sets [Builder.promptTokensP99] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promptTokensP99] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun promptTokensP99(promptTokensP99: JsonField<Long>) = apply {
            this.promptTokensP99 = promptTokensP99
        }

        fun runCount(runCount: Long?) = runCount(JsonField.ofNullable(runCount))

        /**
         * Alias for [Builder.runCount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun runCount(runCount: Long) = runCount(runCount as Long?)

        /** Alias for calling [Builder.runCount] with `runCount.orElse(null)`. */
        fun runCount(runCount: Optional<Long>) = runCount(runCount.getOrNull())

        /**
         * Sets [Builder.runCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun runCount(runCount: JsonField<Long>) = apply { this.runCount = runCount }

        fun runFacets(runFacets: List<JsonValue>?) = runFacets(JsonField.ofNullable(runFacets))

        /** Alias for calling [Builder.runFacets] with `runFacets.orElse(null)`. */
        fun runFacets(runFacets: Optional<List<JsonValue>>) = runFacets(runFacets.getOrNull())

        /**
         * Sets [Builder.runFacets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runFacets] with a well-typed `List<JsonValue>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun runFacets(runFacets: JsonField<List<JsonValue>>) = apply {
            this.runFacets = runFacets.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonValue] to [runFacets].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRunFacet(runFacet: JsonValue) = apply {
            runFacets =
                (runFacets ?: JsonField.of(mutableListOf())).also {
                    checkKnown("runFacets", it).add(runFacet)
                }
        }

        fun streamingRate(streamingRate: Double?) =
            streamingRate(JsonField.ofNullable(streamingRate))

        /**
         * Alias for [Builder.streamingRate].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun streamingRate(streamingRate: Double) = streamingRate(streamingRate as Double?)

        /** Alias for calling [Builder.streamingRate] with `streamingRate.orElse(null)`. */
        fun streamingRate(streamingRate: Optional<Double>) =
            streamingRate(streamingRate.getOrNull())

        /**
         * Sets [Builder.streamingRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.streamingRate] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun streamingRate(streamingRate: JsonField<Double>) = apply {
            this.streamingRate = streamingRate
        }

        fun tokensP99(tokensP99: Long?) = tokensP99(JsonField.ofNullable(tokensP99))

        /**
         * Alias for [Builder.tokensP99].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun tokensP99(tokensP99: Long) = tokensP99(tokensP99 as Long?)

        /** Alias for calling [Builder.tokensP99] with `tokensP99.orElse(null)`. */
        fun tokensP99(tokensP99: Optional<Long>) = tokensP99(tokensP99.getOrNull())

        /**
         * Sets [Builder.tokensP99] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokensP99] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tokensP99(tokensP99: JsonField<Long>) = apply { this.tokensP99 = tokensP99 }

        fun totalCost(totalCost: String?) = totalCost(JsonField.ofNullable(totalCost))

        /** Alias for calling [Builder.totalCost] with `totalCost.orElse(null)`. */
        fun totalCost(totalCost: Optional<String>) = totalCost(totalCost.getOrNull())

        /**
         * Sets [Builder.totalCost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalCost] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalCost(totalCost: JsonField<String>) = apply { this.totalCost = totalCost }

        fun totalTokens(totalTokens: Long?) = totalTokens(JsonField.ofNullable(totalTokens))

        /**
         * Alias for [Builder.totalTokens].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun totalTokens(totalTokens: Long) = totalTokens(totalTokens as Long?)

        /** Alias for calling [Builder.totalTokens] with `totalTokens.orElse(null)`. */
        fun totalTokens(totalTokens: Optional<Long>) = totalTokens(totalTokens.getOrNull())

        /**
         * Sets [Builder.totalTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalTokens(totalTokens: JsonField<Long>) = apply { this.totalTokens = totalTokens }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [GroupStatsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .groupCount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): GroupStatsResponse =
            GroupStatsResponse(
                checkRequired("groupCount", groupCount),
                completionCost,
                completionCostDetails,
                completionTokenDetails,
                completionTokens,
                completionTokensP50,
                completionTokensP99,
                costP50,
                costP99,
                errorRate,
                feedbackStats,
                firstTokenP50,
                firstTokenP99,
                lastRunStartTime,
                latencyP50,
                latencyP99,
                medianTokens,
                promptCost,
                promptCostDetails,
                promptTokenDetails,
                promptTokens,
                promptTokensP50,
                promptTokensP99,
                runCount,
                (runFacets ?: JsonMissing.of()).map { it.toImmutable() },
                streamingRate,
                tokensP99,
                totalCost,
                totalTokens,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): GroupStatsResponse = apply {
        if (validated) {
            return@apply
        }

        groupCount()
        completionCost()
        completionTokens()
        completionTokensP50()
        completionTokensP99()
        costP50()
        costP99()
        errorRate()
        firstTokenP50()
        firstTokenP99()
        lastRunStartTime()
        latencyP50()
        latencyP99()
        medianTokens()
        promptCost()
        promptTokens()
        promptTokensP50()
        promptTokensP99()
        runCount()
        runFacets()
        streamingRate()
        tokensP99()
        totalCost()
        totalTokens()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LangsmithApiInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (groupCount.asKnown().isPresent) 1 else 0) +
            (if (completionCost.asKnown().isPresent) 1 else 0) +
            (if (completionTokens.asKnown().isPresent) 1 else 0) +
            (if (completionTokensP50.asKnown().isPresent) 1 else 0) +
            (if (completionTokensP99.asKnown().isPresent) 1 else 0) +
            (if (costP50.asKnown().isPresent) 1 else 0) +
            (if (costP99.asKnown().isPresent) 1 else 0) +
            (if (errorRate.asKnown().isPresent) 1 else 0) +
            (if (firstTokenP50.asKnown().isPresent) 1 else 0) +
            (if (firstTokenP99.asKnown().isPresent) 1 else 0) +
            (if (lastRunStartTime.asKnown().isPresent) 1 else 0) +
            (if (latencyP50.asKnown().isPresent) 1 else 0) +
            (if (latencyP99.asKnown().isPresent) 1 else 0) +
            (if (medianTokens.asKnown().isPresent) 1 else 0) +
            (if (promptCost.asKnown().isPresent) 1 else 0) +
            (if (promptTokens.asKnown().isPresent) 1 else 0) +
            (if (promptTokensP50.asKnown().isPresent) 1 else 0) +
            (if (promptTokensP99.asKnown().isPresent) 1 else 0) +
            (if (runCount.asKnown().isPresent) 1 else 0) +
            (runFacets.asKnown().getOrNull()?.size ?: 0) +
            (if (streamingRate.asKnown().isPresent) 1 else 0) +
            (if (tokensP99.asKnown().isPresent) 1 else 0) +
            (if (totalCost.asKnown().isPresent) 1 else 0) +
            (if (totalTokens.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GroupStatsResponse &&
            groupCount == other.groupCount &&
            completionCost == other.completionCost &&
            completionCostDetails == other.completionCostDetails &&
            completionTokenDetails == other.completionTokenDetails &&
            completionTokens == other.completionTokens &&
            completionTokensP50 == other.completionTokensP50 &&
            completionTokensP99 == other.completionTokensP99 &&
            costP50 == other.costP50 &&
            costP99 == other.costP99 &&
            errorRate == other.errorRate &&
            feedbackStats == other.feedbackStats &&
            firstTokenP50 == other.firstTokenP50 &&
            firstTokenP99 == other.firstTokenP99 &&
            lastRunStartTime == other.lastRunStartTime &&
            latencyP50 == other.latencyP50 &&
            latencyP99 == other.latencyP99 &&
            medianTokens == other.medianTokens &&
            promptCost == other.promptCost &&
            promptCostDetails == other.promptCostDetails &&
            promptTokenDetails == other.promptTokenDetails &&
            promptTokens == other.promptTokens &&
            promptTokensP50 == other.promptTokensP50 &&
            promptTokensP99 == other.promptTokensP99 &&
            runCount == other.runCount &&
            runFacets == other.runFacets &&
            streamingRate == other.streamingRate &&
            tokensP99 == other.tokensP99 &&
            totalCost == other.totalCost &&
            totalTokens == other.totalTokens &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            groupCount,
            completionCost,
            completionCostDetails,
            completionTokenDetails,
            completionTokens,
            completionTokensP50,
            completionTokensP99,
            costP50,
            costP99,
            errorRate,
            feedbackStats,
            firstTokenP50,
            firstTokenP99,
            lastRunStartTime,
            latencyP50,
            latencyP99,
            medianTokens,
            promptCost,
            promptCostDetails,
            promptTokenDetails,
            promptTokens,
            promptTokensP50,
            promptTokensP99,
            runCount,
            runFacets,
            streamingRate,
            tokensP99,
            totalCost,
            totalTokens,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GroupStatsResponse{groupCount=$groupCount, completionCost=$completionCost, completionCostDetails=$completionCostDetails, completionTokenDetails=$completionTokenDetails, completionTokens=$completionTokens, completionTokensP50=$completionTokensP50, completionTokensP99=$completionTokensP99, costP50=$costP50, costP99=$costP99, errorRate=$errorRate, feedbackStats=$feedbackStats, firstTokenP50=$firstTokenP50, firstTokenP99=$firstTokenP99, lastRunStartTime=$lastRunStartTime, latencyP50=$latencyP50, latencyP99=$latencyP99, medianTokens=$medianTokens, promptCost=$promptCost, promptCostDetails=$promptCostDetails, promptTokenDetails=$promptTokenDetails, promptTokens=$promptTokens, promptTokensP50=$promptTokensP50, promptTokensP99=$promptTokensP99, runCount=$runCount, runFacets=$runFacets, streamingRate=$streamingRate, tokensP99=$tokensP99, totalCost=$totalCost, totalTokens=$totalTokens, additionalProperties=$additionalProperties}"
}

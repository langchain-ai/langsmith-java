// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.threads

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ThreadStatsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val completionCost: JsonField<Double>,
    private val completionCostDetails: JsonField<CompletionCostDetails>,
    private val completionTokenDetails: JsonField<CompletionTokenDetails>,
    private val completionTokens: JsonField<Long>,
    private val feedbackStats: JsonField<FeedbackStats>,
    private val firstStartTime: JsonField<OffsetDateTime>,
    private val lastEndTime: JsonField<OffsetDateTime>,
    private val lastStartTime: JsonField<OffsetDateTime>,
    private val latencyP50Seconds: JsonField<Double>,
    private val latencyP99Seconds: JsonField<Double>,
    private val promptCost: JsonField<Double>,
    private val promptCostDetails: JsonField<PromptCostDetails>,
    private val promptTokenDetails: JsonField<PromptTokenDetails>,
    private val promptTokens: JsonField<Long>,
    private val totalCost: JsonField<Double>,
    private val totalTokens: JsonField<Long>,
    private val turns: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("completion_cost")
        @ExcludeMissing
        completionCost: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("completion_cost_details")
        @ExcludeMissing
        completionCostDetails: JsonField<CompletionCostDetails> = JsonMissing.of(),
        @JsonProperty("completion_token_details")
        @ExcludeMissing
        completionTokenDetails: JsonField<CompletionTokenDetails> = JsonMissing.of(),
        @JsonProperty("completion_tokens")
        @ExcludeMissing
        completionTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("feedback_stats")
        @ExcludeMissing
        feedbackStats: JsonField<FeedbackStats> = JsonMissing.of(),
        @JsonProperty("first_start_time")
        @ExcludeMissing
        firstStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("last_end_time")
        @ExcludeMissing
        lastEndTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("last_start_time")
        @ExcludeMissing
        lastStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("latency_p50_seconds")
        @ExcludeMissing
        latencyP50Seconds: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("latency_p99_seconds")
        @ExcludeMissing
        latencyP99Seconds: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("prompt_cost")
        @ExcludeMissing
        promptCost: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("prompt_cost_details")
        @ExcludeMissing
        promptCostDetails: JsonField<PromptCostDetails> = JsonMissing.of(),
        @JsonProperty("prompt_token_details")
        @ExcludeMissing
        promptTokenDetails: JsonField<PromptTokenDetails> = JsonMissing.of(),
        @JsonProperty("prompt_tokens")
        @ExcludeMissing
        promptTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("total_cost") @ExcludeMissing totalCost: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("total_tokens")
        @ExcludeMissing
        totalTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("turns") @ExcludeMissing turns: JsonField<Long> = JsonMissing.of(),
    ) : this(
        completionCost,
        completionCostDetails,
        completionTokenDetails,
        completionTokens,
        feedbackStats,
        firstStartTime,
        lastEndTime,
        lastStartTime,
        latencyP50Seconds,
        latencyP99Seconds,
        promptCost,
        promptCostDetails,
        promptTokenDetails,
        promptTokens,
        totalCost,
        totalTokens,
        turns,
        mutableMapOf(),
    )

    /**
     * `completion_cost` is the sum of per-trace completion costs across the thread, in USD.
     * Populated when `COMPLETION_COST` is selected.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completionCost(): Optional<Double> = completionCost.getOptional("completion_cost")

    /**
     * `completion_cost_details` is the per-sub-category sum of completion cost details across the
     * thread. Populated when `COMPLETION_COST_DETAILS` is selected.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completionCostDetails(): Optional<CompletionCostDetails> =
        completionCostDetails.getOptional("completion_cost_details")

    /**
     * `completion_token_details` is the per-sub-category sum of completion token details across the
     * thread. Populated when `COMPLETION_TOKEN_DETAILS` is selected.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completionTokenDetails(): Optional<CompletionTokenDetails> =
        completionTokenDetails.getOptional("completion_token_details")

    /**
     * `completion_tokens` is the sum of per-trace completion token counts across the thread.
     * Populated when `COMPLETION_TOKENS` is selected.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completionTokens(): Optional<Long> = completionTokens.getOptional("completion_tokens")

    /**
     * `feedback_stats` aggregates run-level feedback across the thread's traces, keyed by feedback
     * key. Populated when `FEEDBACK_STATS` is selected.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun feedbackStats(): Optional<FeedbackStats> = feedbackStats.getOptional("feedback_stats")

    /**
     * `first_start_time` is the earliest trace start time in the thread (RFC3339). Populated when
     * `FIRST_START_TIME` is selected.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstStartTime(): Optional<OffsetDateTime> = firstStartTime.getOptional("first_start_time")

    /**
     * `last_end_time` is the latest trace end time in the thread (RFC3339). Populated when
     * `LAST_END_TIME` is selected.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastEndTime(): Optional<OffsetDateTime> = lastEndTime.getOptional("last_end_time")

    /**
     * `last_start_time` is the latest trace start time in the thread (RFC3339). Populated when
     * `LAST_START_TIME` is selected.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastStartTime(): Optional<OffsetDateTime> = lastStartTime.getOptional("last_start_time")

    /**
     * `latency_p50_seconds` is the approximate p50 of trace latency across the thread, in seconds.
     * Populated when `LATENCY_P50` is selected.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun latencyP50Seconds(): Optional<Double> = latencyP50Seconds.getOptional("latency_p50_seconds")

    /**
     * `latency_p99_seconds` is the approximate p99 of trace latency across the thread, in seconds.
     * Populated when `LATENCY_P99` is selected.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun latencyP99Seconds(): Optional<Double> = latencyP99Seconds.getOptional("latency_p99_seconds")

    /**
     * `prompt_cost` is the sum of per-trace prompt costs across the thread, in USD. Populated when
     * `PROMPT_COST` is selected.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptCost(): Optional<Double> = promptCost.getOptional("prompt_cost")

    /**
     * `prompt_cost_details` is the per-sub-category sum of prompt cost details across the thread.
     * Populated when `PROMPT_COST_DETAILS` is selected.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptCostDetails(): Optional<PromptCostDetails> =
        promptCostDetails.getOptional("prompt_cost_details")

    /**
     * `prompt_token_details` is the per-sub-category sum of prompt token details across the thread.
     * Populated when `PROMPT_TOKEN_DETAILS` is selected.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptTokenDetails(): Optional<PromptTokenDetails> =
        promptTokenDetails.getOptional("prompt_token_details")

    /**
     * `prompt_tokens` is the sum of per-trace prompt token counts across the thread. Populated when
     * `PROMPT_TOKENS` is selected.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptTokens(): Optional<Long> = promptTokens.getOptional("prompt_tokens")

    /**
     * `total_cost` is the sum of per-trace total costs across the thread, in USD. Populated when
     * `TOTAL_COST` is selected.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalCost(): Optional<Double> = totalCost.getOptional("total_cost")

    /**
     * `total_tokens` is the sum of per-trace total token counts across the thread. Populated when
     * `TOTAL_TOKENS` is selected.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalTokens(): Optional<Long> = totalTokens.getOptional("total_tokens")

    /**
     * `turns` is the number of distinct traces (turns) in the thread. Populated when `TURNS` is
     * selected.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun turns(): Optional<Long> = turns.getOptional("turns")

    /**
     * Returns the raw JSON value of [completionCost].
     *
     * Unlike [completionCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("completion_cost")
    @ExcludeMissing
    fun _completionCost(): JsonField<Double> = completionCost

    /**
     * Returns the raw JSON value of [completionCostDetails].
     *
     * Unlike [completionCostDetails], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("completion_cost_details")
    @ExcludeMissing
    fun _completionCostDetails(): JsonField<CompletionCostDetails> = completionCostDetails

    /**
     * Returns the raw JSON value of [completionTokenDetails].
     *
     * Unlike [completionTokenDetails], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("completion_token_details")
    @ExcludeMissing
    fun _completionTokenDetails(): JsonField<CompletionTokenDetails> = completionTokenDetails

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
     * Returns the raw JSON value of [feedbackStats].
     *
     * Unlike [feedbackStats], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("feedback_stats")
    @ExcludeMissing
    fun _feedbackStats(): JsonField<FeedbackStats> = feedbackStats

    /**
     * Returns the raw JSON value of [firstStartTime].
     *
     * Unlike [firstStartTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("first_start_time")
    @ExcludeMissing
    fun _firstStartTime(): JsonField<OffsetDateTime> = firstStartTime

    /**
     * Returns the raw JSON value of [lastEndTime].
     *
     * Unlike [lastEndTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_end_time")
    @ExcludeMissing
    fun _lastEndTime(): JsonField<OffsetDateTime> = lastEndTime

    /**
     * Returns the raw JSON value of [lastStartTime].
     *
     * Unlike [lastStartTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_start_time")
    @ExcludeMissing
    fun _lastStartTime(): JsonField<OffsetDateTime> = lastStartTime

    /**
     * Returns the raw JSON value of [latencyP50Seconds].
     *
     * Unlike [latencyP50Seconds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("latency_p50_seconds")
    @ExcludeMissing
    fun _latencyP50Seconds(): JsonField<Double> = latencyP50Seconds

    /**
     * Returns the raw JSON value of [latencyP99Seconds].
     *
     * Unlike [latencyP99Seconds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("latency_p99_seconds")
    @ExcludeMissing
    fun _latencyP99Seconds(): JsonField<Double> = latencyP99Seconds

    /**
     * Returns the raw JSON value of [promptCost].
     *
     * Unlike [promptCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prompt_cost") @ExcludeMissing fun _promptCost(): JsonField<Double> = promptCost

    /**
     * Returns the raw JSON value of [promptCostDetails].
     *
     * Unlike [promptCostDetails], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("prompt_cost_details")
    @ExcludeMissing
    fun _promptCostDetails(): JsonField<PromptCostDetails> = promptCostDetails

    /**
     * Returns the raw JSON value of [promptTokenDetails].
     *
     * Unlike [promptTokenDetails], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("prompt_token_details")
    @ExcludeMissing
    fun _promptTokenDetails(): JsonField<PromptTokenDetails> = promptTokenDetails

    /**
     * Returns the raw JSON value of [promptTokens].
     *
     * Unlike [promptTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prompt_tokens")
    @ExcludeMissing
    fun _promptTokens(): JsonField<Long> = promptTokens

    /**
     * Returns the raw JSON value of [totalCost].
     *
     * Unlike [totalCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_cost") @ExcludeMissing fun _totalCost(): JsonField<Double> = totalCost

    /**
     * Returns the raw JSON value of [totalTokens].
     *
     * Unlike [totalTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_tokens") @ExcludeMissing fun _totalTokens(): JsonField<Long> = totalTokens

    /**
     * Returns the raw JSON value of [turns].
     *
     * Unlike [turns], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("turns") @ExcludeMissing fun _turns(): JsonField<Long> = turns

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

        /** Returns a mutable builder for constructing an instance of [ThreadStatsResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ThreadStatsResponse]. */
    class Builder internal constructor() {

        private var completionCost: JsonField<Double> = JsonMissing.of()
        private var completionCostDetails: JsonField<CompletionCostDetails> = JsonMissing.of()
        private var completionTokenDetails: JsonField<CompletionTokenDetails> = JsonMissing.of()
        private var completionTokens: JsonField<Long> = JsonMissing.of()
        private var feedbackStats: JsonField<FeedbackStats> = JsonMissing.of()
        private var firstStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastEndTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var latencyP50Seconds: JsonField<Double> = JsonMissing.of()
        private var latencyP99Seconds: JsonField<Double> = JsonMissing.of()
        private var promptCost: JsonField<Double> = JsonMissing.of()
        private var promptCostDetails: JsonField<PromptCostDetails> = JsonMissing.of()
        private var promptTokenDetails: JsonField<PromptTokenDetails> = JsonMissing.of()
        private var promptTokens: JsonField<Long> = JsonMissing.of()
        private var totalCost: JsonField<Double> = JsonMissing.of()
        private var totalTokens: JsonField<Long> = JsonMissing.of()
        private var turns: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(threadStatsResponse: ThreadStatsResponse) = apply {
            completionCost = threadStatsResponse.completionCost
            completionCostDetails = threadStatsResponse.completionCostDetails
            completionTokenDetails = threadStatsResponse.completionTokenDetails
            completionTokens = threadStatsResponse.completionTokens
            feedbackStats = threadStatsResponse.feedbackStats
            firstStartTime = threadStatsResponse.firstStartTime
            lastEndTime = threadStatsResponse.lastEndTime
            lastStartTime = threadStatsResponse.lastStartTime
            latencyP50Seconds = threadStatsResponse.latencyP50Seconds
            latencyP99Seconds = threadStatsResponse.latencyP99Seconds
            promptCost = threadStatsResponse.promptCost
            promptCostDetails = threadStatsResponse.promptCostDetails
            promptTokenDetails = threadStatsResponse.promptTokenDetails
            promptTokens = threadStatsResponse.promptTokens
            totalCost = threadStatsResponse.totalCost
            totalTokens = threadStatsResponse.totalTokens
            turns = threadStatsResponse.turns
            additionalProperties = threadStatsResponse.additionalProperties.toMutableMap()
        }

        /**
         * `completion_cost` is the sum of per-trace completion costs across the thread, in USD.
         * Populated when `COMPLETION_COST` is selected.
         */
        fun completionCost(completionCost: Double) = completionCost(JsonField.of(completionCost))

        /**
         * Sets [Builder.completionCost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completionCost] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun completionCost(completionCost: JsonField<Double>) = apply {
            this.completionCost = completionCost
        }

        /**
         * `completion_cost_details` is the per-sub-category sum of completion cost details across
         * the thread. Populated when `COMPLETION_COST_DETAILS` is selected.
         */
        fun completionCostDetails(completionCostDetails: CompletionCostDetails) =
            completionCostDetails(JsonField.of(completionCostDetails))

        /**
         * Sets [Builder.completionCostDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completionCostDetails] with a well-typed
         * [CompletionCostDetails] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun completionCostDetails(completionCostDetails: JsonField<CompletionCostDetails>) = apply {
            this.completionCostDetails = completionCostDetails
        }

        /**
         * `completion_token_details` is the per-sub-category sum of completion token details across
         * the thread. Populated when `COMPLETION_TOKEN_DETAILS` is selected.
         */
        fun completionTokenDetails(completionTokenDetails: CompletionTokenDetails) =
            completionTokenDetails(JsonField.of(completionTokenDetails))

        /**
         * Sets [Builder.completionTokenDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completionTokenDetails] with a well-typed
         * [CompletionTokenDetails] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun completionTokenDetails(completionTokenDetails: JsonField<CompletionTokenDetails>) =
            apply {
                this.completionTokenDetails = completionTokenDetails
            }

        /**
         * `completion_tokens` is the sum of per-trace completion token counts across the thread.
         * Populated when `COMPLETION_TOKENS` is selected.
         */
        fun completionTokens(completionTokens: Long) =
            completionTokens(JsonField.of(completionTokens))

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

        /**
         * `feedback_stats` aggregates run-level feedback across the thread's traces, keyed by
         * feedback key. Populated when `FEEDBACK_STATS` is selected.
         */
        fun feedbackStats(feedbackStats: FeedbackStats) = feedbackStats(JsonField.of(feedbackStats))

        /**
         * Sets [Builder.feedbackStats] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feedbackStats] with a well-typed [FeedbackStats] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun feedbackStats(feedbackStats: JsonField<FeedbackStats>) = apply {
            this.feedbackStats = feedbackStats
        }

        /**
         * `first_start_time` is the earliest trace start time in the thread (RFC3339). Populated
         * when `FIRST_START_TIME` is selected.
         */
        fun firstStartTime(firstStartTime: OffsetDateTime) =
            firstStartTime(JsonField.of(firstStartTime))

        /**
         * Sets [Builder.firstStartTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstStartTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun firstStartTime(firstStartTime: JsonField<OffsetDateTime>) = apply {
            this.firstStartTime = firstStartTime
        }

        /**
         * `last_end_time` is the latest trace end time in the thread (RFC3339). Populated when
         * `LAST_END_TIME` is selected.
         */
        fun lastEndTime(lastEndTime: OffsetDateTime) = lastEndTime(JsonField.of(lastEndTime))

        /**
         * Sets [Builder.lastEndTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastEndTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastEndTime(lastEndTime: JsonField<OffsetDateTime>) = apply {
            this.lastEndTime = lastEndTime
        }

        /**
         * `last_start_time` is the latest trace start time in the thread (RFC3339). Populated when
         * `LAST_START_TIME` is selected.
         */
        fun lastStartTime(lastStartTime: OffsetDateTime) =
            lastStartTime(JsonField.of(lastStartTime))

        /**
         * Sets [Builder.lastStartTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastStartTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastStartTime(lastStartTime: JsonField<OffsetDateTime>) = apply {
            this.lastStartTime = lastStartTime
        }

        /**
         * `latency_p50_seconds` is the approximate p50 of trace latency across the thread, in
         * seconds. Populated when `LATENCY_P50` is selected.
         */
        fun latencyP50Seconds(latencyP50Seconds: Double) =
            latencyP50Seconds(JsonField.of(latencyP50Seconds))

        /**
         * Sets [Builder.latencyP50Seconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latencyP50Seconds] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun latencyP50Seconds(latencyP50Seconds: JsonField<Double>) = apply {
            this.latencyP50Seconds = latencyP50Seconds
        }

        /**
         * `latency_p99_seconds` is the approximate p99 of trace latency across the thread, in
         * seconds. Populated when `LATENCY_P99` is selected.
         */
        fun latencyP99Seconds(latencyP99Seconds: Double) =
            latencyP99Seconds(JsonField.of(latencyP99Seconds))

        /**
         * Sets [Builder.latencyP99Seconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latencyP99Seconds] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun latencyP99Seconds(latencyP99Seconds: JsonField<Double>) = apply {
            this.latencyP99Seconds = latencyP99Seconds
        }

        /**
         * `prompt_cost` is the sum of per-trace prompt costs across the thread, in USD. Populated
         * when `PROMPT_COST` is selected.
         */
        fun promptCost(promptCost: Double) = promptCost(JsonField.of(promptCost))

        /**
         * Sets [Builder.promptCost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promptCost] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun promptCost(promptCost: JsonField<Double>) = apply { this.promptCost = promptCost }

        /**
         * `prompt_cost_details` is the per-sub-category sum of prompt cost details across the
         * thread. Populated when `PROMPT_COST_DETAILS` is selected.
         */
        fun promptCostDetails(promptCostDetails: PromptCostDetails) =
            promptCostDetails(JsonField.of(promptCostDetails))

        /**
         * Sets [Builder.promptCostDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promptCostDetails] with a well-typed [PromptCostDetails]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun promptCostDetails(promptCostDetails: JsonField<PromptCostDetails>) = apply {
            this.promptCostDetails = promptCostDetails
        }

        /**
         * `prompt_token_details` is the per-sub-category sum of prompt token details across the
         * thread. Populated when `PROMPT_TOKEN_DETAILS` is selected.
         */
        fun promptTokenDetails(promptTokenDetails: PromptTokenDetails) =
            promptTokenDetails(JsonField.of(promptTokenDetails))

        /**
         * Sets [Builder.promptTokenDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promptTokenDetails] with a well-typed
         * [PromptTokenDetails] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun promptTokenDetails(promptTokenDetails: JsonField<PromptTokenDetails>) = apply {
            this.promptTokenDetails = promptTokenDetails
        }

        /**
         * `prompt_tokens` is the sum of per-trace prompt token counts across the thread. Populated
         * when `PROMPT_TOKENS` is selected.
         */
        fun promptTokens(promptTokens: Long) = promptTokens(JsonField.of(promptTokens))

        /**
         * Sets [Builder.promptTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promptTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun promptTokens(promptTokens: JsonField<Long>) = apply { this.promptTokens = promptTokens }

        /**
         * `total_cost` is the sum of per-trace total costs across the thread, in USD. Populated
         * when `TOTAL_COST` is selected.
         */
        fun totalCost(totalCost: Double) = totalCost(JsonField.of(totalCost))

        /**
         * Sets [Builder.totalCost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalCost] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalCost(totalCost: JsonField<Double>) = apply { this.totalCost = totalCost }

        /**
         * `total_tokens` is the sum of per-trace total token counts across the thread. Populated
         * when `TOTAL_TOKENS` is selected.
         */
        fun totalTokens(totalTokens: Long) = totalTokens(JsonField.of(totalTokens))

        /**
         * Sets [Builder.totalTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalTokens(totalTokens: JsonField<Long>) = apply { this.totalTokens = totalTokens }

        /**
         * `turns` is the number of distinct traces (turns) in the thread. Populated when `TURNS` is
         * selected.
         */
        fun turns(turns: Long) = turns(JsonField.of(turns))

        /**
         * Sets [Builder.turns] to an arbitrary JSON value.
         *
         * You should usually call [Builder.turns] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun turns(turns: JsonField<Long>) = apply { this.turns = turns }

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
         * Returns an immutable instance of [ThreadStatsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ThreadStatsResponse =
            ThreadStatsResponse(
                completionCost,
                completionCostDetails,
                completionTokenDetails,
                completionTokens,
                feedbackStats,
                firstStartTime,
                lastEndTime,
                lastStartTime,
                latencyP50Seconds,
                latencyP99Seconds,
                promptCost,
                promptCostDetails,
                promptTokenDetails,
                promptTokens,
                totalCost,
                totalTokens,
                turns,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LangChainInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): ThreadStatsResponse = apply {
        if (validated) {
            return@apply
        }

        completionCost()
        completionCostDetails().ifPresent { it.validate() }
        completionTokenDetails().ifPresent { it.validate() }
        completionTokens()
        feedbackStats().ifPresent { it.validate() }
        firstStartTime()
        lastEndTime()
        lastStartTime()
        latencyP50Seconds()
        latencyP99Seconds()
        promptCost()
        promptCostDetails().ifPresent { it.validate() }
        promptTokenDetails().ifPresent { it.validate() }
        promptTokens()
        totalCost()
        totalTokens()
        turns()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LangChainInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (completionCost.asKnown().isPresent) 1 else 0) +
            (completionCostDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (completionTokenDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (if (completionTokens.asKnown().isPresent) 1 else 0) +
            (feedbackStats.asKnown().getOrNull()?.validity() ?: 0) +
            (if (firstStartTime.asKnown().isPresent) 1 else 0) +
            (if (lastEndTime.asKnown().isPresent) 1 else 0) +
            (if (lastStartTime.asKnown().isPresent) 1 else 0) +
            (if (latencyP50Seconds.asKnown().isPresent) 1 else 0) +
            (if (latencyP99Seconds.asKnown().isPresent) 1 else 0) +
            (if (promptCost.asKnown().isPresent) 1 else 0) +
            (promptCostDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (promptTokenDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (if (promptTokens.asKnown().isPresent) 1 else 0) +
            (if (totalCost.asKnown().isPresent) 1 else 0) +
            (if (totalTokens.asKnown().isPresent) 1 else 0) +
            (if (turns.asKnown().isPresent) 1 else 0)

    /**
     * `completion_cost_details` is the per-sub-category sum of completion cost details across the
     * thread. Populated when `COMPLETION_COST_DETAILS` is selected.
     */
    class CompletionCostDetails
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val raw: JsonField<Raw>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("raw") @ExcludeMissing raw: JsonField<Raw> = JsonMissing.of()
        ) : this(raw, mutableMapOf())

        /**
         * `raw` maps each category name to its estimated USD cost.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun raw(): Optional<Raw> = raw.getOptional("raw")

        /**
         * Returns the raw JSON value of [raw].
         *
         * Unlike [raw], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("raw") @ExcludeMissing fun _raw(): JsonField<Raw> = raw

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
             * Returns a mutable builder for constructing an instance of [CompletionCostDetails].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CompletionCostDetails]. */
        class Builder internal constructor() {

            private var raw: JsonField<Raw> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(completionCostDetails: CompletionCostDetails) = apply {
                raw = completionCostDetails.raw
                additionalProperties = completionCostDetails.additionalProperties.toMutableMap()
            }

            /** `raw` maps each category name to its estimated USD cost. */
            fun raw(raw: Raw) = raw(JsonField.of(raw))

            /**
             * Sets [Builder.raw] to an arbitrary JSON value.
             *
             * You should usually call [Builder.raw] with a well-typed [Raw] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun raw(raw: JsonField<Raw>) = apply { this.raw = raw }

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
             * Returns an immutable instance of [CompletionCostDetails].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CompletionCostDetails =
                CompletionCostDetails(raw, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): CompletionCostDetails = apply {
            if (validated) {
                return@apply
            }

            raw().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangChainInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = (raw.asKnown().getOrNull()?.validity() ?: 0)

        /** `raw` maps each category name to its estimated USD cost. */
        class Raw
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Raw]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Raw]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(raw: Raw) = apply {
                    additionalProperties = raw.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Raw].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Raw = Raw(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LangChainInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Raw = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LangChainInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Raw && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Raw{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CompletionCostDetails &&
                raw == other.raw &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(raw, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CompletionCostDetails{raw=$raw, additionalProperties=$additionalProperties}"
    }

    /**
     * `completion_token_details` is the per-sub-category sum of completion token details across the
     * thread. Populated when `COMPLETION_TOKEN_DETAILS` is selected.
     */
    class CompletionTokenDetails
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val raw: JsonField<Raw>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("raw") @ExcludeMissing raw: JsonField<Raw> = JsonMissing.of()
        ) : this(raw, mutableMapOf())

        /**
         * `raw` maps each category name to its completion-token count.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun raw(): Optional<Raw> = raw.getOptional("raw")

        /**
         * Returns the raw JSON value of [raw].
         *
         * Unlike [raw], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("raw") @ExcludeMissing fun _raw(): JsonField<Raw> = raw

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
             * Returns a mutable builder for constructing an instance of [CompletionTokenDetails].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CompletionTokenDetails]. */
        class Builder internal constructor() {

            private var raw: JsonField<Raw> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(completionTokenDetails: CompletionTokenDetails) = apply {
                raw = completionTokenDetails.raw
                additionalProperties = completionTokenDetails.additionalProperties.toMutableMap()
            }

            /** `raw` maps each category name to its completion-token count. */
            fun raw(raw: Raw) = raw(JsonField.of(raw))

            /**
             * Sets [Builder.raw] to an arbitrary JSON value.
             *
             * You should usually call [Builder.raw] with a well-typed [Raw] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun raw(raw: JsonField<Raw>) = apply { this.raw = raw }

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
             * Returns an immutable instance of [CompletionTokenDetails].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CompletionTokenDetails =
                CompletionTokenDetails(raw, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): CompletionTokenDetails = apply {
            if (validated) {
                return@apply
            }

            raw().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangChainInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = (raw.asKnown().getOrNull()?.validity() ?: 0)

        /** `raw` maps each category name to its completion-token count. */
        class Raw
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Raw]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Raw]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(raw: Raw) = apply {
                    additionalProperties = raw.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Raw].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Raw = Raw(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LangChainInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Raw = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LangChainInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Raw && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Raw{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CompletionTokenDetails &&
                raw == other.raw &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(raw, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CompletionTokenDetails{raw=$raw, additionalProperties=$additionalProperties}"
    }

    /**
     * `feedback_stats` aggregates run-level feedback across the thread's traces, keyed by feedback
     * key. Populated when `FEEDBACK_STATS` is selected.
     */
    class FeedbackStats
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [FeedbackStats]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FeedbackStats]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(feedbackStats: FeedbackStats) = apply {
                additionalProperties = feedbackStats.additionalProperties.toMutableMap()
            }

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
             * Returns an immutable instance of [FeedbackStats].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): FeedbackStats = FeedbackStats(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): FeedbackStats = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangChainInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FeedbackStats && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "FeedbackStats{additionalProperties=$additionalProperties}"
    }

    /**
     * `prompt_cost_details` is the per-sub-category sum of prompt cost details across the thread.
     * Populated when `PROMPT_COST_DETAILS` is selected.
     */
    class PromptCostDetails
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val raw: JsonField<Raw>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("raw") @ExcludeMissing raw: JsonField<Raw> = JsonMissing.of()
        ) : this(raw, mutableMapOf())

        /**
         * `raw` maps each category name to its estimated USD cost.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun raw(): Optional<Raw> = raw.getOptional("raw")

        /**
         * Returns the raw JSON value of [raw].
         *
         * Unlike [raw], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("raw") @ExcludeMissing fun _raw(): JsonField<Raw> = raw

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

            /** Returns a mutable builder for constructing an instance of [PromptCostDetails]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PromptCostDetails]. */
        class Builder internal constructor() {

            private var raw: JsonField<Raw> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(promptCostDetails: PromptCostDetails) = apply {
                raw = promptCostDetails.raw
                additionalProperties = promptCostDetails.additionalProperties.toMutableMap()
            }

            /** `raw` maps each category name to its estimated USD cost. */
            fun raw(raw: Raw) = raw(JsonField.of(raw))

            /**
             * Sets [Builder.raw] to an arbitrary JSON value.
             *
             * You should usually call [Builder.raw] with a well-typed [Raw] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun raw(raw: JsonField<Raw>) = apply { this.raw = raw }

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
             * Returns an immutable instance of [PromptCostDetails].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PromptCostDetails =
                PromptCostDetails(raw, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): PromptCostDetails = apply {
            if (validated) {
                return@apply
            }

            raw().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangChainInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = (raw.asKnown().getOrNull()?.validity() ?: 0)

        /** `raw` maps each category name to its estimated USD cost. */
        class Raw
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Raw]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Raw]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(raw: Raw) = apply {
                    additionalProperties = raw.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Raw].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Raw = Raw(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LangChainInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Raw = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LangChainInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Raw && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Raw{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PromptCostDetails &&
                raw == other.raw &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(raw, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PromptCostDetails{raw=$raw, additionalProperties=$additionalProperties}"
    }

    /**
     * `prompt_token_details` is the per-sub-category sum of prompt token details across the thread.
     * Populated when `PROMPT_TOKEN_DETAILS` is selected.
     */
    class PromptTokenDetails
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val raw: JsonField<Raw>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("raw") @ExcludeMissing raw: JsonField<Raw> = JsonMissing.of()
        ) : this(raw, mutableMapOf())

        /**
         * `raw` maps each category name to its prompt-token count.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun raw(): Optional<Raw> = raw.getOptional("raw")

        /**
         * Returns the raw JSON value of [raw].
         *
         * Unlike [raw], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("raw") @ExcludeMissing fun _raw(): JsonField<Raw> = raw

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

            /** Returns a mutable builder for constructing an instance of [PromptTokenDetails]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PromptTokenDetails]. */
        class Builder internal constructor() {

            private var raw: JsonField<Raw> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(promptTokenDetails: PromptTokenDetails) = apply {
                raw = promptTokenDetails.raw
                additionalProperties = promptTokenDetails.additionalProperties.toMutableMap()
            }

            /** `raw` maps each category name to its prompt-token count. */
            fun raw(raw: Raw) = raw(JsonField.of(raw))

            /**
             * Sets [Builder.raw] to an arbitrary JSON value.
             *
             * You should usually call [Builder.raw] with a well-typed [Raw] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun raw(raw: JsonField<Raw>) = apply { this.raw = raw }

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
             * Returns an immutable instance of [PromptTokenDetails].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PromptTokenDetails =
                PromptTokenDetails(raw, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): PromptTokenDetails = apply {
            if (validated) {
                return@apply
            }

            raw().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangChainInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = (raw.asKnown().getOrNull()?.validity() ?: 0)

        /** `raw` maps each category name to its prompt-token count. */
        class Raw
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Raw]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Raw]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(raw: Raw) = apply {
                    additionalProperties = raw.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Raw].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Raw = Raw(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LangChainInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Raw = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LangChainInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Raw && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Raw{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PromptTokenDetails &&
                raw == other.raw &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(raw, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PromptTokenDetails{raw=$raw, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ThreadStatsResponse &&
            completionCost == other.completionCost &&
            completionCostDetails == other.completionCostDetails &&
            completionTokenDetails == other.completionTokenDetails &&
            completionTokens == other.completionTokens &&
            feedbackStats == other.feedbackStats &&
            firstStartTime == other.firstStartTime &&
            lastEndTime == other.lastEndTime &&
            lastStartTime == other.lastStartTime &&
            latencyP50Seconds == other.latencyP50Seconds &&
            latencyP99Seconds == other.latencyP99Seconds &&
            promptCost == other.promptCost &&
            promptCostDetails == other.promptCostDetails &&
            promptTokenDetails == other.promptTokenDetails &&
            promptTokens == other.promptTokens &&
            totalCost == other.totalCost &&
            totalTokens == other.totalTokens &&
            turns == other.turns &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            completionCost,
            completionCostDetails,
            completionTokenDetails,
            completionTokens,
            feedbackStats,
            firstStartTime,
            lastEndTime,
            lastStartTime,
            latencyP50Seconds,
            latencyP99Seconds,
            promptCost,
            promptCostDetails,
            promptTokenDetails,
            promptTokens,
            totalCost,
            totalTokens,
            turns,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ThreadStatsResponse{completionCost=$completionCost, completionCostDetails=$completionCostDetails, completionTokenDetails=$completionTokenDetails, completionTokens=$completionTokens, feedbackStats=$feedbackStats, firstStartTime=$firstStartTime, lastEndTime=$lastEndTime, lastStartTime=$lastStartTime, latencyP50Seconds=$latencyP50Seconds, latencyP99Seconds=$latencyP99Seconds, promptCost=$promptCost, promptCostDetails=$promptCostDetails, promptTokenDetails=$promptTokenDetails, promptTokens=$promptTokens, totalCost=$totalCost, totalTokens=$totalTokens, turns=$turns, additionalProperties=$additionalProperties}"
}

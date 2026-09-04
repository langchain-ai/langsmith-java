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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ThreadAggregateStatsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val completionCost: JsonField<Double>,
    private val completionCostDetails: JsonField<CompletionCostDetails>,
    private val completionTokenDetails: JsonField<CompletionTokenDetails>,
    private val completionTokens: JsonField<Long>,
    private val errorRate: JsonField<Double>,
    private val firstTokenP50Seconds: JsonField<Double>,
    private val firstTokenP99Seconds: JsonField<Double>,
    private val latencyP50Seconds: JsonField<Double>,
    private val latencyP99Seconds: JsonField<Double>,
    private val medianTokens: JsonField<Long>,
    private val promptCost: JsonField<Double>,
    private val promptCostDetails: JsonField<PromptCostDetails>,
    private val promptTokenDetails: JsonField<PromptTokenDetails>,
    private val promptTokens: JsonField<Long>,
    private val streamingRate: JsonField<Double>,
    private val threadCount: JsonField<Long>,
    private val threadFeedbackStats: JsonField<ThreadFeedbackStats>,
    private val totalCost: JsonField<Double>,
    private val totalTokens: JsonField<Long>,
    private val traceCount: JsonField<Long>,
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
        @JsonProperty("error_rate") @ExcludeMissing errorRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("first_token_p50_seconds")
        @ExcludeMissing
        firstTokenP50Seconds: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("first_token_p99_seconds")
        @ExcludeMissing
        firstTokenP99Seconds: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("latency_p50_seconds")
        @ExcludeMissing
        latencyP50Seconds: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("latency_p99_seconds")
        @ExcludeMissing
        latencyP99Seconds: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("median_tokens")
        @ExcludeMissing
        medianTokens: JsonField<Long> = JsonMissing.of(),
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
        @JsonProperty("streaming_rate")
        @ExcludeMissing
        streamingRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("thread_count")
        @ExcludeMissing
        threadCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("thread_feedback_stats")
        @ExcludeMissing
        threadFeedbackStats: JsonField<ThreadFeedbackStats> = JsonMissing.of(),
        @JsonProperty("total_cost") @ExcludeMissing totalCost: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("total_tokens")
        @ExcludeMissing
        totalTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("trace_count") @ExcludeMissing traceCount: JsonField<Long> = JsonMissing.of(),
    ) : this(
        completionCost,
        completionCostDetails,
        completionTokenDetails,
        completionTokens,
        errorRate,
        firstTokenP50Seconds,
        firstTokenP99Seconds,
        latencyP50Seconds,
        latencyP99Seconds,
        medianTokens,
        promptCost,
        promptCostDetails,
        promptTokenDetails,
        promptTokens,
        streamingRate,
        threadCount,
        threadFeedbackStats,
        totalCost,
        totalTokens,
        traceCount,
        mutableMapOf(),
    )

    /**
     * `completion_cost` is the completion cost across matching traces in USD.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completionCost(): Optional<Double> = completionCost.getOptional("completion_cost")

    /**
     * `completion_cost_details` contains completion-cost totals by category.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completionCostDetails(): Optional<CompletionCostDetails> =
        completionCostDetails.getOptional("completion_cost_details")

    /**
     * `completion_token_details` contains completion-token totals by category.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completionTokenDetails(): Optional<CompletionTokenDetails> =
        completionTokenDetails.getOptional("completion_token_details")

    /**
     * `completion_tokens` is the sum of completion tokens across matching traces.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completionTokens(): Optional<Long> = completionTokens.getOptional("completion_tokens")

    /**
     * `error_rate` is the fraction of matching traces that contain an error.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errorRate(): Optional<Double> = errorRate.getOptional("error_rate")

    /**
     * `first_token_p50_seconds` is the approximate median time to first token in seconds. Populated
     * when `FIRST_TOKEN_P50` is selected.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstTokenP50Seconds(): Optional<Double> =
        firstTokenP50Seconds.getOptional("first_token_p50_seconds")

    /**
     * `first_token_p99_seconds` is the approximate p99 time to first token in seconds. Populated
     * when `FIRST_TOKEN_P99` is selected.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstTokenP99Seconds(): Optional<Double> =
        firstTokenP99Seconds.getOptional("first_token_p99_seconds")

    /**
     * `latency_p50_seconds` is the approximate median trace latency in seconds. Populated when
     * `LATENCY_P50` is selected.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun latencyP50Seconds(): Optional<Double> = latencyP50Seconds.getOptional("latency_p50_seconds")

    /**
     * `latency_p99_seconds` is the approximate p99 trace latency in seconds. Populated when
     * `LATENCY_P99` is selected.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun latencyP99Seconds(): Optional<Double> = latencyP99Seconds.getOptional("latency_p99_seconds")

    /**
     * `median_tokens` is the approximate median of total tokens across matching traces. Populated
     * when `MEDIAN_TOKENS` is selected.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun medianTokens(): Optional<Long> = medianTokens.getOptional("median_tokens")

    /**
     * `prompt_cost` is the prompt cost across matching traces in USD.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptCost(): Optional<Double> = promptCost.getOptional("prompt_cost")

    /**
     * `prompt_cost_details` contains prompt-cost totals by category.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptCostDetails(): Optional<PromptCostDetails> =
        promptCostDetails.getOptional("prompt_cost_details")

    /**
     * `prompt_token_details` contains prompt-token totals by category.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptTokenDetails(): Optional<PromptTokenDetails> =
        promptTokenDetails.getOptional("prompt_token_details")

    /**
     * `prompt_tokens` is the sum of prompt tokens across matching traces.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptTokens(): Optional<Long> = promptTokens.getOptional("prompt_tokens")

    /**
     * `streaming_rate` is the fraction of completed matching traces that streamed tokens.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun streamingRate(): Optional<Double> = streamingRate.getOptional("streaming_rate")

    /**
     * `thread_count` is the number of distinct threads matching the query. Populated when
     * `THREAD_COUNT` is selected.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun threadCount(): Optional<Long> = threadCount.getOptional("thread_count")

    /**
     * `thread_feedback_stats` contains aggregate thread-level feedback statistics keyed by feedback
     * key. Populated when `THREAD_FEEDBACK_STATS` is selected.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun threadFeedbackStats(): Optional<ThreadFeedbackStats> =
        threadFeedbackStats.getOptional("thread_feedback_stats")

    /**
     * `total_cost` is the total cost across matching traces in USD.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalCost(): Optional<Double> = totalCost.getOptional("total_cost")

    /**
     * `total_tokens` is the sum of all tokens across matching traces.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalTokens(): Optional<Long> = totalTokens.getOptional("total_tokens")

    /**
     * `trace_count` is the number of traces in the matching threads. Populated when `TRACE_COUNT`
     * is selected.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun traceCount(): Optional<Long> = traceCount.getOptional("trace_count")

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
     * Returns the raw JSON value of [errorRate].
     *
     * Unlike [errorRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error_rate") @ExcludeMissing fun _errorRate(): JsonField<Double> = errorRate

    /**
     * Returns the raw JSON value of [firstTokenP50Seconds].
     *
     * Unlike [firstTokenP50Seconds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("first_token_p50_seconds")
    @ExcludeMissing
    fun _firstTokenP50Seconds(): JsonField<Double> = firstTokenP50Seconds

    /**
     * Returns the raw JSON value of [firstTokenP99Seconds].
     *
     * Unlike [firstTokenP99Seconds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("first_token_p99_seconds")
    @ExcludeMissing
    fun _firstTokenP99Seconds(): JsonField<Double> = firstTokenP99Seconds

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
     * Returns the raw JSON value of [streamingRate].
     *
     * Unlike [streamingRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("streaming_rate")
    @ExcludeMissing
    fun _streamingRate(): JsonField<Double> = streamingRate

    /**
     * Returns the raw JSON value of [threadCount].
     *
     * Unlike [threadCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("thread_count") @ExcludeMissing fun _threadCount(): JsonField<Long> = threadCount

    /**
     * Returns the raw JSON value of [threadFeedbackStats].
     *
     * Unlike [threadFeedbackStats], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("thread_feedback_stats")
    @ExcludeMissing
    fun _threadFeedbackStats(): JsonField<ThreadFeedbackStats> = threadFeedbackStats

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
     * Returns the raw JSON value of [traceCount].
     *
     * Unlike [traceCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trace_count") @ExcludeMissing fun _traceCount(): JsonField<Long> = traceCount

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
         * Returns a mutable builder for constructing an instance of [ThreadAggregateStatsResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ThreadAggregateStatsResponse]. */
    class Builder internal constructor() {

        private var completionCost: JsonField<Double> = JsonMissing.of()
        private var completionCostDetails: JsonField<CompletionCostDetails> = JsonMissing.of()
        private var completionTokenDetails: JsonField<CompletionTokenDetails> = JsonMissing.of()
        private var completionTokens: JsonField<Long> = JsonMissing.of()
        private var errorRate: JsonField<Double> = JsonMissing.of()
        private var firstTokenP50Seconds: JsonField<Double> = JsonMissing.of()
        private var firstTokenP99Seconds: JsonField<Double> = JsonMissing.of()
        private var latencyP50Seconds: JsonField<Double> = JsonMissing.of()
        private var latencyP99Seconds: JsonField<Double> = JsonMissing.of()
        private var medianTokens: JsonField<Long> = JsonMissing.of()
        private var promptCost: JsonField<Double> = JsonMissing.of()
        private var promptCostDetails: JsonField<PromptCostDetails> = JsonMissing.of()
        private var promptTokenDetails: JsonField<PromptTokenDetails> = JsonMissing.of()
        private var promptTokens: JsonField<Long> = JsonMissing.of()
        private var streamingRate: JsonField<Double> = JsonMissing.of()
        private var threadCount: JsonField<Long> = JsonMissing.of()
        private var threadFeedbackStats: JsonField<ThreadFeedbackStats> = JsonMissing.of()
        private var totalCost: JsonField<Double> = JsonMissing.of()
        private var totalTokens: JsonField<Long> = JsonMissing.of()
        private var traceCount: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(threadAggregateStatsResponse: ThreadAggregateStatsResponse) = apply {
            completionCost = threadAggregateStatsResponse.completionCost
            completionCostDetails = threadAggregateStatsResponse.completionCostDetails
            completionTokenDetails = threadAggregateStatsResponse.completionTokenDetails
            completionTokens = threadAggregateStatsResponse.completionTokens
            errorRate = threadAggregateStatsResponse.errorRate
            firstTokenP50Seconds = threadAggregateStatsResponse.firstTokenP50Seconds
            firstTokenP99Seconds = threadAggregateStatsResponse.firstTokenP99Seconds
            latencyP50Seconds = threadAggregateStatsResponse.latencyP50Seconds
            latencyP99Seconds = threadAggregateStatsResponse.latencyP99Seconds
            medianTokens = threadAggregateStatsResponse.medianTokens
            promptCost = threadAggregateStatsResponse.promptCost
            promptCostDetails = threadAggregateStatsResponse.promptCostDetails
            promptTokenDetails = threadAggregateStatsResponse.promptTokenDetails
            promptTokens = threadAggregateStatsResponse.promptTokens
            streamingRate = threadAggregateStatsResponse.streamingRate
            threadCount = threadAggregateStatsResponse.threadCount
            threadFeedbackStats = threadAggregateStatsResponse.threadFeedbackStats
            totalCost = threadAggregateStatsResponse.totalCost
            totalTokens = threadAggregateStatsResponse.totalTokens
            traceCount = threadAggregateStatsResponse.traceCount
            additionalProperties = threadAggregateStatsResponse.additionalProperties.toMutableMap()
        }

        /** `completion_cost` is the completion cost across matching traces in USD. */
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

        /** `completion_cost_details` contains completion-cost totals by category. */
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

        /** `completion_token_details` contains completion-token totals by category. */
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

        /** `completion_tokens` is the sum of completion tokens across matching traces. */
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

        /** `error_rate` is the fraction of matching traces that contain an error. */
        fun errorRate(errorRate: Double) = errorRate(JsonField.of(errorRate))

        /**
         * Sets [Builder.errorRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorRate] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errorRate(errorRate: JsonField<Double>) = apply { this.errorRate = errorRate }

        /**
         * `first_token_p50_seconds` is the approximate median time to first token in seconds.
         * Populated when `FIRST_TOKEN_P50` is selected.
         */
        fun firstTokenP50Seconds(firstTokenP50Seconds: Double) =
            firstTokenP50Seconds(JsonField.of(firstTokenP50Seconds))

        /**
         * Sets [Builder.firstTokenP50Seconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstTokenP50Seconds] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun firstTokenP50Seconds(firstTokenP50Seconds: JsonField<Double>) = apply {
            this.firstTokenP50Seconds = firstTokenP50Seconds
        }

        /**
         * `first_token_p99_seconds` is the approximate p99 time to first token in seconds.
         * Populated when `FIRST_TOKEN_P99` is selected.
         */
        fun firstTokenP99Seconds(firstTokenP99Seconds: Double) =
            firstTokenP99Seconds(JsonField.of(firstTokenP99Seconds))

        /**
         * Sets [Builder.firstTokenP99Seconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstTokenP99Seconds] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun firstTokenP99Seconds(firstTokenP99Seconds: JsonField<Double>) = apply {
            this.firstTokenP99Seconds = firstTokenP99Seconds
        }

        /**
         * `latency_p50_seconds` is the approximate median trace latency in seconds. Populated when
         * `LATENCY_P50` is selected.
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
         * `latency_p99_seconds` is the approximate p99 trace latency in seconds. Populated when
         * `LATENCY_P99` is selected.
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
         * `median_tokens` is the approximate median of total tokens across matching traces.
         * Populated when `MEDIAN_TOKENS` is selected.
         */
        fun medianTokens(medianTokens: Long) = medianTokens(JsonField.of(medianTokens))

        /**
         * Sets [Builder.medianTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.medianTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun medianTokens(medianTokens: JsonField<Long>) = apply { this.medianTokens = medianTokens }

        /** `prompt_cost` is the prompt cost across matching traces in USD. */
        fun promptCost(promptCost: Double) = promptCost(JsonField.of(promptCost))

        /**
         * Sets [Builder.promptCost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promptCost] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun promptCost(promptCost: JsonField<Double>) = apply { this.promptCost = promptCost }

        /** `prompt_cost_details` contains prompt-cost totals by category. */
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

        /** `prompt_token_details` contains prompt-token totals by category. */
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

        /** `prompt_tokens` is the sum of prompt tokens across matching traces. */
        fun promptTokens(promptTokens: Long) = promptTokens(JsonField.of(promptTokens))

        /**
         * Sets [Builder.promptTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promptTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun promptTokens(promptTokens: JsonField<Long>) = apply { this.promptTokens = promptTokens }

        /** `streaming_rate` is the fraction of completed matching traces that streamed tokens. */
        fun streamingRate(streamingRate: Double) = streamingRate(JsonField.of(streamingRate))

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

        /**
         * `thread_count` is the number of distinct threads matching the query. Populated when
         * `THREAD_COUNT` is selected.
         */
        fun threadCount(threadCount: Long) = threadCount(JsonField.of(threadCount))

        /**
         * Sets [Builder.threadCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threadCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun threadCount(threadCount: JsonField<Long>) = apply { this.threadCount = threadCount }

        /**
         * `thread_feedback_stats` contains aggregate thread-level feedback statistics keyed by
         * feedback key. Populated when `THREAD_FEEDBACK_STATS` is selected.
         */
        fun threadFeedbackStats(threadFeedbackStats: ThreadFeedbackStats) =
            threadFeedbackStats(JsonField.of(threadFeedbackStats))

        /**
         * Sets [Builder.threadFeedbackStats] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threadFeedbackStats] with a well-typed
         * [ThreadFeedbackStats] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun threadFeedbackStats(threadFeedbackStats: JsonField<ThreadFeedbackStats>) = apply {
            this.threadFeedbackStats = threadFeedbackStats
        }

        /** `total_cost` is the total cost across matching traces in USD. */
        fun totalCost(totalCost: Double) = totalCost(JsonField.of(totalCost))

        /**
         * Sets [Builder.totalCost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalCost] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalCost(totalCost: JsonField<Double>) = apply { this.totalCost = totalCost }

        /** `total_tokens` is the sum of all tokens across matching traces. */
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
         * `trace_count` is the number of traces in the matching threads. Populated when
         * `TRACE_COUNT` is selected.
         */
        fun traceCount(traceCount: Long) = traceCount(JsonField.of(traceCount))

        /**
         * Sets [Builder.traceCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.traceCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun traceCount(traceCount: JsonField<Long>) = apply { this.traceCount = traceCount }

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
         * Returns an immutable instance of [ThreadAggregateStatsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ThreadAggregateStatsResponse =
            ThreadAggregateStatsResponse(
                completionCost,
                completionCostDetails,
                completionTokenDetails,
                completionTokens,
                errorRate,
                firstTokenP50Seconds,
                firstTokenP99Seconds,
                latencyP50Seconds,
                latencyP99Seconds,
                medianTokens,
                promptCost,
                promptCostDetails,
                promptTokenDetails,
                promptTokens,
                streamingRate,
                threadCount,
                threadFeedbackStats,
                totalCost,
                totalTokens,
                traceCount,
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
    fun validate(): ThreadAggregateStatsResponse = apply {
        if (validated) {
            return@apply
        }

        completionCost()
        completionCostDetails().ifPresent { it.validate() }
        completionTokenDetails().ifPresent { it.validate() }
        completionTokens()
        errorRate()
        firstTokenP50Seconds()
        firstTokenP99Seconds()
        latencyP50Seconds()
        latencyP99Seconds()
        medianTokens()
        promptCost()
        promptCostDetails().ifPresent { it.validate() }
        promptTokenDetails().ifPresent { it.validate() }
        promptTokens()
        streamingRate()
        threadCount()
        threadFeedbackStats().ifPresent { it.validate() }
        totalCost()
        totalTokens()
        traceCount()
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
            (if (errorRate.asKnown().isPresent) 1 else 0) +
            (if (firstTokenP50Seconds.asKnown().isPresent) 1 else 0) +
            (if (firstTokenP99Seconds.asKnown().isPresent) 1 else 0) +
            (if (latencyP50Seconds.asKnown().isPresent) 1 else 0) +
            (if (latencyP99Seconds.asKnown().isPresent) 1 else 0) +
            (if (medianTokens.asKnown().isPresent) 1 else 0) +
            (if (promptCost.asKnown().isPresent) 1 else 0) +
            (promptCostDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (promptTokenDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (if (promptTokens.asKnown().isPresent) 1 else 0) +
            (if (streamingRate.asKnown().isPresent) 1 else 0) +
            (if (threadCount.asKnown().isPresent) 1 else 0) +
            (threadFeedbackStats.asKnown().getOrNull()?.validity() ?: 0) +
            (if (totalCost.asKnown().isPresent) 1 else 0) +
            (if (totalTokens.asKnown().isPresent) 1 else 0) +
            (if (traceCount.asKnown().isPresent) 1 else 0)

    /** `completion_cost_details` contains completion-cost totals by category. */
    class CompletionCostDetails
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

            /**
             * Returns a mutable builder for constructing an instance of [CompletionCostDetails].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CompletionCostDetails]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(completionCostDetails: CompletionCostDetails) = apply {
                additionalProperties = completionCostDetails.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [CompletionCostDetails].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CompletionCostDetails =
                CompletionCostDetails(additionalProperties.toImmutable())
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

            return other is CompletionCostDetails &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CompletionCostDetails{additionalProperties=$additionalProperties}"
    }

    /** `completion_token_details` contains completion-token totals by category. */
    class CompletionTokenDetails
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

            /**
             * Returns a mutable builder for constructing an instance of [CompletionTokenDetails].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CompletionTokenDetails]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(completionTokenDetails: CompletionTokenDetails) = apply {
                additionalProperties = completionTokenDetails.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [CompletionTokenDetails].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CompletionTokenDetails =
                CompletionTokenDetails(additionalProperties.toImmutable())
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

            return other is CompletionTokenDetails &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CompletionTokenDetails{additionalProperties=$additionalProperties}"
    }

    /** `prompt_cost_details` contains prompt-cost totals by category. */
    class PromptCostDetails
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

            /** Returns a mutable builder for constructing an instance of [PromptCostDetails]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PromptCostDetails]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(promptCostDetails: PromptCostDetails) = apply {
                additionalProperties = promptCostDetails.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [PromptCostDetails].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PromptCostDetails = PromptCostDetails(additionalProperties.toImmutable())
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

            return other is PromptCostDetails && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "PromptCostDetails{additionalProperties=$additionalProperties}"
    }

    /** `prompt_token_details` contains prompt-token totals by category. */
    class PromptTokenDetails
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

            /** Returns a mutable builder for constructing an instance of [PromptTokenDetails]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PromptTokenDetails]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(promptTokenDetails: PromptTokenDetails) = apply {
                additionalProperties = promptTokenDetails.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [PromptTokenDetails].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PromptTokenDetails = PromptTokenDetails(additionalProperties.toImmutable())
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

            return other is PromptTokenDetails && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "PromptTokenDetails{additionalProperties=$additionalProperties}"
    }

    /**
     * `thread_feedback_stats` contains aggregate thread-level feedback statistics keyed by feedback
     * key. Populated when `THREAD_FEEDBACK_STATS` is selected.
     */
    class ThreadFeedbackStats
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

            /** Returns a mutable builder for constructing an instance of [ThreadFeedbackStats]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ThreadFeedbackStats]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(threadFeedbackStats: ThreadFeedbackStats) = apply {
                additionalProperties = threadFeedbackStats.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ThreadFeedbackStats].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ThreadFeedbackStats =
                ThreadFeedbackStats(additionalProperties.toImmutable())
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
        fun validate(): ThreadFeedbackStats = apply {
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

            return other is ThreadFeedbackStats &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ThreadFeedbackStats{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ThreadAggregateStatsResponse &&
            completionCost == other.completionCost &&
            completionCostDetails == other.completionCostDetails &&
            completionTokenDetails == other.completionTokenDetails &&
            completionTokens == other.completionTokens &&
            errorRate == other.errorRate &&
            firstTokenP50Seconds == other.firstTokenP50Seconds &&
            firstTokenP99Seconds == other.firstTokenP99Seconds &&
            latencyP50Seconds == other.latencyP50Seconds &&
            latencyP99Seconds == other.latencyP99Seconds &&
            medianTokens == other.medianTokens &&
            promptCost == other.promptCost &&
            promptCostDetails == other.promptCostDetails &&
            promptTokenDetails == other.promptTokenDetails &&
            promptTokens == other.promptTokens &&
            streamingRate == other.streamingRate &&
            threadCount == other.threadCount &&
            threadFeedbackStats == other.threadFeedbackStats &&
            totalCost == other.totalCost &&
            totalTokens == other.totalTokens &&
            traceCount == other.traceCount &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            completionCost,
            completionCostDetails,
            completionTokenDetails,
            completionTokens,
            errorRate,
            firstTokenP50Seconds,
            firstTokenP99Seconds,
            latencyP50Seconds,
            latencyP99Seconds,
            medianTokens,
            promptCost,
            promptCostDetails,
            promptTokenDetails,
            promptTokens,
            streamingRate,
            threadCount,
            threadFeedbackStats,
            totalCost,
            totalTokens,
            traceCount,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ThreadAggregateStatsResponse{completionCost=$completionCost, completionCostDetails=$completionCostDetails, completionTokenDetails=$completionTokenDetails, completionTokens=$completionTokens, errorRate=$errorRate, firstTokenP50Seconds=$firstTokenP50Seconds, firstTokenP99Seconds=$firstTokenP99Seconds, latencyP50Seconds=$latencyP50Seconds, latencyP99Seconds=$latencyP99Seconds, medianTokens=$medianTokens, promptCost=$promptCost, promptCostDetails=$promptCostDetails, promptTokenDetails=$promptTokenDetails, promptTokens=$promptTokens, streamingRate=$streamingRate, threadCount=$threadCount, threadFeedbackStats=$threadFeedbackStats, totalCost=$totalCost, totalTokens=$totalTokens, traceCount=$traceCount, additionalProperties=$additionalProperties}"
}

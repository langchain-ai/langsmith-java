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

class ThreadListItem
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val count: JsonField<Long>,
    private val feedbackStats: JsonField<FeedbackStats>,
    private val firstInputs: JsonField<String>,
    private val firstTraceId: JsonField<String>,
    private val lastError: JsonField<String>,
    private val lastOutputs: JsonField<String>,
    private val lastTraceId: JsonField<String>,
    private val latencyP50: JsonField<Double>,
    private val latencyP99: JsonField<Double>,
    private val maxStartTime: JsonField<OffsetDateTime>,
    private val minStartTime: JsonField<OffsetDateTime>,
    private val numErroredTurns: JsonField<Long>,
    private val startTime: JsonField<OffsetDateTime>,
    private val threadId: JsonField<String>,
    private val totalCost: JsonField<Double>,
    private val totalCostDetails: JsonField<TotalCostDetails>,
    private val totalTokenDetails: JsonField<TotalTokenDetails>,
    private val totalTokens: JsonField<Long>,
    private val traceId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("count") @ExcludeMissing count: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("feedback_stats")
        @ExcludeMissing
        feedbackStats: JsonField<FeedbackStats> = JsonMissing.of(),
        @JsonProperty("first_inputs")
        @ExcludeMissing
        firstInputs: JsonField<String> = JsonMissing.of(),
        @JsonProperty("first_trace_id")
        @ExcludeMissing
        firstTraceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_error") @ExcludeMissing lastError: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_outputs")
        @ExcludeMissing
        lastOutputs: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_trace_id")
        @ExcludeMissing
        lastTraceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("latency_p50")
        @ExcludeMissing
        latencyP50: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("latency_p99")
        @ExcludeMissing
        latencyP99: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("max_start_time")
        @ExcludeMissing
        maxStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("min_start_time")
        @ExcludeMissing
        minStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("num_errored_turns")
        @ExcludeMissing
        numErroredTurns: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("start_time")
        @ExcludeMissing
        startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("thread_id") @ExcludeMissing threadId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_cost") @ExcludeMissing totalCost: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("total_cost_details")
        @ExcludeMissing
        totalCostDetails: JsonField<TotalCostDetails> = JsonMissing.of(),
        @JsonProperty("total_token_details")
        @ExcludeMissing
        totalTokenDetails: JsonField<TotalTokenDetails> = JsonMissing.of(),
        @JsonProperty("total_tokens")
        @ExcludeMissing
        totalTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("trace_id") @ExcludeMissing traceId: JsonField<String> = JsonMissing.of(),
    ) : this(
        count,
        feedbackStats,
        firstInputs,
        firstTraceId,
        lastError,
        lastOutputs,
        lastTraceId,
        latencyP50,
        latencyP99,
        maxStartTime,
        minStartTime,
        numErroredTurns,
        startTime,
        threadId,
        totalCost,
        totalCostDetails,
        totalTokenDetails,
        totalTokens,
        traceId,
        mutableMapOf(),
    )

    /**
     * `count` is how many root traces (conversation turns) fall in this thread for the query time
     * range.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun count(): Optional<Long> = count.getOptional("count")

    /**
     * `feedback_stats` is the aggregated feedback across traces in the thread, keyed by feedback
     * key; shape matches `feedback_stats` on a single run.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun feedbackStats(): Optional<FeedbackStats> = feedbackStats.getOptional("feedback_stats")

    /**
     * `first_inputs` is a truncated preview of inputs from the earliest trace in the thread for the
     * query window.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstInputs(): Optional<String> = firstInputs.getOptional("first_inputs")

    /**
     * `first_trace_id` is the root trace UUID for the chronologically first trace in the query time
     * window.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstTraceId(): Optional<String> = firstTraceId.getOptional("first_trace_id")

    /**
     * `last_error` is a short error summary from the most recent failing trace in the thread.
     * Absent when there is no error in the window.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastError(): Optional<String> = lastError.getOptional("last_error")

    /**
     * `last_outputs` is a truncated preview of outputs from the latest trace in the thread for the
     * query window.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastOutputs(): Optional<String> = lastOutputs.getOptional("last_outputs")

    /**
     * `last_trace_id` is the root trace UUID for the chronologically last trace in the query time
     * window.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastTraceId(): Optional<String> = lastTraceId.getOptional("last_trace_id")

    /**
     * `latency_p50` is the approximate median end-to-end latency of traces in the thread, in
     * seconds.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun latencyP50(): Optional<Double> = latencyP50.getOptional("latency_p50")

    /**
     * `latency_p99` is the approximate 99th percentile end-to-end latency of traces in the thread,
     * in seconds.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun latencyP99(): Optional<Double> = latencyP99.getOptional("latency_p99")

    /**
     * `max_start_time` is the latest trace start time in the thread (RFC3339 date-time).
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxStartTime(): Optional<OffsetDateTime> = maxStartTime.getOptional("max_start_time")

    /**
     * `min_start_time` is the earliest trace start time in the thread (RFC3339 date-time).
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minStartTime(): Optional<OffsetDateTime> = minStartTime.getOptional("min_start_time")

    /**
     * `num_errored_turns` is the count of root traces in the thread (within the query window) whose
     * status was an error.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numErroredTurns(): Optional<Long> = numErroredTurns.getOptional("num_errored_turns")

    /**
     * `start_time` is a reference start time for this row (RFC3339 date-time), such as for sorting.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startTime(): Optional<OffsetDateTime> = startTime.getOptional("start_time")

    /**
     * `thread_id` identifies this conversation thread within the project from the request body
     * `project_id`.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun threadId(): Optional<String> = threadId.getOptional("thread_id")

    /**
     * `total_cost` is the sum of estimated USD cost across those traces.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalCost(): Optional<Double> = totalCost.getOptional("total_cost")

    /**
     * `total_cost_details` sums per-category estimated USD cost across traces in the thread. Keys
     * mirror `total_token_details`.
     *
     * Example: `{"cache_read": 0.012, "reasoning": 0.008}`.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalCostDetails(): Optional<TotalCostDetails> =
        totalCostDetails.getOptional("total_cost_details")

    /**
     * `total_token_details` sums per-category token counts across traces in the thread. Keys are
     * model-specific category names (for example `cache_read`, `cache_write`, `reasoning`,
     * `audio`).
     *
     * Example: `{"cache_read": 400, "reasoning": 120}`.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalTokenDetails(): Optional<TotalTokenDetails> =
        totalTokenDetails.getOptional("total_token_details")

    /**
     * `total_tokens` is the sum of token usage across those traces.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalTokens(): Optional<Long> = totalTokens.getOptional("total_tokens")

    /**
     * `trace_id` is a representative root trace UUID when the summary includes one, for example for
     * deep links.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun traceId(): Optional<String> = traceId.getOptional("trace_id")

    /**
     * Returns the raw JSON value of [count].
     *
     * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Long> = count

    /**
     * Returns the raw JSON value of [feedbackStats].
     *
     * Unlike [feedbackStats], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("feedback_stats")
    @ExcludeMissing
    fun _feedbackStats(): JsonField<FeedbackStats> = feedbackStats

    /**
     * Returns the raw JSON value of [firstInputs].
     *
     * Unlike [firstInputs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("first_inputs")
    @ExcludeMissing
    fun _firstInputs(): JsonField<String> = firstInputs

    /**
     * Returns the raw JSON value of [firstTraceId].
     *
     * Unlike [firstTraceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("first_trace_id")
    @ExcludeMissing
    fun _firstTraceId(): JsonField<String> = firstTraceId

    /**
     * Returns the raw JSON value of [lastError].
     *
     * Unlike [lastError], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_error") @ExcludeMissing fun _lastError(): JsonField<String> = lastError

    /**
     * Returns the raw JSON value of [lastOutputs].
     *
     * Unlike [lastOutputs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_outputs")
    @ExcludeMissing
    fun _lastOutputs(): JsonField<String> = lastOutputs

    /**
     * Returns the raw JSON value of [lastTraceId].
     *
     * Unlike [lastTraceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_trace_id")
    @ExcludeMissing
    fun _lastTraceId(): JsonField<String> = lastTraceId

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
     * Returns the raw JSON value of [maxStartTime].
     *
     * Unlike [maxStartTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_start_time")
    @ExcludeMissing
    fun _maxStartTime(): JsonField<OffsetDateTime> = maxStartTime

    /**
     * Returns the raw JSON value of [minStartTime].
     *
     * Unlike [minStartTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("min_start_time")
    @ExcludeMissing
    fun _minStartTime(): JsonField<OffsetDateTime> = minStartTime

    /**
     * Returns the raw JSON value of [numErroredTurns].
     *
     * Unlike [numErroredTurns], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("num_errored_turns")
    @ExcludeMissing
    fun _numErroredTurns(): JsonField<Long> = numErroredTurns

    /**
     * Returns the raw JSON value of [startTime].
     *
     * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_time")
    @ExcludeMissing
    fun _startTime(): JsonField<OffsetDateTime> = startTime

    /**
     * Returns the raw JSON value of [threadId].
     *
     * Unlike [threadId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("thread_id") @ExcludeMissing fun _threadId(): JsonField<String> = threadId

    /**
     * Returns the raw JSON value of [totalCost].
     *
     * Unlike [totalCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_cost") @ExcludeMissing fun _totalCost(): JsonField<Double> = totalCost

    /**
     * Returns the raw JSON value of [totalCostDetails].
     *
     * Unlike [totalCostDetails], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("total_cost_details")
    @ExcludeMissing
    fun _totalCostDetails(): JsonField<TotalCostDetails> = totalCostDetails

    /**
     * Returns the raw JSON value of [totalTokenDetails].
     *
     * Unlike [totalTokenDetails], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("total_token_details")
    @ExcludeMissing
    fun _totalTokenDetails(): JsonField<TotalTokenDetails> = totalTokenDetails

    /**
     * Returns the raw JSON value of [totalTokens].
     *
     * Unlike [totalTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_tokens") @ExcludeMissing fun _totalTokens(): JsonField<Long> = totalTokens

    /**
     * Returns the raw JSON value of [traceId].
     *
     * Unlike [traceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trace_id") @ExcludeMissing fun _traceId(): JsonField<String> = traceId

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

        /** Returns a mutable builder for constructing an instance of [ThreadListItem]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ThreadListItem]. */
    class Builder internal constructor() {

        private var count: JsonField<Long> = JsonMissing.of()
        private var feedbackStats: JsonField<FeedbackStats> = JsonMissing.of()
        private var firstInputs: JsonField<String> = JsonMissing.of()
        private var firstTraceId: JsonField<String> = JsonMissing.of()
        private var lastError: JsonField<String> = JsonMissing.of()
        private var lastOutputs: JsonField<String> = JsonMissing.of()
        private var lastTraceId: JsonField<String> = JsonMissing.of()
        private var latencyP50: JsonField<Double> = JsonMissing.of()
        private var latencyP99: JsonField<Double> = JsonMissing.of()
        private var maxStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var minStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var numErroredTurns: JsonField<Long> = JsonMissing.of()
        private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var threadId: JsonField<String> = JsonMissing.of()
        private var totalCost: JsonField<Double> = JsonMissing.of()
        private var totalCostDetails: JsonField<TotalCostDetails> = JsonMissing.of()
        private var totalTokenDetails: JsonField<TotalTokenDetails> = JsonMissing.of()
        private var totalTokens: JsonField<Long> = JsonMissing.of()
        private var traceId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(threadListItem: ThreadListItem) = apply {
            count = threadListItem.count
            feedbackStats = threadListItem.feedbackStats
            firstInputs = threadListItem.firstInputs
            firstTraceId = threadListItem.firstTraceId
            lastError = threadListItem.lastError
            lastOutputs = threadListItem.lastOutputs
            lastTraceId = threadListItem.lastTraceId
            latencyP50 = threadListItem.latencyP50
            latencyP99 = threadListItem.latencyP99
            maxStartTime = threadListItem.maxStartTime
            minStartTime = threadListItem.minStartTime
            numErroredTurns = threadListItem.numErroredTurns
            startTime = threadListItem.startTime
            threadId = threadListItem.threadId
            totalCost = threadListItem.totalCost
            totalCostDetails = threadListItem.totalCostDetails
            totalTokenDetails = threadListItem.totalTokenDetails
            totalTokens = threadListItem.totalTokens
            traceId = threadListItem.traceId
            additionalProperties = threadListItem.additionalProperties.toMutableMap()
        }

        /**
         * `count` is how many root traces (conversation turns) fall in this thread for the query
         * time range.
         */
        fun count(count: Long) = count(JsonField.of(count))

        /**
         * Sets [Builder.count] to an arbitrary JSON value.
         *
         * You should usually call [Builder.count] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun count(count: JsonField<Long>) = apply { this.count = count }

        /**
         * `feedback_stats` is the aggregated feedback across traces in the thread, keyed by
         * feedback key; shape matches `feedback_stats` on a single run.
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
         * `first_inputs` is a truncated preview of inputs from the earliest trace in the thread for
         * the query window.
         */
        fun firstInputs(firstInputs: String) = firstInputs(JsonField.of(firstInputs))

        /**
         * Sets [Builder.firstInputs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstInputs] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstInputs(firstInputs: JsonField<String>) = apply { this.firstInputs = firstInputs }

        /**
         * `first_trace_id` is the root trace UUID for the chronologically first trace in the query
         * time window.
         */
        fun firstTraceId(firstTraceId: String) = firstTraceId(JsonField.of(firstTraceId))

        /**
         * Sets [Builder.firstTraceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstTraceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstTraceId(firstTraceId: JsonField<String>) = apply {
            this.firstTraceId = firstTraceId
        }

        /**
         * `last_error` is a short error summary from the most recent failing trace in the thread.
         * Absent when there is no error in the window.
         */
        fun lastError(lastError: String) = lastError(JsonField.of(lastError))

        /**
         * Sets [Builder.lastError] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastError] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lastError(lastError: JsonField<String>) = apply { this.lastError = lastError }

        /**
         * `last_outputs` is a truncated preview of outputs from the latest trace in the thread for
         * the query window.
         */
        fun lastOutputs(lastOutputs: String) = lastOutputs(JsonField.of(lastOutputs))

        /**
         * Sets [Builder.lastOutputs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastOutputs] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lastOutputs(lastOutputs: JsonField<String>) = apply { this.lastOutputs = lastOutputs }

        /**
         * `last_trace_id` is the root trace UUID for the chronologically last trace in the query
         * time window.
         */
        fun lastTraceId(lastTraceId: String) = lastTraceId(JsonField.of(lastTraceId))

        /**
         * Sets [Builder.lastTraceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastTraceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lastTraceId(lastTraceId: JsonField<String>) = apply { this.lastTraceId = lastTraceId }

        /**
         * `latency_p50` is the approximate median end-to-end latency of traces in the thread, in
         * seconds.
         */
        fun latencyP50(latencyP50: Double) = latencyP50(JsonField.of(latencyP50))

        /**
         * Sets [Builder.latencyP50] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latencyP50] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun latencyP50(latencyP50: JsonField<Double>) = apply { this.latencyP50 = latencyP50 }

        /**
         * `latency_p99` is the approximate 99th percentile end-to-end latency of traces in the
         * thread, in seconds.
         */
        fun latencyP99(latencyP99: Double) = latencyP99(JsonField.of(latencyP99))

        /**
         * Sets [Builder.latencyP99] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latencyP99] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun latencyP99(latencyP99: JsonField<Double>) = apply { this.latencyP99 = latencyP99 }

        /** `max_start_time` is the latest trace start time in the thread (RFC3339 date-time). */
        fun maxStartTime(maxStartTime: OffsetDateTime) = maxStartTime(JsonField.of(maxStartTime))

        /**
         * Sets [Builder.maxStartTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxStartTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxStartTime(maxStartTime: JsonField<OffsetDateTime>) = apply {
            this.maxStartTime = maxStartTime
        }

        /** `min_start_time` is the earliest trace start time in the thread (RFC3339 date-time). */
        fun minStartTime(minStartTime: OffsetDateTime) = minStartTime(JsonField.of(minStartTime))

        /**
         * Sets [Builder.minStartTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minStartTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun minStartTime(minStartTime: JsonField<OffsetDateTime>) = apply {
            this.minStartTime = minStartTime
        }

        /**
         * `num_errored_turns` is the count of root traces in the thread (within the query window)
         * whose status was an error.
         */
        fun numErroredTurns(numErroredTurns: Long) = numErroredTurns(JsonField.of(numErroredTurns))

        /**
         * Sets [Builder.numErroredTurns] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numErroredTurns] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numErroredTurns(numErroredTurns: JsonField<Long>) = apply {
            this.numErroredTurns = numErroredTurns
        }

        /**
         * `start_time` is a reference start time for this row (RFC3339 date-time), such as for
         * sorting.
         */
        fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { this.startTime = startTime }

        /**
         * `thread_id` identifies this conversation thread within the project from the request body
         * `project_id`.
         */
        fun threadId(threadId: String) = threadId(JsonField.of(threadId))

        /**
         * Sets [Builder.threadId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threadId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun threadId(threadId: JsonField<String>) = apply { this.threadId = threadId }

        /** `total_cost` is the sum of estimated USD cost across those traces. */
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
         * `total_cost_details` sums per-category estimated USD cost across traces in the thread.
         * Keys mirror `total_token_details`.
         *
         * Example: `{"cache_read": 0.012, "reasoning": 0.008}`.
         */
        fun totalCostDetails(totalCostDetails: TotalCostDetails) =
            totalCostDetails(JsonField.of(totalCostDetails))

        /**
         * Sets [Builder.totalCostDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalCostDetails] with a well-typed [TotalCostDetails]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun totalCostDetails(totalCostDetails: JsonField<TotalCostDetails>) = apply {
            this.totalCostDetails = totalCostDetails
        }

        /**
         * `total_token_details` sums per-category token counts across traces in the thread. Keys
         * are model-specific category names (for example `cache_read`, `cache_write`, `reasoning`,
         * `audio`).
         *
         * Example: `{"cache_read": 400, "reasoning": 120}`.
         */
        fun totalTokenDetails(totalTokenDetails: TotalTokenDetails) =
            totalTokenDetails(JsonField.of(totalTokenDetails))

        /**
         * Sets [Builder.totalTokenDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalTokenDetails] with a well-typed [TotalTokenDetails]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun totalTokenDetails(totalTokenDetails: JsonField<TotalTokenDetails>) = apply {
            this.totalTokenDetails = totalTokenDetails
        }

        /** `total_tokens` is the sum of token usage across those traces. */
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
         * `trace_id` is a representative root trace UUID when the summary includes one, for example
         * for deep links.
         */
        fun traceId(traceId: String) = traceId(JsonField.of(traceId))

        /**
         * Sets [Builder.traceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.traceId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun traceId(traceId: JsonField<String>) = apply { this.traceId = traceId }

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
         * Returns an immutable instance of [ThreadListItem].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ThreadListItem =
            ThreadListItem(
                count,
                feedbackStats,
                firstInputs,
                firstTraceId,
                lastError,
                lastOutputs,
                lastTraceId,
                latencyP50,
                latencyP99,
                maxStartTime,
                minStartTime,
                numErroredTurns,
                startTime,
                threadId,
                totalCost,
                totalCostDetails,
                totalTokenDetails,
                totalTokens,
                traceId,
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
    fun validate(): ThreadListItem = apply {
        if (validated) {
            return@apply
        }

        count()
        feedbackStats().ifPresent { it.validate() }
        firstInputs()
        firstTraceId()
        lastError()
        lastOutputs()
        lastTraceId()
        latencyP50()
        latencyP99()
        maxStartTime()
        minStartTime()
        numErroredTurns()
        startTime()
        threadId()
        totalCost()
        totalCostDetails().ifPresent { it.validate() }
        totalTokenDetails().ifPresent { it.validate() }
        totalTokens()
        traceId()
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
        (if (count.asKnown().isPresent) 1 else 0) +
            (feedbackStats.asKnown().getOrNull()?.validity() ?: 0) +
            (if (firstInputs.asKnown().isPresent) 1 else 0) +
            (if (firstTraceId.asKnown().isPresent) 1 else 0) +
            (if (lastError.asKnown().isPresent) 1 else 0) +
            (if (lastOutputs.asKnown().isPresent) 1 else 0) +
            (if (lastTraceId.asKnown().isPresent) 1 else 0) +
            (if (latencyP50.asKnown().isPresent) 1 else 0) +
            (if (latencyP99.asKnown().isPresent) 1 else 0) +
            (if (maxStartTime.asKnown().isPresent) 1 else 0) +
            (if (minStartTime.asKnown().isPresent) 1 else 0) +
            (if (numErroredTurns.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (if (threadId.asKnown().isPresent) 1 else 0) +
            (if (totalCost.asKnown().isPresent) 1 else 0) +
            (totalCostDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (totalTokenDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (if (totalTokens.asKnown().isPresent) 1 else 0) +
            (if (traceId.asKnown().isPresent) 1 else 0)

    /**
     * `feedback_stats` is the aggregated feedback across traces in the thread, keyed by feedback
     * key; shape matches `feedback_stats` on a single run.
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
     * `total_cost_details` sums per-category estimated USD cost across traces in the thread. Keys
     * mirror `total_token_details`.
     *
     * Example: `{"cache_read": 0.012, "reasoning": 0.008}`.
     */
    class TotalCostDetails
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

            /** Returns a mutable builder for constructing an instance of [TotalCostDetails]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TotalCostDetails]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(totalCostDetails: TotalCostDetails) = apply {
                additionalProperties = totalCostDetails.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [TotalCostDetails].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): TotalCostDetails = TotalCostDetails(additionalProperties.toImmutable())
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
        fun validate(): TotalCostDetails = apply {
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

            return other is TotalCostDetails && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "TotalCostDetails{additionalProperties=$additionalProperties}"
    }

    /**
     * `total_token_details` sums per-category token counts across traces in the thread. Keys are
     * model-specific category names (for example `cache_read`, `cache_write`, `reasoning`,
     * `audio`).
     *
     * Example: `{"cache_read": 400, "reasoning": 120}`.
     */
    class TotalTokenDetails
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

            /** Returns a mutable builder for constructing an instance of [TotalTokenDetails]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TotalTokenDetails]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(totalTokenDetails: TotalTokenDetails) = apply {
                additionalProperties = totalTokenDetails.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [TotalTokenDetails].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): TotalTokenDetails = TotalTokenDetails(additionalProperties.toImmutable())
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
        fun validate(): TotalTokenDetails = apply {
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

            return other is TotalTokenDetails && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "TotalTokenDetails{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ThreadListItem &&
            count == other.count &&
            feedbackStats == other.feedbackStats &&
            firstInputs == other.firstInputs &&
            firstTraceId == other.firstTraceId &&
            lastError == other.lastError &&
            lastOutputs == other.lastOutputs &&
            lastTraceId == other.lastTraceId &&
            latencyP50 == other.latencyP50 &&
            latencyP99 == other.latencyP99 &&
            maxStartTime == other.maxStartTime &&
            minStartTime == other.minStartTime &&
            numErroredTurns == other.numErroredTurns &&
            startTime == other.startTime &&
            threadId == other.threadId &&
            totalCost == other.totalCost &&
            totalCostDetails == other.totalCostDetails &&
            totalTokenDetails == other.totalTokenDetails &&
            totalTokens == other.totalTokens &&
            traceId == other.traceId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            count,
            feedbackStats,
            firstInputs,
            firstTraceId,
            lastError,
            lastOutputs,
            lastTraceId,
            latencyP50,
            latencyP99,
            maxStartTime,
            minStartTime,
            numErroredTurns,
            startTime,
            threadId,
            totalCost,
            totalCostDetails,
            totalTokenDetails,
            totalTokens,
            traceId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ThreadListItem{count=$count, feedbackStats=$feedbackStats, firstInputs=$firstInputs, firstTraceId=$firstTraceId, lastError=$lastError, lastOutputs=$lastOutputs, lastTraceId=$lastTraceId, latencyP50=$latencyP50, latencyP99=$latencyP99, maxStartTime=$maxStartTime, minStartTime=$minStartTime, numErroredTurns=$numErroredTurns, startTime=$startTime, threadId=$threadId, totalCost=$totalCost, totalCostDetails=$totalCostDetails, totalTokenDetails=$totalTokenDetails, totalTokens=$totalTokens, traceId=$traceId, additionalProperties=$additionalProperties}"
}

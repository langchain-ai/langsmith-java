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

class ThreadTraceListItem
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val completionCost: JsonField<Double>,
    private val completionCostDetails: JsonField<CompletionCostDetails>,
    private val completionTokenDetails: JsonField<CompletionTokenDetails>,
    private val completionTokens: JsonField<Long>,
    private val endTime: JsonField<OffsetDateTime>,
    private val errorPreview: JsonField<String>,
    private val firstTokenTime: JsonField<OffsetDateTime>,
    private val inputsPreview: JsonField<String>,
    private val latency: JsonField<Double>,
    private val name: JsonField<String>,
    private val op: JsonField<Double>,
    private val outputsPreview: JsonField<String>,
    private val promptCost: JsonField<Double>,
    private val promptCostDetails: JsonField<PromptCostDetails>,
    private val promptTokenDetails: JsonField<PromptTokenDetails>,
    private val promptTokens: JsonField<Long>,
    private val startTime: JsonField<OffsetDateTime>,
    private val threadId: JsonField<String>,
    private val totalCost: JsonField<Double>,
    private val totalTokens: JsonField<Long>,
    private val traceId: JsonField<String>,
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
        @JsonProperty("end_time")
        @ExcludeMissing
        endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("error_preview")
        @ExcludeMissing
        errorPreview: JsonField<String> = JsonMissing.of(),
        @JsonProperty("first_token_time")
        @ExcludeMissing
        firstTokenTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("inputs_preview")
        @ExcludeMissing
        inputsPreview: JsonField<String> = JsonMissing.of(),
        @JsonProperty("latency") @ExcludeMissing latency: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("op") @ExcludeMissing op: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("outputs_preview")
        @ExcludeMissing
        outputsPreview: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("start_time")
        @ExcludeMissing
        startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("thread_id") @ExcludeMissing threadId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_cost") @ExcludeMissing totalCost: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("total_tokens")
        @ExcludeMissing
        totalTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("trace_id") @ExcludeMissing traceId: JsonField<String> = JsonMissing.of(),
    ) : this(
        completionCost,
        completionCostDetails,
        completionTokenDetails,
        completionTokens,
        endTime,
        errorPreview,
        firstTokenTime,
        inputsPreview,
        latency,
        name,
        op,
        outputsPreview,
        promptCost,
        promptCostDetails,
        promptTokenDetails,
        promptTokens,
        startTime,
        threadId,
        totalCost,
        totalTokens,
        traceId,
        mutableMapOf(),
    )

    /**
     * `completion_cost` is the estimated USD cost for the completion. Omitted unless included in
     * `selects`.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completionCost(): Optional<Double> = completionCost.getOptional("completion_cost")

    /**
     * `completion_cost_details` is the USD cost breakdown for completion-side categories;
     * per-category values are under `raw`. Omitted unless included in `selects`.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completionCostDetails(): Optional<CompletionCostDetails> =
        completionCostDetails.getOptional("completion_cost_details")

    /**
     * `completion_token_details` is the completion-side token breakdown by category; per-category
     * counts are under `raw`. Omitted unless included in `selects`.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completionTokenDetails(): Optional<CompletionTokenDetails> =
        completionTokenDetails.getOptional("completion_token_details")

    /**
     * `completion_tokens` is the completion-side token count. Omitted unless included in `selects`.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completionTokens(): Optional<Long> = completionTokens.getOptional("completion_tokens")

    /**
     * `end_time` is when the root run ended (RFC3339 date-time). JSON null if the run is still in
     * progress. Omitted unless included in `selects`.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("end_time")

    /**
     * `error_preview` is a short error summary when the run failed. Omitted unless included in
     * `selects`.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errorPreview(): Optional<String> = errorPreview.getOptional("error_preview")

    /**
     * `first_token_time` is when the first output token was produced (RFC3339 date-time), for
     * streamed runs when that metadata exists. Omitted unless included in `selects`.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstTokenTime(): Optional<OffsetDateTime> = firstTokenTime.getOptional("first_token_time")

    /**
     * `inputs_preview` is a truncated text preview of inputs. Omitted unless included in `selects`.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inputsPreview(): Optional<String> = inputsPreview.getOptional("inputs_preview")

    /**
     * `latency` is wall-clock duration from start to end in seconds. Omitted unless included in
     * `selects`.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun latency(): Optional<Double> = latency.getOptional("latency")

    /**
     * `name` is a human-readable label for the root run (for example the model name, function name,
     * or step name chosen when the run was traced). Omitted unless included in `selects`.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * `op` is a numeric code identifying the root run's `run_type` (for example LLM vs. tool vs.
     * chain). Encoded as a number for compatibility with legacy clients; prefer the string
     * `run_type` on `RunResponse` when available. Omitted unless included in `selects`.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun op(): Optional<Double> = op.getOptional("op")

    /**
     * `outputs_preview` is a truncated text preview of outputs. Omitted unless included in
     * `selects`.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outputsPreview(): Optional<String> = outputsPreview.getOptional("outputs_preview")

    /**
     * `prompt_cost` is the estimated USD cost for the prompt. Omitted unless included in `selects`.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptCost(): Optional<Double> = promptCost.getOptional("prompt_cost")

    /**
     * `prompt_cost_details` is the USD cost breakdown for prompt-side categories; per-category
     * values are under `raw`. Omitted unless included in `selects`.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptCostDetails(): Optional<PromptCostDetails> =
        promptCostDetails.getOptional("prompt_cost_details")

    /**
     * `prompt_token_details` is the prompt-side token breakdown by category; per-category counts
     * are under nested `raw`. Omitted unless included in `selects`.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptTokenDetails(): Optional<PromptTokenDetails> =
        promptTokenDetails.getOptional("prompt_token_details")

    /**
     * `prompt_tokens` is the prompt-side token count. Omitted unless included in `selects`.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptTokens(): Optional<Long> = promptTokens.getOptional("prompt_tokens")

    /**
     * `start_time` is when the trace started (RFC3339 date-time). Omitted unless included in
     * `selects`.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startTime(): Optional<OffsetDateTime> = startTime.getOptional("start_time")

    /**
     * `thread_id` is the conversation thread UUID that contains this trace. Matches the `thread_id`
     * path parameter of the request. Omitted unless included in `selects`.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun threadId(): Optional<String> = threadId.getOptional("thread_id")

    /**
     * `total_cost` is the estimated total USD cost for the root run. Omitted unless included in
     * `selects`.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalCost(): Optional<Double> = totalCost.getOptional("total_cost")

    /**
     * `total_tokens` is the total token count (prompt plus completion). Omitted unless included in
     * `selects`.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalTokens(): Optional<Long> = totalTokens.getOptional("total_tokens")

    /**
     * `trace_id` is the UUID of this trace (the root run). Always present.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun traceId(): Optional<String> = traceId.getOptional("trace_id")

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
     * Returns the raw JSON value of [endTime].
     *
     * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_time") @ExcludeMissing fun _endTime(): JsonField<OffsetDateTime> = endTime

    /**
     * Returns the raw JSON value of [errorPreview].
     *
     * Unlike [errorPreview], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error_preview")
    @ExcludeMissing
    fun _errorPreview(): JsonField<String> = errorPreview

    /**
     * Returns the raw JSON value of [firstTokenTime].
     *
     * Unlike [firstTokenTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("first_token_time")
    @ExcludeMissing
    fun _firstTokenTime(): JsonField<OffsetDateTime> = firstTokenTime

    /**
     * Returns the raw JSON value of [inputsPreview].
     *
     * Unlike [inputsPreview], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inputs_preview")
    @ExcludeMissing
    fun _inputsPreview(): JsonField<String> = inputsPreview

    /**
     * Returns the raw JSON value of [latency].
     *
     * Unlike [latency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("latency") @ExcludeMissing fun _latency(): JsonField<Double> = latency

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [op].
     *
     * Unlike [op], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("op") @ExcludeMissing fun _op(): JsonField<Double> = op

    /**
     * Returns the raw JSON value of [outputsPreview].
     *
     * Unlike [outputsPreview], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("outputs_preview")
    @ExcludeMissing
    fun _outputsPreview(): JsonField<String> = outputsPreview

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

        /** Returns a mutable builder for constructing an instance of [ThreadTraceListItem]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ThreadTraceListItem]. */
    class Builder internal constructor() {

        private var completionCost: JsonField<Double> = JsonMissing.of()
        private var completionCostDetails: JsonField<CompletionCostDetails> = JsonMissing.of()
        private var completionTokenDetails: JsonField<CompletionTokenDetails> = JsonMissing.of()
        private var completionTokens: JsonField<Long> = JsonMissing.of()
        private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var errorPreview: JsonField<String> = JsonMissing.of()
        private var firstTokenTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var inputsPreview: JsonField<String> = JsonMissing.of()
        private var latency: JsonField<Double> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var op: JsonField<Double> = JsonMissing.of()
        private var outputsPreview: JsonField<String> = JsonMissing.of()
        private var promptCost: JsonField<Double> = JsonMissing.of()
        private var promptCostDetails: JsonField<PromptCostDetails> = JsonMissing.of()
        private var promptTokenDetails: JsonField<PromptTokenDetails> = JsonMissing.of()
        private var promptTokens: JsonField<Long> = JsonMissing.of()
        private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var threadId: JsonField<String> = JsonMissing.of()
        private var totalCost: JsonField<Double> = JsonMissing.of()
        private var totalTokens: JsonField<Long> = JsonMissing.of()
        private var traceId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(threadTraceListItem: ThreadTraceListItem) = apply {
            completionCost = threadTraceListItem.completionCost
            completionCostDetails = threadTraceListItem.completionCostDetails
            completionTokenDetails = threadTraceListItem.completionTokenDetails
            completionTokens = threadTraceListItem.completionTokens
            endTime = threadTraceListItem.endTime
            errorPreview = threadTraceListItem.errorPreview
            firstTokenTime = threadTraceListItem.firstTokenTime
            inputsPreview = threadTraceListItem.inputsPreview
            latency = threadTraceListItem.latency
            name = threadTraceListItem.name
            op = threadTraceListItem.op
            outputsPreview = threadTraceListItem.outputsPreview
            promptCost = threadTraceListItem.promptCost
            promptCostDetails = threadTraceListItem.promptCostDetails
            promptTokenDetails = threadTraceListItem.promptTokenDetails
            promptTokens = threadTraceListItem.promptTokens
            startTime = threadTraceListItem.startTime
            threadId = threadTraceListItem.threadId
            totalCost = threadTraceListItem.totalCost
            totalTokens = threadTraceListItem.totalTokens
            traceId = threadTraceListItem.traceId
            additionalProperties = threadTraceListItem.additionalProperties.toMutableMap()
        }

        /**
         * `completion_cost` is the estimated USD cost for the completion. Omitted unless included
         * in `selects`.
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
         * `completion_cost_details` is the USD cost breakdown for completion-side categories;
         * per-category values are under `raw`. Omitted unless included in `selects`.
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
         * `completion_token_details` is the completion-side token breakdown by category;
         * per-category counts are under `raw`. Omitted unless included in `selects`.
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
         * `completion_tokens` is the completion-side token count. Omitted unless included in
         * `selects`.
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
         * `end_time` is when the root run ended (RFC3339 date-time). JSON null if the run is still
         * in progress. Omitted unless included in `selects`.
         */
        fun endTime(endTime: OffsetDateTime) = endTime(JsonField.of(endTime))

        /**
         * Sets [Builder.endTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endTime(endTime: JsonField<OffsetDateTime>) = apply { this.endTime = endTime }

        /**
         * `error_preview` is a short error summary when the run failed. Omitted unless included in
         * `selects`.
         */
        fun errorPreview(errorPreview: String) = errorPreview(JsonField.of(errorPreview))

        /**
         * Sets [Builder.errorPreview] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorPreview] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errorPreview(errorPreview: JsonField<String>) = apply {
            this.errorPreview = errorPreview
        }

        /**
         * `first_token_time` is when the first output token was produced (RFC3339 date-time), for
         * streamed runs when that metadata exists. Omitted unless included in `selects`.
         */
        fun firstTokenTime(firstTokenTime: OffsetDateTime) =
            firstTokenTime(JsonField.of(firstTokenTime))

        /**
         * Sets [Builder.firstTokenTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstTokenTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun firstTokenTime(firstTokenTime: JsonField<OffsetDateTime>) = apply {
            this.firstTokenTime = firstTokenTime
        }

        /**
         * `inputs_preview` is a truncated text preview of inputs. Omitted unless included in
         * `selects`.
         */
        fun inputsPreview(inputsPreview: String) = inputsPreview(JsonField.of(inputsPreview))

        /**
         * Sets [Builder.inputsPreview] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputsPreview] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inputsPreview(inputsPreview: JsonField<String>) = apply {
            this.inputsPreview = inputsPreview
        }

        /**
         * `latency` is wall-clock duration from start to end in seconds. Omitted unless included in
         * `selects`.
         */
        fun latency(latency: Double) = latency(JsonField.of(latency))

        /**
         * Sets [Builder.latency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latency] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun latency(latency: JsonField<Double>) = apply { this.latency = latency }

        /**
         * `name` is a human-readable label for the root run (for example the model name, function
         * name, or step name chosen when the run was traced). Omitted unless included in `selects`.
         */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * `op` is a numeric code identifying the root run's `run_type` (for example LLM vs. tool
         * vs. chain). Encoded as a number for compatibility with legacy clients; prefer the string
         * `run_type` on `RunResponse` when available. Omitted unless included in `selects`.
         */
        fun op(op: Double) = op(JsonField.of(op))

        /**
         * Sets [Builder.op] to an arbitrary JSON value.
         *
         * You should usually call [Builder.op] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun op(op: JsonField<Double>) = apply { this.op = op }

        /**
         * `outputs_preview` is a truncated text preview of outputs. Omitted unless included in
         * `selects`.
         */
        fun outputsPreview(outputsPreview: String) = outputsPreview(JsonField.of(outputsPreview))

        /**
         * Sets [Builder.outputsPreview] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputsPreview] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun outputsPreview(outputsPreview: JsonField<String>) = apply {
            this.outputsPreview = outputsPreview
        }

        /**
         * `prompt_cost` is the estimated USD cost for the prompt. Omitted unless included in
         * `selects`.
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
         * `prompt_cost_details` is the USD cost breakdown for prompt-side categories; per-category
         * values are under `raw`. Omitted unless included in `selects`.
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
         * `prompt_token_details` is the prompt-side token breakdown by category; per-category
         * counts are under nested `raw`. Omitted unless included in `selects`.
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

        /** `prompt_tokens` is the prompt-side token count. Omitted unless included in `selects`. */
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
         * `start_time` is when the trace started (RFC3339 date-time). Omitted unless included in
         * `selects`.
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
         * `thread_id` is the conversation thread UUID that contains this trace. Matches the
         * `thread_id` path parameter of the request. Omitted unless included in `selects`.
         */
        fun threadId(threadId: String) = threadId(JsonField.of(threadId))

        /**
         * Sets [Builder.threadId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threadId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun threadId(threadId: JsonField<String>) = apply { this.threadId = threadId }

        /**
         * `total_cost` is the estimated total USD cost for the root run. Omitted unless included in
         * `selects`.
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
         * `total_tokens` is the total token count (prompt plus completion). Omitted unless included
         * in `selects`.
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

        /** `trace_id` is the UUID of this trace (the root run). Always present. */
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
         * Returns an immutable instance of [ThreadTraceListItem].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ThreadTraceListItem =
            ThreadTraceListItem(
                completionCost,
                completionCostDetails,
                completionTokenDetails,
                completionTokens,
                endTime,
                errorPreview,
                firstTokenTime,
                inputsPreview,
                latency,
                name,
                op,
                outputsPreview,
                promptCost,
                promptCostDetails,
                promptTokenDetails,
                promptTokens,
                startTime,
                threadId,
                totalCost,
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
    fun validate(): ThreadTraceListItem = apply {
        if (validated) {
            return@apply
        }

        completionCost()
        completionCostDetails().ifPresent { it.validate() }
        completionTokenDetails().ifPresent { it.validate() }
        completionTokens()
        endTime()
        errorPreview()
        firstTokenTime()
        inputsPreview()
        latency()
        name()
        op()
        outputsPreview()
        promptCost()
        promptCostDetails().ifPresent { it.validate() }
        promptTokenDetails().ifPresent { it.validate() }
        promptTokens()
        startTime()
        threadId()
        totalCost()
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
        (if (completionCost.asKnown().isPresent) 1 else 0) +
            (completionCostDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (completionTokenDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (if (completionTokens.asKnown().isPresent) 1 else 0) +
            (if (endTime.asKnown().isPresent) 1 else 0) +
            (if (errorPreview.asKnown().isPresent) 1 else 0) +
            (if (firstTokenTime.asKnown().isPresent) 1 else 0) +
            (if (inputsPreview.asKnown().isPresent) 1 else 0) +
            (if (latency.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (op.asKnown().isPresent) 1 else 0) +
            (if (outputsPreview.asKnown().isPresent) 1 else 0) +
            (if (promptCost.asKnown().isPresent) 1 else 0) +
            (promptCostDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (promptTokenDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (if (promptTokens.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (if (threadId.asKnown().isPresent) 1 else 0) +
            (if (totalCost.asKnown().isPresent) 1 else 0) +
            (if (totalTokens.asKnown().isPresent) 1 else 0) +
            (if (traceId.asKnown().isPresent) 1 else 0)

    /**
     * `completion_cost_details` is the USD cost breakdown for completion-side categories;
     * per-category values are under `raw`. Omitted unless included in `selects`.
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
     * `completion_token_details` is the completion-side token breakdown by category; per-category
     * counts are under `raw`. Omitted unless included in `selects`.
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
     * `prompt_cost_details` is the USD cost breakdown for prompt-side categories; per-category
     * values are under `raw`. Omitted unless included in `selects`.
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
     * `prompt_token_details` is the prompt-side token breakdown by category; per-category counts
     * are under nested `raw`. Omitted unless included in `selects`.
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

        return other is ThreadTraceListItem &&
            completionCost == other.completionCost &&
            completionCostDetails == other.completionCostDetails &&
            completionTokenDetails == other.completionTokenDetails &&
            completionTokens == other.completionTokens &&
            endTime == other.endTime &&
            errorPreview == other.errorPreview &&
            firstTokenTime == other.firstTokenTime &&
            inputsPreview == other.inputsPreview &&
            latency == other.latency &&
            name == other.name &&
            op == other.op &&
            outputsPreview == other.outputsPreview &&
            promptCost == other.promptCost &&
            promptCostDetails == other.promptCostDetails &&
            promptTokenDetails == other.promptTokenDetails &&
            promptTokens == other.promptTokens &&
            startTime == other.startTime &&
            threadId == other.threadId &&
            totalCost == other.totalCost &&
            totalTokens == other.totalTokens &&
            traceId == other.traceId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            completionCost,
            completionCostDetails,
            completionTokenDetails,
            completionTokens,
            endTime,
            errorPreview,
            firstTokenTime,
            inputsPreview,
            latency,
            name,
            op,
            outputsPreview,
            promptCost,
            promptCostDetails,
            promptTokenDetails,
            promptTokens,
            startTime,
            threadId,
            totalCost,
            totalTokens,
            traceId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ThreadTraceListItem{completionCost=$completionCost, completionCostDetails=$completionCostDetails, completionTokenDetails=$completionTokenDetails, completionTokens=$completionTokens, endTime=$endTime, errorPreview=$errorPreview, firstTokenTime=$firstTokenTime, inputsPreview=$inputsPreview, latency=$latency, name=$name, op=$op, outputsPreview=$outputsPreview, promptCost=$promptCost, promptCostDetails=$promptCostDetails, promptTokenDetails=$promptTokenDetails, promptTokens=$promptTokens, startTime=$startTime, threadId=$threadId, totalCost=$totalCost, totalTokens=$totalTokens, traceId=$traceId, additionalProperties=$additionalProperties}"
}

// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import com.langchain.smith.models.orgs.ttlsettings.TraceTier
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** TracerSession schema. */
class TracerSession
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val tenantId: JsonField<String>,
    private val completionCost: JsonField<String>,
    private val completionTokens: JsonField<Long>,
    private val defaultDatasetId: JsonField<String>,
    private val description: JsonField<String>,
    private val endTime: JsonField<OffsetDateTime>,
    private val errorRate: JsonField<Double>,
    private val extra: JsonValue,
    private val feedbackStats: JsonValue,
    private val firstTokenP50: JsonField<Double>,
    private val firstTokenP99: JsonField<Double>,
    private val lastRunStartTime: JsonField<OffsetDateTime>,
    private val lastRunStartTimeLive: JsonField<OffsetDateTime>,
    private val latencyP50: JsonField<Double>,
    private val latencyP99: JsonField<Double>,
    private val name: JsonField<String>,
    private val promptCost: JsonField<String>,
    private val promptTokens: JsonField<Long>,
    private val referenceDatasetId: JsonField<String>,
    private val runCount: JsonField<Long>,
    private val runFacets: JsonField<List<JsonValue>>,
    private val sessionFeedbackStats: JsonValue,
    private val startTime: JsonField<OffsetDateTime>,
    private val streamingRate: JsonField<Double>,
    private val testRunNumber: JsonField<Long>,
    private val totalCost: JsonField<String>,
    private val totalTokens: JsonField<Long>,
    private val traceTier: JsonField<TraceTier>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tenant_id") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("completion_cost")
        @ExcludeMissing
        completionCost: JsonField<String> = JsonMissing.of(),
        @JsonProperty("completion_tokens")
        @ExcludeMissing
        completionTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("default_dataset_id")
        @ExcludeMissing
        defaultDatasetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("end_time")
        @ExcludeMissing
        endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("error_rate") @ExcludeMissing errorRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("extra") @ExcludeMissing extra: JsonValue = JsonMissing.of(),
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
        @JsonProperty("last_run_start_time_live")
        @ExcludeMissing
        lastRunStartTimeLive: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("latency_p50")
        @ExcludeMissing
        latencyP50: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("latency_p99")
        @ExcludeMissing
        latencyP99: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prompt_cost")
        @ExcludeMissing
        promptCost: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prompt_tokens")
        @ExcludeMissing
        promptTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("reference_dataset_id")
        @ExcludeMissing
        referenceDatasetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("run_count") @ExcludeMissing runCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("run_facets")
        @ExcludeMissing
        runFacets: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonProperty("session_feedback_stats")
        @ExcludeMissing
        sessionFeedbackStats: JsonValue = JsonMissing.of(),
        @JsonProperty("start_time")
        @ExcludeMissing
        startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("streaming_rate")
        @ExcludeMissing
        streamingRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("test_run_number")
        @ExcludeMissing
        testRunNumber: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("total_cost") @ExcludeMissing totalCost: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_tokens")
        @ExcludeMissing
        totalTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("trace_tier")
        @ExcludeMissing
        traceTier: JsonField<TraceTier> = JsonMissing.of(),
    ) : this(
        id,
        tenantId,
        completionCost,
        completionTokens,
        defaultDatasetId,
        description,
        endTime,
        errorRate,
        extra,
        feedbackStats,
        firstTokenP50,
        firstTokenP99,
        lastRunStartTime,
        lastRunStartTimeLive,
        latencyP50,
        latencyP99,
        name,
        promptCost,
        promptTokens,
        referenceDatasetId,
        runCount,
        runFacets,
        sessionFeedbackStats,
        startTime,
        streamingRate,
        testRunNumber,
        totalCost,
        totalTokens,
        traceTier,
        mutableMapOf(),
    )

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tenantId(): String = tenantId.getRequired("tenant_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completionCost(): Optional<String> = completionCost.getOptional("completion_cost")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completionTokens(): Optional<Long> = completionTokens.getOptional("completion_tokens")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultDatasetId(): Optional<String> = defaultDatasetId.getOptional("default_dataset_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("end_time")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errorRate(): Optional<Double> = errorRate.getOptional("error_rate")

    @JsonProperty("extra") @ExcludeMissing fun _extra(): JsonValue = extra

    @JsonProperty("feedback_stats") @ExcludeMissing fun _feedbackStats(): JsonValue = feedbackStats

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstTokenP50(): Optional<Double> = firstTokenP50.getOptional("first_token_p50")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstTokenP99(): Optional<Double> = firstTokenP99.getOptional("first_token_p99")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastRunStartTime(): Optional<OffsetDateTime> =
        lastRunStartTime.getOptional("last_run_start_time")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastRunStartTimeLive(): Optional<OffsetDateTime> =
        lastRunStartTimeLive.getOptional("last_run_start_time_live")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun latencyP50(): Optional<Double> = latencyP50.getOptional("latency_p50")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun latencyP99(): Optional<Double> = latencyP99.getOptional("latency_p99")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptCost(): Optional<String> = promptCost.getOptional("prompt_cost")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptTokens(): Optional<Long> = promptTokens.getOptional("prompt_tokens")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referenceDatasetId(): Optional<String> =
        referenceDatasetId.getOptional("reference_dataset_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runCount(): Optional<Long> = runCount.getOptional("run_count")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runFacets(): Optional<List<JsonValue>> = runFacets.getOptional("run_facets")

    @JsonProperty("session_feedback_stats")
    @ExcludeMissing
    fun _sessionFeedbackStats(): JsonValue = sessionFeedbackStats

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startTime(): Optional<OffsetDateTime> = startTime.getOptional("start_time")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun streamingRate(): Optional<Double> = streamingRate.getOptional("streaming_rate")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun testRunNumber(): Optional<Long> = testRunNumber.getOptional("test_run_number")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalCost(): Optional<String> = totalCost.getOptional("total_cost")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalTokens(): Optional<Long> = totalTokens.getOptional("total_tokens")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun traceTier(): Optional<TraceTier> = traceTier.getOptional("trace_tier")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [tenantId].
     *
     * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

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
     * Returns the raw JSON value of [defaultDatasetId].
     *
     * Unlike [defaultDatasetId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("default_dataset_id")
    @ExcludeMissing
    fun _defaultDatasetId(): JsonField<String> = defaultDatasetId

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [endTime].
     *
     * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_time") @ExcludeMissing fun _endTime(): JsonField<OffsetDateTime> = endTime

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
     * Returns the raw JSON value of [lastRunStartTimeLive].
     *
     * Unlike [lastRunStartTimeLive], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("last_run_start_time_live")
    @ExcludeMissing
    fun _lastRunStartTimeLive(): JsonField<OffsetDateTime> = lastRunStartTimeLive

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
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
     * Returns the raw JSON value of [referenceDatasetId].
     *
     * Unlike [referenceDatasetId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("reference_dataset_id")
    @ExcludeMissing
    fun _referenceDatasetId(): JsonField<String> = referenceDatasetId

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
     * Returns the raw JSON value of [startTime].
     *
     * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_time")
    @ExcludeMissing
    fun _startTime(): JsonField<OffsetDateTime> = startTime

    /**
     * Returns the raw JSON value of [streamingRate].
     *
     * Unlike [streamingRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("streaming_rate")
    @ExcludeMissing
    fun _streamingRate(): JsonField<Double> = streamingRate

    /**
     * Returns the raw JSON value of [testRunNumber].
     *
     * Unlike [testRunNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("test_run_number")
    @ExcludeMissing
    fun _testRunNumber(): JsonField<Long> = testRunNumber

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

    /**
     * Returns the raw JSON value of [traceTier].
     *
     * Unlike [traceTier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trace_tier") @ExcludeMissing fun _traceTier(): JsonField<TraceTier> = traceTier

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
         * Returns a mutable builder for constructing an instance of [TracerSession].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .tenantId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TracerSession]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var tenantId: JsonField<String>? = null
        private var completionCost: JsonField<String> = JsonMissing.of()
        private var completionTokens: JsonField<Long> = JsonMissing.of()
        private var defaultDatasetId: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var errorRate: JsonField<Double> = JsonMissing.of()
        private var extra: JsonValue = JsonMissing.of()
        private var feedbackStats: JsonValue = JsonMissing.of()
        private var firstTokenP50: JsonField<Double> = JsonMissing.of()
        private var firstTokenP99: JsonField<Double> = JsonMissing.of()
        private var lastRunStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastRunStartTimeLive: JsonField<OffsetDateTime> = JsonMissing.of()
        private var latencyP50: JsonField<Double> = JsonMissing.of()
        private var latencyP99: JsonField<Double> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var promptCost: JsonField<String> = JsonMissing.of()
        private var promptTokens: JsonField<Long> = JsonMissing.of()
        private var referenceDatasetId: JsonField<String> = JsonMissing.of()
        private var runCount: JsonField<Long> = JsonMissing.of()
        private var runFacets: JsonField<MutableList<JsonValue>>? = null
        private var sessionFeedbackStats: JsonValue = JsonMissing.of()
        private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var streamingRate: JsonField<Double> = JsonMissing.of()
        private var testRunNumber: JsonField<Long> = JsonMissing.of()
        private var totalCost: JsonField<String> = JsonMissing.of()
        private var totalTokens: JsonField<Long> = JsonMissing.of()
        private var traceTier: JsonField<TraceTier> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tracerSession: TracerSession) = apply {
            id = tracerSession.id
            tenantId = tracerSession.tenantId
            completionCost = tracerSession.completionCost
            completionTokens = tracerSession.completionTokens
            defaultDatasetId = tracerSession.defaultDatasetId
            description = tracerSession.description
            endTime = tracerSession.endTime
            errorRate = tracerSession.errorRate
            extra = tracerSession.extra
            feedbackStats = tracerSession.feedbackStats
            firstTokenP50 = tracerSession.firstTokenP50
            firstTokenP99 = tracerSession.firstTokenP99
            lastRunStartTime = tracerSession.lastRunStartTime
            lastRunStartTimeLive = tracerSession.lastRunStartTimeLive
            latencyP50 = tracerSession.latencyP50
            latencyP99 = tracerSession.latencyP99
            name = tracerSession.name
            promptCost = tracerSession.promptCost
            promptTokens = tracerSession.promptTokens
            referenceDatasetId = tracerSession.referenceDatasetId
            runCount = tracerSession.runCount
            runFacets = tracerSession.runFacets.map { it.toMutableList() }
            sessionFeedbackStats = tracerSession.sessionFeedbackStats
            startTime = tracerSession.startTime
            streamingRate = tracerSession.streamingRate
            testRunNumber = tracerSession.testRunNumber
            totalCost = tracerSession.totalCost
            totalTokens = tracerSession.totalTokens
            traceTier = tracerSession.traceTier
            additionalProperties = tracerSession.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

        /**
         * Sets [Builder.tenantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tenantId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

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

        fun defaultDatasetId(defaultDatasetId: String?) =
            defaultDatasetId(JsonField.ofNullable(defaultDatasetId))

        /** Alias for calling [Builder.defaultDatasetId] with `defaultDatasetId.orElse(null)`. */
        fun defaultDatasetId(defaultDatasetId: Optional<String>) =
            defaultDatasetId(defaultDatasetId.getOrNull())

        /**
         * Sets [Builder.defaultDatasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultDatasetId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultDatasetId(defaultDatasetId: JsonField<String>) = apply {
            this.defaultDatasetId = defaultDatasetId
        }

        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun endTime(endTime: OffsetDateTime?) = endTime(JsonField.ofNullable(endTime))

        /** Alias for calling [Builder.endTime] with `endTime.orElse(null)`. */
        fun endTime(endTime: Optional<OffsetDateTime>) = endTime(endTime.getOrNull())

        /**
         * Sets [Builder.endTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endTime(endTime: JsonField<OffsetDateTime>) = apply { this.endTime = endTime }

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

        fun extra(extra: JsonValue) = apply { this.extra = extra }

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

        fun lastRunStartTimeLive(lastRunStartTimeLive: OffsetDateTime?) =
            lastRunStartTimeLive(JsonField.ofNullable(lastRunStartTimeLive))

        /**
         * Alias for calling [Builder.lastRunStartTimeLive] with
         * `lastRunStartTimeLive.orElse(null)`.
         */
        fun lastRunStartTimeLive(lastRunStartTimeLive: Optional<OffsetDateTime>) =
            lastRunStartTimeLive(lastRunStartTimeLive.getOrNull())

        /**
         * Sets [Builder.lastRunStartTimeLive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastRunStartTimeLive] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun lastRunStartTimeLive(lastRunStartTimeLive: JsonField<OffsetDateTime>) = apply {
            this.lastRunStartTimeLive = lastRunStartTimeLive
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

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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

        fun referenceDatasetId(referenceDatasetId: String?) =
            referenceDatasetId(JsonField.ofNullable(referenceDatasetId))

        /**
         * Alias for calling [Builder.referenceDatasetId] with `referenceDatasetId.orElse(null)`.
         */
        fun referenceDatasetId(referenceDatasetId: Optional<String>) =
            referenceDatasetId(referenceDatasetId.getOrNull())

        /**
         * Sets [Builder.referenceDatasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceDatasetId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referenceDatasetId(referenceDatasetId: JsonField<String>) = apply {
            this.referenceDatasetId = referenceDatasetId
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

        fun sessionFeedbackStats(sessionFeedbackStats: JsonValue) = apply {
            this.sessionFeedbackStats = sessionFeedbackStats
        }

        fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { this.startTime = startTime }

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

        fun testRunNumber(testRunNumber: Long?) = testRunNumber(JsonField.ofNullable(testRunNumber))

        /**
         * Alias for [Builder.testRunNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun testRunNumber(testRunNumber: Long) = testRunNumber(testRunNumber as Long?)

        /** Alias for calling [Builder.testRunNumber] with `testRunNumber.orElse(null)`. */
        fun testRunNumber(testRunNumber: Optional<Long>) = testRunNumber(testRunNumber.getOrNull())

        /**
         * Sets [Builder.testRunNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.testRunNumber] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun testRunNumber(testRunNumber: JsonField<Long>) = apply {
            this.testRunNumber = testRunNumber
        }

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

        fun traceTier(traceTier: TraceTier?) = traceTier(JsonField.ofNullable(traceTier))

        /** Alias for calling [Builder.traceTier] with `traceTier.orElse(null)`. */
        fun traceTier(traceTier: Optional<TraceTier>) = traceTier(traceTier.getOrNull())

        /**
         * Sets [Builder.traceTier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.traceTier] with a well-typed [TraceTier] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun traceTier(traceTier: JsonField<TraceTier>) = apply { this.traceTier = traceTier }

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
         * Returns an immutable instance of [TracerSession].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .tenantId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TracerSession =
            TracerSession(
                checkRequired("id", id),
                checkRequired("tenantId", tenantId),
                completionCost,
                completionTokens,
                defaultDatasetId,
                description,
                endTime,
                errorRate,
                extra,
                feedbackStats,
                firstTokenP50,
                firstTokenP99,
                lastRunStartTime,
                lastRunStartTimeLive,
                latencyP50,
                latencyP99,
                name,
                promptCost,
                promptTokens,
                referenceDatasetId,
                runCount,
                (runFacets ?: JsonMissing.of()).map { it.toImmutable() },
                sessionFeedbackStats,
                startTime,
                streamingRate,
                testRunNumber,
                totalCost,
                totalTokens,
                traceTier,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TracerSession = apply {
        if (validated) {
            return@apply
        }

        id()
        tenantId()
        completionCost()
        completionTokens()
        defaultDatasetId()
        description()
        endTime()
        errorRate()
        firstTokenP50()
        firstTokenP99()
        lastRunStartTime()
        lastRunStartTimeLive()
        latencyP50()
        latencyP99()
        name()
        promptCost()
        promptTokens()
        referenceDatasetId()
        runCount()
        runFacets()
        startTime()
        streamingRate()
        testRunNumber()
        totalCost()
        totalTokens()
        traceTier().ifPresent { it.validate() }
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0) +
            (if (completionCost.asKnown().isPresent) 1 else 0) +
            (if (completionTokens.asKnown().isPresent) 1 else 0) +
            (if (defaultDatasetId.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (endTime.asKnown().isPresent) 1 else 0) +
            (if (errorRate.asKnown().isPresent) 1 else 0) +
            (if (firstTokenP50.asKnown().isPresent) 1 else 0) +
            (if (firstTokenP99.asKnown().isPresent) 1 else 0) +
            (if (lastRunStartTime.asKnown().isPresent) 1 else 0) +
            (if (lastRunStartTimeLive.asKnown().isPresent) 1 else 0) +
            (if (latencyP50.asKnown().isPresent) 1 else 0) +
            (if (latencyP99.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (promptCost.asKnown().isPresent) 1 else 0) +
            (if (promptTokens.asKnown().isPresent) 1 else 0) +
            (if (referenceDatasetId.asKnown().isPresent) 1 else 0) +
            (if (runCount.asKnown().isPresent) 1 else 0) +
            (runFacets.asKnown().getOrNull()?.size ?: 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (if (streamingRate.asKnown().isPresent) 1 else 0) +
            (if (testRunNumber.asKnown().isPresent) 1 else 0) +
            (if (totalCost.asKnown().isPresent) 1 else 0) +
            (if (totalTokens.asKnown().isPresent) 1 else 0) +
            (traceTier.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TracerSession &&
            id == other.id &&
            tenantId == other.tenantId &&
            completionCost == other.completionCost &&
            completionTokens == other.completionTokens &&
            defaultDatasetId == other.defaultDatasetId &&
            description == other.description &&
            endTime == other.endTime &&
            errorRate == other.errorRate &&
            extra == other.extra &&
            feedbackStats == other.feedbackStats &&
            firstTokenP50 == other.firstTokenP50 &&
            firstTokenP99 == other.firstTokenP99 &&
            lastRunStartTime == other.lastRunStartTime &&
            lastRunStartTimeLive == other.lastRunStartTimeLive &&
            latencyP50 == other.latencyP50 &&
            latencyP99 == other.latencyP99 &&
            name == other.name &&
            promptCost == other.promptCost &&
            promptTokens == other.promptTokens &&
            referenceDatasetId == other.referenceDatasetId &&
            runCount == other.runCount &&
            runFacets == other.runFacets &&
            sessionFeedbackStats == other.sessionFeedbackStats &&
            startTime == other.startTime &&
            streamingRate == other.streamingRate &&
            testRunNumber == other.testRunNumber &&
            totalCost == other.totalCost &&
            totalTokens == other.totalTokens &&
            traceTier == other.traceTier &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            tenantId,
            completionCost,
            completionTokens,
            defaultDatasetId,
            description,
            endTime,
            errorRate,
            extra,
            feedbackStats,
            firstTokenP50,
            firstTokenP99,
            lastRunStartTime,
            lastRunStartTimeLive,
            latencyP50,
            latencyP99,
            name,
            promptCost,
            promptTokens,
            referenceDatasetId,
            runCount,
            runFacets,
            sessionFeedbackStats,
            startTime,
            streamingRate,
            testRunNumber,
            totalCost,
            totalTokens,
            traceTier,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TracerSession{id=$id, tenantId=$tenantId, completionCost=$completionCost, completionTokens=$completionTokens, defaultDatasetId=$defaultDatasetId, description=$description, endTime=$endTime, errorRate=$errorRate, extra=$extra, feedbackStats=$feedbackStats, firstTokenP50=$firstTokenP50, firstTokenP99=$firstTokenP99, lastRunStartTime=$lastRunStartTime, lastRunStartTimeLive=$lastRunStartTimeLive, latencyP50=$latencyP50, latencyP99=$latencyP99, name=$name, promptCost=$promptCost, promptTokens=$promptTokens, referenceDatasetId=$referenceDatasetId, runCount=$runCount, runFacets=$runFacets, sessionFeedbackStats=$sessionFeedbackStats, startTime=$startTime, streamingRate=$streamingRate, testRunNumber=$testRunNumber, totalCost=$totalCost, totalTokens=$totalTokens, traceTier=$traceTier, additionalProperties=$additionalProperties}"
}

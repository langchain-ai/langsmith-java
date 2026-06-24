// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class OnlineEvaluatorSpendGroup
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val datasetId: JsonField<String>,
    private val datasetName: JsonField<String>,
    private val days: JsonField<List<OnlineEvaluatorSpendDay>>,
    private val evaluatorId: JsonField<String>,
    private val evaluatorName: JsonField<String>,
    private val prevTotalSpendUsd: JsonField<Double>,
    private val prevTotalTraceCount: JsonField<Long>,
    private val runRuleId: JsonField<String>,
    private val runRuleName: JsonField<String>,
    private val sessionId: JsonField<String>,
    private val sessionName: JsonField<String>,
    private val spendLimit: JsonField<OnlineSpendLimit>,
    private val totalSpendUsd: JsonField<Double>,
    private val totalTraceCount: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("dataset_id") @ExcludeMissing datasetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataset_name")
        @ExcludeMissing
        datasetName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("days")
        @ExcludeMissing
        days: JsonField<List<OnlineEvaluatorSpendDay>> = JsonMissing.of(),
        @JsonProperty("evaluator_id")
        @ExcludeMissing
        evaluatorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("evaluator_name")
        @ExcludeMissing
        evaluatorName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prev_total_spend_usd")
        @ExcludeMissing
        prevTotalSpendUsd: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("prev_total_trace_count")
        @ExcludeMissing
        prevTotalTraceCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("run_rule_id")
        @ExcludeMissing
        runRuleId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("run_rule_name")
        @ExcludeMissing
        runRuleName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("session_id") @ExcludeMissing sessionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("session_name")
        @ExcludeMissing
        sessionName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("spend_limit")
        @ExcludeMissing
        spendLimit: JsonField<OnlineSpendLimit> = JsonMissing.of(),
        @JsonProperty("total_spend_usd")
        @ExcludeMissing
        totalSpendUsd: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("total_trace_count")
        @ExcludeMissing
        totalTraceCount: JsonField<Long> = JsonMissing.of(),
    ) : this(
        datasetId,
        datasetName,
        days,
        evaluatorId,
        evaluatorName,
        prevTotalSpendUsd,
        prevTotalTraceCount,
        runRuleId,
        runRuleName,
        sessionId,
        sessionName,
        spendLimit,
        totalSpendUsd,
        totalTraceCount,
        mutableMapOf(),
    )

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun datasetId(): Optional<String> = datasetId.getOptional("dataset_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun datasetName(): Optional<String> = datasetName.getOptional("dataset_name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun days(): Optional<List<OnlineEvaluatorSpendDay>> = days.getOptional("days")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun evaluatorId(): Optional<String> = evaluatorId.getOptional("evaluator_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun evaluatorName(): Optional<String> = evaluatorName.getOptional("evaluator_name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prevTotalSpendUsd(): Optional<Double> =
        prevTotalSpendUsd.getOptional("prev_total_spend_usd")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prevTotalTraceCount(): Optional<Long> =
        prevTotalTraceCount.getOptional("prev_total_trace_count")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runRuleId(): Optional<String> = runRuleId.getOptional("run_rule_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runRuleName(): Optional<String> = runRuleName.getOptional("run_rule_name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sessionId(): Optional<String> = sessionId.getOptional("session_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sessionName(): Optional<String> = sessionName.getOptional("session_name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spendLimit(): Optional<OnlineSpendLimit> = spendLimit.getOptional("spend_limit")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalSpendUsd(): Optional<Double> = totalSpendUsd.getOptional("total_spend_usd")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalTraceCount(): Optional<Long> = totalTraceCount.getOptional("total_trace_count")

    /**
     * Returns the raw JSON value of [datasetId].
     *
     * Unlike [datasetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataset_id") @ExcludeMissing fun _datasetId(): JsonField<String> = datasetId

    /**
     * Returns the raw JSON value of [datasetName].
     *
     * Unlike [datasetName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataset_name")
    @ExcludeMissing
    fun _datasetName(): JsonField<String> = datasetName

    /**
     * Returns the raw JSON value of [days].
     *
     * Unlike [days], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("days")
    @ExcludeMissing
    fun _days(): JsonField<List<OnlineEvaluatorSpendDay>> = days

    /**
     * Returns the raw JSON value of [evaluatorId].
     *
     * Unlike [evaluatorId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("evaluator_id")
    @ExcludeMissing
    fun _evaluatorId(): JsonField<String> = evaluatorId

    /**
     * Returns the raw JSON value of [evaluatorName].
     *
     * Unlike [evaluatorName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("evaluator_name")
    @ExcludeMissing
    fun _evaluatorName(): JsonField<String> = evaluatorName

    /**
     * Returns the raw JSON value of [prevTotalSpendUsd].
     *
     * Unlike [prevTotalSpendUsd], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("prev_total_spend_usd")
    @ExcludeMissing
    fun _prevTotalSpendUsd(): JsonField<Double> = prevTotalSpendUsd

    /**
     * Returns the raw JSON value of [prevTotalTraceCount].
     *
     * Unlike [prevTotalTraceCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("prev_total_trace_count")
    @ExcludeMissing
    fun _prevTotalTraceCount(): JsonField<Long> = prevTotalTraceCount

    /**
     * Returns the raw JSON value of [runRuleId].
     *
     * Unlike [runRuleId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("run_rule_id") @ExcludeMissing fun _runRuleId(): JsonField<String> = runRuleId

    /**
     * Returns the raw JSON value of [runRuleName].
     *
     * Unlike [runRuleName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("run_rule_name")
    @ExcludeMissing
    fun _runRuleName(): JsonField<String> = runRuleName

    /**
     * Returns the raw JSON value of [sessionId].
     *
     * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

    /**
     * Returns the raw JSON value of [sessionName].
     *
     * Unlike [sessionName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("session_name")
    @ExcludeMissing
    fun _sessionName(): JsonField<String> = sessionName

    /**
     * Returns the raw JSON value of [spendLimit].
     *
     * Unlike [spendLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spend_limit")
    @ExcludeMissing
    fun _spendLimit(): JsonField<OnlineSpendLimit> = spendLimit

    /**
     * Returns the raw JSON value of [totalSpendUsd].
     *
     * Unlike [totalSpendUsd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_spend_usd")
    @ExcludeMissing
    fun _totalSpendUsd(): JsonField<Double> = totalSpendUsd

    /**
     * Returns the raw JSON value of [totalTraceCount].
     *
     * Unlike [totalTraceCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_trace_count")
    @ExcludeMissing
    fun _totalTraceCount(): JsonField<Long> = totalTraceCount

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
         * Returns a mutable builder for constructing an instance of [OnlineEvaluatorSpendGroup].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OnlineEvaluatorSpendGroup]. */
    class Builder internal constructor() {

        private var datasetId: JsonField<String> = JsonMissing.of()
        private var datasetName: JsonField<String> = JsonMissing.of()
        private var days: JsonField<MutableList<OnlineEvaluatorSpendDay>>? = null
        private var evaluatorId: JsonField<String> = JsonMissing.of()
        private var evaluatorName: JsonField<String> = JsonMissing.of()
        private var prevTotalSpendUsd: JsonField<Double> = JsonMissing.of()
        private var prevTotalTraceCount: JsonField<Long> = JsonMissing.of()
        private var runRuleId: JsonField<String> = JsonMissing.of()
        private var runRuleName: JsonField<String> = JsonMissing.of()
        private var sessionId: JsonField<String> = JsonMissing.of()
        private var sessionName: JsonField<String> = JsonMissing.of()
        private var spendLimit: JsonField<OnlineSpendLimit> = JsonMissing.of()
        private var totalSpendUsd: JsonField<Double> = JsonMissing.of()
        private var totalTraceCount: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(onlineEvaluatorSpendGroup: OnlineEvaluatorSpendGroup) = apply {
            datasetId = onlineEvaluatorSpendGroup.datasetId
            datasetName = onlineEvaluatorSpendGroup.datasetName
            days = onlineEvaluatorSpendGroup.days.map { it.toMutableList() }
            evaluatorId = onlineEvaluatorSpendGroup.evaluatorId
            evaluatorName = onlineEvaluatorSpendGroup.evaluatorName
            prevTotalSpendUsd = onlineEvaluatorSpendGroup.prevTotalSpendUsd
            prevTotalTraceCount = onlineEvaluatorSpendGroup.prevTotalTraceCount
            runRuleId = onlineEvaluatorSpendGroup.runRuleId
            runRuleName = onlineEvaluatorSpendGroup.runRuleName
            sessionId = onlineEvaluatorSpendGroup.sessionId
            sessionName = onlineEvaluatorSpendGroup.sessionName
            spendLimit = onlineEvaluatorSpendGroup.spendLimit
            totalSpendUsd = onlineEvaluatorSpendGroup.totalSpendUsd
            totalTraceCount = onlineEvaluatorSpendGroup.totalTraceCount
            additionalProperties = onlineEvaluatorSpendGroup.additionalProperties.toMutableMap()
        }

        fun datasetId(datasetId: String) = datasetId(JsonField.of(datasetId))

        /**
         * Sets [Builder.datasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasetId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

        fun datasetName(datasetName: String) = datasetName(JsonField.of(datasetName))

        /**
         * Sets [Builder.datasetName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasetName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun datasetName(datasetName: JsonField<String>) = apply { this.datasetName = datasetName }

        fun days(days: List<OnlineEvaluatorSpendDay>) = days(JsonField.of(days))

        /**
         * Sets [Builder.days] to an arbitrary JSON value.
         *
         * You should usually call [Builder.days] with a well-typed `List<OnlineEvaluatorSpendDay>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun days(days: JsonField<List<OnlineEvaluatorSpendDay>>) = apply {
            this.days = days.map { it.toMutableList() }
        }

        /**
         * Adds a single [OnlineEvaluatorSpendDay] to [days].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDay(day: OnlineEvaluatorSpendDay) = apply {
            days = (days ?: JsonField.of(mutableListOf())).also { checkKnown("days", it).add(day) }
        }

        fun evaluatorId(evaluatorId: String) = evaluatorId(JsonField.of(evaluatorId))

        /**
         * Sets [Builder.evaluatorId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evaluatorId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun evaluatorId(evaluatorId: JsonField<String>) = apply { this.evaluatorId = evaluatorId }

        fun evaluatorName(evaluatorName: String) = evaluatorName(JsonField.of(evaluatorName))

        /**
         * Sets [Builder.evaluatorName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evaluatorName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun evaluatorName(evaluatorName: JsonField<String>) = apply {
            this.evaluatorName = evaluatorName
        }

        fun prevTotalSpendUsd(prevTotalSpendUsd: Double) =
            prevTotalSpendUsd(JsonField.of(prevTotalSpendUsd))

        /**
         * Sets [Builder.prevTotalSpendUsd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prevTotalSpendUsd] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun prevTotalSpendUsd(prevTotalSpendUsd: JsonField<Double>) = apply {
            this.prevTotalSpendUsd = prevTotalSpendUsd
        }

        fun prevTotalTraceCount(prevTotalTraceCount: Long) =
            prevTotalTraceCount(JsonField.of(prevTotalTraceCount))

        /**
         * Sets [Builder.prevTotalTraceCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prevTotalTraceCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun prevTotalTraceCount(prevTotalTraceCount: JsonField<Long>) = apply {
            this.prevTotalTraceCount = prevTotalTraceCount
        }

        fun runRuleId(runRuleId: String) = runRuleId(JsonField.of(runRuleId))

        /**
         * Sets [Builder.runRuleId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runRuleId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun runRuleId(runRuleId: JsonField<String>) = apply { this.runRuleId = runRuleId }

        fun runRuleName(runRuleName: String) = runRuleName(JsonField.of(runRuleName))

        /**
         * Sets [Builder.runRuleName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runRuleName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun runRuleName(runRuleName: JsonField<String>) = apply { this.runRuleName = runRuleName }

        fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

        /**
         * Sets [Builder.sessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

        fun sessionName(sessionName: String) = sessionName(JsonField.of(sessionName))

        /**
         * Sets [Builder.sessionName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionName(sessionName: JsonField<String>) = apply { this.sessionName = sessionName }

        fun spendLimit(spendLimit: OnlineSpendLimit) = spendLimit(JsonField.of(spendLimit))

        /**
         * Sets [Builder.spendLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spendLimit] with a well-typed [OnlineSpendLimit] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun spendLimit(spendLimit: JsonField<OnlineSpendLimit>) = apply {
            this.spendLimit = spendLimit
        }

        fun totalSpendUsd(totalSpendUsd: Double) = totalSpendUsd(JsonField.of(totalSpendUsd))

        /**
         * Sets [Builder.totalSpendUsd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalSpendUsd] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalSpendUsd(totalSpendUsd: JsonField<Double>) = apply {
            this.totalSpendUsd = totalSpendUsd
        }

        fun totalTraceCount(totalTraceCount: Long) = totalTraceCount(JsonField.of(totalTraceCount))

        /**
         * Sets [Builder.totalTraceCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalTraceCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalTraceCount(totalTraceCount: JsonField<Long>) = apply {
            this.totalTraceCount = totalTraceCount
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
         * Returns an immutable instance of [OnlineEvaluatorSpendGroup].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OnlineEvaluatorSpendGroup =
            OnlineEvaluatorSpendGroup(
                datasetId,
                datasetName,
                (days ?: JsonMissing.of()).map { it.toImmutable() },
                evaluatorId,
                evaluatorName,
                prevTotalSpendUsd,
                prevTotalTraceCount,
                runRuleId,
                runRuleName,
                sessionId,
                sessionName,
                spendLimit,
                totalSpendUsd,
                totalTraceCount,
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
    fun validate(): OnlineEvaluatorSpendGroup = apply {
        if (validated) {
            return@apply
        }

        datasetId()
        datasetName()
        days().ifPresent { it.forEach { it.validate() } }
        evaluatorId()
        evaluatorName()
        prevTotalSpendUsd()
        prevTotalTraceCount()
        runRuleId()
        runRuleName()
        sessionId()
        sessionName()
        spendLimit().ifPresent { it.validate() }
        totalSpendUsd()
        totalTraceCount()
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
        (if (datasetId.asKnown().isPresent) 1 else 0) +
            (if (datasetName.asKnown().isPresent) 1 else 0) +
            (days.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (evaluatorId.asKnown().isPresent) 1 else 0) +
            (if (evaluatorName.asKnown().isPresent) 1 else 0) +
            (if (prevTotalSpendUsd.asKnown().isPresent) 1 else 0) +
            (if (prevTotalTraceCount.asKnown().isPresent) 1 else 0) +
            (if (runRuleId.asKnown().isPresent) 1 else 0) +
            (if (runRuleName.asKnown().isPresent) 1 else 0) +
            (if (sessionId.asKnown().isPresent) 1 else 0) +
            (if (sessionName.asKnown().isPresent) 1 else 0) +
            (spendLimit.asKnown().getOrNull()?.validity() ?: 0) +
            (if (totalSpendUsd.asKnown().isPresent) 1 else 0) +
            (if (totalTraceCount.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OnlineEvaluatorSpendGroup &&
            datasetId == other.datasetId &&
            datasetName == other.datasetName &&
            days == other.days &&
            evaluatorId == other.evaluatorId &&
            evaluatorName == other.evaluatorName &&
            prevTotalSpendUsd == other.prevTotalSpendUsd &&
            prevTotalTraceCount == other.prevTotalTraceCount &&
            runRuleId == other.runRuleId &&
            runRuleName == other.runRuleName &&
            sessionId == other.sessionId &&
            sessionName == other.sessionName &&
            spendLimit == other.spendLimit &&
            totalSpendUsd == other.totalSpendUsd &&
            totalTraceCount == other.totalTraceCount &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            datasetId,
            datasetName,
            days,
            evaluatorId,
            evaluatorName,
            prevTotalSpendUsd,
            prevTotalTraceCount,
            runRuleId,
            runRuleName,
            sessionId,
            sessionName,
            spendLimit,
            totalSpendUsd,
            totalTraceCount,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OnlineEvaluatorSpendGroup{datasetId=$datasetId, datasetName=$datasetName, days=$days, evaluatorId=$evaluatorId, evaluatorName=$evaluatorName, prevTotalSpendUsd=$prevTotalSpendUsd, prevTotalTraceCount=$prevTotalTraceCount, runRuleId=$runRuleId, runRuleName=$runRuleName, sessionId=$sessionId, sessionName=$sessionName, spendLimit=$spendLimit, totalSpendUsd=$totalSpendUsd, totalTraceCount=$totalTraceCount, additionalProperties=$additionalProperties}"
}

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
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class OnlineEvaluatorRunRule
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val correctionsDatasetId: JsonField<String>,
    private val datasetId: JsonField<String>,
    private val datasetName: JsonField<String>,
    private val groupBy: JsonField<String>,
    private val numFewShotExamples: JsonField<Long>,
    private val sessionId: JsonField<String>,
    private val sessionName: JsonField<String>,
    private val spendLimit: JsonField<OnlineSpendLimit>,
    private val spendUsd: JsonField<Double>,
    private val traceCount: JsonField<Long>,
    private val useCorrectionsDataset: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("corrections_dataset_id")
        @ExcludeMissing
        correctionsDatasetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataset_id") @ExcludeMissing datasetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataset_name")
        @ExcludeMissing
        datasetName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("group_by") @ExcludeMissing groupBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("num_few_shot_examples")
        @ExcludeMissing
        numFewShotExamples: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("session_id") @ExcludeMissing sessionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("session_name")
        @ExcludeMissing
        sessionName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("spend_limit")
        @ExcludeMissing
        spendLimit: JsonField<OnlineSpendLimit> = JsonMissing.of(),
        @JsonProperty("spend_usd") @ExcludeMissing spendUsd: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("trace_count") @ExcludeMissing traceCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("use_corrections_dataset")
        @ExcludeMissing
        useCorrectionsDataset: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        id,
        correctionsDatasetId,
        datasetId,
        datasetName,
        groupBy,
        numFewShotExamples,
        sessionId,
        sessionName,
        spendLimit,
        spendUsd,
        traceCount,
        useCorrectionsDataset,
        mutableMapOf(),
    )

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun correctionsDatasetId(): Optional<String> =
        correctionsDatasetId.getOptional("corrections_dataset_id")

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
    fun groupBy(): Optional<String> = groupBy.getOptional("group_by")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numFewShotExamples(): Optional<Long> =
        numFewShotExamples.getOptional("num_few_shot_examples")

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
     * SpendLimit is the effective spend-cap limit for this rule (nil when unconfigured).
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spendLimit(): Optional<OnlineSpendLimit> = spendLimit.getOptional("spend_limit")

    /**
     * Per-rule usage for the current ISO week (omitted when feature is disabled). LLM-evaluator
     * rules are initialized to 0; code-evaluator rules include trace counts only.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spendUsd(): Optional<Double> = spendUsd.getOptional("spend_usd")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun traceCount(): Optional<Long> = traceCount.getOptional("trace_count")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun useCorrectionsDataset(): Optional<Boolean> =
        useCorrectionsDataset.getOptional("use_corrections_dataset")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [correctionsDatasetId].
     *
     * Unlike [correctionsDatasetId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("corrections_dataset_id")
    @ExcludeMissing
    fun _correctionsDatasetId(): JsonField<String> = correctionsDatasetId

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
     * Returns the raw JSON value of [groupBy].
     *
     * Unlike [groupBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("group_by") @ExcludeMissing fun _groupBy(): JsonField<String> = groupBy

    /**
     * Returns the raw JSON value of [numFewShotExamples].
     *
     * Unlike [numFewShotExamples], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("num_few_shot_examples")
    @ExcludeMissing
    fun _numFewShotExamples(): JsonField<Long> = numFewShotExamples

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
     * Returns the raw JSON value of [spendUsd].
     *
     * Unlike [spendUsd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spend_usd") @ExcludeMissing fun _spendUsd(): JsonField<Double> = spendUsd

    /**
     * Returns the raw JSON value of [traceCount].
     *
     * Unlike [traceCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trace_count") @ExcludeMissing fun _traceCount(): JsonField<Long> = traceCount

    /**
     * Returns the raw JSON value of [useCorrectionsDataset].
     *
     * Unlike [useCorrectionsDataset], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("use_corrections_dataset")
    @ExcludeMissing
    fun _useCorrectionsDataset(): JsonField<Boolean> = useCorrectionsDataset

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

        /** Returns a mutable builder for constructing an instance of [OnlineEvaluatorRunRule]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OnlineEvaluatorRunRule]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var correctionsDatasetId: JsonField<String> = JsonMissing.of()
        private var datasetId: JsonField<String> = JsonMissing.of()
        private var datasetName: JsonField<String> = JsonMissing.of()
        private var groupBy: JsonField<String> = JsonMissing.of()
        private var numFewShotExamples: JsonField<Long> = JsonMissing.of()
        private var sessionId: JsonField<String> = JsonMissing.of()
        private var sessionName: JsonField<String> = JsonMissing.of()
        private var spendLimit: JsonField<OnlineSpendLimit> = JsonMissing.of()
        private var spendUsd: JsonField<Double> = JsonMissing.of()
        private var traceCount: JsonField<Long> = JsonMissing.of()
        private var useCorrectionsDataset: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(onlineEvaluatorRunRule: OnlineEvaluatorRunRule) = apply {
            id = onlineEvaluatorRunRule.id
            correctionsDatasetId = onlineEvaluatorRunRule.correctionsDatasetId
            datasetId = onlineEvaluatorRunRule.datasetId
            datasetName = onlineEvaluatorRunRule.datasetName
            groupBy = onlineEvaluatorRunRule.groupBy
            numFewShotExamples = onlineEvaluatorRunRule.numFewShotExamples
            sessionId = onlineEvaluatorRunRule.sessionId
            sessionName = onlineEvaluatorRunRule.sessionName
            spendLimit = onlineEvaluatorRunRule.spendLimit
            spendUsd = onlineEvaluatorRunRule.spendUsd
            traceCount = onlineEvaluatorRunRule.traceCount
            useCorrectionsDataset = onlineEvaluatorRunRule.useCorrectionsDataset
            additionalProperties = onlineEvaluatorRunRule.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun correctionsDatasetId(correctionsDatasetId: String) =
            correctionsDatasetId(JsonField.of(correctionsDatasetId))

        /**
         * Sets [Builder.correctionsDatasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.correctionsDatasetId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun correctionsDatasetId(correctionsDatasetId: JsonField<String>) = apply {
            this.correctionsDatasetId = correctionsDatasetId
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

        fun groupBy(groupBy: String) = groupBy(JsonField.of(groupBy))

        /**
         * Sets [Builder.groupBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupBy] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun groupBy(groupBy: JsonField<String>) = apply { this.groupBy = groupBy }

        fun numFewShotExamples(numFewShotExamples: Long) =
            numFewShotExamples(JsonField.of(numFewShotExamples))

        /**
         * Sets [Builder.numFewShotExamples] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numFewShotExamples] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun numFewShotExamples(numFewShotExamples: JsonField<Long>) = apply {
            this.numFewShotExamples = numFewShotExamples
        }

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

        /** SpendLimit is the effective spend-cap limit for this rule (nil when unconfigured). */
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

        /**
         * Per-rule usage for the current ISO week (omitted when feature is disabled). LLM-evaluator
         * rules are initialized to 0; code-evaluator rules include trace counts only.
         */
        fun spendUsd(spendUsd: Double) = spendUsd(JsonField.of(spendUsd))

        /**
         * Sets [Builder.spendUsd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spendUsd] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun spendUsd(spendUsd: JsonField<Double>) = apply { this.spendUsd = spendUsd }

        fun traceCount(traceCount: Long) = traceCount(JsonField.of(traceCount))

        /**
         * Sets [Builder.traceCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.traceCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun traceCount(traceCount: JsonField<Long>) = apply { this.traceCount = traceCount }

        fun useCorrectionsDataset(useCorrectionsDataset: Boolean) =
            useCorrectionsDataset(JsonField.of(useCorrectionsDataset))

        /**
         * Sets [Builder.useCorrectionsDataset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useCorrectionsDataset] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun useCorrectionsDataset(useCorrectionsDataset: JsonField<Boolean>) = apply {
            this.useCorrectionsDataset = useCorrectionsDataset
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
         * Returns an immutable instance of [OnlineEvaluatorRunRule].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OnlineEvaluatorRunRule =
            OnlineEvaluatorRunRule(
                id,
                correctionsDatasetId,
                datasetId,
                datasetName,
                groupBy,
                numFewShotExamples,
                sessionId,
                sessionName,
                spendLimit,
                spendUsd,
                traceCount,
                useCorrectionsDataset,
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
    fun validate(): OnlineEvaluatorRunRule = apply {
        if (validated) {
            return@apply
        }

        id()
        correctionsDatasetId()
        datasetId()
        datasetName()
        groupBy()
        numFewShotExamples()
        sessionId()
        sessionName()
        spendLimit().ifPresent { it.validate() }
        spendUsd()
        traceCount()
        useCorrectionsDataset()
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
            (if (correctionsDatasetId.asKnown().isPresent) 1 else 0) +
            (if (datasetId.asKnown().isPresent) 1 else 0) +
            (if (datasetName.asKnown().isPresent) 1 else 0) +
            (if (groupBy.asKnown().isPresent) 1 else 0) +
            (if (numFewShotExamples.asKnown().isPresent) 1 else 0) +
            (if (sessionId.asKnown().isPresent) 1 else 0) +
            (if (sessionName.asKnown().isPresent) 1 else 0) +
            (spendLimit.asKnown().getOrNull()?.validity() ?: 0) +
            (if (spendUsd.asKnown().isPresent) 1 else 0) +
            (if (traceCount.asKnown().isPresent) 1 else 0) +
            (if (useCorrectionsDataset.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OnlineEvaluatorRunRule &&
            id == other.id &&
            correctionsDatasetId == other.correctionsDatasetId &&
            datasetId == other.datasetId &&
            datasetName == other.datasetName &&
            groupBy == other.groupBy &&
            numFewShotExamples == other.numFewShotExamples &&
            sessionId == other.sessionId &&
            sessionName == other.sessionName &&
            spendLimit == other.spendLimit &&
            spendUsd == other.spendUsd &&
            traceCount == other.traceCount &&
            useCorrectionsDataset == other.useCorrectionsDataset &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            correctionsDatasetId,
            datasetId,
            datasetName,
            groupBy,
            numFewShotExamples,
            sessionId,
            sessionName,
            spendLimit,
            spendUsd,
            traceCount,
            useCorrectionsDataset,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OnlineEvaluatorRunRule{id=$id, correctionsDatasetId=$correctionsDatasetId, datasetId=$datasetId, datasetName=$datasetName, groupBy=$groupBy, numFewShotExamples=$numFewShotExamples, sessionId=$sessionId, sessionName=$sessionName, spendLimit=$spendLimit, spendUsd=$spendUsd, traceCount=$traceCount, useCorrectionsDataset=$useCorrectionsDataset, additionalProperties=$additionalProperties}"
}

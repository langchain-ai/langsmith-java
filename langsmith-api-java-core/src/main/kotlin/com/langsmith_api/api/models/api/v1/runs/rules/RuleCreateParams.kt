// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.runs.rules

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langsmith_api.api.core.Enum
import com.langsmith_api.api.core.ExcludeMissing
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.core.JsonMissing
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.Params
import com.langsmith_api.api.core.checkKnown
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.core.http.Headers
import com.langsmith_api.api.core.http.QueryParams
import com.langsmith_api.api.core.toImmutable
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a new run rule. */
class RuleCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun displayName(): String = body.displayName()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun samplingRate(): Double = body.samplingRate()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun addToAnnotationQueueId(): Optional<String> = body.addToAnnotationQueueId()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun addToDatasetId(): Optional<String> = body.addToDatasetId()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun addToDatasetPreferCorrection(): Optional<Boolean> = body.addToDatasetPreferCorrection()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun alerts(): Optional<List<RunRulesPagerdutyAlertSchema>> = body.alerts()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun backfillFrom(): Optional<OffsetDateTime> = body.backfillFrom()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun codeEvaluators(): Optional<List<CodeEvaluatorTopLevel>> = body.codeEvaluators()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun createAlignmentQueue(): Optional<Boolean> = body.createAlignmentQueue()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun datasetId(): Optional<String> = body.datasetId()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun evaluatorVersion(): Optional<Long> = body.evaluatorVersion()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun evaluators(): Optional<List<EvaluatorTopLevel>> = body.evaluators()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun extendOnly(): Optional<Boolean> = body.extendOnly()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun filter(): Optional<String> = body.filter()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun groupBy(): Optional<GroupBy> = body.groupBy()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun includeExtendedStats(): Optional<Boolean> = body.includeExtendedStats()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun isEnabled(): Optional<Boolean> = body.isEnabled()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun numFewShotExamples(): Optional<Long> = body.numFewShotExamples()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun sessionId(): Optional<String> = body.sessionId()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun traceFilter(): Optional<String> = body.traceFilter()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun transient_(): Optional<Boolean> = body.transient_()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun treeFilter(): Optional<String> = body.treeFilter()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun useCorrectionsDataset(): Optional<Boolean> = body.useCorrectionsDataset()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun webhooks(): Optional<List<RunRulesWebhookSchema>> = body.webhooks()

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _displayName(): JsonField<String> = body._displayName()

    /**
     * Returns the raw JSON value of [samplingRate].
     *
     * Unlike [samplingRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _samplingRate(): JsonField<Double> = body._samplingRate()

    /**
     * Returns the raw JSON value of [addToAnnotationQueueId].
     *
     * Unlike [addToAnnotationQueueId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _addToAnnotationQueueId(): JsonField<String> = body._addToAnnotationQueueId()

    /**
     * Returns the raw JSON value of [addToDatasetId].
     *
     * Unlike [addToDatasetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _addToDatasetId(): JsonField<String> = body._addToDatasetId()

    /**
     * Returns the raw JSON value of [addToDatasetPreferCorrection].
     *
     * Unlike [addToDatasetPreferCorrection], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _addToDatasetPreferCorrection(): JsonField<Boolean> = body._addToDatasetPreferCorrection()

    /**
     * Returns the raw JSON value of [alerts].
     *
     * Unlike [alerts], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _alerts(): JsonField<List<RunRulesPagerdutyAlertSchema>> = body._alerts()

    /**
     * Returns the raw JSON value of [backfillFrom].
     *
     * Unlike [backfillFrom], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _backfillFrom(): JsonField<OffsetDateTime> = body._backfillFrom()

    /**
     * Returns the raw JSON value of [codeEvaluators].
     *
     * Unlike [codeEvaluators], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _codeEvaluators(): JsonField<List<CodeEvaluatorTopLevel>> = body._codeEvaluators()

    /**
     * Returns the raw JSON value of [createAlignmentQueue].
     *
     * Unlike [createAlignmentQueue], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _createAlignmentQueue(): JsonField<Boolean> = body._createAlignmentQueue()

    /**
     * Returns the raw JSON value of [datasetId].
     *
     * Unlike [datasetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _datasetId(): JsonField<String> = body._datasetId()

    /**
     * Returns the raw JSON value of [evaluatorVersion].
     *
     * Unlike [evaluatorVersion], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _evaluatorVersion(): JsonField<Long> = body._evaluatorVersion()

    /**
     * Returns the raw JSON value of [evaluators].
     *
     * Unlike [evaluators], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _evaluators(): JsonField<List<EvaluatorTopLevel>> = body._evaluators()

    /**
     * Returns the raw JSON value of [extendOnly].
     *
     * Unlike [extendOnly], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _extendOnly(): JsonField<Boolean> = body._extendOnly()

    /**
     * Returns the raw JSON value of [filter].
     *
     * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _filter(): JsonField<String> = body._filter()

    /**
     * Returns the raw JSON value of [groupBy].
     *
     * Unlike [groupBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _groupBy(): JsonField<GroupBy> = body._groupBy()

    /**
     * Returns the raw JSON value of [includeExtendedStats].
     *
     * Unlike [includeExtendedStats], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _includeExtendedStats(): JsonField<Boolean> = body._includeExtendedStats()

    /**
     * Returns the raw JSON value of [isEnabled].
     *
     * Unlike [isEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _isEnabled(): JsonField<Boolean> = body._isEnabled()

    /**
     * Returns the raw JSON value of [numFewShotExamples].
     *
     * Unlike [numFewShotExamples], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _numFewShotExamples(): JsonField<Long> = body._numFewShotExamples()

    /**
     * Returns the raw JSON value of [sessionId].
     *
     * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sessionId(): JsonField<String> = body._sessionId()

    /**
     * Returns the raw JSON value of [traceFilter].
     *
     * Unlike [traceFilter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _traceFilter(): JsonField<String> = body._traceFilter()

    /**
     * Returns the raw JSON value of [transient_].
     *
     * Unlike [transient_], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _transient_(): JsonField<Boolean> = body._transient_()

    /**
     * Returns the raw JSON value of [treeFilter].
     *
     * Unlike [treeFilter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _treeFilter(): JsonField<String> = body._treeFilter()

    /**
     * Returns the raw JSON value of [useCorrectionsDataset].
     *
     * Unlike [useCorrectionsDataset], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _useCorrectionsDataset(): JsonField<Boolean> = body._useCorrectionsDataset()

    /**
     * Returns the raw JSON value of [webhooks].
     *
     * Unlike [webhooks], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _webhooks(): JsonField<List<RunRulesWebhookSchema>> = body._webhooks()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RuleCreateParams].
         *
         * The following fields are required:
         * ```java
         * .displayName()
         * .samplingRate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RuleCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(ruleCreateParams: RuleCreateParams) = apply {
            body = ruleCreateParams.body.toBuilder()
            additionalHeaders = ruleCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = ruleCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [displayName]
         * - [samplingRate]
         * - [addToAnnotationQueueId]
         * - [addToDatasetId]
         * - [addToDatasetPreferCorrection]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun displayName(displayName: String) = apply { body.displayName(displayName) }

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { body.displayName(displayName) }

        fun samplingRate(samplingRate: Double) = apply { body.samplingRate(samplingRate) }

        /**
         * Sets [Builder.samplingRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.samplingRate] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun samplingRate(samplingRate: JsonField<Double>) = apply {
            body.samplingRate(samplingRate)
        }

        fun addToAnnotationQueueId(addToAnnotationQueueId: String?) = apply {
            body.addToAnnotationQueueId(addToAnnotationQueueId)
        }

        /**
         * Alias for calling [Builder.addToAnnotationQueueId] with
         * `addToAnnotationQueueId.orElse(null)`.
         */
        fun addToAnnotationQueueId(addToAnnotationQueueId: Optional<String>) =
            addToAnnotationQueueId(addToAnnotationQueueId.getOrNull())

        /**
         * Sets [Builder.addToAnnotationQueueId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addToAnnotationQueueId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun addToAnnotationQueueId(addToAnnotationQueueId: JsonField<String>) = apply {
            body.addToAnnotationQueueId(addToAnnotationQueueId)
        }

        fun addToDatasetId(addToDatasetId: String?) = apply { body.addToDatasetId(addToDatasetId) }

        /** Alias for calling [Builder.addToDatasetId] with `addToDatasetId.orElse(null)`. */
        fun addToDatasetId(addToDatasetId: Optional<String>) =
            addToDatasetId(addToDatasetId.getOrNull())

        /**
         * Sets [Builder.addToDatasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addToDatasetId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun addToDatasetId(addToDatasetId: JsonField<String>) = apply {
            body.addToDatasetId(addToDatasetId)
        }

        fun addToDatasetPreferCorrection(addToDatasetPreferCorrection: Boolean) = apply {
            body.addToDatasetPreferCorrection(addToDatasetPreferCorrection)
        }

        /**
         * Sets [Builder.addToDatasetPreferCorrection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addToDatasetPreferCorrection] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun addToDatasetPreferCorrection(addToDatasetPreferCorrection: JsonField<Boolean>) = apply {
            body.addToDatasetPreferCorrection(addToDatasetPreferCorrection)
        }

        fun alerts(alerts: List<RunRulesPagerdutyAlertSchema>?) = apply { body.alerts(alerts) }

        /** Alias for calling [Builder.alerts] with `alerts.orElse(null)`. */
        fun alerts(alerts: Optional<List<RunRulesPagerdutyAlertSchema>>) =
            alerts(alerts.getOrNull())

        /**
         * Sets [Builder.alerts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alerts] with a well-typed
         * `List<RunRulesPagerdutyAlertSchema>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun alerts(alerts: JsonField<List<RunRulesPagerdutyAlertSchema>>) = apply {
            body.alerts(alerts)
        }

        /**
         * Adds a single [RunRulesPagerdutyAlertSchema] to [alerts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAlert(alert: RunRulesPagerdutyAlertSchema) = apply { body.addAlert(alert) }

        fun backfillFrom(backfillFrom: OffsetDateTime?) = apply { body.backfillFrom(backfillFrom) }

        /** Alias for calling [Builder.backfillFrom] with `backfillFrom.orElse(null)`. */
        fun backfillFrom(backfillFrom: Optional<OffsetDateTime>) =
            backfillFrom(backfillFrom.getOrNull())

        /**
         * Sets [Builder.backfillFrom] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backfillFrom] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun backfillFrom(backfillFrom: JsonField<OffsetDateTime>) = apply {
            body.backfillFrom(backfillFrom)
        }

        fun codeEvaluators(codeEvaluators: List<CodeEvaluatorTopLevel>?) = apply {
            body.codeEvaluators(codeEvaluators)
        }

        /** Alias for calling [Builder.codeEvaluators] with `codeEvaluators.orElse(null)`. */
        fun codeEvaluators(codeEvaluators: Optional<List<CodeEvaluatorTopLevel>>) =
            codeEvaluators(codeEvaluators.getOrNull())

        /**
         * Sets [Builder.codeEvaluators] to an arbitrary JSON value.
         *
         * You should usually call [Builder.codeEvaluators] with a well-typed
         * `List<CodeEvaluatorTopLevel>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun codeEvaluators(codeEvaluators: JsonField<List<CodeEvaluatorTopLevel>>) = apply {
            body.codeEvaluators(codeEvaluators)
        }

        /**
         * Adds a single [CodeEvaluatorTopLevel] to [codeEvaluators].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCodeEvaluator(codeEvaluator: CodeEvaluatorTopLevel) = apply {
            body.addCodeEvaluator(codeEvaluator)
        }

        fun createAlignmentQueue(createAlignmentQueue: Boolean) = apply {
            body.createAlignmentQueue(createAlignmentQueue)
        }

        /**
         * Sets [Builder.createAlignmentQueue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createAlignmentQueue] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createAlignmentQueue(createAlignmentQueue: JsonField<Boolean>) = apply {
            body.createAlignmentQueue(createAlignmentQueue)
        }

        fun datasetId(datasetId: String?) = apply { body.datasetId(datasetId) }

        /** Alias for calling [Builder.datasetId] with `datasetId.orElse(null)`. */
        fun datasetId(datasetId: Optional<String>) = datasetId(datasetId.getOrNull())

        /**
         * Sets [Builder.datasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasetId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun datasetId(datasetId: JsonField<String>) = apply { body.datasetId(datasetId) }

        fun evaluatorVersion(evaluatorVersion: Long?) = apply {
            body.evaluatorVersion(evaluatorVersion)
        }

        /**
         * Alias for [Builder.evaluatorVersion].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun evaluatorVersion(evaluatorVersion: Long) = evaluatorVersion(evaluatorVersion as Long?)

        /** Alias for calling [Builder.evaluatorVersion] with `evaluatorVersion.orElse(null)`. */
        fun evaluatorVersion(evaluatorVersion: Optional<Long>) =
            evaluatorVersion(evaluatorVersion.getOrNull())

        /**
         * Sets [Builder.evaluatorVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evaluatorVersion] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun evaluatorVersion(evaluatorVersion: JsonField<Long>) = apply {
            body.evaluatorVersion(evaluatorVersion)
        }

        fun evaluators(evaluators: List<EvaluatorTopLevel>?) = apply { body.evaluators(evaluators) }

        /** Alias for calling [Builder.evaluators] with `evaluators.orElse(null)`. */
        fun evaluators(evaluators: Optional<List<EvaluatorTopLevel>>) =
            evaluators(evaluators.getOrNull())

        /**
         * Sets [Builder.evaluators] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evaluators] with a well-typed `List<EvaluatorTopLevel>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun evaluators(evaluators: JsonField<List<EvaluatorTopLevel>>) = apply {
            body.evaluators(evaluators)
        }

        /**
         * Adds a single [EvaluatorTopLevel] to [evaluators].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEvaluator(evaluator: EvaluatorTopLevel) = apply { body.addEvaluator(evaluator) }

        fun extendOnly(extendOnly: Boolean) = apply { body.extendOnly(extendOnly) }

        /**
         * Sets [Builder.extendOnly] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extendOnly] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun extendOnly(extendOnly: JsonField<Boolean>) = apply { body.extendOnly(extendOnly) }

        fun filter(filter: String?) = apply { body.filter(filter) }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<String>) = filter(filter.getOrNull())

        /**
         * Sets [Builder.filter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filter] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filter(filter: JsonField<String>) = apply { body.filter(filter) }

        fun groupBy(groupBy: GroupBy?) = apply { body.groupBy(groupBy) }

        /** Alias for calling [Builder.groupBy] with `groupBy.orElse(null)`. */
        fun groupBy(groupBy: Optional<GroupBy>) = groupBy(groupBy.getOrNull())

        /**
         * Sets [Builder.groupBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupBy] with a well-typed [GroupBy] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun groupBy(groupBy: JsonField<GroupBy>) = apply { body.groupBy(groupBy) }

        fun includeExtendedStats(includeExtendedStats: Boolean) = apply {
            body.includeExtendedStats(includeExtendedStats)
        }

        /**
         * Sets [Builder.includeExtendedStats] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeExtendedStats] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun includeExtendedStats(includeExtendedStats: JsonField<Boolean>) = apply {
            body.includeExtendedStats(includeExtendedStats)
        }

        fun isEnabled(isEnabled: Boolean) = apply { body.isEnabled(isEnabled) }

        /**
         * Sets [Builder.isEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isEnabled] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isEnabled(isEnabled: JsonField<Boolean>) = apply { body.isEnabled(isEnabled) }

        fun numFewShotExamples(numFewShotExamples: Long?) = apply {
            body.numFewShotExamples(numFewShotExamples)
        }

        /**
         * Alias for [Builder.numFewShotExamples].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun numFewShotExamples(numFewShotExamples: Long) =
            numFewShotExamples(numFewShotExamples as Long?)

        /**
         * Alias for calling [Builder.numFewShotExamples] with `numFewShotExamples.orElse(null)`.
         */
        fun numFewShotExamples(numFewShotExamples: Optional<Long>) =
            numFewShotExamples(numFewShotExamples.getOrNull())

        /**
         * Sets [Builder.numFewShotExamples] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numFewShotExamples] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun numFewShotExamples(numFewShotExamples: JsonField<Long>) = apply {
            body.numFewShotExamples(numFewShotExamples)
        }

        fun sessionId(sessionId: String?) = apply { body.sessionId(sessionId) }

        /** Alias for calling [Builder.sessionId] with `sessionId.orElse(null)`. */
        fun sessionId(sessionId: Optional<String>) = sessionId(sessionId.getOrNull())

        /**
         * Sets [Builder.sessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionId(sessionId: JsonField<String>) = apply { body.sessionId(sessionId) }

        fun traceFilter(traceFilter: String?) = apply { body.traceFilter(traceFilter) }

        /** Alias for calling [Builder.traceFilter] with `traceFilter.orElse(null)`. */
        fun traceFilter(traceFilter: Optional<String>) = traceFilter(traceFilter.getOrNull())

        /**
         * Sets [Builder.traceFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.traceFilter] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun traceFilter(traceFilter: JsonField<String>) = apply { body.traceFilter(traceFilter) }

        fun transient_(transient_: Boolean) = apply { body.transient_(transient_) }

        /**
         * Sets [Builder.transient_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transient_] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun transient_(transient_: JsonField<Boolean>) = apply { body.transient_(transient_) }

        fun treeFilter(treeFilter: String?) = apply { body.treeFilter(treeFilter) }

        /** Alias for calling [Builder.treeFilter] with `treeFilter.orElse(null)`. */
        fun treeFilter(treeFilter: Optional<String>) = treeFilter(treeFilter.getOrNull())

        /**
         * Sets [Builder.treeFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.treeFilter] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun treeFilter(treeFilter: JsonField<String>) = apply { body.treeFilter(treeFilter) }

        fun useCorrectionsDataset(useCorrectionsDataset: Boolean) = apply {
            body.useCorrectionsDataset(useCorrectionsDataset)
        }

        /**
         * Sets [Builder.useCorrectionsDataset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useCorrectionsDataset] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun useCorrectionsDataset(useCorrectionsDataset: JsonField<Boolean>) = apply {
            body.useCorrectionsDataset(useCorrectionsDataset)
        }

        fun webhooks(webhooks: List<RunRulesWebhookSchema>?) = apply { body.webhooks(webhooks) }

        /** Alias for calling [Builder.webhooks] with `webhooks.orElse(null)`. */
        fun webhooks(webhooks: Optional<List<RunRulesWebhookSchema>>) =
            webhooks(webhooks.getOrNull())

        /**
         * Sets [Builder.webhooks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhooks] with a well-typed
         * `List<RunRulesWebhookSchema>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun webhooks(webhooks: JsonField<List<RunRulesWebhookSchema>>) = apply {
            body.webhooks(webhooks)
        }

        /**
         * Adds a single [RunRulesWebhookSchema] to [webhooks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWebhook(webhook: RunRulesWebhookSchema) = apply { body.addWebhook(webhook) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [RuleCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .displayName()
         * .samplingRate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RuleCreateParams =
            RuleCreateParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val displayName: JsonField<String>,
        private val samplingRate: JsonField<Double>,
        private val addToAnnotationQueueId: JsonField<String>,
        private val addToDatasetId: JsonField<String>,
        private val addToDatasetPreferCorrection: JsonField<Boolean>,
        private val alerts: JsonField<List<RunRulesPagerdutyAlertSchema>>,
        private val backfillFrom: JsonField<OffsetDateTime>,
        private val codeEvaluators: JsonField<List<CodeEvaluatorTopLevel>>,
        private val createAlignmentQueue: JsonField<Boolean>,
        private val datasetId: JsonField<String>,
        private val evaluatorVersion: JsonField<Long>,
        private val evaluators: JsonField<List<EvaluatorTopLevel>>,
        private val extendOnly: JsonField<Boolean>,
        private val filter: JsonField<String>,
        private val groupBy: JsonField<GroupBy>,
        private val includeExtendedStats: JsonField<Boolean>,
        private val isEnabled: JsonField<Boolean>,
        private val numFewShotExamples: JsonField<Long>,
        private val sessionId: JsonField<String>,
        private val traceFilter: JsonField<String>,
        private val transient_: JsonField<Boolean>,
        private val treeFilter: JsonField<String>,
        private val useCorrectionsDataset: JsonField<Boolean>,
        private val webhooks: JsonField<List<RunRulesWebhookSchema>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("display_name")
            @ExcludeMissing
            displayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sampling_rate")
            @ExcludeMissing
            samplingRate: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("add_to_annotation_queue_id")
            @ExcludeMissing
            addToAnnotationQueueId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("add_to_dataset_id")
            @ExcludeMissing
            addToDatasetId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("add_to_dataset_prefer_correction")
            @ExcludeMissing
            addToDatasetPreferCorrection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("alerts")
            @ExcludeMissing
            alerts: JsonField<List<RunRulesPagerdutyAlertSchema>> = JsonMissing.of(),
            @JsonProperty("backfill_from")
            @ExcludeMissing
            backfillFrom: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("code_evaluators")
            @ExcludeMissing
            codeEvaluators: JsonField<List<CodeEvaluatorTopLevel>> = JsonMissing.of(),
            @JsonProperty("create_alignment_queue")
            @ExcludeMissing
            createAlignmentQueue: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("dataset_id")
            @ExcludeMissing
            datasetId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("evaluator_version")
            @ExcludeMissing
            evaluatorVersion: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("evaluators")
            @ExcludeMissing
            evaluators: JsonField<List<EvaluatorTopLevel>> = JsonMissing.of(),
            @JsonProperty("extend_only")
            @ExcludeMissing
            extendOnly: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("filter") @ExcludeMissing filter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("group_by")
            @ExcludeMissing
            groupBy: JsonField<GroupBy> = JsonMissing.of(),
            @JsonProperty("include_extended_stats")
            @ExcludeMissing
            includeExtendedStats: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("is_enabled")
            @ExcludeMissing
            isEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("num_few_shot_examples")
            @ExcludeMissing
            numFewShotExamples: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("session_id")
            @ExcludeMissing
            sessionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("trace_filter")
            @ExcludeMissing
            traceFilter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("transient")
            @ExcludeMissing
            transient_: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("tree_filter")
            @ExcludeMissing
            treeFilter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("use_corrections_dataset")
            @ExcludeMissing
            useCorrectionsDataset: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("webhooks")
            @ExcludeMissing
            webhooks: JsonField<List<RunRulesWebhookSchema>> = JsonMissing.of(),
        ) : this(
            displayName,
            samplingRate,
            addToAnnotationQueueId,
            addToDatasetId,
            addToDatasetPreferCorrection,
            alerts,
            backfillFrom,
            codeEvaluators,
            createAlignmentQueue,
            datasetId,
            evaluatorVersion,
            evaluators,
            extendOnly,
            filter,
            groupBy,
            includeExtendedStats,
            isEnabled,
            numFewShotExamples,
            sessionId,
            traceFilter,
            transient_,
            treeFilter,
            useCorrectionsDataset,
            webhooks,
            mutableMapOf(),
        )

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun displayName(): String = displayName.getRequired("display_name")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun samplingRate(): Double = samplingRate.getRequired("sampling_rate")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun addToAnnotationQueueId(): Optional<String> =
            addToAnnotationQueueId.getOptional("add_to_annotation_queue_id")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun addToDatasetId(): Optional<String> = addToDatasetId.getOptional("add_to_dataset_id")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun addToDatasetPreferCorrection(): Optional<Boolean> =
            addToDatasetPreferCorrection.getOptional("add_to_dataset_prefer_correction")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun alerts(): Optional<List<RunRulesPagerdutyAlertSchema>> = alerts.getOptional("alerts")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun backfillFrom(): Optional<OffsetDateTime> = backfillFrom.getOptional("backfill_from")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun codeEvaluators(): Optional<List<CodeEvaluatorTopLevel>> =
            codeEvaluators.getOptional("code_evaluators")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun createAlignmentQueue(): Optional<Boolean> =
            createAlignmentQueue.getOptional("create_alignment_queue")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun datasetId(): Optional<String> = datasetId.getOptional("dataset_id")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun evaluatorVersion(): Optional<Long> = evaluatorVersion.getOptional("evaluator_version")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun evaluators(): Optional<List<EvaluatorTopLevel>> = evaluators.getOptional("evaluators")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun extendOnly(): Optional<Boolean> = extendOnly.getOptional("extend_only")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun filter(): Optional<String> = filter.getOptional("filter")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun groupBy(): Optional<GroupBy> = groupBy.getOptional("group_by")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun includeExtendedStats(): Optional<Boolean> =
            includeExtendedStats.getOptional("include_extended_stats")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun isEnabled(): Optional<Boolean> = isEnabled.getOptional("is_enabled")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun numFewShotExamples(): Optional<Long> =
            numFewShotExamples.getOptional("num_few_shot_examples")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun sessionId(): Optional<String> = sessionId.getOptional("session_id")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun traceFilter(): Optional<String> = traceFilter.getOptional("trace_filter")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun transient_(): Optional<Boolean> = transient_.getOptional("transient")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun treeFilter(): Optional<String> = treeFilter.getOptional("tree_filter")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun useCorrectionsDataset(): Optional<Boolean> =
            useCorrectionsDataset.getOptional("use_corrections_dataset")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun webhooks(): Optional<List<RunRulesWebhookSchema>> = webhooks.getOptional("webhooks")

        /**
         * Returns the raw JSON value of [displayName].
         *
         * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("display_name")
        @ExcludeMissing
        fun _displayName(): JsonField<String> = displayName

        /**
         * Returns the raw JSON value of [samplingRate].
         *
         * Unlike [samplingRate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sampling_rate")
        @ExcludeMissing
        fun _samplingRate(): JsonField<Double> = samplingRate

        /**
         * Returns the raw JSON value of [addToAnnotationQueueId].
         *
         * Unlike [addToAnnotationQueueId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("add_to_annotation_queue_id")
        @ExcludeMissing
        fun _addToAnnotationQueueId(): JsonField<String> = addToAnnotationQueueId

        /**
         * Returns the raw JSON value of [addToDatasetId].
         *
         * Unlike [addToDatasetId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("add_to_dataset_id")
        @ExcludeMissing
        fun _addToDatasetId(): JsonField<String> = addToDatasetId

        /**
         * Returns the raw JSON value of [addToDatasetPreferCorrection].
         *
         * Unlike [addToDatasetPreferCorrection], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("add_to_dataset_prefer_correction")
        @ExcludeMissing
        fun _addToDatasetPreferCorrection(): JsonField<Boolean> = addToDatasetPreferCorrection

        /**
         * Returns the raw JSON value of [alerts].
         *
         * Unlike [alerts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("alerts")
        @ExcludeMissing
        fun _alerts(): JsonField<List<RunRulesPagerdutyAlertSchema>> = alerts

        /**
         * Returns the raw JSON value of [backfillFrom].
         *
         * Unlike [backfillFrom], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("backfill_from")
        @ExcludeMissing
        fun _backfillFrom(): JsonField<OffsetDateTime> = backfillFrom

        /**
         * Returns the raw JSON value of [codeEvaluators].
         *
         * Unlike [codeEvaluators], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("code_evaluators")
        @ExcludeMissing
        fun _codeEvaluators(): JsonField<List<CodeEvaluatorTopLevel>> = codeEvaluators

        /**
         * Returns the raw JSON value of [createAlignmentQueue].
         *
         * Unlike [createAlignmentQueue], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("create_alignment_queue")
        @ExcludeMissing
        fun _createAlignmentQueue(): JsonField<Boolean> = createAlignmentQueue

        /**
         * Returns the raw JSON value of [datasetId].
         *
         * Unlike [datasetId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dataset_id") @ExcludeMissing fun _datasetId(): JsonField<String> = datasetId

        /**
         * Returns the raw JSON value of [evaluatorVersion].
         *
         * Unlike [evaluatorVersion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("evaluator_version")
        @ExcludeMissing
        fun _evaluatorVersion(): JsonField<Long> = evaluatorVersion

        /**
         * Returns the raw JSON value of [evaluators].
         *
         * Unlike [evaluators], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("evaluators")
        @ExcludeMissing
        fun _evaluators(): JsonField<List<EvaluatorTopLevel>> = evaluators

        /**
         * Returns the raw JSON value of [extendOnly].
         *
         * Unlike [extendOnly], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("extend_only")
        @ExcludeMissing
        fun _extendOnly(): JsonField<Boolean> = extendOnly

        /**
         * Returns the raw JSON value of [filter].
         *
         * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

        /**
         * Returns the raw JSON value of [groupBy].
         *
         * Unlike [groupBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("group_by") @ExcludeMissing fun _groupBy(): JsonField<GroupBy> = groupBy

        /**
         * Returns the raw JSON value of [includeExtendedStats].
         *
         * Unlike [includeExtendedStats], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("include_extended_stats")
        @ExcludeMissing
        fun _includeExtendedStats(): JsonField<Boolean> = includeExtendedStats

        /**
         * Returns the raw JSON value of [isEnabled].
         *
         * Unlike [isEnabled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_enabled") @ExcludeMissing fun _isEnabled(): JsonField<Boolean> = isEnabled

        /**
         * Returns the raw JSON value of [numFewShotExamples].
         *
         * Unlike [numFewShotExamples], this method doesn't throw if the JSON field has an
         * unexpected type.
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
         * Returns the raw JSON value of [traceFilter].
         *
         * Unlike [traceFilter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trace_filter")
        @ExcludeMissing
        fun _traceFilter(): JsonField<String> = traceFilter

        /**
         * Returns the raw JSON value of [transient_].
         *
         * Unlike [transient_], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("transient")
        @ExcludeMissing
        fun _transient_(): JsonField<Boolean> = transient_

        /**
         * Returns the raw JSON value of [treeFilter].
         *
         * Unlike [treeFilter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tree_filter")
        @ExcludeMissing
        fun _treeFilter(): JsonField<String> = treeFilter

        /**
         * Returns the raw JSON value of [useCorrectionsDataset].
         *
         * Unlike [useCorrectionsDataset], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("use_corrections_dataset")
        @ExcludeMissing
        fun _useCorrectionsDataset(): JsonField<Boolean> = useCorrectionsDataset

        /**
         * Returns the raw JSON value of [webhooks].
         *
         * Unlike [webhooks], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("webhooks")
        @ExcludeMissing
        fun _webhooks(): JsonField<List<RunRulesWebhookSchema>> = webhooks

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .displayName()
             * .samplingRate()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var displayName: JsonField<String>? = null
            private var samplingRate: JsonField<Double>? = null
            private var addToAnnotationQueueId: JsonField<String> = JsonMissing.of()
            private var addToDatasetId: JsonField<String> = JsonMissing.of()
            private var addToDatasetPreferCorrection: JsonField<Boolean> = JsonMissing.of()
            private var alerts: JsonField<MutableList<RunRulesPagerdutyAlertSchema>>? = null
            private var backfillFrom: JsonField<OffsetDateTime> = JsonMissing.of()
            private var codeEvaluators: JsonField<MutableList<CodeEvaluatorTopLevel>>? = null
            private var createAlignmentQueue: JsonField<Boolean> = JsonMissing.of()
            private var datasetId: JsonField<String> = JsonMissing.of()
            private var evaluatorVersion: JsonField<Long> = JsonMissing.of()
            private var evaluators: JsonField<MutableList<EvaluatorTopLevel>>? = null
            private var extendOnly: JsonField<Boolean> = JsonMissing.of()
            private var filter: JsonField<String> = JsonMissing.of()
            private var groupBy: JsonField<GroupBy> = JsonMissing.of()
            private var includeExtendedStats: JsonField<Boolean> = JsonMissing.of()
            private var isEnabled: JsonField<Boolean> = JsonMissing.of()
            private var numFewShotExamples: JsonField<Long> = JsonMissing.of()
            private var sessionId: JsonField<String> = JsonMissing.of()
            private var traceFilter: JsonField<String> = JsonMissing.of()
            private var transient_: JsonField<Boolean> = JsonMissing.of()
            private var treeFilter: JsonField<String> = JsonMissing.of()
            private var useCorrectionsDataset: JsonField<Boolean> = JsonMissing.of()
            private var webhooks: JsonField<MutableList<RunRulesWebhookSchema>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                displayName = body.displayName
                samplingRate = body.samplingRate
                addToAnnotationQueueId = body.addToAnnotationQueueId
                addToDatasetId = body.addToDatasetId
                addToDatasetPreferCorrection = body.addToDatasetPreferCorrection
                alerts = body.alerts.map { it.toMutableList() }
                backfillFrom = body.backfillFrom
                codeEvaluators = body.codeEvaluators.map { it.toMutableList() }
                createAlignmentQueue = body.createAlignmentQueue
                datasetId = body.datasetId
                evaluatorVersion = body.evaluatorVersion
                evaluators = body.evaluators.map { it.toMutableList() }
                extendOnly = body.extendOnly
                filter = body.filter
                groupBy = body.groupBy
                includeExtendedStats = body.includeExtendedStats
                isEnabled = body.isEnabled
                numFewShotExamples = body.numFewShotExamples
                sessionId = body.sessionId
                traceFilter = body.traceFilter
                transient_ = body.transient_
                treeFilter = body.treeFilter
                useCorrectionsDataset = body.useCorrectionsDataset
                webhooks = body.webhooks.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun displayName(displayName: String) = displayName(JsonField.of(displayName))

            /**
             * Sets [Builder.displayName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.displayName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun displayName(displayName: JsonField<String>) = apply {
                this.displayName = displayName
            }

            fun samplingRate(samplingRate: Double) = samplingRate(JsonField.of(samplingRate))

            /**
             * Sets [Builder.samplingRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.samplingRate] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun samplingRate(samplingRate: JsonField<Double>) = apply {
                this.samplingRate = samplingRate
            }

            fun addToAnnotationQueueId(addToAnnotationQueueId: String?) =
                addToAnnotationQueueId(JsonField.ofNullable(addToAnnotationQueueId))

            /**
             * Alias for calling [Builder.addToAnnotationQueueId] with
             * `addToAnnotationQueueId.orElse(null)`.
             */
            fun addToAnnotationQueueId(addToAnnotationQueueId: Optional<String>) =
                addToAnnotationQueueId(addToAnnotationQueueId.getOrNull())

            /**
             * Sets [Builder.addToAnnotationQueueId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addToAnnotationQueueId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun addToAnnotationQueueId(addToAnnotationQueueId: JsonField<String>) = apply {
                this.addToAnnotationQueueId = addToAnnotationQueueId
            }

            fun addToDatasetId(addToDatasetId: String?) =
                addToDatasetId(JsonField.ofNullable(addToDatasetId))

            /** Alias for calling [Builder.addToDatasetId] with `addToDatasetId.orElse(null)`. */
            fun addToDatasetId(addToDatasetId: Optional<String>) =
                addToDatasetId(addToDatasetId.getOrNull())

            /**
             * Sets [Builder.addToDatasetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addToDatasetId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addToDatasetId(addToDatasetId: JsonField<String>) = apply {
                this.addToDatasetId = addToDatasetId
            }

            fun addToDatasetPreferCorrection(addToDatasetPreferCorrection: Boolean) =
                addToDatasetPreferCorrection(JsonField.of(addToDatasetPreferCorrection))

            /**
             * Sets [Builder.addToDatasetPreferCorrection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addToDatasetPreferCorrection] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun addToDatasetPreferCorrection(addToDatasetPreferCorrection: JsonField<Boolean>) =
                apply {
                    this.addToDatasetPreferCorrection = addToDatasetPreferCorrection
                }

            fun alerts(alerts: List<RunRulesPagerdutyAlertSchema>?) =
                alerts(JsonField.ofNullable(alerts))

            /** Alias for calling [Builder.alerts] with `alerts.orElse(null)`. */
            fun alerts(alerts: Optional<List<RunRulesPagerdutyAlertSchema>>) =
                alerts(alerts.getOrNull())

            /**
             * Sets [Builder.alerts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alerts] with a well-typed
             * `List<RunRulesPagerdutyAlertSchema>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun alerts(alerts: JsonField<List<RunRulesPagerdutyAlertSchema>>) = apply {
                this.alerts = alerts.map { it.toMutableList() }
            }

            /**
             * Adds a single [RunRulesPagerdutyAlertSchema] to [alerts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAlert(alert: RunRulesPagerdutyAlertSchema) = apply {
                alerts =
                    (alerts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("alerts", it).add(alert)
                    }
            }

            fun backfillFrom(backfillFrom: OffsetDateTime?) =
                backfillFrom(JsonField.ofNullable(backfillFrom))

            /** Alias for calling [Builder.backfillFrom] with `backfillFrom.orElse(null)`. */
            fun backfillFrom(backfillFrom: Optional<OffsetDateTime>) =
                backfillFrom(backfillFrom.getOrNull())

            /**
             * Sets [Builder.backfillFrom] to an arbitrary JSON value.
             *
             * You should usually call [Builder.backfillFrom] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun backfillFrom(backfillFrom: JsonField<OffsetDateTime>) = apply {
                this.backfillFrom = backfillFrom
            }

            fun codeEvaluators(codeEvaluators: List<CodeEvaluatorTopLevel>?) =
                codeEvaluators(JsonField.ofNullable(codeEvaluators))

            /** Alias for calling [Builder.codeEvaluators] with `codeEvaluators.orElse(null)`. */
            fun codeEvaluators(codeEvaluators: Optional<List<CodeEvaluatorTopLevel>>) =
                codeEvaluators(codeEvaluators.getOrNull())

            /**
             * Sets [Builder.codeEvaluators] to an arbitrary JSON value.
             *
             * You should usually call [Builder.codeEvaluators] with a well-typed
             * `List<CodeEvaluatorTopLevel>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun codeEvaluators(codeEvaluators: JsonField<List<CodeEvaluatorTopLevel>>) = apply {
                this.codeEvaluators = codeEvaluators.map { it.toMutableList() }
            }

            /**
             * Adds a single [CodeEvaluatorTopLevel] to [codeEvaluators].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCodeEvaluator(codeEvaluator: CodeEvaluatorTopLevel) = apply {
                codeEvaluators =
                    (codeEvaluators ?: JsonField.of(mutableListOf())).also {
                        checkKnown("codeEvaluators", it).add(codeEvaluator)
                    }
            }

            fun createAlignmentQueue(createAlignmentQueue: Boolean) =
                createAlignmentQueue(JsonField.of(createAlignmentQueue))

            /**
             * Sets [Builder.createAlignmentQueue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createAlignmentQueue] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun createAlignmentQueue(createAlignmentQueue: JsonField<Boolean>) = apply {
                this.createAlignmentQueue = createAlignmentQueue
            }

            fun datasetId(datasetId: String?) = datasetId(JsonField.ofNullable(datasetId))

            /** Alias for calling [Builder.datasetId] with `datasetId.orElse(null)`. */
            fun datasetId(datasetId: Optional<String>) = datasetId(datasetId.getOrNull())

            /**
             * Sets [Builder.datasetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.datasetId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

            fun evaluatorVersion(evaluatorVersion: Long?) =
                evaluatorVersion(JsonField.ofNullable(evaluatorVersion))

            /**
             * Alias for [Builder.evaluatorVersion].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun evaluatorVersion(evaluatorVersion: Long) =
                evaluatorVersion(evaluatorVersion as Long?)

            /**
             * Alias for calling [Builder.evaluatorVersion] with `evaluatorVersion.orElse(null)`.
             */
            fun evaluatorVersion(evaluatorVersion: Optional<Long>) =
                evaluatorVersion(evaluatorVersion.getOrNull())

            /**
             * Sets [Builder.evaluatorVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.evaluatorVersion] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun evaluatorVersion(evaluatorVersion: JsonField<Long>) = apply {
                this.evaluatorVersion = evaluatorVersion
            }

            fun evaluators(evaluators: List<EvaluatorTopLevel>?) =
                evaluators(JsonField.ofNullable(evaluators))

            /** Alias for calling [Builder.evaluators] with `evaluators.orElse(null)`. */
            fun evaluators(evaluators: Optional<List<EvaluatorTopLevel>>) =
                evaluators(evaluators.getOrNull())

            /**
             * Sets [Builder.evaluators] to an arbitrary JSON value.
             *
             * You should usually call [Builder.evaluators] with a well-typed
             * `List<EvaluatorTopLevel>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun evaluators(evaluators: JsonField<List<EvaluatorTopLevel>>) = apply {
                this.evaluators = evaluators.map { it.toMutableList() }
            }

            /**
             * Adds a single [EvaluatorTopLevel] to [evaluators].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEvaluator(evaluator: EvaluatorTopLevel) = apply {
                evaluators =
                    (evaluators ?: JsonField.of(mutableListOf())).also {
                        checkKnown("evaluators", it).add(evaluator)
                    }
            }

            fun extendOnly(extendOnly: Boolean) = extendOnly(JsonField.of(extendOnly))

            /**
             * Sets [Builder.extendOnly] to an arbitrary JSON value.
             *
             * You should usually call [Builder.extendOnly] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun extendOnly(extendOnly: JsonField<Boolean>) = apply { this.extendOnly = extendOnly }

            fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

            /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
            fun filter(filter: Optional<String>) = filter(filter.getOrNull())

            /**
             * Sets [Builder.filter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filter] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filter(filter: JsonField<String>) = apply { this.filter = filter }

            fun groupBy(groupBy: GroupBy?) = groupBy(JsonField.ofNullable(groupBy))

            /** Alias for calling [Builder.groupBy] with `groupBy.orElse(null)`. */
            fun groupBy(groupBy: Optional<GroupBy>) = groupBy(groupBy.getOrNull())

            /**
             * Sets [Builder.groupBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groupBy] with a well-typed [GroupBy] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groupBy(groupBy: JsonField<GroupBy>) = apply { this.groupBy = groupBy }

            fun includeExtendedStats(includeExtendedStats: Boolean) =
                includeExtendedStats(JsonField.of(includeExtendedStats))

            /**
             * Sets [Builder.includeExtendedStats] to an arbitrary JSON value.
             *
             * You should usually call [Builder.includeExtendedStats] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun includeExtendedStats(includeExtendedStats: JsonField<Boolean>) = apply {
                this.includeExtendedStats = includeExtendedStats
            }

            fun isEnabled(isEnabled: Boolean) = isEnabled(JsonField.of(isEnabled))

            /**
             * Sets [Builder.isEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isEnabled(isEnabled: JsonField<Boolean>) = apply { this.isEnabled = isEnabled }

            fun numFewShotExamples(numFewShotExamples: Long?) =
                numFewShotExamples(JsonField.ofNullable(numFewShotExamples))

            /**
             * Alias for [Builder.numFewShotExamples].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun numFewShotExamples(numFewShotExamples: Long) =
                numFewShotExamples(numFewShotExamples as Long?)

            /**
             * Alias for calling [Builder.numFewShotExamples] with
             * `numFewShotExamples.orElse(null)`.
             */
            fun numFewShotExamples(numFewShotExamples: Optional<Long>) =
                numFewShotExamples(numFewShotExamples.getOrNull())

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

            fun sessionId(sessionId: String?) = sessionId(JsonField.ofNullable(sessionId))

            /** Alias for calling [Builder.sessionId] with `sessionId.orElse(null)`. */
            fun sessionId(sessionId: Optional<String>) = sessionId(sessionId.getOrNull())

            /**
             * Sets [Builder.sessionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

            fun traceFilter(traceFilter: String?) = traceFilter(JsonField.ofNullable(traceFilter))

            /** Alias for calling [Builder.traceFilter] with `traceFilter.orElse(null)`. */
            fun traceFilter(traceFilter: Optional<String>) = traceFilter(traceFilter.getOrNull())

            /**
             * Sets [Builder.traceFilter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.traceFilter] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun traceFilter(traceFilter: JsonField<String>) = apply {
                this.traceFilter = traceFilter
            }

            fun transient_(transient_: Boolean) = transient_(JsonField.of(transient_))

            /**
             * Sets [Builder.transient_] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transient_] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transient_(transient_: JsonField<Boolean>) = apply { this.transient_ = transient_ }

            fun treeFilter(treeFilter: String?) = treeFilter(JsonField.ofNullable(treeFilter))

            /** Alias for calling [Builder.treeFilter] with `treeFilter.orElse(null)`. */
            fun treeFilter(treeFilter: Optional<String>) = treeFilter(treeFilter.getOrNull())

            /**
             * Sets [Builder.treeFilter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.treeFilter] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun treeFilter(treeFilter: JsonField<String>) = apply { this.treeFilter = treeFilter }

            fun useCorrectionsDataset(useCorrectionsDataset: Boolean) =
                useCorrectionsDataset(JsonField.of(useCorrectionsDataset))

            /**
             * Sets [Builder.useCorrectionsDataset] to an arbitrary JSON value.
             *
             * You should usually call [Builder.useCorrectionsDataset] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun useCorrectionsDataset(useCorrectionsDataset: JsonField<Boolean>) = apply {
                this.useCorrectionsDataset = useCorrectionsDataset
            }

            fun webhooks(webhooks: List<RunRulesWebhookSchema>?) =
                webhooks(JsonField.ofNullable(webhooks))

            /** Alias for calling [Builder.webhooks] with `webhooks.orElse(null)`. */
            fun webhooks(webhooks: Optional<List<RunRulesWebhookSchema>>) =
                webhooks(webhooks.getOrNull())

            /**
             * Sets [Builder.webhooks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhooks] with a well-typed
             * `List<RunRulesWebhookSchema>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun webhooks(webhooks: JsonField<List<RunRulesWebhookSchema>>) = apply {
                this.webhooks = webhooks.map { it.toMutableList() }
            }

            /**
             * Adds a single [RunRulesWebhookSchema] to [webhooks].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addWebhook(webhook: RunRulesWebhookSchema) = apply {
                webhooks =
                    (webhooks ?: JsonField.of(mutableListOf())).also {
                        checkKnown("webhooks", it).add(webhook)
                    }
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .displayName()
             * .samplingRate()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("displayName", displayName),
                    checkRequired("samplingRate", samplingRate),
                    addToAnnotationQueueId,
                    addToDatasetId,
                    addToDatasetPreferCorrection,
                    (alerts ?: JsonMissing.of()).map { it.toImmutable() },
                    backfillFrom,
                    (codeEvaluators ?: JsonMissing.of()).map { it.toImmutable() },
                    createAlignmentQueue,
                    datasetId,
                    evaluatorVersion,
                    (evaluators ?: JsonMissing.of()).map { it.toImmutable() },
                    extendOnly,
                    filter,
                    groupBy,
                    includeExtendedStats,
                    isEnabled,
                    numFewShotExamples,
                    sessionId,
                    traceFilter,
                    transient_,
                    treeFilter,
                    useCorrectionsDataset,
                    (webhooks ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            displayName()
            samplingRate()
            addToAnnotationQueueId()
            addToDatasetId()
            addToDatasetPreferCorrection()
            alerts().ifPresent { it.forEach { it.validate() } }
            backfillFrom()
            codeEvaluators().ifPresent { it.forEach { it.validate() } }
            createAlignmentQueue()
            datasetId()
            evaluatorVersion()
            evaluators().ifPresent { it.forEach { it.validate() } }
            extendOnly()
            filter()
            groupBy().ifPresent { it.validate() }
            includeExtendedStats()
            isEnabled()
            numFewShotExamples()
            sessionId()
            traceFilter()
            transient_()
            treeFilter()
            useCorrectionsDataset()
            webhooks().ifPresent { it.forEach { it.validate() } }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (displayName.asKnown().isPresent) 1 else 0) +
                (if (samplingRate.asKnown().isPresent) 1 else 0) +
                (if (addToAnnotationQueueId.asKnown().isPresent) 1 else 0) +
                (if (addToDatasetId.asKnown().isPresent) 1 else 0) +
                (if (addToDatasetPreferCorrection.asKnown().isPresent) 1 else 0) +
                (alerts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (backfillFrom.asKnown().isPresent) 1 else 0) +
                (codeEvaluators.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (createAlignmentQueue.asKnown().isPresent) 1 else 0) +
                (if (datasetId.asKnown().isPresent) 1 else 0) +
                (if (evaluatorVersion.asKnown().isPresent) 1 else 0) +
                (evaluators.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (extendOnly.asKnown().isPresent) 1 else 0) +
                (if (filter.asKnown().isPresent) 1 else 0) +
                (groupBy.asKnown().getOrNull()?.validity() ?: 0) +
                (if (includeExtendedStats.asKnown().isPresent) 1 else 0) +
                (if (isEnabled.asKnown().isPresent) 1 else 0) +
                (if (numFewShotExamples.asKnown().isPresent) 1 else 0) +
                (if (sessionId.asKnown().isPresent) 1 else 0) +
                (if (traceFilter.asKnown().isPresent) 1 else 0) +
                (if (transient_.asKnown().isPresent) 1 else 0) +
                (if (treeFilter.asKnown().isPresent) 1 else 0) +
                (if (useCorrectionsDataset.asKnown().isPresent) 1 else 0) +
                (webhooks.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                displayName == other.displayName &&
                samplingRate == other.samplingRate &&
                addToAnnotationQueueId == other.addToAnnotationQueueId &&
                addToDatasetId == other.addToDatasetId &&
                addToDatasetPreferCorrection == other.addToDatasetPreferCorrection &&
                alerts == other.alerts &&
                backfillFrom == other.backfillFrom &&
                codeEvaluators == other.codeEvaluators &&
                createAlignmentQueue == other.createAlignmentQueue &&
                datasetId == other.datasetId &&
                evaluatorVersion == other.evaluatorVersion &&
                evaluators == other.evaluators &&
                extendOnly == other.extendOnly &&
                filter == other.filter &&
                groupBy == other.groupBy &&
                includeExtendedStats == other.includeExtendedStats &&
                isEnabled == other.isEnabled &&
                numFewShotExamples == other.numFewShotExamples &&
                sessionId == other.sessionId &&
                traceFilter == other.traceFilter &&
                transient_ == other.transient_ &&
                treeFilter == other.treeFilter &&
                useCorrectionsDataset == other.useCorrectionsDataset &&
                webhooks == other.webhooks &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                displayName,
                samplingRate,
                addToAnnotationQueueId,
                addToDatasetId,
                addToDatasetPreferCorrection,
                alerts,
                backfillFrom,
                codeEvaluators,
                createAlignmentQueue,
                datasetId,
                evaluatorVersion,
                evaluators,
                extendOnly,
                filter,
                groupBy,
                includeExtendedStats,
                isEnabled,
                numFewShotExamples,
                sessionId,
                traceFilter,
                transient_,
                treeFilter,
                useCorrectionsDataset,
                webhooks,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{displayName=$displayName, samplingRate=$samplingRate, addToAnnotationQueueId=$addToAnnotationQueueId, addToDatasetId=$addToDatasetId, addToDatasetPreferCorrection=$addToDatasetPreferCorrection, alerts=$alerts, backfillFrom=$backfillFrom, codeEvaluators=$codeEvaluators, createAlignmentQueue=$createAlignmentQueue, datasetId=$datasetId, evaluatorVersion=$evaluatorVersion, evaluators=$evaluators, extendOnly=$extendOnly, filter=$filter, groupBy=$groupBy, includeExtendedStats=$includeExtendedStats, isEnabled=$isEnabled, numFewShotExamples=$numFewShotExamples, sessionId=$sessionId, traceFilter=$traceFilter, transient_=$transient_, treeFilter=$treeFilter, useCorrectionsDataset=$useCorrectionsDataset, webhooks=$webhooks, additionalProperties=$additionalProperties}"
    }

    class GroupBy @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val THREAD_ID = of("thread_id")

            @JvmStatic fun of(value: String) = GroupBy(JsonField.of(value))
        }

        /** An enum containing [GroupBy]'s known values. */
        enum class Known {
            THREAD_ID
        }

        /**
         * An enum containing [GroupBy]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [GroupBy] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            THREAD_ID,
            /** An enum member indicating that [GroupBy] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                THREAD_ID -> Value.THREAD_ID
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangsmithApiInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                THREAD_ID -> Known.THREAD_ID
                else -> throw LangsmithApiInvalidDataException("Unknown GroupBy: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangsmithApiInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangsmithApiInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): GroupBy = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is GroupBy && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RuleCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RuleCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

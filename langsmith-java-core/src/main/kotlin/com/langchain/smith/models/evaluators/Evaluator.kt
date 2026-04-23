// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.evaluators

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.Enum
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Run rules schema. */
class Evaluator
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val displayName: JsonField<String>,
    private val evaluatorVersion: JsonField<Long>,
    private val samplingRate: JsonField<Double>,
    private val tenantId: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val webhooks: JsonField<List<EvaluatorWebhook>>,
    private val addToAnnotationQueueId: JsonField<String>,
    private val addToAnnotationQueueName: JsonField<String>,
    private val addToDatasetId: JsonField<String>,
    private val addToDatasetName: JsonField<String>,
    private val addToDatasetPreferCorrection: JsonField<Boolean>,
    private val alerts: JsonField<List<EvaluatorPagerdutyAlert>>,
    private val alignmentAnnotationQueueId: JsonField<String>,
    private val backfillCompletedAt: JsonField<OffsetDateTime>,
    private val backfillError: JsonField<String>,
    private val backfillFrom: JsonField<OffsetDateTime>,
    private val backfillId: JsonField<String>,
    private val backfillProgress: JsonField<Double>,
    private val backfillStatus: JsonField<String>,
    private val codeEvaluators: JsonField<List<CodeEvaluatorTopLevel>>,
    private val correctionsDatasetId: JsonField<String>,
    private val datasetId: JsonField<String>,
    private val datasetName: JsonField<String>,
    private val evaluatorId: JsonField<String>,
    private val evaluators: JsonField<List<EvaluatorTopLevel>>,
    private val extendOnly: JsonField<Boolean>,
    private val filter: JsonField<String>,
    private val groupBy: JsonField<GroupBy>,
    private val includeExtendedStats: JsonField<Boolean>,
    private val isEnabled: JsonField<Boolean>,
    private val numFewShotExamples: JsonField<Long>,
    private val sessionId: JsonField<String>,
    private val sessionName: JsonField<String>,
    private val traceFilter: JsonField<String>,
    private val isTransient: JsonField<Boolean>,
    private val treeFilter: JsonField<String>,
    private val useCorrectionsDataset: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("display_name")
        @ExcludeMissing
        displayName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("evaluator_version")
        @ExcludeMissing
        evaluatorVersion: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("sampling_rate")
        @ExcludeMissing
        samplingRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tenant_id") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("webhooks")
        @ExcludeMissing
        webhooks: JsonField<List<EvaluatorWebhook>> = JsonMissing.of(),
        @JsonProperty("add_to_annotation_queue_id")
        @ExcludeMissing
        addToAnnotationQueueId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("add_to_annotation_queue_name")
        @ExcludeMissing
        addToAnnotationQueueName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("add_to_dataset_id")
        @ExcludeMissing
        addToDatasetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("add_to_dataset_name")
        @ExcludeMissing
        addToDatasetName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("add_to_dataset_prefer_correction")
        @ExcludeMissing
        addToDatasetPreferCorrection: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("alerts")
        @ExcludeMissing
        alerts: JsonField<List<EvaluatorPagerdutyAlert>> = JsonMissing.of(),
        @JsonProperty("alignment_annotation_queue_id")
        @ExcludeMissing
        alignmentAnnotationQueueId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("backfill_completed_at")
        @ExcludeMissing
        backfillCompletedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("backfill_error")
        @ExcludeMissing
        backfillError: JsonField<String> = JsonMissing.of(),
        @JsonProperty("backfill_from")
        @ExcludeMissing
        backfillFrom: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("backfill_id")
        @ExcludeMissing
        backfillId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("backfill_progress")
        @ExcludeMissing
        backfillProgress: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("backfill_status")
        @ExcludeMissing
        backfillStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("code_evaluators")
        @ExcludeMissing
        codeEvaluators: JsonField<List<CodeEvaluatorTopLevel>> = JsonMissing.of(),
        @JsonProperty("corrections_dataset_id")
        @ExcludeMissing
        correctionsDatasetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataset_id") @ExcludeMissing datasetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataset_name")
        @ExcludeMissing
        datasetName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("evaluator_id")
        @ExcludeMissing
        evaluatorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("evaluators")
        @ExcludeMissing
        evaluators: JsonField<List<EvaluatorTopLevel>> = JsonMissing.of(),
        @JsonProperty("extend_only")
        @ExcludeMissing
        extendOnly: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("filter") @ExcludeMissing filter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("group_by") @ExcludeMissing groupBy: JsonField<GroupBy> = JsonMissing.of(),
        @JsonProperty("include_extended_stats")
        @ExcludeMissing
        includeExtendedStats: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_enabled")
        @ExcludeMissing
        isEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("num_few_shot_examples")
        @ExcludeMissing
        numFewShotExamples: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("session_id") @ExcludeMissing sessionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("session_name")
        @ExcludeMissing
        sessionName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trace_filter")
        @ExcludeMissing
        traceFilter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transient")
        @ExcludeMissing
        isTransient: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("tree_filter")
        @ExcludeMissing
        treeFilter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("use_corrections_dataset")
        @ExcludeMissing
        useCorrectionsDataset: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        displayName,
        evaluatorVersion,
        samplingRate,
        tenantId,
        updatedAt,
        webhooks,
        addToAnnotationQueueId,
        addToAnnotationQueueName,
        addToDatasetId,
        addToDatasetName,
        addToDatasetPreferCorrection,
        alerts,
        alignmentAnnotationQueueId,
        backfillCompletedAt,
        backfillError,
        backfillFrom,
        backfillId,
        backfillProgress,
        backfillStatus,
        codeEvaluators,
        correctionsDatasetId,
        datasetId,
        datasetName,
        evaluatorId,
        evaluators,
        extendOnly,
        filter,
        groupBy,
        includeExtendedStats,
        isEnabled,
        numFewShotExamples,
        sessionId,
        sessionName,
        traceFilter,
        isTransient,
        treeFilter,
        useCorrectionsDataset,
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
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun displayName(): String = displayName.getRequired("display_name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun evaluatorVersion(): Long = evaluatorVersion.getRequired("evaluator_version")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun samplingRate(): Double = samplingRate.getRequired("sampling_rate")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tenantId(): String = tenantId.getRequired("tenant_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhooks(): Optional<List<EvaluatorWebhook>> = webhooks.getOptional("webhooks")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addToAnnotationQueueId(): Optional<String> =
        addToAnnotationQueueId.getOptional("add_to_annotation_queue_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addToAnnotationQueueName(): Optional<String> =
        addToAnnotationQueueName.getOptional("add_to_annotation_queue_name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addToDatasetId(): Optional<String> = addToDatasetId.getOptional("add_to_dataset_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addToDatasetName(): Optional<String> = addToDatasetName.getOptional("add_to_dataset_name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addToDatasetPreferCorrection(): Optional<Boolean> =
        addToDatasetPreferCorrection.getOptional("add_to_dataset_prefer_correction")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun alerts(): Optional<List<EvaluatorPagerdutyAlert>> = alerts.getOptional("alerts")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun alignmentAnnotationQueueId(): Optional<String> =
        alignmentAnnotationQueueId.getOptional("alignment_annotation_queue_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun backfillCompletedAt(): Optional<OffsetDateTime> =
        backfillCompletedAt.getOptional("backfill_completed_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun backfillError(): Optional<String> = backfillError.getOptional("backfill_error")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun backfillFrom(): Optional<OffsetDateTime> = backfillFrom.getOptional("backfill_from")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun backfillId(): Optional<String> = backfillId.getOptional("backfill_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun backfillProgress(): Optional<Double> = backfillProgress.getOptional("backfill_progress")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun backfillStatus(): Optional<String> = backfillStatus.getOptional("backfill_status")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun codeEvaluators(): Optional<List<CodeEvaluatorTopLevel>> =
        codeEvaluators.getOptional("code_evaluators")

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
    fun evaluatorId(): Optional<String> = evaluatorId.getOptional("evaluator_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun evaluators(): Optional<List<EvaluatorTopLevel>> = evaluators.getOptional("evaluators")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extendOnly(): Optional<Boolean> = extendOnly.getOptional("extend_only")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filter(): Optional<String> = filter.getOptional("filter")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groupBy(): Optional<GroupBy> = groupBy.getOptional("group_by")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeExtendedStats(): Optional<Boolean> =
        includeExtendedStats.getOptional("include_extended_stats")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isEnabled(): Optional<Boolean> = isEnabled.getOptional("is_enabled")

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
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun traceFilter(): Optional<String> = traceFilter.getOptional("trace_filter")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isTransient(): Optional<Boolean> = isTransient.getOptional("transient")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun treeFilter(): Optional<String> = treeFilter.getOptional("tree_filter")

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
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("display_name")
    @ExcludeMissing
    fun _displayName(): JsonField<String> = displayName

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
     * Returns the raw JSON value of [samplingRate].
     *
     * Unlike [samplingRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sampling_rate")
    @ExcludeMissing
    fun _samplingRate(): JsonField<Double> = samplingRate

    /**
     * Returns the raw JSON value of [tenantId].
     *
     * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [webhooks].
     *
     * Unlike [webhooks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webhooks")
    @ExcludeMissing
    fun _webhooks(): JsonField<List<EvaluatorWebhook>> = webhooks

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
     * Returns the raw JSON value of [addToAnnotationQueueName].
     *
     * Unlike [addToAnnotationQueueName], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("add_to_annotation_queue_name")
    @ExcludeMissing
    fun _addToAnnotationQueueName(): JsonField<String> = addToAnnotationQueueName

    /**
     * Returns the raw JSON value of [addToDatasetId].
     *
     * Unlike [addToDatasetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("add_to_dataset_id")
    @ExcludeMissing
    fun _addToDatasetId(): JsonField<String> = addToDatasetId

    /**
     * Returns the raw JSON value of [addToDatasetName].
     *
     * Unlike [addToDatasetName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("add_to_dataset_name")
    @ExcludeMissing
    fun _addToDatasetName(): JsonField<String> = addToDatasetName

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
    fun _alerts(): JsonField<List<EvaluatorPagerdutyAlert>> = alerts

    /**
     * Returns the raw JSON value of [alignmentAnnotationQueueId].
     *
     * Unlike [alignmentAnnotationQueueId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("alignment_annotation_queue_id")
    @ExcludeMissing
    fun _alignmentAnnotationQueueId(): JsonField<String> = alignmentAnnotationQueueId

    /**
     * Returns the raw JSON value of [backfillCompletedAt].
     *
     * Unlike [backfillCompletedAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("backfill_completed_at")
    @ExcludeMissing
    fun _backfillCompletedAt(): JsonField<OffsetDateTime> = backfillCompletedAt

    /**
     * Returns the raw JSON value of [backfillError].
     *
     * Unlike [backfillError], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("backfill_error")
    @ExcludeMissing
    fun _backfillError(): JsonField<String> = backfillError

    /**
     * Returns the raw JSON value of [backfillFrom].
     *
     * Unlike [backfillFrom], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("backfill_from")
    @ExcludeMissing
    fun _backfillFrom(): JsonField<OffsetDateTime> = backfillFrom

    /**
     * Returns the raw JSON value of [backfillId].
     *
     * Unlike [backfillId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("backfill_id") @ExcludeMissing fun _backfillId(): JsonField<String> = backfillId

    /**
     * Returns the raw JSON value of [backfillProgress].
     *
     * Unlike [backfillProgress], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("backfill_progress")
    @ExcludeMissing
    fun _backfillProgress(): JsonField<Double> = backfillProgress

    /**
     * Returns the raw JSON value of [backfillStatus].
     *
     * Unlike [backfillStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("backfill_status")
    @ExcludeMissing
    fun _backfillStatus(): JsonField<String> = backfillStatus

    /**
     * Returns the raw JSON value of [codeEvaluators].
     *
     * Unlike [codeEvaluators], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code_evaluators")
    @ExcludeMissing
    fun _codeEvaluators(): JsonField<List<CodeEvaluatorTopLevel>> = codeEvaluators

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
     * Returns the raw JSON value of [evaluatorId].
     *
     * Unlike [evaluatorId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("evaluator_id")
    @ExcludeMissing
    fun _evaluatorId(): JsonField<String> = evaluatorId

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
    @JsonProperty("extend_only") @ExcludeMissing fun _extendOnly(): JsonField<Boolean> = extendOnly

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
     * Unlike [includeExtendedStats], this method doesn't throw if the JSON field has an unexpected
     * type.
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
     * Returns the raw JSON value of [traceFilter].
     *
     * Unlike [traceFilter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trace_filter")
    @ExcludeMissing
    fun _traceFilter(): JsonField<String> = traceFilter

    /**
     * Returns the raw JSON value of [isTransient].
     *
     * Unlike [isTransient], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transient") @ExcludeMissing fun _isTransient(): JsonField<Boolean> = isTransient

    /**
     * Returns the raw JSON value of [treeFilter].
     *
     * Unlike [treeFilter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tree_filter") @ExcludeMissing fun _treeFilter(): JsonField<String> = treeFilter

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

        /**
         * Returns a mutable builder for constructing an instance of [Evaluator].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .displayName()
         * .evaluatorVersion()
         * .samplingRate()
         * .tenantId()
         * .updatedAt()
         * .webhooks()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Evaluator]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var displayName: JsonField<String>? = null
        private var evaluatorVersion: JsonField<Long>? = null
        private var samplingRate: JsonField<Double>? = null
        private var tenantId: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var webhooks: JsonField<MutableList<EvaluatorWebhook>>? = null
        private var addToAnnotationQueueId: JsonField<String> = JsonMissing.of()
        private var addToAnnotationQueueName: JsonField<String> = JsonMissing.of()
        private var addToDatasetId: JsonField<String> = JsonMissing.of()
        private var addToDatasetName: JsonField<String> = JsonMissing.of()
        private var addToDatasetPreferCorrection: JsonField<Boolean> = JsonMissing.of()
        private var alerts: JsonField<MutableList<EvaluatorPagerdutyAlert>>? = null
        private var alignmentAnnotationQueueId: JsonField<String> = JsonMissing.of()
        private var backfillCompletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var backfillError: JsonField<String> = JsonMissing.of()
        private var backfillFrom: JsonField<OffsetDateTime> = JsonMissing.of()
        private var backfillId: JsonField<String> = JsonMissing.of()
        private var backfillProgress: JsonField<Double> = JsonMissing.of()
        private var backfillStatus: JsonField<String> = JsonMissing.of()
        private var codeEvaluators: JsonField<MutableList<CodeEvaluatorTopLevel>>? = null
        private var correctionsDatasetId: JsonField<String> = JsonMissing.of()
        private var datasetId: JsonField<String> = JsonMissing.of()
        private var datasetName: JsonField<String> = JsonMissing.of()
        private var evaluatorId: JsonField<String> = JsonMissing.of()
        private var evaluators: JsonField<MutableList<EvaluatorTopLevel>>? = null
        private var extendOnly: JsonField<Boolean> = JsonMissing.of()
        private var filter: JsonField<String> = JsonMissing.of()
        private var groupBy: JsonField<GroupBy> = JsonMissing.of()
        private var includeExtendedStats: JsonField<Boolean> = JsonMissing.of()
        private var isEnabled: JsonField<Boolean> = JsonMissing.of()
        private var numFewShotExamples: JsonField<Long> = JsonMissing.of()
        private var sessionId: JsonField<String> = JsonMissing.of()
        private var sessionName: JsonField<String> = JsonMissing.of()
        private var traceFilter: JsonField<String> = JsonMissing.of()
        private var isTransient: JsonField<Boolean> = JsonMissing.of()
        private var treeFilter: JsonField<String> = JsonMissing.of()
        private var useCorrectionsDataset: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(evaluator: Evaluator) = apply {
            id = evaluator.id
            createdAt = evaluator.createdAt
            displayName = evaluator.displayName
            evaluatorVersion = evaluator.evaluatorVersion
            samplingRate = evaluator.samplingRate
            tenantId = evaluator.tenantId
            updatedAt = evaluator.updatedAt
            webhooks = evaluator.webhooks.map { it.toMutableList() }
            addToAnnotationQueueId = evaluator.addToAnnotationQueueId
            addToAnnotationQueueName = evaluator.addToAnnotationQueueName
            addToDatasetId = evaluator.addToDatasetId
            addToDatasetName = evaluator.addToDatasetName
            addToDatasetPreferCorrection = evaluator.addToDatasetPreferCorrection
            alerts = evaluator.alerts.map { it.toMutableList() }
            alignmentAnnotationQueueId = evaluator.alignmentAnnotationQueueId
            backfillCompletedAt = evaluator.backfillCompletedAt
            backfillError = evaluator.backfillError
            backfillFrom = evaluator.backfillFrom
            backfillId = evaluator.backfillId
            backfillProgress = evaluator.backfillProgress
            backfillStatus = evaluator.backfillStatus
            codeEvaluators = evaluator.codeEvaluators.map { it.toMutableList() }
            correctionsDatasetId = evaluator.correctionsDatasetId
            datasetId = evaluator.datasetId
            datasetName = evaluator.datasetName
            evaluatorId = evaluator.evaluatorId
            evaluators = evaluator.evaluators.map { it.toMutableList() }
            extendOnly = evaluator.extendOnly
            filter = evaluator.filter
            groupBy = evaluator.groupBy
            includeExtendedStats = evaluator.includeExtendedStats
            isEnabled = evaluator.isEnabled
            numFewShotExamples = evaluator.numFewShotExamples
            sessionId = evaluator.sessionId
            sessionName = evaluator.sessionName
            traceFilter = evaluator.traceFilter
            isTransient = evaluator.isTransient
            treeFilter = evaluator.treeFilter
            useCorrectionsDataset = evaluator.useCorrectionsDataset
            additionalProperties = evaluator.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun displayName(displayName: String) = displayName(JsonField.of(displayName))

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { this.displayName = displayName }

        fun evaluatorVersion(evaluatorVersion: Long) =
            evaluatorVersion(JsonField.of(evaluatorVersion))

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

        fun samplingRate(samplingRate: Double) = samplingRate(JsonField.of(samplingRate))

        /**
         * Sets [Builder.samplingRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.samplingRate] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun samplingRate(samplingRate: JsonField<Double>) = apply {
            this.samplingRate = samplingRate
        }

        fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

        /**
         * Sets [Builder.tenantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tenantId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun webhooks(webhooks: List<EvaluatorWebhook>?) = webhooks(JsonField.ofNullable(webhooks))

        /** Alias for calling [Builder.webhooks] with `webhooks.orElse(null)`. */
        fun webhooks(webhooks: Optional<List<EvaluatorWebhook>>) = webhooks(webhooks.getOrNull())

        /**
         * Sets [Builder.webhooks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhooks] with a well-typed `List<EvaluatorWebhook>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun webhooks(webhooks: JsonField<List<EvaluatorWebhook>>) = apply {
            this.webhooks = webhooks.map { it.toMutableList() }
        }

        /**
         * Adds a single [EvaluatorWebhook] to [webhooks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWebhook(webhook: EvaluatorWebhook) = apply {
            webhooks =
                (webhooks ?: JsonField.of(mutableListOf())).also {
                    checkKnown("webhooks", it).add(webhook)
                }
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
         * You should usually call [Builder.addToAnnotationQueueId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun addToAnnotationQueueId(addToAnnotationQueueId: JsonField<String>) = apply {
            this.addToAnnotationQueueId = addToAnnotationQueueId
        }

        fun addToAnnotationQueueName(addToAnnotationQueueName: String?) =
            addToAnnotationQueueName(JsonField.ofNullable(addToAnnotationQueueName))

        /**
         * Alias for calling [Builder.addToAnnotationQueueName] with
         * `addToAnnotationQueueName.orElse(null)`.
         */
        fun addToAnnotationQueueName(addToAnnotationQueueName: Optional<String>) =
            addToAnnotationQueueName(addToAnnotationQueueName.getOrNull())

        /**
         * Sets [Builder.addToAnnotationQueueName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addToAnnotationQueueName] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun addToAnnotationQueueName(addToAnnotationQueueName: JsonField<String>) = apply {
            this.addToAnnotationQueueName = addToAnnotationQueueName
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

        fun addToDatasetName(addToDatasetName: String?) =
            addToDatasetName(JsonField.ofNullable(addToDatasetName))

        /** Alias for calling [Builder.addToDatasetName] with `addToDatasetName.orElse(null)`. */
        fun addToDatasetName(addToDatasetName: Optional<String>) =
            addToDatasetName(addToDatasetName.getOrNull())

        /**
         * Sets [Builder.addToDatasetName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addToDatasetName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun addToDatasetName(addToDatasetName: JsonField<String>) = apply {
            this.addToDatasetName = addToDatasetName
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
        fun addToDatasetPreferCorrection(addToDatasetPreferCorrection: JsonField<Boolean>) = apply {
            this.addToDatasetPreferCorrection = addToDatasetPreferCorrection
        }

        fun alerts(alerts: List<EvaluatorPagerdutyAlert>?) = alerts(JsonField.ofNullable(alerts))

        /** Alias for calling [Builder.alerts] with `alerts.orElse(null)`. */
        fun alerts(alerts: Optional<List<EvaluatorPagerdutyAlert>>) = alerts(alerts.getOrNull())

        /**
         * Sets [Builder.alerts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alerts] with a well-typed
         * `List<EvaluatorPagerdutyAlert>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun alerts(alerts: JsonField<List<EvaluatorPagerdutyAlert>>) = apply {
            this.alerts = alerts.map { it.toMutableList() }
        }

        /**
         * Adds a single [EvaluatorPagerdutyAlert] to [alerts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAlert(alert: EvaluatorPagerdutyAlert) = apply {
            alerts =
                (alerts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("alerts", it).add(alert)
                }
        }

        fun alignmentAnnotationQueueId(alignmentAnnotationQueueId: String?) =
            alignmentAnnotationQueueId(JsonField.ofNullable(alignmentAnnotationQueueId))

        /**
         * Alias for calling [Builder.alignmentAnnotationQueueId] with
         * `alignmentAnnotationQueueId.orElse(null)`.
         */
        fun alignmentAnnotationQueueId(alignmentAnnotationQueueId: Optional<String>) =
            alignmentAnnotationQueueId(alignmentAnnotationQueueId.getOrNull())

        /**
         * Sets [Builder.alignmentAnnotationQueueId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alignmentAnnotationQueueId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun alignmentAnnotationQueueId(alignmentAnnotationQueueId: JsonField<String>) = apply {
            this.alignmentAnnotationQueueId = alignmentAnnotationQueueId
        }

        fun backfillCompletedAt(backfillCompletedAt: OffsetDateTime?) =
            backfillCompletedAt(JsonField.ofNullable(backfillCompletedAt))

        /**
         * Alias for calling [Builder.backfillCompletedAt] with `backfillCompletedAt.orElse(null)`.
         */
        fun backfillCompletedAt(backfillCompletedAt: Optional<OffsetDateTime>) =
            backfillCompletedAt(backfillCompletedAt.getOrNull())

        /**
         * Sets [Builder.backfillCompletedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backfillCompletedAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun backfillCompletedAt(backfillCompletedAt: JsonField<OffsetDateTime>) = apply {
            this.backfillCompletedAt = backfillCompletedAt
        }

        fun backfillError(backfillError: String?) =
            backfillError(JsonField.ofNullable(backfillError))

        /** Alias for calling [Builder.backfillError] with `backfillError.orElse(null)`. */
        fun backfillError(backfillError: Optional<String>) =
            backfillError(backfillError.getOrNull())

        /**
         * Sets [Builder.backfillError] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backfillError] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun backfillError(backfillError: JsonField<String>) = apply {
            this.backfillError = backfillError
        }

        fun backfillFrom(backfillFrom: OffsetDateTime?) =
            backfillFrom(JsonField.ofNullable(backfillFrom))

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
            this.backfillFrom = backfillFrom
        }

        fun backfillId(backfillId: String?) = backfillId(JsonField.ofNullable(backfillId))

        /** Alias for calling [Builder.backfillId] with `backfillId.orElse(null)`. */
        fun backfillId(backfillId: Optional<String>) = backfillId(backfillId.getOrNull())

        /**
         * Sets [Builder.backfillId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backfillId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun backfillId(backfillId: JsonField<String>) = apply { this.backfillId = backfillId }

        fun backfillProgress(backfillProgress: Double?) =
            backfillProgress(JsonField.ofNullable(backfillProgress))

        /**
         * Alias for [Builder.backfillProgress].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun backfillProgress(backfillProgress: Double) =
            backfillProgress(backfillProgress as Double?)

        /** Alias for calling [Builder.backfillProgress] with `backfillProgress.orElse(null)`. */
        fun backfillProgress(backfillProgress: Optional<Double>) =
            backfillProgress(backfillProgress.getOrNull())

        /**
         * Sets [Builder.backfillProgress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backfillProgress] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun backfillProgress(backfillProgress: JsonField<Double>) = apply {
            this.backfillProgress = backfillProgress
        }

        fun backfillStatus(backfillStatus: String?) =
            backfillStatus(JsonField.ofNullable(backfillStatus))

        /** Alias for calling [Builder.backfillStatus] with `backfillStatus.orElse(null)`. */
        fun backfillStatus(backfillStatus: Optional<String>) =
            backfillStatus(backfillStatus.getOrNull())

        /**
         * Sets [Builder.backfillStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backfillStatus] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun backfillStatus(backfillStatus: JsonField<String>) = apply {
            this.backfillStatus = backfillStatus
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

        fun correctionsDatasetId(correctionsDatasetId: String?) =
            correctionsDatasetId(JsonField.ofNullable(correctionsDatasetId))

        /**
         * Alias for calling [Builder.correctionsDatasetId] with
         * `correctionsDatasetId.orElse(null)`.
         */
        fun correctionsDatasetId(correctionsDatasetId: Optional<String>) =
            correctionsDatasetId(correctionsDatasetId.getOrNull())

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

        fun datasetId(datasetId: String?) = datasetId(JsonField.ofNullable(datasetId))

        /** Alias for calling [Builder.datasetId] with `datasetId.orElse(null)`. */
        fun datasetId(datasetId: Optional<String>) = datasetId(datasetId.getOrNull())

        /**
         * Sets [Builder.datasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasetId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

        fun datasetName(datasetName: String?) = datasetName(JsonField.ofNullable(datasetName))

        /** Alias for calling [Builder.datasetName] with `datasetName.orElse(null)`. */
        fun datasetName(datasetName: Optional<String>) = datasetName(datasetName.getOrNull())

        /**
         * Sets [Builder.datasetName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasetName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun datasetName(datasetName: JsonField<String>) = apply { this.datasetName = datasetName }

        fun evaluatorId(evaluatorId: String?) = evaluatorId(JsonField.ofNullable(evaluatorId))

        /** Alias for calling [Builder.evaluatorId] with `evaluatorId.orElse(null)`. */
        fun evaluatorId(evaluatorId: Optional<String>) = evaluatorId(evaluatorId.getOrNull())

        /**
         * Sets [Builder.evaluatorId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evaluatorId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun evaluatorId(evaluatorId: JsonField<String>) = apply { this.evaluatorId = evaluatorId }

        fun evaluators(evaluators: List<EvaluatorTopLevel>?) =
            evaluators(JsonField.ofNullable(evaluators))

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
         * You should usually call [Builder.extendOnly] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun extendOnly(extendOnly: JsonField<Boolean>) = apply { this.extendOnly = extendOnly }

        fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<String>) = filter(filter.getOrNull())

        /**
         * Sets [Builder.filter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filter] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filter(filter: JsonField<String>) = apply { this.filter = filter }

        fun groupBy(groupBy: GroupBy?) = groupBy(JsonField.ofNullable(groupBy))

        /** Alias for calling [Builder.groupBy] with `groupBy.orElse(null)`. */
        fun groupBy(groupBy: Optional<GroupBy>) = groupBy(groupBy.getOrNull())

        /**
         * Sets [Builder.groupBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupBy] with a well-typed [GroupBy] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun groupBy(groupBy: JsonField<GroupBy>) = apply { this.groupBy = groupBy }

        fun includeExtendedStats(includeExtendedStats: Boolean) =
            includeExtendedStats(JsonField.of(includeExtendedStats))

        /**
         * Sets [Builder.includeExtendedStats] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeExtendedStats] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun includeExtendedStats(includeExtendedStats: JsonField<Boolean>) = apply {
            this.includeExtendedStats = includeExtendedStats
        }

        fun isEnabled(isEnabled: Boolean) = isEnabled(JsonField.of(isEnabled))

        /**
         * Sets [Builder.isEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isEnabled] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
            this.numFewShotExamples = numFewShotExamples
        }

        fun sessionId(sessionId: String?) = sessionId(JsonField.ofNullable(sessionId))

        /** Alias for calling [Builder.sessionId] with `sessionId.orElse(null)`. */
        fun sessionId(sessionId: Optional<String>) = sessionId(sessionId.getOrNull())

        /**
         * Sets [Builder.sessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

        fun sessionName(sessionName: String?) = sessionName(JsonField.ofNullable(sessionName))

        /** Alias for calling [Builder.sessionName] with `sessionName.orElse(null)`. */
        fun sessionName(sessionName: Optional<String>) = sessionName(sessionName.getOrNull())

        /**
         * Sets [Builder.sessionName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionName(sessionName: JsonField<String>) = apply { this.sessionName = sessionName }

        fun traceFilter(traceFilter: String?) = traceFilter(JsonField.ofNullable(traceFilter))

        /** Alias for calling [Builder.traceFilter] with `traceFilter.orElse(null)`. */
        fun traceFilter(traceFilter: Optional<String>) = traceFilter(traceFilter.getOrNull())

        /**
         * Sets [Builder.traceFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.traceFilter] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun traceFilter(traceFilter: JsonField<String>) = apply { this.traceFilter = traceFilter }

        fun isTransient(isTransient: Boolean) = isTransient(JsonField.of(isTransient))

        /**
         * Sets [Builder.isTransient] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isTransient] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isTransient(isTransient: JsonField<Boolean>) = apply { this.isTransient = isTransient }

        fun treeFilter(treeFilter: String?) = treeFilter(JsonField.ofNullable(treeFilter))

        /** Alias for calling [Builder.treeFilter] with `treeFilter.orElse(null)`. */
        fun treeFilter(treeFilter: Optional<String>) = treeFilter(treeFilter.getOrNull())

        /**
         * Sets [Builder.treeFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.treeFilter] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun treeFilter(treeFilter: JsonField<String>) = apply { this.treeFilter = treeFilter }

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
         * Returns an immutable instance of [Evaluator].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .displayName()
         * .evaluatorVersion()
         * .samplingRate()
         * .tenantId()
         * .updatedAt()
         * .webhooks()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Evaluator =
            Evaluator(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("displayName", displayName),
                checkRequired("evaluatorVersion", evaluatorVersion),
                checkRequired("samplingRate", samplingRate),
                checkRequired("tenantId", tenantId),
                checkRequired("updatedAt", updatedAt),
                checkRequired("webhooks", webhooks).map { it.toImmutable() },
                addToAnnotationQueueId,
                addToAnnotationQueueName,
                addToDatasetId,
                addToDatasetName,
                addToDatasetPreferCorrection,
                (alerts ?: JsonMissing.of()).map { it.toImmutable() },
                alignmentAnnotationQueueId,
                backfillCompletedAt,
                backfillError,
                backfillFrom,
                backfillId,
                backfillProgress,
                backfillStatus,
                (codeEvaluators ?: JsonMissing.of()).map { it.toImmutable() },
                correctionsDatasetId,
                datasetId,
                datasetName,
                evaluatorId,
                (evaluators ?: JsonMissing.of()).map { it.toImmutable() },
                extendOnly,
                filter,
                groupBy,
                includeExtendedStats,
                isEnabled,
                numFewShotExamples,
                sessionId,
                sessionName,
                traceFilter,
                isTransient,
                treeFilter,
                useCorrectionsDataset,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Evaluator = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        displayName()
        evaluatorVersion()
        samplingRate()
        tenantId()
        updatedAt()
        webhooks().ifPresent { it.forEach { it.validate() } }
        addToAnnotationQueueId()
        addToAnnotationQueueName()
        addToDatasetId()
        addToDatasetName()
        addToDatasetPreferCorrection()
        alerts().ifPresent { it.forEach { it.validate() } }
        alignmentAnnotationQueueId()
        backfillCompletedAt()
        backfillError()
        backfillFrom()
        backfillId()
        backfillProgress()
        backfillStatus()
        codeEvaluators().ifPresent { it.forEach { it.validate() } }
        correctionsDatasetId()
        datasetId()
        datasetName()
        evaluatorId()
        evaluators().ifPresent { it.forEach { it.validate() } }
        extendOnly()
        filter()
        groupBy().ifPresent { it.validate() }
        includeExtendedStats()
        isEnabled()
        numFewShotExamples()
        sessionId()
        sessionName()
        traceFilter()
        isTransient()
        treeFilter()
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (displayName.asKnown().isPresent) 1 else 0) +
            (if (evaluatorVersion.asKnown().isPresent) 1 else 0) +
            (if (samplingRate.asKnown().isPresent) 1 else 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (webhooks.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (addToAnnotationQueueId.asKnown().isPresent) 1 else 0) +
            (if (addToAnnotationQueueName.asKnown().isPresent) 1 else 0) +
            (if (addToDatasetId.asKnown().isPresent) 1 else 0) +
            (if (addToDatasetName.asKnown().isPresent) 1 else 0) +
            (if (addToDatasetPreferCorrection.asKnown().isPresent) 1 else 0) +
            (alerts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (alignmentAnnotationQueueId.asKnown().isPresent) 1 else 0) +
            (if (backfillCompletedAt.asKnown().isPresent) 1 else 0) +
            (if (backfillError.asKnown().isPresent) 1 else 0) +
            (if (backfillFrom.asKnown().isPresent) 1 else 0) +
            (if (backfillId.asKnown().isPresent) 1 else 0) +
            (if (backfillProgress.asKnown().isPresent) 1 else 0) +
            (if (backfillStatus.asKnown().isPresent) 1 else 0) +
            (codeEvaluators.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (correctionsDatasetId.asKnown().isPresent) 1 else 0) +
            (if (datasetId.asKnown().isPresent) 1 else 0) +
            (if (datasetName.asKnown().isPresent) 1 else 0) +
            (if (evaluatorId.asKnown().isPresent) 1 else 0) +
            (evaluators.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (extendOnly.asKnown().isPresent) 1 else 0) +
            (if (filter.asKnown().isPresent) 1 else 0) +
            (groupBy.asKnown().getOrNull()?.validity() ?: 0) +
            (if (includeExtendedStats.asKnown().isPresent) 1 else 0) +
            (if (isEnabled.asKnown().isPresent) 1 else 0) +
            (if (numFewShotExamples.asKnown().isPresent) 1 else 0) +
            (if (sessionId.asKnown().isPresent) 1 else 0) +
            (if (sessionName.asKnown().isPresent) 1 else 0) +
            (if (traceFilter.asKnown().isPresent) 1 else 0) +
            (if (isTransient.asKnown().isPresent) 1 else 0) +
            (if (treeFilter.asKnown().isPresent) 1 else 0) +
            (if (useCorrectionsDataset.asKnown().isPresent) 1 else 0)

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
         * @throws LangChainInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                THREAD_ID -> Known.THREAD_ID
                else -> throw LangChainInvalidDataException("Unknown GroupBy: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangChainInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangChainInvalidDataException("Value is not a String")
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
            } catch (e: LangChainInvalidDataException) {
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

        return other is Evaluator &&
            id == other.id &&
            createdAt == other.createdAt &&
            displayName == other.displayName &&
            evaluatorVersion == other.evaluatorVersion &&
            samplingRate == other.samplingRate &&
            tenantId == other.tenantId &&
            updatedAt == other.updatedAt &&
            webhooks == other.webhooks &&
            addToAnnotationQueueId == other.addToAnnotationQueueId &&
            addToAnnotationQueueName == other.addToAnnotationQueueName &&
            addToDatasetId == other.addToDatasetId &&
            addToDatasetName == other.addToDatasetName &&
            addToDatasetPreferCorrection == other.addToDatasetPreferCorrection &&
            alerts == other.alerts &&
            alignmentAnnotationQueueId == other.alignmentAnnotationQueueId &&
            backfillCompletedAt == other.backfillCompletedAt &&
            backfillError == other.backfillError &&
            backfillFrom == other.backfillFrom &&
            backfillId == other.backfillId &&
            backfillProgress == other.backfillProgress &&
            backfillStatus == other.backfillStatus &&
            codeEvaluators == other.codeEvaluators &&
            correctionsDatasetId == other.correctionsDatasetId &&
            datasetId == other.datasetId &&
            datasetName == other.datasetName &&
            evaluatorId == other.evaluatorId &&
            evaluators == other.evaluators &&
            extendOnly == other.extendOnly &&
            filter == other.filter &&
            groupBy == other.groupBy &&
            includeExtendedStats == other.includeExtendedStats &&
            isEnabled == other.isEnabled &&
            numFewShotExamples == other.numFewShotExamples &&
            sessionId == other.sessionId &&
            sessionName == other.sessionName &&
            traceFilter == other.traceFilter &&
            isTransient == other.isTransient &&
            treeFilter == other.treeFilter &&
            useCorrectionsDataset == other.useCorrectionsDataset &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            displayName,
            evaluatorVersion,
            samplingRate,
            tenantId,
            updatedAt,
            webhooks,
            addToAnnotationQueueId,
            addToAnnotationQueueName,
            addToDatasetId,
            addToDatasetName,
            addToDatasetPreferCorrection,
            alerts,
            alignmentAnnotationQueueId,
            backfillCompletedAt,
            backfillError,
            backfillFrom,
            backfillId,
            backfillProgress,
            backfillStatus,
            codeEvaluators,
            correctionsDatasetId,
            datasetId,
            datasetName,
            evaluatorId,
            evaluators,
            extendOnly,
            filter,
            groupBy,
            includeExtendedStats,
            isEnabled,
            numFewShotExamples,
            sessionId,
            sessionName,
            traceFilter,
            isTransient,
            treeFilter,
            useCorrectionsDataset,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Evaluator{id=$id, createdAt=$createdAt, displayName=$displayName, evaluatorVersion=$evaluatorVersion, samplingRate=$samplingRate, tenantId=$tenantId, updatedAt=$updatedAt, webhooks=$webhooks, addToAnnotationQueueId=$addToAnnotationQueueId, addToAnnotationQueueName=$addToAnnotationQueueName, addToDatasetId=$addToDatasetId, addToDatasetName=$addToDatasetName, addToDatasetPreferCorrection=$addToDatasetPreferCorrection, alerts=$alerts, alignmentAnnotationQueueId=$alignmentAnnotationQueueId, backfillCompletedAt=$backfillCompletedAt, backfillError=$backfillError, backfillFrom=$backfillFrom, backfillId=$backfillId, backfillProgress=$backfillProgress, backfillStatus=$backfillStatus, codeEvaluators=$codeEvaluators, correctionsDatasetId=$correctionsDatasetId, datasetId=$datasetId, datasetName=$datasetName, evaluatorId=$evaluatorId, evaluators=$evaluators, extendOnly=$extendOnly, filter=$filter, groupBy=$groupBy, includeExtendedStats=$includeExtendedStats, isEnabled=$isEnabled, numFewShotExamples=$numFewShotExamples, sessionId=$sessionId, sessionName=$sessionName, traceFilter=$traceFilter, isTransient=$isTransient, treeFilter=$treeFilter, useCorrectionsDataset=$useCorrectionsDataset, additionalProperties=$additionalProperties}"
}

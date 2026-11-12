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

class Rule
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val addToDatasetPreferCorrection: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val displayName: JsonField<String>,
    private val evaluatorVersion: JsonField<Long>,
    private val extendOnly: JsonField<Boolean>,
    private val includeExtendedStats: JsonField<Boolean>,
    private val isEnabled: JsonField<Boolean>,
    private val isManagedEvaluator: JsonField<Boolean>,
    private val isTracingDisabled: JsonField<Boolean>,
    private val samplingRate: JsonField<Double>,
    private val tenantId: JsonField<String>,
    private val isTransient: JsonField<Boolean>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val useCorrectionsDataset: JsonField<Boolean>,
    private val addToAnnotationQueueId: JsonField<String>,
    private val addToAnnotationQueueName: JsonField<String>,
    private val addToDatasetId: JsonField<String>,
    private val addToDatasetName: JsonField<String>,
    private val alerts: JsonField<List<Alert>>,
    private val alignmentAnnotationQueueId: JsonField<String>,
    private val backfillCompletedAt: JsonField<OffsetDateTime>,
    private val backfillError: JsonField<String>,
    private val backfillFrom: JsonField<OffsetDateTime>,
    private val backfillId: JsonField<String>,
    private val backfillProgress: JsonField<Double>,
    private val backfillStatus: JsonField<String>,
    private val codeEvaluators: JsonField<List<CodeEvaluator>>,
    private val correctionsDatasetId: JsonField<String>,
    private val datasetId: JsonField<String>,
    private val datasetName: JsonField<String>,
    private val effectiveSpendLimit: JsonField<EffectiveSpendLimit>,
    private val evaluatorId: JsonField<String>,
    private val evaluatorName: JsonField<String>,
    private val evaluatorType: JsonField<String>,
    private val evaluators: JsonField<List<Evaluator>>,
    private val extendAnnotationQueueTraceRetention: JsonField<Boolean>,
    private val extendDatasetTraceRetention: JsonField<Boolean>,
    private val extendEvaluatorTraceRetention: JsonField<Boolean>,
    private val extendWebhookTraceRetention: JsonField<Boolean>,
    private val filter: JsonField<String>,
    private val groupBy: JsonField<GroupBy>,
    private val numFewShotExamples: JsonField<Long>,
    private val projectId: JsonField<String>,
    private val projectName: JsonField<String>,
    private val spendLimit: JsonField<SpendLimit>,
    private val spendUsd: JsonField<Double>,
    private val threadFilter: JsonField<String>,
    private val traceCount: JsonField<Long>,
    private val traceFilter: JsonField<String>,
    private val treeFilter: JsonField<String>,
    private val webhooks: JsonField<List<Webhook>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("add_to_dataset_prefer_correction")
        @ExcludeMissing
        addToDatasetPreferCorrection: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("display_name")
        @ExcludeMissing
        displayName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("evaluator_version")
        @ExcludeMissing
        evaluatorVersion: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("extend_only")
        @ExcludeMissing
        extendOnly: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("include_extended_stats")
        @ExcludeMissing
        includeExtendedStats: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_enabled")
        @ExcludeMissing
        isEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_managed_evaluator")
        @ExcludeMissing
        isManagedEvaluator: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_tracing_disabled")
        @ExcludeMissing
        isTracingDisabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("sampling_rate")
        @ExcludeMissing
        samplingRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tenant_id") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transient")
        @ExcludeMissing
        isTransient: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("use_corrections_dataset")
        @ExcludeMissing
        useCorrectionsDataset: JsonField<Boolean> = JsonMissing.of(),
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
        @JsonProperty("alerts") @ExcludeMissing alerts: JsonField<List<Alert>> = JsonMissing.of(),
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
        codeEvaluators: JsonField<List<CodeEvaluator>> = JsonMissing.of(),
        @JsonProperty("corrections_dataset_id")
        @ExcludeMissing
        correctionsDatasetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataset_id") @ExcludeMissing datasetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataset_name")
        @ExcludeMissing
        datasetName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("effective_spend_limit")
        @ExcludeMissing
        effectiveSpendLimit: JsonField<EffectiveSpendLimit> = JsonMissing.of(),
        @JsonProperty("evaluator_id")
        @ExcludeMissing
        evaluatorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("evaluator_name")
        @ExcludeMissing
        evaluatorName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("evaluator_type")
        @ExcludeMissing
        evaluatorType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("evaluators")
        @ExcludeMissing
        evaluators: JsonField<List<Evaluator>> = JsonMissing.of(),
        @JsonProperty("extend_annotation_queue_trace_retention")
        @ExcludeMissing
        extendAnnotationQueueTraceRetention: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("extend_dataset_trace_retention")
        @ExcludeMissing
        extendDatasetTraceRetention: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("extend_evaluator_trace_retention")
        @ExcludeMissing
        extendEvaluatorTraceRetention: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("extend_webhook_trace_retention")
        @ExcludeMissing
        extendWebhookTraceRetention: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("filter") @ExcludeMissing filter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("group_by") @ExcludeMissing groupBy: JsonField<GroupBy> = JsonMissing.of(),
        @JsonProperty("num_few_shot_examples")
        @ExcludeMissing
        numFewShotExamples: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("project_id") @ExcludeMissing projectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("project_name")
        @ExcludeMissing
        projectName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("spend_limit")
        @ExcludeMissing
        spendLimit: JsonField<SpendLimit> = JsonMissing.of(),
        @JsonProperty("spend_usd") @ExcludeMissing spendUsd: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("thread_filter")
        @ExcludeMissing
        threadFilter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trace_count") @ExcludeMissing traceCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("trace_filter")
        @ExcludeMissing
        traceFilter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tree_filter")
        @ExcludeMissing
        treeFilter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("webhooks")
        @ExcludeMissing
        webhooks: JsonField<List<Webhook>> = JsonMissing.of(),
    ) : this(
        id,
        addToDatasetPreferCorrection,
        createdAt,
        displayName,
        evaluatorVersion,
        extendOnly,
        includeExtendedStats,
        isEnabled,
        isManagedEvaluator,
        isTracingDisabled,
        samplingRate,
        tenantId,
        isTransient,
        updatedAt,
        useCorrectionsDataset,
        addToAnnotationQueueId,
        addToAnnotationQueueName,
        addToDatasetId,
        addToDatasetName,
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
        effectiveSpendLimit,
        evaluatorId,
        evaluatorName,
        evaluatorType,
        evaluators,
        extendAnnotationQueueTraceRetention,
        extendDatasetTraceRetention,
        extendEvaluatorTraceRetention,
        extendWebhookTraceRetention,
        filter,
        groupBy,
        numFewShotExamples,
        projectId,
        projectName,
        spendLimit,
        spendUsd,
        threadFilter,
        traceCount,
        traceFilter,
        treeFilter,
        webhooks,
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
    fun addToDatasetPreferCorrection(): Boolean =
        addToDatasetPreferCorrection.getRequired("add_to_dataset_prefer_correction")

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
    fun extendOnly(): Boolean = extendOnly.getRequired("extend_only")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun includeExtendedStats(): Boolean = includeExtendedStats.getRequired("include_extended_stats")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isEnabled(): Boolean = isEnabled.getRequired("is_enabled")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isManagedEvaluator(): Boolean = isManagedEvaluator.getRequired("is_managed_evaluator")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isTracingDisabled(): Boolean = isTracingDisabled.getRequired("is_tracing_disabled")

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
    fun isTransient(): Boolean = isTransient.getRequired("transient")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun useCorrectionsDataset(): Boolean =
        useCorrectionsDataset.getRequired("use_corrections_dataset")

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
    fun alerts(): Optional<List<Alert>> = alerts.getOptional("alerts")

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
    fun codeEvaluators(): Optional<List<CodeEvaluator>> =
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
    fun effectiveSpendLimit(): Optional<EffectiveSpendLimit> =
        effectiveSpendLimit.getOptional("effective_spend_limit")

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
    fun evaluatorType(): Optional<String> = evaluatorType.getOptional("evaluator_type")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun evaluators(): Optional<List<Evaluator>> = evaluators.getOptional("evaluators")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extendAnnotationQueueTraceRetention(): Optional<Boolean> =
        extendAnnotationQueueTraceRetention.getOptional("extend_annotation_queue_trace_retention")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extendDatasetTraceRetention(): Optional<Boolean> =
        extendDatasetTraceRetention.getOptional("extend_dataset_trace_retention")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extendEvaluatorTraceRetention(): Optional<Boolean> =
        extendEvaluatorTraceRetention.getOptional("extend_evaluator_trace_retention")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extendWebhookTraceRetention(): Optional<Boolean> =
        extendWebhookTraceRetention.getOptional("extend_webhook_trace_retention")

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
    fun numFewShotExamples(): Optional<Long> =
        numFewShotExamples.getOptional("num_few_shot_examples")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun projectId(): Optional<String> = projectId.getOptional("project_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun projectName(): Optional<String> = projectName.getOptional("project_name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spendLimit(): Optional<SpendLimit> = spendLimit.getOptional("spend_limit")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spendUsd(): Optional<Double> = spendUsd.getOptional("spend_usd")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun threadFilter(): Optional<String> = threadFilter.getOptional("thread_filter")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun traceCount(): Optional<Long> = traceCount.getOptional("trace_count")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun traceFilter(): Optional<String> = traceFilter.getOptional("trace_filter")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun treeFilter(): Optional<String> = treeFilter.getOptional("tree_filter")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhooks(): Optional<List<Webhook>> = webhooks.getOptional("webhooks")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
     * Returns the raw JSON value of [extendOnly].
     *
     * Unlike [extendOnly], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("extend_only") @ExcludeMissing fun _extendOnly(): JsonField<Boolean> = extendOnly

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
     * Returns the raw JSON value of [isManagedEvaluator].
     *
     * Unlike [isManagedEvaluator], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("is_managed_evaluator")
    @ExcludeMissing
    fun _isManagedEvaluator(): JsonField<Boolean> = isManagedEvaluator

    /**
     * Returns the raw JSON value of [isTracingDisabled].
     *
     * Unlike [isTracingDisabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("is_tracing_disabled")
    @ExcludeMissing
    fun _isTracingDisabled(): JsonField<Boolean> = isTracingDisabled

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
     * Returns the raw JSON value of [isTransient].
     *
     * Unlike [isTransient], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transient") @ExcludeMissing fun _isTransient(): JsonField<Boolean> = isTransient

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [useCorrectionsDataset].
     *
     * Unlike [useCorrectionsDataset], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("use_corrections_dataset")
    @ExcludeMissing
    fun _useCorrectionsDataset(): JsonField<Boolean> = useCorrectionsDataset

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
     * Returns the raw JSON value of [alerts].
     *
     * Unlike [alerts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("alerts") @ExcludeMissing fun _alerts(): JsonField<List<Alert>> = alerts

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
    fun _codeEvaluators(): JsonField<List<CodeEvaluator>> = codeEvaluators

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
     * Returns the raw JSON value of [effectiveSpendLimit].
     *
     * Unlike [effectiveSpendLimit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("effective_spend_limit")
    @ExcludeMissing
    fun _effectiveSpendLimit(): JsonField<EffectiveSpendLimit> = effectiveSpendLimit

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
     * Returns the raw JSON value of [evaluatorType].
     *
     * Unlike [evaluatorType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("evaluator_type")
    @ExcludeMissing
    fun _evaluatorType(): JsonField<String> = evaluatorType

    /**
     * Returns the raw JSON value of [evaluators].
     *
     * Unlike [evaluators], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("evaluators")
    @ExcludeMissing
    fun _evaluators(): JsonField<List<Evaluator>> = evaluators

    /**
     * Returns the raw JSON value of [extendAnnotationQueueTraceRetention].
     *
     * Unlike [extendAnnotationQueueTraceRetention], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("extend_annotation_queue_trace_retention")
    @ExcludeMissing
    fun _extendAnnotationQueueTraceRetention(): JsonField<Boolean> =
        extendAnnotationQueueTraceRetention

    /**
     * Returns the raw JSON value of [extendDatasetTraceRetention].
     *
     * Unlike [extendDatasetTraceRetention], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("extend_dataset_trace_retention")
    @ExcludeMissing
    fun _extendDatasetTraceRetention(): JsonField<Boolean> = extendDatasetTraceRetention

    /**
     * Returns the raw JSON value of [extendEvaluatorTraceRetention].
     *
     * Unlike [extendEvaluatorTraceRetention], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("extend_evaluator_trace_retention")
    @ExcludeMissing
    fun _extendEvaluatorTraceRetention(): JsonField<Boolean> = extendEvaluatorTraceRetention

    /**
     * Returns the raw JSON value of [extendWebhookTraceRetention].
     *
     * Unlike [extendWebhookTraceRetention], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("extend_webhook_trace_retention")
    @ExcludeMissing
    fun _extendWebhookTraceRetention(): JsonField<Boolean> = extendWebhookTraceRetention

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
     * Returns the raw JSON value of [numFewShotExamples].
     *
     * Unlike [numFewShotExamples], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("num_few_shot_examples")
    @ExcludeMissing
    fun _numFewShotExamples(): JsonField<Long> = numFewShotExamples

    /**
     * Returns the raw JSON value of [projectId].
     *
     * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("project_id") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

    /**
     * Returns the raw JSON value of [projectName].
     *
     * Unlike [projectName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("project_name")
    @ExcludeMissing
    fun _projectName(): JsonField<String> = projectName

    /**
     * Returns the raw JSON value of [spendLimit].
     *
     * Unlike [spendLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spend_limit")
    @ExcludeMissing
    fun _spendLimit(): JsonField<SpendLimit> = spendLimit

    /**
     * Returns the raw JSON value of [spendUsd].
     *
     * Unlike [spendUsd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spend_usd") @ExcludeMissing fun _spendUsd(): JsonField<Double> = spendUsd

    /**
     * Returns the raw JSON value of [threadFilter].
     *
     * Unlike [threadFilter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("thread_filter")
    @ExcludeMissing
    fun _threadFilter(): JsonField<String> = threadFilter

    /**
     * Returns the raw JSON value of [traceCount].
     *
     * Unlike [traceCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trace_count") @ExcludeMissing fun _traceCount(): JsonField<Long> = traceCount

    /**
     * Returns the raw JSON value of [traceFilter].
     *
     * Unlike [traceFilter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trace_filter")
    @ExcludeMissing
    fun _traceFilter(): JsonField<String> = traceFilter

    /**
     * Returns the raw JSON value of [treeFilter].
     *
     * Unlike [treeFilter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tree_filter") @ExcludeMissing fun _treeFilter(): JsonField<String> = treeFilter

    /**
     * Returns the raw JSON value of [webhooks].
     *
     * Unlike [webhooks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webhooks") @ExcludeMissing fun _webhooks(): JsonField<List<Webhook>> = webhooks

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
         * Returns a mutable builder for constructing an instance of [Rule].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .addToDatasetPreferCorrection()
         * .createdAt()
         * .displayName()
         * .evaluatorVersion()
         * .extendOnly()
         * .includeExtendedStats()
         * .isEnabled()
         * .isManagedEvaluator()
         * .isTracingDisabled()
         * .samplingRate()
         * .tenantId()
         * .isTransient()
         * .updatedAt()
         * .useCorrectionsDataset()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Rule]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var addToDatasetPreferCorrection: JsonField<Boolean>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var displayName: JsonField<String>? = null
        private var evaluatorVersion: JsonField<Long>? = null
        private var extendOnly: JsonField<Boolean>? = null
        private var includeExtendedStats: JsonField<Boolean>? = null
        private var isEnabled: JsonField<Boolean>? = null
        private var isManagedEvaluator: JsonField<Boolean>? = null
        private var isTracingDisabled: JsonField<Boolean>? = null
        private var samplingRate: JsonField<Double>? = null
        private var tenantId: JsonField<String>? = null
        private var isTransient: JsonField<Boolean>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var useCorrectionsDataset: JsonField<Boolean>? = null
        private var addToAnnotationQueueId: JsonField<String> = JsonMissing.of()
        private var addToAnnotationQueueName: JsonField<String> = JsonMissing.of()
        private var addToDatasetId: JsonField<String> = JsonMissing.of()
        private var addToDatasetName: JsonField<String> = JsonMissing.of()
        private var alerts: JsonField<MutableList<Alert>>? = null
        private var alignmentAnnotationQueueId: JsonField<String> = JsonMissing.of()
        private var backfillCompletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var backfillError: JsonField<String> = JsonMissing.of()
        private var backfillFrom: JsonField<OffsetDateTime> = JsonMissing.of()
        private var backfillId: JsonField<String> = JsonMissing.of()
        private var backfillProgress: JsonField<Double> = JsonMissing.of()
        private var backfillStatus: JsonField<String> = JsonMissing.of()
        private var codeEvaluators: JsonField<MutableList<CodeEvaluator>>? = null
        private var correctionsDatasetId: JsonField<String> = JsonMissing.of()
        private var datasetId: JsonField<String> = JsonMissing.of()
        private var datasetName: JsonField<String> = JsonMissing.of()
        private var effectiveSpendLimit: JsonField<EffectiveSpendLimit> = JsonMissing.of()
        private var evaluatorId: JsonField<String> = JsonMissing.of()
        private var evaluatorName: JsonField<String> = JsonMissing.of()
        private var evaluatorType: JsonField<String> = JsonMissing.of()
        private var evaluators: JsonField<MutableList<Evaluator>>? = null
        private var extendAnnotationQueueTraceRetention: JsonField<Boolean> = JsonMissing.of()
        private var extendDatasetTraceRetention: JsonField<Boolean> = JsonMissing.of()
        private var extendEvaluatorTraceRetention: JsonField<Boolean> = JsonMissing.of()
        private var extendWebhookTraceRetention: JsonField<Boolean> = JsonMissing.of()
        private var filter: JsonField<String> = JsonMissing.of()
        private var groupBy: JsonField<GroupBy> = JsonMissing.of()
        private var numFewShotExamples: JsonField<Long> = JsonMissing.of()
        private var projectId: JsonField<String> = JsonMissing.of()
        private var projectName: JsonField<String> = JsonMissing.of()
        private var spendLimit: JsonField<SpendLimit> = JsonMissing.of()
        private var spendUsd: JsonField<Double> = JsonMissing.of()
        private var threadFilter: JsonField<String> = JsonMissing.of()
        private var traceCount: JsonField<Long> = JsonMissing.of()
        private var traceFilter: JsonField<String> = JsonMissing.of()
        private var treeFilter: JsonField<String> = JsonMissing.of()
        private var webhooks: JsonField<MutableList<Webhook>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(rule: Rule) = apply {
            id = rule.id
            addToDatasetPreferCorrection = rule.addToDatasetPreferCorrection
            createdAt = rule.createdAt
            displayName = rule.displayName
            evaluatorVersion = rule.evaluatorVersion
            extendOnly = rule.extendOnly
            includeExtendedStats = rule.includeExtendedStats
            isEnabled = rule.isEnabled
            isManagedEvaluator = rule.isManagedEvaluator
            isTracingDisabled = rule.isTracingDisabled
            samplingRate = rule.samplingRate
            tenantId = rule.tenantId
            isTransient = rule.isTransient
            updatedAt = rule.updatedAt
            useCorrectionsDataset = rule.useCorrectionsDataset
            addToAnnotationQueueId = rule.addToAnnotationQueueId
            addToAnnotationQueueName = rule.addToAnnotationQueueName
            addToDatasetId = rule.addToDatasetId
            addToDatasetName = rule.addToDatasetName
            alerts = rule.alerts.map { it.toMutableList() }
            alignmentAnnotationQueueId = rule.alignmentAnnotationQueueId
            backfillCompletedAt = rule.backfillCompletedAt
            backfillError = rule.backfillError
            backfillFrom = rule.backfillFrom
            backfillId = rule.backfillId
            backfillProgress = rule.backfillProgress
            backfillStatus = rule.backfillStatus
            codeEvaluators = rule.codeEvaluators.map { it.toMutableList() }
            correctionsDatasetId = rule.correctionsDatasetId
            datasetId = rule.datasetId
            datasetName = rule.datasetName
            effectiveSpendLimit = rule.effectiveSpendLimit
            evaluatorId = rule.evaluatorId
            evaluatorName = rule.evaluatorName
            evaluatorType = rule.evaluatorType
            evaluators = rule.evaluators.map { it.toMutableList() }
            extendAnnotationQueueTraceRetention = rule.extendAnnotationQueueTraceRetention
            extendDatasetTraceRetention = rule.extendDatasetTraceRetention
            extendEvaluatorTraceRetention = rule.extendEvaluatorTraceRetention
            extendWebhookTraceRetention = rule.extendWebhookTraceRetention
            filter = rule.filter
            groupBy = rule.groupBy
            numFewShotExamples = rule.numFewShotExamples
            projectId = rule.projectId
            projectName = rule.projectName
            spendLimit = rule.spendLimit
            spendUsd = rule.spendUsd
            threadFilter = rule.threadFilter
            traceCount = rule.traceCount
            traceFilter = rule.traceFilter
            treeFilter = rule.treeFilter
            webhooks = rule.webhooks.map { it.toMutableList() }
            additionalProperties = rule.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

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

        fun extendOnly(extendOnly: Boolean) = extendOnly(JsonField.of(extendOnly))

        /**
         * Sets [Builder.extendOnly] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extendOnly] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun extendOnly(extendOnly: JsonField<Boolean>) = apply { this.extendOnly = extendOnly }

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

        fun isManagedEvaluator(isManagedEvaluator: Boolean) =
            isManagedEvaluator(JsonField.of(isManagedEvaluator))

        /**
         * Sets [Builder.isManagedEvaluator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isManagedEvaluator] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isManagedEvaluator(isManagedEvaluator: JsonField<Boolean>) = apply {
            this.isManagedEvaluator = isManagedEvaluator
        }

        fun isTracingDisabled(isTracingDisabled: Boolean) =
            isTracingDisabled(JsonField.of(isTracingDisabled))

        /**
         * Sets [Builder.isTracingDisabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isTracingDisabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isTracingDisabled(isTracingDisabled: JsonField<Boolean>) = apply {
            this.isTracingDisabled = isTracingDisabled
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

        fun isTransient(isTransient: Boolean) = isTransient(JsonField.of(isTransient))

        /**
         * Sets [Builder.isTransient] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isTransient] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isTransient(isTransient: JsonField<Boolean>) = apply { this.isTransient = isTransient }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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

        fun addToAnnotationQueueId(addToAnnotationQueueId: String) =
            addToAnnotationQueueId(JsonField.of(addToAnnotationQueueId))

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

        fun addToAnnotationQueueName(addToAnnotationQueueName: String) =
            addToAnnotationQueueName(JsonField.of(addToAnnotationQueueName))

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

        fun addToDatasetId(addToDatasetId: String) = addToDatasetId(JsonField.of(addToDatasetId))

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

        fun addToDatasetName(addToDatasetName: String) =
            addToDatasetName(JsonField.of(addToDatasetName))

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

        fun alerts(alerts: List<Alert>) = alerts(JsonField.of(alerts))

        /**
         * Sets [Builder.alerts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alerts] with a well-typed `List<Alert>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun alerts(alerts: JsonField<List<Alert>>) = apply {
            this.alerts = alerts.map { it.toMutableList() }
        }

        /**
         * Adds a single [Alert] to [alerts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAlert(alert: Alert) = apply {
            alerts =
                (alerts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("alerts", it).add(alert)
                }
        }

        fun alignmentAnnotationQueueId(alignmentAnnotationQueueId: String) =
            alignmentAnnotationQueueId(JsonField.of(alignmentAnnotationQueueId))

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

        fun backfillCompletedAt(backfillCompletedAt: OffsetDateTime) =
            backfillCompletedAt(JsonField.of(backfillCompletedAt))

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

        fun backfillError(backfillError: String) = backfillError(JsonField.of(backfillError))

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

        fun backfillFrom(backfillFrom: OffsetDateTime) = backfillFrom(JsonField.of(backfillFrom))

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

        fun backfillId(backfillId: String) = backfillId(JsonField.of(backfillId))

        /**
         * Sets [Builder.backfillId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backfillId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun backfillId(backfillId: JsonField<String>) = apply { this.backfillId = backfillId }

        fun backfillProgress(backfillProgress: Double) =
            backfillProgress(JsonField.of(backfillProgress))

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

        fun backfillStatus(backfillStatus: String) = backfillStatus(JsonField.of(backfillStatus))

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

        fun codeEvaluators(codeEvaluators: List<CodeEvaluator>) =
            codeEvaluators(JsonField.of(codeEvaluators))

        /**
         * Sets [Builder.codeEvaluators] to an arbitrary JSON value.
         *
         * You should usually call [Builder.codeEvaluators] with a well-typed `List<CodeEvaluator>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun codeEvaluators(codeEvaluators: JsonField<List<CodeEvaluator>>) = apply {
            this.codeEvaluators = codeEvaluators.map { it.toMutableList() }
        }

        /**
         * Adds a single [CodeEvaluator] to [codeEvaluators].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCodeEvaluator(codeEvaluator: CodeEvaluator) = apply {
            codeEvaluators =
                (codeEvaluators ?: JsonField.of(mutableListOf())).also {
                    checkKnown("codeEvaluators", it).add(codeEvaluator)
                }
        }

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

        fun effectiveSpendLimit(effectiveSpendLimit: EffectiveSpendLimit) =
            effectiveSpendLimit(JsonField.of(effectiveSpendLimit))

        /**
         * Sets [Builder.effectiveSpendLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveSpendLimit] with a well-typed
         * [EffectiveSpendLimit] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun effectiveSpendLimit(effectiveSpendLimit: JsonField<EffectiveSpendLimit>) = apply {
            this.effectiveSpendLimit = effectiveSpendLimit
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

        fun evaluatorType(evaluatorType: String) = evaluatorType(JsonField.of(evaluatorType))

        /**
         * Sets [Builder.evaluatorType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evaluatorType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun evaluatorType(evaluatorType: JsonField<String>) = apply {
            this.evaluatorType = evaluatorType
        }

        fun evaluators(evaluators: List<Evaluator>) = evaluators(JsonField.of(evaluators))

        /**
         * Sets [Builder.evaluators] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evaluators] with a well-typed `List<Evaluator>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun evaluators(evaluators: JsonField<List<Evaluator>>) = apply {
            this.evaluators = evaluators.map { it.toMutableList() }
        }

        /**
         * Adds a single [Evaluator] to [evaluators].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEvaluator(evaluator: Evaluator) = apply {
            evaluators =
                (evaluators ?: JsonField.of(mutableListOf())).also {
                    checkKnown("evaluators", it).add(evaluator)
                }
        }

        fun extendAnnotationQueueTraceRetention(extendAnnotationQueueTraceRetention: Boolean) =
            extendAnnotationQueueTraceRetention(JsonField.of(extendAnnotationQueueTraceRetention))

        /**
         * Sets [Builder.extendAnnotationQueueTraceRetention] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extendAnnotationQueueTraceRetention] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun extendAnnotationQueueTraceRetention(
            extendAnnotationQueueTraceRetention: JsonField<Boolean>
        ) = apply { this.extendAnnotationQueueTraceRetention = extendAnnotationQueueTraceRetention }

        fun extendDatasetTraceRetention(extendDatasetTraceRetention: Boolean) =
            extendDatasetTraceRetention(JsonField.of(extendDatasetTraceRetention))

        /**
         * Sets [Builder.extendDatasetTraceRetention] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extendDatasetTraceRetention] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun extendDatasetTraceRetention(extendDatasetTraceRetention: JsonField<Boolean>) = apply {
            this.extendDatasetTraceRetention = extendDatasetTraceRetention
        }

        fun extendEvaluatorTraceRetention(extendEvaluatorTraceRetention: Boolean) =
            extendEvaluatorTraceRetention(JsonField.of(extendEvaluatorTraceRetention))

        /**
         * Sets [Builder.extendEvaluatorTraceRetention] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extendEvaluatorTraceRetention] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun extendEvaluatorTraceRetention(extendEvaluatorTraceRetention: JsonField<Boolean>) =
            apply {
                this.extendEvaluatorTraceRetention = extendEvaluatorTraceRetention
            }

        fun extendWebhookTraceRetention(extendWebhookTraceRetention: Boolean) =
            extendWebhookTraceRetention(JsonField.of(extendWebhookTraceRetention))

        /**
         * Sets [Builder.extendWebhookTraceRetention] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extendWebhookTraceRetention] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun extendWebhookTraceRetention(extendWebhookTraceRetention: JsonField<Boolean>) = apply {
            this.extendWebhookTraceRetention = extendWebhookTraceRetention
        }

        fun filter(filter: String) = filter(JsonField.of(filter))

        /**
         * Sets [Builder.filter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filter] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filter(filter: JsonField<String>) = apply { this.filter = filter }

        fun groupBy(groupBy: GroupBy) = groupBy(JsonField.of(groupBy))

        /**
         * Sets [Builder.groupBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupBy] with a well-typed [GroupBy] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun groupBy(groupBy: JsonField<GroupBy>) = apply { this.groupBy = groupBy }

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

        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /**
         * Sets [Builder.projectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

        fun projectName(projectName: String) = projectName(JsonField.of(projectName))

        /**
         * Sets [Builder.projectName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectName(projectName: JsonField<String>) = apply { this.projectName = projectName }

        fun spendLimit(spendLimit: SpendLimit) = spendLimit(JsonField.of(spendLimit))

        /**
         * Sets [Builder.spendLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spendLimit] with a well-typed [SpendLimit] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun spendLimit(spendLimit: JsonField<SpendLimit>) = apply { this.spendLimit = spendLimit }

        fun spendUsd(spendUsd: Double) = spendUsd(JsonField.of(spendUsd))

        /**
         * Sets [Builder.spendUsd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spendUsd] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun spendUsd(spendUsd: JsonField<Double>) = apply { this.spendUsd = spendUsd }

        fun threadFilter(threadFilter: String) = threadFilter(JsonField.of(threadFilter))

        /**
         * Sets [Builder.threadFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threadFilter] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun threadFilter(threadFilter: JsonField<String>) = apply {
            this.threadFilter = threadFilter
        }

        fun traceCount(traceCount: Long) = traceCount(JsonField.of(traceCount))

        /**
         * Sets [Builder.traceCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.traceCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun traceCount(traceCount: JsonField<Long>) = apply { this.traceCount = traceCount }

        fun traceFilter(traceFilter: String) = traceFilter(JsonField.of(traceFilter))

        /**
         * Sets [Builder.traceFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.traceFilter] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun traceFilter(traceFilter: JsonField<String>) = apply { this.traceFilter = traceFilter }

        fun treeFilter(treeFilter: String) = treeFilter(JsonField.of(treeFilter))

        /**
         * Sets [Builder.treeFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.treeFilter] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun treeFilter(treeFilter: JsonField<String>) = apply { this.treeFilter = treeFilter }

        fun webhooks(webhooks: List<Webhook>) = webhooks(JsonField.of(webhooks))

        /**
         * Sets [Builder.webhooks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhooks] with a well-typed `List<Webhook>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun webhooks(webhooks: JsonField<List<Webhook>>) = apply {
            this.webhooks = webhooks.map { it.toMutableList() }
        }

        /**
         * Adds a single [Webhook] to [webhooks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWebhook(webhook: Webhook) = apply {
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
         * Returns an immutable instance of [Rule].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .addToDatasetPreferCorrection()
         * .createdAt()
         * .displayName()
         * .evaluatorVersion()
         * .extendOnly()
         * .includeExtendedStats()
         * .isEnabled()
         * .isManagedEvaluator()
         * .isTracingDisabled()
         * .samplingRate()
         * .tenantId()
         * .isTransient()
         * .updatedAt()
         * .useCorrectionsDataset()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Rule =
            Rule(
                checkRequired("id", id),
                checkRequired("addToDatasetPreferCorrection", addToDatasetPreferCorrection),
                checkRequired("createdAt", createdAt),
                checkRequired("displayName", displayName),
                checkRequired("evaluatorVersion", evaluatorVersion),
                checkRequired("extendOnly", extendOnly),
                checkRequired("includeExtendedStats", includeExtendedStats),
                checkRequired("isEnabled", isEnabled),
                checkRequired("isManagedEvaluator", isManagedEvaluator),
                checkRequired("isTracingDisabled", isTracingDisabled),
                checkRequired("samplingRate", samplingRate),
                checkRequired("tenantId", tenantId),
                checkRequired("isTransient", isTransient),
                checkRequired("updatedAt", updatedAt),
                checkRequired("useCorrectionsDataset", useCorrectionsDataset),
                addToAnnotationQueueId,
                addToAnnotationQueueName,
                addToDatasetId,
                addToDatasetName,
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
                effectiveSpendLimit,
                evaluatorId,
                evaluatorName,
                evaluatorType,
                (evaluators ?: JsonMissing.of()).map { it.toImmutable() },
                extendAnnotationQueueTraceRetention,
                extendDatasetTraceRetention,
                extendEvaluatorTraceRetention,
                extendWebhookTraceRetention,
                filter,
                groupBy,
                numFewShotExamples,
                projectId,
                projectName,
                spendLimit,
                spendUsd,
                threadFilter,
                traceCount,
                traceFilter,
                treeFilter,
                (webhooks ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): Rule = apply {
        if (validated) {
            return@apply
        }

        id()
        addToDatasetPreferCorrection()
        createdAt()
        displayName()
        evaluatorVersion()
        extendOnly()
        includeExtendedStats()
        isEnabled()
        isManagedEvaluator()
        isTracingDisabled()
        samplingRate()
        tenantId()
        isTransient()
        updatedAt()
        useCorrectionsDataset()
        addToAnnotationQueueId()
        addToAnnotationQueueName()
        addToDatasetId()
        addToDatasetName()
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
        effectiveSpendLimit().ifPresent { it.validate() }
        evaluatorId()
        evaluatorName()
        evaluatorType()
        evaluators().ifPresent { it.forEach { it.validate() } }
        extendAnnotationQueueTraceRetention()
        extendDatasetTraceRetention()
        extendEvaluatorTraceRetention()
        extendWebhookTraceRetention()
        filter()
        groupBy().ifPresent { it.validate() }
        numFewShotExamples()
        projectId()
        projectName()
        spendLimit().ifPresent { it.validate() }
        spendUsd()
        threadFilter()
        traceCount()
        traceFilter()
        treeFilter()
        webhooks().ifPresent { it.forEach { it.validate() } }
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
            (if (addToDatasetPreferCorrection.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (displayName.asKnown().isPresent) 1 else 0) +
            (if (evaluatorVersion.asKnown().isPresent) 1 else 0) +
            (if (extendOnly.asKnown().isPresent) 1 else 0) +
            (if (includeExtendedStats.asKnown().isPresent) 1 else 0) +
            (if (isEnabled.asKnown().isPresent) 1 else 0) +
            (if (isManagedEvaluator.asKnown().isPresent) 1 else 0) +
            (if (isTracingDisabled.asKnown().isPresent) 1 else 0) +
            (if (samplingRate.asKnown().isPresent) 1 else 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0) +
            (if (isTransient.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (useCorrectionsDataset.asKnown().isPresent) 1 else 0) +
            (if (addToAnnotationQueueId.asKnown().isPresent) 1 else 0) +
            (if (addToAnnotationQueueName.asKnown().isPresent) 1 else 0) +
            (if (addToDatasetId.asKnown().isPresent) 1 else 0) +
            (if (addToDatasetName.asKnown().isPresent) 1 else 0) +
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
            (effectiveSpendLimit.asKnown().getOrNull()?.validity() ?: 0) +
            (if (evaluatorId.asKnown().isPresent) 1 else 0) +
            (if (evaluatorName.asKnown().isPresent) 1 else 0) +
            (if (evaluatorType.asKnown().isPresent) 1 else 0) +
            (evaluators.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (extendAnnotationQueueTraceRetention.asKnown().isPresent) 1 else 0) +
            (if (extendDatasetTraceRetention.asKnown().isPresent) 1 else 0) +
            (if (extendEvaluatorTraceRetention.asKnown().isPresent) 1 else 0) +
            (if (extendWebhookTraceRetention.asKnown().isPresent) 1 else 0) +
            (if (filter.asKnown().isPresent) 1 else 0) +
            (groupBy.asKnown().getOrNull()?.validity() ?: 0) +
            (if (numFewShotExamples.asKnown().isPresent) 1 else 0) +
            (if (projectId.asKnown().isPresent) 1 else 0) +
            (if (projectName.asKnown().isPresent) 1 else 0) +
            (spendLimit.asKnown().getOrNull()?.validity() ?: 0) +
            (if (spendUsd.asKnown().isPresent) 1 else 0) +
            (if (threadFilter.asKnown().isPresent) 1 else 0) +
            (if (traceCount.asKnown().isPresent) 1 else 0) +
            (if (traceFilter.asKnown().isPresent) 1 else 0) +
            (if (treeFilter.asKnown().isPresent) 1 else 0) +
            (webhooks.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Alert
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val routingKey: JsonField<String>,
        private val severity: JsonField<Severity>,
        private val summary: JsonField<String>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("routing_key")
            @ExcludeMissing
            routingKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("severity")
            @ExcludeMissing
            severity: JsonField<Severity> = JsonMissing.of(),
            @JsonProperty("summary") @ExcludeMissing summary: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(routingKey, severity, summary, type, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun routingKey(): String = routingKey.getRequired("routing_key")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun severity(): Optional<Severity> = severity.getOptional("severity")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun summary(): Optional<String> = summary.getOptional("summary")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [routingKey].
         *
         * Unlike [routingKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("routing_key")
        @ExcludeMissing
        fun _routingKey(): JsonField<String> = routingKey

        /**
         * Returns the raw JSON value of [severity].
         *
         * Unlike [severity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("severity") @ExcludeMissing fun _severity(): JsonField<Severity> = severity

        /**
         * Returns the raw JSON value of [summary].
         *
         * Unlike [summary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("summary") @ExcludeMissing fun _summary(): JsonField<String> = summary

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * Returns a mutable builder for constructing an instance of [Alert].
             *
             * The following fields are required:
             * ```java
             * .routingKey()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Alert]. */
        class Builder internal constructor() {

            private var routingKey: JsonField<String>? = null
            private var severity: JsonField<Severity> = JsonMissing.of()
            private var summary: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(alert: Alert) = apply {
                routingKey = alert.routingKey
                severity = alert.severity
                summary = alert.summary
                type = alert.type
                additionalProperties = alert.additionalProperties.toMutableMap()
            }

            fun routingKey(routingKey: String) = routingKey(JsonField.of(routingKey))

            /**
             * Sets [Builder.routingKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routingKey] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun routingKey(routingKey: JsonField<String>) = apply { this.routingKey = routingKey }

            fun severity(severity: Severity) = severity(JsonField.of(severity))

            /**
             * Sets [Builder.severity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.severity] with a well-typed [Severity] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun severity(severity: JsonField<Severity>) = apply { this.severity = severity }

            fun summary(summary: String) = summary(JsonField.of(summary))

            /**
             * Sets [Builder.summary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.summary] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun summary(summary: JsonField<String>) = apply { this.summary = summary }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [Alert].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .routingKey()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Alert =
                Alert(
                    checkRequired("routingKey", routingKey),
                    severity,
                    summary,
                    type,
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): Alert = apply {
            if (validated) {
                return@apply
            }

            routingKey()
            severity().ifPresent { it.validate() }
            summary()
            type().ifPresent { it.validate() }
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
            (if (routingKey.asKnown().isPresent) 1 else 0) +
                (severity.asKnown().getOrNull()?.validity() ?: 0) +
                (if (summary.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Severity @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CRITICAL = of("CRITICAL")

                @JvmField val WARNING = of("WARNING")

                @JvmField val ERROR = of("ERROR")

                @JvmField val INFO = of("INFO")

                @JvmStatic fun of(value: String) = Severity(JsonField.of(value))
            }

            /** An enum containing [Severity]'s known values. */
            enum class Known {
                CRITICAL,
                WARNING,
                ERROR,
                INFO,
            }

            /**
             * An enum containing [Severity]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Severity] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CRITICAL,
                WARNING,
                ERROR,
                INFO,
                /**
                 * An enum member indicating that [Severity] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    CRITICAL -> Value.CRITICAL
                    WARNING -> Value.WARNING
                    ERROR -> Value.ERROR
                    INFO -> Value.INFO
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LangChainInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    CRITICAL -> Known.CRITICAL
                    WARNING -> Known.WARNING
                    ERROR -> Known.ERROR
                    INFO -> Known.INFO
                    else -> throw LangChainInvalidDataException("Unknown Severity: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LangChainInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LangChainInvalidDataException("Value is not a String")
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
            fun validate(): Severity = apply {
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

                return other is Severity && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val PAGERDUTY = of("PAGERDUTY")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                PAGERDUTY
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PAGERDUTY,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PAGERDUTY -> Value.PAGERDUTY
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LangChainInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    PAGERDUTY -> Known.PAGERDUTY
                    else -> throw LangChainInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LangChainInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LangChainInvalidDataException("Value is not a String")
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
            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Alert &&
                routingKey == other.routingKey &&
                severity == other.severity &&
                summary == other.summary &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(routingKey, severity, summary, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Alert{routingKey=$routingKey, severity=$severity, summary=$summary, type=$type, additionalProperties=$additionalProperties}"
    }

    class CodeEvaluator
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val code: JsonField<String>,
        private val requireAttachments: JsonField<Boolean>,
        private val advancedFeaturesEnabled: JsonField<Boolean>,
        private val codeEvaluatorInput: JsonField<CodeEvaluatorInput>,
        private val language: JsonField<Language>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("require_attachments")
            @ExcludeMissing
            requireAttachments: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("advanced_features_enabled")
            @ExcludeMissing
            advancedFeaturesEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("code_evaluator_input")
            @ExcludeMissing
            codeEvaluatorInput: JsonField<CodeEvaluatorInput> = JsonMissing.of(),
            @JsonProperty("language")
            @ExcludeMissing
            language: JsonField<Language> = JsonMissing.of(),
        ) : this(
            code,
            requireAttachments,
            advancedFeaturesEnabled,
            codeEvaluatorInput,
            language,
            mutableMapOf(),
        )

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun code(): String = code.getRequired("code")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun requireAttachments(): Boolean = requireAttachments.getRequired("require_attachments")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun advancedFeaturesEnabled(): Optional<Boolean> =
            advancedFeaturesEnabled.getOptional("advanced_features_enabled")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun codeEvaluatorInput(): Optional<CodeEvaluatorInput> =
            codeEvaluatorInput.getOptional("code_evaluator_input")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun language(): Optional<Language> = language.getOptional("language")

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /**
         * Returns the raw JSON value of [requireAttachments].
         *
         * Unlike [requireAttachments], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("require_attachments")
        @ExcludeMissing
        fun _requireAttachments(): JsonField<Boolean> = requireAttachments

        /**
         * Returns the raw JSON value of [advancedFeaturesEnabled].
         *
         * Unlike [advancedFeaturesEnabled], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("advanced_features_enabled")
        @ExcludeMissing
        fun _advancedFeaturesEnabled(): JsonField<Boolean> = advancedFeaturesEnabled

        /**
         * Returns the raw JSON value of [codeEvaluatorInput].
         *
         * Unlike [codeEvaluatorInput], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("code_evaluator_input")
        @ExcludeMissing
        fun _codeEvaluatorInput(): JsonField<CodeEvaluatorInput> = codeEvaluatorInput

        /**
         * Returns the raw JSON value of [language].
         *
         * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<Language> = language

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
             * Returns a mutable builder for constructing an instance of [CodeEvaluator].
             *
             * The following fields are required:
             * ```java
             * .code()
             * .requireAttachments()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CodeEvaluator]. */
        class Builder internal constructor() {

            private var code: JsonField<String>? = null
            private var requireAttachments: JsonField<Boolean>? = null
            private var advancedFeaturesEnabled: JsonField<Boolean> = JsonMissing.of()
            private var codeEvaluatorInput: JsonField<CodeEvaluatorInput> = JsonMissing.of()
            private var language: JsonField<Language> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(codeEvaluator: CodeEvaluator) = apply {
                code = codeEvaluator.code
                requireAttachments = codeEvaluator.requireAttachments
                advancedFeaturesEnabled = codeEvaluator.advancedFeaturesEnabled
                codeEvaluatorInput = codeEvaluator.codeEvaluatorInput
                language = codeEvaluator.language
                additionalProperties = codeEvaluator.additionalProperties.toMutableMap()
            }

            fun code(code: String) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

            fun requireAttachments(requireAttachments: Boolean) =
                requireAttachments(JsonField.of(requireAttachments))

            /**
             * Sets [Builder.requireAttachments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requireAttachments] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun requireAttachments(requireAttachments: JsonField<Boolean>) = apply {
                this.requireAttachments = requireAttachments
            }

            fun advancedFeaturesEnabled(advancedFeaturesEnabled: Boolean) =
                advancedFeaturesEnabled(JsonField.of(advancedFeaturesEnabled))

            /**
             * Sets [Builder.advancedFeaturesEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.advancedFeaturesEnabled] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun advancedFeaturesEnabled(advancedFeaturesEnabled: JsonField<Boolean>) = apply {
                this.advancedFeaturesEnabled = advancedFeaturesEnabled
            }

            fun codeEvaluatorInput(codeEvaluatorInput: CodeEvaluatorInput) =
                codeEvaluatorInput(JsonField.of(codeEvaluatorInput))

            /**
             * Sets [Builder.codeEvaluatorInput] to an arbitrary JSON value.
             *
             * You should usually call [Builder.codeEvaluatorInput] with a well-typed
             * [CodeEvaluatorInput] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun codeEvaluatorInput(codeEvaluatorInput: JsonField<CodeEvaluatorInput>) = apply {
                this.codeEvaluatorInput = codeEvaluatorInput
            }

            fun language(language: Language) = language(JsonField.of(language))

            /**
             * Sets [Builder.language] to an arbitrary JSON value.
             *
             * You should usually call [Builder.language] with a well-typed [Language] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun language(language: JsonField<Language>) = apply { this.language = language }

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
             * Returns an immutable instance of [CodeEvaluator].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .code()
             * .requireAttachments()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CodeEvaluator =
                CodeEvaluator(
                    checkRequired("code", code),
                    checkRequired("requireAttachments", requireAttachments),
                    advancedFeaturesEnabled,
                    codeEvaluatorInput,
                    language,
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): CodeEvaluator = apply {
            if (validated) {
                return@apply
            }

            code()
            requireAttachments()
            advancedFeaturesEnabled()
            codeEvaluatorInput().ifPresent { it.validate() }
            language().ifPresent { it.validate() }
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
            (if (code.asKnown().isPresent) 1 else 0) +
                (if (requireAttachments.asKnown().isPresent) 1 else 0) +
                (if (advancedFeaturesEnabled.asKnown().isPresent) 1 else 0) +
                (codeEvaluatorInput.asKnown().getOrNull()?.validity() ?: 0) +
                (language.asKnown().getOrNull()?.validity() ?: 0)

        class CodeEvaluatorInput
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val THREAD = of("THREAD")

                @JvmField val ALL_MESSAGES = of("ALL_MESSAGES")

                @JvmField val HUMAN_AI_PAIRS = of("HUMAN_AI_PAIRS")

                @JvmField val FIRST_HUMAN_LAST_AI = of("FIRST_HUMAN_LAST_AI")

                @JvmField val TRAJECTORY = of("TRAJECTORY")

                @JvmStatic fun of(value: String) = CodeEvaluatorInput(JsonField.of(value))
            }

            /** An enum containing [CodeEvaluatorInput]'s known values. */
            enum class Known {
                THREAD,
                ALL_MESSAGES,
                HUMAN_AI_PAIRS,
                FIRST_HUMAN_LAST_AI,
                TRAJECTORY,
            }

            /**
             * An enum containing [CodeEvaluatorInput]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [CodeEvaluatorInput] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                THREAD,
                ALL_MESSAGES,
                HUMAN_AI_PAIRS,
                FIRST_HUMAN_LAST_AI,
                TRAJECTORY,
                /**
                 * An enum member indicating that [CodeEvaluatorInput] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    THREAD -> Value.THREAD
                    ALL_MESSAGES -> Value.ALL_MESSAGES
                    HUMAN_AI_PAIRS -> Value.HUMAN_AI_PAIRS
                    FIRST_HUMAN_LAST_AI -> Value.FIRST_HUMAN_LAST_AI
                    TRAJECTORY -> Value.TRAJECTORY
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LangChainInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    THREAD -> Known.THREAD
                    ALL_MESSAGES -> Known.ALL_MESSAGES
                    HUMAN_AI_PAIRS -> Known.HUMAN_AI_PAIRS
                    FIRST_HUMAN_LAST_AI -> Known.FIRST_HUMAN_LAST_AI
                    TRAJECTORY -> Known.TRAJECTORY
                    else ->
                        throw LangChainInvalidDataException("Unknown CodeEvaluatorInput: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LangChainInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LangChainInvalidDataException("Value is not a String")
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
            fun validate(): CodeEvaluatorInput = apply {
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

                return other is CodeEvaluatorInput && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Language @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val PYTHON = of("PYTHON")

                @JvmField val JAVASCRIPT = of("JAVASCRIPT")

                @JvmStatic fun of(value: String) = Language(JsonField.of(value))
            }

            /** An enum containing [Language]'s known values. */
            enum class Known {
                PYTHON,
                JAVASCRIPT,
            }

            /**
             * An enum containing [Language]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Language] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PYTHON,
                JAVASCRIPT,
                /**
                 * An enum member indicating that [Language] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PYTHON -> Value.PYTHON
                    JAVASCRIPT -> Value.JAVASCRIPT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LangChainInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    PYTHON -> Known.PYTHON
                    JAVASCRIPT -> Known.JAVASCRIPT
                    else -> throw LangChainInvalidDataException("Unknown Language: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LangChainInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LangChainInvalidDataException("Value is not a String")
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
            fun validate(): Language = apply {
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

                return other is Language && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CodeEvaluator &&
                code == other.code &&
                requireAttachments == other.requireAttachments &&
                advancedFeaturesEnabled == other.advancedFeaturesEnabled &&
                codeEvaluatorInput == other.codeEvaluatorInput &&
                language == other.language &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                code,
                requireAttachments,
                advancedFeaturesEnabled,
                codeEvaluatorInput,
                language,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CodeEvaluator{code=$code, requireAttachments=$requireAttachments, advancedFeaturesEnabled=$advancedFeaturesEnabled, codeEvaluatorInput=$codeEvaluatorInput, language=$language, additionalProperties=$additionalProperties}"
    }

    class EffectiveSpendLimit
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val limitUsd: JsonField<String>,
        private val window: JsonField<Window>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("limit_usd")
            @ExcludeMissing
            limitUsd: JsonField<String> = JsonMissing.of(),
            @JsonProperty("window") @ExcludeMissing window: JsonField<Window> = JsonMissing.of(),
        ) : this(limitUsd, window, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun limitUsd(): String = limitUsd.getRequired("limit_usd")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun window(): Window = window.getRequired("window")

        /**
         * Returns the raw JSON value of [limitUsd].
         *
         * Unlike [limitUsd], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("limit_usd") @ExcludeMissing fun _limitUsd(): JsonField<String> = limitUsd

        /**
         * Returns the raw JSON value of [window].
         *
         * Unlike [window], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("window") @ExcludeMissing fun _window(): JsonField<Window> = window

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
             * Returns a mutable builder for constructing an instance of [EffectiveSpendLimit].
             *
             * The following fields are required:
             * ```java
             * .limitUsd()
             * .window()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [EffectiveSpendLimit]. */
        class Builder internal constructor() {

            private var limitUsd: JsonField<String>? = null
            private var window: JsonField<Window>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(effectiveSpendLimit: EffectiveSpendLimit) = apply {
                limitUsd = effectiveSpendLimit.limitUsd
                window = effectiveSpendLimit.window
                additionalProperties = effectiveSpendLimit.additionalProperties.toMutableMap()
            }

            fun limitUsd(limitUsd: String) = limitUsd(JsonField.of(limitUsd))

            /**
             * Sets [Builder.limitUsd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limitUsd] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun limitUsd(limitUsd: JsonField<String>) = apply { this.limitUsd = limitUsd }

            fun window(window: Window) = window(JsonField.of(window))

            /**
             * Sets [Builder.window] to an arbitrary JSON value.
             *
             * You should usually call [Builder.window] with a well-typed [Window] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun window(window: JsonField<Window>) = apply { this.window = window }

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
             * Returns an immutable instance of [EffectiveSpendLimit].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .limitUsd()
             * .window()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): EffectiveSpendLimit =
                EffectiveSpendLimit(
                    checkRequired("limitUsd", limitUsd),
                    checkRequired("window", window),
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): EffectiveSpendLimit = apply {
            if (validated) {
                return@apply
            }

            limitUsd()
            window().validate()
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
            (if (limitUsd.asKnown().isPresent) 1 else 0) +
                (window.asKnown().getOrNull()?.validity() ?: 0)

        class Window @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val WEEKLY = of("WEEKLY")

                @JvmStatic fun of(value: String) = Window(JsonField.of(value))
            }

            /** An enum containing [Window]'s known values. */
            enum class Known {
                WEEKLY
            }

            /**
             * An enum containing [Window]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Window] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                WEEKLY,
                /**
                 * An enum member indicating that [Window] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    WEEKLY -> Value.WEEKLY
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LangChainInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    WEEKLY -> Known.WEEKLY
                    else -> throw LangChainInvalidDataException("Unknown Window: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LangChainInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LangChainInvalidDataException("Value is not a String")
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
            fun validate(): Window = apply {
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

                return other is Window && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EffectiveSpendLimit &&
                limitUsd == other.limitUsd &&
                window == other.window &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(limitUsd, window, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EffectiveSpendLimit{limitUsd=$limitUsd, window=$window, additionalProperties=$additionalProperties}"
    }

    class Evaluator
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val structured: JsonField<Structured>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("structured")
            @ExcludeMissing
            structured: JsonField<Structured> = JsonMissing.of()
        ) : this(structured, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun structured(): Structured = structured.getRequired("structured")

        /**
         * Returns the raw JSON value of [structured].
         *
         * Unlike [structured], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("structured")
        @ExcludeMissing
        fun _structured(): JsonField<Structured> = structured

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
             * .structured()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Evaluator]. */
        class Builder internal constructor() {

            private var structured: JsonField<Structured>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(evaluator: Evaluator) = apply {
                structured = evaluator.structured
                additionalProperties = evaluator.additionalProperties.toMutableMap()
            }

            fun structured(structured: Structured) = structured(JsonField.of(structured))

            /**
             * Sets [Builder.structured] to an arbitrary JSON value.
             *
             * You should usually call [Builder.structured] with a well-typed [Structured] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun structured(structured: JsonField<Structured>) = apply {
                this.structured = structured
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
             * .structured()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Evaluator =
                Evaluator(
                    checkRequired("structured", structured),
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): Evaluator = apply {
            if (validated) {
                return@apply
            }

            structured().validate()
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
        internal fun validity(): Int = (structured.asKnown().getOrNull()?.validity() ?: 0)

        class Structured
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val hubRef: JsonField<String>,
            private val model: JsonField<Model>,
            private val playgroundSettingsId: JsonField<String>,
            private val prompt: JsonField<List<List<String>>>,
            private val schema: JsonField<Schema>,
            private val templateFormat: JsonField<String>,
            private val variableMapping: JsonField<VariableMapping>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("hub_ref")
                @ExcludeMissing
                hubRef: JsonField<String> = JsonMissing.of(),
                @JsonProperty("model") @ExcludeMissing model: JsonField<Model> = JsonMissing.of(),
                @JsonProperty("playground_settings_id")
                @ExcludeMissing
                playgroundSettingsId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("prompt")
                @ExcludeMissing
                prompt: JsonField<List<List<String>>> = JsonMissing.of(),
                @JsonProperty("schema")
                @ExcludeMissing
                schema: JsonField<Schema> = JsonMissing.of(),
                @JsonProperty("template_format")
                @ExcludeMissing
                templateFormat: JsonField<String> = JsonMissing.of(),
                @JsonProperty("variable_mapping")
                @ExcludeMissing
                variableMapping: JsonField<VariableMapping> = JsonMissing.of(),
            ) : this(
                hubRef,
                model,
                playgroundSettingsId,
                prompt,
                schema,
                templateFormat,
                variableMapping,
                mutableMapOf(),
            )

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun hubRef(): Optional<String> = hubRef.getOptional("hub_ref")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun model(): Optional<Model> = model.getOptional("model")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun playgroundSettingsId(): Optional<String> =
                playgroundSettingsId.getOptional("playground_settings_id")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun prompt(): Optional<List<List<String>>> = prompt.getOptional("prompt")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun schema(): Optional<Schema> = schema.getOptional("schema")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun templateFormat(): Optional<String> = templateFormat.getOptional("template_format")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun variableMapping(): Optional<VariableMapping> =
                variableMapping.getOptional("variable_mapping")

            /**
             * Returns the raw JSON value of [hubRef].
             *
             * Unlike [hubRef], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("hub_ref") @ExcludeMissing fun _hubRef(): JsonField<String> = hubRef

            /**
             * Returns the raw JSON value of [model].
             *
             * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<Model> = model

            /**
             * Returns the raw JSON value of [playgroundSettingsId].
             *
             * Unlike [playgroundSettingsId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("playground_settings_id")
            @ExcludeMissing
            fun _playgroundSettingsId(): JsonField<String> = playgroundSettingsId

            /**
             * Returns the raw JSON value of [prompt].
             *
             * Unlike [prompt], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("prompt")
            @ExcludeMissing
            fun _prompt(): JsonField<List<List<String>>> = prompt

            /**
             * Returns the raw JSON value of [schema].
             *
             * Unlike [schema], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("schema") @ExcludeMissing fun _schema(): JsonField<Schema> = schema

            /**
             * Returns the raw JSON value of [templateFormat].
             *
             * Unlike [templateFormat], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("template_format")
            @ExcludeMissing
            fun _templateFormat(): JsonField<String> = templateFormat

            /**
             * Returns the raw JSON value of [variableMapping].
             *
             * Unlike [variableMapping], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("variable_mapping")
            @ExcludeMissing
            fun _variableMapping(): JsonField<VariableMapping> = variableMapping

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

                /** Returns a mutable builder for constructing an instance of [Structured]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Structured]. */
            class Builder internal constructor() {

                private var hubRef: JsonField<String> = JsonMissing.of()
                private var model: JsonField<Model> = JsonMissing.of()
                private var playgroundSettingsId: JsonField<String> = JsonMissing.of()
                private var prompt: JsonField<MutableList<List<String>>>? = null
                private var schema: JsonField<Schema> = JsonMissing.of()
                private var templateFormat: JsonField<String> = JsonMissing.of()
                private var variableMapping: JsonField<VariableMapping> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(structured: Structured) = apply {
                    hubRef = structured.hubRef
                    model = structured.model
                    playgroundSettingsId = structured.playgroundSettingsId
                    prompt = structured.prompt.map { it.toMutableList() }
                    schema = structured.schema
                    templateFormat = structured.templateFormat
                    variableMapping = structured.variableMapping
                    additionalProperties = structured.additionalProperties.toMutableMap()
                }

                fun hubRef(hubRef: String) = hubRef(JsonField.of(hubRef))

                /**
                 * Sets [Builder.hubRef] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hubRef] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun hubRef(hubRef: JsonField<String>) = apply { this.hubRef = hubRef }

                fun model(model: Model) = model(JsonField.of(model))

                /**
                 * Sets [Builder.model] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.model] with a well-typed [Model] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun model(model: JsonField<Model>) = apply { this.model = model }

                fun playgroundSettingsId(playgroundSettingsId: String) =
                    playgroundSettingsId(JsonField.of(playgroundSettingsId))

                /**
                 * Sets [Builder.playgroundSettingsId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.playgroundSettingsId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun playgroundSettingsId(playgroundSettingsId: JsonField<String>) = apply {
                    this.playgroundSettingsId = playgroundSettingsId
                }

                fun prompt(prompt: List<List<String>>) = prompt(JsonField.of(prompt))

                /**
                 * Sets [Builder.prompt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.prompt] with a well-typed `List<List<String>>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun prompt(prompt: JsonField<List<List<String>>>) = apply {
                    this.prompt = prompt.map { it.toMutableList() }
                }

                /**
                 * Adds a single [List<String>] to [Builder.prompt].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPrompt(prompt: List<String>) = apply {
                    this.prompt =
                        (this.prompt ?: JsonField.of(mutableListOf())).also {
                            checkKnown("prompt", it).add(prompt)
                        }
                }

                fun schema(schema: Schema) = schema(JsonField.of(schema))

                /**
                 * Sets [Builder.schema] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.schema] with a well-typed [Schema] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun schema(schema: JsonField<Schema>) = apply { this.schema = schema }

                fun templateFormat(templateFormat: String) =
                    templateFormat(JsonField.of(templateFormat))

                /**
                 * Sets [Builder.templateFormat] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.templateFormat] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun templateFormat(templateFormat: JsonField<String>) = apply {
                    this.templateFormat = templateFormat
                }

                fun variableMapping(variableMapping: VariableMapping) =
                    variableMapping(JsonField.of(variableMapping))

                /**
                 * Sets [Builder.variableMapping] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.variableMapping] with a well-typed
                 * [VariableMapping] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun variableMapping(variableMapping: JsonField<VariableMapping>) = apply {
                    this.variableMapping = variableMapping
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
                 * Returns an immutable instance of [Structured].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Structured =
                    Structured(
                        hubRef,
                        model,
                        playgroundSettingsId,
                        (prompt ?: JsonMissing.of()).map { it.toImmutable() },
                        schema,
                        templateFormat,
                        variableMapping,
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): Structured = apply {
                if (validated) {
                    return@apply
                }

                hubRef()
                model().ifPresent { it.validate() }
                playgroundSettingsId()
                prompt()
                schema().ifPresent { it.validate() }
                templateFormat()
                variableMapping().ifPresent { it.validate() }
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
                (if (hubRef.asKnown().isPresent) 1 else 0) +
                    (model.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (playgroundSettingsId.asKnown().isPresent) 1 else 0) +
                    (prompt.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0) +
                    (schema.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (templateFormat.asKnown().isPresent) 1 else 0) +
                    (variableMapping.asKnown().getOrNull()?.validity() ?: 0)

            class Model
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

                    /** Returns a mutable builder for constructing an instance of [Model]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Model]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(model: Model) = apply {
                        additionalProperties = model.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Model].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Model = Model(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Model = apply {
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Model && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Model{additionalProperties=$additionalProperties}"
            }

            class Schema
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

                    /** Returns a mutable builder for constructing an instance of [Schema]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Schema]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(schema: Schema) = apply {
                        additionalProperties = schema.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Schema].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Schema = Schema(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Schema = apply {
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Schema && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Schema{additionalProperties=$additionalProperties}"
            }

            class VariableMapping
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
                     * Returns a mutable builder for constructing an instance of [VariableMapping].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [VariableMapping]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(variableMapping: VariableMapping) = apply {
                        additionalProperties = variableMapping.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [VariableMapping].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): VariableMapping =
                        VariableMapping(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): VariableMapping = apply {
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is VariableMapping &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "VariableMapping{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Structured &&
                    hubRef == other.hubRef &&
                    model == other.model &&
                    playgroundSettingsId == other.playgroundSettingsId &&
                    prompt == other.prompt &&
                    schema == other.schema &&
                    templateFormat == other.templateFormat &&
                    variableMapping == other.variableMapping &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    hubRef,
                    model,
                    playgroundSettingsId,
                    prompt,
                    schema,
                    templateFormat,
                    variableMapping,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Structured{hubRef=$hubRef, model=$model, playgroundSettingsId=$playgroundSettingsId, prompt=$prompt, schema=$schema, templateFormat=$templateFormat, variableMapping=$variableMapping, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Evaluator &&
                structured == other.structured &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(structured, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Evaluator{structured=$structured, additionalProperties=$additionalProperties}"
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

            @JvmField val THREAD_ID = of("THREAD_ID")

            @JvmField val TRAJECTORY_ID = of("TRAJECTORY_ID")

            @JvmStatic fun of(value: String) = GroupBy(JsonField.of(value))
        }

        /** An enum containing [GroupBy]'s known values. */
        enum class Known {
            THREAD_ID,
            TRAJECTORY_ID,
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
            TRAJECTORY_ID,
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
                TRAJECTORY_ID -> Value.TRAJECTORY_ID
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
                TRAJECTORY_ID -> Known.TRAJECTORY_ID
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

    class SpendLimit
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val limitUsd: JsonField<String>,
        private val window: JsonField<Window>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("limit_usd")
            @ExcludeMissing
            limitUsd: JsonField<String> = JsonMissing.of(),
            @JsonProperty("window") @ExcludeMissing window: JsonField<Window> = JsonMissing.of(),
        ) : this(limitUsd, window, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun limitUsd(): String = limitUsd.getRequired("limit_usd")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun window(): Window = window.getRequired("window")

        /**
         * Returns the raw JSON value of [limitUsd].
         *
         * Unlike [limitUsd], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("limit_usd") @ExcludeMissing fun _limitUsd(): JsonField<String> = limitUsd

        /**
         * Returns the raw JSON value of [window].
         *
         * Unlike [window], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("window") @ExcludeMissing fun _window(): JsonField<Window> = window

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
             * Returns a mutable builder for constructing an instance of [SpendLimit].
             *
             * The following fields are required:
             * ```java
             * .limitUsd()
             * .window()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SpendLimit]. */
        class Builder internal constructor() {

            private var limitUsd: JsonField<String>? = null
            private var window: JsonField<Window>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(spendLimit: SpendLimit) = apply {
                limitUsd = spendLimit.limitUsd
                window = spendLimit.window
                additionalProperties = spendLimit.additionalProperties.toMutableMap()
            }

            fun limitUsd(limitUsd: String) = limitUsd(JsonField.of(limitUsd))

            /**
             * Sets [Builder.limitUsd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limitUsd] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun limitUsd(limitUsd: JsonField<String>) = apply { this.limitUsd = limitUsd }

            fun window(window: Window) = window(JsonField.of(window))

            /**
             * Sets [Builder.window] to an arbitrary JSON value.
             *
             * You should usually call [Builder.window] with a well-typed [Window] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun window(window: JsonField<Window>) = apply { this.window = window }

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
             * Returns an immutable instance of [SpendLimit].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .limitUsd()
             * .window()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SpendLimit =
                SpendLimit(
                    checkRequired("limitUsd", limitUsd),
                    checkRequired("window", window),
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): SpendLimit = apply {
            if (validated) {
                return@apply
            }

            limitUsd()
            window().validate()
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
            (if (limitUsd.asKnown().isPresent) 1 else 0) +
                (window.asKnown().getOrNull()?.validity() ?: 0)

        class Window @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val WEEKLY = of("WEEKLY")

                @JvmStatic fun of(value: String) = Window(JsonField.of(value))
            }

            /** An enum containing [Window]'s known values. */
            enum class Known {
                WEEKLY
            }

            /**
             * An enum containing [Window]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Window] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                WEEKLY,
                /**
                 * An enum member indicating that [Window] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    WEEKLY -> Value.WEEKLY
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LangChainInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    WEEKLY -> Known.WEEKLY
                    else -> throw LangChainInvalidDataException("Unknown Window: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LangChainInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LangChainInvalidDataException("Value is not a String")
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
            fun validate(): Window = apply {
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

                return other is Window && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SpendLimit &&
                limitUsd == other.limitUsd &&
                window == other.window &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(limitUsd, window, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SpendLimit{limitUsd=$limitUsd, window=$window, additionalProperties=$additionalProperties}"
    }

    class Webhook
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val url: JsonField<String>,
        private val headers: JsonField<Headers>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            @JsonProperty("headers") @ExcludeMissing headers: JsonField<Headers> = JsonMissing.of(),
        ) : this(url, headers, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun url(): String = url.getRequired("url")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun headers(): Optional<Headers> = headers.getOptional("headers")

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

        /**
         * Returns the raw JSON value of [headers].
         *
         * Unlike [headers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("headers") @ExcludeMissing fun _headers(): JsonField<Headers> = headers

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
             * Returns a mutable builder for constructing an instance of [Webhook].
             *
             * The following fields are required:
             * ```java
             * .url()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Webhook]. */
        class Builder internal constructor() {

            private var url: JsonField<String>? = null
            private var headers: JsonField<Headers> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(webhook: Webhook) = apply {
                url = webhook.url
                headers = webhook.headers
                additionalProperties = webhook.additionalProperties.toMutableMap()
            }

            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

            fun headers(headers: Headers) = headers(JsonField.of(headers))

            /**
             * Sets [Builder.headers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.headers] with a well-typed [Headers] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun headers(headers: JsonField<Headers>) = apply { this.headers = headers }

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
             * Returns an immutable instance of [Webhook].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .url()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Webhook =
                Webhook(checkRequired("url", url), headers, additionalProperties.toMutableMap())
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
        fun validate(): Webhook = apply {
            if (validated) {
                return@apply
            }

            url()
            headers().ifPresent { it.validate() }
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
            (if (url.asKnown().isPresent) 1 else 0) +
                (headers.asKnown().getOrNull()?.validity() ?: 0)

        class Headers
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

                /** Returns a mutable builder for constructing an instance of [Headers]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Headers]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(headers: Headers) = apply {
                    additionalProperties = headers.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Headers].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Headers = Headers(additionalProperties.toImmutable())
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
            fun validate(): Headers = apply {
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

                return other is Headers && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Headers{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Webhook &&
                url == other.url &&
                headers == other.headers &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(url, headers, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Webhook{url=$url, headers=$headers, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Rule &&
            id == other.id &&
            addToDatasetPreferCorrection == other.addToDatasetPreferCorrection &&
            createdAt == other.createdAt &&
            displayName == other.displayName &&
            evaluatorVersion == other.evaluatorVersion &&
            extendOnly == other.extendOnly &&
            includeExtendedStats == other.includeExtendedStats &&
            isEnabled == other.isEnabled &&
            isManagedEvaluator == other.isManagedEvaluator &&
            isTracingDisabled == other.isTracingDisabled &&
            samplingRate == other.samplingRate &&
            tenantId == other.tenantId &&
            isTransient == other.isTransient &&
            updatedAt == other.updatedAt &&
            useCorrectionsDataset == other.useCorrectionsDataset &&
            addToAnnotationQueueId == other.addToAnnotationQueueId &&
            addToAnnotationQueueName == other.addToAnnotationQueueName &&
            addToDatasetId == other.addToDatasetId &&
            addToDatasetName == other.addToDatasetName &&
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
            effectiveSpendLimit == other.effectiveSpendLimit &&
            evaluatorId == other.evaluatorId &&
            evaluatorName == other.evaluatorName &&
            evaluatorType == other.evaluatorType &&
            evaluators == other.evaluators &&
            extendAnnotationQueueTraceRetention == other.extendAnnotationQueueTraceRetention &&
            extendDatasetTraceRetention == other.extendDatasetTraceRetention &&
            extendEvaluatorTraceRetention == other.extendEvaluatorTraceRetention &&
            extendWebhookTraceRetention == other.extendWebhookTraceRetention &&
            filter == other.filter &&
            groupBy == other.groupBy &&
            numFewShotExamples == other.numFewShotExamples &&
            projectId == other.projectId &&
            projectName == other.projectName &&
            spendLimit == other.spendLimit &&
            spendUsd == other.spendUsd &&
            threadFilter == other.threadFilter &&
            traceCount == other.traceCount &&
            traceFilter == other.traceFilter &&
            treeFilter == other.treeFilter &&
            webhooks == other.webhooks &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            addToDatasetPreferCorrection,
            createdAt,
            displayName,
            evaluatorVersion,
            extendOnly,
            includeExtendedStats,
            isEnabled,
            isManagedEvaluator,
            isTracingDisabled,
            samplingRate,
            tenantId,
            isTransient,
            updatedAt,
            useCorrectionsDataset,
            addToAnnotationQueueId,
            addToAnnotationQueueName,
            addToDatasetId,
            addToDatasetName,
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
            effectiveSpendLimit,
            evaluatorId,
            evaluatorName,
            evaluatorType,
            evaluators,
            extendAnnotationQueueTraceRetention,
            extendDatasetTraceRetention,
            extendEvaluatorTraceRetention,
            extendWebhookTraceRetention,
            filter,
            groupBy,
            numFewShotExamples,
            projectId,
            projectName,
            spendLimit,
            spendUsd,
            threadFilter,
            traceCount,
            traceFilter,
            treeFilter,
            webhooks,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Rule{id=$id, addToDatasetPreferCorrection=$addToDatasetPreferCorrection, createdAt=$createdAt, displayName=$displayName, evaluatorVersion=$evaluatorVersion, extendOnly=$extendOnly, includeExtendedStats=$includeExtendedStats, isEnabled=$isEnabled, isManagedEvaluator=$isManagedEvaluator, isTracingDisabled=$isTracingDisabled, samplingRate=$samplingRate, tenantId=$tenantId, isTransient=$isTransient, updatedAt=$updatedAt, useCorrectionsDataset=$useCorrectionsDataset, addToAnnotationQueueId=$addToAnnotationQueueId, addToAnnotationQueueName=$addToAnnotationQueueName, addToDatasetId=$addToDatasetId, addToDatasetName=$addToDatasetName, alerts=$alerts, alignmentAnnotationQueueId=$alignmentAnnotationQueueId, backfillCompletedAt=$backfillCompletedAt, backfillError=$backfillError, backfillFrom=$backfillFrom, backfillId=$backfillId, backfillProgress=$backfillProgress, backfillStatus=$backfillStatus, codeEvaluators=$codeEvaluators, correctionsDatasetId=$correctionsDatasetId, datasetId=$datasetId, datasetName=$datasetName, effectiveSpendLimit=$effectiveSpendLimit, evaluatorId=$evaluatorId, evaluatorName=$evaluatorName, evaluatorType=$evaluatorType, evaluators=$evaluators, extendAnnotationQueueTraceRetention=$extendAnnotationQueueTraceRetention, extendDatasetTraceRetention=$extendDatasetTraceRetention, extendEvaluatorTraceRetention=$extendEvaluatorTraceRetention, extendWebhookTraceRetention=$extendWebhookTraceRetention, filter=$filter, groupBy=$groupBy, numFewShotExamples=$numFewShotExamples, projectId=$projectId, projectName=$projectName, spendLimit=$spendLimit, spendUsd=$spendUsd, threadFilter=$threadFilter, traceCount=$traceCount, traceFilter=$traceFilter, treeFilter=$treeFilter, webhooks=$webhooks, additionalProperties=$additionalProperties}"
}

// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues

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
import com.langchain.smith.models.runs.RunTypeEnum
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Run schema with annotation queue info. */
class RunSchemaWithAnnotationQueueInfo
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val appPath: JsonField<String>,
    private val dottedOrder: JsonField<String>,
    private val name: JsonField<String>,
    private val queueRunId: JsonField<String>,
    private val runType: JsonField<RunTypeEnum>,
    private val sessionId: JsonField<String>,
    private val status: JsonField<String>,
    private val traceId: JsonField<String>,
    private val addedAt: JsonField<OffsetDateTime>,
    private val childRunIds: JsonField<List<String>>,
    private val completionCost: JsonField<String>,
    private val completionCostDetails: JsonField<CompletionCostDetails>,
    private val completionTokenDetails: JsonField<CompletionTokenDetails>,
    private val completionTokens: JsonField<Long>,
    private val directChildRunIds: JsonField<List<String>>,
    private val effectiveAddedAt: JsonField<OffsetDateTime>,
    private val endTime: JsonField<OffsetDateTime>,
    private val error: JsonField<String>,
    private val events: JsonField<List<JsonValue>>,
    private val executionOrder: JsonField<Long>,
    private val extra: JsonValue,
    private val feedbackStats: JsonField<FeedbackStats>,
    private val firstTokenTime: JsonField<OffsetDateTime>,
    private val inDataset: JsonField<Boolean>,
    private val inputs: JsonValue,
    private val inputsPreview: JsonField<String>,
    private val inputsS3Urls: JsonValue,
    private val lastQueuedAt: JsonField<OffsetDateTime>,
    private val lastReviewedTime: JsonField<OffsetDateTime>,
    private val manifestId: JsonField<String>,
    private val manifestS3Id: JsonField<String>,
    private val outputs: JsonValue,
    private val outputsPreview: JsonField<String>,
    private val outputsS3Urls: JsonValue,
    private val parentRunId: JsonField<String>,
    private val parentRunIds: JsonField<List<String>>,
    private val priceModelId: JsonField<String>,
    private val promptCost: JsonField<String>,
    private val promptCostDetails: JsonField<PromptCostDetails>,
    private val promptTokenDetails: JsonField<PromptTokenDetails>,
    private val promptTokens: JsonField<Long>,
    private val referenceDatasetId: JsonField<String>,
    private val referenceExampleId: JsonField<String>,
    private val s3Urls: JsonValue,
    private val serialized: JsonValue,
    private val shareToken: JsonField<String>,
    private val startTime: JsonField<OffsetDateTime>,
    private val tags: JsonField<List<String>>,
    private val threadId: JsonField<String>,
    private val totalCost: JsonField<String>,
    private val totalTokens: JsonField<Long>,
    private val traceFirstReceivedAt: JsonField<OffsetDateTime>,
    private val traceMaxStartTime: JsonField<OffsetDateTime>,
    private val traceMinStartTime: JsonField<OffsetDateTime>,
    private val traceTier: JsonField<TraceTier>,
    private val traceUpgrade: JsonField<Boolean>,
    private val ttlSeconds: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("app_path") @ExcludeMissing appPath: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dotted_order")
        @ExcludeMissing
        dottedOrder: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("queue_run_id")
        @ExcludeMissing
        queueRunId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("run_type")
        @ExcludeMissing
        runType: JsonField<RunTypeEnum> = JsonMissing.of(),
        @JsonProperty("session_id") @ExcludeMissing sessionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trace_id") @ExcludeMissing traceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("added_at")
        @ExcludeMissing
        addedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("child_run_ids")
        @ExcludeMissing
        childRunIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("completion_cost")
        @ExcludeMissing
        completionCost: JsonField<String> = JsonMissing.of(),
        @JsonProperty("completion_cost_details")
        @ExcludeMissing
        completionCostDetails: JsonField<CompletionCostDetails> = JsonMissing.of(),
        @JsonProperty("completion_token_details")
        @ExcludeMissing
        completionTokenDetails: JsonField<CompletionTokenDetails> = JsonMissing.of(),
        @JsonProperty("completion_tokens")
        @ExcludeMissing
        completionTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("direct_child_run_ids")
        @ExcludeMissing
        directChildRunIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("effective_added_at")
        @ExcludeMissing
        effectiveAddedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("end_time")
        @ExcludeMissing
        endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
        @JsonProperty("events")
        @ExcludeMissing
        events: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonProperty("execution_order")
        @ExcludeMissing
        executionOrder: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("extra") @ExcludeMissing extra: JsonValue = JsonMissing.of(),
        @JsonProperty("feedback_stats")
        @ExcludeMissing
        feedbackStats: JsonField<FeedbackStats> = JsonMissing.of(),
        @JsonProperty("first_token_time")
        @ExcludeMissing
        firstTokenTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("in_dataset")
        @ExcludeMissing
        inDataset: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("inputs") @ExcludeMissing inputs: JsonValue = JsonMissing.of(),
        @JsonProperty("inputs_preview")
        @ExcludeMissing
        inputsPreview: JsonField<String> = JsonMissing.of(),
        @JsonProperty("inputs_s3_urls") @ExcludeMissing inputsS3Urls: JsonValue = JsonMissing.of(),
        @JsonProperty("last_queued_at")
        @ExcludeMissing
        lastQueuedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("last_reviewed_time")
        @ExcludeMissing
        lastReviewedTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("manifest_id")
        @ExcludeMissing
        manifestId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("manifest_s3_id")
        @ExcludeMissing
        manifestS3Id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("outputs") @ExcludeMissing outputs: JsonValue = JsonMissing.of(),
        @JsonProperty("outputs_preview")
        @ExcludeMissing
        outputsPreview: JsonField<String> = JsonMissing.of(),
        @JsonProperty("outputs_s3_urls")
        @ExcludeMissing
        outputsS3Urls: JsonValue = JsonMissing.of(),
        @JsonProperty("parent_run_id")
        @ExcludeMissing
        parentRunId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parent_run_ids")
        @ExcludeMissing
        parentRunIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("price_model_id")
        @ExcludeMissing
        priceModelId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prompt_cost")
        @ExcludeMissing
        promptCost: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prompt_cost_details")
        @ExcludeMissing
        promptCostDetails: JsonField<PromptCostDetails> = JsonMissing.of(),
        @JsonProperty("prompt_token_details")
        @ExcludeMissing
        promptTokenDetails: JsonField<PromptTokenDetails> = JsonMissing.of(),
        @JsonProperty("prompt_tokens")
        @ExcludeMissing
        promptTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("reference_dataset_id")
        @ExcludeMissing
        referenceDatasetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reference_example_id")
        @ExcludeMissing
        referenceExampleId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("s3_urls") @ExcludeMissing s3Urls: JsonValue = JsonMissing.of(),
        @JsonProperty("serialized") @ExcludeMissing serialized: JsonValue = JsonMissing.of(),
        @JsonProperty("share_token")
        @ExcludeMissing
        shareToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("start_time")
        @ExcludeMissing
        startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("thread_id") @ExcludeMissing threadId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_cost") @ExcludeMissing totalCost: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_tokens")
        @ExcludeMissing
        totalTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("trace_first_received_at")
        @ExcludeMissing
        traceFirstReceivedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("trace_max_start_time")
        @ExcludeMissing
        traceMaxStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("trace_min_start_time")
        @ExcludeMissing
        traceMinStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("trace_tier")
        @ExcludeMissing
        traceTier: JsonField<TraceTier> = JsonMissing.of(),
        @JsonProperty("trace_upgrade")
        @ExcludeMissing
        traceUpgrade: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("ttl_seconds") @ExcludeMissing ttlSeconds: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        appPath,
        dottedOrder,
        name,
        queueRunId,
        runType,
        sessionId,
        status,
        traceId,
        addedAt,
        childRunIds,
        completionCost,
        completionCostDetails,
        completionTokenDetails,
        completionTokens,
        directChildRunIds,
        effectiveAddedAt,
        endTime,
        error,
        events,
        executionOrder,
        extra,
        feedbackStats,
        firstTokenTime,
        inDataset,
        inputs,
        inputsPreview,
        inputsS3Urls,
        lastQueuedAt,
        lastReviewedTime,
        manifestId,
        manifestS3Id,
        outputs,
        outputsPreview,
        outputsS3Urls,
        parentRunId,
        parentRunIds,
        priceModelId,
        promptCost,
        promptCostDetails,
        promptTokenDetails,
        promptTokens,
        referenceDatasetId,
        referenceExampleId,
        s3Urls,
        serialized,
        shareToken,
        startTime,
        tags,
        threadId,
        totalCost,
        totalTokens,
        traceFirstReceivedAt,
        traceMaxStartTime,
        traceMinStartTime,
        traceTier,
        traceUpgrade,
        ttlSeconds,
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
    fun appPath(): String = appPath.getRequired("app_path")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dottedOrder(): String = dottedOrder.getRequired("dotted_order")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun queueRunId(): String = queueRunId.getRequired("queue_run_id")

    /**
     * Enum for run types.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun runType(): RunTypeEnum = runType.getRequired("run_type")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sessionId(): String = sessionId.getRequired("session_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): String = status.getRequired("status")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun traceId(): String = traceId.getRequired("trace_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addedAt(): Optional<OffsetDateTime> = addedAt.getOptional("added_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun childRunIds(): Optional<List<String>> = childRunIds.getOptional("child_run_ids")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completionCost(): Optional<String> = completionCost.getOptional("completion_cost")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completionCostDetails(): Optional<CompletionCostDetails> =
        completionCostDetails.getOptional("completion_cost_details")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completionTokenDetails(): Optional<CompletionTokenDetails> =
        completionTokenDetails.getOptional("completion_token_details")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completionTokens(): Optional<Long> = completionTokens.getOptional("completion_tokens")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun directChildRunIds(): Optional<List<String>> =
        directChildRunIds.getOptional("direct_child_run_ids")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun effectiveAddedAt(): Optional<OffsetDateTime> =
        effectiveAddedAt.getOptional("effective_added_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("end_time")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun error(): Optional<String> = error.getOptional("error")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun events(): Optional<List<JsonValue>> = events.getOptional("events")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun executionOrder(): Optional<Long> = executionOrder.getOptional("execution_order")

    @JsonProperty("extra") @ExcludeMissing fun _extra(): JsonValue = extra

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun feedbackStats(): Optional<FeedbackStats> = feedbackStats.getOptional("feedback_stats")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstTokenTime(): Optional<OffsetDateTime> = firstTokenTime.getOptional("first_token_time")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inDataset(): Optional<Boolean> = inDataset.getOptional("in_dataset")

    @JsonProperty("inputs") @ExcludeMissing fun _inputs(): JsonValue = inputs

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inputsPreview(): Optional<String> = inputsPreview.getOptional("inputs_preview")

    @JsonProperty("inputs_s3_urls") @ExcludeMissing fun _inputsS3Urls(): JsonValue = inputsS3Urls

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastQueuedAt(): Optional<OffsetDateTime> = lastQueuedAt.getOptional("last_queued_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastReviewedTime(): Optional<OffsetDateTime> =
        lastReviewedTime.getOptional("last_reviewed_time")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun manifestId(): Optional<String> = manifestId.getOptional("manifest_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun manifestS3Id(): Optional<String> = manifestS3Id.getOptional("manifest_s3_id")

    @JsonProperty("outputs") @ExcludeMissing fun _outputs(): JsonValue = outputs

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outputsPreview(): Optional<String> = outputsPreview.getOptional("outputs_preview")

    @JsonProperty("outputs_s3_urls") @ExcludeMissing fun _outputsS3Urls(): JsonValue = outputsS3Urls

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parentRunId(): Optional<String> = parentRunId.getOptional("parent_run_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parentRunIds(): Optional<List<String>> = parentRunIds.getOptional("parent_run_ids")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun priceModelId(): Optional<String> = priceModelId.getOptional("price_model_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptCost(): Optional<String> = promptCost.getOptional("prompt_cost")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptCostDetails(): Optional<PromptCostDetails> =
        promptCostDetails.getOptional("prompt_cost_details")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptTokenDetails(): Optional<PromptTokenDetails> =
        promptTokenDetails.getOptional("prompt_token_details")

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
    fun referenceExampleId(): Optional<String> =
        referenceExampleId.getOptional("reference_example_id")

    @JsonProperty("s3_urls") @ExcludeMissing fun _s3Urls(): JsonValue = s3Urls

    @JsonProperty("serialized") @ExcludeMissing fun _serialized(): JsonValue = serialized

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun shareToken(): Optional<String> = shareToken.getOptional("share_token")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startTime(): Optional<OffsetDateTime> = startTime.getOptional("start_time")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = tags.getOptional("tags")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun threadId(): Optional<String> = threadId.getOptional("thread_id")

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
    fun traceFirstReceivedAt(): Optional<OffsetDateTime> =
        traceFirstReceivedAt.getOptional("trace_first_received_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun traceMaxStartTime(): Optional<OffsetDateTime> =
        traceMaxStartTime.getOptional("trace_max_start_time")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun traceMinStartTime(): Optional<OffsetDateTime> =
        traceMinStartTime.getOptional("trace_min_start_time")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun traceTier(): Optional<TraceTier> = traceTier.getOptional("trace_tier")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun traceUpgrade(): Optional<Boolean> = traceUpgrade.getOptional("trace_upgrade")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ttlSeconds(): Optional<Long> = ttlSeconds.getOptional("ttl_seconds")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [appPath].
     *
     * Unlike [appPath], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("app_path") @ExcludeMissing fun _appPath(): JsonField<String> = appPath

    /**
     * Returns the raw JSON value of [dottedOrder].
     *
     * Unlike [dottedOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dotted_order")
    @ExcludeMissing
    fun _dottedOrder(): JsonField<String> = dottedOrder

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [queueRunId].
     *
     * Unlike [queueRunId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("queue_run_id") @ExcludeMissing fun _queueRunId(): JsonField<String> = queueRunId

    /**
     * Returns the raw JSON value of [runType].
     *
     * Unlike [runType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("run_type") @ExcludeMissing fun _runType(): JsonField<RunTypeEnum> = runType

    /**
     * Returns the raw JSON value of [sessionId].
     *
     * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [traceId].
     *
     * Unlike [traceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trace_id") @ExcludeMissing fun _traceId(): JsonField<String> = traceId

    /**
     * Returns the raw JSON value of [addedAt].
     *
     * Unlike [addedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("added_at") @ExcludeMissing fun _addedAt(): JsonField<OffsetDateTime> = addedAt

    /**
     * Returns the raw JSON value of [childRunIds].
     *
     * Unlike [childRunIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("child_run_ids")
    @ExcludeMissing
    fun _childRunIds(): JsonField<List<String>> = childRunIds

    /**
     * Returns the raw JSON value of [completionCost].
     *
     * Unlike [completionCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("completion_cost")
    @ExcludeMissing
    fun _completionCost(): JsonField<String> = completionCost

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
     * Returns the raw JSON value of [directChildRunIds].
     *
     * Unlike [directChildRunIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("direct_child_run_ids")
    @ExcludeMissing
    fun _directChildRunIds(): JsonField<List<String>> = directChildRunIds

    /**
     * Returns the raw JSON value of [effectiveAddedAt].
     *
     * Unlike [effectiveAddedAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("effective_added_at")
    @ExcludeMissing
    fun _effectiveAddedAt(): JsonField<OffsetDateTime> = effectiveAddedAt

    /**
     * Returns the raw JSON value of [endTime].
     *
     * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_time") @ExcludeMissing fun _endTime(): JsonField<OffsetDateTime> = endTime

    /**
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

    /**
     * Returns the raw JSON value of [events].
     *
     * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("events") @ExcludeMissing fun _events(): JsonField<List<JsonValue>> = events

    /**
     * Returns the raw JSON value of [executionOrder].
     *
     * Unlike [executionOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("execution_order")
    @ExcludeMissing
    fun _executionOrder(): JsonField<Long> = executionOrder

    /**
     * Returns the raw JSON value of [feedbackStats].
     *
     * Unlike [feedbackStats], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("feedback_stats")
    @ExcludeMissing
    fun _feedbackStats(): JsonField<FeedbackStats> = feedbackStats

    /**
     * Returns the raw JSON value of [firstTokenTime].
     *
     * Unlike [firstTokenTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("first_token_time")
    @ExcludeMissing
    fun _firstTokenTime(): JsonField<OffsetDateTime> = firstTokenTime

    /**
     * Returns the raw JSON value of [inDataset].
     *
     * Unlike [inDataset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("in_dataset") @ExcludeMissing fun _inDataset(): JsonField<Boolean> = inDataset

    /**
     * Returns the raw JSON value of [inputsPreview].
     *
     * Unlike [inputsPreview], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inputs_preview")
    @ExcludeMissing
    fun _inputsPreview(): JsonField<String> = inputsPreview

    /**
     * Returns the raw JSON value of [lastQueuedAt].
     *
     * Unlike [lastQueuedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_queued_at")
    @ExcludeMissing
    fun _lastQueuedAt(): JsonField<OffsetDateTime> = lastQueuedAt

    /**
     * Returns the raw JSON value of [lastReviewedTime].
     *
     * Unlike [lastReviewedTime], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("last_reviewed_time")
    @ExcludeMissing
    fun _lastReviewedTime(): JsonField<OffsetDateTime> = lastReviewedTime

    /**
     * Returns the raw JSON value of [manifestId].
     *
     * Unlike [manifestId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("manifest_id") @ExcludeMissing fun _manifestId(): JsonField<String> = manifestId

    /**
     * Returns the raw JSON value of [manifestS3Id].
     *
     * Unlike [manifestS3Id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("manifest_s3_id")
    @ExcludeMissing
    fun _manifestS3Id(): JsonField<String> = manifestS3Id

    /**
     * Returns the raw JSON value of [outputsPreview].
     *
     * Unlike [outputsPreview], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("outputs_preview")
    @ExcludeMissing
    fun _outputsPreview(): JsonField<String> = outputsPreview

    /**
     * Returns the raw JSON value of [parentRunId].
     *
     * Unlike [parentRunId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parent_run_id")
    @ExcludeMissing
    fun _parentRunId(): JsonField<String> = parentRunId

    /**
     * Returns the raw JSON value of [parentRunIds].
     *
     * Unlike [parentRunIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parent_run_ids")
    @ExcludeMissing
    fun _parentRunIds(): JsonField<List<String>> = parentRunIds

    /**
     * Returns the raw JSON value of [priceModelId].
     *
     * Unlike [priceModelId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("price_model_id")
    @ExcludeMissing
    fun _priceModelId(): JsonField<String> = priceModelId

    /**
     * Returns the raw JSON value of [promptCost].
     *
     * Unlike [promptCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prompt_cost") @ExcludeMissing fun _promptCost(): JsonField<String> = promptCost

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
     * Returns the raw JSON value of [referenceDatasetId].
     *
     * Unlike [referenceDatasetId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("reference_dataset_id")
    @ExcludeMissing
    fun _referenceDatasetId(): JsonField<String> = referenceDatasetId

    /**
     * Returns the raw JSON value of [referenceExampleId].
     *
     * Unlike [referenceExampleId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("reference_example_id")
    @ExcludeMissing
    fun _referenceExampleId(): JsonField<String> = referenceExampleId

    /**
     * Returns the raw JSON value of [shareToken].
     *
     * Unlike [shareToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("share_token") @ExcludeMissing fun _shareToken(): JsonField<String> = shareToken

    /**
     * Returns the raw JSON value of [startTime].
     *
     * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_time")
    @ExcludeMissing
    fun _startTime(): JsonField<OffsetDateTime> = startTime

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

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
    @JsonProperty("total_cost") @ExcludeMissing fun _totalCost(): JsonField<String> = totalCost

    /**
     * Returns the raw JSON value of [totalTokens].
     *
     * Unlike [totalTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_tokens") @ExcludeMissing fun _totalTokens(): JsonField<Long> = totalTokens

    /**
     * Returns the raw JSON value of [traceFirstReceivedAt].
     *
     * Unlike [traceFirstReceivedAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("trace_first_received_at")
    @ExcludeMissing
    fun _traceFirstReceivedAt(): JsonField<OffsetDateTime> = traceFirstReceivedAt

    /**
     * Returns the raw JSON value of [traceMaxStartTime].
     *
     * Unlike [traceMaxStartTime], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("trace_max_start_time")
    @ExcludeMissing
    fun _traceMaxStartTime(): JsonField<OffsetDateTime> = traceMaxStartTime

    /**
     * Returns the raw JSON value of [traceMinStartTime].
     *
     * Unlike [traceMinStartTime], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("trace_min_start_time")
    @ExcludeMissing
    fun _traceMinStartTime(): JsonField<OffsetDateTime> = traceMinStartTime

    /**
     * Returns the raw JSON value of [traceTier].
     *
     * Unlike [traceTier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trace_tier") @ExcludeMissing fun _traceTier(): JsonField<TraceTier> = traceTier

    /**
     * Returns the raw JSON value of [traceUpgrade].
     *
     * Unlike [traceUpgrade], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trace_upgrade")
    @ExcludeMissing
    fun _traceUpgrade(): JsonField<Boolean> = traceUpgrade

    /**
     * Returns the raw JSON value of [ttlSeconds].
     *
     * Unlike [ttlSeconds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ttl_seconds") @ExcludeMissing fun _ttlSeconds(): JsonField<Long> = ttlSeconds

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
         * Returns a mutable builder for constructing an instance of
         * [RunSchemaWithAnnotationQueueInfo].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .appPath()
         * .dottedOrder()
         * .name()
         * .queueRunId()
         * .runType()
         * .sessionId()
         * .status()
         * .traceId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RunSchemaWithAnnotationQueueInfo]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var appPath: JsonField<String>? = null
        private var dottedOrder: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var queueRunId: JsonField<String>? = null
        private var runType: JsonField<RunTypeEnum>? = null
        private var sessionId: JsonField<String>? = null
        private var status: JsonField<String>? = null
        private var traceId: JsonField<String>? = null
        private var addedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var childRunIds: JsonField<MutableList<String>>? = null
        private var completionCost: JsonField<String> = JsonMissing.of()
        private var completionCostDetails: JsonField<CompletionCostDetails> = JsonMissing.of()
        private var completionTokenDetails: JsonField<CompletionTokenDetails> = JsonMissing.of()
        private var completionTokens: JsonField<Long> = JsonMissing.of()
        private var directChildRunIds: JsonField<MutableList<String>>? = null
        private var effectiveAddedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var error: JsonField<String> = JsonMissing.of()
        private var events: JsonField<MutableList<JsonValue>>? = null
        private var executionOrder: JsonField<Long> = JsonMissing.of()
        private var extra: JsonValue = JsonMissing.of()
        private var feedbackStats: JsonField<FeedbackStats> = JsonMissing.of()
        private var firstTokenTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var inDataset: JsonField<Boolean> = JsonMissing.of()
        private var inputs: JsonValue = JsonMissing.of()
        private var inputsPreview: JsonField<String> = JsonMissing.of()
        private var inputsS3Urls: JsonValue = JsonMissing.of()
        private var lastQueuedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastReviewedTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var manifestId: JsonField<String> = JsonMissing.of()
        private var manifestS3Id: JsonField<String> = JsonMissing.of()
        private var outputs: JsonValue = JsonMissing.of()
        private var outputsPreview: JsonField<String> = JsonMissing.of()
        private var outputsS3Urls: JsonValue = JsonMissing.of()
        private var parentRunId: JsonField<String> = JsonMissing.of()
        private var parentRunIds: JsonField<MutableList<String>>? = null
        private var priceModelId: JsonField<String> = JsonMissing.of()
        private var promptCost: JsonField<String> = JsonMissing.of()
        private var promptCostDetails: JsonField<PromptCostDetails> = JsonMissing.of()
        private var promptTokenDetails: JsonField<PromptTokenDetails> = JsonMissing.of()
        private var promptTokens: JsonField<Long> = JsonMissing.of()
        private var referenceDatasetId: JsonField<String> = JsonMissing.of()
        private var referenceExampleId: JsonField<String> = JsonMissing.of()
        private var s3Urls: JsonValue = JsonMissing.of()
        private var serialized: JsonValue = JsonMissing.of()
        private var shareToken: JsonField<String> = JsonMissing.of()
        private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var threadId: JsonField<String> = JsonMissing.of()
        private var totalCost: JsonField<String> = JsonMissing.of()
        private var totalTokens: JsonField<Long> = JsonMissing.of()
        private var traceFirstReceivedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var traceMaxStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var traceMinStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var traceTier: JsonField<TraceTier> = JsonMissing.of()
        private var traceUpgrade: JsonField<Boolean> = JsonMissing.of()
        private var ttlSeconds: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(runSchemaWithAnnotationQueueInfo: RunSchemaWithAnnotationQueueInfo) =
            apply {
                id = runSchemaWithAnnotationQueueInfo.id
                appPath = runSchemaWithAnnotationQueueInfo.appPath
                dottedOrder = runSchemaWithAnnotationQueueInfo.dottedOrder
                name = runSchemaWithAnnotationQueueInfo.name
                queueRunId = runSchemaWithAnnotationQueueInfo.queueRunId
                runType = runSchemaWithAnnotationQueueInfo.runType
                sessionId = runSchemaWithAnnotationQueueInfo.sessionId
                status = runSchemaWithAnnotationQueueInfo.status
                traceId = runSchemaWithAnnotationQueueInfo.traceId
                addedAt = runSchemaWithAnnotationQueueInfo.addedAt
                childRunIds =
                    runSchemaWithAnnotationQueueInfo.childRunIds.map { it.toMutableList() }
                completionCost = runSchemaWithAnnotationQueueInfo.completionCost
                completionCostDetails = runSchemaWithAnnotationQueueInfo.completionCostDetails
                completionTokenDetails = runSchemaWithAnnotationQueueInfo.completionTokenDetails
                completionTokens = runSchemaWithAnnotationQueueInfo.completionTokens
                directChildRunIds =
                    runSchemaWithAnnotationQueueInfo.directChildRunIds.map { it.toMutableList() }
                effectiveAddedAt = runSchemaWithAnnotationQueueInfo.effectiveAddedAt
                endTime = runSchemaWithAnnotationQueueInfo.endTime
                error = runSchemaWithAnnotationQueueInfo.error
                events = runSchemaWithAnnotationQueueInfo.events.map { it.toMutableList() }
                executionOrder = runSchemaWithAnnotationQueueInfo.executionOrder
                extra = runSchemaWithAnnotationQueueInfo.extra
                feedbackStats = runSchemaWithAnnotationQueueInfo.feedbackStats
                firstTokenTime = runSchemaWithAnnotationQueueInfo.firstTokenTime
                inDataset = runSchemaWithAnnotationQueueInfo.inDataset
                inputs = runSchemaWithAnnotationQueueInfo.inputs
                inputsPreview = runSchemaWithAnnotationQueueInfo.inputsPreview
                inputsS3Urls = runSchemaWithAnnotationQueueInfo.inputsS3Urls
                lastQueuedAt = runSchemaWithAnnotationQueueInfo.lastQueuedAt
                lastReviewedTime = runSchemaWithAnnotationQueueInfo.lastReviewedTime
                manifestId = runSchemaWithAnnotationQueueInfo.manifestId
                manifestS3Id = runSchemaWithAnnotationQueueInfo.manifestS3Id
                outputs = runSchemaWithAnnotationQueueInfo.outputs
                outputsPreview = runSchemaWithAnnotationQueueInfo.outputsPreview
                outputsS3Urls = runSchemaWithAnnotationQueueInfo.outputsS3Urls
                parentRunId = runSchemaWithAnnotationQueueInfo.parentRunId
                parentRunIds =
                    runSchemaWithAnnotationQueueInfo.parentRunIds.map { it.toMutableList() }
                priceModelId = runSchemaWithAnnotationQueueInfo.priceModelId
                promptCost = runSchemaWithAnnotationQueueInfo.promptCost
                promptCostDetails = runSchemaWithAnnotationQueueInfo.promptCostDetails
                promptTokenDetails = runSchemaWithAnnotationQueueInfo.promptTokenDetails
                promptTokens = runSchemaWithAnnotationQueueInfo.promptTokens
                referenceDatasetId = runSchemaWithAnnotationQueueInfo.referenceDatasetId
                referenceExampleId = runSchemaWithAnnotationQueueInfo.referenceExampleId
                s3Urls = runSchemaWithAnnotationQueueInfo.s3Urls
                serialized = runSchemaWithAnnotationQueueInfo.serialized
                shareToken = runSchemaWithAnnotationQueueInfo.shareToken
                startTime = runSchemaWithAnnotationQueueInfo.startTime
                tags = runSchemaWithAnnotationQueueInfo.tags.map { it.toMutableList() }
                threadId = runSchemaWithAnnotationQueueInfo.threadId
                totalCost = runSchemaWithAnnotationQueueInfo.totalCost
                totalTokens = runSchemaWithAnnotationQueueInfo.totalTokens
                traceFirstReceivedAt = runSchemaWithAnnotationQueueInfo.traceFirstReceivedAt
                traceMaxStartTime = runSchemaWithAnnotationQueueInfo.traceMaxStartTime
                traceMinStartTime = runSchemaWithAnnotationQueueInfo.traceMinStartTime
                traceTier = runSchemaWithAnnotationQueueInfo.traceTier
                traceUpgrade = runSchemaWithAnnotationQueueInfo.traceUpgrade
                ttlSeconds = runSchemaWithAnnotationQueueInfo.ttlSeconds
                additionalProperties =
                    runSchemaWithAnnotationQueueInfo.additionalProperties.toMutableMap()
            }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun appPath(appPath: String) = appPath(JsonField.of(appPath))

        /**
         * Sets [Builder.appPath] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appPath] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun appPath(appPath: JsonField<String>) = apply { this.appPath = appPath }

        fun dottedOrder(dottedOrder: String) = dottedOrder(JsonField.of(dottedOrder))

        /**
         * Sets [Builder.dottedOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dottedOrder] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dottedOrder(dottedOrder: JsonField<String>) = apply { this.dottedOrder = dottedOrder }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun queueRunId(queueRunId: String) = queueRunId(JsonField.of(queueRunId))

        /**
         * Sets [Builder.queueRunId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.queueRunId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun queueRunId(queueRunId: JsonField<String>) = apply { this.queueRunId = queueRunId }

        /** Enum for run types. */
        fun runType(runType: RunTypeEnum) = runType(JsonField.of(runType))

        /**
         * Sets [Builder.runType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runType] with a well-typed [RunTypeEnum] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun runType(runType: JsonField<RunTypeEnum>) = apply { this.runType = runType }

        fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

        /**
         * Sets [Builder.sessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        fun traceId(traceId: String) = traceId(JsonField.of(traceId))

        /**
         * Sets [Builder.traceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.traceId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun traceId(traceId: JsonField<String>) = apply { this.traceId = traceId }

        fun addedAt(addedAt: OffsetDateTime?) = addedAt(JsonField.ofNullable(addedAt))

        /** Alias for calling [Builder.addedAt] with `addedAt.orElse(null)`. */
        fun addedAt(addedAt: Optional<OffsetDateTime>) = addedAt(addedAt.getOrNull())

        /**
         * Sets [Builder.addedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun addedAt(addedAt: JsonField<OffsetDateTime>) = apply { this.addedAt = addedAt }

        fun childRunIds(childRunIds: List<String>?) = childRunIds(JsonField.ofNullable(childRunIds))

        /** Alias for calling [Builder.childRunIds] with `childRunIds.orElse(null)`. */
        fun childRunIds(childRunIds: Optional<List<String>>) = childRunIds(childRunIds.getOrNull())

        /**
         * Sets [Builder.childRunIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.childRunIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun childRunIds(childRunIds: JsonField<List<String>>) = apply {
            this.childRunIds = childRunIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [childRunIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addChildRunId(childRunId: String) = apply {
            childRunIds =
                (childRunIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("childRunIds", it).add(childRunId)
                }
        }

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

        fun completionCostDetails(completionCostDetails: CompletionCostDetails?) =
            completionCostDetails(JsonField.ofNullable(completionCostDetails))

        /**
         * Alias for calling [Builder.completionCostDetails] with
         * `completionCostDetails.orElse(null)`.
         */
        fun completionCostDetails(completionCostDetails: Optional<CompletionCostDetails>) =
            completionCostDetails(completionCostDetails.getOrNull())

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

        fun completionTokenDetails(completionTokenDetails: CompletionTokenDetails?) =
            completionTokenDetails(JsonField.ofNullable(completionTokenDetails))

        /**
         * Alias for calling [Builder.completionTokenDetails] with
         * `completionTokenDetails.orElse(null)`.
         */
        fun completionTokenDetails(completionTokenDetails: Optional<CompletionTokenDetails>) =
            completionTokenDetails(completionTokenDetails.getOrNull())

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

        fun directChildRunIds(directChildRunIds: List<String>?) =
            directChildRunIds(JsonField.ofNullable(directChildRunIds))

        /** Alias for calling [Builder.directChildRunIds] with `directChildRunIds.orElse(null)`. */
        fun directChildRunIds(directChildRunIds: Optional<List<String>>) =
            directChildRunIds(directChildRunIds.getOrNull())

        /**
         * Sets [Builder.directChildRunIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.directChildRunIds] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun directChildRunIds(directChildRunIds: JsonField<List<String>>) = apply {
            this.directChildRunIds = directChildRunIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [directChildRunIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDirectChildRunId(directChildRunId: String) = apply {
            directChildRunIds =
                (directChildRunIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("directChildRunIds", it).add(directChildRunId)
                }
        }

        fun effectiveAddedAt(effectiveAddedAt: OffsetDateTime?) =
            effectiveAddedAt(JsonField.ofNullable(effectiveAddedAt))

        /** Alias for calling [Builder.effectiveAddedAt] with `effectiveAddedAt.orElse(null)`. */
        fun effectiveAddedAt(effectiveAddedAt: Optional<OffsetDateTime>) =
            effectiveAddedAt(effectiveAddedAt.getOrNull())

        /**
         * Sets [Builder.effectiveAddedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveAddedAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun effectiveAddedAt(effectiveAddedAt: JsonField<OffsetDateTime>) = apply {
            this.effectiveAddedAt = effectiveAddedAt
        }

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

        fun error(error: String?) = error(JsonField.ofNullable(error))

        /** Alias for calling [Builder.error] with `error.orElse(null)`. */
        fun error(error: Optional<String>) = error(error.getOrNull())

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun error(error: JsonField<String>) = apply { this.error = error }

        fun events(events: List<JsonValue>?) = events(JsonField.ofNullable(events))

        /** Alias for calling [Builder.events] with `events.orElse(null)`. */
        fun events(events: Optional<List<JsonValue>>) = events(events.getOrNull())

        /**
         * Sets [Builder.events] to an arbitrary JSON value.
         *
         * You should usually call [Builder.events] with a well-typed `List<JsonValue>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun events(events: JsonField<List<JsonValue>>) = apply {
            this.events = events.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonValue] to [events].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEvent(event: JsonValue) = apply {
            events =
                (events ?: JsonField.of(mutableListOf())).also {
                    checkKnown("events", it).add(event)
                }
        }

        fun executionOrder(executionOrder: Long) = executionOrder(JsonField.of(executionOrder))

        /**
         * Sets [Builder.executionOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.executionOrder] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun executionOrder(executionOrder: JsonField<Long>) = apply {
            this.executionOrder = executionOrder
        }

        fun extra(extra: JsonValue) = apply { this.extra = extra }

        fun feedbackStats(feedbackStats: FeedbackStats?) =
            feedbackStats(JsonField.ofNullable(feedbackStats))

        /** Alias for calling [Builder.feedbackStats] with `feedbackStats.orElse(null)`. */
        fun feedbackStats(feedbackStats: Optional<FeedbackStats>) =
            feedbackStats(feedbackStats.getOrNull())

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

        fun firstTokenTime(firstTokenTime: OffsetDateTime?) =
            firstTokenTime(JsonField.ofNullable(firstTokenTime))

        /** Alias for calling [Builder.firstTokenTime] with `firstTokenTime.orElse(null)`. */
        fun firstTokenTime(firstTokenTime: Optional<OffsetDateTime>) =
            firstTokenTime(firstTokenTime.getOrNull())

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

        fun inDataset(inDataset: Boolean?) = inDataset(JsonField.ofNullable(inDataset))

        /**
         * Alias for [Builder.inDataset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun inDataset(inDataset: Boolean) = inDataset(inDataset as Boolean?)

        /** Alias for calling [Builder.inDataset] with `inDataset.orElse(null)`. */
        fun inDataset(inDataset: Optional<Boolean>) = inDataset(inDataset.getOrNull())

        /**
         * Sets [Builder.inDataset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inDataset] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inDataset(inDataset: JsonField<Boolean>) = apply { this.inDataset = inDataset }

        fun inputs(inputs: JsonValue) = apply { this.inputs = inputs }

        fun inputsPreview(inputsPreview: String?) =
            inputsPreview(JsonField.ofNullable(inputsPreview))

        /** Alias for calling [Builder.inputsPreview] with `inputsPreview.orElse(null)`. */
        fun inputsPreview(inputsPreview: Optional<String>) =
            inputsPreview(inputsPreview.getOrNull())

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

        fun inputsS3Urls(inputsS3Urls: JsonValue) = apply { this.inputsS3Urls = inputsS3Urls }

        fun lastQueuedAt(lastQueuedAt: OffsetDateTime?) =
            lastQueuedAt(JsonField.ofNullable(lastQueuedAt))

        /** Alias for calling [Builder.lastQueuedAt] with `lastQueuedAt.orElse(null)`. */
        fun lastQueuedAt(lastQueuedAt: Optional<OffsetDateTime>) =
            lastQueuedAt(lastQueuedAt.getOrNull())

        /**
         * Sets [Builder.lastQueuedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastQueuedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastQueuedAt(lastQueuedAt: JsonField<OffsetDateTime>) = apply {
            this.lastQueuedAt = lastQueuedAt
        }

        fun lastReviewedTime(lastReviewedTime: OffsetDateTime?) =
            lastReviewedTime(JsonField.ofNullable(lastReviewedTime))

        /** Alias for calling [Builder.lastReviewedTime] with `lastReviewedTime.orElse(null)`. */
        fun lastReviewedTime(lastReviewedTime: Optional<OffsetDateTime>) =
            lastReviewedTime(lastReviewedTime.getOrNull())

        /**
         * Sets [Builder.lastReviewedTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastReviewedTime] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun lastReviewedTime(lastReviewedTime: JsonField<OffsetDateTime>) = apply {
            this.lastReviewedTime = lastReviewedTime
        }

        fun manifestId(manifestId: String?) = manifestId(JsonField.ofNullable(manifestId))

        /** Alias for calling [Builder.manifestId] with `manifestId.orElse(null)`. */
        fun manifestId(manifestId: Optional<String>) = manifestId(manifestId.getOrNull())

        /**
         * Sets [Builder.manifestId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.manifestId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun manifestId(manifestId: JsonField<String>) = apply { this.manifestId = manifestId }

        fun manifestS3Id(manifestS3Id: String?) = manifestS3Id(JsonField.ofNullable(manifestS3Id))

        /** Alias for calling [Builder.manifestS3Id] with `manifestS3Id.orElse(null)`. */
        fun manifestS3Id(manifestS3Id: Optional<String>) = manifestS3Id(manifestS3Id.getOrNull())

        /**
         * Sets [Builder.manifestS3Id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.manifestS3Id] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun manifestS3Id(manifestS3Id: JsonField<String>) = apply {
            this.manifestS3Id = manifestS3Id
        }

        fun outputs(outputs: JsonValue) = apply { this.outputs = outputs }

        fun outputsPreview(outputsPreview: String?) =
            outputsPreview(JsonField.ofNullable(outputsPreview))

        /** Alias for calling [Builder.outputsPreview] with `outputsPreview.orElse(null)`. */
        fun outputsPreview(outputsPreview: Optional<String>) =
            outputsPreview(outputsPreview.getOrNull())

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

        fun outputsS3Urls(outputsS3Urls: JsonValue) = apply { this.outputsS3Urls = outputsS3Urls }

        fun parentRunId(parentRunId: String?) = parentRunId(JsonField.ofNullable(parentRunId))

        /** Alias for calling [Builder.parentRunId] with `parentRunId.orElse(null)`. */
        fun parentRunId(parentRunId: Optional<String>) = parentRunId(parentRunId.getOrNull())

        /**
         * Sets [Builder.parentRunId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parentRunId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun parentRunId(parentRunId: JsonField<String>) = apply { this.parentRunId = parentRunId }

        fun parentRunIds(parentRunIds: List<String>?) =
            parentRunIds(JsonField.ofNullable(parentRunIds))

        /** Alias for calling [Builder.parentRunIds] with `parentRunIds.orElse(null)`. */
        fun parentRunIds(parentRunIds: Optional<List<String>>) =
            parentRunIds(parentRunIds.getOrNull())

        /**
         * Sets [Builder.parentRunIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parentRunIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun parentRunIds(parentRunIds: JsonField<List<String>>) = apply {
            this.parentRunIds = parentRunIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [parentRunIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addParentRunId(parentRunId: String) = apply {
            parentRunIds =
                (parentRunIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("parentRunIds", it).add(parentRunId)
                }
        }

        fun priceModelId(priceModelId: String?) = priceModelId(JsonField.ofNullable(priceModelId))

        /** Alias for calling [Builder.priceModelId] with `priceModelId.orElse(null)`. */
        fun priceModelId(priceModelId: Optional<String>) = priceModelId(priceModelId.getOrNull())

        /**
         * Sets [Builder.priceModelId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priceModelId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun priceModelId(priceModelId: JsonField<String>) = apply {
            this.priceModelId = priceModelId
        }

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

        fun promptCostDetails(promptCostDetails: PromptCostDetails?) =
            promptCostDetails(JsonField.ofNullable(promptCostDetails))

        /** Alias for calling [Builder.promptCostDetails] with `promptCostDetails.orElse(null)`. */
        fun promptCostDetails(promptCostDetails: Optional<PromptCostDetails>) =
            promptCostDetails(promptCostDetails.getOrNull())

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

        fun promptTokenDetails(promptTokenDetails: PromptTokenDetails?) =
            promptTokenDetails(JsonField.ofNullable(promptTokenDetails))

        /**
         * Alias for calling [Builder.promptTokenDetails] with `promptTokenDetails.orElse(null)`.
         */
        fun promptTokenDetails(promptTokenDetails: Optional<PromptTokenDetails>) =
            promptTokenDetails(promptTokenDetails.getOrNull())

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

        fun promptTokens(promptTokens: Long) = promptTokens(JsonField.of(promptTokens))

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

        fun referenceExampleId(referenceExampleId: String?) =
            referenceExampleId(JsonField.ofNullable(referenceExampleId))

        /**
         * Alias for calling [Builder.referenceExampleId] with `referenceExampleId.orElse(null)`.
         */
        fun referenceExampleId(referenceExampleId: Optional<String>) =
            referenceExampleId(referenceExampleId.getOrNull())

        /**
         * Sets [Builder.referenceExampleId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceExampleId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referenceExampleId(referenceExampleId: JsonField<String>) = apply {
            this.referenceExampleId = referenceExampleId
        }

        fun s3Urls(s3Urls: JsonValue) = apply { this.s3Urls = s3Urls }

        fun serialized(serialized: JsonValue) = apply { this.serialized = serialized }

        fun shareToken(shareToken: String?) = shareToken(JsonField.ofNullable(shareToken))

        /** Alias for calling [Builder.shareToken] with `shareToken.orElse(null)`. */
        fun shareToken(shareToken: Optional<String>) = shareToken(shareToken.getOrNull())

        /**
         * Sets [Builder.shareToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shareToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun shareToken(shareToken: JsonField<String>) = apply { this.shareToken = shareToken }

        fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { this.startTime = startTime }

        fun tags(tags: List<String>?) = tags(JsonField.ofNullable(tags))

        /** Alias for calling [Builder.tags] with `tags.orElse(null)`. */
        fun tags(tags: Optional<List<String>>) = tags(tags.getOrNull())

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply {
            this.tags = tags.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply {
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
        }

        fun threadId(threadId: String?) = threadId(JsonField.ofNullable(threadId))

        /** Alias for calling [Builder.threadId] with `threadId.orElse(null)`. */
        fun threadId(threadId: Optional<String>) = threadId(threadId.getOrNull())

        /**
         * Sets [Builder.threadId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threadId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun threadId(threadId: JsonField<String>) = apply { this.threadId = threadId }

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

        fun totalTokens(totalTokens: Long) = totalTokens(JsonField.of(totalTokens))

        /**
         * Sets [Builder.totalTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalTokens(totalTokens: JsonField<Long>) = apply { this.totalTokens = totalTokens }

        fun traceFirstReceivedAt(traceFirstReceivedAt: OffsetDateTime?) =
            traceFirstReceivedAt(JsonField.ofNullable(traceFirstReceivedAt))

        /**
         * Alias for calling [Builder.traceFirstReceivedAt] with
         * `traceFirstReceivedAt.orElse(null)`.
         */
        fun traceFirstReceivedAt(traceFirstReceivedAt: Optional<OffsetDateTime>) =
            traceFirstReceivedAt(traceFirstReceivedAt.getOrNull())

        /**
         * Sets [Builder.traceFirstReceivedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.traceFirstReceivedAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun traceFirstReceivedAt(traceFirstReceivedAt: JsonField<OffsetDateTime>) = apply {
            this.traceFirstReceivedAt = traceFirstReceivedAt
        }

        fun traceMaxStartTime(traceMaxStartTime: OffsetDateTime?) =
            traceMaxStartTime(JsonField.ofNullable(traceMaxStartTime))

        /** Alias for calling [Builder.traceMaxStartTime] with `traceMaxStartTime.orElse(null)`. */
        fun traceMaxStartTime(traceMaxStartTime: Optional<OffsetDateTime>) =
            traceMaxStartTime(traceMaxStartTime.getOrNull())

        /**
         * Sets [Builder.traceMaxStartTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.traceMaxStartTime] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun traceMaxStartTime(traceMaxStartTime: JsonField<OffsetDateTime>) = apply {
            this.traceMaxStartTime = traceMaxStartTime
        }

        fun traceMinStartTime(traceMinStartTime: OffsetDateTime?) =
            traceMinStartTime(JsonField.ofNullable(traceMinStartTime))

        /** Alias for calling [Builder.traceMinStartTime] with `traceMinStartTime.orElse(null)`. */
        fun traceMinStartTime(traceMinStartTime: Optional<OffsetDateTime>) =
            traceMinStartTime(traceMinStartTime.getOrNull())

        /**
         * Sets [Builder.traceMinStartTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.traceMinStartTime] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun traceMinStartTime(traceMinStartTime: JsonField<OffsetDateTime>) = apply {
            this.traceMinStartTime = traceMinStartTime
        }

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

        fun traceUpgrade(traceUpgrade: Boolean) = traceUpgrade(JsonField.of(traceUpgrade))

        /**
         * Sets [Builder.traceUpgrade] to an arbitrary JSON value.
         *
         * You should usually call [Builder.traceUpgrade] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun traceUpgrade(traceUpgrade: JsonField<Boolean>) = apply {
            this.traceUpgrade = traceUpgrade
        }

        fun ttlSeconds(ttlSeconds: Long?) = ttlSeconds(JsonField.ofNullable(ttlSeconds))

        /**
         * Alias for [Builder.ttlSeconds].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun ttlSeconds(ttlSeconds: Long) = ttlSeconds(ttlSeconds as Long?)

        /** Alias for calling [Builder.ttlSeconds] with `ttlSeconds.orElse(null)`. */
        fun ttlSeconds(ttlSeconds: Optional<Long>) = ttlSeconds(ttlSeconds.getOrNull())

        /**
         * Sets [Builder.ttlSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ttlSeconds] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ttlSeconds(ttlSeconds: JsonField<Long>) = apply { this.ttlSeconds = ttlSeconds }

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
         * Returns an immutable instance of [RunSchemaWithAnnotationQueueInfo].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .appPath()
         * .dottedOrder()
         * .name()
         * .queueRunId()
         * .runType()
         * .sessionId()
         * .status()
         * .traceId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RunSchemaWithAnnotationQueueInfo =
            RunSchemaWithAnnotationQueueInfo(
                checkRequired("id", id),
                checkRequired("appPath", appPath),
                checkRequired("dottedOrder", dottedOrder),
                checkRequired("name", name),
                checkRequired("queueRunId", queueRunId),
                checkRequired("runType", runType),
                checkRequired("sessionId", sessionId),
                checkRequired("status", status),
                checkRequired("traceId", traceId),
                addedAt,
                (childRunIds ?: JsonMissing.of()).map { it.toImmutable() },
                completionCost,
                completionCostDetails,
                completionTokenDetails,
                completionTokens,
                (directChildRunIds ?: JsonMissing.of()).map { it.toImmutable() },
                effectiveAddedAt,
                endTime,
                error,
                (events ?: JsonMissing.of()).map { it.toImmutable() },
                executionOrder,
                extra,
                feedbackStats,
                firstTokenTime,
                inDataset,
                inputs,
                inputsPreview,
                inputsS3Urls,
                lastQueuedAt,
                lastReviewedTime,
                manifestId,
                manifestS3Id,
                outputs,
                outputsPreview,
                outputsS3Urls,
                parentRunId,
                (parentRunIds ?: JsonMissing.of()).map { it.toImmutable() },
                priceModelId,
                promptCost,
                promptCostDetails,
                promptTokenDetails,
                promptTokens,
                referenceDatasetId,
                referenceExampleId,
                s3Urls,
                serialized,
                shareToken,
                startTime,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                threadId,
                totalCost,
                totalTokens,
                traceFirstReceivedAt,
                traceMaxStartTime,
                traceMinStartTime,
                traceTier,
                traceUpgrade,
                ttlSeconds,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RunSchemaWithAnnotationQueueInfo = apply {
        if (validated) {
            return@apply
        }

        id()
        appPath()
        dottedOrder()
        name()
        queueRunId()
        runType().validate()
        sessionId()
        status()
        traceId()
        addedAt()
        childRunIds()
        completionCost()
        completionCostDetails().ifPresent { it.validate() }
        completionTokenDetails().ifPresent { it.validate() }
        completionTokens()
        directChildRunIds()
        effectiveAddedAt()
        endTime()
        error()
        events()
        executionOrder()
        feedbackStats().ifPresent { it.validate() }
        firstTokenTime()
        inDataset()
        inputsPreview()
        lastQueuedAt()
        lastReviewedTime()
        manifestId()
        manifestS3Id()
        outputsPreview()
        parentRunId()
        parentRunIds()
        priceModelId()
        promptCost()
        promptCostDetails().ifPresent { it.validate() }
        promptTokenDetails().ifPresent { it.validate() }
        promptTokens()
        referenceDatasetId()
        referenceExampleId()
        shareToken()
        startTime()
        tags()
        threadId()
        totalCost()
        totalTokens()
        traceFirstReceivedAt()
        traceMaxStartTime()
        traceMinStartTime()
        traceTier().ifPresent { it.validate() }
        traceUpgrade()
        ttlSeconds()
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
            (if (appPath.asKnown().isPresent) 1 else 0) +
            (if (dottedOrder.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (queueRunId.asKnown().isPresent) 1 else 0) +
            (runType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sessionId.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (traceId.asKnown().isPresent) 1 else 0) +
            (if (addedAt.asKnown().isPresent) 1 else 0) +
            (childRunIds.asKnown().getOrNull()?.size ?: 0) +
            (if (completionCost.asKnown().isPresent) 1 else 0) +
            (completionCostDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (completionTokenDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (if (completionTokens.asKnown().isPresent) 1 else 0) +
            (directChildRunIds.asKnown().getOrNull()?.size ?: 0) +
            (if (effectiveAddedAt.asKnown().isPresent) 1 else 0) +
            (if (endTime.asKnown().isPresent) 1 else 0) +
            (if (error.asKnown().isPresent) 1 else 0) +
            (events.asKnown().getOrNull()?.size ?: 0) +
            (if (executionOrder.asKnown().isPresent) 1 else 0) +
            (feedbackStats.asKnown().getOrNull()?.validity() ?: 0) +
            (if (firstTokenTime.asKnown().isPresent) 1 else 0) +
            (if (inDataset.asKnown().isPresent) 1 else 0) +
            (if (inputsPreview.asKnown().isPresent) 1 else 0) +
            (if (lastQueuedAt.asKnown().isPresent) 1 else 0) +
            (if (lastReviewedTime.asKnown().isPresent) 1 else 0) +
            (if (manifestId.asKnown().isPresent) 1 else 0) +
            (if (manifestS3Id.asKnown().isPresent) 1 else 0) +
            (if (outputsPreview.asKnown().isPresent) 1 else 0) +
            (if (parentRunId.asKnown().isPresent) 1 else 0) +
            (parentRunIds.asKnown().getOrNull()?.size ?: 0) +
            (if (priceModelId.asKnown().isPresent) 1 else 0) +
            (if (promptCost.asKnown().isPresent) 1 else 0) +
            (promptCostDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (promptTokenDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (if (promptTokens.asKnown().isPresent) 1 else 0) +
            (if (referenceDatasetId.asKnown().isPresent) 1 else 0) +
            (if (referenceExampleId.asKnown().isPresent) 1 else 0) +
            (if (shareToken.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (threadId.asKnown().isPresent) 1 else 0) +
            (if (totalCost.asKnown().isPresent) 1 else 0) +
            (if (totalTokens.asKnown().isPresent) 1 else 0) +
            (if (traceFirstReceivedAt.asKnown().isPresent) 1 else 0) +
            (if (traceMaxStartTime.asKnown().isPresent) 1 else 0) +
            (if (traceMinStartTime.asKnown().isPresent) 1 else 0) +
            (traceTier.asKnown().getOrNull()?.validity() ?: 0) +
            (if (traceUpgrade.asKnown().isPresent) 1 else 0) +
            (if (ttlSeconds.asKnown().isPresent) 1 else 0)

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

    class TraceTier @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val LONGLIVED = of("longlived")

            @JvmField val SHORTLIVED = of("shortlived")

            @JvmStatic fun of(value: String) = TraceTier(JsonField.of(value))
        }

        /** An enum containing [TraceTier]'s known values. */
        enum class Known {
            LONGLIVED,
            SHORTLIVED,
        }

        /**
         * An enum containing [TraceTier]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TraceTier] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LONGLIVED,
            SHORTLIVED,
            /**
             * An enum member indicating that [TraceTier] was instantiated with an unknown value.
             */
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
                LONGLIVED -> Value.LONGLIVED
                SHORTLIVED -> Value.SHORTLIVED
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
                LONGLIVED -> Known.LONGLIVED
                SHORTLIVED -> Known.SHORTLIVED
                else -> throw LangChainInvalidDataException("Unknown TraceTier: $value")
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

        fun validate(): TraceTier = apply {
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

            return other is TraceTier && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunSchemaWithAnnotationQueueInfo &&
            id == other.id &&
            appPath == other.appPath &&
            dottedOrder == other.dottedOrder &&
            name == other.name &&
            queueRunId == other.queueRunId &&
            runType == other.runType &&
            sessionId == other.sessionId &&
            status == other.status &&
            traceId == other.traceId &&
            addedAt == other.addedAt &&
            childRunIds == other.childRunIds &&
            completionCost == other.completionCost &&
            completionCostDetails == other.completionCostDetails &&
            completionTokenDetails == other.completionTokenDetails &&
            completionTokens == other.completionTokens &&
            directChildRunIds == other.directChildRunIds &&
            effectiveAddedAt == other.effectiveAddedAt &&
            endTime == other.endTime &&
            error == other.error &&
            events == other.events &&
            executionOrder == other.executionOrder &&
            extra == other.extra &&
            feedbackStats == other.feedbackStats &&
            firstTokenTime == other.firstTokenTime &&
            inDataset == other.inDataset &&
            inputs == other.inputs &&
            inputsPreview == other.inputsPreview &&
            inputsS3Urls == other.inputsS3Urls &&
            lastQueuedAt == other.lastQueuedAt &&
            lastReviewedTime == other.lastReviewedTime &&
            manifestId == other.manifestId &&
            manifestS3Id == other.manifestS3Id &&
            outputs == other.outputs &&
            outputsPreview == other.outputsPreview &&
            outputsS3Urls == other.outputsS3Urls &&
            parentRunId == other.parentRunId &&
            parentRunIds == other.parentRunIds &&
            priceModelId == other.priceModelId &&
            promptCost == other.promptCost &&
            promptCostDetails == other.promptCostDetails &&
            promptTokenDetails == other.promptTokenDetails &&
            promptTokens == other.promptTokens &&
            referenceDatasetId == other.referenceDatasetId &&
            referenceExampleId == other.referenceExampleId &&
            s3Urls == other.s3Urls &&
            serialized == other.serialized &&
            shareToken == other.shareToken &&
            startTime == other.startTime &&
            tags == other.tags &&
            threadId == other.threadId &&
            totalCost == other.totalCost &&
            totalTokens == other.totalTokens &&
            traceFirstReceivedAt == other.traceFirstReceivedAt &&
            traceMaxStartTime == other.traceMaxStartTime &&
            traceMinStartTime == other.traceMinStartTime &&
            traceTier == other.traceTier &&
            traceUpgrade == other.traceUpgrade &&
            ttlSeconds == other.ttlSeconds &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            appPath,
            dottedOrder,
            name,
            queueRunId,
            runType,
            sessionId,
            status,
            traceId,
            addedAt,
            childRunIds,
            completionCost,
            completionCostDetails,
            completionTokenDetails,
            completionTokens,
            directChildRunIds,
            effectiveAddedAt,
            endTime,
            error,
            events,
            executionOrder,
            extra,
            feedbackStats,
            firstTokenTime,
            inDataset,
            inputs,
            inputsPreview,
            inputsS3Urls,
            lastQueuedAt,
            lastReviewedTime,
            manifestId,
            manifestS3Id,
            outputs,
            outputsPreview,
            outputsS3Urls,
            parentRunId,
            parentRunIds,
            priceModelId,
            promptCost,
            promptCostDetails,
            promptTokenDetails,
            promptTokens,
            referenceDatasetId,
            referenceExampleId,
            s3Urls,
            serialized,
            shareToken,
            startTime,
            tags,
            threadId,
            totalCost,
            totalTokens,
            traceFirstReceivedAt,
            traceMaxStartTime,
            traceMinStartTime,
            traceTier,
            traceUpgrade,
            ttlSeconds,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RunSchemaWithAnnotationQueueInfo{id=$id, appPath=$appPath, dottedOrder=$dottedOrder, name=$name, queueRunId=$queueRunId, runType=$runType, sessionId=$sessionId, status=$status, traceId=$traceId, addedAt=$addedAt, childRunIds=$childRunIds, completionCost=$completionCost, completionCostDetails=$completionCostDetails, completionTokenDetails=$completionTokenDetails, completionTokens=$completionTokens, directChildRunIds=$directChildRunIds, effectiveAddedAt=$effectiveAddedAt, endTime=$endTime, error=$error, events=$events, executionOrder=$executionOrder, extra=$extra, feedbackStats=$feedbackStats, firstTokenTime=$firstTokenTime, inDataset=$inDataset, inputs=$inputs, inputsPreview=$inputsPreview, inputsS3Urls=$inputsS3Urls, lastQueuedAt=$lastQueuedAt, lastReviewedTime=$lastReviewedTime, manifestId=$manifestId, manifestS3Id=$manifestS3Id, outputs=$outputs, outputsPreview=$outputsPreview, outputsS3Urls=$outputsS3Urls, parentRunId=$parentRunId, parentRunIds=$parentRunIds, priceModelId=$priceModelId, promptCost=$promptCost, promptCostDetails=$promptCostDetails, promptTokenDetails=$promptTokenDetails, promptTokens=$promptTokens, referenceDatasetId=$referenceDatasetId, referenceExampleId=$referenceExampleId, s3Urls=$s3Urls, serialized=$serialized, shareToken=$shareToken, startTime=$startTime, tags=$tags, threadId=$threadId, totalCost=$totalCost, totalTokens=$totalTokens, traceFirstReceivedAt=$traceFirstReceivedAt, traceMaxStartTime=$traceMaxStartTime, traceMinStartTime=$traceMinStartTime, traceTier=$traceTier, traceUpgrade=$traceUpgrade, ttlSeconds=$ttlSeconds, additionalProperties=$additionalProperties}"
}

// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs

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
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class QueryRunResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val appPath: JsonField<String>,
    private val attachments: JsonField<Attachments>,
    private val completionCost: JsonField<Double>,
    private val completionCostDetails: JsonField<CompletionCostDetails>,
    private val completionTokenDetails: JsonField<CompletionTokenDetails>,
    private val completionTokens: JsonField<Long>,
    private val dottedOrder: JsonField<String>,
    private val endTime: JsonField<OffsetDateTime>,
    private val error: JsonField<String>,
    private val errorPreview: JsonField<String>,
    private val events: JsonField<List<Event>>,
    private val extra: JsonValue,
    private val feedbackStats: JsonField<FeedbackStats>,
    private val firstTokenTime: JsonField<OffsetDateTime>,
    private val inputs: JsonValue,
    private val inputsPreview: JsonField<String>,
    private val isInDataset: JsonField<Boolean>,
    private val isRoot: JsonField<Boolean>,
    private val latencySeconds: JsonField<Double>,
    private val manifest: JsonValue,
    private val metadata: JsonValue,
    private val name: JsonField<String>,
    private val outputs: JsonValue,
    private val outputsPreview: JsonField<String>,
    private val parentRunIds: JsonField<List<String>>,
    private val priceModelId: JsonField<String>,
    private val projectId: JsonField<String>,
    private val promptCost: JsonField<Double>,
    private val promptCostDetails: JsonField<PromptCostDetails>,
    private val promptTokenDetails: JsonField<PromptTokenDetails>,
    private val promptTokens: JsonField<Long>,
    private val referenceDatasetId: JsonField<String>,
    private val referenceExampleId: JsonField<String>,
    private val runType: JsonField<RunType>,
    private val shareUrl: JsonField<String>,
    private val startTime: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val tags: JsonField<List<String>>,
    private val threadEvaluationTime: JsonField<OffsetDateTime>,
    private val threadId: JsonField<String>,
    private val totalCost: JsonField<Double>,
    private val totalTokens: JsonField<Long>,
    private val traceId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("app_path") @ExcludeMissing appPath: JsonField<String> = JsonMissing.of(),
        @JsonProperty("attachments")
        @ExcludeMissing
        attachments: JsonField<Attachments> = JsonMissing.of(),
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
        @JsonProperty("dotted_order")
        @ExcludeMissing
        dottedOrder: JsonField<String> = JsonMissing.of(),
        @JsonProperty("end_time")
        @ExcludeMissing
        endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
        @JsonProperty("error_preview")
        @ExcludeMissing
        errorPreview: JsonField<String> = JsonMissing.of(),
        @JsonProperty("events") @ExcludeMissing events: JsonField<List<Event>> = JsonMissing.of(),
        @JsonProperty("extra") @ExcludeMissing extra: JsonValue = JsonMissing.of(),
        @JsonProperty("feedback_stats")
        @ExcludeMissing
        feedbackStats: JsonField<FeedbackStats> = JsonMissing.of(),
        @JsonProperty("first_token_time")
        @ExcludeMissing
        firstTokenTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("inputs") @ExcludeMissing inputs: JsonValue = JsonMissing.of(),
        @JsonProperty("inputs_preview")
        @ExcludeMissing
        inputsPreview: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_in_dataset")
        @ExcludeMissing
        isInDataset: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_root") @ExcludeMissing isRoot: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("latency_seconds")
        @ExcludeMissing
        latencySeconds: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("manifest") @ExcludeMissing manifest: JsonValue = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("outputs") @ExcludeMissing outputs: JsonValue = JsonMissing.of(),
        @JsonProperty("outputs_preview")
        @ExcludeMissing
        outputsPreview: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parent_run_ids")
        @ExcludeMissing
        parentRunIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("price_model_id")
        @ExcludeMissing
        priceModelId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("project_id") @ExcludeMissing projectId: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("reference_dataset_id")
        @ExcludeMissing
        referenceDatasetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reference_example_id")
        @ExcludeMissing
        referenceExampleId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("run_type") @ExcludeMissing runType: JsonField<RunType> = JsonMissing.of(),
        @JsonProperty("share_url") @ExcludeMissing shareUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("start_time")
        @ExcludeMissing
        startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("thread_evaluation_time")
        @ExcludeMissing
        threadEvaluationTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("thread_id") @ExcludeMissing threadId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_cost") @ExcludeMissing totalCost: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("total_tokens")
        @ExcludeMissing
        totalTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("trace_id") @ExcludeMissing traceId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        appPath,
        attachments,
        completionCost,
        completionCostDetails,
        completionTokenDetails,
        completionTokens,
        dottedOrder,
        endTime,
        error,
        errorPreview,
        events,
        extra,
        feedbackStats,
        firstTokenTime,
        inputs,
        inputsPreview,
        isInDataset,
        isRoot,
        latencySeconds,
        manifest,
        metadata,
        name,
        outputs,
        outputsPreview,
        parentRunIds,
        priceModelId,
        projectId,
        promptCost,
        promptCostDetails,
        promptTokenDetails,
        promptTokens,
        referenceDatasetId,
        referenceExampleId,
        runType,
        shareUrl,
        startTime,
        status,
        tags,
        threadEvaluationTime,
        threadId,
        totalCost,
        totalTokens,
        traceId,
        mutableMapOf(),
    )

    /**
     * `id` is this run's UUID.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * `app_path` identifies the application code location that produced this run, if recorded.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun appPath(): Optional<String> = appPath.getOptional("app_path")

    /**
     * `attachments` maps each attachment file name to a pre-signed HTTPS download URL.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun attachments(): Optional<Attachments> = attachments.getOptional("attachments")

    /**
     * `completion_cost` is estimated USD cost for the completion.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completionCost(): Optional<Double> = completionCost.getOptional("completion_cost")

    /**
     * `completion_cost_details` is the per-category USD breakdown of `completion_cost`. Categories
     * mirror `completion_token_details`. Returned only when the `COMPLETION_COST_DETAILS` field is
     * requested.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completionCostDetails(): Optional<CompletionCostDetails> =
        completionCostDetails.getOptional("completion_cost_details")

    /**
     * `completion_token_details` is the per-category breakdown of `completion_tokens`. Category
     * names are model-specific (for example `reasoning`, `audio`). Returned only when the
     * `COMPLETION_TOKEN_DETAILS` field is requested.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completionTokenDetails(): Optional<CompletionTokenDetails> =
        completionTokenDetails.getOptional("completion_token_details")

    /**
     * `completion_tokens` is the completion-side token count.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completionTokens(): Optional<Long> = completionTokens.getOptional("completion_tokens")

    /**
     * `dotted_order` is the hierarchical ordering key for trace trees.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dottedOrder(): Optional<String> = dottedOrder.getOptional("dotted_order")

    /**
     * `end_time` is when the run ended (RFC3339 date-time). JSON null if the run has not finished
     * yet.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("end_time")

    /**
     * `error` is the error message when `status` indicates failure.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun error(): Optional<String> = error.getOptional("error")

    /**
     * `error_preview` is a truncated plain-text error snippet.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errorPreview(): Optional<String> = errorPreview.getOptional("error_preview")

    /**
     * `events` is the ordered list of run events (for example streaming tokens).
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun events(): Optional<List<Event>> = events.getOptional("events")

    /**
     * `extra` is additional runtime JSON attached to the run.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = queryRunResponse.extra().convert(MyClass.class);
     * ```
     */
    @JsonProperty("extra") @ExcludeMissing fun _extra(): JsonValue = extra

    /**
     * `feedback_stats` aggregates feedback scores keyed by feedback key.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun feedbackStats(): Optional<FeedbackStats> = feedbackStats.getOptional("feedback_stats")

    /**
     * `first_token_time` is when the first output token was produced (RFC3339 date-time), when
     * recorded for streamed runs.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstTokenTime(): Optional<OffsetDateTime> = firstTokenTime.getOptional("first_token_time")

    /**
     * `inputs` is the run input payload (arbitrary JSON object).
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = queryRunResponse.inputs().convert(MyClass.class);
     * ```
     */
    @JsonProperty("inputs") @ExcludeMissing fun _inputs(): JsonValue = inputs

    /**
     * `inputs_preview` is a truncated plain-text preview of inputs.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inputsPreview(): Optional<String> = inputsPreview.getOptional("inputs_preview")

    /**
     * `is_in_dataset` is true when this run is linked to a dataset example.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isInDataset(): Optional<Boolean> = isInDataset.getOptional("is_in_dataset")

    /**
     * `is_root` is true when this run has no parent (it is the trace root).
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isRoot(): Optional<Boolean> = isRoot.getOptional("is_root")

    /**
     * `latency_seconds` is wall-clock duration from start to end in seconds.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun latencySeconds(): Optional<Double> = latencySeconds.getOptional("latency_seconds")

    /**
     * `manifest` is the serialized configuration of the traced component (for example the model
     * parameters, prompt template, or pipeline definition), when recorded.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = queryRunResponse.manifest().convert(MyClass.class);
     * ```
     */
    @JsonProperty("manifest") @ExcludeMissing fun _manifest(): JsonValue = manifest

    /**
     * `metadata` is arbitrary user-defined JSON metadata.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = queryRunResponse.metadata().convert(MyClass.class);
     * ```
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

    /**
     * `name` is a human-readable label for the run (for example the model name, function name, or
     * step name chosen when the run was traced).
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * `outputs` is the run output payload (arbitrary JSON object).
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = queryRunResponse.outputs().convert(MyClass.class);
     * ```
     */
    @JsonProperty("outputs") @ExcludeMissing fun _outputs(): JsonValue = outputs

    /**
     * `outputs_preview` is a truncated plain-text preview of outputs.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outputsPreview(): Optional<String> = outputsPreview.getOptional("outputs_preview")

    /**
     * `parent_run_ids` lists ancestor run UUIDs from the trace root down to the direct parent.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parentRunIds(): Optional<List<String>> = parentRunIds.getOptional("parent_run_ids")

    /**
     * `price_model_id` identifies the pricing model UUID used for cost estimates, when recorded.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun priceModelId(): Optional<String> = priceModelId.getOptional("price_model_id")

    /**
     * `project_id` is the tracing project UUID this run was logged to.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun projectId(): Optional<String> = projectId.getOptional("project_id")

    /**
     * `prompt_cost` is estimated USD cost for the prompt.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptCost(): Optional<Double> = promptCost.getOptional("prompt_cost")

    /**
     * `prompt_cost_details` is the per-category USD breakdown of `prompt_cost`. Categories mirror
     * `prompt_token_details`. Returned only when the `PROMPT_COST_DETAILS` field is requested.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptCostDetails(): Optional<PromptCostDetails> =
        promptCostDetails.getOptional("prompt_cost_details")

    /**
     * `prompt_token_details` is the per-category breakdown of `prompt_tokens`. Category names are
     * model-specific (for example `cache_read`, `cache_write`). Returned only when the
     * `PROMPT_TOKEN_DETAILS` field is requested.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptTokenDetails(): Optional<PromptTokenDetails> =
        promptTokenDetails.getOptional("prompt_token_details")

    /**
     * `prompt_tokens` is the prompt-side token count.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptTokens(): Optional<Long> = promptTokens.getOptional("prompt_tokens")

    /**
     * `reference_dataset_id` is the dataset UUID for the reference example, if any.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referenceDatasetId(): Optional<String> =
        referenceDatasetId.getOptional("reference_dataset_id")

    /**
     * `reference_example_id` is the dataset example UUID this run was compared against, if any.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referenceExampleId(): Optional<String> =
        referenceExampleId.getOptional("reference_example_id")

    /**
     * `run_type` identifies what kind of operation this run represents (for example an LLM call, a
     * tool invocation, or a chain step). See the `RunType` enum for allowed values.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runType(): Optional<RunType> = runType.getOptional("run_type")

    /**
     * `share_url` is the fully-qualified URL of this run's public view, rooted at the deployment's
     * LangSmith app origin (for example
     * `https://smith.langchain.com/public/4f7a1b2c-8d9e-4a0b-9c1d-2e3f4a5b6c7d/r`). It is returned
     * only when `SHARE_URL` is included in `selects`, and only when the run has been explicitly
     * shared; the URL remains stable until the run is unshared. Anyone with this URL can view the
     * run anonymously, so treat it as a secret and do not log it.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun shareUrl(): Optional<String> = shareUrl.getOptional("share_url")

    /**
     * `start_time` is when the run started (RFC3339 date-time).
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startTime(): Optional<OffsetDateTime> = startTime.getOptional("start_time")

    /**
     * `status` is the completion status of the run.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * `tags` lists user-defined tags on this run.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = tags.getOptional("tags")

    /**
     * `thread_evaluation_time` is thread-level evaluation timing (RFC3339 date-time), when
     * recorded.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun threadEvaluationTime(): Optional<OffsetDateTime> =
        threadEvaluationTime.getOptional("thread_evaluation_time")

    /**
     * `thread_id` is the conversation thread UUID this run belongs to, if any.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun threadId(): Optional<String> = threadId.getOptional("thread_id")

    /**
     * `total_cost` is total estimated USD cost (prompt plus completion).
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalCost(): Optional<Double> = totalCost.getOptional("total_cost")

    /**
     * `total_tokens` is prompt plus completion tokens.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalTokens(): Optional<Long> = totalTokens.getOptional("total_tokens")

    /**
     * `trace_id` is the root trace UUID; for a root run it matches `id`.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun traceId(): Optional<String> = traceId.getOptional("trace_id")

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
     * Returns the raw JSON value of [attachments].
     *
     * Unlike [attachments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("attachments")
    @ExcludeMissing
    fun _attachments(): JsonField<Attachments> = attachments

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
     * Returns the raw JSON value of [dottedOrder].
     *
     * Unlike [dottedOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dotted_order")
    @ExcludeMissing
    fun _dottedOrder(): JsonField<String> = dottedOrder

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
     * Returns the raw JSON value of [errorPreview].
     *
     * Unlike [errorPreview], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error_preview")
    @ExcludeMissing
    fun _errorPreview(): JsonField<String> = errorPreview

    /**
     * Returns the raw JSON value of [events].
     *
     * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("events") @ExcludeMissing fun _events(): JsonField<List<Event>> = events

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
     * Returns the raw JSON value of [inputsPreview].
     *
     * Unlike [inputsPreview], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inputs_preview")
    @ExcludeMissing
    fun _inputsPreview(): JsonField<String> = inputsPreview

    /**
     * Returns the raw JSON value of [isInDataset].
     *
     * Unlike [isInDataset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_in_dataset")
    @ExcludeMissing
    fun _isInDataset(): JsonField<Boolean> = isInDataset

    /**
     * Returns the raw JSON value of [isRoot].
     *
     * Unlike [isRoot], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_root") @ExcludeMissing fun _isRoot(): JsonField<Boolean> = isRoot

    /**
     * Returns the raw JSON value of [latencySeconds].
     *
     * Unlike [latencySeconds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("latency_seconds")
    @ExcludeMissing
    fun _latencySeconds(): JsonField<Double> = latencySeconds

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [outputsPreview].
     *
     * Unlike [outputsPreview], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("outputs_preview")
    @ExcludeMissing
    fun _outputsPreview(): JsonField<String> = outputsPreview

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
     * Returns the raw JSON value of [projectId].
     *
     * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("project_id") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

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
     * Returns the raw JSON value of [runType].
     *
     * Unlike [runType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("run_type") @ExcludeMissing fun _runType(): JsonField<RunType> = runType

    /**
     * Returns the raw JSON value of [shareUrl].
     *
     * Unlike [shareUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("share_url") @ExcludeMissing fun _shareUrl(): JsonField<String> = shareUrl

    /**
     * Returns the raw JSON value of [startTime].
     *
     * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_time")
    @ExcludeMissing
    fun _startTime(): JsonField<OffsetDateTime> = startTime

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

    /**
     * Returns the raw JSON value of [threadEvaluationTime].
     *
     * Unlike [threadEvaluationTime], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("thread_evaluation_time")
    @ExcludeMissing
    fun _threadEvaluationTime(): JsonField<OffsetDateTime> = threadEvaluationTime

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

        /** Returns a mutable builder for constructing an instance of [QueryRunResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [QueryRunResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var appPath: JsonField<String> = JsonMissing.of()
        private var attachments: JsonField<Attachments> = JsonMissing.of()
        private var completionCost: JsonField<Double> = JsonMissing.of()
        private var completionCostDetails: JsonField<CompletionCostDetails> = JsonMissing.of()
        private var completionTokenDetails: JsonField<CompletionTokenDetails> = JsonMissing.of()
        private var completionTokens: JsonField<Long> = JsonMissing.of()
        private var dottedOrder: JsonField<String> = JsonMissing.of()
        private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var error: JsonField<String> = JsonMissing.of()
        private var errorPreview: JsonField<String> = JsonMissing.of()
        private var events: JsonField<MutableList<Event>>? = null
        private var extra: JsonValue = JsonMissing.of()
        private var feedbackStats: JsonField<FeedbackStats> = JsonMissing.of()
        private var firstTokenTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var inputs: JsonValue = JsonMissing.of()
        private var inputsPreview: JsonField<String> = JsonMissing.of()
        private var isInDataset: JsonField<Boolean> = JsonMissing.of()
        private var isRoot: JsonField<Boolean> = JsonMissing.of()
        private var latencySeconds: JsonField<Double> = JsonMissing.of()
        private var manifest: JsonValue = JsonMissing.of()
        private var metadata: JsonValue = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var outputs: JsonValue = JsonMissing.of()
        private var outputsPreview: JsonField<String> = JsonMissing.of()
        private var parentRunIds: JsonField<MutableList<String>>? = null
        private var priceModelId: JsonField<String> = JsonMissing.of()
        private var projectId: JsonField<String> = JsonMissing.of()
        private var promptCost: JsonField<Double> = JsonMissing.of()
        private var promptCostDetails: JsonField<PromptCostDetails> = JsonMissing.of()
        private var promptTokenDetails: JsonField<PromptTokenDetails> = JsonMissing.of()
        private var promptTokens: JsonField<Long> = JsonMissing.of()
        private var referenceDatasetId: JsonField<String> = JsonMissing.of()
        private var referenceExampleId: JsonField<String> = JsonMissing.of()
        private var runType: JsonField<RunType> = JsonMissing.of()
        private var shareUrl: JsonField<String> = JsonMissing.of()
        private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var threadEvaluationTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var threadId: JsonField<String> = JsonMissing.of()
        private var totalCost: JsonField<Double> = JsonMissing.of()
        private var totalTokens: JsonField<Long> = JsonMissing.of()
        private var traceId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(queryRunResponse: QueryRunResponse) = apply {
            id = queryRunResponse.id
            appPath = queryRunResponse.appPath
            attachments = queryRunResponse.attachments
            completionCost = queryRunResponse.completionCost
            completionCostDetails = queryRunResponse.completionCostDetails
            completionTokenDetails = queryRunResponse.completionTokenDetails
            completionTokens = queryRunResponse.completionTokens
            dottedOrder = queryRunResponse.dottedOrder
            endTime = queryRunResponse.endTime
            error = queryRunResponse.error
            errorPreview = queryRunResponse.errorPreview
            events = queryRunResponse.events.map { it.toMutableList() }
            extra = queryRunResponse.extra
            feedbackStats = queryRunResponse.feedbackStats
            firstTokenTime = queryRunResponse.firstTokenTime
            inputs = queryRunResponse.inputs
            inputsPreview = queryRunResponse.inputsPreview
            isInDataset = queryRunResponse.isInDataset
            isRoot = queryRunResponse.isRoot
            latencySeconds = queryRunResponse.latencySeconds
            manifest = queryRunResponse.manifest
            metadata = queryRunResponse.metadata
            name = queryRunResponse.name
            outputs = queryRunResponse.outputs
            outputsPreview = queryRunResponse.outputsPreview
            parentRunIds = queryRunResponse.parentRunIds.map { it.toMutableList() }
            priceModelId = queryRunResponse.priceModelId
            projectId = queryRunResponse.projectId
            promptCost = queryRunResponse.promptCost
            promptCostDetails = queryRunResponse.promptCostDetails
            promptTokenDetails = queryRunResponse.promptTokenDetails
            promptTokens = queryRunResponse.promptTokens
            referenceDatasetId = queryRunResponse.referenceDatasetId
            referenceExampleId = queryRunResponse.referenceExampleId
            runType = queryRunResponse.runType
            shareUrl = queryRunResponse.shareUrl
            startTime = queryRunResponse.startTime
            status = queryRunResponse.status
            tags = queryRunResponse.tags.map { it.toMutableList() }
            threadEvaluationTime = queryRunResponse.threadEvaluationTime
            threadId = queryRunResponse.threadId
            totalCost = queryRunResponse.totalCost
            totalTokens = queryRunResponse.totalTokens
            traceId = queryRunResponse.traceId
            additionalProperties = queryRunResponse.additionalProperties.toMutableMap()
        }

        /** `id` is this run's UUID. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * `app_path` identifies the application code location that produced this run, if recorded.
         */
        fun appPath(appPath: String) = appPath(JsonField.of(appPath))

        /**
         * Sets [Builder.appPath] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appPath] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun appPath(appPath: JsonField<String>) = apply { this.appPath = appPath }

        /** `attachments` maps each attachment file name to a pre-signed HTTPS download URL. */
        fun attachments(attachments: Attachments) = attachments(JsonField.of(attachments))

        /**
         * Sets [Builder.attachments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attachments] with a well-typed [Attachments] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun attachments(attachments: JsonField<Attachments>) = apply {
            this.attachments = attachments
        }

        /** `completion_cost` is estimated USD cost for the completion. */
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
         * `completion_cost_details` is the per-category USD breakdown of `completion_cost`.
         * Categories mirror `completion_token_details`. Returned only when the
         * `COMPLETION_COST_DETAILS` field is requested.
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
         * `completion_token_details` is the per-category breakdown of `completion_tokens`. Category
         * names are model-specific (for example `reasoning`, `audio`). Returned only when the
         * `COMPLETION_TOKEN_DETAILS` field is requested.
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

        /** `completion_tokens` is the completion-side token count. */
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

        /** `dotted_order` is the hierarchical ordering key for trace trees. */
        fun dottedOrder(dottedOrder: String) = dottedOrder(JsonField.of(dottedOrder))

        /**
         * Sets [Builder.dottedOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dottedOrder] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dottedOrder(dottedOrder: JsonField<String>) = apply { this.dottedOrder = dottedOrder }

        /**
         * `end_time` is when the run ended (RFC3339 date-time). JSON null if the run has not
         * finished yet.
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

        /** `error` is the error message when `status` indicates failure. */
        fun error(error: String) = error(JsonField.of(error))

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun error(error: JsonField<String>) = apply { this.error = error }

        /** `error_preview` is a truncated plain-text error snippet. */
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

        /** `events` is the ordered list of run events (for example streaming tokens). */
        fun events(events: List<Event>) = events(JsonField.of(events))

        /**
         * Sets [Builder.events] to an arbitrary JSON value.
         *
         * You should usually call [Builder.events] with a well-typed `List<Event>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun events(events: JsonField<List<Event>>) = apply {
            this.events = events.map { it.toMutableList() }
        }

        /**
         * Adds a single [Event] to [events].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEvent(event: Event) = apply {
            events =
                (events ?: JsonField.of(mutableListOf())).also {
                    checkKnown("events", it).add(event)
                }
        }

        /** `extra` is additional runtime JSON attached to the run. */
        fun extra(extra: JsonValue) = apply { this.extra = extra }

        /** `feedback_stats` aggregates feedback scores keyed by feedback key. */
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
         * `first_token_time` is when the first output token was produced (RFC3339 date-time), when
         * recorded for streamed runs.
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

        /** `inputs` is the run input payload (arbitrary JSON object). */
        fun inputs(inputs: JsonValue) = apply { this.inputs = inputs }

        /** `inputs_preview` is a truncated plain-text preview of inputs. */
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

        /** `is_in_dataset` is true when this run is linked to a dataset example. */
        fun isInDataset(isInDataset: Boolean) = isInDataset(JsonField.of(isInDataset))

        /**
         * Sets [Builder.isInDataset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isInDataset] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isInDataset(isInDataset: JsonField<Boolean>) = apply { this.isInDataset = isInDataset }

        /** `is_root` is true when this run has no parent (it is the trace root). */
        fun isRoot(isRoot: Boolean) = isRoot(JsonField.of(isRoot))

        /**
         * Sets [Builder.isRoot] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isRoot] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun isRoot(isRoot: JsonField<Boolean>) = apply { this.isRoot = isRoot }

        /** `latency_seconds` is wall-clock duration from start to end in seconds. */
        fun latencySeconds(latencySeconds: Double) = latencySeconds(JsonField.of(latencySeconds))

        /**
         * Sets [Builder.latencySeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latencySeconds] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun latencySeconds(latencySeconds: JsonField<Double>) = apply {
            this.latencySeconds = latencySeconds
        }

        /**
         * `manifest` is the serialized configuration of the traced component (for example the model
         * parameters, prompt template, or pipeline definition), when recorded.
         */
        fun manifest(manifest: JsonValue) = apply { this.manifest = manifest }

        /** `metadata` is arbitrary user-defined JSON metadata. */
        fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

        /**
         * `name` is a human-readable label for the run (for example the model name, function name,
         * or step name chosen when the run was traced).
         */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** `outputs` is the run output payload (arbitrary JSON object). */
        fun outputs(outputs: JsonValue) = apply { this.outputs = outputs }

        /** `outputs_preview` is a truncated plain-text preview of outputs. */
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
         * `parent_run_ids` lists ancestor run UUIDs from the trace root down to the direct parent.
         */
        fun parentRunIds(parentRunIds: List<String>) = parentRunIds(JsonField.of(parentRunIds))

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

        /**
         * `price_model_id` identifies the pricing model UUID used for cost estimates, when
         * recorded.
         */
        fun priceModelId(priceModelId: String) = priceModelId(JsonField.of(priceModelId))

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

        /** `project_id` is the tracing project UUID this run was logged to. */
        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /**
         * Sets [Builder.projectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

        /** `prompt_cost` is estimated USD cost for the prompt. */
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
         * `prompt_cost_details` is the per-category USD breakdown of `prompt_cost`. Categories
         * mirror `prompt_token_details`. Returned only when the `PROMPT_COST_DETAILS` field is
         * requested.
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
         * `prompt_token_details` is the per-category breakdown of `prompt_tokens`. Category names
         * are model-specific (for example `cache_read`, `cache_write`). Returned only when the
         * `PROMPT_TOKEN_DETAILS` field is requested.
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

        /** `prompt_tokens` is the prompt-side token count. */
        fun promptTokens(promptTokens: Long) = promptTokens(JsonField.of(promptTokens))

        /**
         * Sets [Builder.promptTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promptTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun promptTokens(promptTokens: JsonField<Long>) = apply { this.promptTokens = promptTokens }

        /** `reference_dataset_id` is the dataset UUID for the reference example, if any. */
        fun referenceDatasetId(referenceDatasetId: String) =
            referenceDatasetId(JsonField.of(referenceDatasetId))

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

        /**
         * `reference_example_id` is the dataset example UUID this run was compared against, if any.
         */
        fun referenceExampleId(referenceExampleId: String) =
            referenceExampleId(JsonField.of(referenceExampleId))

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

        /**
         * `run_type` identifies what kind of operation this run represents (for example an LLM
         * call, a tool invocation, or a chain step). See the `RunType` enum for allowed values.
         */
        fun runType(runType: RunType) = runType(JsonField.of(runType))

        /**
         * Sets [Builder.runType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runType] with a well-typed [RunType] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun runType(runType: JsonField<RunType>) = apply { this.runType = runType }

        /**
         * `share_url` is the fully-qualified URL of this run's public view, rooted at the
         * deployment's LangSmith app origin (for example
         * `https://smith.langchain.com/public/4f7a1b2c-8d9e-4a0b-9c1d-2e3f4a5b6c7d/r`). It is
         * returned only when `SHARE_URL` is included in `selects`, and only when the run has been
         * explicitly shared; the URL remains stable until the run is unshared. Anyone with this URL
         * can view the run anonymously, so treat it as a secret and do not log it.
         */
        fun shareUrl(shareUrl: String) = shareUrl(JsonField.of(shareUrl))

        /**
         * Sets [Builder.shareUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shareUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun shareUrl(shareUrl: JsonField<String>) = apply { this.shareUrl = shareUrl }

        /** `start_time` is when the run started (RFC3339 date-time). */
        fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { this.startTime = startTime }

        /** `status` is the completion status of the run. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** `tags` lists user-defined tags on this run. */
        fun tags(tags: List<String>) = tags(JsonField.of(tags))

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

        /**
         * `thread_evaluation_time` is thread-level evaluation timing (RFC3339 date-time), when
         * recorded.
         */
        fun threadEvaluationTime(threadEvaluationTime: OffsetDateTime) =
            threadEvaluationTime(JsonField.of(threadEvaluationTime))

        /**
         * Sets [Builder.threadEvaluationTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threadEvaluationTime] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun threadEvaluationTime(threadEvaluationTime: JsonField<OffsetDateTime>) = apply {
            this.threadEvaluationTime = threadEvaluationTime
        }

        /** `thread_id` is the conversation thread UUID this run belongs to, if any. */
        fun threadId(threadId: String) = threadId(JsonField.of(threadId))

        /**
         * Sets [Builder.threadId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threadId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun threadId(threadId: JsonField<String>) = apply { this.threadId = threadId }

        /** `total_cost` is total estimated USD cost (prompt plus completion). */
        fun totalCost(totalCost: Double) = totalCost(JsonField.of(totalCost))

        /**
         * Sets [Builder.totalCost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalCost] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalCost(totalCost: JsonField<Double>) = apply { this.totalCost = totalCost }

        /** `total_tokens` is prompt plus completion tokens. */
        fun totalTokens(totalTokens: Long) = totalTokens(JsonField.of(totalTokens))

        /**
         * Sets [Builder.totalTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalTokens(totalTokens: JsonField<Long>) = apply { this.totalTokens = totalTokens }

        /** `trace_id` is the root trace UUID; for a root run it matches `id`. */
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
         * Returns an immutable instance of [QueryRunResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): QueryRunResponse =
            QueryRunResponse(
                id,
                appPath,
                attachments,
                completionCost,
                completionCostDetails,
                completionTokenDetails,
                completionTokens,
                dottedOrder,
                endTime,
                error,
                errorPreview,
                (events ?: JsonMissing.of()).map { it.toImmutable() },
                extra,
                feedbackStats,
                firstTokenTime,
                inputs,
                inputsPreview,
                isInDataset,
                isRoot,
                latencySeconds,
                manifest,
                metadata,
                name,
                outputs,
                outputsPreview,
                (parentRunIds ?: JsonMissing.of()).map { it.toImmutable() },
                priceModelId,
                projectId,
                promptCost,
                promptCostDetails,
                promptTokenDetails,
                promptTokens,
                referenceDatasetId,
                referenceExampleId,
                runType,
                shareUrl,
                startTime,
                status,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                threadEvaluationTime,
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
    fun validate(): QueryRunResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        appPath()
        attachments().ifPresent { it.validate() }
        completionCost()
        completionCostDetails().ifPresent { it.validate() }
        completionTokenDetails().ifPresent { it.validate() }
        completionTokens()
        dottedOrder()
        endTime()
        error()
        errorPreview()
        events().ifPresent { it.forEach { it.validate() } }
        feedbackStats().ifPresent { it.validate() }
        firstTokenTime()
        inputsPreview()
        isInDataset()
        isRoot()
        latencySeconds()
        name()
        outputsPreview()
        parentRunIds()
        priceModelId()
        projectId()
        promptCost()
        promptCostDetails().ifPresent { it.validate() }
        promptTokenDetails().ifPresent { it.validate() }
        promptTokens()
        referenceDatasetId()
        referenceExampleId()
        runType().ifPresent { it.validate() }
        shareUrl()
        startTime()
        status().ifPresent { it.validate() }
        tags()
        threadEvaluationTime()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (appPath.asKnown().isPresent) 1 else 0) +
            (attachments.asKnown().getOrNull()?.validity() ?: 0) +
            (if (completionCost.asKnown().isPresent) 1 else 0) +
            (completionCostDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (completionTokenDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (if (completionTokens.asKnown().isPresent) 1 else 0) +
            (if (dottedOrder.asKnown().isPresent) 1 else 0) +
            (if (endTime.asKnown().isPresent) 1 else 0) +
            (if (error.asKnown().isPresent) 1 else 0) +
            (if (errorPreview.asKnown().isPresent) 1 else 0) +
            (events.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (feedbackStats.asKnown().getOrNull()?.validity() ?: 0) +
            (if (firstTokenTime.asKnown().isPresent) 1 else 0) +
            (if (inputsPreview.asKnown().isPresent) 1 else 0) +
            (if (isInDataset.asKnown().isPresent) 1 else 0) +
            (if (isRoot.asKnown().isPresent) 1 else 0) +
            (if (latencySeconds.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (outputsPreview.asKnown().isPresent) 1 else 0) +
            (parentRunIds.asKnown().getOrNull()?.size ?: 0) +
            (if (priceModelId.asKnown().isPresent) 1 else 0) +
            (if (projectId.asKnown().isPresent) 1 else 0) +
            (if (promptCost.asKnown().isPresent) 1 else 0) +
            (promptCostDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (promptTokenDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (if (promptTokens.asKnown().isPresent) 1 else 0) +
            (if (referenceDatasetId.asKnown().isPresent) 1 else 0) +
            (if (referenceExampleId.asKnown().isPresent) 1 else 0) +
            (runType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (shareUrl.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (threadEvaluationTime.asKnown().isPresent) 1 else 0) +
            (if (threadId.asKnown().isPresent) 1 else 0) +
            (if (totalCost.asKnown().isPresent) 1 else 0) +
            (if (totalTokens.asKnown().isPresent) 1 else 0) +
            (if (traceId.asKnown().isPresent) 1 else 0)

    /** `attachments` maps each attachment file name to a pre-signed HTTPS download URL. */
    class Attachments
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

            /** Returns a mutable builder for constructing an instance of [Attachments]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Attachments]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(attachments: Attachments) = apply {
                additionalProperties = attachments.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Attachments].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Attachments = Attachments(additionalProperties.toImmutable())
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
        fun validate(): Attachments = apply {
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

            return other is Attachments && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Attachments{additionalProperties=$additionalProperties}"
    }

    /**
     * `completion_cost_details` is the per-category USD breakdown of `completion_cost`. Categories
     * mirror `completion_token_details`. Returned only when the `COMPLETION_COST_DETAILS` field is
     * requested.
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
     * `completion_token_details` is the per-category breakdown of `completion_tokens`. Category
     * names are model-specific (for example `reasoning`, `audio`). Returned only when the
     * `COMPLETION_TOKEN_DETAILS` field is requested.
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

    class Event
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val kwargs: JsonValue,
        private val name: JsonField<String>,
        private val time: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("kwargs") @ExcludeMissing kwargs: JsonValue = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("time") @ExcludeMissing time: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(kwargs, name, time, mutableMapOf())

        /**
         * `kwargs` is the event payload — an opaque JSON object whose shape depends on `name` and
         * on the emitting SDK. For example LangChain emits `{"token": {...}}` for `new_token`
         * events, tool-call start/end details for tool events, and arbitrary user-defined payloads
         * for custom events. Clients should treat `kwargs` as untyped JSON: do not assume specific
         * keys exist for a given `name`, and tolerate additional unknown keys appearing over time.
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = event.kwargs().convert(MyClass.class);
         * ```
         */
        @JsonProperty("kwargs") @ExcludeMissing fun _kwargs(): JsonValue = kwargs

        /**
         * `name` is the event kind. Common values emitted by the LangChain/LangSmith tracer SDKs
         * include `"start"`, `"end"`, and `"new_token"`, but applications may emit arbitrary
         * strings for their own instrumentation.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * `time` is when the event occurred (RFC3339 date-time with millisecond precision).
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun time(): Optional<OffsetDateTime> = time.getOptional("time")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [time].
         *
         * Unlike [time], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("time") @ExcludeMissing fun _time(): JsonField<OffsetDateTime> = time

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

            /** Returns a mutable builder for constructing an instance of [Event]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Event]. */
        class Builder internal constructor() {

            private var kwargs: JsonValue = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var time: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(event: Event) = apply {
                kwargs = event.kwargs
                name = event.name
                time = event.time
                additionalProperties = event.additionalProperties.toMutableMap()
            }

            /**
             * `kwargs` is the event payload — an opaque JSON object whose shape depends on `name`
             * and on the emitting SDK. For example LangChain emits `{"token": {...}}` for
             * `new_token` events, tool-call start/end details for tool events, and arbitrary
             * user-defined payloads for custom events. Clients should treat `kwargs` as untyped
             * JSON: do not assume specific keys exist for a given `name`, and tolerate additional
             * unknown keys appearing over time.
             */
            fun kwargs(kwargs: JsonValue) = apply { this.kwargs = kwargs }

            /**
             * `name` is the event kind. Common values emitted by the LangChain/LangSmith tracer
             * SDKs include `"start"`, `"end"`, and `"new_token"`, but applications may emit
             * arbitrary strings for their own instrumentation.
             */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** `time` is when the event occurred (RFC3339 date-time with millisecond precision). */
            fun time(time: OffsetDateTime) = time(JsonField.of(time))

            /**
             * Sets [Builder.time] to an arbitrary JSON value.
             *
             * You should usually call [Builder.time] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun time(time: JsonField<OffsetDateTime>) = apply { this.time = time }

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
             * Returns an immutable instance of [Event].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Event = Event(kwargs, name, time, additionalProperties.toMutableMap())
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
        fun validate(): Event = apply {
            if (validated) {
                return@apply
            }

            name()
            time()
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
            (if (name.asKnown().isPresent) 1 else 0) + (if (time.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Event &&
                kwargs == other.kwargs &&
                name == other.name &&
                time == other.time &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(kwargs, name, time, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Event{kwargs=$kwargs, name=$name, time=$time, additionalProperties=$additionalProperties}"
    }

    /** `feedback_stats` aggregates feedback scores keyed by feedback key. */
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
     * `prompt_cost_details` is the per-category USD breakdown of `prompt_cost`. Categories mirror
     * `prompt_token_details`. Returned only when the `PROMPT_COST_DETAILS` field is requested.
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
     * `prompt_token_details` is the per-category breakdown of `prompt_tokens`. Category names are
     * model-specific (for example `cache_read`, `cache_write`). Returned only when the
     * `PROMPT_TOKEN_DETAILS` field is requested.
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

    /**
     * `run_type` identifies what kind of operation this run represents (for example an LLM call, a
     * tool invocation, or a chain step). See the `RunType` enum for allowed values.
     */
    class RunType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val TOOL = of("TOOL")

            @JvmField val CHAIN = of("CHAIN")

            @JvmField val LLM = of("LLM")

            @JvmField val RETRIEVER = of("RETRIEVER")

            @JvmField val EMBEDDING = of("EMBEDDING")

            @JvmField val PROMPT = of("PROMPT")

            @JvmField val PARSER = of("PARSER")

            @JvmStatic fun of(value: String) = RunType(JsonField.of(value))
        }

        /** An enum containing [RunType]'s known values. */
        enum class Known {
            TOOL,
            CHAIN,
            LLM,
            RETRIEVER,
            EMBEDDING,
            PROMPT,
            PARSER,
        }

        /**
         * An enum containing [RunType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RunType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TOOL,
            CHAIN,
            LLM,
            RETRIEVER,
            EMBEDDING,
            PROMPT,
            PARSER,
            /** An enum member indicating that [RunType] was instantiated with an unknown value. */
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
                TOOL -> Value.TOOL
                CHAIN -> Value.CHAIN
                LLM -> Value.LLM
                RETRIEVER -> Value.RETRIEVER
                EMBEDDING -> Value.EMBEDDING
                PROMPT -> Value.PROMPT
                PARSER -> Value.PARSER
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
                TOOL -> Known.TOOL
                CHAIN -> Known.CHAIN
                LLM -> Known.LLM
                RETRIEVER -> Known.RETRIEVER
                EMBEDDING -> Known.EMBEDDING
                PROMPT -> Known.PROMPT
                PARSER -> Known.PARSER
                else -> throw LangChainInvalidDataException("Unknown RunType: $value")
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
        fun validate(): RunType = apply {
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

            return other is RunType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** `status` is the completion status of the run. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val SUCCESS = of("SUCCESS")

            @JvmField val ERROR = of("ERROR")

            @JvmField val PENDING = of("PENDING")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            SUCCESS,
            ERROR,
            PENDING,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SUCCESS,
            ERROR,
            PENDING,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                SUCCESS -> Value.SUCCESS
                ERROR -> Value.ERROR
                PENDING -> Value.PENDING
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
                SUCCESS -> Known.SUCCESS
                ERROR -> Known.ERROR
                PENDING -> Known.PENDING
                else -> throw LangChainInvalidDataException("Unknown Status: $value")
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
        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is QueryRunResponse &&
            id == other.id &&
            appPath == other.appPath &&
            attachments == other.attachments &&
            completionCost == other.completionCost &&
            completionCostDetails == other.completionCostDetails &&
            completionTokenDetails == other.completionTokenDetails &&
            completionTokens == other.completionTokens &&
            dottedOrder == other.dottedOrder &&
            endTime == other.endTime &&
            error == other.error &&
            errorPreview == other.errorPreview &&
            events == other.events &&
            extra == other.extra &&
            feedbackStats == other.feedbackStats &&
            firstTokenTime == other.firstTokenTime &&
            inputs == other.inputs &&
            inputsPreview == other.inputsPreview &&
            isInDataset == other.isInDataset &&
            isRoot == other.isRoot &&
            latencySeconds == other.latencySeconds &&
            manifest == other.manifest &&
            metadata == other.metadata &&
            name == other.name &&
            outputs == other.outputs &&
            outputsPreview == other.outputsPreview &&
            parentRunIds == other.parentRunIds &&
            priceModelId == other.priceModelId &&
            projectId == other.projectId &&
            promptCost == other.promptCost &&
            promptCostDetails == other.promptCostDetails &&
            promptTokenDetails == other.promptTokenDetails &&
            promptTokens == other.promptTokens &&
            referenceDatasetId == other.referenceDatasetId &&
            referenceExampleId == other.referenceExampleId &&
            runType == other.runType &&
            shareUrl == other.shareUrl &&
            startTime == other.startTime &&
            status == other.status &&
            tags == other.tags &&
            threadEvaluationTime == other.threadEvaluationTime &&
            threadId == other.threadId &&
            totalCost == other.totalCost &&
            totalTokens == other.totalTokens &&
            traceId == other.traceId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            appPath,
            attachments,
            completionCost,
            completionCostDetails,
            completionTokenDetails,
            completionTokens,
            dottedOrder,
            endTime,
            error,
            errorPreview,
            events,
            extra,
            feedbackStats,
            firstTokenTime,
            inputs,
            inputsPreview,
            isInDataset,
            isRoot,
            latencySeconds,
            manifest,
            metadata,
            name,
            outputs,
            outputsPreview,
            parentRunIds,
            priceModelId,
            projectId,
            promptCost,
            promptCostDetails,
            promptTokenDetails,
            promptTokens,
            referenceDatasetId,
            referenceExampleId,
            runType,
            shareUrl,
            startTime,
            status,
            tags,
            threadEvaluationTime,
            threadId,
            totalCost,
            totalTokens,
            traceId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "QueryRunResponse{id=$id, appPath=$appPath, attachments=$attachments, completionCost=$completionCost, completionCostDetails=$completionCostDetails, completionTokenDetails=$completionTokenDetails, completionTokens=$completionTokens, dottedOrder=$dottedOrder, endTime=$endTime, error=$error, errorPreview=$errorPreview, events=$events, extra=$extra, feedbackStats=$feedbackStats, firstTokenTime=$firstTokenTime, inputs=$inputs, inputsPreview=$inputsPreview, isInDataset=$isInDataset, isRoot=$isRoot, latencySeconds=$latencySeconds, manifest=$manifest, metadata=$metadata, name=$name, outputs=$outputs, outputsPreview=$outputsPreview, parentRunIds=$parentRunIds, priceModelId=$priceModelId, projectId=$projectId, promptCost=$promptCost, promptCostDetails=$promptCostDetails, promptTokenDetails=$promptTokenDetails, promptTokens=$promptTokens, referenceDatasetId=$referenceDatasetId, referenceExampleId=$referenceExampleId, runType=$runType, shareUrl=$shareUrl, startTime=$startTime, status=$status, tags=$tags, threadEvaluationTime=$threadEvaluationTime, threadId=$threadId, totalCost=$totalCost, totalTokens=$totalTokens, traceId=$traceId, additionalProperties=$additionalProperties}"
}

// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.runs

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
import com.langchain.smith.models.runs.RunTypeEnum
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Example schema with list of runs. */
class ExampleWithRunsCh
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val datasetId: JsonField<String>,
    private val inputs: JsonValue,
    private val name: JsonField<String>,
    private val runs: JsonField<List<Run>>,
    private val attachmentUrls: JsonValue,
    private val createdAt: JsonField<OffsetDateTime>,
    private val metadata: JsonValue,
    private val modifiedAt: JsonField<OffsetDateTime>,
    private val outputs: JsonValue,
    private val sourceRunId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataset_id") @ExcludeMissing datasetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("inputs") @ExcludeMissing inputs: JsonValue = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("runs") @ExcludeMissing runs: JsonField<List<Run>> = JsonMissing.of(),
        @JsonProperty("attachment_urls")
        @ExcludeMissing
        attachmentUrls: JsonValue = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
        @JsonProperty("modified_at")
        @ExcludeMissing
        modifiedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("outputs") @ExcludeMissing outputs: JsonValue = JsonMissing.of(),
        @JsonProperty("source_run_id")
        @ExcludeMissing
        sourceRunId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        datasetId,
        inputs,
        name,
        runs,
        attachmentUrls,
        createdAt,
        metadata,
        modifiedAt,
        outputs,
        sourceRunId,
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
    fun datasetId(): String = datasetId.getRequired("dataset_id")

    @JsonProperty("inputs") @ExcludeMissing fun _inputs(): JsonValue = inputs

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun runs(): List<Run> = runs.getRequired("runs")

    @JsonProperty("attachment_urls")
    @ExcludeMissing
    fun _attachmentUrls(): JsonValue = attachmentUrls

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modifiedAt(): Optional<OffsetDateTime> = modifiedAt.getOptional("modified_at")

    @JsonProperty("outputs") @ExcludeMissing fun _outputs(): JsonValue = outputs

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceRunId(): Optional<String> = sourceRunId.getOptional("source_run_id")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [datasetId].
     *
     * Unlike [datasetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataset_id") @ExcludeMissing fun _datasetId(): JsonField<String> = datasetId

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [runs].
     *
     * Unlike [runs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("runs") @ExcludeMissing fun _runs(): JsonField<List<Run>> = runs

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [modifiedAt].
     *
     * Unlike [modifiedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("modified_at")
    @ExcludeMissing
    fun _modifiedAt(): JsonField<OffsetDateTime> = modifiedAt

    /**
     * Returns the raw JSON value of [sourceRunId].
     *
     * Unlike [sourceRunId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source_run_id")
    @ExcludeMissing
    fun _sourceRunId(): JsonField<String> = sourceRunId

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
         * Returns a mutable builder for constructing an instance of [ExampleWithRunsCh].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .datasetId()
         * .inputs()
         * .name()
         * .runs()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExampleWithRunsCh]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var datasetId: JsonField<String>? = null
        private var inputs: JsonValue? = null
        private var name: JsonField<String>? = null
        private var runs: JsonField<MutableList<Run>>? = null
        private var attachmentUrls: JsonValue = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var metadata: JsonValue = JsonMissing.of()
        private var modifiedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var outputs: JsonValue = JsonMissing.of()
        private var sourceRunId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(exampleWithRunsCh: ExampleWithRunsCh) = apply {
            id = exampleWithRunsCh.id
            datasetId = exampleWithRunsCh.datasetId
            inputs = exampleWithRunsCh.inputs
            name = exampleWithRunsCh.name
            runs = exampleWithRunsCh.runs.map { it.toMutableList() }
            attachmentUrls = exampleWithRunsCh.attachmentUrls
            createdAt = exampleWithRunsCh.createdAt
            metadata = exampleWithRunsCh.metadata
            modifiedAt = exampleWithRunsCh.modifiedAt
            outputs = exampleWithRunsCh.outputs
            sourceRunId = exampleWithRunsCh.sourceRunId
            additionalProperties = exampleWithRunsCh.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun datasetId(datasetId: String) = datasetId(JsonField.of(datasetId))

        /**
         * Sets [Builder.datasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasetId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

        fun inputs(inputs: JsonValue) = apply { this.inputs = inputs }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun runs(runs: List<Run>) = runs(JsonField.of(runs))

        /**
         * Sets [Builder.runs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runs] with a well-typed `List<Run>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun runs(runs: JsonField<List<Run>>) = apply { this.runs = runs.map { it.toMutableList() } }

        /**
         * Adds a single [Run] to [runs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRun(run: Run) = apply {
            runs = (runs ?: JsonField.of(mutableListOf())).also { checkKnown("runs", it).add(run) }
        }

        fun attachmentUrls(attachmentUrls: JsonValue) = apply {
            this.attachmentUrls = attachmentUrls
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

        fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

        fun modifiedAt(modifiedAt: OffsetDateTime?) = modifiedAt(JsonField.ofNullable(modifiedAt))

        /** Alias for calling [Builder.modifiedAt] with `modifiedAt.orElse(null)`. */
        fun modifiedAt(modifiedAt: Optional<OffsetDateTime>) = modifiedAt(modifiedAt.getOrNull())

        /**
         * Sets [Builder.modifiedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modifiedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun modifiedAt(modifiedAt: JsonField<OffsetDateTime>) = apply {
            this.modifiedAt = modifiedAt
        }

        fun outputs(outputs: JsonValue) = apply { this.outputs = outputs }

        fun sourceRunId(sourceRunId: String?) = sourceRunId(JsonField.ofNullable(sourceRunId))

        /** Alias for calling [Builder.sourceRunId] with `sourceRunId.orElse(null)`. */
        fun sourceRunId(sourceRunId: Optional<String>) = sourceRunId(sourceRunId.getOrNull())

        /**
         * Sets [Builder.sourceRunId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceRunId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sourceRunId(sourceRunId: JsonField<String>) = apply { this.sourceRunId = sourceRunId }

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
         * Returns an immutable instance of [ExampleWithRunsCh].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .datasetId()
         * .inputs()
         * .name()
         * .runs()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExampleWithRunsCh =
            ExampleWithRunsCh(
                checkRequired("id", id),
                checkRequired("datasetId", datasetId),
                checkRequired("inputs", inputs),
                checkRequired("name", name),
                checkRequired("runs", runs).map { it.toImmutable() },
                attachmentUrls,
                createdAt,
                metadata,
                modifiedAt,
                outputs,
                sourceRunId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExampleWithRunsCh = apply {
        if (validated) {
            return@apply
        }

        id()
        datasetId()
        name()
        runs().forEach { it.validate() }
        createdAt()
        modifiedAt()
        sourceRunId()
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
            (if (datasetId.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (runs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (modifiedAt.asKnown().isPresent) 1 else 0) +
            (if (sourceRunId.asKnown().isPresent) 1 else 0)

    /** Run schema for comparison view. */
    class Run
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val runType: JsonField<RunTypeEnum>,
        private val sessionId: JsonField<String>,
        private val status: JsonField<String>,
        private val traceId: JsonField<String>,
        private val appPath: JsonField<String>,
        private val completionCost: JsonField<String>,
        private val completionTokens: JsonField<Long>,
        private val dottedOrder: JsonField<String>,
        private val endTime: JsonField<OffsetDateTime>,
        private val error: JsonField<String>,
        private val events: JsonField<List<JsonValue>>,
        private val executionOrder: JsonField<Long>,
        private val extra: JsonValue,
        private val feedbackStats: JsonField<FeedbackStats>,
        private val inputs: JsonValue,
        private val inputsPreview: JsonField<String>,
        private val inputsS3Urls: JsonValue,
        private val manifestId: JsonField<String>,
        private val manifestS3Id: JsonField<String>,
        private val outputs: JsonValue,
        private val outputsPreview: JsonField<String>,
        private val outputsS3Urls: JsonValue,
        private val parentRunId: JsonField<String>,
        private val promptCost: JsonField<String>,
        private val promptTokens: JsonField<Long>,
        private val referenceExampleId: JsonField<String>,
        private val s3Urls: JsonValue,
        private val serialized: JsonValue,
        private val startTime: JsonField<OffsetDateTime>,
        private val tags: JsonField<List<String>>,
        private val totalCost: JsonField<String>,
        private val totalTokens: JsonField<Long>,
        private val traceMaxStartTime: JsonField<OffsetDateTime>,
        private val traceMinStartTime: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("run_type")
            @ExcludeMissing
            runType: JsonField<RunTypeEnum> = JsonMissing.of(),
            @JsonProperty("session_id")
            @ExcludeMissing
            sessionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            @JsonProperty("trace_id") @ExcludeMissing traceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("app_path") @ExcludeMissing appPath: JsonField<String> = JsonMissing.of(),
            @JsonProperty("completion_cost")
            @ExcludeMissing
            completionCost: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("inputs") @ExcludeMissing inputs: JsonValue = JsonMissing.of(),
            @JsonProperty("inputs_preview")
            @ExcludeMissing
            inputsPreview: JsonField<String> = JsonMissing.of(),
            @JsonProperty("inputs_s3_urls")
            @ExcludeMissing
            inputsS3Urls: JsonValue = JsonMissing.of(),
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
            @JsonProperty("prompt_cost")
            @ExcludeMissing
            promptCost: JsonField<String> = JsonMissing.of(),
            @JsonProperty("prompt_tokens")
            @ExcludeMissing
            promptTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("reference_example_id")
            @ExcludeMissing
            referenceExampleId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("s3_urls") @ExcludeMissing s3Urls: JsonValue = JsonMissing.of(),
            @JsonProperty("serialized") @ExcludeMissing serialized: JsonValue = JsonMissing.of(),
            @JsonProperty("start_time")
            @ExcludeMissing
            startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("total_cost")
            @ExcludeMissing
            totalCost: JsonField<String> = JsonMissing.of(),
            @JsonProperty("total_tokens")
            @ExcludeMissing
            totalTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("trace_max_start_time")
            @ExcludeMissing
            traceMaxStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("trace_min_start_time")
            @ExcludeMissing
            traceMinStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            id,
            name,
            runType,
            sessionId,
            status,
            traceId,
            appPath,
            completionCost,
            completionTokens,
            dottedOrder,
            endTime,
            error,
            events,
            executionOrder,
            extra,
            feedbackStats,
            inputs,
            inputsPreview,
            inputsS3Urls,
            manifestId,
            manifestS3Id,
            outputs,
            outputsPreview,
            outputsS3Urls,
            parentRunId,
            promptCost,
            promptTokens,
            referenceExampleId,
            s3Urls,
            serialized,
            startTime,
            tags,
            totalCost,
            totalTokens,
            traceMaxStartTime,
            traceMinStartTime,
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
        fun name(): String = name.getRequired("name")

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
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun appPath(): Optional<String> = appPath.getOptional("app_path")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun completionCost(): Optional<String> = completionCost.getOptional("completion_cost")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun completionTokens(): Optional<Long> = completionTokens.getOptional("completion_tokens")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun dottedOrder(): Optional<String> = dottedOrder.getOptional("dotted_order")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("end_time")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun error(): Optional<String> = error.getOptional("error")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun events(): Optional<List<JsonValue>> = events.getOptional("events")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun executionOrder(): Optional<Long> = executionOrder.getOptional("execution_order")

        @JsonProperty("extra") @ExcludeMissing fun _extra(): JsonValue = extra

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun feedbackStats(): Optional<FeedbackStats> = feedbackStats.getOptional("feedback_stats")

        @JsonProperty("inputs") @ExcludeMissing fun _inputs(): JsonValue = inputs

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun inputsPreview(): Optional<String> = inputsPreview.getOptional("inputs_preview")

        @JsonProperty("inputs_s3_urls")
        @ExcludeMissing
        fun _inputsS3Urls(): JsonValue = inputsS3Urls

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun manifestId(): Optional<String> = manifestId.getOptional("manifest_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun manifestS3Id(): Optional<String> = manifestS3Id.getOptional("manifest_s3_id")

        @JsonProperty("outputs") @ExcludeMissing fun _outputs(): JsonValue = outputs

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun outputsPreview(): Optional<String> = outputsPreview.getOptional("outputs_preview")

        @JsonProperty("outputs_s3_urls")
        @ExcludeMissing
        fun _outputsS3Urls(): JsonValue = outputsS3Urls

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun parentRunId(): Optional<String> = parentRunId.getOptional("parent_run_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun promptCost(): Optional<String> = promptCost.getOptional("prompt_cost")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun promptTokens(): Optional<Long> = promptTokens.getOptional("prompt_tokens")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun referenceExampleId(): Optional<String> =
            referenceExampleId.getOptional("reference_example_id")

        @JsonProperty("s3_urls") @ExcludeMissing fun _s3Urls(): JsonValue = s3Urls

        @JsonProperty("serialized") @ExcludeMissing fun _serialized(): JsonValue = serialized

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun startTime(): Optional<OffsetDateTime> = startTime.getOptional("start_time")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tags(): Optional<List<String>> = tags.getOptional("tags")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun totalCost(): Optional<String> = totalCost.getOptional("total_cost")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun totalTokens(): Optional<Long> = totalTokens.getOptional("total_tokens")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun traceMaxStartTime(): Optional<OffsetDateTime> =
            traceMaxStartTime.getOptional("trace_max_start_time")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun traceMinStartTime(): Optional<OffsetDateTime> =
            traceMinStartTime.getOptional("trace_min_start_time")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Returns the raw JSON value of [appPath].
         *
         * Unlike [appPath], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("app_path") @ExcludeMissing fun _appPath(): JsonField<String> = appPath

        /**
         * Returns the raw JSON value of [completionCost].
         *
         * Unlike [completionCost], this method doesn't throw if the JSON field has an unexpected
         * type.
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
        @JsonProperty("end_time")
        @ExcludeMissing
        fun _endTime(): JsonField<OffsetDateTime> = endTime

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
         * Unlike [executionOrder], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("execution_order")
        @ExcludeMissing
        fun _executionOrder(): JsonField<Long> = executionOrder

        /**
         * Returns the raw JSON value of [feedbackStats].
         *
         * Unlike [feedbackStats], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("feedback_stats")
        @ExcludeMissing
        fun _feedbackStats(): JsonField<FeedbackStats> = feedbackStats

        /**
         * Returns the raw JSON value of [inputsPreview].
         *
         * Unlike [inputsPreview], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("inputs_preview")
        @ExcludeMissing
        fun _inputsPreview(): JsonField<String> = inputsPreview

        /**
         * Returns the raw JSON value of [manifestId].
         *
         * Unlike [manifestId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("manifest_id")
        @ExcludeMissing
        fun _manifestId(): JsonField<String> = manifestId

        /**
         * Returns the raw JSON value of [manifestS3Id].
         *
         * Unlike [manifestS3Id], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("manifest_s3_id")
        @ExcludeMissing
        fun _manifestS3Id(): JsonField<String> = manifestS3Id

        /**
         * Returns the raw JSON value of [outputsPreview].
         *
         * Unlike [outputsPreview], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Returns the raw JSON value of [promptCost].
         *
         * Unlike [promptCost], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prompt_cost")
        @ExcludeMissing
        fun _promptCost(): JsonField<String> = promptCost

        /**
         * Returns the raw JSON value of [promptTokens].
         *
         * Unlike [promptTokens], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("prompt_tokens")
        @ExcludeMissing
        fun _promptTokens(): JsonField<Long> = promptTokens

        /**
         * Returns the raw JSON value of [referenceExampleId].
         *
         * Unlike [referenceExampleId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("reference_example_id")
        @ExcludeMissing
        fun _referenceExampleId(): JsonField<String> = referenceExampleId

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
        @JsonProperty("total_tokens")
        @ExcludeMissing
        fun _totalTokens(): JsonField<Long> = totalTokens

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
             * Returns a mutable builder for constructing an instance of [Run].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .name()
             * .runType()
             * .sessionId()
             * .status()
             * .traceId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Run]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var runType: JsonField<RunTypeEnum>? = null
            private var sessionId: JsonField<String>? = null
            private var status: JsonField<String>? = null
            private var traceId: JsonField<String>? = null
            private var appPath: JsonField<String> = JsonMissing.of()
            private var completionCost: JsonField<String> = JsonMissing.of()
            private var completionTokens: JsonField<Long> = JsonMissing.of()
            private var dottedOrder: JsonField<String> = JsonMissing.of()
            private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var error: JsonField<String> = JsonMissing.of()
            private var events: JsonField<MutableList<JsonValue>>? = null
            private var executionOrder: JsonField<Long> = JsonMissing.of()
            private var extra: JsonValue = JsonMissing.of()
            private var feedbackStats: JsonField<FeedbackStats> = JsonMissing.of()
            private var inputs: JsonValue = JsonMissing.of()
            private var inputsPreview: JsonField<String> = JsonMissing.of()
            private var inputsS3Urls: JsonValue = JsonMissing.of()
            private var manifestId: JsonField<String> = JsonMissing.of()
            private var manifestS3Id: JsonField<String> = JsonMissing.of()
            private var outputs: JsonValue = JsonMissing.of()
            private var outputsPreview: JsonField<String> = JsonMissing.of()
            private var outputsS3Urls: JsonValue = JsonMissing.of()
            private var parentRunId: JsonField<String> = JsonMissing.of()
            private var promptCost: JsonField<String> = JsonMissing.of()
            private var promptTokens: JsonField<Long> = JsonMissing.of()
            private var referenceExampleId: JsonField<String> = JsonMissing.of()
            private var s3Urls: JsonValue = JsonMissing.of()
            private var serialized: JsonValue = JsonMissing.of()
            private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var totalCost: JsonField<String> = JsonMissing.of()
            private var totalTokens: JsonField<Long> = JsonMissing.of()
            private var traceMaxStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var traceMinStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(run: Run) = apply {
                id = run.id
                name = run.name
                runType = run.runType
                sessionId = run.sessionId
                status = run.status
                traceId = run.traceId
                appPath = run.appPath
                completionCost = run.completionCost
                completionTokens = run.completionTokens
                dottedOrder = run.dottedOrder
                endTime = run.endTime
                error = run.error
                events = run.events.map { it.toMutableList() }
                executionOrder = run.executionOrder
                extra = run.extra
                feedbackStats = run.feedbackStats
                inputs = run.inputs
                inputsPreview = run.inputsPreview
                inputsS3Urls = run.inputsS3Urls
                manifestId = run.manifestId
                manifestS3Id = run.manifestS3Id
                outputs = run.outputs
                outputsPreview = run.outputsPreview
                outputsS3Urls = run.outputsS3Urls
                parentRunId = run.parentRunId
                promptCost = run.promptCost
                promptTokens = run.promptTokens
                referenceExampleId = run.referenceExampleId
                s3Urls = run.s3Urls
                serialized = run.serialized
                startTime = run.startTime
                tags = run.tags.map { it.toMutableList() }
                totalCost = run.totalCost
                totalTokens = run.totalTokens
                traceMaxStartTime = run.traceMaxStartTime
                traceMinStartTime = run.traceMinStartTime
                additionalProperties = run.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Enum for run types. */
            fun runType(runType: RunTypeEnum) = runType(JsonField.of(runType))

            /**
             * Sets [Builder.runType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.runType] with a well-typed [RunTypeEnum] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun runType(runType: JsonField<RunTypeEnum>) = apply { this.runType = runType }

            fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

            /**
             * Sets [Builder.sessionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

            fun traceId(traceId: String) = traceId(JsonField.of(traceId))

            /**
             * Sets [Builder.traceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.traceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun traceId(traceId: JsonField<String>) = apply { this.traceId = traceId }

            fun appPath(appPath: String?) = appPath(JsonField.ofNullable(appPath))

            /** Alias for calling [Builder.appPath] with `appPath.orElse(null)`. */
            fun appPath(appPath: Optional<String>) = appPath(appPath.getOrNull())

            /**
             * Sets [Builder.appPath] to an arbitrary JSON value.
             *
             * You should usually call [Builder.appPath] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun appPath(appPath: JsonField<String>) = apply { this.appPath = appPath }

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
            fun completionTokens(completionTokens: Long) =
                completionTokens(completionTokens as Long?)

            /**
             * Alias for calling [Builder.completionTokens] with `completionTokens.orElse(null)`.
             */
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

            fun dottedOrder(dottedOrder: String?) = dottedOrder(JsonField.ofNullable(dottedOrder))

            /** Alias for calling [Builder.dottedOrder] with `dottedOrder.orElse(null)`. */
            fun dottedOrder(dottedOrder: Optional<String>) = dottedOrder(dottedOrder.getOrNull())

            /**
             * Sets [Builder.dottedOrder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dottedOrder] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dottedOrder(dottedOrder: JsonField<String>) = apply {
                this.dottedOrder = dottedOrder
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
             * You should usually call [Builder.error] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.executionOrder] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.feedbackStats] with a well-typed [FeedbackStats]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun feedbackStats(feedbackStats: JsonField<FeedbackStats>) = apply {
                this.feedbackStats = feedbackStats
            }

            fun inputs(inputs: JsonValue) = apply { this.inputs = inputs }

            fun inputsPreview(inputsPreview: String?) =
                inputsPreview(JsonField.ofNullable(inputsPreview))

            /** Alias for calling [Builder.inputsPreview] with `inputsPreview.orElse(null)`. */
            fun inputsPreview(inputsPreview: Optional<String>) =
                inputsPreview(inputsPreview.getOrNull())

            /**
             * Sets [Builder.inputsPreview] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputsPreview] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inputsPreview(inputsPreview: JsonField<String>) = apply {
                this.inputsPreview = inputsPreview
            }

            fun inputsS3Urls(inputsS3Urls: JsonValue) = apply { this.inputsS3Urls = inputsS3Urls }

            fun manifestId(manifestId: String?) = manifestId(JsonField.ofNullable(manifestId))

            /** Alias for calling [Builder.manifestId] with `manifestId.orElse(null)`. */
            fun manifestId(manifestId: Optional<String>) = manifestId(manifestId.getOrNull())

            /**
             * Sets [Builder.manifestId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.manifestId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun manifestId(manifestId: JsonField<String>) = apply { this.manifestId = manifestId }

            fun manifestS3Id(manifestS3Id: String?) =
                manifestS3Id(JsonField.ofNullable(manifestS3Id))

            /** Alias for calling [Builder.manifestS3Id] with `manifestS3Id.orElse(null)`. */
            fun manifestS3Id(manifestS3Id: Optional<String>) =
                manifestS3Id(manifestS3Id.getOrNull())

            /**
             * Sets [Builder.manifestS3Id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.manifestS3Id] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun outputsS3Urls(outputsS3Urls: JsonValue) = apply {
                this.outputsS3Urls = outputsS3Urls
            }

            fun parentRunId(parentRunId: String?) = parentRunId(JsonField.ofNullable(parentRunId))

            /** Alias for calling [Builder.parentRunId] with `parentRunId.orElse(null)`. */
            fun parentRunId(parentRunId: Optional<String>) = parentRunId(parentRunId.getOrNull())

            /**
             * Sets [Builder.parentRunId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parentRunId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parentRunId(parentRunId: JsonField<String>) = apply {
                this.parentRunId = parentRunId
            }

            fun promptCost(promptCost: String?) = promptCost(JsonField.ofNullable(promptCost))

            /** Alias for calling [Builder.promptCost] with `promptCost.orElse(null)`. */
            fun promptCost(promptCost: Optional<String>) = promptCost(promptCost.getOrNull())

            /**
             * Sets [Builder.promptCost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.promptCost] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.promptTokens] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun promptTokens(promptTokens: JsonField<Long>) = apply {
                this.promptTokens = promptTokens
            }

            fun referenceExampleId(referenceExampleId: String?) =
                referenceExampleId(JsonField.ofNullable(referenceExampleId))

            /**
             * Alias for calling [Builder.referenceExampleId] with
             * `referenceExampleId.orElse(null)`.
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

            fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

            /**
             * Sets [Builder.startTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startTime(startTime: JsonField<OffsetDateTime>) = apply {
                this.startTime = startTime
            }

            fun tags(tags: List<String>?) = tags(JsonField.ofNullable(tags))

            /** Alias for calling [Builder.tags] with `tags.orElse(null)`. */
            fun tags(tags: Optional<List<String>>) = tags(tags.getOrNull())

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
            }

            fun totalCost(totalCost: String?) = totalCost(JsonField.ofNullable(totalCost))

            /** Alias for calling [Builder.totalCost] with `totalCost.orElse(null)`. */
            fun totalCost(totalCost: Optional<String>) = totalCost(totalCost.getOrNull())

            /**
             * Sets [Builder.totalCost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalCost] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalTokens(totalTokens: JsonField<Long>) = apply { this.totalTokens = totalTokens }

            fun traceMaxStartTime(traceMaxStartTime: OffsetDateTime?) =
                traceMaxStartTime(JsonField.ofNullable(traceMaxStartTime))

            /**
             * Alias for calling [Builder.traceMaxStartTime] with `traceMaxStartTime.orElse(null)`.
             */
            fun traceMaxStartTime(traceMaxStartTime: Optional<OffsetDateTime>) =
                traceMaxStartTime(traceMaxStartTime.getOrNull())

            /**
             * Sets [Builder.traceMaxStartTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.traceMaxStartTime] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun traceMaxStartTime(traceMaxStartTime: JsonField<OffsetDateTime>) = apply {
                this.traceMaxStartTime = traceMaxStartTime
            }

            fun traceMinStartTime(traceMinStartTime: OffsetDateTime?) =
                traceMinStartTime(JsonField.ofNullable(traceMinStartTime))

            /**
             * Alias for calling [Builder.traceMinStartTime] with `traceMinStartTime.orElse(null)`.
             */
            fun traceMinStartTime(traceMinStartTime: Optional<OffsetDateTime>) =
                traceMinStartTime(traceMinStartTime.getOrNull())

            /**
             * Sets [Builder.traceMinStartTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.traceMinStartTime] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun traceMinStartTime(traceMinStartTime: JsonField<OffsetDateTime>) = apply {
                this.traceMinStartTime = traceMinStartTime
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
             * Returns an immutable instance of [Run].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .name()
             * .runType()
             * .sessionId()
             * .status()
             * .traceId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Run =
                Run(
                    checkRequired("id", id),
                    checkRequired("name", name),
                    checkRequired("runType", runType),
                    checkRequired("sessionId", sessionId),
                    checkRequired("status", status),
                    checkRequired("traceId", traceId),
                    appPath,
                    completionCost,
                    completionTokens,
                    dottedOrder,
                    endTime,
                    error,
                    (events ?: JsonMissing.of()).map { it.toImmutable() },
                    executionOrder,
                    extra,
                    feedbackStats,
                    inputs,
                    inputsPreview,
                    inputsS3Urls,
                    manifestId,
                    manifestS3Id,
                    outputs,
                    outputsPreview,
                    outputsS3Urls,
                    parentRunId,
                    promptCost,
                    promptTokens,
                    referenceExampleId,
                    s3Urls,
                    serialized,
                    startTime,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    totalCost,
                    totalTokens,
                    traceMaxStartTime,
                    traceMinStartTime,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Run = apply {
            if (validated) {
                return@apply
            }

            id()
            name()
            runType().validate()
            sessionId()
            status()
            traceId()
            appPath()
            completionCost()
            completionTokens()
            dottedOrder()
            endTime()
            error()
            events()
            executionOrder()
            feedbackStats().ifPresent { it.validate() }
            inputsPreview()
            manifestId()
            manifestS3Id()
            outputsPreview()
            parentRunId()
            promptCost()
            promptTokens()
            referenceExampleId()
            startTime()
            tags()
            totalCost()
            totalTokens()
            traceMaxStartTime()
            traceMinStartTime()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (runType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (sessionId.asKnown().isPresent) 1 else 0) +
                (if (status.asKnown().isPresent) 1 else 0) +
                (if (traceId.asKnown().isPresent) 1 else 0) +
                (if (appPath.asKnown().isPresent) 1 else 0) +
                (if (completionCost.asKnown().isPresent) 1 else 0) +
                (if (completionTokens.asKnown().isPresent) 1 else 0) +
                (if (dottedOrder.asKnown().isPresent) 1 else 0) +
                (if (endTime.asKnown().isPresent) 1 else 0) +
                (if (error.asKnown().isPresent) 1 else 0) +
                (events.asKnown().getOrNull()?.size ?: 0) +
                (if (executionOrder.asKnown().isPresent) 1 else 0) +
                (feedbackStats.asKnown().getOrNull()?.validity() ?: 0) +
                (if (inputsPreview.asKnown().isPresent) 1 else 0) +
                (if (manifestId.asKnown().isPresent) 1 else 0) +
                (if (manifestS3Id.asKnown().isPresent) 1 else 0) +
                (if (outputsPreview.asKnown().isPresent) 1 else 0) +
                (if (parentRunId.asKnown().isPresent) 1 else 0) +
                (if (promptCost.asKnown().isPresent) 1 else 0) +
                (if (promptTokens.asKnown().isPresent) 1 else 0) +
                (if (referenceExampleId.asKnown().isPresent) 1 else 0) +
                (if (startTime.asKnown().isPresent) 1 else 0) +
                (tags.asKnown().getOrNull()?.size ?: 0) +
                (if (totalCost.asKnown().isPresent) 1 else 0) +
                (if (totalTokens.asKnown().isPresent) 1 else 0) +
                (if (traceMaxStartTime.asKnown().isPresent) 1 else 0) +
                (if (traceMinStartTime.asKnown().isPresent) 1 else 0)

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Run &&
                id == other.id &&
                name == other.name &&
                runType == other.runType &&
                sessionId == other.sessionId &&
                status == other.status &&
                traceId == other.traceId &&
                appPath == other.appPath &&
                completionCost == other.completionCost &&
                completionTokens == other.completionTokens &&
                dottedOrder == other.dottedOrder &&
                endTime == other.endTime &&
                error == other.error &&
                events == other.events &&
                executionOrder == other.executionOrder &&
                extra == other.extra &&
                feedbackStats == other.feedbackStats &&
                inputs == other.inputs &&
                inputsPreview == other.inputsPreview &&
                inputsS3Urls == other.inputsS3Urls &&
                manifestId == other.manifestId &&
                manifestS3Id == other.manifestS3Id &&
                outputs == other.outputs &&
                outputsPreview == other.outputsPreview &&
                outputsS3Urls == other.outputsS3Urls &&
                parentRunId == other.parentRunId &&
                promptCost == other.promptCost &&
                promptTokens == other.promptTokens &&
                referenceExampleId == other.referenceExampleId &&
                s3Urls == other.s3Urls &&
                serialized == other.serialized &&
                startTime == other.startTime &&
                tags == other.tags &&
                totalCost == other.totalCost &&
                totalTokens == other.totalTokens &&
                traceMaxStartTime == other.traceMaxStartTime &&
                traceMinStartTime == other.traceMinStartTime &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                name,
                runType,
                sessionId,
                status,
                traceId,
                appPath,
                completionCost,
                completionTokens,
                dottedOrder,
                endTime,
                error,
                events,
                executionOrder,
                extra,
                feedbackStats,
                inputs,
                inputsPreview,
                inputsS3Urls,
                manifestId,
                manifestS3Id,
                outputs,
                outputsPreview,
                outputsS3Urls,
                parentRunId,
                promptCost,
                promptTokens,
                referenceExampleId,
                s3Urls,
                serialized,
                startTime,
                tags,
                totalCost,
                totalTokens,
                traceMaxStartTime,
                traceMinStartTime,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Run{id=$id, name=$name, runType=$runType, sessionId=$sessionId, status=$status, traceId=$traceId, appPath=$appPath, completionCost=$completionCost, completionTokens=$completionTokens, dottedOrder=$dottedOrder, endTime=$endTime, error=$error, events=$events, executionOrder=$executionOrder, extra=$extra, feedbackStats=$feedbackStats, inputs=$inputs, inputsPreview=$inputsPreview, inputsS3Urls=$inputsS3Urls, manifestId=$manifestId, manifestS3Id=$manifestS3Id, outputs=$outputs, outputsPreview=$outputsPreview, outputsS3Urls=$outputsS3Urls, parentRunId=$parentRunId, promptCost=$promptCost, promptTokens=$promptTokens, referenceExampleId=$referenceExampleId, s3Urls=$s3Urls, serialized=$serialized, startTime=$startTime, tags=$tags, totalCost=$totalCost, totalTokens=$totalTokens, traceMaxStartTime=$traceMaxStartTime, traceMinStartTime=$traceMinStartTime, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExampleWithRunsCh &&
            id == other.id &&
            datasetId == other.datasetId &&
            inputs == other.inputs &&
            name == other.name &&
            runs == other.runs &&
            attachmentUrls == other.attachmentUrls &&
            createdAt == other.createdAt &&
            metadata == other.metadata &&
            modifiedAt == other.modifiedAt &&
            outputs == other.outputs &&
            sourceRunId == other.sourceRunId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            datasetId,
            inputs,
            name,
            runs,
            attachmentUrls,
            createdAt,
            metadata,
            modifiedAt,
            outputs,
            sourceRunId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExampleWithRunsCh{id=$id, datasetId=$datasetId, inputs=$inputs, name=$name, runs=$runs, attachmentUrls=$attachmentUrls, createdAt=$createdAt, metadata=$metadata, modifiedAt=$modifiedAt, outputs=$outputs, sourceRunId=$sourceRunId, additionalProperties=$additionalProperties}"
}

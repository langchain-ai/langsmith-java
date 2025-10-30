// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.Params
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangsmithInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Upload an experiment that has already been run. */
class DatasetUploadExperimentParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun experimentEndTime(): OffsetDateTime = body.experimentEndTime()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun experimentName(): String = body.experimentName()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun experimentStartTime(): OffsetDateTime = body.experimentStartTime()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun results(): List<Result> = body.results()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun datasetDescription(): Optional<String> = body.datasetDescription()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun datasetId(): Optional<String> = body.datasetId()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun datasetName(): Optional<String> = body.datasetName()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun experimentDescription(): Optional<String> = body.experimentDescription()

    fun _experimentMetadata(): JsonValue = body._experimentMetadata()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun summaryExperimentScores(): Optional<List<FeedbackCreateCoreSchema>> =
        body.summaryExperimentScores()

    /**
     * Returns the raw JSON value of [experimentEndTime].
     *
     * Unlike [experimentEndTime], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _experimentEndTime(): JsonField<OffsetDateTime> = body._experimentEndTime()

    /**
     * Returns the raw JSON value of [experimentName].
     *
     * Unlike [experimentName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _experimentName(): JsonField<String> = body._experimentName()

    /**
     * Returns the raw JSON value of [experimentStartTime].
     *
     * Unlike [experimentStartTime], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _experimentStartTime(): JsonField<OffsetDateTime> = body._experimentStartTime()

    /**
     * Returns the raw JSON value of [results].
     *
     * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _results(): JsonField<List<Result>> = body._results()

    /**
     * Returns the raw JSON value of [datasetDescription].
     *
     * Unlike [datasetDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _datasetDescription(): JsonField<String> = body._datasetDescription()

    /**
     * Returns the raw JSON value of [datasetId].
     *
     * Unlike [datasetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _datasetId(): JsonField<String> = body._datasetId()

    /**
     * Returns the raw JSON value of [datasetName].
     *
     * Unlike [datasetName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _datasetName(): JsonField<String> = body._datasetName()

    /**
     * Returns the raw JSON value of [experimentDescription].
     *
     * Unlike [experimentDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _experimentDescription(): JsonField<String> = body._experimentDescription()

    /**
     * Returns the raw JSON value of [summaryExperimentScores].
     *
     * Unlike [summaryExperimentScores], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _summaryExperimentScores(): JsonField<List<FeedbackCreateCoreSchema>> =
        body._summaryExperimentScores()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DatasetUploadExperimentParams].
         *
         * The following fields are required:
         * ```java
         * .experimentEndTime()
         * .experimentName()
         * .experimentStartTime()
         * .results()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DatasetUploadExperimentParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(datasetUploadExperimentParams: DatasetUploadExperimentParams) = apply {
            body = datasetUploadExperimentParams.body.toBuilder()
            additionalHeaders = datasetUploadExperimentParams.additionalHeaders.toBuilder()
            additionalQueryParams = datasetUploadExperimentParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [experimentEndTime]
         * - [experimentName]
         * - [experimentStartTime]
         * - [results]
         * - [datasetDescription]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun experimentEndTime(experimentEndTime: OffsetDateTime) = apply {
            body.experimentEndTime(experimentEndTime)
        }

        /**
         * Sets [Builder.experimentEndTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.experimentEndTime] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun experimentEndTime(experimentEndTime: JsonField<OffsetDateTime>) = apply {
            body.experimentEndTime(experimentEndTime)
        }

        fun experimentName(experimentName: String) = apply { body.experimentName(experimentName) }

        /**
         * Sets [Builder.experimentName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.experimentName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun experimentName(experimentName: JsonField<String>) = apply {
            body.experimentName(experimentName)
        }

        fun experimentStartTime(experimentStartTime: OffsetDateTime) = apply {
            body.experimentStartTime(experimentStartTime)
        }

        /**
         * Sets [Builder.experimentStartTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.experimentStartTime] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun experimentStartTime(experimentStartTime: JsonField<OffsetDateTime>) = apply {
            body.experimentStartTime(experimentStartTime)
        }

        fun results(results: List<Result>) = apply { body.results(results) }

        /**
         * Sets [Builder.results] to an arbitrary JSON value.
         *
         * You should usually call [Builder.results] with a well-typed `List<Result>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun results(results: JsonField<List<Result>>) = apply { body.results(results) }

        /**
         * Adds a single [Result] to [results].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResult(result: Result) = apply { body.addResult(result) }

        fun datasetDescription(datasetDescription: String?) = apply {
            body.datasetDescription(datasetDescription)
        }

        /**
         * Alias for calling [Builder.datasetDescription] with `datasetDescription.orElse(null)`.
         */
        fun datasetDescription(datasetDescription: Optional<String>) =
            datasetDescription(datasetDescription.getOrNull())

        /**
         * Sets [Builder.datasetDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasetDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun datasetDescription(datasetDescription: JsonField<String>) = apply {
            body.datasetDescription(datasetDescription)
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

        fun datasetName(datasetName: String?) = apply { body.datasetName(datasetName) }

        /** Alias for calling [Builder.datasetName] with `datasetName.orElse(null)`. */
        fun datasetName(datasetName: Optional<String>) = datasetName(datasetName.getOrNull())

        /**
         * Sets [Builder.datasetName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasetName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun datasetName(datasetName: JsonField<String>) = apply { body.datasetName(datasetName) }

        fun experimentDescription(experimentDescription: String?) = apply {
            body.experimentDescription(experimentDescription)
        }

        /**
         * Alias for calling [Builder.experimentDescription] with
         * `experimentDescription.orElse(null)`.
         */
        fun experimentDescription(experimentDescription: Optional<String>) =
            experimentDescription(experimentDescription.getOrNull())

        /**
         * Sets [Builder.experimentDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.experimentDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun experimentDescription(experimentDescription: JsonField<String>) = apply {
            body.experimentDescription(experimentDescription)
        }

        fun experimentMetadata(experimentMetadata: JsonValue) = apply {
            body.experimentMetadata(experimentMetadata)
        }

        fun summaryExperimentScores(summaryExperimentScores: List<FeedbackCreateCoreSchema>?) =
            apply {
                body.summaryExperimentScores(summaryExperimentScores)
            }

        /**
         * Alias for calling [Builder.summaryExperimentScores] with
         * `summaryExperimentScores.orElse(null)`.
         */
        fun summaryExperimentScores(
            summaryExperimentScores: Optional<List<FeedbackCreateCoreSchema>>
        ) = summaryExperimentScores(summaryExperimentScores.getOrNull())

        /**
         * Sets [Builder.summaryExperimentScores] to an arbitrary JSON value.
         *
         * You should usually call [Builder.summaryExperimentScores] with a well-typed
         * `List<FeedbackCreateCoreSchema>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun summaryExperimentScores(
            summaryExperimentScores: JsonField<List<FeedbackCreateCoreSchema>>
        ) = apply { body.summaryExperimentScores(summaryExperimentScores) }

        /**
         * Adds a single [FeedbackCreateCoreSchema] to [summaryExperimentScores].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSummaryExperimentScore(summaryExperimentScore: FeedbackCreateCoreSchema) = apply {
            body.addSummaryExperimentScore(summaryExperimentScore)
        }

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
         * Returns an immutable instance of [DatasetUploadExperimentParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .experimentEndTime()
         * .experimentName()
         * .experimentStartTime()
         * .results()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DatasetUploadExperimentParams =
            DatasetUploadExperimentParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Class for uploading the results of an already-run experiment. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val experimentEndTime: JsonField<OffsetDateTime>,
        private val experimentName: JsonField<String>,
        private val experimentStartTime: JsonField<OffsetDateTime>,
        private val results: JsonField<List<Result>>,
        private val datasetDescription: JsonField<String>,
        private val datasetId: JsonField<String>,
        private val datasetName: JsonField<String>,
        private val experimentDescription: JsonField<String>,
        private val experimentMetadata: JsonValue,
        private val summaryExperimentScores: JsonField<List<FeedbackCreateCoreSchema>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("experiment_end_time")
            @ExcludeMissing
            experimentEndTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("experiment_name")
            @ExcludeMissing
            experimentName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("experiment_start_time")
            @ExcludeMissing
            experimentStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("results")
            @ExcludeMissing
            results: JsonField<List<Result>> = JsonMissing.of(),
            @JsonProperty("dataset_description")
            @ExcludeMissing
            datasetDescription: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dataset_id")
            @ExcludeMissing
            datasetId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dataset_name")
            @ExcludeMissing
            datasetName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("experiment_description")
            @ExcludeMissing
            experimentDescription: JsonField<String> = JsonMissing.of(),
            @JsonProperty("experiment_metadata")
            @ExcludeMissing
            experimentMetadata: JsonValue = JsonMissing.of(),
            @JsonProperty("summary_experiment_scores")
            @ExcludeMissing
            summaryExperimentScores: JsonField<List<FeedbackCreateCoreSchema>> = JsonMissing.of(),
        ) : this(
            experimentEndTime,
            experimentName,
            experimentStartTime,
            results,
            datasetDescription,
            datasetId,
            datasetName,
            experimentDescription,
            experimentMetadata,
            summaryExperimentScores,
            mutableMapOf(),
        )

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun experimentEndTime(): OffsetDateTime =
            experimentEndTime.getRequired("experiment_end_time")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun experimentName(): String = experimentName.getRequired("experiment_name")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun experimentStartTime(): OffsetDateTime =
            experimentStartTime.getRequired("experiment_start_time")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun results(): List<Result> = results.getRequired("results")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun datasetDescription(): Optional<String> =
            datasetDescription.getOptional("dataset_description")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun datasetId(): Optional<String> = datasetId.getOptional("dataset_id")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun datasetName(): Optional<String> = datasetName.getOptional("dataset_name")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun experimentDescription(): Optional<String> =
            experimentDescription.getOptional("experiment_description")

        @JsonProperty("experiment_metadata")
        @ExcludeMissing
        fun _experimentMetadata(): JsonValue = experimentMetadata

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun summaryExperimentScores(): Optional<List<FeedbackCreateCoreSchema>> =
            summaryExperimentScores.getOptional("summary_experiment_scores")

        /**
         * Returns the raw JSON value of [experimentEndTime].
         *
         * Unlike [experimentEndTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("experiment_end_time")
        @ExcludeMissing
        fun _experimentEndTime(): JsonField<OffsetDateTime> = experimentEndTime

        /**
         * Returns the raw JSON value of [experimentName].
         *
         * Unlike [experimentName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("experiment_name")
        @ExcludeMissing
        fun _experimentName(): JsonField<String> = experimentName

        /**
         * Returns the raw JSON value of [experimentStartTime].
         *
         * Unlike [experimentStartTime], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("experiment_start_time")
        @ExcludeMissing
        fun _experimentStartTime(): JsonField<OffsetDateTime> = experimentStartTime

        /**
         * Returns the raw JSON value of [results].
         *
         * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("results") @ExcludeMissing fun _results(): JsonField<List<Result>> = results

        /**
         * Returns the raw JSON value of [datasetDescription].
         *
         * Unlike [datasetDescription], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("dataset_description")
        @ExcludeMissing
        fun _datasetDescription(): JsonField<String> = datasetDescription

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
         * Returns the raw JSON value of [experimentDescription].
         *
         * Unlike [experimentDescription], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("experiment_description")
        @ExcludeMissing
        fun _experimentDescription(): JsonField<String> = experimentDescription

        /**
         * Returns the raw JSON value of [summaryExperimentScores].
         *
         * Unlike [summaryExperimentScores], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("summary_experiment_scores")
        @ExcludeMissing
        fun _summaryExperimentScores(): JsonField<List<FeedbackCreateCoreSchema>> =
            summaryExperimentScores

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
             * .experimentEndTime()
             * .experimentName()
             * .experimentStartTime()
             * .results()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var experimentEndTime: JsonField<OffsetDateTime>? = null
            private var experimentName: JsonField<String>? = null
            private var experimentStartTime: JsonField<OffsetDateTime>? = null
            private var results: JsonField<MutableList<Result>>? = null
            private var datasetDescription: JsonField<String> = JsonMissing.of()
            private var datasetId: JsonField<String> = JsonMissing.of()
            private var datasetName: JsonField<String> = JsonMissing.of()
            private var experimentDescription: JsonField<String> = JsonMissing.of()
            private var experimentMetadata: JsonValue = JsonMissing.of()
            private var summaryExperimentScores: JsonField<MutableList<FeedbackCreateCoreSchema>>? =
                null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                experimentEndTime = body.experimentEndTime
                experimentName = body.experimentName
                experimentStartTime = body.experimentStartTime
                results = body.results.map { it.toMutableList() }
                datasetDescription = body.datasetDescription
                datasetId = body.datasetId
                datasetName = body.datasetName
                experimentDescription = body.experimentDescription
                experimentMetadata = body.experimentMetadata
                summaryExperimentScores = body.summaryExperimentScores.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun experimentEndTime(experimentEndTime: OffsetDateTime) =
                experimentEndTime(JsonField.of(experimentEndTime))

            /**
             * Sets [Builder.experimentEndTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.experimentEndTime] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun experimentEndTime(experimentEndTime: JsonField<OffsetDateTime>) = apply {
                this.experimentEndTime = experimentEndTime
            }

            fun experimentName(experimentName: String) =
                experimentName(JsonField.of(experimentName))

            /**
             * Sets [Builder.experimentName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.experimentName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun experimentName(experimentName: JsonField<String>) = apply {
                this.experimentName = experimentName
            }

            fun experimentStartTime(experimentStartTime: OffsetDateTime) =
                experimentStartTime(JsonField.of(experimentStartTime))

            /**
             * Sets [Builder.experimentStartTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.experimentStartTime] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun experimentStartTime(experimentStartTime: JsonField<OffsetDateTime>) = apply {
                this.experimentStartTime = experimentStartTime
            }

            fun results(results: List<Result>) = results(JsonField.of(results))

            /**
             * Sets [Builder.results] to an arbitrary JSON value.
             *
             * You should usually call [Builder.results] with a well-typed `List<Result>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun results(results: JsonField<List<Result>>) = apply {
                this.results = results.map { it.toMutableList() }
            }

            /**
             * Adds a single [Result] to [results].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addResult(result: Result) = apply {
                results =
                    (results ?: JsonField.of(mutableListOf())).also {
                        checkKnown("results", it).add(result)
                    }
            }

            fun datasetDescription(datasetDescription: String?) =
                datasetDescription(JsonField.ofNullable(datasetDescription))

            /**
             * Alias for calling [Builder.datasetDescription] with
             * `datasetDescription.orElse(null)`.
             */
            fun datasetDescription(datasetDescription: Optional<String>) =
                datasetDescription(datasetDescription.getOrNull())

            /**
             * Sets [Builder.datasetDescription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.datasetDescription] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun datasetDescription(datasetDescription: JsonField<String>) = apply {
                this.datasetDescription = datasetDescription
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

            fun datasetName(datasetName: String?) = datasetName(JsonField.ofNullable(datasetName))

            /** Alias for calling [Builder.datasetName] with `datasetName.orElse(null)`. */
            fun datasetName(datasetName: Optional<String>) = datasetName(datasetName.getOrNull())

            /**
             * Sets [Builder.datasetName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.datasetName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun datasetName(datasetName: JsonField<String>) = apply {
                this.datasetName = datasetName
            }

            fun experimentDescription(experimentDescription: String?) =
                experimentDescription(JsonField.ofNullable(experimentDescription))

            /**
             * Alias for calling [Builder.experimentDescription] with
             * `experimentDescription.orElse(null)`.
             */
            fun experimentDescription(experimentDescription: Optional<String>) =
                experimentDescription(experimentDescription.getOrNull())

            /**
             * Sets [Builder.experimentDescription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.experimentDescription] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun experimentDescription(experimentDescription: JsonField<String>) = apply {
                this.experimentDescription = experimentDescription
            }

            fun experimentMetadata(experimentMetadata: JsonValue) = apply {
                this.experimentMetadata = experimentMetadata
            }

            fun summaryExperimentScores(summaryExperimentScores: List<FeedbackCreateCoreSchema>?) =
                summaryExperimentScores(JsonField.ofNullable(summaryExperimentScores))

            /**
             * Alias for calling [Builder.summaryExperimentScores] with
             * `summaryExperimentScores.orElse(null)`.
             */
            fun summaryExperimentScores(
                summaryExperimentScores: Optional<List<FeedbackCreateCoreSchema>>
            ) = summaryExperimentScores(summaryExperimentScores.getOrNull())

            /**
             * Sets [Builder.summaryExperimentScores] to an arbitrary JSON value.
             *
             * You should usually call [Builder.summaryExperimentScores] with a well-typed
             * `List<FeedbackCreateCoreSchema>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun summaryExperimentScores(
                summaryExperimentScores: JsonField<List<FeedbackCreateCoreSchema>>
            ) = apply {
                this.summaryExperimentScores = summaryExperimentScores.map { it.toMutableList() }
            }

            /**
             * Adds a single [FeedbackCreateCoreSchema] to [summaryExperimentScores].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSummaryExperimentScore(summaryExperimentScore: FeedbackCreateCoreSchema) =
                apply {
                    summaryExperimentScores =
                        (summaryExperimentScores ?: JsonField.of(mutableListOf())).also {
                            checkKnown("summaryExperimentScores", it).add(summaryExperimentScore)
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
             * .experimentEndTime()
             * .experimentName()
             * .experimentStartTime()
             * .results()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("experimentEndTime", experimentEndTime),
                    checkRequired("experimentName", experimentName),
                    checkRequired("experimentStartTime", experimentStartTime),
                    checkRequired("results", results).map { it.toImmutable() },
                    datasetDescription,
                    datasetId,
                    datasetName,
                    experimentDescription,
                    experimentMetadata,
                    (summaryExperimentScores ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            experimentEndTime()
            experimentName()
            experimentStartTime()
            results().forEach { it.validate() }
            datasetDescription()
            datasetId()
            datasetName()
            experimentDescription()
            summaryExperimentScores().ifPresent { it.forEach { it.validate() } }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangsmithInvalidDataException) {
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
            (if (experimentEndTime.asKnown().isPresent) 1 else 0) +
                (if (experimentName.asKnown().isPresent) 1 else 0) +
                (if (experimentStartTime.asKnown().isPresent) 1 else 0) +
                (results.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (datasetDescription.asKnown().isPresent) 1 else 0) +
                (if (datasetId.asKnown().isPresent) 1 else 0) +
                (if (datasetName.asKnown().isPresent) 1 else 0) +
                (if (experimentDescription.asKnown().isPresent) 1 else 0) +
                (summaryExperimentScores.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                experimentEndTime == other.experimentEndTime &&
                experimentName == other.experimentName &&
                experimentStartTime == other.experimentStartTime &&
                results == other.results &&
                datasetDescription == other.datasetDescription &&
                datasetId == other.datasetId &&
                datasetName == other.datasetName &&
                experimentDescription == other.experimentDescription &&
                experimentMetadata == other.experimentMetadata &&
                summaryExperimentScores == other.summaryExperimentScores &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                experimentEndTime,
                experimentName,
                experimentStartTime,
                results,
                datasetDescription,
                datasetId,
                datasetName,
                experimentDescription,
                experimentMetadata,
                summaryExperimentScores,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{experimentEndTime=$experimentEndTime, experimentName=$experimentName, experimentStartTime=$experimentStartTime, results=$results, datasetDescription=$datasetDescription, datasetId=$datasetId, datasetName=$datasetName, experimentDescription=$experimentDescription, experimentMetadata=$experimentMetadata, summaryExperimentScores=$summaryExperimentScores, additionalProperties=$additionalProperties}"
    }

    /** Class for a single row in the uploaded experiment results. */
    class Result
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val endTime: JsonField<OffsetDateTime>,
        private val inputs: JsonValue,
        private val startTime: JsonField<OffsetDateTime>,
        private val actualOutputs: JsonValue,
        private val error: JsonField<String>,
        private val evaluationScores: JsonField<List<FeedbackCreateCoreSchema>>,
        private val expectedOutputs: JsonValue,
        private val rowId: JsonField<String>,
        private val runMetadata: JsonValue,
        private val runName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("end_time")
            @ExcludeMissing
            endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("inputs") @ExcludeMissing inputs: JsonValue = JsonMissing.of(),
            @JsonProperty("start_time")
            @ExcludeMissing
            startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("actual_outputs")
            @ExcludeMissing
            actualOutputs: JsonValue = JsonMissing.of(),
            @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
            @JsonProperty("evaluation_scores")
            @ExcludeMissing
            evaluationScores: JsonField<List<FeedbackCreateCoreSchema>> = JsonMissing.of(),
            @JsonProperty("expected_outputs")
            @ExcludeMissing
            expectedOutputs: JsonValue = JsonMissing.of(),
            @JsonProperty("row_id") @ExcludeMissing rowId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("run_metadata") @ExcludeMissing runMetadata: JsonValue = JsonMissing.of(),
            @JsonProperty("run_name") @ExcludeMissing runName: JsonField<String> = JsonMissing.of(),
        ) : this(
            endTime,
            inputs,
            startTime,
            actualOutputs,
            error,
            evaluationScores,
            expectedOutputs,
            rowId,
            runMetadata,
            runName,
            mutableMapOf(),
        )

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun endTime(): OffsetDateTime = endTime.getRequired("end_time")

        @JsonProperty("inputs") @ExcludeMissing fun _inputs(): JsonValue = inputs

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startTime(): OffsetDateTime = startTime.getRequired("start_time")

        @JsonProperty("actual_outputs")
        @ExcludeMissing
        fun _actualOutputs(): JsonValue = actualOutputs

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun error(): Optional<String> = error.getOptional("error")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun evaluationScores(): Optional<List<FeedbackCreateCoreSchema>> =
            evaluationScores.getOptional("evaluation_scores")

        @JsonProperty("expected_outputs")
        @ExcludeMissing
        fun _expectedOutputs(): JsonValue = expectedOutputs

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rowId(): Optional<String> = rowId.getOptional("row_id")

        @JsonProperty("run_metadata") @ExcludeMissing fun _runMetadata(): JsonValue = runMetadata

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun runName(): Optional<String> = runName.getOptional("run_name")

        /**
         * Returns the raw JSON value of [endTime].
         *
         * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_time")
        @ExcludeMissing
        fun _endTime(): JsonField<OffsetDateTime> = endTime

        /**
         * Returns the raw JSON value of [startTime].
         *
         * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_time")
        @ExcludeMissing
        fun _startTime(): JsonField<OffsetDateTime> = startTime

        /**
         * Returns the raw JSON value of [error].
         *
         * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

        /**
         * Returns the raw JSON value of [evaluationScores].
         *
         * Unlike [evaluationScores], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("evaluation_scores")
        @ExcludeMissing
        fun _evaluationScores(): JsonField<List<FeedbackCreateCoreSchema>> = evaluationScores

        /**
         * Returns the raw JSON value of [rowId].
         *
         * Unlike [rowId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("row_id") @ExcludeMissing fun _rowId(): JsonField<String> = rowId

        /**
         * Returns the raw JSON value of [runName].
         *
         * Unlike [runName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("run_name") @ExcludeMissing fun _runName(): JsonField<String> = runName

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
             * Returns a mutable builder for constructing an instance of [Result].
             *
             * The following fields are required:
             * ```java
             * .endTime()
             * .inputs()
             * .startTime()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Result]. */
        class Builder internal constructor() {

            private var endTime: JsonField<OffsetDateTime>? = null
            private var inputs: JsonValue? = null
            private var startTime: JsonField<OffsetDateTime>? = null
            private var actualOutputs: JsonValue = JsonMissing.of()
            private var error: JsonField<String> = JsonMissing.of()
            private var evaluationScores: JsonField<MutableList<FeedbackCreateCoreSchema>>? = null
            private var expectedOutputs: JsonValue = JsonMissing.of()
            private var rowId: JsonField<String> = JsonMissing.of()
            private var runMetadata: JsonValue = JsonMissing.of()
            private var runName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(result: Result) = apply {
                endTime = result.endTime
                inputs = result.inputs
                startTime = result.startTime
                actualOutputs = result.actualOutputs
                error = result.error
                evaluationScores = result.evaluationScores.map { it.toMutableList() }
                expectedOutputs = result.expectedOutputs
                rowId = result.rowId
                runMetadata = result.runMetadata
                runName = result.runName
                additionalProperties = result.additionalProperties.toMutableMap()
            }

            fun endTime(endTime: OffsetDateTime) = endTime(JsonField.of(endTime))

            /**
             * Sets [Builder.endTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endTime(endTime: JsonField<OffsetDateTime>) = apply { this.endTime = endTime }

            fun inputs(inputs: JsonValue) = apply { this.inputs = inputs }

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

            fun actualOutputs(actualOutputs: JsonValue) = apply {
                this.actualOutputs = actualOutputs
            }

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

            fun evaluationScores(evaluationScores: List<FeedbackCreateCoreSchema>?) =
                evaluationScores(JsonField.ofNullable(evaluationScores))

            /**
             * Alias for calling [Builder.evaluationScores] with `evaluationScores.orElse(null)`.
             */
            fun evaluationScores(evaluationScores: Optional<List<FeedbackCreateCoreSchema>>) =
                evaluationScores(evaluationScores.getOrNull())

            /**
             * Sets [Builder.evaluationScores] to an arbitrary JSON value.
             *
             * You should usually call [Builder.evaluationScores] with a well-typed
             * `List<FeedbackCreateCoreSchema>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun evaluationScores(evaluationScores: JsonField<List<FeedbackCreateCoreSchema>>) =
                apply {
                    this.evaluationScores = evaluationScores.map { it.toMutableList() }
                }

            /**
             * Adds a single [FeedbackCreateCoreSchema] to [evaluationScores].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEvaluationScore(evaluationScore: FeedbackCreateCoreSchema) = apply {
                evaluationScores =
                    (evaluationScores ?: JsonField.of(mutableListOf())).also {
                        checkKnown("evaluationScores", it).add(evaluationScore)
                    }
            }

            fun expectedOutputs(expectedOutputs: JsonValue) = apply {
                this.expectedOutputs = expectedOutputs
            }

            fun rowId(rowId: String?) = rowId(JsonField.ofNullable(rowId))

            /** Alias for calling [Builder.rowId] with `rowId.orElse(null)`. */
            fun rowId(rowId: Optional<String>) = rowId(rowId.getOrNull())

            /**
             * Sets [Builder.rowId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rowId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rowId(rowId: JsonField<String>) = apply { this.rowId = rowId }

            fun runMetadata(runMetadata: JsonValue) = apply { this.runMetadata = runMetadata }

            fun runName(runName: String?) = runName(JsonField.ofNullable(runName))

            /** Alias for calling [Builder.runName] with `runName.orElse(null)`. */
            fun runName(runName: Optional<String>) = runName(runName.getOrNull())

            /**
             * Sets [Builder.runName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.runName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun runName(runName: JsonField<String>) = apply { this.runName = runName }

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
             * Returns an immutable instance of [Result].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .endTime()
             * .inputs()
             * .startTime()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Result =
                Result(
                    checkRequired("endTime", endTime),
                    checkRequired("inputs", inputs),
                    checkRequired("startTime", startTime),
                    actualOutputs,
                    error,
                    (evaluationScores ?: JsonMissing.of()).map { it.toImmutable() },
                    expectedOutputs,
                    rowId,
                    runMetadata,
                    runName,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Result = apply {
            if (validated) {
                return@apply
            }

            endTime()
            startTime()
            error()
            evaluationScores().ifPresent { it.forEach { it.validate() } }
            rowId()
            runName()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangsmithInvalidDataException) {
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
            (if (endTime.asKnown().isPresent) 1 else 0) +
                (if (startTime.asKnown().isPresent) 1 else 0) +
                (if (error.asKnown().isPresent) 1 else 0) +
                (evaluationScores.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (rowId.asKnown().isPresent) 1 else 0) +
                (if (runName.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Result &&
                endTime == other.endTime &&
                inputs == other.inputs &&
                startTime == other.startTime &&
                actualOutputs == other.actualOutputs &&
                error == other.error &&
                evaluationScores == other.evaluationScores &&
                expectedOutputs == other.expectedOutputs &&
                rowId == other.rowId &&
                runMetadata == other.runMetadata &&
                runName == other.runName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                endTime,
                inputs,
                startTime,
                actualOutputs,
                error,
                evaluationScores,
                expectedOutputs,
                rowId,
                runMetadata,
                runName,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Result{endTime=$endTime, inputs=$inputs, startTime=$startTime, actualOutputs=$actualOutputs, error=$error, evaluationScores=$evaluationScores, expectedOutputs=$expectedOutputs, rowId=$rowId, runMetadata=$runMetadata, runName=$runName, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatasetUploadExperimentParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DatasetUploadExperimentParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

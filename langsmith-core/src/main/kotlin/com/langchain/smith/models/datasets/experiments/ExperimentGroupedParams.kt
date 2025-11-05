// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.experiments

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

/** Stream grouped and aggregated experiments. */
class ExperimentGroupedParams
private constructor(
    private val datasetId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun datasetId(): Optional<String> = Optional.ofNullable(datasetId)

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadataKey(): String = body.metadataKey()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun datasetVersion(): Optional<String> = body.datasetVersion()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun experimentLimit(): Optional<Long> = body.experimentLimit()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filter(): Optional<String> = body.filter()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nameContains(): Optional<String> = body.nameContains()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statsStartTime(): Optional<OffsetDateTime> = body.statsStartTime()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tagValueId(): Optional<List<String>> = body.tagValueId()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun useApproxStats(): Optional<Boolean> = body.useApproxStats()

    /**
     * Returns the raw JSON value of [metadataKey].
     *
     * Unlike [metadataKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadataKey(): JsonField<String> = body._metadataKey()

    /**
     * Returns the raw JSON value of [datasetVersion].
     *
     * Unlike [datasetVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _datasetVersion(): JsonField<String> = body._datasetVersion()

    /**
     * Returns the raw JSON value of [experimentLimit].
     *
     * Unlike [experimentLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _experimentLimit(): JsonField<Long> = body._experimentLimit()

    /**
     * Returns the raw JSON value of [filter].
     *
     * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _filter(): JsonField<String> = body._filter()

    /**
     * Returns the raw JSON value of [nameContains].
     *
     * Unlike [nameContains], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _nameContains(): JsonField<String> = body._nameContains()

    /**
     * Returns the raw JSON value of [statsStartTime].
     *
     * Unlike [statsStartTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _statsStartTime(): JsonField<OffsetDateTime> = body._statsStartTime()

    /**
     * Returns the raw JSON value of [tagValueId].
     *
     * Unlike [tagValueId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tagValueId(): JsonField<List<String>> = body._tagValueId()

    /**
     * Returns the raw JSON value of [useApproxStats].
     *
     * Unlike [useApproxStats], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _useApproxStats(): JsonField<Boolean> = body._useApproxStats()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExperimentGroupedParams].
         *
         * The following fields are required:
         * ```java
         * .metadataKey()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExperimentGroupedParams]. */
    class Builder internal constructor() {

        private var datasetId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(experimentGroupedParams: ExperimentGroupedParams) = apply {
            datasetId = experimentGroupedParams.datasetId
            body = experimentGroupedParams.body.toBuilder()
            additionalHeaders = experimentGroupedParams.additionalHeaders.toBuilder()
            additionalQueryParams = experimentGroupedParams.additionalQueryParams.toBuilder()
        }

        fun datasetId(datasetId: String?) = apply { this.datasetId = datasetId }

        /** Alias for calling [Builder.datasetId] with `datasetId.orElse(null)`. */
        fun datasetId(datasetId: Optional<String>) = datasetId(datasetId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [metadataKey]
         * - [datasetVersion]
         * - [experimentLimit]
         * - [filter]
         * - [nameContains]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun metadataKey(metadataKey: String) = apply { body.metadataKey(metadataKey) }

        /**
         * Sets [Builder.metadataKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadataKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadataKey(metadataKey: JsonField<String>) = apply { body.metadataKey(metadataKey) }

        fun datasetVersion(datasetVersion: String?) = apply { body.datasetVersion(datasetVersion) }

        /** Alias for calling [Builder.datasetVersion] with `datasetVersion.orElse(null)`. */
        fun datasetVersion(datasetVersion: Optional<String>) =
            datasetVersion(datasetVersion.getOrNull())

        /**
         * Sets [Builder.datasetVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasetVersion] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun datasetVersion(datasetVersion: JsonField<String>) = apply {
            body.datasetVersion(datasetVersion)
        }

        fun experimentLimit(experimentLimit: Long) = apply { body.experimentLimit(experimentLimit) }

        /**
         * Sets [Builder.experimentLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.experimentLimit] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun experimentLimit(experimentLimit: JsonField<Long>) = apply {
            body.experimentLimit(experimentLimit)
        }

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

        fun nameContains(nameContains: String?) = apply { body.nameContains(nameContains) }

        /** Alias for calling [Builder.nameContains] with `nameContains.orElse(null)`. */
        fun nameContains(nameContains: Optional<String>) = nameContains(nameContains.getOrNull())

        /**
         * Sets [Builder.nameContains] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nameContains] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nameContains(nameContains: JsonField<String>) = apply {
            body.nameContains(nameContains)
        }

        fun statsStartTime(statsStartTime: OffsetDateTime?) = apply {
            body.statsStartTime(statsStartTime)
        }

        /** Alias for calling [Builder.statsStartTime] with `statsStartTime.orElse(null)`. */
        fun statsStartTime(statsStartTime: Optional<OffsetDateTime>) =
            statsStartTime(statsStartTime.getOrNull())

        /**
         * Sets [Builder.statsStartTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statsStartTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun statsStartTime(statsStartTime: JsonField<OffsetDateTime>) = apply {
            body.statsStartTime(statsStartTime)
        }

        fun tagValueId(tagValueId: List<String>?) = apply { body.tagValueId(tagValueId) }

        /** Alias for calling [Builder.tagValueId] with `tagValueId.orElse(null)`. */
        fun tagValueId(tagValueId: Optional<List<String>>) = tagValueId(tagValueId.getOrNull())

        /**
         * Sets [Builder.tagValueId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tagValueId] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tagValueId(tagValueId: JsonField<List<String>>) = apply { body.tagValueId(tagValueId) }

        /**
         * Adds a single [String] to [Builder.tagValueId].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTagValueId(tagValueId: String) = apply { body.addTagValueId(tagValueId) }

        fun useApproxStats(useApproxStats: Boolean) = apply { body.useApproxStats(useApproxStats) }

        /**
         * Sets [Builder.useApproxStats] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useApproxStats] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun useApproxStats(useApproxStats: JsonField<Boolean>) = apply {
            body.useApproxStats(useApproxStats)
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
         * Returns an immutable instance of [ExperimentGroupedParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .metadataKey()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExperimentGroupedParams =
            ExperimentGroupedParams(
                datasetId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> datasetId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Schema for grouped experiment (tracer session) query. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val metadataKey: JsonField<String>,
        private val datasetVersion: JsonField<String>,
        private val experimentLimit: JsonField<Long>,
        private val filter: JsonField<String>,
        private val nameContains: JsonField<String>,
        private val statsStartTime: JsonField<OffsetDateTime>,
        private val tagValueId: JsonField<List<String>>,
        private val useApproxStats: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("metadata_key")
            @ExcludeMissing
            metadataKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dataset_version")
            @ExcludeMissing
            datasetVersion: JsonField<String> = JsonMissing.of(),
            @JsonProperty("experiment_limit")
            @ExcludeMissing
            experimentLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("filter") @ExcludeMissing filter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name_contains")
            @ExcludeMissing
            nameContains: JsonField<String> = JsonMissing.of(),
            @JsonProperty("stats_start_time")
            @ExcludeMissing
            statsStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("tag_value_id")
            @ExcludeMissing
            tagValueId: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("use_approx_stats")
            @ExcludeMissing
            useApproxStats: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            metadataKey,
            datasetVersion,
            experimentLimit,
            filter,
            nameContains,
            statsStartTime,
            tagValueId,
            useApproxStats,
            mutableMapOf(),
        )

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun metadataKey(): String = metadataKey.getRequired("metadata_key")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun datasetVersion(): Optional<String> = datasetVersion.getOptional("dataset_version")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun experimentLimit(): Optional<Long> = experimentLimit.getOptional("experiment_limit")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun filter(): Optional<String> = filter.getOptional("filter")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun nameContains(): Optional<String> = nameContains.getOptional("name_contains")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun statsStartTime(): Optional<OffsetDateTime> =
            statsStartTime.getOptional("stats_start_time")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tagValueId(): Optional<List<String>> = tagValueId.getOptional("tag_value_id")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun useApproxStats(): Optional<Boolean> = useApproxStats.getOptional("use_approx_stats")

        /**
         * Returns the raw JSON value of [metadataKey].
         *
         * Unlike [metadataKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata_key")
        @ExcludeMissing
        fun _metadataKey(): JsonField<String> = metadataKey

        /**
         * Returns the raw JSON value of [datasetVersion].
         *
         * Unlike [datasetVersion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dataset_version")
        @ExcludeMissing
        fun _datasetVersion(): JsonField<String> = datasetVersion

        /**
         * Returns the raw JSON value of [experimentLimit].
         *
         * Unlike [experimentLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("experiment_limit")
        @ExcludeMissing
        fun _experimentLimit(): JsonField<Long> = experimentLimit

        /**
         * Returns the raw JSON value of [filter].
         *
         * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

        /**
         * Returns the raw JSON value of [nameContains].
         *
         * Unlike [nameContains], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("name_contains")
        @ExcludeMissing
        fun _nameContains(): JsonField<String> = nameContains

        /**
         * Returns the raw JSON value of [statsStartTime].
         *
         * Unlike [statsStartTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("stats_start_time")
        @ExcludeMissing
        fun _statsStartTime(): JsonField<OffsetDateTime> = statsStartTime

        /**
         * Returns the raw JSON value of [tagValueId].
         *
         * Unlike [tagValueId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tag_value_id")
        @ExcludeMissing
        fun _tagValueId(): JsonField<List<String>> = tagValueId

        /**
         * Returns the raw JSON value of [useApproxStats].
         *
         * Unlike [useApproxStats], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("use_approx_stats")
        @ExcludeMissing
        fun _useApproxStats(): JsonField<Boolean> = useApproxStats

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
             * .metadataKey()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var metadataKey: JsonField<String>? = null
            private var datasetVersion: JsonField<String> = JsonMissing.of()
            private var experimentLimit: JsonField<Long> = JsonMissing.of()
            private var filter: JsonField<String> = JsonMissing.of()
            private var nameContains: JsonField<String> = JsonMissing.of()
            private var statsStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var tagValueId: JsonField<MutableList<String>>? = null
            private var useApproxStats: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                metadataKey = body.metadataKey
                datasetVersion = body.datasetVersion
                experimentLimit = body.experimentLimit
                filter = body.filter
                nameContains = body.nameContains
                statsStartTime = body.statsStartTime
                tagValueId = body.tagValueId.map { it.toMutableList() }
                useApproxStats = body.useApproxStats
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun metadataKey(metadataKey: String) = metadataKey(JsonField.of(metadataKey))

            /**
             * Sets [Builder.metadataKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadataKey] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadataKey(metadataKey: JsonField<String>) = apply {
                this.metadataKey = metadataKey
            }

            fun datasetVersion(datasetVersion: String?) =
                datasetVersion(JsonField.ofNullable(datasetVersion))

            /** Alias for calling [Builder.datasetVersion] with `datasetVersion.orElse(null)`. */
            fun datasetVersion(datasetVersion: Optional<String>) =
                datasetVersion(datasetVersion.getOrNull())

            /**
             * Sets [Builder.datasetVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.datasetVersion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun datasetVersion(datasetVersion: JsonField<String>) = apply {
                this.datasetVersion = datasetVersion
            }

            fun experimentLimit(experimentLimit: Long) =
                experimentLimit(JsonField.of(experimentLimit))

            /**
             * Sets [Builder.experimentLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.experimentLimit] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun experimentLimit(experimentLimit: JsonField<Long>) = apply {
                this.experimentLimit = experimentLimit
            }

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

            fun nameContains(nameContains: String?) =
                nameContains(JsonField.ofNullable(nameContains))

            /** Alias for calling [Builder.nameContains] with `nameContains.orElse(null)`. */
            fun nameContains(nameContains: Optional<String>) =
                nameContains(nameContains.getOrNull())

            /**
             * Sets [Builder.nameContains] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nameContains] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nameContains(nameContains: JsonField<String>) = apply {
                this.nameContains = nameContains
            }

            fun statsStartTime(statsStartTime: OffsetDateTime?) =
                statsStartTime(JsonField.ofNullable(statsStartTime))

            /** Alias for calling [Builder.statsStartTime] with `statsStartTime.orElse(null)`. */
            fun statsStartTime(statsStartTime: Optional<OffsetDateTime>) =
                statsStartTime(statsStartTime.getOrNull())

            /**
             * Sets [Builder.statsStartTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statsStartTime] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun statsStartTime(statsStartTime: JsonField<OffsetDateTime>) = apply {
                this.statsStartTime = statsStartTime
            }

            fun tagValueId(tagValueId: List<String>?) = tagValueId(JsonField.ofNullable(tagValueId))

            /** Alias for calling [Builder.tagValueId] with `tagValueId.orElse(null)`. */
            fun tagValueId(tagValueId: Optional<List<String>>) = tagValueId(tagValueId.getOrNull())

            /**
             * Sets [Builder.tagValueId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tagValueId] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tagValueId(tagValueId: JsonField<List<String>>) = apply {
                this.tagValueId = tagValueId.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.tagValueId].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTagValueId(tagValueId: String) = apply {
                this.tagValueId =
                    (this.tagValueId ?: JsonField.of(mutableListOf())).also {
                        checkKnown("tagValueId", it).add(tagValueId)
                    }
            }

            fun useApproxStats(useApproxStats: Boolean) =
                useApproxStats(JsonField.of(useApproxStats))

            /**
             * Sets [Builder.useApproxStats] to an arbitrary JSON value.
             *
             * You should usually call [Builder.useApproxStats] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun useApproxStats(useApproxStats: JsonField<Boolean>) = apply {
                this.useApproxStats = useApproxStats
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
             * .metadataKey()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("metadataKey", metadataKey),
                    datasetVersion,
                    experimentLimit,
                    filter,
                    nameContains,
                    statsStartTime,
                    (tagValueId ?: JsonMissing.of()).map { it.toImmutable() },
                    useApproxStats,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            metadataKey()
            datasetVersion()
            experimentLimit()
            filter()
            nameContains()
            statsStartTime()
            tagValueId()
            useApproxStats()
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
            (if (metadataKey.asKnown().isPresent) 1 else 0) +
                (if (datasetVersion.asKnown().isPresent) 1 else 0) +
                (if (experimentLimit.asKnown().isPresent) 1 else 0) +
                (if (filter.asKnown().isPresent) 1 else 0) +
                (if (nameContains.asKnown().isPresent) 1 else 0) +
                (if (statsStartTime.asKnown().isPresent) 1 else 0) +
                (tagValueId.asKnown().getOrNull()?.size ?: 0) +
                (if (useApproxStats.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                metadataKey == other.metadataKey &&
                datasetVersion == other.datasetVersion &&
                experimentLimit == other.experimentLimit &&
                filter == other.filter &&
                nameContains == other.nameContains &&
                statsStartTime == other.statsStartTime &&
                tagValueId == other.tagValueId &&
                useApproxStats == other.useApproxStats &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                metadataKey,
                datasetVersion,
                experimentLimit,
                filter,
                nameContains,
                statsStartTime,
                tagValueId,
                useApproxStats,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{metadataKey=$metadataKey, datasetVersion=$datasetVersion, experimentLimit=$experimentLimit, filter=$filter, nameContains=$nameContains, statsStartTime=$statsStartTime, tagValueId=$tagValueId, useApproxStats=$useApproxStats, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExperimentGroupedParams &&
            datasetId == other.datasetId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(datasetId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ExperimentGroupedParams{datasetId=$datasetId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

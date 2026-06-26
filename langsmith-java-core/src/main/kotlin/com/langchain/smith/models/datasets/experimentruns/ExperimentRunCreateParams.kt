// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.experimentruns

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.Enum
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.Params
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Returns a paginated page of dataset examples with runs from the requested experiments. Response
 * uses the canonical `{items, next_cursor}` envelope.
 */
class ExperimentRunCreateParams
private constructor(
    private val datasetId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun datasetId(): Optional<String> = Optional.ofNullable(datasetId)

    /**
     * `comparative_experiment_id` scopes pairwise-annotation feedback (optional).
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun comparativeExperimentId(): Optional<String> = body.comparativeExperimentId()

    /**
     * `cursor` is the opaque string from a previous response's `next_cursor`. Absent for the first
     * page.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cursor(): Optional<String> = body.cursor()

    /**
     * `example_ids` optionally restricts the page to these dataset example UUIDs (max 1000).
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun exampleIds(): Optional<List<String>> = body.exampleIds()

    /**
     * `experiment_ids` lists the experiment (tracing session) UUIDs to query. Required, non-empty.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun experimentIds(): Optional<List<String>> = body.experimentIds()

    /**
     * `filters` maps a project (session) UUID string to a list of filter expressions (optional).
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filters(): Optional<Filters> = body.filters()

    /**
     * `page_size` is the maximum number of examples to return. Defaults to 20, max 100.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageSize(): Optional<Long> = body.pageSize()

    /**
     * `selects` lists which run properties to include. Omitted => only `id`. Tokens mirror
     * /v2/runs/query.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun selects(): Optional<List<Select>> = body.selects()

    /**
     * `sort` controls feedback-score sorting (single project only).
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sort(): Optional<Sort> = body.sort()

    /**
     * Returns the raw JSON value of [comparativeExperimentId].
     *
     * Unlike [comparativeExperimentId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _comparativeExperimentId(): JsonField<String> = body._comparativeExperimentId()

    /**
     * Returns the raw JSON value of [cursor].
     *
     * Unlike [cursor], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cursor(): JsonField<String> = body._cursor()

    /**
     * Returns the raw JSON value of [exampleIds].
     *
     * Unlike [exampleIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _exampleIds(): JsonField<List<String>> = body._exampleIds()

    /**
     * Returns the raw JSON value of [experimentIds].
     *
     * Unlike [experimentIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _experimentIds(): JsonField<List<String>> = body._experimentIds()

    /**
     * Returns the raw JSON value of [filters].
     *
     * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _filters(): JsonField<Filters> = body._filters()

    /**
     * Returns the raw JSON value of [pageSize].
     *
     * Unlike [pageSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pageSize(): JsonField<Long> = body._pageSize()

    /**
     * Returns the raw JSON value of [selects].
     *
     * Unlike [selects], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _selects(): JsonField<List<Select>> = body._selects()

    /**
     * Returns the raw JSON value of [sort].
     *
     * Unlike [sort], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sort(): JsonField<Sort> = body._sort()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ExperimentRunCreateParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [ExperimentRunCreateParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExperimentRunCreateParams]. */
    class Builder internal constructor() {

        private var datasetId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(experimentRunCreateParams: ExperimentRunCreateParams) = apply {
            datasetId = experimentRunCreateParams.datasetId
            body = experimentRunCreateParams.body.toBuilder()
            additionalHeaders = experimentRunCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = experimentRunCreateParams.additionalQueryParams.toBuilder()
        }

        fun datasetId(datasetId: String?) = apply { this.datasetId = datasetId }

        /** Alias for calling [Builder.datasetId] with `datasetId.orElse(null)`. */
        fun datasetId(datasetId: Optional<String>) = datasetId(datasetId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [comparativeExperimentId]
         * - [cursor]
         * - [exampleIds]
         * - [experimentIds]
         * - [filters]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** `comparative_experiment_id` scopes pairwise-annotation feedback (optional). */
        fun comparativeExperimentId(comparativeExperimentId: String) = apply {
            body.comparativeExperimentId(comparativeExperimentId)
        }

        /**
         * Sets [Builder.comparativeExperimentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.comparativeExperimentId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun comparativeExperimentId(comparativeExperimentId: JsonField<String>) = apply {
            body.comparativeExperimentId(comparativeExperimentId)
        }

        /**
         * `cursor` is the opaque string from a previous response's `next_cursor`. Absent for the
         * first page.
         */
        fun cursor(cursor: String) = apply { body.cursor(cursor) }

        /**
         * Sets [Builder.cursor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cursor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cursor(cursor: JsonField<String>) = apply { body.cursor(cursor) }

        /**
         * `example_ids` optionally restricts the page to these dataset example UUIDs (max 1000).
         */
        fun exampleIds(exampleIds: List<String>) = apply { body.exampleIds(exampleIds) }

        /**
         * Sets [Builder.exampleIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exampleIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun exampleIds(exampleIds: JsonField<List<String>>) = apply { body.exampleIds(exampleIds) }

        /**
         * Adds a single [String] to [exampleIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExampleId(exampleId: String) = apply { body.addExampleId(exampleId) }

        /**
         * `experiment_ids` lists the experiment (tracing session) UUIDs to query. Required,
         * non-empty.
         */
        fun experimentIds(experimentIds: List<String>) = apply { body.experimentIds(experimentIds) }

        /**
         * Sets [Builder.experimentIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.experimentIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun experimentIds(experimentIds: JsonField<List<String>>) = apply {
            body.experimentIds(experimentIds)
        }

        /**
         * Adds a single [String] to [experimentIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExperimentId(experimentId: String) = apply { body.addExperimentId(experimentId) }

        /**
         * `filters` maps a project (session) UUID string to a list of filter expressions
         * (optional).
         */
        fun filters(filters: Filters) = apply { body.filters(filters) }

        /**
         * Sets [Builder.filters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filters] with a well-typed [Filters] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filters(filters: JsonField<Filters>) = apply { body.filters(filters) }

        /** `page_size` is the maximum number of examples to return. Defaults to 20, max 100. */
        fun pageSize(pageSize: Long) = apply { body.pageSize(pageSize) }

        /**
         * Sets [Builder.pageSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageSize] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageSize(pageSize: JsonField<Long>) = apply { body.pageSize(pageSize) }

        /**
         * `selects` lists which run properties to include. Omitted => only `id`. Tokens mirror
         * /v2/runs/query.
         */
        fun selects(selects: List<Select>) = apply { body.selects(selects) }

        /**
         * Sets [Builder.selects] to an arbitrary JSON value.
         *
         * You should usually call [Builder.selects] with a well-typed `List<Select>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun selects(selects: JsonField<List<Select>>) = apply { body.selects(selects) }

        /**
         * Adds a single [Select] to [selects].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSelect(select: Select) = apply { body.addSelect(select) }

        /** `sort` controls feedback-score sorting (single project only). */
        fun sort(sort: Sort) = apply { body.sort(sort) }

        /**
         * Sets [Builder.sort] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sort] with a well-typed [Sort] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sort(sort: JsonField<Sort>) = apply { body.sort(sort) }

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
         * Returns an immutable instance of [ExperimentRunCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ExperimentRunCreateParams =
            ExperimentRunCreateParams(
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

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val comparativeExperimentId: JsonField<String>,
        private val cursor: JsonField<String>,
        private val exampleIds: JsonField<List<String>>,
        private val experimentIds: JsonField<List<String>>,
        private val filters: JsonField<Filters>,
        private val pageSize: JsonField<Long>,
        private val selects: JsonField<List<Select>>,
        private val sort: JsonField<Sort>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("comparative_experiment_id")
            @ExcludeMissing
            comparativeExperimentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cursor") @ExcludeMissing cursor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("example_ids")
            @ExcludeMissing
            exampleIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("experiment_ids")
            @ExcludeMissing
            experimentIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("filters") @ExcludeMissing filters: JsonField<Filters> = JsonMissing.of(),
            @JsonProperty("page_size") @ExcludeMissing pageSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("selects")
            @ExcludeMissing
            selects: JsonField<List<Select>> = JsonMissing.of(),
            @JsonProperty("sort") @ExcludeMissing sort: JsonField<Sort> = JsonMissing.of(),
        ) : this(
            comparativeExperimentId,
            cursor,
            exampleIds,
            experimentIds,
            filters,
            pageSize,
            selects,
            sort,
            mutableMapOf(),
        )

        /**
         * `comparative_experiment_id` scopes pairwise-annotation feedback (optional).
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun comparativeExperimentId(): Optional<String> =
            comparativeExperimentId.getOptional("comparative_experiment_id")

        /**
         * `cursor` is the opaque string from a previous response's `next_cursor`. Absent for the
         * first page.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cursor(): Optional<String> = cursor.getOptional("cursor")

        /**
         * `example_ids` optionally restricts the page to these dataset example UUIDs (max 1000).
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun exampleIds(): Optional<List<String>> = exampleIds.getOptional("example_ids")

        /**
         * `experiment_ids` lists the experiment (tracing session) UUIDs to query. Required,
         * non-empty.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun experimentIds(): Optional<List<String>> = experimentIds.getOptional("experiment_ids")

        /**
         * `filters` maps a project (session) UUID string to a list of filter expressions
         * (optional).
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun filters(): Optional<Filters> = filters.getOptional("filters")

        /**
         * `page_size` is the maximum number of examples to return. Defaults to 20, max 100.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pageSize(): Optional<Long> = pageSize.getOptional("page_size")

        /**
         * `selects` lists which run properties to include. Omitted => only `id`. Tokens mirror
         * /v2/runs/query.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun selects(): Optional<List<Select>> = selects.getOptional("selects")

        /**
         * `sort` controls feedback-score sorting (single project only).
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun sort(): Optional<Sort> = sort.getOptional("sort")

        /**
         * Returns the raw JSON value of [comparativeExperimentId].
         *
         * Unlike [comparativeExperimentId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("comparative_experiment_id")
        @ExcludeMissing
        fun _comparativeExperimentId(): JsonField<String> = comparativeExperimentId

        /**
         * Returns the raw JSON value of [cursor].
         *
         * Unlike [cursor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cursor") @ExcludeMissing fun _cursor(): JsonField<String> = cursor

        /**
         * Returns the raw JSON value of [exampleIds].
         *
         * Unlike [exampleIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("example_ids")
        @ExcludeMissing
        fun _exampleIds(): JsonField<List<String>> = exampleIds

        /**
         * Returns the raw JSON value of [experimentIds].
         *
         * Unlike [experimentIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("experiment_ids")
        @ExcludeMissing
        fun _experimentIds(): JsonField<List<String>> = experimentIds

        /**
         * Returns the raw JSON value of [filters].
         *
         * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filters") @ExcludeMissing fun _filters(): JsonField<Filters> = filters

        /**
         * Returns the raw JSON value of [pageSize].
         *
         * Unlike [pageSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_size") @ExcludeMissing fun _pageSize(): JsonField<Long> = pageSize

        /**
         * Returns the raw JSON value of [selects].
         *
         * Unlike [selects], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("selects") @ExcludeMissing fun _selects(): JsonField<List<Select>> = selects

        /**
         * Returns the raw JSON value of [sort].
         *
         * Unlike [sort], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sort") @ExcludeMissing fun _sort(): JsonField<Sort> = sort

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var comparativeExperimentId: JsonField<String> = JsonMissing.of()
            private var cursor: JsonField<String> = JsonMissing.of()
            private var exampleIds: JsonField<MutableList<String>>? = null
            private var experimentIds: JsonField<MutableList<String>>? = null
            private var filters: JsonField<Filters> = JsonMissing.of()
            private var pageSize: JsonField<Long> = JsonMissing.of()
            private var selects: JsonField<MutableList<Select>>? = null
            private var sort: JsonField<Sort> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                comparativeExperimentId = body.comparativeExperimentId
                cursor = body.cursor
                exampleIds = body.exampleIds.map { it.toMutableList() }
                experimentIds = body.experimentIds.map { it.toMutableList() }
                filters = body.filters
                pageSize = body.pageSize
                selects = body.selects.map { it.toMutableList() }
                sort = body.sort
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** `comparative_experiment_id` scopes pairwise-annotation feedback (optional). */
            fun comparativeExperimentId(comparativeExperimentId: String) =
                comparativeExperimentId(JsonField.of(comparativeExperimentId))

            /**
             * Sets [Builder.comparativeExperimentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.comparativeExperimentId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun comparativeExperimentId(comparativeExperimentId: JsonField<String>) = apply {
                this.comparativeExperimentId = comparativeExperimentId
            }

            /**
             * `cursor` is the opaque string from a previous response's `next_cursor`. Absent for
             * the first page.
             */
            fun cursor(cursor: String) = cursor(JsonField.of(cursor))

            /**
             * Sets [Builder.cursor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cursor] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cursor(cursor: JsonField<String>) = apply { this.cursor = cursor }

            /**
             * `example_ids` optionally restricts the page to these dataset example UUIDs (max
             * 1000).
             */
            fun exampleIds(exampleIds: List<String>) = exampleIds(JsonField.of(exampleIds))

            /**
             * Sets [Builder.exampleIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.exampleIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun exampleIds(exampleIds: JsonField<List<String>>) = apply {
                this.exampleIds = exampleIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [exampleIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addExampleId(exampleId: String) = apply {
                exampleIds =
                    (exampleIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("exampleIds", it).add(exampleId)
                    }
            }

            /**
             * `experiment_ids` lists the experiment (tracing session) UUIDs to query. Required,
             * non-empty.
             */
            fun experimentIds(experimentIds: List<String>) =
                experimentIds(JsonField.of(experimentIds))

            /**
             * Sets [Builder.experimentIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.experimentIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun experimentIds(experimentIds: JsonField<List<String>>) = apply {
                this.experimentIds = experimentIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [experimentIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addExperimentId(experimentId: String) = apply {
                experimentIds =
                    (experimentIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("experimentIds", it).add(experimentId)
                    }
            }

            /**
             * `filters` maps a project (session) UUID string to a list of filter expressions
             * (optional).
             */
            fun filters(filters: Filters) = filters(JsonField.of(filters))

            /**
             * Sets [Builder.filters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filters] with a well-typed [Filters] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filters(filters: JsonField<Filters>) = apply { this.filters = filters }

            /** `page_size` is the maximum number of examples to return. Defaults to 20, max 100. */
            fun pageSize(pageSize: Long) = pageSize(JsonField.of(pageSize))

            /**
             * Sets [Builder.pageSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageSize] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageSize(pageSize: JsonField<Long>) = apply { this.pageSize = pageSize }

            /**
             * `selects` lists which run properties to include. Omitted => only `id`. Tokens mirror
             * /v2/runs/query.
             */
            fun selects(selects: List<Select>) = selects(JsonField.of(selects))

            /**
             * Sets [Builder.selects] to an arbitrary JSON value.
             *
             * You should usually call [Builder.selects] with a well-typed `List<Select>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun selects(selects: JsonField<List<Select>>) = apply {
                this.selects = selects.map { it.toMutableList() }
            }

            /**
             * Adds a single [Select] to [selects].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSelect(select: Select) = apply {
                selects =
                    (selects ?: JsonField.of(mutableListOf())).also {
                        checkKnown("selects", it).add(select)
                    }
            }

            /** `sort` controls feedback-score sorting (single project only). */
            fun sort(sort: Sort) = sort(JsonField.of(sort))

            /**
             * Sets [Builder.sort] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sort] with a well-typed [Sort] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun sort(sort: JsonField<Sort>) = apply { this.sort = sort }

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
             */
            fun build(): Body =
                Body(
                    comparativeExperimentId,
                    cursor,
                    (exampleIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (experimentIds ?: JsonMissing.of()).map { it.toImmutable() },
                    filters,
                    pageSize,
                    (selects ?: JsonMissing.of()).map { it.toImmutable() },
                    sort,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            comparativeExperimentId()
            cursor()
            exampleIds()
            experimentIds()
            filters().ifPresent { it.validate() }
            pageSize()
            selects().ifPresent { it.forEach { it.validate() } }
            sort().ifPresent { it.validate() }
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
            (if (comparativeExperimentId.asKnown().isPresent) 1 else 0) +
                (if (cursor.asKnown().isPresent) 1 else 0) +
                (exampleIds.asKnown().getOrNull()?.size ?: 0) +
                (experimentIds.asKnown().getOrNull()?.size ?: 0) +
                (filters.asKnown().getOrNull()?.validity() ?: 0) +
                (if (pageSize.asKnown().isPresent) 1 else 0) +
                (selects.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (sort.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                comparativeExperimentId == other.comparativeExperimentId &&
                cursor == other.cursor &&
                exampleIds == other.exampleIds &&
                experimentIds == other.experimentIds &&
                filters == other.filters &&
                pageSize == other.pageSize &&
                selects == other.selects &&
                sort == other.sort &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                comparativeExperimentId,
                cursor,
                exampleIds,
                experimentIds,
                filters,
                pageSize,
                selects,
                sort,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{comparativeExperimentId=$comparativeExperimentId, cursor=$cursor, exampleIds=$exampleIds, experimentIds=$experimentIds, filters=$filters, pageSize=$pageSize, selects=$selects, sort=$sort, additionalProperties=$additionalProperties}"
    }

    /**
     * `filters` maps a project (session) UUID string to a list of filter expressions (optional).
     */
    class Filters
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

            /** Returns a mutable builder for constructing an instance of [Filters]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filters]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(filters: Filters) = apply {
                additionalProperties = filters.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Filters].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Filters = Filters(additionalProperties.toImmutable())
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
        fun validate(): Filters = apply {
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

            return other is Filters && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Filters{additionalProperties=$additionalProperties}"
    }

    class Select @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ID = of("ID")

            @JvmField val NAME = of("NAME")

            @JvmField val RUN_TYPE = of("RUN_TYPE")

            @JvmField val STATUS = of("STATUS")

            @JvmField val START_TIME = of("START_TIME")

            @JvmField val END_TIME = of("END_TIME")

            @JvmField val LATENCY_SECONDS = of("LATENCY_SECONDS")

            @JvmField val FIRST_TOKEN_TIME = of("FIRST_TOKEN_TIME")

            @JvmField val ERROR = of("ERROR")

            @JvmField val ERROR_PREVIEW = of("ERROR_PREVIEW")

            @JvmField val EXTRA = of("EXTRA")

            @JvmField val METADATA = of("METADATA")

            @JvmField val EVENTS = of("EVENTS")

            @JvmField val INPUTS = of("INPUTS")

            @JvmField val INPUTS_PREVIEW = of("INPUTS_PREVIEW")

            @JvmField val OUTPUTS = of("OUTPUTS")

            @JvmField val OUTPUTS_PREVIEW = of("OUTPUTS_PREVIEW")

            @JvmField val MANIFEST = of("MANIFEST")

            @JvmField val PARENT_RUN_IDS = of("PARENT_RUN_IDS")

            @JvmField val PROJECT_ID = of("PROJECT_ID")

            @JvmField val TRACE_ID = of("TRACE_ID")

            @JvmField val THREAD_ID = of("THREAD_ID")

            @JvmField val DOTTED_ORDER = of("DOTTED_ORDER")

            @JvmField val IS_ROOT = of("IS_ROOT")

            @JvmField val REFERENCE_EXAMPLE_ID = of("REFERENCE_EXAMPLE_ID")

            @JvmField val REFERENCE_DATASET_ID = of("REFERENCE_DATASET_ID")

            @JvmField val TOTAL_TOKENS = of("TOTAL_TOKENS")

            @JvmField val PROMPT_TOKENS = of("PROMPT_TOKENS")

            @JvmField val COMPLETION_TOKENS = of("COMPLETION_TOKENS")

            @JvmField val TOTAL_COST = of("TOTAL_COST")

            @JvmField val PROMPT_COST = of("PROMPT_COST")

            @JvmField val COMPLETION_COST = of("COMPLETION_COST")

            @JvmField val PROMPT_TOKEN_DETAILS = of("PROMPT_TOKEN_DETAILS")

            @JvmField val COMPLETION_TOKEN_DETAILS = of("COMPLETION_TOKEN_DETAILS")

            @JvmField val PROMPT_COST_DETAILS = of("PROMPT_COST_DETAILS")

            @JvmField val COMPLETION_COST_DETAILS = of("COMPLETION_COST_DETAILS")

            @JvmField val PRICE_MODEL_ID = of("PRICE_MODEL_ID")

            @JvmField val TAGS = of("TAGS")

            @JvmField val APP_PATH = of("APP_PATH")

            @JvmField val ATTACHMENTS = of("ATTACHMENTS")

            @JvmField val THREAD_EVALUATION_TIME = of("THREAD_EVALUATION_TIME")

            @JvmField val IS_IN_DATASET = of("IS_IN_DATASET")

            @JvmField val SHARE_URL = of("SHARE_URL")

            @JvmField val FEEDBACK_STATS = of("FEEDBACK_STATS")

            @JvmStatic fun of(value: String) = Select(JsonField.of(value))
        }

        /** An enum containing [Select]'s known values. */
        enum class Known {
            ID,
            NAME,
            RUN_TYPE,
            STATUS,
            START_TIME,
            END_TIME,
            LATENCY_SECONDS,
            FIRST_TOKEN_TIME,
            ERROR,
            ERROR_PREVIEW,
            EXTRA,
            METADATA,
            EVENTS,
            INPUTS,
            INPUTS_PREVIEW,
            OUTPUTS,
            OUTPUTS_PREVIEW,
            MANIFEST,
            PARENT_RUN_IDS,
            PROJECT_ID,
            TRACE_ID,
            THREAD_ID,
            DOTTED_ORDER,
            IS_ROOT,
            REFERENCE_EXAMPLE_ID,
            REFERENCE_DATASET_ID,
            TOTAL_TOKENS,
            PROMPT_TOKENS,
            COMPLETION_TOKENS,
            TOTAL_COST,
            PROMPT_COST,
            COMPLETION_COST,
            PROMPT_TOKEN_DETAILS,
            COMPLETION_TOKEN_DETAILS,
            PROMPT_COST_DETAILS,
            COMPLETION_COST_DETAILS,
            PRICE_MODEL_ID,
            TAGS,
            APP_PATH,
            ATTACHMENTS,
            THREAD_EVALUATION_TIME,
            IS_IN_DATASET,
            SHARE_URL,
            FEEDBACK_STATS,
        }

        /**
         * An enum containing [Select]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Select] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ID,
            NAME,
            RUN_TYPE,
            STATUS,
            START_TIME,
            END_TIME,
            LATENCY_SECONDS,
            FIRST_TOKEN_TIME,
            ERROR,
            ERROR_PREVIEW,
            EXTRA,
            METADATA,
            EVENTS,
            INPUTS,
            INPUTS_PREVIEW,
            OUTPUTS,
            OUTPUTS_PREVIEW,
            MANIFEST,
            PARENT_RUN_IDS,
            PROJECT_ID,
            TRACE_ID,
            THREAD_ID,
            DOTTED_ORDER,
            IS_ROOT,
            REFERENCE_EXAMPLE_ID,
            REFERENCE_DATASET_ID,
            TOTAL_TOKENS,
            PROMPT_TOKENS,
            COMPLETION_TOKENS,
            TOTAL_COST,
            PROMPT_COST,
            COMPLETION_COST,
            PROMPT_TOKEN_DETAILS,
            COMPLETION_TOKEN_DETAILS,
            PROMPT_COST_DETAILS,
            COMPLETION_COST_DETAILS,
            PRICE_MODEL_ID,
            TAGS,
            APP_PATH,
            ATTACHMENTS,
            THREAD_EVALUATION_TIME,
            IS_IN_DATASET,
            SHARE_URL,
            FEEDBACK_STATS,
            /** An enum member indicating that [Select] was instantiated with an unknown value. */
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
                ID -> Value.ID
                NAME -> Value.NAME
                RUN_TYPE -> Value.RUN_TYPE
                STATUS -> Value.STATUS
                START_TIME -> Value.START_TIME
                END_TIME -> Value.END_TIME
                LATENCY_SECONDS -> Value.LATENCY_SECONDS
                FIRST_TOKEN_TIME -> Value.FIRST_TOKEN_TIME
                ERROR -> Value.ERROR
                ERROR_PREVIEW -> Value.ERROR_PREVIEW
                EXTRA -> Value.EXTRA
                METADATA -> Value.METADATA
                EVENTS -> Value.EVENTS
                INPUTS -> Value.INPUTS
                INPUTS_PREVIEW -> Value.INPUTS_PREVIEW
                OUTPUTS -> Value.OUTPUTS
                OUTPUTS_PREVIEW -> Value.OUTPUTS_PREVIEW
                MANIFEST -> Value.MANIFEST
                PARENT_RUN_IDS -> Value.PARENT_RUN_IDS
                PROJECT_ID -> Value.PROJECT_ID
                TRACE_ID -> Value.TRACE_ID
                THREAD_ID -> Value.THREAD_ID
                DOTTED_ORDER -> Value.DOTTED_ORDER
                IS_ROOT -> Value.IS_ROOT
                REFERENCE_EXAMPLE_ID -> Value.REFERENCE_EXAMPLE_ID
                REFERENCE_DATASET_ID -> Value.REFERENCE_DATASET_ID
                TOTAL_TOKENS -> Value.TOTAL_TOKENS
                PROMPT_TOKENS -> Value.PROMPT_TOKENS
                COMPLETION_TOKENS -> Value.COMPLETION_TOKENS
                TOTAL_COST -> Value.TOTAL_COST
                PROMPT_COST -> Value.PROMPT_COST
                COMPLETION_COST -> Value.COMPLETION_COST
                PROMPT_TOKEN_DETAILS -> Value.PROMPT_TOKEN_DETAILS
                COMPLETION_TOKEN_DETAILS -> Value.COMPLETION_TOKEN_DETAILS
                PROMPT_COST_DETAILS -> Value.PROMPT_COST_DETAILS
                COMPLETION_COST_DETAILS -> Value.COMPLETION_COST_DETAILS
                PRICE_MODEL_ID -> Value.PRICE_MODEL_ID
                TAGS -> Value.TAGS
                APP_PATH -> Value.APP_PATH
                ATTACHMENTS -> Value.ATTACHMENTS
                THREAD_EVALUATION_TIME -> Value.THREAD_EVALUATION_TIME
                IS_IN_DATASET -> Value.IS_IN_DATASET
                SHARE_URL -> Value.SHARE_URL
                FEEDBACK_STATS -> Value.FEEDBACK_STATS
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
                ID -> Known.ID
                NAME -> Known.NAME
                RUN_TYPE -> Known.RUN_TYPE
                STATUS -> Known.STATUS
                START_TIME -> Known.START_TIME
                END_TIME -> Known.END_TIME
                LATENCY_SECONDS -> Known.LATENCY_SECONDS
                FIRST_TOKEN_TIME -> Known.FIRST_TOKEN_TIME
                ERROR -> Known.ERROR
                ERROR_PREVIEW -> Known.ERROR_PREVIEW
                EXTRA -> Known.EXTRA
                METADATA -> Known.METADATA
                EVENTS -> Known.EVENTS
                INPUTS -> Known.INPUTS
                INPUTS_PREVIEW -> Known.INPUTS_PREVIEW
                OUTPUTS -> Known.OUTPUTS
                OUTPUTS_PREVIEW -> Known.OUTPUTS_PREVIEW
                MANIFEST -> Known.MANIFEST
                PARENT_RUN_IDS -> Known.PARENT_RUN_IDS
                PROJECT_ID -> Known.PROJECT_ID
                TRACE_ID -> Known.TRACE_ID
                THREAD_ID -> Known.THREAD_ID
                DOTTED_ORDER -> Known.DOTTED_ORDER
                IS_ROOT -> Known.IS_ROOT
                REFERENCE_EXAMPLE_ID -> Known.REFERENCE_EXAMPLE_ID
                REFERENCE_DATASET_ID -> Known.REFERENCE_DATASET_ID
                TOTAL_TOKENS -> Known.TOTAL_TOKENS
                PROMPT_TOKENS -> Known.PROMPT_TOKENS
                COMPLETION_TOKENS -> Known.COMPLETION_TOKENS
                TOTAL_COST -> Known.TOTAL_COST
                PROMPT_COST -> Known.PROMPT_COST
                COMPLETION_COST -> Known.COMPLETION_COST
                PROMPT_TOKEN_DETAILS -> Known.PROMPT_TOKEN_DETAILS
                COMPLETION_TOKEN_DETAILS -> Known.COMPLETION_TOKEN_DETAILS
                PROMPT_COST_DETAILS -> Known.PROMPT_COST_DETAILS
                COMPLETION_COST_DETAILS -> Known.COMPLETION_COST_DETAILS
                PRICE_MODEL_ID -> Known.PRICE_MODEL_ID
                TAGS -> Known.TAGS
                APP_PATH -> Known.APP_PATH
                ATTACHMENTS -> Known.ATTACHMENTS
                THREAD_EVALUATION_TIME -> Known.THREAD_EVALUATION_TIME
                IS_IN_DATASET -> Known.IS_IN_DATASET
                SHARE_URL -> Known.SHARE_URL
                FEEDBACK_STATS -> Known.FEEDBACK_STATS
                else -> throw LangChainInvalidDataException("Unknown Select: $value")
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
        fun validate(): Select = apply {
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

            return other is Select && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** `sort` controls feedback-score sorting (single project only). */
    class Sort
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val by: JsonField<String>,
        private val order: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("by") @ExcludeMissing by: JsonField<String> = JsonMissing.of(),
            @JsonProperty("order") @ExcludeMissing order: JsonField<String> = JsonMissing.of(),
        ) : this(by, order, mutableMapOf())

        /**
         * `by` is the feedback selector, e.g. `feedback.correctness` (the `feedback.` prefix is
         * optional).
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun by(): Optional<String> = by.getOptional("by")

        /**
         * `order` is `ASC` or `DESC` (defaults to `DESC`).
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun order(): Optional<String> = order.getOptional("order")

        /**
         * Returns the raw JSON value of [by].
         *
         * Unlike [by], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("by") @ExcludeMissing fun _by(): JsonField<String> = by

        /**
         * Returns the raw JSON value of [order].
         *
         * Unlike [order], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("order") @ExcludeMissing fun _order(): JsonField<String> = order

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

            /** Returns a mutable builder for constructing an instance of [Sort]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Sort]. */
        class Builder internal constructor() {

            private var by: JsonField<String> = JsonMissing.of()
            private var order: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(sort: Sort) = apply {
                by = sort.by
                order = sort.order
                additionalProperties = sort.additionalProperties.toMutableMap()
            }

            /**
             * `by` is the feedback selector, e.g. `feedback.correctness` (the `feedback.` prefix is
             * optional).
             */
            fun by(by: String) = by(JsonField.of(by))

            /**
             * Sets [Builder.by] to an arbitrary JSON value.
             *
             * You should usually call [Builder.by] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun by(by: JsonField<String>) = apply { this.by = by }

            /** `order` is `ASC` or `DESC` (defaults to `DESC`). */
            fun order(order: String) = order(JsonField.of(order))

            /**
             * Sets [Builder.order] to an arbitrary JSON value.
             *
             * You should usually call [Builder.order] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun order(order: JsonField<String>) = apply { this.order = order }

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
             * Returns an immutable instance of [Sort].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Sort = Sort(by, order, additionalProperties.toMutableMap())
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
        fun validate(): Sort = apply {
            if (validated) {
                return@apply
            }

            by()
            order()
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
            (if (by.asKnown().isPresent) 1 else 0) + (if (order.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Sort &&
                by == other.by &&
                order == other.order &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(by, order, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Sort{by=$by, order=$order, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExperimentRunCreateParams &&
            datasetId == other.datasetId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(datasetId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ExperimentRunCreateParams{datasetId=$datasetId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.traces

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
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import com.langchain.smith.models.runs.RunSelectField
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Returns a paginated list of traces (root runs) for a single tracing project. Each item carries
 * the trace's root run plus optional trace-wide aggregates (`total_tokens`, `total_cost`,
 * `first_token_time`) under `trace_aggregates`, so clients never have to merge by `trace_id`.
 *
 * Traces are scanned within a `start_time` window: `min_start_time` defaults to 24 hours before the
 * request, `max_start_time` defaults to the request time. Set either explicitly to widen or narrow
 * the window.
 *
 * Supports filters (`trace_filter`, `tree_filter`), cursor pagination (`cursor`), and field
 * projection (`selects`).
 */
class TraceQueryParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * `cursor` is the opaque string returned in a previous response's `next_cursor`.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cursor(): Optional<String> = body.cursor()

    /**
     * `max_start_time` is the exclusive upper bound for the root-run start time scan (RFC3339).
     * Defaults to the request time when omitted.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxStartTime(): Optional<OffsetDateTime> = body.maxStartTime()

    /**
     * `min_start_time` is the inclusive lower bound for the root-run start time scan (RFC3339).
     * Defaults to 24 hours before the request when omitted.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minStartTime(): Optional<OffsetDateTime> = body.minStartTime()

    /**
     * `page_size` is the maximum number of traces to return per page. Defaults to 20; must be
     * between 1 and 100 when set.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageSize(): Optional<Long> = body.pageSize()

    /**
     * `project_id` is the UUID of the tracing project that owns the traces. Required.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun projectId(): Optional<String> = body.projectId()

    /**
     * `selects` lists which properties to include on each returned trace. Properties listed here
     * are routed to the appropriate sub-object on each item: `total_tokens`, `total_cost`, and
     * `first_token_time` appear under `trace_aggregates`; everything else appears under `root_run`.
     * If omitted, only `id` is returned on `root_run`.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun selects(): Optional<List<RunSelectField>> = body.selects()

    /**
     * `trace_filter` narrows results to traces whose root run matches this LangSmith filter
     * expression. This filter targets root runs only — `is_root = true` is implied. See
     * https://docs.langchain.com/langsmith/trace-query-syntax#filter-query-language for syntax.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun traceFilter(): Optional<String> = body.traceFilter()

    /**
     * `trace_ids` is an optional fast-path restriction to a known set of trace UUIDs. Equivalent in
     * result to including each UUID in a `trace_filter`, but more efficient at scale.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun traceIds(): Optional<List<String>> = body.traceIds()

    /**
     * `tree_filter` narrows results to traces containing at least one run anywhere in the run tree
     * (root or descendant) that matches this LangSmith filter expression.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun treeFilter(): Optional<String> = body.treeFilter()

    /**
     * Returns the raw JSON value of [cursor].
     *
     * Unlike [cursor], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cursor(): JsonField<String> = body._cursor()

    /**
     * Returns the raw JSON value of [maxStartTime].
     *
     * Unlike [maxStartTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxStartTime(): JsonField<OffsetDateTime> = body._maxStartTime()

    /**
     * Returns the raw JSON value of [minStartTime].
     *
     * Unlike [minStartTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _minStartTime(): JsonField<OffsetDateTime> = body._minStartTime()

    /**
     * Returns the raw JSON value of [pageSize].
     *
     * Unlike [pageSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pageSize(): JsonField<Long> = body._pageSize()

    /**
     * Returns the raw JSON value of [projectId].
     *
     * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _projectId(): JsonField<String> = body._projectId()

    /**
     * Returns the raw JSON value of [selects].
     *
     * Unlike [selects], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _selects(): JsonField<List<RunSelectField>> = body._selects()

    /**
     * Returns the raw JSON value of [traceFilter].
     *
     * Unlike [traceFilter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _traceFilter(): JsonField<String> = body._traceFilter()

    /**
     * Returns the raw JSON value of [traceIds].
     *
     * Unlike [traceIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _traceIds(): JsonField<List<String>> = body._traceIds()

    /**
     * Returns the raw JSON value of [treeFilter].
     *
     * Unlike [treeFilter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _treeFilter(): JsonField<String> = body._treeFilter()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): TraceQueryParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [TraceQueryParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TraceQueryParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(traceQueryParams: TraceQueryParams) = apply {
            body = traceQueryParams.body.toBuilder()
            additionalHeaders = traceQueryParams.additionalHeaders.toBuilder()
            additionalQueryParams = traceQueryParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [cursor]
         * - [maxStartTime]
         * - [minStartTime]
         * - [pageSize]
         * - [projectId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** `cursor` is the opaque string returned in a previous response's `next_cursor`. */
        fun cursor(cursor: String) = apply { body.cursor(cursor) }

        /**
         * Sets [Builder.cursor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cursor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cursor(cursor: JsonField<String>) = apply { body.cursor(cursor) }

        /**
         * `max_start_time` is the exclusive upper bound for the root-run start time scan (RFC3339).
         * Defaults to the request time when omitted.
         */
        fun maxStartTime(maxStartTime: OffsetDateTime) = apply { body.maxStartTime(maxStartTime) }

        /**
         * Sets [Builder.maxStartTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxStartTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxStartTime(maxStartTime: JsonField<OffsetDateTime>) = apply {
            body.maxStartTime(maxStartTime)
        }

        /**
         * `min_start_time` is the inclusive lower bound for the root-run start time scan (RFC3339).
         * Defaults to 24 hours before the request when omitted.
         */
        fun minStartTime(minStartTime: OffsetDateTime) = apply { body.minStartTime(minStartTime) }

        /**
         * Sets [Builder.minStartTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minStartTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun minStartTime(minStartTime: JsonField<OffsetDateTime>) = apply {
            body.minStartTime(minStartTime)
        }

        /**
         * `page_size` is the maximum number of traces to return per page. Defaults to 20; must be
         * between 1 and 100 when set.
         */
        fun pageSize(pageSize: Long) = apply { body.pageSize(pageSize) }

        /**
         * Sets [Builder.pageSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageSize] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageSize(pageSize: JsonField<Long>) = apply { body.pageSize(pageSize) }

        /** `project_id` is the UUID of the tracing project that owns the traces. Required. */
        fun projectId(projectId: String) = apply { body.projectId(projectId) }

        /**
         * Sets [Builder.projectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectId(projectId: JsonField<String>) = apply { body.projectId(projectId) }

        /**
         * `selects` lists which properties to include on each returned trace. Properties listed
         * here are routed to the appropriate sub-object on each item: `total_tokens`, `total_cost`,
         * and `first_token_time` appear under `trace_aggregates`; everything else appears under
         * `root_run`. If omitted, only `id` is returned on `root_run`.
         */
        fun selects(selects: List<RunSelectField>) = apply { body.selects(selects) }

        /**
         * Sets [Builder.selects] to an arbitrary JSON value.
         *
         * You should usually call [Builder.selects] with a well-typed `List<RunSelectField>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun selects(selects: JsonField<List<RunSelectField>>) = apply { body.selects(selects) }

        /**
         * Adds a single [RunSelectField] to [selects].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSelect(select: RunSelectField) = apply { body.addSelect(select) }

        /**
         * `trace_filter` narrows results to traces whose root run matches this LangSmith filter
         * expression. This filter targets root runs only — `is_root = true` is implied. See
         * https://docs.langchain.com/langsmith/trace-query-syntax#filter-query-language for syntax.
         */
        fun traceFilter(traceFilter: String) = apply { body.traceFilter(traceFilter) }

        /**
         * Sets [Builder.traceFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.traceFilter] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun traceFilter(traceFilter: JsonField<String>) = apply { body.traceFilter(traceFilter) }

        /**
         * `trace_ids` is an optional fast-path restriction to a known set of trace UUIDs.
         * Equivalent in result to including each UUID in a `trace_filter`, but more efficient at
         * scale.
         */
        fun traceIds(traceIds: List<String>) = apply { body.traceIds(traceIds) }

        /**
         * Sets [Builder.traceIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.traceIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun traceIds(traceIds: JsonField<List<String>>) = apply { body.traceIds(traceIds) }

        /**
         * Adds a single [String] to [traceIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTraceId(traceId: String) = apply { body.addTraceId(traceId) }

        /**
         * `tree_filter` narrows results to traces containing at least one run anywhere in the run
         * tree (root or descendant) that matches this LangSmith filter expression.
         */
        fun treeFilter(treeFilter: String) = apply { body.treeFilter(treeFilter) }

        /**
         * Sets [Builder.treeFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.treeFilter] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun treeFilter(treeFilter: JsonField<String>) = apply { body.treeFilter(treeFilter) }

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
         * Returns an immutable instance of [TraceQueryParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TraceQueryParams =
            TraceQueryParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val cursor: JsonField<String>,
        private val maxStartTime: JsonField<OffsetDateTime>,
        private val minStartTime: JsonField<OffsetDateTime>,
        private val pageSize: JsonField<Long>,
        private val projectId: JsonField<String>,
        private val selects: JsonField<List<RunSelectField>>,
        private val traceFilter: JsonField<String>,
        private val traceIds: JsonField<List<String>>,
        private val treeFilter: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cursor") @ExcludeMissing cursor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_start_time")
            @ExcludeMissing
            maxStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("min_start_time")
            @ExcludeMissing
            minStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("page_size") @ExcludeMissing pageSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("project_id")
            @ExcludeMissing
            projectId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("selects")
            @ExcludeMissing
            selects: JsonField<List<RunSelectField>> = JsonMissing.of(),
            @JsonProperty("trace_filter")
            @ExcludeMissing
            traceFilter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("trace_ids")
            @ExcludeMissing
            traceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("tree_filter")
            @ExcludeMissing
            treeFilter: JsonField<String> = JsonMissing.of(),
        ) : this(
            cursor,
            maxStartTime,
            minStartTime,
            pageSize,
            projectId,
            selects,
            traceFilter,
            traceIds,
            treeFilter,
            mutableMapOf(),
        )

        /**
         * `cursor` is the opaque string returned in a previous response's `next_cursor`.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cursor(): Optional<String> = cursor.getOptional("cursor")

        /**
         * `max_start_time` is the exclusive upper bound for the root-run start time scan (RFC3339).
         * Defaults to the request time when omitted.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun maxStartTime(): Optional<OffsetDateTime> = maxStartTime.getOptional("max_start_time")

        /**
         * `min_start_time` is the inclusive lower bound for the root-run start time scan (RFC3339).
         * Defaults to 24 hours before the request when omitted.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun minStartTime(): Optional<OffsetDateTime> = minStartTime.getOptional("min_start_time")

        /**
         * `page_size` is the maximum number of traces to return per page. Defaults to 20; must be
         * between 1 and 100 when set.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pageSize(): Optional<Long> = pageSize.getOptional("page_size")

        /**
         * `project_id` is the UUID of the tracing project that owns the traces. Required.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun projectId(): Optional<String> = projectId.getOptional("project_id")

        /**
         * `selects` lists which properties to include on each returned trace. Properties listed
         * here are routed to the appropriate sub-object on each item: `total_tokens`, `total_cost`,
         * and `first_token_time` appear under `trace_aggregates`; everything else appears under
         * `root_run`. If omitted, only `id` is returned on `root_run`.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun selects(): Optional<List<RunSelectField>> = selects.getOptional("selects")

        /**
         * `trace_filter` narrows results to traces whose root run matches this LangSmith filter
         * expression. This filter targets root runs only — `is_root = true` is implied. See
         * https://docs.langchain.com/langsmith/trace-query-syntax#filter-query-language for syntax.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun traceFilter(): Optional<String> = traceFilter.getOptional("trace_filter")

        /**
         * `trace_ids` is an optional fast-path restriction to a known set of trace UUIDs.
         * Equivalent in result to including each UUID in a `trace_filter`, but more efficient at
         * scale.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun traceIds(): Optional<List<String>> = traceIds.getOptional("trace_ids")

        /**
         * `tree_filter` narrows results to traces containing at least one run anywhere in the run
         * tree (root or descendant) that matches this LangSmith filter expression.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun treeFilter(): Optional<String> = treeFilter.getOptional("tree_filter")

        /**
         * Returns the raw JSON value of [cursor].
         *
         * Unlike [cursor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cursor") @ExcludeMissing fun _cursor(): JsonField<String> = cursor

        /**
         * Returns the raw JSON value of [maxStartTime].
         *
         * Unlike [maxStartTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("max_start_time")
        @ExcludeMissing
        fun _maxStartTime(): JsonField<OffsetDateTime> = maxStartTime

        /**
         * Returns the raw JSON value of [minStartTime].
         *
         * Unlike [minStartTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("min_start_time")
        @ExcludeMissing
        fun _minStartTime(): JsonField<OffsetDateTime> = minStartTime

        /**
         * Returns the raw JSON value of [pageSize].
         *
         * Unlike [pageSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_size") @ExcludeMissing fun _pageSize(): JsonField<Long> = pageSize

        /**
         * Returns the raw JSON value of [projectId].
         *
         * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("project_id") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

        /**
         * Returns the raw JSON value of [selects].
         *
         * Unlike [selects], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("selects")
        @ExcludeMissing
        fun _selects(): JsonField<List<RunSelectField>> = selects

        /**
         * Returns the raw JSON value of [traceFilter].
         *
         * Unlike [traceFilter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trace_filter")
        @ExcludeMissing
        fun _traceFilter(): JsonField<String> = traceFilter

        /**
         * Returns the raw JSON value of [traceIds].
         *
         * Unlike [traceIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trace_ids")
        @ExcludeMissing
        fun _traceIds(): JsonField<List<String>> = traceIds

        /**
         * Returns the raw JSON value of [treeFilter].
         *
         * Unlike [treeFilter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tree_filter")
        @ExcludeMissing
        fun _treeFilter(): JsonField<String> = treeFilter

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

            private var cursor: JsonField<String> = JsonMissing.of()
            private var maxStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var minStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var pageSize: JsonField<Long> = JsonMissing.of()
            private var projectId: JsonField<String> = JsonMissing.of()
            private var selects: JsonField<MutableList<RunSelectField>>? = null
            private var traceFilter: JsonField<String> = JsonMissing.of()
            private var traceIds: JsonField<MutableList<String>>? = null
            private var treeFilter: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                cursor = body.cursor
                maxStartTime = body.maxStartTime
                minStartTime = body.minStartTime
                pageSize = body.pageSize
                projectId = body.projectId
                selects = body.selects.map { it.toMutableList() }
                traceFilter = body.traceFilter
                traceIds = body.traceIds.map { it.toMutableList() }
                treeFilter = body.treeFilter
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** `cursor` is the opaque string returned in a previous response's `next_cursor`. */
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
             * `max_start_time` is the exclusive upper bound for the root-run start time scan
             * (RFC3339). Defaults to the request time when omitted.
             */
            fun maxStartTime(maxStartTime: OffsetDateTime) =
                maxStartTime(JsonField.of(maxStartTime))

            /**
             * Sets [Builder.maxStartTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxStartTime] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun maxStartTime(maxStartTime: JsonField<OffsetDateTime>) = apply {
                this.maxStartTime = maxStartTime
            }

            /**
             * `min_start_time` is the inclusive lower bound for the root-run start time scan
             * (RFC3339). Defaults to 24 hours before the request when omitted.
             */
            fun minStartTime(minStartTime: OffsetDateTime) =
                minStartTime(JsonField.of(minStartTime))

            /**
             * Sets [Builder.minStartTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minStartTime] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun minStartTime(minStartTime: JsonField<OffsetDateTime>) = apply {
                this.minStartTime = minStartTime
            }

            /**
             * `page_size` is the maximum number of traces to return per page. Defaults to 20; must
             * be between 1 and 100 when set.
             */
            fun pageSize(pageSize: Long) = pageSize(JsonField.of(pageSize))

            /**
             * Sets [Builder.pageSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageSize] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageSize(pageSize: JsonField<Long>) = apply { this.pageSize = pageSize }

            /** `project_id` is the UUID of the tracing project that owns the traces. Required. */
            fun projectId(projectId: String) = projectId(JsonField.of(projectId))

            /**
             * Sets [Builder.projectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.projectId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

            /**
             * `selects` lists which properties to include on each returned trace. Properties listed
             * here are routed to the appropriate sub-object on each item: `total_tokens`,
             * `total_cost`, and `first_token_time` appear under `trace_aggregates`; everything else
             * appears under `root_run`. If omitted, only `id` is returned on `root_run`.
             */
            fun selects(selects: List<RunSelectField>) = selects(JsonField.of(selects))

            /**
             * Sets [Builder.selects] to an arbitrary JSON value.
             *
             * You should usually call [Builder.selects] with a well-typed `List<RunSelectField>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun selects(selects: JsonField<List<RunSelectField>>) = apply {
                this.selects = selects.map { it.toMutableList() }
            }

            /**
             * Adds a single [RunSelectField] to [selects].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSelect(select: RunSelectField) = apply {
                selects =
                    (selects ?: JsonField.of(mutableListOf())).also {
                        checkKnown("selects", it).add(select)
                    }
            }

            /**
             * `trace_filter` narrows results to traces whose root run matches this LangSmith filter
             * expression. This filter targets root runs only — `is_root = true` is implied. See
             * https://docs.langchain.com/langsmith/trace-query-syntax#filter-query-language for
             * syntax.
             */
            fun traceFilter(traceFilter: String) = traceFilter(JsonField.of(traceFilter))

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

            /**
             * `trace_ids` is an optional fast-path restriction to a known set of trace UUIDs.
             * Equivalent in result to including each UUID in a `trace_filter`, but more efficient
             * at scale.
             */
            fun traceIds(traceIds: List<String>) = traceIds(JsonField.of(traceIds))

            /**
             * Sets [Builder.traceIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.traceIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun traceIds(traceIds: JsonField<List<String>>) = apply {
                this.traceIds = traceIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [traceIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTraceId(traceId: String) = apply {
                traceIds =
                    (traceIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("traceIds", it).add(traceId)
                    }
            }

            /**
             * `tree_filter` narrows results to traces containing at least one run anywhere in the
             * run tree (root or descendant) that matches this LangSmith filter expression.
             */
            fun treeFilter(treeFilter: String) = treeFilter(JsonField.of(treeFilter))

            /**
             * Sets [Builder.treeFilter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.treeFilter] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun treeFilter(treeFilter: JsonField<String>) = apply { this.treeFilter = treeFilter }

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
                    cursor,
                    maxStartTime,
                    minStartTime,
                    pageSize,
                    projectId,
                    (selects ?: JsonMissing.of()).map { it.toImmutable() },
                    traceFilter,
                    (traceIds ?: JsonMissing.of()).map { it.toImmutable() },
                    treeFilter,
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

            cursor()
            maxStartTime()
            minStartTime()
            pageSize()
            projectId()
            selects().ifPresent { it.forEach { it.validate() } }
            traceFilter()
            traceIds()
            treeFilter()
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
            (if (cursor.asKnown().isPresent) 1 else 0) +
                (if (maxStartTime.asKnown().isPresent) 1 else 0) +
                (if (minStartTime.asKnown().isPresent) 1 else 0) +
                (if (pageSize.asKnown().isPresent) 1 else 0) +
                (if (projectId.asKnown().isPresent) 1 else 0) +
                (selects.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (traceFilter.asKnown().isPresent) 1 else 0) +
                (traceIds.asKnown().getOrNull()?.size ?: 0) +
                (if (treeFilter.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                cursor == other.cursor &&
                maxStartTime == other.maxStartTime &&
                minStartTime == other.minStartTime &&
                pageSize == other.pageSize &&
                projectId == other.projectId &&
                selects == other.selects &&
                traceFilter == other.traceFilter &&
                traceIds == other.traceIds &&
                treeFilter == other.treeFilter &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                cursor,
                maxStartTime,
                minStartTime,
                pageSize,
                projectId,
                selects,
                traceFilter,
                traceIds,
                treeFilter,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{cursor=$cursor, maxStartTime=$maxStartTime, minStartTime=$minStartTime, pageSize=$pageSize, projectId=$projectId, selects=$selects, traceFilter=$traceFilter, traceIds=$traceIds, treeFilter=$treeFilter, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TraceQueryParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TraceQueryParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

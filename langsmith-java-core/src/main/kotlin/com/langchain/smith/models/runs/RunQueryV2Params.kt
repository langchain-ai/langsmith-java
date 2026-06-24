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
import com.langchain.smith.core.Params
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * **Alpha:** The request and response contract may change; Returns a paginated list of runs for the
 * given projects within min/max start_time. Supports filters, cursor pagination, and `selects` to
 * select fields to return.
 */
class RunQueryV2Params
private constructor(
    private val accept: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun accept(): Optional<String> = Optional.ofNullable(accept)

    /**
     * `cursor` is the opaque string from a previous response's `next_cursor`. Treat it as opaque
     * and pass it back unmodified.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cursor(): Optional<String> = body.cursor()

    /**
     * `filter` narrows results to runs matching this LangSmith filter expression, evaluated against
     * each individual run. For example: and(eq(run_type, "llm"), gt(latency, 5)) or eq(status,
     * "error"). See https://docs.langchain.com/langsmith/trace-query-syntax#filter-query-language
     * for syntax.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filter(): Optional<String> = body.filter()

    /**
     * `has_error` filters to runs that errored (true) or completed without error (false).
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hasError(): Optional<Boolean> = body.hasError()

    /**
     * `ids` optionally limits the request to these run UUIDs.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ids(): Optional<List<String>> = body.ids()

    /**
     * `is_root` returns only root runs (true) or only non-root runs (false).
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isRoot(): Optional<Boolean> = body.isRoot()

    /**
     * `max_start_time` is the upper bound for run `start_time` (RFC3339). Defaults to now.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxStartTime(): Optional<OffsetDateTime> = body.maxStartTime()

    /**
     * `min_start_time` is the lower bound for run `start_time` (RFC3339). Defaults to 1 day ago.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minStartTime(): Optional<OffsetDateTime> = body.minStartTime()

    /**
     * `page_size` is the maximum number of runs to return in this response. Defaults to 100 when
     * omitted; must be between 1 and 1000 inclusive when set.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageSize(): Optional<Long> = body.pageSize()

    /**
     * `project_ids` lists tracing project UUIDs to query. Required unless `reference_dataset_id` is
     * set. Mutually exclusive with `reference_dataset_id` — set exactly one of them.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun projectIds(): Optional<List<String>> = body.projectIds()

    /**
     * `reference_dataset_id` resolves session IDs server-side from the dataset. Required unless
     * `project_ids` is set. Mutually exclusive with `project_ids` — set exactly one of them. When
     * provided and `min_start_time` is omitted, the server derives it from the earliest session
     * creation date.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referenceDatasetId(): Optional<String> = body.referenceDatasetId()

    /**
     * `reference_examples` optionally limits to runs linked to these dataset example UUIDs.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referenceExamples(): Optional<List<String>> = body.referenceExamples()

    /**
     * `run_type`, when set, restricts results to runs whose `run_type` equals this value.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runType(): Optional<RunType> = body.runType()

    /**
     * `selects` lists which properties to include on each returned run. If omitted, only `id` is
     * returned. Properties not listed are omitted from each run object.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun selects(): Optional<List<Select>> = body.selects()

    /**
     * `trace_filter` narrows results to runs whose root trace matches this LangSmith filter
     * expression. Use this to filter by properties of the trace's root run — for example eq(status,
     * "success") to include only traces that completed without error. See
     * https://docs.langchain.com/langsmith/trace-query-syntax#filter-query-language for syntax.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun traceFilter(): Optional<String> = body.traceFilter()

    /**
     * `trace_id` optionally limits results to runs belonging to this trace UUID.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun traceId(): Optional<String> = body.traceId()

    /**
     * `tree_filter` narrows results to runs that belong to a trace containing at least one run
     * matching this LangSmith filter expression anywhere in the run tree (not just the root). Use
     * this to find runs inside traces that involved a specific tool, tag, or model — for example
     * has(tags, "production") or eq(name, "my_tool"). See
     * https://docs.langchain.com/langsmith/trace-query-syntax#filter-query-language for syntax.
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
     * Returns the raw JSON value of [filter].
     *
     * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _filter(): JsonField<String> = body._filter()

    /**
     * Returns the raw JSON value of [hasError].
     *
     * Unlike [hasError], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _hasError(): JsonField<Boolean> = body._hasError()

    /**
     * Returns the raw JSON value of [ids].
     *
     * Unlike [ids], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _ids(): JsonField<List<String>> = body._ids()

    /**
     * Returns the raw JSON value of [isRoot].
     *
     * Unlike [isRoot], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _isRoot(): JsonField<Boolean> = body._isRoot()

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
     * Returns the raw JSON value of [projectIds].
     *
     * Unlike [projectIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _projectIds(): JsonField<List<String>> = body._projectIds()

    /**
     * Returns the raw JSON value of [referenceDatasetId].
     *
     * Unlike [referenceDatasetId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _referenceDatasetId(): JsonField<String> = body._referenceDatasetId()

    /**
     * Returns the raw JSON value of [referenceExamples].
     *
     * Unlike [referenceExamples], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _referenceExamples(): JsonField<List<String>> = body._referenceExamples()

    /**
     * Returns the raw JSON value of [runType].
     *
     * Unlike [runType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _runType(): JsonField<RunType> = body._runType()

    /**
     * Returns the raw JSON value of [selects].
     *
     * Unlike [selects], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _selects(): JsonField<List<Select>> = body._selects()

    /**
     * Returns the raw JSON value of [traceFilter].
     *
     * Unlike [traceFilter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _traceFilter(): JsonField<String> = body._traceFilter()

    /**
     * Returns the raw JSON value of [traceId].
     *
     * Unlike [traceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _traceId(): JsonField<String> = body._traceId()

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

        @JvmStatic fun none(): RunQueryV2Params = builder().build()

        /** Returns a mutable builder for constructing an instance of [RunQueryV2Params]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RunQueryV2Params]. */
    class Builder internal constructor() {

        private var accept: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(runQueryV2Params: RunQueryV2Params) = apply {
            accept = runQueryV2Params.accept
            body = runQueryV2Params.body.toBuilder()
            additionalHeaders = runQueryV2Params.additionalHeaders.toBuilder()
            additionalQueryParams = runQueryV2Params.additionalQueryParams.toBuilder()
        }

        fun accept(accept: String?) = apply { this.accept = accept }

        /** Alias for calling [Builder.accept] with `accept.orElse(null)`. */
        fun accept(accept: Optional<String>) = accept(accept.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [cursor]
         * - [filter]
         * - [hasError]
         * - [ids]
         * - [isRoot]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * `cursor` is the opaque string from a previous response's `next_cursor`. Treat it as
         * opaque and pass it back unmodified.
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
         * `filter` narrows results to runs matching this LangSmith filter expression, evaluated
         * against each individual run. For example: and(eq(run_type, "llm"), gt(latency, 5)) or
         * eq(status, "error"). See
         * https://docs.langchain.com/langsmith/trace-query-syntax#filter-query-language for syntax.
         */
        fun filter(filter: String) = apply { body.filter(filter) }

        /**
         * Sets [Builder.filter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filter] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filter(filter: JsonField<String>) = apply { body.filter(filter) }

        /** `has_error` filters to runs that errored (true) or completed without error (false). */
        fun hasError(hasError: Boolean) = apply { body.hasError(hasError) }

        /**
         * Sets [Builder.hasError] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasError] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hasError(hasError: JsonField<Boolean>) = apply { body.hasError(hasError) }

        /** `ids` optionally limits the request to these run UUIDs. */
        fun ids(ids: List<String>) = apply { body.ids(ids) }

        /**
         * Sets [Builder.ids] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ids] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ids(ids: JsonField<List<String>>) = apply { body.ids(ids) }

        /**
         * Adds a single [String] to [ids].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addId(id: String) = apply { body.addId(id) }

        /** `is_root` returns only root runs (true) or only non-root runs (false). */
        fun isRoot(isRoot: Boolean) = apply { body.isRoot(isRoot) }

        /**
         * Sets [Builder.isRoot] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isRoot] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun isRoot(isRoot: JsonField<Boolean>) = apply { body.isRoot(isRoot) }

        /** `max_start_time` is the upper bound for run `start_time` (RFC3339). Defaults to now. */
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
         * `min_start_time` is the lower bound for run `start_time` (RFC3339). Defaults to 1 day
         * ago.
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
         * `page_size` is the maximum number of runs to return in this response. Defaults to 100
         * when omitted; must be between 1 and 1000 inclusive when set.
         */
        fun pageSize(pageSize: Long) = apply { body.pageSize(pageSize) }

        /**
         * Sets [Builder.pageSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageSize] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageSize(pageSize: JsonField<Long>) = apply { body.pageSize(pageSize) }

        /**
         * `project_ids` lists tracing project UUIDs to query. Required unless
         * `reference_dataset_id` is set. Mutually exclusive with `reference_dataset_id` — set
         * exactly one of them.
         */
        fun projectIds(projectIds: List<String>) = apply { body.projectIds(projectIds) }

        /**
         * Sets [Builder.projectIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun projectIds(projectIds: JsonField<List<String>>) = apply { body.projectIds(projectIds) }

        /**
         * Adds a single [String] to [projectIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProjectId(projectId: String) = apply { body.addProjectId(projectId) }

        /**
         * `reference_dataset_id` resolves session IDs server-side from the dataset. Required unless
         * `project_ids` is set. Mutually exclusive with `project_ids` — set exactly one of them.
         * When provided and `min_start_time` is omitted, the server derives it from the earliest
         * session creation date.
         */
        fun referenceDatasetId(referenceDatasetId: String) = apply {
            body.referenceDatasetId(referenceDatasetId)
        }

        /**
         * Sets [Builder.referenceDatasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceDatasetId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referenceDatasetId(referenceDatasetId: JsonField<String>) = apply {
            body.referenceDatasetId(referenceDatasetId)
        }

        /** `reference_examples` optionally limits to runs linked to these dataset example UUIDs. */
        fun referenceExamples(referenceExamples: List<String>) = apply {
            body.referenceExamples(referenceExamples)
        }

        /**
         * Sets [Builder.referenceExamples] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceExamples] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun referenceExamples(referenceExamples: JsonField<List<String>>) = apply {
            body.referenceExamples(referenceExamples)
        }

        /**
         * Adds a single [String] to [referenceExamples].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReferenceExample(referenceExample: String) = apply {
            body.addReferenceExample(referenceExample)
        }

        /** `run_type`, when set, restricts results to runs whose `run_type` equals this value. */
        fun runType(runType: RunType) = apply { body.runType(runType) }

        /**
         * Sets [Builder.runType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runType] with a well-typed [RunType] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun runType(runType: JsonField<RunType>) = apply { body.runType(runType) }

        /**
         * `selects` lists which properties to include on each returned run. If omitted, only `id`
         * is returned. Properties not listed are omitted from each run object.
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

        /**
         * `trace_filter` narrows results to runs whose root trace matches this LangSmith filter
         * expression. Use this to filter by properties of the trace's root run — for example
         * eq(status, "success") to include only traces that completed without error. See
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

        /** `trace_id` optionally limits results to runs belonging to this trace UUID. */
        fun traceId(traceId: String) = apply { body.traceId(traceId) }

        /**
         * Sets [Builder.traceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.traceId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun traceId(traceId: JsonField<String>) = apply { body.traceId(traceId) }

        /**
         * `tree_filter` narrows results to runs that belong to a trace containing at least one run
         * matching this LangSmith filter expression anywhere in the run tree (not just the root).
         * Use this to find runs inside traces that involved a specific tool, tag, or model — for
         * example has(tags, "production") or eq(name, "my_tool"). See
         * https://docs.langchain.com/langsmith/trace-query-syntax#filter-query-language for syntax.
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
         * Returns an immutable instance of [RunQueryV2Params].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RunQueryV2Params =
            RunQueryV2Params(
                accept,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                accept?.let { put("Accept", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val cursor: JsonField<String>,
        private val filter: JsonField<String>,
        private val hasError: JsonField<Boolean>,
        private val ids: JsonField<List<String>>,
        private val isRoot: JsonField<Boolean>,
        private val maxStartTime: JsonField<OffsetDateTime>,
        private val minStartTime: JsonField<OffsetDateTime>,
        private val pageSize: JsonField<Long>,
        private val projectIds: JsonField<List<String>>,
        private val referenceDatasetId: JsonField<String>,
        private val referenceExamples: JsonField<List<String>>,
        private val runType: JsonField<RunType>,
        private val selects: JsonField<List<Select>>,
        private val traceFilter: JsonField<String>,
        private val traceId: JsonField<String>,
        private val treeFilter: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cursor") @ExcludeMissing cursor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("filter") @ExcludeMissing filter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("has_error")
            @ExcludeMissing
            hasError: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("ids") @ExcludeMissing ids: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("is_root") @ExcludeMissing isRoot: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("max_start_time")
            @ExcludeMissing
            maxStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("min_start_time")
            @ExcludeMissing
            minStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("page_size") @ExcludeMissing pageSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("project_ids")
            @ExcludeMissing
            projectIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("reference_dataset_id")
            @ExcludeMissing
            referenceDatasetId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reference_examples")
            @ExcludeMissing
            referenceExamples: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("run_type")
            @ExcludeMissing
            runType: JsonField<RunType> = JsonMissing.of(),
            @JsonProperty("selects")
            @ExcludeMissing
            selects: JsonField<List<Select>> = JsonMissing.of(),
            @JsonProperty("trace_filter")
            @ExcludeMissing
            traceFilter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("trace_id") @ExcludeMissing traceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tree_filter")
            @ExcludeMissing
            treeFilter: JsonField<String> = JsonMissing.of(),
        ) : this(
            cursor,
            filter,
            hasError,
            ids,
            isRoot,
            maxStartTime,
            minStartTime,
            pageSize,
            projectIds,
            referenceDatasetId,
            referenceExamples,
            runType,
            selects,
            traceFilter,
            traceId,
            treeFilter,
            mutableMapOf(),
        )

        /**
         * `cursor` is the opaque string from a previous response's `next_cursor`. Treat it as
         * opaque and pass it back unmodified.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cursor(): Optional<String> = cursor.getOptional("cursor")

        /**
         * `filter` narrows results to runs matching this LangSmith filter expression, evaluated
         * against each individual run. For example: and(eq(run_type, "llm"), gt(latency, 5)) or
         * eq(status, "error"). See
         * https://docs.langchain.com/langsmith/trace-query-syntax#filter-query-language for syntax.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun filter(): Optional<String> = filter.getOptional("filter")

        /**
         * `has_error` filters to runs that errored (true) or completed without error (false).
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun hasError(): Optional<Boolean> = hasError.getOptional("has_error")

        /**
         * `ids` optionally limits the request to these run UUIDs.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun ids(): Optional<List<String>> = ids.getOptional("ids")

        /**
         * `is_root` returns only root runs (true) or only non-root runs (false).
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun isRoot(): Optional<Boolean> = isRoot.getOptional("is_root")

        /**
         * `max_start_time` is the upper bound for run `start_time` (RFC3339). Defaults to now.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun maxStartTime(): Optional<OffsetDateTime> = maxStartTime.getOptional("max_start_time")

        /**
         * `min_start_time` is the lower bound for run `start_time` (RFC3339). Defaults to 1 day
         * ago.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun minStartTime(): Optional<OffsetDateTime> = minStartTime.getOptional("min_start_time")

        /**
         * `page_size` is the maximum number of runs to return in this response. Defaults to 100
         * when omitted; must be between 1 and 1000 inclusive when set.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pageSize(): Optional<Long> = pageSize.getOptional("page_size")

        /**
         * `project_ids` lists tracing project UUIDs to query. Required unless
         * `reference_dataset_id` is set. Mutually exclusive with `reference_dataset_id` — set
         * exactly one of them.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun projectIds(): Optional<List<String>> = projectIds.getOptional("project_ids")

        /**
         * `reference_dataset_id` resolves session IDs server-side from the dataset. Required unless
         * `project_ids` is set. Mutually exclusive with `project_ids` — set exactly one of them.
         * When provided and `min_start_time` is omitted, the server derives it from the earliest
         * session creation date.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun referenceDatasetId(): Optional<String> =
            referenceDatasetId.getOptional("reference_dataset_id")

        /**
         * `reference_examples` optionally limits to runs linked to these dataset example UUIDs.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun referenceExamples(): Optional<List<String>> =
            referenceExamples.getOptional("reference_examples")

        /**
         * `run_type`, when set, restricts results to runs whose `run_type` equals this value.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun runType(): Optional<RunType> = runType.getOptional("run_type")

        /**
         * `selects` lists which properties to include on each returned run. If omitted, only `id`
         * is returned. Properties not listed are omitted from each run object.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun selects(): Optional<List<Select>> = selects.getOptional("selects")

        /**
         * `trace_filter` narrows results to runs whose root trace matches this LangSmith filter
         * expression. Use this to filter by properties of the trace's root run — for example
         * eq(status, "success") to include only traces that completed without error. See
         * https://docs.langchain.com/langsmith/trace-query-syntax#filter-query-language for syntax.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun traceFilter(): Optional<String> = traceFilter.getOptional("trace_filter")

        /**
         * `trace_id` optionally limits results to runs belonging to this trace UUID.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun traceId(): Optional<String> = traceId.getOptional("trace_id")

        /**
         * `tree_filter` narrows results to runs that belong to a trace containing at least one run
         * matching this LangSmith filter expression anywhere in the run tree (not just the root).
         * Use this to find runs inside traces that involved a specific tool, tag, or model — for
         * example has(tags, "production") or eq(name, "my_tool"). See
         * https://docs.langchain.com/langsmith/trace-query-syntax#filter-query-language for syntax.
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
         * Returns the raw JSON value of [filter].
         *
         * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

        /**
         * Returns the raw JSON value of [hasError].
         *
         * Unlike [hasError], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("has_error") @ExcludeMissing fun _hasError(): JsonField<Boolean> = hasError

        /**
         * Returns the raw JSON value of [ids].
         *
         * Unlike [ids], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ids") @ExcludeMissing fun _ids(): JsonField<List<String>> = ids

        /**
         * Returns the raw JSON value of [isRoot].
         *
         * Unlike [isRoot], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_root") @ExcludeMissing fun _isRoot(): JsonField<Boolean> = isRoot

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
         * Returns the raw JSON value of [projectIds].
         *
         * Unlike [projectIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("project_ids")
        @ExcludeMissing
        fun _projectIds(): JsonField<List<String>> = projectIds

        /**
         * Returns the raw JSON value of [referenceDatasetId].
         *
         * Unlike [referenceDatasetId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("reference_dataset_id")
        @ExcludeMissing
        fun _referenceDatasetId(): JsonField<String> = referenceDatasetId

        /**
         * Returns the raw JSON value of [referenceExamples].
         *
         * Unlike [referenceExamples], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("reference_examples")
        @ExcludeMissing
        fun _referenceExamples(): JsonField<List<String>> = referenceExamples

        /**
         * Returns the raw JSON value of [runType].
         *
         * Unlike [runType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("run_type") @ExcludeMissing fun _runType(): JsonField<RunType> = runType

        /**
         * Returns the raw JSON value of [selects].
         *
         * Unlike [selects], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("selects") @ExcludeMissing fun _selects(): JsonField<List<Select>> = selects

        /**
         * Returns the raw JSON value of [traceFilter].
         *
         * Unlike [traceFilter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trace_filter")
        @ExcludeMissing
        fun _traceFilter(): JsonField<String> = traceFilter

        /**
         * Returns the raw JSON value of [traceId].
         *
         * Unlike [traceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trace_id") @ExcludeMissing fun _traceId(): JsonField<String> = traceId

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
            private var filter: JsonField<String> = JsonMissing.of()
            private var hasError: JsonField<Boolean> = JsonMissing.of()
            private var ids: JsonField<MutableList<String>>? = null
            private var isRoot: JsonField<Boolean> = JsonMissing.of()
            private var maxStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var minStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var pageSize: JsonField<Long> = JsonMissing.of()
            private var projectIds: JsonField<MutableList<String>>? = null
            private var referenceDatasetId: JsonField<String> = JsonMissing.of()
            private var referenceExamples: JsonField<MutableList<String>>? = null
            private var runType: JsonField<RunType> = JsonMissing.of()
            private var selects: JsonField<MutableList<Select>>? = null
            private var traceFilter: JsonField<String> = JsonMissing.of()
            private var traceId: JsonField<String> = JsonMissing.of()
            private var treeFilter: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                cursor = body.cursor
                filter = body.filter
                hasError = body.hasError
                ids = body.ids.map { it.toMutableList() }
                isRoot = body.isRoot
                maxStartTime = body.maxStartTime
                minStartTime = body.minStartTime
                pageSize = body.pageSize
                projectIds = body.projectIds.map { it.toMutableList() }
                referenceDatasetId = body.referenceDatasetId
                referenceExamples = body.referenceExamples.map { it.toMutableList() }
                runType = body.runType
                selects = body.selects.map { it.toMutableList() }
                traceFilter = body.traceFilter
                traceId = body.traceId
                treeFilter = body.treeFilter
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * `cursor` is the opaque string from a previous response's `next_cursor`. Treat it as
             * opaque and pass it back unmodified.
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
             * `filter` narrows results to runs matching this LangSmith filter expression, evaluated
             * against each individual run. For example: and(eq(run_type, "llm"), gt(latency, 5)) or
             * eq(status, "error"). See
             * https://docs.langchain.com/langsmith/trace-query-syntax#filter-query-language for
             * syntax.
             */
            fun filter(filter: String) = filter(JsonField.of(filter))

            /**
             * Sets [Builder.filter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filter] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filter(filter: JsonField<String>) = apply { this.filter = filter }

            /**
             * `has_error` filters to runs that errored (true) or completed without error (false).
             */
            fun hasError(hasError: Boolean) = hasError(JsonField.of(hasError))

            /**
             * Sets [Builder.hasError] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hasError] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hasError(hasError: JsonField<Boolean>) = apply { this.hasError = hasError }

            /** `ids` optionally limits the request to these run UUIDs. */
            fun ids(ids: List<String>) = ids(JsonField.of(ids))

            /**
             * Sets [Builder.ids] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ids] with a well-typed `List<String>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ids(ids: JsonField<List<String>>) = apply {
                this.ids = ids.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [ids].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addId(id: String) = apply {
                ids = (ids ?: JsonField.of(mutableListOf())).also { checkKnown("ids", it).add(id) }
            }

            /** `is_root` returns only root runs (true) or only non-root runs (false). */
            fun isRoot(isRoot: Boolean) = isRoot(JsonField.of(isRoot))

            /**
             * Sets [Builder.isRoot] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isRoot] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isRoot(isRoot: JsonField<Boolean>) = apply { this.isRoot = isRoot }

            /**
             * `max_start_time` is the upper bound for run `start_time` (RFC3339). Defaults to now.
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
             * `min_start_time` is the lower bound for run `start_time` (RFC3339). Defaults to 1 day
             * ago.
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
             * `page_size` is the maximum number of runs to return in this response. Defaults to 100
             * when omitted; must be between 1 and 1000 inclusive when set.
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

            /**
             * `project_ids` lists tracing project UUIDs to query. Required unless
             * `reference_dataset_id` is set. Mutually exclusive with `reference_dataset_id` — set
             * exactly one of them.
             */
            fun projectIds(projectIds: List<String>) = projectIds(JsonField.of(projectIds))

            /**
             * Sets [Builder.projectIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.projectIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun projectIds(projectIds: JsonField<List<String>>) = apply {
                this.projectIds = projectIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [projectIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addProjectId(projectId: String) = apply {
                projectIds =
                    (projectIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("projectIds", it).add(projectId)
                    }
            }

            /**
             * `reference_dataset_id` resolves session IDs server-side from the dataset. Required
             * unless `project_ids` is set. Mutually exclusive with `project_ids` — set exactly one
             * of them. When provided and `min_start_time` is omitted, the server derives it from
             * the earliest session creation date.
             */
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
             * `reference_examples` optionally limits to runs linked to these dataset example UUIDs.
             */
            fun referenceExamples(referenceExamples: List<String>) =
                referenceExamples(JsonField.of(referenceExamples))

            /**
             * Sets [Builder.referenceExamples] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referenceExamples] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun referenceExamples(referenceExamples: JsonField<List<String>>) = apply {
                this.referenceExamples = referenceExamples.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [referenceExamples].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addReferenceExample(referenceExample: String) = apply {
                referenceExamples =
                    (referenceExamples ?: JsonField.of(mutableListOf())).also {
                        checkKnown("referenceExamples", it).add(referenceExample)
                    }
            }

            /**
             * `run_type`, when set, restricts results to runs whose `run_type` equals this value.
             */
            fun runType(runType: RunType) = runType(JsonField.of(runType))

            /**
             * Sets [Builder.runType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.runType] with a well-typed [RunType] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun runType(runType: JsonField<RunType>) = apply { this.runType = runType }

            /**
             * `selects` lists which properties to include on each returned run. If omitted, only
             * `id` is returned. Properties not listed are omitted from each run object.
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

            /**
             * `trace_filter` narrows results to runs whose root trace matches this LangSmith filter
             * expression. Use this to filter by properties of the trace's root run — for example
             * eq(status, "success") to include only traces that completed without error. See
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

            /** `trace_id` optionally limits results to runs belonging to this trace UUID. */
            fun traceId(traceId: String) = traceId(JsonField.of(traceId))

            /**
             * Sets [Builder.traceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.traceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun traceId(traceId: JsonField<String>) = apply { this.traceId = traceId }

            /**
             * `tree_filter` narrows results to runs that belong to a trace containing at least one
             * run matching this LangSmith filter expression anywhere in the run tree (not just the
             * root). Use this to find runs inside traces that involved a specific tool, tag, or
             * model — for example has(tags, "production") or eq(name, "my_tool"). See
             * https://docs.langchain.com/langsmith/trace-query-syntax#filter-query-language for
             * syntax.
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
                    filter,
                    hasError,
                    (ids ?: JsonMissing.of()).map { it.toImmutable() },
                    isRoot,
                    maxStartTime,
                    minStartTime,
                    pageSize,
                    (projectIds ?: JsonMissing.of()).map { it.toImmutable() },
                    referenceDatasetId,
                    (referenceExamples ?: JsonMissing.of()).map { it.toImmutable() },
                    runType,
                    (selects ?: JsonMissing.of()).map { it.toImmutable() },
                    traceFilter,
                    traceId,
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
            filter()
            hasError()
            ids()
            isRoot()
            maxStartTime()
            minStartTime()
            pageSize()
            projectIds()
            referenceDatasetId()
            referenceExamples()
            runType().ifPresent { it.validate() }
            selects().ifPresent { it.forEach { it.validate() } }
            traceFilter()
            traceId()
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
                (if (filter.asKnown().isPresent) 1 else 0) +
                (if (hasError.asKnown().isPresent) 1 else 0) +
                (ids.asKnown().getOrNull()?.size ?: 0) +
                (if (isRoot.asKnown().isPresent) 1 else 0) +
                (if (maxStartTime.asKnown().isPresent) 1 else 0) +
                (if (minStartTime.asKnown().isPresent) 1 else 0) +
                (if (pageSize.asKnown().isPresent) 1 else 0) +
                (projectIds.asKnown().getOrNull()?.size ?: 0) +
                (if (referenceDatasetId.asKnown().isPresent) 1 else 0) +
                (referenceExamples.asKnown().getOrNull()?.size ?: 0) +
                (runType.asKnown().getOrNull()?.validity() ?: 0) +
                (selects.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (traceFilter.asKnown().isPresent) 1 else 0) +
                (if (traceId.asKnown().isPresent) 1 else 0) +
                (if (treeFilter.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                cursor == other.cursor &&
                filter == other.filter &&
                hasError == other.hasError &&
                ids == other.ids &&
                isRoot == other.isRoot &&
                maxStartTime == other.maxStartTime &&
                minStartTime == other.minStartTime &&
                pageSize == other.pageSize &&
                projectIds == other.projectIds &&
                referenceDatasetId == other.referenceDatasetId &&
                referenceExamples == other.referenceExamples &&
                runType == other.runType &&
                selects == other.selects &&
                traceFilter == other.traceFilter &&
                traceId == other.traceId &&
                treeFilter == other.treeFilter &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                cursor,
                filter,
                hasError,
                ids,
                isRoot,
                maxStartTime,
                minStartTime,
                pageSize,
                projectIds,
                referenceDatasetId,
                referenceExamples,
                runType,
                selects,
                traceFilter,
                traceId,
                treeFilter,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{cursor=$cursor, filter=$filter, hasError=$hasError, ids=$ids, isRoot=$isRoot, maxStartTime=$maxStartTime, minStartTime=$minStartTime, pageSize=$pageSize, projectIds=$projectIds, referenceDatasetId=$referenceDatasetId, referenceExamples=$referenceExamples, runType=$runType, selects=$selects, traceFilter=$traceFilter, traceId=$traceId, treeFilter=$treeFilter, additionalProperties=$additionalProperties}"
    }

    /** `run_type`, when set, restricts results to runs whose `run_type` equals this value. */
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunQueryV2Params &&
            accept == other.accept &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(accept, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RunQueryV2Params{accept=$accept, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

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

/** Query Runs */
class RunQueryParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<List<String>> = body.id()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cursor(): Optional<String> = body.cursor()

    /**
     * Enum for run data source types.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dataSourceType(): Optional<DataSourceType> = body.dataSourceType()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endTime(): Optional<OffsetDateTime> = body.endTime()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun error(): Optional<Boolean> = body.error()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun executionOrder(): Optional<Long> = body.executionOrder()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filter(): Optional<String> = body.filter()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isRoot(): Optional<Boolean> = body.isRoot()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun limit(): Optional<Long> = body.limit()

    /**
     * Enum for run start date order.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun order(): Optional<Order> = body.order()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parentRun(): Optional<String> = body.parentRun()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun query(): Optional<String> = body.query()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referenceExample(): Optional<List<String>> = body.referenceExample()

    /**
     * Enum for run types.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runType(): Optional<RunType> = body.runType()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun searchFilter(): Optional<String> = body.searchFilter()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun select(): Optional<List<Select>> = body.select()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun session(): Optional<List<String>> = body.session()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun skipPagination(): Optional<Boolean> = body.skipPagination()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun skipPrevCursor(): Optional<Boolean> = body.skipPrevCursor()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startTime(): Optional<OffsetDateTime> = body.startTime()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trace(): Optional<String> = body.trace()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun traceFilter(): Optional<String> = body.traceFilter()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun treeFilter(): Optional<String> = body.treeFilter()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun useExperimentalSearch(): Optional<Boolean> = body.useExperimentalSearch()

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _id(): JsonField<List<String>> = body._id()

    /**
     * Returns the raw JSON value of [cursor].
     *
     * Unlike [cursor], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cursor(): JsonField<String> = body._cursor()

    /**
     * Returns the raw JSON value of [dataSourceType].
     *
     * Unlike [dataSourceType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dataSourceType(): JsonField<DataSourceType> = body._dataSourceType()

    /**
     * Returns the raw JSON value of [endTime].
     *
     * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _endTime(): JsonField<OffsetDateTime> = body._endTime()

    /**
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _error(): JsonField<Boolean> = body._error()

    /**
     * Returns the raw JSON value of [executionOrder].
     *
     * Unlike [executionOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _executionOrder(): JsonField<Long> = body._executionOrder()

    /**
     * Returns the raw JSON value of [filter].
     *
     * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _filter(): JsonField<String> = body._filter()

    /**
     * Returns the raw JSON value of [isRoot].
     *
     * Unlike [isRoot], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _isRoot(): JsonField<Boolean> = body._isRoot()

    /**
     * Returns the raw JSON value of [limit].
     *
     * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _limit(): JsonField<Long> = body._limit()

    /**
     * Returns the raw JSON value of [order].
     *
     * Unlike [order], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _order(): JsonField<Order> = body._order()

    /**
     * Returns the raw JSON value of [parentRun].
     *
     * Unlike [parentRun], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _parentRun(): JsonField<String> = body._parentRun()

    /**
     * Returns the raw JSON value of [query].
     *
     * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _query(): JsonField<String> = body._query()

    /**
     * Returns the raw JSON value of [referenceExample].
     *
     * Unlike [referenceExample], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _referenceExample(): JsonField<List<String>> = body._referenceExample()

    /**
     * Returns the raw JSON value of [runType].
     *
     * Unlike [runType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _runType(): JsonField<RunType> = body._runType()

    /**
     * Returns the raw JSON value of [searchFilter].
     *
     * Unlike [searchFilter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _searchFilter(): JsonField<String> = body._searchFilter()

    /**
     * Returns the raw JSON value of [select].
     *
     * Unlike [select], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _select(): JsonField<List<Select>> = body._select()

    /**
     * Returns the raw JSON value of [session].
     *
     * Unlike [session], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _session(): JsonField<List<String>> = body._session()

    /**
     * Returns the raw JSON value of [skipPagination].
     *
     * Unlike [skipPagination], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _skipPagination(): JsonField<Boolean> = body._skipPagination()

    /**
     * Returns the raw JSON value of [skipPrevCursor].
     *
     * Unlike [skipPrevCursor], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _skipPrevCursor(): JsonField<Boolean> = body._skipPrevCursor()

    /**
     * Returns the raw JSON value of [startTime].
     *
     * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _startTime(): JsonField<OffsetDateTime> = body._startTime()

    /**
     * Returns the raw JSON value of [trace].
     *
     * Unlike [trace], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _trace(): JsonField<String> = body._trace()

    /**
     * Returns the raw JSON value of [traceFilter].
     *
     * Unlike [traceFilter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _traceFilter(): JsonField<String> = body._traceFilter()

    /**
     * Returns the raw JSON value of [treeFilter].
     *
     * Unlike [treeFilter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _treeFilter(): JsonField<String> = body._treeFilter()

    /**
     * Returns the raw JSON value of [useExperimentalSearch].
     *
     * Unlike [useExperimentalSearch], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _useExperimentalSearch(): JsonField<Boolean> = body._useExperimentalSearch()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): RunQueryParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [RunQueryParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RunQueryParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(runQueryParams: RunQueryParams) = apply {
            body = runQueryParams.body.toBuilder()
            additionalHeaders = runQueryParams.additionalHeaders.toBuilder()
            additionalQueryParams = runQueryParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [id]
         * - [cursor]
         * - [dataSourceType]
         * - [endTime]
         * - [error]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun id(id: List<String>?) = apply { body.id(id) }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<List<String>>) = id(id.getOrNull())

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed `List<String>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<List<String>>) = apply { body.id(id) }

        /**
         * Adds a single [String] to [Builder.id].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addId(id: String) = apply { body.addId(id) }

        fun cursor(cursor: String?) = apply { body.cursor(cursor) }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        /**
         * Sets [Builder.cursor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cursor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cursor(cursor: JsonField<String>) = apply { body.cursor(cursor) }

        /** Enum for run data source types. */
        fun dataSourceType(dataSourceType: DataSourceType?) = apply {
            body.dataSourceType(dataSourceType)
        }

        /** Alias for calling [Builder.dataSourceType] with `dataSourceType.orElse(null)`. */
        fun dataSourceType(dataSourceType: Optional<DataSourceType>) =
            dataSourceType(dataSourceType.getOrNull())

        /**
         * Sets [Builder.dataSourceType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataSourceType] with a well-typed [DataSourceType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dataSourceType(dataSourceType: JsonField<DataSourceType>) = apply {
            body.dataSourceType(dataSourceType)
        }

        fun endTime(endTime: OffsetDateTime?) = apply { body.endTime(endTime) }

        /** Alias for calling [Builder.endTime] with `endTime.orElse(null)`. */
        fun endTime(endTime: Optional<OffsetDateTime>) = endTime(endTime.getOrNull())

        /**
         * Sets [Builder.endTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endTime(endTime: JsonField<OffsetDateTime>) = apply { body.endTime(endTime) }

        fun error(error: Boolean?) = apply { body.error(error) }

        /**
         * Alias for [Builder.error].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun error(error: Boolean) = error(error as Boolean?)

        /** Alias for calling [Builder.error] with `error.orElse(null)`. */
        fun error(error: Optional<Boolean>) = error(error.getOrNull())

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun error(error: JsonField<Boolean>) = apply { body.error(error) }

        fun executionOrder(executionOrder: Long?) = apply { body.executionOrder(executionOrder) }

        /**
         * Alias for [Builder.executionOrder].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun executionOrder(executionOrder: Long) = executionOrder(executionOrder as Long?)

        /** Alias for calling [Builder.executionOrder] with `executionOrder.orElse(null)`. */
        fun executionOrder(executionOrder: Optional<Long>) =
            executionOrder(executionOrder.getOrNull())

        /**
         * Sets [Builder.executionOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.executionOrder] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun executionOrder(executionOrder: JsonField<Long>) = apply {
            body.executionOrder(executionOrder)
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

        fun isRoot(isRoot: Boolean?) = apply { body.isRoot(isRoot) }

        /**
         * Alias for [Builder.isRoot].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isRoot(isRoot: Boolean) = isRoot(isRoot as Boolean?)

        /** Alias for calling [Builder.isRoot] with `isRoot.orElse(null)`. */
        fun isRoot(isRoot: Optional<Boolean>) = isRoot(isRoot.getOrNull())

        /**
         * Sets [Builder.isRoot] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isRoot] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun isRoot(isRoot: JsonField<Boolean>) = apply { body.isRoot(isRoot) }

        fun limit(limit: Long) = apply { body.limit(limit) }

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limit(limit: JsonField<Long>) = apply { body.limit(limit) }

        /** Enum for run start date order. */
        fun order(order: Order) = apply { body.order(order) }

        /**
         * Sets [Builder.order] to an arbitrary JSON value.
         *
         * You should usually call [Builder.order] with a well-typed [Order] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun order(order: JsonField<Order>) = apply { body.order(order) }

        fun parentRun(parentRun: String?) = apply { body.parentRun(parentRun) }

        /** Alias for calling [Builder.parentRun] with `parentRun.orElse(null)`. */
        fun parentRun(parentRun: Optional<String>) = parentRun(parentRun.getOrNull())

        /**
         * Sets [Builder.parentRun] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parentRun] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun parentRun(parentRun: JsonField<String>) = apply { body.parentRun(parentRun) }

        fun query(query: String?) = apply { body.query(query) }

        /** Alias for calling [Builder.query] with `query.orElse(null)`. */
        fun query(query: Optional<String>) = query(query.getOrNull())

        /**
         * Sets [Builder.query] to an arbitrary JSON value.
         *
         * You should usually call [Builder.query] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun query(query: JsonField<String>) = apply { body.query(query) }

        fun referenceExample(referenceExample: List<String>?) = apply {
            body.referenceExample(referenceExample)
        }

        /** Alias for calling [Builder.referenceExample] with `referenceExample.orElse(null)`. */
        fun referenceExample(referenceExample: Optional<List<String>>) =
            referenceExample(referenceExample.getOrNull())

        /**
         * Sets [Builder.referenceExample] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceExample] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referenceExample(referenceExample: JsonField<List<String>>) = apply {
            body.referenceExample(referenceExample)
        }

        /**
         * Adds a single [String] to [Builder.referenceExample].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReferenceExample(referenceExample: String) = apply {
            body.addReferenceExample(referenceExample)
        }

        /** Enum for run types. */
        fun runType(runType: RunType?) = apply { body.runType(runType) }

        /** Alias for calling [Builder.runType] with `runType.orElse(null)`. */
        fun runType(runType: Optional<RunType>) = runType(runType.getOrNull())

        /**
         * Sets [Builder.runType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runType] with a well-typed [RunType] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun runType(runType: JsonField<RunType>) = apply { body.runType(runType) }

        fun searchFilter(searchFilter: String?) = apply { body.searchFilter(searchFilter) }

        /** Alias for calling [Builder.searchFilter] with `searchFilter.orElse(null)`. */
        fun searchFilter(searchFilter: Optional<String>) = searchFilter(searchFilter.getOrNull())

        /**
         * Sets [Builder.searchFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.searchFilter] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun searchFilter(searchFilter: JsonField<String>) = apply {
            body.searchFilter(searchFilter)
        }

        fun select(select: List<Select>) = apply { body.select(select) }

        /**
         * Sets [Builder.select] to an arbitrary JSON value.
         *
         * You should usually call [Builder.select] with a well-typed `List<Select>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun select(select: JsonField<List<Select>>) = apply { body.select(select) }

        /**
         * Adds a single [Select] to [Builder.select].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSelect(select: Select) = apply { body.addSelect(select) }

        fun session(session: List<String>?) = apply { body.session(session) }

        /** Alias for calling [Builder.session] with `session.orElse(null)`. */
        fun session(session: Optional<List<String>>) = session(session.getOrNull())

        /**
         * Sets [Builder.session] to an arbitrary JSON value.
         *
         * You should usually call [Builder.session] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun session(session: JsonField<List<String>>) = apply { body.session(session) }

        /**
         * Adds a single [String] to [Builder.session].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSession(session: String) = apply { body.addSession(session) }

        fun skipPagination(skipPagination: Boolean?) = apply { body.skipPagination(skipPagination) }

        /**
         * Alias for [Builder.skipPagination].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun skipPagination(skipPagination: Boolean) = skipPagination(skipPagination as Boolean?)

        /** Alias for calling [Builder.skipPagination] with `skipPagination.orElse(null)`. */
        fun skipPagination(skipPagination: Optional<Boolean>) =
            skipPagination(skipPagination.getOrNull())

        /**
         * Sets [Builder.skipPagination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.skipPagination] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun skipPagination(skipPagination: JsonField<Boolean>) = apply {
            body.skipPagination(skipPagination)
        }

        fun skipPrevCursor(skipPrevCursor: Boolean) = apply { body.skipPrevCursor(skipPrevCursor) }

        /**
         * Sets [Builder.skipPrevCursor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.skipPrevCursor] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun skipPrevCursor(skipPrevCursor: JsonField<Boolean>) = apply {
            body.skipPrevCursor(skipPrevCursor)
        }

        fun startTime(startTime: OffsetDateTime?) = apply { body.startTime(startTime) }

        /** Alias for calling [Builder.startTime] with `startTime.orElse(null)`. */
        fun startTime(startTime: Optional<OffsetDateTime>) = startTime(startTime.getOrNull())

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { body.startTime(startTime) }

        fun trace(trace: String?) = apply { body.trace(trace) }

        /** Alias for calling [Builder.trace] with `trace.orElse(null)`. */
        fun trace(trace: Optional<String>) = trace(trace.getOrNull())

        /**
         * Sets [Builder.trace] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trace] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun trace(trace: JsonField<String>) = apply { body.trace(trace) }

        fun traceFilter(traceFilter: String?) = apply { body.traceFilter(traceFilter) }

        /** Alias for calling [Builder.traceFilter] with `traceFilter.orElse(null)`. */
        fun traceFilter(traceFilter: Optional<String>) = traceFilter(traceFilter.getOrNull())

        /**
         * Sets [Builder.traceFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.traceFilter] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun traceFilter(traceFilter: JsonField<String>) = apply { body.traceFilter(traceFilter) }

        fun treeFilter(treeFilter: String?) = apply { body.treeFilter(treeFilter) }

        /** Alias for calling [Builder.treeFilter] with `treeFilter.orElse(null)`. */
        fun treeFilter(treeFilter: Optional<String>) = treeFilter(treeFilter.getOrNull())

        /**
         * Sets [Builder.treeFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.treeFilter] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun treeFilter(treeFilter: JsonField<String>) = apply { body.treeFilter(treeFilter) }

        fun useExperimentalSearch(useExperimentalSearch: Boolean) = apply {
            body.useExperimentalSearch(useExperimentalSearch)
        }

        /**
         * Sets [Builder.useExperimentalSearch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useExperimentalSearch] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun useExperimentalSearch(useExperimentalSearch: JsonField<Boolean>) = apply {
            body.useExperimentalSearch(useExperimentalSearch)
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
         * Returns an immutable instance of [RunQueryParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RunQueryParams =
            RunQueryParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Query params for runs query endpoint. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<List<String>>,
        private val cursor: JsonField<String>,
        private val dataSourceType: JsonField<DataSourceType>,
        private val endTime: JsonField<OffsetDateTime>,
        private val error: JsonField<Boolean>,
        private val executionOrder: JsonField<Long>,
        private val filter: JsonField<String>,
        private val isRoot: JsonField<Boolean>,
        private val limit: JsonField<Long>,
        private val order: JsonField<Order>,
        private val parentRun: JsonField<String>,
        private val query: JsonField<String>,
        private val referenceExample: JsonField<List<String>>,
        private val runType: JsonField<RunType>,
        private val searchFilter: JsonField<String>,
        private val select: JsonField<List<Select>>,
        private val session: JsonField<List<String>>,
        private val skipPagination: JsonField<Boolean>,
        private val skipPrevCursor: JsonField<Boolean>,
        private val startTime: JsonField<OffsetDateTime>,
        private val trace: JsonField<String>,
        private val traceFilter: JsonField<String>,
        private val treeFilter: JsonField<String>,
        private val useExperimentalSearch: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("cursor") @ExcludeMissing cursor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("data_source_type")
            @ExcludeMissing
            dataSourceType: JsonField<DataSourceType> = JsonMissing.of(),
            @JsonProperty("end_time")
            @ExcludeMissing
            endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("error") @ExcludeMissing error: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("execution_order")
            @ExcludeMissing
            executionOrder: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("filter") @ExcludeMissing filter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("is_root") @ExcludeMissing isRoot: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("order") @ExcludeMissing order: JsonField<Order> = JsonMissing.of(),
            @JsonProperty("parent_run")
            @ExcludeMissing
            parentRun: JsonField<String> = JsonMissing.of(),
            @JsonProperty("query") @ExcludeMissing query: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reference_example")
            @ExcludeMissing
            referenceExample: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("run_type")
            @ExcludeMissing
            runType: JsonField<RunType> = JsonMissing.of(),
            @JsonProperty("search_filter")
            @ExcludeMissing
            searchFilter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("select")
            @ExcludeMissing
            select: JsonField<List<Select>> = JsonMissing.of(),
            @JsonProperty("session")
            @ExcludeMissing
            session: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("skip_pagination")
            @ExcludeMissing
            skipPagination: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("skip_prev_cursor")
            @ExcludeMissing
            skipPrevCursor: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("start_time")
            @ExcludeMissing
            startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("trace") @ExcludeMissing trace: JsonField<String> = JsonMissing.of(),
            @JsonProperty("trace_filter")
            @ExcludeMissing
            traceFilter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tree_filter")
            @ExcludeMissing
            treeFilter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("use_experimental_search")
            @ExcludeMissing
            useExperimentalSearch: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            id,
            cursor,
            dataSourceType,
            endTime,
            error,
            executionOrder,
            filter,
            isRoot,
            limit,
            order,
            parentRun,
            query,
            referenceExample,
            runType,
            searchFilter,
            select,
            session,
            skipPagination,
            skipPrevCursor,
            startTime,
            trace,
            traceFilter,
            treeFilter,
            useExperimentalSearch,
            mutableMapOf(),
        )

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun id(): Optional<List<String>> = id.getOptional("id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cursor(): Optional<String> = cursor.getOptional("cursor")

        /**
         * Enum for run data source types.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun dataSourceType(): Optional<DataSourceType> =
            dataSourceType.getOptional("data_source_type")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("end_time")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun error(): Optional<Boolean> = error.getOptional("error")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun executionOrder(): Optional<Long> = executionOrder.getOptional("execution_order")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun filter(): Optional<String> = filter.getOptional("filter")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun isRoot(): Optional<Boolean> = isRoot.getOptional("is_root")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun limit(): Optional<Long> = limit.getOptional("limit")

        /**
         * Enum for run start date order.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun order(): Optional<Order> = order.getOptional("order")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun parentRun(): Optional<String> = parentRun.getOptional("parent_run")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun query(): Optional<String> = query.getOptional("query")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun referenceExample(): Optional<List<String>> =
            referenceExample.getOptional("reference_example")

        /**
         * Enum for run types.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun runType(): Optional<RunType> = runType.getOptional("run_type")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun searchFilter(): Optional<String> = searchFilter.getOptional("search_filter")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun select(): Optional<List<Select>> = select.getOptional("select")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun session(): Optional<List<String>> = session.getOptional("session")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun skipPagination(): Optional<Boolean> = skipPagination.getOptional("skip_pagination")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun skipPrevCursor(): Optional<Boolean> = skipPrevCursor.getOptional("skip_prev_cursor")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun startTime(): Optional<OffsetDateTime> = startTime.getOptional("start_time")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun trace(): Optional<String> = trace.getOptional("trace")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun traceFilter(): Optional<String> = traceFilter.getOptional("trace_filter")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun treeFilter(): Optional<String> = treeFilter.getOptional("tree_filter")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun useExperimentalSearch(): Optional<Boolean> =
            useExperimentalSearch.getOptional("use_experimental_search")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<List<String>> = id

        /**
         * Returns the raw JSON value of [cursor].
         *
         * Unlike [cursor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cursor") @ExcludeMissing fun _cursor(): JsonField<String> = cursor

        /**
         * Returns the raw JSON value of [dataSourceType].
         *
         * Unlike [dataSourceType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("data_source_type")
        @ExcludeMissing
        fun _dataSourceType(): JsonField<DataSourceType> = dataSourceType

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
        @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<Boolean> = error

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
         * Returns the raw JSON value of [filter].
         *
         * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

        /**
         * Returns the raw JSON value of [isRoot].
         *
         * Unlike [isRoot], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_root") @ExcludeMissing fun _isRoot(): JsonField<Boolean> = isRoot

        /**
         * Returns the raw JSON value of [limit].
         *
         * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Long> = limit

        /**
         * Returns the raw JSON value of [order].
         *
         * Unlike [order], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("order") @ExcludeMissing fun _order(): JsonField<Order> = order

        /**
         * Returns the raw JSON value of [parentRun].
         *
         * Unlike [parentRun], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parent_run") @ExcludeMissing fun _parentRun(): JsonField<String> = parentRun

        /**
         * Returns the raw JSON value of [query].
         *
         * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("query") @ExcludeMissing fun _query(): JsonField<String> = query

        /**
         * Returns the raw JSON value of [referenceExample].
         *
         * Unlike [referenceExample], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("reference_example")
        @ExcludeMissing
        fun _referenceExample(): JsonField<List<String>> = referenceExample

        /**
         * Returns the raw JSON value of [runType].
         *
         * Unlike [runType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("run_type") @ExcludeMissing fun _runType(): JsonField<RunType> = runType

        /**
         * Returns the raw JSON value of [searchFilter].
         *
         * Unlike [searchFilter], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("search_filter")
        @ExcludeMissing
        fun _searchFilter(): JsonField<String> = searchFilter

        /**
         * Returns the raw JSON value of [select].
         *
         * Unlike [select], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("select") @ExcludeMissing fun _select(): JsonField<List<Select>> = select

        /**
         * Returns the raw JSON value of [session].
         *
         * Unlike [session], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("session") @ExcludeMissing fun _session(): JsonField<List<String>> = session

        /**
         * Returns the raw JSON value of [skipPagination].
         *
         * Unlike [skipPagination], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("skip_pagination")
        @ExcludeMissing
        fun _skipPagination(): JsonField<Boolean> = skipPagination

        /**
         * Returns the raw JSON value of [skipPrevCursor].
         *
         * Unlike [skipPrevCursor], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("skip_prev_cursor")
        @ExcludeMissing
        fun _skipPrevCursor(): JsonField<Boolean> = skipPrevCursor

        /**
         * Returns the raw JSON value of [startTime].
         *
         * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_time")
        @ExcludeMissing
        fun _startTime(): JsonField<OffsetDateTime> = startTime

        /**
         * Returns the raw JSON value of [trace].
         *
         * Unlike [trace], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trace") @ExcludeMissing fun _trace(): JsonField<String> = trace

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
        @JsonProperty("tree_filter")
        @ExcludeMissing
        fun _treeFilter(): JsonField<String> = treeFilter

        /**
         * Returns the raw JSON value of [useExperimentalSearch].
         *
         * Unlike [useExperimentalSearch], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("use_experimental_search")
        @ExcludeMissing
        fun _useExperimentalSearch(): JsonField<Boolean> = useExperimentalSearch

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

            private var id: JsonField<MutableList<String>>? = null
            private var cursor: JsonField<String> = JsonMissing.of()
            private var dataSourceType: JsonField<DataSourceType> = JsonMissing.of()
            private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var error: JsonField<Boolean> = JsonMissing.of()
            private var executionOrder: JsonField<Long> = JsonMissing.of()
            private var filter: JsonField<String> = JsonMissing.of()
            private var isRoot: JsonField<Boolean> = JsonMissing.of()
            private var limit: JsonField<Long> = JsonMissing.of()
            private var order: JsonField<Order> = JsonMissing.of()
            private var parentRun: JsonField<String> = JsonMissing.of()
            private var query: JsonField<String> = JsonMissing.of()
            private var referenceExample: JsonField<MutableList<String>>? = null
            private var runType: JsonField<RunType> = JsonMissing.of()
            private var searchFilter: JsonField<String> = JsonMissing.of()
            private var select: JsonField<MutableList<Select>>? = null
            private var session: JsonField<MutableList<String>>? = null
            private var skipPagination: JsonField<Boolean> = JsonMissing.of()
            private var skipPrevCursor: JsonField<Boolean> = JsonMissing.of()
            private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var trace: JsonField<String> = JsonMissing.of()
            private var traceFilter: JsonField<String> = JsonMissing.of()
            private var treeFilter: JsonField<String> = JsonMissing.of()
            private var useExperimentalSearch: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                id = body.id.map { it.toMutableList() }
                cursor = body.cursor
                dataSourceType = body.dataSourceType
                endTime = body.endTime
                error = body.error
                executionOrder = body.executionOrder
                filter = body.filter
                isRoot = body.isRoot
                limit = body.limit
                order = body.order
                parentRun = body.parentRun
                query = body.query
                referenceExample = body.referenceExample.map { it.toMutableList() }
                runType = body.runType
                searchFilter = body.searchFilter
                select = body.select.map { it.toMutableList() }
                session = body.session.map { it.toMutableList() }
                skipPagination = body.skipPagination
                skipPrevCursor = body.skipPrevCursor
                startTime = body.startTime
                trace = body.trace
                traceFilter = body.traceFilter
                treeFilter = body.treeFilter
                useExperimentalSearch = body.useExperimentalSearch
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun id(id: List<String>?) = id(JsonField.ofNullable(id))

            /** Alias for calling [Builder.id] with `id.orElse(null)`. */
            fun id(id: Optional<List<String>>) = id(id.getOrNull())

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed `List<String>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun id(id: JsonField<List<String>>) = apply { this.id = id.map { it.toMutableList() } }

            /**
             * Adds a single [String] to [Builder.id].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addId(id: String) = apply {
                this.id =
                    (this.id ?: JsonField.of(mutableListOf())).also { checkKnown("id", it).add(id) }
            }

            fun cursor(cursor: String?) = cursor(JsonField.ofNullable(cursor))

            /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
            fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

            /**
             * Sets [Builder.cursor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cursor] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cursor(cursor: JsonField<String>) = apply { this.cursor = cursor }

            /** Enum for run data source types. */
            fun dataSourceType(dataSourceType: DataSourceType?) =
                dataSourceType(JsonField.ofNullable(dataSourceType))

            /** Alias for calling [Builder.dataSourceType] with `dataSourceType.orElse(null)`. */
            fun dataSourceType(dataSourceType: Optional<DataSourceType>) =
                dataSourceType(dataSourceType.getOrNull())

            /**
             * Sets [Builder.dataSourceType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataSourceType] with a well-typed [DataSourceType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dataSourceType(dataSourceType: JsonField<DataSourceType>) = apply {
                this.dataSourceType = dataSourceType
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

            fun error(error: Boolean?) = error(JsonField.ofNullable(error))

            /**
             * Alias for [Builder.error].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun error(error: Boolean) = error(error as Boolean?)

            /** Alias for calling [Builder.error] with `error.orElse(null)`. */
            fun error(error: Optional<Boolean>) = error(error.getOrNull())

            /**
             * Sets [Builder.error] to an arbitrary JSON value.
             *
             * You should usually call [Builder.error] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun error(error: JsonField<Boolean>) = apply { this.error = error }

            fun executionOrder(executionOrder: Long?) =
                executionOrder(JsonField.ofNullable(executionOrder))

            /**
             * Alias for [Builder.executionOrder].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun executionOrder(executionOrder: Long) = executionOrder(executionOrder as Long?)

            /** Alias for calling [Builder.executionOrder] with `executionOrder.orElse(null)`. */
            fun executionOrder(executionOrder: Optional<Long>) =
                executionOrder(executionOrder.getOrNull())

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

            fun isRoot(isRoot: Boolean?) = isRoot(JsonField.ofNullable(isRoot))

            /**
             * Alias for [Builder.isRoot].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun isRoot(isRoot: Boolean) = isRoot(isRoot as Boolean?)

            /** Alias for calling [Builder.isRoot] with `isRoot.orElse(null)`. */
            fun isRoot(isRoot: Optional<Boolean>) = isRoot(isRoot.getOrNull())

            /**
             * Sets [Builder.isRoot] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isRoot] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isRoot(isRoot: JsonField<Boolean>) = apply { this.isRoot = isRoot }

            fun limit(limit: Long) = limit(JsonField.of(limit))

            /**
             * Sets [Builder.limit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

            /** Enum for run start date order. */
            fun order(order: Order) = order(JsonField.of(order))

            /**
             * Sets [Builder.order] to an arbitrary JSON value.
             *
             * You should usually call [Builder.order] with a well-typed [Order] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun order(order: JsonField<Order>) = apply { this.order = order }

            fun parentRun(parentRun: String?) = parentRun(JsonField.ofNullable(parentRun))

            /** Alias for calling [Builder.parentRun] with `parentRun.orElse(null)`. */
            fun parentRun(parentRun: Optional<String>) = parentRun(parentRun.getOrNull())

            /**
             * Sets [Builder.parentRun] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parentRun] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parentRun(parentRun: JsonField<String>) = apply { this.parentRun = parentRun }

            fun query(query: String?) = query(JsonField.ofNullable(query))

            /** Alias for calling [Builder.query] with `query.orElse(null)`. */
            fun query(query: Optional<String>) = query(query.getOrNull())

            /**
             * Sets [Builder.query] to an arbitrary JSON value.
             *
             * You should usually call [Builder.query] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun query(query: JsonField<String>) = apply { this.query = query }

            fun referenceExample(referenceExample: List<String>?) =
                referenceExample(JsonField.ofNullable(referenceExample))

            /**
             * Alias for calling [Builder.referenceExample] with `referenceExample.orElse(null)`.
             */
            fun referenceExample(referenceExample: Optional<List<String>>) =
                referenceExample(referenceExample.getOrNull())

            /**
             * Sets [Builder.referenceExample] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referenceExample] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun referenceExample(referenceExample: JsonField<List<String>>) = apply {
                this.referenceExample = referenceExample.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.referenceExample].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addReferenceExample(referenceExample: String) = apply {
                this.referenceExample =
                    (this.referenceExample ?: JsonField.of(mutableListOf())).also {
                        checkKnown("referenceExample", it).add(referenceExample)
                    }
            }

            /** Enum for run types. */
            fun runType(runType: RunType?) = runType(JsonField.ofNullable(runType))

            /** Alias for calling [Builder.runType] with `runType.orElse(null)`. */
            fun runType(runType: Optional<RunType>) = runType(runType.getOrNull())

            /**
             * Sets [Builder.runType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.runType] with a well-typed [RunType] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun runType(runType: JsonField<RunType>) = apply { this.runType = runType }

            fun searchFilter(searchFilter: String?) =
                searchFilter(JsonField.ofNullable(searchFilter))

            /** Alias for calling [Builder.searchFilter] with `searchFilter.orElse(null)`. */
            fun searchFilter(searchFilter: Optional<String>) =
                searchFilter(searchFilter.getOrNull())

            /**
             * Sets [Builder.searchFilter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.searchFilter] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun searchFilter(searchFilter: JsonField<String>) = apply {
                this.searchFilter = searchFilter
            }

            fun select(select: List<Select>) = select(JsonField.of(select))

            /**
             * Sets [Builder.select] to an arbitrary JSON value.
             *
             * You should usually call [Builder.select] with a well-typed `List<Select>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun select(select: JsonField<List<Select>>) = apply {
                this.select = select.map { it.toMutableList() }
            }

            /**
             * Adds a single [Select] to [Builder.select].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSelect(select: Select) = apply {
                this.select =
                    (this.select ?: JsonField.of(mutableListOf())).also {
                        checkKnown("select", it).add(select)
                    }
            }

            fun session(session: List<String>?) = session(JsonField.ofNullable(session))

            /** Alias for calling [Builder.session] with `session.orElse(null)`. */
            fun session(session: Optional<List<String>>) = session(session.getOrNull())

            /**
             * Sets [Builder.session] to an arbitrary JSON value.
             *
             * You should usually call [Builder.session] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun session(session: JsonField<List<String>>) = apply {
                this.session = session.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.session].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSession(session: String) = apply {
                this.session =
                    (this.session ?: JsonField.of(mutableListOf())).also {
                        checkKnown("session", it).add(session)
                    }
            }

            fun skipPagination(skipPagination: Boolean?) =
                skipPagination(JsonField.ofNullable(skipPagination))

            /**
             * Alias for [Builder.skipPagination].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun skipPagination(skipPagination: Boolean) = skipPagination(skipPagination as Boolean?)

            /** Alias for calling [Builder.skipPagination] with `skipPagination.orElse(null)`. */
            fun skipPagination(skipPagination: Optional<Boolean>) =
                skipPagination(skipPagination.getOrNull())

            /**
             * Sets [Builder.skipPagination] to an arbitrary JSON value.
             *
             * You should usually call [Builder.skipPagination] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun skipPagination(skipPagination: JsonField<Boolean>) = apply {
                this.skipPagination = skipPagination
            }

            fun skipPrevCursor(skipPrevCursor: Boolean) =
                skipPrevCursor(JsonField.of(skipPrevCursor))

            /**
             * Sets [Builder.skipPrevCursor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.skipPrevCursor] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun skipPrevCursor(skipPrevCursor: JsonField<Boolean>) = apply {
                this.skipPrevCursor = skipPrevCursor
            }

            fun startTime(startTime: OffsetDateTime?) = startTime(JsonField.ofNullable(startTime))

            /** Alias for calling [Builder.startTime] with `startTime.orElse(null)`. */
            fun startTime(startTime: Optional<OffsetDateTime>) = startTime(startTime.getOrNull())

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

            fun trace(trace: String?) = trace(JsonField.ofNullable(trace))

            /** Alias for calling [Builder.trace] with `trace.orElse(null)`. */
            fun trace(trace: Optional<String>) = trace(trace.getOrNull())

            /**
             * Sets [Builder.trace] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trace] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun trace(trace: JsonField<String>) = apply { this.trace = trace }

            fun traceFilter(traceFilter: String?) = traceFilter(JsonField.ofNullable(traceFilter))

            /** Alias for calling [Builder.traceFilter] with `traceFilter.orElse(null)`. */
            fun traceFilter(traceFilter: Optional<String>) = traceFilter(traceFilter.getOrNull())

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

            fun treeFilter(treeFilter: String?) = treeFilter(JsonField.ofNullable(treeFilter))

            /** Alias for calling [Builder.treeFilter] with `treeFilter.orElse(null)`. */
            fun treeFilter(treeFilter: Optional<String>) = treeFilter(treeFilter.getOrNull())

            /**
             * Sets [Builder.treeFilter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.treeFilter] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun treeFilter(treeFilter: JsonField<String>) = apply { this.treeFilter = treeFilter }

            fun useExperimentalSearch(useExperimentalSearch: Boolean) =
                useExperimentalSearch(JsonField.of(useExperimentalSearch))

            /**
             * Sets [Builder.useExperimentalSearch] to an arbitrary JSON value.
             *
             * You should usually call [Builder.useExperimentalSearch] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun useExperimentalSearch(useExperimentalSearch: JsonField<Boolean>) = apply {
                this.useExperimentalSearch = useExperimentalSearch
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
             */
            fun build(): Body =
                Body(
                    (id ?: JsonMissing.of()).map { it.toImmutable() },
                    cursor,
                    dataSourceType,
                    endTime,
                    error,
                    executionOrder,
                    filter,
                    isRoot,
                    limit,
                    order,
                    parentRun,
                    query,
                    (referenceExample ?: JsonMissing.of()).map { it.toImmutable() },
                    runType,
                    searchFilter,
                    (select ?: JsonMissing.of()).map { it.toImmutable() },
                    (session ?: JsonMissing.of()).map { it.toImmutable() },
                    skipPagination,
                    skipPrevCursor,
                    startTime,
                    trace,
                    traceFilter,
                    treeFilter,
                    useExperimentalSearch,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            id()
            cursor()
            dataSourceType().ifPresent { it.validate() }
            endTime()
            error()
            executionOrder()
            filter()
            isRoot()
            limit()
            order().ifPresent { it.validate() }
            parentRun()
            query()
            referenceExample()
            runType().ifPresent { it.validate() }
            searchFilter()
            select().ifPresent { it.forEach { it.validate() } }
            session()
            skipPagination()
            skipPrevCursor()
            startTime()
            trace()
            traceFilter()
            treeFilter()
            useExperimentalSearch()
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
            (id.asKnown().getOrNull()?.size ?: 0) +
                (if (cursor.asKnown().isPresent) 1 else 0) +
                (dataSourceType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (endTime.asKnown().isPresent) 1 else 0) +
                (if (error.asKnown().isPresent) 1 else 0) +
                (if (executionOrder.asKnown().isPresent) 1 else 0) +
                (if (filter.asKnown().isPresent) 1 else 0) +
                (if (isRoot.asKnown().isPresent) 1 else 0) +
                (if (limit.asKnown().isPresent) 1 else 0) +
                (order.asKnown().getOrNull()?.validity() ?: 0) +
                (if (parentRun.asKnown().isPresent) 1 else 0) +
                (if (query.asKnown().isPresent) 1 else 0) +
                (referenceExample.asKnown().getOrNull()?.size ?: 0) +
                (runType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (searchFilter.asKnown().isPresent) 1 else 0) +
                (select.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (session.asKnown().getOrNull()?.size ?: 0) +
                (if (skipPagination.asKnown().isPresent) 1 else 0) +
                (if (skipPrevCursor.asKnown().isPresent) 1 else 0) +
                (if (startTime.asKnown().isPresent) 1 else 0) +
                (if (trace.asKnown().isPresent) 1 else 0) +
                (if (traceFilter.asKnown().isPresent) 1 else 0) +
                (if (treeFilter.asKnown().isPresent) 1 else 0) +
                (if (useExperimentalSearch.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                id == other.id &&
                cursor == other.cursor &&
                dataSourceType == other.dataSourceType &&
                endTime == other.endTime &&
                error == other.error &&
                executionOrder == other.executionOrder &&
                filter == other.filter &&
                isRoot == other.isRoot &&
                limit == other.limit &&
                order == other.order &&
                parentRun == other.parentRun &&
                query == other.query &&
                referenceExample == other.referenceExample &&
                runType == other.runType &&
                searchFilter == other.searchFilter &&
                select == other.select &&
                session == other.session &&
                skipPagination == other.skipPagination &&
                skipPrevCursor == other.skipPrevCursor &&
                startTime == other.startTime &&
                trace == other.trace &&
                traceFilter == other.traceFilter &&
                treeFilter == other.treeFilter &&
                useExperimentalSearch == other.useExperimentalSearch &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                cursor,
                dataSourceType,
                endTime,
                error,
                executionOrder,
                filter,
                isRoot,
                limit,
                order,
                parentRun,
                query,
                referenceExample,
                runType,
                searchFilter,
                select,
                session,
                skipPagination,
                skipPrevCursor,
                startTime,
                trace,
                traceFilter,
                treeFilter,
                useExperimentalSearch,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{id=$id, cursor=$cursor, dataSourceType=$dataSourceType, endTime=$endTime, error=$error, executionOrder=$executionOrder, filter=$filter, isRoot=$isRoot, limit=$limit, order=$order, parentRun=$parentRun, query=$query, referenceExample=$referenceExample, runType=$runType, searchFilter=$searchFilter, select=$select, session=$session, skipPagination=$skipPagination, skipPrevCursor=$skipPrevCursor, startTime=$startTime, trace=$trace, traceFilter=$traceFilter, treeFilter=$treeFilter, useExperimentalSearch=$useExperimentalSearch, additionalProperties=$additionalProperties}"
    }

    /** Enum for run data source types. */
    class DataSourceType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val CURRENT = of("current")

            @JvmField val HISTORICAL = of("historical")

            @JvmField val LITE = of("lite")

            @JvmField val ROOT_LITE = of("root_lite")

            @JvmField val RUNS_FEEDBACKS_RMT_WIDE = of("runs_feedbacks_rmt_wide")

            @JvmStatic fun of(value: String) = DataSourceType(JsonField.of(value))
        }

        /** An enum containing [DataSourceType]'s known values. */
        enum class Known {
            CURRENT,
            HISTORICAL,
            LITE,
            ROOT_LITE,
            RUNS_FEEDBACKS_RMT_WIDE,
        }

        /**
         * An enum containing [DataSourceType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DataSourceType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CURRENT,
            HISTORICAL,
            LITE,
            ROOT_LITE,
            RUNS_FEEDBACKS_RMT_WIDE,
            /**
             * An enum member indicating that [DataSourceType] was instantiated with an unknown
             * value.
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
                CURRENT -> Value.CURRENT
                HISTORICAL -> Value.HISTORICAL
                LITE -> Value.LITE
                ROOT_LITE -> Value.ROOT_LITE
                RUNS_FEEDBACKS_RMT_WIDE -> Value.RUNS_FEEDBACKS_RMT_WIDE
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
                CURRENT -> Known.CURRENT
                HISTORICAL -> Known.HISTORICAL
                LITE -> Known.LITE
                ROOT_LITE -> Known.ROOT_LITE
                RUNS_FEEDBACKS_RMT_WIDE -> Known.RUNS_FEEDBACKS_RMT_WIDE
                else -> throw LangChainInvalidDataException("Unknown DataSourceType: $value")
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

        fun validate(): DataSourceType = apply {
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

            return other is DataSourceType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Enum for run start date order. */
    class Order @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ASC = of("asc")

            @JvmField val DESC = of("desc")

            @JvmStatic fun of(value: String) = Order(JsonField.of(value))
        }

        /** An enum containing [Order]'s known values. */
        enum class Known {
            ASC,
            DESC,
        }

        /**
         * An enum containing [Order]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Order] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ASC,
            DESC,
            /** An enum member indicating that [Order] was instantiated with an unknown value. */
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
                ASC -> Value.ASC
                DESC -> Value.DESC
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
                ASC -> Known.ASC
                DESC -> Known.DESC
                else -> throw LangChainInvalidDataException("Unknown Order: $value")
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

        fun validate(): Order = apply {
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

            return other is Order && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Enum for run types. */
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

            @JvmField val TOOL = of("tool")

            @JvmField val CHAIN = of("chain")

            @JvmField val LLM = of("llm")

            @JvmField val RETRIEVER = of("retriever")

            @JvmField val EMBEDDING = of("embedding")

            @JvmField val PROMPT = of("prompt")

            @JvmField val PARSER = of("parser")

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

    /** Enum for available run columns. */
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

            @JvmField val ID = of("id")

            @JvmField val NAME = of("name")

            @JvmField val RUN_TYPE = of("run_type")

            @JvmField val START_TIME = of("start_time")

            @JvmField val END_TIME = of("end_time")

            @JvmField val STATUS = of("status")

            @JvmField val ERROR = of("error")

            @JvmField val EXTRA = of("extra")

            @JvmField val EVENTS = of("events")

            @JvmField val INPUTS = of("inputs")

            @JvmField val INPUTS_PREVIEW = of("inputs_preview")

            @JvmField val INPUTS_S3_URLS = of("inputs_s3_urls")

            @JvmField val INPUTS_OR_SIGNED_URL = of("inputs_or_signed_url")

            @JvmField val OUTPUTS = of("outputs")

            @JvmField val OUTPUTS_PREVIEW = of("outputs_preview")

            @JvmField val OUTPUTS_S3_URLS = of("outputs_s3_urls")

            @JvmField val OUTPUTS_OR_SIGNED_URL = of("outputs_or_signed_url")

            @JvmField val S3_URLS = of("s3_urls")

            @JvmField val ERROR_OR_SIGNED_URL = of("error_or_signed_url")

            @JvmField val EVENTS_OR_SIGNED_URL = of("events_or_signed_url")

            @JvmField val EXTRA_OR_SIGNED_URL = of("extra_or_signed_url")

            @JvmField val SERIALIZED_OR_SIGNED_URL = of("serialized_or_signed_url")

            @JvmField val PARENT_RUN_ID = of("parent_run_id")

            @JvmField val MANIFEST_ID = of("manifest_id")

            @JvmField val MANIFEST_S3_ID = of("manifest_s3_id")

            @JvmField val MANIFEST = of("manifest")

            @JvmField val SESSION_ID = of("session_id")

            @JvmField val SERIALIZED = of("serialized")

            @JvmField val REFERENCE_EXAMPLE_ID = of("reference_example_id")

            @JvmField val REFERENCE_DATASET_ID = of("reference_dataset_id")

            @JvmField val TOTAL_TOKENS = of("total_tokens")

            @JvmField val PROMPT_TOKENS = of("prompt_tokens")

            @JvmField val PROMPT_TOKEN_DETAILS = of("prompt_token_details")

            @JvmField val COMPLETION_TOKENS = of("completion_tokens")

            @JvmField val COMPLETION_TOKEN_DETAILS = of("completion_token_details")

            @JvmField val TOTAL_COST = of("total_cost")

            @JvmField val PROMPT_COST = of("prompt_cost")

            @JvmField val PROMPT_COST_DETAILS = of("prompt_cost_details")

            @JvmField val COMPLETION_COST = of("completion_cost")

            @JvmField val COMPLETION_COST_DETAILS = of("completion_cost_details")

            @JvmField val PRICE_MODEL_ID = of("price_model_id")

            @JvmField val FIRST_TOKEN_TIME = of("first_token_time")

            @JvmField val TRACE_ID = of("trace_id")

            @JvmField val DOTTED_ORDER = of("dotted_order")

            @JvmField val LAST_QUEUED_AT = of("last_queued_at")

            @JvmField val FEEDBACK_STATS = of("feedback_stats")

            @JvmField val CHILD_RUN_IDS = of("child_run_ids")

            @JvmField val PARENT_RUN_IDS = of("parent_run_ids")

            @JvmField val TAGS = of("tags")

            @JvmField val IN_DATASET = of("in_dataset")

            @JvmField val APP_PATH = of("app_path")

            @JvmField val SHARE_TOKEN = of("share_token")

            @JvmField val TRACE_TIER = of("trace_tier")

            @JvmField val TRACE_FIRST_RECEIVED_AT = of("trace_first_received_at")

            @JvmField val TTL_SECONDS = of("ttl_seconds")

            @JvmField val TRACE_UPGRADE = of("trace_upgrade")

            @JvmField val THREAD_ID = of("thread_id")

            @JvmField val TRACE_MIN_MAX_START_TIME = of("trace_min_max_start_time")

            @JvmStatic fun of(value: String) = Select(JsonField.of(value))
        }

        /** An enum containing [Select]'s known values. */
        enum class Known {
            ID,
            NAME,
            RUN_TYPE,
            START_TIME,
            END_TIME,
            STATUS,
            ERROR,
            EXTRA,
            EVENTS,
            INPUTS,
            INPUTS_PREVIEW,
            INPUTS_S3_URLS,
            INPUTS_OR_SIGNED_URL,
            OUTPUTS,
            OUTPUTS_PREVIEW,
            OUTPUTS_S3_URLS,
            OUTPUTS_OR_SIGNED_URL,
            S3_URLS,
            ERROR_OR_SIGNED_URL,
            EVENTS_OR_SIGNED_URL,
            EXTRA_OR_SIGNED_URL,
            SERIALIZED_OR_SIGNED_URL,
            PARENT_RUN_ID,
            MANIFEST_ID,
            MANIFEST_S3_ID,
            MANIFEST,
            SESSION_ID,
            SERIALIZED,
            REFERENCE_EXAMPLE_ID,
            REFERENCE_DATASET_ID,
            TOTAL_TOKENS,
            PROMPT_TOKENS,
            PROMPT_TOKEN_DETAILS,
            COMPLETION_TOKENS,
            COMPLETION_TOKEN_DETAILS,
            TOTAL_COST,
            PROMPT_COST,
            PROMPT_COST_DETAILS,
            COMPLETION_COST,
            COMPLETION_COST_DETAILS,
            PRICE_MODEL_ID,
            FIRST_TOKEN_TIME,
            TRACE_ID,
            DOTTED_ORDER,
            LAST_QUEUED_AT,
            FEEDBACK_STATS,
            CHILD_RUN_IDS,
            PARENT_RUN_IDS,
            TAGS,
            IN_DATASET,
            APP_PATH,
            SHARE_TOKEN,
            TRACE_TIER,
            TRACE_FIRST_RECEIVED_AT,
            TTL_SECONDS,
            TRACE_UPGRADE,
            THREAD_ID,
            TRACE_MIN_MAX_START_TIME,
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
            START_TIME,
            END_TIME,
            STATUS,
            ERROR,
            EXTRA,
            EVENTS,
            INPUTS,
            INPUTS_PREVIEW,
            INPUTS_S3_URLS,
            INPUTS_OR_SIGNED_URL,
            OUTPUTS,
            OUTPUTS_PREVIEW,
            OUTPUTS_S3_URLS,
            OUTPUTS_OR_SIGNED_URL,
            S3_URLS,
            ERROR_OR_SIGNED_URL,
            EVENTS_OR_SIGNED_URL,
            EXTRA_OR_SIGNED_URL,
            SERIALIZED_OR_SIGNED_URL,
            PARENT_RUN_ID,
            MANIFEST_ID,
            MANIFEST_S3_ID,
            MANIFEST,
            SESSION_ID,
            SERIALIZED,
            REFERENCE_EXAMPLE_ID,
            REFERENCE_DATASET_ID,
            TOTAL_TOKENS,
            PROMPT_TOKENS,
            PROMPT_TOKEN_DETAILS,
            COMPLETION_TOKENS,
            COMPLETION_TOKEN_DETAILS,
            TOTAL_COST,
            PROMPT_COST,
            PROMPT_COST_DETAILS,
            COMPLETION_COST,
            COMPLETION_COST_DETAILS,
            PRICE_MODEL_ID,
            FIRST_TOKEN_TIME,
            TRACE_ID,
            DOTTED_ORDER,
            LAST_QUEUED_AT,
            FEEDBACK_STATS,
            CHILD_RUN_IDS,
            PARENT_RUN_IDS,
            TAGS,
            IN_DATASET,
            APP_PATH,
            SHARE_TOKEN,
            TRACE_TIER,
            TRACE_FIRST_RECEIVED_AT,
            TTL_SECONDS,
            TRACE_UPGRADE,
            THREAD_ID,
            TRACE_MIN_MAX_START_TIME,
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
                START_TIME -> Value.START_TIME
                END_TIME -> Value.END_TIME
                STATUS -> Value.STATUS
                ERROR -> Value.ERROR
                EXTRA -> Value.EXTRA
                EVENTS -> Value.EVENTS
                INPUTS -> Value.INPUTS
                INPUTS_PREVIEW -> Value.INPUTS_PREVIEW
                INPUTS_S3_URLS -> Value.INPUTS_S3_URLS
                INPUTS_OR_SIGNED_URL -> Value.INPUTS_OR_SIGNED_URL
                OUTPUTS -> Value.OUTPUTS
                OUTPUTS_PREVIEW -> Value.OUTPUTS_PREVIEW
                OUTPUTS_S3_URLS -> Value.OUTPUTS_S3_URLS
                OUTPUTS_OR_SIGNED_URL -> Value.OUTPUTS_OR_SIGNED_URL
                S3_URLS -> Value.S3_URLS
                ERROR_OR_SIGNED_URL -> Value.ERROR_OR_SIGNED_URL
                EVENTS_OR_SIGNED_URL -> Value.EVENTS_OR_SIGNED_URL
                EXTRA_OR_SIGNED_URL -> Value.EXTRA_OR_SIGNED_URL
                SERIALIZED_OR_SIGNED_URL -> Value.SERIALIZED_OR_SIGNED_URL
                PARENT_RUN_ID -> Value.PARENT_RUN_ID
                MANIFEST_ID -> Value.MANIFEST_ID
                MANIFEST_S3_ID -> Value.MANIFEST_S3_ID
                MANIFEST -> Value.MANIFEST
                SESSION_ID -> Value.SESSION_ID
                SERIALIZED -> Value.SERIALIZED
                REFERENCE_EXAMPLE_ID -> Value.REFERENCE_EXAMPLE_ID
                REFERENCE_DATASET_ID -> Value.REFERENCE_DATASET_ID
                TOTAL_TOKENS -> Value.TOTAL_TOKENS
                PROMPT_TOKENS -> Value.PROMPT_TOKENS
                PROMPT_TOKEN_DETAILS -> Value.PROMPT_TOKEN_DETAILS
                COMPLETION_TOKENS -> Value.COMPLETION_TOKENS
                COMPLETION_TOKEN_DETAILS -> Value.COMPLETION_TOKEN_DETAILS
                TOTAL_COST -> Value.TOTAL_COST
                PROMPT_COST -> Value.PROMPT_COST
                PROMPT_COST_DETAILS -> Value.PROMPT_COST_DETAILS
                COMPLETION_COST -> Value.COMPLETION_COST
                COMPLETION_COST_DETAILS -> Value.COMPLETION_COST_DETAILS
                PRICE_MODEL_ID -> Value.PRICE_MODEL_ID
                FIRST_TOKEN_TIME -> Value.FIRST_TOKEN_TIME
                TRACE_ID -> Value.TRACE_ID
                DOTTED_ORDER -> Value.DOTTED_ORDER
                LAST_QUEUED_AT -> Value.LAST_QUEUED_AT
                FEEDBACK_STATS -> Value.FEEDBACK_STATS
                CHILD_RUN_IDS -> Value.CHILD_RUN_IDS
                PARENT_RUN_IDS -> Value.PARENT_RUN_IDS
                TAGS -> Value.TAGS
                IN_DATASET -> Value.IN_DATASET
                APP_PATH -> Value.APP_PATH
                SHARE_TOKEN -> Value.SHARE_TOKEN
                TRACE_TIER -> Value.TRACE_TIER
                TRACE_FIRST_RECEIVED_AT -> Value.TRACE_FIRST_RECEIVED_AT
                TTL_SECONDS -> Value.TTL_SECONDS
                TRACE_UPGRADE -> Value.TRACE_UPGRADE
                THREAD_ID -> Value.THREAD_ID
                TRACE_MIN_MAX_START_TIME -> Value.TRACE_MIN_MAX_START_TIME
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
                START_TIME -> Known.START_TIME
                END_TIME -> Known.END_TIME
                STATUS -> Known.STATUS
                ERROR -> Known.ERROR
                EXTRA -> Known.EXTRA
                EVENTS -> Known.EVENTS
                INPUTS -> Known.INPUTS
                INPUTS_PREVIEW -> Known.INPUTS_PREVIEW
                INPUTS_S3_URLS -> Known.INPUTS_S3_URLS
                INPUTS_OR_SIGNED_URL -> Known.INPUTS_OR_SIGNED_URL
                OUTPUTS -> Known.OUTPUTS
                OUTPUTS_PREVIEW -> Known.OUTPUTS_PREVIEW
                OUTPUTS_S3_URLS -> Known.OUTPUTS_S3_URLS
                OUTPUTS_OR_SIGNED_URL -> Known.OUTPUTS_OR_SIGNED_URL
                S3_URLS -> Known.S3_URLS
                ERROR_OR_SIGNED_URL -> Known.ERROR_OR_SIGNED_URL
                EVENTS_OR_SIGNED_URL -> Known.EVENTS_OR_SIGNED_URL
                EXTRA_OR_SIGNED_URL -> Known.EXTRA_OR_SIGNED_URL
                SERIALIZED_OR_SIGNED_URL -> Known.SERIALIZED_OR_SIGNED_URL
                PARENT_RUN_ID -> Known.PARENT_RUN_ID
                MANIFEST_ID -> Known.MANIFEST_ID
                MANIFEST_S3_ID -> Known.MANIFEST_S3_ID
                MANIFEST -> Known.MANIFEST
                SESSION_ID -> Known.SESSION_ID
                SERIALIZED -> Known.SERIALIZED
                REFERENCE_EXAMPLE_ID -> Known.REFERENCE_EXAMPLE_ID
                REFERENCE_DATASET_ID -> Known.REFERENCE_DATASET_ID
                TOTAL_TOKENS -> Known.TOTAL_TOKENS
                PROMPT_TOKENS -> Known.PROMPT_TOKENS
                PROMPT_TOKEN_DETAILS -> Known.PROMPT_TOKEN_DETAILS
                COMPLETION_TOKENS -> Known.COMPLETION_TOKENS
                COMPLETION_TOKEN_DETAILS -> Known.COMPLETION_TOKEN_DETAILS
                TOTAL_COST -> Known.TOTAL_COST
                PROMPT_COST -> Known.PROMPT_COST
                PROMPT_COST_DETAILS -> Known.PROMPT_COST_DETAILS
                COMPLETION_COST -> Known.COMPLETION_COST
                COMPLETION_COST_DETAILS -> Known.COMPLETION_COST_DETAILS
                PRICE_MODEL_ID -> Known.PRICE_MODEL_ID
                FIRST_TOKEN_TIME -> Known.FIRST_TOKEN_TIME
                TRACE_ID -> Known.TRACE_ID
                DOTTED_ORDER -> Known.DOTTED_ORDER
                LAST_QUEUED_AT -> Known.LAST_QUEUED_AT
                FEEDBACK_STATS -> Known.FEEDBACK_STATS
                CHILD_RUN_IDS -> Known.CHILD_RUN_IDS
                PARENT_RUN_IDS -> Known.PARENT_RUN_IDS
                TAGS -> Known.TAGS
                IN_DATASET -> Known.IN_DATASET
                APP_PATH -> Known.APP_PATH
                SHARE_TOKEN -> Known.SHARE_TOKEN
                TRACE_TIER -> Known.TRACE_TIER
                TRACE_FIRST_RECEIVED_AT -> Known.TRACE_FIRST_RECEIVED_AT
                TTL_SECONDS -> Known.TTL_SECONDS
                TRACE_UPGRADE -> Known.TRACE_UPGRADE
                THREAD_ID -> Known.THREAD_ID
                TRACE_MIN_MAX_START_TIME -> Known.TRACE_MIN_MAX_START_TIME
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

        return other is RunQueryParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RunQueryParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

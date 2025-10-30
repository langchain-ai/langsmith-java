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
import com.langchain.smith.errors.LangsmithInvalidDataException
import com.langchain.smith.models.sessions.RunStatsGroupBy
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Query params for run stats. */
class RunStatsQueryParams
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<List<String>>,
    private val dataSourceType: JsonField<RunsFilterDataSourceTypeEnum>,
    private val endTime: JsonField<OffsetDateTime>,
    private val error: JsonField<Boolean>,
    private val executionOrder: JsonField<Long>,
    private val filter: JsonField<String>,
    private val groupBy: JsonField<RunStatsGroupBy>,
    private val groups: JsonField<List<String?>>,
    private val isRoot: JsonField<Boolean>,
    private val parentRun: JsonField<String>,
    private val query: JsonField<String>,
    private val referenceExample: JsonField<List<String>>,
    private val runType: JsonField<RunTypeEnum>,
    private val searchFilter: JsonField<String>,
    private val select: JsonField<List<Select>>,
    private val session: JsonField<List<String>>,
    private val skipPagination: JsonField<Boolean>,
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
        @JsonProperty("data_source_type")
        @ExcludeMissing
        dataSourceType: JsonField<RunsFilterDataSourceTypeEnum> = JsonMissing.of(),
        @JsonProperty("end_time")
        @ExcludeMissing
        endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("error") @ExcludeMissing error: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("execution_order")
        @ExcludeMissing
        executionOrder: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("filter") @ExcludeMissing filter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("group_by")
        @ExcludeMissing
        groupBy: JsonField<RunStatsGroupBy> = JsonMissing.of(),
        @JsonProperty("groups") @ExcludeMissing groups: JsonField<List<String?>> = JsonMissing.of(),
        @JsonProperty("is_root") @ExcludeMissing isRoot: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("parent_run") @ExcludeMissing parentRun: JsonField<String> = JsonMissing.of(),
        @JsonProperty("query") @ExcludeMissing query: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reference_example")
        @ExcludeMissing
        referenceExample: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("run_type")
        @ExcludeMissing
        runType: JsonField<RunTypeEnum> = JsonMissing.of(),
        @JsonProperty("search_filter")
        @ExcludeMissing
        searchFilter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("select") @ExcludeMissing select: JsonField<List<Select>> = JsonMissing.of(),
        @JsonProperty("session")
        @ExcludeMissing
        session: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("skip_pagination")
        @ExcludeMissing
        skipPagination: JsonField<Boolean> = JsonMissing.of(),
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
        dataSourceType,
        endTime,
        error,
        executionOrder,
        filter,
        groupBy,
        groups,
        isRoot,
        parentRun,
        query,
        referenceExample,
        runType,
        searchFilter,
        select,
        session,
        skipPagination,
        startTime,
        trace,
        traceFilter,
        treeFilter,
        useExperimentalSearch,
        mutableMapOf(),
    )

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<List<String>> = id.getOptional("id")

    /**
     * Enum for run data source types.
     *
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dataSourceType(): Optional<RunsFilterDataSourceTypeEnum> =
        dataSourceType.getOptional("data_source_type")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("end_time")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun error(): Optional<Boolean> = error.getOptional("error")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun executionOrder(): Optional<Long> = executionOrder.getOptional("execution_order")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filter(): Optional<String> = filter.getOptional("filter")

    /**
     * Group by param for run stats.
     *
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groupBy(): Optional<RunStatsGroupBy> = groupBy.getOptional("group_by")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groups(): Optional<List<String?>> = groups.getOptional("groups")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isRoot(): Optional<Boolean> = isRoot.getOptional("is_root")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parentRun(): Optional<String> = parentRun.getOptional("parent_run")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun query(): Optional<String> = query.getOptional("query")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referenceExample(): Optional<List<String>> =
        referenceExample.getOptional("reference_example")

    /**
     * Enum for run types.
     *
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runType(): Optional<RunTypeEnum> = runType.getOptional("run_type")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun searchFilter(): Optional<String> = searchFilter.getOptional("search_filter")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun select(): Optional<List<Select>> = select.getOptional("select")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun session(): Optional<List<String>> = session.getOptional("session")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun skipPagination(): Optional<Boolean> = skipPagination.getOptional("skip_pagination")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startTime(): Optional<OffsetDateTime> = startTime.getOptional("start_time")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trace(): Optional<String> = trace.getOptional("trace")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun traceFilter(): Optional<String> = traceFilter.getOptional("trace_filter")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun treeFilter(): Optional<String> = treeFilter.getOptional("tree_filter")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
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
     * Returns the raw JSON value of [dataSourceType].
     *
     * Unlike [dataSourceType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data_source_type")
    @ExcludeMissing
    fun _dataSourceType(): JsonField<RunsFilterDataSourceTypeEnum> = dataSourceType

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
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<Boolean> = error

    /**
     * Returns the raw JSON value of [executionOrder].
     *
     * Unlike [executionOrder], this method doesn't throw if the JSON field has an unexpected type.
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
     * Returns the raw JSON value of [groupBy].
     *
     * Unlike [groupBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("group_by") @ExcludeMissing fun _groupBy(): JsonField<RunStatsGroupBy> = groupBy

    /**
     * Returns the raw JSON value of [groups].
     *
     * Unlike [groups], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("groups") @ExcludeMissing fun _groups(): JsonField<List<String?>> = groups

    /**
     * Returns the raw JSON value of [isRoot].
     *
     * Unlike [isRoot], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_root") @ExcludeMissing fun _isRoot(): JsonField<Boolean> = isRoot

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
    @JsonProperty("run_type") @ExcludeMissing fun _runType(): JsonField<RunTypeEnum> = runType

    /**
     * Returns the raw JSON value of [searchFilter].
     *
     * Unlike [searchFilter], this method doesn't throw if the JSON field has an unexpected type.
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
     * Unlike [skipPagination], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("skip_pagination")
    @ExcludeMissing
    fun _skipPagination(): JsonField<Boolean> = skipPagination

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
    @JsonProperty("tree_filter") @ExcludeMissing fun _treeFilter(): JsonField<String> = treeFilter

    /**
     * Returns the raw JSON value of [useExperimentalSearch].
     *
     * Unlike [useExperimentalSearch], this method doesn't throw if the JSON field has an unexpected
     * type.
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

        /** Returns a mutable builder for constructing an instance of [RunStatsQueryParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RunStatsQueryParams]. */
    class Builder internal constructor() {

        private var id: JsonField<MutableList<String>>? = null
        private var dataSourceType: JsonField<RunsFilterDataSourceTypeEnum> = JsonMissing.of()
        private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var error: JsonField<Boolean> = JsonMissing.of()
        private var executionOrder: JsonField<Long> = JsonMissing.of()
        private var filter: JsonField<String> = JsonMissing.of()
        private var groupBy: JsonField<RunStatsGroupBy> = JsonMissing.of()
        private var groups: JsonField<MutableList<String?>>? = null
        private var isRoot: JsonField<Boolean> = JsonMissing.of()
        private var parentRun: JsonField<String> = JsonMissing.of()
        private var query: JsonField<String> = JsonMissing.of()
        private var referenceExample: JsonField<MutableList<String>>? = null
        private var runType: JsonField<RunTypeEnum> = JsonMissing.of()
        private var searchFilter: JsonField<String> = JsonMissing.of()
        private var select: JsonField<MutableList<Select>>? = null
        private var session: JsonField<MutableList<String>>? = null
        private var skipPagination: JsonField<Boolean> = JsonMissing.of()
        private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var trace: JsonField<String> = JsonMissing.of()
        private var traceFilter: JsonField<String> = JsonMissing.of()
        private var treeFilter: JsonField<String> = JsonMissing.of()
        private var useExperimentalSearch: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(runStatsQueryParams: RunStatsQueryParams) = apply {
            id = runStatsQueryParams.id.map { it.toMutableList() }
            dataSourceType = runStatsQueryParams.dataSourceType
            endTime = runStatsQueryParams.endTime
            error = runStatsQueryParams.error
            executionOrder = runStatsQueryParams.executionOrder
            filter = runStatsQueryParams.filter
            groupBy = runStatsQueryParams.groupBy
            groups = runStatsQueryParams.groups.map { it.toMutableList() }
            isRoot = runStatsQueryParams.isRoot
            parentRun = runStatsQueryParams.parentRun
            query = runStatsQueryParams.query
            referenceExample = runStatsQueryParams.referenceExample.map { it.toMutableList() }
            runType = runStatsQueryParams.runType
            searchFilter = runStatsQueryParams.searchFilter
            select = runStatsQueryParams.select.map { it.toMutableList() }
            session = runStatsQueryParams.session.map { it.toMutableList() }
            skipPagination = runStatsQueryParams.skipPagination
            startTime = runStatsQueryParams.startTime
            trace = runStatsQueryParams.trace
            traceFilter = runStatsQueryParams.traceFilter
            treeFilter = runStatsQueryParams.treeFilter
            useExperimentalSearch = runStatsQueryParams.useExperimentalSearch
            additionalProperties = runStatsQueryParams.additionalProperties.toMutableMap()
        }

        fun id(id: List<String>?) = id(JsonField.ofNullable(id))

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<List<String>>) = id(id.getOrNull())

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed `List<String>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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

        /** Enum for run data source types. */
        fun dataSourceType(dataSourceType: RunsFilterDataSourceTypeEnum?) =
            dataSourceType(JsonField.ofNullable(dataSourceType))

        /** Alias for calling [Builder.dataSourceType] with `dataSourceType.orElse(null)`. */
        fun dataSourceType(dataSourceType: Optional<RunsFilterDataSourceTypeEnum>) =
            dataSourceType(dataSourceType.getOrNull())

        /**
         * Sets [Builder.dataSourceType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataSourceType] with a well-typed
         * [RunsFilterDataSourceTypeEnum] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun dataSourceType(dataSourceType: JsonField<RunsFilterDataSourceTypeEnum>) = apply {
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
         * You should usually call [Builder.error] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * You should usually call [Builder.executionOrder] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * You should usually call [Builder.filter] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filter(filter: JsonField<String>) = apply { this.filter = filter }

        /** Group by param for run stats. */
        fun groupBy(groupBy: RunStatsGroupBy?) = groupBy(JsonField.ofNullable(groupBy))

        /** Alias for calling [Builder.groupBy] with `groupBy.orElse(null)`. */
        fun groupBy(groupBy: Optional<RunStatsGroupBy>) = groupBy(groupBy.getOrNull())

        /**
         * Sets [Builder.groupBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupBy] with a well-typed [RunStatsGroupBy] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun groupBy(groupBy: JsonField<RunStatsGroupBy>) = apply { this.groupBy = groupBy }

        fun groups(groups: List<String?>?) = groups(JsonField.ofNullable(groups))

        /** Alias for calling [Builder.groups] with `groups.orElse(null)`. */
        fun groups(groups: Optional<List<String?>>) = groups(groups.getOrNull())

        /**
         * Sets [Builder.groups] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groups] with a well-typed `List<String?>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun groups(groups: JsonField<List<String?>>) = apply {
            this.groups = groups.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [groups].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGroup(group: String) = apply {
            groups =
                (groups ?: JsonField.of(mutableListOf())).also {
                    checkKnown("groups", it).add(group)
                }
        }

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
         * You should usually call [Builder.isRoot] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun isRoot(isRoot: JsonField<Boolean>) = apply { this.isRoot = isRoot }

        fun parentRun(parentRun: String?) = parentRun(JsonField.ofNullable(parentRun))

        /** Alias for calling [Builder.parentRun] with `parentRun.orElse(null)`. */
        fun parentRun(parentRun: Optional<String>) = parentRun(parentRun.getOrNull())

        /**
         * Sets [Builder.parentRun] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parentRun] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun parentRun(parentRun: JsonField<String>) = apply { this.parentRun = parentRun }

        fun query(query: String?) = query(JsonField.ofNullable(query))

        /** Alias for calling [Builder.query] with `query.orElse(null)`. */
        fun query(query: Optional<String>) = query(query.getOrNull())

        /**
         * Sets [Builder.query] to an arbitrary JSON value.
         *
         * You should usually call [Builder.query] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun query(query: JsonField<String>) = apply { this.query = query }

        fun referenceExample(referenceExample: List<String>?) =
            referenceExample(JsonField.ofNullable(referenceExample))

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
        fun runType(runType: RunTypeEnum?) = runType(JsonField.ofNullable(runType))

        /** Alias for calling [Builder.runType] with `runType.orElse(null)`. */
        fun runType(runType: Optional<RunTypeEnum>) = runType(runType.getOrNull())

        /**
         * Sets [Builder.runType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runType] with a well-typed [RunTypeEnum] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun runType(runType: JsonField<RunTypeEnum>) = apply { this.runType = runType }

        fun searchFilter(searchFilter: String?) = searchFilter(JsonField.ofNullable(searchFilter))

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
            this.searchFilter = searchFilter
        }

        fun select(select: List<Select>?) = select(JsonField.ofNullable(select))

        /** Alias for calling [Builder.select] with `select.orElse(null)`. */
        fun select(select: Optional<List<Select>>) = select(select.getOrNull())

        /**
         * Sets [Builder.select] to an arbitrary JSON value.
         *
         * You should usually call [Builder.select] with a well-typed `List<Select>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * You should usually call [Builder.session] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { this.startTime = startTime }

        fun trace(trace: String?) = trace(JsonField.ofNullable(trace))

        /** Alias for calling [Builder.trace] with `trace.orElse(null)`. */
        fun trace(trace: Optional<String>) = trace(trace.getOrNull())

        /**
         * Sets [Builder.trace] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trace] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun trace(trace: JsonField<String>) = apply { this.trace = trace }

        fun traceFilter(traceFilter: String?) = traceFilter(JsonField.ofNullable(traceFilter))

        /** Alias for calling [Builder.traceFilter] with `traceFilter.orElse(null)`. */
        fun traceFilter(traceFilter: Optional<String>) = traceFilter(traceFilter.getOrNull())

        /**
         * Sets [Builder.traceFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.traceFilter] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun traceFilter(traceFilter: JsonField<String>) = apply { this.traceFilter = traceFilter }

        fun treeFilter(treeFilter: String?) = treeFilter(JsonField.ofNullable(treeFilter))

        /** Alias for calling [Builder.treeFilter] with `treeFilter.orElse(null)`. */
        fun treeFilter(treeFilter: Optional<String>) = treeFilter(treeFilter.getOrNull())

        /**
         * Sets [Builder.treeFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.treeFilter] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun treeFilter(treeFilter: JsonField<String>) = apply { this.treeFilter = treeFilter }

        fun useExperimentalSearch(useExperimentalSearch: Boolean) =
            useExperimentalSearch(JsonField.of(useExperimentalSearch))

        /**
         * Sets [Builder.useExperimentalSearch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useExperimentalSearch] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Returns an immutable instance of [RunStatsQueryParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RunStatsQueryParams =
            RunStatsQueryParams(
                (id ?: JsonMissing.of()).map { it.toImmutable() },
                dataSourceType,
                endTime,
                error,
                executionOrder,
                filter,
                groupBy,
                (groups ?: JsonMissing.of()).map { it.toImmutable() },
                isRoot,
                parentRun,
                query,
                (referenceExample ?: JsonMissing.of()).map { it.toImmutable() },
                runType,
                searchFilter,
                (select ?: JsonMissing.of()).map { it.toImmutable() },
                (session ?: JsonMissing.of()).map { it.toImmutable() },
                skipPagination,
                startTime,
                trace,
                traceFilter,
                treeFilter,
                useExperimentalSearch,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RunStatsQueryParams = apply {
        if (validated) {
            return@apply
        }

        id()
        dataSourceType().ifPresent { it.validate() }
        endTime()
        error()
        executionOrder()
        filter()
        groupBy().ifPresent { it.validate() }
        groups()
        isRoot()
        parentRun()
        query()
        referenceExample()
        runType().ifPresent { it.validate() }
        searchFilter()
        select().ifPresent { it.forEach { it.validate() } }
        session()
        skipPagination()
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
        } catch (e: LangsmithInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (id.asKnown().getOrNull()?.size ?: 0) +
            (dataSourceType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (endTime.asKnown().isPresent) 1 else 0) +
            (if (error.asKnown().isPresent) 1 else 0) +
            (if (executionOrder.asKnown().isPresent) 1 else 0) +
            (if (filter.asKnown().isPresent) 1 else 0) +
            (groupBy.asKnown().getOrNull()?.validity() ?: 0) +
            (groups.asKnown().getOrNull()?.sumOf { (if (it == null) 0 else 1).toInt() } ?: 0) +
            (if (isRoot.asKnown().isPresent) 1 else 0) +
            (if (parentRun.asKnown().isPresent) 1 else 0) +
            (if (query.asKnown().isPresent) 1 else 0) +
            (referenceExample.asKnown().getOrNull()?.size ?: 0) +
            (runType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (searchFilter.asKnown().isPresent) 1 else 0) +
            (select.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (session.asKnown().getOrNull()?.size ?: 0) +
            (if (skipPagination.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (if (trace.asKnown().isPresent) 1 else 0) +
            (if (traceFilter.asKnown().isPresent) 1 else 0) +
            (if (treeFilter.asKnown().isPresent) 1 else 0) +
            (if (useExperimentalSearch.asKnown().isPresent) 1 else 0)

    /** Metrics you can select from run stats endpoint. */
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

            @JvmField val RUN_COUNT = of("run_count")

            @JvmField val LATENCY_P50 = of("latency_p50")

            @JvmField val LATENCY_P99 = of("latency_p99")

            @JvmField val LATENCY_AVG = of("latency_avg")

            @JvmField val FIRST_TOKEN_P50 = of("first_token_p50")

            @JvmField val FIRST_TOKEN_P99 = of("first_token_p99")

            @JvmField val TOTAL_TOKENS = of("total_tokens")

            @JvmField val PROMPT_TOKENS = of("prompt_tokens")

            @JvmField val COMPLETION_TOKENS = of("completion_tokens")

            @JvmField val MEDIAN_TOKENS = of("median_tokens")

            @JvmField val COMPLETION_TOKENS_P50 = of("completion_tokens_p50")

            @JvmField val PROMPT_TOKENS_P50 = of("prompt_tokens_p50")

            @JvmField val TOKENS_P99 = of("tokens_p99")

            @JvmField val COMPLETION_TOKENS_P99 = of("completion_tokens_p99")

            @JvmField val PROMPT_TOKENS_P99 = of("prompt_tokens_p99")

            @JvmField val LAST_RUN_START_TIME = of("last_run_start_time")

            @JvmField val FEEDBACK_STATS = of("feedback_stats")

            @JvmField val THREAD_FEEDBACK_STATS = of("thread_feedback_stats")

            @JvmField val RUN_FACETS = of("run_facets")

            @JvmField val ERROR_RATE = of("error_rate")

            @JvmField val STREAMING_RATE = of("streaming_rate")

            @JvmField val TOTAL_COST = of("total_cost")

            @JvmField val PROMPT_COST = of("prompt_cost")

            @JvmField val COMPLETION_COST = of("completion_cost")

            @JvmField val COST_P50 = of("cost_p50")

            @JvmField val COST_P99 = of("cost_p99")

            @JvmField val SESSION_FEEDBACK_STATS = of("session_feedback_stats")

            @JvmField val ALL_RUN_STATS = of("all_run_stats")

            @JvmField val ALL_TOKEN_STATS = of("all_token_stats")

            @JvmField val PROMPT_TOKEN_DETAILS = of("prompt_token_details")

            @JvmField val COMPLETION_TOKEN_DETAILS = of("completion_token_details")

            @JvmField val PROMPT_COST_DETAILS = of("prompt_cost_details")

            @JvmField val COMPLETION_COST_DETAILS = of("completion_cost_details")

            @JvmStatic fun of(value: String) = Select(JsonField.of(value))
        }

        /** An enum containing [Select]'s known values. */
        enum class Known {
            RUN_COUNT,
            LATENCY_P50,
            LATENCY_P99,
            LATENCY_AVG,
            FIRST_TOKEN_P50,
            FIRST_TOKEN_P99,
            TOTAL_TOKENS,
            PROMPT_TOKENS,
            COMPLETION_TOKENS,
            MEDIAN_TOKENS,
            COMPLETION_TOKENS_P50,
            PROMPT_TOKENS_P50,
            TOKENS_P99,
            COMPLETION_TOKENS_P99,
            PROMPT_TOKENS_P99,
            LAST_RUN_START_TIME,
            FEEDBACK_STATS,
            THREAD_FEEDBACK_STATS,
            RUN_FACETS,
            ERROR_RATE,
            STREAMING_RATE,
            TOTAL_COST,
            PROMPT_COST,
            COMPLETION_COST,
            COST_P50,
            COST_P99,
            SESSION_FEEDBACK_STATS,
            ALL_RUN_STATS,
            ALL_TOKEN_STATS,
            PROMPT_TOKEN_DETAILS,
            COMPLETION_TOKEN_DETAILS,
            PROMPT_COST_DETAILS,
            COMPLETION_COST_DETAILS,
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
            RUN_COUNT,
            LATENCY_P50,
            LATENCY_P99,
            LATENCY_AVG,
            FIRST_TOKEN_P50,
            FIRST_TOKEN_P99,
            TOTAL_TOKENS,
            PROMPT_TOKENS,
            COMPLETION_TOKENS,
            MEDIAN_TOKENS,
            COMPLETION_TOKENS_P50,
            PROMPT_TOKENS_P50,
            TOKENS_P99,
            COMPLETION_TOKENS_P99,
            PROMPT_TOKENS_P99,
            LAST_RUN_START_TIME,
            FEEDBACK_STATS,
            THREAD_FEEDBACK_STATS,
            RUN_FACETS,
            ERROR_RATE,
            STREAMING_RATE,
            TOTAL_COST,
            PROMPT_COST,
            COMPLETION_COST,
            COST_P50,
            COST_P99,
            SESSION_FEEDBACK_STATS,
            ALL_RUN_STATS,
            ALL_TOKEN_STATS,
            PROMPT_TOKEN_DETAILS,
            COMPLETION_TOKEN_DETAILS,
            PROMPT_COST_DETAILS,
            COMPLETION_COST_DETAILS,
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
                RUN_COUNT -> Value.RUN_COUNT
                LATENCY_P50 -> Value.LATENCY_P50
                LATENCY_P99 -> Value.LATENCY_P99
                LATENCY_AVG -> Value.LATENCY_AVG
                FIRST_TOKEN_P50 -> Value.FIRST_TOKEN_P50
                FIRST_TOKEN_P99 -> Value.FIRST_TOKEN_P99
                TOTAL_TOKENS -> Value.TOTAL_TOKENS
                PROMPT_TOKENS -> Value.PROMPT_TOKENS
                COMPLETION_TOKENS -> Value.COMPLETION_TOKENS
                MEDIAN_TOKENS -> Value.MEDIAN_TOKENS
                COMPLETION_TOKENS_P50 -> Value.COMPLETION_TOKENS_P50
                PROMPT_TOKENS_P50 -> Value.PROMPT_TOKENS_P50
                TOKENS_P99 -> Value.TOKENS_P99
                COMPLETION_TOKENS_P99 -> Value.COMPLETION_TOKENS_P99
                PROMPT_TOKENS_P99 -> Value.PROMPT_TOKENS_P99
                LAST_RUN_START_TIME -> Value.LAST_RUN_START_TIME
                FEEDBACK_STATS -> Value.FEEDBACK_STATS
                THREAD_FEEDBACK_STATS -> Value.THREAD_FEEDBACK_STATS
                RUN_FACETS -> Value.RUN_FACETS
                ERROR_RATE -> Value.ERROR_RATE
                STREAMING_RATE -> Value.STREAMING_RATE
                TOTAL_COST -> Value.TOTAL_COST
                PROMPT_COST -> Value.PROMPT_COST
                COMPLETION_COST -> Value.COMPLETION_COST
                COST_P50 -> Value.COST_P50
                COST_P99 -> Value.COST_P99
                SESSION_FEEDBACK_STATS -> Value.SESSION_FEEDBACK_STATS
                ALL_RUN_STATS -> Value.ALL_RUN_STATS
                ALL_TOKEN_STATS -> Value.ALL_TOKEN_STATS
                PROMPT_TOKEN_DETAILS -> Value.PROMPT_TOKEN_DETAILS
                COMPLETION_TOKEN_DETAILS -> Value.COMPLETION_TOKEN_DETAILS
                PROMPT_COST_DETAILS -> Value.PROMPT_COST_DETAILS
                COMPLETION_COST_DETAILS -> Value.COMPLETION_COST_DETAILS
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangsmithInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                RUN_COUNT -> Known.RUN_COUNT
                LATENCY_P50 -> Known.LATENCY_P50
                LATENCY_P99 -> Known.LATENCY_P99
                LATENCY_AVG -> Known.LATENCY_AVG
                FIRST_TOKEN_P50 -> Known.FIRST_TOKEN_P50
                FIRST_TOKEN_P99 -> Known.FIRST_TOKEN_P99
                TOTAL_TOKENS -> Known.TOTAL_TOKENS
                PROMPT_TOKENS -> Known.PROMPT_TOKENS
                COMPLETION_TOKENS -> Known.COMPLETION_TOKENS
                MEDIAN_TOKENS -> Known.MEDIAN_TOKENS
                COMPLETION_TOKENS_P50 -> Known.COMPLETION_TOKENS_P50
                PROMPT_TOKENS_P50 -> Known.PROMPT_TOKENS_P50
                TOKENS_P99 -> Known.TOKENS_P99
                COMPLETION_TOKENS_P99 -> Known.COMPLETION_TOKENS_P99
                PROMPT_TOKENS_P99 -> Known.PROMPT_TOKENS_P99
                LAST_RUN_START_TIME -> Known.LAST_RUN_START_TIME
                FEEDBACK_STATS -> Known.FEEDBACK_STATS
                THREAD_FEEDBACK_STATS -> Known.THREAD_FEEDBACK_STATS
                RUN_FACETS -> Known.RUN_FACETS
                ERROR_RATE -> Known.ERROR_RATE
                STREAMING_RATE -> Known.STREAMING_RATE
                TOTAL_COST -> Known.TOTAL_COST
                PROMPT_COST -> Known.PROMPT_COST
                COMPLETION_COST -> Known.COMPLETION_COST
                COST_P50 -> Known.COST_P50
                COST_P99 -> Known.COST_P99
                SESSION_FEEDBACK_STATS -> Known.SESSION_FEEDBACK_STATS
                ALL_RUN_STATS -> Known.ALL_RUN_STATS
                ALL_TOKEN_STATS -> Known.ALL_TOKEN_STATS
                PROMPT_TOKEN_DETAILS -> Known.PROMPT_TOKEN_DETAILS
                COMPLETION_TOKEN_DETAILS -> Known.COMPLETION_TOKEN_DETAILS
                PROMPT_COST_DETAILS -> Known.PROMPT_COST_DETAILS
                COMPLETION_COST_DETAILS -> Known.COMPLETION_COST_DETAILS
                else -> throw LangsmithInvalidDataException("Unknown Select: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangsmithInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangsmithInvalidDataException("Value is not a String")
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
            } catch (e: LangsmithInvalidDataException) {
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

        return other is RunStatsQueryParams &&
            id == other.id &&
            dataSourceType == other.dataSourceType &&
            endTime == other.endTime &&
            error == other.error &&
            executionOrder == other.executionOrder &&
            filter == other.filter &&
            groupBy == other.groupBy &&
            groups == other.groups &&
            isRoot == other.isRoot &&
            parentRun == other.parentRun &&
            query == other.query &&
            referenceExample == other.referenceExample &&
            runType == other.runType &&
            searchFilter == other.searchFilter &&
            select == other.select &&
            session == other.session &&
            skipPagination == other.skipPagination &&
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
            dataSourceType,
            endTime,
            error,
            executionOrder,
            filter,
            groupBy,
            groups,
            isRoot,
            parentRun,
            query,
            referenceExample,
            runType,
            searchFilter,
            select,
            session,
            skipPagination,
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
        "RunStatsQueryParams{id=$id, dataSourceType=$dataSourceType, endTime=$endTime, error=$error, executionOrder=$executionOrder, filter=$filter, groupBy=$groupBy, groups=$groups, isRoot=$isRoot, parentRun=$parentRun, query=$query, referenceExample=$referenceExample, runType=$runType, searchFilter=$searchFilter, select=$select, session=$session, skipPagination=$skipPagination, startTime=$startTime, trace=$trace, traceFilter=$traceFilter, treeFilter=$treeFilter, useExperimentalSearch=$useExperimentalSearch, additionalProperties=$additionalProperties}"
}

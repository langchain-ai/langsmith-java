// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.threads

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
import com.langchain.smith.core.checkRequired
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
 * GET with body payload — no resources created. Returns aggregate statistics for threads in a
 * tracing project. The response includes the thread counts, run counts, latency percentiles, rates,
 * token totals, and cost totals requested in `select`.
 *
 * Self-hosted deployments require LangSmith `v0.17` or later.
 */
class ThreadAggregateStatsParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * `project_id` is the tracing project UUID.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun projectId(): String = body.projectId()

    /**
     * `select` lists the aggregate statistics to compute and return. At least one value is
     * required.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun select(): List<Select> = body.select()

    /**
     * `filter` is a deprecated, unscoped LangSmith filter expression evaluated against trace root
     * runs. Kept for compatibility with deployments that serve this endpoint via the legacy
     * ClickHouse backend (no SmithDB query service configured); prefer `trace_filter`,
     * `tree_filter`, or `thread_filter` otherwise, since those require SmithDB.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filter(): Optional<String> = body.filter()

    /**
     * `max_start_time` is the exclusive upper bound on thread activity (RFC3339 date-time).
     * Defaults to now (UTC) when omitted.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxStartTime(): Optional<OffsetDateTime> = body.maxStartTime()

    /**
     * `min_start_time` is the inclusive lower bound on thread activity (RFC3339 date-time).
     * Defaults to 1 day before now (UTC) when omitted.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minStartTime(): Optional<OffsetDateTime> = body.minStartTime()

    /**
     * `thread_filter` narrows eligible threads using a LangSmith filter expression evaluated
     * against the complete thread summary.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun threadFilter(): Optional<String> = body.threadFilter()

    /**
     * `trace_filter` narrows eligible threads to those containing a trace whose root run matches
     * this LangSmith filter expression.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun traceFilter(): Optional<String> = body.traceFilter()

    /**
     * `tree_filter` narrows eligible threads to those containing a matching run anywhere in a trace
     * tree.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun treeFilter(): Optional<String> = body.treeFilter()

    /**
     * Returns the raw JSON value of [projectId].
     *
     * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _projectId(): JsonField<String> = body._projectId()

    /**
     * Returns the raw JSON value of [select].
     *
     * Unlike [select], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _select(): JsonField<List<Select>> = body._select()

    /**
     * Returns the raw JSON value of [filter].
     *
     * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _filter(): JsonField<String> = body._filter()

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
     * Returns the raw JSON value of [threadFilter].
     *
     * Unlike [threadFilter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _threadFilter(): JsonField<String> = body._threadFilter()

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

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ThreadAggregateStatsParams].
         *
         * The following fields are required:
         * ```java
         * .projectId()
         * .select()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ThreadAggregateStatsParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(threadAggregateStatsParams: ThreadAggregateStatsParams) = apply {
            body = threadAggregateStatsParams.body.toBuilder()
            additionalHeaders = threadAggregateStatsParams.additionalHeaders.toBuilder()
            additionalQueryParams = threadAggregateStatsParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [projectId]
         * - [select]
         * - [filter]
         * - [maxStartTime]
         * - [minStartTime]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** `project_id` is the tracing project UUID. */
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
         * `select` lists the aggregate statistics to compute and return. At least one value is
         * required.
         */
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

        /**
         * `filter` is a deprecated, unscoped LangSmith filter expression evaluated against trace
         * root runs. Kept for compatibility with deployments that serve this endpoint via the
         * legacy ClickHouse backend (no SmithDB query service configured); prefer `trace_filter`,
         * `tree_filter`, or `thread_filter` otherwise, since those require SmithDB.
         */
        fun filter(filter: String) = apply { body.filter(filter) }

        /**
         * Sets [Builder.filter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filter] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filter(filter: JsonField<String>) = apply { body.filter(filter) }

        /**
         * `max_start_time` is the exclusive upper bound on thread activity (RFC3339 date-time).
         * Defaults to now (UTC) when omitted.
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
         * `min_start_time` is the inclusive lower bound on thread activity (RFC3339 date-time).
         * Defaults to 1 day before now (UTC) when omitted.
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
         * `thread_filter` narrows eligible threads using a LangSmith filter expression evaluated
         * against the complete thread summary.
         */
        fun threadFilter(threadFilter: String) = apply { body.threadFilter(threadFilter) }

        /**
         * Sets [Builder.threadFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threadFilter] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun threadFilter(threadFilter: JsonField<String>) = apply {
            body.threadFilter(threadFilter)
        }

        /**
         * `trace_filter` narrows eligible threads to those containing a trace whose root run
         * matches this LangSmith filter expression.
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
         * `tree_filter` narrows eligible threads to those containing a matching run anywhere in a
         * trace tree.
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
         * Returns an immutable instance of [ThreadAggregateStatsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .projectId()
         * .select()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ThreadAggregateStatsParams =
            ThreadAggregateStatsParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val projectId: JsonField<String>,
        private val select: JsonField<List<Select>>,
        private val filter: JsonField<String>,
        private val maxStartTime: JsonField<OffsetDateTime>,
        private val minStartTime: JsonField<OffsetDateTime>,
        private val threadFilter: JsonField<String>,
        private val traceFilter: JsonField<String>,
        private val treeFilter: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("project_id")
            @ExcludeMissing
            projectId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("select")
            @ExcludeMissing
            select: JsonField<List<Select>> = JsonMissing.of(),
            @JsonProperty("filter") @ExcludeMissing filter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_start_time")
            @ExcludeMissing
            maxStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("min_start_time")
            @ExcludeMissing
            minStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("thread_filter")
            @ExcludeMissing
            threadFilter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("trace_filter")
            @ExcludeMissing
            traceFilter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tree_filter")
            @ExcludeMissing
            treeFilter: JsonField<String> = JsonMissing.of(),
        ) : this(
            projectId,
            select,
            filter,
            maxStartTime,
            minStartTime,
            threadFilter,
            traceFilter,
            treeFilter,
            mutableMapOf(),
        )

        /**
         * `project_id` is the tracing project UUID.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun projectId(): String = projectId.getRequired("project_id")

        /**
         * `select` lists the aggregate statistics to compute and return. At least one value is
         * required.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun select(): List<Select> = select.getRequired("select")

        /**
         * `filter` is a deprecated, unscoped LangSmith filter expression evaluated against trace
         * root runs. Kept for compatibility with deployments that serve this endpoint via the
         * legacy ClickHouse backend (no SmithDB query service configured); prefer `trace_filter`,
         * `tree_filter`, or `thread_filter` otherwise, since those require SmithDB.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun filter(): Optional<String> = filter.getOptional("filter")

        /**
         * `max_start_time` is the exclusive upper bound on thread activity (RFC3339 date-time).
         * Defaults to now (UTC) when omitted.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun maxStartTime(): Optional<OffsetDateTime> = maxStartTime.getOptional("max_start_time")

        /**
         * `min_start_time` is the inclusive lower bound on thread activity (RFC3339 date-time).
         * Defaults to 1 day before now (UTC) when omitted.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun minStartTime(): Optional<OffsetDateTime> = minStartTime.getOptional("min_start_time")

        /**
         * `thread_filter` narrows eligible threads using a LangSmith filter expression evaluated
         * against the complete thread summary.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun threadFilter(): Optional<String> = threadFilter.getOptional("thread_filter")

        /**
         * `trace_filter` narrows eligible threads to those containing a trace whose root run
         * matches this LangSmith filter expression.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun traceFilter(): Optional<String> = traceFilter.getOptional("trace_filter")

        /**
         * `tree_filter` narrows eligible threads to those containing a matching run anywhere in a
         * trace tree.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun treeFilter(): Optional<String> = treeFilter.getOptional("tree_filter")

        /**
         * Returns the raw JSON value of [projectId].
         *
         * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("project_id") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

        /**
         * Returns the raw JSON value of [select].
         *
         * Unlike [select], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("select") @ExcludeMissing fun _select(): JsonField<List<Select>> = select

        /**
         * Returns the raw JSON value of [filter].
         *
         * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

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
         * Returns the raw JSON value of [threadFilter].
         *
         * Unlike [threadFilter], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("thread_filter")
        @ExcludeMissing
        fun _threadFilter(): JsonField<String> = threadFilter

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
             * .projectId()
             * .select()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var projectId: JsonField<String>? = null
            private var select: JsonField<MutableList<Select>>? = null
            private var filter: JsonField<String> = JsonMissing.of()
            private var maxStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var minStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var threadFilter: JsonField<String> = JsonMissing.of()
            private var traceFilter: JsonField<String> = JsonMissing.of()
            private var treeFilter: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                projectId = body.projectId
                select = body.select.map { it.toMutableList() }
                filter = body.filter
                maxStartTime = body.maxStartTime
                minStartTime = body.minStartTime
                threadFilter = body.threadFilter
                traceFilter = body.traceFilter
                treeFilter = body.treeFilter
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** `project_id` is the tracing project UUID. */
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
             * `select` lists the aggregate statistics to compute and return. At least one value is
             * required.
             */
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

            /**
             * `filter` is a deprecated, unscoped LangSmith filter expression evaluated against
             * trace root runs. Kept for compatibility with deployments that serve this endpoint via
             * the legacy ClickHouse backend (no SmithDB query service configured); prefer
             * `trace_filter`, `tree_filter`, or `thread_filter` otherwise, since those require
             * SmithDB.
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
             * `max_start_time` is the exclusive upper bound on thread activity (RFC3339 date-time).
             * Defaults to now (UTC) when omitted.
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
             * `min_start_time` is the inclusive lower bound on thread activity (RFC3339 date-time).
             * Defaults to 1 day before now (UTC) when omitted.
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
             * `thread_filter` narrows eligible threads using a LangSmith filter expression
             * evaluated against the complete thread summary.
             */
            fun threadFilter(threadFilter: String) = threadFilter(JsonField.of(threadFilter))

            /**
             * Sets [Builder.threadFilter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.threadFilter] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun threadFilter(threadFilter: JsonField<String>) = apply {
                this.threadFilter = threadFilter
            }

            /**
             * `trace_filter` narrows eligible threads to those containing a trace whose root run
             * matches this LangSmith filter expression.
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
             * `tree_filter` narrows eligible threads to those containing a matching run anywhere in
             * a trace tree.
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
             *
             * The following fields are required:
             * ```java
             * .projectId()
             * .select()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("projectId", projectId),
                    checkRequired("select", select).map { it.toImmutable() },
                    filter,
                    maxStartTime,
                    minStartTime,
                    threadFilter,
                    traceFilter,
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

            projectId()
            select().forEach { it.validate() }
            filter()
            maxStartTime()
            minStartTime()
            threadFilter()
            traceFilter()
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
            (if (projectId.asKnown().isPresent) 1 else 0) +
                (select.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (filter.asKnown().isPresent) 1 else 0) +
                (if (maxStartTime.asKnown().isPresent) 1 else 0) +
                (if (minStartTime.asKnown().isPresent) 1 else 0) +
                (if (threadFilter.asKnown().isPresent) 1 else 0) +
                (if (traceFilter.asKnown().isPresent) 1 else 0) +
                (if (treeFilter.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                projectId == other.projectId &&
                select == other.select &&
                filter == other.filter &&
                maxStartTime == other.maxStartTime &&
                minStartTime == other.minStartTime &&
                threadFilter == other.threadFilter &&
                traceFilter == other.traceFilter &&
                treeFilter == other.treeFilter &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                projectId,
                select,
                filter,
                maxStartTime,
                minStartTime,
                threadFilter,
                traceFilter,
                treeFilter,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{projectId=$projectId, select=$select, filter=$filter, maxStartTime=$maxStartTime, minStartTime=$minStartTime, threadFilter=$threadFilter, traceFilter=$traceFilter, treeFilter=$treeFilter, additionalProperties=$additionalProperties}"
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

            @JvmField val THREAD_COUNT = of("THREAD_COUNT")

            @JvmField val TRACE_COUNT = of("TRACE_COUNT")

            @JvmField val TOTAL_TOKENS = of("TOTAL_TOKENS")

            @JvmField val TOTAL_COST = of("TOTAL_COST")

            @JvmField val ERROR_RATE = of("ERROR_RATE")

            @JvmField val STREAMING_RATE = of("STREAMING_RATE")

            @JvmField val LATENCY_P50 = of("LATENCY_P50")

            @JvmField val LATENCY_P99 = of("LATENCY_P99")

            @JvmField val MEDIAN_TOKENS = of("MEDIAN_TOKENS")

            @JvmField val FIRST_TOKEN_P50 = of("FIRST_TOKEN_P50")

            @JvmField val FIRST_TOKEN_P99 = of("FIRST_TOKEN_P99")

            @JvmField val PROMPT_TOKENS = of("PROMPT_TOKENS")

            @JvmField val COMPLETION_TOKENS = of("COMPLETION_TOKENS")

            @JvmField val PROMPT_COST = of("PROMPT_COST")

            @JvmField val COMPLETION_COST = of("COMPLETION_COST")

            @JvmField val PROMPT_TOKEN_DETAILS = of("PROMPT_TOKEN_DETAILS")

            @JvmField val COMPLETION_TOKEN_DETAILS = of("COMPLETION_TOKEN_DETAILS")

            @JvmField val PROMPT_COST_DETAILS = of("PROMPT_COST_DETAILS")

            @JvmField val COMPLETION_COST_DETAILS = of("COMPLETION_COST_DETAILS")

            @JvmField val THREAD_FEEDBACK_STATS = of("THREAD_FEEDBACK_STATS")

            @JvmStatic fun of(value: String) = Select(JsonField.of(value))
        }

        /** An enum containing [Select]'s known values. */
        enum class Known {
            THREAD_COUNT,
            TRACE_COUNT,
            TOTAL_TOKENS,
            TOTAL_COST,
            ERROR_RATE,
            STREAMING_RATE,
            LATENCY_P50,
            LATENCY_P99,
            MEDIAN_TOKENS,
            FIRST_TOKEN_P50,
            FIRST_TOKEN_P99,
            PROMPT_TOKENS,
            COMPLETION_TOKENS,
            PROMPT_COST,
            COMPLETION_COST,
            PROMPT_TOKEN_DETAILS,
            COMPLETION_TOKEN_DETAILS,
            PROMPT_COST_DETAILS,
            COMPLETION_COST_DETAILS,
            THREAD_FEEDBACK_STATS,
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
            THREAD_COUNT,
            TRACE_COUNT,
            TOTAL_TOKENS,
            TOTAL_COST,
            ERROR_RATE,
            STREAMING_RATE,
            LATENCY_P50,
            LATENCY_P99,
            MEDIAN_TOKENS,
            FIRST_TOKEN_P50,
            FIRST_TOKEN_P99,
            PROMPT_TOKENS,
            COMPLETION_TOKENS,
            PROMPT_COST,
            COMPLETION_COST,
            PROMPT_TOKEN_DETAILS,
            COMPLETION_TOKEN_DETAILS,
            PROMPT_COST_DETAILS,
            COMPLETION_COST_DETAILS,
            THREAD_FEEDBACK_STATS,
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
                THREAD_COUNT -> Value.THREAD_COUNT
                TRACE_COUNT -> Value.TRACE_COUNT
                TOTAL_TOKENS -> Value.TOTAL_TOKENS
                TOTAL_COST -> Value.TOTAL_COST
                ERROR_RATE -> Value.ERROR_RATE
                STREAMING_RATE -> Value.STREAMING_RATE
                LATENCY_P50 -> Value.LATENCY_P50
                LATENCY_P99 -> Value.LATENCY_P99
                MEDIAN_TOKENS -> Value.MEDIAN_TOKENS
                FIRST_TOKEN_P50 -> Value.FIRST_TOKEN_P50
                FIRST_TOKEN_P99 -> Value.FIRST_TOKEN_P99
                PROMPT_TOKENS -> Value.PROMPT_TOKENS
                COMPLETION_TOKENS -> Value.COMPLETION_TOKENS
                PROMPT_COST -> Value.PROMPT_COST
                COMPLETION_COST -> Value.COMPLETION_COST
                PROMPT_TOKEN_DETAILS -> Value.PROMPT_TOKEN_DETAILS
                COMPLETION_TOKEN_DETAILS -> Value.COMPLETION_TOKEN_DETAILS
                PROMPT_COST_DETAILS -> Value.PROMPT_COST_DETAILS
                COMPLETION_COST_DETAILS -> Value.COMPLETION_COST_DETAILS
                THREAD_FEEDBACK_STATS -> Value.THREAD_FEEDBACK_STATS
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
                THREAD_COUNT -> Known.THREAD_COUNT
                TRACE_COUNT -> Known.TRACE_COUNT
                TOTAL_TOKENS -> Known.TOTAL_TOKENS
                TOTAL_COST -> Known.TOTAL_COST
                ERROR_RATE -> Known.ERROR_RATE
                STREAMING_RATE -> Known.STREAMING_RATE
                LATENCY_P50 -> Known.LATENCY_P50
                LATENCY_P99 -> Known.LATENCY_P99
                MEDIAN_TOKENS -> Known.MEDIAN_TOKENS
                FIRST_TOKEN_P50 -> Known.FIRST_TOKEN_P50
                FIRST_TOKEN_P99 -> Known.FIRST_TOKEN_P99
                PROMPT_TOKENS -> Known.PROMPT_TOKENS
                COMPLETION_TOKENS -> Known.COMPLETION_TOKENS
                PROMPT_COST -> Known.PROMPT_COST
                COMPLETION_COST -> Known.COMPLETION_COST
                PROMPT_TOKEN_DETAILS -> Known.PROMPT_TOKEN_DETAILS
                COMPLETION_TOKEN_DETAILS -> Known.COMPLETION_TOKEN_DETAILS
                PROMPT_COST_DETAILS -> Known.PROMPT_COST_DETAILS
                COMPLETION_COST_DETAILS -> Known.COMPLETION_COST_DETAILS
                THREAD_FEEDBACK_STATS -> Known.THREAD_FEEDBACK_STATS
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

        return other is ThreadAggregateStatsParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ThreadAggregateStatsParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

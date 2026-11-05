// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions

import com.fasterxml.jackson.annotation.JsonCreator
import com.langchain.smith.core.Enum
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.Params
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Returns a page of the workspace's tracing projects and experiments. Pass the response's
 * next_cursor as cursor to fetch the next page; next_cursor is null on the last page. A cursor is
 * valid only with the same query parameters as the request that returned it.
 */
class SessionListV2Params
private constructor(
    private val id: List<String>?,
    private val cursor: String?,
    private val datasetVersion: OffsetDateTime?,
    private val filter: String?,
    private val includeFacets: Boolean?,
    private val includeStats: Boolean?,
    private val metadata: String?,
    private val name: String?,
    private val nameContains: String?,
    private val pageSize: Long?,
    private val referenceDatasetId: List<String>?,
    private val referenceFree: Boolean?,
    private val sortBy: SortBy?,
    private val sortByFeedbackKey: String?,
    private val sortByFeedbackSource: SortByFeedbackSource?,
    private val sortOrder: SortOrder?,
    private val statsFilter: String?,
    private val statsSelect: List<String>?,
    private val statsStartTime: OffsetDateTime?,
    private val tagValueId: List<String>?,
    private val useApproxStats: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Only return projects with these IDs */
    fun id(): Optional<List<String>> = Optional.ofNullable(id)

    /** next_cursor from the previous page; omit for the first page */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    /** Only return experiments run against this dataset version (RFC 3339 timestamp) */
    fun datasetVersion(): Optional<OffsetDateTime> = Optional.ofNullable(datasetVersion)

    /** Filter expression, for example eq(name, \ */
    fun filter(): Optional<String> = Optional.ofNullable(filter)

    /** Include run facets */
    fun includeFacets(): Optional<Boolean> = Optional.ofNullable(includeFacets)

    /** Include run statistics */
    fun includeStats(): Optional<Boolean> = Optional.ofNullable(includeStats)

    /** JSON object the project metadata must contain */
    fun metadata(): Optional<String> = Optional.ofNullable(metadata)

    /** Only return the project with this exact name */
    fun name(): Optional<String> = Optional.ofNullable(name)

    /** Only return projects whose name contains this substring */
    fun nameContains(): Optional<String> = Optional.ofNullable(nameContains)

    /** Number of projects per page */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Only return experiments run against these dataset IDs */
    fun referenceDatasetId(): Optional<List<String>> = Optional.ofNullable(referenceDatasetId)

    /** true for tracing projects only, false for experiments only */
    fun referenceFree(): Optional<Boolean> = Optional.ofNullable(referenceFree)

    /** Sort column. FEEDBACK requires reference_dataset_id */
    fun sortBy(): Optional<SortBy> = Optional.ofNullable(sortBy)

    /** Feedback key to sort by; required when sort_by is FEEDBACK */
    fun sortByFeedbackKey(): Optional<String> = Optional.ofNullable(sortByFeedbackKey)

    /** Where the sort feedback is recorded; defaults to RUN when sort_by is FEEDBACK */
    fun sortByFeedbackSource(): Optional<SortByFeedbackSource> =
        Optional.ofNullable(sortByFeedbackSource)

    /** Sort direction */
    fun sortOrder(): Optional<SortOrder> = Optional.ofNullable(sortOrder)

    /** Run filter expression that scopes the statistics */
    fun statsFilter(): Optional<String> = Optional.ofNullable(statsFilter)

    /** Statistics to include when include_stats is true; defaults to all */
    fun statsSelect(): Optional<List<String>> = Optional.ofNullable(statsSelect)

    /** Only aggregate statistics at or after this time, within the last 31 days */
    fun statsStartTime(): Optional<OffsetDateTime> = Optional.ofNullable(statsStartTime)

    /** Only return projects tagged with all of these tag value IDs */
    fun tagValueId(): Optional<List<String>> = Optional.ofNullable(tagValueId)

    /** Compute statistics from pre-aggregated data, which is faster but up to an hour stale */
    fun useApproxStats(): Optional<Boolean> = Optional.ofNullable(useApproxStats)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SessionListV2Params = builder().build()

        /** Returns a mutable builder for constructing an instance of [SessionListV2Params]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SessionListV2Params]. */
    class Builder internal constructor() {

        private var id: MutableList<String>? = null
        private var cursor: String? = null
        private var datasetVersion: OffsetDateTime? = null
        private var filter: String? = null
        private var includeFacets: Boolean? = null
        private var includeStats: Boolean? = null
        private var metadata: String? = null
        private var name: String? = null
        private var nameContains: String? = null
        private var pageSize: Long? = null
        private var referenceDatasetId: MutableList<String>? = null
        private var referenceFree: Boolean? = null
        private var sortBy: SortBy? = null
        private var sortByFeedbackKey: String? = null
        private var sortByFeedbackSource: SortByFeedbackSource? = null
        private var sortOrder: SortOrder? = null
        private var statsFilter: String? = null
        private var statsSelect: MutableList<String>? = null
        private var statsStartTime: OffsetDateTime? = null
        private var tagValueId: MutableList<String>? = null
        private var useApproxStats: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sessionListV2Params: SessionListV2Params) = apply {
            id = sessionListV2Params.id?.toMutableList()
            cursor = sessionListV2Params.cursor
            datasetVersion = sessionListV2Params.datasetVersion
            filter = sessionListV2Params.filter
            includeFacets = sessionListV2Params.includeFacets
            includeStats = sessionListV2Params.includeStats
            metadata = sessionListV2Params.metadata
            name = sessionListV2Params.name
            nameContains = sessionListV2Params.nameContains
            pageSize = sessionListV2Params.pageSize
            referenceDatasetId = sessionListV2Params.referenceDatasetId?.toMutableList()
            referenceFree = sessionListV2Params.referenceFree
            sortBy = sessionListV2Params.sortBy
            sortByFeedbackKey = sessionListV2Params.sortByFeedbackKey
            sortByFeedbackSource = sessionListV2Params.sortByFeedbackSource
            sortOrder = sessionListV2Params.sortOrder
            statsFilter = sessionListV2Params.statsFilter
            statsSelect = sessionListV2Params.statsSelect?.toMutableList()
            statsStartTime = sessionListV2Params.statsStartTime
            tagValueId = sessionListV2Params.tagValueId?.toMutableList()
            useApproxStats = sessionListV2Params.useApproxStats
            additionalHeaders = sessionListV2Params.additionalHeaders.toBuilder()
            additionalQueryParams = sessionListV2Params.additionalQueryParams.toBuilder()
        }

        /** Only return projects with these IDs */
        fun id(id: List<String>?) = apply { this.id = id?.toMutableList() }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<List<String>>) = id(id.getOrNull())

        /**
         * Adds a single [String] to [Builder.id].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addId(id: String) = apply { this.id = (this.id ?: mutableListOf()).apply { add(id) } }

        /** next_cursor from the previous page; omit for the first page */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        /** Only return experiments run against this dataset version (RFC 3339 timestamp) */
        fun datasetVersion(datasetVersion: OffsetDateTime?) = apply {
            this.datasetVersion = datasetVersion
        }

        /** Alias for calling [Builder.datasetVersion] with `datasetVersion.orElse(null)`. */
        fun datasetVersion(datasetVersion: Optional<OffsetDateTime>) =
            datasetVersion(datasetVersion.getOrNull())

        /** Filter expression, for example eq(name, \ */
        fun filter(filter: String?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<String>) = filter(filter.getOrNull())

        /** Include run facets */
        fun includeFacets(includeFacets: Boolean?) = apply { this.includeFacets = includeFacets }

        /**
         * Alias for [Builder.includeFacets].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeFacets(includeFacets: Boolean) = includeFacets(includeFacets as Boolean?)

        /** Alias for calling [Builder.includeFacets] with `includeFacets.orElse(null)`. */
        fun includeFacets(includeFacets: Optional<Boolean>) =
            includeFacets(includeFacets.getOrNull())

        /** Include run statistics */
        fun includeStats(includeStats: Boolean?) = apply { this.includeStats = includeStats }

        /**
         * Alias for [Builder.includeStats].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeStats(includeStats: Boolean) = includeStats(includeStats as Boolean?)

        /** Alias for calling [Builder.includeStats] with `includeStats.orElse(null)`. */
        fun includeStats(includeStats: Optional<Boolean>) = includeStats(includeStats.getOrNull())

        /** JSON object the project metadata must contain */
        fun metadata(metadata: String?) = apply { this.metadata = metadata }

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<String>) = metadata(metadata.getOrNull())

        /** Only return the project with this exact name */
        fun name(name: String?) = apply { this.name = name }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /** Only return projects whose name contains this substring */
        fun nameContains(nameContains: String?) = apply { this.nameContains = nameContains }

        /** Alias for calling [Builder.nameContains] with `nameContains.orElse(null)`. */
        fun nameContains(nameContains: Optional<String>) = nameContains(nameContains.getOrNull())

        /** Number of projects per page */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /** Only return experiments run against these dataset IDs */
        fun referenceDatasetId(referenceDatasetId: List<String>?) = apply {
            this.referenceDatasetId = referenceDatasetId?.toMutableList()
        }

        /**
         * Alias for calling [Builder.referenceDatasetId] with `referenceDatasetId.orElse(null)`.
         */
        fun referenceDatasetId(referenceDatasetId: Optional<List<String>>) =
            referenceDatasetId(referenceDatasetId.getOrNull())

        /**
         * Adds a single [String] to [Builder.referenceDatasetId].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReferenceDatasetId(referenceDatasetId: String) = apply {
            this.referenceDatasetId =
                (this.referenceDatasetId ?: mutableListOf()).apply { add(referenceDatasetId) }
        }

        /** true for tracing projects only, false for experiments only */
        fun referenceFree(referenceFree: Boolean?) = apply { this.referenceFree = referenceFree }

        /**
         * Alias for [Builder.referenceFree].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun referenceFree(referenceFree: Boolean) = referenceFree(referenceFree as Boolean?)

        /** Alias for calling [Builder.referenceFree] with `referenceFree.orElse(null)`. */
        fun referenceFree(referenceFree: Optional<Boolean>) =
            referenceFree(referenceFree.getOrNull())

        /** Sort column. FEEDBACK requires reference_dataset_id */
        fun sortBy(sortBy: SortBy?) = apply { this.sortBy = sortBy }

        /** Alias for calling [Builder.sortBy] with `sortBy.orElse(null)`. */
        fun sortBy(sortBy: Optional<SortBy>) = sortBy(sortBy.getOrNull())

        /** Feedback key to sort by; required when sort_by is FEEDBACK */
        fun sortByFeedbackKey(sortByFeedbackKey: String?) = apply {
            this.sortByFeedbackKey = sortByFeedbackKey
        }

        /** Alias for calling [Builder.sortByFeedbackKey] with `sortByFeedbackKey.orElse(null)`. */
        fun sortByFeedbackKey(sortByFeedbackKey: Optional<String>) =
            sortByFeedbackKey(sortByFeedbackKey.getOrNull())

        /** Where the sort feedback is recorded; defaults to RUN when sort_by is FEEDBACK */
        fun sortByFeedbackSource(sortByFeedbackSource: SortByFeedbackSource?) = apply {
            this.sortByFeedbackSource = sortByFeedbackSource
        }

        /**
         * Alias for calling [Builder.sortByFeedbackSource] with
         * `sortByFeedbackSource.orElse(null)`.
         */
        fun sortByFeedbackSource(sortByFeedbackSource: Optional<SortByFeedbackSource>) =
            sortByFeedbackSource(sortByFeedbackSource.getOrNull())

        /** Sort direction */
        fun sortOrder(sortOrder: SortOrder?) = apply { this.sortOrder = sortOrder }

        /** Alias for calling [Builder.sortOrder] with `sortOrder.orElse(null)`. */
        fun sortOrder(sortOrder: Optional<SortOrder>) = sortOrder(sortOrder.getOrNull())

        /** Run filter expression that scopes the statistics */
        fun statsFilter(statsFilter: String?) = apply { this.statsFilter = statsFilter }

        /** Alias for calling [Builder.statsFilter] with `statsFilter.orElse(null)`. */
        fun statsFilter(statsFilter: Optional<String>) = statsFilter(statsFilter.getOrNull())

        /** Statistics to include when include_stats is true; defaults to all */
        fun statsSelect(statsSelect: List<String>?) = apply {
            this.statsSelect = statsSelect?.toMutableList()
        }

        /** Alias for calling [Builder.statsSelect] with `statsSelect.orElse(null)`. */
        fun statsSelect(statsSelect: Optional<List<String>>) = statsSelect(statsSelect.getOrNull())

        /**
         * Adds a single [String] to [Builder.statsSelect].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStatsSelect(statsSelect: String) = apply {
            this.statsSelect = (this.statsSelect ?: mutableListOf()).apply { add(statsSelect) }
        }

        /** Only aggregate statistics at or after this time, within the last 31 days */
        fun statsStartTime(statsStartTime: OffsetDateTime?) = apply {
            this.statsStartTime = statsStartTime
        }

        /** Alias for calling [Builder.statsStartTime] with `statsStartTime.orElse(null)`. */
        fun statsStartTime(statsStartTime: Optional<OffsetDateTime>) =
            statsStartTime(statsStartTime.getOrNull())

        /** Only return projects tagged with all of these tag value IDs */
        fun tagValueId(tagValueId: List<String>?) = apply {
            this.tagValueId = tagValueId?.toMutableList()
        }

        /** Alias for calling [Builder.tagValueId] with `tagValueId.orElse(null)`. */
        fun tagValueId(tagValueId: Optional<List<String>>) = tagValueId(tagValueId.getOrNull())

        /**
         * Adds a single [String] to [Builder.tagValueId].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTagValueId(tagValueId: String) = apply {
            this.tagValueId = (this.tagValueId ?: mutableListOf()).apply { add(tagValueId) }
        }

        /** Compute statistics from pre-aggregated data, which is faster but up to an hour stale */
        fun useApproxStats(useApproxStats: Boolean?) = apply {
            this.useApproxStats = useApproxStats
        }

        /**
         * Alias for [Builder.useApproxStats].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun useApproxStats(useApproxStats: Boolean) = useApproxStats(useApproxStats as Boolean?)

        /** Alias for calling [Builder.useApproxStats] with `useApproxStats.orElse(null)`. */
        fun useApproxStats(useApproxStats: Optional<Boolean>) =
            useApproxStats(useApproxStats.getOrNull())

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
         * Returns an immutable instance of [SessionListV2Params].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SessionListV2Params =
            SessionListV2Params(
                id?.toImmutable(),
                cursor,
                datasetVersion,
                filter,
                includeFacets,
                includeStats,
                metadata,
                name,
                nameContains,
                pageSize,
                referenceDatasetId?.toImmutable(),
                referenceFree,
                sortBy,
                sortByFeedbackKey,
                sortByFeedbackSource,
                sortOrder,
                statsFilter,
                statsSelect?.toImmutable(),
                statsStartTime,
                tagValueId?.toImmutable(),
                useApproxStats,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                id?.forEach { put("id", it) }
                cursor?.let { put("cursor", it) }
                datasetVersion?.let {
                    put("dataset_version", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                filter?.let { put("filter", it) }
                includeFacets?.let { put("include_facets", it.toString()) }
                includeStats?.let { put("include_stats", it.toString()) }
                metadata?.let { put("metadata", it) }
                name?.let { put("name", it) }
                nameContains?.let { put("name_contains", it) }
                pageSize?.let { put("page_size", it.toString()) }
                referenceDatasetId?.forEach { put("reference_dataset_id", it) }
                referenceFree?.let { put("reference_free", it.toString()) }
                sortBy?.let { put("sort_by", it.toString()) }
                sortByFeedbackKey?.let { put("sort_by_feedback_key", it) }
                sortByFeedbackSource?.let { put("sort_by_feedback_source", it.toString()) }
                sortOrder?.let { put("sort_order", it.toString()) }
                statsFilter?.let { put("stats_filter", it) }
                statsSelect?.forEach { put("stats_select", it) }
                statsStartTime?.let {
                    put("stats_start_time", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                tagValueId?.forEach { put("tag_value_id", it) }
                useApproxStats?.let { put("use_approx_stats", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Sort column. FEEDBACK requires reference_dataset_id */
    class SortBy @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val NAME = of("NAME")

            @JvmField val START_TIME = of("START_TIME")

            @JvmField val LAST_RUN_START_TIME = of("LAST_RUN_START_TIME")

            @JvmField val ERROR_RATE = of("ERROR_RATE")

            @JvmField val LATENCY_P50 = of("LATENCY_P50")

            @JvmField val LATENCY_P99 = of("LATENCY_P99")

            @JvmField val FEEDBACK = of("FEEDBACK")

            @JvmStatic fun of(value: String) = SortBy(JsonField.of(value))
        }

        /** An enum containing [SortBy]'s known values. */
        enum class Known {
            NAME,
            START_TIME,
            LAST_RUN_START_TIME,
            ERROR_RATE,
            LATENCY_P50,
            LATENCY_P99,
            FEEDBACK,
        }

        /**
         * An enum containing [SortBy]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SortBy] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NAME,
            START_TIME,
            LAST_RUN_START_TIME,
            ERROR_RATE,
            LATENCY_P50,
            LATENCY_P99,
            FEEDBACK,
            /** An enum member indicating that [SortBy] was instantiated with an unknown value. */
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
                NAME -> Value.NAME
                START_TIME -> Value.START_TIME
                LAST_RUN_START_TIME -> Value.LAST_RUN_START_TIME
                ERROR_RATE -> Value.ERROR_RATE
                LATENCY_P50 -> Value.LATENCY_P50
                LATENCY_P99 -> Value.LATENCY_P99
                FEEDBACK -> Value.FEEDBACK
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
                NAME -> Known.NAME
                START_TIME -> Known.START_TIME
                LAST_RUN_START_TIME -> Known.LAST_RUN_START_TIME
                ERROR_RATE -> Known.ERROR_RATE
                LATENCY_P50 -> Known.LATENCY_P50
                LATENCY_P99 -> Known.LATENCY_P99
                FEEDBACK -> Known.FEEDBACK
                else -> throw LangChainInvalidDataException("Unknown SortBy: $value")
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
        fun validate(): SortBy = apply {
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

            return other is SortBy && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Where the sort feedback is recorded; defaults to RUN when sort_by is FEEDBACK */
    class SortByFeedbackSource
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val RUN = of("RUN")

            @JvmField val SESSION = of("SESSION")

            @JvmStatic fun of(value: String) = SortByFeedbackSource(JsonField.of(value))
        }

        /** An enum containing [SortByFeedbackSource]'s known values. */
        enum class Known {
            RUN,
            SESSION,
        }

        /**
         * An enum containing [SortByFeedbackSource]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [SortByFeedbackSource] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            RUN,
            SESSION,
            /**
             * An enum member indicating that [SortByFeedbackSource] was instantiated with an
             * unknown value.
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
                RUN -> Value.RUN
                SESSION -> Value.SESSION
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
                RUN -> Known.RUN
                SESSION -> Known.SESSION
                else -> throw LangChainInvalidDataException("Unknown SortByFeedbackSource: $value")
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
        fun validate(): SortByFeedbackSource = apply {
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

            return other is SortByFeedbackSource && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Sort direction */
    class SortOrder @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmStatic fun of(value: String) = SortOrder(JsonField.of(value))
        }

        /** An enum containing [SortOrder]'s known values. */
        enum class Known {
            ASC,
            DESC,
        }

        /**
         * An enum containing [SortOrder]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SortOrder] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ASC,
            DESC,
            /**
             * An enum member indicating that [SortOrder] was instantiated with an unknown value.
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
                else -> throw LangChainInvalidDataException("Unknown SortOrder: $value")
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
        fun validate(): SortOrder = apply {
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

            return other is SortOrder && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionListV2Params &&
            id == other.id &&
            cursor == other.cursor &&
            datasetVersion == other.datasetVersion &&
            filter == other.filter &&
            includeFacets == other.includeFacets &&
            includeStats == other.includeStats &&
            metadata == other.metadata &&
            name == other.name &&
            nameContains == other.nameContains &&
            pageSize == other.pageSize &&
            referenceDatasetId == other.referenceDatasetId &&
            referenceFree == other.referenceFree &&
            sortBy == other.sortBy &&
            sortByFeedbackKey == other.sortByFeedbackKey &&
            sortByFeedbackSource == other.sortByFeedbackSource &&
            sortOrder == other.sortOrder &&
            statsFilter == other.statsFilter &&
            statsSelect == other.statsSelect &&
            statsStartTime == other.statsStartTime &&
            tagValueId == other.tagValueId &&
            useApproxStats == other.useApproxStats &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            cursor,
            datasetVersion,
            filter,
            includeFacets,
            includeStats,
            metadata,
            name,
            nameContains,
            pageSize,
            referenceDatasetId,
            referenceFree,
            sortBy,
            sortByFeedbackKey,
            sortByFeedbackSource,
            sortOrder,
            statsFilter,
            statsSelect,
            statsStartTime,
            tagValueId,
            useApproxStats,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SessionListV2Params{id=$id, cursor=$cursor, datasetVersion=$datasetVersion, filter=$filter, includeFacets=$includeFacets, includeStats=$includeStats, metadata=$metadata, name=$name, nameContains=$nameContains, pageSize=$pageSize, referenceDatasetId=$referenceDatasetId, referenceFree=$referenceFree, sortBy=$sortBy, sortByFeedbackKey=$sortByFeedbackKey, sortByFeedbackSource=$sortByFeedbackSource, sortOrder=$sortOrder, statsFilter=$statsFilter, statsSelect=$statsSelect, statsStartTime=$statsStartTime, tagValueId=$tagValueId, useApproxStats=$useApproxStats, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

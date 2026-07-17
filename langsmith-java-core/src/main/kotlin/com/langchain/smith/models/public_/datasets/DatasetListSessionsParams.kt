// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.public_.datasets

import com.langchain.smith.core.Params
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.models.sessions.SessionSortableColumns
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get projects run on a dataset that has been shared. */
class DatasetListSessionsParams
private constructor(
    private val shareToken: String?,
    private val id: List<String>?,
    private val datasetVersion: String?,
    private val facets: Boolean?,
    private val limit: Long?,
    private val name: String?,
    private val nameContains: String?,
    private val offset: Long?,
    private val sortBy: SessionSortableColumns?,
    private val sortByDesc: Boolean?,
    private val sortByFeedbackKey: String?,
    private val sortByFeedbackSource: String?,
    private val statsFilter: String?,
    private val statsSelect: List<String>?,
    private val statsStartTime: OffsetDateTime?,
    private val useApproxStats: Boolean?,
    private val accept: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun shareToken(): Optional<String> = Optional.ofNullable(shareToken)

    fun id(): Optional<List<String>> = Optional.ofNullable(id)

    fun datasetVersion(): Optional<String> = Optional.ofNullable(datasetVersion)

    fun facets(): Optional<Boolean> = Optional.ofNullable(facets)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun nameContains(): Optional<String> = Optional.ofNullable(nameContains)

    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    fun sortBy(): Optional<SessionSortableColumns> = Optional.ofNullable(sortBy)

    fun sortByDesc(): Optional<Boolean> = Optional.ofNullable(sortByDesc)

    fun sortByFeedbackKey(): Optional<String> = Optional.ofNullable(sortByFeedbackKey)

    fun sortByFeedbackSource(): Optional<String> = Optional.ofNullable(sortByFeedbackSource)

    fun statsFilter(): Optional<String> = Optional.ofNullable(statsFilter)

    fun statsSelect(): Optional<List<String>> = Optional.ofNullable(statsSelect)

    fun statsStartTime(): Optional<OffsetDateTime> = Optional.ofNullable(statsStartTime)

    fun useApproxStats(): Optional<Boolean> = Optional.ofNullable(useApproxStats)

    fun accept(): Optional<String> = Optional.ofNullable(accept)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): DatasetListSessionsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [DatasetListSessionsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DatasetListSessionsParams]. */
    class Builder internal constructor() {

        private var shareToken: String? = null
        private var id: MutableList<String>? = null
        private var datasetVersion: String? = null
        private var facets: Boolean? = null
        private var limit: Long? = null
        private var name: String? = null
        private var nameContains: String? = null
        private var offset: Long? = null
        private var sortBy: SessionSortableColumns? = null
        private var sortByDesc: Boolean? = null
        private var sortByFeedbackKey: String? = null
        private var sortByFeedbackSource: String? = null
        private var statsFilter: String? = null
        private var statsSelect: MutableList<String>? = null
        private var statsStartTime: OffsetDateTime? = null
        private var useApproxStats: Boolean? = null
        private var accept: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(datasetListSessionsParams: DatasetListSessionsParams) = apply {
            shareToken = datasetListSessionsParams.shareToken
            id = datasetListSessionsParams.id?.toMutableList()
            datasetVersion = datasetListSessionsParams.datasetVersion
            facets = datasetListSessionsParams.facets
            limit = datasetListSessionsParams.limit
            name = datasetListSessionsParams.name
            nameContains = datasetListSessionsParams.nameContains
            offset = datasetListSessionsParams.offset
            sortBy = datasetListSessionsParams.sortBy
            sortByDesc = datasetListSessionsParams.sortByDesc
            sortByFeedbackKey = datasetListSessionsParams.sortByFeedbackKey
            sortByFeedbackSource = datasetListSessionsParams.sortByFeedbackSource
            statsFilter = datasetListSessionsParams.statsFilter
            statsSelect = datasetListSessionsParams.statsSelect?.toMutableList()
            statsStartTime = datasetListSessionsParams.statsStartTime
            useApproxStats = datasetListSessionsParams.useApproxStats
            accept = datasetListSessionsParams.accept
            additionalHeaders = datasetListSessionsParams.additionalHeaders.toBuilder()
            additionalQueryParams = datasetListSessionsParams.additionalQueryParams.toBuilder()
        }

        fun shareToken(shareToken: String?) = apply { this.shareToken = shareToken }

        /** Alias for calling [Builder.shareToken] with `shareToken.orElse(null)`. */
        fun shareToken(shareToken: Optional<String>) = shareToken(shareToken.getOrNull())

        fun id(id: List<String>?) = apply { this.id = id?.toMutableList() }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<List<String>>) = id(id.getOrNull())

        /**
         * Adds a single [String] to [Builder.id].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addId(id: String) = apply { this.id = (this.id ?: mutableListOf()).apply { add(id) } }

        fun datasetVersion(datasetVersion: String?) = apply { this.datasetVersion = datasetVersion }

        /** Alias for calling [Builder.datasetVersion] with `datasetVersion.orElse(null)`. */
        fun datasetVersion(datasetVersion: Optional<String>) =
            datasetVersion(datasetVersion.getOrNull())

        fun facets(facets: Boolean?) = apply { this.facets = facets }

        /**
         * Alias for [Builder.facets].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun facets(facets: Boolean) = facets(facets as Boolean?)

        /** Alias for calling [Builder.facets] with `facets.orElse(null)`. */
        fun facets(facets: Optional<Boolean>) = facets(facets.getOrNull())

        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        fun name(name: String?) = apply { this.name = name }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        fun nameContains(nameContains: String?) = apply { this.nameContains = nameContains }

        /** Alias for calling [Builder.nameContains] with `nameContains.orElse(null)`. */
        fun nameContains(nameContains: Optional<String>) = nameContains(nameContains.getOrNull())

        fun offset(offset: Long?) = apply { this.offset = offset }

        /**
         * Alias for [Builder.offset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun offset(offset: Long) = offset(offset as Long?)

        /** Alias for calling [Builder.offset] with `offset.orElse(null)`. */
        fun offset(offset: Optional<Long>) = offset(offset.getOrNull())

        fun sortBy(sortBy: SessionSortableColumns?) = apply { this.sortBy = sortBy }

        /** Alias for calling [Builder.sortBy] with `sortBy.orElse(null)`. */
        fun sortBy(sortBy: Optional<SessionSortableColumns>) = sortBy(sortBy.getOrNull())

        fun sortByDesc(sortByDesc: Boolean?) = apply { this.sortByDesc = sortByDesc }

        /**
         * Alias for [Builder.sortByDesc].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun sortByDesc(sortByDesc: Boolean) = sortByDesc(sortByDesc as Boolean?)

        /** Alias for calling [Builder.sortByDesc] with `sortByDesc.orElse(null)`. */
        fun sortByDesc(sortByDesc: Optional<Boolean>) = sortByDesc(sortByDesc.getOrNull())

        fun sortByFeedbackKey(sortByFeedbackKey: String?) = apply {
            this.sortByFeedbackKey = sortByFeedbackKey
        }

        /** Alias for calling [Builder.sortByFeedbackKey] with `sortByFeedbackKey.orElse(null)`. */
        fun sortByFeedbackKey(sortByFeedbackKey: Optional<String>) =
            sortByFeedbackKey(sortByFeedbackKey.getOrNull())

        fun sortByFeedbackSource(sortByFeedbackSource: String?) = apply {
            this.sortByFeedbackSource = sortByFeedbackSource
        }

        /**
         * Alias for calling [Builder.sortByFeedbackSource] with
         * `sortByFeedbackSource.orElse(null)`.
         */
        fun sortByFeedbackSource(sortByFeedbackSource: Optional<String>) =
            sortByFeedbackSource(sortByFeedbackSource.getOrNull())

        fun statsFilter(statsFilter: String?) = apply { this.statsFilter = statsFilter }

        /** Alias for calling [Builder.statsFilter] with `statsFilter.orElse(null)`. */
        fun statsFilter(statsFilter: Optional<String>) = statsFilter(statsFilter.getOrNull())

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

        fun statsStartTime(statsStartTime: OffsetDateTime?) = apply {
            this.statsStartTime = statsStartTime
        }

        /** Alias for calling [Builder.statsStartTime] with `statsStartTime.orElse(null)`. */
        fun statsStartTime(statsStartTime: Optional<OffsetDateTime>) =
            statsStartTime(statsStartTime.getOrNull())

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

        fun accept(accept: String?) = apply { this.accept = accept }

        /** Alias for calling [Builder.accept] with `accept.orElse(null)`. */
        fun accept(accept: Optional<String>) = accept(accept.getOrNull())

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
         * Returns an immutable instance of [DatasetListSessionsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DatasetListSessionsParams =
            DatasetListSessionsParams(
                shareToken,
                id?.toImmutable(),
                datasetVersion,
                facets,
                limit,
                name,
                nameContains,
                offset,
                sortBy,
                sortByDesc,
                sortByFeedbackKey,
                sortByFeedbackSource,
                statsFilter,
                statsSelect?.toImmutable(),
                statsStartTime,
                useApproxStats,
                accept,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> shareToken ?: ""
            else -> ""
        }

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                accept?.let { put("accept", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                id?.forEach { put("id", it) }
                datasetVersion?.let { put("dataset_version", it) }
                facets?.let { put("facets", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                name?.let { put("name", it) }
                nameContains?.let { put("name_contains", it) }
                offset?.let { put("offset", it.toString()) }
                sortBy?.let { put("sort_by", it.toString()) }
                sortByDesc?.let { put("sort_by_desc", it.toString()) }
                sortByFeedbackKey?.let { put("sort_by_feedback_key", it) }
                sortByFeedbackSource?.let { put("sort_by_feedback_source", it) }
                statsFilter?.let { put("stats_filter", it) }
                statsSelect?.forEach { put("stats_select", it) }
                statsStartTime?.let {
                    put("stats_start_time", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                useApproxStats?.let { put("use_approx_stats", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatasetListSessionsParams &&
            shareToken == other.shareToken &&
            id == other.id &&
            datasetVersion == other.datasetVersion &&
            facets == other.facets &&
            limit == other.limit &&
            name == other.name &&
            nameContains == other.nameContains &&
            offset == other.offset &&
            sortBy == other.sortBy &&
            sortByDesc == other.sortByDesc &&
            sortByFeedbackKey == other.sortByFeedbackKey &&
            sortByFeedbackSource == other.sortByFeedbackSource &&
            statsFilter == other.statsFilter &&
            statsSelect == other.statsSelect &&
            statsStartTime == other.statsStartTime &&
            useApproxStats == other.useApproxStats &&
            accept == other.accept &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            shareToken,
            id,
            datasetVersion,
            facets,
            limit,
            name,
            nameContains,
            offset,
            sortBy,
            sortByDesc,
            sortByFeedbackKey,
            sortByFeedbackSource,
            statsFilter,
            statsSelect,
            statsStartTime,
            useApproxStats,
            accept,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "DatasetListSessionsParams{shareToken=$shareToken, id=$id, datasetVersion=$datasetVersion, facets=$facets, limit=$limit, name=$name, nameContains=$nameContains, offset=$offset, sortBy=$sortBy, sortByDesc=$sortByDesc, sortByFeedbackKey=$sortByFeedbackKey, sortByFeedbackSource=$sortByFeedbackSource, statsFilter=$statsFilter, statsSelect=$statsSelect, statsStartTime=$statsStartTime, useApproxStats=$useApproxStats, accept=$accept, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

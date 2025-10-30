// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.sessions

import com.langsmith_api.api.core.Params
import com.langsmith_api.api.core.http.Headers
import com.langsmith_api.api.core.http.QueryParams
import com.langsmith_api.api.core.toImmutable
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get all sessions. */
class SessionListParams
private constructor(
    private val id: List<String>?,
    private val datasetVersion: String?,
    private val facets: Boolean?,
    private val filter: String?,
    private val includeStats: Boolean?,
    private val limit: Long?,
    private val metadata: String?,
    private val name: String?,
    private val nameContains: String?,
    private val offset: Long?,
    private val referenceDataset: List<String>?,
    private val referenceFree: Boolean?,
    private val sortBy: SessionSortableColumns?,
    private val sortByDesc: Boolean?,
    private val sortByFeedbackKey: String?,
    private val statsStartTime: OffsetDateTime?,
    private val tagValueId: List<String>?,
    private val useApproxStats: Boolean?,
    private val accept: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<List<String>> = Optional.ofNullable(id)

    fun datasetVersion(): Optional<String> = Optional.ofNullable(datasetVersion)

    fun facets(): Optional<Boolean> = Optional.ofNullable(facets)

    fun filter(): Optional<String> = Optional.ofNullable(filter)

    fun includeStats(): Optional<Boolean> = Optional.ofNullable(includeStats)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun metadata(): Optional<String> = Optional.ofNullable(metadata)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun nameContains(): Optional<String> = Optional.ofNullable(nameContains)

    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    fun referenceDataset(): Optional<List<String>> = Optional.ofNullable(referenceDataset)

    fun referenceFree(): Optional<Boolean> = Optional.ofNullable(referenceFree)

    fun sortBy(): Optional<SessionSortableColumns> = Optional.ofNullable(sortBy)

    fun sortByDesc(): Optional<Boolean> = Optional.ofNullable(sortByDesc)

    fun sortByFeedbackKey(): Optional<String> = Optional.ofNullable(sortByFeedbackKey)

    fun statsStartTime(): Optional<OffsetDateTime> = Optional.ofNullable(statsStartTime)

    fun tagValueId(): Optional<List<String>> = Optional.ofNullable(tagValueId)

    fun useApproxStats(): Optional<Boolean> = Optional.ofNullable(useApproxStats)

    fun accept(): Optional<String> = Optional.ofNullable(accept)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SessionListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [SessionListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SessionListParams]. */
    class Builder internal constructor() {

        private var id: MutableList<String>? = null
        private var datasetVersion: String? = null
        private var facets: Boolean? = null
        private var filter: String? = null
        private var includeStats: Boolean? = null
        private var limit: Long? = null
        private var metadata: String? = null
        private var name: String? = null
        private var nameContains: String? = null
        private var offset: Long? = null
        private var referenceDataset: MutableList<String>? = null
        private var referenceFree: Boolean? = null
        private var sortBy: SessionSortableColumns? = null
        private var sortByDesc: Boolean? = null
        private var sortByFeedbackKey: String? = null
        private var statsStartTime: OffsetDateTime? = null
        private var tagValueId: MutableList<String>? = null
        private var useApproxStats: Boolean? = null
        private var accept: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sessionListParams: SessionListParams) = apply {
            id = sessionListParams.id?.toMutableList()
            datasetVersion = sessionListParams.datasetVersion
            facets = sessionListParams.facets
            filter = sessionListParams.filter
            includeStats = sessionListParams.includeStats
            limit = sessionListParams.limit
            metadata = sessionListParams.metadata
            name = sessionListParams.name
            nameContains = sessionListParams.nameContains
            offset = sessionListParams.offset
            referenceDataset = sessionListParams.referenceDataset?.toMutableList()
            referenceFree = sessionListParams.referenceFree
            sortBy = sessionListParams.sortBy
            sortByDesc = sessionListParams.sortByDesc
            sortByFeedbackKey = sessionListParams.sortByFeedbackKey
            statsStartTime = sessionListParams.statsStartTime
            tagValueId = sessionListParams.tagValueId?.toMutableList()
            useApproxStats = sessionListParams.useApproxStats
            accept = sessionListParams.accept
            additionalHeaders = sessionListParams.additionalHeaders.toBuilder()
            additionalQueryParams = sessionListParams.additionalQueryParams.toBuilder()
        }

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

        fun filter(filter: String?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<String>) = filter(filter.getOrNull())

        fun includeStats(includeStats: Boolean?) = apply { this.includeStats = includeStats }

        /**
         * Alias for [Builder.includeStats].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeStats(includeStats: Boolean) = includeStats(includeStats as Boolean?)

        /** Alias for calling [Builder.includeStats] with `includeStats.orElse(null)`. */
        fun includeStats(includeStats: Optional<Boolean>) = includeStats(includeStats.getOrNull())

        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        fun metadata(metadata: String?) = apply { this.metadata = metadata }

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<String>) = metadata(metadata.getOrNull())

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

        fun referenceDataset(referenceDataset: List<String>?) = apply {
            this.referenceDataset = referenceDataset?.toMutableList()
        }

        /** Alias for calling [Builder.referenceDataset] with `referenceDataset.orElse(null)`. */
        fun referenceDataset(referenceDataset: Optional<List<String>>) =
            referenceDataset(referenceDataset.getOrNull())

        /**
         * Adds a single [String] to [Builder.referenceDataset].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReferenceDataset(referenceDataset: String) = apply {
            this.referenceDataset =
                (this.referenceDataset ?: mutableListOf()).apply { add(referenceDataset) }
        }

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

        fun statsStartTime(statsStartTime: OffsetDateTime?) = apply {
            this.statsStartTime = statsStartTime
        }

        /** Alias for calling [Builder.statsStartTime] with `statsStartTime.orElse(null)`. */
        fun statsStartTime(statsStartTime: Optional<OffsetDateTime>) =
            statsStartTime(statsStartTime.getOrNull())

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
         * Returns an immutable instance of [SessionListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SessionListParams =
            SessionListParams(
                id?.toImmutable(),
                datasetVersion,
                facets,
                filter,
                includeStats,
                limit,
                metadata,
                name,
                nameContains,
                offset,
                referenceDataset?.toImmutable(),
                referenceFree,
                sortBy,
                sortByDesc,
                sortByFeedbackKey,
                statsStartTime,
                tagValueId?.toImmutable(),
                useApproxStats,
                accept,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
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
                id?.let { put("id", it.joinToString(",")) }
                datasetVersion?.let { put("dataset_version", it) }
                facets?.let { put("facets", it.toString()) }
                filter?.let { put("filter", it) }
                includeStats?.let { put("include_stats", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                metadata?.let { put("metadata", it) }
                name?.let { put("name", it) }
                nameContains?.let { put("name_contains", it) }
                offset?.let { put("offset", it.toString()) }
                referenceDataset?.let { put("reference_dataset", it.joinToString(",")) }
                referenceFree?.let { put("reference_free", it.toString()) }
                sortBy?.let { put("sort_by", it.toString()) }
                sortByDesc?.let { put("sort_by_desc", it.toString()) }
                sortByFeedbackKey?.let { put("sort_by_feedback_key", it) }
                statsStartTime?.let {
                    put("stats_start_time", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                tagValueId?.let { put("tag_value_id", it.joinToString(",")) }
                useApproxStats?.let { put("use_approx_stats", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionListParams &&
            id == other.id &&
            datasetVersion == other.datasetVersion &&
            facets == other.facets &&
            filter == other.filter &&
            includeStats == other.includeStats &&
            limit == other.limit &&
            metadata == other.metadata &&
            name == other.name &&
            nameContains == other.nameContains &&
            offset == other.offset &&
            referenceDataset == other.referenceDataset &&
            referenceFree == other.referenceFree &&
            sortBy == other.sortBy &&
            sortByDesc == other.sortByDesc &&
            sortByFeedbackKey == other.sortByFeedbackKey &&
            statsStartTime == other.statsStartTime &&
            tagValueId == other.tagValueId &&
            useApproxStats == other.useApproxStats &&
            accept == other.accept &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            datasetVersion,
            facets,
            filter,
            includeStats,
            limit,
            metadata,
            name,
            nameContains,
            offset,
            referenceDataset,
            referenceFree,
            sortBy,
            sortByDesc,
            sortByFeedbackKey,
            statsStartTime,
            tagValueId,
            useApproxStats,
            accept,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SessionListParams{id=$id, datasetVersion=$datasetVersion, facets=$facets, filter=$filter, includeStats=$includeStats, limit=$limit, metadata=$metadata, name=$name, nameContains=$nameContains, offset=$offset, referenceDataset=$referenceDataset, referenceFree=$referenceFree, sortBy=$sortBy, sortByDesc=$sortByDesc, sortByFeedbackKey=$sortByFeedbackKey, statsStartTime=$statsStartTime, tagValueId=$tagValueId, useApproxStats=$useApproxStats, accept=$accept, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.public_.datasets

import com.langsmith_api.api.core.Params
import com.langsmith_api.api.core.http.Headers
import com.langsmith_api.api.core.http.QueryParams
import com.langsmith_api.api.core.toImmutable
import com.langsmith_api.api.models.api.v1.sessions.SessionSortableColumns
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get projects run on a dataset that has been shared. */
class DatasetRetrieveSessionsParams
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

    fun accept(): Optional<String> = Optional.ofNullable(accept)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): DatasetRetrieveSessionsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [DatasetRetrieveSessionsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DatasetRetrieveSessionsParams]. */
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
        private var accept: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(datasetRetrieveSessionsParams: DatasetRetrieveSessionsParams) = apply {
            shareToken = datasetRetrieveSessionsParams.shareToken
            id = datasetRetrieveSessionsParams.id?.toMutableList()
            datasetVersion = datasetRetrieveSessionsParams.datasetVersion
            facets = datasetRetrieveSessionsParams.facets
            limit = datasetRetrieveSessionsParams.limit
            name = datasetRetrieveSessionsParams.name
            nameContains = datasetRetrieveSessionsParams.nameContains
            offset = datasetRetrieveSessionsParams.offset
            sortBy = datasetRetrieveSessionsParams.sortBy
            sortByDesc = datasetRetrieveSessionsParams.sortByDesc
            sortByFeedbackKey = datasetRetrieveSessionsParams.sortByFeedbackKey
            accept = datasetRetrieveSessionsParams.accept
            additionalHeaders = datasetRetrieveSessionsParams.additionalHeaders.toBuilder()
            additionalQueryParams = datasetRetrieveSessionsParams.additionalQueryParams.toBuilder()
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
         * Returns an immutable instance of [DatasetRetrieveSessionsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DatasetRetrieveSessionsParams =
            DatasetRetrieveSessionsParams(
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
                id?.let { put("id", it.joinToString(",")) }
                datasetVersion?.let { put("dataset_version", it) }
                facets?.let { put("facets", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                name?.let { put("name", it) }
                nameContains?.let { put("name_contains", it) }
                offset?.let { put("offset", it.toString()) }
                sortBy?.let { put("sort_by", it.toString()) }
                sortByDesc?.let { put("sort_by_desc", it.toString()) }
                sortByFeedbackKey?.let { put("sort_by_feedback_key", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatasetRetrieveSessionsParams &&
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
            accept,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "DatasetRetrieveSessionsParams{shareToken=$shareToken, id=$id, datasetVersion=$datasetVersion, facets=$facets, limit=$limit, name=$name, nameContains=$nameContains, offset=$offset, sortBy=$sortBy, sortByDesc=$sortByDesc, sortByFeedbackKey=$sortByFeedbackKey, accept=$accept, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

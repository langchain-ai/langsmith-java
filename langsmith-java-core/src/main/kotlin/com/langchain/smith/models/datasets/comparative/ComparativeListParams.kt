// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.comparative

import com.langchain.smith.core.Params
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get all comparative experiments for a given dataset. */
class ComparativeListParams
private constructor(
    private val datasetId: String?,
    private val id: List<String>?,
    private val limit: Long?,
    private val name: String?,
    private val nameContains: String?,
    private val offset: Long?,
    private val sortBy: SortByComparativeExperimentColumn?,
    private val sortByDesc: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun datasetId(): Optional<String> = Optional.ofNullable(datasetId)

    fun id(): Optional<List<String>> = Optional.ofNullable(id)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun nameContains(): Optional<String> = Optional.ofNullable(nameContains)

    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    /** Enum for available comparative experiment columns to sort by. */
    fun sortBy(): Optional<SortByComparativeExperimentColumn> = Optional.ofNullable(sortBy)

    fun sortByDesc(): Optional<Boolean> = Optional.ofNullable(sortByDesc)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ComparativeListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ComparativeListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ComparativeListParams]. */
    class Builder internal constructor() {

        private var datasetId: String? = null
        private var id: MutableList<String>? = null
        private var limit: Long? = null
        private var name: String? = null
        private var nameContains: String? = null
        private var offset: Long? = null
        private var sortBy: SortByComparativeExperimentColumn? = null
        private var sortByDesc: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(comparativeListParams: ComparativeListParams) = apply {
            datasetId = comparativeListParams.datasetId
            id = comparativeListParams.id?.toMutableList()
            limit = comparativeListParams.limit
            name = comparativeListParams.name
            nameContains = comparativeListParams.nameContains
            offset = comparativeListParams.offset
            sortBy = comparativeListParams.sortBy
            sortByDesc = comparativeListParams.sortByDesc
            additionalHeaders = comparativeListParams.additionalHeaders.toBuilder()
            additionalQueryParams = comparativeListParams.additionalQueryParams.toBuilder()
        }

        fun datasetId(datasetId: String?) = apply { this.datasetId = datasetId }

        /** Alias for calling [Builder.datasetId] with `datasetId.orElse(null)`. */
        fun datasetId(datasetId: Optional<String>) = datasetId(datasetId.getOrNull())

        fun id(id: List<String>?) = apply { this.id = id?.toMutableList() }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<List<String>>) = id(id.getOrNull())

        /**
         * Adds a single [String] to [Builder.id].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addId(id: String) = apply { this.id = (this.id ?: mutableListOf()).apply { add(id) } }

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

        /** Enum for available comparative experiment columns to sort by. */
        fun sortBy(sortBy: SortByComparativeExperimentColumn?) = apply { this.sortBy = sortBy }

        /** Alias for calling [Builder.sortBy] with `sortBy.orElse(null)`. */
        fun sortBy(sortBy: Optional<SortByComparativeExperimentColumn>) = sortBy(sortBy.getOrNull())

        fun sortByDesc(sortByDesc: Boolean?) = apply { this.sortByDesc = sortByDesc }

        /**
         * Alias for [Builder.sortByDesc].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun sortByDesc(sortByDesc: Boolean) = sortByDesc(sortByDesc as Boolean?)

        /** Alias for calling [Builder.sortByDesc] with `sortByDesc.orElse(null)`. */
        fun sortByDesc(sortByDesc: Optional<Boolean>) = sortByDesc(sortByDesc.getOrNull())

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
         * Returns an immutable instance of [ComparativeListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ComparativeListParams =
            ComparativeListParams(
                datasetId,
                id?.toImmutable(),
                limit,
                name,
                nameContains,
                offset,
                sortBy,
                sortByDesc,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> datasetId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                id?.let { put("id", it.joinToString(",")) }
                limit?.let { put("limit", it.toString()) }
                name?.let { put("name", it) }
                nameContains?.let { put("name_contains", it) }
                offset?.let { put("offset", it.toString()) }
                sortBy?.let { put("sort_by", it.toString()) }
                sortByDesc?.let { put("sort_by_desc", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ComparativeListParams &&
            datasetId == other.datasetId &&
            id == other.id &&
            limit == other.limit &&
            name == other.name &&
            nameContains == other.nameContains &&
            offset == other.offset &&
            sortBy == other.sortBy &&
            sortByDesc == other.sortByDesc &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            datasetId,
            id,
            limit,
            name,
            nameContains,
            offset,
            sortBy,
            sortByDesc,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ComparativeListParams{datasetId=$datasetId, id=$id, limit=$limit, name=$name, nameContains=$nameContains, offset=$offset, sortBy=$sortBy, sortByDesc=$sortByDesc, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

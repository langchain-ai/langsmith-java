// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets

import com.langchain.smith.core.Params
import com.langchain.smith.core.getOrThrow
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get all datasets by query params and owner. */
class DatasetListParams
private constructor(
    private val id: List<String>?,
    private val dataType: DataType?,
    private val excludeCorrectionsDatasets: Boolean?,
    private val limit: Long?,
    private val metadata: String?,
    private val name: String?,
    private val nameContains: String?,
    private val offset: Long?,
    private val sortBy: SortByDatasetColumn?,
    private val sortByDesc: Boolean?,
    private val tagValueId: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<List<String>> = Optional.ofNullable(id)

    /** Enum for dataset data types. */
    fun dataType(): Optional<DataType> = Optional.ofNullable(dataType)

    fun excludeCorrectionsDatasets(): Optional<Boolean> =
        Optional.ofNullable(excludeCorrectionsDatasets)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun metadata(): Optional<String> = Optional.ofNullable(metadata)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun nameContains(): Optional<String> = Optional.ofNullable(nameContains)

    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    /** Enum for available dataset columns to sort by. */
    fun sortBy(): Optional<SortByDatasetColumn> = Optional.ofNullable(sortBy)

    fun sortByDesc(): Optional<Boolean> = Optional.ofNullable(sortByDesc)

    fun tagValueId(): Optional<List<String>> = Optional.ofNullable(tagValueId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): DatasetListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [DatasetListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DatasetListParams]. */
    class Builder internal constructor() {

        private var id: MutableList<String>? = null
        private var dataType: DataType? = null
        private var excludeCorrectionsDatasets: Boolean? = null
        private var limit: Long? = null
        private var metadata: String? = null
        private var name: String? = null
        private var nameContains: String? = null
        private var offset: Long? = null
        private var sortBy: SortByDatasetColumn? = null
        private var sortByDesc: Boolean? = null
        private var tagValueId: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(datasetListParams: DatasetListParams) = apply {
            id = datasetListParams.id?.toMutableList()
            dataType = datasetListParams.dataType
            excludeCorrectionsDatasets = datasetListParams.excludeCorrectionsDatasets
            limit = datasetListParams.limit
            metadata = datasetListParams.metadata
            name = datasetListParams.name
            nameContains = datasetListParams.nameContains
            offset = datasetListParams.offset
            sortBy = datasetListParams.sortBy
            sortByDesc = datasetListParams.sortByDesc
            tagValueId = datasetListParams.tagValueId?.toMutableList()
            additionalHeaders = datasetListParams.additionalHeaders.toBuilder()
            additionalQueryParams = datasetListParams.additionalQueryParams.toBuilder()
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

        /** Enum for dataset data types. */
        fun dataType(dataType: DataType?) = apply { this.dataType = dataType }

        /** Alias for calling [Builder.dataType] with `dataType.orElse(null)`. */
        fun dataType(dataType: Optional<DataType>) = dataType(dataType.getOrNull())

        /** Alias for calling [dataType] with `DataType.ofTypes(types)`. */
        fun dataTypeOfTypes(types: List<DataType>) = dataType(DataType.ofTypes(types))

        /** Alias for calling [Builder.dataType] with `DataType.ofDataType(dataType)`. */
        fun dataType(dataType: DataType) = dataType(DataType.ofDataType(dataType))

        fun excludeCorrectionsDatasets(excludeCorrectionsDatasets: Boolean?) = apply {
            this.excludeCorrectionsDatasets = excludeCorrectionsDatasets
        }

        /**
         * Alias for [Builder.excludeCorrectionsDatasets].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun excludeCorrectionsDatasets(excludeCorrectionsDatasets: Boolean) =
            excludeCorrectionsDatasets(excludeCorrectionsDatasets as Boolean?)

        /**
         * Alias for calling [Builder.excludeCorrectionsDatasets] with
         * `excludeCorrectionsDatasets.orElse(null)`.
         */
        fun excludeCorrectionsDatasets(excludeCorrectionsDatasets: Optional<Boolean>) =
            excludeCorrectionsDatasets(excludeCorrectionsDatasets.getOrNull())

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

        /** Enum for available dataset columns to sort by. */
        fun sortBy(sortBy: SortByDatasetColumn?) = apply { this.sortBy = sortBy }

        /** Alias for calling [Builder.sortBy] with `sortBy.orElse(null)`. */
        fun sortBy(sortBy: Optional<SortByDatasetColumn>) = sortBy(sortBy.getOrNull())

        fun sortByDesc(sortByDesc: Boolean?) = apply { this.sortByDesc = sortByDesc }

        /**
         * Alias for [Builder.sortByDesc].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun sortByDesc(sortByDesc: Boolean) = sortByDesc(sortByDesc as Boolean?)

        /** Alias for calling [Builder.sortByDesc] with `sortByDesc.orElse(null)`. */
        fun sortByDesc(sortByDesc: Optional<Boolean>) = sortByDesc(sortByDesc.getOrNull())

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
         * Returns an immutable instance of [DatasetListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DatasetListParams =
            DatasetListParams(
                id?.toImmutable(),
                dataType,
                excludeCorrectionsDatasets,
                limit,
                metadata,
                name,
                nameContains,
                offset,
                sortBy,
                sortByDesc,
                tagValueId?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                id?.let { put("id", it.joinToString(",")) }
                dataType?.accept(
                    object : DataType.Visitor<Unit> {
                        override fun visitTypes(types: List<DataType>) {
                            put("data_type", types.joinToString(",") { it.toString() })
                        }

                        override fun visitDataType(dataType: DataType) {
                            put("data_type", dataType.toString())
                        }
                    }
                )
                excludeCorrectionsDatasets?.let {
                    put("exclude_corrections_datasets", it.toString())
                }
                limit?.let { put("limit", it.toString()) }
                metadata?.let { put("metadata", it) }
                name?.let { put("name", it) }
                nameContains?.let { put("name_contains", it) }
                offset?.let { put("offset", it.toString()) }
                sortBy?.let { put("sort_by", it.toString()) }
                sortByDesc?.let { put("sort_by_desc", it.toString()) }
                tagValueId?.let { put("tag_value_id", it.joinToString(",")) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Enum for dataset data types. */
    class DataType
    private constructor(
        private val types: List<DataType>? = null,
        private val dataType: DataType? = null,
    ) {

        fun types(): Optional<List<DataType>> = Optional.ofNullable(types)

        /** Enum for dataset data types. */
        fun dataType(): Optional<DataType> = Optional.ofNullable(dataType)

        fun isTypes(): Boolean = types != null

        fun isDataType(): Boolean = dataType != null

        fun asTypes(): List<DataType> = types.getOrThrow("types")

        /** Enum for dataset data types. */
        fun asDataType(): DataType = dataType.getOrThrow("dataType")

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                types != null -> visitor.visitTypes(types)
                dataType != null -> visitor.visitDataType(dataType)
                else -> throw IllegalStateException("Invalid DataType")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DataType && types == other.types && dataType == other.dataType
        }

        override fun hashCode(): Int = Objects.hash(types, dataType)

        override fun toString(): String =
            when {
                types != null -> "DataType{types=$types}"
                dataType != null -> "DataType{dataType=$dataType}"
                else -> throw IllegalStateException("Invalid DataType")
            }

        companion object {

            @JvmStatic fun ofTypes(types: List<DataType>) = DataType(types = types.toImmutable())

            /** Enum for dataset data types. */
            @JvmStatic fun ofDataType(dataType: DataType) = DataType(dataType = dataType)
        }

        /**
         * An interface that defines how to map each variant of [DataType] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitTypes(types: List<DataType>): T

            /** Enum for dataset data types. */
            fun visitDataType(dataType: DataType): T
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatasetListParams &&
            id == other.id &&
            dataType == other.dataType &&
            excludeCorrectionsDatasets == other.excludeCorrectionsDatasets &&
            limit == other.limit &&
            metadata == other.metadata &&
            name == other.name &&
            nameContains == other.nameContains &&
            offset == other.offset &&
            sortBy == other.sortBy &&
            sortByDesc == other.sortByDesc &&
            tagValueId == other.tagValueId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            dataType,
            excludeCorrectionsDatasets,
            limit,
            metadata,
            name,
            nameContains,
            offset,
            sortBy,
            sortByDesc,
            tagValueId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "DatasetListParams{id=$id, dataType=$dataType, excludeCorrectionsDatasets=$excludeCorrectionsDatasets, limit=$limit, metadata=$metadata, name=$name, nameContains=$nameContains, offset=$offset, sortBy=$sortBy, sortByDesc=$sortByDesc, tagValueId=$tagValueId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets

import com.fasterxml.jackson.annotation.JsonCreator
import com.langchain.smith.core.Enum
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.Params
import com.langchain.smith.core.getOrThrow
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
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

        /** Alias for calling [dataType] with `DataType.ofDatasetDataTypes(datasetDataTypes)`. */
        fun dataTypeOfDatasetDataTypes(datasetDataTypes: List<DataType.DatasetDataType>) =
            dataType(DataType.ofDatasetDataTypes(datasetDataTypes))

        /** Alias for calling [dataType] with `DataType.ofDataset(dataset)`. */
        fun dataType(dataset: DataType.DatasetDataType) = dataType(DataType.ofDataset(dataset))

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
                        override fun visitDatasetDataTypes(
                            datasetDataTypes: List<DataType.DatasetDataType>
                        ) {
                            put("data_type", datasetDataTypes.joinToString(",") { it.toString() })
                        }

                        override fun visitDataset(dataset: DataType.DatasetDataType) {
                            put("data_type", dataset.toString())
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
        private val datasetDataTypes: List<DatasetDataType>? = null,
        private val dataset: DatasetDataType? = null,
    ) {

        fun datasetDataTypes(): Optional<List<DatasetDataType>> =
            Optional.ofNullable(datasetDataTypes)

        /** Enum for dataset data types. */
        fun dataset(): Optional<DatasetDataType> = Optional.ofNullable(dataset)

        fun isDatasetDataTypes(): Boolean = datasetDataTypes != null

        fun isDataset(): Boolean = dataset != null

        fun asDatasetDataTypes(): List<DatasetDataType> =
            datasetDataTypes.getOrThrow("datasetDataTypes")

        /** Enum for dataset data types. */
        fun asDataset(): DatasetDataType = dataset.getOrThrow("dataset")

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                datasetDataTypes != null -> visitor.visitDatasetDataTypes(datasetDataTypes)
                dataset != null -> visitor.visitDataset(dataset)
                else -> throw IllegalStateException("Invalid DataType")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DataType &&
                datasetDataTypes == other.datasetDataTypes &&
                dataset == other.dataset
        }

        override fun hashCode(): Int = Objects.hash(datasetDataTypes, dataset)

        override fun toString(): String =
            when {
                datasetDataTypes != null -> "DataType{datasetDataTypes=$datasetDataTypes}"
                dataset != null -> "DataType{dataset=$dataset}"
                else -> throw IllegalStateException("Invalid DataType")
            }

        companion object {

            @JvmStatic
            fun ofDatasetDataTypes(datasetDataTypes: List<DatasetDataType>) =
                DataType(datasetDataTypes = datasetDataTypes.toImmutable())

            /** Enum for dataset data types. */
            @JvmStatic fun ofDataset(dataset: DatasetDataType) = DataType(dataset = dataset)
        }

        /**
         * An interface that defines how to map each variant of [DataType] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitDatasetDataTypes(datasetDataTypes: List<DatasetDataType>): T

            /** Enum for dataset data types. */
            fun visitDataset(dataset: DatasetDataType): T
        }

        /** Enum for dataset data types. */
        class DatasetDataType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val KV = of("kv")

                @JvmField val LLM = of("llm")

                @JvmField val CHAT = of("chat")

                @JvmStatic fun of(value: String) = DatasetDataType(JsonField.of(value))
            }

            /** An enum containing [DatasetDataType]'s known values. */
            enum class Known {
                KV,
                LLM,
                CHAT,
            }

            /**
             * An enum containing [DatasetDataType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DatasetDataType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                KV,
                LLM,
                CHAT,
                /**
                 * An enum member indicating that [DatasetDataType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    KV -> Value.KV
                    LLM -> Value.LLM
                    CHAT -> Value.CHAT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LangChainInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    KV -> Known.KV
                    LLM -> Known.LLM
                    CHAT -> Known.CHAT
                    else -> throw LangChainInvalidDataException("Unknown DatasetDataType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LangChainInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LangChainInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): DatasetDataType = apply {
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

                return other is DatasetDataType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Enum for dataset data types. */
        class DatasetDataType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val KV = of("kv")

                @JvmField val LLM = of("llm")

                @JvmField val CHAT = of("chat")

                @JvmStatic fun of(value: String) = DatasetDataType(JsonField.of(value))
            }

            /** An enum containing [DatasetDataType]'s known values. */
            enum class Known {
                KV,
                LLM,
                CHAT,
            }

            /**
             * An enum containing [DatasetDataType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DatasetDataType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                KV,
                LLM,
                CHAT,
                /**
                 * An enum member indicating that [DatasetDataType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    KV -> Value.KV
                    LLM -> Value.LLM
                    CHAT -> Value.CHAT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LangChainInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    KV -> Known.KV
                    LLM -> Known.LLM
                    CHAT -> Known.CHAT
                    else -> throw LangChainInvalidDataException("Unknown DatasetDataType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LangChainInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LangChainInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): DatasetDataType = apply {
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

                return other is DatasetDataType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
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

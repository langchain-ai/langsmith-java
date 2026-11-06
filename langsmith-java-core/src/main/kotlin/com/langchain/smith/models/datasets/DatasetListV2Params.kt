// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets

import com.fasterxml.jackson.annotation.JsonCreator
import com.langchain.smith.core.Enum
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.Params
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Returns one page of the datasets in the workspace, filtered and sorted by the query parameters.
 * Pass the next_cursor of a response as cursor, with the same filters and sort, to get the next
 * page. next_cursor is null on the last page.
 */
class DatasetListV2Params
private constructor(
    private val id: List<String>?,
    private val cursor: String?,
    private val dataType: List<DataType>?,
    private val exclude: List<Exclude>?,
    private val excludeCorrectionsDatasets: Boolean?,
    private val metadata: String?,
    private val name: String?,
    private val nameContains: String?,
    private val pageSize: Long?,
    private val sortBy: SortByDatasetColumn?,
    private val sortOrder: SortOrder?,
    private val tagValueId: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Return only the datasets with these IDs. Repeat the parameter for several IDs. */
    fun id(): Optional<List<String>> = Optional.ofNullable(id)

    /** The next_cursor of the previous response. Omit it for the first page. */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    /** Return only datasets of these data types. Repeat the parameter for several types. */
    fun dataType(): Optional<List<DataType>> = Optional.ofNullable(dataType)

    /**
     * Fields to leave out of each dataset. An excluded example_count is returned as null and makes
     * the response faster.
     */
    fun exclude(): Optional<List<Exclude>> = Optional.ofNullable(exclude)

    /** Leave out datasets that store corrections for an evaluator. */
    fun excludeCorrectionsDatasets(): Optional<Boolean> =
        Optional.ofNullable(excludeCorrectionsDatasets)

    /** A JSON object. Return only datasets whose metadata contains every key and value in it. */
    fun metadata(): Optional<String> = Optional.ofNullable(metadata)

    /** Return only the dataset with exactly this name. */
    fun name(): Optional<String> = Optional.ofNullable(name)

    /** Return only datasets whose name contains this text, ignoring case. */
    fun nameContains(): Optional<String> = Optional.ofNullable(nameContains)

    /** Maximum number of datasets to return. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * Field to sort by. last_session_start_time is the start time of the most recent experiment on
     * the dataset. Datasets without a value come last in both orders. While a sort value changes,
     * for example when an experiment starts, a dataset can be skipped or listed twice across pages.
     * Sort by created_at for a stable walk.
     */
    fun sortBy(): Optional<SortByDatasetColumn> = Optional.ofNullable(sortBy)

    /** Sort direction. */
    fun sortOrder(): Optional<SortOrder> = Optional.ofNullable(sortOrder)

    /** Return only datasets tagged with all of these tag value IDs. */
    fun tagValueId(): Optional<List<String>> = Optional.ofNullable(tagValueId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): DatasetListV2Params = builder().build()

        /** Returns a mutable builder for constructing an instance of [DatasetListV2Params]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DatasetListV2Params]. */
    class Builder internal constructor() {

        private var id: MutableList<String>? = null
        private var cursor: String? = null
        private var dataType: MutableList<DataType>? = null
        private var exclude: MutableList<Exclude>? = null
        private var excludeCorrectionsDatasets: Boolean? = null
        private var metadata: String? = null
        private var name: String? = null
        private var nameContains: String? = null
        private var pageSize: Long? = null
        private var sortBy: SortByDatasetColumn? = null
        private var sortOrder: SortOrder? = null
        private var tagValueId: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(datasetListV2Params: DatasetListV2Params) = apply {
            id = datasetListV2Params.id?.toMutableList()
            cursor = datasetListV2Params.cursor
            dataType = datasetListV2Params.dataType?.toMutableList()
            exclude = datasetListV2Params.exclude?.toMutableList()
            excludeCorrectionsDatasets = datasetListV2Params.excludeCorrectionsDatasets
            metadata = datasetListV2Params.metadata
            name = datasetListV2Params.name
            nameContains = datasetListV2Params.nameContains
            pageSize = datasetListV2Params.pageSize
            sortBy = datasetListV2Params.sortBy
            sortOrder = datasetListV2Params.sortOrder
            tagValueId = datasetListV2Params.tagValueId?.toMutableList()
            additionalHeaders = datasetListV2Params.additionalHeaders.toBuilder()
            additionalQueryParams = datasetListV2Params.additionalQueryParams.toBuilder()
        }

        /** Return only the datasets with these IDs. Repeat the parameter for several IDs. */
        fun id(id: List<String>?) = apply { this.id = id?.toMutableList() }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<List<String>>) = id(id.getOrNull())

        /**
         * Adds a single [String] to [Builder.id].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addId(id: String) = apply { this.id = (this.id ?: mutableListOf()).apply { add(id) } }

        /** The next_cursor of the previous response. Omit it for the first page. */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        /** Return only datasets of these data types. Repeat the parameter for several types. */
        fun dataType(dataType: List<DataType>?) = apply {
            this.dataType = dataType?.toMutableList()
        }

        /** Alias for calling [Builder.dataType] with `dataType.orElse(null)`. */
        fun dataType(dataType: Optional<List<DataType>>) = dataType(dataType.getOrNull())

        /**
         * Adds a single [DataType] to [Builder.dataType].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDataType(dataType: DataType) = apply {
            this.dataType = (this.dataType ?: mutableListOf()).apply { add(dataType) }
        }

        /**
         * Fields to leave out of each dataset. An excluded example_count is returned as null and
         * makes the response faster.
         */
        fun exclude(exclude: List<Exclude>?) = apply { this.exclude = exclude?.toMutableList() }

        /** Alias for calling [Builder.exclude] with `exclude.orElse(null)`. */
        fun exclude(exclude: Optional<List<Exclude>>) = exclude(exclude.getOrNull())

        /**
         * Adds a single [Exclude] to [Builder.exclude].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExclude(exclude: Exclude) = apply {
            this.exclude = (this.exclude ?: mutableListOf()).apply { add(exclude) }
        }

        /** Leave out datasets that store corrections for an evaluator. */
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

        /**
         * A JSON object. Return only datasets whose metadata contains every key and value in it.
         */
        fun metadata(metadata: String?) = apply { this.metadata = metadata }

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<String>) = metadata(metadata.getOrNull())

        /** Return only the dataset with exactly this name. */
        fun name(name: String?) = apply { this.name = name }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /** Return only datasets whose name contains this text, ignoring case. */
        fun nameContains(nameContains: String?) = apply { this.nameContains = nameContains }

        /** Alias for calling [Builder.nameContains] with `nameContains.orElse(null)`. */
        fun nameContains(nameContains: Optional<String>) = nameContains(nameContains.getOrNull())

        /** Maximum number of datasets to return. */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /**
         * Field to sort by. last_session_start_time is the start time of the most recent experiment
         * on the dataset. Datasets without a value come last in both orders. While a sort value
         * changes, for example when an experiment starts, a dataset can be skipped or listed twice
         * across pages. Sort by created_at for a stable walk.
         */
        fun sortBy(sortBy: SortByDatasetColumn?) = apply { this.sortBy = sortBy }

        /** Alias for calling [Builder.sortBy] with `sortBy.orElse(null)`. */
        fun sortBy(sortBy: Optional<SortByDatasetColumn>) = sortBy(sortBy.getOrNull())

        /** Sort direction. */
        fun sortOrder(sortOrder: SortOrder?) = apply { this.sortOrder = sortOrder }

        /** Alias for calling [Builder.sortOrder] with `sortOrder.orElse(null)`. */
        fun sortOrder(sortOrder: Optional<SortOrder>) = sortOrder(sortOrder.getOrNull())

        /** Return only datasets tagged with all of these tag value IDs. */
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
         * Returns an immutable instance of [DatasetListV2Params].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DatasetListV2Params =
            DatasetListV2Params(
                id?.toImmutable(),
                cursor,
                dataType?.toImmutable(),
                exclude?.toImmutable(),
                excludeCorrectionsDatasets,
                metadata,
                name,
                nameContains,
                pageSize,
                sortBy,
                sortOrder,
                tagValueId?.toImmutable(),
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
                dataType?.forEach { put("data_type", it.toString()) }
                exclude?.forEach { put("exclude", it.toString()) }
                excludeCorrectionsDatasets?.let {
                    put("exclude_corrections_datasets", it.toString())
                }
                metadata?.let { put("metadata", it) }
                name?.let { put("name", it) }
                nameContains?.let { put("name_contains", it) }
                pageSize?.let { put("page_size", it.toString()) }
                sortBy?.let { put("sort_by", it.toString()) }
                sortOrder?.let { put("sort_order", it.toString()) }
                tagValueId?.forEach { put("tag_value_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    class Exclude @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val EXAMPLE_COUNT = of("example_count")

            @JvmStatic fun of(value: String) = Exclude(JsonField.of(value))
        }

        /** An enum containing [Exclude]'s known values. */
        enum class Known {
            EXAMPLE_COUNT
        }

        /**
         * An enum containing [Exclude]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Exclude] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EXAMPLE_COUNT,
            /** An enum member indicating that [Exclude] was instantiated with an unknown value. */
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
                EXAMPLE_COUNT -> Value.EXAMPLE_COUNT
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
                EXAMPLE_COUNT -> Known.EXAMPLE_COUNT
                else -> throw LangChainInvalidDataException("Unknown Exclude: $value")
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
        fun validate(): Exclude = apply {
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

            return other is Exclude && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Sort direction. */
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

        return other is DatasetListV2Params &&
            id == other.id &&
            cursor == other.cursor &&
            dataType == other.dataType &&
            exclude == other.exclude &&
            excludeCorrectionsDatasets == other.excludeCorrectionsDatasets &&
            metadata == other.metadata &&
            name == other.name &&
            nameContains == other.nameContains &&
            pageSize == other.pageSize &&
            sortBy == other.sortBy &&
            sortOrder == other.sortOrder &&
            tagValueId == other.tagValueId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            cursor,
            dataType,
            exclude,
            excludeCorrectionsDatasets,
            metadata,
            name,
            nameContains,
            pageSize,
            sortBy,
            sortOrder,
            tagValueId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "DatasetListV2Params{id=$id, cursor=$cursor, dataType=$dataType, exclude=$exclude, excludeCorrectionsDatasets=$excludeCorrectionsDatasets, metadata=$metadata, name=$name, nameContains=$nameContains, pageSize=$pageSize, sortBy=$sortBy, sortOrder=$sortOrder, tagValueId=$tagValueId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

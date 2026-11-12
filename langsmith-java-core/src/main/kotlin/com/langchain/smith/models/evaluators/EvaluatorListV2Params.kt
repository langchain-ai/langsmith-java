// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.evaluators

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
 * List workspace rules in descending updated_at and id order. Filters combine with AND. Pass
 * next_cursor unchanged with the same filters to continue; concurrent changes can affect later
 * pages.
 */
class EvaluatorListV2Params
private constructor(
    private val id: List<String>?,
    private val cursor: String?,
    private val datasetId: String?,
    private val evaluatorId: String?,
    private val includeBackfillProgress: Boolean?,
    private val nameContains: String?,
    private val pageSize: Long?,
    private val projectId: String?,
    private val tagValueId: List<String>?,
    private val type: Type?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Rule UUIDs */
    fun id(): Optional<List<String>> = Optional.ofNullable(id)

    /** Cursor from the previous page */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    /** Source dataset UUID */
    fun datasetId(): Optional<String> = Optional.ofNullable(datasetId)

    /** Linked evaluator UUID */
    fun evaluatorId(): Optional<String> = Optional.ofNullable(evaluatorId)

    /** Include backfill progress */
    fun includeBackfillProgress(): Optional<Boolean> = Optional.ofNullable(includeBackfillProgress)

    /** Case-insensitive display-name pattern */
    fun nameContains(): Optional<String> = Optional.ofNullable(nameContains)

    /** Page size */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Source project UUID */
    fun projectId(): Optional<String> = Optional.ofNullable(projectId)

    /** Source must have every tag UUID */
    fun tagValueId(): Optional<List<String>> = Optional.ofNullable(tagValueId)

    /** Rule source type */
    fun type(): Optional<Type> = Optional.ofNullable(type)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): EvaluatorListV2Params = builder().build()

        /** Returns a mutable builder for constructing an instance of [EvaluatorListV2Params]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EvaluatorListV2Params]. */
    class Builder internal constructor() {

        private var id: MutableList<String>? = null
        private var cursor: String? = null
        private var datasetId: String? = null
        private var evaluatorId: String? = null
        private var includeBackfillProgress: Boolean? = null
        private var nameContains: String? = null
        private var pageSize: Long? = null
        private var projectId: String? = null
        private var tagValueId: MutableList<String>? = null
        private var type: Type? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(evaluatorListV2Params: EvaluatorListV2Params) = apply {
            id = evaluatorListV2Params.id?.toMutableList()
            cursor = evaluatorListV2Params.cursor
            datasetId = evaluatorListV2Params.datasetId
            evaluatorId = evaluatorListV2Params.evaluatorId
            includeBackfillProgress = evaluatorListV2Params.includeBackfillProgress
            nameContains = evaluatorListV2Params.nameContains
            pageSize = evaluatorListV2Params.pageSize
            projectId = evaluatorListV2Params.projectId
            tagValueId = evaluatorListV2Params.tagValueId?.toMutableList()
            type = evaluatorListV2Params.type
            additionalHeaders = evaluatorListV2Params.additionalHeaders.toBuilder()
            additionalQueryParams = evaluatorListV2Params.additionalQueryParams.toBuilder()
        }

        /** Rule UUIDs */
        fun id(id: List<String>?) = apply { this.id = id?.toMutableList() }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<List<String>>) = id(id.getOrNull())

        /**
         * Adds a single [String] to [Builder.id].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addId(id: String) = apply { this.id = (this.id ?: mutableListOf()).apply { add(id) } }

        /** Cursor from the previous page */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        /** Source dataset UUID */
        fun datasetId(datasetId: String?) = apply { this.datasetId = datasetId }

        /** Alias for calling [Builder.datasetId] with `datasetId.orElse(null)`. */
        fun datasetId(datasetId: Optional<String>) = datasetId(datasetId.getOrNull())

        /** Linked evaluator UUID */
        fun evaluatorId(evaluatorId: String?) = apply { this.evaluatorId = evaluatorId }

        /** Alias for calling [Builder.evaluatorId] with `evaluatorId.orElse(null)`. */
        fun evaluatorId(evaluatorId: Optional<String>) = evaluatorId(evaluatorId.getOrNull())

        /** Include backfill progress */
        fun includeBackfillProgress(includeBackfillProgress: Boolean?) = apply {
            this.includeBackfillProgress = includeBackfillProgress
        }

        /**
         * Alias for [Builder.includeBackfillProgress].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeBackfillProgress(includeBackfillProgress: Boolean) =
            includeBackfillProgress(includeBackfillProgress as Boolean?)

        /**
         * Alias for calling [Builder.includeBackfillProgress] with
         * `includeBackfillProgress.orElse(null)`.
         */
        fun includeBackfillProgress(includeBackfillProgress: Optional<Boolean>) =
            includeBackfillProgress(includeBackfillProgress.getOrNull())

        /** Case-insensitive display-name pattern */
        fun nameContains(nameContains: String?) = apply { this.nameContains = nameContains }

        /** Alias for calling [Builder.nameContains] with `nameContains.orElse(null)`. */
        fun nameContains(nameContains: Optional<String>) = nameContains(nameContains.getOrNull())

        /** Page size */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /** Source project UUID */
        fun projectId(projectId: String?) = apply { this.projectId = projectId }

        /** Alias for calling [Builder.projectId] with `projectId.orElse(null)`. */
        fun projectId(projectId: Optional<String>) = projectId(projectId.getOrNull())

        /** Source must have every tag UUID */
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

        /** Rule source type */
        fun type(type: Type?) = apply { this.type = type }

        /** Alias for calling [Builder.type] with `type.orElse(null)`. */
        fun type(type: Optional<Type>) = type(type.getOrNull())

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
         * Returns an immutable instance of [EvaluatorListV2Params].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EvaluatorListV2Params =
            EvaluatorListV2Params(
                id?.toImmutable(),
                cursor,
                datasetId,
                evaluatorId,
                includeBackfillProgress,
                nameContains,
                pageSize,
                projectId,
                tagValueId?.toImmutable(),
                type,
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
                datasetId?.let { put("dataset_id", it) }
                evaluatorId?.let { put("evaluator_id", it) }
                includeBackfillProgress?.let { put("include_backfill_progress", it.toString()) }
                nameContains?.let { put("name_contains", it) }
                pageSize?.let { put("page_size", it.toString()) }
                projectId?.let { put("project_id", it) }
                tagValueId?.forEach { put("tag_value_id", it) }
                type?.let { put("type", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Rule source type */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PROJECT = of("PROJECT")

            @JvmField val DATASET = of("DATASET")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            PROJECT,
            DATASET,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PROJECT,
            DATASET,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                PROJECT -> Value.PROJECT
                DATASET -> Value.DATASET
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
                PROJECT -> Known.PROJECT
                DATASET -> Known.DATASET
                else -> throw LangChainInvalidDataException("Unknown Type: $value")
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
        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EvaluatorListV2Params &&
            id == other.id &&
            cursor == other.cursor &&
            datasetId == other.datasetId &&
            evaluatorId == other.evaluatorId &&
            includeBackfillProgress == other.includeBackfillProgress &&
            nameContains == other.nameContains &&
            pageSize == other.pageSize &&
            projectId == other.projectId &&
            tagValueId == other.tagValueId &&
            type == other.type &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            cursor,
            datasetId,
            evaluatorId,
            includeBackfillProgress,
            nameContains,
            pageSize,
            projectId,
            tagValueId,
            type,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "EvaluatorListV2Params{id=$id, cursor=$cursor, datasetId=$datasetId, evaluatorId=$evaluatorId, includeBackfillProgress=$includeBackfillProgress, nameContains=$nameContains, pageSize=$pageSize, projectId=$projectId, tagValueId=$tagValueId, type=$type, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

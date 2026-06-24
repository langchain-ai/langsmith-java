// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.langchain.smith.core.Params
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * List evaluators for the current workspace, with optional filtering by type, name, tag, feedback
 * key, or resource ID.
 */
class OnlineEvaluatorListParams
private constructor(
    private val feedbackKey: String?,
    private val limit: Long?,
    private val nameContains: String?,
    private val offset: Long?,
    private val resourceId: List<String>?,
    private val sortBy: String?,
    private val sortByDesc: Boolean?,
    private val tagValueId: List<String>?,
    private val type: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter by feedback key */
    fun feedbackKey(): Optional<String> = Optional.ofNullable(feedbackKey)

    /** Maximum number of results (1-100) */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Filter by name substring (also searches creator names) */
    fun nameContains(): Optional<String> = Optional.ofNullable(nameContains)

    /** Offset for pagination */
    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    /** Filter by resource IDs */
    fun resourceId(): Optional<List<String>> = Optional.ofNullable(resourceId)

    /** Field to sort by */
    fun sortBy(): Optional<String> = Optional.ofNullable(sortBy)

    /** Sort in descending order */
    fun sortByDesc(): Optional<Boolean> = Optional.ofNullable(sortByDesc)

    /** Filter by tag value IDs */
    fun tagValueId(): Optional<List<String>> = Optional.ofNullable(tagValueId)

    /** Filter by evaluator type */
    fun type(): Optional<String> = Optional.ofNullable(type)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): OnlineEvaluatorListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [OnlineEvaluatorListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OnlineEvaluatorListParams]. */
    class Builder internal constructor() {

        private var feedbackKey: String? = null
        private var limit: Long? = null
        private var nameContains: String? = null
        private var offset: Long? = null
        private var resourceId: MutableList<String>? = null
        private var sortBy: String? = null
        private var sortByDesc: Boolean? = null
        private var tagValueId: MutableList<String>? = null
        private var type: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(onlineEvaluatorListParams: OnlineEvaluatorListParams) = apply {
            feedbackKey = onlineEvaluatorListParams.feedbackKey
            limit = onlineEvaluatorListParams.limit
            nameContains = onlineEvaluatorListParams.nameContains
            offset = onlineEvaluatorListParams.offset
            resourceId = onlineEvaluatorListParams.resourceId?.toMutableList()
            sortBy = onlineEvaluatorListParams.sortBy
            sortByDesc = onlineEvaluatorListParams.sortByDesc
            tagValueId = onlineEvaluatorListParams.tagValueId?.toMutableList()
            type = onlineEvaluatorListParams.type
            additionalHeaders = onlineEvaluatorListParams.additionalHeaders.toBuilder()
            additionalQueryParams = onlineEvaluatorListParams.additionalQueryParams.toBuilder()
        }

        /** Filter by feedback key */
        fun feedbackKey(feedbackKey: String?) = apply { this.feedbackKey = feedbackKey }

        /** Alias for calling [Builder.feedbackKey] with `feedbackKey.orElse(null)`. */
        fun feedbackKey(feedbackKey: Optional<String>) = feedbackKey(feedbackKey.getOrNull())

        /** Maximum number of results (1-100) */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** Filter by name substring (also searches creator names) */
        fun nameContains(nameContains: String?) = apply { this.nameContains = nameContains }

        /** Alias for calling [Builder.nameContains] with `nameContains.orElse(null)`. */
        fun nameContains(nameContains: Optional<String>) = nameContains(nameContains.getOrNull())

        /** Offset for pagination */
        fun offset(offset: Long?) = apply { this.offset = offset }

        /**
         * Alias for [Builder.offset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun offset(offset: Long) = offset(offset as Long?)

        /** Alias for calling [Builder.offset] with `offset.orElse(null)`. */
        fun offset(offset: Optional<Long>) = offset(offset.getOrNull())

        /** Filter by resource IDs */
        fun resourceId(resourceId: List<String>?) = apply {
            this.resourceId = resourceId?.toMutableList()
        }

        /** Alias for calling [Builder.resourceId] with `resourceId.orElse(null)`. */
        fun resourceId(resourceId: Optional<List<String>>) = resourceId(resourceId.getOrNull())

        /**
         * Adds a single [String] to [Builder.resourceId].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResourceId(resourceId: String) = apply {
            this.resourceId = (this.resourceId ?: mutableListOf()).apply { add(resourceId) }
        }

        /** Field to sort by */
        fun sortBy(sortBy: String?) = apply { this.sortBy = sortBy }

        /** Alias for calling [Builder.sortBy] with `sortBy.orElse(null)`. */
        fun sortBy(sortBy: Optional<String>) = sortBy(sortBy.getOrNull())

        /** Sort in descending order */
        fun sortByDesc(sortByDesc: Boolean?) = apply { this.sortByDesc = sortByDesc }

        /**
         * Alias for [Builder.sortByDesc].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun sortByDesc(sortByDesc: Boolean) = sortByDesc(sortByDesc as Boolean?)

        /** Alias for calling [Builder.sortByDesc] with `sortByDesc.orElse(null)`. */
        fun sortByDesc(sortByDesc: Optional<Boolean>) = sortByDesc(sortByDesc.getOrNull())

        /** Filter by tag value IDs */
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

        /** Filter by evaluator type */
        fun type(type: String?) = apply { this.type = type }

        /** Alias for calling [Builder.type] with `type.orElse(null)`. */
        fun type(type: Optional<String>) = type(type.getOrNull())

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
         * Returns an immutable instance of [OnlineEvaluatorListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OnlineEvaluatorListParams =
            OnlineEvaluatorListParams(
                feedbackKey,
                limit,
                nameContains,
                offset,
                resourceId?.toImmutable(),
                sortBy,
                sortByDesc,
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
                feedbackKey?.let { put("feedback_key", it) }
                limit?.let { put("limit", it.toString()) }
                nameContains?.let { put("name_contains", it) }
                offset?.let { put("offset", it.toString()) }
                resourceId?.let { put("resource_id", it.joinToString(",")) }
                sortBy?.let { put("sort_by", it) }
                sortByDesc?.let { put("sort_by_desc", it.toString()) }
                tagValueId?.let { put("tag_value_id", it.joinToString(",")) }
                type?.let { put("type", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OnlineEvaluatorListParams &&
            feedbackKey == other.feedbackKey &&
            limit == other.limit &&
            nameContains == other.nameContains &&
            offset == other.offset &&
            resourceId == other.resourceId &&
            sortBy == other.sortBy &&
            sortByDesc == other.sortByDesc &&
            tagValueId == other.tagValueId &&
            type == other.type &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            feedbackKey,
            limit,
            nameContains,
            offset,
            resourceId,
            sortBy,
            sortByDesc,
            tagValueId,
            type,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "OnlineEvaluatorListParams{feedbackKey=$feedbackKey, limit=$limit, nameContains=$nameContains, offset=$offset, resourceId=$resourceId, sortBy=$sortBy, sortByDesc=$sortByDesc, tagValueId=$tagValueId, type=$type, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

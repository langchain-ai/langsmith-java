// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.boxes

import com.langchain.smith.core.Params
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * List sandboxes for the authenticated tenant, with optional filtering, sorting, and pagination.
 * Page with page_size and cursor: replay the response's next_cursor until it comes back null, which
 * is the only signal that no pages remain. Cursors are opaque and only valid on this endpoint; do
 * not parse or construct one.
 */
class BoxListParams
private constructor(
    private val createdBy: String?,
    private val cursor: String?,
    private val label: List<String>?,
    private val limit: Long?,
    private val nameContains: String?,
    private val offset: Long?,
    private val pageSize: Long?,
    private val sortBy: String?,
    private val sortDirection: String?,
    private val sortOrder: String?,
    private val status: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter by creator identity. Only 'me' is supported. */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy)

    /** Opaque pagination cursor from a prior response's next_cursor */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    /**
     * Filter by label. Repeatable; all must match. Use 'key' to match on key presence or
     * 'key=value' for equality.
     */
    fun label(): Optional<List<String>> = Optional.ofNullable(label)

    /** Deprecated: use page_size. Maximum number of results */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Filter by name substring */
    fun nameContains(): Optional<String> = Optional.ofNullable(nameContains)

    /** Deprecated: use cursor. Pagination offset */
    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    /** Number of results per page */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * Sort column (name, status, created_at, stopped_at, idle_ttl_seconds,
     * delete_after_stop_seconds)
     */
    fun sortBy(): Optional<String> = Optional.ofNullable(sortBy)

    /** Deprecated: use sort_order. Sort direction (asc, desc) */
    fun sortDirection(): Optional<String> = Optional.ofNullable(sortDirection)

    /** Sort direction (asc, desc) */
    fun sortOrder(): Optional<String> = Optional.ofNullable(sortOrder)

    /** Filter by status (provisioning, ready, failed, stopped, deleting) */
    fun status(): Optional<String> = Optional.ofNullable(status)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): BoxListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [BoxListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BoxListParams]. */
    class Builder internal constructor() {

        private var createdBy: String? = null
        private var cursor: String? = null
        private var label: MutableList<String>? = null
        private var limit: Long? = null
        private var nameContains: String? = null
        private var offset: Long? = null
        private var pageSize: Long? = null
        private var sortBy: String? = null
        private var sortDirection: String? = null
        private var sortOrder: String? = null
        private var status: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(boxListParams: BoxListParams) = apply {
            createdBy = boxListParams.createdBy
            cursor = boxListParams.cursor
            label = boxListParams.label?.toMutableList()
            limit = boxListParams.limit
            nameContains = boxListParams.nameContains
            offset = boxListParams.offset
            pageSize = boxListParams.pageSize
            sortBy = boxListParams.sortBy
            sortDirection = boxListParams.sortDirection
            sortOrder = boxListParams.sortOrder
            status = boxListParams.status
            additionalHeaders = boxListParams.additionalHeaders.toBuilder()
            additionalQueryParams = boxListParams.additionalQueryParams.toBuilder()
        }

        /** Filter by creator identity. Only 'me' is supported. */
        fun createdBy(createdBy: String?) = apply { this.createdBy = createdBy }

        /** Alias for calling [Builder.createdBy] with `createdBy.orElse(null)`. */
        fun createdBy(createdBy: Optional<String>) = createdBy(createdBy.getOrNull())

        /** Opaque pagination cursor from a prior response's next_cursor */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        /**
         * Filter by label. Repeatable; all must match. Use 'key' to match on key presence or
         * 'key=value' for equality.
         */
        fun label(label: List<String>?) = apply { this.label = label?.toMutableList() }

        /** Alias for calling [Builder.label] with `label.orElse(null)`. */
        fun label(label: Optional<List<String>>) = label(label.getOrNull())

        /**
         * Adds a single [String] to [Builder.label].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLabel(label: String) = apply {
            this.label = (this.label ?: mutableListOf()).apply { add(label) }
        }

        /** Deprecated: use page_size. Maximum number of results */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** Filter by name substring */
        fun nameContains(nameContains: String?) = apply { this.nameContains = nameContains }

        /** Alias for calling [Builder.nameContains] with `nameContains.orElse(null)`. */
        fun nameContains(nameContains: Optional<String>) = nameContains(nameContains.getOrNull())

        /** Deprecated: use cursor. Pagination offset */
        fun offset(offset: Long?) = apply { this.offset = offset }

        /**
         * Alias for [Builder.offset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun offset(offset: Long) = offset(offset as Long?)

        /** Alias for calling [Builder.offset] with `offset.orElse(null)`. */
        fun offset(offset: Optional<Long>) = offset(offset.getOrNull())

        /** Number of results per page */
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
         * Sort column (name, status, created_at, stopped_at, idle_ttl_seconds,
         * delete_after_stop_seconds)
         */
        fun sortBy(sortBy: String?) = apply { this.sortBy = sortBy }

        /** Alias for calling [Builder.sortBy] with `sortBy.orElse(null)`. */
        fun sortBy(sortBy: Optional<String>) = sortBy(sortBy.getOrNull())

        /** Deprecated: use sort_order. Sort direction (asc, desc) */
        fun sortDirection(sortDirection: String?) = apply { this.sortDirection = sortDirection }

        /** Alias for calling [Builder.sortDirection] with `sortDirection.orElse(null)`. */
        fun sortDirection(sortDirection: Optional<String>) =
            sortDirection(sortDirection.getOrNull())

        /** Sort direction (asc, desc) */
        fun sortOrder(sortOrder: String?) = apply { this.sortOrder = sortOrder }

        /** Alias for calling [Builder.sortOrder] with `sortOrder.orElse(null)`. */
        fun sortOrder(sortOrder: Optional<String>) = sortOrder(sortOrder.getOrNull())

        /** Filter by status (provisioning, ready, failed, stopped, deleting) */
        fun status(status: String?) = apply { this.status = status }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<String>) = status(status.getOrNull())

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
         * Returns an immutable instance of [BoxListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BoxListParams =
            BoxListParams(
                createdBy,
                cursor,
                label?.toImmutable(),
                limit,
                nameContains,
                offset,
                pageSize,
                sortBy,
                sortDirection,
                sortOrder,
                status,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                createdBy?.let { put("created_by", it) }
                cursor?.let { put("cursor", it) }
                label?.forEach { put("label", it) }
                limit?.let { put("limit", it.toString()) }
                nameContains?.let { put("name_contains", it) }
                offset?.let { put("offset", it.toString()) }
                pageSize?.let { put("page_size", it.toString()) }
                sortBy?.let { put("sort_by", it) }
                sortDirection?.let { put("sort_direction", it) }
                sortOrder?.let { put("sort_order", it) }
                status?.let { put("status", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BoxListParams &&
            createdBy == other.createdBy &&
            cursor == other.cursor &&
            label == other.label &&
            limit == other.limit &&
            nameContains == other.nameContains &&
            offset == other.offset &&
            pageSize == other.pageSize &&
            sortBy == other.sortBy &&
            sortDirection == other.sortDirection &&
            sortOrder == other.sortOrder &&
            status == other.status &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            createdBy,
            cursor,
            label,
            limit,
            nameContains,
            offset,
            pageSize,
            sortBy,
            sortDirection,
            sortOrder,
            status,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "BoxListParams{createdBy=$createdBy, cursor=$cursor, label=$label, limit=$limit, nameContains=$nameContains, offset=$offset, pageSize=$pageSize, sortBy=$sortBy, sortDirection=$sortDirection, sortOrder=$sortOrder, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

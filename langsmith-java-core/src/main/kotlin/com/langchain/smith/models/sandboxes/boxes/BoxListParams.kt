// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.boxes

import com.langchain.smith.core.Params
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * List sandbox claims for the authenticated tenant, with optional filtering, sorting, and
 * pagination.
 */
class BoxListParams
private constructor(
    private val limit: Long?,
    private val nameContains: String?,
    private val offset: Long?,
    private val sortBy: String?,
    private val sortDirection: String?,
    private val status: String?,
    private val templateName: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Maximum number of results */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Filter by name substring */
    fun nameContains(): Optional<String> = Optional.ofNullable(nameContains)

    /** Pagination offset */
    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    /** Sort column (name, status, template_name, created_at) */
    fun sortBy(): Optional<String> = Optional.ofNullable(sortBy)

    /** Sort direction (asc, desc) */
    fun sortDirection(): Optional<String> = Optional.ofNullable(sortDirection)

    /** Filter by status (provisioning, ready, failed, stopped) */
    fun status(): Optional<String> = Optional.ofNullable(status)

    /** Filter by exact template name */
    fun templateName(): Optional<String> = Optional.ofNullable(templateName)

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

        private var limit: Long? = null
        private var nameContains: String? = null
        private var offset: Long? = null
        private var sortBy: String? = null
        private var sortDirection: String? = null
        private var status: String? = null
        private var templateName: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(boxListParams: BoxListParams) = apply {
            limit = boxListParams.limit
            nameContains = boxListParams.nameContains
            offset = boxListParams.offset
            sortBy = boxListParams.sortBy
            sortDirection = boxListParams.sortDirection
            status = boxListParams.status
            templateName = boxListParams.templateName
            additionalHeaders = boxListParams.additionalHeaders.toBuilder()
            additionalQueryParams = boxListParams.additionalQueryParams.toBuilder()
        }

        /** Maximum number of results */
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

        /** Pagination offset */
        fun offset(offset: Long?) = apply { this.offset = offset }

        /**
         * Alias for [Builder.offset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun offset(offset: Long) = offset(offset as Long?)

        /** Alias for calling [Builder.offset] with `offset.orElse(null)`. */
        fun offset(offset: Optional<Long>) = offset(offset.getOrNull())

        /** Sort column (name, status, template_name, created_at) */
        fun sortBy(sortBy: String?) = apply { this.sortBy = sortBy }

        /** Alias for calling [Builder.sortBy] with `sortBy.orElse(null)`. */
        fun sortBy(sortBy: Optional<String>) = sortBy(sortBy.getOrNull())

        /** Sort direction (asc, desc) */
        fun sortDirection(sortDirection: String?) = apply { this.sortDirection = sortDirection }

        /** Alias for calling [Builder.sortDirection] with `sortDirection.orElse(null)`. */
        fun sortDirection(sortDirection: Optional<String>) =
            sortDirection(sortDirection.getOrNull())

        /** Filter by status (provisioning, ready, failed, stopped) */
        fun status(status: String?) = apply { this.status = status }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<String>) = status(status.getOrNull())

        /** Filter by exact template name */
        fun templateName(templateName: String?) = apply { this.templateName = templateName }

        /** Alias for calling [Builder.templateName] with `templateName.orElse(null)`. */
        fun templateName(templateName: Optional<String>) = templateName(templateName.getOrNull())

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
                limit,
                nameContains,
                offset,
                sortBy,
                sortDirection,
                status,
                templateName,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                limit?.let { put("limit", it.toString()) }
                nameContains?.let { put("name_contains", it) }
                offset?.let { put("offset", it.toString()) }
                sortBy?.let { put("sort_by", it) }
                sortDirection?.let { put("sort_direction", it) }
                status?.let { put("status", it) }
                templateName?.let { put("template_name", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BoxListParams &&
            limit == other.limit &&
            nameContains == other.nameContains &&
            offset == other.offset &&
            sortBy == other.sortBy &&
            sortDirection == other.sortDirection &&
            status == other.status &&
            templateName == other.templateName &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            limit,
            nameContains,
            offset,
            sortBy,
            sortDirection,
            status,
            templateName,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "BoxListParams{limit=$limit, nameContains=$nameContains, offset=$offset, sortBy=$sortBy, sortDirection=$sortDirection, status=$status, templateName=$templateName, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

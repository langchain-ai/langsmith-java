// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspacesecrets

import com.langchain.smith.core.Params
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * List the current workspace's secret keys in ascending key order. Secret values are never
 * returned. Set include_configs to include allowed hosts and header configuration. Pass next_cursor
 * as cursor to retrieve the next page, keeping include_configs unchanged. Pagination reflects the
 * current secrets on each request, rather than a snapshot.
 */
class WorkspaceSecretListParams
private constructor(
    private val cursor: String?,
    private val includeConfigs: Boolean?,
    private val pageSize: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Opaque cursor from a previous response */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    /** Include the hosts each secret may be sent to */
    fun includeConfigs(): Optional<Boolean> = Optional.ofNullable(includeConfigs)

    /** Number of secrets per page */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): WorkspaceSecretListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [WorkspaceSecretListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WorkspaceSecretListParams]. */
    class Builder internal constructor() {

        private var cursor: String? = null
        private var includeConfigs: Boolean? = null
        private var pageSize: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(workspaceSecretListParams: WorkspaceSecretListParams) = apply {
            cursor = workspaceSecretListParams.cursor
            includeConfigs = workspaceSecretListParams.includeConfigs
            pageSize = workspaceSecretListParams.pageSize
            additionalHeaders = workspaceSecretListParams.additionalHeaders.toBuilder()
            additionalQueryParams = workspaceSecretListParams.additionalQueryParams.toBuilder()
        }

        /** Opaque cursor from a previous response */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        /** Include the hosts each secret may be sent to */
        fun includeConfigs(includeConfigs: Boolean?) = apply {
            this.includeConfigs = includeConfigs
        }

        /**
         * Alias for [Builder.includeConfigs].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeConfigs(includeConfigs: Boolean) = includeConfigs(includeConfigs as Boolean?)

        /** Alias for calling [Builder.includeConfigs] with `includeConfigs.orElse(null)`. */
        fun includeConfigs(includeConfigs: Optional<Boolean>) =
            includeConfigs(includeConfigs.getOrNull())

        /** Number of secrets per page */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

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
         * Returns an immutable instance of [WorkspaceSecretListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): WorkspaceSecretListParams =
            WorkspaceSecretListParams(
                cursor,
                includeConfigs,
                pageSize,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                cursor?.let { put("cursor", it) }
                includeConfigs?.let { put("include_configs", it.toString()) }
                pageSize?.let { put("page_size", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WorkspaceSecretListParams &&
            cursor == other.cursor &&
            includeConfigs == other.includeConfigs &&
            pageSize == other.pageSize &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(cursor, includeConfigs, pageSize, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "WorkspaceSecretListParams{cursor=$cursor, includeConfigs=$includeConfigs, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

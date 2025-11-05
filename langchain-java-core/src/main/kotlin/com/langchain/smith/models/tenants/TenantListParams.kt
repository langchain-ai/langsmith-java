// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.tenants

import com.langchain.smith.core.Params
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get all tenants visible to this auth */
class TenantListParams
private constructor(
    private val includeDeleted: Boolean?,
    private val skipCreate: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun includeDeleted(): Optional<Boolean> = Optional.ofNullable(includeDeleted)

    fun skipCreate(): Optional<Boolean> = Optional.ofNullable(skipCreate)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): TenantListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [TenantListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TenantListParams]. */
    class Builder internal constructor() {

        private var includeDeleted: Boolean? = null
        private var skipCreate: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(tenantListParams: TenantListParams) = apply {
            includeDeleted = tenantListParams.includeDeleted
            skipCreate = tenantListParams.skipCreate
            additionalHeaders = tenantListParams.additionalHeaders.toBuilder()
            additionalQueryParams = tenantListParams.additionalQueryParams.toBuilder()
        }

        fun includeDeleted(includeDeleted: Boolean?) = apply {
            this.includeDeleted = includeDeleted
        }

        /**
         * Alias for [Builder.includeDeleted].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeDeleted(includeDeleted: Boolean) = includeDeleted(includeDeleted as Boolean?)

        /** Alias for calling [Builder.includeDeleted] with `includeDeleted.orElse(null)`. */
        fun includeDeleted(includeDeleted: Optional<Boolean>) =
            includeDeleted(includeDeleted.getOrNull())

        fun skipCreate(skipCreate: Boolean?) = apply { this.skipCreate = skipCreate }

        /**
         * Alias for [Builder.skipCreate].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun skipCreate(skipCreate: Boolean) = skipCreate(skipCreate as Boolean?)

        /** Alias for calling [Builder.skipCreate] with `skipCreate.orElse(null)`. */
        fun skipCreate(skipCreate: Optional<Boolean>) = skipCreate(skipCreate.getOrNull())

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
         * Returns an immutable instance of [TenantListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TenantListParams =
            TenantListParams(
                includeDeleted,
                skipCreate,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                includeDeleted?.let { put("include_deleted", it.toString()) }
                skipCreate?.let { put("skip_create", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TenantListParams &&
            includeDeleted == other.includeDeleted &&
            skipCreate == other.skipCreate &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(includeDeleted, skipCreate, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TenantListParams{includeDeleted=$includeDeleted, skipCreate=$skipCreate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

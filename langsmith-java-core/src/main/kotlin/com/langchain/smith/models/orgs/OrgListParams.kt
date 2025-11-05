// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs

import com.langchain.smith.core.Params
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get all orgs visible to this auth */
class OrgListParams
private constructor(
    private val includeTier: Boolean?,
    private val skipCreate: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun includeTier(): Optional<Boolean> = Optional.ofNullable(includeTier)

    fun skipCreate(): Optional<Boolean> = Optional.ofNullable(skipCreate)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): OrgListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [OrgListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OrgListParams]. */
    class Builder internal constructor() {

        private var includeTier: Boolean? = null
        private var skipCreate: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(orgListParams: OrgListParams) = apply {
            includeTier = orgListParams.includeTier
            skipCreate = orgListParams.skipCreate
            additionalHeaders = orgListParams.additionalHeaders.toBuilder()
            additionalQueryParams = orgListParams.additionalQueryParams.toBuilder()
        }

        fun includeTier(includeTier: Boolean?) = apply { this.includeTier = includeTier }

        /**
         * Alias for [Builder.includeTier].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeTier(includeTier: Boolean) = includeTier(includeTier as Boolean?)

        /** Alias for calling [Builder.includeTier] with `includeTier.orElse(null)`. */
        fun includeTier(includeTier: Optional<Boolean>) = includeTier(includeTier.getOrNull())

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
         * Returns an immutable instance of [OrgListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OrgListParams =
            OrgListParams(
                includeTier,
                skipCreate,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                includeTier?.let { put("include_tier", it.toString()) }
                skipCreate?.let { put("skip_create", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OrgListParams &&
            includeTier == other.includeTier &&
            skipCreate == other.skipCreate &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(includeTier, skipCreate, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "OrgListParams{includeTier=$includeTier, skipCreate=$skipCreate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

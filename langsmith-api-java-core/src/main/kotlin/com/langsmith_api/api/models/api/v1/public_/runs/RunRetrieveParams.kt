// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.public_.runs

import com.langsmith_api.api.core.Params
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.core.http.Headers
import com.langsmith_api.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get the shared run. */
class RunRetrieveParams
private constructor(
    private val shareToken: String,
    private val id: String?,
    private val excludeS3StoredAttributes: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun shareToken(): String = shareToken

    fun id(): Optional<String> = Optional.ofNullable(id)

    fun excludeS3StoredAttributes(): Optional<Boolean> =
        Optional.ofNullable(excludeS3StoredAttributes)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RunRetrieveParams].
         *
         * The following fields are required:
         * ```java
         * .shareToken()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RunRetrieveParams]. */
    class Builder internal constructor() {

        private var shareToken: String? = null
        private var id: String? = null
        private var excludeS3StoredAttributes: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(runRetrieveParams: RunRetrieveParams) = apply {
            shareToken = runRetrieveParams.shareToken
            id = runRetrieveParams.id
            excludeS3StoredAttributes = runRetrieveParams.excludeS3StoredAttributes
            additionalHeaders = runRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = runRetrieveParams.additionalQueryParams.toBuilder()
        }

        fun shareToken(shareToken: String) = apply { this.shareToken = shareToken }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        fun excludeS3StoredAttributes(excludeS3StoredAttributes: Boolean?) = apply {
            this.excludeS3StoredAttributes = excludeS3StoredAttributes
        }

        /**
         * Alias for [Builder.excludeS3StoredAttributes].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun excludeS3StoredAttributes(excludeS3StoredAttributes: Boolean) =
            excludeS3StoredAttributes(excludeS3StoredAttributes as Boolean?)

        /**
         * Alias for calling [Builder.excludeS3StoredAttributes] with
         * `excludeS3StoredAttributes.orElse(null)`.
         */
        fun excludeS3StoredAttributes(excludeS3StoredAttributes: Optional<Boolean>) =
            excludeS3StoredAttributes(excludeS3StoredAttributes.getOrNull())

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
         * Returns an immutable instance of [RunRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .shareToken()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RunRetrieveParams =
            RunRetrieveParams(
                checkRequired("shareToken", shareToken),
                id,
                excludeS3StoredAttributes,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> shareToken
            1 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                excludeS3StoredAttributes?.let {
                    put("exclude_s3_stored_attributes", it.toString())
                }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunRetrieveParams &&
            shareToken == other.shareToken &&
            id == other.id &&
            excludeS3StoredAttributes == other.excludeS3StoredAttributes &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            shareToken,
            id,
            excludeS3StoredAttributes,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "RunRetrieveParams{shareToken=$shareToken, id=$id, excludeS3StoredAttributes=$excludeS3StoredAttributes, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

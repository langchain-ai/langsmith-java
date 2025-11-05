// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.public_.datasets.runs

import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.Params
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.models.runs.RequestBodyForRunsGenerateQuery
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get runs in projects run over a dataset that has been shared. */
class RunGenerateQueryParams
private constructor(
    private val shareToken: String?,
    private val requestBodyForRunsGenerateQuery: RequestBodyForRunsGenerateQuery,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun shareToken(): Optional<String> = Optional.ofNullable(shareToken)

    fun requestBodyForRunsGenerateQuery(): RequestBodyForRunsGenerateQuery =
        requestBodyForRunsGenerateQuery

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        requestBodyForRunsGenerateQuery._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RunGenerateQueryParams].
         *
         * The following fields are required:
         * ```java
         * .requestBodyForRunsGenerateQuery()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RunGenerateQueryParams]. */
    class Builder internal constructor() {

        private var shareToken: String? = null
        private var requestBodyForRunsGenerateQuery: RequestBodyForRunsGenerateQuery? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(runGenerateQueryParams: RunGenerateQueryParams) = apply {
            shareToken = runGenerateQueryParams.shareToken
            requestBodyForRunsGenerateQuery = runGenerateQueryParams.requestBodyForRunsGenerateQuery
            additionalHeaders = runGenerateQueryParams.additionalHeaders.toBuilder()
            additionalQueryParams = runGenerateQueryParams.additionalQueryParams.toBuilder()
        }

        fun shareToken(shareToken: String?) = apply { this.shareToken = shareToken }

        /** Alias for calling [Builder.shareToken] with `shareToken.orElse(null)`. */
        fun shareToken(shareToken: Optional<String>) = shareToken(shareToken.getOrNull())

        fun requestBodyForRunsGenerateQuery(
            requestBodyForRunsGenerateQuery: RequestBodyForRunsGenerateQuery
        ) = apply { this.requestBodyForRunsGenerateQuery = requestBodyForRunsGenerateQuery }

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
         * Returns an immutable instance of [RunGenerateQueryParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .requestBodyForRunsGenerateQuery()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RunGenerateQueryParams =
            RunGenerateQueryParams(
                shareToken,
                checkRequired("requestBodyForRunsGenerateQuery", requestBodyForRunsGenerateQuery),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): RequestBodyForRunsGenerateQuery = requestBodyForRunsGenerateQuery

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> shareToken ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunGenerateQueryParams &&
            shareToken == other.shareToken &&
            requestBodyForRunsGenerateQuery == other.requestBodyForRunsGenerateQuery &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            shareToken,
            requestBodyForRunsGenerateQuery,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "RunGenerateQueryParams{shareToken=$shareToken, requestBodyForRunsGenerateQuery=$requestBodyForRunsGenerateQuery, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.apikey

import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.Params
import com.langsmith_api.api.core.http.Headers
import com.langsmith_api.api.core.http.QueryParams
import com.langsmith_api.api.core.immutableEmptyMap
import com.langsmith_api.api.models.api.v1.orgs.current.servicekeys.ApiKeyCreateRequest
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Generate an api key for the user */
class ApiKeyApiKeyParams
private constructor(
    private val apiKeyCreateRequest: ApiKeyCreateRequest?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * API key POST schema.
     *
     * expires_at: Optional datetime when the API key will expire. workspaces: List of workspace
     * UUIDs this key can access (feature-flagged). role_id: Optional UUID of the role to assign to
     * API key. If not provided, uses default role based on read_only flag:
     * - WORKSPACE_ADMIN if read_only is False
     * - WORKSPACE_READER if read_only is True org_role_id: UUID of a org role for org-scoped keys
     *   If not provided, defaults to ORG_USER default_workspace_id: UUID of the default workspace
     *   for PATs. If not provided, uses the current logic (first available workspace).
     */
    fun apiKeyCreateRequest(): Optional<ApiKeyCreateRequest> =
        Optional.ofNullable(apiKeyCreateRequest)

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        apiKeyCreateRequest?._additionalProperties() ?: immutableEmptyMap()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ApiKeyApiKeyParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ApiKeyApiKeyParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ApiKeyApiKeyParams]. */
    class Builder internal constructor() {

        private var apiKeyCreateRequest: ApiKeyCreateRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(apiKeyApiKeyParams: ApiKeyApiKeyParams) = apply {
            apiKeyCreateRequest = apiKeyApiKeyParams.apiKeyCreateRequest
            additionalHeaders = apiKeyApiKeyParams.additionalHeaders.toBuilder()
            additionalQueryParams = apiKeyApiKeyParams.additionalQueryParams.toBuilder()
        }

        /**
         * API key POST schema.
         *
         * expires_at: Optional datetime when the API key will expire. workspaces: List of workspace
         * UUIDs this key can access (feature-flagged). role_id: Optional UUID of the role to assign
         * to API key. If not provided, uses default role based on read_only flag:
         * - WORKSPACE_ADMIN if read_only is False
         * - WORKSPACE_READER if read_only is True org_role_id: UUID of a org role for org-scoped
         *   keys If not provided, defaults to ORG_USER default_workspace_id: UUID of the default
         *   workspace for PATs. If not provided, uses the current logic (first available
         *   workspace).
         */
        fun apiKeyCreateRequest(apiKeyCreateRequest: ApiKeyCreateRequest?) = apply {
            this.apiKeyCreateRequest = apiKeyCreateRequest
        }

        /**
         * Alias for calling [Builder.apiKeyCreateRequest] with `apiKeyCreateRequest.orElse(null)`.
         */
        fun apiKeyCreateRequest(apiKeyCreateRequest: Optional<ApiKeyCreateRequest>) =
            apiKeyCreateRequest(apiKeyCreateRequest.getOrNull())

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
         * Returns an immutable instance of [ApiKeyApiKeyParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ApiKeyApiKeyParams =
            ApiKeyApiKeyParams(
                apiKeyCreateRequest,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Optional<ApiKeyCreateRequest> = Optional.ofNullable(apiKeyCreateRequest)

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ApiKeyApiKeyParams &&
            apiKeyCreateRequest == other.apiKeyCreateRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(apiKeyCreateRequest, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ApiKeyApiKeyParams{apiKeyCreateRequest=$apiKeyCreateRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

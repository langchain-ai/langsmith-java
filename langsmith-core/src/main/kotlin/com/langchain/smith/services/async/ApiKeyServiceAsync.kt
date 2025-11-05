// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.apikey.ApiKeyApiKeyParams
import com.langchain.smith.models.apikey.ApiKeyDeleteParams
import com.langchain.smith.models.apikey.ApiKeyRetrieveApiKeyParams
import com.langchain.smith.models.orgs.current.servicekeys.ApiKeyCreateRequest
import com.langchain.smith.models.orgs.current.servicekeys.ApiKeyCreateResponse
import com.langchain.smith.models.orgs.current.servicekeys.ApiKeyGetResponse
import com.langchain.smith.services.async.apikey.CurrentServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ApiKeyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ApiKeyServiceAsync

    fun current(): CurrentServiceAsync

    /** Delete an api key for the user */
    fun delete(apiKeyId: String): CompletableFuture<ApiKeyGetResponse> =
        delete(apiKeyId, ApiKeyDeleteParams.none())

    /** @see delete */
    fun delete(
        apiKeyId: String,
        params: ApiKeyDeleteParams = ApiKeyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyGetResponse> =
        delete(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

    /** @see delete */
    fun delete(
        apiKeyId: String,
        params: ApiKeyDeleteParams = ApiKeyDeleteParams.none(),
    ): CompletableFuture<ApiKeyGetResponse> = delete(apiKeyId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ApiKeyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyGetResponse>

    /** @see delete */
    fun delete(params: ApiKeyDeleteParams): CompletableFuture<ApiKeyGetResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        apiKeyId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ApiKeyGetResponse> =
        delete(apiKeyId, ApiKeyDeleteParams.none(), requestOptions)

    /** Generate an api key for the user */
    fun apiKey(): CompletableFuture<ApiKeyCreateResponse> = apiKey(ApiKeyApiKeyParams.none())

    /** @see apiKey */
    fun apiKey(
        params: ApiKeyApiKeyParams = ApiKeyApiKeyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyCreateResponse>

    /** @see apiKey */
    fun apiKey(
        params: ApiKeyApiKeyParams = ApiKeyApiKeyParams.none()
    ): CompletableFuture<ApiKeyCreateResponse> = apiKey(params, RequestOptions.none())

    /** @see apiKey */
    fun apiKey(
        apiKeyCreateRequest: ApiKeyCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyCreateResponse> =
        apiKey(
            ApiKeyApiKeyParams.builder().apiKeyCreateRequest(apiKeyCreateRequest).build(),
            requestOptions,
        )

    /** @see apiKey */
    fun apiKey(apiKeyCreateRequest: ApiKeyCreateRequest): CompletableFuture<ApiKeyCreateResponse> =
        apiKey(apiKeyCreateRequest, RequestOptions.none())

    /** @see apiKey */
    fun apiKey(requestOptions: RequestOptions): CompletableFuture<ApiKeyCreateResponse> =
        apiKey(ApiKeyApiKeyParams.none(), requestOptions)

    /** Get the current tenant's API keys */
    fun retrieveApiKey(): CompletableFuture<List<ApiKeyGetResponse>> =
        retrieveApiKey(ApiKeyRetrieveApiKeyParams.none())

    /** @see retrieveApiKey */
    fun retrieveApiKey(
        params: ApiKeyRetrieveApiKeyParams = ApiKeyRetrieveApiKeyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<ApiKeyGetResponse>>

    /** @see retrieveApiKey */
    fun retrieveApiKey(
        params: ApiKeyRetrieveApiKeyParams = ApiKeyRetrieveApiKeyParams.none()
    ): CompletableFuture<List<ApiKeyGetResponse>> = retrieveApiKey(params, RequestOptions.none())

    /** @see retrieveApiKey */
    fun retrieveApiKey(requestOptions: RequestOptions): CompletableFuture<List<ApiKeyGetResponse>> =
        retrieveApiKey(ApiKeyRetrieveApiKeyParams.none(), requestOptions)

    /**
     * A view of [ApiKeyServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ApiKeyServiceAsync.WithRawResponse

        fun current(): CurrentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /api/v1/api-key/{api_key_id}`, but is otherwise
         * the same as [ApiKeyServiceAsync.delete].
         */
        fun delete(apiKeyId: String): CompletableFuture<HttpResponseFor<ApiKeyGetResponse>> =
            delete(apiKeyId, ApiKeyDeleteParams.none())

        /** @see delete */
        fun delete(
            apiKeyId: String,
            params: ApiKeyDeleteParams = ApiKeyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyGetResponse>> =
            delete(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

        /** @see delete */
        fun delete(
            apiKeyId: String,
            params: ApiKeyDeleteParams = ApiKeyDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyGetResponse>> =
            delete(apiKeyId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ApiKeyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyGetResponse>>

        /** @see delete */
        fun delete(
            params: ApiKeyDeleteParams
        ): CompletableFuture<HttpResponseFor<ApiKeyGetResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            apiKeyId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ApiKeyGetResponse>> =
            delete(apiKeyId, ApiKeyDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/api-key`, but is otherwise the same as
         * [ApiKeyServiceAsync.apiKey].
         */
        fun apiKey(): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>> =
            apiKey(ApiKeyApiKeyParams.none())

        /** @see apiKey */
        fun apiKey(
            params: ApiKeyApiKeyParams = ApiKeyApiKeyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>>

        /** @see apiKey */
        fun apiKey(
            params: ApiKeyApiKeyParams = ApiKeyApiKeyParams.none()
        ): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>> =
            apiKey(params, RequestOptions.none())

        /** @see apiKey */
        fun apiKey(
            apiKeyCreateRequest: ApiKeyCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>> =
            apiKey(
                ApiKeyApiKeyParams.builder().apiKeyCreateRequest(apiKeyCreateRequest).build(),
                requestOptions,
            )

        /** @see apiKey */
        fun apiKey(
            apiKeyCreateRequest: ApiKeyCreateRequest
        ): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>> =
            apiKey(apiKeyCreateRequest, RequestOptions.none())

        /** @see apiKey */
        fun apiKey(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>> =
            apiKey(ApiKeyApiKeyParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/api-key`, but is otherwise the same as
         * [ApiKeyServiceAsync.retrieveApiKey].
         */
        fun retrieveApiKey(): CompletableFuture<HttpResponseFor<List<ApiKeyGetResponse>>> =
            retrieveApiKey(ApiKeyRetrieveApiKeyParams.none())

        /** @see retrieveApiKey */
        fun retrieveApiKey(
            params: ApiKeyRetrieveApiKeyParams = ApiKeyRetrieveApiKeyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<ApiKeyGetResponse>>>

        /** @see retrieveApiKey */
        fun retrieveApiKey(
            params: ApiKeyRetrieveApiKeyParams = ApiKeyRetrieveApiKeyParams.none()
        ): CompletableFuture<HttpResponseFor<List<ApiKeyGetResponse>>> =
            retrieveApiKey(params, RequestOptions.none())

        /** @see retrieveApiKey */
        fun retrieveApiKey(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<ApiKeyGetResponse>>> =
            retrieveApiKey(ApiKeyRetrieveApiKeyParams.none(), requestOptions)
    }
}

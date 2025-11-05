// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.apikey.ApiKeyApiKeyParams
import com.langchain.smith.models.apikey.ApiKeyDeleteParams
import com.langchain.smith.models.apikey.ApiKeyRetrieveApiKeyParams
import com.langchain.smith.models.orgs.current.servicekeys.ApiKeyCreateRequest
import com.langchain.smith.models.orgs.current.servicekeys.ApiKeyCreateResponse
import com.langchain.smith.models.orgs.current.servicekeys.ApiKeyGetResponse
import com.langchain.smith.services.blocking.apikey.CurrentService
import java.util.function.Consumer

interface ApiKeyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ApiKeyService

    fun current(): CurrentService

    /** Delete an api key for the user */
    fun delete(apiKeyId: String): ApiKeyGetResponse = delete(apiKeyId, ApiKeyDeleteParams.none())

    /** @see delete */
    fun delete(
        apiKeyId: String,
        params: ApiKeyDeleteParams = ApiKeyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyGetResponse = delete(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

    /** @see delete */
    fun delete(
        apiKeyId: String,
        params: ApiKeyDeleteParams = ApiKeyDeleteParams.none(),
    ): ApiKeyGetResponse = delete(apiKeyId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ApiKeyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyGetResponse

    /** @see delete */
    fun delete(params: ApiKeyDeleteParams): ApiKeyGetResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(apiKeyId: String, requestOptions: RequestOptions): ApiKeyGetResponse =
        delete(apiKeyId, ApiKeyDeleteParams.none(), requestOptions)

    /** Generate an api key for the user */
    fun apiKey(): ApiKeyCreateResponse = apiKey(ApiKeyApiKeyParams.none())

    /** @see apiKey */
    fun apiKey(
        params: ApiKeyApiKeyParams = ApiKeyApiKeyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyCreateResponse

    /** @see apiKey */
    fun apiKey(params: ApiKeyApiKeyParams = ApiKeyApiKeyParams.none()): ApiKeyCreateResponse =
        apiKey(params, RequestOptions.none())

    /** @see apiKey */
    fun apiKey(
        apiKeyCreateRequest: ApiKeyCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyCreateResponse =
        apiKey(
            ApiKeyApiKeyParams.builder().apiKeyCreateRequest(apiKeyCreateRequest).build(),
            requestOptions,
        )

    /** @see apiKey */
    fun apiKey(apiKeyCreateRequest: ApiKeyCreateRequest): ApiKeyCreateResponse =
        apiKey(apiKeyCreateRequest, RequestOptions.none())

    /** @see apiKey */
    fun apiKey(requestOptions: RequestOptions): ApiKeyCreateResponse =
        apiKey(ApiKeyApiKeyParams.none(), requestOptions)

    /** Get the current tenant's API keys */
    fun retrieveApiKey(): List<ApiKeyGetResponse> =
        retrieveApiKey(ApiKeyRetrieveApiKeyParams.none())

    /** @see retrieveApiKey */
    fun retrieveApiKey(
        params: ApiKeyRetrieveApiKeyParams = ApiKeyRetrieveApiKeyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ApiKeyGetResponse>

    /** @see retrieveApiKey */
    fun retrieveApiKey(
        params: ApiKeyRetrieveApiKeyParams = ApiKeyRetrieveApiKeyParams.none()
    ): List<ApiKeyGetResponse> = retrieveApiKey(params, RequestOptions.none())

    /** @see retrieveApiKey */
    fun retrieveApiKey(requestOptions: RequestOptions): List<ApiKeyGetResponse> =
        retrieveApiKey(ApiKeyRetrieveApiKeyParams.none(), requestOptions)

    /** A view of [ApiKeyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ApiKeyService.WithRawResponse

        fun current(): CurrentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /api/v1/api-key/{api_key_id}`, but is otherwise
         * the same as [ApiKeyService.delete].
         */
        @MustBeClosed
        fun delete(apiKeyId: String): HttpResponseFor<ApiKeyGetResponse> =
            delete(apiKeyId, ApiKeyDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            apiKeyId: String,
            params: ApiKeyDeleteParams = ApiKeyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyGetResponse> =
            delete(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            apiKeyId: String,
            params: ApiKeyDeleteParams = ApiKeyDeleteParams.none(),
        ): HttpResponseFor<ApiKeyGetResponse> = delete(apiKeyId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ApiKeyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyGetResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: ApiKeyDeleteParams): HttpResponseFor<ApiKeyGetResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            apiKeyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiKeyGetResponse> =
            delete(apiKeyId, ApiKeyDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/api-key`, but is otherwise the same as
         * [ApiKeyService.apiKey].
         */
        @MustBeClosed
        fun apiKey(): HttpResponseFor<ApiKeyCreateResponse> = apiKey(ApiKeyApiKeyParams.none())

        /** @see apiKey */
        @MustBeClosed
        fun apiKey(
            params: ApiKeyApiKeyParams = ApiKeyApiKeyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyCreateResponse>

        /** @see apiKey */
        @MustBeClosed
        fun apiKey(
            params: ApiKeyApiKeyParams = ApiKeyApiKeyParams.none()
        ): HttpResponseFor<ApiKeyCreateResponse> = apiKey(params, RequestOptions.none())

        /** @see apiKey */
        @MustBeClosed
        fun apiKey(
            apiKeyCreateRequest: ApiKeyCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyCreateResponse> =
            apiKey(
                ApiKeyApiKeyParams.builder().apiKeyCreateRequest(apiKeyCreateRequest).build(),
                requestOptions,
            )

        /** @see apiKey */
        @MustBeClosed
        fun apiKey(
            apiKeyCreateRequest: ApiKeyCreateRequest
        ): HttpResponseFor<ApiKeyCreateResponse> =
            apiKey(apiKeyCreateRequest, RequestOptions.none())

        /** @see apiKey */
        @MustBeClosed
        fun apiKey(requestOptions: RequestOptions): HttpResponseFor<ApiKeyCreateResponse> =
            apiKey(ApiKeyApiKeyParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/api-key`, but is otherwise the same as
         * [ApiKeyService.retrieveApiKey].
         */
        @MustBeClosed
        fun retrieveApiKey(): HttpResponseFor<List<ApiKeyGetResponse>> =
            retrieveApiKey(ApiKeyRetrieveApiKeyParams.none())

        /** @see retrieveApiKey */
        @MustBeClosed
        fun retrieveApiKey(
            params: ApiKeyRetrieveApiKeyParams = ApiKeyRetrieveApiKeyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ApiKeyGetResponse>>

        /** @see retrieveApiKey */
        @MustBeClosed
        fun retrieveApiKey(
            params: ApiKeyRetrieveApiKeyParams = ApiKeyRetrieveApiKeyParams.none()
        ): HttpResponseFor<List<ApiKeyGetResponse>> = retrieveApiKey(params, RequestOptions.none())

        /** @see retrieveApiKey */
        @MustBeClosed
        fun retrieveApiKey(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<ApiKeyGetResponse>> =
            retrieveApiKey(ApiKeyRetrieveApiKeyParams.none(), requestOptions)
    }
}

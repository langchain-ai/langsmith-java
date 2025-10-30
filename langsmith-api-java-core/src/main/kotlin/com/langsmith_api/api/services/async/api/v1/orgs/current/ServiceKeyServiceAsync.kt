// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.orgs.current

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.orgs.current.servicekeys.ApiKeyCreateRequest
import com.langsmith_api.api.models.api.v1.orgs.current.servicekeys.ApiKeyCreateResponse
import com.langsmith_api.api.models.api.v1.orgs.current.servicekeys.ApiKeyGetResponse
import com.langsmith_api.api.models.api.v1.orgs.current.servicekeys.ServiceKeyDeleteParams
import com.langsmith_api.api.models.api.v1.orgs.current.servicekeys.ServiceKeyRetrieveServiceKeysParams
import com.langsmith_api.api.models.api.v1.orgs.current.servicekeys.ServiceKeyServiceKeysParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ServiceKeyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ServiceKeyServiceAsync

    /** Delete Org Service Key */
    fun delete(apiKeyId: String): CompletableFuture<ApiKeyGetResponse> =
        delete(apiKeyId, ServiceKeyDeleteParams.none())

    /** @see delete */
    fun delete(
        apiKeyId: String,
        params: ServiceKeyDeleteParams = ServiceKeyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyGetResponse> =
        delete(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

    /** @see delete */
    fun delete(
        apiKeyId: String,
        params: ServiceKeyDeleteParams = ServiceKeyDeleteParams.none(),
    ): CompletableFuture<ApiKeyGetResponse> = delete(apiKeyId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ServiceKeyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyGetResponse>

    /** @see delete */
    fun delete(params: ServiceKeyDeleteParams): CompletableFuture<ApiKeyGetResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        apiKeyId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ApiKeyGetResponse> =
        delete(apiKeyId, ServiceKeyDeleteParams.none(), requestOptions)

    /** List Org Service Keys */
    fun retrieveServiceKeys(): CompletableFuture<List<ApiKeyGetResponse>> =
        retrieveServiceKeys(ServiceKeyRetrieveServiceKeysParams.none())

    /** @see retrieveServiceKeys */
    fun retrieveServiceKeys(
        params: ServiceKeyRetrieveServiceKeysParams = ServiceKeyRetrieveServiceKeysParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<ApiKeyGetResponse>>

    /** @see retrieveServiceKeys */
    fun retrieveServiceKeys(
        params: ServiceKeyRetrieveServiceKeysParams = ServiceKeyRetrieveServiceKeysParams.none()
    ): CompletableFuture<List<ApiKeyGetResponse>> =
        retrieveServiceKeys(params, RequestOptions.none())

    /** @see retrieveServiceKeys */
    fun retrieveServiceKeys(
        requestOptions: RequestOptions
    ): CompletableFuture<List<ApiKeyGetResponse>> =
        retrieveServiceKeys(ServiceKeyRetrieveServiceKeysParams.none(), requestOptions)

    /** Create org-scoped service key. If workspaces is None, key is org-wide. */
    fun serviceKeys(params: ServiceKeyServiceKeysParams): CompletableFuture<ApiKeyCreateResponse> =
        serviceKeys(params, RequestOptions.none())

    /** @see serviceKeys */
    fun serviceKeys(
        params: ServiceKeyServiceKeysParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyCreateResponse>

    /** @see serviceKeys */
    fun serviceKeys(
        apiKeyCreateRequest: ApiKeyCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyCreateResponse> =
        serviceKeys(
            ServiceKeyServiceKeysParams.builder().apiKeyCreateRequest(apiKeyCreateRequest).build(),
            requestOptions,
        )

    /** @see serviceKeys */
    fun serviceKeys(
        apiKeyCreateRequest: ApiKeyCreateRequest
    ): CompletableFuture<ApiKeyCreateResponse> =
        serviceKeys(apiKeyCreateRequest, RequestOptions.none())

    /**
     * A view of [ServiceKeyServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ServiceKeyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /api/v1/orgs/current/service-keys/{api_key_id}`,
         * but is otherwise the same as [ServiceKeyServiceAsync.delete].
         */
        fun delete(apiKeyId: String): CompletableFuture<HttpResponseFor<ApiKeyGetResponse>> =
            delete(apiKeyId, ServiceKeyDeleteParams.none())

        /** @see delete */
        fun delete(
            apiKeyId: String,
            params: ServiceKeyDeleteParams = ServiceKeyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyGetResponse>> =
            delete(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

        /** @see delete */
        fun delete(
            apiKeyId: String,
            params: ServiceKeyDeleteParams = ServiceKeyDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyGetResponse>> =
            delete(apiKeyId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ServiceKeyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyGetResponse>>

        /** @see delete */
        fun delete(
            params: ServiceKeyDeleteParams
        ): CompletableFuture<HttpResponseFor<ApiKeyGetResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            apiKeyId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ApiKeyGetResponse>> =
            delete(apiKeyId, ServiceKeyDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/orgs/current/service-keys`, but is otherwise
         * the same as [ServiceKeyServiceAsync.retrieveServiceKeys].
         */
        fun retrieveServiceKeys(): CompletableFuture<HttpResponseFor<List<ApiKeyGetResponse>>> =
            retrieveServiceKeys(ServiceKeyRetrieveServiceKeysParams.none())

        /** @see retrieveServiceKeys */
        fun retrieveServiceKeys(
            params: ServiceKeyRetrieveServiceKeysParams =
                ServiceKeyRetrieveServiceKeysParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<ApiKeyGetResponse>>>

        /** @see retrieveServiceKeys */
        fun retrieveServiceKeys(
            params: ServiceKeyRetrieveServiceKeysParams = ServiceKeyRetrieveServiceKeysParams.none()
        ): CompletableFuture<HttpResponseFor<List<ApiKeyGetResponse>>> =
            retrieveServiceKeys(params, RequestOptions.none())

        /** @see retrieveServiceKeys */
        fun retrieveServiceKeys(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<ApiKeyGetResponse>>> =
            retrieveServiceKeys(ServiceKeyRetrieveServiceKeysParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/orgs/current/service-keys`, but is
         * otherwise the same as [ServiceKeyServiceAsync.serviceKeys].
         */
        fun serviceKeys(
            params: ServiceKeyServiceKeysParams
        ): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>> =
            serviceKeys(params, RequestOptions.none())

        /** @see serviceKeys */
        fun serviceKeys(
            params: ServiceKeyServiceKeysParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>>

        /** @see serviceKeys */
        fun serviceKeys(
            apiKeyCreateRequest: ApiKeyCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>> =
            serviceKeys(
                ServiceKeyServiceKeysParams.builder()
                    .apiKeyCreateRequest(apiKeyCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see serviceKeys */
        fun serviceKeys(
            apiKeyCreateRequest: ApiKeyCreateRequest
        ): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>> =
            serviceKeys(apiKeyCreateRequest, RequestOptions.none())
    }
}

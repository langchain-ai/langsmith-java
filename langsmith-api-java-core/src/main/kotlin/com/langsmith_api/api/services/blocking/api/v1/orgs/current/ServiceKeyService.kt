// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.orgs.current

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.orgs.current.servicekeys.ApiKeyCreateRequest
import com.langsmith_api.api.models.api.v1.orgs.current.servicekeys.ApiKeyCreateResponse
import com.langsmith_api.api.models.api.v1.orgs.current.servicekeys.ApiKeyGetResponse
import com.langsmith_api.api.models.api.v1.orgs.current.servicekeys.ServiceKeyDeleteParams
import com.langsmith_api.api.models.api.v1.orgs.current.servicekeys.ServiceKeyRetrieveServiceKeysParams
import com.langsmith_api.api.models.api.v1.orgs.current.servicekeys.ServiceKeyServiceKeysParams
import java.util.function.Consumer

interface ServiceKeyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ServiceKeyService

    /** Delete Org Service Key */
    fun delete(apiKeyId: String): ApiKeyGetResponse =
        delete(apiKeyId, ServiceKeyDeleteParams.none())

    /** @see delete */
    fun delete(
        apiKeyId: String,
        params: ServiceKeyDeleteParams = ServiceKeyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyGetResponse = delete(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

    /** @see delete */
    fun delete(
        apiKeyId: String,
        params: ServiceKeyDeleteParams = ServiceKeyDeleteParams.none(),
    ): ApiKeyGetResponse = delete(apiKeyId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ServiceKeyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyGetResponse

    /** @see delete */
    fun delete(params: ServiceKeyDeleteParams): ApiKeyGetResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(apiKeyId: String, requestOptions: RequestOptions): ApiKeyGetResponse =
        delete(apiKeyId, ServiceKeyDeleteParams.none(), requestOptions)

    /** List Org Service Keys */
    fun retrieveServiceKeys(): List<ApiKeyGetResponse> =
        retrieveServiceKeys(ServiceKeyRetrieveServiceKeysParams.none())

    /** @see retrieveServiceKeys */
    fun retrieveServiceKeys(
        params: ServiceKeyRetrieveServiceKeysParams = ServiceKeyRetrieveServiceKeysParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ApiKeyGetResponse>

    /** @see retrieveServiceKeys */
    fun retrieveServiceKeys(
        params: ServiceKeyRetrieveServiceKeysParams = ServiceKeyRetrieveServiceKeysParams.none()
    ): List<ApiKeyGetResponse> = retrieveServiceKeys(params, RequestOptions.none())

    /** @see retrieveServiceKeys */
    fun retrieveServiceKeys(requestOptions: RequestOptions): List<ApiKeyGetResponse> =
        retrieveServiceKeys(ServiceKeyRetrieveServiceKeysParams.none(), requestOptions)

    /** Create org-scoped service key. If workspaces is None, key is org-wide. */
    fun serviceKeys(params: ServiceKeyServiceKeysParams): ApiKeyCreateResponse =
        serviceKeys(params, RequestOptions.none())

    /** @see serviceKeys */
    fun serviceKeys(
        params: ServiceKeyServiceKeysParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyCreateResponse

    /** @see serviceKeys */
    fun serviceKeys(
        apiKeyCreateRequest: ApiKeyCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyCreateResponse =
        serviceKeys(
            ServiceKeyServiceKeysParams.builder().apiKeyCreateRequest(apiKeyCreateRequest).build(),
            requestOptions,
        )

    /** @see serviceKeys */
    fun serviceKeys(apiKeyCreateRequest: ApiKeyCreateRequest): ApiKeyCreateResponse =
        serviceKeys(apiKeyCreateRequest, RequestOptions.none())

    /** A view of [ServiceKeyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ServiceKeyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /api/v1/orgs/current/service-keys/{api_key_id}`,
         * but is otherwise the same as [ServiceKeyService.delete].
         */
        @MustBeClosed
        fun delete(apiKeyId: String): HttpResponseFor<ApiKeyGetResponse> =
            delete(apiKeyId, ServiceKeyDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            apiKeyId: String,
            params: ServiceKeyDeleteParams = ServiceKeyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyGetResponse> =
            delete(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            apiKeyId: String,
            params: ServiceKeyDeleteParams = ServiceKeyDeleteParams.none(),
        ): HttpResponseFor<ApiKeyGetResponse> = delete(apiKeyId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ServiceKeyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyGetResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: ServiceKeyDeleteParams): HttpResponseFor<ApiKeyGetResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            apiKeyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiKeyGetResponse> =
            delete(apiKeyId, ServiceKeyDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/orgs/current/service-keys`, but is otherwise
         * the same as [ServiceKeyService.retrieveServiceKeys].
         */
        @MustBeClosed
        fun retrieveServiceKeys(): HttpResponseFor<List<ApiKeyGetResponse>> =
            retrieveServiceKeys(ServiceKeyRetrieveServiceKeysParams.none())

        /** @see retrieveServiceKeys */
        @MustBeClosed
        fun retrieveServiceKeys(
            params: ServiceKeyRetrieveServiceKeysParams =
                ServiceKeyRetrieveServiceKeysParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ApiKeyGetResponse>>

        /** @see retrieveServiceKeys */
        @MustBeClosed
        fun retrieveServiceKeys(
            params: ServiceKeyRetrieveServiceKeysParams = ServiceKeyRetrieveServiceKeysParams.none()
        ): HttpResponseFor<List<ApiKeyGetResponse>> =
            retrieveServiceKeys(params, RequestOptions.none())

        /** @see retrieveServiceKeys */
        @MustBeClosed
        fun retrieveServiceKeys(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<ApiKeyGetResponse>> =
            retrieveServiceKeys(ServiceKeyRetrieveServiceKeysParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/orgs/current/service-keys`, but is
         * otherwise the same as [ServiceKeyService.serviceKeys].
         */
        @MustBeClosed
        fun serviceKeys(
            params: ServiceKeyServiceKeysParams
        ): HttpResponseFor<ApiKeyCreateResponse> = serviceKeys(params, RequestOptions.none())

        /** @see serviceKeys */
        @MustBeClosed
        fun serviceKeys(
            params: ServiceKeyServiceKeysParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyCreateResponse>

        /** @see serviceKeys */
        @MustBeClosed
        fun serviceKeys(
            apiKeyCreateRequest: ApiKeyCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyCreateResponse> =
            serviceKeys(
                ServiceKeyServiceKeysParams.builder()
                    .apiKeyCreateRequest(apiKeyCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see serviceKeys */
        @MustBeClosed
        fun serviceKeys(
            apiKeyCreateRequest: ApiKeyCreateRequest
        ): HttpResponseFor<ApiKeyCreateResponse> =
            serviceKeys(apiKeyCreateRequest, RequestOptions.none())
    }
}

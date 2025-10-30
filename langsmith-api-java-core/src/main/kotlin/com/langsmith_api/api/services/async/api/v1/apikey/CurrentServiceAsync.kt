// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.apikey

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.apikey.current.CurrentCreateParams
import com.langsmith_api.api.models.api.v1.apikey.current.CurrentDeleteParams
import com.langsmith_api.api.models.api.v1.apikey.current.CurrentListParams
import com.langsmith_api.api.models.api.v1.orgs.current.servicekeys.ApiKeyCreateRequest
import com.langsmith_api.api.models.api.v1.orgs.current.servicekeys.ApiKeyCreateResponse
import com.langsmith_api.api.models.api.v1.orgs.current.servicekeys.ApiKeyGetResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CurrentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrentServiceAsync

    /** DEPRECATED: Use /orgs/current/personal-access-tokens instead */
    fun create(): CompletableFuture<ApiKeyCreateResponse> = create(CurrentCreateParams.none())

    /** @see create */
    fun create(
        params: CurrentCreateParams = CurrentCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyCreateResponse>

    /** @see create */
    fun create(
        params: CurrentCreateParams = CurrentCreateParams.none()
    ): CompletableFuture<ApiKeyCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        apiKeyCreateRequest: ApiKeyCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyCreateResponse> =
        create(
            CurrentCreateParams.builder().apiKeyCreateRequest(apiKeyCreateRequest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(apiKeyCreateRequest: ApiKeyCreateRequest): CompletableFuture<ApiKeyCreateResponse> =
        create(apiKeyCreateRequest, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<ApiKeyCreateResponse> =
        create(CurrentCreateParams.none(), requestOptions)

    /** DEPRECATED: Use /orgs/current/personal-access-tokens instead */
    @Deprecated("deprecated")
    fun list(): CompletableFuture<List<ApiKeyGetResponse>> = list(CurrentListParams.none())

    /** @see list */
    @Deprecated("deprecated")
    fun list(
        params: CurrentListParams = CurrentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<ApiKeyGetResponse>>

    /** @see list */
    @Deprecated("deprecated")
    fun list(
        params: CurrentListParams = CurrentListParams.none()
    ): CompletableFuture<List<ApiKeyGetResponse>> = list(params, RequestOptions.none())

    /** @see list */
    @Deprecated("deprecated")
    fun list(requestOptions: RequestOptions): CompletableFuture<List<ApiKeyGetResponse>> =
        list(CurrentListParams.none(), requestOptions)

    /** DEPRECATED: Use /orgs/current/personal-access-tokens/{pat_id} instead */
    @Deprecated("deprecated")
    fun delete(patId: String): CompletableFuture<ApiKeyGetResponse> =
        delete(patId, CurrentDeleteParams.none())

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(
        patId: String,
        params: CurrentDeleteParams = CurrentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyGetResponse> =
        delete(params.toBuilder().patId(patId).build(), requestOptions)

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(
        patId: String,
        params: CurrentDeleteParams = CurrentDeleteParams.none(),
    ): CompletableFuture<ApiKeyGetResponse> = delete(patId, params, RequestOptions.none())

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(
        params: CurrentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyGetResponse>

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(params: CurrentDeleteParams): CompletableFuture<ApiKeyGetResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(
        patId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ApiKeyGetResponse> =
        delete(patId, CurrentDeleteParams.none(), requestOptions)

    /**
     * A view of [CurrentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CurrentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/api-key/current`, but is otherwise the same
         * as [CurrentServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>> =
            create(CurrentCreateParams.none())

        /** @see create */
        fun create(
            params: CurrentCreateParams = CurrentCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>>

        /** @see create */
        fun create(
            params: CurrentCreateParams = CurrentCreateParams.none()
        ): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            apiKeyCreateRequest: ApiKeyCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>> =
            create(
                CurrentCreateParams.builder().apiKeyCreateRequest(apiKeyCreateRequest).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            apiKeyCreateRequest: ApiKeyCreateRequest
        ): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>> =
            create(apiKeyCreateRequest, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>> =
            create(CurrentCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/api-key/current`, but is otherwise the same
         * as [CurrentServiceAsync.list].
         */
        @Deprecated("deprecated")
        fun list(): CompletableFuture<HttpResponseFor<List<ApiKeyGetResponse>>> =
            list(CurrentListParams.none())

        /** @see list */
        @Deprecated("deprecated")
        fun list(
            params: CurrentListParams = CurrentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<ApiKeyGetResponse>>>

        /** @see list */
        @Deprecated("deprecated")
        fun list(
            params: CurrentListParams = CurrentListParams.none()
        ): CompletableFuture<HttpResponseFor<List<ApiKeyGetResponse>>> =
            list(params, RequestOptions.none())

        /** @see list */
        @Deprecated("deprecated")
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<ApiKeyGetResponse>>> =
            list(CurrentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/api-key/current/{pat_id}`, but is
         * otherwise the same as [CurrentServiceAsync.delete].
         */
        @Deprecated("deprecated")
        fun delete(patId: String): CompletableFuture<HttpResponseFor<ApiKeyGetResponse>> =
            delete(patId, CurrentDeleteParams.none())

        /** @see delete */
        @Deprecated("deprecated")
        fun delete(
            patId: String,
            params: CurrentDeleteParams = CurrentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyGetResponse>> =
            delete(params.toBuilder().patId(patId).build(), requestOptions)

        /** @see delete */
        @Deprecated("deprecated")
        fun delete(
            patId: String,
            params: CurrentDeleteParams = CurrentDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyGetResponse>> =
            delete(patId, params, RequestOptions.none())

        /** @see delete */
        @Deprecated("deprecated")
        fun delete(
            params: CurrentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyGetResponse>>

        /** @see delete */
        @Deprecated("deprecated")
        fun delete(
            params: CurrentDeleteParams
        ): CompletableFuture<HttpResponseFor<ApiKeyGetResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @Deprecated("deprecated")
        fun delete(
            patId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ApiKeyGetResponse>> =
            delete(patId, CurrentDeleteParams.none(), requestOptions)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.apikey

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.apikey.current.CurrentCreateParams
import com.langsmith_api.api.models.api.v1.apikey.current.CurrentDeleteParams
import com.langsmith_api.api.models.api.v1.apikey.current.CurrentListParams
import com.langsmith_api.api.models.api.v1.orgs.current.servicekeys.ApiKeyCreateRequest
import com.langsmith_api.api.models.api.v1.orgs.current.servicekeys.ApiKeyCreateResponse
import com.langsmith_api.api.models.api.v1.orgs.current.servicekeys.ApiKeyGetResponse
import java.util.function.Consumer

interface CurrentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrentService

    /** DEPRECATED: Use /orgs/current/personal-access-tokens instead */
    fun create(): ApiKeyCreateResponse = create(CurrentCreateParams.none())

    /** @see create */
    fun create(
        params: CurrentCreateParams = CurrentCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyCreateResponse

    /** @see create */
    fun create(params: CurrentCreateParams = CurrentCreateParams.none()): ApiKeyCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        apiKeyCreateRequest: ApiKeyCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyCreateResponse =
        create(
            CurrentCreateParams.builder().apiKeyCreateRequest(apiKeyCreateRequest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(apiKeyCreateRequest: ApiKeyCreateRequest): ApiKeyCreateResponse =
        create(apiKeyCreateRequest, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): ApiKeyCreateResponse =
        create(CurrentCreateParams.none(), requestOptions)

    /** DEPRECATED: Use /orgs/current/personal-access-tokens instead */
    @Deprecated("deprecated") fun list(): List<ApiKeyGetResponse> = list(CurrentListParams.none())

    /** @see list */
    @Deprecated("deprecated")
    fun list(
        params: CurrentListParams = CurrentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ApiKeyGetResponse>

    /** @see list */
    @Deprecated("deprecated")
    fun list(params: CurrentListParams = CurrentListParams.none()): List<ApiKeyGetResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    @Deprecated("deprecated")
    fun list(requestOptions: RequestOptions): List<ApiKeyGetResponse> =
        list(CurrentListParams.none(), requestOptions)

    /** DEPRECATED: Use /orgs/current/personal-access-tokens/{pat_id} instead */
    @Deprecated("deprecated")
    fun delete(patId: String): ApiKeyGetResponse = delete(patId, CurrentDeleteParams.none())

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(
        patId: String,
        params: CurrentDeleteParams = CurrentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyGetResponse = delete(params.toBuilder().patId(patId).build(), requestOptions)

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(
        patId: String,
        params: CurrentDeleteParams = CurrentDeleteParams.none(),
    ): ApiKeyGetResponse = delete(patId, params, RequestOptions.none())

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(
        params: CurrentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyGetResponse

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(params: CurrentDeleteParams): ApiKeyGetResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(patId: String, requestOptions: RequestOptions): ApiKeyGetResponse =
        delete(patId, CurrentDeleteParams.none(), requestOptions)

    /** A view of [CurrentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/api-key/current`, but is otherwise the same
         * as [CurrentService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<ApiKeyCreateResponse> = create(CurrentCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CurrentCreateParams = CurrentCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: CurrentCreateParams = CurrentCreateParams.none()
        ): HttpResponseFor<ApiKeyCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            apiKeyCreateRequest: ApiKeyCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyCreateResponse> =
            create(
                CurrentCreateParams.builder().apiKeyCreateRequest(apiKeyCreateRequest).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            apiKeyCreateRequest: ApiKeyCreateRequest
        ): HttpResponseFor<ApiKeyCreateResponse> =
            create(apiKeyCreateRequest, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<ApiKeyCreateResponse> =
            create(CurrentCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/api-key/current`, but is otherwise the same
         * as [CurrentService.list].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun list(): HttpResponseFor<List<ApiKeyGetResponse>> = list(CurrentListParams.none())

        /** @see list */
        @Deprecated("deprecated")
        @MustBeClosed
        fun list(
            params: CurrentListParams = CurrentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ApiKeyGetResponse>>

        /** @see list */
        @Deprecated("deprecated")
        @MustBeClosed
        fun list(
            params: CurrentListParams = CurrentListParams.none()
        ): HttpResponseFor<List<ApiKeyGetResponse>> = list(params, RequestOptions.none())

        /** @see list */
        @Deprecated("deprecated")
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<ApiKeyGetResponse>> =
            list(CurrentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/api-key/current/{pat_id}`, but is
         * otherwise the same as [CurrentService.delete].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun delete(patId: String): HttpResponseFor<ApiKeyGetResponse> =
            delete(patId, CurrentDeleteParams.none())

        /** @see delete */
        @Deprecated("deprecated")
        @MustBeClosed
        fun delete(
            patId: String,
            params: CurrentDeleteParams = CurrentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyGetResponse> =
            delete(params.toBuilder().patId(patId).build(), requestOptions)

        /** @see delete */
        @Deprecated("deprecated")
        @MustBeClosed
        fun delete(
            patId: String,
            params: CurrentDeleteParams = CurrentDeleteParams.none(),
        ): HttpResponseFor<ApiKeyGetResponse> = delete(patId, params, RequestOptions.none())

        /** @see delete */
        @Deprecated("deprecated")
        @MustBeClosed
        fun delete(
            params: CurrentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyGetResponse>

        /** @see delete */
        @Deprecated("deprecated")
        @MustBeClosed
        fun delete(params: CurrentDeleteParams): HttpResponseFor<ApiKeyGetResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @Deprecated("deprecated")
        @MustBeClosed
        fun delete(
            patId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiKeyGetResponse> =
            delete(patId, CurrentDeleteParams.none(), requestOptions)
    }
}

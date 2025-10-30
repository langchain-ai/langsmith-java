// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.orgs.current

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.orgs.current.personalaccesstokens.PersonalAccessTokenDeleteParams
import com.langsmith_api.api.models.api.v1.orgs.current.personalaccesstokens.PersonalAccessTokenPersonalAccessTokensParams
import com.langsmith_api.api.models.api.v1.orgs.current.personalaccesstokens.PersonalAccessTokenRetrievePersonalAccessTokensParams
import com.langsmith_api.api.models.api.v1.orgs.current.servicekeys.ApiKeyCreateRequest
import com.langsmith_api.api.models.api.v1.orgs.current.servicekeys.ApiKeyCreateResponse
import com.langsmith_api.api.models.api.v1.orgs.current.servicekeys.ApiKeyGetResponse
import java.util.function.Consumer

interface PersonalAccessTokenService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PersonalAccessTokenService

    /** Delete Org Personal Access Token */
    fun delete(patId: String): ApiKeyGetResponse =
        delete(patId, PersonalAccessTokenDeleteParams.none())

    /** @see delete */
    fun delete(
        patId: String,
        params: PersonalAccessTokenDeleteParams = PersonalAccessTokenDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyGetResponse = delete(params.toBuilder().patId(patId).build(), requestOptions)

    /** @see delete */
    fun delete(
        patId: String,
        params: PersonalAccessTokenDeleteParams = PersonalAccessTokenDeleteParams.none(),
    ): ApiKeyGetResponse = delete(patId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PersonalAccessTokenDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyGetResponse

    /** @see delete */
    fun delete(params: PersonalAccessTokenDeleteParams): ApiKeyGetResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(patId: String, requestOptions: RequestOptions): ApiKeyGetResponse =
        delete(patId, PersonalAccessTokenDeleteParams.none(), requestOptions)

    /** Create Org Personal Access Token */
    fun personalAccessTokens(
        params: PersonalAccessTokenPersonalAccessTokensParams
    ): ApiKeyCreateResponse = personalAccessTokens(params, RequestOptions.none())

    /** @see personalAccessTokens */
    fun personalAccessTokens(
        params: PersonalAccessTokenPersonalAccessTokensParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyCreateResponse

    /** @see personalAccessTokens */
    fun personalAccessTokens(
        apiKeyCreateRequest: ApiKeyCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyCreateResponse =
        personalAccessTokens(
            PersonalAccessTokenPersonalAccessTokensParams.builder()
                .apiKeyCreateRequest(apiKeyCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see personalAccessTokens */
    fun personalAccessTokens(apiKeyCreateRequest: ApiKeyCreateRequest): ApiKeyCreateResponse =
        personalAccessTokens(apiKeyCreateRequest, RequestOptions.none())

    /** List Org Personal Access Tokens */
    fun retrievePersonalAccessTokens(): List<ApiKeyGetResponse> =
        retrievePersonalAccessTokens(PersonalAccessTokenRetrievePersonalAccessTokensParams.none())

    /** @see retrievePersonalAccessTokens */
    fun retrievePersonalAccessTokens(
        params: PersonalAccessTokenRetrievePersonalAccessTokensParams =
            PersonalAccessTokenRetrievePersonalAccessTokensParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ApiKeyGetResponse>

    /** @see retrievePersonalAccessTokens */
    fun retrievePersonalAccessTokens(
        params: PersonalAccessTokenRetrievePersonalAccessTokensParams =
            PersonalAccessTokenRetrievePersonalAccessTokensParams.none()
    ): List<ApiKeyGetResponse> = retrievePersonalAccessTokens(params, RequestOptions.none())

    /** @see retrievePersonalAccessTokens */
    fun retrievePersonalAccessTokens(requestOptions: RequestOptions): List<ApiKeyGetResponse> =
        retrievePersonalAccessTokens(
            PersonalAccessTokenRetrievePersonalAccessTokensParams.none(),
            requestOptions,
        )

    /**
     * A view of [PersonalAccessTokenService] that provides access to raw HTTP responses for each
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
        ): PersonalAccessTokenService.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/orgs/current/personal-access-tokens/{pat_id}`, but is otherwise the same as
         * [PersonalAccessTokenService.delete].
         */
        @MustBeClosed
        fun delete(patId: String): HttpResponseFor<ApiKeyGetResponse> =
            delete(patId, PersonalAccessTokenDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            patId: String,
            params: PersonalAccessTokenDeleteParams = PersonalAccessTokenDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyGetResponse> =
            delete(params.toBuilder().patId(patId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            patId: String,
            params: PersonalAccessTokenDeleteParams = PersonalAccessTokenDeleteParams.none(),
        ): HttpResponseFor<ApiKeyGetResponse> = delete(patId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PersonalAccessTokenDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyGetResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: PersonalAccessTokenDeleteParams): HttpResponseFor<ApiKeyGetResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            patId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiKeyGetResponse> =
            delete(patId, PersonalAccessTokenDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/orgs/current/personal-access-tokens`, but
         * is otherwise the same as [PersonalAccessTokenService.personalAccessTokens].
         */
        @MustBeClosed
        fun personalAccessTokens(
            params: PersonalAccessTokenPersonalAccessTokensParams
        ): HttpResponseFor<ApiKeyCreateResponse> =
            personalAccessTokens(params, RequestOptions.none())

        /** @see personalAccessTokens */
        @MustBeClosed
        fun personalAccessTokens(
            params: PersonalAccessTokenPersonalAccessTokensParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyCreateResponse>

        /** @see personalAccessTokens */
        @MustBeClosed
        fun personalAccessTokens(
            apiKeyCreateRequest: ApiKeyCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyCreateResponse> =
            personalAccessTokens(
                PersonalAccessTokenPersonalAccessTokensParams.builder()
                    .apiKeyCreateRequest(apiKeyCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see personalAccessTokens */
        @MustBeClosed
        fun personalAccessTokens(
            apiKeyCreateRequest: ApiKeyCreateRequest
        ): HttpResponseFor<ApiKeyCreateResponse> =
            personalAccessTokens(apiKeyCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /api/v1/orgs/current/personal-access-tokens`, but is
         * otherwise the same as [PersonalAccessTokenService.retrievePersonalAccessTokens].
         */
        @MustBeClosed
        fun retrievePersonalAccessTokens(): HttpResponseFor<List<ApiKeyGetResponse>> =
            retrievePersonalAccessTokens(
                PersonalAccessTokenRetrievePersonalAccessTokensParams.none()
            )

        /** @see retrievePersonalAccessTokens */
        @MustBeClosed
        fun retrievePersonalAccessTokens(
            params: PersonalAccessTokenRetrievePersonalAccessTokensParams =
                PersonalAccessTokenRetrievePersonalAccessTokensParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ApiKeyGetResponse>>

        /** @see retrievePersonalAccessTokens */
        @MustBeClosed
        fun retrievePersonalAccessTokens(
            params: PersonalAccessTokenRetrievePersonalAccessTokensParams =
                PersonalAccessTokenRetrievePersonalAccessTokensParams.none()
        ): HttpResponseFor<List<ApiKeyGetResponse>> =
            retrievePersonalAccessTokens(params, RequestOptions.none())

        /** @see retrievePersonalAccessTokens */
        @MustBeClosed
        fun retrievePersonalAccessTokens(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<ApiKeyGetResponse>> =
            retrievePersonalAccessTokens(
                PersonalAccessTokenRetrievePersonalAccessTokensParams.none(),
                requestOptions,
            )
    }
}

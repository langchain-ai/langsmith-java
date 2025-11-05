// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.orgs.current

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.orgs.current.personalaccesstokens.PersonalAccessTokenDeleteParams
import com.langchain.smith.models.orgs.current.personalaccesstokens.PersonalAccessTokenPersonalAccessTokensParams
import com.langchain.smith.models.orgs.current.personalaccesstokens.PersonalAccessTokenRetrievePersonalAccessTokensParams
import com.langchain.smith.models.orgs.current.servicekeys.ApiKeyCreateRequest
import com.langchain.smith.models.orgs.current.servicekeys.ApiKeyCreateResponse
import com.langchain.smith.models.orgs.current.servicekeys.ApiKeyGetResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PersonalAccessTokenServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PersonalAccessTokenServiceAsync

    /** Delete Org Personal Access Token */
    fun delete(patId: String): CompletableFuture<ApiKeyGetResponse> =
        delete(patId, PersonalAccessTokenDeleteParams.none())

    /** @see delete */
    fun delete(
        patId: String,
        params: PersonalAccessTokenDeleteParams = PersonalAccessTokenDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyGetResponse> =
        delete(params.toBuilder().patId(patId).build(), requestOptions)

    /** @see delete */
    fun delete(
        patId: String,
        params: PersonalAccessTokenDeleteParams = PersonalAccessTokenDeleteParams.none(),
    ): CompletableFuture<ApiKeyGetResponse> = delete(patId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PersonalAccessTokenDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyGetResponse>

    /** @see delete */
    fun delete(params: PersonalAccessTokenDeleteParams): CompletableFuture<ApiKeyGetResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        patId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ApiKeyGetResponse> =
        delete(patId, PersonalAccessTokenDeleteParams.none(), requestOptions)

    /** Create Org Personal Access Token */
    fun personalAccessTokens(
        params: PersonalAccessTokenPersonalAccessTokensParams
    ): CompletableFuture<ApiKeyCreateResponse> = personalAccessTokens(params, RequestOptions.none())

    /** @see personalAccessTokens */
    fun personalAccessTokens(
        params: PersonalAccessTokenPersonalAccessTokensParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyCreateResponse>

    /** @see personalAccessTokens */
    fun personalAccessTokens(
        apiKeyCreateRequest: ApiKeyCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyCreateResponse> =
        personalAccessTokens(
            PersonalAccessTokenPersonalAccessTokensParams.builder()
                .apiKeyCreateRequest(apiKeyCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see personalAccessTokens */
    fun personalAccessTokens(
        apiKeyCreateRequest: ApiKeyCreateRequest
    ): CompletableFuture<ApiKeyCreateResponse> =
        personalAccessTokens(apiKeyCreateRequest, RequestOptions.none())

    /** List Org Personal Access Tokens */
    fun retrievePersonalAccessTokens(): CompletableFuture<List<ApiKeyGetResponse>> =
        retrievePersonalAccessTokens(PersonalAccessTokenRetrievePersonalAccessTokensParams.none())

    /** @see retrievePersonalAccessTokens */
    fun retrievePersonalAccessTokens(
        params: PersonalAccessTokenRetrievePersonalAccessTokensParams =
            PersonalAccessTokenRetrievePersonalAccessTokensParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<ApiKeyGetResponse>>

    /** @see retrievePersonalAccessTokens */
    fun retrievePersonalAccessTokens(
        params: PersonalAccessTokenRetrievePersonalAccessTokensParams =
            PersonalAccessTokenRetrievePersonalAccessTokensParams.none()
    ): CompletableFuture<List<ApiKeyGetResponse>> =
        retrievePersonalAccessTokens(params, RequestOptions.none())

    /** @see retrievePersonalAccessTokens */
    fun retrievePersonalAccessTokens(
        requestOptions: RequestOptions
    ): CompletableFuture<List<ApiKeyGetResponse>> =
        retrievePersonalAccessTokens(
            PersonalAccessTokenRetrievePersonalAccessTokensParams.none(),
            requestOptions,
        )

    /**
     * A view of [PersonalAccessTokenServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PersonalAccessTokenServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/orgs/current/personal-access-tokens/{pat_id}`, but is otherwise the same as
         * [PersonalAccessTokenServiceAsync.delete].
         */
        fun delete(patId: String): CompletableFuture<HttpResponseFor<ApiKeyGetResponse>> =
            delete(patId, PersonalAccessTokenDeleteParams.none())

        /** @see delete */
        fun delete(
            patId: String,
            params: PersonalAccessTokenDeleteParams = PersonalAccessTokenDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyGetResponse>> =
            delete(params.toBuilder().patId(patId).build(), requestOptions)

        /** @see delete */
        fun delete(
            patId: String,
            params: PersonalAccessTokenDeleteParams = PersonalAccessTokenDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyGetResponse>> =
            delete(patId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PersonalAccessTokenDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyGetResponse>>

        /** @see delete */
        fun delete(
            params: PersonalAccessTokenDeleteParams
        ): CompletableFuture<HttpResponseFor<ApiKeyGetResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            patId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ApiKeyGetResponse>> =
            delete(patId, PersonalAccessTokenDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/orgs/current/personal-access-tokens`, but
         * is otherwise the same as [PersonalAccessTokenServiceAsync.personalAccessTokens].
         */
        fun personalAccessTokens(
            params: PersonalAccessTokenPersonalAccessTokensParams
        ): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>> =
            personalAccessTokens(params, RequestOptions.none())

        /** @see personalAccessTokens */
        fun personalAccessTokens(
            params: PersonalAccessTokenPersonalAccessTokensParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>>

        /** @see personalAccessTokens */
        fun personalAccessTokens(
            apiKeyCreateRequest: ApiKeyCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>> =
            personalAccessTokens(
                PersonalAccessTokenPersonalAccessTokensParams.builder()
                    .apiKeyCreateRequest(apiKeyCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see personalAccessTokens */
        fun personalAccessTokens(
            apiKeyCreateRequest: ApiKeyCreateRequest
        ): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>> =
            personalAccessTokens(apiKeyCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /api/v1/orgs/current/personal-access-tokens`, but is
         * otherwise the same as [PersonalAccessTokenServiceAsync.retrievePersonalAccessTokens].
         */
        fun retrievePersonalAccessTokens():
            CompletableFuture<HttpResponseFor<List<ApiKeyGetResponse>>> =
            retrievePersonalAccessTokens(
                PersonalAccessTokenRetrievePersonalAccessTokensParams.none()
            )

        /** @see retrievePersonalAccessTokens */
        fun retrievePersonalAccessTokens(
            params: PersonalAccessTokenRetrievePersonalAccessTokensParams =
                PersonalAccessTokenRetrievePersonalAccessTokensParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<ApiKeyGetResponse>>>

        /** @see retrievePersonalAccessTokens */
        fun retrievePersonalAccessTokens(
            params: PersonalAccessTokenRetrievePersonalAccessTokensParams =
                PersonalAccessTokenRetrievePersonalAccessTokensParams.none()
        ): CompletableFuture<HttpResponseFor<List<ApiKeyGetResponse>>> =
            retrievePersonalAccessTokens(params, RequestOptions.none())

        /** @see retrievePersonalAccessTokens */
        fun retrievePersonalAccessTokens(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<ApiKeyGetResponse>>> =
            retrievePersonalAccessTokens(
                PersonalAccessTokenRetrievePersonalAccessTokensParams.none(),
                requestOptions,
            )
    }
}

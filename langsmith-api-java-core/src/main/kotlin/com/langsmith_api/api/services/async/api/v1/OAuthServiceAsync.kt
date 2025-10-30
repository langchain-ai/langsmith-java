// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.oauth.OAuthProvider
import com.langsmith_api.api.models.api.v1.oauth.OAuthRetrieveCallbackParams
import com.langsmith_api.api.models.api.v1.oauth.OAuthRetrieveCallbackResponse
import com.langsmith_api.api.models.api.v1.oauth.OAuthRetrieveCurrentUserParams
import com.langsmith_api.api.models.api.v1.oauth.OAuthRetrieveCurrentUserResponse
import com.langsmith_api.api.models.api.v1.oauth.OAuthRetrieveLogoutParams
import com.langsmith_api.api.models.api.v1.oauth.OAuthRetrieveLogoutResponse
import com.langsmith_api.api.models.api.v1.oauth.OAuthRetrieveParams
import com.langsmith_api.api.models.api.v1.oauth.OAuthRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OAuthServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OAuthServiceAsync

    /** Oauth Provider Auth */
    fun retrieve(provider: OAuthProvider): CompletableFuture<OAuthRetrieveResponse> =
        retrieve(provider, OAuthRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        provider: OAuthProvider,
        params: OAuthRetrieveParams = OAuthRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthRetrieveResponse> =
        retrieve(params.toBuilder().provider(provider).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        provider: OAuthProvider,
        params: OAuthRetrieveParams = OAuthRetrieveParams.none(),
    ): CompletableFuture<OAuthRetrieveResponse> = retrieve(provider, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: OAuthRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: OAuthRetrieveParams): CompletableFuture<OAuthRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        provider: OAuthProvider,
        requestOptions: RequestOptions,
    ): CompletableFuture<OAuthRetrieveResponse> =
        retrieve(provider, OAuthRetrieveParams.none(), requestOptions)

    /** Oauth Provider Callback */
    fun retrieveCallback(
        provider: OAuthProvider
    ): CompletableFuture<OAuthRetrieveCallbackResponse> =
        retrieveCallback(provider, OAuthRetrieveCallbackParams.none())

    /** @see retrieveCallback */
    fun retrieveCallback(
        provider: OAuthProvider,
        params: OAuthRetrieveCallbackParams = OAuthRetrieveCallbackParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthRetrieveCallbackResponse> =
        retrieveCallback(params.toBuilder().provider(provider).build(), requestOptions)

    /** @see retrieveCallback */
    fun retrieveCallback(
        provider: OAuthProvider,
        params: OAuthRetrieveCallbackParams = OAuthRetrieveCallbackParams.none(),
    ): CompletableFuture<OAuthRetrieveCallbackResponse> =
        retrieveCallback(provider, params, RequestOptions.none())

    /** @see retrieveCallback */
    fun retrieveCallback(
        params: OAuthRetrieveCallbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthRetrieveCallbackResponse>

    /** @see retrieveCallback */
    fun retrieveCallback(
        params: OAuthRetrieveCallbackParams
    ): CompletableFuture<OAuthRetrieveCallbackResponse> =
        retrieveCallback(params, RequestOptions.none())

    /** @see retrieveCallback */
    fun retrieveCallback(
        provider: OAuthProvider,
        requestOptions: RequestOptions,
    ): CompletableFuture<OAuthRetrieveCallbackResponse> =
        retrieveCallback(provider, OAuthRetrieveCallbackParams.none(), requestOptions)

    /** Oauth Provider Current User */
    fun retrieveCurrentUser(
        provider: OAuthProvider
    ): CompletableFuture<OAuthRetrieveCurrentUserResponse> =
        retrieveCurrentUser(provider, OAuthRetrieveCurrentUserParams.none())

    /** @see retrieveCurrentUser */
    fun retrieveCurrentUser(
        provider: OAuthProvider,
        params: OAuthRetrieveCurrentUserParams = OAuthRetrieveCurrentUserParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthRetrieveCurrentUserResponse> =
        retrieveCurrentUser(params.toBuilder().provider(provider).build(), requestOptions)

    /** @see retrieveCurrentUser */
    fun retrieveCurrentUser(
        provider: OAuthProvider,
        params: OAuthRetrieveCurrentUserParams = OAuthRetrieveCurrentUserParams.none(),
    ): CompletableFuture<OAuthRetrieveCurrentUserResponse> =
        retrieveCurrentUser(provider, params, RequestOptions.none())

    /** @see retrieveCurrentUser */
    fun retrieveCurrentUser(
        params: OAuthRetrieveCurrentUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthRetrieveCurrentUserResponse>

    /** @see retrieveCurrentUser */
    fun retrieveCurrentUser(
        params: OAuthRetrieveCurrentUserParams
    ): CompletableFuture<OAuthRetrieveCurrentUserResponse> =
        retrieveCurrentUser(params, RequestOptions.none())

    /** @see retrieveCurrentUser */
    fun retrieveCurrentUser(
        provider: OAuthProvider,
        requestOptions: RequestOptions,
    ): CompletableFuture<OAuthRetrieveCurrentUserResponse> =
        retrieveCurrentUser(provider, OAuthRetrieveCurrentUserParams.none(), requestOptions)

    /** Oauth Provider Logout */
    fun retrieveLogout(provider: OAuthProvider): CompletableFuture<OAuthRetrieveLogoutResponse> =
        retrieveLogout(provider, OAuthRetrieveLogoutParams.none())

    /** @see retrieveLogout */
    fun retrieveLogout(
        provider: OAuthProvider,
        params: OAuthRetrieveLogoutParams = OAuthRetrieveLogoutParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthRetrieveLogoutResponse> =
        retrieveLogout(params.toBuilder().provider(provider).build(), requestOptions)

    /** @see retrieveLogout */
    fun retrieveLogout(
        provider: OAuthProvider,
        params: OAuthRetrieveLogoutParams = OAuthRetrieveLogoutParams.none(),
    ): CompletableFuture<OAuthRetrieveLogoutResponse> =
        retrieveLogout(provider, params, RequestOptions.none())

    /** @see retrieveLogout */
    fun retrieveLogout(
        params: OAuthRetrieveLogoutParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthRetrieveLogoutResponse>

    /** @see retrieveLogout */
    fun retrieveLogout(
        params: OAuthRetrieveLogoutParams
    ): CompletableFuture<OAuthRetrieveLogoutResponse> =
        retrieveLogout(params, RequestOptions.none())

    /** @see retrieveLogout */
    fun retrieveLogout(
        provider: OAuthProvider,
        requestOptions: RequestOptions,
    ): CompletableFuture<OAuthRetrieveLogoutResponse> =
        retrieveLogout(provider, OAuthRetrieveLogoutParams.none(), requestOptions)

    /** A view of [OAuthServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OAuthServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/oauth/{provider}`, but is otherwise the same
         * as [OAuthServiceAsync.retrieve].
         */
        fun retrieve(
            provider: OAuthProvider
        ): CompletableFuture<HttpResponseFor<OAuthRetrieveResponse>> =
            retrieve(provider, OAuthRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            provider: OAuthProvider,
            params: OAuthRetrieveParams = OAuthRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthRetrieveResponse>> =
            retrieve(params.toBuilder().provider(provider).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            provider: OAuthProvider,
            params: OAuthRetrieveParams = OAuthRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<OAuthRetrieveResponse>> =
            retrieve(provider, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: OAuthRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: OAuthRetrieveParams
        ): CompletableFuture<HttpResponseFor<OAuthRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            provider: OAuthProvider,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OAuthRetrieveResponse>> =
            retrieve(provider, OAuthRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/oauth/{provider}/callback`, but is otherwise
         * the same as [OAuthServiceAsync.retrieveCallback].
         */
        fun retrieveCallback(
            provider: OAuthProvider
        ): CompletableFuture<HttpResponseFor<OAuthRetrieveCallbackResponse>> =
            retrieveCallback(provider, OAuthRetrieveCallbackParams.none())

        /** @see retrieveCallback */
        fun retrieveCallback(
            provider: OAuthProvider,
            params: OAuthRetrieveCallbackParams = OAuthRetrieveCallbackParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthRetrieveCallbackResponse>> =
            retrieveCallback(params.toBuilder().provider(provider).build(), requestOptions)

        /** @see retrieveCallback */
        fun retrieveCallback(
            provider: OAuthProvider,
            params: OAuthRetrieveCallbackParams = OAuthRetrieveCallbackParams.none(),
        ): CompletableFuture<HttpResponseFor<OAuthRetrieveCallbackResponse>> =
            retrieveCallback(provider, params, RequestOptions.none())

        /** @see retrieveCallback */
        fun retrieveCallback(
            params: OAuthRetrieveCallbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthRetrieveCallbackResponse>>

        /** @see retrieveCallback */
        fun retrieveCallback(
            params: OAuthRetrieveCallbackParams
        ): CompletableFuture<HttpResponseFor<OAuthRetrieveCallbackResponse>> =
            retrieveCallback(params, RequestOptions.none())

        /** @see retrieveCallback */
        fun retrieveCallback(
            provider: OAuthProvider,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OAuthRetrieveCallbackResponse>> =
            retrieveCallback(provider, OAuthRetrieveCallbackParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/oauth/{provider}/current-user`, but is
         * otherwise the same as [OAuthServiceAsync.retrieveCurrentUser].
         */
        fun retrieveCurrentUser(
            provider: OAuthProvider
        ): CompletableFuture<HttpResponseFor<OAuthRetrieveCurrentUserResponse>> =
            retrieveCurrentUser(provider, OAuthRetrieveCurrentUserParams.none())

        /** @see retrieveCurrentUser */
        fun retrieveCurrentUser(
            provider: OAuthProvider,
            params: OAuthRetrieveCurrentUserParams = OAuthRetrieveCurrentUserParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthRetrieveCurrentUserResponse>> =
            retrieveCurrentUser(params.toBuilder().provider(provider).build(), requestOptions)

        /** @see retrieveCurrentUser */
        fun retrieveCurrentUser(
            provider: OAuthProvider,
            params: OAuthRetrieveCurrentUserParams = OAuthRetrieveCurrentUserParams.none(),
        ): CompletableFuture<HttpResponseFor<OAuthRetrieveCurrentUserResponse>> =
            retrieveCurrentUser(provider, params, RequestOptions.none())

        /** @see retrieveCurrentUser */
        fun retrieveCurrentUser(
            params: OAuthRetrieveCurrentUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthRetrieveCurrentUserResponse>>

        /** @see retrieveCurrentUser */
        fun retrieveCurrentUser(
            params: OAuthRetrieveCurrentUserParams
        ): CompletableFuture<HttpResponseFor<OAuthRetrieveCurrentUserResponse>> =
            retrieveCurrentUser(params, RequestOptions.none())

        /** @see retrieveCurrentUser */
        fun retrieveCurrentUser(
            provider: OAuthProvider,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OAuthRetrieveCurrentUserResponse>> =
            retrieveCurrentUser(provider, OAuthRetrieveCurrentUserParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/oauth/{provider}/logout`, but is otherwise
         * the same as [OAuthServiceAsync.retrieveLogout].
         */
        fun retrieveLogout(
            provider: OAuthProvider
        ): CompletableFuture<HttpResponseFor<OAuthRetrieveLogoutResponse>> =
            retrieveLogout(provider, OAuthRetrieveLogoutParams.none())

        /** @see retrieveLogout */
        fun retrieveLogout(
            provider: OAuthProvider,
            params: OAuthRetrieveLogoutParams = OAuthRetrieveLogoutParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthRetrieveLogoutResponse>> =
            retrieveLogout(params.toBuilder().provider(provider).build(), requestOptions)

        /** @see retrieveLogout */
        fun retrieveLogout(
            provider: OAuthProvider,
            params: OAuthRetrieveLogoutParams = OAuthRetrieveLogoutParams.none(),
        ): CompletableFuture<HttpResponseFor<OAuthRetrieveLogoutResponse>> =
            retrieveLogout(provider, params, RequestOptions.none())

        /** @see retrieveLogout */
        fun retrieveLogout(
            params: OAuthRetrieveLogoutParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthRetrieveLogoutResponse>>

        /** @see retrieveLogout */
        fun retrieveLogout(
            params: OAuthRetrieveLogoutParams
        ): CompletableFuture<HttpResponseFor<OAuthRetrieveLogoutResponse>> =
            retrieveLogout(params, RequestOptions.none())

        /** @see retrieveLogout */
        fun retrieveLogout(
            provider: OAuthProvider,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OAuthRetrieveLogoutResponse>> =
            retrieveLogout(provider, OAuthRetrieveLogoutParams.none(), requestOptions)
    }
}

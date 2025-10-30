// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface OAuthService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OAuthService

    /** Oauth Provider Auth */
    fun retrieve(provider: OAuthProvider): OAuthRetrieveResponse =
        retrieve(provider, OAuthRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        provider: OAuthProvider,
        params: OAuthRetrieveParams = OAuthRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthRetrieveResponse =
        retrieve(params.toBuilder().provider(provider).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        provider: OAuthProvider,
        params: OAuthRetrieveParams = OAuthRetrieveParams.none(),
    ): OAuthRetrieveResponse = retrieve(provider, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: OAuthRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: OAuthRetrieveParams): OAuthRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(provider: OAuthProvider, requestOptions: RequestOptions): OAuthRetrieveResponse =
        retrieve(provider, OAuthRetrieveParams.none(), requestOptions)

    /** Oauth Provider Callback */
    fun retrieveCallback(provider: OAuthProvider): OAuthRetrieveCallbackResponse =
        retrieveCallback(provider, OAuthRetrieveCallbackParams.none())

    /** @see retrieveCallback */
    fun retrieveCallback(
        provider: OAuthProvider,
        params: OAuthRetrieveCallbackParams = OAuthRetrieveCallbackParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthRetrieveCallbackResponse =
        retrieveCallback(params.toBuilder().provider(provider).build(), requestOptions)

    /** @see retrieveCallback */
    fun retrieveCallback(
        provider: OAuthProvider,
        params: OAuthRetrieveCallbackParams = OAuthRetrieveCallbackParams.none(),
    ): OAuthRetrieveCallbackResponse = retrieveCallback(provider, params, RequestOptions.none())

    /** @see retrieveCallback */
    fun retrieveCallback(
        params: OAuthRetrieveCallbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthRetrieveCallbackResponse

    /** @see retrieveCallback */
    fun retrieveCallback(params: OAuthRetrieveCallbackParams): OAuthRetrieveCallbackResponse =
        retrieveCallback(params, RequestOptions.none())

    /** @see retrieveCallback */
    fun retrieveCallback(
        provider: OAuthProvider,
        requestOptions: RequestOptions,
    ): OAuthRetrieveCallbackResponse =
        retrieveCallback(provider, OAuthRetrieveCallbackParams.none(), requestOptions)

    /** Oauth Provider Current User */
    fun retrieveCurrentUser(provider: OAuthProvider): OAuthRetrieveCurrentUserResponse =
        retrieveCurrentUser(provider, OAuthRetrieveCurrentUserParams.none())

    /** @see retrieveCurrentUser */
    fun retrieveCurrentUser(
        provider: OAuthProvider,
        params: OAuthRetrieveCurrentUserParams = OAuthRetrieveCurrentUserParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthRetrieveCurrentUserResponse =
        retrieveCurrentUser(params.toBuilder().provider(provider).build(), requestOptions)

    /** @see retrieveCurrentUser */
    fun retrieveCurrentUser(
        provider: OAuthProvider,
        params: OAuthRetrieveCurrentUserParams = OAuthRetrieveCurrentUserParams.none(),
    ): OAuthRetrieveCurrentUserResponse =
        retrieveCurrentUser(provider, params, RequestOptions.none())

    /** @see retrieveCurrentUser */
    fun retrieveCurrentUser(
        params: OAuthRetrieveCurrentUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthRetrieveCurrentUserResponse

    /** @see retrieveCurrentUser */
    fun retrieveCurrentUser(
        params: OAuthRetrieveCurrentUserParams
    ): OAuthRetrieveCurrentUserResponse = retrieveCurrentUser(params, RequestOptions.none())

    /** @see retrieveCurrentUser */
    fun retrieveCurrentUser(
        provider: OAuthProvider,
        requestOptions: RequestOptions,
    ): OAuthRetrieveCurrentUserResponse =
        retrieveCurrentUser(provider, OAuthRetrieveCurrentUserParams.none(), requestOptions)

    /** Oauth Provider Logout */
    fun retrieveLogout(provider: OAuthProvider): OAuthRetrieveLogoutResponse =
        retrieveLogout(provider, OAuthRetrieveLogoutParams.none())

    /** @see retrieveLogout */
    fun retrieveLogout(
        provider: OAuthProvider,
        params: OAuthRetrieveLogoutParams = OAuthRetrieveLogoutParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthRetrieveLogoutResponse =
        retrieveLogout(params.toBuilder().provider(provider).build(), requestOptions)

    /** @see retrieveLogout */
    fun retrieveLogout(
        provider: OAuthProvider,
        params: OAuthRetrieveLogoutParams = OAuthRetrieveLogoutParams.none(),
    ): OAuthRetrieveLogoutResponse = retrieveLogout(provider, params, RequestOptions.none())

    /** @see retrieveLogout */
    fun retrieveLogout(
        params: OAuthRetrieveLogoutParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthRetrieveLogoutResponse

    /** @see retrieveLogout */
    fun retrieveLogout(params: OAuthRetrieveLogoutParams): OAuthRetrieveLogoutResponse =
        retrieveLogout(params, RequestOptions.none())

    /** @see retrieveLogout */
    fun retrieveLogout(
        provider: OAuthProvider,
        requestOptions: RequestOptions,
    ): OAuthRetrieveLogoutResponse =
        retrieveLogout(provider, OAuthRetrieveLogoutParams.none(), requestOptions)

    /** A view of [OAuthService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OAuthService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/oauth/{provider}`, but is otherwise the same
         * as [OAuthService.retrieve].
         */
        @MustBeClosed
        fun retrieve(provider: OAuthProvider): HttpResponseFor<OAuthRetrieveResponse> =
            retrieve(provider, OAuthRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            provider: OAuthProvider,
            params: OAuthRetrieveParams = OAuthRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthRetrieveResponse> =
            retrieve(params.toBuilder().provider(provider).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            provider: OAuthProvider,
            params: OAuthRetrieveParams = OAuthRetrieveParams.none(),
        ): HttpResponseFor<OAuthRetrieveResponse> =
            retrieve(provider, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: OAuthRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: OAuthRetrieveParams): HttpResponseFor<OAuthRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            provider: OAuthProvider,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthRetrieveResponse> =
            retrieve(provider, OAuthRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/oauth/{provider}/callback`, but is otherwise
         * the same as [OAuthService.retrieveCallback].
         */
        @MustBeClosed
        fun retrieveCallback(
            provider: OAuthProvider
        ): HttpResponseFor<OAuthRetrieveCallbackResponse> =
            retrieveCallback(provider, OAuthRetrieveCallbackParams.none())

        /** @see retrieveCallback */
        @MustBeClosed
        fun retrieveCallback(
            provider: OAuthProvider,
            params: OAuthRetrieveCallbackParams = OAuthRetrieveCallbackParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthRetrieveCallbackResponse> =
            retrieveCallback(params.toBuilder().provider(provider).build(), requestOptions)

        /** @see retrieveCallback */
        @MustBeClosed
        fun retrieveCallback(
            provider: OAuthProvider,
            params: OAuthRetrieveCallbackParams = OAuthRetrieveCallbackParams.none(),
        ): HttpResponseFor<OAuthRetrieveCallbackResponse> =
            retrieveCallback(provider, params, RequestOptions.none())

        /** @see retrieveCallback */
        @MustBeClosed
        fun retrieveCallback(
            params: OAuthRetrieveCallbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthRetrieveCallbackResponse>

        /** @see retrieveCallback */
        @MustBeClosed
        fun retrieveCallback(
            params: OAuthRetrieveCallbackParams
        ): HttpResponseFor<OAuthRetrieveCallbackResponse> =
            retrieveCallback(params, RequestOptions.none())

        /** @see retrieveCallback */
        @MustBeClosed
        fun retrieveCallback(
            provider: OAuthProvider,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthRetrieveCallbackResponse> =
            retrieveCallback(provider, OAuthRetrieveCallbackParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/oauth/{provider}/current-user`, but is
         * otherwise the same as [OAuthService.retrieveCurrentUser].
         */
        @MustBeClosed
        fun retrieveCurrentUser(
            provider: OAuthProvider
        ): HttpResponseFor<OAuthRetrieveCurrentUserResponse> =
            retrieveCurrentUser(provider, OAuthRetrieveCurrentUserParams.none())

        /** @see retrieveCurrentUser */
        @MustBeClosed
        fun retrieveCurrentUser(
            provider: OAuthProvider,
            params: OAuthRetrieveCurrentUserParams = OAuthRetrieveCurrentUserParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthRetrieveCurrentUserResponse> =
            retrieveCurrentUser(params.toBuilder().provider(provider).build(), requestOptions)

        /** @see retrieveCurrentUser */
        @MustBeClosed
        fun retrieveCurrentUser(
            provider: OAuthProvider,
            params: OAuthRetrieveCurrentUserParams = OAuthRetrieveCurrentUserParams.none(),
        ): HttpResponseFor<OAuthRetrieveCurrentUserResponse> =
            retrieveCurrentUser(provider, params, RequestOptions.none())

        /** @see retrieveCurrentUser */
        @MustBeClosed
        fun retrieveCurrentUser(
            params: OAuthRetrieveCurrentUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthRetrieveCurrentUserResponse>

        /** @see retrieveCurrentUser */
        @MustBeClosed
        fun retrieveCurrentUser(
            params: OAuthRetrieveCurrentUserParams
        ): HttpResponseFor<OAuthRetrieveCurrentUserResponse> =
            retrieveCurrentUser(params, RequestOptions.none())

        /** @see retrieveCurrentUser */
        @MustBeClosed
        fun retrieveCurrentUser(
            provider: OAuthProvider,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthRetrieveCurrentUserResponse> =
            retrieveCurrentUser(provider, OAuthRetrieveCurrentUserParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/oauth/{provider}/logout`, but is otherwise
         * the same as [OAuthService.retrieveLogout].
         */
        @MustBeClosed
        fun retrieveLogout(provider: OAuthProvider): HttpResponseFor<OAuthRetrieveLogoutResponse> =
            retrieveLogout(provider, OAuthRetrieveLogoutParams.none())

        /** @see retrieveLogout */
        @MustBeClosed
        fun retrieveLogout(
            provider: OAuthProvider,
            params: OAuthRetrieveLogoutParams = OAuthRetrieveLogoutParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthRetrieveLogoutResponse> =
            retrieveLogout(params.toBuilder().provider(provider).build(), requestOptions)

        /** @see retrieveLogout */
        @MustBeClosed
        fun retrieveLogout(
            provider: OAuthProvider,
            params: OAuthRetrieveLogoutParams = OAuthRetrieveLogoutParams.none(),
        ): HttpResponseFor<OAuthRetrieveLogoutResponse> =
            retrieveLogout(provider, params, RequestOptions.none())

        /** @see retrieveLogout */
        @MustBeClosed
        fun retrieveLogout(
            params: OAuthRetrieveLogoutParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthRetrieveLogoutResponse>

        /** @see retrieveLogout */
        @MustBeClosed
        fun retrieveLogout(
            params: OAuthRetrieveLogoutParams
        ): HttpResponseFor<OAuthRetrieveLogoutResponse> =
            retrieveLogout(params, RequestOptions.none())

        /** @see retrieveLogout */
        @MustBeClosed
        fun retrieveLogout(
            provider: OAuthProvider,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthRetrieveLogoutResponse> =
            retrieveLogout(provider, OAuthRetrieveLogoutParams.none(), requestOptions)
    }
}

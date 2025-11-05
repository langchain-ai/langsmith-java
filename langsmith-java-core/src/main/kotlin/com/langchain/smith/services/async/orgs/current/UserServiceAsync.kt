// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.orgs.current

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.orgs.current.user.ProviderUserSlim
import com.langchain.smith.models.orgs.current.user.UserRetrieveLoginMethodsParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface UserServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync

    /** Get login methods for the current user. */
    fun retrieveLoginMethods(): CompletableFuture<List<ProviderUserSlim>> =
        retrieveLoginMethods(UserRetrieveLoginMethodsParams.none())

    /** @see retrieveLoginMethods */
    fun retrieveLoginMethods(
        params: UserRetrieveLoginMethodsParams = UserRetrieveLoginMethodsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<ProviderUserSlim>>

    /** @see retrieveLoginMethods */
    fun retrieveLoginMethods(
        params: UserRetrieveLoginMethodsParams = UserRetrieveLoginMethodsParams.none()
    ): CompletableFuture<List<ProviderUserSlim>> =
        retrieveLoginMethods(params, RequestOptions.none())

    /** @see retrieveLoginMethods */
    fun retrieveLoginMethods(
        requestOptions: RequestOptions
    ): CompletableFuture<List<ProviderUserSlim>> =
        retrieveLoginMethods(UserRetrieveLoginMethodsParams.none(), requestOptions)

    /** A view of [UserServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/orgs/current/user/login-methods`, but is
         * otherwise the same as [UserServiceAsync.retrieveLoginMethods].
         */
        fun retrieveLoginMethods(): CompletableFuture<HttpResponseFor<List<ProviderUserSlim>>> =
            retrieveLoginMethods(UserRetrieveLoginMethodsParams.none())

        /** @see retrieveLoginMethods */
        fun retrieveLoginMethods(
            params: UserRetrieveLoginMethodsParams = UserRetrieveLoginMethodsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<ProviderUserSlim>>>

        /** @see retrieveLoginMethods */
        fun retrieveLoginMethods(
            params: UserRetrieveLoginMethodsParams = UserRetrieveLoginMethodsParams.none()
        ): CompletableFuture<HttpResponseFor<List<ProviderUserSlim>>> =
            retrieveLoginMethods(params, RequestOptions.none())

        /** @see retrieveLoginMethods */
        fun retrieveLoginMethods(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<ProviderUserSlim>>> =
            retrieveLoginMethods(UserRetrieveLoginMethodsParams.none(), requestOptions)
    }
}

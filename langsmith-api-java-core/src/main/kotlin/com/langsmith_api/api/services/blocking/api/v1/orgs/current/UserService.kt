// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.orgs.current

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.orgs.current.user.ProviderUserSlim
import com.langsmith_api.api.models.api.v1.orgs.current.user.UserRetrieveLoginMethodsParams
import java.util.function.Consumer

interface UserService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserService

    /** Get login methods for the current user. */
    fun retrieveLoginMethods(): List<ProviderUserSlim> =
        retrieveLoginMethods(UserRetrieveLoginMethodsParams.none())

    /** @see retrieveLoginMethods */
    fun retrieveLoginMethods(
        params: UserRetrieveLoginMethodsParams = UserRetrieveLoginMethodsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ProviderUserSlim>

    /** @see retrieveLoginMethods */
    fun retrieveLoginMethods(
        params: UserRetrieveLoginMethodsParams = UserRetrieveLoginMethodsParams.none()
    ): List<ProviderUserSlim> = retrieveLoginMethods(params, RequestOptions.none())

    /** @see retrieveLoginMethods */
    fun retrieveLoginMethods(requestOptions: RequestOptions): List<ProviderUserSlim> =
        retrieveLoginMethods(UserRetrieveLoginMethodsParams.none(), requestOptions)

    /** A view of [UserService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/orgs/current/user/login-methods`, but is
         * otherwise the same as [UserService.retrieveLoginMethods].
         */
        @MustBeClosed
        fun retrieveLoginMethods(): HttpResponseFor<List<ProviderUserSlim>> =
            retrieveLoginMethods(UserRetrieveLoginMethodsParams.none())

        /** @see retrieveLoginMethods */
        @MustBeClosed
        fun retrieveLoginMethods(
            params: UserRetrieveLoginMethodsParams = UserRetrieveLoginMethodsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ProviderUserSlim>>

        /** @see retrieveLoginMethods */
        @MustBeClosed
        fun retrieveLoginMethods(
            params: UserRetrieveLoginMethodsParams = UserRetrieveLoginMethodsParams.none()
        ): HttpResponseFor<List<ProviderUserSlim>> =
            retrieveLoginMethods(params, RequestOptions.none())

        /** @see retrieveLoginMethods */
        @MustBeClosed
        fun retrieveLoginMethods(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<ProviderUserSlim>> =
            retrieveLoginMethods(UserRetrieveLoginMethodsParams.none(), requestOptions)
    }
}

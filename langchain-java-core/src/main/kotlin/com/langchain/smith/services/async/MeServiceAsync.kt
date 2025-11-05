// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.me.MeRetrieveLsUserIdParams
import com.langchain.smith.services.async.me.OnboardingStateServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeServiceAsync

    fun onboardingState(): OnboardingStateServiceAsync

    /** Get the LangSmith user ID for the current user. */
    fun retrieveLsUserId(): CompletableFuture<String> =
        retrieveLsUserId(MeRetrieveLsUserIdParams.none())

    /** @see retrieveLsUserId */
    fun retrieveLsUserId(
        params: MeRetrieveLsUserIdParams = MeRetrieveLsUserIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see retrieveLsUserId */
    fun retrieveLsUserId(
        params: MeRetrieveLsUserIdParams = MeRetrieveLsUserIdParams.none()
    ): CompletableFuture<String> = retrieveLsUserId(params, RequestOptions.none())

    /** @see retrieveLsUserId */
    fun retrieveLsUserId(requestOptions: RequestOptions): CompletableFuture<String> =
        retrieveLsUserId(MeRetrieveLsUserIdParams.none(), requestOptions)

    /** A view of [MeServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeServiceAsync.WithRawResponse

        fun onboardingState(): OnboardingStateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/me/ls_user_id`, but is otherwise the same as
         * [MeServiceAsync.retrieveLsUserId].
         */
        fun retrieveLsUserId(): CompletableFuture<HttpResponseFor<String>> =
            retrieveLsUserId(MeRetrieveLsUserIdParams.none())

        /** @see retrieveLsUserId */
        fun retrieveLsUserId(
            params: MeRetrieveLsUserIdParams = MeRetrieveLsUserIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see retrieveLsUserId */
        fun retrieveLsUserId(
            params: MeRetrieveLsUserIdParams = MeRetrieveLsUserIdParams.none()
        ): CompletableFuture<HttpResponseFor<String>> =
            retrieveLsUserId(params, RequestOptions.none())

        /** @see retrieveLsUserId */
        fun retrieveLsUserId(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<String>> =
            retrieveLsUserId(MeRetrieveLsUserIdParams.none(), requestOptions)
    }
}

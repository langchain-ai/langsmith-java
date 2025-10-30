// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.me.MeRetrieveLsUserIdParams
import com.langsmith_api.api.services.blocking.api.v1.me.OnboardingStateService
import java.util.function.Consumer

interface MeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeService

    fun onboardingState(): OnboardingStateService

    /** Get the LangSmith user ID for the current user. */
    fun retrieveLsUserId(): String = retrieveLsUserId(MeRetrieveLsUserIdParams.none())

    /** @see retrieveLsUserId */
    fun retrieveLsUserId(
        params: MeRetrieveLsUserIdParams = MeRetrieveLsUserIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see retrieveLsUserId */
    fun retrieveLsUserId(
        params: MeRetrieveLsUserIdParams = MeRetrieveLsUserIdParams.none()
    ): String = retrieveLsUserId(params, RequestOptions.none())

    /** @see retrieveLsUserId */
    fun retrieveLsUserId(requestOptions: RequestOptions): String =
        retrieveLsUserId(MeRetrieveLsUserIdParams.none(), requestOptions)

    /** A view of [MeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeService.WithRawResponse

        fun onboardingState(): OnboardingStateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/me/ls_user_id`, but is otherwise the same as
         * [MeService.retrieveLsUserId].
         */
        @MustBeClosed
        fun retrieveLsUserId(): HttpResponseFor<String> =
            retrieveLsUserId(MeRetrieveLsUserIdParams.none())

        /** @see retrieveLsUserId */
        @MustBeClosed
        fun retrieveLsUserId(
            params: MeRetrieveLsUserIdParams = MeRetrieveLsUserIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see retrieveLsUserId */
        @MustBeClosed
        fun retrieveLsUserId(
            params: MeRetrieveLsUserIdParams = MeRetrieveLsUserIdParams.none()
        ): HttpResponseFor<String> = retrieveLsUserId(params, RequestOptions.none())

        /** @see retrieveLsUserId */
        @MustBeClosed
        fun retrieveLsUserId(requestOptions: RequestOptions): HttpResponseFor<String> =
            retrieveLsUserId(MeRetrieveLsUserIdParams.none(), requestOptions)
    }
}

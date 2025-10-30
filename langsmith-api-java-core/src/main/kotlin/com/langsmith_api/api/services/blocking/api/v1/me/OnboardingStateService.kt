// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.me

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.me.onboardingstate.OnboardingStateCreateParams
import com.langsmith_api.api.models.api.v1.me.onboardingstate.OnboardingStateListParams
import com.langsmith_api.api.models.api.v1.me.onboardingstate.OnboardingStateUpdateParams
import com.langsmith_api.api.models.api.v1.me.onboardingstate.UserOnboardingStateResponse
import java.util.function.Consumer

interface OnboardingStateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnboardingStateService

    /** Initialize onboarding state for the current user. */
    fun create(): UserOnboardingStateResponse = create(OnboardingStateCreateParams.none())

    /** @see create */
    fun create(
        params: OnboardingStateCreateParams = OnboardingStateCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserOnboardingStateResponse

    /** @see create */
    fun create(
        params: OnboardingStateCreateParams = OnboardingStateCreateParams.none()
    ): UserOnboardingStateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): UserOnboardingStateResponse =
        create(OnboardingStateCreateParams.none(), requestOptions)

    /**
     * Update a specific onboarding completion field for the current user.
     *
     * Valid fields:
     * - tracing_completed_at
     * - lgstudio_completed_at
     * - playground_completed_at
     * - evaluation_completed_at
     * - success_viewed_at
     */
    fun update(field: String): UserOnboardingStateResponse =
        update(field, OnboardingStateUpdateParams.none())

    /** @see update */
    fun update(
        field: String,
        params: OnboardingStateUpdateParams = OnboardingStateUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserOnboardingStateResponse = update(params.toBuilder().field(field).build(), requestOptions)

    /** @see update */
    fun update(
        field: String,
        params: OnboardingStateUpdateParams = OnboardingStateUpdateParams.none(),
    ): UserOnboardingStateResponse = update(field, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: OnboardingStateUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserOnboardingStateResponse

    /** @see update */
    fun update(params: OnboardingStateUpdateParams): UserOnboardingStateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(field: String, requestOptions: RequestOptions): UserOnboardingStateResponse =
        update(field, OnboardingStateUpdateParams.none(), requestOptions)

    /** Get onboarding state for the current user. */
    fun list(): UserOnboardingStateResponse = list(OnboardingStateListParams.none())

    /** @see list */
    fun list(
        params: OnboardingStateListParams = OnboardingStateListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserOnboardingStateResponse

    /** @see list */
    fun list(
        params: OnboardingStateListParams = OnboardingStateListParams.none()
    ): UserOnboardingStateResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): UserOnboardingStateResponse =
        list(OnboardingStateListParams.none(), requestOptions)

    /**
     * A view of [OnboardingStateService] that provides access to raw HTTP responses for each
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
        ): OnboardingStateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/me/onboarding_state`, but is otherwise the
         * same as [OnboardingStateService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<UserOnboardingStateResponse> =
            create(OnboardingStateCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: OnboardingStateCreateParams = OnboardingStateCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserOnboardingStateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: OnboardingStateCreateParams = OnboardingStateCreateParams.none()
        ): HttpResponseFor<UserOnboardingStateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<UserOnboardingStateResponse> =
            create(OnboardingStateCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1/me/onboarding_state/{field}`, but is
         * otherwise the same as [OnboardingStateService.update].
         */
        @MustBeClosed
        fun update(field: String): HttpResponseFor<UserOnboardingStateResponse> =
            update(field, OnboardingStateUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            field: String,
            params: OnboardingStateUpdateParams = OnboardingStateUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserOnboardingStateResponse> =
            update(params.toBuilder().field(field).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            field: String,
            params: OnboardingStateUpdateParams = OnboardingStateUpdateParams.none(),
        ): HttpResponseFor<UserOnboardingStateResponse> =
            update(field, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: OnboardingStateUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserOnboardingStateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            params: OnboardingStateUpdateParams
        ): HttpResponseFor<UserOnboardingStateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            field: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserOnboardingStateResponse> =
            update(field, OnboardingStateUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/me/onboarding_state`, but is otherwise the
         * same as [OnboardingStateService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<UserOnboardingStateResponse> =
            list(OnboardingStateListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: OnboardingStateListParams = OnboardingStateListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserOnboardingStateResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: OnboardingStateListParams = OnboardingStateListParams.none()
        ): HttpResponseFor<UserOnboardingStateResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<UserOnboardingStateResponse> =
            list(OnboardingStateListParams.none(), requestOptions)
    }
}

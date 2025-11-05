// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.me

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.me.onboardingstate.OnboardingStateCreateParams
import com.langchain.smith.models.me.onboardingstate.OnboardingStateListParams
import com.langchain.smith.models.me.onboardingstate.OnboardingStateUpdateParams
import com.langchain.smith.models.me.onboardingstate.UserOnboardingStateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OnboardingStateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnboardingStateServiceAsync

    /** Initialize onboarding state for the current user. */
    fun create(): CompletableFuture<UserOnboardingStateResponse> =
        create(OnboardingStateCreateParams.none())

    /** @see create */
    fun create(
        params: OnboardingStateCreateParams = OnboardingStateCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserOnboardingStateResponse>

    /** @see create */
    fun create(
        params: OnboardingStateCreateParams = OnboardingStateCreateParams.none()
    ): CompletableFuture<UserOnboardingStateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<UserOnboardingStateResponse> =
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
    fun update(field: String): CompletableFuture<UserOnboardingStateResponse> =
        update(field, OnboardingStateUpdateParams.none())

    /** @see update */
    fun update(
        field: String,
        params: OnboardingStateUpdateParams = OnboardingStateUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserOnboardingStateResponse> =
        update(params.toBuilder().field(field).build(), requestOptions)

    /** @see update */
    fun update(
        field: String,
        params: OnboardingStateUpdateParams = OnboardingStateUpdateParams.none(),
    ): CompletableFuture<UserOnboardingStateResponse> = update(field, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: OnboardingStateUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserOnboardingStateResponse>

    /** @see update */
    fun update(
        params: OnboardingStateUpdateParams
    ): CompletableFuture<UserOnboardingStateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        field: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserOnboardingStateResponse> =
        update(field, OnboardingStateUpdateParams.none(), requestOptions)

    /** Get onboarding state for the current user. */
    fun list(): CompletableFuture<UserOnboardingStateResponse> =
        list(OnboardingStateListParams.none())

    /** @see list */
    fun list(
        params: OnboardingStateListParams = OnboardingStateListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserOnboardingStateResponse>

    /** @see list */
    fun list(
        params: OnboardingStateListParams = OnboardingStateListParams.none()
    ): CompletableFuture<UserOnboardingStateResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<UserOnboardingStateResponse> =
        list(OnboardingStateListParams.none(), requestOptions)

    /**
     * A view of [OnboardingStateServiceAsync] that provides access to raw HTTP responses for each
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
        ): OnboardingStateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/me/onboarding_state`, but is otherwise the
         * same as [OnboardingStateServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<UserOnboardingStateResponse>> =
            create(OnboardingStateCreateParams.none())

        /** @see create */
        fun create(
            params: OnboardingStateCreateParams = OnboardingStateCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserOnboardingStateResponse>>

        /** @see create */
        fun create(
            params: OnboardingStateCreateParams = OnboardingStateCreateParams.none()
        ): CompletableFuture<HttpResponseFor<UserOnboardingStateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<UserOnboardingStateResponse>> =
            create(OnboardingStateCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1/me/onboarding_state/{field}`, but is
         * otherwise the same as [OnboardingStateServiceAsync.update].
         */
        fun update(field: String): CompletableFuture<HttpResponseFor<UserOnboardingStateResponse>> =
            update(field, OnboardingStateUpdateParams.none())

        /** @see update */
        fun update(
            field: String,
            params: OnboardingStateUpdateParams = OnboardingStateUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserOnboardingStateResponse>> =
            update(params.toBuilder().field(field).build(), requestOptions)

        /** @see update */
        fun update(
            field: String,
            params: OnboardingStateUpdateParams = OnboardingStateUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<UserOnboardingStateResponse>> =
            update(field, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: OnboardingStateUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserOnboardingStateResponse>>

        /** @see update */
        fun update(
            params: OnboardingStateUpdateParams
        ): CompletableFuture<HttpResponseFor<UserOnboardingStateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            field: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserOnboardingStateResponse>> =
            update(field, OnboardingStateUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/me/onboarding_state`, but is otherwise the
         * same as [OnboardingStateServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<UserOnboardingStateResponse>> =
            list(OnboardingStateListParams.none())

        /** @see list */
        fun list(
            params: OnboardingStateListParams = OnboardingStateListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserOnboardingStateResponse>>

        /** @see list */
        fun list(
            params: OnboardingStateListParams = OnboardingStateListParams.none()
        ): CompletableFuture<HttpResponseFor<UserOnboardingStateResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<UserOnboardingStateResponse>> =
            list(OnboardingStateListParams.none(), requestOptions)
    }
}

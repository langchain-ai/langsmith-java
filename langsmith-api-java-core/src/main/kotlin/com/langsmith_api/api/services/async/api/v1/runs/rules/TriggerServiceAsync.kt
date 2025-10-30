// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.runs.rules

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.runs.rules.trigger.TriggerCreateParams
import com.langsmith_api.api.models.api.v1.runs.rules.trigger.TriggerCreateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TriggerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TriggerServiceAsync

    /** Trigger an array of run rules manually. */
    fun create(): CompletableFuture<TriggerCreateResponse> = create(TriggerCreateParams.none())

    /** @see create */
    fun create(
        params: TriggerCreateParams = TriggerCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TriggerCreateResponse>

    /** @see create */
    fun create(
        params: TriggerCreateParams = TriggerCreateParams.none()
    ): CompletableFuture<TriggerCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<TriggerCreateResponse> =
        create(TriggerCreateParams.none(), requestOptions)

    /**
     * A view of [TriggerServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TriggerServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/runs/rules/trigger`, but is otherwise the
         * same as [TriggerServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<TriggerCreateResponse>> =
            create(TriggerCreateParams.none())

        /** @see create */
        fun create(
            params: TriggerCreateParams = TriggerCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TriggerCreateResponse>>

        /** @see create */
        fun create(
            params: TriggerCreateParams = TriggerCreateParams.none()
        ): CompletableFuture<HttpResponseFor<TriggerCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TriggerCreateResponse>> =
            create(TriggerCreateParams.none(), requestOptions)
    }
}

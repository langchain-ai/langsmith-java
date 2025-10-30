// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.runs.rules

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.runs.rules.trigger.TriggerCreateParams
import com.langsmith_api.api.models.api.v1.runs.rules.trigger.TriggerCreateResponse
import java.util.function.Consumer

interface TriggerService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TriggerService

    /** Trigger an array of run rules manually. */
    fun create(): TriggerCreateResponse = create(TriggerCreateParams.none())

    /** @see create */
    fun create(
        params: TriggerCreateParams = TriggerCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TriggerCreateResponse

    /** @see create */
    fun create(params: TriggerCreateParams = TriggerCreateParams.none()): TriggerCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): TriggerCreateResponse =
        create(TriggerCreateParams.none(), requestOptions)

    /** A view of [TriggerService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TriggerService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/runs/rules/trigger`, but is otherwise the
         * same as [TriggerService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<TriggerCreateResponse> = create(TriggerCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TriggerCreateParams = TriggerCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TriggerCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: TriggerCreateParams = TriggerCreateParams.none()
        ): HttpResponseFor<TriggerCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<TriggerCreateResponse> =
            create(TriggerCreateParams.none(), requestOptions)
    }
}

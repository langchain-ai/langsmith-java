// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.datasets

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.datasets.playgroundexperiment.PlaygroundExperimentBatchParams
import com.langsmith_api.api.models.api.v1.datasets.playgroundexperiment.PlaygroundExperimentBatchResponse
import com.langsmith_api.api.models.api.v1.datasets.playgroundexperiment.PlaygroundExperimentStreamParams
import com.langsmith_api.api.models.api.v1.datasets.playgroundexperiment.PlaygroundExperimentStreamResponse
import java.util.function.Consumer

interface PlaygroundExperimentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlaygroundExperimentService

    /** Dataset Handler */
    fun batch(params: PlaygroundExperimentBatchParams): PlaygroundExperimentBatchResponse =
        batch(params, RequestOptions.none())

    /** @see batch */
    fun batch(
        params: PlaygroundExperimentBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlaygroundExperimentBatchResponse

    /** Stream Dataset Handler */
    fun stream(params: PlaygroundExperimentStreamParams): PlaygroundExperimentStreamResponse =
        stream(params, RequestOptions.none())

    /** @see stream */
    fun stream(
        params: PlaygroundExperimentStreamParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlaygroundExperimentStreamResponse

    /**
     * A view of [PlaygroundExperimentService] that provides access to raw HTTP responses for each
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
        ): PlaygroundExperimentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/datasets/playground_experiment/batch`, but
         * is otherwise the same as [PlaygroundExperimentService.batch].
         */
        @MustBeClosed
        fun batch(
            params: PlaygroundExperimentBatchParams
        ): HttpResponseFor<PlaygroundExperimentBatchResponse> = batch(params, RequestOptions.none())

        /** @see batch */
        @MustBeClosed
        fun batch(
            params: PlaygroundExperimentBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlaygroundExperimentBatchResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/datasets/playground_experiment/stream`, but
         * is otherwise the same as [PlaygroundExperimentService.stream].
         */
        @MustBeClosed
        fun stream(
            params: PlaygroundExperimentStreamParams
        ): HttpResponseFor<PlaygroundExperimentStreamResponse> =
            stream(params, RequestOptions.none())

        /** @see stream */
        @MustBeClosed
        fun stream(
            params: PlaygroundExperimentStreamParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlaygroundExperimentStreamResponse>
    }
}

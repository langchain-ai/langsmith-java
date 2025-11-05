// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.datasets

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.datasets.playgroundexperiment.PlaygroundExperimentBatchParams
import com.langchain.smith.models.datasets.playgroundexperiment.PlaygroundExperimentBatchResponse
import com.langchain.smith.models.datasets.playgroundexperiment.PlaygroundExperimentStreamParams
import com.langchain.smith.models.datasets.playgroundexperiment.PlaygroundExperimentStreamResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PlaygroundExperimentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlaygroundExperimentServiceAsync

    /** Dataset Handler */
    fun batch(
        params: PlaygroundExperimentBatchParams
    ): CompletableFuture<PlaygroundExperimentBatchResponse> = batch(params, RequestOptions.none())

    /** @see batch */
    fun batch(
        params: PlaygroundExperimentBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlaygroundExperimentBatchResponse>

    /** Stream Dataset Handler */
    fun stream(
        params: PlaygroundExperimentStreamParams
    ): CompletableFuture<PlaygroundExperimentStreamResponse> = stream(params, RequestOptions.none())

    /** @see stream */
    fun stream(
        params: PlaygroundExperimentStreamParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlaygroundExperimentStreamResponse>

    /**
     * A view of [PlaygroundExperimentServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PlaygroundExperimentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/datasets/playground_experiment/batch`, but
         * is otherwise the same as [PlaygroundExperimentServiceAsync.batch].
         */
        fun batch(
            params: PlaygroundExperimentBatchParams
        ): CompletableFuture<HttpResponseFor<PlaygroundExperimentBatchResponse>> =
            batch(params, RequestOptions.none())

        /** @see batch */
        fun batch(
            params: PlaygroundExperimentBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlaygroundExperimentBatchResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/datasets/playground_experiment/stream`, but
         * is otherwise the same as [PlaygroundExperimentServiceAsync.stream].
         */
        fun stream(
            params: PlaygroundExperimentStreamParams
        ): CompletableFuture<HttpResponseFor<PlaygroundExperimentStreamResponse>> =
            stream(params, RequestOptions.none())

        /** @see stream */
        fun stream(
            params: PlaygroundExperimentStreamParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlaygroundExperimentStreamResponse>>
    }
}

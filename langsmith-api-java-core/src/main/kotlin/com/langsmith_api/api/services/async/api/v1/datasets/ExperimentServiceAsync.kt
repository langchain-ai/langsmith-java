// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.datasets

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.datasets.experiments.ExperimentGroupedParams
import com.langsmith_api.api.models.api.v1.datasets.experiments.ExperimentGroupedResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ExperimentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExperimentServiceAsync

    /** Stream grouped and aggregated experiments. */
    fun grouped(
        datasetId: String,
        params: ExperimentGroupedParams,
    ): CompletableFuture<ExperimentGroupedResponse> =
        grouped(datasetId, params, RequestOptions.none())

    /** @see grouped */
    fun grouped(
        datasetId: String,
        params: ExperimentGroupedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExperimentGroupedResponse> =
        grouped(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see grouped */
    fun grouped(params: ExperimentGroupedParams): CompletableFuture<ExperimentGroupedResponse> =
        grouped(params, RequestOptions.none())

    /** @see grouped */
    fun grouped(
        params: ExperimentGroupedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExperimentGroupedResponse>

    /**
     * A view of [ExperimentServiceAsync] that provides access to raw HTTP responses for each
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
        ): ExperimentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/datasets/{dataset_id}/experiments/grouped`,
         * but is otherwise the same as [ExperimentServiceAsync.grouped].
         */
        fun grouped(
            datasetId: String,
            params: ExperimentGroupedParams,
        ): CompletableFuture<HttpResponseFor<ExperimentGroupedResponse>> =
            grouped(datasetId, params, RequestOptions.none())

        /** @see grouped */
        fun grouped(
            datasetId: String,
            params: ExperimentGroupedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExperimentGroupedResponse>> =
            grouped(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see grouped */
        fun grouped(
            params: ExperimentGroupedParams
        ): CompletableFuture<HttpResponseFor<ExperimentGroupedResponse>> =
            grouped(params, RequestOptions.none())

        /** @see grouped */
        fun grouped(
            params: ExperimentGroupedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExperimentGroupedResponse>>
    }
}

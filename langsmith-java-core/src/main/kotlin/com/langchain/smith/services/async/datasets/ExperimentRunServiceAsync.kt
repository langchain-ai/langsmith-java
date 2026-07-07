// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.datasets

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.datasets.experimentruns.ExperimentRunQueryPageAsync
import com.langchain.smith.models.datasets.experimentruns.ExperimentRunQueryParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ExperimentRunServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExperimentRunServiceAsync

    /**
     * Returns a paginated page of dataset examples with runs from the requested experiments.
     * Response uses the canonical `{items, next_cursor}` envelope.
     */
    fun query(datasetId: String): CompletableFuture<ExperimentRunQueryPageAsync> =
        query(datasetId, ExperimentRunQueryParams.none())

    /** @see query */
    fun query(
        datasetId: String,
        params: ExperimentRunQueryParams = ExperimentRunQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExperimentRunQueryPageAsync> =
        query(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see query */
    fun query(
        datasetId: String,
        params: ExperimentRunQueryParams = ExperimentRunQueryParams.none(),
    ): CompletableFuture<ExperimentRunQueryPageAsync> =
        query(datasetId, params, RequestOptions.none())

    /** @see query */
    fun query(
        params: ExperimentRunQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExperimentRunQueryPageAsync>

    /** @see query */
    fun query(params: ExperimentRunQueryParams): CompletableFuture<ExperimentRunQueryPageAsync> =
        query(params, RequestOptions.none())

    /** @see query */
    fun query(
        datasetId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExperimentRunQueryPageAsync> =
        query(datasetId, ExperimentRunQueryParams.none(), requestOptions)

    /**
     * A view of [ExperimentRunServiceAsync] that provides access to raw HTTP responses for each
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
        ): ExperimentRunServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/datasets/{dataset_id}/experiment-runs`, but is
         * otherwise the same as [ExperimentRunServiceAsync.query].
         */
        fun query(
            datasetId: String
        ): CompletableFuture<HttpResponseFor<ExperimentRunQueryPageAsync>> =
            query(datasetId, ExperimentRunQueryParams.none())

        /** @see query */
        fun query(
            datasetId: String,
            params: ExperimentRunQueryParams = ExperimentRunQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExperimentRunQueryPageAsync>> =
            query(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see query */
        fun query(
            datasetId: String,
            params: ExperimentRunQueryParams = ExperimentRunQueryParams.none(),
        ): CompletableFuture<HttpResponseFor<ExperimentRunQueryPageAsync>> =
            query(datasetId, params, RequestOptions.none())

        /** @see query */
        fun query(
            params: ExperimentRunQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExperimentRunQueryPageAsync>>

        /** @see query */
        fun query(
            params: ExperimentRunQueryParams
        ): CompletableFuture<HttpResponseFor<ExperimentRunQueryPageAsync>> =
            query(params, RequestOptions.none())

        /** @see query */
        fun query(
            datasetId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExperimentRunQueryPageAsync>> =
            query(datasetId, ExperimentRunQueryParams.none(), requestOptions)
    }
}

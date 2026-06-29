// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.datasets

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.datasets.experimentruns.ExperimentRunCreatePageAsync
import com.langchain.smith.models.datasets.experimentruns.ExperimentRunCreateParams
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
    fun create(datasetId: String): CompletableFuture<ExperimentRunCreatePageAsync> =
        create(datasetId, ExperimentRunCreateParams.none())

    /** @see create */
    fun create(
        datasetId: String,
        params: ExperimentRunCreateParams = ExperimentRunCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExperimentRunCreatePageAsync> =
        create(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see create */
    fun create(
        datasetId: String,
        params: ExperimentRunCreateParams = ExperimentRunCreateParams.none(),
    ): CompletableFuture<ExperimentRunCreatePageAsync> =
        create(datasetId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ExperimentRunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExperimentRunCreatePageAsync>

    /** @see create */
    fun create(params: ExperimentRunCreateParams): CompletableFuture<ExperimentRunCreatePageAsync> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        datasetId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExperimentRunCreatePageAsync> =
        create(datasetId, ExperimentRunCreateParams.none(), requestOptions)

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
         * otherwise the same as [ExperimentRunServiceAsync.create].
         */
        fun create(
            datasetId: String
        ): CompletableFuture<HttpResponseFor<ExperimentRunCreatePageAsync>> =
            create(datasetId, ExperimentRunCreateParams.none())

        /** @see create */
        fun create(
            datasetId: String,
            params: ExperimentRunCreateParams = ExperimentRunCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExperimentRunCreatePageAsync>> =
            create(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see create */
        fun create(
            datasetId: String,
            params: ExperimentRunCreateParams = ExperimentRunCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<ExperimentRunCreatePageAsync>> =
            create(datasetId, params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ExperimentRunCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExperimentRunCreatePageAsync>>

        /** @see create */
        fun create(
            params: ExperimentRunCreateParams
        ): CompletableFuture<HttpResponseFor<ExperimentRunCreatePageAsync>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            datasetId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExperimentRunCreatePageAsync>> =
            create(datasetId, ExperimentRunCreateParams.none(), requestOptions)
    }
}

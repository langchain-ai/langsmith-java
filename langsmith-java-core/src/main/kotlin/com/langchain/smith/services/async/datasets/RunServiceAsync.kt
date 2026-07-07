// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.datasets

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.datasets.runs.ExampleWithRunsCh
import com.langchain.smith.models.datasets.runs.RunQueryParams
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RunServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync

    /**
     * Fetch examples for a dataset, and fetch the runs for each example if they are associated with
     * the given session_ids.
     */
    fun query(
        datasetId: String,
        params: RunQueryParams,
    ): CompletableFuture<Optional<List<ExampleWithRunsCh>>> =
        query(datasetId, params, RequestOptions.none())

    /** @see query */
    fun query(
        datasetId: String,
        params: RunQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Optional<List<ExampleWithRunsCh>>> =
        query(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see query */
    fun query(params: RunQueryParams): CompletableFuture<Optional<List<ExampleWithRunsCh>>> =
        query(params, RequestOptions.none())

    /** @see query */
    fun query(
        params: RunQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Optional<List<ExampleWithRunsCh>>>

    /** A view of [RunServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/datasets/{dataset_id}/runs`, but is
         * otherwise the same as [RunServiceAsync.query].
         */
        fun query(
            datasetId: String,
            params: RunQueryParams,
        ): CompletableFuture<HttpResponseFor<Optional<List<ExampleWithRunsCh>>>> =
            query(datasetId, params, RequestOptions.none())

        /** @see query */
        fun query(
            datasetId: String,
            params: RunQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Optional<List<ExampleWithRunsCh>>>> =
            query(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see query */
        fun query(
            params: RunQueryParams
        ): CompletableFuture<HttpResponseFor<Optional<List<ExampleWithRunsCh>>>> =
            query(params, RequestOptions.none())

        /** @see query */
        fun query(
            params: RunQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Optional<List<ExampleWithRunsCh>>>>
    }
}

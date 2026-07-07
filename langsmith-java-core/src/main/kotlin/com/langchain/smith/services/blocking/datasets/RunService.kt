// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.datasets

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.datasets.runs.ExampleWithRunsCh
import com.langchain.smith.models.datasets.runs.RunQueryParams
import java.util.Optional
import java.util.function.Consumer

interface RunService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService

    /**
     * Fetch examples for a dataset, and fetch the runs for each example if they are associated with
     * the given session_ids.
     */
    fun query(datasetId: String, params: RunQueryParams): Optional<List<ExampleWithRunsCh>> =
        query(datasetId, params, RequestOptions.none())

    /** @see query */
    fun query(
        datasetId: String,
        params: RunQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Optional<List<ExampleWithRunsCh>> =
        query(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see query */
    fun query(params: RunQueryParams): Optional<List<ExampleWithRunsCh>> =
        query(params, RequestOptions.none())

    /** @see query */
    fun query(
        params: RunQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Optional<List<ExampleWithRunsCh>>

    /** A view of [RunService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/datasets/{dataset_id}/runs`, but is
         * otherwise the same as [RunService.query].
         */
        @MustBeClosed
        fun query(
            datasetId: String,
            params: RunQueryParams,
        ): HttpResponseFor<Optional<List<ExampleWithRunsCh>>> =
            query(datasetId, params, RequestOptions.none())

        /** @see query */
        @MustBeClosed
        fun query(
            datasetId: String,
            params: RunQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Optional<List<ExampleWithRunsCh>>> =
            query(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see query */
        @MustBeClosed
        fun query(params: RunQueryParams): HttpResponseFor<Optional<List<ExampleWithRunsCh>>> =
            query(params, RequestOptions.none())

        /** @see query */
        @MustBeClosed
        fun query(
            params: RunQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Optional<List<ExampleWithRunsCh>>>
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.datasets

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.datasets.group.GroupRunsParams
import com.langchain.smith.models.datasets.group.GroupRunsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GroupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupServiceAsync

    /**
     * Fetch examples for a dataset, and fetch the runs for each example if they are associated with
     * the given session_ids.
     */
    fun runs(datasetId: String, params: GroupRunsParams): CompletableFuture<GroupRunsResponse> =
        runs(datasetId, params, RequestOptions.none())

    /** @see runs */
    fun runs(
        datasetId: String,
        params: GroupRunsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GroupRunsResponse> =
        runs(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see runs */
    fun runs(params: GroupRunsParams): CompletableFuture<GroupRunsResponse> =
        runs(params, RequestOptions.none())

    /** @see runs */
    fun runs(
        params: GroupRunsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GroupRunsResponse>

    /** A view of [GroupServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GroupServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/datasets/{dataset_id}/group/runs`, but is
         * otherwise the same as [GroupServiceAsync.runs].
         */
        fun runs(
            datasetId: String,
            params: GroupRunsParams,
        ): CompletableFuture<HttpResponseFor<GroupRunsResponse>> =
            runs(datasetId, params, RequestOptions.none())

        /** @see runs */
        fun runs(
            datasetId: String,
            params: GroupRunsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GroupRunsResponse>> =
            runs(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see runs */
        fun runs(params: GroupRunsParams): CompletableFuture<HttpResponseFor<GroupRunsResponse>> =
            runs(params, RequestOptions.none())

        /** @see runs */
        fun runs(
            params: GroupRunsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GroupRunsResponse>>
    }
}

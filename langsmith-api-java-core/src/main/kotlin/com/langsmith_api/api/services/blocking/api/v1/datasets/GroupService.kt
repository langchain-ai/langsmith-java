// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.datasets

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.datasets.group.GroupRunsParams
import com.langsmith_api.api.models.api.v1.datasets.group.GroupRunsResponse
import java.util.function.Consumer

interface GroupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupService

    /**
     * Fetch examples for a dataset, and fetch the runs for each example if they are associated with
     * the given session_ids.
     */
    fun runs(datasetId: String, params: GroupRunsParams): GroupRunsResponse =
        runs(datasetId, params, RequestOptions.none())

    /** @see runs */
    fun runs(
        datasetId: String,
        params: GroupRunsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GroupRunsResponse = runs(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see runs */
    fun runs(params: GroupRunsParams): GroupRunsResponse = runs(params, RequestOptions.none())

    /** @see runs */
    fun runs(
        params: GroupRunsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GroupRunsResponse

    /** A view of [GroupService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/datasets/{dataset_id}/group/runs`, but is
         * otherwise the same as [GroupService.runs].
         */
        @MustBeClosed
        fun runs(datasetId: String, params: GroupRunsParams): HttpResponseFor<GroupRunsResponse> =
            runs(datasetId, params, RequestOptions.none())

        /** @see runs */
        @MustBeClosed
        fun runs(
            datasetId: String,
            params: GroupRunsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GroupRunsResponse> =
            runs(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see runs */
        @MustBeClosed
        fun runs(params: GroupRunsParams): HttpResponseFor<GroupRunsResponse> =
            runs(params, RequestOptions.none())

        /** @see runs */
        @MustBeClosed
        fun runs(
            params: GroupRunsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GroupRunsResponse>
    }
}

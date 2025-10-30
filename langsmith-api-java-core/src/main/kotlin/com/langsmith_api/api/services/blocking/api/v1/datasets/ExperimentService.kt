// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.datasets

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.datasets.experiments.ExperimentGroupedParams
import com.langsmith_api.api.models.api.v1.datasets.experiments.ExperimentGroupedResponse
import java.util.function.Consumer

interface ExperimentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExperimentService

    /** Stream grouped and aggregated experiments. */
    fun grouped(datasetId: String, params: ExperimentGroupedParams): ExperimentGroupedResponse =
        grouped(datasetId, params, RequestOptions.none())

    /** @see grouped */
    fun grouped(
        datasetId: String,
        params: ExperimentGroupedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExperimentGroupedResponse =
        grouped(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see grouped */
    fun grouped(params: ExperimentGroupedParams): ExperimentGroupedResponse =
        grouped(params, RequestOptions.none())

    /** @see grouped */
    fun grouped(
        params: ExperimentGroupedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExperimentGroupedResponse

    /** A view of [ExperimentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExperimentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/datasets/{dataset_id}/experiments/grouped`,
         * but is otherwise the same as [ExperimentService.grouped].
         */
        @MustBeClosed
        fun grouped(
            datasetId: String,
            params: ExperimentGroupedParams,
        ): HttpResponseFor<ExperimentGroupedResponse> =
            grouped(datasetId, params, RequestOptions.none())

        /** @see grouped */
        @MustBeClosed
        fun grouped(
            datasetId: String,
            params: ExperimentGroupedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExperimentGroupedResponse> =
            grouped(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see grouped */
        @MustBeClosed
        fun grouped(params: ExperimentGroupedParams): HttpResponseFor<ExperimentGroupedResponse> =
            grouped(params, RequestOptions.none())

        /** @see grouped */
        @MustBeClosed
        fun grouped(
            params: ExperimentGroupedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExperimentGroupedResponse>
    }
}

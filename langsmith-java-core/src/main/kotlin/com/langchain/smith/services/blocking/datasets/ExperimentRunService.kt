// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.datasets

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.datasets.experimentruns.ExperimentRunQueryPage
import com.langchain.smith.models.datasets.experimentruns.ExperimentRunQueryParams
import java.util.function.Consumer

interface ExperimentRunService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExperimentRunService

    /**
     * Returns a paginated page of dataset examples with runs from the requested experiments.
     * Response uses the canonical `{items, next_cursor}` envelope.
     */
    fun query(datasetId: String): ExperimentRunQueryPage =
        query(datasetId, ExperimentRunQueryParams.none())

    /** @see query */
    fun query(
        datasetId: String,
        params: ExperimentRunQueryParams = ExperimentRunQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExperimentRunQueryPage =
        query(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see query */
    fun query(
        datasetId: String,
        params: ExperimentRunQueryParams = ExperimentRunQueryParams.none(),
    ): ExperimentRunQueryPage = query(datasetId, params, RequestOptions.none())

    /** @see query */
    fun query(
        params: ExperimentRunQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExperimentRunQueryPage

    /** @see query */
    fun query(params: ExperimentRunQueryParams): ExperimentRunQueryPage =
        query(params, RequestOptions.none())

    /** @see query */
    fun query(datasetId: String, requestOptions: RequestOptions): ExperimentRunQueryPage =
        query(datasetId, ExperimentRunQueryParams.none(), requestOptions)

    /**
     * A view of [ExperimentRunService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExperimentRunService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/datasets/{dataset_id}/experiment-runs`, but is
         * otherwise the same as [ExperimentRunService.query].
         */
        @MustBeClosed
        fun query(datasetId: String): HttpResponseFor<ExperimentRunQueryPage> =
            query(datasetId, ExperimentRunQueryParams.none())

        /** @see query */
        @MustBeClosed
        fun query(
            datasetId: String,
            params: ExperimentRunQueryParams = ExperimentRunQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExperimentRunQueryPage> =
            query(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see query */
        @MustBeClosed
        fun query(
            datasetId: String,
            params: ExperimentRunQueryParams = ExperimentRunQueryParams.none(),
        ): HttpResponseFor<ExperimentRunQueryPage> = query(datasetId, params, RequestOptions.none())

        /** @see query */
        @MustBeClosed
        fun query(
            params: ExperimentRunQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExperimentRunQueryPage>

        /** @see query */
        @MustBeClosed
        fun query(params: ExperimentRunQueryParams): HttpResponseFor<ExperimentRunQueryPage> =
            query(params, RequestOptions.none())

        /** @see query */
        @MustBeClosed
        fun query(
            datasetId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExperimentRunQueryPage> =
            query(datasetId, ExperimentRunQueryParams.none(), requestOptions)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.datasets

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.datasets.experimentruns.ExperimentRunCreatePage
import com.langchain.smith.models.datasets.experimentruns.ExperimentRunCreateParams
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
    fun create(datasetId: String): ExperimentRunCreatePage =
        create(datasetId, ExperimentRunCreateParams.none())

    /** @see create */
    fun create(
        datasetId: String,
        params: ExperimentRunCreateParams = ExperimentRunCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExperimentRunCreatePage =
        create(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see create */
    fun create(
        datasetId: String,
        params: ExperimentRunCreateParams = ExperimentRunCreateParams.none(),
    ): ExperimentRunCreatePage = create(datasetId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ExperimentRunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExperimentRunCreatePage

    /** @see create */
    fun create(params: ExperimentRunCreateParams): ExperimentRunCreatePage =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(datasetId: String, requestOptions: RequestOptions): ExperimentRunCreatePage =
        create(datasetId, ExperimentRunCreateParams.none(), requestOptions)

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
         * otherwise the same as [ExperimentRunService.create].
         */
        @MustBeClosed
        fun create(datasetId: String): HttpResponseFor<ExperimentRunCreatePage> =
            create(datasetId, ExperimentRunCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            datasetId: String,
            params: ExperimentRunCreateParams = ExperimentRunCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExperimentRunCreatePage> =
            create(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            datasetId: String,
            params: ExperimentRunCreateParams = ExperimentRunCreateParams.none(),
        ): HttpResponseFor<ExperimentRunCreatePage> =
            create(datasetId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ExperimentRunCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExperimentRunCreatePage>

        /** @see create */
        @MustBeClosed
        fun create(params: ExperimentRunCreateParams): HttpResponseFor<ExperimentRunCreatePage> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            datasetId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExperimentRunCreatePage> =
            create(datasetId, ExperimentRunCreateParams.none(), requestOptions)
    }
}

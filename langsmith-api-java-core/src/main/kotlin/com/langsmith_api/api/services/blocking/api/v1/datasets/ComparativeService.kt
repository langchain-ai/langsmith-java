// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.datasets

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.datasets.comparative.ComparativeCreateParams
import com.langsmith_api.api.models.api.v1.datasets.comparative.ComparativeCreateResponse
import com.langsmith_api.api.models.api.v1.datasets.comparative.ComparativeDeleteParams
import com.langsmith_api.api.models.api.v1.datasets.comparative.ComparativeDeleteResponse
import com.langsmith_api.api.models.api.v1.datasets.comparative.ComparativeListParams
import com.langsmith_api.api.models.api.v1.datasets.comparative.ComparativeListResponse
import java.util.function.Consumer

interface ComparativeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ComparativeService

    /** Create a comparative experiment. */
    fun create(params: ComparativeCreateParams): ComparativeCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ComparativeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ComparativeCreateResponse

    /** Get all comparative experiments for a given dataset. */
    fun list(datasetId: String): List<ComparativeListResponse> =
        list(datasetId, ComparativeListParams.none())

    /** @see list */
    fun list(
        datasetId: String,
        params: ComparativeListParams = ComparativeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ComparativeListResponse> =
        list(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see list */
    fun list(
        datasetId: String,
        params: ComparativeListParams = ComparativeListParams.none(),
    ): List<ComparativeListResponse> = list(datasetId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ComparativeListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ComparativeListResponse>

    /** @see list */
    fun list(params: ComparativeListParams): List<ComparativeListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(datasetId: String, requestOptions: RequestOptions): List<ComparativeListResponse> =
        list(datasetId, ComparativeListParams.none(), requestOptions)

    /** Delete a specific comparative experiment. */
    fun delete(comparativeExperimentId: String): ComparativeDeleteResponse =
        delete(comparativeExperimentId, ComparativeDeleteParams.none())

    /** @see delete */
    fun delete(
        comparativeExperimentId: String,
        params: ComparativeDeleteParams = ComparativeDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ComparativeDeleteResponse =
        delete(
            params.toBuilder().comparativeExperimentId(comparativeExperimentId).build(),
            requestOptions,
        )

    /** @see delete */
    fun delete(
        comparativeExperimentId: String,
        params: ComparativeDeleteParams = ComparativeDeleteParams.none(),
    ): ComparativeDeleteResponse = delete(comparativeExperimentId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ComparativeDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ComparativeDeleteResponse

    /** @see delete */
    fun delete(params: ComparativeDeleteParams): ComparativeDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        comparativeExperimentId: String,
        requestOptions: RequestOptions,
    ): ComparativeDeleteResponse =
        delete(comparativeExperimentId, ComparativeDeleteParams.none(), requestOptions)

    /**
     * A view of [ComparativeService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ComparativeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/datasets/comparative`, but is otherwise the
         * same as [ComparativeService.create].
         */
        @MustBeClosed
        fun create(params: ComparativeCreateParams): HttpResponseFor<ComparativeCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ComparativeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ComparativeCreateResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/datasets/{dataset_id}/comparative`, but is
         * otherwise the same as [ComparativeService.list].
         */
        @MustBeClosed
        fun list(datasetId: String): HttpResponseFor<List<ComparativeListResponse>> =
            list(datasetId, ComparativeListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            datasetId: String,
            params: ComparativeListParams = ComparativeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ComparativeListResponse>> =
            list(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            datasetId: String,
            params: ComparativeListParams = ComparativeListParams.none(),
        ): HttpResponseFor<List<ComparativeListResponse>> =
            list(datasetId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ComparativeListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ComparativeListResponse>>

        /** @see list */
        @MustBeClosed
        fun list(params: ComparativeListParams): HttpResponseFor<List<ComparativeListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            datasetId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ComparativeListResponse>> =
            list(datasetId, ComparativeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/datasets/comparative/{comparative_experiment_id}`, but is otherwise the same as
         * [ComparativeService.delete].
         */
        @MustBeClosed
        fun delete(comparativeExperimentId: String): HttpResponseFor<ComparativeDeleteResponse> =
            delete(comparativeExperimentId, ComparativeDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            comparativeExperimentId: String,
            params: ComparativeDeleteParams = ComparativeDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ComparativeDeleteResponse> =
            delete(
                params.toBuilder().comparativeExperimentId(comparativeExperimentId).build(),
                requestOptions,
            )

        /** @see delete */
        @MustBeClosed
        fun delete(
            comparativeExperimentId: String,
            params: ComparativeDeleteParams = ComparativeDeleteParams.none(),
        ): HttpResponseFor<ComparativeDeleteResponse> =
            delete(comparativeExperimentId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ComparativeDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ComparativeDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: ComparativeDeleteParams): HttpResponseFor<ComparativeDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            comparativeExperimentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ComparativeDeleteResponse> =
            delete(comparativeExperimentId, ComparativeDeleteParams.none(), requestOptions)
    }
}

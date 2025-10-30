// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.datasets

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.datasets.comparative.ComparativeCreateParams
import com.langsmith_api.api.models.api.v1.datasets.comparative.ComparativeCreateResponse
import com.langsmith_api.api.models.api.v1.datasets.comparative.ComparativeDeleteParams
import com.langsmith_api.api.models.api.v1.datasets.comparative.ComparativeDeleteResponse
import com.langsmith_api.api.models.api.v1.datasets.comparative.ComparativeListParams
import com.langsmith_api.api.models.api.v1.datasets.comparative.ComparativeListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ComparativeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ComparativeServiceAsync

    /** Create a comparative experiment. */
    fun create(params: ComparativeCreateParams): CompletableFuture<ComparativeCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ComparativeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ComparativeCreateResponse>

    /** Get all comparative experiments for a given dataset. */
    fun list(datasetId: String): CompletableFuture<List<ComparativeListResponse>> =
        list(datasetId, ComparativeListParams.none())

    /** @see list */
    fun list(
        datasetId: String,
        params: ComparativeListParams = ComparativeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<ComparativeListResponse>> =
        list(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see list */
    fun list(
        datasetId: String,
        params: ComparativeListParams = ComparativeListParams.none(),
    ): CompletableFuture<List<ComparativeListResponse>> =
        list(datasetId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ComparativeListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<ComparativeListResponse>>

    /** @see list */
    fun list(params: ComparativeListParams): CompletableFuture<List<ComparativeListResponse>> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        datasetId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<ComparativeListResponse>> =
        list(datasetId, ComparativeListParams.none(), requestOptions)

    /** Delete a specific comparative experiment. */
    fun delete(comparativeExperimentId: String): CompletableFuture<ComparativeDeleteResponse> =
        delete(comparativeExperimentId, ComparativeDeleteParams.none())

    /** @see delete */
    fun delete(
        comparativeExperimentId: String,
        params: ComparativeDeleteParams = ComparativeDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ComparativeDeleteResponse> =
        delete(
            params.toBuilder().comparativeExperimentId(comparativeExperimentId).build(),
            requestOptions,
        )

    /** @see delete */
    fun delete(
        comparativeExperimentId: String,
        params: ComparativeDeleteParams = ComparativeDeleteParams.none(),
    ): CompletableFuture<ComparativeDeleteResponse> =
        delete(comparativeExperimentId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ComparativeDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ComparativeDeleteResponse>

    /** @see delete */
    fun delete(params: ComparativeDeleteParams): CompletableFuture<ComparativeDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        comparativeExperimentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ComparativeDeleteResponse> =
        delete(comparativeExperimentId, ComparativeDeleteParams.none(), requestOptions)

    /**
     * A view of [ComparativeServiceAsync] that provides access to raw HTTP responses for each
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
        ): ComparativeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/datasets/comparative`, but is otherwise the
         * same as [ComparativeServiceAsync.create].
         */
        fun create(
            params: ComparativeCreateParams
        ): CompletableFuture<HttpResponseFor<ComparativeCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ComparativeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ComparativeCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/datasets/{dataset_id}/comparative`, but is
         * otherwise the same as [ComparativeServiceAsync.list].
         */
        fun list(
            datasetId: String
        ): CompletableFuture<HttpResponseFor<List<ComparativeListResponse>>> =
            list(datasetId, ComparativeListParams.none())

        /** @see list */
        fun list(
            datasetId: String,
            params: ComparativeListParams = ComparativeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<ComparativeListResponse>>> =
            list(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see list */
        fun list(
            datasetId: String,
            params: ComparativeListParams = ComparativeListParams.none(),
        ): CompletableFuture<HttpResponseFor<List<ComparativeListResponse>>> =
            list(datasetId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ComparativeListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<ComparativeListResponse>>>

        /** @see list */
        fun list(
            params: ComparativeListParams
        ): CompletableFuture<HttpResponseFor<List<ComparativeListResponse>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            datasetId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<ComparativeListResponse>>> =
            list(datasetId, ComparativeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/datasets/comparative/{comparative_experiment_id}`, but is otherwise the same as
         * [ComparativeServiceAsync.delete].
         */
        fun delete(
            comparativeExperimentId: String
        ): CompletableFuture<HttpResponseFor<ComparativeDeleteResponse>> =
            delete(comparativeExperimentId, ComparativeDeleteParams.none())

        /** @see delete */
        fun delete(
            comparativeExperimentId: String,
            params: ComparativeDeleteParams = ComparativeDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ComparativeDeleteResponse>> =
            delete(
                params.toBuilder().comparativeExperimentId(comparativeExperimentId).build(),
                requestOptions,
            )

        /** @see delete */
        fun delete(
            comparativeExperimentId: String,
            params: ComparativeDeleteParams = ComparativeDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<ComparativeDeleteResponse>> =
            delete(comparativeExperimentId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ComparativeDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ComparativeDeleteResponse>>

        /** @see delete */
        fun delete(
            params: ComparativeDeleteParams
        ): CompletableFuture<HttpResponseFor<ComparativeDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            comparativeExperimentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ComparativeDeleteResponse>> =
            delete(comparativeExperimentId, ComparativeDeleteParams.none(), requestOptions)
    }
}

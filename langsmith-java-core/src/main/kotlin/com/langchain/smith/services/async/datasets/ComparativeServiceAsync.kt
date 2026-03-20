// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.datasets

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.datasets.comparative.ComparativeCreateParams
import com.langchain.smith.models.datasets.comparative.ComparativeCreateResponse
import com.langchain.smith.models.datasets.comparative.ComparativeDeleteParams
import com.langchain.smith.models.datasets.comparative.ComparativeDeleteResponse
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

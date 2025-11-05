// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.datasets

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.datasets.splits.SplitCreateParams
import com.langchain.smith.models.datasets.splits.SplitListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SplitServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SplitServiceAsync

    /** Update Dataset Splits */
    fun create(datasetId: String, params: SplitCreateParams): CompletableFuture<List<String>> =
        create(datasetId, params, RequestOptions.none())

    /** @see create */
    fun create(
        datasetId: String,
        params: SplitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<String>> =
        create(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see create */
    fun create(params: SplitCreateParams): CompletableFuture<List<String>> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SplitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<String>>

    /** Get Dataset Splits */
    fun list(datasetId: String): CompletableFuture<List<String>> =
        list(datasetId, SplitListParams.none())

    /** @see list */
    fun list(
        datasetId: String,
        params: SplitListParams = SplitListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<String>> =
        list(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see list */
    fun list(
        datasetId: String,
        params: SplitListParams = SplitListParams.none(),
    ): CompletableFuture<List<String>> = list(datasetId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SplitListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<String>>

    /** @see list */
    fun list(params: SplitListParams): CompletableFuture<List<String>> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(datasetId: String, requestOptions: RequestOptions): CompletableFuture<List<String>> =
        list(datasetId, SplitListParams.none(), requestOptions)

    /** A view of [SplitServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SplitServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /api/v1/datasets/{dataset_id}/splits`, but is
         * otherwise the same as [SplitServiceAsync.create].
         */
        fun create(
            datasetId: String,
            params: SplitCreateParams,
        ): CompletableFuture<HttpResponseFor<List<String>>> =
            create(datasetId, params, RequestOptions.none())

        /** @see create */
        fun create(
            datasetId: String,
            params: SplitCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<String>>> =
            create(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see create */
        fun create(params: SplitCreateParams): CompletableFuture<HttpResponseFor<List<String>>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SplitCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<String>>>

        /**
         * Returns a raw HTTP response for `get /api/v1/datasets/{dataset_id}/splits`, but is
         * otherwise the same as [SplitServiceAsync.list].
         */
        fun list(datasetId: String): CompletableFuture<HttpResponseFor<List<String>>> =
            list(datasetId, SplitListParams.none())

        /** @see list */
        fun list(
            datasetId: String,
            params: SplitListParams = SplitListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<String>>> =
            list(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see list */
        fun list(
            datasetId: String,
            params: SplitListParams = SplitListParams.none(),
        ): CompletableFuture<HttpResponseFor<List<String>>> =
            list(datasetId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: SplitListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<String>>>

        /** @see list */
        fun list(params: SplitListParams): CompletableFuture<HttpResponseFor<List<String>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            datasetId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<String>>> =
            list(datasetId, SplitListParams.none(), requestOptions)
    }
}

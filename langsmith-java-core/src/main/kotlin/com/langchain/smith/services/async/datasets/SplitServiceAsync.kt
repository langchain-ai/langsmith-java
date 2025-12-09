// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.datasets

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.datasets.splits.SplitCreateParams
import com.langchain.smith.models.datasets.splits.SplitRetrieveParams
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
    fun retrieve(datasetId: String): CompletableFuture<List<String>> =
        retrieve(datasetId, SplitRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        datasetId: String,
        params: SplitRetrieveParams = SplitRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<String>> =
        retrieve(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        datasetId: String,
        params: SplitRetrieveParams = SplitRetrieveParams.none(),
    ): CompletableFuture<List<String>> = retrieve(datasetId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SplitRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<String>>

    /** @see retrieve */
    fun retrieve(params: SplitRetrieveParams): CompletableFuture<List<String>> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        datasetId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<String>> =
        retrieve(datasetId, SplitRetrieveParams.none(), requestOptions)

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
         * otherwise the same as [SplitServiceAsync.retrieve].
         */
        fun retrieve(datasetId: String): CompletableFuture<HttpResponseFor<List<String>>> =
            retrieve(datasetId, SplitRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            datasetId: String,
            params: SplitRetrieveParams = SplitRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<String>>> =
            retrieve(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            datasetId: String,
            params: SplitRetrieveParams = SplitRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<List<String>>> =
            retrieve(datasetId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: SplitRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<String>>>

        /** @see retrieve */
        fun retrieve(
            params: SplitRetrieveParams
        ): CompletableFuture<HttpResponseFor<List<String>>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            datasetId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<String>>> =
            retrieve(datasetId, SplitRetrieveParams.none(), requestOptions)
    }
}

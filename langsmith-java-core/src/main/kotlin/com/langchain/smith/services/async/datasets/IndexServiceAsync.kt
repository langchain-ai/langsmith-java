// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.datasets

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.datasets.index.IndexCreateParams
import com.langchain.smith.models.datasets.index.IndexCreateResponse
import com.langchain.smith.models.datasets.index.IndexSyncParams
import com.langchain.smith.models.datasets.index.IndexSyncResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface IndexServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IndexServiceAsync

    /** Index a dataset. */
    fun create(datasetId: String): CompletableFuture<IndexCreateResponse> =
        create(datasetId, IndexCreateParams.none())

    /** @see create */
    fun create(
        datasetId: String,
        params: IndexCreateParams = IndexCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IndexCreateResponse> =
        create(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see create */
    fun create(
        datasetId: String,
        params: IndexCreateParams = IndexCreateParams.none(),
    ): CompletableFuture<IndexCreateResponse> = create(datasetId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: IndexCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IndexCreateResponse>

    /** @see create */
    fun create(params: IndexCreateParams): CompletableFuture<IndexCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        datasetId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<IndexCreateResponse> =
        create(datasetId, IndexCreateParams.none(), requestOptions)

    /** Sync an index for a dataset. */
    fun sync(datasetId: String): CompletableFuture<IndexSyncResponse> =
        sync(datasetId, IndexSyncParams.none())

    /** @see sync */
    fun sync(
        datasetId: String,
        params: IndexSyncParams = IndexSyncParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IndexSyncResponse> =
        sync(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see sync */
    fun sync(
        datasetId: String,
        params: IndexSyncParams = IndexSyncParams.none(),
    ): CompletableFuture<IndexSyncResponse> = sync(datasetId, params, RequestOptions.none())

    /** @see sync */
    fun sync(
        params: IndexSyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IndexSyncResponse>

    /** @see sync */
    fun sync(params: IndexSyncParams): CompletableFuture<IndexSyncResponse> =
        sync(params, RequestOptions.none())

    /** @see sync */
    fun sync(
        datasetId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<IndexSyncResponse> =
        sync(datasetId, IndexSyncParams.none(), requestOptions)

    /** A view of [IndexServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IndexServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/datasets/{dataset_id}/index`, but is
         * otherwise the same as [IndexServiceAsync.create].
         */
        fun create(datasetId: String): CompletableFuture<HttpResponseFor<IndexCreateResponse>> =
            create(datasetId, IndexCreateParams.none())

        /** @see create */
        fun create(
            datasetId: String,
            params: IndexCreateParams = IndexCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IndexCreateResponse>> =
            create(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see create */
        fun create(
            datasetId: String,
            params: IndexCreateParams = IndexCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<IndexCreateResponse>> =
            create(datasetId, params, RequestOptions.none())

        /** @see create */
        fun create(
            params: IndexCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IndexCreateResponse>>

        /** @see create */
        fun create(
            params: IndexCreateParams
        ): CompletableFuture<HttpResponseFor<IndexCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            datasetId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IndexCreateResponse>> =
            create(datasetId, IndexCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/datasets/{dataset_id}/index/sync`, but is
         * otherwise the same as [IndexServiceAsync.sync].
         */
        fun sync(datasetId: String): CompletableFuture<HttpResponseFor<IndexSyncResponse>> =
            sync(datasetId, IndexSyncParams.none())

        /** @see sync */
        fun sync(
            datasetId: String,
            params: IndexSyncParams = IndexSyncParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IndexSyncResponse>> =
            sync(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see sync */
        fun sync(
            datasetId: String,
            params: IndexSyncParams = IndexSyncParams.none(),
        ): CompletableFuture<HttpResponseFor<IndexSyncResponse>> =
            sync(datasetId, params, RequestOptions.none())

        /** @see sync */
        fun sync(
            params: IndexSyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IndexSyncResponse>>

        /** @see sync */
        fun sync(params: IndexSyncParams): CompletableFuture<HttpResponseFor<IndexSyncResponse>> =
            sync(params, RequestOptions.none())

        /** @see sync */
        fun sync(
            datasetId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IndexSyncResponse>> =
            sync(datasetId, IndexSyncParams.none(), requestOptions)
    }
}

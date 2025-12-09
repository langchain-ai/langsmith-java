// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.datasets

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.datasets.index.IndexCreateParams
import com.langchain.smith.models.datasets.index.IndexCreateResponse
import com.langchain.smith.models.datasets.index.IndexDeleteAllParams
import com.langchain.smith.models.datasets.index.IndexDeleteAllResponse
import com.langchain.smith.models.datasets.index.IndexRetrieveParams
import com.langchain.smith.models.datasets.index.IndexRetrieveResponse
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

    /** Get index info. */
    fun retrieve(datasetId: String): CompletableFuture<IndexRetrieveResponse> =
        retrieve(datasetId, IndexRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        datasetId: String,
        params: IndexRetrieveParams = IndexRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IndexRetrieveResponse> =
        retrieve(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        datasetId: String,
        params: IndexRetrieveParams = IndexRetrieveParams.none(),
    ): CompletableFuture<IndexRetrieveResponse> = retrieve(datasetId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: IndexRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IndexRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: IndexRetrieveParams): CompletableFuture<IndexRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        datasetId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<IndexRetrieveResponse> =
        retrieve(datasetId, IndexRetrieveParams.none(), requestOptions)

    /** Remove an index for a dataset. */
    fun deleteAll(datasetId: String): CompletableFuture<IndexDeleteAllResponse> =
        deleteAll(datasetId, IndexDeleteAllParams.none())

    /** @see deleteAll */
    fun deleteAll(
        datasetId: String,
        params: IndexDeleteAllParams = IndexDeleteAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IndexDeleteAllResponse> =
        deleteAll(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see deleteAll */
    fun deleteAll(
        datasetId: String,
        params: IndexDeleteAllParams = IndexDeleteAllParams.none(),
    ): CompletableFuture<IndexDeleteAllResponse> =
        deleteAll(datasetId, params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        params: IndexDeleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IndexDeleteAllResponse>

    /** @see deleteAll */
    fun deleteAll(params: IndexDeleteAllParams): CompletableFuture<IndexDeleteAllResponse> =
        deleteAll(params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        datasetId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<IndexDeleteAllResponse> =
        deleteAll(datasetId, IndexDeleteAllParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get /api/v1/datasets/{dataset_id}/index`, but is
         * otherwise the same as [IndexServiceAsync.retrieve].
         */
        fun retrieve(datasetId: String): CompletableFuture<HttpResponseFor<IndexRetrieveResponse>> =
            retrieve(datasetId, IndexRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            datasetId: String,
            params: IndexRetrieveParams = IndexRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IndexRetrieveResponse>> =
            retrieve(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            datasetId: String,
            params: IndexRetrieveParams = IndexRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<IndexRetrieveResponse>> =
            retrieve(datasetId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: IndexRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IndexRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: IndexRetrieveParams
        ): CompletableFuture<HttpResponseFor<IndexRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            datasetId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IndexRetrieveResponse>> =
            retrieve(datasetId, IndexRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/datasets/{dataset_id}/index`, but is
         * otherwise the same as [IndexServiceAsync.deleteAll].
         */
        fun deleteAll(
            datasetId: String
        ): CompletableFuture<HttpResponseFor<IndexDeleteAllResponse>> =
            deleteAll(datasetId, IndexDeleteAllParams.none())

        /** @see deleteAll */
        fun deleteAll(
            datasetId: String,
            params: IndexDeleteAllParams = IndexDeleteAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IndexDeleteAllResponse>> =
            deleteAll(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see deleteAll */
        fun deleteAll(
            datasetId: String,
            params: IndexDeleteAllParams = IndexDeleteAllParams.none(),
        ): CompletableFuture<HttpResponseFor<IndexDeleteAllResponse>> =
            deleteAll(datasetId, params, RequestOptions.none())

        /** @see deleteAll */
        fun deleteAll(
            params: IndexDeleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IndexDeleteAllResponse>>

        /** @see deleteAll */
        fun deleteAll(
            params: IndexDeleteAllParams
        ): CompletableFuture<HttpResponseFor<IndexDeleteAllResponse>> =
            deleteAll(params, RequestOptions.none())

        /** @see deleteAll */
        fun deleteAll(
            datasetId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IndexDeleteAllResponse>> =
            deleteAll(datasetId, IndexDeleteAllParams.none(), requestOptions)

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

// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.datasets

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.datasets.index.IndexCreateParams
import com.langsmith_api.api.models.api.v1.datasets.index.IndexCreateResponse
import com.langsmith_api.api.models.api.v1.datasets.index.IndexDeleteAllParams
import com.langsmith_api.api.models.api.v1.datasets.index.IndexDeleteAllResponse
import com.langsmith_api.api.models.api.v1.datasets.index.IndexListParams
import com.langsmith_api.api.models.api.v1.datasets.index.IndexListResponse
import com.langsmith_api.api.models.api.v1.datasets.index.IndexSyncParams
import com.langsmith_api.api.models.api.v1.datasets.index.IndexSyncResponse
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
    fun list(datasetId: String): CompletableFuture<IndexListResponse> =
        list(datasetId, IndexListParams.none())

    /** @see list */
    fun list(
        datasetId: String,
        params: IndexListParams = IndexListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IndexListResponse> =
        list(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see list */
    fun list(
        datasetId: String,
        params: IndexListParams = IndexListParams.none(),
    ): CompletableFuture<IndexListResponse> = list(datasetId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: IndexListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IndexListResponse>

    /** @see list */
    fun list(params: IndexListParams): CompletableFuture<IndexListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        datasetId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<IndexListResponse> =
        list(datasetId, IndexListParams.none(), requestOptions)

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
         * otherwise the same as [IndexServiceAsync.list].
         */
        fun list(datasetId: String): CompletableFuture<HttpResponseFor<IndexListResponse>> =
            list(datasetId, IndexListParams.none())

        /** @see list */
        fun list(
            datasetId: String,
            params: IndexListParams = IndexListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IndexListResponse>> =
            list(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see list */
        fun list(
            datasetId: String,
            params: IndexListParams = IndexListParams.none(),
        ): CompletableFuture<HttpResponseFor<IndexListResponse>> =
            list(datasetId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: IndexListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IndexListResponse>>

        /** @see list */
        fun list(params: IndexListParams): CompletableFuture<HttpResponseFor<IndexListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            datasetId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IndexListResponse>> =
            list(datasetId, IndexListParams.none(), requestOptions)

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

// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.datasets

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface IndexService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IndexService

    /** Index a dataset. */
    fun create(datasetId: String): IndexCreateResponse = create(datasetId, IndexCreateParams.none())

    /** @see create */
    fun create(
        datasetId: String,
        params: IndexCreateParams = IndexCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IndexCreateResponse = create(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see create */
    fun create(
        datasetId: String,
        params: IndexCreateParams = IndexCreateParams.none(),
    ): IndexCreateResponse = create(datasetId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: IndexCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IndexCreateResponse

    /** @see create */
    fun create(params: IndexCreateParams): IndexCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(datasetId: String, requestOptions: RequestOptions): IndexCreateResponse =
        create(datasetId, IndexCreateParams.none(), requestOptions)

    /** Get index info. */
    fun retrieve(datasetId: String): IndexRetrieveResponse =
        retrieve(datasetId, IndexRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        datasetId: String,
        params: IndexRetrieveParams = IndexRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IndexRetrieveResponse =
        retrieve(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        datasetId: String,
        params: IndexRetrieveParams = IndexRetrieveParams.none(),
    ): IndexRetrieveResponse = retrieve(datasetId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: IndexRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IndexRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: IndexRetrieveParams): IndexRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(datasetId: String, requestOptions: RequestOptions): IndexRetrieveResponse =
        retrieve(datasetId, IndexRetrieveParams.none(), requestOptions)

    /** Remove an index for a dataset. */
    fun deleteAll(datasetId: String): IndexDeleteAllResponse =
        deleteAll(datasetId, IndexDeleteAllParams.none())

    /** @see deleteAll */
    fun deleteAll(
        datasetId: String,
        params: IndexDeleteAllParams = IndexDeleteAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IndexDeleteAllResponse =
        deleteAll(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see deleteAll */
    fun deleteAll(
        datasetId: String,
        params: IndexDeleteAllParams = IndexDeleteAllParams.none(),
    ): IndexDeleteAllResponse = deleteAll(datasetId, params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        params: IndexDeleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IndexDeleteAllResponse

    /** @see deleteAll */
    fun deleteAll(params: IndexDeleteAllParams): IndexDeleteAllResponse =
        deleteAll(params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(datasetId: String, requestOptions: RequestOptions): IndexDeleteAllResponse =
        deleteAll(datasetId, IndexDeleteAllParams.none(), requestOptions)

    /** Sync an index for a dataset. */
    fun sync(datasetId: String): IndexSyncResponse = sync(datasetId, IndexSyncParams.none())

    /** @see sync */
    fun sync(
        datasetId: String,
        params: IndexSyncParams = IndexSyncParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IndexSyncResponse = sync(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see sync */
    fun sync(
        datasetId: String,
        params: IndexSyncParams = IndexSyncParams.none(),
    ): IndexSyncResponse = sync(datasetId, params, RequestOptions.none())

    /** @see sync */
    fun sync(
        params: IndexSyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IndexSyncResponse

    /** @see sync */
    fun sync(params: IndexSyncParams): IndexSyncResponse = sync(params, RequestOptions.none())

    /** @see sync */
    fun sync(datasetId: String, requestOptions: RequestOptions): IndexSyncResponse =
        sync(datasetId, IndexSyncParams.none(), requestOptions)

    /** A view of [IndexService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): IndexService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/datasets/{dataset_id}/index`, but is
         * otherwise the same as [IndexService.create].
         */
        @MustBeClosed
        fun create(datasetId: String): HttpResponseFor<IndexCreateResponse> =
            create(datasetId, IndexCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            datasetId: String,
            params: IndexCreateParams = IndexCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IndexCreateResponse> =
            create(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            datasetId: String,
            params: IndexCreateParams = IndexCreateParams.none(),
        ): HttpResponseFor<IndexCreateResponse> = create(datasetId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: IndexCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IndexCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(params: IndexCreateParams): HttpResponseFor<IndexCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            datasetId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IndexCreateResponse> =
            create(datasetId, IndexCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/datasets/{dataset_id}/index`, but is
         * otherwise the same as [IndexService.retrieve].
         */
        @MustBeClosed
        fun retrieve(datasetId: String): HttpResponseFor<IndexRetrieveResponse> =
            retrieve(datasetId, IndexRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            datasetId: String,
            params: IndexRetrieveParams = IndexRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IndexRetrieveResponse> =
            retrieve(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            datasetId: String,
            params: IndexRetrieveParams = IndexRetrieveParams.none(),
        ): HttpResponseFor<IndexRetrieveResponse> =
            retrieve(datasetId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: IndexRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IndexRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: IndexRetrieveParams): HttpResponseFor<IndexRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            datasetId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IndexRetrieveResponse> =
            retrieve(datasetId, IndexRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/datasets/{dataset_id}/index`, but is
         * otherwise the same as [IndexService.deleteAll].
         */
        @MustBeClosed
        fun deleteAll(datasetId: String): HttpResponseFor<IndexDeleteAllResponse> =
            deleteAll(datasetId, IndexDeleteAllParams.none())

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            datasetId: String,
            params: IndexDeleteAllParams = IndexDeleteAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IndexDeleteAllResponse> =
            deleteAll(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            datasetId: String,
            params: IndexDeleteAllParams = IndexDeleteAllParams.none(),
        ): HttpResponseFor<IndexDeleteAllResponse> =
            deleteAll(datasetId, params, RequestOptions.none())

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            params: IndexDeleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IndexDeleteAllResponse>

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(params: IndexDeleteAllParams): HttpResponseFor<IndexDeleteAllResponse> =
            deleteAll(params, RequestOptions.none())

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            datasetId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IndexDeleteAllResponse> =
            deleteAll(datasetId, IndexDeleteAllParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/datasets/{dataset_id}/index/sync`, but is
         * otherwise the same as [IndexService.sync].
         */
        @MustBeClosed
        fun sync(datasetId: String): HttpResponseFor<IndexSyncResponse> =
            sync(datasetId, IndexSyncParams.none())

        /** @see sync */
        @MustBeClosed
        fun sync(
            datasetId: String,
            params: IndexSyncParams = IndexSyncParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IndexSyncResponse> =
            sync(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see sync */
        @MustBeClosed
        fun sync(
            datasetId: String,
            params: IndexSyncParams = IndexSyncParams.none(),
        ): HttpResponseFor<IndexSyncResponse> = sync(datasetId, params, RequestOptions.none())

        /** @see sync */
        @MustBeClosed
        fun sync(
            params: IndexSyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IndexSyncResponse>

        /** @see sync */
        @MustBeClosed
        fun sync(params: IndexSyncParams): HttpResponseFor<IndexSyncResponse> =
            sync(params, RequestOptions.none())

        /** @see sync */
        @MustBeClosed
        fun sync(
            datasetId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IndexSyncResponse> =
            sync(datasetId, IndexSyncParams.none(), requestOptions)
    }
}

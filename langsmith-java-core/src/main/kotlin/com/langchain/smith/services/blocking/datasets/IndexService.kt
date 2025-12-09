// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.datasets

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.datasets.index.IndexCreateParams
import com.langchain.smith.models.datasets.index.IndexCreateResponse
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

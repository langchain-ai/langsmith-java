// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.datasets

import com.google.errorprone.annotations.MustBeClosed
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
    fun list(datasetId: String): IndexListResponse = list(datasetId, IndexListParams.none())

    /** @see list */
    fun list(
        datasetId: String,
        params: IndexListParams = IndexListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IndexListResponse = list(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see list */
    fun list(
        datasetId: String,
        params: IndexListParams = IndexListParams.none(),
    ): IndexListResponse = list(datasetId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: IndexListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IndexListResponse

    /** @see list */
    fun list(params: IndexListParams): IndexListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(datasetId: String, requestOptions: RequestOptions): IndexListResponse =
        list(datasetId, IndexListParams.none(), requestOptions)

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
         * otherwise the same as [IndexService.list].
         */
        @MustBeClosed
        fun list(datasetId: String): HttpResponseFor<IndexListResponse> =
            list(datasetId, IndexListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            datasetId: String,
            params: IndexListParams = IndexListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IndexListResponse> =
            list(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            datasetId: String,
            params: IndexListParams = IndexListParams.none(),
        ): HttpResponseFor<IndexListResponse> = list(datasetId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: IndexListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IndexListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: IndexListParams): HttpResponseFor<IndexListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            datasetId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IndexListResponse> =
            list(datasetId, IndexListParams.none(), requestOptions)

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

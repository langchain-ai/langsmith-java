// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.datasets

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.datasets.share.DatasetShareSchema
import com.langchain.smith.models.datasets.share.ShareCreateParams
import com.langchain.smith.models.datasets.share.ShareDeleteAllParams
import com.langchain.smith.models.datasets.share.ShareDeleteAllResponse
import com.langchain.smith.models.datasets.share.ShareListParams
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ShareServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ShareServiceAsync

    /** Share a dataset. */
    fun create(datasetId: String): CompletableFuture<DatasetShareSchema> =
        create(datasetId, ShareCreateParams.none())

    /** @see create */
    fun create(
        datasetId: String,
        params: ShareCreateParams = ShareCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatasetShareSchema> =
        create(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see create */
    fun create(
        datasetId: String,
        params: ShareCreateParams = ShareCreateParams.none(),
    ): CompletableFuture<DatasetShareSchema> = create(datasetId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ShareCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatasetShareSchema>

    /** @see create */
    fun create(params: ShareCreateParams): CompletableFuture<DatasetShareSchema> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        datasetId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DatasetShareSchema> =
        create(datasetId, ShareCreateParams.none(), requestOptions)

    /** Get the state of sharing a dataset */
    fun list(datasetId: String): CompletableFuture<Optional<DatasetShareSchema>> =
        list(datasetId, ShareListParams.none())

    /** @see list */
    fun list(
        datasetId: String,
        params: ShareListParams = ShareListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Optional<DatasetShareSchema>> =
        list(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see list */
    fun list(
        datasetId: String,
        params: ShareListParams = ShareListParams.none(),
    ): CompletableFuture<Optional<DatasetShareSchema>> =
        list(datasetId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ShareListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Optional<DatasetShareSchema>>

    /** @see list */
    fun list(params: ShareListParams): CompletableFuture<Optional<DatasetShareSchema>> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        datasetId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Optional<DatasetShareSchema>> =
        list(datasetId, ShareListParams.none(), requestOptions)

    /** Unshare a dataset. */
    fun deleteAll(datasetId: String): CompletableFuture<ShareDeleteAllResponse> =
        deleteAll(datasetId, ShareDeleteAllParams.none())

    /** @see deleteAll */
    fun deleteAll(
        datasetId: String,
        params: ShareDeleteAllParams = ShareDeleteAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ShareDeleteAllResponse> =
        deleteAll(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see deleteAll */
    fun deleteAll(
        datasetId: String,
        params: ShareDeleteAllParams = ShareDeleteAllParams.none(),
    ): CompletableFuture<ShareDeleteAllResponse> =
        deleteAll(datasetId, params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        params: ShareDeleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ShareDeleteAllResponse>

    /** @see deleteAll */
    fun deleteAll(params: ShareDeleteAllParams): CompletableFuture<ShareDeleteAllResponse> =
        deleteAll(params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        datasetId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ShareDeleteAllResponse> =
        deleteAll(datasetId, ShareDeleteAllParams.none(), requestOptions)

    /** A view of [ShareServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ShareServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /api/v1/datasets/{dataset_id}/share`, but is
         * otherwise the same as [ShareServiceAsync.create].
         */
        fun create(datasetId: String): CompletableFuture<HttpResponseFor<DatasetShareSchema>> =
            create(datasetId, ShareCreateParams.none())

        /** @see create */
        fun create(
            datasetId: String,
            params: ShareCreateParams = ShareCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatasetShareSchema>> =
            create(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see create */
        fun create(
            datasetId: String,
            params: ShareCreateParams = ShareCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<DatasetShareSchema>> =
            create(datasetId, params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ShareCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatasetShareSchema>>

        /** @see create */
        fun create(
            params: ShareCreateParams
        ): CompletableFuture<HttpResponseFor<DatasetShareSchema>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            datasetId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DatasetShareSchema>> =
            create(datasetId, ShareCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/datasets/{dataset_id}/share`, but is
         * otherwise the same as [ShareServiceAsync.list].
         */
        fun list(
            datasetId: String
        ): CompletableFuture<HttpResponseFor<Optional<DatasetShareSchema>>> =
            list(datasetId, ShareListParams.none())

        /** @see list */
        fun list(
            datasetId: String,
            params: ShareListParams = ShareListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Optional<DatasetShareSchema>>> =
            list(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see list */
        fun list(
            datasetId: String,
            params: ShareListParams = ShareListParams.none(),
        ): CompletableFuture<HttpResponseFor<Optional<DatasetShareSchema>>> =
            list(datasetId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ShareListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Optional<DatasetShareSchema>>>

        /** @see list */
        fun list(
            params: ShareListParams
        ): CompletableFuture<HttpResponseFor<Optional<DatasetShareSchema>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            datasetId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Optional<DatasetShareSchema>>> =
            list(datasetId, ShareListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/datasets/{dataset_id}/share`, but is
         * otherwise the same as [ShareServiceAsync.deleteAll].
         */
        fun deleteAll(
            datasetId: String
        ): CompletableFuture<HttpResponseFor<ShareDeleteAllResponse>> =
            deleteAll(datasetId, ShareDeleteAllParams.none())

        /** @see deleteAll */
        fun deleteAll(
            datasetId: String,
            params: ShareDeleteAllParams = ShareDeleteAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ShareDeleteAllResponse>> =
            deleteAll(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see deleteAll */
        fun deleteAll(
            datasetId: String,
            params: ShareDeleteAllParams = ShareDeleteAllParams.none(),
        ): CompletableFuture<HttpResponseFor<ShareDeleteAllResponse>> =
            deleteAll(datasetId, params, RequestOptions.none())

        /** @see deleteAll */
        fun deleteAll(
            params: ShareDeleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ShareDeleteAllResponse>>

        /** @see deleteAll */
        fun deleteAll(
            params: ShareDeleteAllParams
        ): CompletableFuture<HttpResponseFor<ShareDeleteAllResponse>> =
            deleteAll(params, RequestOptions.none())

        /** @see deleteAll */
        fun deleteAll(
            datasetId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ShareDeleteAllResponse>> =
            deleteAll(datasetId, ShareDeleteAllParams.none(), requestOptions)
    }
}

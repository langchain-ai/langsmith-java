// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.datasets

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.datasets.share.DatasetShareSchema
import com.langchain.smith.models.datasets.share.ShareCreateParams
import com.langchain.smith.models.datasets.share.ShareDeleteAllParams
import com.langchain.smith.models.datasets.share.ShareDeleteAllResponse
import com.langchain.smith.models.datasets.share.ShareRetrieveParams
import java.util.Optional
import java.util.function.Consumer

interface ShareService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ShareService

    /** Share a dataset. */
    fun create(datasetId: String): DatasetShareSchema = create(datasetId, ShareCreateParams.none())

    /** @see create */
    fun create(
        datasetId: String,
        params: ShareCreateParams = ShareCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetShareSchema = create(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see create */
    fun create(
        datasetId: String,
        params: ShareCreateParams = ShareCreateParams.none(),
    ): DatasetShareSchema = create(datasetId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ShareCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetShareSchema

    /** @see create */
    fun create(params: ShareCreateParams): DatasetShareSchema =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(datasetId: String, requestOptions: RequestOptions): DatasetShareSchema =
        create(datasetId, ShareCreateParams.none(), requestOptions)

    /** Get the state of sharing a dataset */
    fun retrieve(datasetId: String): Optional<DatasetShareSchema> =
        retrieve(datasetId, ShareRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        datasetId: String,
        params: ShareRetrieveParams = ShareRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Optional<DatasetShareSchema> =
        retrieve(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        datasetId: String,
        params: ShareRetrieveParams = ShareRetrieveParams.none(),
    ): Optional<DatasetShareSchema> = retrieve(datasetId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ShareRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Optional<DatasetShareSchema>

    /** @see retrieve */
    fun retrieve(params: ShareRetrieveParams): Optional<DatasetShareSchema> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(datasetId: String, requestOptions: RequestOptions): Optional<DatasetShareSchema> =
        retrieve(datasetId, ShareRetrieveParams.none(), requestOptions)

    /** Unshare a dataset. */
    fun deleteAll(datasetId: String): ShareDeleteAllResponse =
        deleteAll(datasetId, ShareDeleteAllParams.none())

    /** @see deleteAll */
    fun deleteAll(
        datasetId: String,
        params: ShareDeleteAllParams = ShareDeleteAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShareDeleteAllResponse =
        deleteAll(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see deleteAll */
    fun deleteAll(
        datasetId: String,
        params: ShareDeleteAllParams = ShareDeleteAllParams.none(),
    ): ShareDeleteAllResponse = deleteAll(datasetId, params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        params: ShareDeleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShareDeleteAllResponse

    /** @see deleteAll */
    fun deleteAll(params: ShareDeleteAllParams): ShareDeleteAllResponse =
        deleteAll(params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(datasetId: String, requestOptions: RequestOptions): ShareDeleteAllResponse =
        deleteAll(datasetId, ShareDeleteAllParams.none(), requestOptions)

    /** A view of [ShareService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ShareService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /api/v1/datasets/{dataset_id}/share`, but is
         * otherwise the same as [ShareService.create].
         */
        @MustBeClosed
        fun create(datasetId: String): HttpResponseFor<DatasetShareSchema> =
            create(datasetId, ShareCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            datasetId: String,
            params: ShareCreateParams = ShareCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetShareSchema> =
            create(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            datasetId: String,
            params: ShareCreateParams = ShareCreateParams.none(),
        ): HttpResponseFor<DatasetShareSchema> = create(datasetId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ShareCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetShareSchema>

        /** @see create */
        @MustBeClosed
        fun create(params: ShareCreateParams): HttpResponseFor<DatasetShareSchema> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            datasetId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetShareSchema> =
            create(datasetId, ShareCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/datasets/{dataset_id}/share`, but is
         * otherwise the same as [ShareService.retrieve].
         */
        @MustBeClosed
        fun retrieve(datasetId: String): HttpResponseFor<Optional<DatasetShareSchema>> =
            retrieve(datasetId, ShareRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            datasetId: String,
            params: ShareRetrieveParams = ShareRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Optional<DatasetShareSchema>> =
            retrieve(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            datasetId: String,
            params: ShareRetrieveParams = ShareRetrieveParams.none(),
        ): HttpResponseFor<Optional<DatasetShareSchema>> =
            retrieve(datasetId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ShareRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Optional<DatasetShareSchema>>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ShareRetrieveParams): HttpResponseFor<Optional<DatasetShareSchema>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            datasetId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Optional<DatasetShareSchema>> =
            retrieve(datasetId, ShareRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/datasets/{dataset_id}/share`, but is
         * otherwise the same as [ShareService.deleteAll].
         */
        @MustBeClosed
        fun deleteAll(datasetId: String): HttpResponseFor<ShareDeleteAllResponse> =
            deleteAll(datasetId, ShareDeleteAllParams.none())

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            datasetId: String,
            params: ShareDeleteAllParams = ShareDeleteAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShareDeleteAllResponse> =
            deleteAll(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            datasetId: String,
            params: ShareDeleteAllParams = ShareDeleteAllParams.none(),
        ): HttpResponseFor<ShareDeleteAllResponse> =
            deleteAll(datasetId, params, RequestOptions.none())

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            params: ShareDeleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShareDeleteAllResponse>

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(params: ShareDeleteAllParams): HttpResponseFor<ShareDeleteAllResponse> =
            deleteAll(params, RequestOptions.none())

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            datasetId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ShareDeleteAllResponse> =
            deleteAll(datasetId, ShareDeleteAllParams.none(), requestOptions)
    }
}

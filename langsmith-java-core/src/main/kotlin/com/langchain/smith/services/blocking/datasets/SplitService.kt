// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.datasets

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.datasets.splits.SplitCreateParams
import com.langchain.smith.models.datasets.splits.SplitListParams
import java.util.function.Consumer

interface SplitService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SplitService

    /** Update Dataset Splits */
    fun create(datasetId: String, params: SplitCreateParams): List<String> =
        create(datasetId, params, RequestOptions.none())

    /** @see create */
    fun create(
        datasetId: String,
        params: SplitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<String> = create(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see create */
    fun create(params: SplitCreateParams): List<String> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SplitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<String>

    /** Get Dataset Splits */
    fun list(datasetId: String): List<String> = list(datasetId, SplitListParams.none())

    /** @see list */
    fun list(
        datasetId: String,
        params: SplitListParams = SplitListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<String> = list(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see list */
    fun list(datasetId: String, params: SplitListParams = SplitListParams.none()): List<String> =
        list(datasetId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SplitListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<String>

    /** @see list */
    fun list(params: SplitListParams): List<String> = list(params, RequestOptions.none())

    /** @see list */
    fun list(datasetId: String, requestOptions: RequestOptions): List<String> =
        list(datasetId, SplitListParams.none(), requestOptions)

    /** A view of [SplitService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SplitService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /api/v1/datasets/{dataset_id}/splits`, but is
         * otherwise the same as [SplitService.create].
         */
        @MustBeClosed
        fun create(datasetId: String, params: SplitCreateParams): HttpResponseFor<List<String>> =
            create(datasetId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            datasetId: String,
            params: SplitCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<String>> =
            create(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: SplitCreateParams): HttpResponseFor<List<String>> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SplitCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<String>>

        /**
         * Returns a raw HTTP response for `get /api/v1/datasets/{dataset_id}/splits`, but is
         * otherwise the same as [SplitService.list].
         */
        @MustBeClosed
        fun list(datasetId: String): HttpResponseFor<List<String>> =
            list(datasetId, SplitListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            datasetId: String,
            params: SplitListParams = SplitListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<String>> =
            list(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            datasetId: String,
            params: SplitListParams = SplitListParams.none(),
        ): HttpResponseFor<List<String>> = list(datasetId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SplitListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<String>>

        /** @see list */
        @MustBeClosed
        fun list(params: SplitListParams): HttpResponseFor<List<String>> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(datasetId: String, requestOptions: RequestOptions): HttpResponseFor<List<String>> =
            list(datasetId, SplitListParams.none(), requestOptions)
    }
}

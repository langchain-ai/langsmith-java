// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.datasets

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.datasets.versions.VersionListPage
import com.langchain.smith.models.datasets.versions.VersionListParams
import com.langchain.smith.models.datasets.versions.VersionRetrieveDiffParams
import com.langchain.smith.models.datasets.versions.VersionRetrieveDiffResponse
import java.util.function.Consumer

interface VersionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VersionService

    /** Get dataset versions. */
    fun list(datasetId: String): VersionListPage = list(datasetId, VersionListParams.none())

    /** @see list */
    fun list(
        datasetId: String,
        params: VersionListParams = VersionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VersionListPage = list(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see list */
    fun list(
        datasetId: String,
        params: VersionListParams = VersionListParams.none(),
    ): VersionListPage = list(datasetId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: VersionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VersionListPage

    /** @see list */
    fun list(params: VersionListParams): VersionListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(datasetId: String, requestOptions: RequestOptions): VersionListPage =
        list(datasetId, VersionListParams.none(), requestOptions)

    /** Get diff between two dataset versions. */
    fun retrieveDiff(
        datasetId: String,
        params: VersionRetrieveDiffParams,
    ): VersionRetrieveDiffResponse = retrieveDiff(datasetId, params, RequestOptions.none())

    /** @see retrieveDiff */
    fun retrieveDiff(
        datasetId: String,
        params: VersionRetrieveDiffParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VersionRetrieveDiffResponse =
        retrieveDiff(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see retrieveDiff */
    fun retrieveDiff(params: VersionRetrieveDiffParams): VersionRetrieveDiffResponse =
        retrieveDiff(params, RequestOptions.none())

    /** @see retrieveDiff */
    fun retrieveDiff(
        params: VersionRetrieveDiffParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VersionRetrieveDiffResponse

    /** A view of [VersionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): VersionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/datasets/{dataset_id}/versions`, but is
         * otherwise the same as [VersionService.list].
         */
        @MustBeClosed
        fun list(datasetId: String): HttpResponseFor<VersionListPage> =
            list(datasetId, VersionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            datasetId: String,
            params: VersionListParams = VersionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VersionListPage> =
            list(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            datasetId: String,
            params: VersionListParams = VersionListParams.none(),
        ): HttpResponseFor<VersionListPage> = list(datasetId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: VersionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VersionListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: VersionListParams): HttpResponseFor<VersionListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            datasetId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VersionListPage> =
            list(datasetId, VersionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/datasets/{dataset_id}/versions/diff`, but is
         * otherwise the same as [VersionService.retrieveDiff].
         */
        @MustBeClosed
        fun retrieveDiff(
            datasetId: String,
            params: VersionRetrieveDiffParams,
        ): HttpResponseFor<VersionRetrieveDiffResponse> =
            retrieveDiff(datasetId, params, RequestOptions.none())

        /** @see retrieveDiff */
        @MustBeClosed
        fun retrieveDiff(
            datasetId: String,
            params: VersionRetrieveDiffParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VersionRetrieveDiffResponse> =
            retrieveDiff(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see retrieveDiff */
        @MustBeClosed
        fun retrieveDiff(
            params: VersionRetrieveDiffParams
        ): HttpResponseFor<VersionRetrieveDiffResponse> =
            retrieveDiff(params, RequestOptions.none())

        /** @see retrieveDiff */
        @MustBeClosed
        fun retrieveDiff(
            params: VersionRetrieveDiffParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VersionRetrieveDiffResponse>
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.datasets

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.datasets.versions.VersionListPageAsync
import com.langchain.smith.models.datasets.versions.VersionListParams
import com.langchain.smith.models.datasets.versions.VersionRetrieveDiffParams
import com.langchain.smith.models.datasets.versions.VersionRetrieveDiffResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface VersionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VersionServiceAsync

    /** Get dataset versions. */
    fun list(datasetId: String): CompletableFuture<VersionListPageAsync> =
        list(datasetId, VersionListParams.none())

    /** @see list */
    fun list(
        datasetId: String,
        params: VersionListParams = VersionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VersionListPageAsync> =
        list(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see list */
    fun list(
        datasetId: String,
        params: VersionListParams = VersionListParams.none(),
    ): CompletableFuture<VersionListPageAsync> = list(datasetId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: VersionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VersionListPageAsync>

    /** @see list */
    fun list(params: VersionListParams): CompletableFuture<VersionListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        datasetId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<VersionListPageAsync> =
        list(datasetId, VersionListParams.none(), requestOptions)

    /** Get diff between two dataset versions. */
    fun retrieveDiff(
        datasetId: String,
        params: VersionRetrieveDiffParams,
    ): CompletableFuture<VersionRetrieveDiffResponse> =
        retrieveDiff(datasetId, params, RequestOptions.none())

    /** @see retrieveDiff */
    fun retrieveDiff(
        datasetId: String,
        params: VersionRetrieveDiffParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VersionRetrieveDiffResponse> =
        retrieveDiff(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see retrieveDiff */
    fun retrieveDiff(
        params: VersionRetrieveDiffParams
    ): CompletableFuture<VersionRetrieveDiffResponse> = retrieveDiff(params, RequestOptions.none())

    /** @see retrieveDiff */
    fun retrieveDiff(
        params: VersionRetrieveDiffParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VersionRetrieveDiffResponse>

    /**
     * A view of [VersionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VersionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/datasets/{dataset_id}/versions`, but is
         * otherwise the same as [VersionServiceAsync.list].
         */
        fun list(datasetId: String): CompletableFuture<HttpResponseFor<VersionListPageAsync>> =
            list(datasetId, VersionListParams.none())

        /** @see list */
        fun list(
            datasetId: String,
            params: VersionListParams = VersionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VersionListPageAsync>> =
            list(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see list */
        fun list(
            datasetId: String,
            params: VersionListParams = VersionListParams.none(),
        ): CompletableFuture<HttpResponseFor<VersionListPageAsync>> =
            list(datasetId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: VersionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VersionListPageAsync>>

        /** @see list */
        fun list(
            params: VersionListParams
        ): CompletableFuture<HttpResponseFor<VersionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            datasetId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VersionListPageAsync>> =
            list(datasetId, VersionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/datasets/{dataset_id}/versions/diff`, but is
         * otherwise the same as [VersionServiceAsync.retrieveDiff].
         */
        fun retrieveDiff(
            datasetId: String,
            params: VersionRetrieveDiffParams,
        ): CompletableFuture<HttpResponseFor<VersionRetrieveDiffResponse>> =
            retrieveDiff(datasetId, params, RequestOptions.none())

        /** @see retrieveDiff */
        fun retrieveDiff(
            datasetId: String,
            params: VersionRetrieveDiffParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VersionRetrieveDiffResponse>> =
            retrieveDiff(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see retrieveDiff */
        fun retrieveDiff(
            params: VersionRetrieveDiffParams
        ): CompletableFuture<HttpResponseFor<VersionRetrieveDiffResponse>> =
            retrieveDiff(params, RequestOptions.none())

        /** @see retrieveDiff */
        fun retrieveDiff(
            params: VersionRetrieveDiffParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VersionRetrieveDiffResponse>>
    }
}

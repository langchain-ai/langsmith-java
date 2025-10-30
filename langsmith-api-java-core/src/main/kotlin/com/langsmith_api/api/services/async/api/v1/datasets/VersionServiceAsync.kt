// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.datasets

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.datasets.DatasetVersion
import com.langsmith_api.api.models.api.v1.datasets.versions.VersionListParams
import com.langsmith_api.api.models.api.v1.datasets.versions.VersionRetrieveDiffParams
import com.langsmith_api.api.models.api.v1.datasets.versions.VersionRetrieveDiffResponse
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
    fun list(datasetId: String): CompletableFuture<List<DatasetVersion>> =
        list(datasetId, VersionListParams.none())

    /** @see list */
    fun list(
        datasetId: String,
        params: VersionListParams = VersionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<DatasetVersion>> =
        list(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see list */
    fun list(
        datasetId: String,
        params: VersionListParams = VersionListParams.none(),
    ): CompletableFuture<List<DatasetVersion>> = list(datasetId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: VersionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<DatasetVersion>>

    /** @see list */
    fun list(params: VersionListParams): CompletableFuture<List<DatasetVersion>> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        datasetId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<DatasetVersion>> =
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
        fun list(datasetId: String): CompletableFuture<HttpResponseFor<List<DatasetVersion>>> =
            list(datasetId, VersionListParams.none())

        /** @see list */
        fun list(
            datasetId: String,
            params: VersionListParams = VersionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<DatasetVersion>>> =
            list(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see list */
        fun list(
            datasetId: String,
            params: VersionListParams = VersionListParams.none(),
        ): CompletableFuture<HttpResponseFor<List<DatasetVersion>>> =
            list(datasetId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: VersionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<DatasetVersion>>>

        /** @see list */
        fun list(
            params: VersionListParams
        ): CompletableFuture<HttpResponseFor<List<DatasetVersion>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            datasetId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<DatasetVersion>>> =
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

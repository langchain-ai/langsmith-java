// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.bulkexports

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.bulkexports.runs.BulkExportRun
import com.langsmith_api.api.models.api.v1.bulkexports.runs.RunListParams
import com.langsmith_api.api.models.api.v1.bulkexports.runs.RunRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RunServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync

    /** Get a single bulk export's run by ID */
    fun retrieve(runId: String, params: RunRetrieveParams): CompletableFuture<BulkExportRun> =
        retrieve(runId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        runId: String,
        params: RunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkExportRun> =
        retrieve(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: RunRetrieveParams): CompletableFuture<BulkExportRun> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkExportRun>

    /** Get a bulk export's runs */
    fun list(bulkExportId: String): CompletableFuture<List<BulkExportRun>> =
        list(bulkExportId, RunListParams.none())

    /** @see list */
    fun list(
        bulkExportId: String,
        params: RunListParams = RunListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<BulkExportRun>> =
        list(params.toBuilder().bulkExportId(bulkExportId).build(), requestOptions)

    /** @see list */
    fun list(
        bulkExportId: String,
        params: RunListParams = RunListParams.none(),
    ): CompletableFuture<List<BulkExportRun>> = list(bulkExportId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RunListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<BulkExportRun>>

    /** @see list */
    fun list(params: RunListParams): CompletableFuture<List<BulkExportRun>> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        bulkExportId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<BulkExportRun>> =
        list(bulkExportId, RunListParams.none(), requestOptions)

    /** A view of [RunServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/bulk-exports/{bulk_export_id}/runs/{run_id}`, but is otherwise the same as
         * [RunServiceAsync.retrieve].
         */
        fun retrieve(
            runId: String,
            params: RunRetrieveParams,
        ): CompletableFuture<HttpResponseFor<BulkExportRun>> =
            retrieve(runId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            runId: String,
            params: RunRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkExportRun>> =
            retrieve(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(params: RunRetrieveParams): CompletableFuture<HttpResponseFor<BulkExportRun>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RunRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkExportRun>>

        /**
         * Returns a raw HTTP response for `get /api/v1/bulk-exports/{bulk_export_id}/runs`, but is
         * otherwise the same as [RunServiceAsync.list].
         */
        fun list(bulkExportId: String): CompletableFuture<HttpResponseFor<List<BulkExportRun>>> =
            list(bulkExportId, RunListParams.none())

        /** @see list */
        fun list(
            bulkExportId: String,
            params: RunListParams = RunListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<BulkExportRun>>> =
            list(params.toBuilder().bulkExportId(bulkExportId).build(), requestOptions)

        /** @see list */
        fun list(
            bulkExportId: String,
            params: RunListParams = RunListParams.none(),
        ): CompletableFuture<HttpResponseFor<List<BulkExportRun>>> =
            list(bulkExportId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: RunListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<BulkExportRun>>>

        /** @see list */
        fun list(params: RunListParams): CompletableFuture<HttpResponseFor<List<BulkExportRun>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            bulkExportId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<BulkExportRun>>> =
            list(bulkExportId, RunListParams.none(), requestOptions)
    }
}

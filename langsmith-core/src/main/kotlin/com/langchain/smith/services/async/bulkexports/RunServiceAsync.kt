// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.bulkexports

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.bulkexports.runs.BulkExportRun
import com.langchain.smith.models.bulkexports.runs.RunListParams
import com.langchain.smith.models.bulkexports.runs.RunRetrieveAllParams
import com.langchain.smith.models.bulkexports.runs.RunRetrieveParams
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

    /** Get all bulk export runs for exports that were created from a scheduled bulk export */
    fun list(params: RunListParams): CompletableFuture<List<BulkExportRun>> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RunListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<BulkExportRun>>

    /** Get a bulk export's runs */
    fun retrieveAll(bulkExportId: String): CompletableFuture<List<BulkExportRun>> =
        retrieveAll(bulkExportId, RunRetrieveAllParams.none())

    /** @see retrieveAll */
    fun retrieveAll(
        bulkExportId: String,
        params: RunRetrieveAllParams = RunRetrieveAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<BulkExportRun>> =
        retrieveAll(params.toBuilder().bulkExportId(bulkExportId).build(), requestOptions)

    /** @see retrieveAll */
    fun retrieveAll(
        bulkExportId: String,
        params: RunRetrieveAllParams = RunRetrieveAllParams.none(),
    ): CompletableFuture<List<BulkExportRun>> =
        retrieveAll(bulkExportId, params, RequestOptions.none())

    /** @see retrieveAll */
    fun retrieveAll(
        params: RunRetrieveAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<BulkExportRun>>

    /** @see retrieveAll */
    fun retrieveAll(params: RunRetrieveAllParams): CompletableFuture<List<BulkExportRun>> =
        retrieveAll(params, RequestOptions.none())

    /** @see retrieveAll */
    fun retrieveAll(
        bulkExportId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<BulkExportRun>> =
        retrieveAll(bulkExportId, RunRetrieveAllParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get /api/v1/bulk-exports/runs`, but is otherwise the
         * same as [RunServiceAsync.list].
         */
        fun list(params: RunListParams): CompletableFuture<HttpResponseFor<List<BulkExportRun>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: RunListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<BulkExportRun>>>

        /**
         * Returns a raw HTTP response for `get /api/v1/bulk-exports/{bulk_export_id}/runs`, but is
         * otherwise the same as [RunServiceAsync.retrieveAll].
         */
        fun retrieveAll(
            bulkExportId: String
        ): CompletableFuture<HttpResponseFor<List<BulkExportRun>>> =
            retrieveAll(bulkExportId, RunRetrieveAllParams.none())

        /** @see retrieveAll */
        fun retrieveAll(
            bulkExportId: String,
            params: RunRetrieveAllParams = RunRetrieveAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<BulkExportRun>>> =
            retrieveAll(params.toBuilder().bulkExportId(bulkExportId).build(), requestOptions)

        /** @see retrieveAll */
        fun retrieveAll(
            bulkExportId: String,
            params: RunRetrieveAllParams = RunRetrieveAllParams.none(),
        ): CompletableFuture<HttpResponseFor<List<BulkExportRun>>> =
            retrieveAll(bulkExportId, params, RequestOptions.none())

        /** @see retrieveAll */
        fun retrieveAll(
            params: RunRetrieveAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<BulkExportRun>>>

        /** @see retrieveAll */
        fun retrieveAll(
            params: RunRetrieveAllParams
        ): CompletableFuture<HttpResponseFor<List<BulkExportRun>>> =
            retrieveAll(params, RequestOptions.none())

        /** @see retrieveAll */
        fun retrieveAll(
            bulkExportId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<BulkExportRun>>> =
            retrieveAll(bulkExportId, RunRetrieveAllParams.none(), requestOptions)
    }
}

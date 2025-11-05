// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.bulkexports

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.bulkexports.runs.BulkExportRun
import com.langchain.smith.models.bulkexports.runs.RunListParams
import com.langchain.smith.models.bulkexports.runs.RunRetrieveAllParams
import com.langchain.smith.models.bulkexports.runs.RunRetrieveParams
import java.util.function.Consumer

interface RunService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService

    /** Get a single bulk export's run by ID */
    fun retrieve(runId: String, params: RunRetrieveParams): BulkExportRun =
        retrieve(runId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        runId: String,
        params: RunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkExportRun = retrieve(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: RunRetrieveParams): BulkExportRun = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkExportRun

    /** Get all bulk export runs for exports that were created from a scheduled bulk export */
    fun list(params: RunListParams): List<BulkExportRun> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RunListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<BulkExportRun>

    /** Get a bulk export's runs */
    fun retrieveAll(bulkExportId: String): List<BulkExportRun> =
        retrieveAll(bulkExportId, RunRetrieveAllParams.none())

    /** @see retrieveAll */
    fun retrieveAll(
        bulkExportId: String,
        params: RunRetrieveAllParams = RunRetrieveAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<BulkExportRun> =
        retrieveAll(params.toBuilder().bulkExportId(bulkExportId).build(), requestOptions)

    /** @see retrieveAll */
    fun retrieveAll(
        bulkExportId: String,
        params: RunRetrieveAllParams = RunRetrieveAllParams.none(),
    ): List<BulkExportRun> = retrieveAll(bulkExportId, params, RequestOptions.none())

    /** @see retrieveAll */
    fun retrieveAll(
        params: RunRetrieveAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<BulkExportRun>

    /** @see retrieveAll */
    fun retrieveAll(params: RunRetrieveAllParams): List<BulkExportRun> =
        retrieveAll(params, RequestOptions.none())

    /** @see retrieveAll */
    fun retrieveAll(bulkExportId: String, requestOptions: RequestOptions): List<BulkExportRun> =
        retrieveAll(bulkExportId, RunRetrieveAllParams.none(), requestOptions)

    /** A view of [RunService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/bulk-exports/{bulk_export_id}/runs/{run_id}`, but is otherwise the same as
         * [RunService.retrieve].
         */
        @MustBeClosed
        fun retrieve(runId: String, params: RunRetrieveParams): HttpResponseFor<BulkExportRun> =
            retrieve(runId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            runId: String,
            params: RunRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BulkExportRun> =
            retrieve(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: RunRetrieveParams): HttpResponseFor<BulkExportRun> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RunRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BulkExportRun>

        /**
         * Returns a raw HTTP response for `get /api/v1/bulk-exports/runs`, but is otherwise the
         * same as [RunService.list].
         */
        @MustBeClosed
        fun list(params: RunListParams): HttpResponseFor<List<BulkExportRun>> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RunListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<BulkExportRun>>

        /**
         * Returns a raw HTTP response for `get /api/v1/bulk-exports/{bulk_export_id}/runs`, but is
         * otherwise the same as [RunService.retrieveAll].
         */
        @MustBeClosed
        fun retrieveAll(bulkExportId: String): HttpResponseFor<List<BulkExportRun>> =
            retrieveAll(bulkExportId, RunRetrieveAllParams.none())

        /** @see retrieveAll */
        @MustBeClosed
        fun retrieveAll(
            bulkExportId: String,
            params: RunRetrieveAllParams = RunRetrieveAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<BulkExportRun>> =
            retrieveAll(params.toBuilder().bulkExportId(bulkExportId).build(), requestOptions)

        /** @see retrieveAll */
        @MustBeClosed
        fun retrieveAll(
            bulkExportId: String,
            params: RunRetrieveAllParams = RunRetrieveAllParams.none(),
        ): HttpResponseFor<List<BulkExportRun>> =
            retrieveAll(bulkExportId, params, RequestOptions.none())

        /** @see retrieveAll */
        @MustBeClosed
        fun retrieveAll(
            params: RunRetrieveAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<BulkExportRun>>

        /** @see retrieveAll */
        @MustBeClosed
        fun retrieveAll(params: RunRetrieveAllParams): HttpResponseFor<List<BulkExportRun>> =
            retrieveAll(params, RequestOptions.none())

        /** @see retrieveAll */
        @MustBeClosed
        fun retrieveAll(
            bulkExportId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<BulkExportRun>> =
            retrieveAll(bulkExportId, RunRetrieveAllParams.none(), requestOptions)
    }
}

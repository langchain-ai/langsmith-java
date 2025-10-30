// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.bulkexports

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.bulkexports.runs.BulkExportRun
import com.langsmith_api.api.models.api.v1.bulkexports.runs.RunListParams
import com.langsmith_api.api.models.api.v1.bulkexports.runs.RunRetrieveParams
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

    /** Get a bulk export's runs */
    fun list(bulkExportId: String): List<BulkExportRun> = list(bulkExportId, RunListParams.none())

    /** @see list */
    fun list(
        bulkExportId: String,
        params: RunListParams = RunListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<BulkExportRun> =
        list(params.toBuilder().bulkExportId(bulkExportId).build(), requestOptions)

    /** @see list */
    fun list(
        bulkExportId: String,
        params: RunListParams = RunListParams.none(),
    ): List<BulkExportRun> = list(bulkExportId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RunListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<BulkExportRun>

    /** @see list */
    fun list(params: RunListParams): List<BulkExportRun> = list(params, RequestOptions.none())

    /** @see list */
    fun list(bulkExportId: String, requestOptions: RequestOptions): List<BulkExportRun> =
        list(bulkExportId, RunListParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get /api/v1/bulk-exports/{bulk_export_id}/runs`, but is
         * otherwise the same as [RunService.list].
         */
        @MustBeClosed
        fun list(bulkExportId: String): HttpResponseFor<List<BulkExportRun>> =
            list(bulkExportId, RunListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            bulkExportId: String,
            params: RunListParams = RunListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<BulkExportRun>> =
            list(params.toBuilder().bulkExportId(bulkExportId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            bulkExportId: String,
            params: RunListParams = RunListParams.none(),
        ): HttpResponseFor<List<BulkExportRun>> = list(bulkExportId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RunListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<BulkExportRun>>

        /** @see list */
        @MustBeClosed
        fun list(params: RunListParams): HttpResponseFor<List<BulkExportRun>> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            bulkExportId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<BulkExportRun>> =
            list(bulkExportId, RunListParams.none(), requestOptions)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.bulkexports.BulkExport
import com.langchain.smith.models.bulkexports.BulkExportBulkExportsParams
import com.langchain.smith.models.bulkexports.BulkExportRetrieveBulkExportsParams
import com.langchain.smith.models.bulkexports.BulkExportRetrieveParams
import com.langchain.smith.models.bulkexports.BulkExportUpdateParams
import com.langchain.smith.services.blocking.bulkexports.DestinationService
import com.langchain.smith.services.blocking.bulkexports.RunService
import java.util.function.Consumer

interface BulkExportService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BulkExportService

    fun destinations(): DestinationService

    fun runs(): RunService

    /** Get a single bulk export by ID */
    fun retrieve(bulkExportId: String): BulkExport =
        retrieve(bulkExportId, BulkExportRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        bulkExportId: String,
        params: BulkExportRetrieveParams = BulkExportRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkExport = retrieve(params.toBuilder().bulkExportId(bulkExportId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        bulkExportId: String,
        params: BulkExportRetrieveParams = BulkExportRetrieveParams.none(),
    ): BulkExport = retrieve(bulkExportId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BulkExportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkExport

    /** @see retrieve */
    fun retrieve(params: BulkExportRetrieveParams): BulkExport =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(bulkExportId: String, requestOptions: RequestOptions): BulkExport =
        retrieve(bulkExportId, BulkExportRetrieveParams.none(), requestOptions)

    /** Cancel a bulk export by ID */
    fun update(bulkExportId: String): BulkExport =
        update(bulkExportId, BulkExportUpdateParams.none())

    /** @see update */
    fun update(
        bulkExportId: String,
        params: BulkExportUpdateParams = BulkExportUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkExport = update(params.toBuilder().bulkExportId(bulkExportId).build(), requestOptions)

    /** @see update */
    fun update(
        bulkExportId: String,
        params: BulkExportUpdateParams = BulkExportUpdateParams.none(),
    ): BulkExport = update(bulkExportId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BulkExportUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkExport

    /** @see update */
    fun update(params: BulkExportUpdateParams): BulkExport = update(params, RequestOptions.none())

    /** @see update */
    fun update(bulkExportId: String, requestOptions: RequestOptions): BulkExport =
        update(bulkExportId, BulkExportUpdateParams.none(), requestOptions)

    /** Create a new bulk export */
    fun bulkExports(params: BulkExportBulkExportsParams): BulkExport =
        bulkExports(params, RequestOptions.none())

    /** @see bulkExports */
    fun bulkExports(
        params: BulkExportBulkExportsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkExport

    /** Get the current workspace's bulk exports */
    fun retrieveBulkExports(): List<BulkExport> =
        retrieveBulkExports(BulkExportRetrieveBulkExportsParams.none())

    /** @see retrieveBulkExports */
    fun retrieveBulkExports(
        params: BulkExportRetrieveBulkExportsParams = BulkExportRetrieveBulkExportsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<BulkExport>

    /** @see retrieveBulkExports */
    fun retrieveBulkExports(
        params: BulkExportRetrieveBulkExportsParams = BulkExportRetrieveBulkExportsParams.none()
    ): List<BulkExport> = retrieveBulkExports(params, RequestOptions.none())

    /** @see retrieveBulkExports */
    fun retrieveBulkExports(requestOptions: RequestOptions): List<BulkExport> =
        retrieveBulkExports(BulkExportRetrieveBulkExportsParams.none(), requestOptions)

    /** A view of [BulkExportService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BulkExportService.WithRawResponse

        fun destinations(): DestinationService.WithRawResponse

        fun runs(): RunService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/bulk-exports/{bulk_export_id}`, but is
         * otherwise the same as [BulkExportService.retrieve].
         */
        @MustBeClosed
        fun retrieve(bulkExportId: String): HttpResponseFor<BulkExport> =
            retrieve(bulkExportId, BulkExportRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            bulkExportId: String,
            params: BulkExportRetrieveParams = BulkExportRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BulkExport> =
            retrieve(params.toBuilder().bulkExportId(bulkExportId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            bulkExportId: String,
            params: BulkExportRetrieveParams = BulkExportRetrieveParams.none(),
        ): HttpResponseFor<BulkExport> = retrieve(bulkExportId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BulkExportRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BulkExport>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: BulkExportRetrieveParams): HttpResponseFor<BulkExport> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            bulkExportId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BulkExport> =
            retrieve(bulkExportId, BulkExportRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/bulk-exports/{bulk_export_id}`, but is
         * otherwise the same as [BulkExportService.update].
         */
        @MustBeClosed
        fun update(bulkExportId: String): HttpResponseFor<BulkExport> =
            update(bulkExportId, BulkExportUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            bulkExportId: String,
            params: BulkExportUpdateParams = BulkExportUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BulkExport> =
            update(params.toBuilder().bulkExportId(bulkExportId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            bulkExportId: String,
            params: BulkExportUpdateParams = BulkExportUpdateParams.none(),
        ): HttpResponseFor<BulkExport> = update(bulkExportId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: BulkExportUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BulkExport>

        /** @see update */
        @MustBeClosed
        fun update(params: BulkExportUpdateParams): HttpResponseFor<BulkExport> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            bulkExportId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BulkExport> =
            update(bulkExportId, BulkExportUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/bulk-exports`, but is otherwise the same as
         * [BulkExportService.bulkExports].
         */
        @MustBeClosed
        fun bulkExports(params: BulkExportBulkExportsParams): HttpResponseFor<BulkExport> =
            bulkExports(params, RequestOptions.none())

        /** @see bulkExports */
        @MustBeClosed
        fun bulkExports(
            params: BulkExportBulkExportsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BulkExport>

        /**
         * Returns a raw HTTP response for `get /api/v1/bulk-exports`, but is otherwise the same as
         * [BulkExportService.retrieveBulkExports].
         */
        @MustBeClosed
        fun retrieveBulkExports(): HttpResponseFor<List<BulkExport>> =
            retrieveBulkExports(BulkExportRetrieveBulkExportsParams.none())

        /** @see retrieveBulkExports */
        @MustBeClosed
        fun retrieveBulkExports(
            params: BulkExportRetrieveBulkExportsParams =
                BulkExportRetrieveBulkExportsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<BulkExport>>

        /** @see retrieveBulkExports */
        @MustBeClosed
        fun retrieveBulkExports(
            params: BulkExportRetrieveBulkExportsParams = BulkExportRetrieveBulkExportsParams.none()
        ): HttpResponseFor<List<BulkExport>> = retrieveBulkExports(params, RequestOptions.none())

        /** @see retrieveBulkExports */
        @MustBeClosed
        fun retrieveBulkExports(requestOptions: RequestOptions): HttpResponseFor<List<BulkExport>> =
            retrieveBulkExports(BulkExportRetrieveBulkExportsParams.none(), requestOptions)
    }
}

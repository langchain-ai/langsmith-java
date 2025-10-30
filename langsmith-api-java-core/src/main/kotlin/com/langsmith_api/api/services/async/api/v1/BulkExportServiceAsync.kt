// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.bulkexports.BulkExport
import com.langsmith_api.api.models.api.v1.bulkexports.BulkExportBulkExportsParams
import com.langsmith_api.api.models.api.v1.bulkexports.BulkExportRetrieveBulkExportsParams
import com.langsmith_api.api.models.api.v1.bulkexports.BulkExportRetrieveParams
import com.langsmith_api.api.models.api.v1.bulkexports.BulkExportUpdateParams
import com.langsmith_api.api.services.async.api.v1.bulkexports.DestinationServiceAsync
import com.langsmith_api.api.services.async.api.v1.bulkexports.RunServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BulkExportServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BulkExportServiceAsync

    fun destinations(): DestinationServiceAsync

    fun runs(): RunServiceAsync

    /** Get a single bulk export by ID */
    fun retrieve(bulkExportId: String): CompletableFuture<BulkExport> =
        retrieve(bulkExportId, BulkExportRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        bulkExportId: String,
        params: BulkExportRetrieveParams = BulkExportRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkExport> =
        retrieve(params.toBuilder().bulkExportId(bulkExportId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        bulkExportId: String,
        params: BulkExportRetrieveParams = BulkExportRetrieveParams.none(),
    ): CompletableFuture<BulkExport> = retrieve(bulkExportId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BulkExportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkExport>

    /** @see retrieve */
    fun retrieve(params: BulkExportRetrieveParams): CompletableFuture<BulkExport> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        bulkExportId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BulkExport> =
        retrieve(bulkExportId, BulkExportRetrieveParams.none(), requestOptions)

    /** Cancel a bulk export by ID */
    fun update(bulkExportId: String): CompletableFuture<BulkExport> =
        update(bulkExportId, BulkExportUpdateParams.none())

    /** @see update */
    fun update(
        bulkExportId: String,
        params: BulkExportUpdateParams = BulkExportUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkExport> =
        update(params.toBuilder().bulkExportId(bulkExportId).build(), requestOptions)

    /** @see update */
    fun update(
        bulkExportId: String,
        params: BulkExportUpdateParams = BulkExportUpdateParams.none(),
    ): CompletableFuture<BulkExport> = update(bulkExportId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BulkExportUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkExport>

    /** @see update */
    fun update(params: BulkExportUpdateParams): CompletableFuture<BulkExport> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        bulkExportId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BulkExport> =
        update(bulkExportId, BulkExportUpdateParams.none(), requestOptions)

    /** Create a new bulk export */
    fun bulkExports(params: BulkExportBulkExportsParams): CompletableFuture<BulkExport> =
        bulkExports(params, RequestOptions.none())

    /** @see bulkExports */
    fun bulkExports(
        params: BulkExportBulkExportsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkExport>

    /** Get the current workspace's bulk exports */
    fun retrieveBulkExports(): CompletableFuture<List<BulkExport>> =
        retrieveBulkExports(BulkExportRetrieveBulkExportsParams.none())

    /** @see retrieveBulkExports */
    fun retrieveBulkExports(
        params: BulkExportRetrieveBulkExportsParams = BulkExportRetrieveBulkExportsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<BulkExport>>

    /** @see retrieveBulkExports */
    fun retrieveBulkExports(
        params: BulkExportRetrieveBulkExportsParams = BulkExportRetrieveBulkExportsParams.none()
    ): CompletableFuture<List<BulkExport>> = retrieveBulkExports(params, RequestOptions.none())

    /** @see retrieveBulkExports */
    fun retrieveBulkExports(requestOptions: RequestOptions): CompletableFuture<List<BulkExport>> =
        retrieveBulkExports(BulkExportRetrieveBulkExportsParams.none(), requestOptions)

    /**
     * A view of [BulkExportServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BulkExportServiceAsync.WithRawResponse

        fun destinations(): DestinationServiceAsync.WithRawResponse

        fun runs(): RunServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/bulk-exports/{bulk_export_id}`, but is
         * otherwise the same as [BulkExportServiceAsync.retrieve].
         */
        fun retrieve(bulkExportId: String): CompletableFuture<HttpResponseFor<BulkExport>> =
            retrieve(bulkExportId, BulkExportRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            bulkExportId: String,
            params: BulkExportRetrieveParams = BulkExportRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkExport>> =
            retrieve(params.toBuilder().bulkExportId(bulkExportId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            bulkExportId: String,
            params: BulkExportRetrieveParams = BulkExportRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<BulkExport>> =
            retrieve(bulkExportId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BulkExportRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkExport>>

        /** @see retrieve */
        fun retrieve(
            params: BulkExportRetrieveParams
        ): CompletableFuture<HttpResponseFor<BulkExport>> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            bulkExportId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BulkExport>> =
            retrieve(bulkExportId, BulkExportRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/bulk-exports/{bulk_export_id}`, but is
         * otherwise the same as [BulkExportServiceAsync.update].
         */
        fun update(bulkExportId: String): CompletableFuture<HttpResponseFor<BulkExport>> =
            update(bulkExportId, BulkExportUpdateParams.none())

        /** @see update */
        fun update(
            bulkExportId: String,
            params: BulkExportUpdateParams = BulkExportUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkExport>> =
            update(params.toBuilder().bulkExportId(bulkExportId).build(), requestOptions)

        /** @see update */
        fun update(
            bulkExportId: String,
            params: BulkExportUpdateParams = BulkExportUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<BulkExport>> =
            update(bulkExportId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: BulkExportUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkExport>>

        /** @see update */
        fun update(params: BulkExportUpdateParams): CompletableFuture<HttpResponseFor<BulkExport>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            bulkExportId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BulkExport>> =
            update(bulkExportId, BulkExportUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/bulk-exports`, but is otherwise the same as
         * [BulkExportServiceAsync.bulkExports].
         */
        fun bulkExports(
            params: BulkExportBulkExportsParams
        ): CompletableFuture<HttpResponseFor<BulkExport>> =
            bulkExports(params, RequestOptions.none())

        /** @see bulkExports */
        fun bulkExports(
            params: BulkExportBulkExportsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkExport>>

        /**
         * Returns a raw HTTP response for `get /api/v1/bulk-exports`, but is otherwise the same as
         * [BulkExportServiceAsync.retrieveBulkExports].
         */
        fun retrieveBulkExports(): CompletableFuture<HttpResponseFor<List<BulkExport>>> =
            retrieveBulkExports(BulkExportRetrieveBulkExportsParams.none())

        /** @see retrieveBulkExports */
        fun retrieveBulkExports(
            params: BulkExportRetrieveBulkExportsParams =
                BulkExportRetrieveBulkExportsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<BulkExport>>>

        /** @see retrieveBulkExports */
        fun retrieveBulkExports(
            params: BulkExportRetrieveBulkExportsParams = BulkExportRetrieveBulkExportsParams.none()
        ): CompletableFuture<HttpResponseFor<List<BulkExport>>> =
            retrieveBulkExports(params, RequestOptions.none())

        /** @see retrieveBulkExports */
        fun retrieveBulkExports(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<BulkExport>>> =
            retrieveBulkExports(BulkExportRetrieveBulkExportsParams.none(), requestOptions)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.bulkexports

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.bulkexports.destinations.BulkExportDestination
import com.langchain.smith.models.bulkexports.destinations.DestinationCreateParams
import com.langchain.smith.models.bulkexports.destinations.DestinationListParams
import com.langchain.smith.models.bulkexports.destinations.DestinationRetrieveParams
import java.util.function.Consumer

interface DestinationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DestinationService

    /** Create a new bulk export destination */
    fun create(params: DestinationCreateParams): BulkExportDestination =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DestinationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkExportDestination

    /** Get a single bulk export destination by ID */
    fun retrieve(destinationId: String): BulkExportDestination =
        retrieve(destinationId, DestinationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        destinationId: String,
        params: DestinationRetrieveParams = DestinationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkExportDestination =
        retrieve(params.toBuilder().destinationId(destinationId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        destinationId: String,
        params: DestinationRetrieveParams = DestinationRetrieveParams.none(),
    ): BulkExportDestination = retrieve(destinationId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DestinationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkExportDestination

    /** @see retrieve */
    fun retrieve(params: DestinationRetrieveParams): BulkExportDestination =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(destinationId: String, requestOptions: RequestOptions): BulkExportDestination =
        retrieve(destinationId, DestinationRetrieveParams.none(), requestOptions)

    /** Get the current workspace's bulk export destinations */
    fun list(): List<BulkExportDestination> = list(DestinationListParams.none())

    /** @see list */
    fun list(
        params: DestinationListParams = DestinationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<BulkExportDestination>

    /** @see list */
    fun list(
        params: DestinationListParams = DestinationListParams.none()
    ): List<BulkExportDestination> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<BulkExportDestination> =
        list(DestinationListParams.none(), requestOptions)

    /**
     * A view of [DestinationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DestinationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/bulk-exports/destinations`, but is
         * otherwise the same as [DestinationService.create].
         */
        @MustBeClosed
        fun create(params: DestinationCreateParams): HttpResponseFor<BulkExportDestination> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: DestinationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BulkExportDestination>

        /**
         * Returns a raw HTTP response for `get /api/v1/bulk-exports/destinations/{destination_id}`,
         * but is otherwise the same as [DestinationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(destinationId: String): HttpResponseFor<BulkExportDestination> =
            retrieve(destinationId, DestinationRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            destinationId: String,
            params: DestinationRetrieveParams = DestinationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BulkExportDestination> =
            retrieve(params.toBuilder().destinationId(destinationId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            destinationId: String,
            params: DestinationRetrieveParams = DestinationRetrieveParams.none(),
        ): HttpResponseFor<BulkExportDestination> =
            retrieve(destinationId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DestinationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BulkExportDestination>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: DestinationRetrieveParams): HttpResponseFor<BulkExportDestination> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            destinationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BulkExportDestination> =
            retrieve(destinationId, DestinationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/bulk-exports/destinations`, but is otherwise
         * the same as [DestinationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<BulkExportDestination>> =
            list(DestinationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DestinationListParams = DestinationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<BulkExportDestination>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: DestinationListParams = DestinationListParams.none()
        ): HttpResponseFor<List<BulkExportDestination>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<BulkExportDestination>> =
            list(DestinationListParams.none(), requestOptions)
    }
}

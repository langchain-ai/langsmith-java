// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.bulkexports

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.bulkexports.destinations.BulkExportDestination
import com.langsmith_api.api.models.api.v1.bulkexports.destinations.DestinationCreateParams
import com.langsmith_api.api.models.api.v1.bulkexports.destinations.DestinationListParams
import com.langsmith_api.api.models.api.v1.bulkexports.destinations.DestinationRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DestinationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DestinationServiceAsync

    /** Create a new bulk export destination */
    fun create(params: DestinationCreateParams): CompletableFuture<BulkExportDestination> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DestinationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkExportDestination>

    /** Get a single bulk export destination by ID */
    fun retrieve(destinationId: String): CompletableFuture<BulkExportDestination> =
        retrieve(destinationId, DestinationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        destinationId: String,
        params: DestinationRetrieveParams = DestinationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkExportDestination> =
        retrieve(params.toBuilder().destinationId(destinationId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        destinationId: String,
        params: DestinationRetrieveParams = DestinationRetrieveParams.none(),
    ): CompletableFuture<BulkExportDestination> =
        retrieve(destinationId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DestinationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkExportDestination>

    /** @see retrieve */
    fun retrieve(params: DestinationRetrieveParams): CompletableFuture<BulkExportDestination> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        destinationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BulkExportDestination> =
        retrieve(destinationId, DestinationRetrieveParams.none(), requestOptions)

    /** Get the current workspace's bulk export destinations */
    fun list(): CompletableFuture<List<BulkExportDestination>> = list(DestinationListParams.none())

    /** @see list */
    fun list(
        params: DestinationListParams = DestinationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<BulkExportDestination>>

    /** @see list */
    fun list(
        params: DestinationListParams = DestinationListParams.none()
    ): CompletableFuture<List<BulkExportDestination>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<BulkExportDestination>> =
        list(DestinationListParams.none(), requestOptions)

    /**
     * A view of [DestinationServiceAsync] that provides access to raw HTTP responses for each
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
        ): DestinationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/bulk-exports/destinations`, but is
         * otherwise the same as [DestinationServiceAsync.create].
         */
        fun create(
            params: DestinationCreateParams
        ): CompletableFuture<HttpResponseFor<BulkExportDestination>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DestinationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkExportDestination>>

        /**
         * Returns a raw HTTP response for `get /api/v1/bulk-exports/destinations/{destination_id}`,
         * but is otherwise the same as [DestinationServiceAsync.retrieve].
         */
        fun retrieve(
            destinationId: String
        ): CompletableFuture<HttpResponseFor<BulkExportDestination>> =
            retrieve(destinationId, DestinationRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            destinationId: String,
            params: DestinationRetrieveParams = DestinationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkExportDestination>> =
            retrieve(params.toBuilder().destinationId(destinationId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            destinationId: String,
            params: DestinationRetrieveParams = DestinationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<BulkExportDestination>> =
            retrieve(destinationId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: DestinationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkExportDestination>>

        /** @see retrieve */
        fun retrieve(
            params: DestinationRetrieveParams
        ): CompletableFuture<HttpResponseFor<BulkExportDestination>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            destinationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BulkExportDestination>> =
            retrieve(destinationId, DestinationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/bulk-exports/destinations`, but is otherwise
         * the same as [DestinationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<BulkExportDestination>>> =
            list(DestinationListParams.none())

        /** @see list */
        fun list(
            params: DestinationListParams = DestinationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<BulkExportDestination>>>

        /** @see list */
        fun list(
            params: DestinationListParams = DestinationListParams.none()
        ): CompletableFuture<HttpResponseFor<List<BulkExportDestination>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<BulkExportDestination>>> =
            list(DestinationListParams.none(), requestOptions)
    }
}

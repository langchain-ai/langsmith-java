// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.sandboxes

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.sandboxes.snapshots.SnapshotCreateParams
import com.langchain.smith.models.sandboxes.snapshots.SnapshotCreateResponse
import com.langchain.smith.models.sandboxes.snapshots.SnapshotDeleteParams
import com.langchain.smith.models.sandboxes.snapshots.SnapshotListParams
import com.langchain.smith.models.sandboxes.snapshots.SnapshotListResponse
import com.langchain.smith.models.sandboxes.snapshots.SnapshotRetrieveParams
import com.langchain.smith.models.sandboxes.snapshots.SnapshotRetrieveResponse
import java.util.function.Consumer

interface SnapshotService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SnapshotService

    /** Create a snapshot from a Docker image (async build). */
    fun create(params: SnapshotCreateParams): SnapshotCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SnapshotCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SnapshotCreateResponse

    /** Get a sandbox snapshot by ID. */
    fun retrieve(snapshotId: String): SnapshotRetrieveResponse =
        retrieve(snapshotId, SnapshotRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        snapshotId: String,
        params: SnapshotRetrieveParams = SnapshotRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SnapshotRetrieveResponse =
        retrieve(params.toBuilder().snapshotId(snapshotId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        snapshotId: String,
        params: SnapshotRetrieveParams = SnapshotRetrieveParams.none(),
    ): SnapshotRetrieveResponse = retrieve(snapshotId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SnapshotRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SnapshotRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: SnapshotRetrieveParams): SnapshotRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(snapshotId: String, requestOptions: RequestOptions): SnapshotRetrieveResponse =
        retrieve(snapshotId, SnapshotRetrieveParams.none(), requestOptions)

    /**
     * List sandbox snapshots for the authenticated tenant, with optional filtering, sorting, and
     * pagination.
     */
    fun list(): SnapshotListResponse = list(SnapshotListParams.none())

    /** @see list */
    fun list(
        params: SnapshotListParams = SnapshotListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SnapshotListResponse

    /** @see list */
    fun list(params: SnapshotListParams = SnapshotListParams.none()): SnapshotListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SnapshotListResponse =
        list(SnapshotListParams.none(), requestOptions)

    /** Delete a snapshot by ID. The ext4 rootfs is removed from JuiceFS asynchronously. */
    fun delete(snapshotId: String) = delete(snapshotId, SnapshotDeleteParams.none())

    /** @see delete */
    fun delete(
        snapshotId: String,
        params: SnapshotDeleteParams = SnapshotDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().snapshotId(snapshotId).build(), requestOptions)

    /** @see delete */
    fun delete(snapshotId: String, params: SnapshotDeleteParams = SnapshotDeleteParams.none()) =
        delete(snapshotId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: SnapshotDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: SnapshotDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(snapshotId: String, requestOptions: RequestOptions) =
        delete(snapshotId, SnapshotDeleteParams.none(), requestOptions)

    /** A view of [SnapshotService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SnapshotService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/sandboxes/snapshots`, but is otherwise the same
         * as [SnapshotService.create].
         */
        @MustBeClosed
        fun create(params: SnapshotCreateParams): HttpResponseFor<SnapshotCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SnapshotCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SnapshotCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v2/sandboxes/snapshots/{snapshot_id}`, but is
         * otherwise the same as [SnapshotService.retrieve].
         */
        @MustBeClosed
        fun retrieve(snapshotId: String): HttpResponseFor<SnapshotRetrieveResponse> =
            retrieve(snapshotId, SnapshotRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            snapshotId: String,
            params: SnapshotRetrieveParams = SnapshotRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SnapshotRetrieveResponse> =
            retrieve(params.toBuilder().snapshotId(snapshotId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            snapshotId: String,
            params: SnapshotRetrieveParams = SnapshotRetrieveParams.none(),
        ): HttpResponseFor<SnapshotRetrieveResponse> =
            retrieve(snapshotId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SnapshotRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SnapshotRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: SnapshotRetrieveParams): HttpResponseFor<SnapshotRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            snapshotId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SnapshotRetrieveResponse> =
            retrieve(snapshotId, SnapshotRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/sandboxes/snapshots`, but is otherwise the same
         * as [SnapshotService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<SnapshotListResponse> = list(SnapshotListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SnapshotListParams = SnapshotListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SnapshotListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SnapshotListParams = SnapshotListParams.none()
        ): HttpResponseFor<SnapshotListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SnapshotListResponse> =
            list(SnapshotListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v2/sandboxes/snapshots/{snapshot_id}`, but is
         * otherwise the same as [SnapshotService.delete].
         */
        @MustBeClosed
        fun delete(snapshotId: String): HttpResponse =
            delete(snapshotId, SnapshotDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            snapshotId: String,
            params: SnapshotDeleteParams = SnapshotDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().snapshotId(snapshotId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            snapshotId: String,
            params: SnapshotDeleteParams = SnapshotDeleteParams.none(),
        ): HttpResponse = delete(snapshotId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SnapshotDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: SnapshotDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(snapshotId: String, requestOptions: RequestOptions): HttpResponse =
            delete(snapshotId, SnapshotDeleteParams.none(), requestOptions)
    }
}

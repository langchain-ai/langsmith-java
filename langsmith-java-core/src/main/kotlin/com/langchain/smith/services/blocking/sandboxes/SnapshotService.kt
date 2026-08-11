// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.sandboxes

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.sandboxes.SnapshotListResponse
import com.langchain.smith.models.sandboxes.SnapshotResponse
import com.langchain.smith.models.sandboxes.snapshots.SnapshotCreateParams
import com.langchain.smith.models.sandboxes.snapshots.SnapshotDeleteParams
import com.langchain.smith.models.sandboxes.snapshots.SnapshotListParams
import com.langchain.smith.models.sandboxes.snapshots.SnapshotRetrieveByNameParams
import com.langchain.smith.models.sandboxes.snapshots.SnapshotRetrieveByNameResponse
import com.langchain.smith.models.sandboxes.snapshots.SnapshotRetrieveParams
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
    fun create(params: SnapshotCreateParams): SnapshotResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SnapshotCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SnapshotResponse

    /**
     * Get a sandbox snapshot by ID or by a Docker-style reference. A bare name means name:latest,
     * falling back to the newest ready untagged snapshot of that name. To list the tags under a
     * name, use /api/v2/sandboxes/snapshots-by-name/{name}.
     */
    fun retrieve(snapshotId: String): SnapshotResponse =
        retrieve(snapshotId, SnapshotRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        snapshotId: String,
        params: SnapshotRetrieveParams = SnapshotRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SnapshotResponse =
        retrieve(params.toBuilder().snapshotId(snapshotId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        snapshotId: String,
        params: SnapshotRetrieveParams = SnapshotRetrieveParams.none(),
    ): SnapshotResponse = retrieve(snapshotId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SnapshotRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SnapshotResponse

    /** @see retrieve */
    fun retrieve(params: SnapshotRetrieveParams): SnapshotResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(snapshotId: String, requestOptions: RequestOptions): SnapshotResponse =
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

    /**
     * Delete a snapshot by ID or by a Docker-style name[:tag] reference. The underlying storage is
     * reclaimed asynchronously.
     */
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

    /**
     * Get a snapshot name and every tag under it, with the snapshot each tag resolves to. To fetch
     * one snapshot, use /api/v2/sandboxes/snapshots/{snapshot_id}.
     */
    fun retrieveByName(name: String): SnapshotRetrieveByNameResponse =
        retrieveByName(name, SnapshotRetrieveByNameParams.none())

    /** @see retrieveByName */
    fun retrieveByName(
        name: String,
        params: SnapshotRetrieveByNameParams = SnapshotRetrieveByNameParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SnapshotRetrieveByNameResponse =
        retrieveByName(params.toBuilder().name(name).build(), requestOptions)

    /** @see retrieveByName */
    fun retrieveByName(
        name: String,
        params: SnapshotRetrieveByNameParams = SnapshotRetrieveByNameParams.none(),
    ): SnapshotRetrieveByNameResponse = retrieveByName(name, params, RequestOptions.none())

    /** @see retrieveByName */
    fun retrieveByName(
        params: SnapshotRetrieveByNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SnapshotRetrieveByNameResponse

    /** @see retrieveByName */
    fun retrieveByName(params: SnapshotRetrieveByNameParams): SnapshotRetrieveByNameResponse =
        retrieveByName(params, RequestOptions.none())

    /** @see retrieveByName */
    fun retrieveByName(
        name: String,
        requestOptions: RequestOptions,
    ): SnapshotRetrieveByNameResponse =
        retrieveByName(name, SnapshotRetrieveByNameParams.none(), requestOptions)

    /** A view of [SnapshotService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SnapshotService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v2/sandboxes/snapshots`, but is otherwise the
         * same as [SnapshotService.create].
         */
        @MustBeClosed
        fun create(params: SnapshotCreateParams): HttpResponseFor<SnapshotResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SnapshotCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SnapshotResponse>

        /**
         * Returns a raw HTTP response for `get /api/v2/sandboxes/snapshots/{snapshot_id}`, but is
         * otherwise the same as [SnapshotService.retrieve].
         */
        @MustBeClosed
        fun retrieve(snapshotId: String): HttpResponseFor<SnapshotResponse> =
            retrieve(snapshotId, SnapshotRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            snapshotId: String,
            params: SnapshotRetrieveParams = SnapshotRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SnapshotResponse> =
            retrieve(params.toBuilder().snapshotId(snapshotId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            snapshotId: String,
            params: SnapshotRetrieveParams = SnapshotRetrieveParams.none(),
        ): HttpResponseFor<SnapshotResponse> = retrieve(snapshotId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SnapshotRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SnapshotResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: SnapshotRetrieveParams): HttpResponseFor<SnapshotResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            snapshotId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SnapshotResponse> =
            retrieve(snapshotId, SnapshotRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v2/sandboxes/snapshots`, but is otherwise the
         * same as [SnapshotService.list].
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
         * Returns a raw HTTP response for `delete /api/v2/sandboxes/snapshots/{snapshot_id}`, but
         * is otherwise the same as [SnapshotService.delete].
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

        /**
         * Returns a raw HTTP response for `get /api/v2/sandboxes/snapshots-by-name/{name}`, but is
         * otherwise the same as [SnapshotService.retrieveByName].
         */
        @MustBeClosed
        fun retrieveByName(name: String): HttpResponseFor<SnapshotRetrieveByNameResponse> =
            retrieveByName(name, SnapshotRetrieveByNameParams.none())

        /** @see retrieveByName */
        @MustBeClosed
        fun retrieveByName(
            name: String,
            params: SnapshotRetrieveByNameParams = SnapshotRetrieveByNameParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SnapshotRetrieveByNameResponse> =
            retrieveByName(params.toBuilder().name(name).build(), requestOptions)

        /** @see retrieveByName */
        @MustBeClosed
        fun retrieveByName(
            name: String,
            params: SnapshotRetrieveByNameParams = SnapshotRetrieveByNameParams.none(),
        ): HttpResponseFor<SnapshotRetrieveByNameResponse> =
            retrieveByName(name, params, RequestOptions.none())

        /** @see retrieveByName */
        @MustBeClosed
        fun retrieveByName(
            params: SnapshotRetrieveByNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SnapshotRetrieveByNameResponse>

        /** @see retrieveByName */
        @MustBeClosed
        fun retrieveByName(
            params: SnapshotRetrieveByNameParams
        ): HttpResponseFor<SnapshotRetrieveByNameResponse> =
            retrieveByName(params, RequestOptions.none())

        /** @see retrieveByName */
        @MustBeClosed
        fun retrieveByName(
            name: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SnapshotRetrieveByNameResponse> =
            retrieveByName(name, SnapshotRetrieveByNameParams.none(), requestOptions)
    }
}

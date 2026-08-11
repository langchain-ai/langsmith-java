// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.sandboxes

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SnapshotServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SnapshotServiceAsync

    /** Create a snapshot from a Docker image (async build). */
    fun create(params: SnapshotCreateParams): CompletableFuture<SnapshotResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SnapshotCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SnapshotResponse>

    /**
     * Get a sandbox snapshot by ID or by a Docker-style reference. A bare name means name:latest,
     * falling back to the newest ready untagged snapshot of that name. To list the tags under a
     * name, use /api/v2/sandboxes/snapshots-by-name/{name}.
     */
    fun retrieve(snapshotId: String): CompletableFuture<SnapshotResponse> =
        retrieve(snapshotId, SnapshotRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        snapshotId: String,
        params: SnapshotRetrieveParams = SnapshotRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SnapshotResponse> =
        retrieve(params.toBuilder().snapshotId(snapshotId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        snapshotId: String,
        params: SnapshotRetrieveParams = SnapshotRetrieveParams.none(),
    ): CompletableFuture<SnapshotResponse> = retrieve(snapshotId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SnapshotRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SnapshotResponse>

    /** @see retrieve */
    fun retrieve(params: SnapshotRetrieveParams): CompletableFuture<SnapshotResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        snapshotId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SnapshotResponse> =
        retrieve(snapshotId, SnapshotRetrieveParams.none(), requestOptions)

    /**
     * List sandbox snapshots for the authenticated tenant, with optional filtering, sorting, and
     * pagination.
     */
    fun list(): CompletableFuture<SnapshotListResponse> = list(SnapshotListParams.none())

    /** @see list */
    fun list(
        params: SnapshotListParams = SnapshotListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SnapshotListResponse>

    /** @see list */
    fun list(
        params: SnapshotListParams = SnapshotListParams.none()
    ): CompletableFuture<SnapshotListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SnapshotListResponse> =
        list(SnapshotListParams.none(), requestOptions)

    /**
     * Delete a snapshot by ID or by a Docker-style name[:tag] reference. The underlying storage is
     * reclaimed asynchronously.
     */
    fun delete(snapshotId: String): CompletableFuture<Void?> =
        delete(snapshotId, SnapshotDeleteParams.none())

    /** @see delete */
    fun delete(
        snapshotId: String,
        params: SnapshotDeleteParams = SnapshotDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().snapshotId(snapshotId).build(), requestOptions)

    /** @see delete */
    fun delete(
        snapshotId: String,
        params: SnapshotDeleteParams = SnapshotDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(snapshotId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SnapshotDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: SnapshotDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(snapshotId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(snapshotId, SnapshotDeleteParams.none(), requestOptions)

    /**
     * Get a snapshot name and every tag under it, with the snapshot each tag resolves to. To fetch
     * one snapshot, use /api/v2/sandboxes/snapshots/{snapshot_id}.
     */
    fun retrieveByName(name: String): CompletableFuture<SnapshotRetrieveByNameResponse> =
        retrieveByName(name, SnapshotRetrieveByNameParams.none())

    /** @see retrieveByName */
    fun retrieveByName(
        name: String,
        params: SnapshotRetrieveByNameParams = SnapshotRetrieveByNameParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SnapshotRetrieveByNameResponse> =
        retrieveByName(params.toBuilder().name(name).build(), requestOptions)

    /** @see retrieveByName */
    fun retrieveByName(
        name: String,
        params: SnapshotRetrieveByNameParams = SnapshotRetrieveByNameParams.none(),
    ): CompletableFuture<SnapshotRetrieveByNameResponse> =
        retrieveByName(name, params, RequestOptions.none())

    /** @see retrieveByName */
    fun retrieveByName(
        params: SnapshotRetrieveByNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SnapshotRetrieveByNameResponse>

    /** @see retrieveByName */
    fun retrieveByName(
        params: SnapshotRetrieveByNameParams
    ): CompletableFuture<SnapshotRetrieveByNameResponse> =
        retrieveByName(params, RequestOptions.none())

    /** @see retrieveByName */
    fun retrieveByName(
        name: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SnapshotRetrieveByNameResponse> =
        retrieveByName(name, SnapshotRetrieveByNameParams.none(), requestOptions)

    /**
     * A view of [SnapshotServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SnapshotServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v2/sandboxes/snapshots`, but is otherwise the
         * same as [SnapshotServiceAsync.create].
         */
        fun create(
            params: SnapshotCreateParams
        ): CompletableFuture<HttpResponseFor<SnapshotResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SnapshotCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v2/sandboxes/snapshots/{snapshot_id}`, but is
         * otherwise the same as [SnapshotServiceAsync.retrieve].
         */
        fun retrieve(snapshotId: String): CompletableFuture<HttpResponseFor<SnapshotResponse>> =
            retrieve(snapshotId, SnapshotRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            snapshotId: String,
            params: SnapshotRetrieveParams = SnapshotRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotResponse>> =
            retrieve(params.toBuilder().snapshotId(snapshotId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            snapshotId: String,
            params: SnapshotRetrieveParams = SnapshotRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotResponse>> =
            retrieve(snapshotId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: SnapshotRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotResponse>>

        /** @see retrieve */
        fun retrieve(
            params: SnapshotRetrieveParams
        ): CompletableFuture<HttpResponseFor<SnapshotResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            snapshotId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SnapshotResponse>> =
            retrieve(snapshotId, SnapshotRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v2/sandboxes/snapshots`, but is otherwise the
         * same as [SnapshotServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SnapshotListResponse>> =
            list(SnapshotListParams.none())

        /** @see list */
        fun list(
            params: SnapshotListParams = SnapshotListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotListResponse>>

        /** @see list */
        fun list(
            params: SnapshotListParams = SnapshotListParams.none()
        ): CompletableFuture<HttpResponseFor<SnapshotListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SnapshotListResponse>> =
            list(SnapshotListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v2/sandboxes/snapshots/{snapshot_id}`, but
         * is otherwise the same as [SnapshotServiceAsync.delete].
         */
        fun delete(snapshotId: String): CompletableFuture<HttpResponse> =
            delete(snapshotId, SnapshotDeleteParams.none())

        /** @see delete */
        fun delete(
            snapshotId: String,
            params: SnapshotDeleteParams = SnapshotDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().snapshotId(snapshotId).build(), requestOptions)

        /** @see delete */
        fun delete(
            snapshotId: String,
            params: SnapshotDeleteParams = SnapshotDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(snapshotId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SnapshotDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: SnapshotDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            snapshotId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(snapshotId, SnapshotDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v2/sandboxes/snapshots-by-name/{name}`, but is
         * otherwise the same as [SnapshotServiceAsync.retrieveByName].
         */
        fun retrieveByName(
            name: String
        ): CompletableFuture<HttpResponseFor<SnapshotRetrieveByNameResponse>> =
            retrieveByName(name, SnapshotRetrieveByNameParams.none())

        /** @see retrieveByName */
        fun retrieveByName(
            name: String,
            params: SnapshotRetrieveByNameParams = SnapshotRetrieveByNameParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotRetrieveByNameResponse>> =
            retrieveByName(params.toBuilder().name(name).build(), requestOptions)

        /** @see retrieveByName */
        fun retrieveByName(
            name: String,
            params: SnapshotRetrieveByNameParams = SnapshotRetrieveByNameParams.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotRetrieveByNameResponse>> =
            retrieveByName(name, params, RequestOptions.none())

        /** @see retrieveByName */
        fun retrieveByName(
            params: SnapshotRetrieveByNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotRetrieveByNameResponse>>

        /** @see retrieveByName */
        fun retrieveByName(
            params: SnapshotRetrieveByNameParams
        ): CompletableFuture<HttpResponseFor<SnapshotRetrieveByNameResponse>> =
            retrieveByName(params, RequestOptions.none())

        /** @see retrieveByName */
        fun retrieveByName(
            name: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SnapshotRetrieveByNameResponse>> =
            retrieveByName(name, SnapshotRetrieveByNameParams.none(), requestOptions)
    }
}

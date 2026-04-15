// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.sandboxes

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
    fun create(params: SnapshotCreateParams): CompletableFuture<SnapshotCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SnapshotCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SnapshotCreateResponse>

    /** Get a sandbox snapshot by ID. */
    fun retrieve(snapshotId: String): CompletableFuture<SnapshotRetrieveResponse> =
        retrieve(snapshotId, SnapshotRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        snapshotId: String,
        params: SnapshotRetrieveParams = SnapshotRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SnapshotRetrieveResponse> =
        retrieve(params.toBuilder().snapshotId(snapshotId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        snapshotId: String,
        params: SnapshotRetrieveParams = SnapshotRetrieveParams.none(),
    ): CompletableFuture<SnapshotRetrieveResponse> =
        retrieve(snapshotId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SnapshotRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SnapshotRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: SnapshotRetrieveParams): CompletableFuture<SnapshotRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        snapshotId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SnapshotRetrieveResponse> =
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

    /** Delete a snapshot by ID. The ext4 rootfs is removed from JuiceFS asynchronously. */
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
         * Returns a raw HTTP response for `post /v2/sandboxes/snapshots`, but is otherwise the same
         * as [SnapshotServiceAsync.create].
         */
        fun create(
            params: SnapshotCreateParams
        ): CompletableFuture<HttpResponseFor<SnapshotCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SnapshotCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v2/sandboxes/snapshots/{snapshot_id}`, but is
         * otherwise the same as [SnapshotServiceAsync.retrieve].
         */
        fun retrieve(
            snapshotId: String
        ): CompletableFuture<HttpResponseFor<SnapshotRetrieveResponse>> =
            retrieve(snapshotId, SnapshotRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            snapshotId: String,
            params: SnapshotRetrieveParams = SnapshotRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotRetrieveResponse>> =
            retrieve(params.toBuilder().snapshotId(snapshotId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            snapshotId: String,
            params: SnapshotRetrieveParams = SnapshotRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotRetrieveResponse>> =
            retrieve(snapshotId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: SnapshotRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: SnapshotRetrieveParams
        ): CompletableFuture<HttpResponseFor<SnapshotRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            snapshotId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SnapshotRetrieveResponse>> =
            retrieve(snapshotId, SnapshotRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/sandboxes/snapshots`, but is otherwise the same
         * as [SnapshotServiceAsync.list].
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
         * Returns a raw HTTP response for `delete /v2/sandboxes/snapshots/{snapshot_id}`, but is
         * otherwise the same as [SnapshotServiceAsync.delete].
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
    }
}

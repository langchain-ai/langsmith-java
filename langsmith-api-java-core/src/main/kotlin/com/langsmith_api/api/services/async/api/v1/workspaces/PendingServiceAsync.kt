// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.workspaces

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.tenants.AppSchemasTenant
import com.langsmith_api.api.models.api.v1.workspaces.pending.PendingClaimParams
import com.langsmith_api.api.models.api.v1.workspaces.pending.PendingClaimResponse
import com.langsmith_api.api.models.api.v1.workspaces.pending.PendingDeleteParams
import com.langsmith_api.api.models.api.v1.workspaces.pending.PendingDeleteResponse
import com.langsmith_api.api.models.api.v1.workspaces.pending.PendingListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PendingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PendingServiceAsync

    /** Get all workspaces visible to this auth */
    fun list(): CompletableFuture<List<AppSchemasTenant>> = list(PendingListParams.none())

    /** @see list */
    fun list(
        params: PendingListParams = PendingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<AppSchemasTenant>>

    /** @see list */
    fun list(
        params: PendingListParams = PendingListParams.none()
    ): CompletableFuture<List<AppSchemasTenant>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<AppSchemasTenant>> =
        list(PendingListParams.none(), requestOptions)

    /** Delete Pending Workspace Invite */
    fun delete(id: String): CompletableFuture<PendingDeleteResponse> =
        delete(id, PendingDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: PendingDeleteParams = PendingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PendingDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: PendingDeleteParams = PendingDeleteParams.none(),
    ): CompletableFuture<PendingDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PendingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PendingDeleteResponse>

    /** @see delete */
    fun delete(params: PendingDeleteParams): CompletableFuture<PendingDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PendingDeleteResponse> =
        delete(id, PendingDeleteParams.none(), requestOptions)

    /** Claim Pending Workspace Invite */
    @Deprecated("deprecated")
    fun claim(workspaceId: String): CompletableFuture<PendingClaimResponse> =
        claim(workspaceId, PendingClaimParams.none())

    /** @see claim */
    @Deprecated("deprecated")
    fun claim(
        workspaceId: String,
        params: PendingClaimParams = PendingClaimParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PendingClaimResponse> =
        claim(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

    /** @see claim */
    @Deprecated("deprecated")
    fun claim(
        workspaceId: String,
        params: PendingClaimParams = PendingClaimParams.none(),
    ): CompletableFuture<PendingClaimResponse> = claim(workspaceId, params, RequestOptions.none())

    /** @see claim */
    @Deprecated("deprecated")
    fun claim(
        params: PendingClaimParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PendingClaimResponse>

    /** @see claim */
    @Deprecated("deprecated")
    fun claim(params: PendingClaimParams): CompletableFuture<PendingClaimResponse> =
        claim(params, RequestOptions.none())

    /** @see claim */
    @Deprecated("deprecated")
    fun claim(
        workspaceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PendingClaimResponse> =
        claim(workspaceId, PendingClaimParams.none(), requestOptions)

    /**
     * A view of [PendingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PendingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces/pending`, but is otherwise the
         * same as [PendingServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<AppSchemasTenant>>> =
            list(PendingListParams.none())

        /** @see list */
        fun list(
            params: PendingListParams = PendingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<AppSchemasTenant>>>

        /** @see list */
        fun list(
            params: PendingListParams = PendingListParams.none()
        ): CompletableFuture<HttpResponseFor<List<AppSchemasTenant>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<AppSchemasTenant>>> =
            list(PendingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/workspaces/pending/{id}`, but is
         * otherwise the same as [PendingServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<PendingDeleteResponse>> =
            delete(id, PendingDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: PendingDeleteParams = PendingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PendingDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: PendingDeleteParams = PendingDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<PendingDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PendingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PendingDeleteResponse>>

        /** @see delete */
        fun delete(
            params: PendingDeleteParams
        ): CompletableFuture<HttpResponseFor<PendingDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PendingDeleteResponse>> =
            delete(id, PendingDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/workspaces/pending/{workspace_id}/claim`,
         * but is otherwise the same as [PendingServiceAsync.claim].
         */
        @Deprecated("deprecated")
        fun claim(workspaceId: String): CompletableFuture<HttpResponseFor<PendingClaimResponse>> =
            claim(workspaceId, PendingClaimParams.none())

        /** @see claim */
        @Deprecated("deprecated")
        fun claim(
            workspaceId: String,
            params: PendingClaimParams = PendingClaimParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PendingClaimResponse>> =
            claim(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

        /** @see claim */
        @Deprecated("deprecated")
        fun claim(
            workspaceId: String,
            params: PendingClaimParams = PendingClaimParams.none(),
        ): CompletableFuture<HttpResponseFor<PendingClaimResponse>> =
            claim(workspaceId, params, RequestOptions.none())

        /** @see claim */
        @Deprecated("deprecated")
        fun claim(
            params: PendingClaimParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PendingClaimResponse>>

        /** @see claim */
        @Deprecated("deprecated")
        fun claim(
            params: PendingClaimParams
        ): CompletableFuture<HttpResponseFor<PendingClaimResponse>> =
            claim(params, RequestOptions.none())

        /** @see claim */
        @Deprecated("deprecated")
        fun claim(
            workspaceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PendingClaimResponse>> =
            claim(workspaceId, PendingClaimParams.none(), requestOptions)
    }
}

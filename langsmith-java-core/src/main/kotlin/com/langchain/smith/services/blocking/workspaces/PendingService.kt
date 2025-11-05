// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.workspaces

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.tenants.AppSchemasTenant
import com.langchain.smith.models.workspaces.pending.PendingClaimParams
import com.langchain.smith.models.workspaces.pending.PendingClaimResponse
import com.langchain.smith.models.workspaces.pending.PendingDeleteParams
import com.langchain.smith.models.workspaces.pending.PendingDeleteResponse
import com.langchain.smith.models.workspaces.pending.PendingListParams
import java.util.function.Consumer

interface PendingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PendingService

    /** Get all workspaces visible to this auth */
    fun list(): List<AppSchemasTenant> = list(PendingListParams.none())

    /** @see list */
    fun list(
        params: PendingListParams = PendingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AppSchemasTenant>

    /** @see list */
    fun list(params: PendingListParams = PendingListParams.none()): List<AppSchemasTenant> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<AppSchemasTenant> =
        list(PendingListParams.none(), requestOptions)

    /** Delete Pending Workspace Invite */
    fun delete(id: String): PendingDeleteResponse = delete(id, PendingDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: PendingDeleteParams = PendingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PendingDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: PendingDeleteParams = PendingDeleteParams.none(),
    ): PendingDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PendingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PendingDeleteResponse

    /** @see delete */
    fun delete(params: PendingDeleteParams): PendingDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): PendingDeleteResponse =
        delete(id, PendingDeleteParams.none(), requestOptions)

    /** Claim Pending Workspace Invite */
    @Deprecated("deprecated")
    fun claim(workspaceId: String): PendingClaimResponse =
        claim(workspaceId, PendingClaimParams.none())

    /** @see claim */
    @Deprecated("deprecated")
    fun claim(
        workspaceId: String,
        params: PendingClaimParams = PendingClaimParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PendingClaimResponse =
        claim(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

    /** @see claim */
    @Deprecated("deprecated")
    fun claim(
        workspaceId: String,
        params: PendingClaimParams = PendingClaimParams.none(),
    ): PendingClaimResponse = claim(workspaceId, params, RequestOptions.none())

    /** @see claim */
    @Deprecated("deprecated")
    fun claim(
        params: PendingClaimParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PendingClaimResponse

    /** @see claim */
    @Deprecated("deprecated")
    fun claim(params: PendingClaimParams): PendingClaimResponse =
        claim(params, RequestOptions.none())

    /** @see claim */
    @Deprecated("deprecated")
    fun claim(workspaceId: String, requestOptions: RequestOptions): PendingClaimResponse =
        claim(workspaceId, PendingClaimParams.none(), requestOptions)

    /** A view of [PendingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PendingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces/pending`, but is otherwise the
         * same as [PendingService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<AppSchemasTenant>> = list(PendingListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PendingListParams = PendingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AppSchemasTenant>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PendingListParams = PendingListParams.none()
        ): HttpResponseFor<List<AppSchemasTenant>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<AppSchemasTenant>> =
            list(PendingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/workspaces/pending/{id}`, but is
         * otherwise the same as [PendingService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<PendingDeleteResponse> =
            delete(id, PendingDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: PendingDeleteParams = PendingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PendingDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: PendingDeleteParams = PendingDeleteParams.none(),
        ): HttpResponseFor<PendingDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PendingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PendingDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: PendingDeleteParams): HttpResponseFor<PendingDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PendingDeleteResponse> =
            delete(id, PendingDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/workspaces/pending/{workspace_id}/claim`,
         * but is otherwise the same as [PendingService.claim].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun claim(workspaceId: String): HttpResponseFor<PendingClaimResponse> =
            claim(workspaceId, PendingClaimParams.none())

        /** @see claim */
        @Deprecated("deprecated")
        @MustBeClosed
        fun claim(
            workspaceId: String,
            params: PendingClaimParams = PendingClaimParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PendingClaimResponse> =
            claim(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

        /** @see claim */
        @Deprecated("deprecated")
        @MustBeClosed
        fun claim(
            workspaceId: String,
            params: PendingClaimParams = PendingClaimParams.none(),
        ): HttpResponseFor<PendingClaimResponse> = claim(workspaceId, params, RequestOptions.none())

        /** @see claim */
        @Deprecated("deprecated")
        @MustBeClosed
        fun claim(
            params: PendingClaimParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PendingClaimResponse>

        /** @see claim */
        @Deprecated("deprecated")
        @MustBeClosed
        fun claim(params: PendingClaimParams): HttpResponseFor<PendingClaimResponse> =
            claim(params, RequestOptions.none())

        /** @see claim */
        @Deprecated("deprecated")
        @MustBeClosed
        fun claim(
            workspaceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PendingClaimResponse> =
            claim(workspaceId, PendingClaimParams.none(), requestOptions)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.workspaces.current.members

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.orgs.current.members.PendingIdentity
import com.langchain.smith.models.workspaces.current.members.pending.PendingDeleteAllParams
import com.langchain.smith.models.workspaces.current.members.pending.PendingDeleteAllResponse
import com.langchain.smith.models.workspaces.current.members.pending.PendingListParams
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

    /** Get Current Pending Workspace Members */
    fun list(): List<PendingIdentity> = list(PendingListParams.none())

    /** @see list */
    fun list(
        params: PendingListParams = PendingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<PendingIdentity>

    /** @see list */
    fun list(params: PendingListParams = PendingListParams.none()): List<PendingIdentity> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<PendingIdentity> =
        list(PendingListParams.none(), requestOptions)

    /** Delete Current Workspace Pending Member */
    fun deleteAll(identityId: String): PendingDeleteAllResponse =
        deleteAll(identityId, PendingDeleteAllParams.none())

    /** @see deleteAll */
    fun deleteAll(
        identityId: String,
        params: PendingDeleteAllParams = PendingDeleteAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PendingDeleteAllResponse =
        deleteAll(params.toBuilder().identityId(identityId).build(), requestOptions)

    /** @see deleteAll */
    fun deleteAll(
        identityId: String,
        params: PendingDeleteAllParams = PendingDeleteAllParams.none(),
    ): PendingDeleteAllResponse = deleteAll(identityId, params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        params: PendingDeleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PendingDeleteAllResponse

    /** @see deleteAll */
    fun deleteAll(params: PendingDeleteAllParams): PendingDeleteAllResponse =
        deleteAll(params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(identityId: String, requestOptions: RequestOptions): PendingDeleteAllResponse =
        deleteAll(identityId, PendingDeleteAllParams.none(), requestOptions)

    /** A view of [PendingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PendingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces/current/members/pending`, but is
         * otherwise the same as [PendingService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<PendingIdentity>> = list(PendingListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PendingListParams = PendingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<PendingIdentity>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PendingListParams = PendingListParams.none()
        ): HttpResponseFor<List<PendingIdentity>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<PendingIdentity>> =
            list(PendingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/workspaces/current/members/{identity_id}/pending`, but is otherwise the same as
         * [PendingService.deleteAll].
         */
        @MustBeClosed
        fun deleteAll(identityId: String): HttpResponseFor<PendingDeleteAllResponse> =
            deleteAll(identityId, PendingDeleteAllParams.none())

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            identityId: String,
            params: PendingDeleteAllParams = PendingDeleteAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PendingDeleteAllResponse> =
            deleteAll(params.toBuilder().identityId(identityId).build(), requestOptions)

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            identityId: String,
            params: PendingDeleteAllParams = PendingDeleteAllParams.none(),
        ): HttpResponseFor<PendingDeleteAllResponse> =
            deleteAll(identityId, params, RequestOptions.none())

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            params: PendingDeleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PendingDeleteAllResponse>

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(params: PendingDeleteAllParams): HttpResponseFor<PendingDeleteAllResponse> =
            deleteAll(params, RequestOptions.none())

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            identityId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PendingDeleteAllResponse> =
            deleteAll(identityId, PendingDeleteAllParams.none(), requestOptions)
    }
}

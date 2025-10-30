// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.orgs.current.members

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.orgs.current.members.pending.OrgPendingIdentity
import com.langsmith_api.api.models.api.v1.orgs.current.members.pending.PendingDeleteAllParams
import com.langsmith_api.api.models.api.v1.orgs.current.members.pending.PendingDeleteAllResponse
import com.langsmith_api.api.models.api.v1.orgs.current.members.pending.PendingListParams
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

    /** Get Current Pending Org Members */
    fun list(): List<OrgPendingIdentity> = list(PendingListParams.none())

    /** @see list */
    fun list(
        params: PendingListParams = PendingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<OrgPendingIdentity>

    /** @see list */
    fun list(params: PendingListParams = PendingListParams.none()): List<OrgPendingIdentity> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<OrgPendingIdentity> =
        list(PendingListParams.none(), requestOptions)

    /** When an admin deletes a pending member invite. */
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
         * Returns a raw HTTP response for `get /api/v1/orgs/current/members/pending`, but is
         * otherwise the same as [PendingService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<OrgPendingIdentity>> = list(PendingListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PendingListParams = PendingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<OrgPendingIdentity>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PendingListParams = PendingListParams.none()
        ): HttpResponseFor<List<OrgPendingIdentity>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<OrgPendingIdentity>> =
            list(PendingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/orgs/current/members/{identity_id}/pending`, but is otherwise the same as
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

// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.orgs.current.members

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.orgs.current.members.pending.OrgPendingIdentity
import com.langchain.smith.models.orgs.current.members.pending.PendingDeleteAllParams
import com.langchain.smith.models.orgs.current.members.pending.PendingDeleteAllResponse
import com.langchain.smith.models.orgs.current.members.pending.PendingListParams
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

    /** Get Current Pending Org Members */
    fun list(): CompletableFuture<List<OrgPendingIdentity>> = list(PendingListParams.none())

    /** @see list */
    fun list(
        params: PendingListParams = PendingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<OrgPendingIdentity>>

    /** @see list */
    fun list(
        params: PendingListParams = PendingListParams.none()
    ): CompletableFuture<List<OrgPendingIdentity>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<OrgPendingIdentity>> =
        list(PendingListParams.none(), requestOptions)

    /** When an admin deletes a pending member invite. */
    fun deleteAll(identityId: String): CompletableFuture<PendingDeleteAllResponse> =
        deleteAll(identityId, PendingDeleteAllParams.none())

    /** @see deleteAll */
    fun deleteAll(
        identityId: String,
        params: PendingDeleteAllParams = PendingDeleteAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PendingDeleteAllResponse> =
        deleteAll(params.toBuilder().identityId(identityId).build(), requestOptions)

    /** @see deleteAll */
    fun deleteAll(
        identityId: String,
        params: PendingDeleteAllParams = PendingDeleteAllParams.none(),
    ): CompletableFuture<PendingDeleteAllResponse> =
        deleteAll(identityId, params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        params: PendingDeleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PendingDeleteAllResponse>

    /** @see deleteAll */
    fun deleteAll(params: PendingDeleteAllParams): CompletableFuture<PendingDeleteAllResponse> =
        deleteAll(params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        identityId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PendingDeleteAllResponse> =
        deleteAll(identityId, PendingDeleteAllParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get /api/v1/orgs/current/members/pending`, but is
         * otherwise the same as [PendingServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<OrgPendingIdentity>>> =
            list(PendingListParams.none())

        /** @see list */
        fun list(
            params: PendingListParams = PendingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<OrgPendingIdentity>>>

        /** @see list */
        fun list(
            params: PendingListParams = PendingListParams.none()
        ): CompletableFuture<HttpResponseFor<List<OrgPendingIdentity>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<OrgPendingIdentity>>> =
            list(PendingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/orgs/current/members/{identity_id}/pending`, but is otherwise the same as
         * [PendingServiceAsync.deleteAll].
         */
        fun deleteAll(
            identityId: String
        ): CompletableFuture<HttpResponseFor<PendingDeleteAllResponse>> =
            deleteAll(identityId, PendingDeleteAllParams.none())

        /** @see deleteAll */
        fun deleteAll(
            identityId: String,
            params: PendingDeleteAllParams = PendingDeleteAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PendingDeleteAllResponse>> =
            deleteAll(params.toBuilder().identityId(identityId).build(), requestOptions)

        /** @see deleteAll */
        fun deleteAll(
            identityId: String,
            params: PendingDeleteAllParams = PendingDeleteAllParams.none(),
        ): CompletableFuture<HttpResponseFor<PendingDeleteAllResponse>> =
            deleteAll(identityId, params, RequestOptions.none())

        /** @see deleteAll */
        fun deleteAll(
            params: PendingDeleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PendingDeleteAllResponse>>

        /** @see deleteAll */
        fun deleteAll(
            params: PendingDeleteAllParams
        ): CompletableFuture<HttpResponseFor<PendingDeleteAllResponse>> =
            deleteAll(params, RequestOptions.none())

        /** @see deleteAll */
        fun deleteAll(
            identityId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PendingDeleteAllResponse>> =
            deleteAll(identityId, PendingDeleteAllParams.none(), requestOptions)
    }
}

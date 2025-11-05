// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.orgs.current

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.orgs.current.members.MemberBatchParams
import com.langchain.smith.models.orgs.current.members.MemberCreateParams
import com.langchain.smith.models.orgs.current.members.MemberDeleteParams
import com.langchain.smith.models.orgs.current.members.MemberDeleteResponse
import com.langchain.smith.models.orgs.current.members.MemberListParams
import com.langchain.smith.models.orgs.current.members.MemberListResponse
import com.langchain.smith.models.orgs.current.members.MemberRetrieveActiveParams
import com.langchain.smith.models.orgs.current.members.MemberUpdateParams
import com.langchain.smith.models.orgs.current.members.MemberUpdateResponse
import com.langchain.smith.models.orgs.current.members.OrgMemberIdentity
import com.langchain.smith.models.orgs.current.members.PendingIdentity
import com.langchain.smith.models.orgs.current.members.PendingIdentityCreate
import com.langchain.smith.services.async.orgs.current.members.BasicServiceAsync
import com.langchain.smith.services.async.orgs.current.members.PendingServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MemberServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MemberServiceAsync

    fun pending(): PendingServiceAsync

    fun basic(): BasicServiceAsync

    /** Add Member To Current Org */
    fun create(params: MemberCreateParams): CompletableFuture<PendingIdentity> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MemberCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PendingIdentity>

    /** @see create */
    fun create(
        pendingIdentityCreate: PendingIdentityCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PendingIdentity> =
        create(
            MemberCreateParams.builder().pendingIdentityCreate(pendingIdentityCreate).build(),
            requestOptions,
        )

    /** @see create */
    fun create(pendingIdentityCreate: PendingIdentityCreate): CompletableFuture<PendingIdentity> =
        create(pendingIdentityCreate, RequestOptions.none())

    /**
     * This is used for updating a user's role (all auth modes) or full_name/password (basic auth)
     */
    fun update(identityId: String): CompletableFuture<MemberUpdateResponse> =
        update(identityId, MemberUpdateParams.none())

    /** @see update */
    fun update(
        identityId: String,
        params: MemberUpdateParams = MemberUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MemberUpdateResponse> =
        update(params.toBuilder().identityId(identityId).build(), requestOptions)

    /** @see update */
    fun update(
        identityId: String,
        params: MemberUpdateParams = MemberUpdateParams.none(),
    ): CompletableFuture<MemberUpdateResponse> = update(identityId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MemberUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MemberUpdateResponse>

    /** @see update */
    fun update(params: MemberUpdateParams): CompletableFuture<MemberUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        identityId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MemberUpdateResponse> =
        update(identityId, MemberUpdateParams.none(), requestOptions)

    /** Get Current Org Members */
    fun list(): CompletableFuture<MemberListResponse> = list(MemberListParams.none())

    /** @see list */
    fun list(
        params: MemberListParams = MemberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MemberListResponse>

    /** @see list */
    fun list(
        params: MemberListParams = MemberListParams.none()
    ): CompletableFuture<MemberListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<MemberListResponse> =
        list(MemberListParams.none(), requestOptions)

    /** Remove a user from the current organization. */
    fun delete(identityId: String): CompletableFuture<MemberDeleteResponse> =
        delete(identityId, MemberDeleteParams.none())

    /** @see delete */
    fun delete(
        identityId: String,
        params: MemberDeleteParams = MemberDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MemberDeleteResponse> =
        delete(params.toBuilder().identityId(identityId).build(), requestOptions)

    /** @see delete */
    fun delete(
        identityId: String,
        params: MemberDeleteParams = MemberDeleteParams.none(),
    ): CompletableFuture<MemberDeleteResponse> = delete(identityId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MemberDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MemberDeleteResponse>

    /** @see delete */
    fun delete(params: MemberDeleteParams): CompletableFuture<MemberDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        identityId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MemberDeleteResponse> =
        delete(identityId, MemberDeleteParams.none(), requestOptions)

    /** Batch invite up to 500 users to the current org. */
    fun batch(params: MemberBatchParams): CompletableFuture<List<PendingIdentity>> =
        batch(params, RequestOptions.none())

    /** @see batch */
    fun batch(
        params: MemberBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<PendingIdentity>>

    /** Get Current Active Org Members */
    fun retrieveActive(): CompletableFuture<List<OrgMemberIdentity>> =
        retrieveActive(MemberRetrieveActiveParams.none())

    /** @see retrieveActive */
    fun retrieveActive(
        params: MemberRetrieveActiveParams = MemberRetrieveActiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<OrgMemberIdentity>>

    /** @see retrieveActive */
    fun retrieveActive(
        params: MemberRetrieveActiveParams = MemberRetrieveActiveParams.none()
    ): CompletableFuture<List<OrgMemberIdentity>> = retrieveActive(params, RequestOptions.none())

    /** @see retrieveActive */
    fun retrieveActive(requestOptions: RequestOptions): CompletableFuture<List<OrgMemberIdentity>> =
        retrieveActive(MemberRetrieveActiveParams.none(), requestOptions)

    /**
     * A view of [MemberServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MemberServiceAsync.WithRawResponse

        fun pending(): PendingServiceAsync.WithRawResponse

        fun basic(): BasicServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/orgs/current/members`, but is otherwise the
         * same as [MemberServiceAsync.create].
         */
        fun create(
            params: MemberCreateParams
        ): CompletableFuture<HttpResponseFor<PendingIdentity>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: MemberCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PendingIdentity>>

        /** @see create */
        fun create(
            pendingIdentityCreate: PendingIdentityCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PendingIdentity>> =
            create(
                MemberCreateParams.builder().pendingIdentityCreate(pendingIdentityCreate).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            pendingIdentityCreate: PendingIdentityCreate
        ): CompletableFuture<HttpResponseFor<PendingIdentity>> =
            create(pendingIdentityCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /api/v1/orgs/current/members/{identity_id}`, but
         * is otherwise the same as [MemberServiceAsync.update].
         */
        fun update(identityId: String): CompletableFuture<HttpResponseFor<MemberUpdateResponse>> =
            update(identityId, MemberUpdateParams.none())

        /** @see update */
        fun update(
            identityId: String,
            params: MemberUpdateParams = MemberUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MemberUpdateResponse>> =
            update(params.toBuilder().identityId(identityId).build(), requestOptions)

        /** @see update */
        fun update(
            identityId: String,
            params: MemberUpdateParams = MemberUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<MemberUpdateResponse>> =
            update(identityId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: MemberUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MemberUpdateResponse>>

        /** @see update */
        fun update(
            params: MemberUpdateParams
        ): CompletableFuture<HttpResponseFor<MemberUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            identityId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MemberUpdateResponse>> =
            update(identityId, MemberUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/orgs/current/members`, but is otherwise the
         * same as [MemberServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MemberListResponse>> =
            list(MemberListParams.none())

        /** @see list */
        fun list(
            params: MemberListParams = MemberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MemberListResponse>>

        /** @see list */
        fun list(
            params: MemberListParams = MemberListParams.none()
        ): CompletableFuture<HttpResponseFor<MemberListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MemberListResponse>> =
            list(MemberListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/orgs/current/members/{identity_id}`, but
         * is otherwise the same as [MemberServiceAsync.delete].
         */
        fun delete(identityId: String): CompletableFuture<HttpResponseFor<MemberDeleteResponse>> =
            delete(identityId, MemberDeleteParams.none())

        /** @see delete */
        fun delete(
            identityId: String,
            params: MemberDeleteParams = MemberDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MemberDeleteResponse>> =
            delete(params.toBuilder().identityId(identityId).build(), requestOptions)

        /** @see delete */
        fun delete(
            identityId: String,
            params: MemberDeleteParams = MemberDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<MemberDeleteResponse>> =
            delete(identityId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: MemberDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MemberDeleteResponse>>

        /** @see delete */
        fun delete(
            params: MemberDeleteParams
        ): CompletableFuture<HttpResponseFor<MemberDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            identityId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MemberDeleteResponse>> =
            delete(identityId, MemberDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/orgs/current/members/batch`, but is
         * otherwise the same as [MemberServiceAsync.batch].
         */
        fun batch(
            params: MemberBatchParams
        ): CompletableFuture<HttpResponseFor<List<PendingIdentity>>> =
            batch(params, RequestOptions.none())

        /** @see batch */
        fun batch(
            params: MemberBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<PendingIdentity>>>

        /**
         * Returns a raw HTTP response for `get /api/v1/orgs/current/members/active`, but is
         * otherwise the same as [MemberServiceAsync.retrieveActive].
         */
        fun retrieveActive(): CompletableFuture<HttpResponseFor<List<OrgMemberIdentity>>> =
            retrieveActive(MemberRetrieveActiveParams.none())

        /** @see retrieveActive */
        fun retrieveActive(
            params: MemberRetrieveActiveParams = MemberRetrieveActiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<OrgMemberIdentity>>>

        /** @see retrieveActive */
        fun retrieveActive(
            params: MemberRetrieveActiveParams = MemberRetrieveActiveParams.none()
        ): CompletableFuture<HttpResponseFor<List<OrgMemberIdentity>>> =
            retrieveActive(params, RequestOptions.none())

        /** @see retrieveActive */
        fun retrieveActive(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<OrgMemberIdentity>>> =
            retrieveActive(MemberRetrieveActiveParams.none(), requestOptions)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.orgs.current

import com.google.errorprone.annotations.MustBeClosed
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
import com.langchain.smith.services.blocking.orgs.current.members.BasicService
import com.langchain.smith.services.blocking.orgs.current.members.PendingService
import java.util.function.Consumer

interface MemberService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MemberService

    fun pending(): PendingService

    fun basic(): BasicService

    /** Add Member To Current Org */
    fun create(params: MemberCreateParams): PendingIdentity = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MemberCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PendingIdentity

    /** @see create */
    fun create(
        pendingIdentityCreate: PendingIdentityCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PendingIdentity =
        create(
            MemberCreateParams.builder().pendingIdentityCreate(pendingIdentityCreate).build(),
            requestOptions,
        )

    /** @see create */
    fun create(pendingIdentityCreate: PendingIdentityCreate): PendingIdentity =
        create(pendingIdentityCreate, RequestOptions.none())

    /**
     * This is used for updating a user's role (all auth modes) or full_name/password (basic auth)
     */
    fun update(identityId: String): MemberUpdateResponse =
        update(identityId, MemberUpdateParams.none())

    /** @see update */
    fun update(
        identityId: String,
        params: MemberUpdateParams = MemberUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MemberUpdateResponse =
        update(params.toBuilder().identityId(identityId).build(), requestOptions)

    /** @see update */
    fun update(
        identityId: String,
        params: MemberUpdateParams = MemberUpdateParams.none(),
    ): MemberUpdateResponse = update(identityId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MemberUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MemberUpdateResponse

    /** @see update */
    fun update(params: MemberUpdateParams): MemberUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(identityId: String, requestOptions: RequestOptions): MemberUpdateResponse =
        update(identityId, MemberUpdateParams.none(), requestOptions)

    /** Get Current Org Members */
    fun list(): MemberListResponse = list(MemberListParams.none())

    /** @see list */
    fun list(
        params: MemberListParams = MemberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MemberListResponse

    /** @see list */
    fun list(params: MemberListParams = MemberListParams.none()): MemberListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MemberListResponse =
        list(MemberListParams.none(), requestOptions)

    /** Remove a user from the current organization. */
    fun delete(identityId: String): MemberDeleteResponse =
        delete(identityId, MemberDeleteParams.none())

    /** @see delete */
    fun delete(
        identityId: String,
        params: MemberDeleteParams = MemberDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MemberDeleteResponse =
        delete(params.toBuilder().identityId(identityId).build(), requestOptions)

    /** @see delete */
    fun delete(
        identityId: String,
        params: MemberDeleteParams = MemberDeleteParams.none(),
    ): MemberDeleteResponse = delete(identityId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MemberDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MemberDeleteResponse

    /** @see delete */
    fun delete(params: MemberDeleteParams): MemberDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(identityId: String, requestOptions: RequestOptions): MemberDeleteResponse =
        delete(identityId, MemberDeleteParams.none(), requestOptions)

    /** Batch invite up to 500 users to the current org. */
    fun batch(params: MemberBatchParams): List<PendingIdentity> =
        batch(params, RequestOptions.none())

    /** @see batch */
    fun batch(
        params: MemberBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<PendingIdentity>

    /** Get Current Active Org Members */
    fun retrieveActive(): List<OrgMemberIdentity> =
        retrieveActive(MemberRetrieveActiveParams.none())

    /** @see retrieveActive */
    fun retrieveActive(
        params: MemberRetrieveActiveParams = MemberRetrieveActiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<OrgMemberIdentity>

    /** @see retrieveActive */
    fun retrieveActive(
        params: MemberRetrieveActiveParams = MemberRetrieveActiveParams.none()
    ): List<OrgMemberIdentity> = retrieveActive(params, RequestOptions.none())

    /** @see retrieveActive */
    fun retrieveActive(requestOptions: RequestOptions): List<OrgMemberIdentity> =
        retrieveActive(MemberRetrieveActiveParams.none(), requestOptions)

    /** A view of [MemberService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MemberService.WithRawResponse

        fun pending(): PendingService.WithRawResponse

        fun basic(): BasicService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/orgs/current/members`, but is otherwise the
         * same as [MemberService.create].
         */
        @MustBeClosed
        fun create(params: MemberCreateParams): HttpResponseFor<PendingIdentity> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: MemberCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PendingIdentity>

        /** @see create */
        @MustBeClosed
        fun create(
            pendingIdentityCreate: PendingIdentityCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PendingIdentity> =
            create(
                MemberCreateParams.builder().pendingIdentityCreate(pendingIdentityCreate).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(pendingIdentityCreate: PendingIdentityCreate): HttpResponseFor<PendingIdentity> =
            create(pendingIdentityCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /api/v1/orgs/current/members/{identity_id}`, but
         * is otherwise the same as [MemberService.update].
         */
        @MustBeClosed
        fun update(identityId: String): HttpResponseFor<MemberUpdateResponse> =
            update(identityId, MemberUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            identityId: String,
            params: MemberUpdateParams = MemberUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MemberUpdateResponse> =
            update(params.toBuilder().identityId(identityId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            identityId: String,
            params: MemberUpdateParams = MemberUpdateParams.none(),
        ): HttpResponseFor<MemberUpdateResponse> = update(identityId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: MemberUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MemberUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: MemberUpdateParams): HttpResponseFor<MemberUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            identityId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MemberUpdateResponse> =
            update(identityId, MemberUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/orgs/current/members`, but is otherwise the
         * same as [MemberService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<MemberListResponse> = list(MemberListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MemberListParams = MemberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MemberListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MemberListParams = MemberListParams.none()
        ): HttpResponseFor<MemberListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MemberListResponse> =
            list(MemberListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/orgs/current/members/{identity_id}`, but
         * is otherwise the same as [MemberService.delete].
         */
        @MustBeClosed
        fun delete(identityId: String): HttpResponseFor<MemberDeleteResponse> =
            delete(identityId, MemberDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            identityId: String,
            params: MemberDeleteParams = MemberDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MemberDeleteResponse> =
            delete(params.toBuilder().identityId(identityId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            identityId: String,
            params: MemberDeleteParams = MemberDeleteParams.none(),
        ): HttpResponseFor<MemberDeleteResponse> = delete(identityId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: MemberDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MemberDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: MemberDeleteParams): HttpResponseFor<MemberDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            identityId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MemberDeleteResponse> =
            delete(identityId, MemberDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/orgs/current/members/batch`, but is
         * otherwise the same as [MemberService.batch].
         */
        @MustBeClosed
        fun batch(params: MemberBatchParams): HttpResponseFor<List<PendingIdentity>> =
            batch(params, RequestOptions.none())

        /** @see batch */
        @MustBeClosed
        fun batch(
            params: MemberBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<PendingIdentity>>

        /**
         * Returns a raw HTTP response for `get /api/v1/orgs/current/members/active`, but is
         * otherwise the same as [MemberService.retrieveActive].
         */
        @MustBeClosed
        fun retrieveActive(): HttpResponseFor<List<OrgMemberIdentity>> =
            retrieveActive(MemberRetrieveActiveParams.none())

        /** @see retrieveActive */
        @MustBeClosed
        fun retrieveActive(
            params: MemberRetrieveActiveParams = MemberRetrieveActiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<OrgMemberIdentity>>

        /** @see retrieveActive */
        @MustBeClosed
        fun retrieveActive(
            params: MemberRetrieveActiveParams = MemberRetrieveActiveParams.none()
        ): HttpResponseFor<List<OrgMemberIdentity>> = retrieveActive(params, RequestOptions.none())

        /** @see retrieveActive */
        @MustBeClosed
        fun retrieveActive(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<OrgMemberIdentity>> =
            retrieveActive(MemberRetrieveActiveParams.none(), requestOptions)
    }
}

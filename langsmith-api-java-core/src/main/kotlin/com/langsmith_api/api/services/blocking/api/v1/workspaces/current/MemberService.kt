// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.workspaces.current

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.orgs.current.members.PendingIdentity
import com.langsmith_api.api.models.api.v1.orgs.pending.Identity
import com.langsmith_api.api.models.api.v1.workspaces.current.members.MemberBatchParams
import com.langsmith_api.api.models.api.v1.workspaces.current.members.MemberCreateParams
import com.langsmith_api.api.models.api.v1.workspaces.current.members.MemberDeleteParams
import com.langsmith_api.api.models.api.v1.workspaces.current.members.MemberDeleteResponse
import com.langsmith_api.api.models.api.v1.workspaces.current.members.MemberIdentity
import com.langsmith_api.api.models.api.v1.workspaces.current.members.MemberListParams
import com.langsmith_api.api.models.api.v1.workspaces.current.members.MemberListResponse
import com.langsmith_api.api.models.api.v1.workspaces.current.members.MemberRetrieveActiveParams
import com.langsmith_api.api.models.api.v1.workspaces.current.members.MemberUpdateParams
import com.langsmith_api.api.models.api.v1.workspaces.current.members.MemberUpdateResponse
import com.langsmith_api.api.services.blocking.api.v1.workspaces.current.members.PendingService
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

    /** Add an existing organization member to the current workspace. */
    fun create(): Identity = create(MemberCreateParams.none())

    /** @see create */
    fun create(
        params: MemberCreateParams = MemberCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Identity

    /** @see create */
    fun create(params: MemberCreateParams = MemberCreateParams.none()): Identity =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): Identity =
        create(MemberCreateParams.none(), requestOptions)

    /** Patch Current Workspace Member */
    fun update(identityId: String, params: MemberUpdateParams): MemberUpdateResponse =
        update(identityId, params, RequestOptions.none())

    /** @see update */
    fun update(
        identityId: String,
        params: MemberUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MemberUpdateResponse =
        update(params.toBuilder().identityId(identityId).build(), requestOptions)

    /** @see update */
    fun update(params: MemberUpdateParams): MemberUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MemberUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MemberUpdateResponse

    /** Get Current Workspace Members */
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

    /** Delete Current Workspace Member */
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

    /** Batch invite up to 500 users to the current workspace and organization. */
    fun batch(params: MemberBatchParams): List<PendingIdentity> =
        batch(params, RequestOptions.none())

    /** @see batch */
    fun batch(
        params: MemberBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<PendingIdentity>

    /** Get Current Active Workspace Members */
    fun retrieveActive(): List<MemberIdentity> = retrieveActive(MemberRetrieveActiveParams.none())

    /** @see retrieveActive */
    fun retrieveActive(
        params: MemberRetrieveActiveParams = MemberRetrieveActiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<MemberIdentity>

    /** @see retrieveActive */
    fun retrieveActive(
        params: MemberRetrieveActiveParams = MemberRetrieveActiveParams.none()
    ): List<MemberIdentity> = retrieveActive(params, RequestOptions.none())

    /** @see retrieveActive */
    fun retrieveActive(requestOptions: RequestOptions): List<MemberIdentity> =
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

        /**
         * Returns a raw HTTP response for `post /api/v1/workspaces/current/members`, but is
         * otherwise the same as [MemberService.create].
         */
        @MustBeClosed fun create(): HttpResponseFor<Identity> = create(MemberCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: MemberCreateParams = MemberCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Identity>

        /** @see create */
        @MustBeClosed
        fun create(
            params: MemberCreateParams = MemberCreateParams.none()
        ): HttpResponseFor<Identity> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<Identity> =
            create(MemberCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/workspaces/current/members/{identity_id}`,
         * but is otherwise the same as [MemberService.update].
         */
        @MustBeClosed
        fun update(
            identityId: String,
            params: MemberUpdateParams,
        ): HttpResponseFor<MemberUpdateResponse> = update(identityId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            identityId: String,
            params: MemberUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MemberUpdateResponse> =
            update(params.toBuilder().identityId(identityId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: MemberUpdateParams): HttpResponseFor<MemberUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: MemberUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MemberUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces/current/members`, but is
         * otherwise the same as [MemberService.list].
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
         * Returns a raw HTTP response for `delete
         * /api/v1/workspaces/current/members/{identity_id}`, but is otherwise the same as
         * [MemberService.delete].
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
         * Returns a raw HTTP response for `post /api/v1/workspaces/current/members/batch`, but is
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
         * Returns a raw HTTP response for `get /api/v1/workspaces/current/members/active`, but is
         * otherwise the same as [MemberService.retrieveActive].
         */
        @MustBeClosed
        fun retrieveActive(): HttpResponseFor<List<MemberIdentity>> =
            retrieveActive(MemberRetrieveActiveParams.none())

        /** @see retrieveActive */
        @MustBeClosed
        fun retrieveActive(
            params: MemberRetrieveActiveParams = MemberRetrieveActiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<MemberIdentity>>

        /** @see retrieveActive */
        @MustBeClosed
        fun retrieveActive(
            params: MemberRetrieveActiveParams = MemberRetrieveActiveParams.none()
        ): HttpResponseFor<List<MemberIdentity>> = retrieveActive(params, RequestOptions.none())

        /** @see retrieveActive */
        @MustBeClosed
        fun retrieveActive(requestOptions: RequestOptions): HttpResponseFor<List<MemberIdentity>> =
            retrieveActive(MemberRetrieveActiveParams.none(), requestOptions)
    }
}

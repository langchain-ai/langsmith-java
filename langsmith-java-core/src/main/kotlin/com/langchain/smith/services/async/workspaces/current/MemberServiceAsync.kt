// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.workspaces.current

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.workspaces.current.members.MemberBatchParams
import com.langchain.smith.models.workspaces.current.members.MemberBatchResponse
import com.langchain.smith.models.workspaces.current.members.MemberCreateParams
import com.langchain.smith.models.workspaces.current.members.MemberCreateResponse
import com.langchain.smith.models.workspaces.current.members.MemberDeleteParams
import com.langchain.smith.models.workspaces.current.members.MemberDeleteResponse
import com.langchain.smith.models.workspaces.current.members.MemberIdentity
import com.langchain.smith.models.workspaces.current.members.MemberListParams
import com.langchain.smith.models.workspaces.current.members.MemberListResponse
import com.langchain.smith.models.workspaces.current.members.MemberRetrieveActiveParams
import com.langchain.smith.models.workspaces.current.members.MemberUpdateParams
import com.langchain.smith.models.workspaces.current.members.MemberUpdateResponse
import com.langchain.smith.services.async.workspaces.current.members.PendingServiceAsync
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

    /** Add an existing organization member to the current workspace. */
    fun create(): CompletableFuture<MemberCreateResponse> = create(MemberCreateParams.none())

    /** @see create */
    fun create(
        params: MemberCreateParams = MemberCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MemberCreateResponse>

    /** @see create */
    fun create(
        params: MemberCreateParams = MemberCreateParams.none()
    ): CompletableFuture<MemberCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<MemberCreateResponse> =
        create(MemberCreateParams.none(), requestOptions)

    /** Patch Current Workspace Member */
    fun update(
        identityId: String,
        params: MemberUpdateParams,
    ): CompletableFuture<MemberUpdateResponse> = update(identityId, params, RequestOptions.none())

    /** @see update */
    fun update(
        identityId: String,
        params: MemberUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MemberUpdateResponse> =
        update(params.toBuilder().identityId(identityId).build(), requestOptions)

    /** @see update */
    fun update(params: MemberUpdateParams): CompletableFuture<MemberUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MemberUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MemberUpdateResponse>

    /** Get Current Workspace Members */
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

    /** Delete Current Workspace Member */
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

    /** Batch invite up to 500 users to the current workspace and organization. */
    fun batch(params: MemberBatchParams): CompletableFuture<List<MemberBatchResponse>> =
        batch(params, RequestOptions.none())

    /** @see batch */
    fun batch(
        params: MemberBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<MemberBatchResponse>>

    /** Get Current Active Workspace Members */
    fun retrieveActive(): CompletableFuture<List<MemberIdentity>> =
        retrieveActive(MemberRetrieveActiveParams.none())

    /** @see retrieveActive */
    fun retrieveActive(
        params: MemberRetrieveActiveParams = MemberRetrieveActiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<MemberIdentity>>

    /** @see retrieveActive */
    fun retrieveActive(
        params: MemberRetrieveActiveParams = MemberRetrieveActiveParams.none()
    ): CompletableFuture<List<MemberIdentity>> = retrieveActive(params, RequestOptions.none())

    /** @see retrieveActive */
    fun retrieveActive(requestOptions: RequestOptions): CompletableFuture<List<MemberIdentity>> =
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

        /**
         * Returns a raw HTTP response for `post /api/v1/workspaces/current/members`, but is
         * otherwise the same as [MemberServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<MemberCreateResponse>> =
            create(MemberCreateParams.none())

        /** @see create */
        fun create(
            params: MemberCreateParams = MemberCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MemberCreateResponse>>

        /** @see create */
        fun create(
            params: MemberCreateParams = MemberCreateParams.none()
        ): CompletableFuture<HttpResponseFor<MemberCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MemberCreateResponse>> =
            create(MemberCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/workspaces/current/members/{identity_id}`,
         * but is otherwise the same as [MemberServiceAsync.update].
         */
        fun update(
            identityId: String,
            params: MemberUpdateParams,
        ): CompletableFuture<HttpResponseFor<MemberUpdateResponse>> =
            update(identityId, params, RequestOptions.none())

        /** @see update */
        fun update(
            identityId: String,
            params: MemberUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MemberUpdateResponse>> =
            update(params.toBuilder().identityId(identityId).build(), requestOptions)

        /** @see update */
        fun update(
            params: MemberUpdateParams
        ): CompletableFuture<HttpResponseFor<MemberUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: MemberUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MemberUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces/current/members`, but is
         * otherwise the same as [MemberServiceAsync.list].
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
         * Returns a raw HTTP response for `delete
         * /api/v1/workspaces/current/members/{identity_id}`, but is otherwise the same as
         * [MemberServiceAsync.delete].
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
         * Returns a raw HTTP response for `post /api/v1/workspaces/current/members/batch`, but is
         * otherwise the same as [MemberServiceAsync.batch].
         */
        fun batch(
            params: MemberBatchParams
        ): CompletableFuture<HttpResponseFor<List<MemberBatchResponse>>> =
            batch(params, RequestOptions.none())

        /** @see batch */
        fun batch(
            params: MemberBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<MemberBatchResponse>>>

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces/current/members/active`, but is
         * otherwise the same as [MemberServiceAsync.retrieveActive].
         */
        fun retrieveActive(): CompletableFuture<HttpResponseFor<List<MemberIdentity>>> =
            retrieveActive(MemberRetrieveActiveParams.none())

        /** @see retrieveActive */
        fun retrieveActive(
            params: MemberRetrieveActiveParams = MemberRetrieveActiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<MemberIdentity>>>

        /** @see retrieveActive */
        fun retrieveActive(
            params: MemberRetrieveActiveParams = MemberRetrieveActiveParams.none()
        ): CompletableFuture<HttpResponseFor<List<MemberIdentity>>> =
            retrieveActive(params, RequestOptions.none())

        /** @see retrieveActive */
        fun retrieveActive(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<MemberIdentity>>> =
            retrieveActive(MemberRetrieveActiveParams.none(), requestOptions)
    }
}

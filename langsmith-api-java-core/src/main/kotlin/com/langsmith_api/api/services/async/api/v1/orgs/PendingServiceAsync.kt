// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.orgs

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.orgs.OrganizationPgSchemaSlim
import com.langsmith_api.api.models.api.v1.orgs.pending.Identity
import com.langsmith_api.api.models.api.v1.orgs.pending.PendingClaimParams
import com.langsmith_api.api.models.api.v1.orgs.pending.PendingDeleteParams
import com.langsmith_api.api.models.api.v1.orgs.pending.PendingDeleteResponse
import com.langsmith_api.api.models.api.v1.orgs.pending.PendingListParams
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

    /** Get all pending orgs visible to this auth */
    fun list(): CompletableFuture<List<OrganizationPgSchemaSlim>> = list(PendingListParams.none())

    /** @see list */
    fun list(
        params: PendingListParams = PendingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<OrganizationPgSchemaSlim>>

    /** @see list */
    fun list(
        params: PendingListParams = PendingListParams.none()
    ): CompletableFuture<List<OrganizationPgSchemaSlim>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<OrganizationPgSchemaSlim>> =
        list(PendingListParams.none(), requestOptions)

    /** Delete Pending Organization Invite */
    fun delete(organizationId: String): CompletableFuture<PendingDeleteResponse> =
        delete(organizationId, PendingDeleteParams.none())

    /** @see delete */
    fun delete(
        organizationId: String,
        params: PendingDeleteParams = PendingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PendingDeleteResponse> =
        delete(params.toBuilder().organizationId(organizationId).build(), requestOptions)

    /** @see delete */
    fun delete(
        organizationId: String,
        params: PendingDeleteParams = PendingDeleteParams.none(),
    ): CompletableFuture<PendingDeleteResponse> =
        delete(organizationId, params, RequestOptions.none())

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
        organizationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PendingDeleteResponse> =
        delete(organizationId, PendingDeleteParams.none(), requestOptions)

    /** Claim Pending Organization Invite */
    fun claim(organizationId: String): CompletableFuture<Identity> =
        claim(organizationId, PendingClaimParams.none())

    /** @see claim */
    fun claim(
        organizationId: String,
        params: PendingClaimParams = PendingClaimParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Identity> =
        claim(params.toBuilder().organizationId(organizationId).build(), requestOptions)

    /** @see claim */
    fun claim(
        organizationId: String,
        params: PendingClaimParams = PendingClaimParams.none(),
    ): CompletableFuture<Identity> = claim(organizationId, params, RequestOptions.none())

    /** @see claim */
    fun claim(
        params: PendingClaimParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Identity>

    /** @see claim */
    fun claim(params: PendingClaimParams): CompletableFuture<Identity> =
        claim(params, RequestOptions.none())

    /** @see claim */
    fun claim(organizationId: String, requestOptions: RequestOptions): CompletableFuture<Identity> =
        claim(organizationId, PendingClaimParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get /api/v1/orgs/pending`, but is otherwise the same as
         * [PendingServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<OrganizationPgSchemaSlim>>> =
            list(PendingListParams.none())

        /** @see list */
        fun list(
            params: PendingListParams = PendingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<OrganizationPgSchemaSlim>>>

        /** @see list */
        fun list(
            params: PendingListParams = PendingListParams.none()
        ): CompletableFuture<HttpResponseFor<List<OrganizationPgSchemaSlim>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<OrganizationPgSchemaSlim>>> =
            list(PendingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/orgs/pending/{organization_id}`, but is
         * otherwise the same as [PendingServiceAsync.delete].
         */
        fun delete(
            organizationId: String
        ): CompletableFuture<HttpResponseFor<PendingDeleteResponse>> =
            delete(organizationId, PendingDeleteParams.none())

        /** @see delete */
        fun delete(
            organizationId: String,
            params: PendingDeleteParams = PendingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PendingDeleteResponse>> =
            delete(params.toBuilder().organizationId(organizationId).build(), requestOptions)

        /** @see delete */
        fun delete(
            organizationId: String,
            params: PendingDeleteParams = PendingDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<PendingDeleteResponse>> =
            delete(organizationId, params, RequestOptions.none())

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
            organizationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PendingDeleteResponse>> =
            delete(organizationId, PendingDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/orgs/pending/{organization_id}/claim`, but
         * is otherwise the same as [PendingServiceAsync.claim].
         */
        fun claim(organizationId: String): CompletableFuture<HttpResponseFor<Identity>> =
            claim(organizationId, PendingClaimParams.none())

        /** @see claim */
        fun claim(
            organizationId: String,
            params: PendingClaimParams = PendingClaimParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Identity>> =
            claim(params.toBuilder().organizationId(organizationId).build(), requestOptions)

        /** @see claim */
        fun claim(
            organizationId: String,
            params: PendingClaimParams = PendingClaimParams.none(),
        ): CompletableFuture<HttpResponseFor<Identity>> =
            claim(organizationId, params, RequestOptions.none())

        /** @see claim */
        fun claim(
            params: PendingClaimParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Identity>>

        /** @see claim */
        fun claim(params: PendingClaimParams): CompletableFuture<HttpResponseFor<Identity>> =
            claim(params, RequestOptions.none())

        /** @see claim */
        fun claim(
            organizationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Identity>> =
            claim(organizationId, PendingClaimParams.none(), requestOptions)
    }
}

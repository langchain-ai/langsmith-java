// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.orgs

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.orgs.OrganizationPgSchemaSlim
import com.langsmith_api.api.models.api.v1.orgs.pending.Identity
import com.langsmith_api.api.models.api.v1.orgs.pending.PendingClaimParams
import com.langsmith_api.api.models.api.v1.orgs.pending.PendingDeleteParams
import com.langsmith_api.api.models.api.v1.orgs.pending.PendingDeleteResponse
import com.langsmith_api.api.models.api.v1.orgs.pending.PendingListParams
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

    /** Get all pending orgs visible to this auth */
    fun list(): List<OrganizationPgSchemaSlim> = list(PendingListParams.none())

    /** @see list */
    fun list(
        params: PendingListParams = PendingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<OrganizationPgSchemaSlim>

    /** @see list */
    fun list(params: PendingListParams = PendingListParams.none()): List<OrganizationPgSchemaSlim> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<OrganizationPgSchemaSlim> =
        list(PendingListParams.none(), requestOptions)

    /** Delete Pending Organization Invite */
    fun delete(organizationId: String): PendingDeleteResponse =
        delete(organizationId, PendingDeleteParams.none())

    /** @see delete */
    fun delete(
        organizationId: String,
        params: PendingDeleteParams = PendingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PendingDeleteResponse =
        delete(params.toBuilder().organizationId(organizationId).build(), requestOptions)

    /** @see delete */
    fun delete(
        organizationId: String,
        params: PendingDeleteParams = PendingDeleteParams.none(),
    ): PendingDeleteResponse = delete(organizationId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PendingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PendingDeleteResponse

    /** @see delete */
    fun delete(params: PendingDeleteParams): PendingDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(organizationId: String, requestOptions: RequestOptions): PendingDeleteResponse =
        delete(organizationId, PendingDeleteParams.none(), requestOptions)

    /** Claim Pending Organization Invite */
    fun claim(organizationId: String): Identity = claim(organizationId, PendingClaimParams.none())

    /** @see claim */
    fun claim(
        organizationId: String,
        params: PendingClaimParams = PendingClaimParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Identity = claim(params.toBuilder().organizationId(organizationId).build(), requestOptions)

    /** @see claim */
    fun claim(
        organizationId: String,
        params: PendingClaimParams = PendingClaimParams.none(),
    ): Identity = claim(organizationId, params, RequestOptions.none())

    /** @see claim */
    fun claim(
        params: PendingClaimParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Identity

    /** @see claim */
    fun claim(params: PendingClaimParams): Identity = claim(params, RequestOptions.none())

    /** @see claim */
    fun claim(organizationId: String, requestOptions: RequestOptions): Identity =
        claim(organizationId, PendingClaimParams.none(), requestOptions)

    /** A view of [PendingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PendingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/orgs/pending`, but is otherwise the same as
         * [PendingService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<OrganizationPgSchemaSlim>> = list(PendingListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PendingListParams = PendingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<OrganizationPgSchemaSlim>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PendingListParams = PendingListParams.none()
        ): HttpResponseFor<List<OrganizationPgSchemaSlim>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<OrganizationPgSchemaSlim>> =
            list(PendingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/orgs/pending/{organization_id}`, but is
         * otherwise the same as [PendingService.delete].
         */
        @MustBeClosed
        fun delete(organizationId: String): HttpResponseFor<PendingDeleteResponse> =
            delete(organizationId, PendingDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            organizationId: String,
            params: PendingDeleteParams = PendingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PendingDeleteResponse> =
            delete(params.toBuilder().organizationId(organizationId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            organizationId: String,
            params: PendingDeleteParams = PendingDeleteParams.none(),
        ): HttpResponseFor<PendingDeleteResponse> =
            delete(organizationId, params, RequestOptions.none())

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
            organizationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PendingDeleteResponse> =
            delete(organizationId, PendingDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/orgs/pending/{organization_id}/claim`, but
         * is otherwise the same as [PendingService.claim].
         */
        @MustBeClosed
        fun claim(organizationId: String): HttpResponseFor<Identity> =
            claim(organizationId, PendingClaimParams.none())

        /** @see claim */
        @MustBeClosed
        fun claim(
            organizationId: String,
            params: PendingClaimParams = PendingClaimParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Identity> =
            claim(params.toBuilder().organizationId(organizationId).build(), requestOptions)

        /** @see claim */
        @MustBeClosed
        fun claim(
            organizationId: String,
            params: PendingClaimParams = PendingClaimParams.none(),
        ): HttpResponseFor<Identity> = claim(organizationId, params, RequestOptions.none())

        /** @see claim */
        @MustBeClosed
        fun claim(
            params: PendingClaimParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Identity>

        /** @see claim */
        @MustBeClosed
        fun claim(params: PendingClaimParams): HttpResponseFor<Identity> =
            claim(params, RequestOptions.none())

        /** @see claim */
        @MustBeClosed
        fun claim(
            organizationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Identity> =
            claim(organizationId, PendingClaimParams.none(), requestOptions)
    }
}

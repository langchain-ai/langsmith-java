// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.orgs.OrgCreateParams
import com.langsmith_api.api.models.api.v1.orgs.OrgListParams
import com.langsmith_api.api.models.api.v1.orgs.OrgRetrievePermissionsParams
import com.langsmith_api.api.models.api.v1.orgs.OrgRetrievePermissionsResponse
import com.langsmith_api.api.models.api.v1.orgs.OrganizationPgSchemaSlim
import com.langsmith_api.api.services.blocking.api.v1.orgs.CurrentService
import com.langsmith_api.api.services.blocking.api.v1.orgs.MemberService
import com.langsmith_api.api.services.blocking.api.v1.orgs.PendingService
import com.langsmith_api.api.services.blocking.api.v1.orgs.TtlSettingService
import java.util.function.Consumer

interface OrgService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrgService

    fun current(): CurrentService

    fun pending(): PendingService

    fun members(): MemberService

    fun ttlSettings(): TtlSettingService

    /** Create Organization */
    fun create(params: OrgCreateParams): OrganizationPgSchemaSlim =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: OrgCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrganizationPgSchemaSlim

    /** Get all orgs visible to this auth */
    fun list(): List<OrganizationPgSchemaSlim> = list(OrgListParams.none())

    /** @see list */
    fun list(
        params: OrgListParams = OrgListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<OrganizationPgSchemaSlim>

    /** @see list */
    fun list(params: OrgListParams = OrgListParams.none()): List<OrganizationPgSchemaSlim> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<OrganizationPgSchemaSlim> =
        list(OrgListParams.none(), requestOptions)

    /** List Permissions */
    fun retrievePermissions(): List<OrgRetrievePermissionsResponse> =
        retrievePermissions(OrgRetrievePermissionsParams.none())

    /** @see retrievePermissions */
    fun retrievePermissions(
        params: OrgRetrievePermissionsParams = OrgRetrievePermissionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<OrgRetrievePermissionsResponse>

    /** @see retrievePermissions */
    fun retrievePermissions(
        params: OrgRetrievePermissionsParams = OrgRetrievePermissionsParams.none()
    ): List<OrgRetrievePermissionsResponse> = retrievePermissions(params, RequestOptions.none())

    /** @see retrievePermissions */
    fun retrievePermissions(requestOptions: RequestOptions): List<OrgRetrievePermissionsResponse> =
        retrievePermissions(OrgRetrievePermissionsParams.none(), requestOptions)

    /** A view of [OrgService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrgService.WithRawResponse

        fun current(): CurrentService.WithRawResponse

        fun pending(): PendingService.WithRawResponse

        fun members(): MemberService.WithRawResponse

        fun ttlSettings(): TtlSettingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/orgs`, but is otherwise the same as
         * [OrgService.create].
         */
        @MustBeClosed
        fun create(params: OrgCreateParams): HttpResponseFor<OrganizationPgSchemaSlim> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: OrgCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrganizationPgSchemaSlim>

        /**
         * Returns a raw HTTP response for `get /api/v1/orgs`, but is otherwise the same as
         * [OrgService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<OrganizationPgSchemaSlim>> = list(OrgListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: OrgListParams = OrgListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<OrganizationPgSchemaSlim>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: OrgListParams = OrgListParams.none()
        ): HttpResponseFor<List<OrganizationPgSchemaSlim>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<OrganizationPgSchemaSlim>> =
            list(OrgListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/orgs/permissions`, but is otherwise the same
         * as [OrgService.retrievePermissions].
         */
        @MustBeClosed
        fun retrievePermissions(): HttpResponseFor<List<OrgRetrievePermissionsResponse>> =
            retrievePermissions(OrgRetrievePermissionsParams.none())

        /** @see retrievePermissions */
        @MustBeClosed
        fun retrievePermissions(
            params: OrgRetrievePermissionsParams = OrgRetrievePermissionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<OrgRetrievePermissionsResponse>>

        /** @see retrievePermissions */
        @MustBeClosed
        fun retrievePermissions(
            params: OrgRetrievePermissionsParams = OrgRetrievePermissionsParams.none()
        ): HttpResponseFor<List<OrgRetrievePermissionsResponse>> =
            retrievePermissions(params, RequestOptions.none())

        /** @see retrievePermissions */
        @MustBeClosed
        fun retrievePermissions(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<OrgRetrievePermissionsResponse>> =
            retrievePermissions(OrgRetrievePermissionsParams.none(), requestOptions)
    }
}

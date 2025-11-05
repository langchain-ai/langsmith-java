// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.orgs.OrgCreateParams
import com.langchain.smith.models.orgs.OrgListParams
import com.langchain.smith.models.orgs.OrgRetrievePermissionsParams
import com.langchain.smith.models.orgs.OrgRetrievePermissionsResponse
import com.langchain.smith.models.orgs.OrganizationPgSchemaSlim
import com.langchain.smith.services.async.orgs.CurrentServiceAsync
import com.langchain.smith.services.async.orgs.MemberServiceAsync
import com.langchain.smith.services.async.orgs.PendingServiceAsync
import com.langchain.smith.services.async.orgs.TtlSettingServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OrgServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrgServiceAsync

    fun current(): CurrentServiceAsync

    fun pending(): PendingServiceAsync

    fun members(): MemberServiceAsync

    fun ttlSettings(): TtlSettingServiceAsync

    /** Create Organization */
    fun create(params: OrgCreateParams): CompletableFuture<OrganizationPgSchemaSlim> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: OrgCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrganizationPgSchemaSlim>

    /** Get all orgs visible to this auth */
    fun list(): CompletableFuture<List<OrganizationPgSchemaSlim>> = list(OrgListParams.none())

    /** @see list */
    fun list(
        params: OrgListParams = OrgListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<OrganizationPgSchemaSlim>>

    /** @see list */
    fun list(
        params: OrgListParams = OrgListParams.none()
    ): CompletableFuture<List<OrganizationPgSchemaSlim>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<OrganizationPgSchemaSlim>> =
        list(OrgListParams.none(), requestOptions)

    /** List Permissions */
    fun retrievePermissions(): CompletableFuture<List<OrgRetrievePermissionsResponse>> =
        retrievePermissions(OrgRetrievePermissionsParams.none())

    /** @see retrievePermissions */
    fun retrievePermissions(
        params: OrgRetrievePermissionsParams = OrgRetrievePermissionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<OrgRetrievePermissionsResponse>>

    /** @see retrievePermissions */
    fun retrievePermissions(
        params: OrgRetrievePermissionsParams = OrgRetrievePermissionsParams.none()
    ): CompletableFuture<List<OrgRetrievePermissionsResponse>> =
        retrievePermissions(params, RequestOptions.none())

    /** @see retrievePermissions */
    fun retrievePermissions(
        requestOptions: RequestOptions
    ): CompletableFuture<List<OrgRetrievePermissionsResponse>> =
        retrievePermissions(OrgRetrievePermissionsParams.none(), requestOptions)

    /** A view of [OrgServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrgServiceAsync.WithRawResponse

        fun current(): CurrentServiceAsync.WithRawResponse

        fun pending(): PendingServiceAsync.WithRawResponse

        fun members(): MemberServiceAsync.WithRawResponse

        fun ttlSettings(): TtlSettingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/orgs`, but is otherwise the same as
         * [OrgServiceAsync.create].
         */
        fun create(
            params: OrgCreateParams
        ): CompletableFuture<HttpResponseFor<OrganizationPgSchemaSlim>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: OrgCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrganizationPgSchemaSlim>>

        /**
         * Returns a raw HTTP response for `get /api/v1/orgs`, but is otherwise the same as
         * [OrgServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<OrganizationPgSchemaSlim>>> =
            list(OrgListParams.none())

        /** @see list */
        fun list(
            params: OrgListParams = OrgListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<OrganizationPgSchemaSlim>>>

        /** @see list */
        fun list(
            params: OrgListParams = OrgListParams.none()
        ): CompletableFuture<HttpResponseFor<List<OrganizationPgSchemaSlim>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<OrganizationPgSchemaSlim>>> =
            list(OrgListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/orgs/permissions`, but is otherwise the same
         * as [OrgServiceAsync.retrievePermissions].
         */
        fun retrievePermissions():
            CompletableFuture<HttpResponseFor<List<OrgRetrievePermissionsResponse>>> =
            retrievePermissions(OrgRetrievePermissionsParams.none())

        /** @see retrievePermissions */
        fun retrievePermissions(
            params: OrgRetrievePermissionsParams = OrgRetrievePermissionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<OrgRetrievePermissionsResponse>>>

        /** @see retrievePermissions */
        fun retrievePermissions(
            params: OrgRetrievePermissionsParams = OrgRetrievePermissionsParams.none()
        ): CompletableFuture<HttpResponseFor<List<OrgRetrievePermissionsResponse>>> =
            retrievePermissions(params, RequestOptions.none())

        /** @see retrievePermissions */
        fun retrievePermissions(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<OrgRetrievePermissionsResponse>>> =
            retrievePermissions(OrgRetrievePermissionsParams.none(), requestOptions)
    }
}

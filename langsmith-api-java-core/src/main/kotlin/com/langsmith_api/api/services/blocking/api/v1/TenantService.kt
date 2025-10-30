// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.tenants.AppSchemasTenant
import com.langsmith_api.api.models.api.v1.tenants.TenantCreateParams
import com.langsmith_api.api.models.api.v1.tenants.TenantForUser
import com.langsmith_api.api.models.api.v1.tenants.TenantListParams
import java.util.function.Consumer

interface TenantService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TenantService

    /** Create a new organization and corresponding workspace. */
    fun create(params: TenantCreateParams): AppSchemasTenant = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TenantCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AppSchemasTenant

    /** Get all tenants visible to this auth */
    fun list(): List<TenantForUser> = list(TenantListParams.none())

    /** @see list */
    fun list(
        params: TenantListParams = TenantListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TenantForUser>

    /** @see list */
    fun list(params: TenantListParams = TenantListParams.none()): List<TenantForUser> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<TenantForUser> =
        list(TenantListParams.none(), requestOptions)

    /** A view of [TenantService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TenantService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/tenants`, but is otherwise the same as
         * [TenantService.create].
         */
        @MustBeClosed
        fun create(params: TenantCreateParams): HttpResponseFor<AppSchemasTenant> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TenantCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AppSchemasTenant>

        /**
         * Returns a raw HTTP response for `get /api/v1/tenants`, but is otherwise the same as
         * [TenantService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<TenantForUser>> = list(TenantListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TenantListParams = TenantListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<TenantForUser>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: TenantListParams = TenantListParams.none()
        ): HttpResponseFor<List<TenantForUser>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<TenantForUser>> =
            list(TenantListParams.none(), requestOptions)
    }
}

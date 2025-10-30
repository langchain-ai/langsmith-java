// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.platform.orgs.current.accesspolicies

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponse
import com.langsmith_api.api.models.platform.orgs.current.accesspolicies.roles.RoleAttachParams
import java.util.function.Consumer

interface RoleService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RoleService

    /**
     * Attaches one or more access policies to a specific role. The request body must contain an
     * array of access policy IDs.
     */
    fun attach(roleId: JsonValue) = attach(roleId, RoleAttachParams.none())

    /** @see attach */
    fun attach(
        roleId: JsonValue,
        params: RoleAttachParams = RoleAttachParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = attach(params.toBuilder().roleId(roleId).build(), requestOptions)

    /** @see attach */
    fun attach(roleId: JsonValue, params: RoleAttachParams = RoleAttachParams.none()) =
        attach(roleId, params, RequestOptions.none())

    /** @see attach */
    fun attach(params: RoleAttachParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see attach */
    fun attach(params: RoleAttachParams) = attach(params, RequestOptions.none())

    /** @see attach */
    fun attach(roleId: JsonValue, requestOptions: RequestOptions) =
        attach(roleId, RoleAttachParams.none(), requestOptions)

    /** A view of [RoleService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RoleService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/platform/orgs/current/access-policies/roles/{role_id}/access-policies`, but is
         * otherwise the same as [RoleService.attach].
         */
        @MustBeClosed
        fun attach(roleId: JsonValue): HttpResponse = attach(roleId, RoleAttachParams.none())

        /** @see attach */
        @MustBeClosed
        fun attach(
            roleId: JsonValue,
            params: RoleAttachParams = RoleAttachParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = attach(params.toBuilder().roleId(roleId).build(), requestOptions)

        /** @see attach */
        @MustBeClosed
        fun attach(
            roleId: JsonValue,
            params: RoleAttachParams = RoleAttachParams.none(),
        ): HttpResponse = attach(roleId, params, RequestOptions.none())

        /** @see attach */
        @MustBeClosed
        fun attach(
            params: RoleAttachParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see attach */
        @MustBeClosed
        fun attach(params: RoleAttachParams): HttpResponse = attach(params, RequestOptions.none())

        /** @see attach */
        @MustBeClosed
        fun attach(roleId: JsonValue, requestOptions: RequestOptions): HttpResponse =
            attach(roleId, RoleAttachParams.none(), requestOptions)
    }
}

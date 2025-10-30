// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.platform.orgs.current.accesspolicies

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponse
import com.langsmith_api.api.models.platform.orgs.current.accesspolicies.roles.RoleAttachParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RoleServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RoleServiceAsync

    /**
     * Attaches one or more access policies to a specific role. The request body must contain an
     * array of access policy IDs.
     */
    fun attach(roleId: JsonValue): CompletableFuture<Void?> =
        attach(roleId, RoleAttachParams.none())

    /** @see attach */
    fun attach(
        roleId: JsonValue,
        params: RoleAttachParams = RoleAttachParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = attach(params.toBuilder().roleId(roleId).build(), requestOptions)

    /** @see attach */
    fun attach(
        roleId: JsonValue,
        params: RoleAttachParams = RoleAttachParams.none(),
    ): CompletableFuture<Void?> = attach(roleId, params, RequestOptions.none())

    /** @see attach */
    fun attach(
        params: RoleAttachParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see attach */
    fun attach(params: RoleAttachParams): CompletableFuture<Void?> =
        attach(params, RequestOptions.none())

    /** @see attach */
    fun attach(roleId: JsonValue, requestOptions: RequestOptions): CompletableFuture<Void?> =
        attach(roleId, RoleAttachParams.none(), requestOptions)

    /** A view of [RoleServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RoleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/platform/orgs/current/access-policies/roles/{role_id}/access-policies`, but is
         * otherwise the same as [RoleServiceAsync.attach].
         */
        fun attach(roleId: JsonValue): CompletableFuture<HttpResponse> =
            attach(roleId, RoleAttachParams.none())

        /** @see attach */
        fun attach(
            roleId: JsonValue,
            params: RoleAttachParams = RoleAttachParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            attach(params.toBuilder().roleId(roleId).build(), requestOptions)

        /** @see attach */
        fun attach(
            roleId: JsonValue,
            params: RoleAttachParams = RoleAttachParams.none(),
        ): CompletableFuture<HttpResponse> = attach(roleId, params, RequestOptions.none())

        /** @see attach */
        fun attach(
            params: RoleAttachParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see attach */
        fun attach(params: RoleAttachParams): CompletableFuture<HttpResponse> =
            attach(params, RequestOptions.none())

        /** @see attach */
        fun attach(
            roleId: JsonValue,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> = attach(roleId, RoleAttachParams.none(), requestOptions)
    }
}

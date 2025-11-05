// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.tenants.AppSchemasTenant
import com.langchain.smith.models.tenants.TenantCreateParams
import com.langchain.smith.models.tenants.TenantForUser
import com.langchain.smith.models.tenants.TenantListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TenantServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TenantServiceAsync

    /** Create a new organization and corresponding workspace. */
    fun create(params: TenantCreateParams): CompletableFuture<AppSchemasTenant> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TenantCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AppSchemasTenant>

    /** Get all tenants visible to this auth */
    fun list(): CompletableFuture<List<TenantForUser>> = list(TenantListParams.none())

    /** @see list */
    fun list(
        params: TenantListParams = TenantListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<TenantForUser>>

    /** @see list */
    fun list(
        params: TenantListParams = TenantListParams.none()
    ): CompletableFuture<List<TenantForUser>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<TenantForUser>> =
        list(TenantListParams.none(), requestOptions)

    /**
     * A view of [TenantServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TenantServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/tenants`, but is otherwise the same as
         * [TenantServiceAsync.create].
         */
        fun create(
            params: TenantCreateParams
        ): CompletableFuture<HttpResponseFor<AppSchemasTenant>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TenantCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AppSchemasTenant>>

        /**
         * Returns a raw HTTP response for `get /api/v1/tenants`, but is otherwise the same as
         * [TenantServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<TenantForUser>>> =
            list(TenantListParams.none())

        /** @see list */
        fun list(
            params: TenantListParams = TenantListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<TenantForUser>>>

        /** @see list */
        fun list(
            params: TenantListParams = TenantListParams.none()
        ): CompletableFuture<HttpResponseFor<List<TenantForUser>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<TenantForUser>>> =
            list(TenantListParams.none(), requestOptions)
    }
}

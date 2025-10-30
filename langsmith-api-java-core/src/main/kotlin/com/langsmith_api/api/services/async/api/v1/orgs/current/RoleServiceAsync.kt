// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.orgs.current

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.orgs.current.roles.Role
import com.langsmith_api.api.models.api.v1.orgs.current.roles.RoleCreateParams
import com.langsmith_api.api.models.api.v1.orgs.current.roles.RoleDeleteParams
import com.langsmith_api.api.models.api.v1.orgs.current.roles.RoleListParams
import com.langsmith_api.api.models.api.v1.orgs.current.roles.RoleUpdateParams
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

    /** Create Organization Roles */
    fun create(params: RoleCreateParams): CompletableFuture<Role> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RoleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Role>

    /** Update Organization Roles */
    fun update(roleId: String, params: RoleUpdateParams): CompletableFuture<Role> =
        update(roleId, params, RequestOptions.none())

    /** @see update */
    fun update(
        roleId: String,
        params: RoleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Role> = update(params.toBuilder().roleId(roleId).build(), requestOptions)

    /** @see update */
    fun update(params: RoleUpdateParams): CompletableFuture<Role> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RoleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Role>

    /** List Organization Roles */
    fun list(): CompletableFuture<List<Role>> = list(RoleListParams.none())

    /** @see list */
    fun list(
        params: RoleListParams = RoleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Role>>

    /** @see list */
    fun list(params: RoleListParams = RoleListParams.none()): CompletableFuture<List<Role>> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<Role>> =
        list(RoleListParams.none(), requestOptions)

    /** Delete Organization Roles */
    fun delete(roleId: String): CompletableFuture<Role> = delete(roleId, RoleDeleteParams.none())

    /** @see delete */
    fun delete(
        roleId: String,
        params: RoleDeleteParams = RoleDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Role> = delete(params.toBuilder().roleId(roleId).build(), requestOptions)

    /** @see delete */
    fun delete(
        roleId: String,
        params: RoleDeleteParams = RoleDeleteParams.none(),
    ): CompletableFuture<Role> = delete(roleId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RoleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Role>

    /** @see delete */
    fun delete(params: RoleDeleteParams): CompletableFuture<Role> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(roleId: String, requestOptions: RequestOptions): CompletableFuture<Role> =
        delete(roleId, RoleDeleteParams.none(), requestOptions)

    /** A view of [RoleServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RoleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/orgs/current/roles`, but is otherwise the
         * same as [RoleServiceAsync.create].
         */
        fun create(params: RoleCreateParams): CompletableFuture<HttpResponseFor<Role>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: RoleCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Role>>

        /**
         * Returns a raw HTTP response for `patch /api/v1/orgs/current/roles/{role_id}`, but is
         * otherwise the same as [RoleServiceAsync.update].
         */
        fun update(
            roleId: String,
            params: RoleUpdateParams,
        ): CompletableFuture<HttpResponseFor<Role>> = update(roleId, params, RequestOptions.none())

        /** @see update */
        fun update(
            roleId: String,
            params: RoleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Role>> =
            update(params.toBuilder().roleId(roleId).build(), requestOptions)

        /** @see update */
        fun update(params: RoleUpdateParams): CompletableFuture<HttpResponseFor<Role>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: RoleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Role>>

        /**
         * Returns a raw HTTP response for `get /api/v1/orgs/current/roles`, but is otherwise the
         * same as [RoleServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<Role>>> = list(RoleListParams.none())

        /** @see list */
        fun list(
            params: RoleListParams = RoleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Role>>>

        /** @see list */
        fun list(
            params: RoleListParams = RoleListParams.none()
        ): CompletableFuture<HttpResponseFor<List<Role>>> = list(params, RequestOptions.none())

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<Role>>> =
            list(RoleListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/orgs/current/roles/{role_id}`, but is
         * otherwise the same as [RoleServiceAsync.delete].
         */
        fun delete(roleId: String): CompletableFuture<HttpResponseFor<Role>> =
            delete(roleId, RoleDeleteParams.none())

        /** @see delete */
        fun delete(
            roleId: String,
            params: RoleDeleteParams = RoleDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Role>> =
            delete(params.toBuilder().roleId(roleId).build(), requestOptions)

        /** @see delete */
        fun delete(
            roleId: String,
            params: RoleDeleteParams = RoleDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<Role>> = delete(roleId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: RoleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Role>>

        /** @see delete */
        fun delete(params: RoleDeleteParams): CompletableFuture<HttpResponseFor<Role>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            roleId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Role>> =
            delete(roleId, RoleDeleteParams.none(), requestOptions)
    }
}

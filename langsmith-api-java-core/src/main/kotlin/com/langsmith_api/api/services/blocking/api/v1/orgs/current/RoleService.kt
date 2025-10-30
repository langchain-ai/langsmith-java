// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.orgs.current

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.orgs.current.roles.Role
import com.langsmith_api.api.models.api.v1.orgs.current.roles.RoleCreateParams
import com.langsmith_api.api.models.api.v1.orgs.current.roles.RoleDeleteParams
import com.langsmith_api.api.models.api.v1.orgs.current.roles.RoleListParams
import com.langsmith_api.api.models.api.v1.orgs.current.roles.RoleUpdateParams
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

    /** Create Organization Roles */
    fun create(params: RoleCreateParams): Role = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RoleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Role

    /** Update Organization Roles */
    fun update(roleId: String, params: RoleUpdateParams): Role =
        update(roleId, params, RequestOptions.none())

    /** @see update */
    fun update(
        roleId: String,
        params: RoleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Role = update(params.toBuilder().roleId(roleId).build(), requestOptions)

    /** @see update */
    fun update(params: RoleUpdateParams): Role = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RoleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Role

    /** List Organization Roles */
    fun list(): List<Role> = list(RoleListParams.none())

    /** @see list */
    fun list(
        params: RoleListParams = RoleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Role>

    /** @see list */
    fun list(params: RoleListParams = RoleListParams.none()): List<Role> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<Role> =
        list(RoleListParams.none(), requestOptions)

    /** Delete Organization Roles */
    fun delete(roleId: String): Role = delete(roleId, RoleDeleteParams.none())

    /** @see delete */
    fun delete(
        roleId: String,
        params: RoleDeleteParams = RoleDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Role = delete(params.toBuilder().roleId(roleId).build(), requestOptions)

    /** @see delete */
    fun delete(roleId: String, params: RoleDeleteParams = RoleDeleteParams.none()): Role =
        delete(roleId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RoleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Role

    /** @see delete */
    fun delete(params: RoleDeleteParams): Role = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(roleId: String, requestOptions: RequestOptions): Role =
        delete(roleId, RoleDeleteParams.none(), requestOptions)

    /** A view of [RoleService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RoleService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/orgs/current/roles`, but is otherwise the
         * same as [RoleService.create].
         */
        @MustBeClosed
        fun create(params: RoleCreateParams): HttpResponseFor<Role> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RoleCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Role>

        /**
         * Returns a raw HTTP response for `patch /api/v1/orgs/current/roles/{role_id}`, but is
         * otherwise the same as [RoleService.update].
         */
        @MustBeClosed
        fun update(roleId: String, params: RoleUpdateParams): HttpResponseFor<Role> =
            update(roleId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            roleId: String,
            params: RoleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Role> = update(params.toBuilder().roleId(roleId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: RoleUpdateParams): HttpResponseFor<Role> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: RoleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Role>

        /**
         * Returns a raw HTTP response for `get /api/v1/orgs/current/roles`, but is otherwise the
         * same as [RoleService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<List<Role>> = list(RoleListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RoleListParams = RoleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Role>>

        /** @see list */
        @MustBeClosed
        fun list(params: RoleListParams = RoleListParams.none()): HttpResponseFor<List<Role>> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<Role>> =
            list(RoleListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/orgs/current/roles/{role_id}`, but is
         * otherwise the same as [RoleService.delete].
         */
        @MustBeClosed
        fun delete(roleId: String): HttpResponseFor<Role> = delete(roleId, RoleDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            roleId: String,
            params: RoleDeleteParams = RoleDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Role> = delete(params.toBuilder().roleId(roleId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            roleId: String,
            params: RoleDeleteParams = RoleDeleteParams.none(),
        ): HttpResponseFor<Role> = delete(roleId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: RoleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Role>

        /** @see delete */
        @MustBeClosed
        fun delete(params: RoleDeleteParams): HttpResponseFor<Role> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(roleId: String, requestOptions: RequestOptions): HttpResponseFor<Role> =
            delete(roleId, RoleDeleteParams.none(), requestOptions)
    }
}

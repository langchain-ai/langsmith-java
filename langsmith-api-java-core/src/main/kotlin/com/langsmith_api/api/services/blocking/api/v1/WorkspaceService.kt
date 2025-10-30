// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.tenants.AppSchemasTenant
import com.langsmith_api.api.models.api.v1.tenants.TenantForUser
import com.langsmith_api.api.models.api.v1.workspaces.WorkspaceCreateParams
import com.langsmith_api.api.models.api.v1.workspaces.WorkspaceDeleteParams
import com.langsmith_api.api.models.api.v1.workspaces.WorkspaceDeleteResponse
import com.langsmith_api.api.models.api.v1.workspaces.WorkspaceListParams
import com.langsmith_api.api.models.api.v1.workspaces.WorkspaceUpdateParams
import com.langsmith_api.api.services.blocking.api.v1.workspaces.CurrentService
import com.langsmith_api.api.services.blocking.api.v1.workspaces.PendingService
import java.util.function.Consumer

interface WorkspaceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkspaceService

    fun pending(): PendingService

    fun current(): CurrentService

    /** Create a new workspace. */
    fun create(params: WorkspaceCreateParams): AppSchemasTenant =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: WorkspaceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AppSchemasTenant

    /** Patch Workspace */
    fun update(workspaceId: String, params: WorkspaceUpdateParams): AppSchemasTenant =
        update(workspaceId, params, RequestOptions.none())

    /** @see update */
    fun update(
        workspaceId: String,
        params: WorkspaceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AppSchemasTenant =
        update(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

    /** @see update */
    fun update(params: WorkspaceUpdateParams): AppSchemasTenant =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: WorkspaceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AppSchemasTenant

    /**
     * Get all workspaces visible to this auth in the current org. Does not create a new
     * workspace/org.
     */
    fun list(): List<TenantForUser> = list(WorkspaceListParams.none())

    /** @see list */
    fun list(
        params: WorkspaceListParams = WorkspaceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TenantForUser>

    /** @see list */
    fun list(params: WorkspaceListParams = WorkspaceListParams.none()): List<TenantForUser> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<TenantForUser> =
        list(WorkspaceListParams.none(), requestOptions)

    /** Delete Workspace */
    fun delete(workspaceId: String): WorkspaceDeleteResponse =
        delete(workspaceId, WorkspaceDeleteParams.none())

    /** @see delete */
    fun delete(
        workspaceId: String,
        params: WorkspaceDeleteParams = WorkspaceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkspaceDeleteResponse =
        delete(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

    /** @see delete */
    fun delete(
        workspaceId: String,
        params: WorkspaceDeleteParams = WorkspaceDeleteParams.none(),
    ): WorkspaceDeleteResponse = delete(workspaceId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: WorkspaceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkspaceDeleteResponse

    /** @see delete */
    fun delete(params: WorkspaceDeleteParams): WorkspaceDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(workspaceId: String, requestOptions: RequestOptions): WorkspaceDeleteResponse =
        delete(workspaceId, WorkspaceDeleteParams.none(), requestOptions)

    /** A view of [WorkspaceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkspaceService.WithRawResponse

        fun pending(): PendingService.WithRawResponse

        fun current(): CurrentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/workspaces`, but is otherwise the same as
         * [WorkspaceService.create].
         */
        @MustBeClosed
        fun create(params: WorkspaceCreateParams): HttpResponseFor<AppSchemasTenant> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: WorkspaceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AppSchemasTenant>

        /**
         * Returns a raw HTTP response for `patch /api/v1/workspaces/{workspace_id}`, but is
         * otherwise the same as [WorkspaceService.update].
         */
        @MustBeClosed
        fun update(
            workspaceId: String,
            params: WorkspaceUpdateParams,
        ): HttpResponseFor<AppSchemasTenant> = update(workspaceId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            workspaceId: String,
            params: WorkspaceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AppSchemasTenant> =
            update(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: WorkspaceUpdateParams): HttpResponseFor<AppSchemasTenant> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: WorkspaceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AppSchemasTenant>

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces`, but is otherwise the same as
         * [WorkspaceService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<TenantForUser>> = list(WorkspaceListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: WorkspaceListParams = WorkspaceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<TenantForUser>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: WorkspaceListParams = WorkspaceListParams.none()
        ): HttpResponseFor<List<TenantForUser>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<TenantForUser>> =
            list(WorkspaceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/workspaces/{workspace_id}`, but is
         * otherwise the same as [WorkspaceService.delete].
         */
        @MustBeClosed
        fun delete(workspaceId: String): HttpResponseFor<WorkspaceDeleteResponse> =
            delete(workspaceId, WorkspaceDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            workspaceId: String,
            params: WorkspaceDeleteParams = WorkspaceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkspaceDeleteResponse> =
            delete(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            workspaceId: String,
            params: WorkspaceDeleteParams = WorkspaceDeleteParams.none(),
        ): HttpResponseFor<WorkspaceDeleteResponse> =
            delete(workspaceId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: WorkspaceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkspaceDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: WorkspaceDeleteParams): HttpResponseFor<WorkspaceDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            workspaceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WorkspaceDeleteResponse> =
            delete(workspaceId, WorkspaceDeleteParams.none(), requestOptions)
    }
}

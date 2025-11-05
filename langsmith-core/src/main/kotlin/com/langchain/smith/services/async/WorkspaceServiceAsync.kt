// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.tenants.AppSchemasTenant
import com.langchain.smith.models.tenants.TenantForUser
import com.langchain.smith.models.workspaces.WorkspaceCreateParams
import com.langchain.smith.models.workspaces.WorkspaceDeleteParams
import com.langchain.smith.models.workspaces.WorkspaceDeleteResponse
import com.langchain.smith.models.workspaces.WorkspaceListParams
import com.langchain.smith.models.workspaces.WorkspaceUpdateParams
import com.langchain.smith.services.async.workspaces.CurrentServiceAsync
import com.langchain.smith.services.async.workspaces.PendingServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface WorkspaceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkspaceServiceAsync

    fun pending(): PendingServiceAsync

    fun current(): CurrentServiceAsync

    /** Create a new workspace. */
    fun create(params: WorkspaceCreateParams): CompletableFuture<AppSchemasTenant> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: WorkspaceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AppSchemasTenant>

    /** Patch Workspace */
    fun update(
        workspaceId: String,
        params: WorkspaceUpdateParams,
    ): CompletableFuture<AppSchemasTenant> = update(workspaceId, params, RequestOptions.none())

    /** @see update */
    fun update(
        workspaceId: String,
        params: WorkspaceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AppSchemasTenant> =
        update(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

    /** @see update */
    fun update(params: WorkspaceUpdateParams): CompletableFuture<AppSchemasTenant> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: WorkspaceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AppSchemasTenant>

    /**
     * Get all workspaces visible to this auth in the current org. Does not create a new
     * workspace/org.
     */
    fun list(): CompletableFuture<List<TenantForUser>> = list(WorkspaceListParams.none())

    /** @see list */
    fun list(
        params: WorkspaceListParams = WorkspaceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<TenantForUser>>

    /** @see list */
    fun list(
        params: WorkspaceListParams = WorkspaceListParams.none()
    ): CompletableFuture<List<TenantForUser>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<TenantForUser>> =
        list(WorkspaceListParams.none(), requestOptions)

    /** Delete Workspace */
    fun delete(workspaceId: String): CompletableFuture<WorkspaceDeleteResponse> =
        delete(workspaceId, WorkspaceDeleteParams.none())

    /** @see delete */
    fun delete(
        workspaceId: String,
        params: WorkspaceDeleteParams = WorkspaceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkspaceDeleteResponse> =
        delete(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

    /** @see delete */
    fun delete(
        workspaceId: String,
        params: WorkspaceDeleteParams = WorkspaceDeleteParams.none(),
    ): CompletableFuture<WorkspaceDeleteResponse> =
        delete(workspaceId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: WorkspaceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkspaceDeleteResponse>

    /** @see delete */
    fun delete(params: WorkspaceDeleteParams): CompletableFuture<WorkspaceDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        workspaceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WorkspaceDeleteResponse> =
        delete(workspaceId, WorkspaceDeleteParams.none(), requestOptions)

    /**
     * A view of [WorkspaceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WorkspaceServiceAsync.WithRawResponse

        fun pending(): PendingServiceAsync.WithRawResponse

        fun current(): CurrentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/workspaces`, but is otherwise the same as
         * [WorkspaceServiceAsync.create].
         */
        fun create(
            params: WorkspaceCreateParams
        ): CompletableFuture<HttpResponseFor<AppSchemasTenant>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: WorkspaceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AppSchemasTenant>>

        /**
         * Returns a raw HTTP response for `patch /api/v1/workspaces/{workspace_id}`, but is
         * otherwise the same as [WorkspaceServiceAsync.update].
         */
        fun update(
            workspaceId: String,
            params: WorkspaceUpdateParams,
        ): CompletableFuture<HttpResponseFor<AppSchemasTenant>> =
            update(workspaceId, params, RequestOptions.none())

        /** @see update */
        fun update(
            workspaceId: String,
            params: WorkspaceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AppSchemasTenant>> =
            update(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

        /** @see update */
        fun update(
            params: WorkspaceUpdateParams
        ): CompletableFuture<HttpResponseFor<AppSchemasTenant>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: WorkspaceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AppSchemasTenant>>

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces`, but is otherwise the same as
         * [WorkspaceServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<TenantForUser>>> =
            list(WorkspaceListParams.none())

        /** @see list */
        fun list(
            params: WorkspaceListParams = WorkspaceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<TenantForUser>>>

        /** @see list */
        fun list(
            params: WorkspaceListParams = WorkspaceListParams.none()
        ): CompletableFuture<HttpResponseFor<List<TenantForUser>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<TenantForUser>>> =
            list(WorkspaceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/workspaces/{workspace_id}`, but is
         * otherwise the same as [WorkspaceServiceAsync.delete].
         */
        fun delete(
            workspaceId: String
        ): CompletableFuture<HttpResponseFor<WorkspaceDeleteResponse>> =
            delete(workspaceId, WorkspaceDeleteParams.none())

        /** @see delete */
        fun delete(
            workspaceId: String,
            params: WorkspaceDeleteParams = WorkspaceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkspaceDeleteResponse>> =
            delete(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

        /** @see delete */
        fun delete(
            workspaceId: String,
            params: WorkspaceDeleteParams = WorkspaceDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<WorkspaceDeleteResponse>> =
            delete(workspaceId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: WorkspaceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkspaceDeleteResponse>>

        /** @see delete */
        fun delete(
            params: WorkspaceDeleteParams
        ): CompletableFuture<HttpResponseFor<WorkspaceDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            workspaceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WorkspaceDeleteResponse>> =
            delete(workspaceId, WorkspaceDeleteParams.none(), requestOptions)
    }
}

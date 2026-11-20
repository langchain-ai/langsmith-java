// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.workspacetags.TagKeyWithValues
import com.langchain.smith.models.workspacetags.WorkspaceTagListParams
import com.langchain.smith.services.async.workspacetags.KeyServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface WorkspaceTagServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkspaceTagServiceAsync

    fun keys(): KeyServiceAsync

    /**
     * List the workspace's tag keys, each with its values.
     *
     * With resource_type, only values applied to at least one resource of that type are returned,
     * and keys with no such values are left out.
     */
    fun list(): CompletableFuture<List<TagKeyWithValues>> = list(WorkspaceTagListParams.none())

    /** @see list */
    fun list(
        params: WorkspaceTagListParams = WorkspaceTagListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<TagKeyWithValues>>

    /** @see list */
    fun list(
        params: WorkspaceTagListParams = WorkspaceTagListParams.none()
    ): CompletableFuture<List<TagKeyWithValues>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<TagKeyWithValues>> =
        list(WorkspaceTagListParams.none(), requestOptions)

    /**
     * A view of [WorkspaceTagServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WorkspaceTagServiceAsync.WithRawResponse

        fun keys(): KeyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces/current/tags`, but is otherwise
         * the same as [WorkspaceTagServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<TagKeyWithValues>>> =
            list(WorkspaceTagListParams.none())

        /** @see list */
        fun list(
            params: WorkspaceTagListParams = WorkspaceTagListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<TagKeyWithValues>>>

        /** @see list */
        fun list(
            params: WorkspaceTagListParams = WorkspaceTagListParams.none()
        ): CompletableFuture<HttpResponseFor<List<TagKeyWithValues>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<TagKeyWithValues>>> =
            list(WorkspaceTagListParams.none(), requestOptions)
    }
}

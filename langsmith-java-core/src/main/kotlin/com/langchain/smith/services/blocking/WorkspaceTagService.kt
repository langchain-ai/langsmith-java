// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.workspacetags.TagKeyWithValues
import com.langchain.smith.models.workspacetags.WorkspaceTagListParams
import com.langchain.smith.services.blocking.workspacetags.KeyService
import java.util.function.Consumer

interface WorkspaceTagService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkspaceTagService

    fun keys(): KeyService

    /**
     * List the workspace's tag keys, each with its values.
     *
     * With resource_type, only values applied to at least one resource of that type are returned,
     * and keys with no such values are left out.
     */
    fun list(): List<TagKeyWithValues> = list(WorkspaceTagListParams.none())

    /** @see list */
    fun list(
        params: WorkspaceTagListParams = WorkspaceTagListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TagKeyWithValues>

    /** @see list */
    fun list(
        params: WorkspaceTagListParams = WorkspaceTagListParams.none()
    ): List<TagKeyWithValues> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<TagKeyWithValues> =
        list(WorkspaceTagListParams.none(), requestOptions)

    /**
     * A view of [WorkspaceTagService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WorkspaceTagService.WithRawResponse

        fun keys(): KeyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces/current/tags`, but is otherwise
         * the same as [WorkspaceTagService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<TagKeyWithValues>> = list(WorkspaceTagListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: WorkspaceTagListParams = WorkspaceTagListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<TagKeyWithValues>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: WorkspaceTagListParams = WorkspaceTagListParams.none()
        ): HttpResponseFor<List<TagKeyWithValues>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<TagKeyWithValues>> =
            list(WorkspaceTagListParams.none(), requestOptions)
    }
}

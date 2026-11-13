// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.workspacesecrets.WorkspaceSecret
import com.langchain.smith.models.workspacesecrets.WorkspaceSecretDeleteParams
import com.langchain.smith.models.workspacesecrets.WorkspaceSecretListParams
import com.langchain.smith.models.workspacesecrets.WorkspaceSecretUpsertParams
import java.util.function.Consumer

interface WorkspaceSecretService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkspaceSecretService

    /** List the current workspace's secret keys. Values are never returned. */
    fun list(): List<WorkspaceSecret> = list(WorkspaceSecretListParams.none())

    /** @see list */
    fun list(
        params: WorkspaceSecretListParams = WorkspaceSecretListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<WorkspaceSecret>

    /** @see list */
    fun list(
        params: WorkspaceSecretListParams = WorkspaceSecretListParams.none()
    ): List<WorkspaceSecret> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<WorkspaceSecret> =
        list(WorkspaceSecretListParams.none(), requestOptions)

    /**
     * Delete a workspace secret and its allowed hosts.
     *
     * Requires workspace admin. Missing keys succeed.
     */
    fun delete(key: String) = delete(key, WorkspaceSecretDeleteParams.none())

    /** @see delete */
    fun delete(
        key: String,
        params: WorkspaceSecretDeleteParams = WorkspaceSecretDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().key(key).build(), requestOptions)

    /** @see delete */
    fun delete(
        key: String,
        params: WorkspaceSecretDeleteParams = WorkspaceSecretDeleteParams.none(),
    ) = delete(key, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: WorkspaceSecretDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: WorkspaceSecretDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(key: String, requestOptions: RequestOptions) =
        delete(key, WorkspaceSecretDeleteParams.none(), requestOptions)

    /**
     * Create or update a workspace secret and the hosts it may be sent to.
     *
     * Requires workspace admin. Omit value to keep the current one; it is required to create a
     * secret. configs replaces the secret's hosts; omitted or empty restores the built-in defaults
     * for known provider keys. The value is never returned.
     */
    fun upsert(key: String): WorkspaceSecret = upsert(key, WorkspaceSecretUpsertParams.none())

    /** @see upsert */
    fun upsert(
        key: String,
        params: WorkspaceSecretUpsertParams = WorkspaceSecretUpsertParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkspaceSecret = upsert(params.toBuilder().key(key).build(), requestOptions)

    /** @see upsert */
    fun upsert(
        key: String,
        params: WorkspaceSecretUpsertParams = WorkspaceSecretUpsertParams.none(),
    ): WorkspaceSecret = upsert(key, params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        params: WorkspaceSecretUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkspaceSecret

    /** @see upsert */
    fun upsert(params: WorkspaceSecretUpsertParams): WorkspaceSecret =
        upsert(params, RequestOptions.none())

    /** @see upsert */
    fun upsert(key: String, requestOptions: RequestOptions): WorkspaceSecret =
        upsert(key, WorkspaceSecretUpsertParams.none(), requestOptions)

    /**
     * A view of [WorkspaceSecretService] that provides access to raw HTTP responses for each
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
        ): WorkspaceSecretService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces/current/secrets`, but is
         * otherwise the same as [WorkspaceSecretService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<WorkspaceSecret>> = list(WorkspaceSecretListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: WorkspaceSecretListParams = WorkspaceSecretListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<WorkspaceSecret>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: WorkspaceSecretListParams = WorkspaceSecretListParams.none()
        ): HttpResponseFor<List<WorkspaceSecret>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<WorkspaceSecret>> =
            list(WorkspaceSecretListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/workspaces/current/secrets/{key}`, but is
         * otherwise the same as [WorkspaceSecretService.delete].
         */
        @MustBeClosed
        fun delete(key: String): HttpResponse = delete(key, WorkspaceSecretDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            key: String,
            params: WorkspaceSecretDeleteParams = WorkspaceSecretDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().key(key).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            key: String,
            params: WorkspaceSecretDeleteParams = WorkspaceSecretDeleteParams.none(),
        ): HttpResponse = delete(key, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: WorkspaceSecretDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: WorkspaceSecretDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(key: String, requestOptions: RequestOptions): HttpResponse =
            delete(key, WorkspaceSecretDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1/workspaces/current/secrets/{key}`, but is
         * otherwise the same as [WorkspaceSecretService.upsert].
         */
        @MustBeClosed
        fun upsert(key: String): HttpResponseFor<WorkspaceSecret> =
            upsert(key, WorkspaceSecretUpsertParams.none())

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            key: String,
            params: WorkspaceSecretUpsertParams = WorkspaceSecretUpsertParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkspaceSecret> =
            upsert(params.toBuilder().key(key).build(), requestOptions)

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            key: String,
            params: WorkspaceSecretUpsertParams = WorkspaceSecretUpsertParams.none(),
        ): HttpResponseFor<WorkspaceSecret> = upsert(key, params, RequestOptions.none())

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            params: WorkspaceSecretUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkspaceSecret>

        /** @see upsert */
        @MustBeClosed
        fun upsert(params: WorkspaceSecretUpsertParams): HttpResponseFor<WorkspaceSecret> =
            upsert(params, RequestOptions.none())

        /** @see upsert */
        @MustBeClosed
        fun upsert(key: String, requestOptions: RequestOptions): HttpResponseFor<WorkspaceSecret> =
            upsert(key, WorkspaceSecretUpsertParams.none(), requestOptions)
    }
}

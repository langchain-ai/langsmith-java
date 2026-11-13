// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.workspacesecrets.WorkspaceSecret
import com.langchain.smith.models.workspacesecrets.WorkspaceSecretDeleteParams
import com.langchain.smith.models.workspacesecrets.WorkspaceSecretListParams
import com.langchain.smith.models.workspacesecrets.WorkspaceSecretUpsertParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface WorkspaceSecretServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkspaceSecretServiceAsync

    /** List the current workspace's secret keys. Values are never returned. */
    fun list(): CompletableFuture<List<WorkspaceSecret>> = list(WorkspaceSecretListParams.none())

    /** @see list */
    fun list(
        params: WorkspaceSecretListParams = WorkspaceSecretListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<WorkspaceSecret>>

    /** @see list */
    fun list(
        params: WorkspaceSecretListParams = WorkspaceSecretListParams.none()
    ): CompletableFuture<List<WorkspaceSecret>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<WorkspaceSecret>> =
        list(WorkspaceSecretListParams.none(), requestOptions)

    /**
     * Delete a workspace secret and its allowed hosts.
     *
     * Requires workspace admin. Missing keys succeed.
     */
    fun delete(key: String): CompletableFuture<Void?> =
        delete(key, WorkspaceSecretDeleteParams.none())

    /** @see delete */
    fun delete(
        key: String,
        params: WorkspaceSecretDeleteParams = WorkspaceSecretDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().key(key).build(), requestOptions)

    /** @see delete */
    fun delete(
        key: String,
        params: WorkspaceSecretDeleteParams = WorkspaceSecretDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(key, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: WorkspaceSecretDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: WorkspaceSecretDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(key: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(key, WorkspaceSecretDeleteParams.none(), requestOptions)

    /**
     * Create or update a workspace secret and the hosts it may be sent to.
     *
     * Requires workspace admin. Omit value to keep the current one; it is required to create a
     * secret. configs replaces the secret's hosts; omitted or empty restores the built-in defaults
     * for known provider keys. The value is never returned.
     */
    fun upsert(key: String): CompletableFuture<WorkspaceSecret> =
        upsert(key, WorkspaceSecretUpsertParams.none())

    /** @see upsert */
    fun upsert(
        key: String,
        params: WorkspaceSecretUpsertParams = WorkspaceSecretUpsertParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkspaceSecret> =
        upsert(params.toBuilder().key(key).build(), requestOptions)

    /** @see upsert */
    fun upsert(
        key: String,
        params: WorkspaceSecretUpsertParams = WorkspaceSecretUpsertParams.none(),
    ): CompletableFuture<WorkspaceSecret> = upsert(key, params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        params: WorkspaceSecretUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkspaceSecret>

    /** @see upsert */
    fun upsert(params: WorkspaceSecretUpsertParams): CompletableFuture<WorkspaceSecret> =
        upsert(params, RequestOptions.none())

    /** @see upsert */
    fun upsert(key: String, requestOptions: RequestOptions): CompletableFuture<WorkspaceSecret> =
        upsert(key, WorkspaceSecretUpsertParams.none(), requestOptions)

    /**
     * A view of [WorkspaceSecretServiceAsync] that provides access to raw HTTP responses for each
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
        ): WorkspaceSecretServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces/current/secrets`, but is
         * otherwise the same as [WorkspaceSecretServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<WorkspaceSecret>>> =
            list(WorkspaceSecretListParams.none())

        /** @see list */
        fun list(
            params: WorkspaceSecretListParams = WorkspaceSecretListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<WorkspaceSecret>>>

        /** @see list */
        fun list(
            params: WorkspaceSecretListParams = WorkspaceSecretListParams.none()
        ): CompletableFuture<HttpResponseFor<List<WorkspaceSecret>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<WorkspaceSecret>>> =
            list(WorkspaceSecretListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/workspaces/current/secrets/{key}`, but is
         * otherwise the same as [WorkspaceSecretServiceAsync.delete].
         */
        fun delete(key: String): CompletableFuture<HttpResponse> =
            delete(key, WorkspaceSecretDeleteParams.none())

        /** @see delete */
        fun delete(
            key: String,
            params: WorkspaceSecretDeleteParams = WorkspaceSecretDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().key(key).build(), requestOptions)

        /** @see delete */
        fun delete(
            key: String,
            params: WorkspaceSecretDeleteParams = WorkspaceSecretDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(key, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: WorkspaceSecretDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: WorkspaceSecretDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(key: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(key, WorkspaceSecretDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1/workspaces/current/secrets/{key}`, but is
         * otherwise the same as [WorkspaceSecretServiceAsync.upsert].
         */
        fun upsert(key: String): CompletableFuture<HttpResponseFor<WorkspaceSecret>> =
            upsert(key, WorkspaceSecretUpsertParams.none())

        /** @see upsert */
        fun upsert(
            key: String,
            params: WorkspaceSecretUpsertParams = WorkspaceSecretUpsertParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkspaceSecret>> =
            upsert(params.toBuilder().key(key).build(), requestOptions)

        /** @see upsert */
        fun upsert(
            key: String,
            params: WorkspaceSecretUpsertParams = WorkspaceSecretUpsertParams.none(),
        ): CompletableFuture<HttpResponseFor<WorkspaceSecret>> =
            upsert(key, params, RequestOptions.none())

        /** @see upsert */
        fun upsert(
            params: WorkspaceSecretUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkspaceSecret>>

        /** @see upsert */
        fun upsert(
            params: WorkspaceSecretUpsertParams
        ): CompletableFuture<HttpResponseFor<WorkspaceSecret>> =
            upsert(params, RequestOptions.none())

        /** @see upsert */
        fun upsert(
            key: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WorkspaceSecret>> =
            upsert(key, WorkspaceSecretUpsertParams.none(), requestOptions)
    }
}

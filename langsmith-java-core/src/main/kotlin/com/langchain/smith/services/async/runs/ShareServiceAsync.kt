// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.runs

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.runs.share.ShareCreateParams
import com.langchain.smith.models.runs.share.ShareCreateResponse
import com.langchain.smith.models.runs.share.ShareDeleteParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ShareServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ShareServiceAsync

    /**
     * Creates or returns a share token for a run. Child runs share their trace root.
     *
     * Self-hosted deployments require LangSmith `v0.16` or later.
     */
    fun create(runId: String, params: ShareCreateParams): CompletableFuture<ShareCreateResponse> =
        create(runId, params, RequestOptions.none())

    /** @see create */
    fun create(
        runId: String,
        params: ShareCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ShareCreateResponse> =
        create(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see create */
    fun create(params: ShareCreateParams): CompletableFuture<ShareCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ShareCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ShareCreateResponse>

    /**
     * Deletes the share token for the trace identified by trace_id and session_id. Idempotent:
     * returns 204 whether or not a share token existed.
     *
     * Self-hosted deployments require LangSmith `v0.16` or later.
     */
    fun delete(traceId: String, params: ShareDeleteParams): CompletableFuture<Void?> =
        delete(traceId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        traceId: String,
        params: ShareDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().traceId(traceId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ShareDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ShareDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** A view of [ShareServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ShareServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v2/runs/{run_id}/share`, but is otherwise the
         * same as [ShareServiceAsync.create].
         */
        fun create(
            runId: String,
            params: ShareCreateParams,
        ): CompletableFuture<HttpResponseFor<ShareCreateResponse>> =
            create(runId, params, RequestOptions.none())

        /** @see create */
        fun create(
            runId: String,
            params: ShareCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ShareCreateResponse>> =
            create(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see create */
        fun create(
            params: ShareCreateParams
        ): CompletableFuture<HttpResponseFor<ShareCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ShareCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ShareCreateResponse>>

        /**
         * Returns a raw HTTP response for `delete /api/v2/runs/{trace_id}/share`, but is otherwise
         * the same as [ShareServiceAsync.delete].
         */
        fun delete(traceId: String, params: ShareDeleteParams): CompletableFuture<HttpResponse> =
            delete(traceId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            traceId: String,
            params: ShareDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().traceId(traceId).build(), requestOptions)

        /** @see delete */
        fun delete(params: ShareDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ShareDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}

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

    /** Creates or returns a share token for a run. Child runs share their trace root. */
    fun create(runId: String): CompletableFuture<ShareCreateResponse> =
        create(runId, ShareCreateParams.none())

    /** @see create */
    fun create(
        runId: String,
        params: ShareCreateParams = ShareCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ShareCreateResponse> =
        create(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see create */
    fun create(
        runId: String,
        params: ShareCreateParams = ShareCreateParams.none(),
    ): CompletableFuture<ShareCreateResponse> = create(runId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ShareCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ShareCreateResponse>

    /** @see create */
    fun create(params: ShareCreateParams): CompletableFuture<ShareCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        runId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ShareCreateResponse> =
        create(runId, ShareCreateParams.none(), requestOptions)

    /**
     * Deletes the share token for the trace identified by trace_id and session_id. Idempotent:
     * returns 204 whether or not a share token existed.
     */
    fun delete(traceId: String): CompletableFuture<Void?> =
        delete(traceId, ShareDeleteParams.none())

    /** @see delete */
    fun delete(
        traceId: String,
        params: ShareDeleteParams = ShareDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().traceId(traceId).build(), requestOptions)

    /** @see delete */
    fun delete(
        traceId: String,
        params: ShareDeleteParams = ShareDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(traceId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ShareDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: ShareDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(traceId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(traceId, ShareDeleteParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /v2/runs/{run_id}/share`, but is otherwise the same
         * as [ShareServiceAsync.create].
         */
        fun create(runId: String): CompletableFuture<HttpResponseFor<ShareCreateResponse>> =
            create(runId, ShareCreateParams.none())

        /** @see create */
        fun create(
            runId: String,
            params: ShareCreateParams = ShareCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ShareCreateResponse>> =
            create(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see create */
        fun create(
            runId: String,
            params: ShareCreateParams = ShareCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<ShareCreateResponse>> =
            create(runId, params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ShareCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ShareCreateResponse>>

        /** @see create */
        fun create(
            params: ShareCreateParams
        ): CompletableFuture<HttpResponseFor<ShareCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            runId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ShareCreateResponse>> =
            create(runId, ShareCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v2/runs/{trace_id}/share`, but is otherwise the
         * same as [ShareServiceAsync.delete].
         */
        fun delete(traceId: String): CompletableFuture<HttpResponse> =
            delete(traceId, ShareDeleteParams.none())

        /** @see delete */
        fun delete(
            traceId: String,
            params: ShareDeleteParams = ShareDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().traceId(traceId).build(), requestOptions)

        /** @see delete */
        fun delete(
            traceId: String,
            params: ShareDeleteParams = ShareDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(traceId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ShareDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: ShareDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            traceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(traceId, ShareDeleteParams.none(), requestOptions)
    }
}

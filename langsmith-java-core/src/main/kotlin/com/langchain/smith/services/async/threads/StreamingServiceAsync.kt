// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.threads

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.AsyncStreamResponse
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.core.http.StreamResponse
import com.langchain.smith.models.QueryPatchOperation
import com.langchain.smith.models.threads.streaming.StreamingQueryParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface StreamingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StreamingServiceAsync

    /**
     * GET with body payload — no resources created. Returns the threads in a tracing project
     * matching the query passed as the request payload. Results are filtered by the given time
     * range and optional filters, with cursor-based pagination.
     *
     * When `ai_search` is set, `Accept: text/event-stream` is required; requests without it
     * return 406. AI search is unavailable on deployments that route queries to the v1 backend and
     * returns 501 there.
     *
     * Self-hosted deployments require LangSmith `v0.16` or later.
     */
    fun queryStreaming(): AsyncStreamResponse<List<QueryPatchOperation>> =
        queryStreaming(StreamingQueryParams.none())

    /** @see queryStreaming */
    fun queryStreaming(
        params: StreamingQueryParams = StreamingQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AsyncStreamResponse<List<QueryPatchOperation>>

    /** @see queryStreaming */
    fun queryStreaming(
        params: StreamingQueryParams = StreamingQueryParams.none()
    ): AsyncStreamResponse<List<QueryPatchOperation>> =
        queryStreaming(params, RequestOptions.none())

    /** @see queryStreaming */
    fun queryStreaming(
        requestOptions: RequestOptions
    ): AsyncStreamResponse<List<QueryPatchOperation>> =
        queryStreaming(StreamingQueryParams.none(), requestOptions)

    /**
     * A view of [StreamingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StreamingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v2/threads/query`, but is otherwise the same
         * as [StreamingServiceAsync.queryStreaming].
         */
        @MustBeClosed
        fun queryStreaming():
            CompletableFuture<HttpResponseFor<StreamResponse<List<QueryPatchOperation>>>> =
            queryStreaming(StreamingQueryParams.none())

        /** @see queryStreaming */
        @MustBeClosed
        fun queryStreaming(
            params: StreamingQueryParams = StreamingQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StreamResponse<List<QueryPatchOperation>>>>

        /** @see queryStreaming */
        @MustBeClosed
        fun queryStreaming(
            params: StreamingQueryParams = StreamingQueryParams.none()
        ): CompletableFuture<HttpResponseFor<StreamResponse<List<QueryPatchOperation>>>> =
            queryStreaming(params, RequestOptions.none())

        /** @see queryStreaming */
        @MustBeClosed
        fun queryStreaming(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<StreamResponse<List<QueryPatchOperation>>>> =
            queryStreaming(StreamingQueryParams.none(), requestOptions)
    }
}

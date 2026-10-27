// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.threads

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.core.http.StreamResponse
import com.langchain.smith.models.QueryPatchOperation
import com.langchain.smith.models.threads.Thread
import com.langchain.smith.models.threads.streaming.StreamingQueryParams
import java.util.function.Consumer

interface StreamingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StreamingService

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
    @MustBeClosed
    fun queryStreaming(): StreamResponse<List<QueryPatchOperation>> =
        queryStreaming(StreamingQueryParams.none())

    /** @see queryStreaming */
    @MustBeClosed
    fun queryStreaming(
        params: StreamingQueryParams = StreamingQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamResponse<List<QueryPatchOperation>>

    /** @see queryStreaming */
    @MustBeClosed
    fun queryStreaming(
        params: StreamingQueryParams = StreamingQueryParams.none()
    ): StreamResponse<List<QueryPatchOperation>> = queryStreaming(params, RequestOptions.none())

    /** @see queryStreaming */
    @MustBeClosed
    fun queryStreaming(requestOptions: RequestOptions): StreamResponse<List<QueryPatchOperation>> =
        queryStreaming(StreamingQueryParams.none(), requestOptions)

    /**
     * Streams the items of [queryStreaming] one at a time across pages, following `next_cursor`.
     */
    @MustBeClosed
    fun queryStreamingItems(): StreamResponse<Thread> =
        queryStreamingItems(StreamingQueryParams.none())

    /** @see queryStreamingItems */
    @MustBeClosed
    fun queryStreamingItems(
        params: StreamingQueryParams = StreamingQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamResponse<Thread>

    /** @see queryStreamingItems */
    @MustBeClosed
    fun queryStreamingItems(
        params: StreamingQueryParams = StreamingQueryParams.none()
    ): StreamResponse<Thread> = queryStreamingItems(params, RequestOptions.none())

    /** @see queryStreamingItems */
    @MustBeClosed
    fun queryStreamingItems(requestOptions: RequestOptions): StreamResponse<Thread> =
        queryStreamingItems(StreamingQueryParams.none(), requestOptions)

    /** A view of [StreamingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): StreamingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v2/threads/query`, but is otherwise the same
         * as [StreamingService.queryStreaming].
         */
        @MustBeClosed
        fun queryStreaming(): HttpResponseFor<StreamResponse<List<QueryPatchOperation>>> =
            queryStreaming(StreamingQueryParams.none())

        /** @see queryStreaming */
        @MustBeClosed
        fun queryStreaming(
            params: StreamingQueryParams = StreamingQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StreamResponse<List<QueryPatchOperation>>>

        /** @see queryStreaming */
        @MustBeClosed
        fun queryStreaming(
            params: StreamingQueryParams = StreamingQueryParams.none()
        ): HttpResponseFor<StreamResponse<List<QueryPatchOperation>>> =
            queryStreaming(params, RequestOptions.none())

        /** @see queryStreaming */
        @MustBeClosed
        fun queryStreaming(
            requestOptions: RequestOptions
        ): HttpResponseFor<StreamResponse<List<QueryPatchOperation>>> =
            queryStreaming(StreamingQueryParams.none(), requestOptions)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.traces

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.AsyncStreamResponse
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.core.http.StreamResponse
import com.langchain.smith.models.QueryPatchOperation
import com.langchain.smith.models.traces.streaming.StreamingQueryParams
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
     * Returns a paginated list of traces (root runs) for a single tracing project. Each item
     * carries the trace's root run plus optional trace-wide aggregates (`total_tokens`,
     * `total_cost`, `first_token_time`) under `trace_aggregates`, so clients never have to merge by
     * `trace_id`.
     *
     * Traces are scanned within a `start_time` window: `min_start_time` defaults to 24 hours before
     * the request, `max_start_time` defaults to the request time. Set either explicitly to widen or
     * narrow the window.
     *
     * Supports filters (`trace_filter`, `tree_filter`), cursor pagination (`cursor`), and field
     * projection (`selects`).
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
         * Returns a raw HTTP response for `post /api/v2/traces/query`, but is otherwise the same as
         * [StreamingServiceAsync.queryStreaming].
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

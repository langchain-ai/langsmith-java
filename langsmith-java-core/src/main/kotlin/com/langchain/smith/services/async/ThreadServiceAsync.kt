// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.threads.ThreadListTracesPageAsync
import com.langchain.smith.models.threads.ThreadListTracesParams
import com.langchain.smith.models.threads.ThreadQueryPageAsync
import com.langchain.smith.models.threads.ThreadQueryParams
import com.langchain.smith.models.threads.ThreadStats
import com.langchain.smith.models.threads.ThreadStatsParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ThreadServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ThreadServiceAsync

    /**
     * **Alpha:** The request and response contract may change; Retrieve all traces belonging to a
     * specific thread within a project.
     */
    fun listTraces(
        threadId: String,
        params: ThreadListTracesParams,
    ): CompletableFuture<ThreadListTracesPageAsync> =
        listTraces(threadId, params, RequestOptions.none())

    /** @see listTraces */
    fun listTraces(
        threadId: String,
        params: ThreadListTracesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadListTracesPageAsync> =
        listTraces(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see listTraces */
    fun listTraces(params: ThreadListTracesParams): CompletableFuture<ThreadListTracesPageAsync> =
        listTraces(params, RequestOptions.none())

    /** @see listTraces */
    fun listTraces(
        params: ThreadListTracesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadListTracesPageAsync>

    /**
     * **Alpha:** The request and response contract may change; Query threads within a project
     * (session), with cursor-based pagination. Returns threads matching the given time range and
     * optional filter.
     */
    fun query(): CompletableFuture<ThreadQueryPageAsync> = query(ThreadQueryParams.none())

    /** @see query */
    fun query(
        params: ThreadQueryParams = ThreadQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadQueryPageAsync>

    /** @see query */
    fun query(
        params: ThreadQueryParams = ThreadQueryParams.none()
    ): CompletableFuture<ThreadQueryPageAsync> = query(params, RequestOptions.none())

    /** @see query */
    fun query(requestOptions: RequestOptions): CompletableFuture<ThreadQueryPageAsync> =
        query(ThreadQueryParams.none(), requestOptions)

    /**
     * **Alpha:** The request and response contract may change; Compute aggregate stats for a single
     * thread (turn count, latency percentiles, token/cost sums, and detail breakdowns) within a
     * project.
     */
    fun stats(threadId: String, params: ThreadStatsParams): CompletableFuture<ThreadStats> =
        stats(threadId, params, RequestOptions.none())

    /** @see stats */
    fun stats(
        threadId: String,
        params: ThreadStatsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadStats> =
        stats(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see stats */
    fun stats(params: ThreadStatsParams): CompletableFuture<ThreadStats> =
        stats(params, RequestOptions.none())

    /** @see stats */
    fun stats(
        params: ThreadStatsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadStats>

    /**
     * A view of [ThreadServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ThreadServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v2/threads/{thread_id}/traces`, but is otherwise
         * the same as [ThreadServiceAsync.listTraces].
         */
        fun listTraces(
            threadId: String,
            params: ThreadListTracesParams,
        ): CompletableFuture<HttpResponseFor<ThreadListTracesPageAsync>> =
            listTraces(threadId, params, RequestOptions.none())

        /** @see listTraces */
        fun listTraces(
            threadId: String,
            params: ThreadListTracesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadListTracesPageAsync>> =
            listTraces(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see listTraces */
        fun listTraces(
            params: ThreadListTracesParams
        ): CompletableFuture<HttpResponseFor<ThreadListTracesPageAsync>> =
            listTraces(params, RequestOptions.none())

        /** @see listTraces */
        fun listTraces(
            params: ThreadListTracesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadListTracesPageAsync>>

        /**
         * Returns a raw HTTP response for `post /v2/threads/query`, but is otherwise the same as
         * [ThreadServiceAsync.query].
         */
        fun query(): CompletableFuture<HttpResponseFor<ThreadQueryPageAsync>> =
            query(ThreadQueryParams.none())

        /** @see query */
        fun query(
            params: ThreadQueryParams = ThreadQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadQueryPageAsync>>

        /** @see query */
        fun query(
            params: ThreadQueryParams = ThreadQueryParams.none()
        ): CompletableFuture<HttpResponseFor<ThreadQueryPageAsync>> =
            query(params, RequestOptions.none())

        /** @see query */
        fun query(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ThreadQueryPageAsync>> =
            query(ThreadQueryParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/threads/{thread_id}/stats`, but is otherwise the
         * same as [ThreadServiceAsync.stats].
         */
        fun stats(
            threadId: String,
            params: ThreadStatsParams,
        ): CompletableFuture<HttpResponseFor<ThreadStats>> =
            stats(threadId, params, RequestOptions.none())

        /** @see stats */
        fun stats(
            threadId: String,
            params: ThreadStatsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadStats>> =
            stats(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see stats */
        fun stats(params: ThreadStatsParams): CompletableFuture<HttpResponseFor<ThreadStats>> =
            stats(params, RequestOptions.none())

        /** @see stats */
        fun stats(
            params: ThreadStatsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadStats>>
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.threads.ThreadListTracesPage
import com.langchain.smith.models.threads.ThreadListTracesParams
import com.langchain.smith.models.threads.ThreadQueryPage
import com.langchain.smith.models.threads.ThreadQueryParams
import com.langchain.smith.models.threads.ThreadStats
import com.langchain.smith.models.threads.ThreadStatsParams
import java.util.function.Consumer

interface ThreadService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ThreadService

    /**
     * **Alpha:** The request and response contract may change; Retrieve all traces belonging to a
     * specific thread within a project.
     */
    fun listTraces(threadId: String, params: ThreadListTracesParams): ThreadListTracesPage =
        listTraces(threadId, params, RequestOptions.none())

    /** @see listTraces */
    fun listTraces(
        threadId: String,
        params: ThreadListTracesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadListTracesPage =
        listTraces(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see listTraces */
    fun listTraces(params: ThreadListTracesParams): ThreadListTracesPage =
        listTraces(params, RequestOptions.none())

    /** @see listTraces */
    fun listTraces(
        params: ThreadListTracesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadListTracesPage

    /**
     * **Alpha:** The request and response contract may change; Query threads within a project
     * (session), with cursor-based pagination. Returns threads matching the given time range and
     * optional filter.
     */
    fun query(): ThreadQueryPage = query(ThreadQueryParams.none())

    /** @see query */
    fun query(
        params: ThreadQueryParams = ThreadQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadQueryPage

    /** @see query */
    fun query(params: ThreadQueryParams = ThreadQueryParams.none()): ThreadQueryPage =
        query(params, RequestOptions.none())

    /** @see query */
    fun query(requestOptions: RequestOptions): ThreadQueryPage =
        query(ThreadQueryParams.none(), requestOptions)

    /**
     * **Alpha:** The request and response contract may change; Compute aggregate stats for a single
     * thread (turn count, latency percentiles, token/cost sums, and detail breakdowns) within a
     * project.
     */
    fun stats(threadId: String, params: ThreadStatsParams): ThreadStats =
        stats(threadId, params, RequestOptions.none())

    /** @see stats */
    fun stats(
        threadId: String,
        params: ThreadStatsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadStats = stats(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see stats */
    fun stats(params: ThreadStatsParams): ThreadStats = stats(params, RequestOptions.none())

    /** @see stats */
    fun stats(
        params: ThreadStatsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadStats

    /** A view of [ThreadService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ThreadService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v2/threads/{thread_id}/traces`, but is otherwise
         * the same as [ThreadService.listTraces].
         */
        @MustBeClosed
        fun listTraces(
            threadId: String,
            params: ThreadListTracesParams,
        ): HttpResponseFor<ThreadListTracesPage> =
            listTraces(threadId, params, RequestOptions.none())

        /** @see listTraces */
        @MustBeClosed
        fun listTraces(
            threadId: String,
            params: ThreadListTracesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadListTracesPage> =
            listTraces(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see listTraces */
        @MustBeClosed
        fun listTraces(params: ThreadListTracesParams): HttpResponseFor<ThreadListTracesPage> =
            listTraces(params, RequestOptions.none())

        /** @see listTraces */
        @MustBeClosed
        fun listTraces(
            params: ThreadListTracesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadListTracesPage>

        /**
         * Returns a raw HTTP response for `post /v2/threads/query`, but is otherwise the same as
         * [ThreadService.query].
         */
        @MustBeClosed
        fun query(): HttpResponseFor<ThreadQueryPage> = query(ThreadQueryParams.none())

        /** @see query */
        @MustBeClosed
        fun query(
            params: ThreadQueryParams = ThreadQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadQueryPage>

        /** @see query */
        @MustBeClosed
        fun query(
            params: ThreadQueryParams = ThreadQueryParams.none()
        ): HttpResponseFor<ThreadQueryPage> = query(params, RequestOptions.none())

        /** @see query */
        @MustBeClosed
        fun query(requestOptions: RequestOptions): HttpResponseFor<ThreadQueryPage> =
            query(ThreadQueryParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/threads/{thread_id}/stats`, but is otherwise the
         * same as [ThreadService.stats].
         */
        @MustBeClosed
        fun stats(threadId: String, params: ThreadStatsParams): HttpResponseFor<ThreadStats> =
            stats(threadId, params, RequestOptions.none())

        /** @see stats */
        @MustBeClosed
        fun stats(
            threadId: String,
            params: ThreadStatsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadStats> =
            stats(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see stats */
        @MustBeClosed
        fun stats(params: ThreadStatsParams): HttpResponseFor<ThreadStats> =
            stats(params, RequestOptions.none())

        /** @see stats */
        @MustBeClosed
        fun stats(
            params: ThreadStatsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadStats>
    }
}

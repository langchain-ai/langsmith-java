// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.runs

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.core.http.StreamResponse
import com.langchain.smith.models.QueryPatchOperation
import com.langchain.smith.models.runs.Run
import com.langchain.smith.models.runs.streaming.StreamingQueryV2Params
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
     * Returns a paginated list of runs for the given projects within min/max start_time. Supports
     * filters, cursor pagination, and `selects` to select fields to return.
     *
     * When `ai_search` is set, `Accept: text/event-stream` is required; requests without it
     * return 406. AI search is unavailable on deployments that route queries to the v1 backend and
     * returns 501 there.
     *
     * Self-hosted deployments require LangSmith `v0.16` or later.
     */
    @MustBeClosed
    fun queryV2Streaming(): StreamResponse<List<QueryPatchOperation>> =
        queryV2Streaming(StreamingQueryV2Params.none())

    /** @see queryV2Streaming */
    @MustBeClosed
    fun queryV2Streaming(
        params: StreamingQueryV2Params = StreamingQueryV2Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamResponse<List<QueryPatchOperation>>

    /** @see queryV2Streaming */
    @MustBeClosed
    fun queryV2Streaming(
        params: StreamingQueryV2Params = StreamingQueryV2Params.none()
    ): StreamResponse<List<QueryPatchOperation>> = queryV2Streaming(params, RequestOptions.none())

    /** @see queryV2Streaming */
    @MustBeClosed
    fun queryV2Streaming(
        requestOptions: RequestOptions
    ): StreamResponse<List<QueryPatchOperation>> =
        queryV2Streaming(StreamingQueryV2Params.none(), requestOptions)

    /**
     * Streams the items of [queryV2Streaming] one at a time across pages, following `next_cursor`.
     */
    @MustBeClosed
    fun queryV2StreamingItems(): StreamResponse<Run> =
        queryV2StreamingItems(StreamingQueryV2Params.none())

    /** @see queryV2StreamingItems */
    @MustBeClosed
    fun queryV2StreamingItems(
        params: StreamingQueryV2Params = StreamingQueryV2Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamResponse<Run>

    /** @see queryV2StreamingItems */
    @MustBeClosed
    fun queryV2StreamingItems(
        params: StreamingQueryV2Params = StreamingQueryV2Params.none()
    ): StreamResponse<Run> = queryV2StreamingItems(params, RequestOptions.none())

    /** @see queryV2StreamingItems */
    @MustBeClosed
    fun queryV2StreamingItems(requestOptions: RequestOptions): StreamResponse<Run> =
        queryV2StreamingItems(StreamingQueryV2Params.none(), requestOptions)

    /** A view of [StreamingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): StreamingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v2/runs/query`, but is otherwise the same as
         * [StreamingService.queryV2Streaming].
         */
        @MustBeClosed
        fun queryV2Streaming(): HttpResponseFor<StreamResponse<List<QueryPatchOperation>>> =
            queryV2Streaming(StreamingQueryV2Params.none())

        /** @see queryV2Streaming */
        @MustBeClosed
        fun queryV2Streaming(
            params: StreamingQueryV2Params = StreamingQueryV2Params.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StreamResponse<List<QueryPatchOperation>>>

        /** @see queryV2Streaming */
        @MustBeClosed
        fun queryV2Streaming(
            params: StreamingQueryV2Params = StreamingQueryV2Params.none()
        ): HttpResponseFor<StreamResponse<List<QueryPatchOperation>>> =
            queryV2Streaming(params, RequestOptions.none())

        /** @see queryV2Streaming */
        @MustBeClosed
        fun queryV2Streaming(
            requestOptions: RequestOptions
        ): HttpResponseFor<StreamResponse<List<QueryPatchOperation>>> =
            queryV2Streaming(StreamingQueryV2Params.none(), requestOptions)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.traces.TraceListRunsParams
import com.langchain.smith.models.traces.TraceListRunsResponse
import com.langchain.smith.models.traces.TraceQueryPageAsync
import com.langchain.smith.models.traces.TraceQueryParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TraceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TraceServiceAsync

    /**
     * **Alpha:** The request and response contract may change; Returns runs for a trace ID within
     * min/max start time. Optional `filter`; repeatable `selects` to select fields to return.
     */
    fun listRuns(
        traceId: String,
        params: TraceListRunsParams,
    ): CompletableFuture<TraceListRunsResponse> = listRuns(traceId, params, RequestOptions.none())

    /** @see listRuns */
    fun listRuns(
        traceId: String,
        params: TraceListRunsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TraceListRunsResponse> =
        listRuns(params.toBuilder().traceId(traceId).build(), requestOptions)

    /** @see listRuns */
    fun listRuns(params: TraceListRunsParams): CompletableFuture<TraceListRunsResponse> =
        listRuns(params, RequestOptions.none())

    /** @see listRuns */
    fun listRuns(
        params: TraceListRunsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TraceListRunsResponse>

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
     */
    fun query(): CompletableFuture<TraceQueryPageAsync> = query(TraceQueryParams.none())

    /** @see query */
    fun query(
        params: TraceQueryParams = TraceQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TraceQueryPageAsync>

    /** @see query */
    fun query(
        params: TraceQueryParams = TraceQueryParams.none()
    ): CompletableFuture<TraceQueryPageAsync> = query(params, RequestOptions.none())

    /** @see query */
    fun query(requestOptions: RequestOptions): CompletableFuture<TraceQueryPageAsync> =
        query(TraceQueryParams.none(), requestOptions)

    /** A view of [TraceServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TraceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v2/traces/{trace_id}/runs`, but is otherwise the
         * same as [TraceServiceAsync.listRuns].
         */
        fun listRuns(
            traceId: String,
            params: TraceListRunsParams,
        ): CompletableFuture<HttpResponseFor<TraceListRunsResponse>> =
            listRuns(traceId, params, RequestOptions.none())

        /** @see listRuns */
        fun listRuns(
            traceId: String,
            params: TraceListRunsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TraceListRunsResponse>> =
            listRuns(params.toBuilder().traceId(traceId).build(), requestOptions)

        /** @see listRuns */
        fun listRuns(
            params: TraceListRunsParams
        ): CompletableFuture<HttpResponseFor<TraceListRunsResponse>> =
            listRuns(params, RequestOptions.none())

        /** @see listRuns */
        fun listRuns(
            params: TraceListRunsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TraceListRunsResponse>>

        /**
         * Returns a raw HTTP response for `post /v2/traces/query`, but is otherwise the same as
         * [TraceServiceAsync.query].
         */
        fun query(): CompletableFuture<HttpResponseFor<TraceQueryPageAsync>> =
            query(TraceQueryParams.none())

        /** @see query */
        fun query(
            params: TraceQueryParams = TraceQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TraceQueryPageAsync>>

        /** @see query */
        fun query(
            params: TraceQueryParams = TraceQueryParams.none()
        ): CompletableFuture<HttpResponseFor<TraceQueryPageAsync>> =
            query(params, RequestOptions.none())

        /** @see query */
        fun query(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TraceQueryPageAsync>> =
            query(TraceQueryParams.none(), requestOptions)
    }
}

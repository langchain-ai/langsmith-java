// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.traces.TraceListRunsParams
import com.langchain.smith.models.traces.TraceListRunsResponse
import com.langchain.smith.models.traces.TraceQueryPage
import com.langchain.smith.models.traces.TraceQueryParams
import java.util.function.Consumer

interface TraceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TraceService

    /**
     * **Alpha:** The request and response contract may change; Returns runs for a trace ID within
     * min/max start time. Optional `filter`; repeatable `selects` to select fields to return.
     */
    fun listRuns(traceId: String, params: TraceListRunsParams): TraceListRunsResponse =
        listRuns(traceId, params, RequestOptions.none())

    /** @see listRuns */
    fun listRuns(
        traceId: String,
        params: TraceListRunsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TraceListRunsResponse = listRuns(params.toBuilder().traceId(traceId).build(), requestOptions)

    /** @see listRuns */
    fun listRuns(params: TraceListRunsParams): TraceListRunsResponse =
        listRuns(params, RequestOptions.none())

    /** @see listRuns */
    fun listRuns(
        params: TraceListRunsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TraceListRunsResponse

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
    fun query(): TraceQueryPage = query(TraceQueryParams.none())

    /** @see query */
    fun query(
        params: TraceQueryParams = TraceQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TraceQueryPage

    /** @see query */
    fun query(params: TraceQueryParams = TraceQueryParams.none()): TraceQueryPage =
        query(params, RequestOptions.none())

    /** @see query */
    fun query(requestOptions: RequestOptions): TraceQueryPage =
        query(TraceQueryParams.none(), requestOptions)

    /** A view of [TraceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TraceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v2/traces/{trace_id}/runs`, but is otherwise the
         * same as [TraceService.listRuns].
         */
        @MustBeClosed
        fun listRuns(
            traceId: String,
            params: TraceListRunsParams,
        ): HttpResponseFor<TraceListRunsResponse> = listRuns(traceId, params, RequestOptions.none())

        /** @see listRuns */
        @MustBeClosed
        fun listRuns(
            traceId: String,
            params: TraceListRunsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TraceListRunsResponse> =
            listRuns(params.toBuilder().traceId(traceId).build(), requestOptions)

        /** @see listRuns */
        @MustBeClosed
        fun listRuns(params: TraceListRunsParams): HttpResponseFor<TraceListRunsResponse> =
            listRuns(params, RequestOptions.none())

        /** @see listRuns */
        @MustBeClosed
        fun listRuns(
            params: TraceListRunsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TraceListRunsResponse>

        /**
         * Returns a raw HTTP response for `post /v2/traces/query`, but is otherwise the same as
         * [TraceService.query].
         */
        @MustBeClosed fun query(): HttpResponseFor<TraceQueryPage> = query(TraceQueryParams.none())

        /** @see query */
        @MustBeClosed
        fun query(
            params: TraceQueryParams = TraceQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TraceQueryPage>

        /** @see query */
        @MustBeClosed
        fun query(
            params: TraceQueryParams = TraceQueryParams.none()
        ): HttpResponseFor<TraceQueryPage> = query(params, RequestOptions.none())

        /** @see query */
        @MustBeClosed
        fun query(requestOptions: RequestOptions): HttpResponseFor<TraceQueryPage> =
            query(TraceQueryParams.none(), requestOptions)
    }
}

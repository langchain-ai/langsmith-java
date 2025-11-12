// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.runs.RunIngestBatchParams
import com.langchain.smith.models.runs.RunIngestBatchResponse
import com.langchain.smith.models.runs.RunQueryParams
import com.langchain.smith.models.runs.RunQueryResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RunServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync

    /**
     * Ingests a batch of runs in a single JSON payload. The payload must have `post` and/or `patch`
     * arrays containing run objects. Prefer this endpoint over single‑run ingestion when submitting
     * hundreds of runs, but `/runs/multipart` offers better handling for very large fields and
     * attachments.
     */
    fun ingestBatch(): CompletableFuture<RunIngestBatchResponse> =
        ingestBatch(RunIngestBatchParams.none())

    /** @see ingestBatch */
    fun ingestBatch(
        params: RunIngestBatchParams = RunIngestBatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunIngestBatchResponse>

    /** @see ingestBatch */
    fun ingestBatch(
        params: RunIngestBatchParams = RunIngestBatchParams.none()
    ): CompletableFuture<RunIngestBatchResponse> = ingestBatch(params, RequestOptions.none())

    /** @see ingestBatch */
    fun ingestBatch(requestOptions: RequestOptions): CompletableFuture<RunIngestBatchResponse> =
        ingestBatch(RunIngestBatchParams.none(), requestOptions)

    /** Query Runs */
    fun query(): CompletableFuture<RunQueryResponse> = query(RunQueryParams.none())

    /** @see query */
    fun query(
        params: RunQueryParams = RunQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunQueryResponse>

    /** @see query */
    fun query(params: RunQueryParams = RunQueryParams.none()): CompletableFuture<RunQueryResponse> =
        query(params, RequestOptions.none())

    /** @see query */
    fun query(requestOptions: RequestOptions): CompletableFuture<RunQueryResponse> =
        query(RunQueryParams.none(), requestOptions)

    /** A view of [RunServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /runs/batch`, but is otherwise the same as
         * [RunServiceAsync.ingestBatch].
         */
        fun ingestBatch(): CompletableFuture<HttpResponseFor<RunIngestBatchResponse>> =
            ingestBatch(RunIngestBatchParams.none())

        /** @see ingestBatch */
        fun ingestBatch(
            params: RunIngestBatchParams = RunIngestBatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunIngestBatchResponse>>

        /** @see ingestBatch */
        fun ingestBatch(
            params: RunIngestBatchParams = RunIngestBatchParams.none()
        ): CompletableFuture<HttpResponseFor<RunIngestBatchResponse>> =
            ingestBatch(params, RequestOptions.none())

        /** @see ingestBatch */
        fun ingestBatch(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RunIngestBatchResponse>> =
            ingestBatch(RunIngestBatchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/runs/query`, but is otherwise the same as
         * [RunServiceAsync.query].
         */
        fun query(): CompletableFuture<HttpResponseFor<RunQueryResponse>> =
            query(RunQueryParams.none())

        /** @see query */
        fun query(
            params: RunQueryParams = RunQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunQueryResponse>>

        /** @see query */
        fun query(
            params: RunQueryParams = RunQueryParams.none()
        ): CompletableFuture<HttpResponseFor<RunQueryResponse>> =
            query(params, RequestOptions.none())

        /** @see query */
        fun query(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RunQueryResponse>> =
            query(RunQueryParams.none(), requestOptions)
    }
}

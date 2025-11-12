// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.runs.RunIngestBatchParams
import com.langchain.smith.models.runs.RunIngestBatchResponse
import com.langchain.smith.models.runs.RunQueryParams
import com.langchain.smith.models.runs.RunQueryResponse
import java.util.function.Consumer

interface RunService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService

    /**
     * Ingests a batch of runs in a single JSON payload. The payload must have `post` and/or `patch`
     * arrays containing run objects. Prefer this endpoint over single‑run ingestion when submitting
     * hundreds of runs, but `/runs/multipart` offers better handling for very large fields and
     * attachments.
     */
    fun ingestBatch(): RunIngestBatchResponse = ingestBatch(RunIngestBatchParams.none())

    /** @see ingestBatch */
    fun ingestBatch(
        params: RunIngestBatchParams = RunIngestBatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunIngestBatchResponse

    /** @see ingestBatch */
    fun ingestBatch(
        params: RunIngestBatchParams = RunIngestBatchParams.none()
    ): RunIngestBatchResponse = ingestBatch(params, RequestOptions.none())

    /** @see ingestBatch */
    fun ingestBatch(requestOptions: RequestOptions): RunIngestBatchResponse =
        ingestBatch(RunIngestBatchParams.none(), requestOptions)

    /** Query Runs */
    fun query(): RunQueryResponse = query(RunQueryParams.none())

    /** @see query */
    fun query(
        params: RunQueryParams = RunQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunQueryResponse

    /** @see query */
    fun query(params: RunQueryParams = RunQueryParams.none()): RunQueryResponse =
        query(params, RequestOptions.none())

    /** @see query */
    fun query(requestOptions: RequestOptions): RunQueryResponse =
        query(RunQueryParams.none(), requestOptions)

    /** A view of [RunService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /runs/batch`, but is otherwise the same as
         * [RunService.ingestBatch].
         */
        @MustBeClosed
        fun ingestBatch(): HttpResponseFor<RunIngestBatchResponse> =
            ingestBatch(RunIngestBatchParams.none())

        /** @see ingestBatch */
        @MustBeClosed
        fun ingestBatch(
            params: RunIngestBatchParams = RunIngestBatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunIngestBatchResponse>

        /** @see ingestBatch */
        @MustBeClosed
        fun ingestBatch(
            params: RunIngestBatchParams = RunIngestBatchParams.none()
        ): HttpResponseFor<RunIngestBatchResponse> = ingestBatch(params, RequestOptions.none())

        /** @see ingestBatch */
        @MustBeClosed
        fun ingestBatch(requestOptions: RequestOptions): HttpResponseFor<RunIngestBatchResponse> =
            ingestBatch(RunIngestBatchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/runs/query`, but is otherwise the same as
         * [RunService.query].
         */
        @MustBeClosed fun query(): HttpResponseFor<RunQueryResponse> = query(RunQueryParams.none())

        /** @see query */
        @MustBeClosed
        fun query(
            params: RunQueryParams = RunQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunQueryResponse>

        /** @see query */
        @MustBeClosed
        fun query(
            params: RunQueryParams = RunQueryParams.none()
        ): HttpResponseFor<RunQueryResponse> = query(params, RequestOptions.none())

        /** @see query */
        @MustBeClosed
        fun query(requestOptions: RequestOptions): HttpResponseFor<RunQueryResponse> =
            query(RunQueryParams.none(), requestOptions)
    }
}

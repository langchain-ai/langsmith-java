// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.runs.Run
import com.langchain.smith.models.runs.RunCreateParams
import com.langchain.smith.models.runs.RunCreateResponse
import com.langchain.smith.models.runs.RunIngestBatchParams
import com.langchain.smith.models.runs.RunIngestBatchResponse
import com.langchain.smith.models.runs.RunQueryParams
import com.langchain.smith.models.runs.RunQueryResponse
import com.langchain.smith.models.runs.RunRetrieveParams
import com.langchain.smith.models.runs.RunSchema
import com.langchain.smith.models.runs.RunStatsParams
import com.langchain.smith.models.runs.RunStatsQueryParams
import com.langchain.smith.models.runs.RunStatsResponse
import com.langchain.smith.models.runs.RunUpdate2Params
import com.langchain.smith.models.runs.RunUpdate2Response
import com.langchain.smith.models.runs.RunUpdateParams
import com.langchain.smith.models.runs.RunUpdateResponse
import com.langchain.smith.services.blocking.runs.RuleService
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

    fun rules(): RuleService

    /** Flushes any queued runs, blocking until all pending requests have been sent. */
    fun flush() {}

    /**
     * Queues a single run for ingestion. The request body must be a JSON-encoded run object that
     * follows the Run schema.
     */
    fun create(params: RunCreateParams): RunCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunCreateResponse

    /** @see create */
    fun create(
        run: Run,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunCreateResponse = create(RunCreateParams.builder().run(run).build(), requestOptions)

    /** @see create */
    fun create(run: Run): RunCreateResponse = create(run, RequestOptions.none())

    /** Get a specific run. */
    fun retrieve(runId: String): RunSchema = retrieve(runId, RunRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        runId: String,
        params: RunRetrieveParams = RunRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunSchema = retrieve(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(runId: String, params: RunRetrieveParams = RunRetrieveParams.none()): RunSchema =
        retrieve(runId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunSchema

    /** @see retrieve */
    fun retrieve(params: RunRetrieveParams): RunSchema = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(runId: String, requestOptions: RequestOptions): RunSchema =
        retrieve(runId, RunRetrieveParams.none(), requestOptions)

    /**
     * Updates a run identified by its ID. The body should contain only the fields to be changed;
     * unknown fields are ignored.
     */
    fun update(runId: String, params: RunUpdateParams): RunUpdateResponse =
        update(runId, params, RequestOptions.none())

    /** @see update */
    fun update(
        runId: String,
        params: RunUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunUpdateResponse = update(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see update */
    fun update(params: RunUpdateParams): RunUpdateResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RunUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunUpdateResponse

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

    /** Get all runs by query in body payload. */
    fun stats(params: RunStatsParams): RunStatsResponse = stats(params, RequestOptions.none())

    /** @see stats */
    fun stats(
        params: RunStatsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunStatsResponse

    /** @see stats */
    fun stats(
        runStatsQueryParams: RunStatsQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunStatsResponse =
        stats(
            RunStatsParams.builder().runStatsQueryParams(runStatsQueryParams).build(),
            requestOptions,
        )

    /** @see stats */
    fun stats(runStatsQueryParams: RunStatsQueryParams): RunStatsResponse =
        stats(runStatsQueryParams, RequestOptions.none())

    /** Update a run. */
    fun update2(runId: String): RunUpdate2Response = update2(runId, RunUpdate2Params.none())

    /** @see update2 */
    fun update2(
        runId: String,
        params: RunUpdate2Params = RunUpdate2Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunUpdate2Response = update2(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see update2 */
    fun update2(
        runId: String,
        params: RunUpdate2Params = RunUpdate2Params.none(),
    ): RunUpdate2Response = update2(runId, params, RequestOptions.none())

    /** @see update2 */
    fun update2(
        params: RunUpdate2Params,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunUpdate2Response

    /** @see update2 */
    fun update2(params: RunUpdate2Params): RunUpdate2Response =
        update2(params, RequestOptions.none())

    /** @see update2 */
    fun update2(runId: String, requestOptions: RequestOptions): RunUpdate2Response =
        update2(runId, RunUpdate2Params.none(), requestOptions)

    /** A view of [RunService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService.WithRawResponse

        fun rules(): RuleService.WithRawResponse

        /** Flushes any queued runs, blocking until all pending requests have been sent. */
        fun flush() {}

        /**
         * Returns a raw HTTP response for `post /runs`, but is otherwise the same as
         * [RunService.create].
         */
        @MustBeClosed
        fun create(params: RunCreateParams): HttpResponseFor<RunCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RunCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            run: Run,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunCreateResponse> =
            create(RunCreateParams.builder().run(run).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(run: Run): HttpResponseFor<RunCreateResponse> =
            create(run, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /api/v1/runs/{run_id}`, but is otherwise the same as
         * [RunService.retrieve].
         */
        @MustBeClosed
        fun retrieve(runId: String): HttpResponseFor<RunSchema> =
            retrieve(runId, RunRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            runId: String,
            params: RunRetrieveParams = RunRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunSchema> =
            retrieve(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            runId: String,
            params: RunRetrieveParams = RunRetrieveParams.none(),
        ): HttpResponseFor<RunSchema> = retrieve(runId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RunRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunSchema>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: RunRetrieveParams): HttpResponseFor<RunSchema> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(runId: String, requestOptions: RequestOptions): HttpResponseFor<RunSchema> =
            retrieve(runId, RunRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /runs/{run_id}`, but is otherwise the same as
         * [RunService.update].
         */
        @MustBeClosed
        fun update(runId: String, params: RunUpdateParams): HttpResponseFor<RunUpdateResponse> =
            update(runId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            runId: String,
            params: RunUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunUpdateResponse> =
            update(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: RunUpdateParams): HttpResponseFor<RunUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: RunUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunUpdateResponse>

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

        /**
         * Returns a raw HTTP response for `post /api/v1/runs/stats`, but is otherwise the same as
         * [RunService.stats].
         */
        @MustBeClosed
        fun stats(params: RunStatsParams): HttpResponseFor<RunStatsResponse> =
            stats(params, RequestOptions.none())

        /** @see stats */
        @MustBeClosed
        fun stats(
            params: RunStatsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunStatsResponse>

        /** @see stats */
        @MustBeClosed
        fun stats(
            runStatsQueryParams: RunStatsQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunStatsResponse> =
            stats(
                RunStatsParams.builder().runStatsQueryParams(runStatsQueryParams).build(),
                requestOptions,
            )

        /** @see stats */
        @MustBeClosed
        fun stats(runStatsQueryParams: RunStatsQueryParams): HttpResponseFor<RunStatsResponse> =
            stats(runStatsQueryParams, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /api/v1/runs/{run_id}`, but is otherwise the same
         * as [RunService.update2].
         */
        @MustBeClosed
        fun update2(runId: String): HttpResponseFor<RunUpdate2Response> =
            update2(runId, RunUpdate2Params.none())

        /** @see update2 */
        @MustBeClosed
        fun update2(
            runId: String,
            params: RunUpdate2Params = RunUpdate2Params.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunUpdate2Response> =
            update2(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see update2 */
        @MustBeClosed
        fun update2(
            runId: String,
            params: RunUpdate2Params = RunUpdate2Params.none(),
        ): HttpResponseFor<RunUpdate2Response> = update2(runId, params, RequestOptions.none())

        /** @see update2 */
        @MustBeClosed
        fun update2(
            params: RunUpdate2Params,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunUpdate2Response>

        /** @see update2 */
        @MustBeClosed
        fun update2(params: RunUpdate2Params): HttpResponseFor<RunUpdate2Response> =
            update2(params, RequestOptions.none())

        /** @see update2 */
        @MustBeClosed
        fun update2(
            runId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunUpdate2Response> =
            update2(runId, RunUpdate2Params.none(), requestOptions)
    }
}

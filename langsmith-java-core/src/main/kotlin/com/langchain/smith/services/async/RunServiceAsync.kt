// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

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
import com.langchain.smith.services.async.runs.RuleServiceAsync
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

    fun rules(): RuleServiceAsync

    /** Flushes any queued runs, completing when all pending requests have been sent. */
    fun flush(): CompletableFuture<Void?> = CompletableFuture.completedFuture(null)

    /**
     * Queues a single run for ingestion. The request body must be a JSON-encoded run object that
     * follows the Run schema.
     */
    fun create(params: RunCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see create */
    fun create(
        run: Run,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = create(RunCreateParams.builder().run(run).build(), requestOptions)

    /** @see create */
    fun create(run: Run): CompletableFuture<Void?> = create(run, RequestOptions.none())

    /** Get a specific run. */
    fun retrieve(runId: String): CompletableFuture<RunSchema> =
        retrieve(runId, RunRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        runId: String,
        params: RunRetrieveParams = RunRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunSchema> =
        retrieve(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        runId: String,
        params: RunRetrieveParams = RunRetrieveParams.none(),
    ): CompletableFuture<RunSchema> = retrieve(runId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunSchema>

    /** @see retrieve */
    fun retrieve(params: RunRetrieveParams): CompletableFuture<RunSchema> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(runId: String, requestOptions: RequestOptions): CompletableFuture<RunSchema> =
        retrieve(runId, RunRetrieveParams.none(), requestOptions)

    /**
     * Updates a run identified by its ID. The body should contain only the fields to be changed;
     * unknown fields are ignored.
     */
    fun update(runId: String, params: RunUpdateParams): CompletableFuture<Void?> =
        update(runId, params, RequestOptions.none())

    /** @see update */
    fun update(
        runId: String,
        params: RunUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see update */
    fun update(params: RunUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RunUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

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

    /** Get all runs by query in body payload. */
    fun stats(params: RunStatsParams): CompletableFuture<RunStatsResponse> =
        stats(params, RequestOptions.none())

    /** @see stats */
    fun stats(
        params: RunStatsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunStatsResponse>

    /** @see stats */
    fun stats(
        runStatsQueryParams: RunStatsQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunStatsResponse> =
        stats(
            RunStatsParams.builder().runStatsQueryParams(runStatsQueryParams).build(),
            requestOptions,
        )

    /** @see stats */
    fun stats(runStatsQueryParams: RunStatsQueryParams): CompletableFuture<RunStatsResponse> =
        stats(runStatsQueryParams, RequestOptions.none())

    /** Update a run. */
    fun update2(runId: String): CompletableFuture<RunUpdate2Response> =
        update2(runId, RunUpdate2Params.none())

    /** @see update2 */
    fun update2(
        runId: String,
        params: RunUpdate2Params = RunUpdate2Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunUpdate2Response> =
        update2(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see update2 */
    fun update2(
        runId: String,
        params: RunUpdate2Params = RunUpdate2Params.none(),
    ): CompletableFuture<RunUpdate2Response> = update2(runId, params, RequestOptions.none())

    /** @see update2 */
    fun update2(
        params: RunUpdate2Params,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunUpdate2Response>

    /** @see update2 */
    fun update2(params: RunUpdate2Params): CompletableFuture<RunUpdate2Response> =
        update2(params, RequestOptions.none())

    /** @see update2 */
    fun update2(
        runId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunUpdate2Response> =
        update2(runId, RunUpdate2Params.none(), requestOptions)

    /** A view of [RunServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync.WithRawResponse

        fun rules(): RuleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /runs`, but is otherwise the same as
         * [RunServiceAsync.create].
         */
        fun create(params: RunCreateParams): CompletableFuture<HttpResponseFor<RunCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: RunCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunCreateResponse>>

        /** @see create */
        fun create(
            run: Run,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunCreateResponse>> =
            create(RunCreateParams.builder().run(run).build(), requestOptions)

        /** @see create */
        fun create(run: Run): CompletableFuture<HttpResponseFor<RunCreateResponse>> =
            create(run, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /api/v1/runs/{run_id}`, but is otherwise the same as
         * [RunServiceAsync.retrieve].
         */
        fun retrieve(runId: String): CompletableFuture<HttpResponseFor<RunSchema>> =
            retrieve(runId, RunRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            runId: String,
            params: RunRetrieveParams = RunRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunSchema>> =
            retrieve(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            runId: String,
            params: RunRetrieveParams = RunRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<RunSchema>> =
            retrieve(runId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RunRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunSchema>>

        /** @see retrieve */
        fun retrieve(params: RunRetrieveParams): CompletableFuture<HttpResponseFor<RunSchema>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            runId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunSchema>> =
            retrieve(runId, RunRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /runs/{run_id}`, but is otherwise the same as
         * [RunServiceAsync.update].
         */
        fun update(
            runId: String,
            params: RunUpdateParams,
        ): CompletableFuture<HttpResponseFor<RunUpdateResponse>> =
            update(runId, params, RequestOptions.none())

        /** @see update */
        fun update(
            runId: String,
            params: RunUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunUpdateResponse>> =
            update(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see update */
        fun update(params: RunUpdateParams): CompletableFuture<HttpResponseFor<RunUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: RunUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunUpdateResponse>>

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

        /**
         * Returns a raw HTTP response for `post /api/v1/runs/stats`, but is otherwise the same as
         * [RunServiceAsync.stats].
         */
        fun stats(params: RunStatsParams): CompletableFuture<HttpResponseFor<RunStatsResponse>> =
            stats(params, RequestOptions.none())

        /** @see stats */
        fun stats(
            params: RunStatsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunStatsResponse>>

        /** @see stats */
        fun stats(
            runStatsQueryParams: RunStatsQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunStatsResponse>> =
            stats(
                RunStatsParams.builder().runStatsQueryParams(runStatsQueryParams).build(),
                requestOptions,
            )

        /** @see stats */
        fun stats(
            runStatsQueryParams: RunStatsQueryParams
        ): CompletableFuture<HttpResponseFor<RunStatsResponse>> =
            stats(runStatsQueryParams, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /api/v1/runs/{run_id}`, but is otherwise the same
         * as [RunServiceAsync.update2].
         */
        fun update2(runId: String): CompletableFuture<HttpResponseFor<RunUpdate2Response>> =
            update2(runId, RunUpdate2Params.none())

        /** @see update2 */
        fun update2(
            runId: String,
            params: RunUpdate2Params = RunUpdate2Params.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunUpdate2Response>> =
            update2(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see update2 */
        fun update2(
            runId: String,
            params: RunUpdate2Params = RunUpdate2Params.none(),
        ): CompletableFuture<HttpResponseFor<RunUpdate2Response>> =
            update2(runId, params, RequestOptions.none())

        /** @see update2 */
        fun update2(
            params: RunUpdate2Params,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunUpdate2Response>>

        /** @see update2 */
        fun update2(
            params: RunUpdate2Params
        ): CompletableFuture<HttpResponseFor<RunUpdate2Response>> =
            update2(params, RequestOptions.none())

        /** @see update2 */
        fun update2(
            runId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunUpdate2Response>> =
            update2(runId, RunUpdate2Params.none(), requestOptions)
    }
}

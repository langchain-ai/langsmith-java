// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.runs.Run
import com.langchain.smith.models.runs.RunCreateParams
import com.langchain.smith.models.runs.RunCreateResponse
import com.langchain.smith.models.runs.RunIngest
import com.langchain.smith.models.runs.RunIngestBatchParams
import com.langchain.smith.models.runs.RunIngestBatchResponse
import com.langchain.smith.models.runs.RunQueryPageAsync
import com.langchain.smith.models.runs.RunQueryParams
import com.langchain.smith.models.runs.RunQueryV1PageAsync
import com.langchain.smith.models.runs.RunQueryV1Params
import com.langchain.smith.models.runs.RunQueryV2PageAsync
import com.langchain.smith.models.runs.RunQueryV2Params
import com.langchain.smith.models.runs.RunRetrieveParams
import com.langchain.smith.models.runs.RunRetrieveV1Params
import com.langchain.smith.models.runs.RunRetrieveV2Params
import com.langchain.smith.models.runs.RunSchema
import com.langchain.smith.models.runs.RunStatsParams
import com.langchain.smith.models.runs.RunStatsQueryParams
import com.langchain.smith.models.runs.RunStatsResponse
import com.langchain.smith.models.runs.RunUpdate2Params
import com.langchain.smith.models.runs.RunUpdate2Response
import com.langchain.smith.models.runs.RunUpdateParams
import com.langchain.smith.models.runs.RunUpdateResponse
import com.langchain.smith.services.async.runs.RuleServiceAsync
import com.langchain.smith.services.async.runs.ShareServiceAsync
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

    fun share(): ShareServiceAsync

    /** Flushes any queued runs, completing when all pending requests have been sent. */
    fun flush(): CompletableFuture<Void?> = CompletableFuture.completedFuture(null)

    /**
     * Queues a single run for ingestion. The request body must be a JSON-encoded run object that
     * follows the Run schema.
     */
    fun create(params: RunCreateParams): CompletableFuture<RunCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunCreateResponse>

    /** @see create */
    fun create(
        runIngest: RunIngest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunCreateResponse> =
        create(RunCreateParams.builder().runIngest(runIngest).build(), requestOptions)

    /** @see create */
    fun create(runIngest: RunIngest): CompletableFuture<RunCreateResponse> =
        create(runIngest, RequestOptions.none())

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

    /**
     * Ingests runs through `/runs/multipart`, allowing large run fields and per-run binary
     * attachments. This mirrors the Python/JS multipart ingest shape: create runs and update runs
     * are provided separately, and attachments are set on each [RunIngest].
     */
    fun multipartIngest(): CompletableFuture<Void?> = multipartIngest(emptyList(), emptyList())

    /** @see multipartIngest */
    fun multipartIngest(
        create: List<RunIngest> = emptyList(),
        update: List<RunIngest> = emptyList(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see multipartIngest */
    fun multipartIngest(
        create: List<RunIngest> = emptyList(),
        update: List<RunIngest> = emptyList(),
    ): CompletableFuture<Void?> = multipartIngest(create, update, RequestOptions.none())

    /** @see multipartIngest */
    fun multipartIngest(requestOptions: RequestOptions): CompletableFuture<Void?> =
        multipartIngest(emptyList(), emptyList(), requestOptions)

    /** @see multipartIngest */
    fun multipartIngest(
        params: RunIngestBatchParams = RunIngestBatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        multipartIngest(
            params.post().orElse(emptyList()),
            params.patch().orElse(emptyList()),
            requestOptions,
        )

    /** Query Runs */
    fun queryV1(): CompletableFuture<RunQueryV1PageAsync> = queryV1(RunQueryV1Params.none())

    /** @see queryV1 */
    fun queryV1(
        params: RunQueryV1Params = RunQueryV1Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunQueryV1PageAsync>

    /** @see queryV1 */
    fun queryV1(
        params: RunQueryV1Params = RunQueryV1Params.none()
    ): CompletableFuture<RunQueryV1PageAsync> = queryV1(params, RequestOptions.none())

    /** @see queryV1 */
    fun queryV1(requestOptions: RequestOptions): CompletableFuture<RunQueryV1PageAsync> =
        queryV1(RunQueryV1Params.none(), requestOptions)

    /**
     * **Alpha:** The request and response contract may change; Returns a paginated list of runs for
     * the given projects within min/max start_time. Supports filters, cursor pagination, and
     * `selects` to select fields to return.
     */
    fun queryV2(): CompletableFuture<RunQueryV2PageAsync> = queryV2(RunQueryV2Params.none())

    /** @see queryV2 */
    fun queryV2(
        params: RunQueryV2Params = RunQueryV2Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunQueryV2PageAsync>

    /** @see queryV2 */
    fun queryV2(
        params: RunQueryV2Params = RunQueryV2Params.none()
    ): CompletableFuture<RunQueryV2PageAsync> = queryV2(params, RequestOptions.none())

    /** @see queryV2 */
    fun queryV2(requestOptions: RequestOptions): CompletableFuture<RunQueryV2PageAsync> =
        queryV2(RunQueryV2Params.none(), requestOptions)

    /** Get a specific run. */
    fun retrieveV1(runId: String): CompletableFuture<RunSchema> =
        retrieveV1(runId, RunRetrieveV1Params.none())

    /** @see retrieveV1 */
    fun retrieveV1(
        runId: String,
        params: RunRetrieveV1Params = RunRetrieveV1Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunSchema> =
        retrieveV1(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see retrieveV1 */
    fun retrieveV1(
        runId: String,
        params: RunRetrieveV1Params = RunRetrieveV1Params.none(),
    ): CompletableFuture<RunSchema> = retrieveV1(runId, params, RequestOptions.none())

    /** @see retrieveV1 */
    fun retrieveV1(
        params: RunRetrieveV1Params,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunSchema>

    /** @see retrieveV1 */
    fun retrieveV1(params: RunRetrieveV1Params): CompletableFuture<RunSchema> =
        retrieveV1(params, RequestOptions.none())

    /** @see retrieveV1 */
    fun retrieveV1(runId: String, requestOptions: RequestOptions): CompletableFuture<RunSchema> =
        retrieveV1(runId, RunRetrieveV1Params.none(), requestOptions)

    /**
     * **Alpha:** The request and response contract may change; Returns one run by ID for the given
     * session and start_time. Use the `selects` query parameter (repeatable) to select fields to
     * return.
     */
    fun retrieveV2(runId: String, params: RunRetrieveV2Params): CompletableFuture<Run> =
        retrieveV2(runId, params, RequestOptions.none())

    /** @see retrieveV2 */
    fun retrieveV2(
        runId: String,
        params: RunRetrieveV2Params,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Run> = retrieveV2(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see retrieveV2 */
    fun retrieveV2(params: RunRetrieveV2Params): CompletableFuture<Run> =
        retrieveV2(params, RequestOptions.none())

    /** @see retrieveV2 */
    fun retrieveV2(
        params: RunRetrieveV2Params,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Run>

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

    /** Query Runs */
    fun query(): CompletableFuture<RunQueryPageAsync> = query(RunQueryParams.none())

    /** @see query */
    fun query(
        params: RunQueryParams = RunQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunQueryPageAsync>

    /** @see query */
    fun query(
        params: RunQueryParams = RunQueryParams.none()
    ): CompletableFuture<RunQueryPageAsync> = query(params, RequestOptions.none())

    /** @see query */
    fun query(requestOptions: RequestOptions): CompletableFuture<RunQueryPageAsync> =
        query(RunQueryParams.none(), requestOptions)

    /** A view of [RunServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync.WithRawResponse

        fun share(): ShareServiceAsync.WithRawResponse

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
            runIngest: RunIngest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunCreateResponse>> =
            create(RunCreateParams.builder().runIngest(runIngest).build(), requestOptions)

        /** @see create */
        fun create(runIngest: RunIngest): CompletableFuture<HttpResponseFor<RunCreateResponse>> =
            create(runIngest, RequestOptions.none())

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
         * Returns a raw HTTP response for `post /runs/multipart`, but is otherwise the same as
         * [RunServiceAsync.multipartIngest].
         */
        fun multipartIngest(): CompletableFuture<HttpResponseFor<Void?>> =
            multipartIngest(emptyList(), emptyList())

        /** @see multipartIngest */
        fun multipartIngest(
            create: List<RunIngest> = emptyList(),
            update: List<RunIngest> = emptyList(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Void?>>

        /** @see multipartIngest */
        fun multipartIngest(
            create: List<RunIngest> = emptyList(),
            update: List<RunIngest> = emptyList(),
        ): CompletableFuture<HttpResponseFor<Void?>> =
            multipartIngest(create, update, RequestOptions.none())

        /** @see multipartIngest */
        fun multipartIngest(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<Void?>> =
            multipartIngest(emptyList(), emptyList(), requestOptions)

        /** @see multipartIngest */
        fun multipartIngest(
            params: RunIngestBatchParams = RunIngestBatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Void?>> =
            multipartIngest(
                params.post().orElse(emptyList()),
                params.patch().orElse(emptyList()),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /api/v1/runs/query`, but is otherwise the same as
         * [RunServiceAsync.queryV1].
         */
        fun queryV1(): CompletableFuture<HttpResponseFor<RunQueryV1PageAsync>> =
            queryV1(RunQueryV1Params.none())

        /** @see queryV1 */
        fun queryV1(
            params: RunQueryV1Params = RunQueryV1Params.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunQueryV1PageAsync>>

        /** @see queryV1 */
        fun queryV1(
            params: RunQueryV1Params = RunQueryV1Params.none()
        ): CompletableFuture<HttpResponseFor<RunQueryV1PageAsync>> =
            queryV1(params, RequestOptions.none())

        /** @see queryV1 */
        fun queryV1(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RunQueryV1PageAsync>> =
            queryV1(RunQueryV1Params.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v2/runs/query`, but is otherwise the same as
         * [RunServiceAsync.queryV2].
         */
        fun queryV2(): CompletableFuture<HttpResponseFor<RunQueryV2PageAsync>> =
            queryV2(RunQueryV2Params.none())

        /** @see queryV2 */
        fun queryV2(
            params: RunQueryV2Params = RunQueryV2Params.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunQueryV2PageAsync>>

        /** @see queryV2 */
        fun queryV2(
            params: RunQueryV2Params = RunQueryV2Params.none()
        ): CompletableFuture<HttpResponseFor<RunQueryV2PageAsync>> =
            queryV2(params, RequestOptions.none())

        /** @see queryV2 */
        fun queryV2(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RunQueryV2PageAsync>> =
            queryV2(RunQueryV2Params.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/runs/{run_id}`, but is otherwise the same as
         * [RunServiceAsync.retrieveV1].
         */
        fun retrieveV1(runId: String): CompletableFuture<HttpResponseFor<RunSchema>> =
            retrieveV1(runId, RunRetrieveV1Params.none())

        /** @see retrieveV1 */
        fun retrieveV1(
            runId: String,
            params: RunRetrieveV1Params = RunRetrieveV1Params.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunSchema>> =
            retrieveV1(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see retrieveV1 */
        fun retrieveV1(
            runId: String,
            params: RunRetrieveV1Params = RunRetrieveV1Params.none(),
        ): CompletableFuture<HttpResponseFor<RunSchema>> =
            retrieveV1(runId, params, RequestOptions.none())

        /** @see retrieveV1 */
        fun retrieveV1(
            params: RunRetrieveV1Params,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunSchema>>

        /** @see retrieveV1 */
        fun retrieveV1(params: RunRetrieveV1Params): CompletableFuture<HttpResponseFor<RunSchema>> =
            retrieveV1(params, RequestOptions.none())

        /** @see retrieveV1 */
        fun retrieveV1(
            runId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunSchema>> =
            retrieveV1(runId, RunRetrieveV1Params.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/runs/{run_id}`, but is otherwise the same as
         * [RunServiceAsync.retrieveV2].
         */
        fun retrieveV2(
            runId: String,
            params: RunRetrieveV2Params,
        ): CompletableFuture<HttpResponseFor<Run>> =
            retrieveV2(runId, params, RequestOptions.none())

        /** @see retrieveV2 */
        fun retrieveV2(
            runId: String,
            params: RunRetrieveV2Params,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Run>> =
            retrieveV2(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see retrieveV2 */
        fun retrieveV2(params: RunRetrieveV2Params): CompletableFuture<HttpResponseFor<Run>> =
            retrieveV2(params, RequestOptions.none())

        /** @see retrieveV2 */
        fun retrieveV2(
            params: RunRetrieveV2Params,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Run>>

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
         * Returns a raw HTTP response for `post /api/v1/runs/query`, but is otherwise the same as
         * [RunServiceAsync.query].
         */
        fun query(): CompletableFuture<HttpResponseFor<RunQueryPageAsync>> =
            query(RunQueryParams.none())

        /** @see query */
        fun query(
            params: RunQueryParams = RunQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunQueryPageAsync>>

        /** @see query */
        fun query(
            params: RunQueryParams = RunQueryParams.none()
        ): CompletableFuture<HttpResponseFor<RunQueryPageAsync>> =
            query(params, RequestOptions.none())

        /** @see query */
        fun query(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RunQueryPageAsync>> =
            query(RunQueryParams.none(), requestOptions)
    }
}

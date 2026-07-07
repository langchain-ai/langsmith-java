// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.runs.Run
import com.langchain.smith.models.runs.RunCreateParams
import com.langchain.smith.models.runs.RunCreateResponse
import com.langchain.smith.models.runs.RunIngest
import com.langchain.smith.models.runs.RunIngestBatchParams
import com.langchain.smith.models.runs.RunIngestBatchResponse
import com.langchain.smith.models.runs.RunQueryPage
import com.langchain.smith.models.runs.RunQueryParams
import com.langchain.smith.models.runs.RunQueryV1Page
import com.langchain.smith.models.runs.RunQueryV1Params
import com.langchain.smith.models.runs.RunQueryV2Page
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
        runIngest: RunIngest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunCreateResponse =
        create(RunCreateParams.builder().runIngest(runIngest).build(), requestOptions)

    /** @see create */
    fun create(runIngest: RunIngest): RunCreateResponse = create(runIngest, RequestOptions.none())

    /**
     * Updates a run identified by its ID. The body should contain only the fields to be changed;
     * unknown fields are ignored.
     */
    fun update(runId: String, params: RunUpdateParams) =
        update(runId, params, RequestOptions.none())

    /** @see update */
    fun update(
        runId: String,
        params: RunUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see update */
    fun update(params: RunUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(params: RunUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

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

    /**
     * Ingests runs through `/runs/multipart`, allowing large run fields and per-run binary
     * attachments. This mirrors the Python/JS multipart ingest shape: create runs and update runs
     * are provided separately, and attachments are set on each [RunIngest].
     */
    fun multipartIngest(): Void? = multipartIngest(emptyList(), emptyList())

    /** @see multipartIngest */
    fun multipartIngest(
        create: List<RunIngest> = emptyList(),
        update: List<RunIngest> = emptyList(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Void?

    /** @see multipartIngest */
    fun multipartIngest(
        create: List<RunIngest> = emptyList(),
        update: List<RunIngest> = emptyList(),
    ): Void? = multipartIngest(create, update, RequestOptions.none())

    /** @see multipartIngest */
    fun multipartIngest(requestOptions: RequestOptions): Void? =
        multipartIngest(emptyList(), emptyList(), requestOptions)

    /** @see multipartIngest */
    fun multipartIngest(
        params: RunIngestBatchParams = RunIngestBatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Void? =
        multipartIngest(
            params.post().orElse(emptyList()),
            params.patch().orElse(emptyList()),
            requestOptions,
        )

    /** Query Runs */
    fun queryV1(): RunQueryV1Page = queryV1(RunQueryV1Params.none())

    /** @see queryV1 */
    fun queryV1(
        params: RunQueryV1Params = RunQueryV1Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunQueryV1Page

    /** @see queryV1 */
    fun queryV1(params: RunQueryV1Params = RunQueryV1Params.none()): RunQueryV1Page =
        queryV1(params, RequestOptions.none())

    /** @see queryV1 */
    fun queryV1(requestOptions: RequestOptions): RunQueryV1Page =
        queryV1(RunQueryV1Params.none(), requestOptions)

    /**
     * **Alpha:** The request and response contract may change; Returns a paginated list of runs for
     * the given projects within min/max start_time. Supports filters, cursor pagination, and
     * `selects` to select fields to return.
     */
    fun queryV2(): RunQueryV2Page = queryV2(RunQueryV2Params.none())

    /** @see queryV2 */
    fun queryV2(
        params: RunQueryV2Params = RunQueryV2Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunQueryV2Page

    /** @see queryV2 */
    fun queryV2(params: RunQueryV2Params = RunQueryV2Params.none()): RunQueryV2Page =
        queryV2(params, RequestOptions.none())

    /** @see queryV2 */
    fun queryV2(requestOptions: RequestOptions): RunQueryV2Page =
        queryV2(RunQueryV2Params.none(), requestOptions)

    /** Get a specific run. */
    fun retrieveV1(runId: String): RunSchema = retrieveV1(runId, RunRetrieveV1Params.none())

    /** @see retrieveV1 */
    fun retrieveV1(
        runId: String,
        params: RunRetrieveV1Params = RunRetrieveV1Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunSchema = retrieveV1(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see retrieveV1 */
    fun retrieveV1(
        runId: String,
        params: RunRetrieveV1Params = RunRetrieveV1Params.none(),
    ): RunSchema = retrieveV1(runId, params, RequestOptions.none())

    /** @see retrieveV1 */
    fun retrieveV1(
        params: RunRetrieveV1Params,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunSchema

    /** @see retrieveV1 */
    fun retrieveV1(params: RunRetrieveV1Params): RunSchema =
        retrieveV1(params, RequestOptions.none())

    /** @see retrieveV1 */
    fun retrieveV1(runId: String, requestOptions: RequestOptions): RunSchema =
        retrieveV1(runId, RunRetrieveV1Params.none(), requestOptions)

    /**
     * **Alpha:** The request and response contract may change; Returns one run by ID for the given
     * session and start_time. Use the `selects` query parameter (repeatable) to select fields to
     * return.
     */
    fun retrieveV2(runId: String, params: RunRetrieveV2Params): Run =
        retrieveV2(runId, params, RequestOptions.none())

    /** @see retrieveV2 */
    fun retrieveV2(
        runId: String,
        params: RunRetrieveV2Params,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Run = retrieveV2(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see retrieveV2 */
    fun retrieveV2(params: RunRetrieveV2Params): Run = retrieveV2(params, RequestOptions.none())

    /** @see retrieveV2 */
    fun retrieveV2(
        params: RunRetrieveV2Params,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Run

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

    /** Query Runs */
    fun query(): RunQueryPage = query(RunQueryParams.none())

    /** @see query */
    fun query(
        params: RunQueryParams = RunQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunQueryPage

    /** @see query */
    fun query(params: RunQueryParams = RunQueryParams.none()): RunQueryPage =
        query(params, RequestOptions.none())

    /** @see query */
    fun query(requestOptions: RequestOptions): RunQueryPage =
        query(RunQueryParams.none(), requestOptions)

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
            runIngest: RunIngest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunCreateResponse> =
            create(RunCreateParams.builder().runIngest(runIngest).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(runIngest: RunIngest): HttpResponseFor<RunCreateResponse> =
            create(runIngest, RequestOptions.none())

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
         * Returns a raw HTTP response for `post /runs/multipart`, but is otherwise the same as
         * [RunService.multipartIngest].
         */
        @MustBeClosed
        fun multipartIngest(): HttpResponseFor<Void?> = multipartIngest(emptyList(), emptyList())

        /** @see multipartIngest */
        @MustBeClosed
        fun multipartIngest(
            create: List<RunIngest> = emptyList(),
            update: List<RunIngest> = emptyList(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Void?>

        /** @see multipartIngest */
        @MustBeClosed
        fun multipartIngest(
            create: List<RunIngest> = emptyList(),
            update: List<RunIngest> = emptyList(),
        ): HttpResponseFor<Void?> = multipartIngest(create, update, RequestOptions.none())

        /** @see multipartIngest */
        @MustBeClosed
        fun multipartIngest(requestOptions: RequestOptions): HttpResponseFor<Void?> =
            multipartIngest(emptyList(), emptyList(), requestOptions)

        /** @see multipartIngest */
        @MustBeClosed
        fun multipartIngest(
            params: RunIngestBatchParams = RunIngestBatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Void?> =
            multipartIngest(
                params.post().orElse(emptyList()),
                params.patch().orElse(emptyList()),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /api/v1/runs/query`, but is otherwise the same as
         * [RunService.queryV1].
         */
        @MustBeClosed
        fun queryV1(): HttpResponseFor<RunQueryV1Page> = queryV1(RunQueryV1Params.none())

        /** @see queryV1 */
        @MustBeClosed
        fun queryV1(
            params: RunQueryV1Params = RunQueryV1Params.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunQueryV1Page>

        /** @see queryV1 */
        @MustBeClosed
        fun queryV1(
            params: RunQueryV1Params = RunQueryV1Params.none()
        ): HttpResponseFor<RunQueryV1Page> = queryV1(params, RequestOptions.none())

        /** @see queryV1 */
        @MustBeClosed
        fun queryV1(requestOptions: RequestOptions): HttpResponseFor<RunQueryV1Page> =
            queryV1(RunQueryV1Params.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v2/runs/query`, but is otherwise the same as
         * [RunService.queryV2].
         */
        @MustBeClosed
        fun queryV2(): HttpResponseFor<RunQueryV2Page> = queryV2(RunQueryV2Params.none())

        /** @see queryV2 */
        @MustBeClosed
        fun queryV2(
            params: RunQueryV2Params = RunQueryV2Params.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunQueryV2Page>

        /** @see queryV2 */
        @MustBeClosed
        fun queryV2(
            params: RunQueryV2Params = RunQueryV2Params.none()
        ): HttpResponseFor<RunQueryV2Page> = queryV2(params, RequestOptions.none())

        /** @see queryV2 */
        @MustBeClosed
        fun queryV2(requestOptions: RequestOptions): HttpResponseFor<RunQueryV2Page> =
            queryV2(RunQueryV2Params.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/runs/{run_id}`, but is otherwise the same as
         * [RunService.retrieveV1].
         */
        @MustBeClosed
        fun retrieveV1(runId: String): HttpResponseFor<RunSchema> =
            retrieveV1(runId, RunRetrieveV1Params.none())

        /** @see retrieveV1 */
        @MustBeClosed
        fun retrieveV1(
            runId: String,
            params: RunRetrieveV1Params = RunRetrieveV1Params.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunSchema> =
            retrieveV1(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see retrieveV1 */
        @MustBeClosed
        fun retrieveV1(
            runId: String,
            params: RunRetrieveV1Params = RunRetrieveV1Params.none(),
        ): HttpResponseFor<RunSchema> = retrieveV1(runId, params, RequestOptions.none())

        /** @see retrieveV1 */
        @MustBeClosed
        fun retrieveV1(
            params: RunRetrieveV1Params,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunSchema>

        /** @see retrieveV1 */
        @MustBeClosed
        fun retrieveV1(params: RunRetrieveV1Params): HttpResponseFor<RunSchema> =
            retrieveV1(params, RequestOptions.none())

        /** @see retrieveV1 */
        @MustBeClosed
        fun retrieveV1(runId: String, requestOptions: RequestOptions): HttpResponseFor<RunSchema> =
            retrieveV1(runId, RunRetrieveV1Params.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/runs/{run_id}`, but is otherwise the same as
         * [RunService.retrieveV2].
         */
        @MustBeClosed
        fun retrieveV2(runId: String, params: RunRetrieveV2Params): HttpResponseFor<Run> =
            retrieveV2(runId, params, RequestOptions.none())

        /** @see retrieveV2 */
        @MustBeClosed
        fun retrieveV2(
            runId: String,
            params: RunRetrieveV2Params,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Run> =
            retrieveV2(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see retrieveV2 */
        @MustBeClosed
        fun retrieveV2(params: RunRetrieveV2Params): HttpResponseFor<Run> =
            retrieveV2(params, RequestOptions.none())

        /** @see retrieveV2 */
        @MustBeClosed
        fun retrieveV2(
            params: RunRetrieveV2Params,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Run>

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
         * Returns a raw HTTP response for `post /api/v1/runs/query`, but is otherwise the same as
         * [RunService.query].
         */
        @MustBeClosed fun query(): HttpResponseFor<RunQueryPage> = query(RunQueryParams.none())

        /** @see query */
        @MustBeClosed
        fun query(
            params: RunQueryParams = RunQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunQueryPage>

        /** @see query */
        @MustBeClosed
        fun query(params: RunQueryParams = RunQueryParams.none()): HttpResponseFor<RunQueryPage> =
            query(params, RequestOptions.none())

        /** @see query */
        @MustBeClosed
        fun query(requestOptions: RequestOptions): HttpResponseFor<RunQueryPage> =
            query(RunQueryParams.none(), requestOptions)
    }
}

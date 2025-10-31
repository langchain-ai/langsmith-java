// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.runs.BodyParamsForRunSchema
import com.langchain.smith.models.runs.RequestBodyForRunsGenerateQuery
import com.langchain.smith.models.runs.ResponseBodyForRunsGenerateQuery
import com.langchain.smith.models.runs.Run
import com.langchain.smith.models.runs.RunCreateParams
import com.langchain.smith.models.runs.RunCreateResponse
import com.langchain.smith.models.runs.RunDeleteParams
import com.langchain.smith.models.runs.RunDeleteResponse
import com.langchain.smith.models.runs.RunGenerateQueryParams
import com.langchain.smith.models.runs.RunIngestBatchParams
import com.langchain.smith.models.runs.RunIngestBatchResponse
import com.langchain.smith.models.runs.RunIngestMultipartParams
import com.langchain.smith.models.runs.RunIngestMultipartResponse
import com.langchain.smith.models.runs.RunQueryParams
import com.langchain.smith.models.runs.RunQueryResponse
import com.langchain.smith.models.runs.RunRetrieveParams
import com.langchain.smith.models.runs.RunRetrieveThreadPreviewParams
import com.langchain.smith.models.runs.RunRetrieveThreadPreviewResponse
import com.langchain.smith.models.runs.RunSchema
import com.langchain.smith.models.runs.RunStatsParams
import com.langchain.smith.models.runs.RunStatsQueryParams
import com.langchain.smith.models.runs.RunStatsResponse
import com.langchain.smith.models.runs.RunUpdate2Params
import com.langchain.smith.models.runs.RunUpdate2Response
import com.langchain.smith.models.runs.RunUpdateParams
import com.langchain.smith.models.runs.RunUpdateResponse
import com.langchain.smith.services.blocking.runs.GroupService
import com.langchain.smith.services.blocking.runs.RuleService
import com.langchain.smith.services.blocking.runs.ShareService
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

    fun share(): ShareService

    fun group(): GroupService

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
    fun update(runId: JsonValue, params: RunUpdateParams): RunUpdateResponse =
        update(runId, params, RequestOptions.none())

    /** @see update */
    fun update(
        runId: JsonValue,
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

    /** Delete specific runs by trace IDs or metadata key-value pairs. */
    fun delete(): RunDeleteResponse = delete(RunDeleteParams.none())

    /** @see delete */
    fun delete(
        params: RunDeleteParams = RunDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunDeleteResponse

    /** @see delete */
    fun delete(params: RunDeleteParams = RunDeleteParams.none()): RunDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(requestOptions: RequestOptions): RunDeleteResponse =
        delete(RunDeleteParams.none(), requestOptions)

    /** Get runs filter expression query for a given natural language query. */
    fun generateQuery(params: RunGenerateQueryParams): ResponseBodyForRunsGenerateQuery =
        generateQuery(params, RequestOptions.none())

    /** @see generateQuery */
    fun generateQuery(
        params: RunGenerateQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseBodyForRunsGenerateQuery

    /** @see generateQuery */
    fun generateQuery(
        requestBodyForRunsGenerateQuery: RequestBodyForRunsGenerateQuery,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseBodyForRunsGenerateQuery =
        generateQuery(
            RunGenerateQueryParams.builder()
                .requestBodyForRunsGenerateQuery(requestBodyForRunsGenerateQuery)
                .build(),
            requestOptions,
        )

    /** @see generateQuery */
    fun generateQuery(
        requestBodyForRunsGenerateQuery: RequestBodyForRunsGenerateQuery
    ): ResponseBodyForRunsGenerateQuery =
        generateQuery(requestBodyForRunsGenerateQuery, RequestOptions.none())

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
     * Ingests multiple runs, feedback objects, and binary attachments in a single
     * `multipart/form-data` request. **Part‑name pattern**: `<event>.<run_id>[.<field>]` where
     * `event` ∈ {`post`, `patch`, `feedback`, `attachment`}.
     * * `post|patch.<run_id>` – JSON run payload.
     * * `post|patch.<run_id>.<field>` – out‑of‑band run data (`inputs`, `outputs`, `events`,
     *   `error`, `extra`, `serialized`).
     * * `feedback.<run_id>` – JSON feedback payload (must include `trace_id`).
     * * `attachment.<run_id>.<filename>` – arbitrary binary attachment stored in S3. **Headers**:
     *   every part must set `Content-Type` **and** either a `Content-Length` header or `length`
     *   parameter. Per‑part `Content-Encoding` is **not** allowed; the top‑level request may be
     *   `Content-Encoding: gzip` or `Content-Encoding: zstd`. **Best performance** for high‑volume
     *   ingestion.
     */
    fun ingestMultipart(): RunIngestMultipartResponse =
        ingestMultipart(RunIngestMultipartParams.none())

    /** @see ingestMultipart */
    fun ingestMultipart(
        params: RunIngestMultipartParams = RunIngestMultipartParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunIngestMultipartResponse

    /** @see ingestMultipart */
    fun ingestMultipart(
        params: RunIngestMultipartParams = RunIngestMultipartParams.none()
    ): RunIngestMultipartResponse = ingestMultipart(params, RequestOptions.none())

    /** @see ingestMultipart */
    fun ingestMultipart(requestOptions: RequestOptions): RunIngestMultipartResponse =
        ingestMultipart(RunIngestMultipartParams.none(), requestOptions)

    /** Query Runs */
    fun query(params: RunQueryParams): RunQueryResponse = query(params, RequestOptions.none())

    /** @see query */
    fun query(
        params: RunQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunQueryResponse

    /** @see query */
    fun query(
        bodyParamsForRunSchema: BodyParamsForRunSchema,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunQueryResponse =
        query(
            RunQueryParams.builder().bodyParamsForRunSchema(bodyParamsForRunSchema).build(),
            requestOptions,
        )

    /** @see query */
    fun query(bodyParamsForRunSchema: BodyParamsForRunSchema): RunQueryResponse =
        query(bodyParamsForRunSchema, RequestOptions.none())

    /** Get preview of a thread. */
    fun retrieveThreadPreview(
        threadId: String,
        params: RunRetrieveThreadPreviewParams,
    ): RunRetrieveThreadPreviewResponse =
        retrieveThreadPreview(threadId, params, RequestOptions.none())

    /** @see retrieveThreadPreview */
    fun retrieveThreadPreview(
        threadId: String,
        params: RunRetrieveThreadPreviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunRetrieveThreadPreviewResponse =
        retrieveThreadPreview(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see retrieveThreadPreview */
    fun retrieveThreadPreview(
        params: RunRetrieveThreadPreviewParams
    ): RunRetrieveThreadPreviewResponse = retrieveThreadPreview(params, RequestOptions.none())

    /** @see retrieveThreadPreview */
    fun retrieveThreadPreview(
        params: RunRetrieveThreadPreviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunRetrieveThreadPreviewResponse

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

        fun share(): ShareService.WithRawResponse

        fun group(): GroupService.WithRawResponse

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
        fun update(runId: JsonValue, params: RunUpdateParams): HttpResponseFor<RunUpdateResponse> =
            update(runId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            runId: JsonValue,
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
         * Returns a raw HTTP response for `post /api/v1/runs/delete`, but is otherwise the same as
         * [RunService.delete].
         */
        @MustBeClosed
        fun delete(): HttpResponseFor<RunDeleteResponse> = delete(RunDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: RunDeleteParams = RunDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: RunDeleteParams = RunDeleteParams.none()
        ): HttpResponseFor<RunDeleteResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(requestOptions: RequestOptions): HttpResponseFor<RunDeleteResponse> =
            delete(RunDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/runs/generate-query`, but is otherwise the
         * same as [RunService.generateQuery].
         */
        @MustBeClosed
        fun generateQuery(
            params: RunGenerateQueryParams
        ): HttpResponseFor<ResponseBodyForRunsGenerateQuery> =
            generateQuery(params, RequestOptions.none())

        /** @see generateQuery */
        @MustBeClosed
        fun generateQuery(
            params: RunGenerateQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseBodyForRunsGenerateQuery>

        /** @see generateQuery */
        @MustBeClosed
        fun generateQuery(
            requestBodyForRunsGenerateQuery: RequestBodyForRunsGenerateQuery,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseBodyForRunsGenerateQuery> =
            generateQuery(
                RunGenerateQueryParams.builder()
                    .requestBodyForRunsGenerateQuery(requestBodyForRunsGenerateQuery)
                    .build(),
                requestOptions,
            )

        /** @see generateQuery */
        @MustBeClosed
        fun generateQuery(
            requestBodyForRunsGenerateQuery: RequestBodyForRunsGenerateQuery
        ): HttpResponseFor<ResponseBodyForRunsGenerateQuery> =
            generateQuery(requestBodyForRunsGenerateQuery, RequestOptions.none())

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
         * [RunService.ingestMultipart].
         */
        @MustBeClosed
        fun ingestMultipart(): HttpResponseFor<RunIngestMultipartResponse> =
            ingestMultipart(RunIngestMultipartParams.none())

        /** @see ingestMultipart */
        @MustBeClosed
        fun ingestMultipart(
            params: RunIngestMultipartParams = RunIngestMultipartParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunIngestMultipartResponse>

        /** @see ingestMultipart */
        @MustBeClosed
        fun ingestMultipart(
            params: RunIngestMultipartParams = RunIngestMultipartParams.none()
        ): HttpResponseFor<RunIngestMultipartResponse> =
            ingestMultipart(params, RequestOptions.none())

        /** @see ingestMultipart */
        @MustBeClosed
        fun ingestMultipart(
            requestOptions: RequestOptions
        ): HttpResponseFor<RunIngestMultipartResponse> =
            ingestMultipart(RunIngestMultipartParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/runs/query`, but is otherwise the same as
         * [RunService.query].
         */
        @MustBeClosed
        fun query(params: RunQueryParams): HttpResponseFor<RunQueryResponse> =
            query(params, RequestOptions.none())

        /** @see query */
        @MustBeClosed
        fun query(
            params: RunQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunQueryResponse>

        /** @see query */
        @MustBeClosed
        fun query(
            bodyParamsForRunSchema: BodyParamsForRunSchema,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunQueryResponse> =
            query(
                RunQueryParams.builder().bodyParamsForRunSchema(bodyParamsForRunSchema).build(),
                requestOptions,
            )

        /** @see query */
        @MustBeClosed
        fun query(
            bodyParamsForRunSchema: BodyParamsForRunSchema
        ): HttpResponseFor<RunQueryResponse> = query(bodyParamsForRunSchema, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /api/v1/runs/threads/{thread_id}`, but is otherwise
         * the same as [RunService.retrieveThreadPreview].
         */
        @MustBeClosed
        fun retrieveThreadPreview(
            threadId: String,
            params: RunRetrieveThreadPreviewParams,
        ): HttpResponseFor<RunRetrieveThreadPreviewResponse> =
            retrieveThreadPreview(threadId, params, RequestOptions.none())

        /** @see retrieveThreadPreview */
        @MustBeClosed
        fun retrieveThreadPreview(
            threadId: String,
            params: RunRetrieveThreadPreviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunRetrieveThreadPreviewResponse> =
            retrieveThreadPreview(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see retrieveThreadPreview */
        @MustBeClosed
        fun retrieveThreadPreview(
            params: RunRetrieveThreadPreviewParams
        ): HttpResponseFor<RunRetrieveThreadPreviewResponse> =
            retrieveThreadPreview(params, RequestOptions.none())

        /** @see retrieveThreadPreview */
        @MustBeClosed
        fun retrieveThreadPreview(
            params: RunRetrieveThreadPreviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunRetrieveThreadPreviewResponse>

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

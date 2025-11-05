// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

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
import com.langchain.smith.services.async.runs.GroupServiceAsync
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

    fun group(): GroupServiceAsync

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
        run: Run,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunCreateResponse> =
        create(RunCreateParams.builder().run(run).build(), requestOptions)

    /** @see create */
    fun create(run: Run): CompletableFuture<RunCreateResponse> = create(run, RequestOptions.none())

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
    fun update(runId: JsonValue, params: RunUpdateParams): CompletableFuture<RunUpdateResponse> =
        update(runId, params, RequestOptions.none())

    /** @see update */
    fun update(
        runId: JsonValue,
        params: RunUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunUpdateResponse> =
        update(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see update */
    fun update(params: RunUpdateParams): CompletableFuture<RunUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RunUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunUpdateResponse>

    /** Delete specific runs by trace IDs or metadata key-value pairs. */
    fun delete(): CompletableFuture<RunDeleteResponse> = delete(RunDeleteParams.none())

    /** @see delete */
    fun delete(
        params: RunDeleteParams = RunDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunDeleteResponse>

    /** @see delete */
    fun delete(
        params: RunDeleteParams = RunDeleteParams.none()
    ): CompletableFuture<RunDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(requestOptions: RequestOptions): CompletableFuture<RunDeleteResponse> =
        delete(RunDeleteParams.none(), requestOptions)

    /** Get runs filter expression query for a given natural language query. */
    fun generateQuery(
        params: RunGenerateQueryParams
    ): CompletableFuture<ResponseBodyForRunsGenerateQuery> =
        generateQuery(params, RequestOptions.none())

    /** @see generateQuery */
    fun generateQuery(
        params: RunGenerateQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResponseBodyForRunsGenerateQuery>

    /** @see generateQuery */
    fun generateQuery(
        requestBodyForRunsGenerateQuery: RequestBodyForRunsGenerateQuery,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResponseBodyForRunsGenerateQuery> =
        generateQuery(
            RunGenerateQueryParams.builder()
                .requestBodyForRunsGenerateQuery(requestBodyForRunsGenerateQuery)
                .build(),
            requestOptions,
        )

    /** @see generateQuery */
    fun generateQuery(
        requestBodyForRunsGenerateQuery: RequestBodyForRunsGenerateQuery
    ): CompletableFuture<ResponseBodyForRunsGenerateQuery> =
        generateQuery(requestBodyForRunsGenerateQuery, RequestOptions.none())

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
     * Ingests multiple runs, feedback objects, and binary attachments in a single
     * `multipart/form-data` request. **Part‑name pattern**: `<event>.<run_id>[.<field>]` where
     * `event` ∈ {`post`, `patch`, `feedback`, `attachment`}.
     * * `post|patch.<run_id>` – JSON run payload.
     * * `post|patch.<run_id>.<field>` – out‑of‑band run data (`inputs`, `outputs`, `events`,
     *   `error`, `extra`, `serialized`).
     * * `feedback.<run_id>` – JSON feedback payload (must include `trace_id`).
     * * `attachment.<run_id>.<filename>` – arbitrary binary attachment stored in S3. **Headers**:
     *   every part must set `Content-Type` **and** either a `Content-Length` header or `length`
     *   parameter. Per‑part `Content-Encoding` is **not** allowed; the top‑level request may be
     *   `Content-Encoding: gzip` or `Content-Encoding: zstd`. **Best performance** for high‑volume
     *   ingestion.
     */
    fun ingestMultipart(): CompletableFuture<RunIngestMultipartResponse> =
        ingestMultipart(RunIngestMultipartParams.none())

    /** @see ingestMultipart */
    fun ingestMultipart(
        params: RunIngestMultipartParams = RunIngestMultipartParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunIngestMultipartResponse>

    /** @see ingestMultipart */
    fun ingestMultipart(
        params: RunIngestMultipartParams = RunIngestMultipartParams.none()
    ): CompletableFuture<RunIngestMultipartResponse> =
        ingestMultipart(params, RequestOptions.none())

    /** @see ingestMultipart */
    fun ingestMultipart(
        requestOptions: RequestOptions
    ): CompletableFuture<RunIngestMultipartResponse> =
        ingestMultipart(RunIngestMultipartParams.none(), requestOptions)

    /** Query Runs */
    fun query(params: RunQueryParams): CompletableFuture<RunQueryResponse> =
        query(params, RequestOptions.none())

    /** @see query */
    fun query(
        params: RunQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunQueryResponse>

    /** @see query */
    fun query(
        bodyParamsForRunSchema: BodyParamsForRunSchema,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunQueryResponse> =
        query(
            RunQueryParams.builder().bodyParamsForRunSchema(bodyParamsForRunSchema).build(),
            requestOptions,
        )

    /** @see query */
    fun query(bodyParamsForRunSchema: BodyParamsForRunSchema): CompletableFuture<RunQueryResponse> =
        query(bodyParamsForRunSchema, RequestOptions.none())

    /** Get preview of a thread. */
    fun retrieveThreadPreview(
        threadId: String,
        params: RunRetrieveThreadPreviewParams,
    ): CompletableFuture<RunRetrieveThreadPreviewResponse> =
        retrieveThreadPreview(threadId, params, RequestOptions.none())

    /** @see retrieveThreadPreview */
    fun retrieveThreadPreview(
        threadId: String,
        params: RunRetrieveThreadPreviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunRetrieveThreadPreviewResponse> =
        retrieveThreadPreview(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see retrieveThreadPreview */
    fun retrieveThreadPreview(
        params: RunRetrieveThreadPreviewParams
    ): CompletableFuture<RunRetrieveThreadPreviewResponse> =
        retrieveThreadPreview(params, RequestOptions.none())

    /** @see retrieveThreadPreview */
    fun retrieveThreadPreview(
        params: RunRetrieveThreadPreviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunRetrieveThreadPreviewResponse>

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

        fun share(): ShareServiceAsync.WithRawResponse

        fun group(): GroupServiceAsync.WithRawResponse

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
            runId: JsonValue,
            params: RunUpdateParams,
        ): CompletableFuture<HttpResponseFor<RunUpdateResponse>> =
            update(runId, params, RequestOptions.none())

        /** @see update */
        fun update(
            runId: JsonValue,
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
         * Returns a raw HTTP response for `post /api/v1/runs/delete`, but is otherwise the same as
         * [RunServiceAsync.delete].
         */
        fun delete(): CompletableFuture<HttpResponseFor<RunDeleteResponse>> =
            delete(RunDeleteParams.none())

        /** @see delete */
        fun delete(
            params: RunDeleteParams = RunDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunDeleteResponse>>

        /** @see delete */
        fun delete(
            params: RunDeleteParams = RunDeleteParams.none()
        ): CompletableFuture<HttpResponseFor<RunDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RunDeleteResponse>> =
            delete(RunDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/runs/generate-query`, but is otherwise the
         * same as [RunServiceAsync.generateQuery].
         */
        fun generateQuery(
            params: RunGenerateQueryParams
        ): CompletableFuture<HttpResponseFor<ResponseBodyForRunsGenerateQuery>> =
            generateQuery(params, RequestOptions.none())

        /** @see generateQuery */
        fun generateQuery(
            params: RunGenerateQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResponseBodyForRunsGenerateQuery>>

        /** @see generateQuery */
        fun generateQuery(
            requestBodyForRunsGenerateQuery: RequestBodyForRunsGenerateQuery,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResponseBodyForRunsGenerateQuery>> =
            generateQuery(
                RunGenerateQueryParams.builder()
                    .requestBodyForRunsGenerateQuery(requestBodyForRunsGenerateQuery)
                    .build(),
                requestOptions,
            )

        /** @see generateQuery */
        fun generateQuery(
            requestBodyForRunsGenerateQuery: RequestBodyForRunsGenerateQuery
        ): CompletableFuture<HttpResponseFor<ResponseBodyForRunsGenerateQuery>> =
            generateQuery(requestBodyForRunsGenerateQuery, RequestOptions.none())

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
         * [RunServiceAsync.ingestMultipart].
         */
        fun ingestMultipart(): CompletableFuture<HttpResponseFor<RunIngestMultipartResponse>> =
            ingestMultipart(RunIngestMultipartParams.none())

        /** @see ingestMultipart */
        fun ingestMultipart(
            params: RunIngestMultipartParams = RunIngestMultipartParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunIngestMultipartResponse>>

        /** @see ingestMultipart */
        fun ingestMultipart(
            params: RunIngestMultipartParams = RunIngestMultipartParams.none()
        ): CompletableFuture<HttpResponseFor<RunIngestMultipartResponse>> =
            ingestMultipart(params, RequestOptions.none())

        /** @see ingestMultipart */
        fun ingestMultipart(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RunIngestMultipartResponse>> =
            ingestMultipart(RunIngestMultipartParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/runs/query`, but is otherwise the same as
         * [RunServiceAsync.query].
         */
        fun query(params: RunQueryParams): CompletableFuture<HttpResponseFor<RunQueryResponse>> =
            query(params, RequestOptions.none())

        /** @see query */
        fun query(
            params: RunQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunQueryResponse>>

        /** @see query */
        fun query(
            bodyParamsForRunSchema: BodyParamsForRunSchema,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunQueryResponse>> =
            query(
                RunQueryParams.builder().bodyParamsForRunSchema(bodyParamsForRunSchema).build(),
                requestOptions,
            )

        /** @see query */
        fun query(
            bodyParamsForRunSchema: BodyParamsForRunSchema
        ): CompletableFuture<HttpResponseFor<RunQueryResponse>> =
            query(bodyParamsForRunSchema, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /api/v1/runs/threads/{thread_id}`, but is otherwise
         * the same as [RunServiceAsync.retrieveThreadPreview].
         */
        fun retrieveThreadPreview(
            threadId: String,
            params: RunRetrieveThreadPreviewParams,
        ): CompletableFuture<HttpResponseFor<RunRetrieveThreadPreviewResponse>> =
            retrieveThreadPreview(threadId, params, RequestOptions.none())

        /** @see retrieveThreadPreview */
        fun retrieveThreadPreview(
            threadId: String,
            params: RunRetrieveThreadPreviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunRetrieveThreadPreviewResponse>> =
            retrieveThreadPreview(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see retrieveThreadPreview */
        fun retrieveThreadPreview(
            params: RunRetrieveThreadPreviewParams
        ): CompletableFuture<HttpResponseFor<RunRetrieveThreadPreviewResponse>> =
            retrieveThreadPreview(params, RequestOptions.none())

        /** @see retrieveThreadPreview */
        fun retrieveThreadPreview(
            params: RunRetrieveThreadPreviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunRetrieveThreadPreviewResponse>>

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

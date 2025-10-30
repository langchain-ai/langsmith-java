// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.runs.Run
import com.langsmith_api.api.models.runs.RunCreateParams
import com.langsmith_api.api.models.runs.RunCreateResponse
import com.langsmith_api.api.models.runs.RunIngestBatchParams
import com.langsmith_api.api.models.runs.RunIngestBatchResponse
import com.langsmith_api.api.models.runs.RunIngestMultipartParams
import com.langsmith_api.api.models.runs.RunIngestMultipartResponse
import com.langsmith_api.api.models.runs.RunUpdateParams
import com.langsmith_api.api.models.runs.RunUpdateResponse
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

    /**
     * Ingests a batch of runs in a single JSON payload. The payload must have `post` and/or `patch`
     * arrays containing run objects. Prefer this endpoint over singleâ€‘run ingestion when
     * submitting hundreds of runs, but `/runs/multipart` offers better handling for very large
     * fields and attachments.
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
     * `multipart/form-data` request. **Partâ€‘name pattern**: `<event>.<run_id>[.<field>]` where
     * `event` âˆˆ {`post`, `patch`, `feedback`, `attachment`}.
     * * `post|patch.<run_id>` â€“Â JSON run payload.
     * * `post|patch.<run_id>.<field>` â€“ outâ€‘ofâ€‘band run data (`inputs`, `outputs`, `events`,
     *   `error`, `extra`, `serialized`).
     * * `feedback.<run_id>` â€“ JSON feedback payload (must include `trace_id`).
     * * `attachment.<run_id>.<filename>` â€“ arbitrary binary attachment stored in S3. **Headers**:
     *   every part must set `Content-Type` **and** either a `Content-Length` header or `length`
     *   parameter. Perâ€‘part `Content-Encoding` is **not** allowed; the topâ€‘level request may be
     *   `Content-Encoding: gzip` or `Content-Encoding: zstd`. **Best performance** for
     *   highâ€‘volume ingestion.
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

    /** A view of [RunServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync.WithRawResponse

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
    }
}

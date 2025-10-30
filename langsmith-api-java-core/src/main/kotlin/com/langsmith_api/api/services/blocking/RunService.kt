// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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

    /**
     * Ingests a batch of runs in a single JSON payload. The payload must have `post` and/or `patch`
     * arrays containing run objects. Prefer this endpoint over singleâ€‘run ingestion when
     * submitting hundreds of runs, but `/runs/multipart` offers better handling for very large
     * fields and attachments.
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

    /** A view of [RunService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService.WithRawResponse

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
    }
}

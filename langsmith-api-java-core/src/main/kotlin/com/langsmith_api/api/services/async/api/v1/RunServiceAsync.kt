// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.runs.BodyParamsForRunSchema
import com.langsmith_api.api.models.api.v1.runs.RequestBodyForRunsGenerateQuery
import com.langsmith_api.api.models.api.v1.runs.ResponseBodyForRunsGenerateQuery
import com.langsmith_api.api.models.api.v1.runs.RunDeleteParams
import com.langsmith_api.api.models.api.v1.runs.RunDeleteResponse
import com.langsmith_api.api.models.api.v1.runs.RunGenerateQueryParams
import com.langsmith_api.api.models.api.v1.runs.RunQueryParams
import com.langsmith_api.api.models.api.v1.runs.RunQueryResponse
import com.langsmith_api.api.models.api.v1.runs.RunRetrieveParams
import com.langsmith_api.api.models.api.v1.runs.RunSchema
import com.langsmith_api.api.models.api.v1.runs.RunStatsParams
import com.langsmith_api.api.models.api.v1.runs.RunStatsQueryParams
import com.langsmith_api.api.models.api.v1.runs.RunStatsResponse
import com.langsmith_api.api.models.api.v1.runs.RunUpdateParams
import com.langsmith_api.api.models.api.v1.runs.RunUpdateResponse
import com.langsmith_api.api.services.async.api.v1.runs.GroupServiceAsync
import com.langsmith_api.api.services.async.api.v1.runs.RuleServiceAsync
import com.langsmith_api.api.services.async.api.v1.runs.ShareServiceAsync
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

    /** Update a run. */
    fun update(runId: String): CompletableFuture<RunUpdateResponse> =
        update(runId, RunUpdateParams.none())

    /** @see update */
    fun update(
        runId: String,
        params: RunUpdateParams = RunUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunUpdateResponse> =
        update(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see update */
    fun update(
        runId: String,
        params: RunUpdateParams = RunUpdateParams.none(),
    ): CompletableFuture<RunUpdateResponse> = update(runId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RunUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunUpdateResponse>

    /** @see update */
    fun update(params: RunUpdateParams): CompletableFuture<RunUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        runId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunUpdateResponse> = update(runId, RunUpdateParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `patch /api/v1/runs/{run_id}`, but is otherwise the same
         * as [RunServiceAsync.update].
         */
        fun update(runId: String): CompletableFuture<HttpResponseFor<RunUpdateResponse>> =
            update(runId, RunUpdateParams.none())

        /** @see update */
        fun update(
            runId: String,
            params: RunUpdateParams = RunUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunUpdateResponse>> =
            update(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see update */
        fun update(
            runId: String,
            params: RunUpdateParams = RunUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<RunUpdateResponse>> =
            update(runId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: RunUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunUpdateResponse>>

        /** @see update */
        fun update(params: RunUpdateParams): CompletableFuture<HttpResponseFor<RunUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            runId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunUpdateResponse>> =
            update(runId, RunUpdateParams.none(), requestOptions)

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
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

import com.google.errorprone.annotations.MustBeClosed
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
import com.langsmith_api.api.services.blocking.api.v1.runs.GroupService
import com.langsmith_api.api.services.blocking.api.v1.runs.RuleService
import com.langsmith_api.api.services.blocking.api.v1.runs.ShareService
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

    /** Update a run. */
    fun update(runId: String): RunUpdateResponse = update(runId, RunUpdateParams.none())

    /** @see update */
    fun update(
        runId: String,
        params: RunUpdateParams = RunUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunUpdateResponse = update(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see update */
    fun update(runId: String, params: RunUpdateParams = RunUpdateParams.none()): RunUpdateResponse =
        update(runId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RunUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunUpdateResponse

    /** @see update */
    fun update(params: RunUpdateParams): RunUpdateResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(runId: String, requestOptions: RequestOptions): RunUpdateResponse =
        update(runId, RunUpdateParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `patch /api/v1/runs/{run_id}`, but is otherwise the same
         * as [RunService.update].
         */
        @MustBeClosed
        fun update(runId: String): HttpResponseFor<RunUpdateResponse> =
            update(runId, RunUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            runId: String,
            params: RunUpdateParams = RunUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunUpdateResponse> =
            update(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            runId: String,
            params: RunUpdateParams = RunUpdateParams.none(),
        ): HttpResponseFor<RunUpdateResponse> = update(runId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: RunUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: RunUpdateParams): HttpResponseFor<RunUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            runId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunUpdateResponse> =
            update(runId, RunUpdateParams.none(), requestOptions)

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
    }
}

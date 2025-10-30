// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.public_.datasets

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.datasets.runs.SessionFeedbackDelta
import com.langchain.smith.models.public_.datasets.runs.RunDeltaParams
import com.langchain.smith.models.public_.datasets.runs.RunGenerateQueryParams
import com.langchain.smith.models.public_.datasets.runs.RunPublicDatasetSchema
import com.langchain.smith.models.public_.datasets.runs.RunQueryParams
import com.langchain.smith.models.public_.datasets.runs.RunQueryResponse
import com.langchain.smith.models.public_.datasets.runs.RunRetrieveParams
import com.langchain.smith.models.public_.datasets.runs.RunStats
import com.langchain.smith.models.public_.datasets.runs.RunStatsParams
import com.langchain.smith.models.runs.ResponseBodyForRunsGenerateQuery
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

    /** Get runs in projects run over a dataset that has been shared. */
    fun retrieve(runId: String, params: RunRetrieveParams): RunPublicDatasetSchema =
        retrieve(runId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        runId: String,
        params: RunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunPublicDatasetSchema = retrieve(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: RunRetrieveParams): RunPublicDatasetSchema =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunPublicDatasetSchema

    /**
     * Fetch the number of regressions/improvements for each example in a dataset, between
     * sessions[0] and sessions[1].
     */
    fun delta(shareToken: String, params: RunDeltaParams): SessionFeedbackDelta =
        delta(shareToken, params, RequestOptions.none())

    /** @see delta */
    fun delta(
        shareToken: String,
        params: RunDeltaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionFeedbackDelta =
        delta(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see delta */
    fun delta(params: RunDeltaParams): SessionFeedbackDelta = delta(params, RequestOptions.none())

    /** @see delta */
    fun delta(
        params: RunDeltaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionFeedbackDelta

    /** Get runs in projects run over a dataset that has been shared. */
    fun generateQuery(
        shareToken: String,
        params: RunGenerateQueryParams,
    ): ResponseBodyForRunsGenerateQuery = generateQuery(shareToken, params, RequestOptions.none())

    /** @see generateQuery */
    fun generateQuery(
        shareToken: String,
        params: RunGenerateQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseBodyForRunsGenerateQuery =
        generateQuery(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see generateQuery */
    fun generateQuery(params: RunGenerateQueryParams): ResponseBodyForRunsGenerateQuery =
        generateQuery(params, RequestOptions.none())

    /** @see generateQuery */
    fun generateQuery(
        params: RunGenerateQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseBodyForRunsGenerateQuery

    /** Get runs in projects run over a dataset that has been shared. */
    fun query(shareToken: String, params: RunQueryParams): RunQueryResponse =
        query(shareToken, params, RequestOptions.none())

    /** @see query */
    fun query(
        shareToken: String,
        params: RunQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunQueryResponse = query(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see query */
    fun query(params: RunQueryParams): RunQueryResponse = query(params, RequestOptions.none())

    /** @see query */
    fun query(
        params: RunQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunQueryResponse

    /** Get run stats in projects run over a dataset that has been shared. */
    fun stats(shareToken: String, params: RunStatsParams): RunStats =
        stats(shareToken, params, RequestOptions.none())

    /** @see stats */
    fun stats(
        shareToken: String,
        params: RunStatsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunStats = stats(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see stats */
    fun stats(params: RunStatsParams): RunStats = stats(params, RequestOptions.none())

    /** @see stats */
    fun stats(
        params: RunStatsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunStats

    /** A view of [RunService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/public/{share_token}/datasets/runs/{run_id}`, but is otherwise the same as
         * [RunService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            runId: String,
            params: RunRetrieveParams,
        ): HttpResponseFor<RunPublicDatasetSchema> = retrieve(runId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            runId: String,
            params: RunRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunPublicDatasetSchema> =
            retrieve(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: RunRetrieveParams): HttpResponseFor<RunPublicDatasetSchema> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RunRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunPublicDatasetSchema>

        /**
         * Returns a raw HTTP response for `post /api/v1/public/{share_token}/datasets/runs/delta`,
         * but is otherwise the same as [RunService.delta].
         */
        @MustBeClosed
        fun delta(
            shareToken: String,
            params: RunDeltaParams,
        ): HttpResponseFor<SessionFeedbackDelta> = delta(shareToken, params, RequestOptions.none())

        /** @see delta */
        @MustBeClosed
        fun delta(
            shareToken: String,
            params: RunDeltaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionFeedbackDelta> =
            delta(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see delta */
        @MustBeClosed
        fun delta(params: RunDeltaParams): HttpResponseFor<SessionFeedbackDelta> =
            delta(params, RequestOptions.none())

        /** @see delta */
        @MustBeClosed
        fun delta(
            params: RunDeltaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionFeedbackDelta>

        /**
         * Returns a raw HTTP response for `post
         * /api/v1/public/{share_token}/datasets/runs/generate-query`, but is otherwise the same as
         * [RunService.generateQuery].
         */
        @MustBeClosed
        fun generateQuery(
            shareToken: String,
            params: RunGenerateQueryParams,
        ): HttpResponseFor<ResponseBodyForRunsGenerateQuery> =
            generateQuery(shareToken, params, RequestOptions.none())

        /** @see generateQuery */
        @MustBeClosed
        fun generateQuery(
            shareToken: String,
            params: RunGenerateQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseBodyForRunsGenerateQuery> =
            generateQuery(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see generateQuery */
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

        /**
         * Returns a raw HTTP response for `post /api/v1/public/{share_token}/datasets/runs/query`,
         * but is otherwise the same as [RunService.query].
         */
        @MustBeClosed
        fun query(shareToken: String, params: RunQueryParams): HttpResponseFor<RunQueryResponse> =
            query(shareToken, params, RequestOptions.none())

        /** @see query */
        @MustBeClosed
        fun query(
            shareToken: String,
            params: RunQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunQueryResponse> =
            query(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see query */
        @MustBeClosed
        fun query(params: RunQueryParams): HttpResponseFor<RunQueryResponse> =
            query(params, RequestOptions.none())

        /** @see query */
        @MustBeClosed
        fun query(
            params: RunQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunQueryResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/public/{share_token}/datasets/runs/stats`,
         * but is otherwise the same as [RunService.stats].
         */
        @MustBeClosed
        fun stats(shareToken: String, params: RunStatsParams): HttpResponseFor<RunStats> =
            stats(shareToken, params, RequestOptions.none())

        /** @see stats */
        @MustBeClosed
        fun stats(
            shareToken: String,
            params: RunStatsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunStats> =
            stats(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see stats */
        @MustBeClosed
        fun stats(params: RunStatsParams): HttpResponseFor<RunStats> =
            stats(params, RequestOptions.none())

        /** @see stats */
        @MustBeClosed
        fun stats(
            params: RunStatsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunStats>
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.public_.datasets

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.datasets.runs.SessionFeedbackDelta
import com.langsmith_api.api.models.api.v1.public_.datasets.runs.RunDeltaParams
import com.langsmith_api.api.models.api.v1.public_.datasets.runs.RunGenerateQueryParams
import com.langsmith_api.api.models.api.v1.public_.datasets.runs.RunPublicDatasetSchema
import com.langsmith_api.api.models.api.v1.public_.datasets.runs.RunQueryParams
import com.langsmith_api.api.models.api.v1.public_.datasets.runs.RunQueryResponse
import com.langsmith_api.api.models.api.v1.public_.datasets.runs.RunRetrieveParams
import com.langsmith_api.api.models.api.v1.public_.datasets.runs.RunStats
import com.langsmith_api.api.models.api.v1.public_.datasets.runs.RunStatsParams
import com.langsmith_api.api.models.api.v1.runs.ResponseBodyForRunsGenerateQuery
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

    /** Get runs in projects run over a dataset that has been shared. */
    fun retrieve(
        runId: String,
        params: RunRetrieveParams,
    ): CompletableFuture<RunPublicDatasetSchema> = retrieve(runId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        runId: String,
        params: RunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunPublicDatasetSchema> =
        retrieve(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: RunRetrieveParams): CompletableFuture<RunPublicDatasetSchema> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunPublicDatasetSchema>

    /**
     * Fetch the number of regressions/improvements for each example in a dataset, between
     * sessions[0] and sessions[1].
     */
    fun delta(shareToken: String, params: RunDeltaParams): CompletableFuture<SessionFeedbackDelta> =
        delta(shareToken, params, RequestOptions.none())

    /** @see delta */
    fun delta(
        shareToken: String,
        params: RunDeltaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionFeedbackDelta> =
        delta(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see delta */
    fun delta(params: RunDeltaParams): CompletableFuture<SessionFeedbackDelta> =
        delta(params, RequestOptions.none())

    /** @see delta */
    fun delta(
        params: RunDeltaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionFeedbackDelta>

    /** Get runs in projects run over a dataset that has been shared. */
    fun generateQuery(
        shareToken: String,
        params: RunGenerateQueryParams,
    ): CompletableFuture<ResponseBodyForRunsGenerateQuery> =
        generateQuery(shareToken, params, RequestOptions.none())

    /** @see generateQuery */
    fun generateQuery(
        shareToken: String,
        params: RunGenerateQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResponseBodyForRunsGenerateQuery> =
        generateQuery(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see generateQuery */
    fun generateQuery(
        params: RunGenerateQueryParams
    ): CompletableFuture<ResponseBodyForRunsGenerateQuery> =
        generateQuery(params, RequestOptions.none())

    /** @see generateQuery */
    fun generateQuery(
        params: RunGenerateQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResponseBodyForRunsGenerateQuery>

    /** Get runs in projects run over a dataset that has been shared. */
    fun query(shareToken: String, params: RunQueryParams): CompletableFuture<RunQueryResponse> =
        query(shareToken, params, RequestOptions.none())

    /** @see query */
    fun query(
        shareToken: String,
        params: RunQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunQueryResponse> =
        query(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see query */
    fun query(params: RunQueryParams): CompletableFuture<RunQueryResponse> =
        query(params, RequestOptions.none())

    /** @see query */
    fun query(
        params: RunQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunQueryResponse>

    /** Get run stats in projects run over a dataset that has been shared. */
    fun stats(shareToken: String, params: RunStatsParams): CompletableFuture<RunStats> =
        stats(shareToken, params, RequestOptions.none())

    /** @see stats */
    fun stats(
        shareToken: String,
        params: RunStatsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunStats> =
        stats(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see stats */
    fun stats(params: RunStatsParams): CompletableFuture<RunStats> =
        stats(params, RequestOptions.none())

    /** @see stats */
    fun stats(
        params: RunStatsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunStats>

    /** A view of [RunServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/public/{share_token}/datasets/runs/{run_id}`, but is otherwise the same as
         * [RunServiceAsync.retrieve].
         */
        fun retrieve(
            runId: String,
            params: RunRetrieveParams,
        ): CompletableFuture<HttpResponseFor<RunPublicDatasetSchema>> =
            retrieve(runId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            runId: String,
            params: RunRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunPublicDatasetSchema>> =
            retrieve(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: RunRetrieveParams
        ): CompletableFuture<HttpResponseFor<RunPublicDatasetSchema>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RunRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunPublicDatasetSchema>>

        /**
         * Returns a raw HTTP response for `post /api/v1/public/{share_token}/datasets/runs/delta`,
         * but is otherwise the same as [RunServiceAsync.delta].
         */
        fun delta(
            shareToken: String,
            params: RunDeltaParams,
        ): CompletableFuture<HttpResponseFor<SessionFeedbackDelta>> =
            delta(shareToken, params, RequestOptions.none())

        /** @see delta */
        fun delta(
            shareToken: String,
            params: RunDeltaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionFeedbackDelta>> =
            delta(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see delta */
        fun delta(
            params: RunDeltaParams
        ): CompletableFuture<HttpResponseFor<SessionFeedbackDelta>> =
            delta(params, RequestOptions.none())

        /** @see delta */
        fun delta(
            params: RunDeltaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionFeedbackDelta>>

        /**
         * Returns a raw HTTP response for `post
         * /api/v1/public/{share_token}/datasets/runs/generate-query`, but is otherwise the same as
         * [RunServiceAsync.generateQuery].
         */
        fun generateQuery(
            shareToken: String,
            params: RunGenerateQueryParams,
        ): CompletableFuture<HttpResponseFor<ResponseBodyForRunsGenerateQuery>> =
            generateQuery(shareToken, params, RequestOptions.none())

        /** @see generateQuery */
        fun generateQuery(
            shareToken: String,
            params: RunGenerateQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResponseBodyForRunsGenerateQuery>> =
            generateQuery(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see generateQuery */
        fun generateQuery(
            params: RunGenerateQueryParams
        ): CompletableFuture<HttpResponseFor<ResponseBodyForRunsGenerateQuery>> =
            generateQuery(params, RequestOptions.none())

        /** @see generateQuery */
        fun generateQuery(
            params: RunGenerateQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResponseBodyForRunsGenerateQuery>>

        /**
         * Returns a raw HTTP response for `post /api/v1/public/{share_token}/datasets/runs/query`,
         * but is otherwise the same as [RunServiceAsync.query].
         */
        fun query(
            shareToken: String,
            params: RunQueryParams,
        ): CompletableFuture<HttpResponseFor<RunQueryResponse>> =
            query(shareToken, params, RequestOptions.none())

        /** @see query */
        fun query(
            shareToken: String,
            params: RunQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunQueryResponse>> =
            query(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see query */
        fun query(params: RunQueryParams): CompletableFuture<HttpResponseFor<RunQueryResponse>> =
            query(params, RequestOptions.none())

        /** @see query */
        fun query(
            params: RunQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunQueryResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/public/{share_token}/datasets/runs/stats`,
         * but is otherwise the same as [RunServiceAsync.stats].
         */
        fun stats(
            shareToken: String,
            params: RunStatsParams,
        ): CompletableFuture<HttpResponseFor<RunStats>> =
            stats(shareToken, params, RequestOptions.none())

        /** @see stats */
        fun stats(
            shareToken: String,
            params: RunStatsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunStats>> =
            stats(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see stats */
        fun stats(params: RunStatsParams): CompletableFuture<HttpResponseFor<RunStats>> =
            stats(params, RequestOptions.none())

        /** @see stats */
        fun stats(
            params: RunStatsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunStats>>
    }
}

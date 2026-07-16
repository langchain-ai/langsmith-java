// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.public_

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.public_.runs.RunQueryParams
import com.langchain.smith.models.public_.runs.RunQueryResponse
import com.langchain.smith.models.public_.runs.RunRetrieveParams
import com.langchain.smith.models.runs.Run
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
     * **Alpha:** The request and response contract may change; Returns one run within the trace
     * identified by the share token. The request supplies only the run ID and that run's exact
     * start_time coordinate.
     */
    fun retrieve(runId: String, params: RunRetrieveParams): Run =
        retrieve(runId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        runId: String,
        params: RunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Run = retrieve(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: RunRetrieveParams): Run = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Run

    /**
     * **Alpha:** The request and response contract may change; Returns all runs within the trace
     * identified by the share token. The share token supplies the tenant, project, and trace scope.
     */
    fun query(shareToken: String): RunQueryResponse = query(shareToken, RunQueryParams.none())

    /** @see query */
    fun query(
        shareToken: String,
        params: RunQueryParams = RunQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunQueryResponse = query(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see query */
    fun query(
        shareToken: String,
        params: RunQueryParams = RunQueryParams.none(),
    ): RunQueryResponse = query(shareToken, params, RequestOptions.none())

    /** @see query */
    fun query(
        params: RunQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunQueryResponse

    /** @see query */
    fun query(params: RunQueryParams): RunQueryResponse = query(params, RequestOptions.none())

    /** @see query */
    fun query(shareToken: String, requestOptions: RequestOptions): RunQueryResponse =
        query(shareToken, RunQueryParams.none(), requestOptions)

    /** A view of [RunService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v2/public/{share_token}/run/{run_id}`, but is
         * otherwise the same as [RunService.retrieve].
         */
        @MustBeClosed
        fun retrieve(runId: String, params: RunRetrieveParams): HttpResponseFor<Run> =
            retrieve(runId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            runId: String,
            params: RunRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Run> = retrieve(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: RunRetrieveParams): HttpResponseFor<Run> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RunRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Run>

        /**
         * Returns a raw HTTP response for `post /v2/public/{share_token}/runs/v2/query`, but is
         * otherwise the same as [RunService.query].
         */
        @MustBeClosed
        fun query(shareToken: String): HttpResponseFor<RunQueryResponse> =
            query(shareToken, RunQueryParams.none())

        /** @see query */
        @MustBeClosed
        fun query(
            shareToken: String,
            params: RunQueryParams = RunQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunQueryResponse> =
            query(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see query */
        @MustBeClosed
        fun query(
            shareToken: String,
            params: RunQueryParams = RunQueryParams.none(),
        ): HttpResponseFor<RunQueryResponse> = query(shareToken, params, RequestOptions.none())

        /** @see query */
        @MustBeClosed
        fun query(
            params: RunQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunQueryResponse>

        /** @see query */
        @MustBeClosed
        fun query(params: RunQueryParams): HttpResponseFor<RunQueryResponse> =
            query(params, RequestOptions.none())

        /** @see query */
        @MustBeClosed
        fun query(
            shareToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunQueryResponse> =
            query(shareToken, RunQueryParams.none(), requestOptions)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.runs.RunQueryParams
import com.langchain.smith.models.runs.RunQueryResponse
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

    /** Query Runs */
    fun query(): RunQueryResponse = query(RunQueryParams.none())

    /** @see query */
    fun query(
        params: RunQueryParams = RunQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunQueryResponse

    /** @see query */
    fun query(params: RunQueryParams = RunQueryParams.none()): RunQueryResponse =
        query(params, RequestOptions.none())

    /** @see query */
    fun query(requestOptions: RequestOptions): RunQueryResponse =
        query(RunQueryParams.none(), requestOptions)

    /** A view of [RunService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/runs/query`, but is otherwise the same as
         * [RunService.query].
         */
        @MustBeClosed fun query(): HttpResponseFor<RunQueryResponse> = query(RunQueryParams.none())

        /** @see query */
        @MustBeClosed
        fun query(
            params: RunQueryParams = RunQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunQueryResponse>

        /** @see query */
        @MustBeClosed
        fun query(
            params: RunQueryParams = RunQueryParams.none()
        ): HttpResponseFor<RunQueryResponse> = query(params, RequestOptions.none())

        /** @see query */
        @MustBeClosed
        fun query(requestOptions: RequestOptions): HttpResponseFor<RunQueryResponse> =
            query(RunQueryParams.none(), requestOptions)
    }
}

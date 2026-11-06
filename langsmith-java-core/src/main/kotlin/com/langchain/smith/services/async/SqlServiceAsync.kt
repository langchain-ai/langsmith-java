// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.sql.SqlQueryParams
import com.langchain.smith.models.sql.SqlQueryResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SqlServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SqlServiceAsync

    /**
     * **Beta:** This endpoint is in active development and may change without notice.
     *
     * GET with body payload — no resources created. Returns the rows matching the read-only SQL
     * query passed as the request payload, limited to the given tracing projects. Results are
     * limited to a configured number of rows, 1000 by default.
     */
    fun query(params: SqlQueryParams): CompletableFuture<SqlQueryResponse> =
        query(params, RequestOptions.none())

    /** @see query */
    fun query(
        params: SqlQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SqlQueryResponse>

    /** A view of [SqlServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SqlServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/sql/query`, but is otherwise the same as
         * [SqlServiceAsync.query].
         */
        fun query(params: SqlQueryParams): CompletableFuture<HttpResponseFor<SqlQueryResponse>> =
            query(params, RequestOptions.none())

        /** @see query */
        fun query(
            params: SqlQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SqlQueryResponse>>
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.sql.SqlQueryParams
import com.langchain.smith.models.sql.SqlQueryResponse
import java.util.function.Consumer

interface SqlService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SqlService

    /**
     * **Beta:** This endpoint is in active development and may change without notice.
     *
     * GET with body payload — no resources created. Returns the rows matching the read-only SQL
     * query passed as the request payload, limited to the given tracing projects. Results are
     * limited to a configured number of rows, 1000 by default.
     */
    fun query(params: SqlQueryParams): SqlQueryResponse = query(params, RequestOptions.none())

    /** @see query */
    fun query(
        params: SqlQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SqlQueryResponse

    /** A view of [SqlService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SqlService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/sql/query`, but is otherwise the same as
         * [SqlService.query].
         */
        @MustBeClosed
        fun query(params: SqlQueryParams): HttpResponseFor<SqlQueryResponse> =
            query(params, RequestOptions.none())

        /** @see query */
        @MustBeClosed
        fun query(
            params: SqlQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SqlQueryResponse>
    }
}

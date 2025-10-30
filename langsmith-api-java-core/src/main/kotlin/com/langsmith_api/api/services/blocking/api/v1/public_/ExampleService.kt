// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.public_

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.examples.Example
import com.langsmith_api.api.models.api.v1.public_.examples.ExampleListParams
import com.langsmith_api.api.models.api.v1.public_.examples.ExampleRetrieveCountParams
import com.langsmith_api.api.models.api.v1.public_.examples.ExampleRunsParams
import com.langsmith_api.api.models.api.v1.public_.examples.ExampleRunsResponse
import java.util.function.Consumer

interface ExampleService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExampleService

    /** Get example by ids or the shared example if not specifed. */
    fun list(shareToken: String): List<Example> = list(shareToken, ExampleListParams.none())

    /** @see list */
    fun list(
        shareToken: String,
        params: ExampleListParams = ExampleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Example> = list(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see list */
    fun list(
        shareToken: String,
        params: ExampleListParams = ExampleListParams.none(),
    ): List<Example> = list(shareToken, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ExampleListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Example>

    /** @see list */
    fun list(params: ExampleListParams): List<Example> = list(params, RequestOptions.none())

    /** @see list */
    fun list(shareToken: String, requestOptions: RequestOptions): List<Example> =
        list(shareToken, ExampleListParams.none(), requestOptions)

    /** Count all examples by query params */
    fun retrieveCount(shareToken: String): Long =
        retrieveCount(shareToken, ExampleRetrieveCountParams.none())

    /** @see retrieveCount */
    fun retrieveCount(
        shareToken: String,
        params: ExampleRetrieveCountParams = ExampleRetrieveCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Long = retrieveCount(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see retrieveCount */
    fun retrieveCount(
        shareToken: String,
        params: ExampleRetrieveCountParams = ExampleRetrieveCountParams.none(),
    ): Long = retrieveCount(shareToken, params, RequestOptions.none())

    /** @see retrieveCount */
    fun retrieveCount(
        params: ExampleRetrieveCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Long

    /** @see retrieveCount */
    fun retrieveCount(params: ExampleRetrieveCountParams): Long =
        retrieveCount(params, RequestOptions.none())

    /** @see retrieveCount */
    fun retrieveCount(shareToken: String, requestOptions: RequestOptions): Long =
        retrieveCount(shareToken, ExampleRetrieveCountParams.none(), requestOptions)

    /** Get examples with associated runs from sessions in a dataset that has been shared. */
    fun runs(shareToken: String, params: ExampleRunsParams): ExampleRunsResponse =
        runs(shareToken, params, RequestOptions.none())

    /** @see runs */
    fun runs(
        shareToken: String,
        params: ExampleRunsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExampleRunsResponse = runs(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see runs */
    fun runs(params: ExampleRunsParams): ExampleRunsResponse = runs(params, RequestOptions.none())

    /** @see runs */
    fun runs(
        params: ExampleRunsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExampleRunsResponse

    /** A view of [ExampleService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExampleService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/public/{share_token}/examples`, but is
         * otherwise the same as [ExampleService.list].
         */
        @MustBeClosed
        fun list(shareToken: String): HttpResponseFor<List<Example>> =
            list(shareToken, ExampleListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            shareToken: String,
            params: ExampleListParams = ExampleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Example>> =
            list(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            shareToken: String,
            params: ExampleListParams = ExampleListParams.none(),
        ): HttpResponseFor<List<Example>> = list(shareToken, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ExampleListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Example>>

        /** @see list */
        @MustBeClosed
        fun list(params: ExampleListParams): HttpResponseFor<List<Example>> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            shareToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Example>> =
            list(shareToken, ExampleListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/public/{share_token}/examples/count`, but is
         * otherwise the same as [ExampleService.retrieveCount].
         */
        @MustBeClosed
        fun retrieveCount(shareToken: String): HttpResponseFor<Long> =
            retrieveCount(shareToken, ExampleRetrieveCountParams.none())

        /** @see retrieveCount */
        @MustBeClosed
        fun retrieveCount(
            shareToken: String,
            params: ExampleRetrieveCountParams = ExampleRetrieveCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Long> =
            retrieveCount(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see retrieveCount */
        @MustBeClosed
        fun retrieveCount(
            shareToken: String,
            params: ExampleRetrieveCountParams = ExampleRetrieveCountParams.none(),
        ): HttpResponseFor<Long> = retrieveCount(shareToken, params, RequestOptions.none())

        /** @see retrieveCount */
        @MustBeClosed
        fun retrieveCount(
            params: ExampleRetrieveCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Long>

        /** @see retrieveCount */
        @MustBeClosed
        fun retrieveCount(params: ExampleRetrieveCountParams): HttpResponseFor<Long> =
            retrieveCount(params, RequestOptions.none())

        /** @see retrieveCount */
        @MustBeClosed
        fun retrieveCount(
            shareToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Long> =
            retrieveCount(shareToken, ExampleRetrieveCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/public/{share_token}/examples/runs`, but is
         * otherwise the same as [ExampleService.runs].
         */
        @MustBeClosed
        fun runs(
            shareToken: String,
            params: ExampleRunsParams,
        ): HttpResponseFor<ExampleRunsResponse> = runs(shareToken, params, RequestOptions.none())

        /** @see runs */
        @MustBeClosed
        fun runs(
            shareToken: String,
            params: ExampleRunsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExampleRunsResponse> =
            runs(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see runs */
        @MustBeClosed
        fun runs(params: ExampleRunsParams): HttpResponseFor<ExampleRunsResponse> =
            runs(params, RequestOptions.none())

        /** @see runs */
        @MustBeClosed
        fun runs(
            params: ExampleRunsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExampleRunsResponse>
    }
}

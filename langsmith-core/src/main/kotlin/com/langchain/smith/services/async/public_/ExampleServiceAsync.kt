// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.public_

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.examples.Example
import com.langchain.smith.models.public_.examples.ExampleListParams
import com.langchain.smith.models.public_.examples.ExampleRetrieveCountParams
import com.langchain.smith.models.public_.examples.ExampleRunsParams
import com.langchain.smith.models.public_.examples.ExampleRunsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ExampleServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExampleServiceAsync

    /** Get example by ids or the shared example if not specifed. */
    fun list(shareToken: String): CompletableFuture<List<Example>> =
        list(shareToken, ExampleListParams.none())

    /** @see list */
    fun list(
        shareToken: String,
        params: ExampleListParams = ExampleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Example>> =
        list(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see list */
    fun list(
        shareToken: String,
        params: ExampleListParams = ExampleListParams.none(),
    ): CompletableFuture<List<Example>> = list(shareToken, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ExampleListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Example>>

    /** @see list */
    fun list(params: ExampleListParams): CompletableFuture<List<Example>> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(shareToken: String, requestOptions: RequestOptions): CompletableFuture<List<Example>> =
        list(shareToken, ExampleListParams.none(), requestOptions)

    /** Count all examples by query params */
    fun retrieveCount(shareToken: String): CompletableFuture<Long> =
        retrieveCount(shareToken, ExampleRetrieveCountParams.none())

    /** @see retrieveCount */
    fun retrieveCount(
        shareToken: String,
        params: ExampleRetrieveCountParams = ExampleRetrieveCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Long> =
        retrieveCount(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see retrieveCount */
    fun retrieveCount(
        shareToken: String,
        params: ExampleRetrieveCountParams = ExampleRetrieveCountParams.none(),
    ): CompletableFuture<Long> = retrieveCount(shareToken, params, RequestOptions.none())

    /** @see retrieveCount */
    fun retrieveCount(
        params: ExampleRetrieveCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Long>

    /** @see retrieveCount */
    fun retrieveCount(params: ExampleRetrieveCountParams): CompletableFuture<Long> =
        retrieveCount(params, RequestOptions.none())

    /** @see retrieveCount */
    fun retrieveCount(shareToken: String, requestOptions: RequestOptions): CompletableFuture<Long> =
        retrieveCount(shareToken, ExampleRetrieveCountParams.none(), requestOptions)

    /** Get examples with associated runs from sessions in a dataset that has been shared. */
    fun runs(
        shareToken: String,
        params: ExampleRunsParams,
    ): CompletableFuture<ExampleRunsResponse> = runs(shareToken, params, RequestOptions.none())

    /** @see runs */
    fun runs(
        shareToken: String,
        params: ExampleRunsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExampleRunsResponse> =
        runs(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see runs */
    fun runs(params: ExampleRunsParams): CompletableFuture<ExampleRunsResponse> =
        runs(params, RequestOptions.none())

    /** @see runs */
    fun runs(
        params: ExampleRunsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExampleRunsResponse>

    /**
     * A view of [ExampleServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExampleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/public/{share_token}/examples`, but is
         * otherwise the same as [ExampleServiceAsync.list].
         */
        fun list(shareToken: String): CompletableFuture<HttpResponseFor<List<Example>>> =
            list(shareToken, ExampleListParams.none())

        /** @see list */
        fun list(
            shareToken: String,
            params: ExampleListParams = ExampleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Example>>> =
            list(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see list */
        fun list(
            shareToken: String,
            params: ExampleListParams = ExampleListParams.none(),
        ): CompletableFuture<HttpResponseFor<List<Example>>> =
            list(shareToken, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ExampleListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Example>>>

        /** @see list */
        fun list(params: ExampleListParams): CompletableFuture<HttpResponseFor<List<Example>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            shareToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<Example>>> =
            list(shareToken, ExampleListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/public/{share_token}/examples/count`, but is
         * otherwise the same as [ExampleServiceAsync.retrieveCount].
         */
        fun retrieveCount(shareToken: String): CompletableFuture<HttpResponseFor<Long>> =
            retrieveCount(shareToken, ExampleRetrieveCountParams.none())

        /** @see retrieveCount */
        fun retrieveCount(
            shareToken: String,
            params: ExampleRetrieveCountParams = ExampleRetrieveCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Long>> =
            retrieveCount(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see retrieveCount */
        fun retrieveCount(
            shareToken: String,
            params: ExampleRetrieveCountParams = ExampleRetrieveCountParams.none(),
        ): CompletableFuture<HttpResponseFor<Long>> =
            retrieveCount(shareToken, params, RequestOptions.none())

        /** @see retrieveCount */
        fun retrieveCount(
            params: ExampleRetrieveCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Long>>

        /** @see retrieveCount */
        fun retrieveCount(
            params: ExampleRetrieveCountParams
        ): CompletableFuture<HttpResponseFor<Long>> = retrieveCount(params, RequestOptions.none())

        /** @see retrieveCount */
        fun retrieveCount(
            shareToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Long>> =
            retrieveCount(shareToken, ExampleRetrieveCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/public/{share_token}/examples/runs`, but is
         * otherwise the same as [ExampleServiceAsync.runs].
         */
        fun runs(
            shareToken: String,
            params: ExampleRunsParams,
        ): CompletableFuture<HttpResponseFor<ExampleRunsResponse>> =
            runs(shareToken, params, RequestOptions.none())

        /** @see runs */
        fun runs(
            shareToken: String,
            params: ExampleRunsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExampleRunsResponse>> =
            runs(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see runs */
        fun runs(
            params: ExampleRunsParams
        ): CompletableFuture<HttpResponseFor<ExampleRunsResponse>> =
            runs(params, RequestOptions.none())

        /** @see runs */
        fun runs(
            params: ExampleRunsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExampleRunsResponse>>
    }
}

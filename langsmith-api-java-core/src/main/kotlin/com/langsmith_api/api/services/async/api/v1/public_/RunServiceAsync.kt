// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.public_

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.public_.runs.RunListParams
import com.langsmith_api.api.models.api.v1.public_.runs.RunPublicSchema
import com.langsmith_api.api.models.api.v1.public_.runs.RunQueryParams
import com.langsmith_api.api.models.api.v1.public_.runs.RunQueryResponse
import com.langsmith_api.api.models.api.v1.public_.runs.RunRetrieveParams
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

    /** Get the shared run. */
    fun retrieve(id: String, params: RunRetrieveParams): CompletableFuture<RunPublicSchema> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: RunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunPublicSchema> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: RunRetrieveParams): CompletableFuture<RunPublicSchema> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunPublicSchema>

    /** Get the shared run. */
    fun list(shareToken: String): CompletableFuture<RunPublicSchema> =
        list(shareToken, RunListParams.none())

    /** @see list */
    fun list(
        shareToken: String,
        params: RunListParams = RunListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunPublicSchema> =
        list(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see list */
    fun list(
        shareToken: String,
        params: RunListParams = RunListParams.none(),
    ): CompletableFuture<RunPublicSchema> = list(shareToken, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RunListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunPublicSchema>

    /** @see list */
    fun list(params: RunListParams): CompletableFuture<RunPublicSchema> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        shareToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunPublicSchema> = list(shareToken, RunListParams.none(), requestOptions)

    /** Get run by ids or the shared run if not specifed. */
    fun query(shareToken: String): CompletableFuture<RunQueryResponse> =
        query(shareToken, RunQueryParams.none())

    /** @see query */
    fun query(
        shareToken: String,
        params: RunQueryParams = RunQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunQueryResponse> =
        query(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see query */
    fun query(
        shareToken: String,
        params: RunQueryParams = RunQueryParams.none(),
    ): CompletableFuture<RunQueryResponse> = query(shareToken, params, RequestOptions.none())

    /** @see query */
    fun query(
        params: RunQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunQueryResponse>

    /** @see query */
    fun query(params: RunQueryParams): CompletableFuture<RunQueryResponse> =
        query(params, RequestOptions.none())

    /** @see query */
    fun query(
        shareToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunQueryResponse> =
        query(shareToken, RunQueryParams.none(), requestOptions)

    /** A view of [RunServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/public/{share_token}/run/{id}`, but is
         * otherwise the same as [RunServiceAsync.retrieve].
         */
        fun retrieve(
            id: String,
            params: RunRetrieveParams,
        ): CompletableFuture<HttpResponseFor<RunPublicSchema>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: RunRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunPublicSchema>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: RunRetrieveParams
        ): CompletableFuture<HttpResponseFor<RunPublicSchema>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RunRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunPublicSchema>>

        /**
         * Returns a raw HTTP response for `get /api/v1/public/{share_token}/run`, but is otherwise
         * the same as [RunServiceAsync.list].
         */
        fun list(shareToken: String): CompletableFuture<HttpResponseFor<RunPublicSchema>> =
            list(shareToken, RunListParams.none())

        /** @see list */
        fun list(
            shareToken: String,
            params: RunListParams = RunListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunPublicSchema>> =
            list(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see list */
        fun list(
            shareToken: String,
            params: RunListParams = RunListParams.none(),
        ): CompletableFuture<HttpResponseFor<RunPublicSchema>> =
            list(shareToken, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: RunListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunPublicSchema>>

        /** @see list */
        fun list(params: RunListParams): CompletableFuture<HttpResponseFor<RunPublicSchema>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            shareToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunPublicSchema>> =
            list(shareToken, RunListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/public/{share_token}/runs/query`, but is
         * otherwise the same as [RunServiceAsync.query].
         */
        fun query(shareToken: String): CompletableFuture<HttpResponseFor<RunQueryResponse>> =
            query(shareToken, RunQueryParams.none())

        /** @see query */
        fun query(
            shareToken: String,
            params: RunQueryParams = RunQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunQueryResponse>> =
            query(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see query */
        fun query(
            shareToken: String,
            params: RunQueryParams = RunQueryParams.none(),
        ): CompletableFuture<HttpResponseFor<RunQueryResponse>> =
            query(shareToken, params, RequestOptions.none())

        /** @see query */
        fun query(
            params: RunQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunQueryResponse>>

        /** @see query */
        fun query(params: RunQueryParams): CompletableFuture<HttpResponseFor<RunQueryResponse>> =
            query(params, RequestOptions.none())

        /** @see query */
        fun query(
            shareToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunQueryResponse>> =
            query(shareToken, RunQueryParams.none(), requestOptions)
    }
}

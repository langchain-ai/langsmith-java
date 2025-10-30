// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.orgs.current.members

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.orgs.current.members.basic.BasicBatchParams
import com.langsmith_api.api.models.api.v1.orgs.current.members.basic.BasicBatchResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BasicServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BasicServiceAsync

    /** Batch add up to 500 users to the org and specified workspaces in basic auth mode. */
    fun batch(params: BasicBatchParams): CompletableFuture<List<BasicBatchResponse>> =
        batch(params, RequestOptions.none())

    /** @see batch */
    fun batch(
        params: BasicBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<BasicBatchResponse>>

    /** A view of [BasicServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BasicServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/orgs/current/members/basic/batch`, but is
         * otherwise the same as [BasicServiceAsync.batch].
         */
        fun batch(
            params: BasicBatchParams
        ): CompletableFuture<HttpResponseFor<List<BasicBatchResponse>>> =
            batch(params, RequestOptions.none())

        /** @see batch */
        fun batch(
            params: BasicBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<BasicBatchResponse>>>
    }
}

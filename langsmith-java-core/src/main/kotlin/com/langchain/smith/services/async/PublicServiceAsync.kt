// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.feedback.FeedbackSchema
import com.langchain.smith.models.public_.PublicRetrieveFeedbacksParams
import com.langchain.smith.services.async.public_.DatasetServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PublicServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PublicServiceAsync

    fun datasets(): DatasetServiceAsync

    /** Read Shared Feedbacks */
    fun retrieveFeedbacks(shareToken: String): CompletableFuture<List<FeedbackSchema>> =
        retrieveFeedbacks(shareToken, PublicRetrieveFeedbacksParams.none())

    /** @see retrieveFeedbacks */
    fun retrieveFeedbacks(
        shareToken: String,
        params: PublicRetrieveFeedbacksParams = PublicRetrieveFeedbacksParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<FeedbackSchema>> =
        retrieveFeedbacks(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see retrieveFeedbacks */
    fun retrieveFeedbacks(
        shareToken: String,
        params: PublicRetrieveFeedbacksParams = PublicRetrieveFeedbacksParams.none(),
    ): CompletableFuture<List<FeedbackSchema>> =
        retrieveFeedbacks(shareToken, params, RequestOptions.none())

    /** @see retrieveFeedbacks */
    fun retrieveFeedbacks(
        params: PublicRetrieveFeedbacksParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<FeedbackSchema>>

    /** @see retrieveFeedbacks */
    fun retrieveFeedbacks(
        params: PublicRetrieveFeedbacksParams
    ): CompletableFuture<List<FeedbackSchema>> = retrieveFeedbacks(params, RequestOptions.none())

    /** @see retrieveFeedbacks */
    fun retrieveFeedbacks(
        shareToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<FeedbackSchema>> =
        retrieveFeedbacks(shareToken, PublicRetrieveFeedbacksParams.none(), requestOptions)

    /**
     * A view of [PublicServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PublicServiceAsync.WithRawResponse

        fun datasets(): DatasetServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/public/{share_token}/feedbacks`, but is
         * otherwise the same as [PublicServiceAsync.retrieveFeedbacks].
         */
        fun retrieveFeedbacks(
            shareToken: String
        ): CompletableFuture<HttpResponseFor<List<FeedbackSchema>>> =
            retrieveFeedbacks(shareToken, PublicRetrieveFeedbacksParams.none())

        /** @see retrieveFeedbacks */
        fun retrieveFeedbacks(
            shareToken: String,
            params: PublicRetrieveFeedbacksParams = PublicRetrieveFeedbacksParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<FeedbackSchema>>> =
            retrieveFeedbacks(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see retrieveFeedbacks */
        fun retrieveFeedbacks(
            shareToken: String,
            params: PublicRetrieveFeedbacksParams = PublicRetrieveFeedbacksParams.none(),
        ): CompletableFuture<HttpResponseFor<List<FeedbackSchema>>> =
            retrieveFeedbacks(shareToken, params, RequestOptions.none())

        /** @see retrieveFeedbacks */
        fun retrieveFeedbacks(
            params: PublicRetrieveFeedbacksParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<FeedbackSchema>>>

        /** @see retrieveFeedbacks */
        fun retrieveFeedbacks(
            params: PublicRetrieveFeedbacksParams
        ): CompletableFuture<HttpResponseFor<List<FeedbackSchema>>> =
            retrieveFeedbacks(params, RequestOptions.none())

        /** @see retrieveFeedbacks */
        fun retrieveFeedbacks(
            shareToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<FeedbackSchema>>> =
            retrieveFeedbacks(shareToken, PublicRetrieveFeedbacksParams.none(), requestOptions)
    }
}

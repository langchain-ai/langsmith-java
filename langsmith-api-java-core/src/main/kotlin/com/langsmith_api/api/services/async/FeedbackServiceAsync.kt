// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.feedback.FeedbackIngestBatchParams
import com.langsmith_api.api.models.feedback.FeedbackIngestBatchResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FeedbackServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeedbackServiceAsync

    /** Ingests a batch of feedback objects in a single JSON array payload. */
    fun ingestBatch(
        params: FeedbackIngestBatchParams
    ): CompletableFuture<FeedbackIngestBatchResponse> = ingestBatch(params, RequestOptions.none())

    /** @see ingestBatch */
    fun ingestBatch(
        params: FeedbackIngestBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeedbackIngestBatchResponse>

    /**
     * A view of [FeedbackServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FeedbackServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /feedback/batch`, but is otherwise the same as
         * [FeedbackServiceAsync.ingestBatch].
         */
        fun ingestBatch(
            params: FeedbackIngestBatchParams
        ): CompletableFuture<HttpResponseFor<FeedbackIngestBatchResponse>> =
            ingestBatch(params, RequestOptions.none())

        /** @see ingestBatch */
        fun ingestBatch(
            params: FeedbackIngestBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeedbackIngestBatchResponse>>
    }
}

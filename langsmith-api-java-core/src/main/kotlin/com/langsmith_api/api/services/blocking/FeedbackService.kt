// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.feedback.FeedbackIngestBatchParams
import com.langsmith_api.api.models.feedback.FeedbackIngestBatchResponse
import java.util.function.Consumer

interface FeedbackService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeedbackService

    /** Ingests a batch of feedback objects in a single JSON array payload. */
    fun ingestBatch(params: FeedbackIngestBatchParams): FeedbackIngestBatchResponse =
        ingestBatch(params, RequestOptions.none())

    /** @see ingestBatch */
    fun ingestBatch(
        params: FeedbackIngestBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeedbackIngestBatchResponse

    /** A view of [FeedbackService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeedbackService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /feedback/batch`, but is otherwise the same as
         * [FeedbackService.ingestBatch].
         */
        @MustBeClosed
        fun ingestBatch(
            params: FeedbackIngestBatchParams
        ): HttpResponseFor<FeedbackIngestBatchResponse> = ingestBatch(params, RequestOptions.none())

        /** @see ingestBatch */
        @MustBeClosed
        fun ingestBatch(
            params: FeedbackIngestBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeedbackIngestBatchResponse>
    }
}

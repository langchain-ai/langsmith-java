// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.annotationqueues

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.annotationqueues.reviewers.ReviewerListPageAsync
import com.langchain.smith.models.annotationqueues.reviewers.ReviewerListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ReviewerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReviewerServiceAsync

    /**
     * List a queue's reviewers with how many reviews each has waiting, how many they have
     * completed, and when they last completed one. Includes everyone on the queue's roster and
     * anyone else who has reviewed on the queue, such as people removed from the roster;
     * is_on_roster tells them apart. name and email are left out when a reviewer cannot be looked
     * up. Only single queues are supported, and the endpoint returns 501 unless multi-reviewer is
     * on for the workspace.
     */
    fun list(queueId: String): CompletableFuture<ReviewerListPageAsync> =
        list(queueId, ReviewerListParams.none())

    /** @see list */
    fun list(
        queueId: String,
        params: ReviewerListParams = ReviewerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReviewerListPageAsync> =
        list(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see list */
    fun list(
        queueId: String,
        params: ReviewerListParams = ReviewerListParams.none(),
    ): CompletableFuture<ReviewerListPageAsync> = list(queueId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ReviewerListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReviewerListPageAsync>

    /** @see list */
    fun list(params: ReviewerListParams): CompletableFuture<ReviewerListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        queueId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReviewerListPageAsync> =
        list(queueId, ReviewerListParams.none(), requestOptions)

    /**
     * A view of [ReviewerServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReviewerServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/platform/annotation-queues/{queue_id}/reviewers`, but is otherwise the same as
         * [ReviewerServiceAsync.list].
         */
        fun list(queueId: String): CompletableFuture<HttpResponseFor<ReviewerListPageAsync>> =
            list(queueId, ReviewerListParams.none())

        /** @see list */
        fun list(
            queueId: String,
            params: ReviewerListParams = ReviewerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReviewerListPageAsync>> =
            list(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see list */
        fun list(
            queueId: String,
            params: ReviewerListParams = ReviewerListParams.none(),
        ): CompletableFuture<HttpResponseFor<ReviewerListPageAsync>> =
            list(queueId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ReviewerListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReviewerListPageAsync>>

        /** @see list */
        fun list(
            params: ReviewerListParams
        ): CompletableFuture<HttpResponseFor<ReviewerListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            queueId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReviewerListPageAsync>> =
            list(queueId, ReviewerListParams.none(), requestOptions)
    }
}

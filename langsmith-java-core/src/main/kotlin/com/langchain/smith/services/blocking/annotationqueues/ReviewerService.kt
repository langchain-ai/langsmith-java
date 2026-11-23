// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.annotationqueues

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.annotationqueues.reviewers.ReviewerListPage
import com.langchain.smith.models.annotationqueues.reviewers.ReviewerListParams
import java.util.function.Consumer

interface ReviewerService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReviewerService

    /**
     * List a queue's reviewers with how many reviews each has waiting, how many they have
     * completed, and when they last completed one. Includes everyone on the queue's roster and
     * anyone else who has reviewed on the queue, such as people removed from the roster;
     * is_on_roster tells them apart. name and email are left out when a reviewer cannot be looked
     * up. Only single queues are supported, and the endpoint returns 501 unless multi-reviewer is
     * on for the workspace.
     */
    fun list(queueId: String): ReviewerListPage = list(queueId, ReviewerListParams.none())

    /** @see list */
    fun list(
        queueId: String,
        params: ReviewerListParams = ReviewerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReviewerListPage = list(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see list */
    fun list(
        queueId: String,
        params: ReviewerListParams = ReviewerListParams.none(),
    ): ReviewerListPage = list(queueId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ReviewerListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReviewerListPage

    /** @see list */
    fun list(params: ReviewerListParams): ReviewerListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(queueId: String, requestOptions: RequestOptions): ReviewerListPage =
        list(queueId, ReviewerListParams.none(), requestOptions)

    /** A view of [ReviewerService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReviewerService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/platform/annotation-queues/{queue_id}/reviewers`, but is otherwise the same as
         * [ReviewerService.list].
         */
        @MustBeClosed
        fun list(queueId: String): HttpResponseFor<ReviewerListPage> =
            list(queueId, ReviewerListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            queueId: String,
            params: ReviewerListParams = ReviewerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReviewerListPage> =
            list(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            queueId: String,
            params: ReviewerListParams = ReviewerListParams.none(),
        ): HttpResponseFor<ReviewerListPage> = list(queueId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ReviewerListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReviewerListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: ReviewerListParams): HttpResponseFor<ReviewerListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            queueId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReviewerListPage> =
            list(queueId, ReviewerListParams.none(), requestOptions)
    }
}

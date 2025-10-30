// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.feedback.FeedbackSchema
import com.langsmith_api.api.models.api.v1.public_.PublicRetrieveFeedbacksParams
import com.langsmith_api.api.services.blocking.api.v1.public_.DatasetService
import com.langsmith_api.api.services.blocking.api.v1.public_.ExampleService
import com.langsmith_api.api.services.blocking.api.v1.public_.RunService
import com.langsmith_api.api.services.blocking.api.v1.public_.SchemaService
import java.util.function.Consumer

interface PublicService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PublicService

    fun datasets(): DatasetService

    fun examples(): ExampleService

    fun schemas(): SchemaService

    fun runs(): RunService

    /** Read Shared Feedbacks */
    fun retrieveFeedbacks(shareToken: String): List<FeedbackSchema> =
        retrieveFeedbacks(shareToken, PublicRetrieveFeedbacksParams.none())

    /** @see retrieveFeedbacks */
    fun retrieveFeedbacks(
        shareToken: String,
        params: PublicRetrieveFeedbacksParams = PublicRetrieveFeedbacksParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<FeedbackSchema> =
        retrieveFeedbacks(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see retrieveFeedbacks */
    fun retrieveFeedbacks(
        shareToken: String,
        params: PublicRetrieveFeedbacksParams = PublicRetrieveFeedbacksParams.none(),
    ): List<FeedbackSchema> = retrieveFeedbacks(shareToken, params, RequestOptions.none())

    /** @see retrieveFeedbacks */
    fun retrieveFeedbacks(
        params: PublicRetrieveFeedbacksParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<FeedbackSchema>

    /** @see retrieveFeedbacks */
    fun retrieveFeedbacks(params: PublicRetrieveFeedbacksParams): List<FeedbackSchema> =
        retrieveFeedbacks(params, RequestOptions.none())

    /** @see retrieveFeedbacks */
    fun retrieveFeedbacks(
        shareToken: String,
        requestOptions: RequestOptions,
    ): List<FeedbackSchema> =
        retrieveFeedbacks(shareToken, PublicRetrieveFeedbacksParams.none(), requestOptions)

    /** A view of [PublicService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PublicService.WithRawResponse

        fun datasets(): DatasetService.WithRawResponse

        fun examples(): ExampleService.WithRawResponse

        fun schemas(): SchemaService.WithRawResponse

        fun runs(): RunService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/public/{share_token}/feedbacks`, but is
         * otherwise the same as [PublicService.retrieveFeedbacks].
         */
        @MustBeClosed
        fun retrieveFeedbacks(shareToken: String): HttpResponseFor<List<FeedbackSchema>> =
            retrieveFeedbacks(shareToken, PublicRetrieveFeedbacksParams.none())

        /** @see retrieveFeedbacks */
        @MustBeClosed
        fun retrieveFeedbacks(
            shareToken: String,
            params: PublicRetrieveFeedbacksParams = PublicRetrieveFeedbacksParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<FeedbackSchema>> =
            retrieveFeedbacks(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see retrieveFeedbacks */
        @MustBeClosed
        fun retrieveFeedbacks(
            shareToken: String,
            params: PublicRetrieveFeedbacksParams = PublicRetrieveFeedbacksParams.none(),
        ): HttpResponseFor<List<FeedbackSchema>> =
            retrieveFeedbacks(shareToken, params, RequestOptions.none())

        /** @see retrieveFeedbacks */
        @MustBeClosed
        fun retrieveFeedbacks(
            params: PublicRetrieveFeedbacksParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<FeedbackSchema>>

        /** @see retrieveFeedbacks */
        @MustBeClosed
        fun retrieveFeedbacks(
            params: PublicRetrieveFeedbacksParams
        ): HttpResponseFor<List<FeedbackSchema>> = retrieveFeedbacks(params, RequestOptions.none())

        /** @see retrieveFeedbacks */
        @MustBeClosed
        fun retrieveFeedbacks(
            shareToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<FeedbackSchema>> =
            retrieveFeedbacks(shareToken, PublicRetrieveFeedbacksParams.none(), requestOptions)
    }
}

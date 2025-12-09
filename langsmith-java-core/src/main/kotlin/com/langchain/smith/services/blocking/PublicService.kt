// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.public_.PublicRetrieveFeedbacksPage
import com.langchain.smith.models.public_.PublicRetrieveFeedbacksParams
import com.langchain.smith.services.blocking.public_.DatasetService
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

    /** Read Shared Feedbacks */
    fun retrieveFeedbacks(shareToken: String): PublicRetrieveFeedbacksPage =
        retrieveFeedbacks(shareToken, PublicRetrieveFeedbacksParams.none())

    /** @see retrieveFeedbacks */
    fun retrieveFeedbacks(
        shareToken: String,
        params: PublicRetrieveFeedbacksParams = PublicRetrieveFeedbacksParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicRetrieveFeedbacksPage =
        retrieveFeedbacks(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see retrieveFeedbacks */
    fun retrieveFeedbacks(
        shareToken: String,
        params: PublicRetrieveFeedbacksParams = PublicRetrieveFeedbacksParams.none(),
    ): PublicRetrieveFeedbacksPage = retrieveFeedbacks(shareToken, params, RequestOptions.none())

    /** @see retrieveFeedbacks */
    fun retrieveFeedbacks(
        params: PublicRetrieveFeedbacksParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicRetrieveFeedbacksPage

    /** @see retrieveFeedbacks */
    fun retrieveFeedbacks(params: PublicRetrieveFeedbacksParams): PublicRetrieveFeedbacksPage =
        retrieveFeedbacks(params, RequestOptions.none())

    /** @see retrieveFeedbacks */
    fun retrieveFeedbacks(
        shareToken: String,
        requestOptions: RequestOptions,
    ): PublicRetrieveFeedbacksPage =
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

        /**
         * Returns a raw HTTP response for `get /api/v1/public/{share_token}/feedbacks`, but is
         * otherwise the same as [PublicService.retrieveFeedbacks].
         */
        @MustBeClosed
        fun retrieveFeedbacks(shareToken: String): HttpResponseFor<PublicRetrieveFeedbacksPage> =
            retrieveFeedbacks(shareToken, PublicRetrieveFeedbacksParams.none())

        /** @see retrieveFeedbacks */
        @MustBeClosed
        fun retrieveFeedbacks(
            shareToken: String,
            params: PublicRetrieveFeedbacksParams = PublicRetrieveFeedbacksParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicRetrieveFeedbacksPage> =
            retrieveFeedbacks(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see retrieveFeedbacks */
        @MustBeClosed
        fun retrieveFeedbacks(
            shareToken: String,
            params: PublicRetrieveFeedbacksParams = PublicRetrieveFeedbacksParams.none(),
        ): HttpResponseFor<PublicRetrieveFeedbacksPage> =
            retrieveFeedbacks(shareToken, params, RequestOptions.none())

        /** @see retrieveFeedbacks */
        @MustBeClosed
        fun retrieveFeedbacks(
            params: PublicRetrieveFeedbacksParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicRetrieveFeedbacksPage>

        /** @see retrieveFeedbacks */
        @MustBeClosed
        fun retrieveFeedbacks(
            params: PublicRetrieveFeedbacksParams
        ): HttpResponseFor<PublicRetrieveFeedbacksPage> =
            retrieveFeedbacks(params, RequestOptions.none())

        /** @see retrieveFeedbacks */
        @MustBeClosed
        fun retrieveFeedbacks(
            shareToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicRetrieveFeedbacksPage> =
            retrieveFeedbacks(shareToken, PublicRetrieveFeedbacksParams.none(), requestOptions)
    }
}

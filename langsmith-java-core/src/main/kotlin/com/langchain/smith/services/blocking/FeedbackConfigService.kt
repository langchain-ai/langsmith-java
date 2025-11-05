// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.feedbackconfigs.FeedbackConfigFeedbackConfigsParams
import com.langchain.smith.models.feedbackconfigs.FeedbackConfigRetrieveFeedbackConfigsParams
import com.langchain.smith.models.feedbackconfigs.FeedbackConfigSchema
import com.langchain.smith.models.feedbackconfigs.FeedbackConfigUpdateFeedbackConfigsParams
import java.util.function.Consumer

interface FeedbackConfigService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeedbackConfigService

    /** Create Feedback Config Endpoint */
    fun feedbackConfigs(params: FeedbackConfigFeedbackConfigsParams): FeedbackConfigSchema =
        feedbackConfigs(params, RequestOptions.none())

    /** @see feedbackConfigs */
    fun feedbackConfigs(
        params: FeedbackConfigFeedbackConfigsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeedbackConfigSchema

    /** List Feedback Configs Endpoint */
    fun retrieveFeedbackConfigs(): List<FeedbackConfigSchema> =
        retrieveFeedbackConfigs(FeedbackConfigRetrieveFeedbackConfigsParams.none())

    /** @see retrieveFeedbackConfigs */
    fun retrieveFeedbackConfigs(
        params: FeedbackConfigRetrieveFeedbackConfigsParams =
            FeedbackConfigRetrieveFeedbackConfigsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<FeedbackConfigSchema>

    /** @see retrieveFeedbackConfigs */
    fun retrieveFeedbackConfigs(
        params: FeedbackConfigRetrieveFeedbackConfigsParams =
            FeedbackConfigRetrieveFeedbackConfigsParams.none()
    ): List<FeedbackConfigSchema> = retrieveFeedbackConfigs(params, RequestOptions.none())

    /** @see retrieveFeedbackConfigs */
    fun retrieveFeedbackConfigs(requestOptions: RequestOptions): List<FeedbackConfigSchema> =
        retrieveFeedbackConfigs(FeedbackConfigRetrieveFeedbackConfigsParams.none(), requestOptions)

    /** Update Feedback Config Endpoint */
    fun updateFeedbackConfigs(
        params: FeedbackConfigUpdateFeedbackConfigsParams
    ): FeedbackConfigSchema = updateFeedbackConfigs(params, RequestOptions.none())

    /** @see updateFeedbackConfigs */
    fun updateFeedbackConfigs(
        params: FeedbackConfigUpdateFeedbackConfigsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeedbackConfigSchema

    /**
     * A view of [FeedbackConfigService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FeedbackConfigService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/feedback-configs`, but is otherwise the
         * same as [FeedbackConfigService.feedbackConfigs].
         */
        @MustBeClosed
        fun feedbackConfigs(
            params: FeedbackConfigFeedbackConfigsParams
        ): HttpResponseFor<FeedbackConfigSchema> = feedbackConfigs(params, RequestOptions.none())

        /** @see feedbackConfigs */
        @MustBeClosed
        fun feedbackConfigs(
            params: FeedbackConfigFeedbackConfigsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeedbackConfigSchema>

        /**
         * Returns a raw HTTP response for `get /api/v1/feedback-configs`, but is otherwise the same
         * as [FeedbackConfigService.retrieveFeedbackConfigs].
         */
        @MustBeClosed
        fun retrieveFeedbackConfigs(): HttpResponseFor<List<FeedbackConfigSchema>> =
            retrieveFeedbackConfigs(FeedbackConfigRetrieveFeedbackConfigsParams.none())

        /** @see retrieveFeedbackConfigs */
        @MustBeClosed
        fun retrieveFeedbackConfigs(
            params: FeedbackConfigRetrieveFeedbackConfigsParams =
                FeedbackConfigRetrieveFeedbackConfigsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<FeedbackConfigSchema>>

        /** @see retrieveFeedbackConfigs */
        @MustBeClosed
        fun retrieveFeedbackConfigs(
            params: FeedbackConfigRetrieveFeedbackConfigsParams =
                FeedbackConfigRetrieveFeedbackConfigsParams.none()
        ): HttpResponseFor<List<FeedbackConfigSchema>> =
            retrieveFeedbackConfigs(params, RequestOptions.none())

        /** @see retrieveFeedbackConfigs */
        @MustBeClosed
        fun retrieveFeedbackConfigs(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<FeedbackConfigSchema>> =
            retrieveFeedbackConfigs(
                FeedbackConfigRetrieveFeedbackConfigsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `patch /api/v1/feedback-configs`, but is otherwise the
         * same as [FeedbackConfigService.updateFeedbackConfigs].
         */
        @MustBeClosed
        fun updateFeedbackConfigs(
            params: FeedbackConfigUpdateFeedbackConfigsParams
        ): HttpResponseFor<FeedbackConfigSchema> =
            updateFeedbackConfigs(params, RequestOptions.none())

        /** @see updateFeedbackConfigs */
        @MustBeClosed
        fun updateFeedbackConfigs(
            params: FeedbackConfigUpdateFeedbackConfigsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeedbackConfigSchema>
    }
}

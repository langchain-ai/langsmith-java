// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.feedbackconfigs.FeedbackConfigFeedbackConfigsParams
import com.langsmith_api.api.models.api.v1.feedbackconfigs.FeedbackConfigRetrieveFeedbackConfigsParams
import com.langsmith_api.api.models.api.v1.feedbackconfigs.FeedbackConfigSchema
import com.langsmith_api.api.models.api.v1.feedbackconfigs.FeedbackConfigUpdateFeedbackConfigsParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FeedbackConfigServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeedbackConfigServiceAsync

    /** Create Feedback Config Endpoint */
    fun feedbackConfigs(
        params: FeedbackConfigFeedbackConfigsParams
    ): CompletableFuture<FeedbackConfigSchema> = feedbackConfigs(params, RequestOptions.none())

    /** @see feedbackConfigs */
    fun feedbackConfigs(
        params: FeedbackConfigFeedbackConfigsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeedbackConfigSchema>

    /** List Feedback Configs Endpoint */
    fun retrieveFeedbackConfigs(): CompletableFuture<List<FeedbackConfigSchema>> =
        retrieveFeedbackConfigs(FeedbackConfigRetrieveFeedbackConfigsParams.none())

    /** @see retrieveFeedbackConfigs */
    fun retrieveFeedbackConfigs(
        params: FeedbackConfigRetrieveFeedbackConfigsParams =
            FeedbackConfigRetrieveFeedbackConfigsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<FeedbackConfigSchema>>

    /** @see retrieveFeedbackConfigs */
    fun retrieveFeedbackConfigs(
        params: FeedbackConfigRetrieveFeedbackConfigsParams =
            FeedbackConfigRetrieveFeedbackConfigsParams.none()
    ): CompletableFuture<List<FeedbackConfigSchema>> =
        retrieveFeedbackConfigs(params, RequestOptions.none())

    /** @see retrieveFeedbackConfigs */
    fun retrieveFeedbackConfigs(
        requestOptions: RequestOptions
    ): CompletableFuture<List<FeedbackConfigSchema>> =
        retrieveFeedbackConfigs(FeedbackConfigRetrieveFeedbackConfigsParams.none(), requestOptions)

    /** Update Feedback Config Endpoint */
    fun updateFeedbackConfigs(
        params: FeedbackConfigUpdateFeedbackConfigsParams
    ): CompletableFuture<FeedbackConfigSchema> =
        updateFeedbackConfigs(params, RequestOptions.none())

    /** @see updateFeedbackConfigs */
    fun updateFeedbackConfigs(
        params: FeedbackConfigUpdateFeedbackConfigsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeedbackConfigSchema>

    /**
     * A view of [FeedbackConfigServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FeedbackConfigServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/feedback-configs`, but is otherwise the
         * same as [FeedbackConfigServiceAsync.feedbackConfigs].
         */
        fun feedbackConfigs(
            params: FeedbackConfigFeedbackConfigsParams
        ): CompletableFuture<HttpResponseFor<FeedbackConfigSchema>> =
            feedbackConfigs(params, RequestOptions.none())

        /** @see feedbackConfigs */
        fun feedbackConfigs(
            params: FeedbackConfigFeedbackConfigsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeedbackConfigSchema>>

        /**
         * Returns a raw HTTP response for `get /api/v1/feedback-configs`, but is otherwise the same
         * as [FeedbackConfigServiceAsync.retrieveFeedbackConfigs].
         */
        fun retrieveFeedbackConfigs():
            CompletableFuture<HttpResponseFor<List<FeedbackConfigSchema>>> =
            retrieveFeedbackConfigs(FeedbackConfigRetrieveFeedbackConfigsParams.none())

        /** @see retrieveFeedbackConfigs */
        fun retrieveFeedbackConfigs(
            params: FeedbackConfigRetrieveFeedbackConfigsParams =
                FeedbackConfigRetrieveFeedbackConfigsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<FeedbackConfigSchema>>>

        /** @see retrieveFeedbackConfigs */
        fun retrieveFeedbackConfigs(
            params: FeedbackConfigRetrieveFeedbackConfigsParams =
                FeedbackConfigRetrieveFeedbackConfigsParams.none()
        ): CompletableFuture<HttpResponseFor<List<FeedbackConfigSchema>>> =
            retrieveFeedbackConfigs(params, RequestOptions.none())

        /** @see retrieveFeedbackConfigs */
        fun retrieveFeedbackConfigs(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<FeedbackConfigSchema>>> =
            retrieveFeedbackConfigs(
                FeedbackConfigRetrieveFeedbackConfigsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `patch /api/v1/feedback-configs`, but is otherwise the
         * same as [FeedbackConfigServiceAsync.updateFeedbackConfigs].
         */
        fun updateFeedbackConfigs(
            params: FeedbackConfigUpdateFeedbackConfigsParams
        ): CompletableFuture<HttpResponseFor<FeedbackConfigSchema>> =
            updateFeedbackConfigs(params, RequestOptions.none())

        /** @see updateFeedbackConfigs */
        fun updateFeedbackConfigs(
            params: FeedbackConfigUpdateFeedbackConfigsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeedbackConfigSchema>>
    }
}

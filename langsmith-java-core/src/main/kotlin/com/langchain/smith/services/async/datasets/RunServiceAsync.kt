// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.datasets

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.datasets.runs.RunCreateParams
import com.langchain.smith.models.datasets.runs.RunCreateResponse
import com.langchain.smith.models.datasets.runs.RunDeltaParams
import com.langchain.smith.models.datasets.runs.SessionFeedbackDelta
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RunServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync

    /**
     * Fetch examples for a dataset, and fetch the runs for each example if they are associated with
     * the given session_ids.
     */
    fun create(
        datasetId: String,
        params: RunCreateParams,
    ): CompletableFuture<Optional<RunCreateResponse>> =
        create(datasetId, params, RequestOptions.none())

    /** @see create */
    fun create(
        datasetId: String,
        params: RunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Optional<RunCreateResponse>> =
        create(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see create */
    fun create(params: RunCreateParams): CompletableFuture<Optional<RunCreateResponse>> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Optional<RunCreateResponse>>

    /**
     * Fetch the number of regressions/improvements for each example in a dataset, between
     * sessions[0] and sessions[1].
     */
    fun delta(datasetId: String, params: RunDeltaParams): CompletableFuture<SessionFeedbackDelta> =
        delta(datasetId, params, RequestOptions.none())

    /** @see delta */
    fun delta(
        datasetId: String,
        params: RunDeltaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionFeedbackDelta> =
        delta(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see delta */
    fun delta(params: RunDeltaParams): CompletableFuture<SessionFeedbackDelta> =
        delta(params, RequestOptions.none())

    /** @see delta */
    fun delta(
        params: RunDeltaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionFeedbackDelta>

    /** A view of [RunServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/datasets/{dataset_id}/runs`, but is
         * otherwise the same as [RunServiceAsync.create].
         */
        fun create(
            datasetId: String,
            params: RunCreateParams,
        ): CompletableFuture<HttpResponseFor<Optional<RunCreateResponse>>> =
            create(datasetId, params, RequestOptions.none())

        /** @see create */
        fun create(
            datasetId: String,
            params: RunCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Optional<RunCreateResponse>>> =
            create(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see create */
        fun create(
            params: RunCreateParams
        ): CompletableFuture<HttpResponseFor<Optional<RunCreateResponse>>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: RunCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Optional<RunCreateResponse>>>

        /**
         * Returns a raw HTTP response for `post /api/v1/datasets/{dataset_id}/runs/delta`, but is
         * otherwise the same as [RunServiceAsync.delta].
         */
        fun delta(
            datasetId: String,
            params: RunDeltaParams,
        ): CompletableFuture<HttpResponseFor<SessionFeedbackDelta>> =
            delta(datasetId, params, RequestOptions.none())

        /** @see delta */
        fun delta(
            datasetId: String,
            params: RunDeltaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionFeedbackDelta>> =
            delta(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see delta */
        fun delta(
            params: RunDeltaParams
        ): CompletableFuture<HttpResponseFor<SessionFeedbackDelta>> =
            delta(params, RequestOptions.none())

        /** @see delta */
        fun delta(
            params: RunDeltaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionFeedbackDelta>>
    }
}

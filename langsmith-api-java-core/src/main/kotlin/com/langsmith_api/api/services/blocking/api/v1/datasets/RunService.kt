// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.datasets

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.datasets.runs.RunCreateParams
import com.langsmith_api.api.models.api.v1.datasets.runs.RunCreateResponse
import com.langsmith_api.api.models.api.v1.datasets.runs.RunDeltaParams
import com.langsmith_api.api.models.api.v1.datasets.runs.SessionFeedbackDelta
import java.util.Optional
import java.util.function.Consumer

interface RunService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService

    /**
     * Fetch examples for a dataset, and fetch the runs for each example if they are associated with
     * the given session_ids.
     */
    fun create(datasetId: String, params: RunCreateParams): Optional<RunCreateResponse> =
        create(datasetId, params, RequestOptions.none())

    /** @see create */
    fun create(
        datasetId: String,
        params: RunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Optional<RunCreateResponse> =
        create(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see create */
    fun create(params: RunCreateParams): Optional<RunCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Optional<RunCreateResponse>

    /**
     * Fetch the number of regressions/improvements for each example in a dataset, between
     * sessions[0] and sessions[1].
     */
    fun delta(datasetId: String, params: RunDeltaParams): SessionFeedbackDelta =
        delta(datasetId, params, RequestOptions.none())

    /** @see delta */
    fun delta(
        datasetId: String,
        params: RunDeltaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionFeedbackDelta = delta(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see delta */
    fun delta(params: RunDeltaParams): SessionFeedbackDelta = delta(params, RequestOptions.none())

    /** @see delta */
    fun delta(
        params: RunDeltaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionFeedbackDelta

    /** A view of [RunService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/datasets/{dataset_id}/runs`, but is
         * otherwise the same as [RunService.create].
         */
        @MustBeClosed
        fun create(
            datasetId: String,
            params: RunCreateParams,
        ): HttpResponseFor<Optional<RunCreateResponse>> =
            create(datasetId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            datasetId: String,
            params: RunCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Optional<RunCreateResponse>> =
            create(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: RunCreateParams): HttpResponseFor<Optional<RunCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RunCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Optional<RunCreateResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/datasets/{dataset_id}/runs/delta`, but is
         * otherwise the same as [RunService.delta].
         */
        @MustBeClosed
        fun delta(
            datasetId: String,
            params: RunDeltaParams,
        ): HttpResponseFor<SessionFeedbackDelta> = delta(datasetId, params, RequestOptions.none())

        /** @see delta */
        @MustBeClosed
        fun delta(
            datasetId: String,
            params: RunDeltaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionFeedbackDelta> =
            delta(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see delta */
        @MustBeClosed
        fun delta(params: RunDeltaParams): HttpResponseFor<SessionFeedbackDelta> =
            delta(params, RequestOptions.none())

        /** @see delta */
        @MustBeClosed
        fun delta(
            params: RunDeltaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionFeedbackDelta>
    }
}

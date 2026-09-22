// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.charts.ChartPreviewParams
import com.langchain.smith.models.charts.ChartPreviewResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ChartServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChartServiceAsync

    /** Get a preview for a chart without actually creating it. */
    fun preview(params: ChartPreviewParams): CompletableFuture<ChartPreviewResponse> =
        preview(params, RequestOptions.none())

    /** @see preview */
    fun preview(
        params: ChartPreviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChartPreviewResponse>

    /** A view of [ChartServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChartServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/charts/preview`, but is otherwise the same
         * as [ChartServiceAsync.preview].
         */
        fun preview(
            params: ChartPreviewParams
        ): CompletableFuture<HttpResponseFor<ChartPreviewResponse>> =
            preview(params, RequestOptions.none())

        /** @see preview */
        fun preview(
            params: ChartPreviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChartPreviewResponse>>
    }
}

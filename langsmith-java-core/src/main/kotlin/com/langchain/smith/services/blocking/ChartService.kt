// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.charts.ChartPreviewParams
import com.langchain.smith.models.charts.ChartPreviewResponse
import java.util.function.Consumer

interface ChartService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChartService

    /** Get a preview for a chart without actually creating it. */
    fun preview(params: ChartPreviewParams): ChartPreviewResponse =
        preview(params, RequestOptions.none())

    /** @see preview */
    fun preview(
        params: ChartPreviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChartPreviewResponse

    /** A view of [ChartService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChartService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/charts/preview`, but is otherwise the same
         * as [ChartService.preview].
         */
        @MustBeClosed
        fun preview(params: ChartPreviewParams): HttpResponseFor<ChartPreviewResponse> =
            preview(params, RequestOptions.none())

        /** @see preview */
        @MustBeClosed
        fun preview(
            params: ChartPreviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChartPreviewResponse>
    }
}

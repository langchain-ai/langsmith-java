// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.charts.ChartCreateParams
import com.langsmith_api.api.models.api.v1.charts.ChartDeleteParams
import com.langsmith_api.api.models.api.v1.charts.ChartDeleteResponse
import com.langsmith_api.api.models.api.v1.charts.ChartPreviewParams
import com.langsmith_api.api.models.api.v1.charts.ChartUpdateParams
import com.langsmith_api.api.models.api.v1.charts.CustomChartCreate
import com.langsmith_api.api.models.api.v1.charts.CustomChartPreviewRequest
import com.langsmith_api.api.models.api.v1.charts.CustomChartResponse
import com.langsmith_api.api.models.api.v1.charts.SingleCustomChartResponseBase
import com.langsmith_api.api.services.async.api.v1.charts.SectionServiceAsync
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

    fun section(): SectionServiceAsync

    /** Create a new chart. */
    fun create(params: ChartCreateParams): CompletableFuture<CustomChartResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ChartCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomChartResponse>

    /** @see create */
    fun create(
        customChartCreate: CustomChartCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomChartResponse> =
        create(
            ChartCreateParams.builder().customChartCreate(customChartCreate).build(),
            requestOptions,
        )

    /** @see create */
    fun create(customChartCreate: CustomChartCreate): CompletableFuture<CustomChartResponse> =
        create(customChartCreate, RequestOptions.none())

    /** Update a chart. */
    fun update(chartId: String, params: ChartUpdateParams): CompletableFuture<CustomChartResponse> =
        update(chartId, params, RequestOptions.none())

    /** @see update */
    fun update(
        chartId: String,
        params: ChartUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomChartResponse> =
        update(params.toBuilder().chartId(chartId).build(), requestOptions)

    /** @see update */
    fun update(params: ChartUpdateParams): CompletableFuture<CustomChartResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ChartUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomChartResponse>

    /** Delete a chart. */
    fun delete(chartId: String): CompletableFuture<ChartDeleteResponse> =
        delete(chartId, ChartDeleteParams.none())

    /** @see delete */
    fun delete(
        chartId: String,
        params: ChartDeleteParams = ChartDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChartDeleteResponse> =
        delete(params.toBuilder().chartId(chartId).build(), requestOptions)

    /** @see delete */
    fun delete(
        chartId: String,
        params: ChartDeleteParams = ChartDeleteParams.none(),
    ): CompletableFuture<ChartDeleteResponse> = delete(chartId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ChartDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChartDeleteResponse>

    /** @see delete */
    fun delete(params: ChartDeleteParams): CompletableFuture<ChartDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        chartId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChartDeleteResponse> =
        delete(chartId, ChartDeleteParams.none(), requestOptions)

    /** Get a preview for a chart without actually creating it. */
    fun preview(params: ChartPreviewParams): CompletableFuture<SingleCustomChartResponseBase> =
        preview(params, RequestOptions.none())

    /** @see preview */
    fun preview(
        params: ChartPreviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SingleCustomChartResponseBase>

    /** @see preview */
    fun preview(
        customChartPreviewRequest: CustomChartPreviewRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SingleCustomChartResponseBase> =
        preview(
            ChartPreviewParams.builder()
                .customChartPreviewRequest(customChartPreviewRequest)
                .build(),
            requestOptions,
        )

    /** @see preview */
    fun preview(
        customChartPreviewRequest: CustomChartPreviewRequest
    ): CompletableFuture<SingleCustomChartResponseBase> =
        preview(customChartPreviewRequest, RequestOptions.none())

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

        fun section(): SectionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/charts/create`, but is otherwise the same
         * as [ChartServiceAsync.create].
         */
        fun create(
            params: ChartCreateParams
        ): CompletableFuture<HttpResponseFor<CustomChartResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ChartCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomChartResponse>>

        /** @see create */
        fun create(
            customChartCreate: CustomChartCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomChartResponse>> =
            create(
                ChartCreateParams.builder().customChartCreate(customChartCreate).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            customChartCreate: CustomChartCreate
        ): CompletableFuture<HttpResponseFor<CustomChartResponse>> =
            create(customChartCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /api/v1/charts/{chart_id}`, but is otherwise the
         * same as [ChartServiceAsync.update].
         */
        fun update(
            chartId: String,
            params: ChartUpdateParams,
        ): CompletableFuture<HttpResponseFor<CustomChartResponse>> =
            update(chartId, params, RequestOptions.none())

        /** @see update */
        fun update(
            chartId: String,
            params: ChartUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomChartResponse>> =
            update(params.toBuilder().chartId(chartId).build(), requestOptions)

        /** @see update */
        fun update(
            params: ChartUpdateParams
        ): CompletableFuture<HttpResponseFor<CustomChartResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ChartUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomChartResponse>>

        /**
         * Returns a raw HTTP response for `delete /api/v1/charts/{chart_id}`, but is otherwise the
         * same as [ChartServiceAsync.delete].
         */
        fun delete(chartId: String): CompletableFuture<HttpResponseFor<ChartDeleteResponse>> =
            delete(chartId, ChartDeleteParams.none())

        /** @see delete */
        fun delete(
            chartId: String,
            params: ChartDeleteParams = ChartDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChartDeleteResponse>> =
            delete(params.toBuilder().chartId(chartId).build(), requestOptions)

        /** @see delete */
        fun delete(
            chartId: String,
            params: ChartDeleteParams = ChartDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<ChartDeleteResponse>> =
            delete(chartId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ChartDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChartDeleteResponse>>

        /** @see delete */
        fun delete(
            params: ChartDeleteParams
        ): CompletableFuture<HttpResponseFor<ChartDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            chartId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChartDeleteResponse>> =
            delete(chartId, ChartDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/charts/preview`, but is otherwise the same
         * as [ChartServiceAsync.preview].
         */
        fun preview(
            params: ChartPreviewParams
        ): CompletableFuture<HttpResponseFor<SingleCustomChartResponseBase>> =
            preview(params, RequestOptions.none())

        /** @see preview */
        fun preview(
            params: ChartPreviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SingleCustomChartResponseBase>>

        /** @see preview */
        fun preview(
            customChartPreviewRequest: CustomChartPreviewRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SingleCustomChartResponseBase>> =
            preview(
                ChartPreviewParams.builder()
                    .customChartPreviewRequest(customChartPreviewRequest)
                    .build(),
                requestOptions,
            )

        /** @see preview */
        fun preview(
            customChartPreviewRequest: CustomChartPreviewRequest
        ): CompletableFuture<HttpResponseFor<SingleCustomChartResponseBase>> =
            preview(customChartPreviewRequest, RequestOptions.none())
    }
}

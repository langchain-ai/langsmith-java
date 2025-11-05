// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.charts.ChartCreateParams
import com.langchain.smith.models.charts.ChartDeleteParams
import com.langchain.smith.models.charts.ChartDeleteResponse
import com.langchain.smith.models.charts.ChartListParams
import com.langchain.smith.models.charts.ChartPreviewParams
import com.langchain.smith.models.charts.ChartRetrieveParams
import com.langchain.smith.models.charts.ChartUpdateParams
import com.langchain.smith.models.charts.CustomChartCreate
import com.langchain.smith.models.charts.CustomChartPreviewRequest
import com.langchain.smith.models.charts.CustomChartResponse
import com.langchain.smith.models.charts.CustomChartsRequest
import com.langchain.smith.models.charts.CustomChartsResponse
import com.langchain.smith.models.charts.SingleCustomChartResponse
import com.langchain.smith.models.charts.SingleCustomChartResponseBase
import com.langchain.smith.services.blocking.charts.SectionService
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

    fun section(): SectionService

    /** Create a new chart. */
    fun create(params: ChartCreateParams): CustomChartResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ChartCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomChartResponse

    /** @see create */
    fun create(
        customChartCreate: CustomChartCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomChartResponse =
        create(
            ChartCreateParams.builder().customChartCreate(customChartCreate).build(),
            requestOptions,
        )

    /** @see create */
    fun create(customChartCreate: CustomChartCreate): CustomChartResponse =
        create(customChartCreate, RequestOptions.none())

    /** Get a single chart by ID. */
    fun retrieve(chartId: String, params: ChartRetrieveParams): SingleCustomChartResponse =
        retrieve(chartId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        chartId: String,
        params: ChartRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SingleCustomChartResponse =
        retrieve(params.toBuilder().chartId(chartId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: ChartRetrieveParams): SingleCustomChartResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ChartRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SingleCustomChartResponse

    /** Update a chart. */
    fun update(chartId: String, params: ChartUpdateParams): CustomChartResponse =
        update(chartId, params, RequestOptions.none())

    /** @see update */
    fun update(
        chartId: String,
        params: ChartUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomChartResponse = update(params.toBuilder().chartId(chartId).build(), requestOptions)

    /** @see update */
    fun update(params: ChartUpdateParams): CustomChartResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ChartUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomChartResponse

    /** Get all charts for the tenant. */
    fun list(params: ChartListParams): CustomChartsResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ChartListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomChartsResponse

    /** @see list */
    fun list(
        customChartsRequest: CustomChartsRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomChartsResponse =
        list(
            ChartListParams.builder().customChartsRequest(customChartsRequest).build(),
            requestOptions,
        )

    /** @see list */
    fun list(customChartsRequest: CustomChartsRequest): CustomChartsResponse =
        list(customChartsRequest, RequestOptions.none())

    /** Delete a chart. */
    fun delete(chartId: String): ChartDeleteResponse = delete(chartId, ChartDeleteParams.none())

    /** @see delete */
    fun delete(
        chartId: String,
        params: ChartDeleteParams = ChartDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChartDeleteResponse = delete(params.toBuilder().chartId(chartId).build(), requestOptions)

    /** @see delete */
    fun delete(
        chartId: String,
        params: ChartDeleteParams = ChartDeleteParams.none(),
    ): ChartDeleteResponse = delete(chartId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ChartDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChartDeleteResponse

    /** @see delete */
    fun delete(params: ChartDeleteParams): ChartDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(chartId: String, requestOptions: RequestOptions): ChartDeleteResponse =
        delete(chartId, ChartDeleteParams.none(), requestOptions)

    /** Get a preview for a chart without actually creating it. */
    fun preview(params: ChartPreviewParams): SingleCustomChartResponseBase =
        preview(params, RequestOptions.none())

    /** @see preview */
    fun preview(
        params: ChartPreviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SingleCustomChartResponseBase

    /** @see preview */
    fun preview(
        customChartPreviewRequest: CustomChartPreviewRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SingleCustomChartResponseBase =
        preview(
            ChartPreviewParams.builder()
                .customChartPreviewRequest(customChartPreviewRequest)
                .build(),
            requestOptions,
        )

    /** @see preview */
    fun preview(
        customChartPreviewRequest: CustomChartPreviewRequest
    ): SingleCustomChartResponseBase = preview(customChartPreviewRequest, RequestOptions.none())

    /** A view of [ChartService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChartService.WithRawResponse

        fun section(): SectionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/charts/create`, but is otherwise the same
         * as [ChartService.create].
         */
        @MustBeClosed
        fun create(params: ChartCreateParams): HttpResponseFor<CustomChartResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ChartCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomChartResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            customChartCreate: CustomChartCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomChartResponse> =
            create(
                ChartCreateParams.builder().customChartCreate(customChartCreate).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(customChartCreate: CustomChartCreate): HttpResponseFor<CustomChartResponse> =
            create(customChartCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /api/v1/charts/{chart_id}`, but is otherwise the
         * same as [ChartService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            chartId: String,
            params: ChartRetrieveParams,
        ): HttpResponseFor<SingleCustomChartResponse> =
            retrieve(chartId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            chartId: String,
            params: ChartRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SingleCustomChartResponse> =
            retrieve(params.toBuilder().chartId(chartId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ChartRetrieveParams): HttpResponseFor<SingleCustomChartResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ChartRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SingleCustomChartResponse>

        /**
         * Returns a raw HTTP response for `patch /api/v1/charts/{chart_id}`, but is otherwise the
         * same as [ChartService.update].
         */
        @MustBeClosed
        fun update(
            chartId: String,
            params: ChartUpdateParams,
        ): HttpResponseFor<CustomChartResponse> = update(chartId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            chartId: String,
            params: ChartUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomChartResponse> =
            update(params.toBuilder().chartId(chartId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ChartUpdateParams): HttpResponseFor<CustomChartResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ChartUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomChartResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/charts`, but is otherwise the same as
         * [ChartService.list].
         */
        @MustBeClosed
        fun list(params: ChartListParams): HttpResponseFor<CustomChartsResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ChartListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomChartsResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            customChartsRequest: CustomChartsRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomChartsResponse> =
            list(
                ChartListParams.builder().customChartsRequest(customChartsRequest).build(),
                requestOptions,
            )

        /** @see list */
        @MustBeClosed
        fun list(customChartsRequest: CustomChartsRequest): HttpResponseFor<CustomChartsResponse> =
            list(customChartsRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `delete /api/v1/charts/{chart_id}`, but is otherwise the
         * same as [ChartService.delete].
         */
        @MustBeClosed
        fun delete(chartId: String): HttpResponseFor<ChartDeleteResponse> =
            delete(chartId, ChartDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            chartId: String,
            params: ChartDeleteParams = ChartDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChartDeleteResponse> =
            delete(params.toBuilder().chartId(chartId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            chartId: String,
            params: ChartDeleteParams = ChartDeleteParams.none(),
        ): HttpResponseFor<ChartDeleteResponse> = delete(chartId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ChartDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChartDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: ChartDeleteParams): HttpResponseFor<ChartDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            chartId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChartDeleteResponse> =
            delete(chartId, ChartDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/charts/preview`, but is otherwise the same
         * as [ChartService.preview].
         */
        @MustBeClosed
        fun preview(params: ChartPreviewParams): HttpResponseFor<SingleCustomChartResponseBase> =
            preview(params, RequestOptions.none())

        /** @see preview */
        @MustBeClosed
        fun preview(
            params: ChartPreviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SingleCustomChartResponseBase>

        /** @see preview */
        @MustBeClosed
        fun preview(
            customChartPreviewRequest: CustomChartPreviewRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SingleCustomChartResponseBase> =
            preview(
                ChartPreviewParams.builder()
                    .customChartPreviewRequest(customChartPreviewRequest)
                    .build(),
                requestOptions,
            )

        /** @see preview */
        @MustBeClosed
        fun preview(
            customChartPreviewRequest: CustomChartPreviewRequest
        ): HttpResponseFor<SingleCustomChartResponseBase> =
            preview(customChartPreviewRequest, RequestOptions.none())
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.charts.CustomChartCreate
import com.langchain.smith.models.charts.CustomChartPreviewRequest
import com.langchain.smith.models.charts.CustomChartResponse
import com.langchain.smith.models.charts.CustomChartsRequest
import com.langchain.smith.models.charts.CustomChartsResponse
import com.langchain.smith.models.charts.SingleCustomChartResponse
import com.langchain.smith.models.charts.SingleCustomChartResponseBase
import com.langchain.smith.models.orgcharts.OrgChartCreateParams
import com.langchain.smith.models.orgcharts.OrgChartDeleteParams
import com.langchain.smith.models.orgcharts.OrgChartDeleteResponse
import com.langchain.smith.models.orgcharts.OrgChartOrgChartsParams
import com.langchain.smith.models.orgcharts.OrgChartPreviewParams
import com.langchain.smith.models.orgcharts.OrgChartRetrieveParams
import com.langchain.smith.models.orgcharts.OrgChartUpdateParams
import com.langchain.smith.services.blocking.orgcharts.SectionService
import java.util.function.Consumer

interface OrgChartService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrgChartService

    fun section(): SectionService

    /** Create a new chart. */
    fun create(params: OrgChartCreateParams): CustomChartResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: OrgChartCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomChartResponse

    /** @see create */
    fun create(
        customChartCreate: CustomChartCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomChartResponse =
        create(
            OrgChartCreateParams.builder().customChartCreate(customChartCreate).build(),
            requestOptions,
        )

    /** @see create */
    fun create(customChartCreate: CustomChartCreate): CustomChartResponse =
        create(customChartCreate, RequestOptions.none())

    /** Get a single chart by ID. */
    fun retrieve(chartId: String, params: OrgChartRetrieveParams): SingleCustomChartResponse =
        retrieve(chartId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        chartId: String,
        params: OrgChartRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SingleCustomChartResponse =
        retrieve(params.toBuilder().chartId(chartId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: OrgChartRetrieveParams): SingleCustomChartResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: OrgChartRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SingleCustomChartResponse

    /** Update a chart. */
    fun update(chartId: String, params: OrgChartUpdateParams): CustomChartResponse =
        update(chartId, params, RequestOptions.none())

    /** @see update */
    fun update(
        chartId: String,
        params: OrgChartUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomChartResponse = update(params.toBuilder().chartId(chartId).build(), requestOptions)

    /** @see update */
    fun update(params: OrgChartUpdateParams): CustomChartResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: OrgChartUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomChartResponse

    /** Delete a chart. */
    fun delete(chartId: String): OrgChartDeleteResponse =
        delete(chartId, OrgChartDeleteParams.none())

    /** @see delete */
    fun delete(
        chartId: String,
        params: OrgChartDeleteParams = OrgChartDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrgChartDeleteResponse = delete(params.toBuilder().chartId(chartId).build(), requestOptions)

    /** @see delete */
    fun delete(
        chartId: String,
        params: OrgChartDeleteParams = OrgChartDeleteParams.none(),
    ): OrgChartDeleteResponse = delete(chartId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: OrgChartDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrgChartDeleteResponse

    /** @see delete */
    fun delete(params: OrgChartDeleteParams): OrgChartDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(chartId: String, requestOptions: RequestOptions): OrgChartDeleteResponse =
        delete(chartId, OrgChartDeleteParams.none(), requestOptions)

    /** Get all charts for the tenant. */
    fun orgCharts(params: OrgChartOrgChartsParams): CustomChartsResponse =
        orgCharts(params, RequestOptions.none())

    /** @see orgCharts */
    fun orgCharts(
        params: OrgChartOrgChartsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomChartsResponse

    /** @see orgCharts */
    fun orgCharts(
        customChartsRequest: CustomChartsRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomChartsResponse =
        orgCharts(
            OrgChartOrgChartsParams.builder().customChartsRequest(customChartsRequest).build(),
            requestOptions,
        )

    /** @see orgCharts */
    fun orgCharts(customChartsRequest: CustomChartsRequest): CustomChartsResponse =
        orgCharts(customChartsRequest, RequestOptions.none())

    /** Get a preview for a chart without actually creating it. */
    fun preview(params: OrgChartPreviewParams): SingleCustomChartResponseBase =
        preview(params, RequestOptions.none())

    /** @see preview */
    fun preview(
        params: OrgChartPreviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SingleCustomChartResponseBase

    /** @see preview */
    fun preview(
        customChartPreviewRequest: CustomChartPreviewRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SingleCustomChartResponseBase =
        preview(
            OrgChartPreviewParams.builder()
                .customChartPreviewRequest(customChartPreviewRequest)
                .build(),
            requestOptions,
        )

    /** @see preview */
    fun preview(
        customChartPreviewRequest: CustomChartPreviewRequest
    ): SingleCustomChartResponseBase = preview(customChartPreviewRequest, RequestOptions.none())

    /** A view of [OrgChartService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrgChartService.WithRawResponse

        fun section(): SectionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/org-charts/create`, but is otherwise the
         * same as [OrgChartService.create].
         */
        @MustBeClosed
        fun create(params: OrgChartCreateParams): HttpResponseFor<CustomChartResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: OrgChartCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomChartResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            customChartCreate: CustomChartCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomChartResponse> =
            create(
                OrgChartCreateParams.builder().customChartCreate(customChartCreate).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(customChartCreate: CustomChartCreate): HttpResponseFor<CustomChartResponse> =
            create(customChartCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /api/v1/org-charts/{chart_id}`, but is otherwise
         * the same as [OrgChartService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            chartId: String,
            params: OrgChartRetrieveParams,
        ): HttpResponseFor<SingleCustomChartResponse> =
            retrieve(chartId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            chartId: String,
            params: OrgChartRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SingleCustomChartResponse> =
            retrieve(params.toBuilder().chartId(chartId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: OrgChartRetrieveParams): HttpResponseFor<SingleCustomChartResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: OrgChartRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SingleCustomChartResponse>

        /**
         * Returns a raw HTTP response for `patch /api/v1/org-charts/{chart_id}`, but is otherwise
         * the same as [OrgChartService.update].
         */
        @MustBeClosed
        fun update(
            chartId: String,
            params: OrgChartUpdateParams,
        ): HttpResponseFor<CustomChartResponse> = update(chartId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            chartId: String,
            params: OrgChartUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomChartResponse> =
            update(params.toBuilder().chartId(chartId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: OrgChartUpdateParams): HttpResponseFor<CustomChartResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: OrgChartUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomChartResponse>

        /**
         * Returns a raw HTTP response for `delete /api/v1/org-charts/{chart_id}`, but is otherwise
         * the same as [OrgChartService.delete].
         */
        @MustBeClosed
        fun delete(chartId: String): HttpResponseFor<OrgChartDeleteResponse> =
            delete(chartId, OrgChartDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            chartId: String,
            params: OrgChartDeleteParams = OrgChartDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrgChartDeleteResponse> =
            delete(params.toBuilder().chartId(chartId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            chartId: String,
            params: OrgChartDeleteParams = OrgChartDeleteParams.none(),
        ): HttpResponseFor<OrgChartDeleteResponse> = delete(chartId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: OrgChartDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrgChartDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: OrgChartDeleteParams): HttpResponseFor<OrgChartDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            chartId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrgChartDeleteResponse> =
            delete(chartId, OrgChartDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/org-charts`, but is otherwise the same as
         * [OrgChartService.orgCharts].
         */
        @MustBeClosed
        fun orgCharts(params: OrgChartOrgChartsParams): HttpResponseFor<CustomChartsResponse> =
            orgCharts(params, RequestOptions.none())

        /** @see orgCharts */
        @MustBeClosed
        fun orgCharts(
            params: OrgChartOrgChartsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomChartsResponse>

        /** @see orgCharts */
        @MustBeClosed
        fun orgCharts(
            customChartsRequest: CustomChartsRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomChartsResponse> =
            orgCharts(
                OrgChartOrgChartsParams.builder().customChartsRequest(customChartsRequest).build(),
                requestOptions,
            )

        /** @see orgCharts */
        @MustBeClosed
        fun orgCharts(
            customChartsRequest: CustomChartsRequest
        ): HttpResponseFor<CustomChartsResponse> =
            orgCharts(customChartsRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /api/v1/org-charts/preview`, but is otherwise the
         * same as [OrgChartService.preview].
         */
        @MustBeClosed
        fun preview(params: OrgChartPreviewParams): HttpResponseFor<SingleCustomChartResponseBase> =
            preview(params, RequestOptions.none())

        /** @see preview */
        @MustBeClosed
        fun preview(
            params: OrgChartPreviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SingleCustomChartResponseBase>

        /** @see preview */
        @MustBeClosed
        fun preview(
            customChartPreviewRequest: CustomChartPreviewRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SingleCustomChartResponseBase> =
            preview(
                OrgChartPreviewParams.builder()
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

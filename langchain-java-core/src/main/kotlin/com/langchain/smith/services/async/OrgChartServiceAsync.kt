// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

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
import com.langchain.smith.services.async.orgcharts.SectionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OrgChartServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrgChartServiceAsync

    fun section(): SectionServiceAsync

    /** Create a new chart. */
    fun create(params: OrgChartCreateParams): CompletableFuture<CustomChartResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: OrgChartCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomChartResponse>

    /** @see create */
    fun create(
        customChartCreate: CustomChartCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomChartResponse> =
        create(
            OrgChartCreateParams.builder().customChartCreate(customChartCreate).build(),
            requestOptions,
        )

    /** @see create */
    fun create(customChartCreate: CustomChartCreate): CompletableFuture<CustomChartResponse> =
        create(customChartCreate, RequestOptions.none())

    /** Get a single chart by ID. */
    fun retrieve(
        chartId: String,
        params: OrgChartRetrieveParams,
    ): CompletableFuture<SingleCustomChartResponse> =
        retrieve(chartId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        chartId: String,
        params: OrgChartRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SingleCustomChartResponse> =
        retrieve(params.toBuilder().chartId(chartId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: OrgChartRetrieveParams): CompletableFuture<SingleCustomChartResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: OrgChartRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SingleCustomChartResponse>

    /** Update a chart. */
    fun update(
        chartId: String,
        params: OrgChartUpdateParams,
    ): CompletableFuture<CustomChartResponse> = update(chartId, params, RequestOptions.none())

    /** @see update */
    fun update(
        chartId: String,
        params: OrgChartUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomChartResponse> =
        update(params.toBuilder().chartId(chartId).build(), requestOptions)

    /** @see update */
    fun update(params: OrgChartUpdateParams): CompletableFuture<CustomChartResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: OrgChartUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomChartResponse>

    /** Delete a chart. */
    fun delete(chartId: String): CompletableFuture<OrgChartDeleteResponse> =
        delete(chartId, OrgChartDeleteParams.none())

    /** @see delete */
    fun delete(
        chartId: String,
        params: OrgChartDeleteParams = OrgChartDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrgChartDeleteResponse> =
        delete(params.toBuilder().chartId(chartId).build(), requestOptions)

    /** @see delete */
    fun delete(
        chartId: String,
        params: OrgChartDeleteParams = OrgChartDeleteParams.none(),
    ): CompletableFuture<OrgChartDeleteResponse> = delete(chartId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: OrgChartDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrgChartDeleteResponse>

    /** @see delete */
    fun delete(params: OrgChartDeleteParams): CompletableFuture<OrgChartDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        chartId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<OrgChartDeleteResponse> =
        delete(chartId, OrgChartDeleteParams.none(), requestOptions)

    /** Get all charts for the tenant. */
    fun orgCharts(params: OrgChartOrgChartsParams): CompletableFuture<CustomChartsResponse> =
        orgCharts(params, RequestOptions.none())

    /** @see orgCharts */
    fun orgCharts(
        params: OrgChartOrgChartsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomChartsResponse>

    /** @see orgCharts */
    fun orgCharts(
        customChartsRequest: CustomChartsRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomChartsResponse> =
        orgCharts(
            OrgChartOrgChartsParams.builder().customChartsRequest(customChartsRequest).build(),
            requestOptions,
        )

    /** @see orgCharts */
    fun orgCharts(
        customChartsRequest: CustomChartsRequest
    ): CompletableFuture<CustomChartsResponse> =
        orgCharts(customChartsRequest, RequestOptions.none())

    /** Get a preview for a chart without actually creating it. */
    fun preview(params: OrgChartPreviewParams): CompletableFuture<SingleCustomChartResponseBase> =
        preview(params, RequestOptions.none())

    /** @see preview */
    fun preview(
        params: OrgChartPreviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SingleCustomChartResponseBase>

    /** @see preview */
    fun preview(
        customChartPreviewRequest: CustomChartPreviewRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SingleCustomChartResponseBase> =
        preview(
            OrgChartPreviewParams.builder()
                .customChartPreviewRequest(customChartPreviewRequest)
                .build(),
            requestOptions,
        )

    /** @see preview */
    fun preview(
        customChartPreviewRequest: CustomChartPreviewRequest
    ): CompletableFuture<SingleCustomChartResponseBase> =
        preview(customChartPreviewRequest, RequestOptions.none())

    /**
     * A view of [OrgChartServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OrgChartServiceAsync.WithRawResponse

        fun section(): SectionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/org-charts/create`, but is otherwise the
         * same as [OrgChartServiceAsync.create].
         */
        fun create(
            params: OrgChartCreateParams
        ): CompletableFuture<HttpResponseFor<CustomChartResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: OrgChartCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomChartResponse>>

        /** @see create */
        fun create(
            customChartCreate: CustomChartCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomChartResponse>> =
            create(
                OrgChartCreateParams.builder().customChartCreate(customChartCreate).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            customChartCreate: CustomChartCreate
        ): CompletableFuture<HttpResponseFor<CustomChartResponse>> =
            create(customChartCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /api/v1/org-charts/{chart_id}`, but is otherwise
         * the same as [OrgChartServiceAsync.retrieve].
         */
        fun retrieve(
            chartId: String,
            params: OrgChartRetrieveParams,
        ): CompletableFuture<HttpResponseFor<SingleCustomChartResponse>> =
            retrieve(chartId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            chartId: String,
            params: OrgChartRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SingleCustomChartResponse>> =
            retrieve(params.toBuilder().chartId(chartId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: OrgChartRetrieveParams
        ): CompletableFuture<HttpResponseFor<SingleCustomChartResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: OrgChartRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SingleCustomChartResponse>>

        /**
         * Returns a raw HTTP response for `patch /api/v1/org-charts/{chart_id}`, but is otherwise
         * the same as [OrgChartServiceAsync.update].
         */
        fun update(
            chartId: String,
            params: OrgChartUpdateParams,
        ): CompletableFuture<HttpResponseFor<CustomChartResponse>> =
            update(chartId, params, RequestOptions.none())

        /** @see update */
        fun update(
            chartId: String,
            params: OrgChartUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomChartResponse>> =
            update(params.toBuilder().chartId(chartId).build(), requestOptions)

        /** @see update */
        fun update(
            params: OrgChartUpdateParams
        ): CompletableFuture<HttpResponseFor<CustomChartResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: OrgChartUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomChartResponse>>

        /**
         * Returns a raw HTTP response for `delete /api/v1/org-charts/{chart_id}`, but is otherwise
         * the same as [OrgChartServiceAsync.delete].
         */
        fun delete(chartId: String): CompletableFuture<HttpResponseFor<OrgChartDeleteResponse>> =
            delete(chartId, OrgChartDeleteParams.none())

        /** @see delete */
        fun delete(
            chartId: String,
            params: OrgChartDeleteParams = OrgChartDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrgChartDeleteResponse>> =
            delete(params.toBuilder().chartId(chartId).build(), requestOptions)

        /** @see delete */
        fun delete(
            chartId: String,
            params: OrgChartDeleteParams = OrgChartDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<OrgChartDeleteResponse>> =
            delete(chartId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: OrgChartDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrgChartDeleteResponse>>

        /** @see delete */
        fun delete(
            params: OrgChartDeleteParams
        ): CompletableFuture<HttpResponseFor<OrgChartDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            chartId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrgChartDeleteResponse>> =
            delete(chartId, OrgChartDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/org-charts`, but is otherwise the same as
         * [OrgChartServiceAsync.orgCharts].
         */
        fun orgCharts(
            params: OrgChartOrgChartsParams
        ): CompletableFuture<HttpResponseFor<CustomChartsResponse>> =
            orgCharts(params, RequestOptions.none())

        /** @see orgCharts */
        fun orgCharts(
            params: OrgChartOrgChartsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomChartsResponse>>

        /** @see orgCharts */
        fun orgCharts(
            customChartsRequest: CustomChartsRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomChartsResponse>> =
            orgCharts(
                OrgChartOrgChartsParams.builder().customChartsRequest(customChartsRequest).build(),
                requestOptions,
            )

        /** @see orgCharts */
        fun orgCharts(
            customChartsRequest: CustomChartsRequest
        ): CompletableFuture<HttpResponseFor<CustomChartsResponse>> =
            orgCharts(customChartsRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /api/v1/org-charts/preview`, but is otherwise the
         * same as [OrgChartServiceAsync.preview].
         */
        fun preview(
            params: OrgChartPreviewParams
        ): CompletableFuture<HttpResponseFor<SingleCustomChartResponseBase>> =
            preview(params, RequestOptions.none())

        /** @see preview */
        fun preview(
            params: OrgChartPreviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SingleCustomChartResponseBase>>

        /** @see preview */
        fun preview(
            customChartPreviewRequest: CustomChartPreviewRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SingleCustomChartResponseBase>> =
            preview(
                OrgChartPreviewParams.builder()
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

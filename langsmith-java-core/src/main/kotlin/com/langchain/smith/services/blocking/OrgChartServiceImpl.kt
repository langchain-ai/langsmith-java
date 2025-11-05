// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.handlers.errorBodyHandler
import com.langchain.smith.core.handlers.errorHandler
import com.langchain.smith.core.handlers.jsonHandler
import com.langchain.smith.core.http.HttpMethod
import com.langchain.smith.core.http.HttpRequest
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponse.Handler
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.core.http.json
import com.langchain.smith.core.http.parseable
import com.langchain.smith.core.prepare
import com.langchain.smith.models.charts.CustomChartResponse
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
import com.langchain.smith.services.blocking.orgcharts.SectionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OrgChartServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OrgChartService {

    private val withRawResponse: OrgChartService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val section: SectionService by lazy { SectionServiceImpl(clientOptions) }

    override fun withRawResponse(): OrgChartService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrgChartService =
        OrgChartServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun section(): SectionService = section

    override fun create(
        params: OrgChartCreateParams,
        requestOptions: RequestOptions,
    ): CustomChartResponse =
        // post /api/v1/org-charts/create
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: OrgChartRetrieveParams,
        requestOptions: RequestOptions,
    ): SingleCustomChartResponse =
        // post /api/v1/org-charts/{chart_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: OrgChartUpdateParams,
        requestOptions: RequestOptions,
    ): CustomChartResponse =
        // patch /api/v1/org-charts/{chart_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(
        params: OrgChartDeleteParams,
        requestOptions: RequestOptions,
    ): OrgChartDeleteResponse =
        // delete /api/v1/org-charts/{chart_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun orgCharts(
        params: OrgChartOrgChartsParams,
        requestOptions: RequestOptions,
    ): CustomChartsResponse =
        // post /api/v1/org-charts
        withRawResponse().orgCharts(params, requestOptions).parse()

    override fun preview(
        params: OrgChartPreviewParams,
        requestOptions: RequestOptions,
    ): SingleCustomChartResponseBase =
        // post /api/v1/org-charts/preview
        withRawResponse().preview(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OrgChartService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val section: SectionService.WithRawResponse by lazy {
            SectionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OrgChartService.WithRawResponse =
            OrgChartServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun section(): SectionService.WithRawResponse = section

        private val createHandler: Handler<CustomChartResponse> =
            jsonHandler<CustomChartResponse>(clientOptions.jsonMapper)

        override fun create(
            params: OrgChartCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomChartResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "org-charts", "create")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<SingleCustomChartResponse> =
            jsonHandler<SingleCustomChartResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: OrgChartRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SingleCustomChartResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("chartId", params.chartId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "org-charts", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<CustomChartResponse> =
            jsonHandler<CustomChartResponse>(clientOptions.jsonMapper)

        override fun update(
            params: OrgChartUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomChartResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("chartId", params.chartId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "org-charts", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<OrgChartDeleteResponse> =
            jsonHandler<OrgChartDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: OrgChartDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrgChartDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("chartId", params.chartId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "org-charts", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val orgChartsHandler: Handler<CustomChartsResponse> =
            jsonHandler<CustomChartsResponse>(clientOptions.jsonMapper)

        override fun orgCharts(
            params: OrgChartOrgChartsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomChartsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "org-charts")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { orgChartsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val previewHandler: Handler<SingleCustomChartResponseBase> =
            jsonHandler<SingleCustomChartResponseBase>(clientOptions.jsonMapper)

        override fun preview(
            params: OrgChartPreviewParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SingleCustomChartResponseBase> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "org-charts", "preview")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { previewHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}

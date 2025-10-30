// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.orgcharts

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.core.handlers.errorBodyHandler
import com.langsmith_api.api.core.handlers.errorHandler
import com.langsmith_api.api.core.handlers.jsonHandler
import com.langsmith_api.api.core.http.HttpMethod
import com.langsmith_api.api.core.http.HttpRequest
import com.langsmith_api.api.core.http.HttpResponse
import com.langsmith_api.api.core.http.HttpResponse.Handler
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.core.http.json
import com.langsmith_api.api.core.http.parseable
import com.langsmith_api.api.core.prepare
import com.langsmith_api.api.models.api.v1.charts.section.CustomChartsSectionResponse
import com.langsmith_api.api.models.api.v1.orgcharts.section.SectionCreateParams
import com.langsmith_api.api.models.api.v1.orgcharts.section.SectionDeleteParams
import com.langsmith_api.api.models.api.v1.orgcharts.section.SectionDeleteResponse
import com.langsmith_api.api.models.api.v1.orgcharts.section.SectionListParams
import com.langsmith_api.api.models.api.v1.orgcharts.section.SectionUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SectionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SectionService {

    private val withRawResponse: SectionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SectionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SectionService =
        SectionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: SectionCreateParams,
        requestOptions: RequestOptions,
    ): CustomChartsSectionResponse =
        // post /api/v1/org-charts/section
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: SectionUpdateParams,
        requestOptions: RequestOptions,
    ): CustomChartsSectionResponse =
        // patch /api/v1/org-charts/section/{section_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: SectionListParams,
        requestOptions: RequestOptions,
    ): List<CustomChartsSectionResponse> =
        // get /api/v1/org-charts/section
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: SectionDeleteParams,
        requestOptions: RequestOptions,
    ): SectionDeleteResponse =
        // delete /api/v1/org-charts/section/{section_id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SectionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SectionService.WithRawResponse =
            SectionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CustomChartsSectionResponse> =
            jsonHandler<CustomChartsSectionResponse>(clientOptions.jsonMapper)

        override fun create(
            params: SectionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomChartsSectionResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "org-charts", "section")
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

        private val updateHandler: Handler<CustomChartsSectionResponse> =
            jsonHandler<CustomChartsSectionResponse>(clientOptions.jsonMapper)

        override fun update(
            params: SectionUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomChartsSectionResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sectionId", params.sectionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "org-charts", "section", params._pathParam(0))
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

        private val listHandler: Handler<List<CustomChartsSectionResponse>> =
            jsonHandler<List<CustomChartsSectionResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: SectionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<CustomChartsSectionResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "org-charts", "section")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val deleteHandler: Handler<SectionDeleteResponse> =
            jsonHandler<SectionDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: SectionDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SectionDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sectionId", params.sectionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "org-charts", "section", params._pathParam(0))
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
    }
}

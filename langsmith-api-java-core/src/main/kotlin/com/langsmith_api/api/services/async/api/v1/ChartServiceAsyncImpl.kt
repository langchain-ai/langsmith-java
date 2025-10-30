// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

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
import com.langsmith_api.api.core.prepareAsync
import com.langsmith_api.api.models.api.v1.charts.ChartCreateParams
import com.langsmith_api.api.models.api.v1.charts.ChartDeleteParams
import com.langsmith_api.api.models.api.v1.charts.ChartDeleteResponse
import com.langsmith_api.api.models.api.v1.charts.ChartPreviewParams
import com.langsmith_api.api.models.api.v1.charts.ChartUpdateParams
import com.langsmith_api.api.models.api.v1.charts.CustomChartResponse
import com.langsmith_api.api.models.api.v1.charts.SingleCustomChartResponseBase
import com.langsmith_api.api.services.async.api.v1.charts.SectionServiceAsync
import com.langsmith_api.api.services.async.api.v1.charts.SectionServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ChartServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ChartServiceAsync {

    private val withRawResponse: ChartServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val section: SectionServiceAsync by lazy { SectionServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ChartServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChartServiceAsync =
        ChartServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun section(): SectionServiceAsync = section

    override fun create(
        params: ChartCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomChartResponse> =
        // post /api/v1/charts/create
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: ChartUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomChartResponse> =
        // patch /api/v1/charts/{chart_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ChartDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChartDeleteResponse> =
        // delete /api/v1/charts/{chart_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun preview(
        params: ChartPreviewParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SingleCustomChartResponseBase> =
        // post /api/v1/charts/preview
        withRawResponse().preview(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ChartServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val section: SectionServiceAsync.WithRawResponse by lazy {
            SectionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChartServiceAsync.WithRawResponse =
            ChartServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun section(): SectionServiceAsync.WithRawResponse = section

        private val createHandler: Handler<CustomChartResponse> =
            jsonHandler<CustomChartResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ChartCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomChartResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "charts", "create")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<CustomChartResponse> =
            jsonHandler<CustomChartResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ChartUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomChartResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("chartId", params.chartId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "charts", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<ChartDeleteResponse> =
            jsonHandler<ChartDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ChartDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChartDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("chartId", params.chartId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "charts", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val previewHandler: Handler<SingleCustomChartResponseBase> =
            jsonHandler<SingleCustomChartResponseBase>(clientOptions.jsonMapper)

        override fun preview(
            params: ChartPreviewParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SingleCustomChartResponseBase>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "charts", "preview")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}

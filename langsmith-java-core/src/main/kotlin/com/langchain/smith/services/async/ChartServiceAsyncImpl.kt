// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
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
import com.langchain.smith.core.prepareAsync
import com.langchain.smith.models.charts.ChartPreviewParams
import com.langchain.smith.models.charts.ChartPreviewResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class ChartServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ChartServiceAsync {

    private val withRawResponse: ChartServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ChartServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChartServiceAsync =
        ChartServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun preview(
        params: ChartPreviewParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChartPreviewResponse> =
        // post /api/v1/charts/preview
        withRawResponse().preview(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ChartServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChartServiceAsync.WithRawResponse =
            ChartServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val previewHandler: Handler<ChartPreviewResponse> =
            jsonHandler<ChartPreviewResponse>(clientOptions.jsonMapper)

        override fun preview(
            params: ChartPreviewParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChartPreviewResponse>> {
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

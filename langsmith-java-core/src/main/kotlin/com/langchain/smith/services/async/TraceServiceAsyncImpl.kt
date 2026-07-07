// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

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
import com.langchain.smith.core.prepareAsync
import com.langchain.smith.models.traces.TraceListRunsParams
import com.langchain.smith.models.traces.TraceListRunsResponse
import com.langchain.smith.models.traces.TraceQueryPageAsync
import com.langchain.smith.models.traces.TraceQueryPageResponse
import com.langchain.smith.models.traces.TraceQueryParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TraceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TraceServiceAsync {

    private val withRawResponse: TraceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TraceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TraceServiceAsync =
        TraceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun listRuns(
        params: TraceListRunsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TraceListRunsResponse> =
        // get /v2/traces/{trace_id}/runs
        withRawResponse().listRuns(params, requestOptions).thenApply { it.parse() }

    override fun query(
        params: TraceQueryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TraceQueryPageAsync> =
        // post /v2/traces/query
        withRawResponse().query(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TraceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TraceServiceAsync.WithRawResponse =
            TraceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listRunsHandler: Handler<TraceListRunsResponse> =
            jsonHandler<TraceListRunsResponse>(clientOptions.jsonMapper)

        override fun listRuns(
            params: TraceListRunsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TraceListRunsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("traceId", params.traceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "traces", params._pathParam(0), "runs")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listRunsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val queryHandler: Handler<TraceQueryPageResponse> =
            jsonHandler<TraceQueryPageResponse>(clientOptions.jsonMapper)

        override fun query(
            params: TraceQueryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TraceQueryPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "traces", "query")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { queryHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                TraceQueryPageAsync.builder()
                                    .service(TraceServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}

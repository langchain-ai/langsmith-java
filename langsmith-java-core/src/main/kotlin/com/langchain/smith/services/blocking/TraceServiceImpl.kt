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
import com.langchain.smith.models.traces.TraceListRunsParams
import com.langchain.smith.models.traces.TraceListRunsResponse
import com.langchain.smith.models.traces.TraceQueryPage
import com.langchain.smith.models.traces.TraceQueryPageResponse
import com.langchain.smith.models.traces.TraceQueryParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TraceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TraceService {

    private val withRawResponse: TraceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TraceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TraceService =
        TraceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun listRuns(
        params: TraceListRunsParams,
        requestOptions: RequestOptions,
    ): TraceListRunsResponse =
        // get /v2/traces/{trace_id}/runs
        withRawResponse().listRuns(params, requestOptions).parse()

    override fun query(params: TraceQueryParams, requestOptions: RequestOptions): TraceQueryPage =
        // post /v2/traces/query
        withRawResponse().query(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TraceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TraceService.WithRawResponse =
            TraceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listRunsHandler: Handler<TraceListRunsResponse> =
            jsonHandler<TraceListRunsResponse>(clientOptions.jsonMapper)

        override fun listRuns(
            params: TraceListRunsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TraceListRunsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("traceId", params.traceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "traces", params._pathParam(0), "runs")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listRunsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val queryHandler: Handler<TraceQueryPageResponse> =
            jsonHandler<TraceQueryPageResponse>(clientOptions.jsonMapper)

        override fun query(
            params: TraceQueryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TraceQueryPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "traces", "query")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { queryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        TraceQueryPage.builder()
                            .service(TraceServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}

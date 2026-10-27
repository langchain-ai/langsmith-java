// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.traces

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.QueryStreamingItems
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.handlers.errorBodyHandler
import com.langchain.smith.core.handlers.errorHandler
import com.langchain.smith.core.handlers.mapJson
import com.langchain.smith.core.handlers.sseHandler
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.HttpMethod
import com.langchain.smith.core.http.HttpRequest
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponse.Handler
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.core.http.StreamResponse
import com.langchain.smith.core.http.json
import com.langchain.smith.core.http.map
import com.langchain.smith.core.http.parseable
import com.langchain.smith.core.prepare
import com.langchain.smith.models.QueryPatchOperation
import com.langchain.smith.models.traces.Trace
import com.langchain.smith.models.traces.streaming.StreamingQueryParams
import java.util.function.Consumer

class StreamingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    StreamingService {

    companion object {

        private val DEFAULT_HEADERS = Headers.builder().put("Accept", "text/event-stream").build()
    }

    private val withRawResponse: StreamingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StreamingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StreamingService =
        StreamingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun queryStreaming(
        params: StreamingQueryParams,
        requestOptions: RequestOptions,
    ): StreamResponse<List<QueryPatchOperation>> =
        // post /api/v2/traces/query
        withRawResponse().queryStreaming(params, requestOptions).parse()

    override fun queryStreamingItems(
        params: StreamingQueryParams,
        requestOptions: RequestOptions,
    ): StreamResponse<Trace> =
        QueryStreamingItems(Trace::class.java, clientOptions.jsonMapper) { cursor ->
            queryStreaming(
                if (cursor == null) params else params.toBuilder().cursor(cursor).build(),
                requestOptions,
            )
        }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StreamingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StreamingService.WithRawResponse =
            StreamingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val queryStreamingHandler: Handler<StreamResponse<List<QueryPatchOperation>>> =
            sseHandler(clientOptions.jsonMapper).mapJson<List<QueryPatchOperation>>()

        override fun queryStreaming(
            params: StreamingQueryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StreamResponse<List<QueryPatchOperation>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "traces", "query")
                    .putAllHeaders(DEFAULT_HEADERS)
                    .putHeader("Accept", "text/event-stream")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .let { queryStreamingHandler.handle(it) }
                    .let { streamResponse ->
                        if (requestOptions.responseValidation!!) {
                            streamResponse.map {
                                it.forEach { it.validate() }
                                it
                            }
                        } else {
                            streamResponse
                        }
                    }
            }
        }
    }
}

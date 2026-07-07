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
import com.langchain.smith.models.threads.ThreadListTracesPage
import com.langchain.smith.models.threads.ThreadListTracesPageResponse
import com.langchain.smith.models.threads.ThreadListTracesParams
import com.langchain.smith.models.threads.ThreadQueryPage
import com.langchain.smith.models.threads.ThreadQueryPageResponse
import com.langchain.smith.models.threads.ThreadQueryParams
import com.langchain.smith.models.threads.ThreadStatsParams
import com.langchain.smith.models.threads.ThreadStatsResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ThreadServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ThreadService {

    private val withRawResponse: ThreadService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ThreadService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ThreadService =
        ThreadServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun listTraces(
        params: ThreadListTracesParams,
        requestOptions: RequestOptions,
    ): ThreadListTracesPage =
        // get /v2/threads/{thread_id}/traces
        withRawResponse().listTraces(params, requestOptions).parse()

    override fun query(params: ThreadQueryParams, requestOptions: RequestOptions): ThreadQueryPage =
        // post /v2/threads/query
        withRawResponse().query(params, requestOptions).parse()

    override fun stats(
        params: ThreadStatsParams,
        requestOptions: RequestOptions,
    ): ThreadStatsResponse =
        // get /v2/threads/{thread_id}/stats
        withRawResponse().stats(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ThreadService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ThreadService.WithRawResponse =
            ThreadServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listTracesHandler: Handler<ThreadListTracesPageResponse> =
            jsonHandler<ThreadListTracesPageResponse>(clientOptions.jsonMapper)

        override fun listTraces(
            params: ThreadListTracesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ThreadListTracesPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("threadId", params.threadId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "threads", params._pathParam(0), "traces")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listTracesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        ThreadListTracesPage.builder()
                            .service(ThreadServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val queryHandler: Handler<ThreadQueryPageResponse> =
            jsonHandler<ThreadQueryPageResponse>(clientOptions.jsonMapper)

        override fun query(
            params: ThreadQueryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ThreadQueryPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "threads", "query")
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
                        ThreadQueryPage.builder()
                            .service(ThreadServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val statsHandler: Handler<ThreadStatsResponse> =
            jsonHandler<ThreadStatsResponse>(clientOptions.jsonMapper)

        override fun stats(
            params: ThreadStatsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ThreadStatsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("threadId", params.threadId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "threads", params._pathParam(0), "stats")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { statsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}

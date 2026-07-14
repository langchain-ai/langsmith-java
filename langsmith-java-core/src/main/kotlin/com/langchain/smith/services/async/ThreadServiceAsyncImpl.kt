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
import com.langchain.smith.models.threads.ThreadListTracesPageAsync
import com.langchain.smith.models.threads.ThreadListTracesPageResponse
import com.langchain.smith.models.threads.ThreadListTracesParams
import com.langchain.smith.models.threads.ThreadQueryPageAsync
import com.langchain.smith.models.threads.ThreadQueryPageResponse
import com.langchain.smith.models.threads.ThreadQueryParams
import com.langchain.smith.models.threads.ThreadStats
import com.langchain.smith.models.threads.ThreadStatsParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ThreadServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ThreadServiceAsync {

    private val withRawResponse: ThreadServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ThreadServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ThreadServiceAsync =
        ThreadServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun listTraces(
        params: ThreadListTracesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ThreadListTracesPageAsync> =
        // get /v2/threads/{thread_id}/traces
        withRawResponse().listTraces(params, requestOptions).thenApply { it.parse() }

    override fun query(
        params: ThreadQueryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ThreadQueryPageAsync> =
        // post /v2/threads/query
        withRawResponse().query(params, requestOptions).thenApply { it.parse() }

    override fun stats(
        params: ThreadStatsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ThreadStats> =
        // get /v2/threads/{thread_id}/stats
        withRawResponse().stats(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ThreadServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ThreadServiceAsync.WithRawResponse =
            ThreadServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listTracesHandler: Handler<ThreadListTracesPageResponse> =
            jsonHandler<ThreadListTracesPageResponse>(clientOptions.jsonMapper)

        override fun listTraces(
            params: ThreadListTracesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ThreadListTracesPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("threadId", params.threadId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "threads", params._pathParam(0), "traces")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listTracesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                ThreadListTracesPageAsync.builder()
                                    .service(ThreadServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val queryHandler: Handler<ThreadQueryPageResponse> =
            jsonHandler<ThreadQueryPageResponse>(clientOptions.jsonMapper)

        override fun query(
            params: ThreadQueryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ThreadQueryPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "threads", "query")
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
                                ThreadQueryPageAsync.builder()
                                    .service(ThreadServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val statsHandler: Handler<ThreadStats> =
            jsonHandler<ThreadStats>(clientOptions.jsonMapper)

        override fun stats(
            params: ThreadStatsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ThreadStats>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("threadId", params.threadId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "threads", params._pathParam(0), "stats")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}

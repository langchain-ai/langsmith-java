// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.repos.optimizationjobs

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
import com.langchain.smith.models.repos.optimizationjobs.logs.LogCreateParams
import com.langchain.smith.models.repos.optimizationjobs.logs.LogDeleteParams
import com.langchain.smith.models.repos.optimizationjobs.logs.LogDeleteResponse
import com.langchain.smith.models.repos.optimizationjobs.logs.LogListParams
import com.langchain.smith.models.repos.optimizationjobs.logs.LogRetrieveParams
import com.langchain.smith.models.repos.optimizationjobs.logs.PromptOptimizationJobLog
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LogServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LogServiceAsync {

    private val withRawResponse: LogServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LogServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LogServiceAsync =
        LogServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: LogCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PromptOptimizationJobLog> =
        // post /api/v1/repos/{owner}/{repo}/optimization-jobs/{job_id}/logs
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: LogRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PromptOptimizationJobLog> =
        // get /api/v1/repos/{owner}/{repo}/optimization-jobs/{job_id}/logs/{log_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: LogListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<PromptOptimizationJobLog>> =
        // get /api/v1/repos/{owner}/{repo}/optimization-jobs/{job_id}/logs
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: LogDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LogDeleteResponse> =
        // delete /api/v1/repos/{owner}/{repo}/optimization-jobs/{job_id}/logs/{log_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LogServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LogServiceAsync.WithRawResponse =
            LogServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PromptOptimizationJobLog> =
            jsonHandler<PromptOptimizationJobLog>(clientOptions.jsonMapper)

        override fun create(
            params: LogCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PromptOptimizationJobLog>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "repos",
                        params._pathParam(0),
                        params._pathParam(1),
                        "optimization-jobs",
                        params._pathParam(2),
                        "logs",
                    )
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

        private val retrieveHandler: Handler<PromptOptimizationJobLog> =
            jsonHandler<PromptOptimizationJobLog>(clientOptions.jsonMapper)

        override fun retrieve(
            params: LogRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PromptOptimizationJobLog>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("logId", params.logId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "repos",
                        params._pathParam(0),
                        params._pathParam(1),
                        "optimization-jobs",
                        params._pathParam(2),
                        "logs",
                        params._pathParam(3),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<List<PromptOptimizationJobLog>> =
            jsonHandler<List<PromptOptimizationJobLog>>(clientOptions.jsonMapper)

        override fun list(
            params: LogListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<PromptOptimizationJobLog>>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "repos",
                        params._pathParam(0),
                        params._pathParam(1),
                        "optimization-jobs",
                        params._pathParam(2),
                        "logs",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<LogDeleteResponse> =
            jsonHandler<LogDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: LogDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LogDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("logId", params.logId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "repos",
                        params._pathParam(0),
                        params._pathParam(1),
                        "optimization-jobs",
                        params._pathParam(2),
                        "logs",
                        params._pathParam(3),
                    )
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
    }
}

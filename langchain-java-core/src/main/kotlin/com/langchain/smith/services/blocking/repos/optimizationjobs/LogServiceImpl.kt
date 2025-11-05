// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.repos.optimizationjobs

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
import com.langchain.smith.models.repos.optimizationjobs.logs.LogCreateParams
import com.langchain.smith.models.repos.optimizationjobs.logs.LogDeleteParams
import com.langchain.smith.models.repos.optimizationjobs.logs.LogDeleteResponse
import com.langchain.smith.models.repos.optimizationjobs.logs.LogListParams
import com.langchain.smith.models.repos.optimizationjobs.logs.LogRetrieveParams
import com.langchain.smith.models.repos.optimizationjobs.logs.PromptOptimizationJobLog
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LogServiceImpl internal constructor(private val clientOptions: ClientOptions) : LogService {

    private val withRawResponse: LogService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LogService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LogService =
        LogServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: LogCreateParams,
        requestOptions: RequestOptions,
    ): PromptOptimizationJobLog =
        // post /api/v1/repos/{owner}/{repo}/optimization-jobs/{job_id}/logs
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: LogRetrieveParams,
        requestOptions: RequestOptions,
    ): PromptOptimizationJobLog =
        // get /api/v1/repos/{owner}/{repo}/optimization-jobs/{job_id}/logs/{log_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: LogListParams,
        requestOptions: RequestOptions,
    ): List<PromptOptimizationJobLog> =
        // get /api/v1/repos/{owner}/{repo}/optimization-jobs/{job_id}/logs
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: LogDeleteParams,
        requestOptions: RequestOptions,
    ): LogDeleteResponse =
        // delete /api/v1/repos/{owner}/{repo}/optimization-jobs/{job_id}/logs/{log_id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LogService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LogService.WithRawResponse =
            LogServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PromptOptimizationJobLog> =
            jsonHandler<PromptOptimizationJobLog>(clientOptions.jsonMapper)

        override fun create(
            params: LogCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PromptOptimizationJobLog> {
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

        private val retrieveHandler: Handler<PromptOptimizationJobLog> =
            jsonHandler<PromptOptimizationJobLog>(clientOptions.jsonMapper)

        override fun retrieve(
            params: LogRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PromptOptimizationJobLog> {
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

        private val listHandler: Handler<List<PromptOptimizationJobLog>> =
            jsonHandler<List<PromptOptimizationJobLog>>(clientOptions.jsonMapper)

        override fun list(
            params: LogListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<PromptOptimizationJobLog>> {
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

        private val deleteHandler: Handler<LogDeleteResponse> =
            jsonHandler<LogDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: LogDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LogDeleteResponse> {
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

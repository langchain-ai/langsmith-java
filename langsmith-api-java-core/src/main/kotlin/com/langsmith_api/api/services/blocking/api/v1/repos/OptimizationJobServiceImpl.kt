// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.repos

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
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.OptimizationJobDeleteParams
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.OptimizationJobDeleteResponse
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.OptimizationJobOptimizationJobsParams
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.OptimizationJobRetrieveOptimizationJobsParams
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.OptimizationJobRetrieveParams
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.OptimizationJobRetrieveResponse
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.OptimizationJobUpdateParams
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.PromptOptimizationJob
import com.langsmith_api.api.services.blocking.api.v1.repos.optimizationjobs.LogService
import com.langsmith_api.api.services.blocking.api.v1.repos.optimizationjobs.LogServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OptimizationJobServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OptimizationJobService {

    private val withRawResponse: OptimizationJobService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val logs: LogService by lazy { LogServiceImpl(clientOptions) }

    override fun withRawResponse(): OptimizationJobService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OptimizationJobService =
        OptimizationJobServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun logs(): LogService = logs

    override fun retrieve(
        params: OptimizationJobRetrieveParams,
        requestOptions: RequestOptions,
    ): OptimizationJobRetrieveResponse =
        // get /api/v1/repos/{owner}/{repo}/optimization-jobs/{job_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: OptimizationJobUpdateParams,
        requestOptions: RequestOptions,
    ): PromptOptimizationJob =
        // patch /api/v1/repos/{owner}/{repo}/optimization-jobs/{job_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(
        params: OptimizationJobDeleteParams,
        requestOptions: RequestOptions,
    ): OptimizationJobDeleteResponse =
        // delete /api/v1/repos/{owner}/{repo}/optimization-jobs/{job_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun optimizationJobs(
        params: OptimizationJobOptimizationJobsParams,
        requestOptions: RequestOptions,
    ): PromptOptimizationJob =
        // post /api/v1/repos/{owner}/{repo}/optimization-jobs
        withRawResponse().optimizationJobs(params, requestOptions).parse()

    override fun retrieveOptimizationJobs(
        params: OptimizationJobRetrieveOptimizationJobsParams,
        requestOptions: RequestOptions,
    ): List<PromptOptimizationJob> =
        // get /api/v1/repos/{owner}/{repo}/optimization-jobs
        withRawResponse().retrieveOptimizationJobs(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OptimizationJobService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val logs: LogService.WithRawResponse by lazy {
            LogServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OptimizationJobService.WithRawResponse =
            OptimizationJobServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun logs(): LogService.WithRawResponse = logs

        private val retrieveHandler: Handler<OptimizationJobRetrieveResponse> =
            jsonHandler<OptimizationJobRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: OptimizationJobRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OptimizationJobRetrieveResponse> {
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

        private val updateHandler: Handler<PromptOptimizationJob> =
            jsonHandler<PromptOptimizationJob>(clientOptions.jsonMapper)

        override fun update(
            params: OptimizationJobUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PromptOptimizationJob> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "repos",
                        params._pathParam(0),
                        params._pathParam(1),
                        "optimization-jobs",
                        params._pathParam(2),
                    )
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

        private val deleteHandler: Handler<OptimizationJobDeleteResponse> =
            jsonHandler<OptimizationJobDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: OptimizationJobDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OptimizationJobDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
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

        private val optimizationJobsHandler: Handler<PromptOptimizationJob> =
            jsonHandler<PromptOptimizationJob>(clientOptions.jsonMapper)

        override fun optimizationJobs(
            params: OptimizationJobOptimizationJobsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PromptOptimizationJob> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("repo", params.repo().getOrNull())
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
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { optimizationJobsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveOptimizationJobsHandler: Handler<List<PromptOptimizationJob>> =
            jsonHandler<List<PromptOptimizationJob>>(clientOptions.jsonMapper)

        override fun retrieveOptimizationJobs(
            params: OptimizationJobRetrieveOptimizationJobsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<PromptOptimizationJob>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("repo", params.repo().getOrNull())
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
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveOptimizationJobsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}

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
import com.langchain.smith.models.repos.CreateRepoResponse
import com.langchain.smith.models.repos.GetRepoResponse
import com.langchain.smith.models.repos.RepoCreateParams
import com.langchain.smith.models.repos.RepoDeleteParams
import com.langchain.smith.models.repos.RepoDeleteResponse
import com.langchain.smith.models.repos.RepoForkParams
import com.langchain.smith.models.repos.RepoListParams
import com.langchain.smith.models.repos.RepoListResponse
import com.langchain.smith.models.repos.RepoOptimizeJobParams
import com.langchain.smith.models.repos.RepoOptimizeJobResponse
import com.langchain.smith.models.repos.RepoRetrieveParams
import com.langchain.smith.models.repos.RepoUpdateParams
import com.langchain.smith.services.blocking.repos.OptimizationJobService
import com.langchain.smith.services.blocking.repos.OptimizationJobServiceImpl
import com.langchain.smith.services.blocking.repos.TagService
import com.langchain.smith.services.blocking.repos.TagServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RepoServiceImpl internal constructor(private val clientOptions: ClientOptions) : RepoService {

    private val withRawResponse: RepoService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val tags: TagService by lazy { TagServiceImpl(clientOptions) }

    private val optimizationJobs: OptimizationJobService by lazy {
        OptimizationJobServiceImpl(clientOptions)
    }

    override fun withRawResponse(): RepoService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RepoService =
        RepoServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun tags(): TagService = tags

    override fun optimizationJobs(): OptimizationJobService = optimizationJobs

    override fun create(
        params: RepoCreateParams,
        requestOptions: RequestOptions,
    ): CreateRepoResponse =
        // post /api/v1/repos
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: RepoRetrieveParams,
        requestOptions: RequestOptions,
    ): GetRepoResponse =
        // get /api/v1/repos/{owner}/{repo}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: RepoUpdateParams,
        requestOptions: RequestOptions,
    ): CreateRepoResponse =
        // patch /api/v1/repos/{owner}/{repo}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: RepoListParams, requestOptions: RequestOptions): RepoListResponse =
        // get /api/v1/repos
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: RepoDeleteParams,
        requestOptions: RequestOptions,
    ): RepoDeleteResponse =
        // delete /api/v1/repos/{owner}/{repo}
        withRawResponse().delete(params, requestOptions).parse()

    override fun fork(params: RepoForkParams, requestOptions: RequestOptions): GetRepoResponse =
        // post /api/v1/repos/{owner}/{repo}/fork
        withRawResponse().fork(params, requestOptions).parse()

    override fun optimizeJob(
        params: RepoOptimizeJobParams,
        requestOptions: RequestOptions,
    ): RepoOptimizeJobResponse =
        // post /api/v1/repos/optimize-job
        withRawResponse().optimizeJob(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RepoService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val tags: TagService.WithRawResponse by lazy {
            TagServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val optimizationJobs: OptimizationJobService.WithRawResponse by lazy {
            OptimizationJobServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RepoService.WithRawResponse =
            RepoServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun tags(): TagService.WithRawResponse = tags

        override fun optimizationJobs(): OptimizationJobService.WithRawResponse = optimizationJobs

        private val createHandler: Handler<CreateRepoResponse> =
            jsonHandler<CreateRepoResponse>(clientOptions.jsonMapper)

        override fun create(
            params: RepoCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreateRepoResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "repos")
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

        private val retrieveHandler: Handler<GetRepoResponse> =
            jsonHandler<GetRepoResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RepoRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GetRepoResponse> {
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

        private val updateHandler: Handler<CreateRepoResponse> =
            jsonHandler<CreateRepoResponse>(clientOptions.jsonMapper)

        override fun update(
            params: RepoUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreateRepoResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("repo", params.repo().getOrNull())
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

        private val listHandler: Handler<RepoListResponse> =
            jsonHandler<RepoListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: RepoListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RepoListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "repos")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<RepoDeleteResponse> =
            jsonHandler<RepoDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: RepoDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RepoDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("repo", params.repo().getOrNull())
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

        private val forkHandler: Handler<GetRepoResponse> =
            jsonHandler<GetRepoResponse>(clientOptions.jsonMapper)

        override fun fork(
            params: RepoForkParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GetRepoResponse> {
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
                        "fork",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { forkHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val optimizeJobHandler: Handler<RepoOptimizeJobResponse> =
            jsonHandler<RepoOptimizeJobResponse>(clientOptions.jsonMapper)

        override fun optimizeJob(
            params: RepoOptimizeJobParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RepoOptimizeJobResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "repos", "optimize-job")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { optimizeJobHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}

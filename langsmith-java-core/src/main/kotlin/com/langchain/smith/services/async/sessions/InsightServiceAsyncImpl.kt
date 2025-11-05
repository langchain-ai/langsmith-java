// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.sessions

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
import com.langchain.smith.models.sessions.insights.InsightCreateParams
import com.langchain.smith.models.sessions.insights.InsightCreateResponse
import com.langchain.smith.models.sessions.insights.InsightDeleteParams
import com.langchain.smith.models.sessions.insights.InsightDeleteResponse
import com.langchain.smith.models.sessions.insights.InsightListParams
import com.langchain.smith.models.sessions.insights.InsightListResponse
import com.langchain.smith.models.sessions.insights.InsightRetrieveJobParams
import com.langchain.smith.models.sessions.insights.InsightRetrieveJobResponse
import com.langchain.smith.models.sessions.insights.InsightRetrieveParams
import com.langchain.smith.models.sessions.insights.InsightRetrieveResponse
import com.langchain.smith.models.sessions.insights.InsightRetrieveRunsParams
import com.langchain.smith.models.sessions.insights.InsightRetrieveRunsResponse
import com.langchain.smith.models.sessions.insights.InsightUpdateParams
import com.langchain.smith.models.sessions.insights.InsightUpdateResponse
import com.langchain.smith.services.async.sessions.insights.ConfigServiceAsync
import com.langchain.smith.services.async.sessions.insights.ConfigServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class InsightServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    InsightServiceAsync {

    private val withRawResponse: InsightServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val configs: ConfigServiceAsync by lazy { ConfigServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): InsightServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InsightServiceAsync =
        InsightServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun configs(): ConfigServiceAsync = configs

    override fun create(
        params: InsightCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InsightCreateResponse> =
        // post /api/v1/sessions/{session_id}/insights
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: InsightRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InsightRetrieveResponse> =
        // get /api/v1/sessions/{session_id}/insights/{job_id}/clusters/{cluster_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: InsightUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InsightUpdateResponse> =
        // patch /api/v1/sessions/{session_id}/insights/{job_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: InsightListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InsightListResponse> =
        // get /api/v1/sessions/{session_id}/insights
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: InsightDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InsightDeleteResponse> =
        // delete /api/v1/sessions/{session_id}/insights/{job_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun retrieveJob(
        params: InsightRetrieveJobParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InsightRetrieveJobResponse> =
        // get /api/v1/sessions/{session_id}/insights/{job_id}
        withRawResponse().retrieveJob(params, requestOptions).thenApply { it.parse() }

    override fun retrieveRuns(
        params: InsightRetrieveRunsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InsightRetrieveRunsResponse> =
        // get /api/v1/sessions/{session_id}/insights/{job_id}/runs
        withRawResponse().retrieveRuns(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InsightServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val configs: ConfigServiceAsync.WithRawResponse by lazy {
            ConfigServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InsightServiceAsync.WithRawResponse =
            InsightServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun configs(): ConfigServiceAsync.WithRawResponse = configs

        private val createHandler: Handler<InsightCreateResponse> =
            jsonHandler<InsightCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: InsightCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InsightCreateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sessionId", params.sessionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "sessions", params._pathParam(0), "insights")
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

        private val retrieveHandler: Handler<InsightRetrieveResponse> =
            jsonHandler<InsightRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: InsightRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InsightRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("clusterId", params.clusterId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "sessions",
                        params._pathParam(0),
                        "insights",
                        params._pathParam(1),
                        "clusters",
                        params._pathParam(2),
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

        private val updateHandler: Handler<InsightUpdateResponse> =
            jsonHandler<InsightUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: InsightUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InsightUpdateResponse>> {
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
                        "sessions",
                        params._pathParam(0),
                        "insights",
                        params._pathParam(1),
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
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<InsightListResponse> =
            jsonHandler<InsightListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: InsightListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InsightListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sessionId", params.sessionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "sessions", params._pathParam(0), "insights")
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
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<InsightDeleteResponse> =
            jsonHandler<InsightDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: InsightDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InsightDeleteResponse>> {
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
                        "sessions",
                        params._pathParam(0),
                        "insights",
                        params._pathParam(1),
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

        private val retrieveJobHandler: Handler<InsightRetrieveJobResponse> =
            jsonHandler<InsightRetrieveJobResponse>(clientOptions.jsonMapper)

        override fun retrieveJob(
            params: InsightRetrieveJobParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InsightRetrieveJobResponse>> {
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
                        "sessions",
                        params._pathParam(0),
                        "insights",
                        params._pathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveJobHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveRunsHandler: Handler<InsightRetrieveRunsResponse> =
            jsonHandler<InsightRetrieveRunsResponse>(clientOptions.jsonMapper)

        override fun retrieveRuns(
            params: InsightRetrieveRunsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InsightRetrieveRunsResponse>> {
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
                        "sessions",
                        params._pathParam(0),
                        "insights",
                        params._pathParam(1),
                        "runs",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveRunsHandler.handle(it) }
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

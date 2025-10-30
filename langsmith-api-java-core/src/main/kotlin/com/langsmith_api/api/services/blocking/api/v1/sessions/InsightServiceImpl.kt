// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.sessions

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
import com.langsmith_api.api.models.api.v1.sessions.insights.InsightCreateParams
import com.langsmith_api.api.models.api.v1.sessions.insights.InsightCreateResponse
import com.langsmith_api.api.models.api.v1.sessions.insights.InsightDeleteParams
import com.langsmith_api.api.models.api.v1.sessions.insights.InsightDeleteResponse
import com.langsmith_api.api.models.api.v1.sessions.insights.InsightListParams
import com.langsmith_api.api.models.api.v1.sessions.insights.InsightListResponse
import com.langsmith_api.api.models.api.v1.sessions.insights.InsightRetrieveParams
import com.langsmith_api.api.models.api.v1.sessions.insights.InsightRetrieveResponse
import com.langsmith_api.api.models.api.v1.sessions.insights.InsightRetrieveRunsParams
import com.langsmith_api.api.models.api.v1.sessions.insights.InsightRetrieveRunsResponse
import com.langsmith_api.api.models.api.v1.sessions.insights.InsightUpdateParams
import com.langsmith_api.api.models.api.v1.sessions.insights.InsightUpdateResponse
import com.langsmith_api.api.services.blocking.api.v1.sessions.insights.ConfigService
import com.langsmith_api.api.services.blocking.api.v1.sessions.insights.ConfigServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class InsightServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InsightService {

    private val withRawResponse: InsightService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val configs: ConfigService by lazy { ConfigServiceImpl(clientOptions) }

    override fun withRawResponse(): InsightService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InsightService =
        InsightServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun configs(): ConfigService = configs

    override fun create(
        params: InsightCreateParams,
        requestOptions: RequestOptions,
    ): InsightCreateResponse =
        // post /api/v1/sessions/{session_id}/insights
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: InsightRetrieveParams,
        requestOptions: RequestOptions,
    ): InsightRetrieveResponse =
        // get /api/v1/sessions/{session_id}/insights/{job_id}/clusters/{cluster_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: InsightUpdateParams,
        requestOptions: RequestOptions,
    ): InsightUpdateResponse =
        // patch /api/v1/sessions/{session_id}/insights/{job_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: InsightListParams,
        requestOptions: RequestOptions,
    ): InsightListResponse =
        // get /api/v1/sessions/{session_id}/insights
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: InsightDeleteParams,
        requestOptions: RequestOptions,
    ): InsightDeleteResponse =
        // delete /api/v1/sessions/{session_id}/insights/{job_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun retrieveRuns(
        params: InsightRetrieveRunsParams,
        requestOptions: RequestOptions,
    ): InsightRetrieveRunsResponse =
        // get /api/v1/sessions/{session_id}/insights/{job_id}/runs
        withRawResponse().retrieveRuns(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InsightService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val configs: ConfigService.WithRawResponse by lazy {
            ConfigServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InsightService.WithRawResponse =
            InsightServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun configs(): ConfigService.WithRawResponse = configs

        private val createHandler: Handler<InsightCreateResponse> =
            jsonHandler<InsightCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: InsightCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InsightCreateResponse> {
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

        private val retrieveHandler: Handler<InsightRetrieveResponse> =
            jsonHandler<InsightRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: InsightRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InsightRetrieveResponse> {
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

        private val updateHandler: Handler<InsightUpdateResponse> =
            jsonHandler<InsightUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: InsightUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InsightUpdateResponse> {
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

        private val listHandler: Handler<InsightListResponse> =
            jsonHandler<InsightListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: InsightListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InsightListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sessionId", params.sessionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "sessions", params._pathParam(0), "insights")
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

        private val deleteHandler: Handler<InsightDeleteResponse> =
            jsonHandler<InsightDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: InsightDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InsightDeleteResponse> {
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

        private val retrieveRunsHandler: Handler<InsightRetrieveRunsResponse> =
            jsonHandler<InsightRetrieveRunsResponse>(clientOptions.jsonMapper)

        override fun retrieveRuns(
            params: InsightRetrieveRunsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InsightRetrieveRunsResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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

// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.sessions

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
import com.langchain.smith.models.sessions.insights.InsightCreateParams
import com.langchain.smith.models.sessions.insights.InsightCreateResponse
import com.langchain.smith.models.sessions.insights.InsightDeleteParams
import com.langchain.smith.models.sessions.insights.InsightDeleteResponse
import com.langchain.smith.models.sessions.insights.InsightRetrieveJobParams
import com.langchain.smith.models.sessions.insights.InsightRetrieveJobResponse
import com.langchain.smith.models.sessions.insights.InsightRetrieveRunsParams
import com.langchain.smith.models.sessions.insights.InsightRetrieveRunsResponse
import com.langchain.smith.models.sessions.insights.InsightUpdateParams
import com.langchain.smith.models.sessions.insights.InsightUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class InsightServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InsightService {

    private val withRawResponse: InsightService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InsightService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InsightService =
        InsightServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: InsightCreateParams,
        requestOptions: RequestOptions,
    ): InsightCreateResponse =
        // post /api/v1/sessions/{session_id}/insights
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: InsightUpdateParams,
        requestOptions: RequestOptions,
    ): InsightUpdateResponse =
        // patch /api/v1/sessions/{session_id}/insights/{job_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(
        params: InsightDeleteParams,
        requestOptions: RequestOptions,
    ): InsightDeleteResponse =
        // delete /api/v1/sessions/{session_id}/insights/{job_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun retrieveJob(
        params: InsightRetrieveJobParams,
        requestOptions: RequestOptions,
    ): InsightRetrieveJobResponse =
        // get /api/v1/sessions/{session_id}/insights/{job_id}
        withRawResponse().retrieveJob(params, requestOptions).parse()

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

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InsightService.WithRawResponse =
            InsightServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

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

        private val retrieveJobHandler: Handler<InsightRetrieveJobResponse> =
            jsonHandler<InsightRetrieveJobResponse>(clientOptions.jsonMapper)

        override fun retrieveJob(
            params: InsightRetrieveJobParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InsightRetrieveJobResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveJobHandler.handle(it) }
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

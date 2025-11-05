// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.annotationqueues

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
import com.langchain.smith.models.annotationqueues.RunSchemaWithAnnotationQueueInfo
import com.langchain.smith.models.annotationqueues.runs.RunCreateParams
import com.langchain.smith.models.annotationqueues.runs.RunCreateResponse
import com.langchain.smith.models.annotationqueues.runs.RunDeleteAllParams
import com.langchain.smith.models.annotationqueues.runs.RunDeleteAllResponse
import com.langchain.smith.models.annotationqueues.runs.RunDeleteQueueParams
import com.langchain.smith.models.annotationqueues.runs.RunDeleteQueueResponse
import com.langchain.smith.models.annotationqueues.runs.RunListParams
import com.langchain.smith.models.annotationqueues.runs.RunUpdateParams
import com.langchain.smith.models.annotationqueues.runs.RunUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RunServiceImpl internal constructor(private val clientOptions: ClientOptions) : RunService {

    private val withRawResponse: RunService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RunService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService =
        RunServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: RunCreateParams,
        requestOptions: RequestOptions,
    ): List<RunCreateResponse> =
        // post /api/v1/annotation-queues/{queue_id}/runs
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: RunUpdateParams,
        requestOptions: RequestOptions,
    ): RunUpdateResponse =
        // patch /api/v1/annotation-queues/{queue_id}/runs/{queue_run_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: RunListParams,
        requestOptions: RequestOptions,
    ): List<RunSchemaWithAnnotationQueueInfo> =
        // get /api/v1/annotation-queues/{queue_id}/runs
        withRawResponse().list(params, requestOptions).parse()

    override fun deleteAll(
        params: RunDeleteAllParams,
        requestOptions: RequestOptions,
    ): RunDeleteAllResponse =
        // post /api/v1/annotation-queues/{queue_id}/runs/delete
        withRawResponse().deleteAll(params, requestOptions).parse()

    override fun deleteQueue(
        params: RunDeleteQueueParams,
        requestOptions: RequestOptions,
    ): RunDeleteQueueResponse =
        // delete /api/v1/annotation-queues/{queue_id}/runs/{queue_run_id}
        withRawResponse().deleteQueue(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RunService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RunService.WithRawResponse =
            RunServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<List<RunCreateResponse>> =
            jsonHandler<List<RunCreateResponse>>(clientOptions.jsonMapper)

        override fun create(
            params: RunCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<RunCreateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueId", params.queueId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "annotation-queues", params._pathParam(0), "runs")
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
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val updateHandler: Handler<RunUpdateResponse> =
            jsonHandler<RunUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: RunUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueRunId", params.queueRunId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "annotation-queues",
                        params._pathParam(0),
                        "runs",
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

        private val listHandler: Handler<List<RunSchemaWithAnnotationQueueInfo>> =
            jsonHandler<List<RunSchemaWithAnnotationQueueInfo>>(clientOptions.jsonMapper)

        override fun list(
            params: RunListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<RunSchemaWithAnnotationQueueInfo>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueId", params.queueId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "annotation-queues", params._pathParam(0), "runs")
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

        private val deleteAllHandler: Handler<RunDeleteAllResponse> =
            jsonHandler<RunDeleteAllResponse>(clientOptions.jsonMapper)

        override fun deleteAll(
            params: RunDeleteAllParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunDeleteAllResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueId", params.queueId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "annotation-queues",
                        params._pathParam(0),
                        "runs",
                        "delete",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteAllHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteQueueHandler: Handler<RunDeleteQueueResponse> =
            jsonHandler<RunDeleteQueueResponse>(clientOptions.jsonMapper)

        override fun deleteQueue(
            params: RunDeleteQueueParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunDeleteQueueResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueRunId", params.queueRunId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "annotation-queues",
                        params._pathParam(0),
                        "runs",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteQueueHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.annotationQueues

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.AnnotationQueueRunCreateParams
import com.langsmith.api.models.AnnotationQueueRunDeleteParams
import com.langsmith.api.models.AnnotationQueueRunDeleteResponse
import com.langsmith.api.models.AnnotationQueueRunListParams
import com.langsmith.api.models.AnnotationQueueRunSchema
import com.langsmith.api.models.AnnotationQueueRunUpdateParams
import com.langsmith.api.models.AnnotationQueueRunUpdateResponse
import com.langsmith.api.models.RunSchemaWithAnnotationQueueInfo
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.json
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler

class RunServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : RunService {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<List<AnnotationQueueRunSchema>> =
        jsonHandler<List<AnnotationQueueRunSchema>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Add Runs To Annotation Queue */
    override fun create(
        params: AnnotationQueueRunCreateParams,
        requestOptions: RequestOptions
    ): List<AnnotationQueueRunSchema> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("annotation-queues", params.getPathParam(0), "runs")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
        }
    }

    private val updateHandler: Handler<AnnotationQueueRunUpdateResponse> =
        jsonHandler<AnnotationQueueRunUpdateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Update Run In Annotation Queue */
    override fun update(
        params: AnnotationQueueRunUpdateParams,
        requestOptions: RequestOptions
    ): AnnotationQueueRunUpdateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments(
                    "annotation-queues",
                    params.getPathParam(0),
                    "runs",
                    params.getPathParam(1)
                )
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { updateHandler.handle(it) }
        }
    }

    private val listHandler: Handler<List<RunSchemaWithAnnotationQueueInfo>> =
        jsonHandler<List<RunSchemaWithAnnotationQueueInfo>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get Runs From Annotation Queue */
    override fun list(
        params: AnnotationQueueRunListParams,
        requestOptions: RequestOptions
    ): List<RunSchemaWithAnnotationQueueInfo> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("annotation-queues", params.getPathParam(0), "runs")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
        }
    }

    private val deleteHandler: Handler<AnnotationQueueRunDeleteResponse> =
        jsonHandler<AnnotationQueueRunDeleteResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Delete Run From Annotation Queue */
    override fun delete(
        params: AnnotationQueueRunDeleteParams,
        requestOptions: RequestOptions
    ): AnnotationQueueRunDeleteResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "annotation-queues",
                    params.getPathParam(0),
                    "runs",
                    params.getPathParam(1)
                )
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { deleteHandler.handle(it) }
        }
    }
}

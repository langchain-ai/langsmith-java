// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.AnnotationQueueCreateParams
import com.langsmith.api.models.AnnotationQueueDeleteParams
import com.langsmith.api.models.AnnotationQueueDeleteResponse
import com.langsmith.api.models.AnnotationQueueListParams
import com.langsmith.api.models.AnnotationQueueSchema
import com.langsmith.api.models.AnnotationQueueSizeRetrieveParams
import com.langsmith.api.models.AnnotationQueueSizeSchema
import com.langsmith.api.models.AnnotationQueueUpdateParams
import com.langsmith.api.models.AnnotationQueueUpdateResponse
import com.langsmith.api.services.blocking.annotationQueues.QueueService
import com.langsmith.api.services.blocking.annotationQueues.QueueServiceImpl
import com.langsmith.api.services.blocking.annotationQueues.RunService
import com.langsmith.api.services.blocking.annotationQueues.RunServiceImpl
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.json
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler

class AnnotationQueueServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : AnnotationQueueService {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val runs: RunService by lazy { RunServiceImpl(clientOptions) }

    private val queues: QueueService by lazy { QueueServiceImpl(clientOptions) }

    override fun runs(): RunService = runs

    override fun queues(): QueueService = queues

    private val createHandler: Handler<AnnotationQueueSchema> =
        jsonHandler<AnnotationQueueSchema>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create Annotation Queue */
    override fun create(
        params: AnnotationQueueCreateParams,
        requestOptions: RequestOptions
    ): AnnotationQueueSchema {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("annotation-queues")
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
                        validate()
                    }
                }
        }
    }

    private val updateHandler: Handler<AnnotationQueueUpdateResponse> =
        jsonHandler<AnnotationQueueUpdateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Update Annotation Queue */
    override fun update(
        params: AnnotationQueueUpdateParams,
        requestOptions: RequestOptions
    ): AnnotationQueueUpdateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("annotation-queues", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { updateHandler.handle(it) }
        }
    }

    private val listHandler: Handler<List<AnnotationQueueSchema>> =
        jsonHandler<List<AnnotationQueueSchema>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get Annotation Queues */
    override fun list(
        params: AnnotationQueueListParams,
        requestOptions: RequestOptions
    ): List<AnnotationQueueSchema> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("annotation-queues")
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

    private val deleteHandler: Handler<AnnotationQueueDeleteResponse> =
        jsonHandler<AnnotationQueueDeleteResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Delete Annotation Queue */
    override fun delete(
        params: AnnotationQueueDeleteParams,
        requestOptions: RequestOptions
    ): AnnotationQueueDeleteResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("annotation-queues", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { deleteHandler.handle(it) }
        }
    }

    private val sizeRetrieveHandler: Handler<AnnotationQueueSizeSchema> =
        jsonHandler<AnnotationQueueSizeSchema>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get Size From Annotation Queue */
    override fun sizeRetrieve(
        params: AnnotationQueueSizeRetrieveParams,
        requestOptions: RequestOptions
    ): AnnotationQueueSizeSchema {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("annotation-queues", params.getPathParam(0), "size")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { sizeRetrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}

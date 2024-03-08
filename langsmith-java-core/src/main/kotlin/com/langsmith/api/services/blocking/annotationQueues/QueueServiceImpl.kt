// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.annotationQueues

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.AnnotationQueueQueueListParams
import com.langsmith.api.models.AnnotationQueueSchema
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler

class QueueServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : QueueService {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<List<AnnotationQueueSchema>> =
        jsonHandler<List<AnnotationQueueSchema>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get Annotation Queues For Run */
    override fun list(
        params: AnnotationQueueQueueListParams,
        requestOptions: RequestOptions
    ): List<AnnotationQueueSchema> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("annotation-queues", params.getPathParam(0), "queues")
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
}

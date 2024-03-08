// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

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
) : RunService { // templates/JavaSDK/services.ts:76:15 // templates/JavaSDK/services.ts:76:15 //
    // templates/JavaSDK/services.ts:76:15

    private val errorHandler: Handler<LangSmithError> =
        errorHandler(clientOptions.jsonMapper) // templates/JavaSDK/services.ts:76:15

    private val createHandler:
        Handler<
            List<AnnotationQueueRunSchema>
        > = // templates/JavaSDK/services.ts:826:12 // templates/JavaSDK/services.ts:826:12 //
        // templates/JavaSDK/services.ts:825:19
        jsonHandler<List<AnnotationQueueRunSchema>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Add Runs To Annotation Queue */
    override fun create(
        params: AnnotationQueueRunCreateParams,
        requestOptions: RequestOptions
    ): List<AnnotationQueueRunSchema> { // templates/JavaSDK/services.ts:831:10
        val request =
            HttpRequest.builder() // templates/JavaSDK/services.ts:107:20 //
                // templates/JavaSDK/services.ts:105:8 //
                // templates/JavaSDK/services.ts:105:8 //
                // templates/JavaSDK/services.ts:104:29 //
                // templates/JavaSDK/services.ts:104:29 //
                // templates/JavaSDK/services.ts:227:15 //
                // templates/JavaSDK/services.ts:227:15
                .method(
                    HttpMethod.POST
                ) // templates/JavaSDK/services.ts:109:18 // templates/JavaSDK/services.ts:109:18
                .addPathSegments("annotation-queues", params.getPathParam(0), "runs")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response
            -> // templates/JavaSDK/services.ts:230:8
            response
                .use { // templates/JavaSDK/services.ts:166:8 //
                    // templates/JavaSDK/services.ts:233:30 //
                    // templates/JavaSDK/services.ts:233:30 //
                    // templates/JavaSDK/services.ts:230:8 // templates/JavaSDK/services.ts:230:8
                    createHandler.handle(it)
                }
                .apply { // templates/JavaSDK/services.ts:176:10
                    if (
                        requestOptions.responseValidation ?: clientOptions.responseValidation
                    ) { // templates/JavaSDK/services.ts:179:14 //
                        // templates/JavaSDK/services.ts:176:10 //
                        // templates/JavaSDK/services.ts:176:10
                        forEach { it.validate() }
                    }
                }
        }
    }

    private val updateHandler:
        Handler<
            AnnotationQueueRunUpdateResponse
        > = // templates/JavaSDK/services.ts:826:12 // templates/JavaSDK/services.ts:826:12 //
        // templates/JavaSDK/services.ts:825:19
        jsonHandler<AnnotationQueueRunUpdateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Update Run In Annotation Queue */
    override fun update(
        params: AnnotationQueueRunUpdateParams,
        requestOptions: RequestOptions
    ): AnnotationQueueRunUpdateResponse { // templates/JavaSDK/services.ts:831:10
        val request =
            HttpRequest.builder() // templates/JavaSDK/services.ts:107:20 //
                // templates/JavaSDK/services.ts:105:8 //
                // templates/JavaSDK/services.ts:105:8 //
                // templates/JavaSDK/services.ts:104:29 //
                // templates/JavaSDK/services.ts:104:29 //
                // templates/JavaSDK/services.ts:227:15 //
                // templates/JavaSDK/services.ts:227:15
                .method(
                    HttpMethod.PATCH
                ) // templates/JavaSDK/services.ts:109:18 // templates/JavaSDK/services.ts:109:18
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
        return clientOptions.httpClient.execute(request, requestOptions).let { response
            -> // templates/JavaSDK/services.ts:230:8
            response.use { // templates/JavaSDK/services.ts:166:8 //
                // templates/JavaSDK/services.ts:233:30 //
                // templates/JavaSDK/services.ts:233:30 //
                // templates/JavaSDK/services.ts:230:8 // templates/JavaSDK/services.ts:230:8
                updateHandler.handle(it)
            }
        }
    }

    private val listHandler:
        Handler<
            List<RunSchemaWithAnnotationQueueInfo>
        > = // templates/JavaSDK/services.ts:826:12 // templates/JavaSDK/services.ts:826:12 //
        // templates/JavaSDK/services.ts:825:19
        jsonHandler<List<RunSchemaWithAnnotationQueueInfo>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get Runs From Annotation Queue */
    override fun list(
        params: AnnotationQueueRunListParams,
        requestOptions: RequestOptions
    ): List<RunSchemaWithAnnotationQueueInfo> { // templates/JavaSDK/services.ts:831:10
        val request =
            HttpRequest.builder() // templates/JavaSDK/services.ts:107:20 //
                // templates/JavaSDK/services.ts:105:8 //
                // templates/JavaSDK/services.ts:105:8 //
                // templates/JavaSDK/services.ts:104:29 //
                // templates/JavaSDK/services.ts:104:29 //
                // templates/JavaSDK/services.ts:227:15 //
                // templates/JavaSDK/services.ts:227:15
                .method(
                    HttpMethod.GET
                ) // templates/JavaSDK/services.ts:109:18 // templates/JavaSDK/services.ts:109:18
                .addPathSegments("annotation-queues", params.getPathParam(0), "runs")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response
            -> // templates/JavaSDK/services.ts:230:8
            response
                .use { // templates/JavaSDK/services.ts:166:8 //
                    // templates/JavaSDK/services.ts:233:30 //
                    // templates/JavaSDK/services.ts:233:30 //
                    // templates/JavaSDK/services.ts:230:8 // templates/JavaSDK/services.ts:230:8
                    listHandler.handle(it)
                }
                .apply { // templates/JavaSDK/services.ts:176:10
                    if (
                        requestOptions.responseValidation ?: clientOptions.responseValidation
                    ) { // templates/JavaSDK/services.ts:179:14 //
                        // templates/JavaSDK/services.ts:176:10 //
                        // templates/JavaSDK/services.ts:176:10
                        forEach { it.validate() }
                    }
                }
        }
    }

    private val deleteHandler:
        Handler<
            AnnotationQueueRunDeleteResponse
        > = // templates/JavaSDK/services.ts:826:12 // templates/JavaSDK/services.ts:826:12 //
        // templates/JavaSDK/services.ts:825:19
        jsonHandler<AnnotationQueueRunDeleteResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Delete Run From Annotation Queue */
    override fun delete(
        params: AnnotationQueueRunDeleteParams,
        requestOptions: RequestOptions
    ): AnnotationQueueRunDeleteResponse { // templates/JavaSDK/services.ts:831:10
        val request =
            HttpRequest.builder() // templates/JavaSDK/services.ts:107:20 //
                // templates/JavaSDK/services.ts:105:8 //
                // templates/JavaSDK/services.ts:105:8 //
                // templates/JavaSDK/services.ts:104:29 //
                // templates/JavaSDK/services.ts:104:29 //
                // templates/JavaSDK/services.ts:227:15 //
                // templates/JavaSDK/services.ts:227:15
                .method(
                    HttpMethod.DELETE
                ) // templates/JavaSDK/services.ts:109:18 // templates/JavaSDK/services.ts:109:18
                .addPathSegments(
                    "annotation-queues",
                    params.getPathParam(0),
                    "runs",
                    params.getPathParam(1)
                )
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { // templates/JavaSDK/services.ts:118:18
                    params.getBody().ifPresent { // templates/JavaSDK/services.ts:121:41 //
                        // templates/JavaSDK/services.ts:118:18 //
                        // templates/JavaSDK/services.ts:118:18
                        body(json(clientOptions.jsonMapper, it))
                    }
                }
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response
            -> // templates/JavaSDK/services.ts:230:8
            response.use { // templates/JavaSDK/services.ts:166:8 //
                // templates/JavaSDK/services.ts:233:30 //
                // templates/JavaSDK/services.ts:233:30 //
                // templates/JavaSDK/services.ts:230:8 // templates/JavaSDK/services.ts:230:8
                deleteHandler.handle(it)
            }
        }
    }
}

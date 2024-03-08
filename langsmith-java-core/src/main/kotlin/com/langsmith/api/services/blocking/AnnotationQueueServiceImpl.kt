// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

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
) : AnnotationQueueService { // templates/JavaSDK/services.ts:76:15 //
    // templates/JavaSDK/services.ts:76:15 //
    // templates/JavaSDK/services.ts:76:15

    private val errorHandler: Handler<LangSmithError> =
        errorHandler(clientOptions.jsonMapper) // templates/JavaSDK/services.ts:76:15

    private val runs: RunService by lazy { RunServiceImpl(clientOptions) }

    private val queues: QueueService by lazy { QueueServiceImpl(clientOptions) }

    override fun runs(): RunService = runs

    override fun queues(): QueueService = queues

    private val createHandler:
        Handler<
            AnnotationQueueSchema
        > = // templates/JavaSDK/services.ts:826:12 // templates/JavaSDK/services.ts:826:12 //
        // templates/JavaSDK/services.ts:825:19
        jsonHandler<AnnotationQueueSchema>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create Annotation Queue */
    override fun create(
        params: AnnotationQueueCreateParams,
        requestOptions: RequestOptions
    ): AnnotationQueueSchema { // templates/JavaSDK/services.ts:831:10
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
                .addPathSegments("annotation-queues")
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
                        validate()
                    }
                }
        }
    }

    private val updateHandler:
        Handler<
            AnnotationQueueUpdateResponse
        > = // templates/JavaSDK/services.ts:826:12 // templates/JavaSDK/services.ts:826:12 //
        // templates/JavaSDK/services.ts:825:19
        jsonHandler<AnnotationQueueUpdateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Update Annotation Queue */
    override fun update(
        params: AnnotationQueueUpdateParams,
        requestOptions: RequestOptions
    ): AnnotationQueueUpdateResponse { // templates/JavaSDK/services.ts:831:10
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
                .addPathSegments("annotation-queues", params.getPathParam(0))
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
            List<AnnotationQueueSchema>
        > = // templates/JavaSDK/services.ts:826:12 // templates/JavaSDK/services.ts:826:12 //
        // templates/JavaSDK/services.ts:825:19
        jsonHandler<List<AnnotationQueueSchema>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get Annotation Queues */
    override fun list(
        params: AnnotationQueueListParams,
        requestOptions: RequestOptions
    ): List<AnnotationQueueSchema> { // templates/JavaSDK/services.ts:831:10
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
                .addPathSegments("annotation-queues")
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
            AnnotationQueueDeleteResponse
        > = // templates/JavaSDK/services.ts:826:12 // templates/JavaSDK/services.ts:826:12 //
        // templates/JavaSDK/services.ts:825:19
        jsonHandler<AnnotationQueueDeleteResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Delete Annotation Queue */
    override fun delete(
        params: AnnotationQueueDeleteParams,
        requestOptions: RequestOptions
    ): AnnotationQueueDeleteResponse { // templates/JavaSDK/services.ts:831:10
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
                .addPathSegments("annotation-queues", params.getPathParam(0))
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

    private val sizeRetrieveHandler:
        Handler<
            AnnotationQueueSizeSchema
        > = // templates/JavaSDK/services.ts:826:12 // templates/JavaSDK/services.ts:826:12 //
        // templates/JavaSDK/services.ts:825:19
        jsonHandler<AnnotationQueueSizeSchema>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get Size From Annotation Queue */
    override fun sizeRetrieve(
        params: AnnotationQueueSizeRetrieveParams,
        requestOptions: RequestOptions
    ): AnnotationQueueSizeSchema { // templates/JavaSDK/services.ts:831:10
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
                .addPathSegments("annotation-queues", params.getPathParam(0), "size")
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
                    sizeRetrieveHandler.handle(it)
                }
                .apply { // templates/JavaSDK/services.ts:176:10
                    if (
                        requestOptions.responseValidation ?: clientOptions.responseValidation
                    ) { // templates/JavaSDK/services.ts:179:14 //
                        // templates/JavaSDK/services.ts:176:10 //
                        // templates/JavaSDK/services.ts:176:10
                        validate()
                    }
                }
        }
    }
}

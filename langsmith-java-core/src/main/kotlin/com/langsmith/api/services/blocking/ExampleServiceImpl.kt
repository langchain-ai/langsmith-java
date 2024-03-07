// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.Example
import com.langsmith.api.models.ExampleCreateParams
import com.langsmith.api.models.ExampleDeleteParams
import com.langsmith.api.models.ExampleDeleteResponse
import com.langsmith.api.models.ExampleListParams
import com.langsmith.api.models.ExampleRetrieveParams
import com.langsmith.api.models.ExampleUpdateParams
import com.langsmith.api.models.ExampleUpdateResponse
import com.langsmith.api.services.blocking.examples.BulkService
import com.langsmith.api.services.blocking.examples.BulkServiceImpl
import com.langsmith.api.services.blocking.examples.UploadService
import com.langsmith.api.services.blocking.examples.UploadServiceImpl
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.json
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler

class ExampleServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : ExampleService {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val bulk: BulkService by lazy { BulkServiceImpl(clientOptions) }

    private val upload: UploadService by lazy { UploadServiceImpl(clientOptions) }

    override fun bulk(): BulkService = bulk

    override fun upload(): UploadService = upload

    private val createHandler: Handler<Example> =
        jsonHandler<Example>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new example. */
    override fun create(params: ExampleCreateParams, requestOptions: RequestOptions): Example {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("examples")
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

    private val retrieveHandler: Handler<Example> =
        jsonHandler<Example>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a specific example. */
    override fun retrieve(params: ExampleRetrieveParams, requestOptions: RequestOptions): Example {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("examples", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateHandler: Handler<ExampleUpdateResponse> =
        jsonHandler<ExampleUpdateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update a specific example. */
    override fun update(
        params: ExampleUpdateParams,
        requestOptions: RequestOptions
    ): ExampleUpdateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("examples", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { updateHandler.handle(it) }
        }
    }

    private val listHandler: Handler<List<Example>> =
        jsonHandler<List<Example>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get all examples by query params */
    override fun list(params: ExampleListParams, requestOptions: RequestOptions): List<Example> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("examples")
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

    private val deleteHandler: Handler<ExampleDeleteResponse> =
        jsonHandler<ExampleDeleteResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete a specific set of examples. */
    override fun delete(
        params: ExampleDeleteParams,
        requestOptions: RequestOptions
    ): ExampleDeleteResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("examples")
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

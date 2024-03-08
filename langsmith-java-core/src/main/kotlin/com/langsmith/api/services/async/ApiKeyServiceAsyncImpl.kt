// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.async

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.ApiKeyCreateParams
import com.langsmith.api.models.ApiKeyCreateResponse
import com.langsmith.api.models.ApiKeyDeleteParams
import com.langsmith.api.models.ApiKeyGetResponse
import com.langsmith.api.models.ApiKeyRetrieveParams
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.json
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class ApiKeyServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ApiKeyServiceAsync {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<ApiKeyCreateResponse> =
        jsonHandler<ApiKeyCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Generate an api key for the user */
    override fun create(
        params: ApiKeyCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ApiKeyCreateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api-key")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<List<ApiKeyGetResponse>> =
        jsonHandler<List<ApiKeyGetResponse>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get the current tenant's API keys */
    override fun retrieve(
        params: ApiKeyRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<List<ApiKeyGetResponse>> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api-key")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
        }
    }

    private val deleteHandler: Handler<ApiKeyGetResponse> =
        jsonHandler<ApiKeyGetResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete an api key for the user */
    override fun delete(
        params: ApiKeyDeleteParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ApiKeyGetResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("api-key", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { deleteHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}

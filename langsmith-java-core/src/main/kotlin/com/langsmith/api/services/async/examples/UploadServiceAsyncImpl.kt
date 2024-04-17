// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.async.examples

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.Example
import com.langsmith.api.models.ExampleUploadCreateParams
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.multipartFormData
import com.langsmith.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class UploadServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : UploadServiceAsync {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<List<Example>> =
        jsonHandler<List<Example>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new example. */
    override fun create(
        params: ExampleUploadCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<List<Example>> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("examples", "upload", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(multipartFormData(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
        }
    }
}

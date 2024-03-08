// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.async.public.examples

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.PublicExampleRunCreateParams
import com.langsmith.api.models.PublicExampleRunCreateResponse
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.json
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class RunServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : RunServiceAsync {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<PublicExampleRunCreateResponse> =
        jsonHandler<PublicExampleRunCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get examples with associated runs from sessions in a dataset that has been shared. */
    override fun create(
        params: PublicExampleRunCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<PublicExampleRunCreateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("public", params.getPathParam(0), "examples", "runs")
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
}

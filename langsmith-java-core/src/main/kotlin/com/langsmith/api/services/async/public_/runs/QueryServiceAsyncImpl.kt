// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.async.public_.runs

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.ListPublicRunsResponse
import com.langsmith.api.models.PublicRunQueryCreateParams
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.json
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class QueryServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : QueryServiceAsync {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<ListPublicRunsResponse> =
        jsonHandler<ListPublicRunsResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get run by ids or the shared run if not specifed. */
    override fun create(
        params: PublicRunQueryCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ListPublicRunsResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("public", params.getPathParam(0), "runs", "query")
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

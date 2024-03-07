// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.async.public.datasets.runs

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.ListPublicDatasetRunsResponse
import com.langsmith.api.models.PublicDatasetRunQueryCreateParams
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

    private val createHandler: Handler<ListPublicDatasetRunsResponse> =
        jsonHandler<ListPublicDatasetRunsResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get runs in projects run over a dataset that has been shared. */
    override fun create(
        params: PublicDatasetRunQueryCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ListPublicDatasetRunsResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("public", params.getPathParam(0), "datasets", "runs", "query")
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

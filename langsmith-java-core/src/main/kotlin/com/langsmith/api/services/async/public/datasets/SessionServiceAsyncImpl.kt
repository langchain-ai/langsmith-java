// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.async.public.datasets

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.PublicDatasetSessionListParams
import com.langsmith.api.models.TracerSession
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class SessionServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : SessionServiceAsync {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<List<TracerSession>> =
        jsonHandler<List<TracerSession>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get projects run on a dataset that has been shared. */
    override fun list(
        params: PublicDatasetSessionListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<List<TracerSession>> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("public", params.getPathParam(0), "datasets", "sessions")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
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

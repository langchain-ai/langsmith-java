// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.async

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.InfoGetResponse
import com.langsmith.api.models.InfoRetrieveParams
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class InfoServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : InfoServiceAsync {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<InfoGetResponse> =
        jsonHandler<InfoGetResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get information about the current deployment of LangSmith. */
    override fun retrieve(
        params: InfoRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<InfoGetResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("info")
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
                        validate()
                    }
                }
        }
    }
}

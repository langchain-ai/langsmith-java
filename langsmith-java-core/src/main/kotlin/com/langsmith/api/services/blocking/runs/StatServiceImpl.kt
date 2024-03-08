// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.runs

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.RunStatCreateParams
import com.langsmith.api.models.RunStats
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.json
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler

class StatServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : StatService {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<RunStats> =
        jsonHandler<RunStats>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get all runs by query in body payload. */
    override fun create(params: RunStatCreateParams, requestOptions: RequestOptions): RunStats {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("runs", "stats")
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
}

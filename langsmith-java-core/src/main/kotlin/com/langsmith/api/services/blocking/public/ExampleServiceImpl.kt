// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.public

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.Example
import com.langsmith.api.models.PublicExampleListParams
import com.langsmith.api.services.blocking.public.examples.RunService
import com.langsmith.api.services.blocking.public.examples.RunServiceImpl
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler

class ExampleServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : ExampleService {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val runs: RunService by lazy { RunServiceImpl(clientOptions) }

    override fun runs(): RunService = runs

    private val listHandler: Handler<List<Example>> =
        jsonHandler<List<Example>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get example by ids or the shared example if not specifed. */
    override fun list(
        params: PublicExampleListParams,
        requestOptions: RequestOptions
    ): List<Example> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("public", params.getPathParam(0), "examples")
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
}

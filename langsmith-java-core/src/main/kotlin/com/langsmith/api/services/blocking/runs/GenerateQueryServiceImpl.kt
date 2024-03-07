// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.runs

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.ResponseBodyForRunsGenerateQuery
import com.langsmith.api.models.RunGenerateQueryCreateParams
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.json
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler

class GenerateQueryServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : GenerateQueryService {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<ResponseBodyForRunsGenerateQuery> =
        jsonHandler<ResponseBodyForRunsGenerateQuery>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get runs filter expression query for a given natural language query. */
    override fun create(
        params: RunGenerateQueryCreateParams,
        requestOptions: RequestOptions
    ): ResponseBodyForRunsGenerateQuery {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("runs", "generate-query")
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

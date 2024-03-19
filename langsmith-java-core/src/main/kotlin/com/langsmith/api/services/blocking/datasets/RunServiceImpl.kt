// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.datasets

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.DatasetRunCreateParams
import com.langsmith.api.models.DatasetRunCreateResponse
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.json
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler

class RunServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : RunService {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<DatasetRunCreateResponse> =
        jsonHandler<DatasetRunCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Fetch examples for a dataset, and fetch the runs for each example if they are associated with
     * the given session_ids.
     */
    override fun create(
        params: DatasetRunCreateParams,
        requestOptions: RequestOptions
    ): DatasetRunCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("datasets", params.getPathParam(0), "runs")
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

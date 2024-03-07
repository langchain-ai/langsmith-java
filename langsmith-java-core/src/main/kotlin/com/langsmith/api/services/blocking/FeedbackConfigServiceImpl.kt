// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.FeedbackConfigCreateParams
import com.langsmith.api.models.FeedbackConfigListParams
import com.langsmith.api.models.FeedbackConfigSchema
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.json
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler

class FeedbackConfigServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : FeedbackConfigService {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<FeedbackConfigSchema> =
        jsonHandler<FeedbackConfigSchema>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create Feedback Config Endpoint */
    override fun create(
        params: FeedbackConfigCreateParams,
        requestOptions: RequestOptions
    ): FeedbackConfigSchema {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("feedback-configs", "")
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

    private val listHandler: Handler<List<FeedbackConfigSchema>> =
        jsonHandler<List<FeedbackConfigSchema>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Feedback Configs Endpoint */
    override fun list(
        params: FeedbackConfigListParams,
        requestOptions: RequestOptions
    ): List<FeedbackConfigSchema> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("feedback-configs", "")
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

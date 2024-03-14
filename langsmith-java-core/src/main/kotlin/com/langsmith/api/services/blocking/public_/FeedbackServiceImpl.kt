// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.public_

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.FeedbackSchema
import com.langsmith.api.models.PublicFeedbackListParams
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler

class FeedbackServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : FeedbackService {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<List<FeedbackSchema>> =
        jsonHandler<List<FeedbackSchema>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Read Shared Feedbacks */
    override fun list(
        params: PublicFeedbackListParams,
        requestOptions: RequestOptions
    ): List<FeedbackSchema> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("public", params.getPathParam(0), "feedbacks")
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

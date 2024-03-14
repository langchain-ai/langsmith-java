// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.public_.datasets

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.FeedbackSchema
import com.langsmith.api.models.PublicDatasetFeedbackRetrieveParams
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler

class FeedbackServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : FeedbackService {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<List<FeedbackSchema>> =
        jsonHandler<List<FeedbackSchema>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get feedback for runs in projects run over a dataset that has been shared. */
    override fun retrieve(
        params: PublicDatasetFeedbackRetrieveParams,
        requestOptions: RequestOptions
    ): List<FeedbackSchema> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("public", params.getPathParam(0), "datasets", "feedback")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
        }
    }
}

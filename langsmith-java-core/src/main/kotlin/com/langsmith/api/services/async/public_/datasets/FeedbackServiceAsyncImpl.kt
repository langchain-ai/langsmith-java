// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.async.public_.datasets

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
import java.util.concurrent.CompletableFuture

class FeedbackServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : FeedbackServiceAsync {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<List<FeedbackSchema>> =
        jsonHandler<List<FeedbackSchema>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get feedback for runs in projects run over a dataset that has been shared. */
    override fun retrieve(
        params: PublicDatasetFeedbackRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<List<FeedbackSchema>> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("public", params.getPathParam(0), "datasets", "feedback")
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
                        forEach { it.validate() }
                    }
                }
        }
    }
}

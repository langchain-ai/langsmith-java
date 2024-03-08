// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.async.datasets

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.DatasetOpenAIRetrieveParams
import com.langsmith.api.models.DatasetOpenAIRetrieveResponse
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class OpenAIServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : OpenAIServiceAsync {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<DatasetOpenAIRetrieveResponse> =
        jsonHandler<DatasetOpenAIRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Download a dataset as OpenAI Evals Jsonl format. */
    override fun retrieve(
        params: DatasetOpenAIRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<DatasetOpenAIRetrieveResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("datasets", params.getPathParam(0), "openai")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response.use { retrieveHandler.handle(it) }
        }
    }
}

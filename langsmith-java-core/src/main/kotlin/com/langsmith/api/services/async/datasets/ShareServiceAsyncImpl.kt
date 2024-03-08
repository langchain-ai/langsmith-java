// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.async.datasets

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.DatasetShareRetrieveParams
import com.langsmith.api.models.DatasetShareSchema
import com.langsmith.api.models.DatasetShareUpdateParams
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.json
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class ShareServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ShareServiceAsync {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<DatasetShareSchema> =
        jsonHandler<DatasetShareSchema>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get the state of sharing of a run. */
    override fun retrieve(
        params: DatasetShareRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<DatasetShareSchema> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("datasets", params.getPathParam(0), "share")
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

    private val updateHandler: Handler<DatasetShareSchema> =
        jsonHandler<DatasetShareSchema>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Share a dataset. */
    override fun update(
        params: DatasetShareUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<DatasetShareSchema> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("datasets", params.getPathParam(0), "share")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.async.public.datasets

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.PublicDatasetRunRetrieveParams
import com.langsmith.api.models.RunPublicDatasetSchema
import com.langsmith.api.services.async.public.datasets.runs.QueryServiceAsync
import com.langsmith.api.services.async.public.datasets.runs.QueryServiceAsyncImpl
import com.langsmith.api.services.async.public.datasets.runs.StatServiceAsync
import com.langsmith.api.services.async.public.datasets.runs.StatServiceAsyncImpl
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class RunServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : RunServiceAsync {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val query: QueryServiceAsync by lazy { QueryServiceAsyncImpl(clientOptions) }

    private val stats: StatServiceAsync by lazy { StatServiceAsyncImpl(clientOptions) }

    override fun query(): QueryServiceAsync = query

    override fun stats(): StatServiceAsync = stats

    private val retrieveHandler: Handler<RunPublicDatasetSchema> =
        jsonHandler<RunPublicDatasetSchema>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get runs in projects run over a dataset that has been shared. */
    override fun retrieve(
        params: PublicDatasetRunRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<RunPublicDatasetSchema> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "public",
                    params.getPathParam(0),
                    "datasets",
                    "runs",
                    params.getPathParam(1)
                )
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
}

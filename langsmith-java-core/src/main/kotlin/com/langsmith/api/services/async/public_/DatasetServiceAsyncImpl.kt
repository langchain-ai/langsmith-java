// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.async.public_

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.DatasetPublicSchema
import com.langsmith.api.models.PublicDatasetListParams
import com.langsmith.api.services.async.public_.datasets.FeedbackServiceAsync
import com.langsmith.api.services.async.public_.datasets.FeedbackServiceAsyncImpl
import com.langsmith.api.services.async.public_.datasets.RunServiceAsync
import com.langsmith.api.services.async.public_.datasets.RunServiceAsyncImpl
import com.langsmith.api.services.async.public_.datasets.SessionServiceAsync
import com.langsmith.api.services.async.public_.datasets.SessionServiceAsyncImpl
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class DatasetServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : DatasetServiceAsync {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val sessions: SessionServiceAsync by lazy { SessionServiceAsyncImpl(clientOptions) }

    private val runs: RunServiceAsync by lazy { RunServiceAsyncImpl(clientOptions) }

    private val feedback: FeedbackServiceAsync by lazy { FeedbackServiceAsyncImpl(clientOptions) }

    override fun sessions(): SessionServiceAsync = sessions

    override fun runs(): RunServiceAsync = runs

    override fun feedback(): FeedbackServiceAsync = feedback

    private val listHandler: Handler<DatasetPublicSchema> =
        jsonHandler<DatasetPublicSchema>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get dataset by ids or the shared dataset if not specifed. */
    override fun list(
        params: PublicDatasetListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<DatasetPublicSchema> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("public", params.getPathParam(0), "datasets")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}

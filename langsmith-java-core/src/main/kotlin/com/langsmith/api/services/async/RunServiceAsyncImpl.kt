// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.async

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.RunBatchParams
import com.langsmith.api.models.RunBatchResponse
import com.langsmith.api.models.RunCreateParams
import com.langsmith.api.models.RunCreateResponse
import com.langsmith.api.models.RunRetrieveParams
import com.langsmith.api.models.RunSchema
import com.langsmith.api.models.RunUpdateParams
import com.langsmith.api.models.RunUpdateResponse
import com.langsmith.api.services.async.runs.GenerateQueryServiceAsync
import com.langsmith.api.services.async.runs.GenerateQueryServiceAsyncImpl
import com.langsmith.api.services.async.runs.MonitorServiceAsync
import com.langsmith.api.services.async.runs.MonitorServiceAsyncImpl
import com.langsmith.api.services.async.runs.QueryServiceAsync
import com.langsmith.api.services.async.runs.QueryServiceAsyncImpl
import com.langsmith.api.services.async.runs.ShareServiceAsync
import com.langsmith.api.services.async.runs.ShareServiceAsyncImpl
import com.langsmith.api.services.async.runs.StatServiceAsync
import com.langsmith.api.services.async.runs.StatServiceAsyncImpl
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.json
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class RunServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : RunServiceAsync {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val share: ShareServiceAsync by lazy { ShareServiceAsyncImpl(clientOptions) }

    private val query: QueryServiceAsync by lazy { QueryServiceAsyncImpl(clientOptions) }

    private val generateQuery: GenerateQueryServiceAsync by lazy {
        GenerateQueryServiceAsyncImpl(clientOptions)
    }

    private val stats: StatServiceAsync by lazy { StatServiceAsyncImpl(clientOptions) }

    private val monitor: MonitorServiceAsync by lazy { MonitorServiceAsyncImpl(clientOptions) }

    override fun share(): ShareServiceAsync = share

    override fun query(): QueryServiceAsync = query

    override fun generateQuery(): GenerateQueryServiceAsync = generateQuery

    override fun stats(): StatServiceAsync = stats

    override fun monitor(): MonitorServiceAsync = monitor

    private val createHandler: Handler<RunCreateResponse> =
        jsonHandler<RunCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new run. */
    override fun create(
        params: RunCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<RunCreateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("runs")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response.use { createHandler.handle(it) }
        }
    }

    private val retrieveHandler: Handler<RunSchema> =
        jsonHandler<RunSchema>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a specific run. */
    override fun retrieve(
        params: RunRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<RunSchema> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("runs", params.getPathParam(0))
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

    private val updateHandler: Handler<RunUpdateResponse> =
        jsonHandler<RunUpdateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update a run. */
    override fun update(
        params: RunUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<RunUpdateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("runs", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response.use { updateHandler.handle(it) }
        }
    }

    private val batchHandler: Handler<RunBatchResponse> =
        jsonHandler<RunBatchResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Batch ingest runs. */
    override fun batch(
        params: RunBatchParams,
        requestOptions: RequestOptions
    ): CompletableFuture<RunBatchResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("runs", "batch")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response.use { batchHandler.handle(it) }
        }
    }
}

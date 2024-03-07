// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking

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
import com.langsmith.api.services.blocking.runs.GenerateQueryService
import com.langsmith.api.services.blocking.runs.GenerateQueryServiceImpl
import com.langsmith.api.services.blocking.runs.MonitorService
import com.langsmith.api.services.blocking.runs.MonitorServiceImpl
import com.langsmith.api.services.blocking.runs.QueryService
import com.langsmith.api.services.blocking.runs.QueryServiceImpl
import com.langsmith.api.services.blocking.runs.ShareService
import com.langsmith.api.services.blocking.runs.ShareServiceImpl
import com.langsmith.api.services.blocking.runs.StatService
import com.langsmith.api.services.blocking.runs.StatServiceImpl
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.json
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler

class RunServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : RunService {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val share: ShareService by lazy { ShareServiceImpl(clientOptions) }

    private val query: QueryService by lazy { QueryServiceImpl(clientOptions) }

    private val generateQuery: GenerateQueryService by lazy {
        GenerateQueryServiceImpl(clientOptions)
    }

    private val stats: StatService by lazy { StatServiceImpl(clientOptions) }

    private val monitor: MonitorService by lazy { MonitorServiceImpl(clientOptions) }

    override fun share(): ShareService = share

    override fun query(): QueryService = query

    override fun generateQuery(): GenerateQueryService = generateQuery

    override fun stats(): StatService = stats

    override fun monitor(): MonitorService = monitor

    private val createHandler: Handler<RunCreateResponse> =
        jsonHandler<RunCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new run. */
    override fun create(
        params: RunCreateParams,
        requestOptions: RequestOptions
    ): RunCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("runs")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { createHandler.handle(it) }
        }
    }

    private val retrieveHandler: Handler<RunSchema> =
        jsonHandler<RunSchema>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a specific run. */
    override fun retrieve(params: RunRetrieveParams, requestOptions: RequestOptions): RunSchema {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("runs", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
    ): RunUpdateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("runs", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { updateHandler.handle(it) }
        }
    }

    private val batchHandler: Handler<RunBatchResponse> =
        jsonHandler<RunBatchResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Batch ingest runs. */
    override fun batch(params: RunBatchParams, requestOptions: RequestOptions): RunBatchResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("runs", "batch")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { batchHandler.handle(it) }
        }
    }
}

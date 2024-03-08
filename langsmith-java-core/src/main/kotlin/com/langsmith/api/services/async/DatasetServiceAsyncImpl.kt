// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.async

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.Dataset
import com.langsmith.api.models.DatasetCreateParams
import com.langsmith.api.models.DatasetDeleteParams
import com.langsmith.api.models.DatasetDeleteResponse
import com.langsmith.api.models.DatasetListParams
import com.langsmith.api.models.DatasetRetrieveParams
import com.langsmith.api.models.DatasetSchemaForUpdate
import com.langsmith.api.models.DatasetUpdateParams
import com.langsmith.api.models.DatasetUploadParams
import com.langsmith.api.services.async.datasets.CsvServiceAsync
import com.langsmith.api.services.async.datasets.CsvServiceAsyncImpl
import com.langsmith.api.services.async.datasets.OpenAIFtServiceAsync
import com.langsmith.api.services.async.datasets.OpenAIFtServiceAsyncImpl
import com.langsmith.api.services.async.datasets.OpenAIServiceAsync
import com.langsmith.api.services.async.datasets.OpenAIServiceAsyncImpl
import com.langsmith.api.services.async.datasets.RunServiceAsync
import com.langsmith.api.services.async.datasets.RunServiceAsyncImpl
import com.langsmith.api.services.async.datasets.ShareServiceAsync
import com.langsmith.api.services.async.datasets.ShareServiceAsyncImpl
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.json
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class DatasetServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : DatasetServiceAsync {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val openai: OpenAIServiceAsync by lazy { OpenAIServiceAsyncImpl(clientOptions) }

    private val openaiFt: OpenAIFtServiceAsync by lazy { OpenAIFtServiceAsyncImpl(clientOptions) }

    private val csv: CsvServiceAsync by lazy { CsvServiceAsyncImpl(clientOptions) }

    private val runs: RunServiceAsync by lazy { RunServiceAsyncImpl(clientOptions) }

    private val share: ShareServiceAsync by lazy { ShareServiceAsyncImpl(clientOptions) }

    override fun openai(): OpenAIServiceAsync = openai

    override fun openaiFt(): OpenAIFtServiceAsync = openaiFt

    override fun csv(): CsvServiceAsync = csv

    override fun runs(): RunServiceAsync = runs

    override fun share(): ShareServiceAsync = share

    private val createHandler: Handler<Dataset> =
        jsonHandler<Dataset>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new dataset. */
    override fun create(
        params: DatasetCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Dataset> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("datasets")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<Dataset> =
        jsonHandler<Dataset>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a specific dataset. */
    override fun retrieve(
        params: DatasetRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Dataset> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("datasets", params.getPathParam(0))
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

    private val updateHandler: Handler<DatasetSchemaForUpdate> =
        jsonHandler<DatasetSchemaForUpdate>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update a specific dataset. */
    override fun update(
        params: DatasetUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<DatasetSchemaForUpdate> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("datasets", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
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

    private val listHandler: Handler<List<Dataset>> =
        jsonHandler<List<Dataset>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get all datasets by query params and owner. */
    override fun list(
        params: DatasetListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<List<Dataset>> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("datasets")
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
                        forEach { it.validate() }
                    }
                }
        }
    }

    private val deleteHandler: Handler<DatasetDeleteResponse> =
        jsonHandler<DatasetDeleteResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete a specific dataset. */
    override fun delete(
        params: DatasetDeleteParams,
        requestOptions: RequestOptions
    ): CompletableFuture<DatasetDeleteResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("datasets", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response.use { deleteHandler.handle(it) }
        }
    }

    private val uploadHandler: Handler<Dataset> =
        jsonHandler<Dataset>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new dataset from a CSV file. */
    override fun upload(
        params: DatasetUploadParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Dataset> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("datasets", "upload")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { uploadHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}

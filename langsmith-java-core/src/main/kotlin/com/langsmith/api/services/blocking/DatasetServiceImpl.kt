// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking

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
import com.langsmith.api.services.blocking.datasets.CsvService
import com.langsmith.api.services.blocking.datasets.CsvServiceImpl
import com.langsmith.api.services.blocking.datasets.OpenAIFtService
import com.langsmith.api.services.blocking.datasets.OpenAIFtServiceImpl
import com.langsmith.api.services.blocking.datasets.OpenAIService
import com.langsmith.api.services.blocking.datasets.OpenAIServiceImpl
import com.langsmith.api.services.blocking.datasets.RunService
import com.langsmith.api.services.blocking.datasets.RunServiceImpl
import com.langsmith.api.services.blocking.datasets.ShareService
import com.langsmith.api.services.blocking.datasets.ShareServiceImpl
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.json
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler

class DatasetServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : DatasetService {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val openai: OpenAIService by lazy { OpenAIServiceImpl(clientOptions) }

    private val openaiFt: OpenAIFtService by lazy { OpenAIFtServiceImpl(clientOptions) }

    private val csv: CsvService by lazy { CsvServiceImpl(clientOptions) }

    private val runs: RunService by lazy { RunServiceImpl(clientOptions) }

    private val share: ShareService by lazy { ShareServiceImpl(clientOptions) }

    override fun openai(): OpenAIService = openai

    override fun openaiFt(): OpenAIFtService = openaiFt

    override fun csv(): CsvService = csv

    override fun runs(): RunService = runs

    override fun share(): ShareService = share

    private val createHandler: Handler<Dataset> =
        jsonHandler<Dataset>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new dataset. */
    override fun create(params: DatasetCreateParams, requestOptions: RequestOptions): Dataset {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("datasets")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
    override fun retrieve(params: DatasetRetrieveParams, requestOptions: RequestOptions): Dataset {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("datasets", params.getPathParam(0))
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

    private val updateHandler: Handler<DatasetSchemaForUpdate> =
        jsonHandler<DatasetSchemaForUpdate>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update a specific dataset. */
    override fun update(
        params: DatasetUpdateParams,
        requestOptions: RequestOptions
    ): DatasetSchemaForUpdate {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("datasets", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
    override fun list(params: DatasetListParams, requestOptions: RequestOptions): List<Dataset> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("datasets")
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

    private val deleteHandler: Handler<DatasetDeleteResponse> =
        jsonHandler<DatasetDeleteResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete a specific dataset. */
    override fun delete(
        params: DatasetDeleteParams,
        requestOptions: RequestOptions
    ): DatasetDeleteResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("datasets", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { deleteHandler.handle(it) }
        }
    }

    private val uploadHandler: Handler<Dataset> =
        jsonHandler<Dataset>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new dataset from a CSV file. */
    override fun upload(params: DatasetUploadParams, requestOptions: RequestOptions): Dataset {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("datasets", "upload")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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

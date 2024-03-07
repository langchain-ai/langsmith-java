// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.datasets

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.DatasetCsvRetrieveParams
import com.langsmith.api.models.DatasetCsvRetrieveResponse
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler

class CsvServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : CsvService {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<DatasetCsvRetrieveResponse> =
        jsonHandler<DatasetCsvRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Download a dataset as CSV format. */
    override fun retrieve(
        params: DatasetCsvRetrieveParams,
        requestOptions: RequestOptions
    ): DatasetCsvRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("datasets", params.getPathParam(0), "csv")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { retrieveHandler.handle(it) }
        }
    }
}

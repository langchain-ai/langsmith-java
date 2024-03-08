// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.public.datasets

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.PublicDatasetRunRetrieveParams
import com.langsmith.api.models.RunPublicDatasetSchema
import com.langsmith.api.services.blocking.public.datasets.runs.QueryService
import com.langsmith.api.services.blocking.public.datasets.runs.QueryServiceImpl
import com.langsmith.api.services.blocking.public.datasets.runs.StatService
import com.langsmith.api.services.blocking.public.datasets.runs.StatServiceImpl
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler

class RunServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : RunService {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val query: QueryService by lazy { QueryServiceImpl(clientOptions) }

    private val stats: StatService by lazy { StatServiceImpl(clientOptions) }

    override fun query(): QueryService = query

    override fun stats(): StatService = stats

    private val retrieveHandler: Handler<RunPublicDatasetSchema> =
        jsonHandler<RunPublicDatasetSchema>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get runs in projects run over a dataset that has been shared. */
    override fun retrieve(
        params: PublicDatasetRunRetrieveParams,
        requestOptions: RequestOptions
    ): RunPublicDatasetSchema {
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
}

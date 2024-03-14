// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.public_.datasets

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.PublicDatasetSessionListParams
import com.langsmith.api.models.TracerSession
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler

class SessionServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : SessionService {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<List<TracerSession>> =
        jsonHandler<List<TracerSession>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get projects run on a dataset that has been shared. */
    override fun list(
        params: PublicDatasetSessionListParams,
        requestOptions: RequestOptions
    ): List<TracerSession> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("public", params.getPathParam(0), "datasets", "sessions")
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
}

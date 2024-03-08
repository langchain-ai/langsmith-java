// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.sessions

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.SessionMetadataRetrieveParams
import com.langsmith.api.models.TracerSessionMetadataResponse
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler

class MetadataServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : MetadataService {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<TracerSessionMetadataResponse> =
        jsonHandler<TracerSessionMetadataResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Given a session, a number K, and (optionally) a list of metadata keys, return the top K
     * values for each key.
     */
    override fun retrieve(
        params: SessionMetadataRetrieveParams,
        requestOptions: RequestOptions
    ): TracerSessionMetadataResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("sessions", params.getPathParam(0), "metadata")
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

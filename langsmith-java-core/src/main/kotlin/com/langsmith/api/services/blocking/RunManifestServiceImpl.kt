// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.RunManifestRetrieveParams
import com.langsmith.api.models.RunManifestSchema
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler

class RunManifestServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : RunManifestService {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<RunManifestSchema> =
        jsonHandler<RunManifestSchema>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a specific run manifest. */
    override fun retrieve(
        params: RunManifestRetrieveParams,
        requestOptions: RequestOptions
    ): RunManifestSchema {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("run-manifests", params.getPathParam(0))
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

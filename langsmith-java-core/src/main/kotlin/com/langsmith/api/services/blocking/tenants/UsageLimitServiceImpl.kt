// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.tenants

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.TenantUsageLimitInfo
import com.langsmith.api.models.TenantUsageLimitListParams
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler

class UsageLimitServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : UsageLimitService {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<TenantUsageLimitInfo> =
        jsonHandler<TenantUsageLimitInfo>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get Current Tenant Usage Limits Info */
    override fun list(
        params: TenantUsageLimitListParams,
        requestOptions: RequestOptions
    ): TenantUsageLimitInfo {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("tenants", "current", "usage_limits")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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

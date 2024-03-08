// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.async.tenants

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
import java.util.concurrent.CompletableFuture

class UsageLimitServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : UsageLimitServiceAsync {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<TenantUsageLimitInfo> =
        jsonHandler<TenantUsageLimitInfo>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get Current Tenant Usage Limits Info */
    override fun list(
        params: TenantUsageLimitListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<TenantUsageLimitInfo> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("tenants", "current", "usage_limits")
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
                        validate()
                    }
                }
        }
    }
}

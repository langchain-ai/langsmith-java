// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.tenants

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.TenantPendingClaimCreateParams
import com.langsmith.api.models.TenantPendingClaimCreateResponse
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.json
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler

class PendingServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : PendingService {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val claimCreateHandler: Handler<TenantPendingClaimCreateResponse> =
        jsonHandler<TenantPendingClaimCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Claim Pending Tenant Invite */
    override fun claimCreate(
        params: TenantPendingClaimCreateParams,
        requestOptions: RequestOptions
    ): TenantPendingClaimCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("tenants", "pending", params.getPathParam(0), "claim")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { claimCreateHandler.handle(it) }
        }
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.tenants.members

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.TenantMemberPendingDeleteParams
import com.langsmith.api.models.TenantMemberPendingDeleteResponse
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.json
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler

class PendingServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : PendingService {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val deleteHandler: Handler<TenantMemberPendingDeleteResponse> =
        jsonHandler<TenantMemberPendingDeleteResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Delete Current Tenant Pending Member */
    override fun delete(
        params: TenantMemberPendingDeleteParams,
        requestOptions: RequestOptions
    ): TenantMemberPendingDeleteResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("tenants", "current", "members", params.getPathParam(0), "pending")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { deleteHandler.handle(it) }
        }
    }
}

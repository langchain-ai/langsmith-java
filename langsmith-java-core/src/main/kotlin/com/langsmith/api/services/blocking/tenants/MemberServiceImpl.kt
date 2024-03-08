// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.tenants

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.TenantMemberDeleteParams
import com.langsmith.api.models.TenantMemberDeleteResponse
import com.langsmith.api.services.blocking.tenants.members.PendingService
import com.langsmith.api.services.blocking.tenants.members.PendingServiceImpl
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.json
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler

class MemberServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : MemberService {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val pending: PendingService by lazy { PendingServiceImpl(clientOptions) }

    override fun pending(): PendingService = pending

    private val deleteHandler: Handler<TenantMemberDeleteResponse> =
        jsonHandler<TenantMemberDeleteResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Delete Current Tenant Member */
    override fun delete(
        params: TenantMemberDeleteParams,
        requestOptions: RequestOptions
    ): TenantMemberDeleteResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("tenants", "current", "members", params.getPathParam(0))
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

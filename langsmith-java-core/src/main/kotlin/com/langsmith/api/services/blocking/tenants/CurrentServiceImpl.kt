// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.tenants

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.PendingIdentity
import com.langsmith.api.models.TenantCurrentMembersCreateParams
import com.langsmith.api.models.TenantCurrentMembersListParams
import com.langsmith.api.models.TenantCurrentStatsRetrieveParams
import com.langsmith.api.models.TenantMembers
import com.langsmith.api.models.TenantStats
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.json
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler

class CurrentServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : CurrentService {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val membersCreateHandler: Handler<PendingIdentity> =
        jsonHandler<PendingIdentity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Add Member To Current Tenant */
    override fun membersCreate(
        params: TenantCurrentMembersCreateParams,
        requestOptions: RequestOptions
    ): PendingIdentity {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("tenants", "current", "members")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { membersCreateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val membersListHandler: Handler<TenantMembers> =
        jsonHandler<TenantMembers>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get Current Tenant Members */
    override fun membersList(
        params: TenantCurrentMembersListParams,
        requestOptions: RequestOptions
    ): TenantMembers {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("tenants", "current", "members")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { membersListHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val statsRetrieveHandler: Handler<TenantStats> =
        jsonHandler<TenantStats>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get Current Tenant Stats */
    override fun statsRetrieve(
        params: TenantCurrentStatsRetrieveParams,
        requestOptions: RequestOptions
    ): TenantStats {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("tenants", "current", "stats")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { statsRetrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}

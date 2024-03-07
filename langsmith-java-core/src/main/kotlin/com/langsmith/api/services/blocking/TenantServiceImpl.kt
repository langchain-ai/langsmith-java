// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.Tenant
import com.langsmith.api.models.TenantCreateParams
import com.langsmith.api.models.TenantForUser
import com.langsmith.api.models.TenantListParams
import com.langsmith.api.models.TenantPendingDeleteParams
import com.langsmith.api.models.TenantPendingDeleteResponse
import com.langsmith.api.models.TenantPendingListParams
import com.langsmith.api.models.TenantStats
import com.langsmith.api.models.TenantStatsListParams
import com.langsmith.api.services.blocking.tenants.CurrentService
import com.langsmith.api.services.blocking.tenants.CurrentServiceImpl
import com.langsmith.api.services.blocking.tenants.MemberService
import com.langsmith.api.services.blocking.tenants.MemberServiceImpl
import com.langsmith.api.services.blocking.tenants.PendingService
import com.langsmith.api.services.blocking.tenants.PendingServiceImpl
import com.langsmith.api.services.blocking.tenants.UsageLimitService
import com.langsmith.api.services.blocking.tenants.UsageLimitServiceImpl
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.json
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler

class TenantServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : TenantService {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val pending: PendingService by lazy { PendingServiceImpl(clientOptions) }

    private val current: CurrentService by lazy { CurrentServiceImpl(clientOptions) }

    private val members: MemberService by lazy { MemberServiceImpl(clientOptions) }

    private val usageLimits: UsageLimitService by lazy { UsageLimitServiceImpl(clientOptions) }

    override fun pending(): PendingService = pending

    override fun current(): CurrentService = current

    override fun members(): MemberService = members

    override fun usageLimits(): UsageLimitService = usageLimits

    private val createHandler: Handler<Tenant> =
        jsonHandler<Tenant>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new tenant. */
    override fun create(params: TenantCreateParams, requestOptions: RequestOptions): Tenant {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("tenants")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<List<TenantForUser>> =
        jsonHandler<List<TenantForUser>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get all tenants visible to this auth */
    override fun list(
        params: TenantListParams,
        requestOptions: RequestOptions
    ): List<TenantForUser> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("tenants")
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

    private val pendingDeleteHandler: Handler<TenantPendingDeleteResponse> =
        jsonHandler<TenantPendingDeleteResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Delete Pending Tenant Invite */
    override fun pendingDelete(
        params: TenantPendingDeleteParams,
        requestOptions: RequestOptions
    ): TenantPendingDeleteResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("tenants", "pending", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { pendingDeleteHandler.handle(it) }
        }
    }

    private val pendingListHandler: Handler<List<Tenant>> =
        jsonHandler<List<Tenant>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get all tenants visible to this auth */
    override fun pendingList(
        params: TenantPendingListParams,
        requestOptions: RequestOptions
    ): List<Tenant> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("tenants", "pending")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { pendingListHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
        }
    }

    private val statsListHandler: Handler<TenantStats> =
        jsonHandler<TenantStats>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get Current Tenant Stats */
    override fun statsList(
        params: TenantStatsListParams,
        requestOptions: RequestOptions
    ): TenantStats {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("tenants", "stats")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { statsListHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}

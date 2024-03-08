// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.async

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
import com.langsmith.api.services.async.tenants.CurrentServiceAsync
import com.langsmith.api.services.async.tenants.CurrentServiceAsyncImpl
import com.langsmith.api.services.async.tenants.MemberServiceAsync
import com.langsmith.api.services.async.tenants.MemberServiceAsyncImpl
import com.langsmith.api.services.async.tenants.PendingServiceAsync
import com.langsmith.api.services.async.tenants.PendingServiceAsyncImpl
import com.langsmith.api.services.async.tenants.UsageLimitServiceAsync
import com.langsmith.api.services.async.tenants.UsageLimitServiceAsyncImpl
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.json
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class TenantServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : TenantServiceAsync {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val pending: PendingServiceAsync by lazy { PendingServiceAsyncImpl(clientOptions) }

    private val current: CurrentServiceAsync by lazy { CurrentServiceAsyncImpl(clientOptions) }

    private val members: MemberServiceAsync by lazy { MemberServiceAsyncImpl(clientOptions) }

    private val usageLimits: UsageLimitServiceAsync by lazy {
        UsageLimitServiceAsyncImpl(clientOptions)
    }

    override fun pending(): PendingServiceAsync = pending

    override fun current(): CurrentServiceAsync = current

    override fun members(): MemberServiceAsync = members

    override fun usageLimits(): UsageLimitServiceAsync = usageLimits

    private val createHandler: Handler<Tenant> =
        jsonHandler<Tenant>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new tenant. */
    override fun create(
        params: TenantCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Tenant> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("tenants")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
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
    ): CompletableFuture<List<TenantForUser>> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("tenants")
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
    ): CompletableFuture<TenantPendingDeleteResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("tenants", "pending", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response.use { pendingDeleteHandler.handle(it) }
        }
    }

    private val pendingListHandler: Handler<List<Tenant>> =
        jsonHandler<List<Tenant>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get all tenants visible to this auth */
    override fun pendingList(
        params: TenantPendingListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<List<Tenant>> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("tenants", "pending")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
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
    ): CompletableFuture<TenantStats> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("tenants", "stats")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
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

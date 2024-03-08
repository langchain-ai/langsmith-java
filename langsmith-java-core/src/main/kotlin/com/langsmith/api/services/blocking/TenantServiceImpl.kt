// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

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
) : TenantService { // templates/JavaSDK/services.ts:76:15 // templates/JavaSDK/services.ts:76:15 //
    // templates/JavaSDK/services.ts:76:15

    private val errorHandler: Handler<LangSmithError> =
        errorHandler(clientOptions.jsonMapper) // templates/JavaSDK/services.ts:76:15

    private val pending: PendingService by lazy { PendingServiceImpl(clientOptions) }

    private val current: CurrentService by lazy { CurrentServiceImpl(clientOptions) }

    private val members: MemberService by lazy { MemberServiceImpl(clientOptions) }

    private val usageLimits: UsageLimitService by lazy { UsageLimitServiceImpl(clientOptions) }

    override fun pending(): PendingService = pending

    override fun current(): CurrentService = current

    override fun members(): MemberService = members

    override fun usageLimits(): UsageLimitService = usageLimits

    private val createHandler:
        Handler<
            Tenant
        > = // templates/JavaSDK/services.ts:826:12 // templates/JavaSDK/services.ts:826:12 //
        // templates/JavaSDK/services.ts:825:19
        jsonHandler<Tenant>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new tenant. */
    override fun create(
        params: TenantCreateParams,
        requestOptions: RequestOptions
    ): Tenant { // templates/JavaSDK/services.ts:831:10
        val request =
            HttpRequest.builder() // templates/JavaSDK/services.ts:107:20 //
                // templates/JavaSDK/services.ts:105:8 //
                // templates/JavaSDK/services.ts:105:8 //
                // templates/JavaSDK/services.ts:104:29 //
                // templates/JavaSDK/services.ts:104:29 //
                // templates/JavaSDK/services.ts:227:15 //
                // templates/JavaSDK/services.ts:227:15
                .method(
                    HttpMethod.POST
                ) // templates/JavaSDK/services.ts:109:18 // templates/JavaSDK/services.ts:109:18
                .addPathSegments("tenants")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response
            -> // templates/JavaSDK/services.ts:230:8
            response
                .use { // templates/JavaSDK/services.ts:166:8 //
                    // templates/JavaSDK/services.ts:233:30 //
                    // templates/JavaSDK/services.ts:233:30 //
                    // templates/JavaSDK/services.ts:230:8 // templates/JavaSDK/services.ts:230:8
                    createHandler.handle(it)
                }
                .apply { // templates/JavaSDK/services.ts:176:10
                    if (
                        requestOptions.responseValidation ?: clientOptions.responseValidation
                    ) { // templates/JavaSDK/services.ts:179:14 //
                        // templates/JavaSDK/services.ts:176:10 //
                        // templates/JavaSDK/services.ts:176:10
                        validate()
                    }
                }
        }
    }

    private val listHandler:
        Handler<
            List<TenantForUser>
        > = // templates/JavaSDK/services.ts:826:12 // templates/JavaSDK/services.ts:826:12 //
        // templates/JavaSDK/services.ts:825:19
        jsonHandler<List<TenantForUser>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get all tenants visible to this auth */
    override fun list(
        params: TenantListParams,
        requestOptions: RequestOptions
    ): List<TenantForUser> { // templates/JavaSDK/services.ts:831:10
        val request =
            HttpRequest.builder() // templates/JavaSDK/services.ts:107:20 //
                // templates/JavaSDK/services.ts:105:8 //
                // templates/JavaSDK/services.ts:105:8 //
                // templates/JavaSDK/services.ts:104:29 //
                // templates/JavaSDK/services.ts:104:29 //
                // templates/JavaSDK/services.ts:227:15 //
                // templates/JavaSDK/services.ts:227:15
                .method(
                    HttpMethod.GET
                ) // templates/JavaSDK/services.ts:109:18 // templates/JavaSDK/services.ts:109:18
                .addPathSegments("tenants")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response
            -> // templates/JavaSDK/services.ts:230:8
            response
                .use { // templates/JavaSDK/services.ts:166:8 //
                    // templates/JavaSDK/services.ts:233:30 //
                    // templates/JavaSDK/services.ts:233:30 //
                    // templates/JavaSDK/services.ts:230:8 // templates/JavaSDK/services.ts:230:8
                    listHandler.handle(it)
                }
                .apply { // templates/JavaSDK/services.ts:176:10
                    if (
                        requestOptions.responseValidation ?: clientOptions.responseValidation
                    ) { // templates/JavaSDK/services.ts:179:14 //
                        // templates/JavaSDK/services.ts:176:10 //
                        // templates/JavaSDK/services.ts:176:10
                        forEach { it.validate() }
                    }
                }
        }
    }

    private val pendingDeleteHandler:
        Handler<
            TenantPendingDeleteResponse
        > = // templates/JavaSDK/services.ts:826:12 // templates/JavaSDK/services.ts:826:12 //
        // templates/JavaSDK/services.ts:825:19
        jsonHandler<TenantPendingDeleteResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Delete Pending Tenant Invite */
    override fun pendingDelete(
        params: TenantPendingDeleteParams,
        requestOptions: RequestOptions
    ): TenantPendingDeleteResponse { // templates/JavaSDK/services.ts:831:10
        val request =
            HttpRequest.builder() // templates/JavaSDK/services.ts:107:20 //
                // templates/JavaSDK/services.ts:105:8 //
                // templates/JavaSDK/services.ts:105:8 //
                // templates/JavaSDK/services.ts:104:29 //
                // templates/JavaSDK/services.ts:104:29 //
                // templates/JavaSDK/services.ts:227:15 //
                // templates/JavaSDK/services.ts:227:15
                .method(
                    HttpMethod.DELETE
                ) // templates/JavaSDK/services.ts:109:18 // templates/JavaSDK/services.ts:109:18
                .addPathSegments("tenants", "pending", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { // templates/JavaSDK/services.ts:118:18
                    params.getBody().ifPresent { // templates/JavaSDK/services.ts:121:41 //
                        // templates/JavaSDK/services.ts:118:18 //
                        // templates/JavaSDK/services.ts:118:18
                        body(json(clientOptions.jsonMapper, it))
                    }
                }
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response
            -> // templates/JavaSDK/services.ts:230:8
            response.use { // templates/JavaSDK/services.ts:166:8 //
                // templates/JavaSDK/services.ts:233:30 //
                // templates/JavaSDK/services.ts:233:30 //
                // templates/JavaSDK/services.ts:230:8 // templates/JavaSDK/services.ts:230:8
                pendingDeleteHandler.handle(it)
            }
        }
    }

    private val pendingListHandler:
        Handler<
            List<Tenant>
        > = // templates/JavaSDK/services.ts:826:12 // templates/JavaSDK/services.ts:826:12 //
        // templates/JavaSDK/services.ts:825:19
        jsonHandler<List<Tenant>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get all tenants visible to this auth */
    override fun pendingList(
        params: TenantPendingListParams,
        requestOptions: RequestOptions
    ): List<Tenant> { // templates/JavaSDK/services.ts:831:10
        val request =
            HttpRequest.builder() // templates/JavaSDK/services.ts:107:20 //
                // templates/JavaSDK/services.ts:105:8 //
                // templates/JavaSDK/services.ts:105:8 //
                // templates/JavaSDK/services.ts:104:29 //
                // templates/JavaSDK/services.ts:104:29 //
                // templates/JavaSDK/services.ts:227:15 //
                // templates/JavaSDK/services.ts:227:15
                .method(
                    HttpMethod.GET
                ) // templates/JavaSDK/services.ts:109:18 // templates/JavaSDK/services.ts:109:18
                .addPathSegments("tenants", "pending")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response
            -> // templates/JavaSDK/services.ts:230:8
            response
                .use { // templates/JavaSDK/services.ts:166:8 //
                    // templates/JavaSDK/services.ts:233:30 //
                    // templates/JavaSDK/services.ts:233:30 //
                    // templates/JavaSDK/services.ts:230:8 // templates/JavaSDK/services.ts:230:8
                    pendingListHandler.handle(it)
                }
                .apply { // templates/JavaSDK/services.ts:176:10
                    if (
                        requestOptions.responseValidation ?: clientOptions.responseValidation
                    ) { // templates/JavaSDK/services.ts:179:14 //
                        // templates/JavaSDK/services.ts:176:10 //
                        // templates/JavaSDK/services.ts:176:10
                        forEach { it.validate() }
                    }
                }
        }
    }

    private val statsListHandler:
        Handler<
            TenantStats
        > = // templates/JavaSDK/services.ts:826:12 // templates/JavaSDK/services.ts:826:12 //
        // templates/JavaSDK/services.ts:825:19
        jsonHandler<TenantStats>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get Current Tenant Stats */
    override fun statsList(
        params: TenantStatsListParams,
        requestOptions: RequestOptions
    ): TenantStats { // templates/JavaSDK/services.ts:831:10
        val request =
            HttpRequest.builder() // templates/JavaSDK/services.ts:107:20 //
                // templates/JavaSDK/services.ts:105:8 //
                // templates/JavaSDK/services.ts:105:8 //
                // templates/JavaSDK/services.ts:104:29 //
                // templates/JavaSDK/services.ts:104:29 //
                // templates/JavaSDK/services.ts:227:15 //
                // templates/JavaSDK/services.ts:227:15
                .method(
                    HttpMethod.GET
                ) // templates/JavaSDK/services.ts:109:18 // templates/JavaSDK/services.ts:109:18
                .addPathSegments("tenants", "stats")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response
            -> // templates/JavaSDK/services.ts:230:8
            response
                .use { // templates/JavaSDK/services.ts:166:8 //
                    // templates/JavaSDK/services.ts:233:30 //
                    // templates/JavaSDK/services.ts:233:30 //
                    // templates/JavaSDK/services.ts:230:8 // templates/JavaSDK/services.ts:230:8
                    statsListHandler.handle(it)
                }
                .apply { // templates/JavaSDK/services.ts:176:10
                    if (
                        requestOptions.responseValidation ?: clientOptions.responseValidation
                    ) { // templates/JavaSDK/services.ts:179:14 //
                        // templates/JavaSDK/services.ts:176:10 //
                        // templates/JavaSDK/services.ts:176:10
                        validate()
                    }
                }
        }
    }
}

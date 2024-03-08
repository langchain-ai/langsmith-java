// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.services.async.tenants

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.TenantMemberDeleteParams
import com.langsmith.api.models.TenantMemberDeleteResponse
import com.langsmith.api.services.async.tenants.members.PendingServiceAsync
import com.langsmith.api.services.async.tenants.members.PendingServiceAsyncImpl
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.json
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class MemberServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : MemberServiceAsync { // templates/JavaSDK/services.ts:76:15 //
    // templates/JavaSDK/services.ts:76:15 //
    // templates/JavaSDK/services.ts:76:15

    private val errorHandler: Handler<LangSmithError> =
        errorHandler(clientOptions.jsonMapper) // templates/JavaSDK/services.ts:76:15

    private val pending: PendingServiceAsync by lazy { PendingServiceAsyncImpl(clientOptions) }

    override fun pending(): PendingServiceAsync = pending

    private val deleteHandler:
        Handler<
            TenantMemberDeleteResponse
        > = // templates/JavaSDK/services.ts:826:12 // templates/JavaSDK/services.ts:826:12 //
        // templates/JavaSDK/services.ts:825:19
        jsonHandler<TenantMemberDeleteResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Delete Current Tenant Member */
    override fun delete(
        params: TenantMemberDeleteParams,
        requestOptions: RequestOptions
    ): CompletableFuture<TenantMemberDeleteResponse> { // templates/JavaSDK/services.ts:831:10
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
                .addPathSegments("tenants", "current", "members", params.getPathParam(0))
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
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            -> // templates/JavaSDK/services.ts:230:8
            response.use { // templates/JavaSDK/services.ts:166:8 //
                // templates/JavaSDK/services.ts:233:30 //
                // templates/JavaSDK/services.ts:233:30 //
                // templates/JavaSDK/services.ts:230:8 // templates/JavaSDK/services.ts:230:8
                deleteHandler.handle(it)
            }
        }
    }
}

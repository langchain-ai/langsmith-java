// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.tenants

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.TenantUsageLimitInfo
import com.langsmith.api.models.TenantUsageLimitListParams
import java.util.concurrent.CompletableFuture

interface UsageLimitServiceAsync { // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15

    /** Get Current Tenant Usage Limits Info */
    // templates/JavaSDK/services.ts:55:15
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun list(
        params: TenantUsageLimitListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<TenantUsageLimitInfo>
}

// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.tenants

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.TenantPendingClaimCreateParams
import com.langsmith.api.models.TenantPendingClaimCreateResponse
import java.util.concurrent.CompletableFuture

interface PendingServiceAsync { // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15

    /** Claim Pending Tenant Invite */
    // templates/JavaSDK/services.ts:55:15
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun claimCreate(
        params: TenantPendingClaimCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<TenantPendingClaimCreateResponse>
}

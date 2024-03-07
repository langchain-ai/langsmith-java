// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking.tenants

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.TenantPendingClaimCreateParams
import com.langsmith.api.models.TenantPendingClaimCreateResponse

interface PendingService {

    /** Claim Pending Tenant Invite */
    @JvmOverloads
    fun claimCreate(
        params: TenantPendingClaimCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TenantPendingClaimCreateResponse
}

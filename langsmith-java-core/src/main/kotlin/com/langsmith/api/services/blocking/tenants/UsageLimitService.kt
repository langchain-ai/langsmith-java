// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking.tenants

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.TenantUsageLimitInfo
import com.langsmith.api.models.TenantUsageLimitListParams

interface UsageLimitService {

    /** Get Current Tenant Usage Limits Info */
    @JvmOverloads
    fun list(
        params: TenantUsageLimitListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TenantUsageLimitInfo
}

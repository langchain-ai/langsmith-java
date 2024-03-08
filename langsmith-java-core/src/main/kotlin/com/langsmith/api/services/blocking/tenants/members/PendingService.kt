// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking.tenants.members

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.TenantMemberPendingDeleteParams
import com.langsmith.api.models.TenantMemberPendingDeleteResponse

interface PendingService { // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15

    /** Delete Current Tenant Pending Member */
    // templates/JavaSDK/services.ts:55:15
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun delete(
        params: TenantMemberPendingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TenantMemberPendingDeleteResponse
}

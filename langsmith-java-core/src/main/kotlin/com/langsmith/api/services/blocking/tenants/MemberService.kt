// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking.tenants

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.TenantMemberDeleteParams
import com.langsmith.api.models.TenantMemberDeleteResponse
import com.langsmith.api.services.blocking.tenants.members.PendingService

interface MemberService { // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15

    fun pending(): PendingService // templates/JavaSDK/services.ts:55:15

    /** Delete Current Tenant Member */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun delete(
        params: TenantMemberDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TenantMemberDeleteResponse
}

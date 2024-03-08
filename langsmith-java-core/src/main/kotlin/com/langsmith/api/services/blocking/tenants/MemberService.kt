// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking.tenants

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.TenantMemberDeleteParams
import com.langsmith.api.models.TenantMemberDeleteResponse
import com.langsmith.api.services.blocking.tenants.members.PendingService

interface MemberService {

    fun pending(): PendingService

    /** Delete Current Tenant Member */
    @JvmOverloads
    fun delete(
        params: TenantMemberDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TenantMemberDeleteResponse
}

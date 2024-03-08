// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.tenants

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.TenantMemberDeleteParams
import com.langsmith.api.models.TenantMemberDeleteResponse
import com.langsmith.api.services.async.tenants.members.PendingServiceAsync
import java.util.concurrent.CompletableFuture

interface MemberServiceAsync {

    fun pending(): PendingServiceAsync

    /** Delete Current Tenant Member */
    @JvmOverloads
    fun delete(
        params: TenantMemberDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<TenantMemberDeleteResponse>
}

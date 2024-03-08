// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.tenants.members

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.TenantMemberPendingDeleteParams
import com.langsmith.api.models.TenantMemberPendingDeleteResponse
import java.util.concurrent.CompletableFuture

interface PendingServiceAsync {

    /** Delete Current Tenant Pending Member */
    @JvmOverloads
    fun delete(
        params: TenantMemberPendingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<TenantMemberPendingDeleteResponse>
}

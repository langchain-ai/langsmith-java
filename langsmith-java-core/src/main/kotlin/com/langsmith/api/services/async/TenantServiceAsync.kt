// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.Tenant
import com.langsmith.api.models.TenantCreateParams
import com.langsmith.api.models.TenantForUser
import com.langsmith.api.models.TenantListParams
import com.langsmith.api.models.TenantPendingDeleteParams
import com.langsmith.api.models.TenantPendingDeleteResponse
import com.langsmith.api.models.TenantPendingListParams
import com.langsmith.api.models.TenantStats
import com.langsmith.api.models.TenantStatsListParams
import com.langsmith.api.services.async.tenants.CurrentServiceAsync
import com.langsmith.api.services.async.tenants.MemberServiceAsync
import com.langsmith.api.services.async.tenants.PendingServiceAsync
import com.langsmith.api.services.async.tenants.UsageLimitServiceAsync
import java.util.concurrent.CompletableFuture

interface TenantServiceAsync {

    fun pending(): PendingServiceAsync

    fun current(): CurrentServiceAsync

    fun members(): MemberServiceAsync

    fun usageLimits(): UsageLimitServiceAsync

    /** Create a new tenant. */
    @JvmOverloads
    fun create(
        params: TenantCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Tenant>

    /** Get all tenants visible to this auth */
    @JvmOverloads
    fun list(
        params: TenantListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<List<TenantForUser>>

    /** Delete Pending Tenant Invite */
    @JvmOverloads
    fun pendingDelete(
        params: TenantPendingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<TenantPendingDeleteResponse>

    /** Get all tenants visible to this auth */
    @JvmOverloads
    fun pendingList(
        params: TenantPendingListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<List<Tenant>>

    /** Get Current Tenant Stats */
    @JvmOverloads
    fun statsList(
        params: TenantStatsListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<TenantStats>
}

// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking

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
import com.langsmith.api.services.blocking.tenants.CurrentService
import com.langsmith.api.services.blocking.tenants.MemberService
import com.langsmith.api.services.blocking.tenants.PendingService
import com.langsmith.api.services.blocking.tenants.UsageLimitService

interface TenantService { // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15

    fun pending(): PendingService // templates/JavaSDK/services.ts:55:15

    fun current(): CurrentService

    fun members(): MemberService

    fun usageLimits(): UsageLimitService

    /** Create a new tenant. */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun create(
        params: TenantCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Tenant

    /** Get all tenants visible to this auth */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun list(
        params: TenantListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): List<TenantForUser>

    /** Delete Pending Tenant Invite */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun pendingDelete(
        params: TenantPendingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TenantPendingDeleteResponse

    /** Get all tenants visible to this auth */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun pendingList(
        params: TenantPendingListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): List<Tenant>

    /** Get Current Tenant Stats */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun statsList(
        params: TenantStatsListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TenantStats
}

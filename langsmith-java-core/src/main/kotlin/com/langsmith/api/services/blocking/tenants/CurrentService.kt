// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking.tenants

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.PendingIdentity
import com.langsmith.api.models.TenantCurrentMembersCreateParams
import com.langsmith.api.models.TenantCurrentMembersListParams
import com.langsmith.api.models.TenantCurrentStatsRetrieveParams
import com.langsmith.api.models.TenantMembers
import com.langsmith.api.models.TenantStats

interface CurrentService {

    /** Add Member To Current Tenant */
    @JvmOverloads
    fun membersCreate(
        params: TenantCurrentMembersCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PendingIdentity

    /** Get Current Tenant Members */
    @JvmOverloads
    fun membersList(
        params: TenantCurrentMembersListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TenantMembers

    /** Get Current Tenant Stats */
    @JvmOverloads
    fun statsRetrieve(
        params: TenantCurrentStatsRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TenantStats
}

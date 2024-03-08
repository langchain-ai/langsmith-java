// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking

import com.langsmith.api.TestServerExtension
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient
import com.langsmith.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TenantServiceTest {

    @Test
    fun callCreate() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tenantService = client.tenants()
        val tenant =
            tenantService.create(
                TenantCreateParams.builder()
                    .displayName("x")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tenantHandle("string")
                    .build()
            )
        println(tenant)
        tenant.validate()
    }

    @Test
    fun callList() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tenantService = client.tenants()
        val tenantListResponse = tenantService.list(TenantListParams.builder().build())
        println(tenantListResponse)
        for (tenantForUser: TenantForUser in tenantListResponse) {
            tenantForUser.validate()
        }
    }

    @Test
    fun callPendingDelete() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tenantService = client.tenants()
        val tenantPendingDeleteResponse =
            tenantService.pendingDelete(
                TenantPendingDeleteParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(tenantPendingDeleteResponse)
    }

    @Test
    fun callPendingList() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tenantService = client.tenants()
        val tenantPendingListResponse =
            tenantService.pendingList(TenantPendingListParams.builder().build())
        println(tenantPendingListResponse)
        for (tenant: Tenant in tenantPendingListResponse) {
            tenant.validate()
        }
    }

    @Test
    fun callStatsList() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tenantService = client.tenants()
        val tenantStats = tenantService.statsList(TenantStatsListParams.builder().build())
        println(tenantStats)
        tenantStats.validate()
    }
}

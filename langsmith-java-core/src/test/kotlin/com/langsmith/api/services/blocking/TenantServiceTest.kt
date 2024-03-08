// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.services.blocking

import com.langsmith.api.TestServerExtension
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient
import com.langsmith.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(
    TestServerExtension::class
) // templates/JavaSDK/services.ts:298:15 // templates/JavaSDK/services.ts:298:15 //
// templates/JavaSDK/services.ts:298:15 // templates/JavaSDK/services.ts:298:15
class TenantServiceTest {

    @Test // templates/JavaSDK/entities/testing.ts:18:13 // templates/JavaSDK/services.ts:298:15
    fun callCreate() { // templates/JavaSDK/entities/testing.ts:18:13
        val client =
            LangSmithOkHttpClient.builder() // templates/JavaSDK/services.ts:308:18 //
                // templates/JavaSDK/services.ts:307:24 //
                // templates/JavaSDK/services.ts:307:24
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val tenantService = client.tenants()
        val tenant =
            tenantService.create(
                TenantCreateParams.builder() // templates/JavaSDK/services.ts:464:26 //
                    // templates/JavaSDK/services.ts:479:20 //
                    // templates/JavaSDK/services.ts:476:10 //
                    // templates/JavaSDK/services.ts:476:10 //
                    // templates/JavaSDK/services.ts:475:17 //
                    // templates/JavaSDK/services.ts:475:17
                    .displayName("x")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tenantHandle("string")
                    .build()
            )
        println(
            tenant
        ) // templates/JavaSDK/services.ts:526:15 // templates/JavaSDK/services.ts:526:15
        tenant.validate()
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun callList() { // templates/JavaSDK/entities/testing.ts:18:13
        val client =
            LangSmithOkHttpClient.builder() // templates/JavaSDK/services.ts:308:18 //
                // templates/JavaSDK/services.ts:307:24 //
                // templates/JavaSDK/services.ts:307:24
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val tenantService = client.tenants()
        val tenantListResponse =
            tenantService.list(
                TenantListParams.builder().build()
            ) // templates/JavaSDK/services.ts:475:17 // templates/JavaSDK/services.ts:475:17
        println(
            tenantListResponse
        ) // templates/JavaSDK/services.ts:526:15 // templates/JavaSDK/services.ts:526:15
        for (tenantForUser: TenantForUser in
            tenantListResponse) { // templates/JavaSDK/services.ts:509:10
            tenantForUser.validate()
        }
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun callPendingDelete() { // templates/JavaSDK/entities/testing.ts:18:13
        val client =
            LangSmithOkHttpClient.builder() // templates/JavaSDK/services.ts:308:18 //
                // templates/JavaSDK/services.ts:307:24 //
                // templates/JavaSDK/services.ts:307:24
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val tenantService = client.tenants()
        val tenantPendingDeleteResponse =
            tenantService.pendingDelete(
                TenantPendingDeleteParams.builder() // templates/JavaSDK/services.ts:464:26 //
                    // templates/JavaSDK/services.ts:479:20 //
                    // templates/JavaSDK/services.ts:476:10 //
                    // templates/JavaSDK/services.ts:476:10 //
                    // templates/JavaSDK/services.ts:475:17 //
                    // templates/JavaSDK/services.ts:475:17
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(tenantPendingDeleteResponse)
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun callPendingList() { // templates/JavaSDK/entities/testing.ts:18:13
        val client =
            LangSmithOkHttpClient.builder() // templates/JavaSDK/services.ts:308:18 //
                // templates/JavaSDK/services.ts:307:24 //
                // templates/JavaSDK/services.ts:307:24
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val tenantService = client.tenants()
        val tenantPendingListResponse =
            tenantService.pendingList(
                TenantPendingListParams.builder().build()
            ) // templates/JavaSDK/services.ts:475:17 // templates/JavaSDK/services.ts:475:17
        println(
            tenantPendingListResponse
        ) // templates/JavaSDK/services.ts:526:15 // templates/JavaSDK/services.ts:526:15
        for (tenant: Tenant in tenantPendingListResponse) { // templates/JavaSDK/services.ts:509:10
            tenant.validate()
        }
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun callStatsList() { // templates/JavaSDK/entities/testing.ts:18:13
        val client =
            LangSmithOkHttpClient.builder() // templates/JavaSDK/services.ts:308:18 //
                // templates/JavaSDK/services.ts:307:24 //
                // templates/JavaSDK/services.ts:307:24
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val tenantService = client.tenants()
        val tenantStats =
            tenantService.statsList(
                TenantStatsListParams.builder().build()
            ) // templates/JavaSDK/services.ts:475:17 // templates/JavaSDK/services.ts:475:17
        println(
            tenantStats
        ) // templates/JavaSDK/services.ts:526:15 // templates/JavaSDK/services.ts:526:15
        tenantStats.validate()
    }
}

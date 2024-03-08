// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.services.blocking.tenants

import com.langsmith.api.TestServerExtension
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient
import com.langsmith.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(
    TestServerExtension::class
) // templates/JavaSDK/services.ts:298:15 // templates/JavaSDK/services.ts:298:15 //
// templates/JavaSDK/services.ts:298:15 // templates/JavaSDK/services.ts:298:15
class UsageLimitServiceTest {

    @Test // templates/JavaSDK/entities/testing.ts:18:13 // templates/JavaSDK/services.ts:298:15
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
        val usageLimitService = client.tenants().usageLimits()
        val tenantUsageLimitInfo =
            usageLimitService.list(
                TenantUsageLimitListParams.builder().build()
            ) // templates/JavaSDK/services.ts:475:17 // templates/JavaSDK/services.ts:475:17
        println(
            tenantUsageLimitInfo
        ) // templates/JavaSDK/services.ts:526:15 // templates/JavaSDK/services.ts:526:15
        tenantUsageLimitInfo.validate()
    }
}

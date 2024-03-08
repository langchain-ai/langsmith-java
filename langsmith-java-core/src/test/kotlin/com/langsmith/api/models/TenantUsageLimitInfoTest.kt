// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TenantUsageLimitInfoTest { // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/objects.ts:645:15
    fun createTenantUsageLimitInfo() { // templates/JavaSDK/entities/testing.ts:18:13
        val tenantUsageLimitInfo =
            TenantUsageLimitInfo.builder() // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:656:16 //
                // templates/JavaSDK/entities/objects.ts:656:16
                .inRejectSet(true)
                .tenantLimit(123L)
                .usageLimitType(TenantUsageLimitInfo.UsageLimitType.PAYLOAD_SIZE)
                .build()
        assertThat(tenantUsageLimitInfo).isNotNull
        assertThat(tenantUsageLimitInfo.inRejectSet()).isEqualTo(true)
        assertThat(tenantUsageLimitInfo.tenantLimit()).contains(123L)
        assertThat(tenantUsageLimitInfo.usageLimitType())
            .contains(TenantUsageLimitInfo.UsageLimitType.PAYLOAD_SIZE)
    }
}

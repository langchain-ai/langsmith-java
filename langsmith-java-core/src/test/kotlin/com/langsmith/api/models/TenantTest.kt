// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TenantTest { // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/objects.ts:645:15
    fun createTenant() { // templates/JavaSDK/entities/testing.ts:18:13
        val tenant =
            Tenant.builder() // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:656:16 //
                // templates/JavaSDK/entities/objects.ts:656:16
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .config(
                    Tenant.Config.builder()
                        .flags(Tenant.Config.Flags.builder().build())
                        .isPersonal(true)
                        .maxHourlyTracingBytes(123L)
                        .maxHourlyTracingRequests(123L)
                        .maxIdentities(123L)
                        .maxMonthlyTotalUniqueTraces(123L)
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("string")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tenantHandle("string")
                .build()
        assertThat(tenant).isNotNull
        assertThat(tenant.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tenant.config())
            .isEqualTo(
                Tenant.Config.builder() // templates/JavaSDK/entities/objects.ts:717:13
                    .flags(Tenant.Config.Flags.builder().build())
                    .isPersonal(true)
                    .maxHourlyTracingBytes(123L)
                    .maxHourlyTracingRequests(123L)
                    .maxIdentities(123L)
                    .maxMonthlyTotalUniqueTraces(123L)
                    .build()
            )
        assertThat(tenant.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tenant.displayName()).isEqualTo("string")
        assertThat(tenant.organizationId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tenant.tenantHandle()).contains("string")
    }
}

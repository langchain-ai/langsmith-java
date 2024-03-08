// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TenantStatsTest { // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/objects.ts:645:15
    fun createTenantStats() { // templates/JavaSDK/entities/testing.ts:18:13
        val tenantStats =
            TenantStats.builder() // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:656:16 //
                // templates/JavaSDK/entities/objects.ts:656:16
                .annotationQueueCount(123L)
                .datasetCount(123L)
                .repoCount(123L)
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tracerSessionCount(123L)
                .build()
        assertThat(tenantStats).isNotNull
        assertThat(tenantStats.annotationQueueCount()).isEqualTo(123L)
        assertThat(tenantStats.datasetCount()).isEqualTo(123L)
        assertThat(tenantStats.repoCount()).isEqualTo(123L)
        assertThat(tenantStats.tenantId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tenantStats.tracerSessionCount()).isEqualTo(123L)
    }
}

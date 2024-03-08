// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TenantStatsTest {

    @Test
    fun createTenantStats() {
        val tenantStats =
            TenantStats.builder()
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

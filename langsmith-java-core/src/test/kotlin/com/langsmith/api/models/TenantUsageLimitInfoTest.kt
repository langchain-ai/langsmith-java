// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TenantUsageLimitInfoTest {

    @Test
    fun createTenantUsageLimitInfo() {
        val tenantUsageLimitInfo =
            TenantUsageLimitInfo.builder()
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

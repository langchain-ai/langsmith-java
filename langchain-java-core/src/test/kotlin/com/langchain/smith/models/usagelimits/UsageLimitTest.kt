// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.usagelimits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageLimitTest {

    @Test
    fun create() {
        val usageLimit =
            UsageLimit.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .limitType(UsageLimitType.MONTHLY_TRACES)
                .limitValue(0L)
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(usageLimit.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(usageLimit.limitType()).isEqualTo(UsageLimitType.MONTHLY_TRACES)
        assertThat(usageLimit.limitValue()).isEqualTo(0L)
        assertThat(usageLimit.tenantId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(usageLimit.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(usageLimit.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usageLimit =
            UsageLimit.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .limitType(UsageLimitType.MONTHLY_TRACES)
                .limitValue(0L)
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedUsageLimit =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usageLimit),
                jacksonTypeRef<UsageLimit>(),
            )

        assertThat(roundtrippedUsageLimit).isEqualTo(usageLimit)
    }
}

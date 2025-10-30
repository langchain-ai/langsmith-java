// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.usagelimits

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageLimitUpdateUsageLimitsParamsTest {

    @Test
    fun create() {
        UsageLimitUpdateUsageLimitsParams.builder()
            .limitType(UsageLimitType.MONTHLY_TRACES)
            .limitValue(0L)
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun body() {
        val params =
            UsageLimitUpdateUsageLimitsParams.builder()
                .limitType(UsageLimitType.MONTHLY_TRACES)
                .limitValue(0L)
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.limitType()).isEqualTo(UsageLimitType.MONTHLY_TRACES)
        assertThat(body.limitValue()).isEqualTo(0L)
        assertThat(body.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UsageLimitUpdateUsageLimitsParams.builder()
                .limitType(UsageLimitType.MONTHLY_TRACES)
                .limitValue(0L)
                .build()

        val body = params._body()

        assertThat(body.limitType()).isEqualTo(UsageLimitType.MONTHLY_TRACES)
        assertThat(body.limitValue()).isEqualTo(0L)
    }
}

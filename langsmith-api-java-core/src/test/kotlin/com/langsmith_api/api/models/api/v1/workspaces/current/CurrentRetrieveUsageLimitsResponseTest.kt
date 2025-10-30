// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.workspaces.current

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrentRetrieveUsageLimitsResponseTest {

    @Test
    fun create() {
        val currentRetrieveUsageLimitsResponse =
            CurrentRetrieveUsageLimitsResponse.builder()
                .inRejectSet(true)
                .tenantLimit(0L)
                .usageLimitType(CurrentRetrieveUsageLimitsResponse.UsageLimitType.PAYLOAD_SIZE)
                .build()

        assertThat(currentRetrieveUsageLimitsResponse.inRejectSet()).isEqualTo(true)
        assertThat(currentRetrieveUsageLimitsResponse.tenantLimit()).contains(0L)
        assertThat(currentRetrieveUsageLimitsResponse.usageLimitType())
            .contains(CurrentRetrieveUsageLimitsResponse.UsageLimitType.PAYLOAD_SIZE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val currentRetrieveUsageLimitsResponse =
            CurrentRetrieveUsageLimitsResponse.builder()
                .inRejectSet(true)
                .tenantLimit(0L)
                .usageLimitType(CurrentRetrieveUsageLimitsResponse.UsageLimitType.PAYLOAD_SIZE)
                .build()

        val roundtrippedCurrentRetrieveUsageLimitsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(currentRetrieveUsageLimitsResponse),
                jacksonTypeRef<CurrentRetrieveUsageLimitsResponse>(),
            )

        assertThat(roundtrippedCurrentRetrieveUsageLimitsResponse)
            .isEqualTo(currentRetrieveUsageLimitsResponse)
    }
}

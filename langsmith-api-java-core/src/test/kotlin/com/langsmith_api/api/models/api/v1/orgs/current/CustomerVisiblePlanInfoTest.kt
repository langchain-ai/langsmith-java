// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs.current

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import com.langsmith_api.api.models.api.v1.orgs.PaymentPlanTier
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerVisiblePlanInfoTest {

    @Test
    fun create() {
        val customerVisiblePlanInfo =
            CustomerVisiblePlanInfo.builder()
                .startedOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .tier(PaymentPlanTier.NO_PLAN)
                .endsOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(customerVisiblePlanInfo.startedOn())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerVisiblePlanInfo.tier()).isEqualTo(PaymentPlanTier.NO_PLAN)
        assertThat(customerVisiblePlanInfo.endsOn())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerVisiblePlanInfo =
            CustomerVisiblePlanInfo.builder()
                .startedOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .tier(PaymentPlanTier.NO_PLAN)
                .endsOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedCustomerVisiblePlanInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerVisiblePlanInfo),
                jacksonTypeRef<CustomerVisiblePlanInfo>(),
            )

        assertThat(roundtrippedCustomerVisiblePlanInfo).isEqualTo(customerVisiblePlanInfo)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs.current.billing

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillingRetrieveUsageResponseTest {

    @Test
    fun create() {
        val billingRetrieveUsageResponse =
            BillingRetrieveUsageResponse.builder()
                .billableMetricId("billable_metric_id")
                .billableMetricName("billable_metric_name")
                .customerId("customer_id")
                .endTimestamp("end_timestamp")
                .groups(
                    BillingRetrieveUsageResponse.Groups.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .startTimestamp("start_timestamp")
                .value(0.0)
                .build()

        assertThat(billingRetrieveUsageResponse.billableMetricId()).isEqualTo("billable_metric_id")
        assertThat(billingRetrieveUsageResponse.billableMetricName())
            .isEqualTo("billable_metric_name")
        assertThat(billingRetrieveUsageResponse.customerId()).isEqualTo("customer_id")
        assertThat(billingRetrieveUsageResponse.endTimestamp()).isEqualTo("end_timestamp")
        assertThat(billingRetrieveUsageResponse.groups())
            .contains(
                BillingRetrieveUsageResponse.Groups.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(billingRetrieveUsageResponse.startTimestamp()).isEqualTo("start_timestamp")
        assertThat(billingRetrieveUsageResponse.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val billingRetrieveUsageResponse =
            BillingRetrieveUsageResponse.builder()
                .billableMetricId("billable_metric_id")
                .billableMetricName("billable_metric_name")
                .customerId("customer_id")
                .endTimestamp("end_timestamp")
                .groups(
                    BillingRetrieveUsageResponse.Groups.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .startTimestamp("start_timestamp")
                .value(0.0)
                .build()

        val roundtrippedBillingRetrieveUsageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(billingRetrieveUsageResponse),
                jacksonTypeRef<BillingRetrieveUsageResponse>(),
            )

        assertThat(roundtrippedBillingRetrieveUsageResponse).isEqualTo(billingRetrieveUsageResponse)
    }
}

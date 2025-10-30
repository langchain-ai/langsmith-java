// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs.current

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StripePaymentMethodInfoTest {

    @Test
    fun create() {
        val stripePaymentMethodInfo =
            StripePaymentMethodInfo.builder()
                .brand("brand")
                .email("email")
                .expMonth(0L)
                .expYear(0L)
                .last4("last4")
                .build()

        assertThat(stripePaymentMethodInfo.brand()).contains("brand")
        assertThat(stripePaymentMethodInfo.email()).contains("email")
        assertThat(stripePaymentMethodInfo.expMonth()).contains(0L)
        assertThat(stripePaymentMethodInfo.expYear()).contains(0L)
        assertThat(stripePaymentMethodInfo.last4()).contains("last4")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val stripePaymentMethodInfo =
            StripePaymentMethodInfo.builder()
                .brand("brand")
                .email("email")
                .expMonth(0L)
                .expYear(0L)
                .last4("last4")
                .build()

        val roundtrippedStripePaymentMethodInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(stripePaymentMethodInfo),
                jacksonTypeRef<StripePaymentMethodInfo>(),
            )

        assertThat(roundtrippedStripePaymentMethodInfo).isEqualTo(stripePaymentMethodInfo)
    }
}

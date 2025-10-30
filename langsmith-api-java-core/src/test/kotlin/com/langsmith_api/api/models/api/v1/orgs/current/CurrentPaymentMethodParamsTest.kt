// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs.current

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrentPaymentMethodParamsTest {

    @Test
    fun create() {
        CurrentPaymentMethodParams.builder()
            .billingInfo(
                CurrentPaymentMethodParams.BillingInfo.builder()
                    .address(
                        StripeCustomerAddress.builder()
                            .city("city")
                            .country("country")
                            .line1("line1")
                            .postalCode("postal_code")
                            .line2("line2")
                            .state("state")
                            .build()
                    )
                    .name("name")
                    .build()
            )
            .setupIntent("setup_intent")
            .build()
    }

    @Test
    fun body() {
        val params =
            CurrentPaymentMethodParams.builder()
                .billingInfo(
                    CurrentPaymentMethodParams.BillingInfo.builder()
                        .address(
                            StripeCustomerAddress.builder()
                                .city("city")
                                .country("country")
                                .line1("line1")
                                .postalCode("postal_code")
                                .line2("line2")
                                .state("state")
                                .build()
                        )
                        .name("name")
                        .build()
                )
                .setupIntent("setup_intent")
                .build()

        val body = params._body()

        assertThat(body.billingInfo())
            .isEqualTo(
                CurrentPaymentMethodParams.BillingInfo.builder()
                    .address(
                        StripeCustomerAddress.builder()
                            .city("city")
                            .country("country")
                            .line1("line1")
                            .postalCode("postal_code")
                            .line2("line2")
                            .state("state")
                            .build()
                    )
                    .name("name")
                    .build()
            )
        assertThat(body.setupIntent()).isEqualTo("setup_intent")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CurrentPaymentMethodParams.builder()
                .billingInfo(
                    CurrentPaymentMethodParams.BillingInfo.builder()
                        .address(
                            StripeCustomerAddress.builder()
                                .city("city")
                                .country("country")
                                .line1("line1")
                                .postalCode("postal_code")
                                .build()
                        )
                        .name("name")
                        .build()
                )
                .setupIntent("setup_intent")
                .build()

        val body = params._body()

        assertThat(body.billingInfo())
            .isEqualTo(
                CurrentPaymentMethodParams.BillingInfo.builder()
                    .address(
                        StripeCustomerAddress.builder()
                            .city("city")
                            .country("country")
                            .line1("line1")
                            .postalCode("postal_code")
                            .build()
                    )
                    .name("name")
                    .build()
            )
        assertThat(body.setupIntent()).isEqualTo("setup_intent")
    }
}

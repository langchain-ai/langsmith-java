// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.current.businessinfo

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import com.langchain.smith.models.orgs.current.StripeCustomerAddress
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StripeBusinessBillingInfoTest {

    @Test
    fun create() {
        val stripeBusinessBillingInfo =
            StripeBusinessBillingInfo.builder()
                .name("name")
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
                .build()

        assertThat(stripeBusinessBillingInfo.name()).isEqualTo("name")
        assertThat(stripeBusinessBillingInfo.address())
            .contains(
                StripeCustomerAddress.builder()
                    .city("city")
                    .country("country")
                    .line1("line1")
                    .postalCode("postal_code")
                    .line2("line2")
                    .state("state")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val stripeBusinessBillingInfo =
            StripeBusinessBillingInfo.builder()
                .name("name")
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
                .build()

        val roundtrippedStripeBusinessBillingInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(stripeBusinessBillingInfo),
                jacksonTypeRef<StripeBusinessBillingInfo>(),
            )

        assertThat(roundtrippedStripeBusinessBillingInfo).isEqualTo(stripeBusinessBillingInfo)
    }
}

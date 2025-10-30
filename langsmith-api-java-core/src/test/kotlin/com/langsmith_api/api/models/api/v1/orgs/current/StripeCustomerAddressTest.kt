// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs.current

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StripeCustomerAddressTest {

    @Test
    fun create() {
        val stripeCustomerAddress =
            StripeCustomerAddress.builder()
                .city("city")
                .country("country")
                .line1("line1")
                .postalCode("postal_code")
                .line2("line2")
                .state("state")
                .build()

        assertThat(stripeCustomerAddress.city()).isEqualTo("city")
        assertThat(stripeCustomerAddress.country()).isEqualTo("country")
        assertThat(stripeCustomerAddress.line1()).isEqualTo("line1")
        assertThat(stripeCustomerAddress.postalCode()).isEqualTo("postal_code")
        assertThat(stripeCustomerAddress.line2()).contains("line2")
        assertThat(stripeCustomerAddress.state()).contains("state")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val stripeCustomerAddress =
            StripeCustomerAddress.builder()
                .city("city")
                .country("country")
                .line1("line1")
                .postalCode("postal_code")
                .line2("line2")
                .state("state")
                .build()

        val roundtrippedStripeCustomerAddress =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(stripeCustomerAddress),
                jacksonTypeRef<StripeCustomerAddress>(),
            )

        assertThat(roundtrippedStripeCustomerAddress).isEqualTo(stripeCustomerAddress)
    }
}

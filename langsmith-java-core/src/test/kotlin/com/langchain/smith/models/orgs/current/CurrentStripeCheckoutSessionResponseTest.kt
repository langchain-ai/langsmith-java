// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.current

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrentStripeCheckoutSessionResponseTest {

    @Test
    fun create() {
        val currentStripeCheckoutSessionResponse =
            CurrentStripeCheckoutSessionResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val currentStripeCheckoutSessionResponse =
            CurrentStripeCheckoutSessionResponse.builder().build()

        val roundtrippedCurrentStripeCheckoutSessionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(currentStripeCheckoutSessionResponse),
                jacksonTypeRef<CurrentStripeCheckoutSessionResponse>(),
            )

        assertThat(roundtrippedCurrentStripeCheckoutSessionResponse)
            .isEqualTo(currentStripeCheckoutSessionResponse)
    }
}

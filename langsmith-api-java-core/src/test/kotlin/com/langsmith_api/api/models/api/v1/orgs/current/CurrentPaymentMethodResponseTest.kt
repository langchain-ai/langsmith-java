// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs.current

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrentPaymentMethodResponseTest {

    @Test
    fun create() {
        val currentPaymentMethodResponse = CurrentPaymentMethodResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val currentPaymentMethodResponse = CurrentPaymentMethodResponse.builder().build()

        val roundtrippedCurrentPaymentMethodResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(currentPaymentMethodResponse),
                jacksonTypeRef<CurrentPaymentMethodResponse>(),
            )

        assertThat(roundtrippedCurrentPaymentMethodResponse).isEqualTo(currentPaymentMethodResponse)
    }
}

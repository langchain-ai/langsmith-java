// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.current

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrentConfirmCheckoutSessionCompletionResponseTest {

    @Test
    fun create() {
        val currentConfirmCheckoutSessionCompletionResponse =
            CurrentConfirmCheckoutSessionCompletionResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val currentConfirmCheckoutSessionCompletionResponse =
            CurrentConfirmCheckoutSessionCompletionResponse.builder().build()

        val roundtrippedCurrentConfirmCheckoutSessionCompletionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(currentConfirmCheckoutSessionCompletionResponse),
                jacksonTypeRef<CurrentConfirmCheckoutSessionCompletionResponse>(),
            )

        assertThat(roundtrippedCurrentConfirmCheckoutSessionCompletionResponse)
            .isEqualTo(currentConfirmCheckoutSessionCompletionResponse)
    }
}

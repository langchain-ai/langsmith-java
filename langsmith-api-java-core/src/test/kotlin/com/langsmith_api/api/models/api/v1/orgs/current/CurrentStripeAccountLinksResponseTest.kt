// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs.current

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrentStripeAccountLinksResponseTest {

    @Test
    fun create() {
        val currentStripeAccountLinksResponse = CurrentStripeAccountLinksResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val currentStripeAccountLinksResponse = CurrentStripeAccountLinksResponse.builder().build()

        val roundtrippedCurrentStripeAccountLinksResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(currentStripeAccountLinksResponse),
                jacksonTypeRef<CurrentStripeAccountLinksResponse>(),
            )

        assertThat(roundtrippedCurrentStripeAccountLinksResponse)
            .isEqualTo(currentStripeAccountLinksResponse)
    }
}

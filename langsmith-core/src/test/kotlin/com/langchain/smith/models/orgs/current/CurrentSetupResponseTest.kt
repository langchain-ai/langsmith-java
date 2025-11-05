// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.current

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrentSetupResponseTest {

    @Test
    fun create() {
        val currentSetupResponse =
            CurrentSetupResponse.builder().clientSecret("client_secret").build()

        assertThat(currentSetupResponse.clientSecret()).isEqualTo("client_secret")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val currentSetupResponse =
            CurrentSetupResponse.builder().clientSecret("client_secret").build()

        val roundtrippedCurrentSetupResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(currentSetupResponse),
                jacksonTypeRef<CurrentSetupResponse>(),
            )

        assertThat(roundtrippedCurrentSetupResponse).isEqualTo(currentSetupResponse)
    }
}

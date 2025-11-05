// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClientLoginResponseTest {

    @Test
    fun create() {
        val clientLoginResponse = ClientLoginResponse.builder().accessToken("access_token").build()

        assertThat(clientLoginResponse.accessToken()).isEqualTo("access_token")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val clientLoginResponse = ClientLoginResponse.builder().accessToken("access_token").build()

        val roundtrippedClientLoginResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(clientLoginResponse),
                jacksonTypeRef<ClientLoginResponse>(),
            )

        assertThat(roundtrippedClientLoginResponse).isEqualTo(clientLoginResponse)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClientUpdateResponseTest {

    @Test
    fun create() {
        val clientUpdateResponse = ClientUpdateResponse.builder().likes(0L).build()

        assertThat(clientUpdateResponse.likes()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val clientUpdateResponse = ClientUpdateResponse.builder().likes(0L).build()

        val roundtrippedClientUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(clientUpdateResponse),
                jacksonTypeRef<ClientUpdateResponse>(),
            )

        assertThat(roundtrippedClientUpdateResponse).isEqualTo(clientUpdateResponse)
    }
}

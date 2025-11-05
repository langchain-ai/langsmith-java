// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClientEventsResponseTest {

    @Test
    fun create() {
        val clientEventsResponse = ClientEventsResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val clientEventsResponse = ClientEventsResponse.builder().build()

        val roundtrippedClientEventsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(clientEventsResponse),
                jacksonTypeRef<ClientEventsResponse>(),
            )

        assertThat(roundtrippedClientEventsResponse).isEqualTo(clientEventsResponse)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClientRetrieveOkResponseTest {

    @Test
    fun create() {
        val clientRetrieveOkResponse = ClientRetrieveOkResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val clientRetrieveOkResponse = ClientRetrieveOkResponse.builder().build()

        val roundtrippedClientRetrieveOkResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(clientRetrieveOkResponse),
                jacksonTypeRef<ClientRetrieveOkResponse>(),
            )

        assertThat(roundtrippedClientRetrieveOkResponse).isEqualTo(clientRetrieveOkResponse)
    }
}

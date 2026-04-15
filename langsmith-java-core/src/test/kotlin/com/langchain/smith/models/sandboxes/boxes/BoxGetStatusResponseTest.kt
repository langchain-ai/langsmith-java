// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.boxes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BoxGetStatusResponseTest {

    @Test
    fun create() {
        val boxGetStatusResponse =
            BoxGetStatusResponse.builder().status("status").statusMessage("status_message").build()

        assertThat(boxGetStatusResponse.status()).contains("status")
        assertThat(boxGetStatusResponse.statusMessage()).contains("status_message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val boxGetStatusResponse =
            BoxGetStatusResponse.builder().status("status").statusMessage("status_message").build()

        val roundtrippedBoxGetStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(boxGetStatusResponse),
                jacksonTypeRef<BoxGetStatusResponse>(),
            )

        assertThat(roundtrippedBoxGetStatusResponse).isEqualTo(boxGetStatusResponse)
    }
}

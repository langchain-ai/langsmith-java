// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SandboxStatusResponseTest {

    @Test
    fun create() {
        val sandboxStatusResponse =
            SandboxStatusResponse.builder().status("status").statusMessage("status_message").build()

        assertThat(sandboxStatusResponse.status()).contains("status")
        assertThat(sandboxStatusResponse.statusMessage()).contains("status_message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sandboxStatusResponse =
            SandboxStatusResponse.builder().status("status").statusMessage("status_message").build()

        val roundtrippedSandboxStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sandboxStatusResponse),
                jacksonTypeRef<SandboxStatusResponse>(),
            )

        assertThat(roundtrippedSandboxStatusResponse).isEqualTo(sandboxStatusResponse)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.boxes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BoxGenerateServiceUrlResponseTest {

    @Test
    fun create() {
        val boxGenerateServiceUrlResponse =
            BoxGenerateServiceUrlResponse.builder()
                .token("token")
                .browserUrl("browser_url")
                .expiresAt("expires_at")
                .serviceUrl("service_url")
                .build()

        assertThat(boxGenerateServiceUrlResponse.token()).contains("token")
        assertThat(boxGenerateServiceUrlResponse.browserUrl()).contains("browser_url")
        assertThat(boxGenerateServiceUrlResponse.expiresAt()).contains("expires_at")
        assertThat(boxGenerateServiceUrlResponse.serviceUrl()).contains("service_url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val boxGenerateServiceUrlResponse =
            BoxGenerateServiceUrlResponse.builder()
                .token("token")
                .browserUrl("browser_url")
                .expiresAt("expires_at")
                .serviceUrl("service_url")
                .build()

        val roundtrippedBoxGenerateServiceUrlResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(boxGenerateServiceUrlResponse),
                jacksonTypeRef<BoxGenerateServiceUrlResponse>(),
            )

        assertThat(roundtrippedBoxGenerateServiceUrlResponse)
            .isEqualTo(boxGenerateServiceUrlResponse)
    }
}

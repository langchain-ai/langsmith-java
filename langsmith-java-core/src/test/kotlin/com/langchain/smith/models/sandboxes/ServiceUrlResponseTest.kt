// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ServiceUrlResponseTest {

    @Test
    fun create() {
        val serviceUrlResponse =
            ServiceUrlResponse.builder()
                .token("token")
                .browserUrl("browser_url")
                .expiresAt("expires_at")
                .serviceUrl("service_url")
                .build()

        assertThat(serviceUrlResponse.token()).contains("token")
        assertThat(serviceUrlResponse.browserUrl()).contains("browser_url")
        assertThat(serviceUrlResponse.expiresAt()).contains("expires_at")
        assertThat(serviceUrlResponse.serviceUrl()).contains("service_url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val serviceUrlResponse =
            ServiceUrlResponse.builder()
                .token("token")
                .browserUrl("browser_url")
                .expiresAt("expires_at")
                .serviceUrl("service_url")
                .build()

        val roundtrippedServiceUrlResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(serviceUrlResponse),
                jacksonTypeRef<ServiceUrlResponse>(),
            )

        assertThat(roundtrippedServiceUrlResponse).isEqualTo(serviceUrlResponse)
    }
}

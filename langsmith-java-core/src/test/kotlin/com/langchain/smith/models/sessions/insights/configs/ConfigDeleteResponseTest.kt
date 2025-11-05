// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions.insights.configs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigDeleteResponseTest {

    @Test
    fun create() {
        val configDeleteResponse =
            ConfigDeleteResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .message("message")
                .build()

        assertThat(configDeleteResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(configDeleteResponse.message()).isEqualTo("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val configDeleteResponse =
            ConfigDeleteResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .message("message")
                .build()

        val roundtrippedConfigDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(configDeleteResponse),
                jacksonTypeRef<ConfigDeleteResponse>(),
            )

        assertThat(roundtrippedConfigDeleteResponse).isEqualTo(configDeleteResponse)
    }
}

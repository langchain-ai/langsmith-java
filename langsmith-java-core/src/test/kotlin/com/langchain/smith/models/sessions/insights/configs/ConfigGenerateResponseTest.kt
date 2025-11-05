// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions.insights.configs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigGenerateResponseTest {

    @Test
    fun create() {
        val configGenerateResponse =
            ConfigGenerateResponse.builder()
                .name("name")
                .summaryPrompt("summary_prompt")
                .attributeSchemas(
                    ConfigGenerateResponse.AttributeSchemas.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        assertThat(configGenerateResponse.name()).isEqualTo("name")
        assertThat(configGenerateResponse.summaryPrompt()).isEqualTo("summary_prompt")
        assertThat(configGenerateResponse.attributeSchemas())
            .contains(
                ConfigGenerateResponse.AttributeSchemas.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val configGenerateResponse =
            ConfigGenerateResponse.builder()
                .name("name")
                .summaryPrompt("summary_prompt")
                .attributeSchemas(
                    ConfigGenerateResponse.AttributeSchemas.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        val roundtrippedConfigGenerateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(configGenerateResponse),
                jacksonTypeRef<ConfigGenerateResponse>(),
            )

        assertThat(roundtrippedConfigGenerateResponse).isEqualTo(configGenerateResponse)
    }
}

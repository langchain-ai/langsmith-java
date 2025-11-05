// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.promptwebhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PromptWebhookTestResponseTest {

    @Test
    fun create() {
        val promptWebhookTestResponse =
            PromptWebhookTestResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("string"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val promptWebhookTestResponse =
            PromptWebhookTestResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("string"))
                .build()

        val roundtrippedPromptWebhookTestResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(promptWebhookTestResponse),
                jacksonTypeRef<PromptWebhookTestResponse>(),
            )

        assertThat(roundtrippedPromptWebhookTestResponse).isEqualTo(promptWebhookTestResponse)
    }
}

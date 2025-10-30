// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.promptwebhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
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

// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.promptwebhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PromptWebhookDeleteResponseTest {

    @Test
    fun create() {
        val promptWebhookDeleteResponse = PromptWebhookDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val promptWebhookDeleteResponse = PromptWebhookDeleteResponse.builder().build()

        val roundtrippedPromptWebhookDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(promptWebhookDeleteResponse),
                jacksonTypeRef<PromptWebhookDeleteResponse>(),
            )

        assertThat(roundtrippedPromptWebhookDeleteResponse).isEqualTo(promptWebhookDeleteResponse)
    }
}

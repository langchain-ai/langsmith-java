// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.prompts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PromptInvokePromptResponseTest {

    @Test
    fun create() {
        val promptInvokePromptResponse = PromptInvokePromptResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val promptInvokePromptResponse = PromptInvokePromptResponse.builder().build()

        val roundtrippedPromptInvokePromptResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(promptInvokePromptResponse),
                jacksonTypeRef<PromptInvokePromptResponse>(),
            )

        assertThat(roundtrippedPromptInvokePromptResponse).isEqualTo(promptInvokePromptResponse)
    }
}

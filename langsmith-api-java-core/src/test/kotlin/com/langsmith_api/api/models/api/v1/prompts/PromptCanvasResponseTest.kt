// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.prompts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PromptCanvasResponseTest {

    @Test
    fun create() {
        val promptCanvasResponse = PromptCanvasResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val promptCanvasResponse = PromptCanvasResponse.builder().build()

        val roundtrippedPromptCanvasResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(promptCanvasResponse),
                jacksonTypeRef<PromptCanvasResponse>(),
            )

        assertThat(roundtrippedPromptCanvasResponse).isEqualTo(promptCanvasResponse)
    }
}

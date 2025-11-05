// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.prompts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolCallTest {

    @Test
    fun create() {
        val toolCall =
            ToolCall.builder()
                .id("id")
                .args(JsonValue.from(mapOf<String, Any>()))
                .name("name")
                .type(ToolCall.Type.TOOL_CALL)
                .build()

        assertThat(toolCall.id()).contains("id")
        assertThat(toolCall._args()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(toolCall.name()).isEqualTo("name")
        assertThat(toolCall.type()).contains(ToolCall.Type.TOOL_CALL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val toolCall =
            ToolCall.builder()
                .id("id")
                .args(JsonValue.from(mapOf<String, Any>()))
                .name("name")
                .type(ToolCall.Type.TOOL_CALL)
                .build()

        val roundtrippedToolCall =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolCall),
                jacksonTypeRef<ToolCall>(),
            )

        assertThat(roundtrippedToolCall).isEqualTo(toolCall)
    }
}

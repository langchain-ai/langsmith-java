// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.prompts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvalidToolCallTest {

    @Test
    fun create() {
        val invalidToolCall =
            InvalidToolCall.builder()
                .id("id")
                .args("args")
                .error("error")
                .name("name")
                .extras(JsonValue.from(mapOf<String, Any>()))
                .index(0L)
                .build()

        assertThat(invalidToolCall.id()).contains("id")
        assertThat(invalidToolCall.args()).contains("args")
        assertThat(invalidToolCall.error()).contains("error")
        assertThat(invalidToolCall.name()).contains("name")
        assertThat(invalidToolCall._extras()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(invalidToolCall.index()).contains(InvalidToolCall.Index.ofInteger(0L))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invalidToolCall =
            InvalidToolCall.builder()
                .id("id")
                .args("args")
                .error("error")
                .name("name")
                .extras(JsonValue.from(mapOf<String, Any>()))
                .index(0L)
                .build()

        val roundtrippedInvalidToolCall =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invalidToolCall),
                jacksonTypeRef<InvalidToolCall>(),
            )

        assertThat(roundtrippedInvalidToolCall).isEqualTo(invalidToolCall)
    }
}

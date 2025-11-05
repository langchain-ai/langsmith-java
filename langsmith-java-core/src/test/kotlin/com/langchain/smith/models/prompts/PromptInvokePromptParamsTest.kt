// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.prompts

import com.langchain.smith.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PromptInvokePromptParamsTest {

    @Test
    fun create() {
        PromptInvokePromptParams.builder()
            .inputs(JsonValue.from(mapOf<String, Any>()))
            .addMessage(
                listOf(JsonValue.from(mapOf<String, Any>()), JsonValue.from(mapOf<String, Any>()))
            )
            .templateFormat("template_format")
            .build()
    }

    @Test
    fun body() {
        val params =
            PromptInvokePromptParams.builder()
                .inputs(JsonValue.from(mapOf<String, Any>()))
                .addMessage(
                    listOf(
                        JsonValue.from(mapOf<String, Any>()),
                        JsonValue.from(mapOf<String, Any>()),
                    )
                )
                .templateFormat("template_format")
                .build()

        val body = params._body()

        assertThat(body._inputs()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.messages())
            .containsExactly(
                listOf(JsonValue.from(mapOf<String, Any>()), JsonValue.from(mapOf<String, Any>()))
            )
        assertThat(body.templateFormat()).isEqualTo("template_format")
    }
}

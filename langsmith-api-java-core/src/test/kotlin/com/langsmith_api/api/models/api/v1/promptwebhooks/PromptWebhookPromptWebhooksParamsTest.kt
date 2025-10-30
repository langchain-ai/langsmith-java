// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.promptwebhooks

import com.langsmith_api.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PromptWebhookPromptWebhooksParamsTest {

    @Test
    fun create() {
        PromptWebhookPromptWebhooksParams.builder()
            .url("https://example.com")
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addExcludePrompt("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .headers(JsonValue.from(mapOf<String, Any>()))
            .addIncludePrompt("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addTrigger(EPromptWebhookTrigger.COMMIT)
            .build()
    }

    @Test
    fun body() {
        val params =
            PromptWebhookPromptWebhooksParams.builder()
                .url("https://example.com")
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addExcludePrompt("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .headers(JsonValue.from(mapOf<String, Any>()))
                .addIncludePrompt("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addTrigger(EPromptWebhookTrigger.COMMIT)
                .build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("https://example.com")
        assertThat(body.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.excludePrompts().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body._headers_()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.includePrompts().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.triggers().getOrNull()).containsExactly(EPromptWebhookTrigger.COMMIT)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PromptWebhookPromptWebhooksParams.builder().url("https://example.com").build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("https://example.com")
    }
}

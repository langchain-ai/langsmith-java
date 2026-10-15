// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.promptwebhooks

import com.langchain.smith.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PromptWebhookCreateParamsTest {

    @Test
    fun create() {
        PromptWebhookCreateParams.builder()
            .url("https://example.com")
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addExcludePrompt("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .headers(
                PromptWebhookCreateParams.WebhookHeaders.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .addIncludePrompt("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addTrigger(PromptWebhookCreateParams.Trigger.COMMIT)
            .build()
    }

    @Test
    fun body() {
        val params =
            PromptWebhookCreateParams.builder()
                .url("https://example.com")
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addExcludePrompt("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .headers(
                    PromptWebhookCreateParams.WebhookHeaders.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addIncludePrompt("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addTrigger(PromptWebhookCreateParams.Trigger.COMMIT)
                .build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("https://example.com")
        assertThat(body.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.excludePrompts().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.headers())
            .contains(
                PromptWebhookCreateParams.WebhookHeaders.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.includePrompts().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.triggers().getOrNull())
            .containsExactly(PromptWebhookCreateParams.Trigger.COMMIT)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PromptWebhookCreateParams.builder().url("https://example.com").build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("https://example.com")
    }
}

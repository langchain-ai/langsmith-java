// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.promptwebhooks

import com.langchain.smith.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PromptWebhookTestParamsTest {

    @Test
    fun create() {
        PromptWebhookTestParams.builder()
            .payload(
                PromptWebhookTestParams.Payload.builder()
                    .commitHash("commit_hash")
                    .createdAt("created_at")
                    .createdBy("created_by")
                    .event(EPromptWebhookTrigger.COMMIT)
                    .manifest(JsonValue.from(mapOf<String, Any>()))
                    .promptId("prompt_id")
                    .promptName("prompt_name")
                    .tagName("tag_name")
                    .build()
            )
            .webhook(
                PromptWebhookTestParams.Webhook.builder()
                    .url("https://example.com")
                    .addExcludePrompt("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .headers(JsonValue.from(mapOf<String, Any>()))
                    .addIncludePrompt("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addTrigger(EPromptWebhookTrigger.COMMIT)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            PromptWebhookTestParams.builder()
                .payload(
                    PromptWebhookTestParams.Payload.builder()
                        .commitHash("commit_hash")
                        .createdAt("created_at")
                        .createdBy("created_by")
                        .event(EPromptWebhookTrigger.COMMIT)
                        .manifest(JsonValue.from(mapOf<String, Any>()))
                        .promptId("prompt_id")
                        .promptName("prompt_name")
                        .tagName("tag_name")
                        .build()
                )
                .webhook(
                    PromptWebhookTestParams.Webhook.builder()
                        .url("https://example.com")
                        .addExcludePrompt("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .headers(JsonValue.from(mapOf<String, Any>()))
                        .addIncludePrompt("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addTrigger(EPromptWebhookTrigger.COMMIT)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.payload())
            .isEqualTo(
                PromptWebhookTestParams.Payload.builder()
                    .commitHash("commit_hash")
                    .createdAt("created_at")
                    .createdBy("created_by")
                    .event(EPromptWebhookTrigger.COMMIT)
                    .manifest(JsonValue.from(mapOf<String, Any>()))
                    .promptId("prompt_id")
                    .promptName("prompt_name")
                    .tagName("tag_name")
                    .build()
            )
        assertThat(body.webhook())
            .isEqualTo(
                PromptWebhookTestParams.Webhook.builder()
                    .url("https://example.com")
                    .addExcludePrompt("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .headers(JsonValue.from(mapOf<String, Any>()))
                    .addIncludePrompt("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addTrigger(EPromptWebhookTrigger.COMMIT)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PromptWebhookTestParams.builder()
                .payload(
                    PromptWebhookTestParams.Payload.builder()
                        .commitHash("commit_hash")
                        .createdAt("created_at")
                        .createdBy("created_by")
                        .event(EPromptWebhookTrigger.COMMIT)
                        .manifest(JsonValue.from(mapOf<String, Any>()))
                        .promptId("prompt_id")
                        .promptName("prompt_name")
                        .build()
                )
                .webhook(
                    PromptWebhookTestParams.Webhook.builder().url("https://example.com").build()
                )
                .build()

        val body = params._body()

        assertThat(body.payload())
            .isEqualTo(
                PromptWebhookTestParams.Payload.builder()
                    .commitHash("commit_hash")
                    .createdAt("created_at")
                    .createdBy("created_by")
                    .event(EPromptWebhookTrigger.COMMIT)
                    .manifest(JsonValue.from(mapOf<String, Any>()))
                    .promptId("prompt_id")
                    .promptName("prompt_name")
                    .build()
            )
        assertThat(body.webhook())
            .isEqualTo(PromptWebhookTestParams.Webhook.builder().url("https://example.com").build())
    }
}

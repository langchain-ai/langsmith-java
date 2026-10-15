// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.promptwebhooks.PromptWebhookCreateParams
import com.langchain.smith.models.promptwebhooks.PromptWebhookTestParams
import com.langchain.smith.models.promptwebhooks.PromptWebhookUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PromptWebhookServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val promptWebhookServiceAsync = client.promptWebhooks()

        val promptWebhookFuture =
            promptWebhookServiceAsync.create(
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
            )

        val promptWebhook = promptWebhookFuture.get()
        promptWebhook.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val promptWebhookServiceAsync = client.promptWebhooks()

        val promptWebhookFuture =
            promptWebhookServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val promptWebhook = promptWebhookFuture.get()
        promptWebhook.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val promptWebhookServiceAsync = client.promptWebhooks()

        val promptWebhookFuture =
            promptWebhookServiceAsync.update(
                PromptWebhookUpdateParams.builder()
                    .webhookId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addExcludePrompt("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .headers(
                        PromptWebhookUpdateParams.WebhookHeaders.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .addIncludePrompt("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addTrigger(PromptWebhookUpdateParams.Trigger.COMMIT)
                    .url("https://example.com")
                    .build()
            )

        val promptWebhook = promptWebhookFuture.get()
        promptWebhook.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val promptWebhookServiceAsync = client.promptWebhooks()

        val promptWebhooksFuture = promptWebhookServiceAsync.list()

        val promptWebhooks = promptWebhooksFuture.get()
        promptWebhooks.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val promptWebhookServiceAsync = client.promptWebhooks()

        val future = promptWebhookServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun test() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val promptWebhookServiceAsync = client.promptWebhooks()

        val responseFuture =
            promptWebhookServiceAsync.test(
                PromptWebhookTestParams.builder()
                    .payload(
                        PromptWebhookTestParams.Payload.builder()
                            .commitHash("commit_hash")
                            .createdAt("created_at")
                            .createdBy("created_by")
                            .event(PromptWebhookTestParams.Payload.Event.COMMIT)
                            .manifest(
                                PromptWebhookTestParams.Payload.Manifest.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .promptId("prompt_id")
                            .promptName("prompt_name")
                            .tagName("tag_name")
                            .build()
                    )
                    .webhook(
                        PromptWebhookTestParams.Webhook.builder()
                            .url("https://example.com")
                            .addExcludePrompt("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .headers(
                                PromptWebhookTestParams.Webhook.WebhookHeaders.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .addIncludePrompt("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addTrigger(PromptWebhookTestParams.Webhook.Trigger.COMMIT)
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}

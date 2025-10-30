// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.models.api.v1.promptwebhooks.EPromptWebhookTrigger
import com.langsmith_api.api.models.api.v1.promptwebhooks.PromptWebhookPromptWebhooksParams
import com.langsmith_api.api.models.api.v1.promptwebhooks.PromptWebhookTestParams
import com.langsmith_api.api.models.api.v1.promptwebhooks.PromptWebhookUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PromptWebhookServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val promptWebhookServiceAsync = client.api().v1().promptWebhooks()

        val promptWebhookFuture =
            promptWebhookServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val promptWebhook = promptWebhookFuture.get()
        promptWebhook.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val promptWebhookServiceAsync = client.api().v1().promptWebhooks()

        val promptWebhookFuture =
            promptWebhookServiceAsync.update(
                PromptWebhookUpdateParams.builder()
                    .webhookId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addExcludePrompt("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .headers(JsonValue.from(mapOf<String, Any>()))
                    .addIncludePrompt("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addTrigger(EPromptWebhookTrigger.COMMIT)
                    .url("https://example.com")
                    .build()
            )

        val promptWebhook = promptWebhookFuture.get()
        promptWebhook.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val promptWebhookServiceAsync = client.api().v1().promptWebhooks()

        val promptWebhookFuture =
            promptWebhookServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val promptWebhook = promptWebhookFuture.get()
        promptWebhook.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun promptWebhooks() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val promptWebhookServiceAsync = client.api().v1().promptWebhooks()

        val promptWebhookFuture =
            promptWebhookServiceAsync.promptWebhooks(
                PromptWebhookPromptWebhooksParams.builder()
                    .url("https://example.com")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addExcludePrompt("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .headers(JsonValue.from(mapOf<String, Any>()))
                    .addIncludePrompt("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addTrigger(EPromptWebhookTrigger.COMMIT)
                    .build()
            )

        val promptWebhook = promptWebhookFuture.get()
        promptWebhook.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrievePromptWebhooks() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val promptWebhookServiceAsync = client.api().v1().promptWebhooks()

        val promptWebhooksFuture = promptWebhookServiceAsync.retrievePromptWebhooks()

        val promptWebhooks = promptWebhooksFuture.get()
        promptWebhooks.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun test() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val promptWebhookServiceAsync = client.api().v1().promptWebhooks()

        val responseFuture =
            promptWebhookServiceAsync.test(
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
            )

        val response = responseFuture.get()
        response.validate()
    }
}

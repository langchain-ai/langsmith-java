// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.promptwebhooks.EPromptWebhookTrigger
import com.langchain.smith.models.promptwebhooks.PromptWebhookPromptWebhooksParams
import com.langchain.smith.models.promptwebhooks.PromptWebhookTestParams
import com.langchain.smith.models.promptwebhooks.PromptWebhookUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PromptWebhookServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val promptWebhookService = client.promptWebhooks()

        val promptWebhook = promptWebhookService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        promptWebhook.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val promptWebhookService = client.promptWebhooks()

        val promptWebhook =
            promptWebhookService.update(
                PromptWebhookUpdateParams.builder()
                    .webhookId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addExcludePrompt("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .headers(JsonValue.from(mapOf<String, Any>()))
                    .addIncludePrompt("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addTrigger(EPromptWebhookTrigger.COMMIT)
                    .url("https://example.com")
                    .build()
            )

        promptWebhook.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val promptWebhookService = client.promptWebhooks()

        val promptWebhook = promptWebhookService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        promptWebhook.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun promptWebhooks() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val promptWebhookService = client.promptWebhooks()

        val promptWebhook =
            promptWebhookService.promptWebhooks(
                PromptWebhookPromptWebhooksParams.builder()
                    .url("https://example.com")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addExcludePrompt("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .headers(JsonValue.from(mapOf<String, Any>()))
                    .addIncludePrompt("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addTrigger(EPromptWebhookTrigger.COMMIT)
                    .build()
            )

        promptWebhook.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrievePromptWebhooks() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val promptWebhookService = client.promptWebhooks()

        val promptWebhooks = promptWebhookService.retrievePromptWebhooks()

        promptWebhooks.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun test() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val promptWebhookService = client.promptWebhooks()

        val response =
            promptWebhookService.test(
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

        response.validate()
    }
}

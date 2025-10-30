// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.promptwebhooks

import com.langsmith_api.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PromptWebhookUpdateParamsTest {

    @Test
    fun create() {
        PromptWebhookUpdateParams.builder()
            .webhookId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addExcludePrompt("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .headers(JsonValue.from(mapOf<String, Any>()))
            .addIncludePrompt("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addTrigger(EPromptWebhookTrigger.COMMIT)
            .url("https://example.com")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PromptWebhookUpdateParams.builder()
                .webhookId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PromptWebhookUpdateParams.builder()
                .webhookId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addExcludePrompt("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .headers(JsonValue.from(mapOf<String, Any>()))
                .addIncludePrompt("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addTrigger(EPromptWebhookTrigger.COMMIT)
                .url("https://example.com")
                .build()

        val body = params._body()

        assertThat(body.excludePrompts().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body._headers_()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.includePrompts().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.triggers().getOrNull()).containsExactly(EPromptWebhookTrigger.COMMIT)
        assertThat(body.url()).contains("https://example.com")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PromptWebhookUpdateParams.builder()
                .webhookId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}

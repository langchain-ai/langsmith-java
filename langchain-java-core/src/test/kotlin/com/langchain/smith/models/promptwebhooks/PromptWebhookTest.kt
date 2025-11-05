// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.promptwebhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PromptWebhookTest {

    @Test
    fun create() {
        val promptWebhook =
            PromptWebhook.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .url("https://example.com")
                .addExcludePrompt("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .headers(JsonValue.from(mapOf<String, Any>()))
                .addIncludePrompt("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addTrigger(EPromptWebhookTrigger.COMMIT)
                .build()

        assertThat(promptWebhook.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(promptWebhook.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(promptWebhook.tenantId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(promptWebhook.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(promptWebhook.url()).isEqualTo("https://example.com")
        assertThat(promptWebhook.excludePrompts().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(promptWebhook._headers()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(promptWebhook.includePrompts().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(promptWebhook.triggers().getOrNull())
            .containsExactly(EPromptWebhookTrigger.COMMIT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val promptWebhook =
            PromptWebhook.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .url("https://example.com")
                .addExcludePrompt("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .headers(JsonValue.from(mapOf<String, Any>()))
                .addIncludePrompt("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addTrigger(EPromptWebhookTrigger.COMMIT)
                .build()

        val roundtrippedPromptWebhook =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(promptWebhook),
                jacksonTypeRef<PromptWebhook>(),
            )

        assertThat(roundtrippedPromptWebhook).isEqualTo(promptWebhook)
    }
}

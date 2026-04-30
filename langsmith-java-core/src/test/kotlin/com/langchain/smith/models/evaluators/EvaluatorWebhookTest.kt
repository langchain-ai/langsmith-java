// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.evaluators

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EvaluatorWebhookTest {

    @Test
    fun create() {
        val evaluatorWebhook =
            EvaluatorWebhook.builder()
                .url("url")
                .headers(
                    EvaluatorWebhook.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(evaluatorWebhook.url()).isEqualTo("url")
        assertThat(evaluatorWebhook.headers())
            .contains(
                EvaluatorWebhook.Headers.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val evaluatorWebhook =
            EvaluatorWebhook.builder()
                .url("url")
                .headers(
                    EvaluatorWebhook.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedEvaluatorWebhook =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(evaluatorWebhook),
                jacksonTypeRef<EvaluatorWebhook>(),
            )

        assertThat(roundtrippedEvaluatorWebhook).isEqualTo(evaluatorWebhook)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.runs.rules

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunRulesWebhookSchemaTest {

    @Test
    fun create() {
        val runRulesWebhookSchema =
            RunRulesWebhookSchema.builder()
                .url("url")
                .headers(
                    RunRulesWebhookSchema.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(runRulesWebhookSchema.url()).isEqualTo("url")
        assertThat(runRulesWebhookSchema.headers())
            .contains(
                RunRulesWebhookSchema.Headers.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runRulesWebhookSchema =
            RunRulesWebhookSchema.builder()
                .url("url")
                .headers(
                    RunRulesWebhookSchema.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedRunRulesWebhookSchema =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runRulesWebhookSchema),
                jacksonTypeRef<RunRulesWebhookSchema>(),
            )

        assertThat(roundtrippedRunRulesWebhookSchema).isEqualTo(runRulesWebhookSchema)
    }
}

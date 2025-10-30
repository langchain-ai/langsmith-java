// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.feedback

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutoEvalFeedbackSourceTest {

    @Test
    fun create() {
        val autoEvalFeedbackSource =
            AutoEvalFeedbackSource.builder()
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .type("type")
                .build()

        assertThat(autoEvalFeedbackSource._metadata())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(autoEvalFeedbackSource.type()).contains("type")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val autoEvalFeedbackSource =
            AutoEvalFeedbackSource.builder()
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .type("type")
                .build()

        val roundtrippedAutoEvalFeedbackSource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(autoEvalFeedbackSource),
                jacksonTypeRef<AutoEvalFeedbackSource>(),
            )

        assertThat(roundtrippedAutoEvalFeedbackSource).isEqualTo(autoEvalFeedbackSource)
    }
}

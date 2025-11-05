// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.feedback

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModelFeedbackSourceTest {

    @Test
    fun create() {
        val modelFeedbackSource =
            ModelFeedbackSource.builder()
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .type("type")
                .build()

        assertThat(modelFeedbackSource._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(modelFeedbackSource.type()).contains("type")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val modelFeedbackSource =
            ModelFeedbackSource.builder()
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .type("type")
                .build()

        val roundtrippedModelFeedbackSource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modelFeedbackSource),
                jacksonTypeRef<ModelFeedbackSource>(),
            )

        assertThat(roundtrippedModelFeedbackSource).isEqualTo(modelFeedbackSource)
    }
}

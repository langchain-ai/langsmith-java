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
                .metadata(
                    ModelFeedbackSource.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .type(ModelFeedbackSource.Type.MODEL)
                .build()

        assertThat(modelFeedbackSource.metadata())
            .contains(
                ModelFeedbackSource.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(modelFeedbackSource.type()).contains(ModelFeedbackSource.Type.MODEL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val modelFeedbackSource =
            ModelFeedbackSource.builder()
                .metadata(
                    ModelFeedbackSource.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .type(ModelFeedbackSource.Type.MODEL)
                .build()

        val roundtrippedModelFeedbackSource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modelFeedbackSource),
                jacksonTypeRef<ModelFeedbackSource>(),
            )

        assertThat(roundtrippedModelFeedbackSource).isEqualTo(modelFeedbackSource)
    }
}

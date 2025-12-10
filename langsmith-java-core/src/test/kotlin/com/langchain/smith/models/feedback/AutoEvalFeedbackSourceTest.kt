// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.feedback

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutoEvalFeedbackSourceTest {

    @Test
    fun create() {
        val autoEvalFeedbackSource =
            AutoEvalFeedbackSource.builder()
                .metadata(
                    AutoEvalFeedbackSource.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .type(AutoEvalFeedbackSource.Type.AUTO_EVAL)
                .build()

        assertThat(autoEvalFeedbackSource.metadata())
            .contains(
                AutoEvalFeedbackSource.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(autoEvalFeedbackSource.type()).contains(AutoEvalFeedbackSource.Type.AUTO_EVAL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val autoEvalFeedbackSource =
            AutoEvalFeedbackSource.builder()
                .metadata(
                    AutoEvalFeedbackSource.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .type(AutoEvalFeedbackSource.Type.AUTO_EVAL)
                .build()

        val roundtrippedAutoEvalFeedbackSource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(autoEvalFeedbackSource),
                jacksonTypeRef<AutoEvalFeedbackSource>(),
            )

        assertThat(roundtrippedAutoEvalFeedbackSource).isEqualTo(autoEvalFeedbackSource)
    }
}

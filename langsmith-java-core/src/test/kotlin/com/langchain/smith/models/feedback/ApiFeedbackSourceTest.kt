// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.feedback

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiFeedbackSourceTest {

    @Test
    fun create() {
        val apiFeedbackSource =
            ApiFeedbackSource.builder()
                .metadata(
                    ApiFeedbackSource.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .type(ApiFeedbackSource.Type.API)
                .build()

        assertThat(apiFeedbackSource.metadata())
            .contains(
                ApiFeedbackSource.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(apiFeedbackSource.type()).contains(ApiFeedbackSource.Type.API)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiFeedbackSource =
            ApiFeedbackSource.builder()
                .metadata(
                    ApiFeedbackSource.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .type(ApiFeedbackSource.Type.API)
                .build()

        val roundtrippedApiFeedbackSource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiFeedbackSource),
                jacksonTypeRef<ApiFeedbackSource>(),
            )

        assertThat(roundtrippedApiFeedbackSource).isEqualTo(apiFeedbackSource)
    }
}

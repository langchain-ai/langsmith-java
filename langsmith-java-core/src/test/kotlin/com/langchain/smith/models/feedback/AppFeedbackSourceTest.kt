// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.feedback

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AppFeedbackSourceTest {

    @Test
    fun create() {
        val appFeedbackSource =
            AppFeedbackSource.builder()
                .metadata(
                    AppFeedbackSource.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .type(AppFeedbackSource.Type.APP)
                .build()

        assertThat(appFeedbackSource.metadata())
            .contains(
                AppFeedbackSource.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(appFeedbackSource.type()).contains(AppFeedbackSource.Type.APP)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val appFeedbackSource =
            AppFeedbackSource.builder()
                .metadata(
                    AppFeedbackSource.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .type(AppFeedbackSource.Type.APP)
                .build()

        val roundtrippedAppFeedbackSource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(appFeedbackSource),
                jacksonTypeRef<AppFeedbackSource>(),
            )

        assertThat(roundtrippedAppFeedbackSource).isEqualTo(appFeedbackSource)
    }
}

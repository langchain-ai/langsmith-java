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
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .type(AppFeedbackSource.Type.APP)
                .build()

        assertThat(appFeedbackSource._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(appFeedbackSource.type()).contains(AppFeedbackSource.Type.APP)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val appFeedbackSource =
            AppFeedbackSource.builder()
                .metadata(JsonValue.from(mapOf<String, Any>()))
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

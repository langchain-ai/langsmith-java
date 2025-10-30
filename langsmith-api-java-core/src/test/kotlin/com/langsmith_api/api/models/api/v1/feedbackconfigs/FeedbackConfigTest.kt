// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.feedbackconfigs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeedbackConfigTest {

    @Test
    fun create() {
        val feedbackConfig =
            FeedbackConfig.builder()
                .type(FeedbackConfig.Type.CONTINUOUS)
                .addCategory(FeedbackConfig.Category.builder().value(0.0).label("x").build())
                .max(0.0)
                .min(0.0)
                .build()

        assertThat(feedbackConfig.type()).isEqualTo(FeedbackConfig.Type.CONTINUOUS)
        assertThat(feedbackConfig.categories().getOrNull())
            .containsExactly(FeedbackConfig.Category.builder().value(0.0).label("x").build())
        assertThat(feedbackConfig.max()).contains(0.0)
        assertThat(feedbackConfig.min()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val feedbackConfig =
            FeedbackConfig.builder()
                .type(FeedbackConfig.Type.CONTINUOUS)
                .addCategory(FeedbackConfig.Category.builder().value(0.0).label("x").build())
                .max(0.0)
                .min(0.0)
                .build()

        val roundtrippedFeedbackConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(feedbackConfig),
                jacksonTypeRef<FeedbackConfig>(),
            )

        assertThat(roundtrippedFeedbackConfig).isEqualTo(feedbackConfig)
    }
}

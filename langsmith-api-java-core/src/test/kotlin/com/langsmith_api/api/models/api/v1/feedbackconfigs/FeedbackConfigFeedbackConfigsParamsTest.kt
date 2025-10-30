// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.feedbackconfigs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeedbackConfigFeedbackConfigsParamsTest {

    @Test
    fun create() {
        FeedbackConfigFeedbackConfigsParams.builder()
            .feedbackConfig(
                FeedbackConfig.builder()
                    .type(FeedbackConfig.Type.CONTINUOUS)
                    .addCategory(FeedbackConfig.Category.builder().value(0.0).label("x").build())
                    .max(0.0)
                    .min(0.0)
                    .build()
            )
            .feedbackKey("feedback_key")
            .isLowerScoreBetter(true)
            .build()
    }

    @Test
    fun body() {
        val params =
            FeedbackConfigFeedbackConfigsParams.builder()
                .feedbackConfig(
                    FeedbackConfig.builder()
                        .type(FeedbackConfig.Type.CONTINUOUS)
                        .addCategory(
                            FeedbackConfig.Category.builder().value(0.0).label("x").build()
                        )
                        .max(0.0)
                        .min(0.0)
                        .build()
                )
                .feedbackKey("feedback_key")
                .isLowerScoreBetter(true)
                .build()

        val body = params._body()

        assertThat(body.feedbackConfig())
            .isEqualTo(
                FeedbackConfig.builder()
                    .type(FeedbackConfig.Type.CONTINUOUS)
                    .addCategory(FeedbackConfig.Category.builder().value(0.0).label("x").build())
                    .max(0.0)
                    .min(0.0)
                    .build()
            )
        assertThat(body.feedbackKey()).isEqualTo("feedback_key")
        assertThat(body.isLowerScoreBetter()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FeedbackConfigFeedbackConfigsParams.builder()
                .feedbackConfig(
                    FeedbackConfig.builder().type(FeedbackConfig.Type.CONTINUOUS).build()
                )
                .feedbackKey("feedback_key")
                .build()

        val body = params._body()

        assertThat(body.feedbackConfig())
            .isEqualTo(FeedbackConfig.builder().type(FeedbackConfig.Type.CONTINUOUS).build())
        assertThat(body.feedbackKey()).isEqualTo("feedback_key")
    }
}

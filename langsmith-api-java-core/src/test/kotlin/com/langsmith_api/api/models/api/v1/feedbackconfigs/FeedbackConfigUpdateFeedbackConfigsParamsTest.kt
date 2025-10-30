// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.feedbackconfigs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeedbackConfigUpdateFeedbackConfigsParamsTest {

    @Test
    fun create() {
        FeedbackConfigUpdateFeedbackConfigsParams.builder()
            .feedbackKey("feedback_key")
            .feedbackConfig(
                FeedbackConfig.builder()
                    .type(FeedbackConfig.Type.CONTINUOUS)
                    .addCategory(FeedbackConfig.Category.builder().value(0.0).label("x").build())
                    .max(0.0)
                    .min(0.0)
                    .build()
            )
            .isLowerScoreBetter(true)
            .build()
    }

    @Test
    fun body() {
        val params =
            FeedbackConfigUpdateFeedbackConfigsParams.builder()
                .feedbackKey("feedback_key")
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
                .isLowerScoreBetter(true)
                .build()

        val body = params._body()

        assertThat(body.feedbackKey()).isEqualTo("feedback_key")
        assertThat(body.feedbackConfig())
            .contains(
                FeedbackConfig.builder()
                    .type(FeedbackConfig.Type.CONTINUOUS)
                    .addCategory(FeedbackConfig.Category.builder().value(0.0).label("x").build())
                    .max(0.0)
                    .min(0.0)
                    .build()
            )
        assertThat(body.isLowerScoreBetter()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FeedbackConfigUpdateFeedbackConfigsParams.builder().feedbackKey("feedback_key").build()

        val body = params._body()

        assertThat(body.feedbackKey()).isEqualTo("feedback_key")
    }
}

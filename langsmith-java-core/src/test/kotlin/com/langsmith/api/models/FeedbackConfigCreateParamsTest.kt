// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.langsmith.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FeedbackConfigCreateParamsTest {

    @Test
    fun createFeedbackConfigCreateParams() {
        FeedbackConfigCreateParams.builder()
            .feedbackConfig(
                FeedbackConfigCreateParams.FeedbackConfig.builder()
                    .type(FeedbackConfigCreateParams.FeedbackConfig.Type.CONTINUOUS)
                    .categories(
                        listOf(
                            FeedbackConfigCreateParams.FeedbackConfig.Category.builder()
                                .value(42.23)
                                .label("x")
                                .build()
                        )
                    )
                    .max(42.23)
                    .min(42.23)
                    .build()
            )
            .feedbackKey("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            FeedbackConfigCreateParams.builder()
                .feedbackConfig(
                    FeedbackConfigCreateParams.FeedbackConfig.builder()
                        .type(FeedbackConfigCreateParams.FeedbackConfig.Type.CONTINUOUS)
                        .categories(
                            listOf(
                                FeedbackConfigCreateParams.FeedbackConfig.Category.builder()
                                    .value(42.23)
                                    .label("x")
                                    .build()
                            )
                        )
                        .max(42.23)
                        .min(42.23)
                        .build()
                )
                .feedbackKey("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.feedbackConfig())
            .isEqualTo(
                FeedbackConfigCreateParams.FeedbackConfig.builder()
                    .type(FeedbackConfigCreateParams.FeedbackConfig.Type.CONTINUOUS)
                    .categories(
                        listOf(
                            FeedbackConfigCreateParams.FeedbackConfig.Category.builder()
                                .value(42.23)
                                .label("x")
                                .build()
                        )
                    )
                    .max(42.23)
                    .min(42.23)
                    .build()
            )
        assertThat(body.feedbackKey()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            FeedbackConfigCreateParams.builder()
                .feedbackConfig(
                    FeedbackConfigCreateParams.FeedbackConfig.builder()
                        .type(FeedbackConfigCreateParams.FeedbackConfig.Type.CONTINUOUS)
                        .build()
                )
                .feedbackKey("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.feedbackConfig())
            .isEqualTo(
                FeedbackConfigCreateParams.FeedbackConfig.builder()
                    .type(FeedbackConfigCreateParams.FeedbackConfig.Type.CONTINUOUS)
                    .build()
            )
        assertThat(body.feedbackKey()).isEqualTo("string")
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.langsmith.api.core.JsonValue
import com.langsmith.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FeedbackUpdateParamsTest {

    @Test
    fun createFeedbackUpdateParams() {
        FeedbackUpdateParams.builder()
            .feedbackId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .comment("string")
            .correction(JsonValue.from(mapOf<String, Any>()))
            .feedbackConfig(
                FeedbackUpdateParams.FeedbackConfig.builder()
                    .type(FeedbackUpdateParams.FeedbackConfig.Type.CONTINUOUS)
                    .categories(
                        listOf(
                            FeedbackUpdateParams.FeedbackConfig.Category.builder()
                                .value(42.23)
                                .label("x")
                                .build()
                        )
                    )
                    .max(42.23)
                    .min(42.23)
                    .build()
            )
            .score(FeedbackUpdateParams.Score.ofDouble(42.23))
            .value(FeedbackUpdateParams.Value.ofDouble(42.23))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            FeedbackUpdateParams.builder()
                .feedbackId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .comment("string")
                .correction(JsonValue.from(mapOf<String, Any>()))
                .feedbackConfig(
                    FeedbackUpdateParams.FeedbackConfig.builder()
                        .type(FeedbackUpdateParams.FeedbackConfig.Type.CONTINUOUS)
                        .categories(
                            listOf(
                                FeedbackUpdateParams.FeedbackConfig.Category.builder()
                                    .value(42.23)
                                    .label("x")
                                    .build()
                            )
                        )
                        .max(42.23)
                        .min(42.23)
                        .build()
                )
                .score(FeedbackUpdateParams.Score.ofDouble(42.23))
                .value(FeedbackUpdateParams.Value.ofDouble(42.23))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.comment()).isEqualTo("string")
        assertThat(body.correction()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.feedbackConfig())
            .isEqualTo(
                FeedbackUpdateParams.FeedbackConfig.builder()
                    .type(FeedbackUpdateParams.FeedbackConfig.Type.CONTINUOUS)
                    .categories(
                        listOf(
                            FeedbackUpdateParams.FeedbackConfig.Category.builder()
                                .value(42.23)
                                .label("x")
                                .build()
                        )
                    )
                    .max(42.23)
                    .min(42.23)
                    .build()
            )
        assertThat(body.score()).isEqualTo(FeedbackUpdateParams.Score.ofDouble(42.23))
        assertThat(body.value()).isEqualTo(FeedbackUpdateParams.Value.ofDouble(42.23))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            FeedbackUpdateParams.builder()
                .feedbackId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            FeedbackUpdateParams.builder()
                .feedbackId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "feedbackId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}

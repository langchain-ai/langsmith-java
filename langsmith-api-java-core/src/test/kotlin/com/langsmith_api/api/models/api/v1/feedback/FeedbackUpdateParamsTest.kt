// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.feedback

import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.models.api.v1.feedbackconfigs.FeedbackConfig
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeedbackUpdateParamsTest {

    @Test
    fun create() {
        FeedbackUpdateParams.builder()
            .feedbackId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .comment("comment")
            .correction(JsonValue.from(mapOf<String, Any>()))
            .feedbackConfig(
                FeedbackConfig.builder()
                    .type(FeedbackConfig.Type.CONTINUOUS)
                    .addCategory(FeedbackConfig.Category.builder().value(0.0).label("x").build())
                    .max(0.0)
                    .min(0.0)
                    .build()
            )
            .score(0.0)
            .value(0.0)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FeedbackUpdateParams.builder()
                .feedbackId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            FeedbackUpdateParams.builder()
                .feedbackId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .comment("comment")
                .correction(JsonValue.from(mapOf<String, Any>()))
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
                .score(0.0)
                .value(0.0)
                .build()

        val body = params._body()

        assertThat(body.comment()).contains("comment")
        assertThat(body.correction())
            .contains(
                FeedbackUpdateParams.Correction.ofJsonValue(JsonValue.from(mapOf<String, Any>()))
            )
        assertThat(body.feedbackConfig())
            .contains(
                FeedbackConfig.builder()
                    .type(FeedbackConfig.Type.CONTINUOUS)
                    .addCategory(FeedbackConfig.Category.builder().value(0.0).label("x").build())
                    .max(0.0)
                    .min(0.0)
                    .build()
            )
        assertThat(body.score()).contains(FeedbackUpdateParams.Score.ofNumber(0.0))
        assertThat(body.value()).contains(FeedbackUpdateParams.Value.ofNumber(0.0))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FeedbackUpdateParams.builder()
                .feedbackId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.feedback

import com.langchain.smith.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeedbackUpdateParamsTest {

    @Test
    fun create() {
        FeedbackUpdateParams.builder()
            .feedbackId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .comment("comment")
            .correction(
                FeedbackUpdateParams.Correction.UnionMember0.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .feedbackConfig(
                FeedbackUpdateParams.FeedbackConfig.builder()
                    .type(FeedbackUpdateParams.FeedbackConfig.Type.CONTINUOUS)
                    .addCategory(
                        FeedbackUpdateParams.FeedbackConfig.Category.builder()
                            .value(0.0)
                            .label("x")
                            .build()
                    )
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
                .correction(
                    FeedbackUpdateParams.Correction.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .feedbackConfig(
                    FeedbackUpdateParams.FeedbackConfig.builder()
                        .type(FeedbackUpdateParams.FeedbackConfig.Type.CONTINUOUS)
                        .addCategory(
                            FeedbackUpdateParams.FeedbackConfig.Category.builder()
                                .value(0.0)
                                .label("x")
                                .build()
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
                FeedbackUpdateParams.Correction.ofUnionMember0(
                    FeedbackUpdateParams.Correction.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
            )
        assertThat(body.feedbackConfig())
            .contains(
                FeedbackUpdateParams.FeedbackConfig.builder()
                    .type(FeedbackUpdateParams.FeedbackConfig.Type.CONTINUOUS)
                    .addCategory(
                        FeedbackUpdateParams.FeedbackConfig.Category.builder()
                            .value(0.0)
                            .label("x")
                            .build()
                    )
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

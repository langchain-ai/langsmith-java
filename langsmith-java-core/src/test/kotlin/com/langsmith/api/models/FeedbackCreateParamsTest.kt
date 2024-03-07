// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.langsmith.api.core.JsonValue
import com.langsmith.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FeedbackCreateParamsTest {

    @Test
    fun createFeedbackCreateParams() {
        FeedbackCreateParams.builder()
            .key("string")
            .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .comment("string")
            .correction(JsonValue.from(mapOf<String, Any>()))
            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .feedbackConfig(
                FeedbackCreateParams.FeedbackConfig.builder()
                    .type(FeedbackCreateParams.FeedbackConfig.Type.CONTINUOUS)
                    .categories(
                        listOf(
                            FeedbackCreateParams.FeedbackConfig.Category.builder()
                                .value(42.23)
                                .label("x")
                                .build()
                        )
                    )
                    .max(42.23)
                    .min(42.23)
                    .build()
            )
            .feedbackSource(
                FeedbackCreateParams.FeedbackSource.ofAppFeedbackSource(
                    FeedbackCreateParams.FeedbackSource.AppFeedbackSource.builder()
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .type("string")
                        .build()
                )
            )
            .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .score(FeedbackCreateParams.Score.ofDouble(42.23))
            .value(FeedbackCreateParams.Value.ofDouble(42.23))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            FeedbackCreateParams.builder()
                .key("string")
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .comment("string")
                .correction(JsonValue.from(mapOf<String, Any>()))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .feedbackConfig(
                    FeedbackCreateParams.FeedbackConfig.builder()
                        .type(FeedbackCreateParams.FeedbackConfig.Type.CONTINUOUS)
                        .categories(
                            listOf(
                                FeedbackCreateParams.FeedbackConfig.Category.builder()
                                    .value(42.23)
                                    .label("x")
                                    .build()
                            )
                        )
                        .max(42.23)
                        .min(42.23)
                        .build()
                )
                .feedbackSource(
                    FeedbackCreateParams.FeedbackSource.ofAppFeedbackSource(
                        FeedbackCreateParams.FeedbackSource.AppFeedbackSource.builder()
                            .metadata(JsonValue.from(mapOf<String, Any>()))
                            .type("string")
                            .build()
                    )
                )
                .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .score(FeedbackCreateParams.Score.ofDouble(42.23))
                .value(FeedbackCreateParams.Value.ofDouble(42.23))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.key()).isEqualTo("string")
        assertThat(body.runId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.comment()).isEqualTo("string")
        assertThat(body.correction()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.feedbackConfig())
            .isEqualTo(
                FeedbackCreateParams.FeedbackConfig.builder()
                    .type(FeedbackCreateParams.FeedbackConfig.Type.CONTINUOUS)
                    .categories(
                        listOf(
                            FeedbackCreateParams.FeedbackConfig.Category.builder()
                                .value(42.23)
                                .label("x")
                                .build()
                        )
                    )
                    .max(42.23)
                    .min(42.23)
                    .build()
            )
        assertThat(body.feedbackSource())
            .isEqualTo(
                FeedbackCreateParams.FeedbackSource.ofAppFeedbackSource(
                    FeedbackCreateParams.FeedbackSource.AppFeedbackSource.builder()
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .type("string")
                        .build()
                )
            )
        assertThat(body.modifiedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.score()).isEqualTo(FeedbackCreateParams.Score.ofDouble(42.23))
        assertThat(body.value()).isEqualTo(FeedbackCreateParams.Value.ofDouble(42.23))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            FeedbackCreateParams.builder()
                .key("string")
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.key()).isEqualTo("string")
        assertThat(body.runId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}

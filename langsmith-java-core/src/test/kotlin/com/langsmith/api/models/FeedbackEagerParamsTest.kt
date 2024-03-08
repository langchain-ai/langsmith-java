// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.langsmith.api.core.JsonValue
import com.langsmith.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FeedbackEagerParamsTest {

    @Test
    fun createFeedbackEagerParams() {
        FeedbackEagerParams.builder()
            .key("string")
            .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .comment("string")
            .correction(JsonValue.from(mapOf<String, Any>()))
            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .feedbackConfig(
                FeedbackEagerParams.FeedbackConfig.builder()
                    .type(FeedbackEagerParams.FeedbackConfig.Type.CONTINUOUS)
                    .categories(
                        listOf(
                            FeedbackEagerParams.FeedbackConfig.Category.builder()
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
                FeedbackEagerParams.FeedbackSource.ofAppFeedbackSource(
                    FeedbackEagerParams.FeedbackSource.AppFeedbackSource.builder()
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .type("string")
                        .build()
                )
            )
            .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .score(FeedbackEagerParams.Score.ofDouble(42.23))
            .value(FeedbackEagerParams.Value.ofDouble(42.23))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            FeedbackEagerParams.builder()
                .key("string")
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .comment("string")
                .correction(JsonValue.from(mapOf<String, Any>()))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .feedbackConfig(
                    FeedbackEagerParams.FeedbackConfig.builder()
                        .type(FeedbackEagerParams.FeedbackConfig.Type.CONTINUOUS)
                        .categories(
                            listOf(
                                FeedbackEagerParams.FeedbackConfig.Category.builder()
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
                    FeedbackEagerParams.FeedbackSource.ofAppFeedbackSource(
                        FeedbackEagerParams.FeedbackSource.AppFeedbackSource.builder()
                            .metadata(JsonValue.from(mapOf<String, Any>()))
                            .type("string")
                            .build()
                    )
                )
                .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .score(FeedbackEagerParams.Score.ofDouble(42.23))
                .value(FeedbackEagerParams.Value.ofDouble(42.23))
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
                FeedbackEagerParams.FeedbackConfig.builder()
                    .type(FeedbackEagerParams.FeedbackConfig.Type.CONTINUOUS)
                    .categories(
                        listOf(
                            FeedbackEagerParams.FeedbackConfig.Category.builder()
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
                FeedbackEagerParams.FeedbackSource.ofAppFeedbackSource(
                    FeedbackEagerParams.FeedbackSource.AppFeedbackSource.builder()
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .type("string")
                        .build()
                )
            )
        assertThat(body.modifiedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.score()).isEqualTo(FeedbackEagerParams.Score.ofDouble(42.23))
        assertThat(body.value()).isEqualTo(FeedbackEagerParams.Value.ofDouble(42.23))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            FeedbackEagerParams.builder()
                .key("string")
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.key()).isEqualTo("string")
        assertThat(body.runId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}

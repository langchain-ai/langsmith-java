// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.feedback

import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.models.api.v1.feedbackconfigs.FeedbackConfig
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeedbackEagerParamsTest {

    @Test
    fun create() {
        FeedbackEagerParams.builder()
            .feedbackCreateSchema(
                FeedbackCreateSchema.builder()
                    .key("key")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .comment("comment")
                    .comparativeExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .correction(JsonValue.from(mapOf<String, Any>()))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .error(true)
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
                    .feedbackGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .feedbackSource(
                        AppFeedbackSource.builder()
                            .metadata(JsonValue.from(mapOf<String, Any>()))
                            .type("type")
                            .build()
                    )
                    .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .score(0.0)
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .traceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .value(0.0)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            FeedbackEagerParams.builder()
                .feedbackCreateSchema(
                    FeedbackCreateSchema.builder()
                        .key("key")
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .comment("comment")
                        .comparativeExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .correction(JsonValue.from(mapOf<String, Any>()))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .error(true)
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
                        .feedbackGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .feedbackSource(
                            AppFeedbackSource.builder()
                                .metadata(JsonValue.from(mapOf<String, Any>()))
                                .type("type")
                                .build()
                        )
                        .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .score(0.0)
                        .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .traceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .value(0.0)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                FeedbackCreateSchema.builder()
                    .key("key")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .comment("comment")
                    .comparativeExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .correction(JsonValue.from(mapOf<String, Any>()))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .error(true)
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
                    .feedbackGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .feedbackSource(
                        AppFeedbackSource.builder()
                            .metadata(JsonValue.from(mapOf<String, Any>()))
                            .type("type")
                            .build()
                    )
                    .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .score(0.0)
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .traceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .value(0.0)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FeedbackEagerParams.builder()
                .feedbackCreateSchema(FeedbackCreateSchema.builder().key("key").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(FeedbackCreateSchema.builder().key("key").build())
    }
}

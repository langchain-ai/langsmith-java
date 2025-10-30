// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.feedback

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import com.langsmith_api.api.models.api.v1.feedbackconfigs.FeedbackConfig
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeedbackCreateSchemaTest {

    @Test
    fun create() {
        val feedbackCreateSchema =
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

        assertThat(feedbackCreateSchema.key()).isEqualTo("key")
        assertThat(feedbackCreateSchema.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(feedbackCreateSchema.comment()).contains("comment")
        assertThat(feedbackCreateSchema.comparativeExperimentId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(feedbackCreateSchema.correction())
            .contains(
                FeedbackCreateSchema.Correction.ofJsonValue(JsonValue.from(mapOf<String, Any>()))
            )
        assertThat(feedbackCreateSchema.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(feedbackCreateSchema.error()).contains(true)
        assertThat(feedbackCreateSchema.feedbackConfig())
            .contains(
                FeedbackConfig.builder()
                    .type(FeedbackConfig.Type.CONTINUOUS)
                    .addCategory(FeedbackConfig.Category.builder().value(0.0).label("x").build())
                    .max(0.0)
                    .min(0.0)
                    .build()
            )
        assertThat(feedbackCreateSchema.feedbackGroupId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(feedbackCreateSchema.feedbackSource())
            .contains(
                FeedbackCreateSchema.FeedbackSource.ofApp(
                    AppFeedbackSource.builder()
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .type("type")
                        .build()
                )
            )
        assertThat(feedbackCreateSchema.modifiedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(feedbackCreateSchema.runId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(feedbackCreateSchema.score()).contains(FeedbackCreateSchema.Score.ofNumber(0.0))
        assertThat(feedbackCreateSchema.sessionId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(feedbackCreateSchema.traceId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(feedbackCreateSchema.value()).contains(FeedbackCreateSchema.Value.ofNumber(0.0))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val feedbackCreateSchema =
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

        val roundtrippedFeedbackCreateSchema =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(feedbackCreateSchema),
                jacksonTypeRef<FeedbackCreateSchema>(),
            )

        assertThat(roundtrippedFeedbackCreateSchema).isEqualTo(feedbackCreateSchema)
    }
}

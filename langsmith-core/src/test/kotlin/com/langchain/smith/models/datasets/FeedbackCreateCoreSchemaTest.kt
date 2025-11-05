// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import com.langchain.smith.models.feedback.AppFeedbackSource
import com.langchain.smith.models.feedbackconfigs.FeedbackConfig
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeedbackCreateCoreSchemaTest {

    @Test
    fun create() {
        val feedbackCreateCoreSchema =
            FeedbackCreateCoreSchema.builder()
                .key("key")
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .comment("comment")
                .comparativeExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .correction(JsonValue.from(mapOf<String, Any>()))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .extra(JsonValue.from(mapOf<String, Any>()))
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
                .score(0.0)
                .value(0.0)
                .build()

        assertThat(feedbackCreateCoreSchema.key()).isEqualTo("key")
        assertThat(feedbackCreateCoreSchema.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(feedbackCreateCoreSchema.comment()).contains("comment")
        assertThat(feedbackCreateCoreSchema.comparativeExperimentId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(feedbackCreateCoreSchema.correction())
            .contains(
                FeedbackCreateCoreSchema.Correction.ofJsonValue(
                    JsonValue.from(mapOf<String, Any>())
                )
            )
        assertThat(feedbackCreateCoreSchema.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(feedbackCreateCoreSchema._extra())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(feedbackCreateCoreSchema.feedbackConfig())
            .contains(
                FeedbackConfig.builder()
                    .type(FeedbackConfig.Type.CONTINUOUS)
                    .addCategory(FeedbackConfig.Category.builder().value(0.0).label("x").build())
                    .max(0.0)
                    .min(0.0)
                    .build()
            )
        assertThat(feedbackCreateCoreSchema.feedbackGroupId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(feedbackCreateCoreSchema.feedbackSource())
            .contains(
                FeedbackCreateCoreSchema.FeedbackSource.ofApp(
                    AppFeedbackSource.builder()
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .type("type")
                        .build()
                )
            )
        assertThat(feedbackCreateCoreSchema.modifiedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(feedbackCreateCoreSchema.score())
            .contains(FeedbackCreateCoreSchema.Score.ofNumber(0.0))
        assertThat(feedbackCreateCoreSchema.value())
            .contains(FeedbackCreateCoreSchema.Value.ofNumber(0.0))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val feedbackCreateCoreSchema =
            FeedbackCreateCoreSchema.builder()
                .key("key")
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .comment("comment")
                .comparativeExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .correction(JsonValue.from(mapOf<String, Any>()))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .extra(JsonValue.from(mapOf<String, Any>()))
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
                .score(0.0)
                .value(0.0)
                .build()

        val roundtrippedFeedbackCreateCoreSchema =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(feedbackCreateCoreSchema),
                jacksonTypeRef<FeedbackCreateCoreSchema>(),
            )

        assertThat(roundtrippedFeedbackCreateCoreSchema).isEqualTo(feedbackCreateCoreSchema)
    }
}

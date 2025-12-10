// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import com.langchain.smith.models.feedback.AppFeedbackSource
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
                .correction(
                    FeedbackCreateCoreSchema.Correction.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .extra(
                    FeedbackCreateCoreSchema.Extra.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .feedbackConfig(
                    FeedbackCreateCoreSchema.FeedbackConfig.builder()
                        .type(FeedbackCreateCoreSchema.FeedbackConfig.Type.CONTINUOUS)
                        .addCategory(
                            FeedbackCreateCoreSchema.FeedbackConfig.Category.builder()
                                .value(0.0)
                                .label("x")
                                .build()
                        )
                        .max(0.0)
                        .min(0.0)
                        .build()
                )
                .feedbackGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .feedbackSource(
                    AppFeedbackSource.builder()
                        .metadata(
                            AppFeedbackSource.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .type(AppFeedbackSource.Type.APP)
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
                FeedbackCreateCoreSchema.Correction.ofUnionMember0(
                    FeedbackCreateCoreSchema.Correction.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
            )
        assertThat(feedbackCreateCoreSchema.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(feedbackCreateCoreSchema.extra())
            .contains(
                FeedbackCreateCoreSchema.Extra.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(feedbackCreateCoreSchema.feedbackConfig())
            .contains(
                FeedbackCreateCoreSchema.FeedbackConfig.builder()
                    .type(FeedbackCreateCoreSchema.FeedbackConfig.Type.CONTINUOUS)
                    .addCategory(
                        FeedbackCreateCoreSchema.FeedbackConfig.Category.builder()
                            .value(0.0)
                            .label("x")
                            .build()
                    )
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
                        .metadata(
                            AppFeedbackSource.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .type(AppFeedbackSource.Type.APP)
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
                .correction(
                    FeedbackCreateCoreSchema.Correction.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .extra(
                    FeedbackCreateCoreSchema.Extra.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .feedbackConfig(
                    FeedbackCreateCoreSchema.FeedbackConfig.builder()
                        .type(FeedbackCreateCoreSchema.FeedbackConfig.Type.CONTINUOUS)
                        .addCategory(
                            FeedbackCreateCoreSchema.FeedbackConfig.Category.builder()
                                .value(0.0)
                                .label("x")
                                .build()
                        )
                        .max(0.0)
                        .min(0.0)
                        .build()
                )
                .feedbackGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .feedbackSource(
                    AppFeedbackSource.builder()
                        .metadata(
                            AppFeedbackSource.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .type(AppFeedbackSource.Type.APP)
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

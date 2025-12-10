// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.feedback

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeedbackSchemaTest {

    @Test
    fun create() {
        val feedbackSchema =
            FeedbackSchema.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .key("key")
                .comment("comment")
                .comparativeExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .correction(
                    FeedbackSchema.Correction.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .extra(
                    FeedbackSchema.Extra.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .feedbackGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .feedbackSource(
                    FeedbackSchema.FeedbackSource.builder()
                        .lsUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .metadata(
                            FeedbackSchema.FeedbackSource.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .type("type")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .userName("user_name")
                        .build()
                )
                .feedbackThreadId("feedback_thread_id")
                .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .score(0.0)
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .traceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .value(0.0)
                .build()

        assertThat(feedbackSchema.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(feedbackSchema.key()).isEqualTo("key")
        assertThat(feedbackSchema.comment()).contains("comment")
        assertThat(feedbackSchema.comparativeExperimentId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(feedbackSchema.correction())
            .contains(
                FeedbackSchema.Correction.ofUnionMember0(
                    FeedbackSchema.Correction.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
            )
        assertThat(feedbackSchema.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(feedbackSchema.extra())
            .contains(
                FeedbackSchema.Extra.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(feedbackSchema.feedbackGroupId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(feedbackSchema.feedbackSource())
            .contains(
                FeedbackSchema.FeedbackSource.builder()
                    .lsUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .metadata(
                        FeedbackSchema.FeedbackSource.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .type("type")
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .userName("user_name")
                    .build()
            )
        assertThat(feedbackSchema.feedbackThreadId()).contains("feedback_thread_id")
        assertThat(feedbackSchema.modifiedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(feedbackSchema.runId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(feedbackSchema.score()).contains(FeedbackSchema.Score.ofNumber(0.0))
        assertThat(feedbackSchema.sessionId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(feedbackSchema.startTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(feedbackSchema.traceId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(feedbackSchema.value()).contains(FeedbackSchema.Value.ofNumber(0.0))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val feedbackSchema =
            FeedbackSchema.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .key("key")
                .comment("comment")
                .comparativeExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .correction(
                    FeedbackSchema.Correction.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .extra(
                    FeedbackSchema.Extra.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .feedbackGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .feedbackSource(
                    FeedbackSchema.FeedbackSource.builder()
                        .lsUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .metadata(
                            FeedbackSchema.FeedbackSource.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .type("type")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .userName("user_name")
                        .build()
                )
                .feedbackThreadId("feedback_thread_id")
                .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .score(0.0)
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .traceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .value(0.0)
                .build()

        val roundtrippedFeedbackSchema =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(feedbackSchema),
                jacksonTypeRef<FeedbackSchema>(),
            )

        assertThat(roundtrippedFeedbackSchema).isEqualTo(feedbackSchema)
    }
}

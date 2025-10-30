// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.feedback.tokens

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import com.langsmith_api.api.models.api.v1.feedbackconfigs.FeedbackConfig
import com.langsmith_api.api.models.api.v1.sessions.TimedeltaInput
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeedbackIngestTokenCreateSchemaTest {

    @Test
    fun create() {
        val feedbackIngestTokenCreateSchema =
            FeedbackIngestTokenCreateSchema.builder()
                .feedbackKey("feedback_key")
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiresIn(TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build())
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
                .build()

        assertThat(feedbackIngestTokenCreateSchema.feedbackKey()).isEqualTo("feedback_key")
        assertThat(feedbackIngestTokenCreateSchema.runId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(feedbackIngestTokenCreateSchema.expiresAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(feedbackIngestTokenCreateSchema.expiresIn())
            .contains(TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build())
        assertThat(feedbackIngestTokenCreateSchema.feedbackConfig())
            .contains(
                FeedbackConfig.builder()
                    .type(FeedbackConfig.Type.CONTINUOUS)
                    .addCategory(FeedbackConfig.Category.builder().value(0.0).label("x").build())
                    .max(0.0)
                    .min(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val feedbackIngestTokenCreateSchema =
            FeedbackIngestTokenCreateSchema.builder()
                .feedbackKey("feedback_key")
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiresIn(TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build())
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
                .build()

        val roundtrippedFeedbackIngestTokenCreateSchema =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(feedbackIngestTokenCreateSchema),
                jacksonTypeRef<FeedbackIngestTokenCreateSchema>(),
            )

        assertThat(roundtrippedFeedbackIngestTokenCreateSchema)
            .isEqualTo(feedbackIngestTokenCreateSchema)
    }
}

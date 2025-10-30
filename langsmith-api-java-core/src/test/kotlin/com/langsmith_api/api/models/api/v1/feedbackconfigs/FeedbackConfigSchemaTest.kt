// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.feedbackconfigs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeedbackConfigSchemaTest {

    @Test
    fun create() {
        val feedbackConfigSchema =
            FeedbackConfigSchema.builder()
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
                .feedbackKey("feedback_key")
                .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .isLowerScoreBetter(true)
                .build()

        assertThat(feedbackConfigSchema.feedbackConfig())
            .isEqualTo(
                FeedbackConfig.builder()
                    .type(FeedbackConfig.Type.CONTINUOUS)
                    .addCategory(FeedbackConfig.Category.builder().value(0.0).label("x").build())
                    .max(0.0)
                    .min(0.0)
                    .build()
            )
        assertThat(feedbackConfigSchema.feedbackKey()).isEqualTo("feedback_key")
        assertThat(feedbackConfigSchema.modifiedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(feedbackConfigSchema.tenantId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(feedbackConfigSchema.isLowerScoreBetter()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val feedbackConfigSchema =
            FeedbackConfigSchema.builder()
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
                .feedbackKey("feedback_key")
                .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .isLowerScoreBetter(true)
                .build()

        val roundtrippedFeedbackConfigSchema =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(feedbackConfigSchema),
                jacksonTypeRef<FeedbackConfigSchema>(),
            )

        assertThat(roundtrippedFeedbackConfigSchema).isEqualTo(feedbackConfigSchema)
    }
}

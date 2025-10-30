// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.feedback.tokens

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeedbackIngestTokenSchemaTest {

    @Test
    fun create() {
        val feedbackIngestTokenSchema =
            FeedbackIngestTokenSchema.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .feedbackKey("feedback_key")
                .url("url")
                .build()

        assertThat(feedbackIngestTokenSchema.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(feedbackIngestTokenSchema.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(feedbackIngestTokenSchema.feedbackKey()).isEqualTo("feedback_key")
        assertThat(feedbackIngestTokenSchema.url()).isEqualTo("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val feedbackIngestTokenSchema =
            FeedbackIngestTokenSchema.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .feedbackKey("feedback_key")
                .url("url")
                .build()

        val roundtrippedFeedbackIngestTokenSchema =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(feedbackIngestTokenSchema),
                jacksonTypeRef<FeedbackIngestTokenSchema>(),
            )

        assertThat(roundtrippedFeedbackIngestTokenSchema).isEqualTo(feedbackIngestTokenSchema)
    }
}

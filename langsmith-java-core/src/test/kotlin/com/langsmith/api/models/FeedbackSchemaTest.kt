// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.langsmith.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FeedbackSchemaTest {

    @Test
    fun createFeedbackSchema() {
        val feedbackSchema =
            FeedbackSchema.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .key("string")
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .comment("string")
                .correction(JsonValue.from(mapOf<String, Any>()))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .feedbackSource(
                    FeedbackSchema.FeedbackSource.builder()
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .type("string")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .score(FeedbackSchema.Score.ofDouble(42.23))
                .value(FeedbackSchema.Value.ofDouble(42.23))
                .build()
        assertThat(feedbackSchema).isNotNull
        assertThat(feedbackSchema.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(feedbackSchema.key()).isEqualTo("string")
        assertThat(feedbackSchema.runId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(feedbackSchema.comment()).contains("string")
        assertThat(feedbackSchema._correction()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(feedbackSchema.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(feedbackSchema.feedbackSource())
            .contains(
                FeedbackSchema.FeedbackSource.builder()
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .type("string")
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(feedbackSchema.modifiedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(feedbackSchema.score()).contains(FeedbackSchema.Score.ofDouble(42.23))
        assertThat(feedbackSchema.value()).contains(FeedbackSchema.Value.ofDouble(42.23))
    }
}

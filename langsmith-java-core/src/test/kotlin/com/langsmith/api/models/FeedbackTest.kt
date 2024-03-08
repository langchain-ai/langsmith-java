// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

import com.langsmith.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FeedbackTest { // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/objects.ts:645:15
    fun createFeedback() { // templates/JavaSDK/entities/testing.ts:18:13
        val feedback =
            Feedback.builder() // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:656:16 //
                // templates/JavaSDK/entities/objects.ts:656:16
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .key("string")
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .comment("string")
                .correction(JsonValue.from(mapOf<String, Any>()))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .feedbackSource(
                    Feedback.FeedbackSource.builder()
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .type("string")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .score(Feedback.Score.ofDouble(42.23))
                .value(Feedback.Value.ofDouble(42.23))
                .build()
        assertThat(feedback).isNotNull
        assertThat(feedback.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(feedback.key()).isEqualTo("string")
        assertThat(feedback.runId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(feedback.comment()).contains("string")
        assertThat(feedback._correction()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(feedback.createdAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(feedback.feedbackSource())
            .contains(
                Feedback.FeedbackSource.builder() // templates/JavaSDK/entities/objects.ts:717:13
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .type("string")
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(feedback.modifiedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(feedback.score()).contains(Feedback.Score.ofDouble(42.23))
        assertThat(feedback.value()).contains(Feedback.Value.ofDouble(42.23))
    }
}

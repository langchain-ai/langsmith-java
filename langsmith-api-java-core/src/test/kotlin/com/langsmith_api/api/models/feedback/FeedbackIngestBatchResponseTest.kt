// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.feedback

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeedbackIngestBatchResponseTest {

    @Test
    fun create() {
        val feedbackIngestBatchResponse =
            FeedbackIngestBatchResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from(mapOf("message" to "message")))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val feedbackIngestBatchResponse =
            FeedbackIngestBatchResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from(mapOf("message" to "message")))
                .build()

        val roundtrippedFeedbackIngestBatchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(feedbackIngestBatchResponse),
                jacksonTypeRef<FeedbackIngestBatchResponse>(),
            )

        assertThat(roundtrippedFeedbackIngestBatchResponse).isEqualTo(feedbackIngestBatchResponse)
    }
}

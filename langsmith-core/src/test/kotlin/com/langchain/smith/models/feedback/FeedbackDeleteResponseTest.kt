// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.feedback

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeedbackDeleteResponseTest {

    @Test
    fun create() {
        val feedbackDeleteResponse = FeedbackDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val feedbackDeleteResponse = FeedbackDeleteResponse.builder().build()

        val roundtrippedFeedbackDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(feedbackDeleteResponse),
                jacksonTypeRef<FeedbackDeleteResponse>(),
            )

        assertThat(roundtrippedFeedbackDeleteResponse).isEqualTo(feedbackDeleteResponse)
    }
}

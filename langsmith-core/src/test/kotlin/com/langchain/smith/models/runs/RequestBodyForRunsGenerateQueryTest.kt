// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RequestBodyForRunsGenerateQueryTest {

    @Test
    fun create() {
        val requestBodyForRunsGenerateQuery =
            RequestBodyForRunsGenerateQuery.builder()
                .query("query")
                .addFeedbackKey(RequestBodyForRunsGenerateQuery.FeedbackKey.USER_SCORE)
                .build()

        assertThat(requestBodyForRunsGenerateQuery.query()).isEqualTo("query")
        assertThat(requestBodyForRunsGenerateQuery.feedbackKeys().getOrNull())
            .containsExactly(RequestBodyForRunsGenerateQuery.FeedbackKey.USER_SCORE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val requestBodyForRunsGenerateQuery =
            RequestBodyForRunsGenerateQuery.builder()
                .query("query")
                .addFeedbackKey(RequestBodyForRunsGenerateQuery.FeedbackKey.USER_SCORE)
                .build()

        val roundtrippedRequestBodyForRunsGenerateQuery =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(requestBodyForRunsGenerateQuery),
                jacksonTypeRef<RequestBodyForRunsGenerateQuery>(),
            )

        assertThat(roundtrippedRequestBodyForRunsGenerateQuery)
            .isEqualTo(requestBodyForRunsGenerateQuery)
    }
}

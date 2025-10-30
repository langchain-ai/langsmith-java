// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResponseBodyForRunsGenerateQueryTest {

    @Test
    fun create() {
        val responseBodyForRunsGenerateQuery =
            ResponseBodyForRunsGenerateQuery.builder()
                .feedbackUrls(
                    ResponseBodyForRunsGenerateQuery.FeedbackUrls.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .filter("filter")
                .build()

        assertThat(responseBodyForRunsGenerateQuery.feedbackUrls())
            .isEqualTo(
                ResponseBodyForRunsGenerateQuery.FeedbackUrls.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(responseBodyForRunsGenerateQuery.filter()).isEqualTo("filter")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val responseBodyForRunsGenerateQuery =
            ResponseBodyForRunsGenerateQuery.builder()
                .feedbackUrls(
                    ResponseBodyForRunsGenerateQuery.FeedbackUrls.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .filter("filter")
                .build()

        val roundtrippedResponseBodyForRunsGenerateQuery =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseBodyForRunsGenerateQuery),
                jacksonTypeRef<ResponseBodyForRunsGenerateQuery>(),
            )

        assertThat(roundtrippedResponseBodyForRunsGenerateQuery)
            .isEqualTo(responseBodyForRunsGenerateQuery)
    }
}

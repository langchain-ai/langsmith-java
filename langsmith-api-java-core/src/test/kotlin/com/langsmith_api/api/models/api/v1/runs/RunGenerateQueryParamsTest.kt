// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.runs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunGenerateQueryParamsTest {

    @Test
    fun create() {
        RunGenerateQueryParams.builder()
            .requestBodyForRunsGenerateQuery(
                RequestBodyForRunsGenerateQuery.builder()
                    .query("query")
                    .addFeedbackKey(RequestBodyForRunsGenerateQuery.FeedbackKey.USER_SCORE)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            RunGenerateQueryParams.builder()
                .requestBodyForRunsGenerateQuery(
                    RequestBodyForRunsGenerateQuery.builder()
                        .query("query")
                        .addFeedbackKey(RequestBodyForRunsGenerateQuery.FeedbackKey.USER_SCORE)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                RequestBodyForRunsGenerateQuery.builder()
                    .query("query")
                    .addFeedbackKey(RequestBodyForRunsGenerateQuery.FeedbackKey.USER_SCORE)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RunGenerateQueryParams.builder()
                .requestBodyForRunsGenerateQuery(
                    RequestBodyForRunsGenerateQuery.builder().query("query").build()
                )
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(RequestBodyForRunsGenerateQuery.builder().query("query").build())
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.public_.datasets.runs

import com.langchain.smith.models.runs.RequestBodyForRunsGenerateQuery
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunGenerateQueryParamsTest {

    @Test
    fun create() {
        RunGenerateQueryParams.builder()
            .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .requestBodyForRunsGenerateQuery(
                RequestBodyForRunsGenerateQuery.builder()
                    .query("query")
                    .addFeedbackKey(RequestBodyForRunsGenerateQuery.FeedbackKey.USER_SCORE)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RunGenerateQueryParams.builder()
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .requestBodyForRunsGenerateQuery(
                    RequestBodyForRunsGenerateQuery.builder().query("query").build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RunGenerateQueryParams.builder()
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .requestBodyForRunsGenerateQuery(
                    RequestBodyForRunsGenerateQuery.builder().query("query").build()
                )
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(RequestBodyForRunsGenerateQuery.builder().query("query").build())
    }
}

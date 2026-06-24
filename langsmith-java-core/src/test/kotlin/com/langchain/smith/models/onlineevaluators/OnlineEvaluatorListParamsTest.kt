// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnlineEvaluatorListParamsTest {

    @Test
    fun create() {
        OnlineEvaluatorListParams.builder()
            .feedbackKey("feedback_key")
            .limit(0L)
            .nameContains("name_contains")
            .offset(0L)
            .addResourceId("string")
            .sortBy("sort_by")
            .sortByDesc(true)
            .addTagValueId("string")
            .type("type")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            OnlineEvaluatorListParams.builder()
                .feedbackKey("feedback_key")
                .limit(0L)
                .nameContains("name_contains")
                .offset(0L)
                .addResourceId("string")
                .sortBy("sort_by")
                .sortByDesc(true)
                .addTagValueId("string")
                .type("type")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("feedback_key", "feedback_key")
                    .put("limit", "0")
                    .put("name_contains", "name_contains")
                    .put("offset", "0")
                    .put("resource_id", "string")
                    .put("sort_by", "sort_by")
                    .put("sort_by_desc", "true")
                    .put("tag_value_id", "string")
                    .put("type", "type")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = OnlineEvaluatorListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}

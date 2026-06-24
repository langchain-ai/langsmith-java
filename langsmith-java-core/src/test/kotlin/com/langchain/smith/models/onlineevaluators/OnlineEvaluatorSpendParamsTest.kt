// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnlineEvaluatorSpendParamsTest {

    @Test
    fun create() {
        OnlineEvaluatorSpendParams.builder()
            .periodStart("period_start")
            .datasetId("dataset_id")
            .evaluatorId("evaluator_id")
            .feedbackKey("feedback_key")
            .groupBy("group_by")
            .addResourceId("string")
            .sessionId("session_id")
            .type("type")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            OnlineEvaluatorSpendParams.builder()
                .periodStart("period_start")
                .datasetId("dataset_id")
                .evaluatorId("evaluator_id")
                .feedbackKey("feedback_key")
                .groupBy("group_by")
                .addResourceId("string")
                .sessionId("session_id")
                .type("type")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("period_start", "period_start")
                    .put("dataset_id", "dataset_id")
                    .put("evaluator_id", "evaluator_id")
                    .put("feedback_key", "feedback_key")
                    .put("group_by", "group_by")
                    .put("resource_id", "string")
                    .put("session_id", "session_id")
                    .put("type", "type")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = OnlineEvaluatorSpendParams.builder().periodStart("period_start").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("period_start", "period_start").build())
    }
}

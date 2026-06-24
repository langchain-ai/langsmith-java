// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnlineEvaluatorBulkDeleteParamsTest {

    @Test
    fun create() {
        OnlineEvaluatorBulkDeleteParams.builder()
            .addEvaluatorId("string")
            .deleteRunRules(true)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            OnlineEvaluatorBulkDeleteParams.builder()
                .addEvaluatorId("string")
                .deleteRunRules(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("evaluator_ids", "string")
                    .put("delete_run_rules", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = OnlineEvaluatorBulkDeleteParams.builder().addEvaluatorId("string").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("evaluator_ids", "string").build())
    }
}

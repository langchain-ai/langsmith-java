// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnlineEvaluatorDeleteParamsTest {

    @Test
    fun create() {
        OnlineEvaluatorDeleteParams.builder()
            .evaluatorId("evaluator_id")
            .deleteRunRules(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params = OnlineEvaluatorDeleteParams.builder().evaluatorId("evaluator_id").build()

        assertThat(params._pathParam(0)).isEqualTo("evaluator_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            OnlineEvaluatorDeleteParams.builder()
                .evaluatorId("evaluator_id")
                .deleteRunRules(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("delete_run_rules", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = OnlineEvaluatorDeleteParams.builder().evaluatorId("evaluator_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}

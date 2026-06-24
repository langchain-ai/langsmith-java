// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnlineEvaluatorRetrieveParamsTest {

    @Test
    fun create() {
        OnlineEvaluatorRetrieveParams.builder().evaluatorId("evaluator_id").build()
    }

    @Test
    fun pathParams() {
        val params = OnlineEvaluatorRetrieveParams.builder().evaluatorId("evaluator_id").build()

        assertThat(params._pathParam(0)).isEqualTo("evaluator_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}

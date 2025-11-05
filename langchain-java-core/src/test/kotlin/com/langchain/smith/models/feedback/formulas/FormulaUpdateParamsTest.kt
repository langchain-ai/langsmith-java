// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.feedback.formulas

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FormulaUpdateParamsTest {

    @Test
    fun create() {
        FormulaUpdateParams.builder()
            .feedbackFormulaId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .aggregationType(FormulaUpdateParams.AggregationType.SUM)
            .feedbackKey("feedback_key")
            .addFormulaPart(FeedbackFormulaWeightedVariable.builder().key("x").weight(0.0).build())
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FormulaUpdateParams.builder()
                .feedbackFormulaId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .aggregationType(FormulaUpdateParams.AggregationType.SUM)
                .feedbackKey("feedback_key")
                .addFormulaPart(
                    FeedbackFormulaWeightedVariable.builder().key("x").weight(0.0).build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            FormulaUpdateParams.builder()
                .feedbackFormulaId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .aggregationType(FormulaUpdateParams.AggregationType.SUM)
                .feedbackKey("feedback_key")
                .addFormulaPart(
                    FeedbackFormulaWeightedVariable.builder().key("x").weight(0.0).build()
                )
                .build()

        val body = params._body()

        assertThat(body.aggregationType()).isEqualTo(FormulaUpdateParams.AggregationType.SUM)
        assertThat(body.feedbackKey()).isEqualTo("feedback_key")
        assertThat(body.formulaParts())
            .containsExactly(FeedbackFormulaWeightedVariable.builder().key("x").weight(0.0).build())
    }
}

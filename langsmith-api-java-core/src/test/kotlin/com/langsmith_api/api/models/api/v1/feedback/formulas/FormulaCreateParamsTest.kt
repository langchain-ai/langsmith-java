// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.feedback.formulas

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FormulaCreateParamsTest {

    @Test
    fun create() {
        FormulaCreateParams.builder()
            .aggregationType(FormulaCreateParams.AggregationType.SUM)
            .feedbackKey("feedback_key")
            .addFormulaPart(FeedbackFormulaWeightedVariable.builder().key("x").weight(0.0).build())
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun body() {
        val params =
            FormulaCreateParams.builder()
                .aggregationType(FormulaCreateParams.AggregationType.SUM)
                .feedbackKey("feedback_key")
                .addFormulaPart(
                    FeedbackFormulaWeightedVariable.builder().key("x").weight(0.0).build()
                )
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.aggregationType()).isEqualTo(FormulaCreateParams.AggregationType.SUM)
        assertThat(body.feedbackKey()).isEqualTo("feedback_key")
        assertThat(body.formulaParts())
            .containsExactly(FeedbackFormulaWeightedVariable.builder().key("x").weight(0.0).build())
        assertThat(body.datasetId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.sessionId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FormulaCreateParams.builder()
                .aggregationType(FormulaCreateParams.AggregationType.SUM)
                .feedbackKey("feedback_key")
                .addFormulaPart(
                    FeedbackFormulaWeightedVariable.builder().key("x").weight(0.0).build()
                )
                .build()

        val body = params._body()

        assertThat(body.aggregationType()).isEqualTo(FormulaCreateParams.AggregationType.SUM)
        assertThat(body.feedbackKey()).isEqualTo("feedback_key")
        assertThat(body.formulaParts())
            .containsExactly(FeedbackFormulaWeightedVariable.builder().key("x").weight(0.0).build())
    }
}

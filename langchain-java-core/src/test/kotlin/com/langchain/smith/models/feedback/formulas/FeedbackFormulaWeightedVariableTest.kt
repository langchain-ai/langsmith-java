// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.feedback.formulas

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeedbackFormulaWeightedVariableTest {

    @Test
    fun create() {
        val feedbackFormulaWeightedVariable =
            FeedbackFormulaWeightedVariable.builder().key("x").weight(0.0).build()

        assertThat(feedbackFormulaWeightedVariable.key()).isEqualTo("x")
        assertThat(feedbackFormulaWeightedVariable.weight()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val feedbackFormulaWeightedVariable =
            FeedbackFormulaWeightedVariable.builder().key("x").weight(0.0).build()

        val roundtrippedFeedbackFormulaWeightedVariable =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(feedbackFormulaWeightedVariable),
                jacksonTypeRef<FeedbackFormulaWeightedVariable>(),
            )

        assertThat(roundtrippedFeedbackFormulaWeightedVariable)
            .isEqualTo(feedbackFormulaWeightedVariable)
    }
}

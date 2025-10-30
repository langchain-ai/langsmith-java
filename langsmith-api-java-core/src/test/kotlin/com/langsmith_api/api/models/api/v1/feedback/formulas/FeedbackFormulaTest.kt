// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.feedback.formulas

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeedbackFormulaTest {

    @Test
    fun create() {
        val feedbackFormula =
            FeedbackFormula.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .aggregationType(FeedbackFormula.AggregationType.SUM)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .feedbackKey("feedback_key")
                .addFormulaPart(
                    FeedbackFormulaWeightedVariable.builder().key("x").weight(0.0).build()
                )
                .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(feedbackFormula.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(feedbackFormula.aggregationType()).isEqualTo(FeedbackFormula.AggregationType.SUM)
        assertThat(feedbackFormula.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(feedbackFormula.feedbackKey()).isEqualTo("feedback_key")
        assertThat(feedbackFormula.formulaParts())
            .containsExactly(FeedbackFormulaWeightedVariable.builder().key("x").weight(0.0).build())
        assertThat(feedbackFormula.modifiedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(feedbackFormula.datasetId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(feedbackFormula.sessionId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val feedbackFormula =
            FeedbackFormula.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .aggregationType(FeedbackFormula.AggregationType.SUM)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .feedbackKey("feedback_key")
                .addFormulaPart(
                    FeedbackFormulaWeightedVariable.builder().key("x").weight(0.0).build()
                )
                .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedFeedbackFormula =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(feedbackFormula),
                jacksonTypeRef<FeedbackFormula>(),
            )

        assertThat(roundtrippedFeedbackFormula).isEqualTo(feedbackFormula)
    }
}

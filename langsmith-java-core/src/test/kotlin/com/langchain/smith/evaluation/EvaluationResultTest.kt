package com.langchain.smith.evaluation

import com.langchain.smith.models.feedback.FeedbackCreateSchema
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EvaluationResultTest {

    @Test
    fun evaluationResult_storesMetricFields() {
        val result =
            EvaluationResult(
                key = "accuracy",
                score = 1,
                value = "yes",
                comment = "exact match",
                metadata = mapOf("model" to "gpt-4"),
            )

        assertThat(result.key).isEqualTo("accuracy")
        assertThat(result.score).isEqualTo(1)
        assertThat(result.value).isEqualTo("yes")
        assertThat(result.comment).isEqualTo("exact match")
        assertThat(result.metadata).containsEntry("model", "gpt-4")
    }

    @Test
    fun evaluationResult_storesGeneratedFeedbackConfig() {
        val continuous =
            FeedbackCreateSchema.FeedbackConfig.builder()
                .type(FeedbackCreateSchema.FeedbackConfig.Type.CONTINUOUS)
                .min(0.0)
                .max(1.0)
                .build()
        val categorical =
            FeedbackCreateSchema.FeedbackConfig.builder()
                .type(FeedbackCreateSchema.FeedbackConfig.Type.CATEGORICAL)
                .addCategory(
                    FeedbackCreateSchema.FeedbackConfig.Category.builder()
                        .value(1.0)
                        .label("good")
                        .build()
                )
                .build()

        assertThat(continuous.type()).isEqualTo(FeedbackCreateSchema.FeedbackConfig.Type.CONTINUOUS)
        assertThat(categorical.categories()).isPresent
        assertThat(categorical.categories().get())
            .containsExactly(
                FeedbackCreateSchema.FeedbackConfig.Category.builder()
                    .value(1.0)
                    .label("good")
                    .build()
            )

        val result = EvaluationResult(key = "accuracy", score = 1, feedbackConfig = continuous)
        assertThat(result.feedbackConfig).isEqualTo(continuous)
    }
}

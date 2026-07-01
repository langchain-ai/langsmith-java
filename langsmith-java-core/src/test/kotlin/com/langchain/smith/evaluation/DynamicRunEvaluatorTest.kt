package com.langchain.smith.evaluation

import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.examples.Example
import com.langchain.smith.models.feedback.FeedbackCreateSchema
import com.langchain.smith.models.runs.RunIngest
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

internal class DynamicRunEvaluatorTest {

    private val exampleId = "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"
    private val runId = "98765432-1234-1234-1234-987654321098"

    @Test
    fun evaluateRun_withRunAndExample_returnsEvaluationResult() {
        val evaluator = runEvaluator { run: RunIngest, example: Example? ->
            EvaluationResult(
                key = "accuracy",
                score = if (run.outputs().isPresent) 1 else 0,
                comment = example?.id(),
            )
        }

        val result = singleResult(evaluator.evaluateRun(sampleRun(), sampleExample()))

        assertThat(result.key).isEqualTo("accuracy")
        assertThat(result.score).isEqualTo(1)
        assertThat(result.comment).isEqualTo(exampleId)
        assertThat(result.sourceRunId).isNotNull()
    }

    @Test
    fun evaluateRun_withOutputsAndReferenceOutputs_normalizesArguments() {
        val evaluator =
            runEvaluator { outputs: Map<String, Any?>, referenceOutputs: Map<String, Any?> ->
                mapOf(
                    "key" to "match",
                    "score" to if (outputs["answer"] == referenceOutputs["answer"]) 1 else 0,
                )
            }

        val result =
            singleResult(
                evaluator.evaluateRun(sampleRun(answer = "Paris"), sampleExample(answer = "Paris"))
            )

        assertThat(result.key).isEqualTo("match")
        assertThat(result.score).isEqualTo(1)
    }

    @Test
    fun evaluateRun_withMapResult_coercesToEvaluationResult() {
        val evaluator = runEvaluator { _: RunIngest, _: Example? ->
            mapOf("key" to "helpful", "score" to 0.5)
        }

        val result = singleResult(evaluator.evaluateRun(sampleRun(), sampleExample()))

        assertThat(result.key).isEqualTo("helpful")
        assertThat(result.score).isEqualTo(0.5)
    }

    @Test
    fun evaluateRun_withNumericResult_coercesToScore() {
        val evaluator = runEvaluator { _: RunIngest, _: Example? -> 1 }

        val result = singleResult(evaluator.evaluateRun(sampleRun(), sampleExample()))

        assertThat(result.key).isEqualTo("evaluator")
        assertThat(result.score).isEqualTo(1)
    }

    @Test
    fun evaluateRun_withBooleanResult_coercesToNumericScore() {
        val evaluator = runEvaluator { _: RunIngest, _: Example? -> true }

        val result = singleResult(evaluator.evaluateRun(sampleRun(), sampleExample()))

        assertThat(result.key).isEqualTo("evaluator")
        assertThat(result.score).isEqualTo(1)
    }

    @Test
    fun evaluateRun_withFalseBooleanResult_coercesToZeroScore() {
        val evaluator = runEvaluator { _: RunIngest, _: Example? -> false }

        val result = singleResult(evaluator.evaluateRun(sampleRun(), sampleExample()))

        assertThat(result.key).isEqualTo("evaluator")
        assertThat(result.score).isEqualTo(0)
    }

    @Test
    fun evaluateRun_withMultipleResults_returnsEvaluationResults() {
        val evaluator = runEvaluator { _: RunIngest, _: Example? ->
            listOf(mapOf("key" to "a", "score" to 1), mapOf("key" to "b", "score" to 0))
        }

        when (val output = evaluator.evaluateRun(sampleRun(), sampleExample())) {
            is EvaluationResults -> {
                assertThat(output.results).hasSize(2)
                assertThat(output.results.map { it.key }).containsExactly("a", "b")
            }
            is EvaluationResult -> throw AssertionError("expected EvaluationResults")
        }
    }

    @Test
    fun evaluateRun_withMapResultMissingKey_usesDefaultKey() {
        val evaluator = runEvaluator { _: RunIngest, _: Example? -> mapOf("score" to 1) }

        val result = singleResult(evaluator.evaluateRun(sampleRun(), sampleExample()))

        assertThat(result.key).isEqualTo("evaluator")
        assertThat(result.score).isEqualTo(1)
    }

    @Test
    fun evaluateRun_withMapResultIncludingFeedbackConfig_coercesFeedbackConfig() {
        val evaluator = runEvaluator { _: RunIngest, _: Example? ->
            mapOf(
                "key" to "accuracy",
                "score" to 0.8,
                "feedbackConfig" to mapOf("type" to "continuous", "min" to 0.0, "max" to 1.0),
            )
        }

        val result = singleResult(evaluator.evaluateRun(sampleRun(), sampleExample()))

        assertThat(result.feedbackConfig?.type())
            .isEqualTo(FeedbackCreateSchema.FeedbackConfig.Type.CONTINUOUS)
        assertThat(result.feedbackConfig?.min()).contains(0.0)
        assertThat(result.feedbackConfig?.max()).contains(1.0)
    }

    @Test
    fun evaluateRun_withSnakeCaseFeedbackConfig_coercesFeedbackConfig() {
        val evaluator = runEvaluator { _: RunIngest, _: Example? ->
            mapOf(
                "key" to "sentiment",
                "score" to 1,
                "feedback_config" to
                    mapOf(
                        "type" to "categorical",
                        "categories" to listOf(mapOf("value" to 1.0, "label" to "good")),
                    ),
            )
        }

        val result = singleResult(evaluator.evaluateRun(sampleRun(), sampleExample()))

        assertThat(result.feedbackConfig?.type())
            .isEqualTo(FeedbackCreateSchema.FeedbackConfig.Type.CATEGORICAL)
    }

    @Test
    fun evaluateRun_withInvalidMap_throws() {
        val evaluator = runEvaluator { _: RunIngest, _: Example? ->
            mapOf("key" to "missing_metric")
        }

        assertThatThrownBy { evaluator.evaluateRun(sampleRun(), sampleExample()) }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("score")
    }

    private fun singleResult(output: EvaluationOutput): EvaluationResult =
        when (output) {
            is EvaluationResult -> output
            is EvaluationResults -> throw AssertionError("expected EvaluationResult, got $output")
        }

    private fun sampleExample(answer: String = "Paris"): Example =
        Example.builder()
            .id(exampleId)
            .datasetId(exampleId)
            .name("test-example")
            .inputs(
                Example.Inputs.builder()
                    .putAdditionalProperty("question", JsonValue.from("capital?"))
                    .build()
            )
            .outputs(
                Example.Outputs.builder()
                    .putAdditionalProperty("answer", JsonValue.from(answer))
                    .build()
            )
            .build()

    private fun sampleRun(answer: String = "Paris"): RunIngest =
        RunIngest.builder()
            .id(runId)
            .traceId(runId)
            .dottedOrder("2024.01.01T00:00:00.000000Z$runId")
            .name("target")
            .outputs(
                RunIngest.Outputs.builder()
                    .putAdditionalProperty("answer", JsonValue.from(answer))
                    .build()
            )
            .build()
}

package com.langchain.smith.evaluation

import com.langchain.smith.models.examples.Example
import com.langchain.smith.models.runs.Run

/**
 * Wraps a function as a [RunEvaluator], normalizing common evaluator signatures to `(Run,
 * Example?)`.
 */
class DynamicRunEvaluator
private constructor(private val evaluator: (Run, Example?) -> EvaluatorOutput) : RunEvaluator {

    override val feedbackKeys: List<String> = emptyList()

    override fun evaluateRun(
        run: Run,
        example: Example?,
        evaluatorRunId: String?,
    ): EvaluationOutput {
        val sourceRunId = evaluatorRunId ?: newEvaluatorRunId()
        val raw = evaluator(run, example)
        return coerceEvaluatorOutput(raw, sourceRunId, defaultKey = "evaluator")
    }

    override fun toString(): String = "DynamicRunEvaluator{feedbackKeys=$feedbackKeys}"

    companion object {
        internal fun fromRunExample(func: (Run, Example?) -> EvaluatorOutput): DynamicRunEvaluator =
            DynamicRunEvaluator(func)

        internal fun fromOutputsReference(
            func:
                (outputs: Map<String, Any?>, referenceOutputs: Map<String, Any?>) -> EvaluatorOutput
        ): DynamicRunEvaluator = DynamicRunEvaluator { run, example ->
            func(runOutputsMap(run), exampleOutputs(example))
        }

        internal fun fromInputsOutputsReference(
            func:
                (
                    inputs: Map<String, Any?>,
                    outputs: Map<String, Any?>,
                    referenceOutputs: Map<String, Any?>,
                ) -> EvaluatorOutput
        ): DynamicRunEvaluator = DynamicRunEvaluator { run, example ->
            func(exampleInputs(example), runOutputsMap(run), exampleOutputs(example))
        }
    }
}

/** Creates a [RunEvaluator] from a function that receives the full [Run] and [Example]. */
fun runEvaluator(func: (Run, Example?) -> EvaluatorOutput): RunEvaluator =
    DynamicRunEvaluator.fromRunExample(func)

/** Creates a [RunEvaluator] from a function that receives model outputs and reference outputs. */
@JvmName("runEvaluatorFromOutputsReference")
fun runEvaluator(
    func: (outputs: Map<String, Any?>, referenceOutputs: Map<String, Any?>) -> EvaluatorOutput
): RunEvaluator = DynamicRunEvaluator.fromOutputsReference(func)

/**
 * Creates a [RunEvaluator] from a function that receives inputs, outputs, and reference outputs.
 */
@JvmName("runEvaluatorFromInputsOutputsReference")
fun runEvaluator(
    func:
        (
            inputs: Map<String, Any?>,
            outputs: Map<String, Any?>,
            referenceOutputs: Map<String, Any?>,
        ) -> EvaluatorOutput
): RunEvaluator = DynamicRunEvaluator.fromInputsOutputsReference(func)

/** We pass the full run and dataset row for evaluators that need trace-level details. */
fun interface RunExampleEvaluator {
    fun evaluate(run: Run, example: Example?): EvaluatorOutput
}

/**
 * Wraps a [RunExampleEvaluator] so the evaluate runner can call it like any other [RunEvaluator].
 */
fun runEvaluator(func: RunExampleEvaluator): RunEvaluator =
    DynamicRunEvaluator.fromRunExample(func::evaluate)

/** We pass the app's answer and expected answer for simple match-style evaluators. */
fun interface OutputReferenceEvaluator {
    fun evaluate(outputs: Map<String, Any?>, referenceOutputs: Map<String, Any?>): EvaluatorOutput
}

/**
 * Wraps an [OutputReferenceEvaluator] so the evaluate runner can call it like any other
 * [RunEvaluator].
 */
@JvmName("runEvaluatorFromOutputReferenceEvaluator")
fun runEvaluator(func: OutputReferenceEvaluator): RunEvaluator =
    DynamicRunEvaluator.fromOutputsReference(func::evaluate)

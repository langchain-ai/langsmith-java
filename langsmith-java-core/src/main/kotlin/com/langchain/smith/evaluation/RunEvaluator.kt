package com.langchain.smith.evaluation

import com.langchain.smith.models.examples.Example
import com.langchain.smith.models.runs.RunIngest

/** Evaluates a single prediction [run] against an optional dataset [example]. */
interface RunEvaluator {
    fun evaluateRun(run: RunIngest, example: Example?, evaluatorRunId: String?): EvaluationOutput

    fun evaluateRun(run: RunIngest, example: Example?): EvaluationOutput =
        evaluateRun(run, example, null)

    fun evaluateRun(run: RunIngest): EvaluationOutput = evaluateRun(run, null, null)

    /** Feedback keys this evaluator emits, when statically known. */
    val feedbackKeys: List<String>
        get() = emptyList()
}

/** Raw return values accepted from custom evaluator lambdas before normalization. */
typealias EvaluatorOutput = Any

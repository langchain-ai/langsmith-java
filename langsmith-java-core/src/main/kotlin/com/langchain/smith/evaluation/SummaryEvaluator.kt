package com.langchain.smith.evaluation

import com.langchain.smith.models.examples.Example
import com.langchain.smith.models.runs.RunIngest

/** Evaluates aggregate metrics across all runs in an experiment. */
fun interface SummaryEvaluator {
    fun evaluate(runs: List<RunIngest>, examples: List<Example>): EvaluationOutput
}

/** Creates a [SummaryEvaluator] from a function over all runs and examples. */
fun summaryEvaluator(func: (List<RunIngest>, List<Example>) -> EvaluatorOutput): SummaryEvaluator =
    SummaryEvaluator { runs, examples ->
        coerceSummaryOutput(func(runs, examples), newEvaluatorRunId())
    }

internal fun coerceSummaryOutput(output: EvaluatorOutput, sourceRunId: String): EvaluationOutput =
    coerceEvaluatorOutput(output, sourceRunId, defaultKey = "summary")

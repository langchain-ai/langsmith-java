package com.langchain.smith.evaluation

import com.langchain.smith.models.examples.Example
import com.langchain.smith.models.runs.RunIngest

/** Pairwise score emitted by a [ComparativeEvaluator] for one or more runs. */
data class ComparisonEvaluationResult(
    val key: String,
    val scores: Map<String, Number>,
    val comment: String? = null,
    val sourceRunId: String? = null,
)

/** Compares runs from two or more experiments on the same dataset example. */
fun interface ComparativeEvaluator {
    fun compareRuns(runs: List<RunIngest>, example: Example): ComparisonEvaluationResult
}

/** Creates a [ComparativeEvaluator] from a comparison function. */
fun comparativeEvaluator(
    func: (List<RunIngest>, Example) -> ComparisonEvaluationResult
): ComparativeEvaluator = ComparativeEvaluator { runs, example -> func(runs, example) }

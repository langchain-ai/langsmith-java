package com.langchain.smith.evaluation

import com.langchain.smith.models.datasets.comparative.ComparativeCreateResponse
import com.langchain.smith.models.examples.Example
import com.langchain.smith.models.runs.RunIngest

/** One row from a comparative evaluation for a shared dataset example. */
data class ComparativeResultRow(
    val example: Example,
    val runs: List<RunIngest>,
    val evaluationResults: Map<String, ComparisonEvaluationResult>,
)

/** Results returned by [evaluateComparative]. */
class ComparativeExperimentResults
internal constructor(
    val rows: List<ComparativeResultRow>,
    val comparativeExperiment: ComparativeCreateResponse?,
    val url: String?,
) {
    override fun toString(): String = "ComparativeExperimentResults{rows=${rows.size}, url=$url}"
}

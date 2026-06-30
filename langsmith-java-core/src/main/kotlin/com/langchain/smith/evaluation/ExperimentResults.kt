package com.langchain.smith.evaluation

import com.langchain.smith.models.examples.Example
import com.langchain.smith.models.runs.RunIngest

/** One dataset row evaluated in an experiment. */
data class ExperimentResultRow(
    val run: RunIngest,
    val example: Example,
    val evaluationResults: EvaluationResults,
) {
    override fun toString(): String =
        "ExperimentResultRow{exampleId=${example.id()}, runId=${run.id().orElse(null)}, " +
            "results=${evaluationResults.results.size}}"
}

/** Results returned by [evaluate]. */
class ExperimentResults
internal constructor(
    val experimentName: String,
    /** LangSmith experiment session id. */
    val experimentId: String?,
    val datasetId: String,
    val rows: List<ExperimentResultRow>,
    val summaryResults: EvaluationResults = EvaluationResults(emptyList()),
    val url: String? = null,
) {
    override fun toString(): String =
        "ExperimentResults{experimentName=$experimentName, experimentId=$experimentId, " +
            "datasetId=$datasetId, rows=${rows.size}, summaryResults=${summaryResults.results.size}}"
}

package com.langchain.smith.evaluation

import com.langchain.smith.client.LangsmithClient
import com.langchain.smith.models.examples.Example
import com.langchain.smith.models.runs.RunIngest
import java.util.concurrent.Callable
import java.util.concurrent.Executors
import java.util.logging.Level
import java.util.logging.Logger
import kotlin.jvm.optionals.getOrNull

/** Scores existing experiment runs without re-running the target. */
internal class EvaluateExistingRunner(
    private val client: LangsmithClient,
    private val experimentId: String,
    private val params: EvaluateExistingParams,
) {
    private val logger = Logger.getLogger(EvaluateExistingRunner::class.java.name)

    fun run(): ExperimentResults {
        require(params.maxConcurrency >= 0) { "maxConcurrency must be >= 0 (0 = sequential)" }

        val session = loadExperiment(client, experimentId)
        val experimentName = session.name().orElse(experimentId)
        val datasetId =
            session.referenceDatasetId().orElseThrow {
                IllegalStateException("Experiment $experimentId has no reference dataset")
            }

        val runs = loadRunsForExperiment(client, experimentId, params.loadNested)
        require(runs.isNotEmpty()) { "No runs found for experiment $experimentId" }

        val exampleIds = runs.mapNotNull { run -> run.referenceExampleId().getOrNull() }.distinct()
        val examplesById =
            loadExamplesByIds(client, datasetId, exampleIds, experimentDatasetVersion(session))

        val rows = scoreRuns(runs, examplesById)
        val summaryResults = applySummaryEvaluators(rows, experimentId)
        val url = buildExperimentUrl(session, datasetId)

        return ExperimentResults(
            experimentName = experimentName,
            experimentId = experimentId,
            datasetId = datasetId,
            rows = rows,
            summaryResults = summaryResults,
            url = url,
        )
    }

    private fun scoreRuns(
        runs: List<RunIngest>,
        examplesById: Map<String, Example>,
    ): List<ExperimentResultRow> {
        if (params.maxConcurrency == 0 || runs.size <= 1) {
            return runs.mapNotNull { run -> scoreRun(run, examplesById) }
        }

        val poolSize = minOf(params.maxConcurrency, runs.size)
        val executor = Executors.newFixedThreadPool(poolSize)
        return try {
            runs
                .map { run -> executor.submit(Callable { scoreRun(run, examplesById) }) }
                .mapNotNull { it.get() }
        } finally {
            executor.shutdown()
        }
    }

    private fun scoreRun(run: RunIngest, examplesById: Map<String, Example>): ExperimentResultRow? {
        val exampleId = run.referenceExampleId().getOrNull() ?: return null
        val example = examplesById[exampleId] ?: return null

        val evaluationResults =
            params.evaluators.flatMap { evaluator -> runEvaluator(evaluator, run, example) }

        return ExperimentResultRow(
            run = run,
            example = example,
            evaluationResults = EvaluationResults(evaluationResults),
        )
    }

    private fun runEvaluator(
        evaluator: RunEvaluator,
        run: RunIngest,
        example: Example,
    ): List<EvaluationResult> {
        val evaluatorRunId = newEvaluatorRunId()
        return try {
            val response = evaluator.evaluateRun(run, example, evaluatorRunId)
            logEvaluationFeedback(client, response, run)
            selectEvaluationResults(response)
        } catch (e: Exception) {
            logger.log(Level.SEVERE, "Error running evaluator $evaluator on run ${run.id()}", e)
            val keys = evaluator.feedbackKeys
            if (keys.isEmpty()) {
                throw e
            }
            val errorResponse =
                EvaluationResults(
                    keys.map { key ->
                        EvaluationResult(
                            key = key,
                            sourceRunId = evaluatorRunId,
                            comment = e.toString(),
                            extra = mapOf("error" to true),
                        )
                    }
                )
            logEvaluationFeedback(client, errorResponse, run)
            errorResponse.results
        }
    }

    private fun applySummaryEvaluators(
        rows: List<ExperimentResultRow>,
        sessionId: String,
    ): EvaluationResults {
        if (params.summaryEvaluators.isEmpty()) {
            return EvaluationResults(emptyList())
        }

        val runs = rows.map { it.run }
        val examples = rows.map { it.example }
        val aggregateResults = mutableListOf<EvaluationResult>()

        for (evaluator in params.summaryEvaluators) {
            try {
                val response = evaluator.evaluate(runs, examples)
                aggregateResults.addAll(selectEvaluationResults(response))
                logSummaryEvaluationFeedback(client, response, sessionId)
            } catch (e: Exception) {
                logger.log(Level.SEVERE, "Error running summary evaluator $evaluator", e)
            }
        }

        return EvaluationResults(aggregateResults)
    }
}

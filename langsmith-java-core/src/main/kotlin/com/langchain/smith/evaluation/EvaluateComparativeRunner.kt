package com.langchain.smith.evaluation

import com.langchain.smith.client.LangsmithClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.datasets.comparative.ComparativeCreateParams
import com.langchain.smith.models.examples.Example
import com.langchain.smith.models.runs.RunIngest
import com.langchain.smith.models.sessions.TracerSession
import java.util.UUID
import java.util.concurrent.Callable
import java.util.concurrent.Executors
import java.util.logging.Level
import java.util.logging.Logger
import kotlin.jvm.optionals.getOrNull

/** Runs pairwise evaluators over two existing experiments. */
internal class EvaluateComparativeRunner(
    private val client: LangsmithClient,
    private val experimentIds: Pair<String, String>,
    private val params: EvaluateComparativeParams,
) {
    private val logger = Logger.getLogger(EvaluateComparativeRunner::class.java.name)

    fun run(): ComparativeExperimentResults {
        require(params.maxConcurrency >= 0) { "maxConcurrency must be >= 0" }

        val projects =
            listOf(
                loadExperiment(client, experimentIds.first),
                loadExperiment(client, experimentIds.second),
            )

        val datasetIds =
            projects.map { project ->
                project.referenceDatasetId().orElseThrow {
                    IllegalStateException("Experiment ${project.id()} has no reference dataset")
                }
            }
        require(datasetIds.distinct().size == 1) {
            "All experiments must have the same reference dataset"
        }
        val datasetId = datasetIds.first()

        val experimentName = resolveComparativeName(projects)
        val comparativeExperimentId = UUID.randomUUID().toString()
        val comparativeExperiment =
            client
                .datasets()
                .comparative()
                .create(
                    ComparativeCreateParams.builder()
                        .id(comparativeExperimentId)
                        .name(experimentName)
                        .description(params.description)
                        .experimentIds(projects.map { it.id() })
                        .referenceDatasetId(datasetId)
                        .apply {
                            if (params.metadata.isNotEmpty()) {
                                val extraBuilder = ComparativeCreateParams.Extra.builder()
                                params.metadata.forEach { (key, value) ->
                                    extraBuilder.putAdditionalProperty(key, JsonValue.from(value))
                                }
                                extra(extraBuilder.build())
                            }
                        }
                        .build()
                )

        val runsByExperiment =
            projects.map { project ->
                loadRunsForExperiment(client, project.id(), params.loadNested)
            }

        val exampleIntersection =
            runsByExperiment
                .map { runs ->
                    runs.mapNotNull { run -> run.referenceExampleId().getOrNull() }.toSet()
                }
                .reduce { acc, ids -> acc.intersect(ids) }

        val examplesById =
            loadExamplesByIds(
                client,
                datasetId,
                exampleIntersection.toList(),
                experimentDatasetVersion(projects.first()),
            )

        val runsByExample = linkedMapOf<String, MutableList<RunIngest>>()
        runsByExperiment.forEach { runs ->
            runs.forEach { run ->
                val exampleId = run.referenceExampleId().getOrNull() ?: return@forEach
                if (exampleId !in exampleIntersection) {
                    return@forEach
                }
                runsByExample.getOrPut(exampleId) { mutableListOf() }.add(run)
            }
        }

        val rows = compareExamples(runsByExample, examplesById, comparativeExperiment.id())
        val url = buildComparativeUrl(projects, comparativeExperiment.id(), datasetId)

        return ComparativeExperimentResults(
            rows = rows,
            comparativeExperiment = comparativeExperiment,
            url = url,
        )
    }

    private fun resolveComparativeName(projects: List<TracerSession>): String {
        params.experimentPrefix?.let { prefix ->
            return "$prefix-${UUID.randomUUID().toString().take(8)}"
        }
        val names = projects.mapNotNull { it.name().orElse(null) }
        return if (names.size == projects.size) {
            names.joinToString(" vs. ") + "-" + UUID.randomUUID().toString().take(4)
        } else {
            "comparative-${UUID.randomUUID().toString().take(8)}"
        }
    }

    private fun compareExamples(
        runsByExample: Map<String, List<RunIngest>>,
        examplesById: Map<String, Example>,
        comparativeExperimentId: String,
    ): List<ComparativeResultRow> {
        if (params.maxConcurrency == 0 || runsByExample.size <= 1) {
            return runsByExample.mapNotNull { (exampleId, runs) ->
                val example = examplesById[exampleId] ?: return@mapNotNull null
                compareExample(example, runs, comparativeExperimentId)
            }
        }

        val poolSize = minOf(params.maxConcurrency, runsByExample.size)
        val executor = Executors.newFixedThreadPool(poolSize)
        return try {
            runsByExample
                .map { (exampleId, runs) ->
                    executor.submit(
                        Callable {
                            val example = examplesById[exampleId] ?: return@Callable null
                            compareExample(example, runs, comparativeExperimentId)
                        }
                    )
                }
                .mapNotNull { it.get() }
        } finally {
            executor.shutdown()
        }
    }

    private fun compareExample(
        example: Example,
        runs: List<RunIngest>,
        comparativeExperimentId: String,
    ): ComparativeResultRow {
        val orderedRuns =
            if (params.randomizeOrder) {
                runs.shuffled()
            } else {
                runs
            }

        val evaluationResults = linkedMapOf<String, ComparisonEvaluationResult>()
        for (evaluator in params.evaluators) {
            try {
                val result = evaluator.compareRuns(orderedRuns, example)
                evaluationResults["feedback.${result.key}"] = result
                val feedbackGroupId = UUID.randomUUID().toString()
                logComparativeEvaluationFeedback(
                    client,
                    result,
                    orderedRuns,
                    comparativeExperimentId,
                    feedbackGroupId,
                )
            } catch (e: Exception) {
                logger.log(
                    Level.SEVERE,
                    "Error running comparative evaluator $evaluator on example ${example.id()}",
                    e,
                )
            }
        }

        return ComparativeResultRow(
            example = example,
            runs = orderedRuns,
            evaluationResults = evaluationResults,
        )
    }
}

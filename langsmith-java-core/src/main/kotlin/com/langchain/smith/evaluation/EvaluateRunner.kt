package com.langchain.smith.evaluation

import com.langchain.smith.client.LangsmithClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.examples.Example
import com.langchain.smith.models.runs.RunIngest
import com.langchain.smith.models.sessions.SessionCreateParams
import com.langchain.smith.models.sessions.SessionUpdateParams
import com.langchain.smith.models.sessions.TracerSessionWithoutVirtualFields
import com.langchain.smith.tracing.RunTree
import com.langchain.smith.tracing.TraceConfig
import com.langchain.smith.tracing.getCurrentRunTree
import com.langchain.smith.tracing.traceable
import java.time.OffsetDateTime
import java.util.UUID
import java.util.concurrent.Callable
import java.util.concurrent.Executors
import java.util.logging.Level
import java.util.logging.Logger

/** Runs your app on each dataset row, scores the results, and records everything in LangSmith. */
internal class EvaluateRunner(
    private val client: LangsmithClient,
    private val params: EvaluateParams,
) {
    private val logger = Logger.getLogger(EvaluateRunner::class.java.name)

    /** End-to-end evaluate flow: load rows, open an experiment, run and score each one. */
    fun run(target: (Map<String, Any?>) -> Any?): ExperimentResults {
        require(params.maxConcurrency >= 0) { "maxConcurrency must be >= 0 (0 = sequential)" }

        val examples = expandExamples(loadExamples(), params.numRepetitions)
        require(examples.isNotEmpty()) { "No examples found to evaluate" }

        val datasetId = examples.first().datasetId()
        val sessionInfo = resolveExperimentSession(examples.size, datasetId)
        val experimentName = sessionInfo.first
        val sessionId = sessionInfo.second

        val rows =
            evaluateExamples(
                target = target,
                examples = examples,
                experimentName = experimentName,
                sessionId = sessionId,
            )

        val summaryResults = applySummaryEvaluators(rows, sessionId)

        if (params.uploadResults && sessionId != null) {
            updateExperimentMetadata(sessionId, examples)
        }

        // LangSmith UI URLs are not exposed on the Java session schema yet.
        val url: String? = null

        return ExperimentResults(
            experimentName = experimentName,
            experimentId = sessionId,
            datasetId = datasetId,
            rows = rows,
            summaryResults = summaryResults,
            url = url,
        )
    }

    private fun resolveExperimentSession(
        numExamples: Int,
        datasetId: String,
    ): Pair<String, String?> {
        params.experimentId?.let { existingId ->
            val session = loadExperiment(client, existingId)
            val name = session.name().orElse(existingId)
            return name to existingId
        }

        val experimentName =
            params.experimentName ?: generateExperimentName(params.experimentPrefix)

        if (!params.uploadResults) {
            return experimentName to null
        }

        val session = createExperimentSession(experimentName, datasetId, numExamples)
        return experimentName to session.id()
    }

    private fun evaluateExamples(
        target: (Map<String, Any?>) -> Any?,
        examples: List<Example>,
        experimentName: String,
        sessionId: String?,
    ): List<ExperimentResultRow> {
        if (params.maxConcurrency == 0 || examples.size <= 1) {
            return examples.mapNotNull { example ->
                evaluateExample(
                    target = target,
                    example = example,
                    experimentName = experimentName,
                    sessionId = sessionId,
                )
            }
        }

        val poolSize = minOf(params.maxConcurrency, examples.size)
        val executor = Executors.newFixedThreadPool(poolSize)
        return try {
            val futures =
                examples.map { example ->
                    executor.submit(
                        Callable {
                            evaluateExample(
                                target = target,
                                example = example,
                                experimentName = experimentName,
                                sessionId = sessionId,
                            )
                        }
                    )
                }
            futures.mapNotNull { it.get() }
        } finally {
            executor.shutdown()
        }
    }

    private fun loadExamples(): List<Example> =
        when (val data = params.data) {
            is EvaluateData.Dataset -> listExamples(client, data.identifier)
            is EvaluateData.Examples -> data.examples
        }

    private fun createExperimentSession(
        experimentName: String,
        datasetId: String,
        numExamples: Int,
    ): TracerSessionWithoutVirtualFields {
        val sessionMetadata = buildMap {
            putAll(params.metadata)
            put("__ls_runner", "java_sdk_evaluate")
            put("num_repetitions", params.numRepetitions)
        }

        val extraBuilder = SessionCreateParams.Extra.builder()
        sessionMetadata.forEach { (key, value) ->
            extraBuilder.putAdditionalProperty(key, JsonValue.from(value))
        }

        var candidateName = experimentName
        repeat(MAX_NAME_COLLISION_RETRIES) {
            try {
                return client
                    .sessions()
                    .create(
                        SessionCreateParams.builder()
                            .name(candidateName)
                            .description(params.description)
                            .referenceDatasetId(datasetId)
                            .numExamples(numExamples.toLong())
                            .startTime(OffsetDateTime.now())
                            .extra(extraBuilder.build())
                            .build()
                    )
            } catch (_: Exception) {
                candidateName = "$experimentName-${UUID.randomUUID().toString().take(6)}"
            }
        }
        throw IllegalStateException(
            "Could not create experiment session after $MAX_NAME_COLLISION_RETRIES attempts"
        )
    }

    private fun evaluateExample(
        target: (Map<String, Any?>) -> Any?,
        example: Example,
        experimentName: String,
        sessionId: String?,
    ): ExperimentResultRow? {
        val inputs = exampleInputs(example)
        val runMetadata = buildMap {
            putAll(params.metadata)
            put("example_version", exampleVersion(example))
        }

        val run =
            if (params.uploadResults) {
                runTracedTarget(target, inputs, example, experimentName, sessionId, runMetadata)
            } else {
                runLocalTarget(target, inputs, example)
            } ?: return null

        val evaluationResults =
            params.evaluators.flatMap { evaluator -> runEvaluator(evaluator, run, example) }

        return ExperimentResultRow(
            run = run,
            example = example,
            evaluationResults = EvaluationResults(evaluationResults),
        )
    }

    private fun runTracedTarget(
        target: (Map<String, Any?>) -> Any?,
        inputs: Map<String, Any?>,
        example: Example,
        experimentName: String,
        sessionId: String?,
        runMetadata: Map<String, Any>,
    ): RunIngest? {
        var runTree: RunTree? = null
        val wrappedTarget: (Map<String, Any?>) -> Any? = { exampleInputs ->
            target(exampleInputs).also { runTree = getCurrentRunTree() }
        }

        val traced =
            traceable(
                wrappedTarget,
                TraceConfig(
                    name = "Target",
                    client = client,
                    projectName = experimentName,
                    referenceExampleId =
                        if (params.errorHandling == EvaluateErrorHandling.LOG) example.id()
                        else null,
                    sessionId = sessionId,
                    metadata = runMetadata,
                    tracingEnabled = true,
                ),
            )

        try {
            traced(inputs)
        } catch (e: Exception) {
            logger.log(Level.SEVERE, "Error running target function", e)
            if (params.errorHandling == EvaluateErrorHandling.IGNORE) {
                return null
            }
        }

        return runTree?.buildRunData()
            ?: if (params.errorHandling == EvaluateErrorHandling.IGNORE) {
                null
            } else {
                throw IllegalStateException("Failed to capture run for example ${example.id()}")
            }
    }

    private fun runLocalTarget(
        target: (Map<String, Any?>) -> Any?,
        inputs: Map<String, Any?>,
        example: Example,
    ): RunIngest? {
        return try {
            val output = target(inputs)
            val outputsBuilder = RunIngest.Outputs.builder()
            when (output) {
                is Map<*, *> ->
                    output.forEach { (key, value) ->
                        outputsBuilder.putAdditionalProperty(key.toString(), JsonValue.from(value))
                    }
                else -> outputsBuilder.putAdditionalProperty("output", JsonValue.from(output))
            }
            RunIngest.builder()
                .id(UUID.randomUUID().toString())
                .referenceExampleId(example.id())
                .outputs(outputsBuilder.build())
                .build()
        } catch (e: Exception) {
            logger.log(Level.SEVERE, "Error running target function", e)
            if (params.errorHandling == EvaluateErrorHandling.IGNORE) {
                null
            } else {
                throw e
            }
        }
    }

    private fun runEvaluator(
        evaluator: RunEvaluator,
        run: RunIngest,
        example: Example,
    ): List<EvaluationResult> {
        val evaluatorRunId = newEvaluatorRunId()
        return try {
            val response = evaluator.evaluateRun(run, example, evaluatorRunId)
            if (params.uploadResults) {
                logEvaluationFeedback(client, response, run)
            }
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
            if (params.uploadResults) {
                logEvaluationFeedback(client, errorResponse, run)
            }
            errorResponse.results
        }
    }

    private fun applySummaryEvaluators(
        rows: List<ExperimentResultRow>,
        sessionId: String?,
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
                if (params.uploadResults && sessionId != null) {
                    logSummaryEvaluationFeedback(client, response, sessionId)
                }
            } catch (e: Exception) {
                logger.log(Level.SEVERE, "Error running summary evaluator $evaluator", e)
            }
        }

        return EvaluationResults(aggregateResults)
    }

    private fun updateExperimentMetadata(sessionId: String, examples: List<Example>) {
        try {
            val projectMetadata = buildMap {
                putAll(params.metadata)
                put("dataset_version", datasetVersion(examples))
            }
            val extraBuilder = SessionUpdateParams.Extra.builder()
            projectMetadata.forEach { (key, value) ->
                extraBuilder.putAdditionalProperty(key, JsonValue.from(value))
            }
            client
                .sessions()
                .update(
                    sessionId,
                    SessionUpdateParams.builder().extra(extraBuilder.build()).build(),
                )
        } catch (e: Exception) {
            logger.log(Level.WARNING, "Failed to update experiment metadata for $sessionId", e)
        }
    }

    private fun datasetVersion(examples: List<Example>): String? {
        val modifiedAt =
            examples.mapNotNull { example ->
                example.modifiedAt().orElseGet { example.createdAt().orElse(null) }
            }
        val maxModifiedAt = modifiedAt.maxOrNull() ?: return null
        return maxModifiedAt.toString()
    }

    private companion object {
        const val MAX_NAME_COLLISION_RETRIES = 10
    }
}

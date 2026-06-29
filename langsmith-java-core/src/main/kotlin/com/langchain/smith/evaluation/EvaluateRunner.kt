package com.langchain.smith.evaluation

import com.langchain.smith.client.LangsmithClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.datasets.DatasetListParams
import com.langchain.smith.models.examples.Example
import com.langchain.smith.models.examples.ExampleListParams
import com.langchain.smith.models.runs.Run
import com.langchain.smith.models.sessions.SessionCreateParams
import com.langchain.smith.models.sessions.TracerSessionWithoutVirtualFields
import com.langchain.smith.tracing.RunTree
import com.langchain.smith.tracing.TraceConfig
import com.langchain.smith.tracing.getCurrentRunTree
import com.langchain.smith.tracing.traceable
import java.time.OffsetDateTime
import java.util.UUID

/** Runs your app on each dataset row, scores the results, and records everything in LangSmith. */
internal class EvaluateRunner(
    private val client: LangsmithClient,
    private val params: EvaluateParams,
) {
    /** End-to-end evaluate flow: load rows, open an experiment, run and score each one. */
    fun run(target: (Map<String, Any?>) -> Any?): ExperimentResults {
        require(params.maxConcurrency <= 1) {
            "maxConcurrency > 1 is not supported yet; use 0 or 1 for sequential evaluation"
        }

        val examples = loadExamples()
        require(examples.isNotEmpty()) { "No examples found to evaluate" }

        val datasetId = examples.first().datasetId()
        val experimentName =
            params.experimentName ?: generateExperimentName(params.experimentPrefix)
        val session = createExperimentSession(experimentName, datasetId, examples.size)
        val sessionId = session.id()

        val rows =
            examples.map { example ->
                evaluateExample(
                    target = target,
                    example = example,
                    experimentName = experimentName,
                    sessionId = sessionId,
                )
            }

        return ExperimentResults(
            experimentName = experimentName,
            experimentId = sessionId,
            datasetId = datasetId,
            rows = rows,
        )
    }

    /** Gets the dataset rows to evaluate, either from LangSmith or from an in-memory list. */
    private fun loadExamples(): List<Example> =
        when (val data = params.data) {
            is EvaluateData.Dataset -> listExamples(data.identifier)
            is EvaluateData.Examples -> data.examples
        }

    /** Downloads all examples for a dataset from LangSmith. */
    private fun listExamples(datasetIdentifier: String): List<Example> {
        val datasetId = resolveDatasetId(datasetIdentifier)
        val listParams = ExampleListParams.builder().dataset(datasetId).build()
        return client.examples().list(listParams).autoPager().toList()
    }

    /** Turns a dataset name or id into the id LangSmith expects when listing examples. */
    private fun resolveDatasetId(datasetIdentifier: String): String {
        if (isUuid(datasetIdentifier)) {
            return datasetIdentifier
        }
        val matches =
            client
                .datasets()
                .list(DatasetListParams.builder().name(datasetIdentifier).build())
                .items()
        require(matches.isNotEmpty()) {
            "No dataset found with name '$datasetIdentifier'. Create the dataset first or pass its UUID."
        }
        require(matches.size == 1) {
            "Multiple datasets named '$datasetIdentifier'; pass the dataset UUID instead."
        }
        return matches.single().id()
    }

    private fun isUuid(value: String): Boolean =
        try {
            UUID.fromString(value)
            true
        } catch (_: IllegalArgumentException) {
            false
        }

    /** Opens a new experiment in LangSmith so all runs and scores appear together in the UI. */
    private fun createExperimentSession(
        experimentName: String,
        datasetId: String,
        numExamples: Int,
    ): TracerSessionWithoutVirtualFields {
        val sessionMetadata = buildMap {
            putAll(params.metadata)
            put("__ls_runner", "java_sdk_evaluate")
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
                // Retry with a suffixed name (matches Python evaluate session creation).
                candidateName = "$experimentName-${UUID.randomUUID().toString().take(6)}"
            }
        }
        throw IllegalStateException(
            "Could not create experiment session after $MAX_NAME_COLLISION_RETRIES attempts"
        )
    }

    /** Runs the app on one row, records the trace, then scores it with every evaluator. */
    private fun evaluateExample(
        target: (Map<String, Any?>) -> Any?,
        example: Example,
        experimentName: String,
        sessionId: String,
    ): ExperimentResultRow {
        val inputs = exampleInputs(example)
        val runMetadata = buildMap {
            putAll(params.metadata)
            put("example_version", exampleVersion(example))
        }

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
                    referenceExampleId = example.id(),
                    sessionId = sessionId,
                    metadata = runMetadata,
                    tracingEnabled = true,
                ),
            )

        traced(inputs)

        val run =
            runTree?.buildRunData()
                ?: throw IllegalStateException("Failed to capture run for example ${example.id()}")

        val evaluationResults =
            params.evaluators.flatMap { evaluator -> runEvaluator(evaluator, run, example) }

        return ExperimentResultRow(
            run = run,
            example = example,
            evaluationResults = EvaluationResults(evaluationResults),
        )
    }

    /** Calls one evaluator and uploads its score to LangSmith as feedback on the prediction run. */
    private fun runEvaluator(
        evaluator: RunEvaluator,
        run: Run,
        example: Example,
    ): List<EvaluationResult> {
        val evaluatorRunId = newEvaluatorRunId()
        return try {
            val response = evaluator.evaluateRun(run, example, evaluatorRunId)
            logEvaluationFeedback(client, response, run)
            selectEvaluationResults(response)
        } catch (e: Exception) {
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

    private fun exampleVersion(example: Example): String {
        val timestamp = example.modifiedAt().orElseGet { example.createdAt().orElse(null) }
        return timestamp?.toString() ?: OffsetDateTime.now().toString()
    }

    private fun generateExperimentName(prefix: String): String =
        "$prefix-${UUID.randomUUID().toString().take(8)}"

    private companion object {
        const val MAX_NAME_COLLISION_RETRIES = 10
    }
}

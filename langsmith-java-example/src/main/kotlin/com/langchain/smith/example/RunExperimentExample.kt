package com.langchain.smith.example

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.evaluation.EvaluateParams
import com.langchain.smith.evaluation.EvaluationResult
import com.langchain.smith.evaluation.ExperimentClient
import com.langchain.smith.example.util.generateExampleId
import com.langchain.smith.models.datasets.Dataset
import com.langchain.smith.models.datasets.DatasetCreateParams
import com.langchain.smith.models.datasets.DatasetListParams
import com.langchain.smith.models.examples.bulk.BulkCreateParams

/**
 * Demonstrates running a high-level LangSmith experiment with a target function and local
 * evaluator.
 *
 * ## Prerequisites
 * Set `LANGSMITH_API_KEY` before running.
 *
 * ## Running
 * ```bash
 * ./gradlew :langsmith-java-example:run -Pexample=RunExperiment
 * ```
 */
fun main() {
    val client = LangsmithOkHttpClient.fromEnv()
    val experimentClient = ExperimentClient.create(client)

    val datasetName = "Experiment Runner Dataset - Kotlin Example"
    val dataset = getOrCreateDataset(client, datasetName)
    createExamples(client, dataset)

    val results =
        experimentClient.evaluate(
            EvaluateParams.builder()
                .data(datasetName)
                .experimentPrefix("java-sdk-evaluate")
                .description("High-level Java SDK experiment runner example.")
                .putMetadata("example", "RunExperimentExample")
                .target { example ->
                    val question = example.inputs()["question"] as String
                    mapOf("answer" to answer(question))
                }
                .addEvaluator { run, example ->
                    val actual = run.outputs()["answer"]?.toString()
                    val expected = example.outputs()["answer"]?.toString()
                    val matches = actual == expected
                    EvaluationResult.builder()
                        .key("exact_match")
                        .score(matches)
                        .comment("Expected '$expected', got '$actual'.")
                        .build()
                }
                .build()
        )

    println("Experiment complete: ${results.experimentName().orElse(results.experimentId())}")
    println("Rows: ${results.rows().size}")
    println("Feedback: ${results.feedback().size}")
}

private fun getOrCreateDataset(
    client: com.langchain.smith.client.LangsmithClient,
    datasetName: String,
): Dataset {
    val existing =
        client.datasets().list(DatasetListParams.builder().name(datasetName).build()).items()
    if (existing.isNotEmpty()) return existing.first()

    return client
        .datasets()
        .create(
            DatasetCreateParams.builder()
                .name(datasetName)
                .description("Dataset for the high-level Java SDK experiment runner example.")
                .build()
        )
}

private fun createExamples(client: com.langchain.smith.client.LangsmithClient, dataset: Dataset) {
    val examples =
        listOf(
            mapOf("question" to "What is the capital of France?") to mapOf("answer" to "Paris"),
            mapOf("question" to "What is 2 + 2?") to mapOf("answer" to "4"),
            mapOf("question" to "Who wrote Romeo and Juliet?") to
                mapOf("answer" to "William Shakespeare"),
        )

    val bodies =
        examples.map { (inputs, outputs) ->
            BulkCreateParams.Body.builder()
                .id(generateExampleId(dataset.id(), inputs, outputs))
                .datasetId(dataset.id())
                .inputs(JsonValue.from(inputs))
                .outputs(JsonValue.from(outputs))
                .build()
        }

    client
        .examples()
        .bulk()
        .create(BulkCreateParams.builder().apply { bodies.forEach { addBody(it) } }.build())
}

private fun answer(question: String): String =
    when {
        "capital of France" in question -> "Paris"
        "2 + 2" in question -> "4"
        "Romeo and Juliet" in question -> "William Shakespeare"
        else -> "I do not know"
    }

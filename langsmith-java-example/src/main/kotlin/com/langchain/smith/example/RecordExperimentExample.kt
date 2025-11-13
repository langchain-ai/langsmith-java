package com.langchain.smith.example

import com.langchain.smith.client.LangsmithClient
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.datasets.Dataset
import com.langchain.smith.models.datasets.DatasetCreateParams
import com.langchain.smith.models.datasets.DatasetListParams
import com.langchain.smith.models.examples.Example
import com.langchain.smith.models.examples.bulk.BulkCreateParams
import com.langchain.smith.models.runs.Run
import com.langchain.smith.models.runs.RunIngestBatchParams
import com.langchain.smith.models.sessions.SessionCreateParams
import com.langchain.smith.models.sessions.TracerSessionWithoutVirtualFields
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter

/**
 * Demonstrates how to record experiments in LangSmith using datasets, sessions, and runs.
 *
 * This example is inspired by the Python implementation at:
 * https://github.com/jacoblee93/langsmith-rest-experiments
 *
 * This example shows:
 * - Defining experiment results with inputs, reference outputs, and actual outputs
 * - Getting or creating a dataset by name
 * - Generating deterministic example IDs using UUID v5
 * - Creating or updating examples in the dataset with idempotent IDs
 * - Creating an experiment session to group experiment runs
 * - Logging mocked LLM runs with inputs, outputs, and metadata
 * - Using LLM-as-judge evaluators to compare actual vs reference outputs
 *
 * ## Prerequisites
 * Set these environment variables before running:
 * - `LANGSMITH_API_KEY`: Your LangSmith API key
 *
 * ## Running
 * ```bash
 * ./gradlew :langsmith-java-example:run -Pexample=RecordExperiment
 * ```
 */

fun main() {
    // Configure client from environment variables
    val client: LangsmithClient = LangsmithOkHttpClient.fromEnv()

    val datasetName = "Experiment Dataset - Java Example"
    val experimentName = "My First Experiment - ${OffsetDateTime.now()}"

    println("=".repeat(60))
    println("LangSmith Experiment Recording Example")
    println("=".repeat(60))
    println()

    // Define experiment results - this is the core data structure that drives everything
    // In a real scenario, these would come from running your LLM application
    println("Defining experiment results...")
    val now = OffsetDateTime.now()
    val experimentResults = listOf(
        mapOf(
            "input" to mapOf("question" to "What is the capital of France?"),
            "reference_output" to mapOf("answer" to "Paris"),
            "actual_output" to mapOf("answer" to "The capital of France is Marseille."),
            "start_time" to now.minusSeconds(10),
            "end_time" to now.minusSeconds(8),
            "metadata" to mapOf(
                "model" to "gpt-4",
                "temperature" to 0.7,
                "tokens" to 25,
                "cost" to 0.0015
            )
        ),
        mapOf(
            "input" to mapOf("question" to "What is 2 + 2?"),
            "reference_output" to mapOf("answer" to "4"),
            "actual_output" to mapOf("answer" to "2 + 2 equals 4"),
            "start_time" to now.minusSeconds(8),
            "end_time" to now.minusSeconds(7),
            "metadata" to mapOf(
                "model" to "gpt-4",
                "temperature" to 0.7,
                "tokens" to 18,
                "cost" to 0.001
            )
        ),
        mapOf(
            "input" to mapOf("question" to "Who wrote Romeo and Juliet?"),
            "reference_output" to mapOf("answer" to "William Shakespeare"),
            "actual_output" to mapOf("answer" to "Romeo and Juliet was written by William Shakespeare."),
            "start_time" to now.minusSeconds(7),
            "end_time" to now.minusSeconds(5),
            "metadata" to mapOf(
                "model" to "gpt-4",
                "temperature" to 0.7,
                "tokens" to 22,
                "cost" to 0.0013
            )
        ),
        mapOf(
            "input" to mapOf("question" to "What is the largest planet in our solar system?"),
            "reference_output" to mapOf("answer" to "Jupiter"),
            "actual_output" to mapOf("answer" to "Jupiter is the largest planet in our solar system."),
            "start_time" to now.minusSeconds(5),
            "end_time" to now.minusSeconds(3),
            "metadata" to mapOf(
                "model" to "gpt-4",
                "temperature" to 0.7,
                "tokens" to 20,
                "cost" to 0.0012
            )
        )
    )
    println("   ✓ Defined ${experimentResults.size} experiment results")
    println()

    // 1. Get or create dataset
    println("1. Getting or creating dataset '$datasetName'...")
    val listParams = DatasetListParams.builder()
        .name(datasetName)
        .build()
    val existingDatasets = client.datasets().list(listParams)

    val dataset = if (existingDatasets.isNotEmpty()) {
        val existing = existingDatasets[0]
        println("   ✓ Found existing dataset (ID: ${existing.id()})")
        existing
    } else {
        val createParams = DatasetCreateParams.builder()
            .name(datasetName)
            .description("Dataset for recording experiment results. Inspired by langsmith-rest-experiments.")
            .build()
        val created = client.datasets().create(createParams)
        println("   ✓ Created new dataset (ID: ${created.id()})")
        created
    }
    println("   → View dataset: ${buildDatasetUrl(dataset)}")
    println()

    // 2. Create examples from experiment results using input and reference_output
    println("2. Creating dataset examples from experiment results...")
    val exampleBodies = experimentResults.map { result ->
        @Suppress("UNCHECKED_CAST")
        val input = result["input"] as Map<String, Any>
        @Suppress("UNCHECKED_CAST")
        val referenceOutput = result["reference_output"] as Map<String, Any>

        // Generate deterministic ID
        val exampleId = generateExampleId(dataset.id(), input, referenceOutput)

        BulkCreateParams.Body.builder()
            .id(exampleId)
            .datasetId(dataset.id())
            .inputs(JsonValue.from(input))
            .outputs(JsonValue.from(referenceOutput))
            .build()
    }

    val bulkCreateParams = BulkCreateParams.builder()
        .apply { exampleBodies.forEach { addBody(it) } }
        .build()

    val createdExamples = client.examples().bulk().create(bulkCreateParams)
    println("   ✓ Created/updated ${createdExamples.size} examples with deterministic IDs")
    println()

    // 3. Create experiment session
    println("3. Creating experiment session...")
    val sessionParams = SessionCreateParams.builder()
        .name(experimentName)
        .description("Experiment session for testing LLM responses. " +
                "Use LLM-as-judge evaluators to compare actual_output vs reference_output.")
        .startTime(OffsetDateTime.now())
        .referenceDatasetId(dataset.id())
        .build()

    val session = client.sessions().create(sessionParams)
    println("   ✓ Created experiment session: ${session.name()}")
    println("   ✓ Session ID: ${session.id()}")
    println("   → View experiment: ${buildSessionUrl(session.tenantId(), session.id())}")
    println()

    // 4. Create and send runs from experiment results
    println("4. Logging experiment runs to LangSmith...")
    val formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME
    val runs = experimentResults.mapIndexed { index, result ->
        @Suppress("UNCHECKED_CAST")
        val input = result["input"] as Map<String, Any>
        @Suppress("UNCHECKED_CAST")
        val actualOutput = result["actual_output"] as Map<String, Any>
        @Suppress("UNCHECKED_CAST")
        val startTime = result["start_time"] as OffsetDateTime
        @Suppress("UNCHECKED_CAST")
        val endTime = result["end_time"] as OffsetDateTime
        @Suppress("UNCHECKED_CAST")
        val metadata = result["metadata"] as Map<String, Any>

        val example = createdExamples[index]
        val runId = java.util.UUID.randomUUID().toString()

        // Generate dotted_order following LangSmith SDK pattern: YYYYMMDDTHHMMSSffffffZ + UUID
        // See: https://github.com/langchain-ai/langsmith-sdk/blob/main/python/langsmith/run_trees.py
        val dottedOrderFormatter = DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmssSSSSSSSSS'Z'")
        val dottedOrder = startTime.format(dottedOrderFormatter) + runId

        Run.builder()
            .id(runId)
            .name("Experiment Run - Question ${index + 1}")
            .runType(Run.RunType.LLM)
            .inputs(
                Run.Inputs.builder()
                    .putAllAdditionalProperties(input.mapValues { JsonValue.from(it.value) })
                    .build()
            )
            .outputs(
                Run.Outputs.builder()
                    .putAllAdditionalProperties(actualOutput.mapValues { JsonValue.from(it.value) })
                    .build()
            )
            .referenceExampleId(example.id())
            .sessionName(experimentName)
            .sessionId(session.id())
            .startTime(startTime.format(formatter))
            .endTime(endTime.format(formatter))
            .traceId(runId)  // For root-level runs, trace_id equals run id
            .dottedOrder(dottedOrder)  // Timestamp + UUID for ordering
            .extra(
                Run.Extra.builder()
                    .putAllAdditionalProperties(metadata.mapValues { JsonValue.from(it.value) })
                    .build()
            )
            .build()
    }

    // Send all runs in a single batch
    val runIngestParams = RunIngestBatchParams.builder()
        .apply { runs.forEach { addPost(it) } }
        .build()

    val ingestResponse = client.runs().ingestBatch(runIngestParams)
    println("   ✓ Successfully logged ${runs.size} runs to experiment session")
    println()

    // 5. Summary and next steps
    println("=".repeat(60))
    println("Experiment Complete!")
    println("=".repeat(60))
    println()
    println("What was logged:")
    println("  • Dataset: $datasetName with ${createdExamples.size} examples")
    println("  • Experiment: $experimentName with ${runs.size} runs")
    println("  • Each run has:")
    println("    - Input (the question)")
    println("    - Reference output (ground truth answer)")
    println("    - Actual output (simulated LLM response)")
    println("    - Metadata (model, tokens, cost, etc.)")
    println()
    println("Next steps:")
    println("  1. View your experiment results:")
    println("     ${buildSessionUrl(session.tenantId(), session.id())}")
    println()
    println("  2. In the LangSmith UI, you can:")
    println("     - Compare actual outputs vs reference outputs side-by-side")
    println("     - Add LLM-as-judge evaluators to automatically score quality")
    println("     - Create annotation queues for human feedback")
    println("     - Run additional experiments and compare results")
    println()
    println("  3. For your real application:")
    println("     - Replace experiment_results with actual LLM application outputs")
    println("     - Log runs as they complete using client.runs().ingestBatch()")
    println("     - Use the same session to group related runs")
    println()
    println("Dataset URL:    ${buildDatasetUrl(dataset)}")
    println("Experiment URL: ${buildSessionUrl(session.tenantId(), session.id())}")
    println()
    println("Reference: https://github.com/jacoblee93/langsmith-rest-experiments")
}

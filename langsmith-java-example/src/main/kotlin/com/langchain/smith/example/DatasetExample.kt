package com.langchain.smith.example

import com.langchain.smith.client.LangsmithClient
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.datasets.Dataset
import com.langchain.smith.models.datasets.DatasetCreateParams
import com.langchain.smith.models.datasets.DatasetListParams
import com.langchain.smith.models.examples.ExampleCreateParams

/**
 * Demonstrates how to create a dataset and add examples to it programmatically.
 *
 * This example shows:
 * - Creating or retrieving a dataset by name
 * - Adding individual examples with inputs and outputs
 * - Working with the dataset and example APIs
 *
 * ## Prerequisites
 * Set these environment variables before running:
 * - `LANGSMITH_API_KEY`: Your LangSmith API key
 * - `LANGSMITH_BASE_URL`: LangSmith API URL (e.g., https://api.smith.langchain.com)
 *
 * ## Running
 * ```bash
 * ./gradlew :langsmith-java-example:run -Pexample=Dataset
 * ```
 */
fun main() {
    // Configure client from environment variables
    // Requires: LANGSMITH_API_KEY and LANGSMITH_BASE_URL
    val client: LangsmithClient = LangsmithOkHttpClient.fromEnv()

    // Get or create a dataset
    val datasetName = "Sample Dataset created in Kotlin"
    val dataset: Dataset

    // Try to find existing dataset by name
    val listParams = DatasetListParams.builder()
        .name(datasetName)
        .build()
    val existingDatasets = client.datasets().list(listParams)

    dataset = if (existingDatasets.isNotEmpty()) {
        existingDatasets[0].also {
            println("Found existing dataset: ${it.name()} (ID: ${it.id()})")
        }
    } else {
        // Create a new dataset if it doesn't exist
        val datasetParams = DatasetCreateParams.builder()
            .name(datasetName)
            .description("A sample dataset in LangSmith.")
            .build()
        client.datasets().create(datasetParams).also {
            println("Created dataset: ${it.name()} (ID: ${it.id()})")
        }
    }

    // Create examples

    // Example 1: Mount Kilimanjaro
    val example1Params = ExampleCreateParams.builder()
        .putAdditionalBodyProperty("dataset_id", JsonValue.from(dataset.id()))
        .putAdditionalBodyProperty("inputs", JsonValue.from(
            mapOf("question" to "Which country is Mount Kilimanjaro located in?")))
        .putAdditionalBodyProperty("outputs", JsonValue.from(
            mapOf("answer" to "Mount Kilimanjaro is located in Tanzania.")))
        .build()
    val example1 = client.examples().create(example1Params)
    println("Created example 1: ${example1.id()}")

    // Example 2: Earth's lowest point
    val example2Params = ExampleCreateParams.builder()
        .putAdditionalBodyProperty("dataset_id", JsonValue.from(dataset.id()))
        .putAdditionalBodyProperty("inputs", JsonValue.from(
            mapOf("question" to "What is Earth's lowest point?")))
        .putAdditionalBodyProperty("outputs", JsonValue.from(
            mapOf("answer" to "Earth's lowest point is The Dead Sea.")))
        .build()
    val example2 = client.examples().create(example2Params)
    println("Created example 2: ${example2.id()}")

    // TODO: Add a bulk example

    println("Successfully added examples to dataset: ${dataset.name()}")
}

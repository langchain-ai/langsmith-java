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
 * - Checking if a dataset already exists by name
 * - Creating a new dataset
 * - Adding individual examples with inputs and outputs
 * - Retrieving the dataset and showing example count
 * - Deleting the dataset
 *
 * ## Prerequisites
 * Set these environment variables before running:
 * - `LANGSMITH_API_KEY`: Your LangSmith API key
 * - `LANGCHAIN_BASE_URL`: LangSmith API URL (e.g., https://api.smith.langchain.com)
 *
 * ## Running
 * ```bash
 * ./gradlew :langsmith-java-example:run -Pexample=Dataset
 * ```
 */

/**
 * Constructs the web URL for a dataset from the API base URL.
 */
fun getDatasetUrl(dataset: Dataset): String {
    val baseUrl = System.getenv("LANGCHAIN_BASE_URL") ?: "https://api.smith.langchain.com"
    val hostUrl = baseUrl.replace("api.", "")
    return "$hostUrl/o/${dataset.tenantId()}/datasets/${dataset.id()}"
}

fun main() {
    // Configure client from environment variables
    // Requires: LANGSMITH_API_KEY and LANGCHAIN_BASE_URL
    val client: LangsmithClient = LangsmithOkHttpClient.fromEnv()

    val datasetName = "Sample Dataset created in Kotlin"

    // 1. List datasets using the name filter and check if it already exists
    println("1. Listing datasets with name filter using client.datasets().list()...")
    val listParams = DatasetListParams.builder()
        .name(datasetName)
        .build()
    val existingDatasets = client.datasets().list(listParams)

    if (existingDatasets.isNotEmpty()) {
        val existing = existingDatasets[0]
        System.err.println("Error: Dataset with name '$datasetName' already exists")
        System.err.println("View existing dataset: ${getDatasetUrl(existing)}")
        return
    }
    println("   ✓ No existing dataset found with name '$datasetName'\n")

    // 2. Create a new dataset
    println("2. Creating dataset using client.datasets().create()...")
    val datasetParams = DatasetCreateParams.builder()
        .name(datasetName)
        .description("A sample dataset in LangSmith.")
        .build()
    val dataset = client.datasets().create(datasetParams)
    println("   ✓ Created dataset: ${dataset.name()} (ID: ${dataset.id()})\n")

    // 3. Add examples using create
    println("3. Adding examples using client.examples().create()...")

    // Example 1: Mount Kilimanjaro
    val example1Params = ExampleCreateParams.builder()
        .putAdditionalBodyProperty("dataset_id", JsonValue.from(dataset.id()))
        .putAdditionalBodyProperty("inputs", JsonValue.from(
            mapOf("question" to "Which country is Mount Kilimanjaro located in?")))
        .putAdditionalBodyProperty("outputs", JsonValue.from(
            mapOf("answer" to "Mount Kilimanjaro is located in Tanzania.")))
        .build()
    val example1 = client.examples().create(example1Params)
    println("   ✓ Created example 1: ${example1.id()}")

    // Example 2: Earth's lowest point
    val example2Params = ExampleCreateParams.builder()
        .putAdditionalBodyProperty("dataset_id", JsonValue.from(dataset.id()))
        .putAdditionalBodyProperty("inputs", JsonValue.from(
            mapOf("question" to "What is Earth's lowest point?")))
        .putAdditionalBodyProperty("outputs", JsonValue.from(
            mapOf("answer" to "Earth's lowest point is The Dead Sea.")))
        .build()
    val example2 = client.examples().create(example2Params)
    println("   ✓ Created example 2: ${example2.id()}\n")

    // 4. Retrieve the dataset and show the number of examples
    println("4. Retrieving dataset using client.datasets().retrieve()...")
    val retrievedDataset = client.datasets().retrieve(dataset.id())
    println("   ✓ Retrieved dataset: ${retrievedDataset.name()}")
    println("   ✓ Number of examples: ${retrievedDataset.exampleCount()}")
    println("   ✓ View dataset: ${getDatasetUrl(retrievedDataset)}")

    // 5. Delete the dataset
    println("\n5. Press Enter to delete the dataset using client.datasets().delete()...")
    readln()
    client.datasets().delete(dataset.id())
    println("   ✓ Deleted dataset: ${dataset.name()} (ID: ${dataset.id()})")
}

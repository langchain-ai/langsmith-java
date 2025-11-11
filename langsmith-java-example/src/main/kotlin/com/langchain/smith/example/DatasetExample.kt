package com.langchain.smith.example

import com.langchain.smith.client.LangsmithClient
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.datasets.Dataset
import com.langchain.smith.models.datasets.DatasetCreateParams
import com.langchain.smith.models.datasets.DatasetListParams
import com.langchain.smith.models.examples.ExampleCreateParams
import com.langchain.smith.models.examples.bulk.BulkCreateParams

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

/**
 * Deletes a dataset after user confirmation.
 */
fun deleteDatasetWithConfirmation(client: LangsmithClient, dataset: Dataset) {
    println("\nPress Enter to delete the dataset using client.datasets().delete()...")
    try {
        readln()
    } catch (e: Exception) {
        // If stdin is not available (e.g., running in CI), skip confirmation
        println("   (Skipping confirmation - stdin not available)")
    }
    client.datasets().delete(dataset.id())
    println("   ✓ Deleted dataset: ${dataset.name()} (ID: ${dataset.id()})")
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
        deleteDatasetWithConfirmation(client, existing)
    } else {
        println("   ✓ No existing dataset found with name '$datasetName'\n")
    }

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
        .datasetId(dataset.id())
        .inputs(JsonValue.from(mapOf("question" to "Which country is Mount Kilimanjaro located in?")))
        .outputs(JsonValue.from(mapOf("answer" to "Mount Kilimanjaro is located in Tanzania.")))
        .build()
    val example1 = client.examples().create(example1Params)
    println("   ✓ Created example 1: ${example1.id()}")

    // Example 2: Earth's lowest point
    val example2Params = ExampleCreateParams.builder()
        .datasetId(dataset.id())
        .inputs(JsonValue.from(mapOf("question" to "What is Earth's lowest point?")))
        .outputs(JsonValue.from(mapOf("answer" to "Earth's lowest point is The Dead Sea.")))
        .build()
    val example2 = client.examples().create(example2Params)
    println("   ✓ Created example 2: ${example2.id()}\n")

    // 4. Add more examples using bulk create
    println("4. Adding examples using client.examples().bulk().create()...")
    val bulkExamples = client.examples().bulk().create(
        BulkCreateParams.builder()
            .addBody(
                BulkCreateParams.Body.builder()
                    .datasetId(dataset.id())
                    .inputs(JsonValue.from(mapOf("question" to "What is the capital of France?")))
                    .outputs(JsonValue.from(mapOf("answer" to "The capital of France is Paris.")))
                    .build()
            )
            .addBody(
                BulkCreateParams.Body.builder()
                    .datasetId(dataset.id())
                    .inputs(JsonValue.from(mapOf("question" to "Which ocean is the largest?")))
                    .outputs(JsonValue.from(mapOf("answer" to "The Pacific Ocean is the largest.")))
                    .build()
            )
            .build()
    )
    println("   ✓ Created ${bulkExamples.size} examples in bulk\n")

    // 5. Retrieve the dataset and show the number of examples
    println("5. Retrieving dataset using client.datasets().retrieve()...")
    val retrievedDataset = client.datasets().retrieve(dataset.id())
    println("   ✓ Retrieved dataset: ${retrievedDataset.name()}")
    println("   ✓ Number of examples: ${retrievedDataset.exampleCount()}")
    println("   ✓ View dataset: ${getDatasetUrl(retrievedDataset)}")

    // 6. Delete the dataset
    println("\n6. Deleting the dataset...")
    deleteDatasetWithConfirmation(client, dataset)
}

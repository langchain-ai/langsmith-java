package com.langchain.smith.example

import com.langchain.smith.client.LangsmithClient
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.runs.RunQueryV2Params
import com.langchain.smith.models.runs.RunSelectField
import java.time.OffsetDateTime
import kotlin.system.exitProcess

/**
 * Demonstrates how to query and list runs from a LangSmith project.
 *
 * This example shows:
 * - Configuring run query parameters with filters
 * - Querying runs by project/session ID
 * - Iterating through and displaying run information
 *
 * ## Prerequisites
 * Set these environment variables before running:
 * - `LANGSMITH_API_KEY`: Your LangSmith API key
 * - `LANGSMITH_PROJECT_ID`: The project ID to query runs from (find in LangSmith UI → Settings)
 *
 * ## Running
 * ```bash
 * export LANGSMITH_PROJECT_ID="your-project-id"
 * ./gradlew :langsmith-java-example:run -Pexample=ListRuns
 * ```
 */
fun main() {
    // Configure client from environment variables
    // Requires: LANGSMITH_API_KEY and LANGSMITH_ENDPOINT
    val client: LangsmithClient = LangsmithOkHttpClient.fromEnv()

    // Get project ID from environment variable or use a default
    // You can find your project ID in the LangSmith UI under Settings
    val projectId = System.getenv("LANGSMITH_PROJECT_ID")

    if (projectId.isNullOrEmpty()) {
        System.err.println("Error: LANGSMITH_PROJECT_ID environment variable is required")
        System.err.println("You can find your project ID in the LangSmith UI under Settings")
        exitProcess(1)
    }

    // Create query parameters
    // Without minStartTime the query only covers the last 24 hours
    // Only the selected fields are returned; the default is the run ID alone
    val params = RunQueryV2Params.builder()
        .addProjectId(projectId) // Filter by project ID
        .minStartTime(OffsetDateTime.now().minusDays(7))
        .addSelect(RunSelectField.ID)
        .addSelect(RunSelectField.NAME)
        .pageSize(10L) // Return 10 runs
        .build()

    // Query runs
    val runs = client.runs().queryV2(params).items()

    // Print runs
    println("Found ${runs.size} runs:")
    runs.forEach { run ->
        println("Run ID: ${run.id().orElse("")}")
        println("Run Name: ${run.name().orElse("")}")
        println("---")
    }
}

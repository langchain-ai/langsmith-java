package com.langchain.smith.example

import com.langchain.smith.client.LangsmithClient
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.runs.RunQueryParams
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
    // The API requires at least one filter (session, id, parent_run, trace, or reference_example)
    // This example queries runs for a specific project/session
    val params = RunQueryParams.builder()
        .addSession(projectId) // Filter by project/session ID
        .limit(10L) // Limit to 10 runs
        .build()

    // Query runs
    val response = client.runs().query(params)

    // Print runs
    println("Found ${response.runs().size} runs:")
    response.runs().forEach { run ->
        println("Run ID: ${run.id()}")
        println("Run Name: ${run.name()}")
        println("---")
    }
}

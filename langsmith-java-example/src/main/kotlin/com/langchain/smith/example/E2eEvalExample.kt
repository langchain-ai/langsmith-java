package com.langchain.smith.example

import com.langchain.smith.client.LangsmithClient
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.datasets.Dataset
import com.langchain.smith.models.datasets.DatasetCreateParams
import com.langchain.smith.models.datasets.DatasetListParams
import com.langchain.smith.models.examples.Example
import com.langchain.smith.models.examples.bulk.BulkCreateParams
import com.langchain.smith.wrappers.openai.ExperimentContext
import com.langchain.smith.wrappers.openai.OpenAIWrappers
import com.langchain.smith.wrappers.openai.OpenTelemetryConfig
import com.langchain.smith.wrappers.openai.WrappedOpenAIClient
import com.openai.models.ChatModel
import com.openai.models.chat.completions.ChatCompletion
import com.openai.models.chat.completions.ChatCompletionCreateParams
import java.nio.charset.StandardCharsets
import java.security.MessageDigest
import java.time.OffsetDateTime
import java.util.UUID

/**
 * Demonstrates how to run real experiments in LangSmith using OpenAI with automatic tracing.
 *
 * This example shows:
 * - Configuring OpenTelemetry to send traces to LangSmith automatically
 * - Creating a dataset idempotently (get or create)
 * - Creating examples with deterministic IDs for idempotent operations
 * - Running real OpenAI experiments using the wrapped client
 * - Using ExperimentContext to link traces to dataset examples
 * - Automatic trace submission via OpenTelemetry (no manual run ingestion!)
 *
 * ## Key Differences from RecordExperimentExample
 * - Uses wrapped OpenAI client for **real** LLM calls (not mocked)
 * - **No manual session creation** - project name in OTel config acts as the session
 * - **No manual run ingestion** - OpenTelemetry automatically sends traces to LangSmith
 * - Uses ExperimentContext to link traces to dataset examples automatically
 *
 * ## Prerequisites
 * Set these environment variables before running:
 * - `LANGSMITH_API_KEY`: Your LangSmith API key
 * - `OPENAI_API_KEY`: Your OpenAI API key
 *
 * ## Running
 * ```bash
 * ./gradlew :langsmith-java-example:run -Pexample=RunExperiment
 * ```
 */

/**
 * Generate a deterministic UUID v5 based on namespace and name.
 * This ensures idempotent example creation - the same inputs always generate the same ID.
 */
fun generateUuid5ForExperiment(namespace: UUID, name: String): UUID {
    val nameBytes = name.toByteArray(StandardCharsets.UTF_8)
    val namespaceBytes = ByteArray(16)

    // Convert namespace UUID to bytes
    val bb = java.nio.ByteBuffer.wrap(namespaceBytes)
    bb.putLong(namespace.mostSignificantBits)
    bb.putLong(namespace.leastSignificantBits)

    // Combine namespace and name
    val combined = namespaceBytes + nameBytes

    // Hash using SHA-1 (UUID v5 uses SHA-1)
    val digest = MessageDigest.getInstance("SHA-1")
    val hash = digest.digest(combined)

    // Take first 16 bytes and set version/variant bits
    hash[6] = ((hash[6].toInt() and 0x0F) or 0x50).toByte() // Version 5
    hash[8] = ((hash[8].toInt() and 0x3F) or 0x80).toByte() // Variant

    // Convert to UUID
    val bb2 = java.nio.ByteBuffer.wrap(hash, 0, 16)
    return UUID(bb2.long, bb2.long)
}

/**
 * Generate a deterministic example ID based on dataset ID, inputs, and reference outputs.
 */
fun generateExampleIdForExperiment(datasetId: String, inputs: Map<String, Any>, referenceOutputs: Map<String, Any>): String {
    // Use DNS namespace UUID as per UUID v5 spec
    val namespace = UUID.fromString("6ba7b810-9dad-11d1-80b4-00c04fd430c8")

    // Create a stable string representation
    val inputsJson = inputs.entries.sortedBy { it.key }.joinToString(",") { "${it.key}:${it.value}" }
    val outputsJson = referenceOutputs.entries.sortedBy { it.key }.joinToString(",") { "${it.key}:${it.value}" }
    val name = "$datasetId-$inputsJson-$outputsJson"

    return generateUuid5ForExperiment(namespace, name).toString()
}

/**
 * Constructs the web URL for a dataset from the API base URL.
 */
private fun buildDatasetUrlForExperiment(dataset: Dataset): String {
    val baseUrl = System.getenv("LANGCHAIN_BASE_URL") ?: "https://api.smith.langchain.com"
    val hostUrl = baseUrl.replace("api.", "")
    return "$hostUrl/o/${dataset.tenantId()}/datasets/${dataset.id()}"
}

/**
 * Constructs the web URL for a session/experiment from the API base URL.
 */
private fun buildSessionUrlForExperiment(tenantId: String, sessionId: String): String {
    val baseUrl = System.getenv("LANGCHAIN_BASE_URL") ?: "https://api.smith.langchain.com"
    val hostUrl = baseUrl.replace("api.", "")
    return "$hostUrl/o/$tenantId/projects/p/$sessionId"
}

/**
 * Simple Q&A agent that uses OpenAI to answer questions.
 */
class SimpleQAAgent(private val client: WrappedOpenAIClient, private val model: ChatModel = ChatModel.GPT_4O_MINI) {

    /**
     * Answer a question using OpenAI.
     * The wrapped client automatically creates OpenTelemetry spans that are sent to LangSmith.
     */
    fun answer(question: String): String {
        val params = ChatCompletionCreateParams.builder()
            .model(model)
            .addUserMessage(question)
            .temperature(0.0)  // Use 0 for more deterministic outputs
            .build()

        val completion: ChatCompletion = client.chat().completions().create(params)
        return completion.choices()[0].message().content().orElse("No response")
    }
}

fun main() {
    println("=".repeat(60))
    println("LangSmith Real Experiment Example (with OpenAI)")
    println("=".repeat(60))
    println()

    // Check required environment variables
    val langsmithApiKey = System.getenv("LANGSMITH_API_KEY")
    if (langsmithApiKey.isNullOrEmpty()) {
        System.err.println("✗ Error: LANGSMITH_API_KEY environment variable is required")
        System.err.println("  Please set your LangSmith API key to run experiments")
        return
    }

    val openaiApiKey = System.getenv("OPENAI_API_KEY")
    if (openaiApiKey.isNullOrEmpty()) {
        System.err.println("✗ Error: OPENAI_API_KEY environment variable is required")
        System.err.println("  Please set your OpenAI API key to run the agent")
        return
    }

    // Configure LangSmith client first (needed to create session)
    val langsmithClient: LangsmithClient = LangsmithOkHttpClient.fromEnv()

    val datasetName = "Q&A Evaluation Dataset - Java Example"
    val experimentName = "Q&A Experiment - Java"

    // Define test cases with questions and expected answers
    println("Defining test cases...")
    val testCases = listOf(
        mapOf(
            "question" to "What is the capital of France?",
            "expected_answer" to "Paris"
        ),
        mapOf(
            "question" to "What is 2 + 2?",
            "expected_answer" to "4"
        ),
        mapOf(
            "question" to "Who wrote Romeo and Juliet?",
            "expected_answer" to "William Shakespeare"
        ),
        mapOf(
            "question" to "What is the largest planet in our solar system?",
            "expected_answer" to "Jupiter"
        )
    )
    println("   ✓ Defined ${testCases.size} test cases")
    println()

    // 1. Get or create dataset (idempotent)
    println("1. Getting or creating dataset '$datasetName'...")
    val listParams = DatasetListParams.builder()
        .name(datasetName)
        .build()
    val existingDatasets = langsmithClient.datasets().list(listParams)

    val dataset = if (existingDatasets.isNotEmpty()) {
        val existing = existingDatasets[0]
        println("   ✓ Found existing dataset (ID: ${existing.id()})")
        existing
    } else {
        val createParams = DatasetCreateParams.builder()
            .name(datasetName)
            .description("Dataset for Q&A evaluation with real OpenAI experiments.")
            .build()
        val created = langsmithClient.datasets().create(createParams)
        println("   ✓ Created new dataset (ID: ${created.id()})")
        created
    }
    println("   → View dataset: ${buildDatasetUrlForExperiment(dataset)}")
    println()

    // 2. Create examples from test cases (idempotent with deterministic IDs)
    println("2. Creating dataset examples from test cases...")
    val exampleBodies = testCases.map { testCase ->
        val input = mapOf("question" to testCase["question"]!!)
        val referenceOutput = mapOf("answer" to testCase["expected_answer"]!!)

        // Generate deterministic ID for idempotent creation
        val exampleId = generateExampleIdForExperiment(dataset.id(), input, referenceOutput)

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

    val createdExamples = langsmithClient.examples().bulk().create(bulkCreateParams)
    println("   ✓ Created/updated ${createdExamples.size} examples with deterministic IDs")
    println()

    // 3. Create or get experiment session linked to the dataset
    println("3. Creating experiment session linked to dataset...")
    val sessionListParams = com.langchain.smith.models.sessions.SessionListParams.builder()
        .name(experimentName)
        .referenceDataset(listOf(dataset.id()))
        .build()
    val existingSessions = langsmithClient.sessions().list(sessionListParams).toList()

    // Handle both TracerSession (from list) and TracerSessionWithoutVirtualFields (from create)
    val sessionName: String
    val sessionId: String
    val sessionTenantId: String

    if (existingSessions.isNotEmpty()) {
        val existing = existingSessions[0]
        sessionName = existing.name().orElse(experimentName)
        sessionId = existing.id()
        sessionTenantId = existing.tenantId()
        println("   ✓ Found existing session: $sessionName")
    } else {
        val sessionParams = com.langchain.smith.models.sessions.SessionCreateParams.builder()
            .name(experimentName)
            .description("Experiment session for Q&A evaluation using OpenAI")
            .referenceDatasetId(dataset.id())  // Link session to dataset
            .build()
        val created = langsmithClient.sessions().create(sessionParams)
        sessionName = created.name().orElse(experimentName)
        sessionId = created.id()
        sessionTenantId = created.tenantId()
        println("   ✓ Created new session: $sessionName")
    }
    println("   ✓ Session linked to dataset for experiments tab")
    println()

    // 4. Configure OpenTelemetry to send traces to this session
    println("4. Configuring OpenTelemetry for LangSmith...")
    println("   Session: $sessionName")
    OpenTelemetryConfig.configureForLangSmith(
        langsmithApiKey,
        sessionName,  // Use the session name so traces go to the right project
        null, // service name (uses default)
        null, // endpoint (uses default from LANGCHAIN_BASE_URL)
        OpenTelemetryConfig.SpanProcessorType.SIMPLE, // Use SIMPLE for immediate export
        1  // batch size of 1 for immediate export
    )
    println("   ✓ OpenTelemetry configured")
    println()

    // 5. Create wrapped OpenAI client
    val openaiClient: WrappedOpenAIClient = OpenAIWrappers.wrapFromEnv()

    // 6. Run experiments: Execute agent against each test case
    println("5. Running experiments with OpenAI agent...")
    println("   Each LLM call will automatically create a trace in LangSmith")
    println("   linked to the corresponding dataset example.")
    println()

    val agent = SimpleQAAgent(openaiClient)

    createdExamples.forEachIndexed { index, example ->
        val testCase = testCases[index]
        val question = testCase["question"] as String
        val expectedAnswer = testCase["expected_answer"] as String

        println("   Test ${index + 1}/${testCases.size}: \"$question\"")
        println("      Expected: $expectedAnswer")

        try {
            // Use try-with-resources to automatically manage context lifecycle
            // This is the recommended pattern - context is automatically cleared when done
            ExperimentContext.withExperiment(example.id(), dataset.id(), sessionId).use {
                // Run the agent - the wrapped OpenAI client will automatically:
                // 1. Create OpenTelemetry spans for the LLM call
                // 2. Include reference_example_id, dataset_id, and session_id from ExperimentContext
                // 3. Send the spans to LangSmith via the configured OTLP exporter
                // 4. Link the run to the experiment session (appears in Experiments tab!)
                val actualAnswer = agent.answer(question)

                println("      Actual:   $actualAnswer")
                println("      → Trace sent to LangSmith and linked to experiment")
            } // Context automatically cleared here

        } catch (e: Exception) {
            println("      ✗ Error: ${e.message}")
        }
        println()
    }

    println("   ✓ Completed ${createdExamples.size} experiment runs")
    println()

    // Close clients and flush traces
    openaiClient.close()

    // Force flush to ensure all spans are exported to LangSmith
    println("6. Flushing traces to LangSmith...")
    val flushed = OpenTelemetryConfig.flush(10, java.util.concurrent.TimeUnit.SECONDS)
    if (!flushed) {
        System.err.println("   ✗ Warning: Flush did not complete successfully")
        System.err.println("      Some traces may not have been sent to LangSmith")
    } else {
        println("   ✓ All traces flushed successfully")
    }
    println()

    // Summary
    println("=".repeat(60))
    println("Experiment Complete!")
    println("=".repeat(60))
    println()
    println("What happened:")
    println("  • Dataset: $datasetName with ${createdExamples.size} examples")
    println("  • Session: $sessionName linked to dataset")
    println("  • Experiment: ${testCases.size} runs with real OpenAI calls")
    println("  • Each run includes:")
    println("    - Input question from the dataset")
    println("    - Reference/expected answer")
    println("    - Actual answer from OpenAI (gpt-4o-mini)")
    println("    - Complete OpenTelemetry trace automatically sent to LangSmith")
    println("    - Link to the dataset example via reference_example_id")
    println()
    println("How it works:")
    println("  1. Create a session linked to the dataset (via reference_dataset_id)")
    println("  2. Configure OpenTelemetry to send traces to that session")
    println("  3. Use ExperimentContext to link each trace to its dataset example")
    println("  4. WrappedOpenAIClient automatically creates and exports traces")
    println("  5. Experiment appears in dataset's 'Experiments' tab!")
    println()
    println("Next steps:")
    println("  1. View your experiment in LangSmith:")
    println("     ${buildSessionUrlForExperiment(sessionTenantId, sessionId)}")
    println()
    println("  2. View the dataset and experiments tab:")
    println("     ${buildDatasetUrlForExperiment(dataset)}")
    println()
    println("  3. In the LangSmith UI, you can:")
    println("     - Compare actual answers vs expected answers side-by-side")
    println("     - Add LLM-as-judge evaluators to automatically score quality")
    println("     - View detailed traces of each OpenAI call")
    println("     - Analyze token usage and latency metrics")
    println()
    println("  4. Run this example again:")
    println("     - Runs will be added to the same session")
    println("     - Dataset, session, and examples are reused (idempotent)")
    println("     - You can compare results across multiple experiment runs")
    println()
}

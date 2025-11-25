package com.langchain.smith.example

import com.langchain.smith.client.LangsmithClient
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.datasets.DatasetCreateParams
import com.langchain.smith.models.datasets.DatasetListParams
import com.langchain.smith.models.examples.bulk.BulkCreateParams
import com.langchain.smith.wrappers.openai.ExperimentContext
import com.langchain.smith.wrappers.openai.OpenTelemetryConfig
import com.langchain.smith.wrappers.openai.WrappedOpenAIClient
import com.openai.models.ChatModel
import com.openai.models.chat.completions.ChatCompletion
import com.openai.models.chat.completions.ChatCompletionCreateParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter

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
    if (System.getenv("LANGSMITH_API_KEY").isNullOrEmpty()) {
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
    val experimentName = "E2eEvalExample-${OffsetDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"))}"

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

    val dataset = if (existingDatasets.items().isNotEmpty()) {
        val existing = existingDatasets.items()[0]
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
    println("   → View dataset: ${buildDatasetUrl(dataset)}")
    println()

    // 2. Create examples from test cases (idempotent with deterministic IDs)
    println("2. Creating dataset examples from test cases...")
    val exampleBodies = testCases.map { testCase ->
        val input = mapOf("question" to testCase["question"]!!)
        val referenceOutput = mapOf("answer" to testCase["expected_answer"]!!)

        // Generate deterministic ID for idempotent creation
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

    val createdExamples = langsmithClient.examples().bulk().create(bulkCreateParams)
    println("   ✓ Created/updated ${createdExamples.size} examples with deterministic IDs")
    println()

    // 3. Create experiment session linked to the dataset
    // Each run creates a new session with a unique timestamped name
    println("3. Creating experiment session linked to dataset...")
    val sessionParams = com.langchain.smith.models.sessions.SessionCreateParams.builder()
        .name(experimentName)
        .description("Experiment session for Q&A evaluation using OpenAI")
        .referenceDatasetId(dataset.id())  // Link session to dataset - critical for Experiments tab
        .build()
    val created = langsmithClient.sessions().create(sessionParams)
    val sessionId = created.id()
    val sessionTenantId = created.tenantId()
    println("   ✓ Created experiment session: ${created.name()}")
    println("   ✓ Session ID: $sessionId")
    println("   ✓ Session linked to dataset")
    println()

    // 4. Configure OpenTelemetry to send traces to LangSmith
    // Initializes global OpenTelemetry SDK for automatic trace collection (return value not needed)
    println("4. Configuring OpenTelemetry for LangSmith...")
    OpenTelemetryConfig.builder()
        .processorType(OpenTelemetryConfig.SpanProcessorType.SIMPLE)
        .build()
    println("   ✓ OpenTelemetry configured to send traces with session_id attribute")
    println()

    // 5. Create wrapped OpenAI client
    // The wrapped client automatically creates OpenTelemetry spans for each LLM call
    val openaiClient: WrappedOpenAIClient = WrappedOpenAIClient.fromEnv()

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
            // Attach example and session id to experiment run.
            ExperimentContext.withExperiment(example.id(), sessionId).use {
                // Run the agent - the wrapped OpenAI client will automatically:
                // 1. Create OpenTelemetry spans for the LLM call
                // 2. Include reference_example_id and session_id from ExperimentContext
                // 3. Send the spans to LangSmith via the configured OTLP exporter
                // 4. Link the run to the experiment session (appears in Experiments tab!)
                val actualAnswer = agent.answer(question)

                println("      Actual:   $actualAnswer")
                println("      → Trace sent to LangSmith and linked to experiment")
            }

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
    println("  • Session: $experimentName linked to dataset (aka. experiement)")
    println("  • Each run includes:")
    println("    - Input question from the dataset")
    println("    - Reference/expected answer")
    println("    - Actual answer from OpenAI")
    println("    - Complete OpenTelemetry trace automatically sent to LangSmith and linked to dataset")
    println()
    println("How it works:")
    println("  1. Create/find a session linked to the dataset (via reference_dataset_id)")
    println("  2. Configure OpenTelemetry")
    println("  3. Use ExperimentContext.withExperiment() to link the experiment run to the dataset/example")
    println("  4. WrappedOpenAIClient automatically creates and exports traces with proper linkage")
    println("  5. Experiment appears in dataset's 'Experiments' tab!")
    println()
    println("Next steps:")
    println("  1. View the dataset and experiments tab:")
    println("     ${buildDatasetUrl(dataset)}")
    println()
    println("  2. In the LangSmith UI, you can:")
    println("     - Compare actual answers vs expected answers side-by-side")
    println("     - Add LLM-as-judge evaluators to automatically evaluate your experiments")
    println("     - View detailed traces of each OpenAI call")
    println("     - Analyze token usage and latency metrics")
    println("     - Much more...")
    println()
    println("  3. Run this example again:")
    println("     - A new experiment session will be created with a unique timestamp")
    println("     - Dataset and examples are reused (idempotent)")
    println("     - Each run appears as a separate experiment in the Experiments tab of the dataset")
    println("     - You can compare results across multiple experiment runs")
    println()
}

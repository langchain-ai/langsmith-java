package com.langchain.smith.example

import com.fasterxml.jackson.databind.json.JsonMapper
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.runs.Run
import com.sun.net.httpserver.HttpExchange
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import java.util.concurrent.ConcurrentLinkedQueue
import java.util.concurrent.Executors
import java.util.concurrent.atomic.AtomicInteger

/**
 * Small local smoke test for automatic run batching.
 *
 * This starts a local HTTP server, points the SDK at it, creates several runs through
 * `client.runs().create(...)`, flushes, and prints the captured requests. No LangSmith API key or
 * network access is required.
 *
 * Run with:
 * ```bash
 * ./gradlew :langsmith-java-example:run -Pexample=BatchTracing
 * ```
 */
fun main() {
    val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
    val requests = ConcurrentLinkedQueue<CapturedRequest>()
    val batchRequests = AtomicInteger(0)
    val singleRunRequests = AtomicInteger(0)

    server.createContext("/") { exchange ->
        val body = exchange.requestBody.bufferedReader().use { it.readText() }
        val captured = CapturedRequest(exchange.requestMethod, exchange.requestURI.path, body)
        requests.add(captured)

        when (exchange.requestURI.path) {
            "/runs/batch" -> batchRequests.incrementAndGet()
            "/runs" -> singleRunRequests.incrementAndGet()
        }

        exchange.respond(200, "{}")
    }
    server.executor = Executors.newCachedThreadPool()
    server.start()

    val baseUrl = "http://127.0.0.1:${server.address.port}"
    val client =
        LangsmithOkHttpClient.builder()
            .baseUrl(baseUrl)
            .apiKey("test-key")
            .autoBatchTracing(true)
            .maxRetries(0)
            .build()

    try {
        println("Local capture server: $baseUrl")
        println("Creating 5 runs via client.runs().create(...)")

        repeat(5) { index -> client.runs().create(testRun(index + 1)) }

        println("Flushing auto-batch queue")
        client.runs().flush()

        val batches = requests.filter { it.path == "/runs/batch" }
        val singleRuns = requests.filter { it.path == "/runs" }
        val totalPostOps = batches.sumOf { it.postOperationCount() }

        println()
        println("Captured HTTP requests:")
        requests.forEachIndexed { index, request ->
            println("${index + 1}. ${request.method} ${request.path} (${request.body.length} bytes)")
        }

        println()
        println("Batch endpoint requests: ${batchRequests.get()}")
        println("Single-run endpoint requests: ${singleRunRequests.get()}")
        println("Run create operations inside batch payload(s): $totalPostOps")

        check(batchRequests.get() == 1) { "Expected exactly 1 /runs/batch request" }
        check(singleRunRequests.get() == 0) { "Expected 0 /runs single-run requests" }
        check(totalPostOps == 5) { "Expected 5 post operations in the batch payload" }

        println()
        println("OK: auto batching is working")
    } finally {
        client.close()
        server.stop(0)
    }
}

private fun testRun(index: Int): Run {
    val id = UUID.randomUUID().toString()
    val now = OffsetDateTime.now()
    val dottedOrder = now.format(DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmssSSSSSS'Z'")) + id

    return Run.builder()
        .id(id)
        .traceId(id)
        .dottedOrder(dottedOrder)
        .name("batch-smoke-test-$index")
        .runType(Run.RunType.CHAIN)
        .startTime(now.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME))
        .inputs(
            Run.Inputs.builder()
                .putAdditionalProperty("input", JsonValue.from("hello-$index"))
                .build()
        )
        .build()
}

private data class CapturedRequest(val method: String, val path: String, val body: String) {
    fun postOperationCount(): Int {
        val root = JsonMapper.builder().build().readTree(body)
        return root.get("post")?.size() ?: 0
    }
}

private fun HttpExchange.respond(status: Int, body: String) {
    val bytes = body.toByteArray(Charsets.UTF_8)
    responseHeaders.add("Content-Type", "application/json")
    sendResponseHeaders(status, bytes.size.toLong())
    responseBody.use { it.write(bytes) }
}

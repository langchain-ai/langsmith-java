package com.langchain.smith.sandbox

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.Sleeper
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.HttpClient
import com.langchain.smith.core.http.HttpRequest
import com.langchain.smith.core.http.HttpResponse
import java.io.ByteArrayOutputStream
import java.io.InputStream
import java.io.SequenceInputStream
import java.time.Duration
import java.util.Collections
import java.util.concurrent.CompletableFuture

/** A request the client sent, with its body captured before it was consumed. */
class RecordedRequest(
    val url: String,
    val bodyBytes: ByteArray,
    /** What the body promised, so a contentLength disagreeing with writeTo is visible. */
    val declaredContentLength: Long,
) {
    val body: String
        get() = String(bodyBytes, Charsets.UTF_8)
}

/** Serves canned responses in order and records what was asked for. */
class FakeHttpClient(private val responses: MutableList<FakeResponse>) : HttpClient {

    val requests: MutableList<RecordedRequest> = mutableListOf()

    override fun execute(request: HttpRequest, requestOptions: RequestOptions): HttpResponse {
        val body = ByteArrayOutputStream().also { request.body?.writeTo(it) }.toByteArray()
        requests.add(RecordedRequest(request.url(), body, request.body?.contentLength() ?: -1L))

        check(responses.isNotEmpty()) { "unexpected request to ${request.url()}" }
        return responses.removeAt(0).toHttpResponse()
    }

    override fun executeAsync(
        request: HttpRequest,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        CompletableFuture.completedFuture(execute(request, requestOptions))

    override fun close() {}

    /** True once every queued response has been served. */
    fun isDrained(): Boolean = responses.isEmpty()
}

class FakeResponse(
    private val statusCode: Int,
    private val body: ByteArray,
    private val throwAfterBody: Boolean,
) {

    fun toHttpResponse(): HttpResponse =
        object : HttpResponse {
            private val stream: InputStream =
                if (throwAfterBody) {
                    SequenceInputStream(
                        Collections.enumeration(listOf(body.inputStream(), ThrowingInputStream()))
                    )
                } else {
                    body.inputStream()
                }

            override fun statusCode(): Int = statusCode

            override fun headers(): Headers = Headers.builder().build()

            override fun body(): InputStream = stream

            override fun close() {}
        }

    companion object {

        /** An event stream that ends cleanly after [events]. */
        fun sse(vararg events: String): FakeResponse =
            FakeResponse(200, events.joinToString("").toByteArray(), throwAfterBody = false)

        /** An event stream whose connection breaks after [events]. */
        fun brokenSse(vararg events: String): FakeResponse =
            FakeResponse(200, events.joinToString("").toByteArray(), throwAfterBody = true)

        fun error(statusCode: Int, body: String): FakeResponse =
            FakeResponse(statusCode, body.toByteArray(), throwAfterBody = false)

        /** An ordinary response with an exact body, for the non-streaming endpoints. */
        fun raw(statusCode: Int, body: ByteArray): FakeResponse =
            FakeResponse(statusCode, body, throwAfterBody = false)
    }
}

private class ThrowingInputStream : InputStream() {
    override fun read(): Int = throw java.io.IOException("connection reset")
}

/** A [Sleeper] that records requested delays instead of waiting. */
class RecordingSleeper : Sleeper {

    val slept: MutableList<Duration> = mutableListOf()

    override fun sleep(duration: Duration) {
        slept.add(duration)
    }

    override fun sleepAsync(duration: Duration): CompletableFuture<Void> {
        slept.add(duration)
        return CompletableFuture.completedFuture(null)
    }

    override fun close() {}
}

/** Collects everything a stream delivers, so tests can assert on ordering and bytes. */
class CapturingHandler : ExecOutputHandler {

    val stdout = ByteArrayOutputStream()
    val stderr = ByteArrayOutputStream()
    val startedCommandIds: MutableList<String> = mutableListOf()
    val startedPids: MutableList<Int> = mutableListOf()

    override fun onStarted(commandId: String, pid: Int) {
        startedCommandIds.add(commandId)
        startedPids.add(pid)
    }

    override fun onStdout(chunk: ByteArray) {
        stdout.write(chunk)
    }

    override fun onStderr(chunk: ByteArray) {
        stderr.write(chunk)
    }

    fun stdoutString(): String = stdout.toString("UTF-8")

    fun stderrString(): String = stderr.toString("UTF-8")
}

/** Builds a single SSE frame in the sandbox's wire format. */
fun sseEvent(name: String, data: String): String = "event: $name\ndata: $data\n\n"

fun startedEvent(commandId: String = "cmd-1", pid: Int = 42): String =
    sseEvent("started", """{"command_id":"$commandId","pid":$pid,"stdin_received":0}""")

fun outputEvent(stream: String, offset: Long, data: ByteArray): String =
    sseEvent(
        stream,
        """{"offset":$offset,"data":"${java.util.Base64.getEncoder().encodeToString(data)}"}""",
    )

fun outputEvent(stream: String, offset: Long, data: String): String =
    outputEvent(stream, offset, data.toByteArray())

fun exitEvent(exitCode: Int): String = sseEvent("exit", """{"exit_code":$exitCode}""")

fun ackRequiredEvent(stdoutOffset: Long, stderrOffset: Long): String =
    sseEvent("ack_required", """{"stdout_offset":$stdoutOffset,"stderr_offset":$stderrOffset}""")

fun errorEvent(errorType: String, message: String): String =
    sseEvent("error", """{"error":"$message","error_type":"$errorType"}""")

fun streamEndEvent(stream: String, offset: Long): String =
    sseEvent("stream_end", """{"stream":"$stream","offset":$offset}""")

/** Client options wired to [httpClient], with SDK-level retries off so tests see each attempt. */
fun testClientOptions(
    httpClient: HttpClient,
    sleeper: Sleeper = RecordingSleeper(),
): ClientOptions =
    ClientOptions.builder()
        .httpClient(httpClient)
        .baseUrl("https://api.example.com")
        .apiKey("test-key")
        .maxRetries(0)
        .sleeper(sleeper)
        .checkJacksonVersionCompatibility(false)
        .build()

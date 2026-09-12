package com.langchain.smith.sandbox

import com.fasterxml.jackson.databind.JsonNode
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpMethod
import com.langchain.smith.core.http.HttpRequest
import com.langchain.smith.errors.LangChainIoException
import java.io.IOException
import java.util.UUID

/**
 * Drives one command from start to exit over the sandbox's exec event stream.
 *
 * The transport is one-way, so the sandbox ends the response with `ack_required` as soon as its
 * bounded output buffer needs an ack. Resuming with the offsets reached so far both acks everything
 * below them and continues the stream, which is why a single command normally spans several
 * requests.
 *
 * A dropped connection resumes the same way — always, even when nothing arrived and the offsets are
 * still zero. Repeating the start instead would run the command a second time whenever the sandbox
 * no longer holds it, so a command the sandbox has forgotten is surfaced as a failure rather than
 * silently re-executed.
 */
internal class SandboxExecStream(
    private val http: SandboxHttp,
    private val config: SandboxExecConfig,
    private val sandboxId: String,
    request: ExecRequest,
    private val handler: ExecOutputHandler,
    private val requestOptions: RequestOptions,
) {

    private val commandId: String = request.commandId().orElseGet { UUID.randomUUID().toString() }
    private val startRequest: ExecRequest = request.withCommandId(commandId)

    private var stdoutOffset = 0L
    private var stderrOffset = 0L
    private var startSent = false
    private var progressed = false

    fun run(): ExecResult {
        var reconnects = 0
        while (true) {
            val outcome =
                try {
                    attempt()
                } catch (e: LangChainIoException) {
                    Outcome.Retry(e)
                } catch (e: IOException) {
                    Outcome.Retry(e)
                }

            when (outcome) {
                is Outcome.Exited -> return ExecResult(commandId, outcome.exitCode)
                // The buffer filled because output was delivered: resuming is the ack, and is
                // ordinary flow rather than failure, so it neither waits nor spends the budget.
                // An ack that advanced nothing is indistinguishable from a sandbox stuck asking
                // for the same one, so it is charged like a failed attempt rather than reissued
                // immediately forever.
                is Outcome.AckRequired ->
                    if (progressed) {
                        reconnects = 0
                    } else {
                        reconnects = chargeAttempt(reconnects, null)
                    }
                is Outcome.Retry -> {
                    if (progressed) {
                        reconnects = 0
                    }
                    reconnects = chargeAttempt(reconnects, outcome.cause)
                }
            }
        }
    }

    /** Spends one reconnect and waits, or gives up once the budget is gone. */
    private fun chargeAttempt(reconnects: Int, cause: Throwable?): Int {
        if (reconnects >= config.maxReconnects) {
            throw SandboxStreamInterruptedException(
                "exec stream for command $commandId was interrupted and could not be resumed" +
                    " after ${config.maxReconnects} attempts",
                cause,
            )
        }
        http.sleeper.sleep(config.backoff(reconnects + 1))
        return reconnects + 1
    }

    private fun attempt(): Outcome {
        progressed = false
        val httpRequest =
            if (startSent) {
                resumeHttpRequest()
            } else {
                startSent = true
                startHttpRequest()
            }
        http.httpClient.execute(httpRequest, requestOptions).use { response ->
            // Specific to streaming, so it is not part of the shared status mapping.
            if (response.statusCode() == 409) {
                throw SandboxCommandNotStreamableException(http.messageFor(response))
            }
            http.requireOk(response)
            SseReader(response.body()).use { reader ->
                return consume(reader)
            }
        }
    }

    private fun consume(reader: SseReader): Outcome {
        while (true) {
            // A stream that ends without a terminal event lost its connection; resume from the
            // offsets reached so far.
            val event = reader.next() ?: return Outcome.Retry(null)

            when (event.name) {
                EVENT_STARTED -> {
                    val payload = parse(event)
                    handler.onStarted(
                        payload.path("command_id").asText(commandId),
                        payload.path("pid").asInt(0),
                    )
                }
                EVENT_STDOUT ->
                    deliver(parse(event), stdoutOffset, handler::onStdout) { stdoutOffset = it }
                EVENT_STDERR ->
                    deliver(parse(event), stderrOffset, handler::onStderr) { stderrOffset = it }
                // EOF for one stream, followed by "exit". Reported again at the same offset
                // on every resume from that offset, so it must stay a no-op: nothing here is
                // closed on EOF, and the exit code is what callers act on.
                EVENT_STREAM_END -> {}
                EVENT_EXIT -> return Outcome.Exited(parse(event).path("exit_code").asInt(0))
                // The reported offsets are where the sandbox stopped, and should equal what was
                // received. They are deliberately not adopted: one ahead of the cursor would skip
                // the bytes in between, and resuming from the cursor instead only costs a replay
                // that the overlap guard trims.
                EVENT_ACK_REQUIRED -> return Outcome.AckRequired
                EVENT_ERROR -> {
                    val payload = parse(event)
                    val errorType = payload.path("error_type").asText("UnknownError")
                    val message = payload.path("error").asText("")
                    // The sandbox is going away mid-command; the command survives, so resume.
                    if (errorType == ERROR_SERVER_SHUTTING_DOWN) {
                        return Outcome.Retry(null)
                    }
                    throw SandboxStreamErrorException(errorType, message)
                }
                // Unknown events are ignored so a newer sandbox can add them.
                else -> {}
            }
        }
    }

    private fun deliver(
        payload: JsonNode,
        cursor: Long,
        emit: (ByteArray) -> Unit,
        advance: (Long) -> Unit,
    ) {
        val offset = payload.path("offset").asLong(cursor)
        val data = binary(payload)
        val end = offset + data.size
        if (end <= cursor) {
            return
        }

        // A chunk starting past the cursor means the bytes in between were never delivered.
        // Accepting it would advance past the hole, so the range could never be re-requested and
        // the caller would get silently truncated output.
        if (offset > cursor) {
            throw SandboxProtocolException(
                "sandbox skipped output for command $commandId: expected the next chunk at" +
                    " offset $cursor but it started at $offset"
            )
        }

        // Defend against a replay overlapping what was already delivered: resuming from a cursor
        // the sandbox has already passed would otherwise duplicate those bytes in the output.
        val chunk =
            if (offset < cursor) data.copyOfRange((cursor - offset).toInt(), data.size) else data

        emit(chunk)
        advance(end)
        progressed = true
    }

    private fun startHttpRequest(): HttpRequest = streamRequest("start", startRequest.toBody())

    private fun resumeHttpRequest(): HttpRequest =
        streamRequest(
            "resume",
            mapOf(
                "command_id" to commandId,
                "stdout_offset" to stdoutOffset,
                "stderr_offset" to stderrOffset,
            ),
        )

    private fun streamRequest(action: String, body: Map<String, Any>): HttpRequest =
        http
            .request(HttpMethod.POST, sandboxId, "execute", "stream", action)
            .replaceHeaders("Accept", "text/event-stream")
            .body(http.jsonBody(body))
            .build()

    private fun parse(event: SseEvent): JsonNode = http.parse(event.data, "'${event.name}' event")

    private fun binary(payload: JsonNode): ByteArray {
        val data = payload.path("data")
        if (data.isMissingNode || data.isNull) {
            return ByteArray(0)
        }
        return try {
            data.binaryValue()
        } catch (e: IOException) {
            throw SandboxProtocolException("sandbox sent output that is not valid base64")
        }
    }

    private sealed class Outcome {
        class Exited(val exitCode: Int) : Outcome()

        object AckRequired : Outcome()

        class Retry(val cause: Throwable?) : Outcome()
    }

    private companion object {
        const val EVENT_STARTED = "started"
        const val EVENT_STDOUT = "stdout"
        const val EVENT_STDERR = "stderr"
        const val EVENT_STREAM_END = "stream_end"
        const val EVENT_EXIT = "exit"
        const val EVENT_ACK_REQUIRED = "ack_required"
        const val EVENT_ERROR = "error"
        const val ERROR_SERVER_SHUTTING_DOWN = "ServerShuttingDown"
    }
}

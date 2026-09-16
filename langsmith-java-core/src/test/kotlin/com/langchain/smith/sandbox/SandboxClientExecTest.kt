package com.langchain.smith.sandbox

import com.fasterxml.jackson.databind.ObjectMapper
import java.time.Duration
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

internal class SandboxClientExecTest {

    private val mapper = ObjectMapper()

    private fun clientFor(
        vararg responses: FakeResponse,
        maxReconnects: Int = SandboxExecConfig.DEFAULT_MAX_RECONNECTS,
        maxOutputBytes: Long = SandboxExecConfig.DEFAULT_MAX_OUTPUT_BYTES,
        sleeper: RecordingSleeper = RecordingSleeper(),
    ): Pair<SandboxClient, FakeHttpClient> {
        val http = FakeHttpClient(responses.toMutableList())
        val client =
            SandboxClient.builder()
                .clientOptions(testClientOptions(http, sleeper))
                .maxReconnects(maxReconnects)
                .maxOutputBytes(maxOutputBytes)
                .build()
        return client to http
    }

    private fun bodyOf(request: RecordedRequest) = mapper.readTree(request.body)

    @Test
    fun `collects output and exit code from a single stream`() {
        val (client, http) =
            clientFor(
                FakeResponse.sse(
                    startedEvent(),
                    outputEvent("stdout", 0, "hello "),
                    outputEvent("stdout", 6, "world"),
                    outputEvent("stderr", 0, "warning"),
                    streamEndEvent("stdout", 11),
                    streamEndEvent("stderr", 7),
                    exitEvent(0),
                )
            )

        val result = client.run("sb-1", "echo hi")

        assertThat(result.exitCode).isEqualTo(0)
        assertThat(result.isSuccess()).isTrue()
        assertThat(result.stdoutString()).isEqualTo("hello world")
        assertThat(result.stderrString()).isEqualTo("warning")
        assertThat(http.requests).hasSize(1)
        assertThat(http.requests[0].url)
            .isEqualTo("https://api.example.com/api/v2/sandboxes/sb-1/execute/stream/start")
        assertThat(http.isDrained()).isTrue()
    }

    @Test
    fun `sends a generated command id on the start request`() {
        val (client, http) = clientFor(FakeResponse.sse(startedEvent(), exitEvent(0)))

        client.run("sb-1", "true")

        val commandId = bodyOf(http.requests[0]).get("command_id").asText()
        assertThat(commandId).isNotEmpty()
        assertThat(java.util.UUID.fromString(commandId)).isNotNull()
    }

    @Test
    fun `honours a caller-supplied command id`() {
        val (client, http) = clientFor(FakeResponse.sse(startedEvent(), exitEvent(0)))

        client.run("sb-1", ExecRequest.builder().command("true").commandId("caller-chosen").build())

        assertThat(bodyOf(http.requests[0]).get("command_id").asText()).isEqualTo("caller-chosen")
    }

    @Test
    fun `resumes from the acked offsets when the output buffer fills`() {
        val (client, http) =
            clientFor(
                FakeResponse.sse(
                    startedEvent(),
                    outputEvent("stdout", 0, "first"),
                    outputEvent("stderr", 0, "err"),
                    ackRequiredEvent(5, 3),
                ),
                FakeResponse.sse(startedEvent(), outputEvent("stdout", 5, "second"), exitEvent(0)),
            )

        val result = client.run("sb-1", "big-output")

        assertThat(result.stdoutString()).isEqualTo("firstsecond")
        assertThat(result.stderrString()).isEqualTo("err")
        assertThat(http.requests).hasSize(2)
        assertThat(http.requests[1].url)
            .isEqualTo("https://api.example.com/api/v2/sandboxes/sb-1/execute/stream/resume")

        val resume = bodyOf(http.requests[1])
        assertThat(resume.get("stdout_offset").asLong()).isEqualTo(5)
        assertThat(resume.get("stderr_offset").asLong()).isEqualTo(3)
        assertThat(resume.get("command_id").asText())
            .isEqualTo(bodyOf(http.requests[0]).get("command_id").asText())
    }

    @Test
    fun `an ack that delivered output does not consume the reconnect budget`() {
        // A real ack follows the output buffer filling, so it always carries bytes. Charging the
        // budget for those would cap how long a chatty command can run.
        val acks =
            (0 until 20).map {
                FakeResponse.sse(
                    startedEvent(),
                    outputEvent("stdout", it.toLong(), "x"),
                    ackRequiredEvent(it + 1L, 0),
                )
            }
        val (client, http) =
            clientFor(
                *(acks + FakeResponse.sse(startedEvent(), exitEvent(7))).toTypedArray(),
                maxReconnects = 1,
            )

        val result = client.run("sb-1", "chatty")

        assertThat(result.exitCode).isEqualTo(7)
        assertThat(result.stdoutString()).isEqualTo("x".repeat(20))
        assertThat(http.requests).hasSize(21)
    }

    @Test
    fun `gives up on an ack chain that never advances`() {
        val sleeper = RecordingSleeper()
        // A sandbox repeating the same ack with nothing new would otherwise spin the caller in a
        // tight request loop that never returns.
        val (client, http) =
            clientFor(
                *(0 until 8)
                    .map { FakeResponse.sse(startedEvent(), ackRequiredEvent(0, 0)) }
                    .toTypedArray(),
                maxReconnects = 2,
                sleeper = sleeper,
            )

        assertThatThrownBy { client.run("sb-1", "stuck") }
            .isInstanceOf(SandboxStreamInterruptedException::class.java)
            .hasMessageContaining("could not be resumed after 2 attempts")
        assertThat(http.requests).hasSize(3)
        // And it backs off rather than hammering the endpoint.
        assertThat(sleeper.slept).containsExactly(Duration.ofMillis(500), Duration.ofMillis(1000))
    }

    @Test
    fun `resumes after the connection breaks mid-stream`() {
        val sleeper = RecordingSleeper()
        val (client, http) =
            clientFor(
                FakeResponse.brokenSse(startedEvent(), outputEvent("stdout", 0, "partial")),
                FakeResponse.sse(startedEvent(), outputEvent("stdout", 7, "-rest"), exitEvent(0)),
                sleeper = sleeper,
            )

        val result = client.run("sb-1", "flaky")

        assertThat(result.stdoutString()).isEqualTo("partial-rest")
        assertThat(bodyOf(http.requests[1]).get("stdout_offset").asLong()).isEqualTo(7)
        assertThat(sleeper.slept).containsExactly(Duration.ofMillis(500))
    }

    @Test
    fun `resumes after the stream ends without a terminal event`() {
        val (client, http) =
            clientFor(
                FakeResponse.sse(startedEvent(), outputEvent("stdout", 0, "abc")),
                FakeResponse.sse(startedEvent(), exitEvent(0)),
            )

        assertThat(client.run("sb-1", "truncated").stdoutString()).isEqualTo("abc")
        assertThat(http.requests[1].url).endsWith("/execute/stream/resume")
    }

    @Test
    fun `retries with resume even when the stream broke before any output`() {
        val (client, http) =
            clientFor(
                FakeResponse.brokenSse(),
                FakeResponse.sse(startedEvent(), outputEvent("stdout", 0, "ok"), exitEvent(0)),
            )

        assertThat(client.run("sb-1", "retried").stdoutString()).isEqualTo("ok")
        // Repeating the start would re-run the command whenever the sandbox no longer holds it,
        // so a forgotten command must surface as a 404 rather than execute twice.
        assertThat(http.requests[1].url).endsWith("/execute/stream/resume")
        val resume = bodyOf(http.requests[1])
        assertThat(resume.get("command_id").asText())
            .isEqualTo(bodyOf(http.requests[0]).get("command_id").asText())
        assertThat(resume.get("stdout_offset").asLong()).isEqualTo(0)
    }

    @Test
    fun `surfaces a forgotten command rather than restarting it`() {
        val (client, _) =
            clientFor(
                FakeResponse.brokenSse(),
                FakeResponse.error(
                    404,
                    """{"detail":{"error":"CommandNotFound","message":"command not found"}}""",
                ),
            )

        assertThatThrownBy { client.run("sb-1", "lost") }
            .isInstanceOf(SandboxNotFoundException::class.java)
            .hasMessageContaining("CommandNotFound")
    }

    @Test
    fun `repeats a stream_end at the same offset without disturbing output`() {
        val (client, _) =
            clientFor(
                FakeResponse.sse(
                    startedEvent(),
                    outputEvent("stdout", 0, "done"),
                    streamEndEvent("stdout", 4),
                    ackRequiredEvent(4, 0),
                ),
                // A resume at a stream's final offset reports its end again.
                FakeResponse.sse(
                    startedEvent(),
                    streamEndEvent("stdout", 4),
                    streamEndEvent("stderr", 0),
                    exitEvent(0),
                ),
            )

        val result = client.run("sb-1", "ends-twice")

        assertThat(result.exitCode).isEqualTo(0)
        assertThat(result.stdoutString()).isEqualTo("done")
    }

    @Test
    fun `drops replayed bytes the caller already saw`() {
        val (client, _) =
            clientFor(
                FakeResponse.sse(startedEvent(), outputEvent("stdout", 0, "abcdef")),
                // The sandbox replays from offset 3 even though offset 6 was already delivered.
                FakeResponse.sse(startedEvent(), outputEvent("stdout", 3, "defghi"), exitEvent(0)),
            )

        assertThat(client.run("sb-1", "replayed").stdoutString()).isEqualTo("abcdefghi")
    }

    @Test
    fun `ignores a fully replayed chunk`() {
        val (client, _) =
            clientFor(
                FakeResponse.sse(startedEvent(), outputEvent("stdout", 0, "abcdef")),
                FakeResponse.sse(startedEvent(), outputEvent("stdout", 0, "abc"), exitEvent(0)),
            )

        assertThat(client.run("sb-1", "replayed").stdoutString()).isEqualTo("abcdef")
    }

    @Test
    fun `rejects output that starts past the cursor`() {
        val (client, _) =
            clientFor(
                FakeResponse.sse(
                    startedEvent(),
                    outputEvent("stdout", 0, "abc"),
                    // Offset 10 leaves bytes 3..9 undelivered. Accepting it would advance past the
                    // hole and hand the caller silently truncated output.
                    outputEvent("stdout", 10, "def"),
                )
            )

        assertThatThrownBy { client.run("sb-1", "gappy") }
            .isInstanceOf(SandboxProtocolException::class.java)
            .hasMessageContaining("expected the next chunk at offset 3 but it started at 10")
    }

    @Test
    fun `resumes from what it received rather than an ack offset ahead of it`() {
        val (client, http) =
            clientFor(
                // The ack claims 99 while only 5 bytes arrived; trusting it would skip 5..98.
                FakeResponse.sse(
                    startedEvent(),
                    outputEvent("stdout", 0, "first"),
                    ackRequiredEvent(99, 42),
                ),
                FakeResponse.sse(startedEvent(), outputEvent("stdout", 5, "-rest"), exitEvent(0)),
            )

        assertThat(client.run("sb-1", "lying-ack").stdoutString()).isEqualTo("first-rest")
        val resume = bodyOf(http.requests[1])
        assertThat(resume.get("stdout_offset").asLong()).isEqualTo(5)
        assertThat(resume.get("stderr_offset").asLong()).isEqualTo(0)
    }

    @Test
    fun `resumes when the sandbox reports it is shutting down`() {
        val (client, http) =
            clientFor(
                FakeResponse.sse(
                    startedEvent(),
                    outputEvent("stdout", 0, "before"),
                    errorEvent("ServerShuttingDown", "daemon is shutting down"),
                ),
                FakeResponse.sse(startedEvent(), outputEvent("stdout", 6, "-after"), exitEvent(0)),
            )

        assertThat(client.run("sb-1", "interrupted").stdoutString()).isEqualTo("before-after")
        assertThat(http.requests[1].url).endsWith("/execute/stream/resume")
    }

    @Test
    fun `raises a stream error for a terminal error event`() {
        val (client, _) =
            clientFor(
                FakeResponse.sse(
                    startedEvent(),
                    errorEvent("InvalidOffset", "stdout offset 99 is past the tail"),
                )
            )

        assertThatThrownBy { client.run("sb-1", "bad-offset") }
            .isInstanceOf(SandboxStreamErrorException::class.java)
            .hasMessageContaining("InvalidOffset")
            .hasMessageContaining("past the tail")
    }

    @Test
    fun `gives up after the reconnect budget is spent`() {
        val (client, http) =
            clientFor(
                FakeResponse.brokenSse(startedEvent()),
                FakeResponse.brokenSse(startedEvent()),
                FakeResponse.brokenSse(startedEvent()),
                maxReconnects = 2,
            )

        assertThatThrownBy { client.run("sb-1", "hopeless") }
            .isInstanceOf(SandboxStreamInterruptedException::class.java)
            .hasMessageContaining("could not be resumed after 2 attempts")
        assertThat(http.requests).hasSize(3)
    }

    @Test
    fun `progress refreshes the reconnect budget`() {
        // Each attempt delivers a byte before breaking, so the budget never runs down.
        val breaking =
            (0 until 6).map {
                FakeResponse.brokenSse(startedEvent(), outputEvent("stdout", it.toLong(), "x"))
            }
        val (client, http) =
            clientFor(
                *(breaking + FakeResponse.sse(startedEvent(), exitEvent(0))).toTypedArray(),
                maxReconnects = 1,
            )

        assertThat(client.run("sb-1", "slow-but-moving").stdoutString()).isEqualTo("xxxxxx")
        assertThat(http.requests).hasSize(7)
    }

    @Test
    fun `backs off exponentially up to the cap`() {
        val sleeper = RecordingSleeper()
        val (client, _) =
            clientFor(
                *(0 until 6).map { FakeResponse.brokenSse(startedEvent()) }.toTypedArray(),
                maxReconnects = 5,
                sleeper = sleeper,
            )

        assertThatThrownBy { client.run("sb-1", "hopeless") }
            .isInstanceOf(SandboxStreamInterruptedException::class.java)
        assertThat(sleeper.slept)
            .containsExactly(
                Duration.ofMillis(500),
                Duration.ofMillis(1000),
                Duration.ofMillis(2000),
                Duration.ofMillis(4000),
                Duration.ofSeconds(8),
            )
    }

    @Test
    fun `maps a 404 to a not-found failure`() {
        val (client, _) =
            clientFor(
                FakeResponse.error(
                    404,
                    """{"detail":{"error":"CommandNotFound","message":"command not found"}}""",
                )
            )

        assertThatThrownBy { client.run("sb-1", "gone") }
            .isInstanceOf(SandboxNotFoundException::class.java)
            .hasMessageContaining("CommandNotFound: command not found")
    }

    @Test
    fun `maps a 409 to a not-streamable failure`() {
        val (client, _) =
            clientFor(
                FakeResponse.error(
                    409,
                    """{"detail":{"error":"PTYUnsupported","message":"command was started with a PTY"}}""",
                )
            )

        assertThatThrownBy { client.run("sb-1", "pty") }
            .isInstanceOf(SandboxCommandNotStreamableException::class.java)
            .hasMessageContaining("PTYUnsupported")
    }

    @Test
    fun `surfaces an unmapped status with its body`() {
        val (client, _) = clientFor(FakeResponse.error(500, "upstream exploded"))

        assertThatThrownBy { client.run("sb-1", "boom") }
            .isInstanceOf(SandboxApiException::class.java)
            .hasMessageContaining("HTTP 500")
            .hasMessageContaining("upstream exploded")
    }

    @Test
    fun `raises a protocol failure for a malformed event`() {
        val (client, _) = clientFor(FakeResponse.sse(sseEvent("exit", "{not json")))

        assertThatThrownBy { client.run("sb-1", "garbled") }
            .isInstanceOf(SandboxProtocolException::class.java)
            .hasMessageContaining("malformed 'exit' event")
    }

    @Test
    fun `streams to a handler without buffering output`() {
        val (client, _) =
            clientFor(
                FakeResponse.sse(
                    startedEvent(commandId = "cmd-9", pid = 1234),
                    outputEvent("stdout", 0, "out"),
                    outputEvent("stderr", 0, "err"),
                    exitEvent(3),
                )
            )
        val handler = CapturingHandler()

        val result = client.stream("sb-1", ExecRequest.ofShell("noisy"), handler)

        assertThat(result.exitCode).isEqualTo(3)
        assertThat(result.isSuccess()).isFalse()
        assertThat(handler.stdoutString()).isEqualTo("out")
        assertThat(handler.stderrString()).isEqualTo("err")
        assertThat(handler.startedCommandIds).containsExactly("cmd-9")
        assertThat(handler.startedPids).containsExactly(1234)
    }

    @Test
    fun `preserves bytes that are not valid utf-8`() {
        val binary = byteArrayOf(0x00, 0xFF.toByte(), 0x7F, 0x80.toByte(), 0x0A)
        val (client, _) =
            clientFor(
                FakeResponse.sse(startedEvent(), outputEvent("stdout", 0, binary), exitEvent(0))
            )

        assertThat(client.run("sb-1", "cat binary").stdout()).isEqualTo(binary)
    }

    @Test
    fun `reports the exit code of a failed command`() {
        val (client, _) =
            clientFor(
                FakeResponse.sse(
                    startedEvent(),
                    outputEvent("stderr", 0, "not found"),
                    exitEvent(127),
                )
            )

        val result = client.run("sb-1", "nope")

        assertThat(result.exitCode).isEqualTo(127)
        assertThat(result.isSuccess()).isFalse()
        assertThat(result.stderrString()).isEqualTo("not found")
    }

    @Test
    fun `fails a collected command that exceeds the output cap`() {
        val (client, http) =
            clientFor(
                FakeResponse.sse(
                    startedEvent(),
                    outputEvent("stdout", 0, "0123456789"),
                    outputEvent("stdout", 10, "0123456789"),
                    exitEvent(0),
                ),
                maxOutputBytes = 15,
            )

        assertThatThrownBy { client.run("sb-1", "yes") }
            .isInstanceOf(SandboxOutputTooLargeException::class.java)
            .hasMessageContaining("more than 15 bytes")
            .hasMessageContaining("stream it without collecting")
        // It stops reading rather than draining the whole stream first.
        assertThat(http.requests).hasSize(1)
    }

    @Test
    fun `counts both streams against the output cap`() {
        // 10 bytes of stdout plus 10 of stderr is over a 15-byte budget even though neither is.
        val (client, _) =
            clientFor(
                FakeResponse.sse(
                    startedEvent(),
                    outputEvent("stdout", 0, "0123456789"),
                    outputEvent("stderr", 0, "0123456789"),
                    exitEvent(0),
                ),
                maxOutputBytes = 15,
            )

        assertThatThrownBy { client.run("sb-1", "noisy") }
            .isInstanceOf(SandboxOutputTooLargeException::class.java)
    }

    @Test
    fun `allows output exactly at the cap`() {
        val (client, _) =
            clientFor(
                FakeResponse.sse(
                    startedEvent(),
                    outputEvent("stdout", 0, "0123456789"),
                    exitEvent(0),
                ),
                maxOutputBytes = 10,
            )

        assertThat(client.run("sb-1", "exact").stdoutString()).isEqualTo("0123456789")
    }

    @Test
    fun `does not cap a streamed command`() {
        // stream() buffers nothing unless the caller asks it to, so it must not inherit run()'s
        // collecting limit.
        val (client, _) =
            clientFor(
                FakeResponse.sse(
                    startedEvent(),
                    outputEvent("stdout", 0, "0123456789"),
                    outputEvent("stdout", 10, "0123456789"),
                    exitEvent(0),
                ),
                maxOutputBytes = 5,
            )
        val handler = CapturingHandler()

        val result = client.stream("sb-1", ExecRequest.ofShell("yes"), handler)

        assertThat(result.exitCode).isEqualTo(0)
        assertThat(handler.stdoutString()).isEqualTo("01234567890123456789")
    }

    @Test
    fun `rejects a non-positive output cap`() {
        val builder = SandboxClient.builder()
        assertThatThrownBy { builder.maxOutputBytes(0) }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("maxOutputBytes must be positive")
        assertThatThrownBy { builder.maxOutputBytes(-1) }
            .isInstanceOf(IllegalArgumentException::class.java)
        assertThatThrownBy { CollectingHandler(0) }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("limitBytes must be positive")
    }

    @Test
    fun `rejects an output cap larger than can be collected`() {
        // An in-memory accumulator is Int-indexed, so a bigger limit could never be enforced: the
        // buffer would die on an OutOfMemoryError instead of raising the bounded failure.
        val overLimit = CollectingHandler.MAX_LIMIT_BYTES + 1

        assertThatThrownBy { CollectingHandler(overLimit) }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("stream without collecting")
        assertThatThrownBy { SandboxClient.builder().maxOutputBytes(overLimit) }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("stream without collecting")

        // The ceiling itself is allowed, and allocates nothing up front.
        assertThat(CollectingHandler(CollectingHandler.MAX_LIMIT_BYTES).size()).isZero()
    }

    @Test
    fun `a collecting handler bounds a streamed command too`() {
        // The bound travels with the handler, so a caller who streams but keeps output is
        // protected by the same mechanism run() uses.
        val (client, _) =
            clientFor(
                FakeResponse.sse(
                    startedEvent(),
                    outputEvent("stdout", 0, "0123456789"),
                    exitEvent(0),
                )
            )

        val collector = CollectingHandler(4)
        assertThatThrownBy { client.stream("sb-1", ExecRequest.ofShell("noisy"), collector) }
            .isInstanceOf(SandboxOutputTooLargeException::class.java)
            .hasMessageContaining("more than 4 bytes")
    }

    @Test
    fun `rejects an empty sandbox id`() {
        val (client, _) = clientFor(FakeResponse.sse(exitEvent(0)))

        assertThatThrownBy { client.run("", "true") }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("sandboxId")
    }
}

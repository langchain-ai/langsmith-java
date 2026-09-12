package com.langchain.smith.sandbox

import com.fasterxml.jackson.databind.ObjectMapper
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

internal class ExecCommandTest {

    @Test
    fun `a shell command serializes as a bare string`() {
        assertThat(ExecCommand.shell("ls -la | wc -l").jsonValue()).isEqualTo("ls -la | wc -l")
    }

    @Test
    fun `an argv command serializes as an array`() {
        assertThat(ExecCommand.argv("ls", "-la").jsonValue()).isEqualTo(listOf("ls", "-la"))
    }

    @Test
    fun `a single-element argv command still serializes as an array`() {
        // Serializing it as a string would silently switch the sandbox into shell mode.
        assertThat(ExecCommand.argv("ls").jsonValue()).isEqualTo(listOf("ls"))
    }

    @Test
    fun `rejects an empty command`() {
        assertThatThrownBy { ExecCommand.shell("") }
            .isInstanceOf(IllegalArgumentException::class.java)
        assertThatThrownBy { ExecCommand.argv() }.isInstanceOf(IllegalArgumentException::class.java)
        assertThatThrownBy { ExecCommand.argv("") }
            .isInstanceOf(IllegalArgumentException::class.java)
    }

    @Test
    fun `argv does not alias the caller's list`() {
        val args = mutableListOf("ls", "-la")
        val command = ExecCommand.argv(args)
        args.add("/etc")

        assertThat(command.args).containsExactly("ls", "-la")
    }
}

internal class ExecRequestTest {

    private val mapper = ObjectMapper()

    private fun bodyOf(request: ExecRequest) =
        mapper.valueToTree<com.fasterxml.jackson.databind.JsonNode>(request.toBody())

    @Test
    fun `omits every unset option`() {
        val body = bodyOf(ExecRequest.ofShell("true"))

        assertThat(body.fieldNames().asSequence().toList()).containsExactly("command")
        assertThat(body.get("command").asText()).isEqualTo("true")
    }

    @Test
    fun `includes only the options that were set`() {
        val body =
            bodyOf(
                ExecRequest.builder()
                    .command(ExecCommand.argv("make", "build"))
                    .cwd("/workspace")
                    .shell("/bin/sh")
                    .putEnv("CI", "1")
                    .timeoutSeconds(30)
                    .idleTimeoutSeconds(-1)
                    .ttlSeconds(600)
                    .build()
            )

        assertThat(body.get("command").map { it.asText() }).containsExactly("make", "build")
        assertThat(body.get("cwd").asText()).isEqualTo("/workspace")
        assertThat(body.get("shell").asText()).isEqualTo("/bin/sh")
        assertThat(body.get("env").get("CI").asText()).isEqualTo("1")
        assertThat(body.get("timeout_seconds").asInt()).isEqualTo(30)
        assertThat(body.get("idle_timeout_seconds").asInt()).isEqualTo(-1)
        assertThat(body.get("ttl_seconds").asInt()).isEqualTo(600)
        assertThat(body.has("command_id")).isFalse()
        assertThat(body.has("stdin")).isFalse()
    }

    @Test
    fun `sends stdin as base64`() {
        val body = bodyOf(ExecRequest.builder().command("cat").stdin("hello").build())

        assertThat(body.get("stdin").asText()).isEqualTo("aGVsbG8=")
        assertThat(body.get("stdin").binaryValue()).isEqualTo("hello".toByteArray())
    }

    @Test
    fun `omits empty stdin`() {
        val body = bodyOf(ExecRequest.builder().command("cat").stdin(ByteArray(0)).build())

        assertThat(body.has("stdin")).isFalse()
    }

    @Test
    fun `withCommandId preserves every other field`() {
        val original =
            ExecRequest.builder()
                .command("true")
                .cwd("/tmp")
                .putEnv("A", "b")
                .stdin("in")
                .timeoutSeconds(5)
                .idleTimeoutSeconds(-1)
                .ttlSeconds(9)
                .build()

        val body = bodyOf(original.withCommandId("fixed"))

        assertThat(body.get("command_id").asText()).isEqualTo("fixed")
        assertThat(body.get("cwd").asText()).isEqualTo("/tmp")
        assertThat(body.get("env").get("A").asText()).isEqualTo("b")
        assertThat(body.get("stdin").binaryValue()).isEqualTo("in".toByteArray())
        assertThat(body.get("timeout_seconds").asInt()).isEqualTo(5)
        assertThat(body.get("idle_timeout_seconds").asInt()).isEqualTo(-1)
        assertThat(body.get("ttl_seconds").asInt()).isEqualTo(9)
    }

    @Test
    fun `rejects out-of-range timeouts the sandbox would refuse`() {
        assertThatThrownBy { ExecRequest.builder().timeoutSeconds(-1) }
            .isInstanceOf(IllegalArgumentException::class.java)
        assertThatThrownBy { ExecRequest.builder().idleTimeoutSeconds(-2) }
            .isInstanceOf(IllegalArgumentException::class.java)
        assertThatThrownBy { ExecRequest.builder().ttlSeconds(-2) }
            .isInstanceOf(IllegalArgumentException::class.java)
    }

    @Test
    fun `requires a command`() {
        assertThatThrownBy { ExecRequest.builder().cwd("/tmp").build() }
            .isInstanceOf(IllegalStateException::class.java)
            .hasMessageContaining("command is required")
    }

    @Test
    fun `does not alias the caller's stdin array`() {
        val stdin = byteArrayOf(1, 2, 3)
        val request = ExecRequest.builder().command("cat").stdin(stdin).build()
        stdin[0] = 9

        assertThat(request.stdin().get()).isEqualTo(byteArrayOf(1, 2, 3))
    }
}

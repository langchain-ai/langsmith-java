package com.langchain.smith.sandbox

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SseReaderTest {

    private fun readAll(raw: String): List<Pair<String, String>> {
        SseReader(raw.byteInputStream()).use { reader ->
            return generateSequence { reader.next() }.map { it.name to it.data }.toList()
        }
    }

    @Test
    fun `reads consecutive events`() {
        assertThat(readAll("event: started\ndata: {}\n\nevent: exit\ndata: {\"exit_code\":0}\n\n"))
            .containsExactly("started" to "{}", "exit" to """{"exit_code":0}""")
    }

    @Test
    fun `skips heartbeat comments`() {
        assertThat(readAll(": ping\n\nevent: exit\ndata: {}\n\n: ping\n\n"))
            .containsExactly("exit" to "{}")
    }

    @Test
    fun `joins multi-line data with newlines`() {
        assertThat(readAll("event: x\ndata: {\ndata: }\n\n")).containsExactly("x" to "{\n}")
    }

    @Test
    fun `tolerates a missing space after the field colon`() {
        assertThat(readAll("event:x\ndata:1\n\n")).containsExactly("x" to "1")
    }

    @Test
    fun `keeps only the first space of the value`() {
        assertThat(readAll("event: x\ndata:  padded\n\n")).containsExactly("x" to " padded")
    }

    @Test
    fun `defaults an event with no name to message`() {
        assertThat(readAll("data: 1\n\n")).containsExactly("message" to "1")
    }

    @Test
    fun `ignores unknown fields`() {
        assertThat(readAll("id: 7\nretry: 100\nevent: x\ndata: 1\n\n")).containsExactly("x" to "1")
    }

    @Test
    fun `handles crlf line endings`() {
        assertThat(readAll("event: x\r\ndata: 1\r\n\r\n")).containsExactly("x" to "1")
    }

    @Test
    fun `ignores leading blank lines`() {
        assertThat(readAll("\n\nevent: x\ndata: 1\n\n")).containsExactly("x" to "1")
    }

    @Test
    fun `discards a trailing event with no terminating blank line`() {
        // A truncated frame is indistinguishable from a dropped connection, so it must not be
        // delivered as if it were complete.
        assertThat(readAll("event: x\ndata: 1\n\nevent: y\ndata: 2")).containsExactly("x" to "1")
    }

    @Test
    fun `returns nothing for an empty stream`() {
        assertThat(readAll("")).isEmpty()
    }
}

package com.langchain.smith.sandbox

import com.fasterxml.jackson.databind.ObjectMapper
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

internal class SandboxClientFilesTest {

    private val mapper = ObjectMapper()

    private fun clientFor(vararg responses: FakeResponse): Pair<SandboxClient, FakeHttpClient> {
        val http = FakeHttpClient(responses.toMutableList())
        return SandboxClient.builder().clientOptions(testClientOptions(http)).build() to http
    }

    private fun json(body: String) = FakeResponse.sse(body)

    @Test
    fun `reads a file as raw bytes`() {
        val content = byteArrayOf(0x00, 0xFF.toByte(), 0x41, 0x0A)
        val (client, http) = clientFor(FakeResponse.raw(200, content))

        assertThat(client.readFile("sb-1", "/tmp/blob.bin")).isEqualTo(content)
        assertThat(http.requests[0].url)
            .isEqualTo(
                "https://api.example.com/api/v2/sandboxes/sb-1/download?path=%2Ftmp%2Fblob.bin"
            )
    }

    @Test
    fun `reads a file as a string`() {
        val (client, _) = clientFor(FakeResponse.raw(200, "hello world".toByteArray()))

        assertThat(client.readFileAsString("sb-1", "/tmp/a.txt")).isEqualTo("hello world")
    }

    @Test
    fun `maps a missing file to a not-found failure`() {
        val (client, _) =
            clientFor(
                FakeResponse.error(
                    404,
                    """{"detail":{"error":"NotFound","message":"no such file"}}""",
                )
            )

        assertThatThrownBy { client.readFile("sb-1", "/nope") }
            .isInstanceOf(SandboxNotFoundException::class.java)
            .hasMessageContaining("no such file")
    }

    @Test
    fun `writes a file as multipart form data`() {
        val (client, http) = clientFor(json("""{"path":"/tmp/a.txt","written":5}"""))

        val result = client.writeFile("sb-1", "/tmp/a.txt", "hello")

        assertThat(result.path).isEqualTo("/tmp/a.txt")
        assertThat(result.bytesWritten).isEqualTo(5)
        assertThat(http.requests[0].url)
            .isEqualTo("https://api.example.com/api/v2/sandboxes/sb-1/upload?path=%2Ftmp%2Fa.txt")

        val body = http.requests[0].body
        assertThat(body)
            .contains("Content-Disposition: form-data; name=\"file\"; filename=\"file\"")
        assertThat(body).contains("Content-Type: application/octet-stream")
        assertThat(body).contains("hello")
        // The closing delimiter must repeat the opening boundary or the server sees a truncated
        // part.
        val boundary = body.lineSequence().first().removePrefix("--").trim()
        assertThat(body.trimEnd()).endsWith("--$boundary--")
    }

    @Test
    fun `declares a content length matching the body it writes`() {
        val (client, http) = clientFor(json("""{"path":"/tmp/a.bin","written":3}"""))

        client.writeFile("sb-1", "/tmp/a.bin", byteArrayOf(1, 2, 3))

        // Recorded from writeTo, so a contentLength that disagreed would corrupt the request.
        assertThat(http.requests[0].declaredContentLength)
            .isEqualTo(http.requests[0].bodyBytes.size.toLong())
    }

    @Test
    fun `writes binary content unchanged`() {
        val (client, http) = clientFor(json("""{"path":"/tmp/a.bin","written":4}"""))
        val content = byteArrayOf(0x00, 0x0D, 0x0A, 0xFF.toByte())

        client.writeFile("sb-1", "/tmp/a.bin", content)

        val bytes = http.requests[0].bodyBytes
        val marker = "application/octet-stream\r\n\r\n".toByteArray()
        val start = bytes.indexOfSlice(marker) + marker.size
        assertThat(bytes.copyOfRange(start, start + content.size)).isEqualTo(content)
    }

    @Test
    fun `falls back to the requested path when the upload response omits it`() {
        val (client, _) = clientFor(json("{}"))

        val result = client.writeFile("sb-1", "/tmp/a.txt", "x")

        assertThat(result.path).isEqualTo("/tmp/a.txt")
        assertThat(result.bytesWritten).isEqualTo(0)
    }

    @Test
    fun `globs a directory tree`() {
        val (client, http) =
            clientFor(
                json(
                    """{"matches":[
                      {"path":"/src/a.py","is_dir":false,"size_bytes":12,"modified_at":"2026-08-01T00:00:00Z"},
                      {"path":"/src/pkg","is_dir":true,"size_bytes":0,"modified_at":"2026-08-01T01:00:00Z"}
                    ],"truncated":true}"""
                )
            )

        val result =
            client.glob(
                "sb-1",
                GlobRequest.builder().path("/src").pattern("**/*.py").limit(50).build(),
            )

        assertThat(result.isTruncated).isTrue()
        assertThat(result.matches).hasSize(2)
        assertThat(result.matches[0].path).isEqualTo("/src/a.py")
        assertThat(result.matches[0].isDir).isFalse()
        assertThat(result.matches[0].sizeBytes).isEqualTo(12)
        assertThat(result.matches[0].modifiedAt).isEqualTo("2026-08-01T00:00:00Z")
        assertThat(result.matches[1].isDir).isTrue()

        assertThat(http.requests[0].url)
            .isEqualTo("https://api.example.com/api/v2/sandboxes/sb-1/glob")
        val body = mapper.readTree(http.requests[0].body)
        assertThat(body.get("path").asText()).isEqualTo("/src")
        assertThat(body.get("pattern").asText()).isEqualTo("**/*.py")
        assertThat(body.get("limit").asInt()).isEqualTo(50)
    }

    @Test
    fun `omits an unset glob limit`() {
        val (client, http) = clientFor(json("""{"matches":[],"truncated":false}"""))

        val result = client.glob("sb-1", "/src", "*")

        assertThat(result.matches).isEmpty()
        assertThat(result.isTruncated).isFalse()
        assertThat(mapper.readTree(http.requests[0].body).has("limit")).isFalse()
    }

    @Test
    fun `lists a directory as a non-recursive glob`() {
        val (client, http) = clientFor(json("""{"matches":[],"truncated":false}"""))

        client.listDirectory("sb-1", "/workspace")

        val body = mapper.readTree(http.requests[0].body)
        assertThat(http.requests[0].url).endsWith("/glob")
        assertThat(body.get("path").asText()).isEqualTo("/workspace")
        // A pattern without ** is pruned to one segment, so this reads only that directory.
        assertThat(body.get("pattern").asText()).isEqualTo("*")
    }

    @Test
    fun `greps file contents`() {
        val (client, http) =
            clientFor(
                json(
                    """{"matches":[
                      {"path":"/src/a.py","line":7,"text":"import os"},
                      {"path":"/src/b.py","line":1,"text":"import os.path"}
                    ],"truncated":false}"""
                )
            )

        val result =
            client.grep(
                "sb-1",
                GrepRequest.builder()
                    .path("/src")
                    .pattern("import os")
                    .glob("*.py")
                    .limit(10)
                    .build(),
            )

        assertThat(result.isTruncated).isFalse()
        assertThat(result.matches).hasSize(2)
        assertThat(result.matches[0].path).isEqualTo("/src/a.py")
        assertThat(result.matches[0].line).isEqualTo(7)
        assertThat(result.matches[0].text).isEqualTo("import os")

        val body = mapper.readTree(http.requests[0].body)
        assertThat(body.get("pattern").asText()).isEqualTo("import os")
        assertThat(body.get("glob").asText()).isEqualTo("*.py")
        assertThat(body.get("limit").asInt()).isEqualTo(10)
    }

    @Test
    fun `omits an unset grep glob`() {
        val (client, http) = clientFor(json("""{"matches":[],"truncated":false}"""))

        client.grep("sb-1", "/src", "needle")

        val body = mapper.readTree(http.requests[0].body)
        assertThat(body.has("glob")).isFalse()
        assertThat(body.has("limit")).isFalse()
    }

    @Test
    fun `sends a grep pattern literally`() {
        val (client, http) = clientFor(json("""{"matches":[],"truncated":false}"""))

        // The endpoint matches literal text, so regex metacharacters must not be escaped away.
        client.grep("sb-1", "/src", "a.*b[0-9]")

        assertThat(mapper.readTree(http.requests[0].body).get("pattern").asText())
            .isEqualTo("a.*b[0-9]")
    }

    @Test
    fun `rejects a relative search path`() {
        assertThatThrownBy { GlobRequest.of("src", "*") }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("path must be absolute")
        assertThatThrownBy { GrepRequest.of("src", "x") }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("path must be absolute")
    }

    @Test
    fun `rejects a non-positive limit`() {
        assertThatThrownBy { GlobRequest.builder().limit(0) }
            .isInstanceOf(IllegalArgumentException::class.java)
        assertThatThrownBy { GrepRequest.builder().limit(-1) }
            .isInstanceOf(IllegalArgumentException::class.java)
    }

    @Test
    fun `requires a pattern and a path`() {
        assertThatThrownBy { GlobRequest.builder().path("/src").build() }
            .isInstanceOf(IllegalStateException::class.java)
            .hasMessageContaining("pattern is required")
        assertThatThrownBy { GrepRequest.builder().pattern("x").build() }
            .isInstanceOf(IllegalStateException::class.java)
            .hasMessageContaining("path is required")
    }

    @Test
    fun `rejects an empty file path`() {
        val (client, _) = clientFor(json("{}"))

        assertThatThrownBy { client.readFile("sb-1", "") }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("path must not be empty")
    }

    @Test
    fun `rejects an empty sandbox id`() {
        val (client, _) = clientFor(json("{}"))

        assertThatThrownBy { client.glob("", "/src", "*") }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("sandboxId")
    }

    @Test
    fun `raises a protocol failure for a malformed response`() {
        val (client, _) = clientFor(FakeResponse.raw(200, "{not json".toByteArray()))

        assertThatThrownBy { client.glob("sb-1", "/src", "*") }
            .isInstanceOf(SandboxProtocolException::class.java)
            .hasMessageContaining("malformed glob response")
    }

    @Test
    fun `surfaces an unmapped status`() {
        val (client, _) = clientFor(FakeResponse.error(403, """{"detail":{"error":"Forbidden"}}"""))

        assertThatThrownBy { client.writeFile("sb-1", "/etc/passwd", "x") }
            .isInstanceOf(SandboxApiException::class.java)
            .hasMessageContaining("HTTP 403")
            .hasMessageContaining("Forbidden")
    }
}

private fun ByteArray.indexOfSlice(slice: ByteArray): Int {
    outer@ for (i in 0..size - slice.size) {
        for (j in slice.indices) {
            if (this[i + j] != slice[j]) continue@outer
        }
        return i
    }
    return -1
}

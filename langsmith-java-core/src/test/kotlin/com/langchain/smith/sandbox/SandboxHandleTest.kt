package com.langchain.smith.sandbox

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

/**
 * The handle API, which exists so callers never need the generated boxes service for the ordinary
 * create-run-delete flow.
 */
internal class SandboxHandleTest {

    private fun clientFor(vararg responses: FakeResponse): Pair<SandboxClient, FakeHttpClient> {
        val http = FakeHttpClient(responses.toMutableList())
        return SandboxClient.builder().clientOptions(testClientOptions(http)).build() to http
    }

    private fun json(body: String) = FakeResponse.raw(200, body.toByteArray())

    @Test
    fun `creates a sandbox without any parameters`() {
        val (client, http) =
            clientFor(json("""{"id":"sb-uuid","name":"server-picked","status":"ready"}"""))

        val sandbox = client.create()

        assertThat(http.requests).hasSize(1)
        // The generated service and the hand-written routes share the /api/v2 prefix, which is
        // what makes one configured base URL correct for both.
        assertThat(http.requests[0].url).isEqualTo("https://api.example.com/api/v2/sandboxes/boxes")
        // The server names it, so the request carries no name to conflict with an existing one.
        assertThat(http.requests[0].body).doesNotContain("server-picked")
        assertThat(sandbox.ref).isEqualTo("sb-uuid")
    }

    @Test
    fun `addresses a created sandbox by id rather than name`() {
        val (client, http) =
            clientFor(
                json("""{"id":"sb-uuid","name":"renameable","status":"ready"}"""),
                FakeResponse.sse(startedEvent(), exitEvent(0)),
            )

        client.create().run("true")

        // A sandbox can be renamed, so the stable identifier is the one to keep using.
        assertThat(http.requests[1].url)
            .isEqualTo("https://api.example.com/api/v2/sandboxes/sb-uuid/execute/stream/start")
    }

    @Test
    fun `falls back to the name when the create response carries no id`() {
        val (client, _) = clientFor(json("""{"name":"only-a-name","status":"ready"}"""))

        assertThat(client.create().ref).isEqualTo("only-a-name")
    }

    @Test
    fun `fails when the create response identifies nothing`() {
        val (client, _) = clientFor(json("""{"status":"ready"}"""))

        assertThatThrownBy { client.create() }
            .isInstanceOf(SandboxException::class.java)
            .hasMessageContaining("without an id or a name")
    }

    @Test
    fun `attaches without making a request`() {
        val (client, http) = clientFor()

        val sandbox = client.attach("my-sandbox")

        assertThat(sandbox.ref).isEqualTo("my-sandbox")
        assertThat(http.requests).isEmpty()
    }

    @Test
    fun `attaches by name or by id`() {
        val (client, http) =
            clientFor(
                FakeResponse.sse(startedEvent(), exitEvent(0)),
                FakeResponse.sse(startedEvent(), exitEvent(0)),
            )

        client.attach("friendly-name").run("true")
        client.attach("0b7e6f52-0f4e-7c3a-9a1e-6b1d2c3f4a5b").run("true")

        // The route resolves either form, so the handle passes through whatever it was given.
        assertThat(http.requests[0].url).contains("/sandboxes/friendly-name/")
        assertThat(http.requests[1].url)
            .contains("/sandboxes/0b7e6f52-0f4e-7c3a-9a1e-6b1d2c3f4a5b/")
    }

    @Test
    fun `runs a command through the handle without an identifier argument`() {
        val (client, http) =
            clientFor(
                FakeResponse.sse(startedEvent(), outputEvent("stdout", 0, "hi"), exitEvent(0))
            )

        val result = client.attach("sb-1").run("echo hi")

        assertThat(result.stdoutString()).isEqualTo("hi")
        assertThat(http.requests[0].url).contains("/sandboxes/sb-1/execute/stream/start")
    }

    @Test
    fun `reads and writes files through the handle`() {
        val (client, http) =
            clientFor(
                json("""{"path":"/tmp/a.txt","written":2}"""),
                FakeResponse.raw(200, "hi".toByteArray()),
            )
        val sandbox = client.attach("sb-1")

        assertThat(sandbox.writeFile("/tmp/a.txt", "hi").bytesWritten).isEqualTo(2)
        assertThat(sandbox.readFileAsString("/tmp/a.txt")).isEqualTo("hi")

        assertThat(http.requests[0].url).contains("/sandboxes/sb-1/upload?path=")
        assertThat(http.requests[1].url).contains("/sandboxes/sb-1/download?path=")
    }

    @Test
    fun `searches through the handle`() {
        val (client, http) =
            clientFor(
                json("""{"matches":[],"truncated":false}"""),
                json("""{"matches":[],"truncated":false}"""),
            )
        val sandbox = client.attach("sb-1")

        sandbox.listDirectory("/w")
        sandbox.grep("/w", "needle")

        assertThat(http.requests[0].url).endsWith("/sandboxes/sb-1/glob")
        assertThat(http.requests[1].url).endsWith("/sandboxes/sb-1/grep")
    }

    @Test
    fun `stops a sandbox`() {
        val (client, http) = clientFor(json("{}"))

        client.attach("sb-1").stop()

        assertThat(http.requests[0].url)
            .isEqualTo("https://api.example.com/api/v2/sandboxes/boxes/sb-1/stop")
    }

    @Test
    fun `deletes a sandbox`() {
        val (client, http) = clientFor(json("{}"))

        client.attach("sb-1").delete()

        assertThat(http.requests[0].url)
            .isEqualTo("https://api.example.com/api/v2/sandboxes/boxes/sb-1")
    }

    @Test
    fun `retrieves current metadata`() {
        val (client, http) = clientFor(json("""{"id":"sb-1","status":"stopped"}"""))

        val response = client.attach("sb-1").retrieve()

        assertThat(response.status()).hasValue("stopped")
        assertThat(http.requests[0].url)
            .isEqualTo("https://api.example.com/api/v2/sandboxes/boxes/sb-1")
    }

    @Test
    fun `rejects an empty identifier`() {
        val (client, _) = clientFor()

        assertThatThrownBy { client.attach("") }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("must not be empty")
    }
}

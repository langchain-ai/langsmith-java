package com.langchain.smith.sandbox

import com.langchain.smith.core.JsonValue
import com.langchain.smith.tracing.RunTree
import com.langchain.smith.tracing.withParent
import io.opentelemetry.api.common.AttributeKey
import io.opentelemetry.api.trace.Span
import io.opentelemetry.sdk.trace.ReadableSpan
import io.opentelemetry.sdk.trace.SdkTracerProvider
import java.util.stream.Stream
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

internal class SandboxTracingTest {

    data class Case(
        val name: String,
        val response: FakeResponse,
        val operation: (Sandbox) -> Unit,
    ) {
        override fun toString(): String = name
    }

    private fun clientFor(vararg responses: FakeResponse): Pair<SandboxClient, FakeHttpClient> {
        val http = FakeHttpClient(responses.toMutableList())
        return SandboxClient.of(testClientOptions(http)) to http
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("operations")
    fun `operations annotate only the active native run and OTel span`(case: Case) {
        val (client, http) = clientFor(case.response)
        val sandbox = client.attach(ID)
        val parent = RunTree()
        val run = RunTree(metadata = mutableMapOf("other" to "preserved"))
        SdkTracerProvider.builder().build().use { provider ->
            val span = provider.get("sandbox-test").spanBuilder("caller").startSpan()
            try {
                span.makeCurrent().use {
                    withParent(parent) {
                        withParent(run) { case.operation(sandbox) }
                        assertThat(parent.metadata).isEmpty()
                    }
                    assertThat(Span.current()).isSameAs(span)
                }
                assertThat(run.metadata)
                    .containsExactlyInAnyOrderEntriesOf(
                        mapOf("other" to "preserved", "sandbox_id" to ID)
                    )
                assertThat((span as ReadableSpan).getAttribute(AttributeKey.stringKey(OTEL_KEY)))
                    .isEqualTo(ID)
                assertThat(
                        run.buildRunData()
                            .extra()
                            .get()
                            ._additionalProperties()["metadata"]
                            ?.asObject()
                            ?.get()
                    )
                    .containsEntry("sandbox_id", JsonValue.from(ID))
                assertThat(http.requests).hasSize(1)
            } finally {
                span.end()
            }
        }
    }

    @Test
    fun `create records canonical id and later calls use the calling run`() {
        val (client, http) =
            clientFor(
                json("""{"id":"$ID","name":"friendly"}"""),
                FakeResponse.raw(200, "hello".toByteArray()),
            )
        val creation = RunTree()
        val sandbox = withParent(creation) { client.create() }
        val caller = RunTree()

        withParent(caller) { sandbox.readFile("/tmp/a") }

        assertThat(creation.metadata).containsEntry("sandbox_id", ID)
        assertThat(caller.metadata).containsEntry("sandbox_id", ID)
        assertThat(http.requests).hasSize(2)
    }

    @Test
    fun `retrieve learns the id for subsequent name based calls`() {
        val (client, http) =
            clientFor(
                json("""{"id":"$ID","name":"friendly"}"""),
                FakeResponse.raw(200, "hello".toByteArray()),
            )
        val sandbox = client.attach("friendly")
        val retrieval = RunTree()
        withParent(retrieval) { sandbox.retrieve() }
        val caller = RunTree()

        withParent(caller) { sandbox.readFile("/tmp/a") }

        assertThat(retrieval.metadata).containsEntry("sandbox_id", ID)
        assertThat(caller.metadata).containsEntry("sandbox_id", ID)
        assertThat(http.requests).hasSize(2)
    }

    @Test
    fun `unknown names and missing response ids do not become metadata`() {
        val (client, http) =
            clientFor(json("""{"name":"friendly"}"""), FakeResponse.raw(200, "hello".toByteArray()))
        val run = RunTree()

        withParent(run) { client.create().readFile("/tmp/a") }

        assertThat(run.metadata).doesNotContainKey("sandbox_id")
        assertThat(http.requests).hasSize(2)
    }

    @Test
    fun `delete forgets the cached name`() {
        val (client, http) =
            clientFor(
                json("""{"id":"$ID","name":"friendly"}"""),
                json("{}"),
                FakeResponse.raw(200, "hello".toByteArray()),
            )
        client.create().delete()
        val run = RunTree()

        withParent(run) { client.readFile("friendly", "/tmp/a") }

        assertThat(run.metadata).doesNotContainKey("sandbox_id")
        assertThat(http.requests).hasSize(3)
    }

    @Test
    fun `failed calls still annotate the known sandbox id`() {
        val (client, http) = clientFor(FakeResponse.error(404, "not found"))
        val run = RunTree()

        assertThatThrownBy { withParent(run) { client.readFile(ID, "/tmp/a") } }
            .isInstanceOf(SandboxNotFoundException::class.java)

        assertThat(run.metadata).containsEntry("sandbox_id", ID)
        assertThat(http.requests).hasSize(1)
    }

    @Test
    fun `most recently used sandbox replaces previous metadata`() {
        val (client, http) =
            clientFor(
                FakeResponse.raw(200, "hello".toByteArray()),
                FakeResponse.raw(200, "hello".toByteArray()),
            )
        val run = RunTree()
        val otherId = "0198b652-1940-754a-bb64-d626138d0556"

        withParent(run) {
            client.readFile(ID, "/tmp/a")
            assertThat(run.metadata).containsEntry("sandbox_id", ID)
            client.readFile(otherId, "/tmp/a")
        }

        assertThat(run.metadata).containsEntry("sandbox_id", otherId)
        assertThat(http.requests).hasSize(2)
    }

    @Test
    fun `without tracing operations still work and attach stays lazy`() {
        val (client, http) = clientFor(FakeResponse.raw(200, "hello".toByteArray()))
        val run = RunTree()
        val sandbox = withParent(run) { client.attach(ID) }

        assertThat(http.requests).isEmpty()
        assertThat(run.metadata).isEmpty()
        assertThat(sandbox.readFileAsString("/tmp/a")).isEqualTo("hello")
        assertThat(Span.current().spanContext.isValid).isFalse()
        assertThat(http.requests).hasSize(1)
    }

    companion object {
        private const val ID = "0b7e6f52-0f4e-7c3a-9a1e-6b1d2c3f4a5b"
        private const val OTEL_KEY = "langsmith.metadata.sandbox_id"

        private fun json(body: String): FakeResponse = FakeResponse.raw(200, body.toByteArray())

        @JvmStatic
        fun operations(): Stream<Case> =
            Stream.of(
                Case("run", FakeResponse.sse(startedEvent(), exitEvent(0))) { it.run("true") },
                Case("stream", FakeResponse.sse(startedEvent(), exitEvent(0))) {
                    it.stream(ExecRequest.ofShell("true"), CapturingHandler())
                },
                Case("read", FakeResponse.raw(200, "hello".toByteArray())) {
                    it.readFileAsString("/tmp/a")
                },
                Case("write", json("""{"path":"/tmp/a","written":2}""")) {
                    it.writeFile("/tmp/a", "hi")
                },
                Case("glob", json("""{"matches":[],"truncated":false}""")) { it.glob("/tmp", "*") },
                Case("list", json("""{"matches":[],"truncated":false}""")) {
                    it.listDirectory("/tmp")
                },
                Case("grep", json("""{"matches":[],"truncated":false}""")) {
                    it.grep("/tmp", "needle")
                },
                Case("retrieve", json("""{"id":"$ID"}""")) { it.retrieve() },
                Case("stop", json("{}")) { it.stop() },
                Case("delete", json("{}")) { it.delete() },
            )
    }
}

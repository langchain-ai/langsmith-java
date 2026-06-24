package com.langchain.smith.tracing

import com.langchain.smith.client.LangsmithClient
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.mockito.kotlin.mock

internal class TraceableEvaluateContextTest {

    private val client: LangsmithClient = mock()

    @Test
    fun traceable_withEvaluateContext_buildRunDataIncludesExampleAndSession() {
        val captured = mutableListOf<RunTree>()
        val traced =
            traceable(
                { input: Map<String, Any?> ->
                    getCurrentRunTree()?.let { captured.add(it) }
                    mapOf("answer" to input["question"])
                },
                TraceConfig(
                    name = "target",
                    client = client,
                    tracingEnabled = true,
                    projectName = "my-experiment",
                    referenceExampleId = "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e",
                    sessionId = "12345678-1234-1234-1234-123456789012",
                    metadata = mapOf("example_version" to "2024-01-01T00:00:00Z"),
                ),
            )

        traced(mapOf("question" to "hello"))

        assertThat(captured).hasSize(1)
        val data = captured.single().buildRunData()
        assertThat(data.referenceExampleId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(data.sessionId()).contains("12345678-1234-1234-1234-123456789012")
        assertThat(data.sessionName()).contains("my-experiment")
    }

    @Test
    fun createChild_inheritsReferenceExampleAndSession() {
        val parent =
            RunTree(
                name = "parent",
                client = client,
                referenceExampleId = "example-id",
                sessionId = "session-id",
            )
        val child = parent.createChild(TraceConfig(name = "child"))

        assertThat(child.referenceExampleId).isEqualTo("example-id")
        assertThat(child.sessionId).isEqualTo("session-id")
    }
}

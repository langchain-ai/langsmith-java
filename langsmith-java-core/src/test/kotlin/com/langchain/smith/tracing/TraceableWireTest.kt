package com.langchain.smith.tracing

import com.langchain.smith.client.LangsmithClient
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test
import org.mockito.kotlin.any
import org.mockito.kotlin.doReturn
import org.mockito.kotlin.doThrow
import org.mockito.kotlin.mock

/**
 * Tests that verify the [RunTree] state produced by [traceable], including tree structure, inputs,
 * outputs, errors, metadata, and [RunTree.buildRunData] serialization.
 */
internal class TraceableWireTest {

    private val client: LangsmithClient = mock()

    private fun config(name: String): TraceConfig<Any?, Any?> =
        TraceConfig(name = name, client = client, tracingEnabled = true)

    private fun cfg(
        name: String,
        client: LangsmithClient? = null,
        runType: RunType = RunType.CHAIN,
        metadata: Map<String, Any>? = null,
        tags: List<String>? = null,
        projectName: String? = null,
        tracingEnabled: Boolean? = null,
    ): TraceConfig<Any?, Any?> =
        TraceConfig(
            name = name,
            client = client,
            runType = runType,
            metadata = metadata,
            tags = tags,
            projectName = projectName,
            tracingEnabled = tracingEnabled,
        )

    // ---- Basic tracing ----

    @Test
    fun singleRun_hasCorrectState() {
        var run: RunTree? = null
        val traced =
            traceable(
                { input: String ->
                    run = getCurrentRunTree()
                    "echo: $input"
                },
                config("echo"),
            )
        traced("hello")

        assertThat(run).isNotNull
        assertThat(run!!.name).isEqualTo("echo")
        assertThat(run!!.inputs).isEqualTo(mapOf("inputs" to "hello"))
        assertThat(run!!.outputs).isEqualTo(mapOf("outputs" to "echo: hello"))
        assertThat(run!!.endTime).isNotNull()
        assertThat(run!!.error).isNull()
    }

    @Test
    fun singleRun_buildRunData_containsAllFields() {
        var run: RunTree? = null
        val traced =
            traceable(
                { _: Unit ->
                    run = getCurrentRunTree()
                    "result"
                },
                cfg(
                    "wire-test",
                    client = client,
                    tracingEnabled = true,
                    metadata = mapOf("custom" to "value"),
                    tags = listOf("prod", "v2"),
                    projectName = "my-project",
                ),
            )
        traced(Unit)

        val data = run!!.buildRunData()
        assertThat(data.name().orElse(null)).isEqualTo("wire-test")
        assertThat(data.id().orElse(null)).isEqualTo(run!!.id)
        assertThat(data.traceId().orElse(null)).isEqualTo(run!!.traceId)
        assertThat(data.dottedOrder().orElse(null)).isEqualTo(run!!.dottedOrder)
        assertThat(data.startTime().orElse(null)).isEqualTo(run!!.startTime)
        assertThat(data.sessionName().orElse(null)).isEqualTo("my-project")
        assertThat(data.tags().orElse(emptyList())).containsExactly("prod", "v2")
        assertThat(data.outputs().isPresent).isTrue()
        assertThat(data.endTime().isPresent).isTrue()
        assertThat(data.error().isPresent).isFalse()
        val extra = data.extra().orElse(null)
        assertThat(extra).isNotNull
        // Verify metadata exists in extra (contains user + runtime metadata)
        assertThat(run!!.metadata).containsEntry("custom", "value")
        assertThat(extra!!._additionalProperties()).containsKey("metadata")
    }

    // ---- Nested tracing / tree structure ----

    @Test
    fun nestedRuns_correctParentChild() {
        var parentRun: RunTree? = null
        var child1Run: RunTree? = null
        var child2Run: RunTree? = null
        val child1 =
            traceable(
                { _: Unit ->
                    child1Run = getCurrentRunTree()
                    "c1"
                },
                cfg("child-1"),
            )
        val child2 =
            traceable(
                { _: Unit ->
                    child2Run = getCurrentRunTree()
                    "c2"
                },
                cfg("child-2"),
            )
        val parent =
            traceable(
                { _: Unit ->
                    parentRun = getCurrentRunTree()
                    child1(Unit)
                    child2(Unit)
                    "parent-result"
                },
                config("parent"),
            )
        parent(Unit)

        assertThat(parentRun!!.parentRunId).isNull()
        assertThat(child1Run!!.parentRunId).isEqualTo(parentRun!!.id)
        assertThat(child2Run!!.parentRunId).isEqualTo(parentRun!!.id)
        assertThat(child1Run!!.traceId).isEqualTo(parentRun!!.traceId)
        assertThat(child2Run!!.traceId).isEqualTo(parentRun!!.traceId)
        assertThat(child1Run!!.dottedOrder).startsWith(parentRun!!.dottedOrder + ".")
        assertThat(child2Run!!.dottedOrder).startsWith(parentRun!!.dottedOrder + ".")
    }

    @Test
    fun deeplyNestedRuns_correctChain() {
        var l1: RunTree? = null
        var l2: RunTree? = null
        var l3: RunTree? = null
        val level3 =
            traceable(
                { _: Unit ->
                    l3 = getCurrentRunTree()
                    "deep"
                },
                cfg("level-3"),
            )
        val level2 =
            traceable(
                { _: Unit ->
                    l2 = getCurrentRunTree()
                    level3(Unit)
                },
                cfg("level-2"),
            )
        val level1 =
            traceable(
                { _: Unit ->
                    l1 = getCurrentRunTree()
                    level2(Unit)
                },
                config("level-1"),
            )
        level1(Unit)

        assertThat(l1!!.parentRunId).isNull()
        assertThat(l2!!.parentRunId).isEqualTo(l1!!.id)
        assertThat(l3!!.parentRunId).isEqualTo(l2!!.id)
        assertThat(l3!!.traceId).isEqualTo(l1!!.traceId)
    }

    @Test
    fun nestedRuns_buildRunData_parentRunIdSet() {
        var childRun: RunTree? = null
        val child =
            traceable(
                { _: Unit ->
                    childRun = getCurrentRunTree()
                    "child"
                },
                cfg("child"),
            )
        val parent = traceable({ _: Unit -> child(Unit) }, config("parent"))
        parent(Unit)

        val data = childRun!!.buildRunData()
        assertThat(data.parentRunId().isPresent).isTrue()
    }

    // ---- Error handling ----

    @Test
    fun errorRun_capturesErrorInRunTree() {
        var run: RunTree? = null
        val traced =
            traceable(
                { _: Unit ->
                    run = getCurrentRunTree()
                    throw RuntimeException("boom")
                },
                config("failing"),
            )
        assertThatThrownBy { traced(Unit) }.hasMessage("boom")

        assertThat(run!!.error).contains("boom")
        assertThat(run!!.endTime).isNotNull()

        val data = run!!.buildRunData()
        assertThat(data.error().orElse(null)).contains("boom")
        assertThat(data.endTime().isPresent).isTrue()
    }

    @Test
    fun clientError_doesNotBreakWrappedFunction() {
        val errorRunService =
            mock<com.langchain.smith.services.blocking.RunService> {
                on { ingestBatch(any(), any()) } doThrow RuntimeException("client broke")
            }
        val errorClient = mock<LangsmithClient> { on { runs() } doReturn errorRunService }
        val traced =
            traceable(
                { input: Int -> input * 2 },
                cfg("error-test", client = errorClient, tracingEnabled = true),
            )

        val result = traced(5)
        // Give background thread time to fail
        Thread.sleep(200)
        assertThat(result).isEqualTo(10)
    }

    // ---- Null input ----

    @Test
    fun nullInput_doesNotThrow() {
        var run: RunTree? = null
        val traced =
            traceable(
                { input: String? ->
                    run = getCurrentRunTree()
                    input
                },
                config("null-test"),
            )
        val result = traced(null)

        assertThat(result).isNull()
        assertThat(run).isNotNull
        assertThat(run!!.inputs).isEqualTo(mapOf("inputs" to null))
        assertThat(run!!.outputs).isEqualTo(mapOf("outputs" to null))
    }

    // ---- withParent ----

    @Test
    fun withParent_correctTreeStructure() {
        var parentRun: RunTree? = null
        var childRun: RunTree? = null
        val child =
            traceable(
                { _: Unit ->
                    childRun = getCurrentRunTree()
                    "child-result"
                },
                cfg("child"),
            )
        val parent =
            traceable(
                { _: Unit ->
                    parentRun = getCurrentRunTree()
                    withParent(parentRun) { child(Unit) }
                },
                config("parent"),
            )
        parent(Unit)

        assertThat(childRun!!.parentRunId).isEqualTo(parentRun!!.id)
        assertThat(childRun!!.traceId).isEqualTo(parentRun!!.traceId)
    }

    // ---- Metadata and tags in buildRunData ----

    @Test
    fun metadata_includedInBuildRunData() {
        var run: RunTree? = null
        val traced =
            traceable(
                { _: Unit ->
                    run = getCurrentRunTree()
                    run!!.metadata["dynamic"] = "added"
                    "ok"
                },
                cfg(
                    "meta-test",
                    client = client,
                    tracingEnabled = true,
                    metadata = mapOf("static" to "config"),
                ),
            )
        traced(Unit)

        // Verify metadata on the RunTree itself (which buildRunData reads from)
        assertThat(run!!.metadata).containsEntry("static", "config")
        assertThat(run!!.metadata).containsEntry("dynamic", "added")
        // Verify buildRunData includes metadata in extra
        val data = run!!.buildRunData()
        assertThat(data.extra().orElse(null)!!._additionalProperties()).containsKey("metadata")
    }

    @Test
    fun tags_includedInBuildRunData() {
        var run: RunTree? = null
        val traced =
            traceable(
                { _: Unit ->
                    run = getCurrentRunTree()
                    run!!.tags.add("dynamic-tag")
                    "ok"
                },
                cfg("tag-test", client = client, tracingEnabled = true, tags = listOf("static-tag")),
            )
        traced(Unit)

        val data = run!!.buildRunData()
        assertThat(data.tags().orElse(emptyList())).containsExactly("static-tag", "dynamic-tag")
    }

    // ---- tracingEnabled: false ----

    @Test
    fun tracingDisabled_noRunTreeCreated() {
        var run: RunTree? = null
        val traced =
            traceable(
                { _: Unit ->
                    run = getCurrentRunTree()
                    "ok"
                },
                cfg("disabled", client = client, tracingEnabled = false),
            )
        val result = traced(Unit)

        assertThat(result).isEqualTo("ok")
        assertThat(run).isNull()
    }

    // ---- Multi-arg ----

    @Test
    fun twoArgs_inputsContainArgs() {
        var run: RunTree? = null
        val traced =
            traceable(
                { a: String, b: Int ->
                    run = getCurrentRunTree()
                    "$a$b"
                },
                config("two-arg"),
            )
        traced("hello", 42)

        assertThat(run!!.inputs).isEqualTo(mapOf("args" to listOf("hello", 42)))
    }

    // ---- Config inheritance ----

    @Test
    fun childInheritsProjectName_inBuildRunData() {
        var childRun: RunTree? = null
        val child =
            traceable(
                { _: Unit ->
                    childRun = getCurrentRunTree()
                    "child"
                },
                cfg("child"),
            )
        val parent =
            traceable(
                { _: Unit -> child(Unit) },
                cfg("parent", client = client, tracingEnabled = true, projectName = "my-project"),
            )
        parent(Unit)

        assertThat(childRun!!.projectName).isEqualTo("my-project")
        val data = childRun!!.buildRunData()
        assertThat(data.sessionName().orElse(null)).isEqualTo("my-project")
    }
}

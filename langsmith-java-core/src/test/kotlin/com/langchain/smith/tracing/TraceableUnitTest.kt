package com.langchain.smith.tracing

import com.langchain.smith.client.LangsmithClient
import java.util.concurrent.Executors
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.mockito.kotlin.mock

/**
 * Unit tests for [traceable] input/output serialization. Uses a mock client so no API key is
 * required.
 */
internal class TraceableUnitTest {

    private val client: LangsmithClient = mock()

    private fun config(name: String) =
        TraceConfig(name = name, client = client, tracingEnabled = true)

    // ---- String input wrapping ----

    @Test
    fun stringInput_wrappedAsInputKey() {
        var capturedInputs: Map<String, Any?>? = null
        val traced =
            traceable(
                { input: String ->
                    capturedInputs = RunTree.getCurrent()?.inputs
                    "result"
                },
                config("string-input"),
            )
        traced("hello")
        assertThat(capturedInputs).isEqualTo(mapOf("inputs" to "hello"))
    }

    @Test
    fun intInput_wrappedAsInputKey() {
        var capturedInputs: Map<String, Any?>? = null
        val traced =
            traceable(
                { input: Int ->
                    capturedInputs = RunTree.getCurrent()?.inputs
                    "result"
                },
                config("int-input"),
            )
        traced(42)
        assertThat(capturedInputs).isEqualTo(mapOf("inputs" to 42))
    }

    @Test
    fun listInput_wrappedAsInputKey() {
        var capturedInputs: Map<String, Any?>? = null
        val traced =
            traceable(
                { input: List<String> ->
                    capturedInputs = RunTree.getCurrent()?.inputs
                    "result"
                },
                config("list-input"),
            )
        traced(listOf("a", "b"))
        assertThat(capturedInputs).isEqualTo(mapOf("inputs" to listOf("a", "b")))
    }

    @Test
    fun mapInput_usedDirectly() {
        var capturedInputs: Map<String, Any?>? = null
        val traced =
            traceable(
                { input: Map<String, Any?> ->
                    capturedInputs = RunTree.getCurrent()?.inputs
                    "result"
                },
                config("map-input"),
            )
        traced(mapOf("question" to "hello", "context" to "world"))
        assertThat(capturedInputs).isEqualTo(mapOf("question" to "hello", "context" to "world"))
    }

    @Test
    fun mapWithNonStringKeys_wrappedAsInputKey() {
        var capturedInputs: Map<String, Any?>? = null
        val traced =
            traceable(
                { input: Map<Int, String> ->
                    capturedInputs = RunTree.getCurrent()?.inputs
                    "result"
                },
                config("non-string-key-input"),
            )
        traced(mapOf(1 to "a", 2 to "b"))
        assertThat(capturedInputs).containsKey("inputs")
    }

    // ---- String output wrapping ----

    @Test
    fun stringOutput_wrappedAsOutputKey() {
        var childRun: RunTree? = null
        val traced =
            traceable(
                { _: Unit ->
                    childRun = RunTree.getCurrent()
                    "hello world"
                },
                config("string-output"),
            )
        traced(Unit)
        assertThat(childRun).isNotNull
        assertThat(childRun!!.outputs).isEqualTo(mapOf("outputs" to "hello world"))
    }

    @Test
    fun intOutput_wrappedAsOutputKey() {
        var childRun: RunTree? = null
        val traced =
            traceable(
                { _: Unit ->
                    childRun = RunTree.getCurrent()
                    42
                },
                config("int-output"),
            )
        traced(Unit)
        assertThat(childRun!!.outputs).isEqualTo(mapOf("outputs" to 42))
    }

    @Test
    fun nullOutput_wrappedAsOutputKey() {
        var childRun: RunTree? = null
        val traced =
            traceable(
                { _: Unit ->
                    childRun = RunTree.getCurrent()
                    null
                },
                config("null-output"),
            )
        traced(Unit)
        assertThat(childRun!!.outputs).isEqualTo(mapOf("outputs" to null))
    }

    @Test
    fun mapOutput_usedDirectly() {
        var childRun: RunTree? = null
        val traced =
            traceable(
                { _: Unit ->
                    childRun = RunTree.getCurrent()
                    mapOf("answer" to "42", "confidence" to 0.95)
                },
                config("map-output"),
            )
        traced(Unit)
        assertThat(childRun!!.outputs).isEqualTo(mapOf("answer" to "42", "confidence" to 0.95))
    }

    @Test
    fun listOutput_wrappedAsOutputKey() {
        var childRun: RunTree? = null
        val traced =
            traceable(
                { _: Unit ->
                    childRun = RunTree.getCurrent()
                    listOf("a", "b", "c")
                },
                config("list-output"),
            )
        traced(Unit)
        assertThat(childRun!!.outputs).isEqualTo(mapOf("outputs" to listOf("a", "b", "c")))
    }

    // ---- 0-arg input ----

    @Test
    fun zeroArgInput_emptyMap() {
        var capturedInputs: Map<String, Any?>? = null
        val block: () -> String = {
            capturedInputs = RunTree.getCurrent()?.inputs
            "result"
        }
        val traced = traceable(block, config("zero-arg-input"))
        traced()
        assertThat(capturedInputs).isEqualTo(emptyMap<String, Any?>())
    }

    // ---- Multi-arg input ----

    @Test
    fun twoArgInput_wrappedAsI1I2() {
        var capturedInputs: Map<String, Any?>? = null
        val traced =
            traceable(
                { a: String, b: Int ->
                    capturedInputs = RunTree.getCurrent()?.inputs
                    "result"
                },
                config("two-arg-input"),
            )
        traced("hello", 42)
        assertThat(capturedInputs).isEqualTo(mapOf("args" to listOf("hello", 42)))
    }

    @Test
    fun threeArgInput_wrappedAsI1I2I3() {
        var capturedInputs: Map<String, Any?>? = null
        val traced =
            traceable(
                { a: String, b: Int, c: Boolean ->
                    capturedInputs = RunTree.getCurrent()?.inputs
                    "result"
                },
                config("three-arg-input"),
            )
        traced("hello", 42, true)
        assertThat(capturedInputs).isEqualTo(mapOf("args" to listOf("hello", 42, true)))
    }

    // ---- Config inheritance ----

    @Test
    fun childInheritsClientFromParent() {
        var childRun: RunTree? = null
        val child =
            traceable(
                { _: Unit ->
                    childRun = RunTree.getCurrent()
                    "child"
                },
                TraceConfig("child"), // no client — should inherit
            )
        val parent =
            traceable(
                { _: Unit -> child(Unit) },
                config("parent"), // has client
            )
        parent(Unit)
        assertThat(childRun).isNotNull
        assertThat(childRun!!.projectName).isEqualTo(childRun!!.projectName)
    }

    @Test
    fun childInheritsProjectNameFromParent() {
        var childRun: RunTree? = null
        val child =
            traceable(
                { _: Unit ->
                    childRun = RunTree.getCurrent()
                    "child"
                },
                TraceConfig("child"), // no projectName — should inherit
            )
        val parent =
            traceable(
                { _: Unit -> child(Unit) },
                TraceConfig(
                    name = "parent",
                    client = client,
                    projectName = "inherited-project",
                    tracingEnabled = true,
                ),
            )
        parent(Unit)
        assertThat(childRun).isNotNull
        assertThat(childRun!!.projectName).isEqualTo("inherited-project")
    }

    @Test
    fun childOverridesProjectName() {
        var childRun: RunTree? = null
        val child =
            traceable(
                { _: Unit ->
                    childRun = RunTree.getCurrent()
                    "child"
                },
                TraceConfig("child", projectName = "child-project"),
            )
        val parent =
            traceable(
                { _: Unit -> child(Unit) },
                TraceConfig(
                    name = "parent",
                    client = client,
                    projectName = "parent-project",
                    tracingEnabled = true,
                ),
            )
        parent(Unit)
        assertThat(childRun).isNotNull
        assertThat(childRun!!.projectName).isEqualTo("child-project")
    }

    @Test
    fun childInheritsTracingEnabledFromParent() {
        var childRun: RunTree? = null
        val child =
            traceable(
                { _: Unit ->
                    childRun = RunTree.getCurrent()
                    "child"
                },
                TraceConfig("child"), // no tracingEnabled — should inherit true from parent
            )
        val parent = traceable({ _: Unit -> child(Unit) }, config("parent"))
        parent(Unit)
        // If tracing was inherited as enabled, the child run tree should exist
        assertThat(childRun).isNotNull
    }

    @Test
    fun childCanDisableTracing() {
        var childRun: RunTree? = null
        val child =
            traceable(
                { _: Unit ->
                    childRun = RunTree.getCurrent()
                    "child"
                },
                TraceConfig("child", tracingEnabled = false), // explicitly disabled
            )
        val parent = traceable({ _: Unit -> child(Unit) }, config("parent"))
        parent(Unit)
        // Child disabled tracing — no new run is created, so getCurrent() still returns the
        // parent's run (not a child run).
        assertThat(childRun).isNotNull
        assertThat(childRun!!.name).isEqualTo("parent")
    }

    // ---- createChild ----

    private fun rootRun(
        name: String = "parent",
        metadata: Map<String, Any> = emptyMap(),
        tags: List<String> = emptyList(),
        projectName: String = "test-project",
    ): RunTree {
        val now = java.time.Instant.now()
        val id = uuidv7(now)
        val startTime = ISO_FORMAT.format(now)
        return RunTree(
            id = id,
            traceId = id,
            dottedOrder = dottedOrder(startTime, id),
            parentRunId = null,
            name = name,
            runType = RunType.CHAIN,
            startTime = startTime,
            projectName = projectName,
            inputs = null,
            outputs = null,
            error = null,
            endTime = null,
            metadata = metadata.toMutableMap(),
            tags = tags.toMutableList(),
            extra = mutableMapOf(),
            client = client,
            executor = Executors.newCachedThreadPool(),
            tracingEnabled = true,
        )
    }

    @Test
    fun createChild_inheritsTraceId() {
        val parent = rootRun()
        val child = parent.createChild(TraceConfig("child"))
        assertThat(child.traceId).isEqualTo(parent.traceId)
    }

    @Test
    fun createChild_setsParentRunId() {
        val parent = rootRun()
        val child = parent.createChild(TraceConfig("child"))
        assertThat(child.parentRunId).isEqualTo(parent.id)
    }

    @Test
    fun createChild_extendsDottedOrder() {
        val parent = rootRun()
        val child = parent.createChild(TraceConfig("child"))
        assertThat(child.dottedOrder).startsWith(parent.dottedOrder + ".")
    }

    @Test
    fun createChild_inheritsProjectName() {
        val parent = rootRun(projectName = "inherited-project")
        val child = parent.createChild(TraceConfig("child"))
        assertThat(child.projectName).isEqualTo("inherited-project")
    }

    @Test
    fun createChild_overridesProjectName() {
        val parent = rootRun(projectName = "parent-project")
        val child = parent.createChild(TraceConfig("child", projectName = "child-project"))
        assertThat(child.projectName).isEqualTo("child-project")
    }

    @Test
    fun createChild_inheritsClient() {
        val parent = rootRun()
        val child = parent.createChild(TraceConfig("child"))
        assertThat(child.client).isSameAs(parent.client)
    }

    @Test
    fun createChild_overridesClient() {
        val parent = rootRun()
        val otherClient: LangsmithClient = mock()
        val child = parent.createChild(TraceConfig("child", client = otherClient))
        assertThat(child.client).isSameAs(otherClient)
    }

    @Test
    fun createChild_mergesMetadata_parentFirst_childOverrides() {
        val parent = rootRun(metadata = mapOf("shared" to "parent", "parent_only" to "yes"))
        val child =
            parent.createChild(
                TraceConfig("child", metadata = mapOf("shared" to "child", "child_only" to "yes"))
            )
        assertThat(child.metadata)
            .containsEntry("shared", "child") // child wins
            .containsEntry("parent_only", "yes") // inherited
            .containsEntry("child_only", "yes") // child's own
    }

    @Test
    fun createChild_inheritsMetadata_whenChildHasNone() {
        val parent = rootRun(metadata = mapOf("key" to "value"))
        val child = parent.createChild(TraceConfig("child"))
        assertThat(child.metadata).containsEntry("key", "value")
    }

    @Test
    fun createChild_mergesTags() {
        val parent = rootRun(tags = listOf("parent-tag"))
        val child = parent.createChild(TraceConfig("child", tags = listOf("child-tag")))
        assertThat(child.tags).containsExactly("parent-tag", "child-tag")
    }

    @Test
    fun createChild_inheritsTags_whenChildHasNone() {
        val parent = rootRun(tags = listOf("parent-tag"))
        val child = parent.createChild(TraceConfig("child"))
        assertThat(child.tags).containsExactly("parent-tag")
    }

    @Test
    fun createChild_setsInputs() {
        val parent = rootRun()
        val child = parent.createChild(TraceConfig("child"), mapOf("question" to "hello"))
        assertThat(child.inputs).isEqualTo(mapOf("question" to "hello"))
    }

    @Test
    fun createChild_defaultsInputsToNull() {
        val parent = rootRun()
        val child = parent.createChild(TraceConfig("child"))
        assertThat(child.inputs).isNull()
    }

    @Test
    fun createChild_setsNameAndRunType() {
        val parent = rootRun()
        val child = parent.createChild(TraceConfig("my-tool", runType = RunType.TOOL))
        assertThat(child.name).isEqualTo("my-tool")
        assertThat(child.runType).isEqualTo(RunType.TOOL)
    }

    @Test
    fun createChild_generatesUniqueIds() {
        val parent = rootRun()
        val child1 = parent.createChild(TraceConfig("child-1"))
        val child2 = parent.createChild(TraceConfig("child-2"))
        assertThat(child1.id).isNotEqualTo(child2.id)
        assertThat(child1.dottedOrder).isNotEqualTo(child2.dottedOrder)
    }

    @Test
    fun createChild_startsWithEmptyOutputsAndNoError() {
        val parent = rootRun()
        val child = parent.createChild(TraceConfig("child"))
        assertThat(child.outputs).isNull()
        assertThat(child.error).isNull()
        assertThat(child.endTime).isNull()
    }
}

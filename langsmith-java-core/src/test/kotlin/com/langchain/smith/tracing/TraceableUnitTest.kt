package com.langchain.smith.tracing

import com.langchain.smith.client.LangsmithClient
import java.util.function.Function
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.mockito.kotlin.mock

/**
 * Unit tests for [traceable] input/output serialization, config inheritance, and [createChild].
 * Uses a mock client so no API key is required.
 */
internal class TraceableUnitTest {

    private val client: LangsmithClient = mock()

    private fun config(name: String): TraceConfig<Any?, Any?> =
        TraceConfig(name = name, client = client, tracingEnabled = true)

    /** Shorthand for creating a [TraceConfig] without processors in tests. */
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

    // ---- Helpers ----

    /** Traces a 1-arg function, invokes it, and returns the captured [RunTree]. */
    private fun <I> traceAndCapture(input: I, name: String = "test"): RunTree {
        var run: RunTree? = null
        val traced =
            traceable(
                { _: I ->
                    run = getCurrentRunTree()
                    "result"
                },
                config(name),
            )
        traced(input)
        return run!!
    }

    /** Traces a function returning [output], invokes it, and returns the captured [RunTree]. */
    private fun <O> traceWithOutput(output: O, name: String = "test"): RunTree {
        var run: RunTree? = null
        val traced =
            traceable(
                { _: Unit ->
                    run = getCurrentRunTree()
                    output
                },
                config(name),
            )
        traced(Unit)
        return run!!
    }

    /**
     * Runs a parent→child nesting where the child uses [childConfig] and returns the child's
     * captured [RunTree].
     */
    private fun traceChild(childConfig: TraceConfig<Any?, Any?>): RunTree {
        var childRun: RunTree? = null
        val child =
            traceable(
                { _: Unit ->
                    childRun = getCurrentRunTree()
                    "child"
                },
                childConfig,
            )
        val parent = traceable({ _: Unit -> child(Unit) }, config("parent"))
        parent(Unit)
        return childRun!!
    }

    private fun rootRun(
        name: String = "parent",
        metadata: Map<String, Any> = emptyMap(),
        tags: List<String> = emptyList(),
        projectName: String = "test-project",
    ) =
        RunTree(
            name = name,
            metadata = metadata.toMutableMap(),
            tags = tags.toMutableList(),
            projectName = projectName,
            client = client,
        )

    // ---- Input serialization ----

    @Test
    fun stringInput_wrappedAsInputsKey() {
        assertThat(traceAndCapture("hello").inputs).isEqualTo(mapOf("inputs" to "hello"))
    }

    @Test
    fun intInput_wrappedAsInputsKey() {
        assertThat(traceAndCapture(42).inputs).isEqualTo(mapOf("inputs" to 42))
    }

    @Test
    fun listInput_wrappedAsInputsKey() {
        assertThat(traceAndCapture(listOf("a", "b")).inputs)
            .isEqualTo(mapOf("inputs" to listOf("a", "b")))
    }

    @Test
    fun mapInput_usedDirectly() {
        val input = mapOf("question" to "hello", "context" to "world")
        assertThat(traceAndCapture(input).inputs).isEqualTo(input)
    }

    @Test
    fun mapWithNonStringKeys_wrappedAsInputsKey() {
        assertThat(traceAndCapture(mapOf(1 to "a", 2 to "b")).inputs).containsKey("inputs")
    }

    @Test
    fun zeroArgInput_emptyMap() {
        var capturedInputs: Map<String, Any?>? = null
        val block: () -> String = {
            capturedInputs = getCurrentRunTree()?.inputs
            "result"
        }
        traceable(block, config("zero-arg"))()
        assertThat(capturedInputs).isEqualTo(emptyMap<String, Any?>())
    }

    @Test
    fun twoArgInput_wrappedAsArgs() {
        var capturedInputs: Map<String, Any?>? = null
        traceable(
            { a: String, b: Int ->
                capturedInputs = getCurrentRunTree()?.inputs
                "result"
            },
            config("two-arg"),
        )("hello", 42)
        assertThat(capturedInputs).isEqualTo(mapOf("args" to listOf("hello", 42)))
    }

    @Test
    fun threeArgInput_wrappedAsArgs() {
        var capturedInputs: Map<String, Any?>? = null
        traceable(
            { a: String, b: Int, c: Boolean ->
                capturedInputs = getCurrentRunTree()?.inputs
                "result"
            },
            config("three-arg"),
        )("hello", 42, true)
        assertThat(capturedInputs).isEqualTo(mapOf("args" to listOf("hello", 42, true)))
    }

    // ---- Output serialization ----

    @Test
    fun stringOutput_wrappedAsOutputsKey() {
        assertThat(traceWithOutput("hello world").outputs)
            .isEqualTo(mapOf("outputs" to "hello world"))
    }

    @Test
    fun intOutput_wrappedAsOutputsKey() {
        assertThat(traceWithOutput(42).outputs).isEqualTo(mapOf("outputs" to 42))
    }

    @Test
    fun nullOutput_wrappedAsOutputsKey() {
        assertThat(traceWithOutput(null).outputs).isEqualTo(mapOf("outputs" to null))
    }

    @Test
    fun mapOutput_usedDirectly() {
        val output = mapOf("answer" to "42", "confidence" to 0.95)
        assertThat(traceWithOutput(output).outputs).isEqualTo(output)
    }

    @Test
    fun listOutput_wrappedAsOutputsKey() {
        assertThat(traceWithOutput(listOf("a", "b", "c")).outputs)
            .isEqualTo(mapOf("outputs" to listOf("a", "b", "c")))
    }

    // ---- Config inheritance via traceable ----

    @Test
    fun childInheritsClientFromParent() {
        val childRun = traceChild(cfg("child"))
        assertThat(childRun.name).isEqualTo("child")
    }

    @Test
    fun childInheritsProjectNameFromParent() {
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
                cfg(
                    name = "parent",
                    client = client,
                    projectName = "inherited-project",
                    tracingEnabled = true,
                ),
            )
        parent(Unit)
        assertThat(childRun!!.projectName).isEqualTo("inherited-project")
    }

    @Test
    fun childOverridesProjectName() {
        var childRun: RunTree? = null
        val child =
            traceable(
                { _: Unit ->
                    childRun = getCurrentRunTree()
                    "child"
                },
                cfg("child", projectName = "child-project"),
            )
        val parent =
            traceable(
                { _: Unit -> child(Unit) },
                cfg(
                    name = "parent",
                    client = client,
                    projectName = "parent-project",
                    tracingEnabled = true,
                ),
            )
        parent(Unit)
        assertThat(childRun!!.projectName).isEqualTo("child-project")
    }

    @Test
    fun childInheritsTracingEnabledFromParent() {
        val childRun = traceChild(cfg("child"))
        assertThat(childRun.name).isEqualTo("child")
    }

    @Test
    fun childCanDisableTracing() {
        val childRun = traceChild(cfg("child", tracingEnabled = false))
        // Child disabled tracing — no new run is created, so getCurrentRunTree() returns parent.
        assertThat(childRun.name).isEqualTo("parent")
    }

    // ---- createChild ----

    @Test
    fun createChild_inheritsTraceId() {
        val parent = rootRun()
        val child = parent.createChild(cfg("child"))
        assertThat(child.traceId).isEqualTo(parent.traceId)
    }

    @Test
    fun createChild_setsParentRunId() {
        val parent = rootRun()
        assertThat(parent.createChild(cfg("child")).parentRunId).isEqualTo(parent.id)
    }

    @Test
    fun createChild_extendsDottedOrder() {
        val parent = rootRun()
        assertThat(parent.createChild(cfg("child")).dottedOrder)
            .startsWith(parent.dottedOrder + ".")
    }

    @Test
    fun createChild_inheritsProjectName() {
        val parent = rootRun(projectName = "inherited-project")
        assertThat(parent.createChild(cfg("child")).projectName).isEqualTo("inherited-project")
    }

    @Test
    fun createChild_overridesProjectName() {
        val parent = rootRun(projectName = "parent-project")
        assertThat(parent.createChild(cfg("child", projectName = "child-project")).projectName)
            .isEqualTo("child-project")
    }

    @Test
    fun createChild_inheritsClient() {
        val parent = rootRun()
        assertThat(parent.createChild(cfg("child")).client).isSameAs(parent.client)
    }

    @Test
    fun createChild_overridesClient() {
        val otherClient: LangsmithClient = mock()
        val child = rootRun().createChild(cfg("child", client = otherClient))
        assertThat(child.client).isSameAs(otherClient)
    }

    @Test
    fun createChild_mergesMetadata_parentFirst_childOverrides() {
        val parent = rootRun(metadata = mapOf("shared" to "parent", "parent_only" to "yes"))
        val child =
            parent.createChild(
                cfg("child", metadata = mapOf("shared" to "child", "child_only" to "yes"))
            )
        assertThat(child.metadata)
            .containsEntry("shared", "child")
            .containsEntry("parent_only", "yes")
            .containsEntry("child_only", "yes")
    }

    @Test
    fun createChild_inheritsMetadata_whenChildHasNone() {
        val parent = rootRun(metadata = mapOf("key" to "value"))
        assertThat(parent.createChild(cfg("child")).metadata).containsEntry("key", "value")
    }

    @Test
    fun createChild_mergesTags() {
        val parent = rootRun(tags = listOf("parent-tag"))
        assertThat(parent.createChild(cfg("child", tags = listOf("child-tag"))).tags)
            .containsExactly("parent-tag", "child-tag")
    }

    @Test
    fun createChild_inheritsTags_whenChildHasNone() {
        val parent = rootRun(tags = listOf("parent-tag"))
        assertThat(parent.createChild(cfg("child")).tags).containsExactly("parent-tag")
    }

    @Test
    fun createChild_defaultsInputsToNull() {
        assertThat(rootRun().createChild(cfg("child")).inputs).isNull()
    }

    @Test
    fun createChild_setsNameAndRunType() {
        val child = rootRun().createChild(cfg("my-tool", runType = RunType.TOOL))
        assertThat(child.name).isEqualTo("my-tool")
        assertThat(child.runType).isEqualTo(RunType.TOOL)
    }

    @Test
    fun createChild_generatesUniqueIds() {
        val parent = rootRun()
        val child1 = parent.createChild(cfg("child-1"))
        val child2 = parent.createChild(cfg("child-2"))
        assertThat(child1.id).isNotEqualTo(child2.id)
        assertThat(child1.dottedOrder).isNotEqualTo(child2.dottedOrder)
    }

    @Test
    fun createChild_startsWithEmptyOutputsAndNoError() {
        val child = rootRun().createChild(cfg("child"))
        assertThat(child.outputs).isNull()
        assertThat(child.error).isNull()
        assertThat(child.endTime).isNull()
    }

    // ---- processInputs / processOutputs ----

    @Test
    fun processInputs_receivesRawTypedInput() {
        var run: RunTree? = null
        val cfg =
            TraceConfig<String, String>(
                name = "test",
                client = client,
                tracingEnabled = true,
                processInputs = Function { input -> mapOf("query" to input) },
            )
        val traced =
            traceable(
                { _: String ->
                    run = getCurrentRunTree()
                    "ok"
                },
                cfg,
            )
        traced("hello")
        assertThat(run!!.inputs).isEqualTo(mapOf("query" to "hello"))
    }

    @Test
    fun processOutputs_receivesRawTypedOutput() {
        var run: RunTree? = null
        val cfg =
            TraceConfig<String, String>(
                name = "test",
                client = client,
                tracingEnabled = true,
                processOutputs = Function { output -> mapOf("answer" to output) },
            )
        val traced =
            traceable(
                { _: String ->
                    run = getCurrentRunTree()
                    "result"
                },
                cfg,
            )
        traced("hello")
        assertThat(run!!.outputs).isEqualTo(mapOf("answer" to "result"))
    }

    @Test
    fun processInputs_bypassesDefaultSerialization() {
        var run: RunTree? = null
        val cfg =
            TraceConfig<String, String>(
                name = "test",
                client = client,
                tracingEnabled = true,
                processInputs = Function { input -> mapOf("custom_key" to input) },
            )
        val traced =
            traceable(
                { _: String ->
                    run = getCurrentRunTree()
                    "ok"
                },
                cfg,
            )
        traced("hello")
        // Without processInputs, this would be {"inputs": "hello"}.
        assertThat(run!!.inputs).isEqualTo(mapOf("custom_key" to "hello"))
    }

    @Test
    fun processInputs_andProcessOutputs_bothApplied() {
        var run: RunTree? = null
        val cfg =
            TraceConfig<String, String>(
                name = "test",
                client = client,
                tracingEnabled = true,
                processInputs = Function { mapOf("q" to it) },
                processOutputs = Function { mapOf("a" to it) },
            )
        val traced =
            traceable(
                { _: String ->
                    run = getCurrentRunTree()
                    "answer"
                },
                cfg,
            )
        traced("question")
        assertThat(run!!.inputs).isEqualTo(mapOf("q" to "question"))
        assertThat(run!!.outputs).isEqualTo(mapOf("a" to "answer"))
    }

    @Test
    fun noProcessors_defaultSerializationUnchanged() {
        // Sanity check: without processors, behavior is identical to before.
        assertThat(traceAndCapture("hello").inputs).isEqualTo(mapOf("inputs" to "hello"))
        assertThat(traceWithOutput("world").outputs).isEqualTo(mapOf("outputs" to "world"))
    }
}

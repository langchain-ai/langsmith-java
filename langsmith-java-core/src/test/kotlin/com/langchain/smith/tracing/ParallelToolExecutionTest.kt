package com.langchain.smith.tracing

import com.langchain.smith.client.LangsmithClient
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.mockito.kotlin.mock

/**
 * Tests that tracing context can be propagated across thread boundaries via [TraceConfig.parent].
 *
 * Context is stored in a ThreadLocal/ScopedValue and does NOT automatically propagate to child
 * threads. [TraceConfig.parent] lets the user capture the parent [RunTree] on the originating
 * thread and pass it through the config so the child run is linked correctly even when
 * [getCurrentRunTree] returns null on the worker thread.
 */
internal class ParallelToolExecutionTest {

    private val client: LangsmithClient = mock()

    private fun config(name: String, parent: RunTree? = null): TraceConfig =
        TraceConfig.builder()
            .name(name)
            .client(client)
            .tracingEnabled(true)
            .apply { if (parent != null) parent(parent) }
            .build()

    // -- demonstrates the problem -------------------------------------------

    @Test
    fun `context is lost in child threads without propagation`() {
        val parentRun =
            RunTree(name = "parent", runType = RunType.CHAIN, client = client, projectName = "proj")
        val latch = CountDownLatch(1)
        var childRun: RunTree? = null

        CURRENT_RUN.runWith(parentRun) {
            Thread {
                    // No context on this thread — creates a detached root
                    val traced =
                        traceable(
                            { _: String ->
                                childRun = getCurrentRunTree()
                                "ok"
                            },
                            config("tool"),
                        )
                    traced("in")
                    latch.countDown()
                }
                .start()
        }
        latch.await(5, TimeUnit.SECONDS)

        // The child run exists but is a root — not linked to the parent
        assertThat(childRun).isNotNull
        assertThat(childRun!!.parentRunId).isNull()
        assertThat(childRun!!.traceId).isNotEqualTo(parentRun.traceId)
    }

    // -- TraceConfig.parent fixes it ----------------------------------------

    @Test
    fun `TraceConfig parent links child run across threads`() {
        val parentRun =
            RunTree(name = "parent", runType = RunType.CHAIN, client = client, projectName = "proj")
        val childRuns = ConcurrentHashMap<String, RunTree>()
        val latch = CountDownLatch(2)

        CURRENT_RUN.runWith(parentRun) {
            val parent = getCurrentRunTree()!!

            Thread {
                    traceable(
                        { _: String ->
                            childRuns["t1"] = getCurrentRunTree()!!
                            "r1"
                        },
                        config("tool-1", parent),
                    )("in")
                    latch.countDown()
                }
                .start()

            Thread {
                    traceable(
                        { _: String ->
                            childRuns["t2"] = getCurrentRunTree()!!
                            "r2"
                        },
                        config("tool-2", parent),
                    )("in")
                    latch.countDown()
                }
                .start()
        }
        latch.await(5, TimeUnit.SECONDS)

        assertThat(childRuns["t1"]?.parentRunId).isEqualTo(parentRun.id)
        assertThat(childRuns["t2"]?.parentRunId).isEqualTo(parentRun.id)
        assertThat(childRuns["t1"]?.traceId).isEqualTo(parentRun.traceId)
        assertThat(childRuns["t2"]?.traceId).isEqualTo(parentRun.traceId)
    }

    @Test
    fun `thread-local context takes precedence over config parent`() {
        val outerParent =
            RunTree(name = "outer", runType = RunType.CHAIN, client = client, projectName = "proj")
        val innerParent =
            RunTree(name = "inner", runType = RunType.CHAIN, client = client, projectName = "proj")
        var childRun: RunTree? = null

        // innerParent is set on the thread; outerParent is in the config
        CURRENT_RUN.runWith(innerParent) {
            traceable(
                { _: String ->
                    childRun = getCurrentRunTree()
                    "ok"
                },
                config("tool", outerParent),
            )("in")
        }

        // Thread-local (innerParent) wins
        assertThat(childRun!!.parentRunId).isEqualTo(innerParent.id)
    }

    @Test
    fun `error is captured on child run across thread boundary`() {
        val parentRun =
            RunTree(name = "parent", runType = RunType.CHAIN, client = client, projectName = "proj")
        val childRuns = ConcurrentHashMap<String, RunTree>()
        val latch = CountDownLatch(2)

        CURRENT_RUN.runWith(parentRun) {
            val parent = getCurrentRunTree()!!

            Thread {
                    try {
                        traceable(
                            { _: String ->
                                childRuns["fail"] = getCurrentRunTree()!!
                                throw RuntimeException("boom")
                            },
                            config("failing-tool", parent),
                        )("in")
                    } catch (_: Exception) {}
                    latch.countDown()
                }
                .start()

            Thread {
                    traceable(
                        { _: String ->
                            childRuns["ok"] = getCurrentRunTree()!!
                            "done"
                        },
                        config("ok-tool", parent),
                    )("in")
                    latch.countDown()
                }
                .start()
        }
        latch.await(5, TimeUnit.SECONDS)

        assertThat(childRuns["fail"]?.parentRunId).isEqualTo(parentRun.id)
        assertThat(childRuns["fail"]?.error).contains("boom")
        assertThat(childRuns["ok"]?.error).isNull()
    }
}

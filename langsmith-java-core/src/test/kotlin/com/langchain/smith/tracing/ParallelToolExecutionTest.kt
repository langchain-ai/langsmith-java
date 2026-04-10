package com.langchain.smith.tracing

import com.langchain.smith.client.LangsmithClient
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.mockito.kotlin.mock

/**
 * Tests for [TraceConfig.parent] — explicit parent override for cross-thread context propagation
 * and forced root traces.
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

    // -- builder three-state semantics ---------------------------------------

    @Test
    fun `builder parent not called leaves AUTO`() {
        val cfg = TraceConfig.builder().name("test").client(client).build()
        assertThat(cfg.parent).isSameAs(ParentConfig.AUTO)
        assertThat(cfg.parent.isExplicit).isFalse()
    }

    @Test
    fun `builder parent with RunTree is explicit with that run`() {
        val run = RunTree(name = "p", runType = RunType.CHAIN, client = client)
        val cfg = TraceConfig.builder().name("test").client(client).parent(run).build()
        assertThat(cfg.parent.isExplicit).isTrue()
        assertThat(cfg.parent.runTree).isSameAs(run)
    }

    @Test
    fun `builder parent with null is explicit with no run`() {
        val cfg = TraceConfig.builder().name("test").client(client).parent(null).build()
        assertThat(cfg.parent.isExplicit).isTrue()
        assertThat(cfg.parent.runTree).isNull()
    }

    // -- demonstrates the problem -------------------------------------------

    @Test
    fun `context is lost in child threads without propagation`() {
        val parentRun =
            RunTree(name = "parent", runType = RunType.CHAIN, client = client, projectName = "proj")
        val latch = CountDownLatch(1)
        var childRun: RunTree? = null

        CURRENT_RUN.runWith(parentRun) {
            Thread {
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

        assertThat(childRun).isNotNull
        assertThat(childRun!!.parentRunId).isNull()
        assertThat(childRun!!.traceId).isNotEqualTo(parentRun.traceId)
    }

    // -- config.parent fixes it ---------------------------------------------

    @Test
    fun `config parent links child run across threads`() {
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
    fun `explicit config parent overrides thread-local context`() {
        val threadLocalParent =
            RunTree(name = "tl", runType = RunType.CHAIN, client = client, projectName = "proj")
        val explicitParent =
            RunTree(
                name = "explicit",
                runType = RunType.CHAIN,
                client = client,
                projectName = "proj",
            )
        var childRun: RunTree? = null

        CURRENT_RUN.runWith(threadLocalParent) {
            traceable(
                { _: String ->
                    childRun = getCurrentRunTree()
                    "ok"
                },
                config("tool", explicitParent),
            )("in")
        }

        // Explicit parent wins over thread-local
        assertThat(childRun!!.parentRunId).isEqualTo(explicitParent.id)
    }

    // -- parent(null) forces new root ----------------------------------------

    @Test
    fun `parent null forces a root trace even with active context`() {
        val parentRun =
            RunTree(name = "parent", runType = RunType.CHAIN, client = client, projectName = "proj")
        var childRun: RunTree? = null

        val rootConfig =
            TraceConfig.builder()
                .name("independent")
                .client(client)
                .tracingEnabled(true)
                .parent(null)
                .build()

        CURRENT_RUN.runWith(parentRun) {
            traceable(
                { _: String ->
                    childRun = getCurrentRunTree()
                    "ok"
                },
                rootConfig,
            )("in")
        }

        // Should be a root — not linked to parentRun
        assertThat(childRun).isNotNull
        assertThat(childRun!!.parentRunId).isNull()
        assertThat(childRun!!.traceId).isNotEqualTo(parentRun.traceId)
    }

    // -- error capture across threads ---------------------------------------

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

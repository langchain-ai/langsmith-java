package com.langchain.smith.tracing

import com.langchain.smith.testutils.CapturingLangsmithClient
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunTreeTest {

    @Test
    fun `patchRun omits inputs by default`() {
        val capture = CapturingLangsmithClient()
        val executor = Executors.newSingleThreadExecutor()
        val run =
            RunTree.builder()
                .name("test")
                .inputs(mapOf("question" to "hello"))
                .outputs(mapOf("answer" to "world"))
                .client(capture.client)
                .executor(executor)
                .build()

        run.patchRun()
        executor.shutdown()
        assertThat(executor.awaitTermination(5, TimeUnit.SECONDS)).isTrue()

        assertThat(capture.patchedRuns).hasSize(1)
        assertThat(capture.patchedRuns.single().inputs().isPresent).isFalse()
    }

    @Test
    fun `patchRun can include inputs when requested`() {
        val capture = CapturingLangsmithClient()
        val executor = Executors.newSingleThreadExecutor()
        val run =
            RunTree.builder()
                .name("test")
                .inputs(mapOf("question" to "hello"))
                .client(capture.client)
                .executor(executor)
                .build()

        run.patchRun(excludeInputs = false)
        executor.shutdown()
        assertThat(executor.awaitTermination(5, TimeUnit.SECONDS)).isTrue()

        assertThat(capture.patchedRuns).hasSize(1)
        assertThat(
                capture.patchedRuns
                    .single()
                    .inputs()
                    .get()
                    ._additionalProperties()["question"]
                    ?.asString()
                    ?.getOrNull()
            )
            .isEqualTo("hello")
    }
}

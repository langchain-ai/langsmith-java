// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.datasets.playgroundexperiment

import com.langsmith_api.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlaygroundExperimentStreamParamsTest {

    @Test
    fun create() {
        PlaygroundExperimentStreamParams.builder()
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .manifest(JsonValue.from(mapOf<String, Any>()))
            .options(
                RunnableConfig.builder()
                    .callbacksOfJsonValues(listOf(JsonValue.from(mapOf<String, Any>())))
                    .configurable(JsonValue.from(mapOf<String, Any>()))
                    .maxConcurrency(0L)
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .recursionLimit(0L)
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runName("run_name")
                    .addTag("string")
                    .build()
            )
            .projectName("project_name")
            .secrets(
                PlaygroundExperimentStreamParams.Secrets.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .commit("commit")
            .addDatasetSplit("string")
            .addEvaluatorRule("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .owner("owner")
            .parallelToolCalls(true)
            .repetitions(1L)
            .repoHandle("repo_handle")
            .repoId("repo_id")
            .requestsPerSecond(0L)
            .runId("run_id")
            .runnerContext(RunnerContextEnum.LANGSMITH_UI)
            .toolChoice("tool_choice")
            .addTool(JsonValue.from(mapOf<String, Any>()))
            .useOrFallbackToWorkspaceSecrets(true)
            .build()
    }

    @Test
    fun body() {
        val params =
            PlaygroundExperimentStreamParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .manifest(JsonValue.from(mapOf<String, Any>()))
                .options(
                    RunnableConfig.builder()
                        .callbacksOfJsonValues(listOf(JsonValue.from(mapOf<String, Any>())))
                        .configurable(JsonValue.from(mapOf<String, Any>()))
                        .maxConcurrency(0L)
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .recursionLimit(0L)
                        .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .runName("run_name")
                        .addTag("string")
                        .build()
                )
                .projectName("project_name")
                .secrets(
                    PlaygroundExperimentStreamParams.Secrets.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .commit("commit")
                .addDatasetSplit("string")
                .addEvaluatorRule("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .owner("owner")
                .parallelToolCalls(true)
                .repetitions(1L)
                .repoHandle("repo_handle")
                .repoId("repo_id")
                .requestsPerSecond(0L)
                .runId("run_id")
                .runnerContext(RunnerContextEnum.LANGSMITH_UI)
                .toolChoice("tool_choice")
                .addTool(JsonValue.from(mapOf<String, Any>()))
                .useOrFallbackToWorkspaceSecrets(true)
                .build()

        val body = params._body()

        assertThat(body.datasetId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body._manifest()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.options())
            .isEqualTo(
                RunnableConfig.builder()
                    .callbacksOfJsonValues(listOf(JsonValue.from(mapOf<String, Any>())))
                    .configurable(JsonValue.from(mapOf<String, Any>()))
                    .maxConcurrency(0L)
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .recursionLimit(0L)
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runName("run_name")
                    .addTag("string")
                    .build()
            )
        assertThat(body.projectName()).isEqualTo("project_name")
        assertThat(body.secrets())
            .isEqualTo(
                PlaygroundExperimentStreamParams.Secrets.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.commit()).contains("commit")
        assertThat(body.datasetSplits().getOrNull()).containsExactly("string")
        assertThat(body.evaluatorRules().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.owner()).contains("owner")
        assertThat(body.parallelToolCalls()).contains(true)
        assertThat(body.repetitions()).contains(1L)
        assertThat(body.repoHandle()).contains("repo_handle")
        assertThat(body.repoId()).contains("repo_id")
        assertThat(body.requestsPerSecond()).contains(0L)
        assertThat(body.runId()).contains("run_id")
        assertThat(body.runnerContext()).contains(RunnerContextEnum.LANGSMITH_UI)
        assertThat(body.toolChoice()).contains("tool_choice")
        assertThat(body.tools().getOrNull()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.useOrFallbackToWorkspaceSecrets()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PlaygroundExperimentStreamParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .manifest(JsonValue.from(mapOf<String, Any>()))
                .options(RunnableConfig.builder().build())
                .projectName("project_name")
                .secrets(
                    PlaygroundExperimentStreamParams.Secrets.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.datasetId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body._manifest()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.options()).isEqualTo(RunnableConfig.builder().build())
        assertThat(body.projectName()).isEqualTo("project_name")
        assertThat(body.secrets())
            .isEqualTo(
                PlaygroundExperimentStreamParams.Secrets.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }
}

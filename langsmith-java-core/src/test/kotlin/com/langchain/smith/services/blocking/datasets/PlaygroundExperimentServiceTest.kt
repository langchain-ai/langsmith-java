// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.datasets

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.datasets.playgroundexperiment.PlaygroundExperimentBatchParams
import com.langchain.smith.models.datasets.playgroundexperiment.PlaygroundExperimentStreamParams
import com.langchain.smith.models.datasets.playgroundexperiment.RunnableConfig
import com.langchain.smith.models.datasets.playgroundexperiment.RunnerContextEnum
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PlaygroundExperimentServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun batch() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val playgroundExperimentService = client.datasets().playgroundExperiment()

        val response =
            playgroundExperimentService.batch(
                PlaygroundExperimentBatchParams.builder()
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
                        PlaygroundExperimentBatchParams.Secrets.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .batchSize(1L)
                    .commit("commit")
                    .addDatasetSplit("string")
                    .addEvaluatorRule("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .metadata(JsonValue.from(mapOf<String, Any>()))
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
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun stream() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val playgroundExperimentService = client.datasets().playgroundExperiment()

        val response =
            playgroundExperimentService.stream(
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
                    .metadata(JsonValue.from(mapOf<String, Any>()))
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
            )

        response.validate()
    }
}

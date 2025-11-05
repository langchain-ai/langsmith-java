// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RepoOptimizeJobParamsTest {

    @Test
    fun create() {
        RepoOptimizeJobParams.builder()
            .algorithm(EPromptOptimizationAlgorithm.PROMPTIM)
            .config(
                PromptimConfig.builder()
                    .autoCommit(true)
                    .datasetName("dataset_name")
                    .devSplit("dev_split")
                    .addEvaluator("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .messageIndex(0L)
                    .numEpochs(0L)
                    .taskDescription("task_description")
                    .testSplit("test_split")
                    .trainSplit("train_split")
                    .build()
            )
            .promptName("prompt_name")
            .build()
    }

    @Test
    fun body() {
        val params =
            RepoOptimizeJobParams.builder()
                .algorithm(EPromptOptimizationAlgorithm.PROMPTIM)
                .config(
                    PromptimConfig.builder()
                        .autoCommit(true)
                        .datasetName("dataset_name")
                        .devSplit("dev_split")
                        .addEvaluator("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .messageIndex(0L)
                        .numEpochs(0L)
                        .taskDescription("task_description")
                        .testSplit("test_split")
                        .trainSplit("train_split")
                        .build()
                )
                .promptName("prompt_name")
                .build()

        val body = params._body()

        assertThat(body.algorithm()).isEqualTo(EPromptOptimizationAlgorithm.PROMPTIM)
        assertThat(body.config())
            .isEqualTo(
                RepoOptimizeJobParams.Config.ofPromptim(
                    PromptimConfig.builder()
                        .autoCommit(true)
                        .datasetName("dataset_name")
                        .devSplit("dev_split")
                        .addEvaluator("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .messageIndex(0L)
                        .numEpochs(0L)
                        .taskDescription("task_description")
                        .testSplit("test_split")
                        .trainSplit("train_split")
                        .build()
                )
            )
        assertThat(body.promptName()).isEqualTo("prompt_name")
    }
}

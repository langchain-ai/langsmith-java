// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos.optimizationjobs

import com.langchain.smith.models.repos.EPromptOptimizationAlgorithm
import com.langchain.smith.models.repos.PromptimConfig
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OptimizationJobOptimizationJobsParamsTest {

    @Test
    fun create() {
        OptimizationJobOptimizationJobsParams.builder()
            .owner("owner")
            .repo("repo")
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
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            OptimizationJobOptimizationJobsParams.builder()
                .owner("owner")
                .repo("repo")
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
                .build()

        assertThat(params._pathParam(0)).isEqualTo("owner")
        assertThat(params._pathParam(1)).isEqualTo("repo")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            OptimizationJobOptimizationJobsParams.builder()
                .owner("owner")
                .repo("repo")
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
                .build()

        val body = params._body()

        assertThat(body.algorithm()).isEqualTo(EPromptOptimizationAlgorithm.PROMPTIM)
        assertThat(body.config())
            .isEqualTo(
                OptimizationJobOptimizationJobsParams.Config.ofPromptim(
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
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos.optimizationjobs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import com.langchain.smith.models.repos.EPromptOptimizationAlgorithm
import com.langchain.smith.models.repos.PromptimConfig
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PromptOptimizationJobTest {

    @Test
    fun create() {
        val promptOptimizationJob =
            PromptOptimizationJob.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .repoId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(EPromptOptimizationJobStatus.CREATED)
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    PromptOptimizationResult.builder()
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .x(0.0)
                        .y(0.0)
                        .build()
                )
                .build()

        assertThat(promptOptimizationJob.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(promptOptimizationJob.algorithm())
            .isEqualTo(EPromptOptimizationAlgorithm.PROMPTIM)
        assertThat(promptOptimizationJob.config())
            .isEqualTo(
                PromptOptimizationJob.Config.ofPromptim(
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
        assertThat(promptOptimizationJob.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(promptOptimizationJob.repoId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(promptOptimizationJob.status()).isEqualTo(EPromptOptimizationJobStatus.CREATED)
        assertThat(promptOptimizationJob.tenantId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(promptOptimizationJob.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(promptOptimizationJob.results().getOrNull())
            .containsExactly(
                PromptOptimizationResult.builder()
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .x(0.0)
                    .y(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val promptOptimizationJob =
            PromptOptimizationJob.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .repoId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(EPromptOptimizationJobStatus.CREATED)
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    PromptOptimizationResult.builder()
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .x(0.0)
                        .y(0.0)
                        .build()
                )
                .build()

        val roundtrippedPromptOptimizationJob =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(promptOptimizationJob),
                jacksonTypeRef<PromptOptimizationJob>(),
            )

        assertThat(roundtrippedPromptOptimizationJob).isEqualTo(promptOptimizationJob)
    }
}

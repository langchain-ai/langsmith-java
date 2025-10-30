// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.repos.optimizationjobs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import com.langsmith_api.api.models.api.v1.repos.EPromptOptimizationAlgorithm
import com.langsmith_api.api.models.api.v1.repos.PromptimConfig
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.logs.EPromptOptimizationJobLogType
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.logs.PromptOptimizationJobLog
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OptimizationJobRetrieveResponseTest {

    @Test
    fun create() {
        val optimizationJobRetrieveResponse =
            OptimizationJobRetrieveResponse.builder()
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
                .addLog(
                    PromptOptimizationJobLog.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .logType(EPromptOptimizationJobLogType.INFO)
                        .message("message")
                        .data(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
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

        assertThat(optimizationJobRetrieveResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(optimizationJobRetrieveResponse.algorithm())
            .isEqualTo(EPromptOptimizationAlgorithm.PROMPTIM)
        assertThat(optimizationJobRetrieveResponse.config())
            .isEqualTo(
                OptimizationJobRetrieveResponse.Config.ofPromptim(
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
        assertThat(optimizationJobRetrieveResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(optimizationJobRetrieveResponse.logs())
            .containsExactly(
                PromptOptimizationJobLog.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .logType(EPromptOptimizationJobLogType.INFO)
                    .message("message")
                    .data(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(optimizationJobRetrieveResponse.repoId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(optimizationJobRetrieveResponse.status())
            .isEqualTo(EPromptOptimizationJobStatus.CREATED)
        assertThat(optimizationJobRetrieveResponse.tenantId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(optimizationJobRetrieveResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(optimizationJobRetrieveResponse.results().getOrNull())
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
        val optimizationJobRetrieveResponse =
            OptimizationJobRetrieveResponse.builder()
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
                .addLog(
                    PromptOptimizationJobLog.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .logType(EPromptOptimizationJobLogType.INFO)
                        .message("message")
                        .data(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
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

        val roundtrippedOptimizationJobRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(optimizationJobRetrieveResponse),
                jacksonTypeRef<OptimizationJobRetrieveResponse>(),
            )

        assertThat(roundtrippedOptimizationJobRetrieveResponse)
            .isEqualTo(optimizationJobRetrieveResponse)
    }
}

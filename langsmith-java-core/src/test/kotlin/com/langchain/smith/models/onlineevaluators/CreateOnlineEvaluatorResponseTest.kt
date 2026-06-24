// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateOnlineEvaluatorResponseTest {

    @Test
    fun create() {
        val createOnlineEvaluatorResponse =
            CreateOnlineEvaluatorResponse.builder()
                .evaluator(
                    OnlineEvaluator.builder()
                        .id("id")
                        .codeEvaluator(
                            OnlineCodeEvaluator.builder()
                                .code("code")
                                .evaluatorId("evaluator_id")
                                .language("language")
                                .build()
                        )
                        .createdAt("created_at")
                        .createdBy("created_by")
                        .addFeedbackKey("string")
                        .llmEvaluator(
                            OnlineLlmEvaluator.builder()
                                .annotationQueueId("annotation_queue_id")
                                .commitHashOrTag("commit_hash_or_tag")
                                .correctionsDatasetId("corrections_dataset_id")
                                .evaluatorId("evaluator_id")
                                .numFewShotExamples(0L)
                                .promptId("prompt_id")
                                .promptRepoHandle("prompt_repo_handle")
                                .useCorrectionsDataset(true)
                                .variableMapping(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .name("name")
                        .addRunRule(
                            OnlineEvaluatorRunRule.builder()
                                .id("id")
                                .correctionsDatasetId("corrections_dataset_id")
                                .datasetId("dataset_id")
                                .datasetName("dataset_name")
                                .groupBy("group_by")
                                .numFewShotExamples(0L)
                                .sessionId("session_id")
                                .sessionName("session_name")
                                .spendLimit(
                                    OnlineSpendLimit.builder()
                                        .limitUsd(0.0)
                                        .utilizationPct(0.0)
                                        .window("window")
                                        .build()
                                )
                                .spendUsd(0.0)
                                .traceCount(0L)
                                .useCorrectionsDataset(true)
                                .build()
                        )
                        .tenantId("tenant_id")
                        .type(OnlineEvaluatorType.LLM)
                        .updatedAt("updated_at")
                        .build()
                )
                .build()

        assertThat(createOnlineEvaluatorResponse.evaluator())
            .contains(
                OnlineEvaluator.builder()
                    .id("id")
                    .codeEvaluator(
                        OnlineCodeEvaluator.builder()
                            .code("code")
                            .evaluatorId("evaluator_id")
                            .language("language")
                            .build()
                    )
                    .createdAt("created_at")
                    .createdBy("created_by")
                    .addFeedbackKey("string")
                    .llmEvaluator(
                        OnlineLlmEvaluator.builder()
                            .annotationQueueId("annotation_queue_id")
                            .commitHashOrTag("commit_hash_or_tag")
                            .correctionsDatasetId("corrections_dataset_id")
                            .evaluatorId("evaluator_id")
                            .numFewShotExamples(0L)
                            .promptId("prompt_id")
                            .promptRepoHandle("prompt_repo_handle")
                            .useCorrectionsDataset(true)
                            .variableMapping(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .name("name")
                    .addRunRule(
                        OnlineEvaluatorRunRule.builder()
                            .id("id")
                            .correctionsDatasetId("corrections_dataset_id")
                            .datasetId("dataset_id")
                            .datasetName("dataset_name")
                            .groupBy("group_by")
                            .numFewShotExamples(0L)
                            .sessionId("session_id")
                            .sessionName("session_name")
                            .spendLimit(
                                OnlineSpendLimit.builder()
                                    .limitUsd(0.0)
                                    .utilizationPct(0.0)
                                    .window("window")
                                    .build()
                            )
                            .spendUsd(0.0)
                            .traceCount(0L)
                            .useCorrectionsDataset(true)
                            .build()
                    )
                    .tenantId("tenant_id")
                    .type(OnlineEvaluatorType.LLM)
                    .updatedAt("updated_at")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createOnlineEvaluatorResponse =
            CreateOnlineEvaluatorResponse.builder()
                .evaluator(
                    OnlineEvaluator.builder()
                        .id("id")
                        .codeEvaluator(
                            OnlineCodeEvaluator.builder()
                                .code("code")
                                .evaluatorId("evaluator_id")
                                .language("language")
                                .build()
                        )
                        .createdAt("created_at")
                        .createdBy("created_by")
                        .addFeedbackKey("string")
                        .llmEvaluator(
                            OnlineLlmEvaluator.builder()
                                .annotationQueueId("annotation_queue_id")
                                .commitHashOrTag("commit_hash_or_tag")
                                .correctionsDatasetId("corrections_dataset_id")
                                .evaluatorId("evaluator_id")
                                .numFewShotExamples(0L)
                                .promptId("prompt_id")
                                .promptRepoHandle("prompt_repo_handle")
                                .useCorrectionsDataset(true)
                                .variableMapping(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .name("name")
                        .addRunRule(
                            OnlineEvaluatorRunRule.builder()
                                .id("id")
                                .correctionsDatasetId("corrections_dataset_id")
                                .datasetId("dataset_id")
                                .datasetName("dataset_name")
                                .groupBy("group_by")
                                .numFewShotExamples(0L)
                                .sessionId("session_id")
                                .sessionName("session_name")
                                .spendLimit(
                                    OnlineSpendLimit.builder()
                                        .limitUsd(0.0)
                                        .utilizationPct(0.0)
                                        .window("window")
                                        .build()
                                )
                                .spendUsd(0.0)
                                .traceCount(0L)
                                .useCorrectionsDataset(true)
                                .build()
                        )
                        .tenantId("tenant_id")
                        .type(OnlineEvaluatorType.LLM)
                        .updatedAt("updated_at")
                        .build()
                )
                .build()

        val roundtrippedCreateOnlineEvaluatorResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createOnlineEvaluatorResponse),
                jacksonTypeRef<CreateOnlineEvaluatorResponse>(),
            )

        assertThat(roundtrippedCreateOnlineEvaluatorResponse)
            .isEqualTo(createOnlineEvaluatorResponse)
    }
}

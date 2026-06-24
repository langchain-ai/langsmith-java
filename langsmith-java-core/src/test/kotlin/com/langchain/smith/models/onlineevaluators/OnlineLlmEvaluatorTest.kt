// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnlineLlmEvaluatorTest {

    @Test
    fun create() {
        val onlineLlmEvaluator =
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

        assertThat(onlineLlmEvaluator.annotationQueueId()).contains("annotation_queue_id")
        assertThat(onlineLlmEvaluator.commitHashOrTag()).contains("commit_hash_or_tag")
        assertThat(onlineLlmEvaluator.correctionsDatasetId()).contains("corrections_dataset_id")
        assertThat(onlineLlmEvaluator.evaluatorId()).contains("evaluator_id")
        assertThat(onlineLlmEvaluator.numFewShotExamples()).contains(0L)
        assertThat(onlineLlmEvaluator.promptId()).contains("prompt_id")
        assertThat(onlineLlmEvaluator.promptRepoHandle()).contains("prompt_repo_handle")
        assertThat(onlineLlmEvaluator.useCorrectionsDataset()).contains(true)
        assertThat(onlineLlmEvaluator._variableMapping())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val onlineLlmEvaluator =
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

        val roundtrippedOnlineLlmEvaluator =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(onlineLlmEvaluator),
                jacksonTypeRef<OnlineLlmEvaluator>(),
            )

        assertThat(roundtrippedOnlineLlmEvaluator).isEqualTo(onlineLlmEvaluator)
    }
}

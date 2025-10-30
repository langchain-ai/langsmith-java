// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PromptimConfigTest {

    @Test
    fun create() {
        val promptimConfig =
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

        assertThat(promptimConfig.autoCommit()).isEqualTo(true)
        assertThat(promptimConfig.datasetName()).isEqualTo("dataset_name")
        assertThat(promptimConfig.devSplit()).contains("dev_split")
        assertThat(promptimConfig.evaluators())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(promptimConfig.messageIndex()).isEqualTo(0L)
        assertThat(promptimConfig.numEpochs()).isEqualTo(0L)
        assertThat(promptimConfig.taskDescription()).isEqualTo("task_description")
        assertThat(promptimConfig.testSplit()).contains("test_split")
        assertThat(promptimConfig.trainSplit()).contains("train_split")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val promptimConfig =
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

        val roundtrippedPromptimConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(promptimConfig),
                jacksonTypeRef<PromptimConfig>(),
            )

        assertThat(roundtrippedPromptimConfig).isEqualTo(promptimConfig)
    }
}

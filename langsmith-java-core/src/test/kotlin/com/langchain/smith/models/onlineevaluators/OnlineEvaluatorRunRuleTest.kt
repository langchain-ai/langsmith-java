// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnlineEvaluatorRunRuleTest {

    @Test
    fun create() {
        val onlineEvaluatorRunRule =
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

        assertThat(onlineEvaluatorRunRule.id()).contains("id")
        assertThat(onlineEvaluatorRunRule.correctionsDatasetId()).contains("corrections_dataset_id")
        assertThat(onlineEvaluatorRunRule.datasetId()).contains("dataset_id")
        assertThat(onlineEvaluatorRunRule.datasetName()).contains("dataset_name")
        assertThat(onlineEvaluatorRunRule.groupBy()).contains("group_by")
        assertThat(onlineEvaluatorRunRule.numFewShotExamples()).contains(0L)
        assertThat(onlineEvaluatorRunRule.sessionId()).contains("session_id")
        assertThat(onlineEvaluatorRunRule.sessionName()).contains("session_name")
        assertThat(onlineEvaluatorRunRule.spendLimit())
            .contains(
                OnlineSpendLimit.builder()
                    .limitUsd(0.0)
                    .utilizationPct(0.0)
                    .window("window")
                    .build()
            )
        assertThat(onlineEvaluatorRunRule.spendUsd()).contains(0.0)
        assertThat(onlineEvaluatorRunRule.traceCount()).contains(0L)
        assertThat(onlineEvaluatorRunRule.useCorrectionsDataset()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val onlineEvaluatorRunRule =
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

        val roundtrippedOnlineEvaluatorRunRule =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(onlineEvaluatorRunRule),
                jacksonTypeRef<OnlineEvaluatorRunRule>(),
            )

        assertThat(roundtrippedOnlineEvaluatorRunRule).isEqualTo(onlineEvaluatorRunRule)
    }
}

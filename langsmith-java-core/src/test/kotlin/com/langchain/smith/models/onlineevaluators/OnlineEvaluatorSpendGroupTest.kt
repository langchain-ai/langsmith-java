// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnlineEvaluatorSpendGroupTest {

    @Test
    fun create() {
        val onlineEvaluatorSpendGroup =
            OnlineEvaluatorSpendGroup.builder()
                .datasetId("dataset_id")
                .datasetName("dataset_name")
                .addDay(
                    OnlineEvaluatorSpendDay.builder()
                        .date("date")
                        .spendUsd(0.0)
                        .traceCount(0L)
                        .build()
                )
                .evaluatorId("evaluator_id")
                .evaluatorName("evaluator_name")
                .prevTotalSpendUsd(0.0)
                .prevTotalTraceCount(0L)
                .runRuleId("run_rule_id")
                .runRuleName("run_rule_name")
                .sessionId("session_id")
                .sessionName("session_name")
                .spendLimit(
                    OnlineSpendLimit.builder()
                        .limitUsd(0.0)
                        .utilizationPct(0.0)
                        .window("window")
                        .build()
                )
                .totalSpendUsd(0.0)
                .totalTraceCount(0L)
                .build()

        assertThat(onlineEvaluatorSpendGroup.datasetId()).contains("dataset_id")
        assertThat(onlineEvaluatorSpendGroup.datasetName()).contains("dataset_name")
        assertThat(onlineEvaluatorSpendGroup.days().getOrNull())
            .containsExactly(
                OnlineEvaluatorSpendDay.builder().date("date").spendUsd(0.0).traceCount(0L).build()
            )
        assertThat(onlineEvaluatorSpendGroup.evaluatorId()).contains("evaluator_id")
        assertThat(onlineEvaluatorSpendGroup.evaluatorName()).contains("evaluator_name")
        assertThat(onlineEvaluatorSpendGroup.prevTotalSpendUsd()).contains(0.0)
        assertThat(onlineEvaluatorSpendGroup.prevTotalTraceCount()).contains(0L)
        assertThat(onlineEvaluatorSpendGroup.runRuleId()).contains("run_rule_id")
        assertThat(onlineEvaluatorSpendGroup.runRuleName()).contains("run_rule_name")
        assertThat(onlineEvaluatorSpendGroup.sessionId()).contains("session_id")
        assertThat(onlineEvaluatorSpendGroup.sessionName()).contains("session_name")
        assertThat(onlineEvaluatorSpendGroup.spendLimit())
            .contains(
                OnlineSpendLimit.builder()
                    .limitUsd(0.0)
                    .utilizationPct(0.0)
                    .window("window")
                    .build()
            )
        assertThat(onlineEvaluatorSpendGroup.totalSpendUsd()).contains(0.0)
        assertThat(onlineEvaluatorSpendGroup.totalTraceCount()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val onlineEvaluatorSpendGroup =
            OnlineEvaluatorSpendGroup.builder()
                .datasetId("dataset_id")
                .datasetName("dataset_name")
                .addDay(
                    OnlineEvaluatorSpendDay.builder()
                        .date("date")
                        .spendUsd(0.0)
                        .traceCount(0L)
                        .build()
                )
                .evaluatorId("evaluator_id")
                .evaluatorName("evaluator_name")
                .prevTotalSpendUsd(0.0)
                .prevTotalTraceCount(0L)
                .runRuleId("run_rule_id")
                .runRuleName("run_rule_name")
                .sessionId("session_id")
                .sessionName("session_name")
                .spendLimit(
                    OnlineSpendLimit.builder()
                        .limitUsd(0.0)
                        .utilizationPct(0.0)
                        .window("window")
                        .build()
                )
                .totalSpendUsd(0.0)
                .totalTraceCount(0L)
                .build()

        val roundtrippedOnlineEvaluatorSpendGroup =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(onlineEvaluatorSpendGroup),
                jacksonTypeRef<OnlineEvaluatorSpendGroup>(),
            )

        assertThat(roundtrippedOnlineEvaluatorSpendGroup).isEqualTo(onlineEvaluatorSpendGroup)
    }
}

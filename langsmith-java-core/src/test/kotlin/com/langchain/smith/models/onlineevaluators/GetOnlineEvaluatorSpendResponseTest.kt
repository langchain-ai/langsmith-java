// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GetOnlineEvaluatorSpendResponseTest {

    @Test
    fun create() {
        val getOnlineEvaluatorSpendResponse =
            GetOnlineEvaluatorSpendResponse.builder()
                .addGroup(
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
                )
                .periodEnd("period_end")
                .periodStart("period_start")
                .build()

        assertThat(getOnlineEvaluatorSpendResponse.groups().getOrNull())
            .containsExactly(
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
            )
        assertThat(getOnlineEvaluatorSpendResponse.periodEnd()).contains("period_end")
        assertThat(getOnlineEvaluatorSpendResponse.periodStart()).contains("period_start")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val getOnlineEvaluatorSpendResponse =
            GetOnlineEvaluatorSpendResponse.builder()
                .addGroup(
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
                )
                .periodEnd("period_end")
                .periodStart("period_start")
                .build()

        val roundtrippedGetOnlineEvaluatorSpendResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(getOnlineEvaluatorSpendResponse),
                jacksonTypeRef<GetOnlineEvaluatorSpendResponse>(),
            )

        assertThat(roundtrippedGetOnlineEvaluatorSpendResponse)
            .isEqualTo(getOnlineEvaluatorSpendResponse)
    }
}

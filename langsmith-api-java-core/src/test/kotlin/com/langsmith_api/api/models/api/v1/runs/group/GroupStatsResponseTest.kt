// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.runs.group

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupStatsResponseTest {

    @Test
    fun create() {
        val groupStatsResponse =
            GroupStatsResponse.builder()
                .groupCount(0L)
                .completionCost("completion_cost")
                .completionCostDetails(JsonValue.from(mapOf<String, Any>()))
                .completionTokenDetails(JsonValue.from(mapOf<String, Any>()))
                .completionTokens(0L)
                .completionTokensP50(0L)
                .completionTokensP99(0L)
                .costP50("cost_p50")
                .costP99("cost_p99")
                .errorRate(0.0)
                .feedbackStats(JsonValue.from(mapOf<String, Any>()))
                .firstTokenP50(0.0)
                .firstTokenP99(0.0)
                .lastRunStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .latencyP50(0.0)
                .latencyP99(0.0)
                .medianTokens(0L)
                .promptCost("prompt_cost")
                .promptCostDetails(JsonValue.from(mapOf<String, Any>()))
                .promptTokenDetails(JsonValue.from(mapOf<String, Any>()))
                .promptTokens(0L)
                .promptTokensP50(0L)
                .promptTokensP99(0L)
                .runCount(0L)
                .addRunFacet(JsonValue.from(mapOf<String, Any>()))
                .streamingRate(0.0)
                .tokensP99(0L)
                .totalCost("total_cost")
                .totalTokens(0L)
                .build()

        assertThat(groupStatsResponse.groupCount()).isEqualTo(0L)
        assertThat(groupStatsResponse.completionCost()).contains("completion_cost")
        assertThat(groupStatsResponse._completionCostDetails())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(groupStatsResponse._completionTokenDetails())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(groupStatsResponse.completionTokens()).contains(0L)
        assertThat(groupStatsResponse.completionTokensP50()).contains(0L)
        assertThat(groupStatsResponse.completionTokensP99()).contains(0L)
        assertThat(groupStatsResponse.costP50()).contains("cost_p50")
        assertThat(groupStatsResponse.costP99()).contains("cost_p99")
        assertThat(groupStatsResponse.errorRate()).contains(0.0)
        assertThat(groupStatsResponse._feedbackStats())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(groupStatsResponse.firstTokenP50()).contains(0.0)
        assertThat(groupStatsResponse.firstTokenP99()).contains(0.0)
        assertThat(groupStatsResponse.lastRunStartTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(groupStatsResponse.latencyP50()).contains(0.0)
        assertThat(groupStatsResponse.latencyP99()).contains(0.0)
        assertThat(groupStatsResponse.medianTokens()).contains(0L)
        assertThat(groupStatsResponse.promptCost()).contains("prompt_cost")
        assertThat(groupStatsResponse._promptCostDetails())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(groupStatsResponse._promptTokenDetails())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(groupStatsResponse.promptTokens()).contains(0L)
        assertThat(groupStatsResponse.promptTokensP50()).contains(0L)
        assertThat(groupStatsResponse.promptTokensP99()).contains(0L)
        assertThat(groupStatsResponse.runCount()).contains(0L)
        assertThat(groupStatsResponse.runFacets().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(groupStatsResponse.streamingRate()).contains(0.0)
        assertThat(groupStatsResponse.tokensP99()).contains(0L)
        assertThat(groupStatsResponse.totalCost()).contains("total_cost")
        assertThat(groupStatsResponse.totalTokens()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val groupStatsResponse =
            GroupStatsResponse.builder()
                .groupCount(0L)
                .completionCost("completion_cost")
                .completionCostDetails(JsonValue.from(mapOf<String, Any>()))
                .completionTokenDetails(JsonValue.from(mapOf<String, Any>()))
                .completionTokens(0L)
                .completionTokensP50(0L)
                .completionTokensP99(0L)
                .costP50("cost_p50")
                .costP99("cost_p99")
                .errorRate(0.0)
                .feedbackStats(JsonValue.from(mapOf<String, Any>()))
                .firstTokenP50(0.0)
                .firstTokenP99(0.0)
                .lastRunStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .latencyP50(0.0)
                .latencyP99(0.0)
                .medianTokens(0L)
                .promptCost("prompt_cost")
                .promptCostDetails(JsonValue.from(mapOf<String, Any>()))
                .promptTokenDetails(JsonValue.from(mapOf<String, Any>()))
                .promptTokens(0L)
                .promptTokensP50(0L)
                .promptTokensP99(0L)
                .runCount(0L)
                .addRunFacet(JsonValue.from(mapOf<String, Any>()))
                .streamingRate(0.0)
                .tokensP99(0L)
                .totalCost("total_cost")
                .totalTokens(0L)
                .build()

        val roundtrippedGroupStatsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(groupStatsResponse),
                jacksonTypeRef<GroupStatsResponse>(),
            )

        assertThat(roundtrippedGroupStatsResponse).isEqualTo(groupStatsResponse)
    }
}

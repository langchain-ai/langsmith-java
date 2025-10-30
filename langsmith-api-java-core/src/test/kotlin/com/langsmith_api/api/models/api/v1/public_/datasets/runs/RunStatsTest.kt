// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.public_.datasets.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunStatsTest {

    @Test
    fun create() {
        val runStats =
            RunStats.builder()
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

        assertThat(runStats.completionCost()).contains("completion_cost")
        assertThat(runStats._completionCostDetails())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(runStats._completionTokenDetails())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(runStats.completionTokens()).contains(0L)
        assertThat(runStats.completionTokensP50()).contains(0L)
        assertThat(runStats.completionTokensP99()).contains(0L)
        assertThat(runStats.costP50()).contains("cost_p50")
        assertThat(runStats.costP99()).contains("cost_p99")
        assertThat(runStats.errorRate()).contains(0.0)
        assertThat(runStats._feedbackStats()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(runStats.firstTokenP50()).contains(0.0)
        assertThat(runStats.firstTokenP99()).contains(0.0)
        assertThat(runStats.lastRunStartTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(runStats.latencyP50()).contains(0.0)
        assertThat(runStats.latencyP99()).contains(0.0)
        assertThat(runStats.medianTokens()).contains(0L)
        assertThat(runStats.promptCost()).contains("prompt_cost")
        assertThat(runStats._promptCostDetails()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(runStats._promptTokenDetails()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(runStats.promptTokens()).contains(0L)
        assertThat(runStats.promptTokensP50()).contains(0L)
        assertThat(runStats.promptTokensP99()).contains(0L)
        assertThat(runStats.runCount()).contains(0L)
        assertThat(runStats.runFacets().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(runStats.streamingRate()).contains(0.0)
        assertThat(runStats.tokensP99()).contains(0L)
        assertThat(runStats.totalCost()).contains("total_cost")
        assertThat(runStats.totalTokens()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runStats =
            RunStats.builder()
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

        val roundtrippedRunStats =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runStats),
                jacksonTypeRef<RunStats>(),
            )

        assertThat(roundtrippedRunStats).isEqualTo(runStats)
    }
}

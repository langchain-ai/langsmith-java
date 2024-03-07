// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.langsmith.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RunStatsTest {

    @Test
    fun createRunStats() {
        val runStats =
            RunStats.builder()
                .runCount(123L)
                .completionCost(42.23)
                .completionTokens(123L)
                .errorRate(42.23)
                .feedbackStats(JsonValue.from(mapOf<String, Any>()))
                .firstTokenP50(42.23)
                .firstTokenP99(42.23)
                .lastRunStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .latencyP50(42.23)
                .latencyP99(42.23)
                .medianTokens(123L)
                .promptCost(42.23)
                .promptTokens(123L)
                .runFacets(listOf(JsonValue.from(mapOf<String, Any>())))
                .streamingRate(42.23)
                .totalCost(42.23)
                .totalTokens(123L)
                .build()
        assertThat(runStats).isNotNull
        assertThat(runStats.runCount()).isEqualTo(123L)
        assertThat(runStats.completionCost()).contains(42.23)
        assertThat(runStats.completionTokens()).contains(123L)
        assertThat(runStats.errorRate()).contains(42.23)
        assertThat(runStats._feedbackStats()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(runStats.firstTokenP50()).contains(42.23)
        assertThat(runStats.firstTokenP99()).contains(42.23)
        assertThat(runStats.lastRunStartTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(runStats.latencyP50()).contains(42.23)
        assertThat(runStats.latencyP99()).contains(42.23)
        assertThat(runStats.medianTokens()).contains(123L)
        assertThat(runStats.promptCost()).contains(42.23)
        assertThat(runStats.promptTokens()).contains(123L)
        assertThat(runStats.runFacets().get()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(runStats.streamingRate()).contains(42.23)
        assertThat(runStats.totalCost()).contains(42.23)
        assertThat(runStats.totalTokens()).contains(123L)
    }
}

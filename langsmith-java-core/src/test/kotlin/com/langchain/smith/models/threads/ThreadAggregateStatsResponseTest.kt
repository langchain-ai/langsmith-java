// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.threads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThreadAggregateStatsResponseTest {

    @Test
    fun create() {
        val threadAggregateStatsResponse =
            ThreadAggregateStatsResponse.builder()
                .completionCost(0.0)
                .completionCostDetails(
                    ThreadAggregateStatsResponse.CompletionCostDetails.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .completionTokenDetails(
                    ThreadAggregateStatsResponse.CompletionTokenDetails.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .completionTokens(0L)
                .errorRate(0.0)
                .firstTokenP50Seconds(0.0)
                .firstTokenP99Seconds(0.0)
                .latencyP50Seconds(0.0)
                .latencyP99Seconds(0.0)
                .medianTokens(0L)
                .promptCost(0.0)
                .promptCostDetails(
                    ThreadAggregateStatsResponse.PromptCostDetails.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .promptTokenDetails(
                    ThreadAggregateStatsResponse.PromptTokenDetails.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .promptTokens(0L)
                .streamingRate(0.0)
                .threadCount(0L)
                .threadFeedbackStats(
                    ThreadAggregateStatsResponse.ThreadFeedbackStats.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "avg" to 0.87,
                                    "comments" to listOf("good answer", "needs citation"),
                                    "contains_thread_feedback" to false,
                                    "errors" to 0,
                                    "max" to 0.95,
                                    "min" to 0.8,
                                    "n" to 42,
                                    "sources" to listOf(mapOf<String, Any>()),
                                    "stdev" to 0.05,
                                    "values" to mapOf("foo" to 0),
                                )
                            ),
                        )
                        .build()
                )
                .totalCost(0.0)
                .totalTokens(0L)
                .traceCount(0L)
                .build()

        assertThat(threadAggregateStatsResponse.completionCost()).contains(0.0)
        assertThat(threadAggregateStatsResponse.completionCostDetails())
            .contains(
                ThreadAggregateStatsResponse.CompletionCostDetails.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(threadAggregateStatsResponse.completionTokenDetails())
            .contains(
                ThreadAggregateStatsResponse.CompletionTokenDetails.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(threadAggregateStatsResponse.completionTokens()).contains(0L)
        assertThat(threadAggregateStatsResponse.errorRate()).contains(0.0)
        assertThat(threadAggregateStatsResponse.firstTokenP50Seconds()).contains(0.0)
        assertThat(threadAggregateStatsResponse.firstTokenP99Seconds()).contains(0.0)
        assertThat(threadAggregateStatsResponse.latencyP50Seconds()).contains(0.0)
        assertThat(threadAggregateStatsResponse.latencyP99Seconds()).contains(0.0)
        assertThat(threadAggregateStatsResponse.medianTokens()).contains(0L)
        assertThat(threadAggregateStatsResponse.promptCost()).contains(0.0)
        assertThat(threadAggregateStatsResponse.promptCostDetails())
            .contains(
                ThreadAggregateStatsResponse.PromptCostDetails.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(threadAggregateStatsResponse.promptTokenDetails())
            .contains(
                ThreadAggregateStatsResponse.PromptTokenDetails.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(threadAggregateStatsResponse.promptTokens()).contains(0L)
        assertThat(threadAggregateStatsResponse.streamingRate()).contains(0.0)
        assertThat(threadAggregateStatsResponse.threadCount()).contains(0L)
        assertThat(threadAggregateStatsResponse.threadFeedbackStats())
            .contains(
                ThreadAggregateStatsResponse.ThreadFeedbackStats.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "avg" to 0.87,
                                "comments" to listOf("good answer", "needs citation"),
                                "contains_thread_feedback" to false,
                                "errors" to 0,
                                "max" to 0.95,
                                "min" to 0.8,
                                "n" to 42,
                                "sources" to listOf(mapOf<String, Any>()),
                                "stdev" to 0.05,
                                "values" to mapOf("foo" to 0),
                            )
                        ),
                    )
                    .build()
            )
        assertThat(threadAggregateStatsResponse.totalCost()).contains(0.0)
        assertThat(threadAggregateStatsResponse.totalTokens()).contains(0L)
        assertThat(threadAggregateStatsResponse.traceCount()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val threadAggregateStatsResponse =
            ThreadAggregateStatsResponse.builder()
                .completionCost(0.0)
                .completionCostDetails(
                    ThreadAggregateStatsResponse.CompletionCostDetails.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .completionTokenDetails(
                    ThreadAggregateStatsResponse.CompletionTokenDetails.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .completionTokens(0L)
                .errorRate(0.0)
                .firstTokenP50Seconds(0.0)
                .firstTokenP99Seconds(0.0)
                .latencyP50Seconds(0.0)
                .latencyP99Seconds(0.0)
                .medianTokens(0L)
                .promptCost(0.0)
                .promptCostDetails(
                    ThreadAggregateStatsResponse.PromptCostDetails.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .promptTokenDetails(
                    ThreadAggregateStatsResponse.PromptTokenDetails.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .promptTokens(0L)
                .streamingRate(0.0)
                .threadCount(0L)
                .threadFeedbackStats(
                    ThreadAggregateStatsResponse.ThreadFeedbackStats.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "avg" to 0.87,
                                    "comments" to listOf("good answer", "needs citation"),
                                    "contains_thread_feedback" to false,
                                    "errors" to 0,
                                    "max" to 0.95,
                                    "min" to 0.8,
                                    "n" to 42,
                                    "sources" to listOf(mapOf<String, Any>()),
                                    "stdev" to 0.05,
                                    "values" to mapOf("foo" to 0),
                                )
                            ),
                        )
                        .build()
                )
                .totalCost(0.0)
                .totalTokens(0L)
                .traceCount(0L)
                .build()

        val roundtrippedThreadAggregateStatsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(threadAggregateStatsResponse),
                jacksonTypeRef<ThreadAggregateStatsResponse>(),
            )

        assertThat(roundtrippedThreadAggregateStatsResponse).isEqualTo(threadAggregateStatsResponse)
    }
}

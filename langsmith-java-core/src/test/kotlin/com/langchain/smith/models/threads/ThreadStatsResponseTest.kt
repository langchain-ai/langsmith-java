// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.threads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThreadStatsResponseTest {

    @Test
    fun create() {
        val threadStatsResponse =
            ThreadStatsResponse.builder()
                .completionCost(0.0)
                .completionCostDetails(
                    ThreadStatsResponse.CompletionCostDetails.builder()
                        .raw(
                            ThreadStatsResponse.CompletionCostDetails.Raw.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .completionTokenDetails(
                    ThreadStatsResponse.CompletionTokenDetails.builder()
                        .raw(
                            ThreadStatsResponse.CompletionTokenDetails.Raw.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .completionTokens(0L)
                .feedbackStats(
                    ThreadStatsResponse.FeedbackStats.builder()
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
                .firstStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastEndTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .latencyP50Seconds(0.0)
                .latencyP99Seconds(0.0)
                .promptCost(0.0)
                .promptCostDetails(
                    ThreadStatsResponse.PromptCostDetails.builder()
                        .raw(
                            ThreadStatsResponse.PromptCostDetails.Raw.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .promptTokenDetails(
                    ThreadStatsResponse.PromptTokenDetails.builder()
                        .raw(
                            ThreadStatsResponse.PromptTokenDetails.Raw.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .promptTokens(0L)
                .totalCost(0.0)
                .totalTokens(0L)
                .turns(0L)
                .build()

        assertThat(threadStatsResponse.completionCost()).contains(0.0)
        assertThat(threadStatsResponse.completionCostDetails())
            .contains(
                ThreadStatsResponse.CompletionCostDetails.builder()
                    .raw(
                        ThreadStatsResponse.CompletionCostDetails.Raw.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .build()
            )
        assertThat(threadStatsResponse.completionTokenDetails())
            .contains(
                ThreadStatsResponse.CompletionTokenDetails.builder()
                    .raw(
                        ThreadStatsResponse.CompletionTokenDetails.Raw.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .build()
            )
        assertThat(threadStatsResponse.completionTokens()).contains(0L)
        assertThat(threadStatsResponse.feedbackStats())
            .contains(
                ThreadStatsResponse.FeedbackStats.builder()
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
        assertThat(threadStatsResponse.firstStartTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(threadStatsResponse.lastEndTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(threadStatsResponse.lastStartTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(threadStatsResponse.latencyP50Seconds()).contains(0.0)
        assertThat(threadStatsResponse.latencyP99Seconds()).contains(0.0)
        assertThat(threadStatsResponse.promptCost()).contains(0.0)
        assertThat(threadStatsResponse.promptCostDetails())
            .contains(
                ThreadStatsResponse.PromptCostDetails.builder()
                    .raw(
                        ThreadStatsResponse.PromptCostDetails.Raw.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .build()
            )
        assertThat(threadStatsResponse.promptTokenDetails())
            .contains(
                ThreadStatsResponse.PromptTokenDetails.builder()
                    .raw(
                        ThreadStatsResponse.PromptTokenDetails.Raw.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .build()
            )
        assertThat(threadStatsResponse.promptTokens()).contains(0L)
        assertThat(threadStatsResponse.totalCost()).contains(0.0)
        assertThat(threadStatsResponse.totalTokens()).contains(0L)
        assertThat(threadStatsResponse.turns()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val threadStatsResponse =
            ThreadStatsResponse.builder()
                .completionCost(0.0)
                .completionCostDetails(
                    ThreadStatsResponse.CompletionCostDetails.builder()
                        .raw(
                            ThreadStatsResponse.CompletionCostDetails.Raw.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .completionTokenDetails(
                    ThreadStatsResponse.CompletionTokenDetails.builder()
                        .raw(
                            ThreadStatsResponse.CompletionTokenDetails.Raw.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .completionTokens(0L)
                .feedbackStats(
                    ThreadStatsResponse.FeedbackStats.builder()
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
                .firstStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastEndTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .latencyP50Seconds(0.0)
                .latencyP99Seconds(0.0)
                .promptCost(0.0)
                .promptCostDetails(
                    ThreadStatsResponse.PromptCostDetails.builder()
                        .raw(
                            ThreadStatsResponse.PromptCostDetails.Raw.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .promptTokenDetails(
                    ThreadStatsResponse.PromptTokenDetails.builder()
                        .raw(
                            ThreadStatsResponse.PromptTokenDetails.Raw.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .promptTokens(0L)
                .totalCost(0.0)
                .totalTokens(0L)
                .turns(0L)
                .build()

        val roundtrippedThreadStatsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(threadStatsResponse),
                jacksonTypeRef<ThreadStatsResponse>(),
            )

        assertThat(roundtrippedThreadStatsResponse).isEqualTo(threadStatsResponse)
    }
}

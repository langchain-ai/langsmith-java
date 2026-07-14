// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.threads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThreadStatsTest {

    @Test
    fun create() {
        val threadStats =
            ThreadStats.builder()
                .completionCost(0.0)
                .completionCostDetails(
                    ThreadStats.CompletionCostDetails.builder()
                        .raw(
                            ThreadStats.CompletionCostDetails.Raw.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .completionTokenDetails(
                    ThreadStats.CompletionTokenDetails.builder()
                        .raw(
                            ThreadStats.CompletionTokenDetails.Raw.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .completionTokens(0L)
                .feedbackStats(
                    ThreadStats.FeedbackStats.builder()
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
                    ThreadStats.PromptCostDetails.builder()
                        .raw(
                            ThreadStats.PromptCostDetails.Raw.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .promptTokenDetails(
                    ThreadStats.PromptTokenDetails.builder()
                        .raw(
                            ThreadStats.PromptTokenDetails.Raw.builder()
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

        assertThat(threadStats.completionCost()).contains(0.0)
        assertThat(threadStats.completionCostDetails())
            .contains(
                ThreadStats.CompletionCostDetails.builder()
                    .raw(
                        ThreadStats.CompletionCostDetails.Raw.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .build()
            )
        assertThat(threadStats.completionTokenDetails())
            .contains(
                ThreadStats.CompletionTokenDetails.builder()
                    .raw(
                        ThreadStats.CompletionTokenDetails.Raw.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .build()
            )
        assertThat(threadStats.completionTokens()).contains(0L)
        assertThat(threadStats.feedbackStats())
            .contains(
                ThreadStats.FeedbackStats.builder()
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
        assertThat(threadStats.firstStartTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(threadStats.lastEndTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(threadStats.lastStartTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(threadStats.latencyP50Seconds()).contains(0.0)
        assertThat(threadStats.latencyP99Seconds()).contains(0.0)
        assertThat(threadStats.promptCost()).contains(0.0)
        assertThat(threadStats.promptCostDetails())
            .contains(
                ThreadStats.PromptCostDetails.builder()
                    .raw(
                        ThreadStats.PromptCostDetails.Raw.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .build()
            )
        assertThat(threadStats.promptTokenDetails())
            .contains(
                ThreadStats.PromptTokenDetails.builder()
                    .raw(
                        ThreadStats.PromptTokenDetails.Raw.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .build()
            )
        assertThat(threadStats.promptTokens()).contains(0L)
        assertThat(threadStats.totalCost()).contains(0.0)
        assertThat(threadStats.totalTokens()).contains(0L)
        assertThat(threadStats.turns()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val threadStats =
            ThreadStats.builder()
                .completionCost(0.0)
                .completionCostDetails(
                    ThreadStats.CompletionCostDetails.builder()
                        .raw(
                            ThreadStats.CompletionCostDetails.Raw.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .completionTokenDetails(
                    ThreadStats.CompletionTokenDetails.builder()
                        .raw(
                            ThreadStats.CompletionTokenDetails.Raw.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .completionTokens(0L)
                .feedbackStats(
                    ThreadStats.FeedbackStats.builder()
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
                    ThreadStats.PromptCostDetails.builder()
                        .raw(
                            ThreadStats.PromptCostDetails.Raw.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .promptTokenDetails(
                    ThreadStats.PromptTokenDetails.builder()
                        .raw(
                            ThreadStats.PromptTokenDetails.Raw.builder()
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

        val roundtrippedThreadStats =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(threadStats),
                jacksonTypeRef<ThreadStats>(),
            )

        assertThat(roundtrippedThreadStats).isEqualTo(threadStats)
    }
}

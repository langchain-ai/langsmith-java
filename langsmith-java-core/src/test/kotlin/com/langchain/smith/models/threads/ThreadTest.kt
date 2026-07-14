// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.threads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThreadTest {

    @Test
    fun create() {
        val thread =
            Thread.builder()
                .count(3L)
                .feedbackStats(
                    Thread.FeedbackStats.builder()
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
                .firstInputs("first_inputs")
                .firstTraceId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                .lastError("last_error")
                .lastOutputs("last_outputs")
                .lastTraceId("0190a1b2-c3d4-7ef0-a5b6-6ea3a82e9328")
                .latencyP50(0.15)
                .latencyP99(0.42)
                .maxStartTime(OffsetDateTime.parse("2025-01-15T12:05:00.000Z"))
                .minStartTime(OffsetDateTime.parse("2025-01-15T12:00:00.000Z"))
                .numErroredTurns(1L)
                .startTime(OffsetDateTime.parse("2025-01-15T12:00:00.000Z"))
                .threadId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                .totalCost(0.045)
                .totalCostDetails(
                    Thread.TotalCostDetails.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .totalTokenDetails(
                    Thread.TotalTokenDetails.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .totalTokens(450L)
                .traceId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9328")
                .build()

        assertThat(thread.count()).contains(3L)
        assertThat(thread.feedbackStats())
            .contains(
                Thread.FeedbackStats.builder()
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
        assertThat(thread.firstInputs()).contains("first_inputs")
        assertThat(thread.firstTraceId()).contains("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
        assertThat(thread.lastError()).contains("last_error")
        assertThat(thread.lastOutputs()).contains("last_outputs")
        assertThat(thread.lastTraceId()).contains("0190a1b2-c3d4-7ef0-a5b6-6ea3a82e9328")
        assertThat(thread.latencyP50()).contains(0.15)
        assertThat(thread.latencyP99()).contains(0.42)
        assertThat(thread.maxStartTime()).contains(OffsetDateTime.parse("2025-01-15T12:05:00.000Z"))
        assertThat(thread.minStartTime()).contains(OffsetDateTime.parse("2025-01-15T12:00:00.000Z"))
        assertThat(thread.numErroredTurns()).contains(1L)
        assertThat(thread.startTime()).contains(OffsetDateTime.parse("2025-01-15T12:00:00.000Z"))
        assertThat(thread.threadId()).contains("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
        assertThat(thread.totalCost()).contains(0.045)
        assertThat(thread.totalCostDetails())
            .contains(
                Thread.TotalCostDetails.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(thread.totalTokenDetails())
            .contains(
                Thread.TotalTokenDetails.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(thread.totalTokens()).contains(450L)
        assertThat(thread.traceId()).contains("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9328")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val thread =
            Thread.builder()
                .count(3L)
                .feedbackStats(
                    Thread.FeedbackStats.builder()
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
                .firstInputs("first_inputs")
                .firstTraceId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                .lastError("last_error")
                .lastOutputs("last_outputs")
                .lastTraceId("0190a1b2-c3d4-7ef0-a5b6-6ea3a82e9328")
                .latencyP50(0.15)
                .latencyP99(0.42)
                .maxStartTime(OffsetDateTime.parse("2025-01-15T12:05:00.000Z"))
                .minStartTime(OffsetDateTime.parse("2025-01-15T12:00:00.000Z"))
                .numErroredTurns(1L)
                .startTime(OffsetDateTime.parse("2025-01-15T12:00:00.000Z"))
                .threadId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                .totalCost(0.045)
                .totalCostDetails(
                    Thread.TotalCostDetails.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .totalTokenDetails(
                    Thread.TotalTokenDetails.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .totalTokens(450L)
                .traceId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9328")
                .build()

        val roundtrippedThread =
            jsonMapper.readValue(jsonMapper.writeValueAsString(thread), jacksonTypeRef<Thread>())

        assertThat(roundtrippedThread).isEqualTo(thread)
    }
}

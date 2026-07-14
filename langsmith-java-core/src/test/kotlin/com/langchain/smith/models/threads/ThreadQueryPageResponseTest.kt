// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.threads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThreadQueryPageResponseTest {

    @Test
    fun create() {
        val threadQueryPageResponse =
            ThreadQueryPageResponse.builder()
                .addItem(
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
                )
                .nextCursor("eyJydW5zX2N1cnNvciI6Imx0KGN1cnNvciwiLi4uIikifQ==")
                .build()

        assertThat(threadQueryPageResponse.items().getOrNull())
            .containsExactly(
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
            )
        assertThat(threadQueryPageResponse.nextCursor())
            .contains("eyJydW5zX2N1cnNvciI6Imx0KGN1cnNvciwiLi4uIikifQ==")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val threadQueryPageResponse =
            ThreadQueryPageResponse.builder()
                .addItem(
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
                )
                .nextCursor("eyJydW5zX2N1cnNvciI6Imx0KGN1cnNvciwiLi4uIikifQ==")
                .build()

        val roundtrippedThreadQueryPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(threadQueryPageResponse),
                jacksonTypeRef<ThreadQueryPageResponse>(),
            )

        assertThat(roundtrippedThreadQueryPageResponse).isEqualTo(threadQueryPageResponse)
    }
}

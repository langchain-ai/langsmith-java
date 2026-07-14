// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.threads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThreadTraceTest {

    @Test
    fun create() {
        val threadTrace =
            ThreadTrace.builder()
                .completionCost(0.0)
                .completionCostDetails(
                    ThreadTrace.CompletionCostDetails.builder()
                        .raw(
                            ThreadTrace.CompletionCostDetails.Raw.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .completionTokenDetails(
                    ThreadTrace.CompletionTokenDetails.builder()
                        .raw(
                            ThreadTrace.CompletionTokenDetails.Raw.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .completionTokens(0L)
                .endTime(OffsetDateTime.parse("2025-01-15T12:00:01.500Z"))
                .errorPreview("error_preview")
                .firstTokenTime(OffsetDateTime.parse("2024-01-15T10:30:00.312Z"))
                .inputsPreview("inputs_preview")
                .latency(0.0)
                .name("name")
                .op(0.0)
                .outputsPreview("outputs_preview")
                .promptCost(0.0)
                .promptCostDetails(
                    ThreadTrace.PromptCostDetails.builder()
                        .raw(
                            ThreadTrace.PromptCostDetails.Raw.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .promptTokenDetails(
                    ThreadTrace.PromptTokenDetails.builder()
                        .raw(
                            ThreadTrace.PromptTokenDetails.Raw.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .promptTokens(0L)
                .startTime(OffsetDateTime.parse("2025-01-15T12:00:00.000Z"))
                .threadId("d4e5f6a7-b8c9-4d5e-1f2a-3b4c5d6e7f8a")
                .totalCost(0.0)
                .totalTokens(0L)
                .traceId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                .build()

        assertThat(threadTrace.completionCost()).contains(0.0)
        assertThat(threadTrace.completionCostDetails())
            .contains(
                ThreadTrace.CompletionCostDetails.builder()
                    .raw(
                        ThreadTrace.CompletionCostDetails.Raw.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .build()
            )
        assertThat(threadTrace.completionTokenDetails())
            .contains(
                ThreadTrace.CompletionTokenDetails.builder()
                    .raw(
                        ThreadTrace.CompletionTokenDetails.Raw.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .build()
            )
        assertThat(threadTrace.completionTokens()).contains(0L)
        assertThat(threadTrace.endTime()).contains(OffsetDateTime.parse("2025-01-15T12:00:01.500Z"))
        assertThat(threadTrace.errorPreview()).contains("error_preview")
        assertThat(threadTrace.firstTokenTime())
            .contains(OffsetDateTime.parse("2024-01-15T10:30:00.312Z"))
        assertThat(threadTrace.inputsPreview()).contains("inputs_preview")
        assertThat(threadTrace.latency()).contains(0.0)
        assertThat(threadTrace.name()).contains("name")
        assertThat(threadTrace.op()).contains(0.0)
        assertThat(threadTrace.outputsPreview()).contains("outputs_preview")
        assertThat(threadTrace.promptCost()).contains(0.0)
        assertThat(threadTrace.promptCostDetails())
            .contains(
                ThreadTrace.PromptCostDetails.builder()
                    .raw(
                        ThreadTrace.PromptCostDetails.Raw.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .build()
            )
        assertThat(threadTrace.promptTokenDetails())
            .contains(
                ThreadTrace.PromptTokenDetails.builder()
                    .raw(
                        ThreadTrace.PromptTokenDetails.Raw.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .build()
            )
        assertThat(threadTrace.promptTokens()).contains(0L)
        assertThat(threadTrace.startTime())
            .contains(OffsetDateTime.parse("2025-01-15T12:00:00.000Z"))
        assertThat(threadTrace.threadId()).contains("d4e5f6a7-b8c9-4d5e-1f2a-3b4c5d6e7f8a")
        assertThat(threadTrace.totalCost()).contains(0.0)
        assertThat(threadTrace.totalTokens()).contains(0L)
        assertThat(threadTrace.traceId()).contains("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val threadTrace =
            ThreadTrace.builder()
                .completionCost(0.0)
                .completionCostDetails(
                    ThreadTrace.CompletionCostDetails.builder()
                        .raw(
                            ThreadTrace.CompletionCostDetails.Raw.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .completionTokenDetails(
                    ThreadTrace.CompletionTokenDetails.builder()
                        .raw(
                            ThreadTrace.CompletionTokenDetails.Raw.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .completionTokens(0L)
                .endTime(OffsetDateTime.parse("2025-01-15T12:00:01.500Z"))
                .errorPreview("error_preview")
                .firstTokenTime(OffsetDateTime.parse("2024-01-15T10:30:00.312Z"))
                .inputsPreview("inputs_preview")
                .latency(0.0)
                .name("name")
                .op(0.0)
                .outputsPreview("outputs_preview")
                .promptCost(0.0)
                .promptCostDetails(
                    ThreadTrace.PromptCostDetails.builder()
                        .raw(
                            ThreadTrace.PromptCostDetails.Raw.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .promptTokenDetails(
                    ThreadTrace.PromptTokenDetails.builder()
                        .raw(
                            ThreadTrace.PromptTokenDetails.Raw.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .promptTokens(0L)
                .startTime(OffsetDateTime.parse("2025-01-15T12:00:00.000Z"))
                .threadId("d4e5f6a7-b8c9-4d5e-1f2a-3b4c5d6e7f8a")
                .totalCost(0.0)
                .totalTokens(0L)
                .traceId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                .build()

        val roundtrippedThreadTrace =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(threadTrace),
                jacksonTypeRef<ThreadTrace>(),
            )

        assertThat(roundtrippedThreadTrace).isEqualTo(threadTrace)
    }
}

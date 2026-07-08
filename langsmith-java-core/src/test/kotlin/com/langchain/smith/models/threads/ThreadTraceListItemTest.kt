// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.threads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThreadTraceListItemTest {

    @Test
    fun create() {
        val threadTraceListItem =
            ThreadTraceListItem.builder()
                .completionCost(0.0)
                .completionCostDetails(
                    ThreadTraceListItem.CompletionCostDetails.builder()
                        .raw(
                            ThreadTraceListItem.CompletionCostDetails.Raw.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .completionTokenDetails(
                    ThreadTraceListItem.CompletionTokenDetails.builder()
                        .raw(
                            ThreadTraceListItem.CompletionTokenDetails.Raw.builder()
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
                    ThreadTraceListItem.PromptCostDetails.builder()
                        .raw(
                            ThreadTraceListItem.PromptCostDetails.Raw.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .promptTokenDetails(
                    ThreadTraceListItem.PromptTokenDetails.builder()
                        .raw(
                            ThreadTraceListItem.PromptTokenDetails.Raw.builder()
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

        assertThat(threadTraceListItem.completionCost()).contains(0.0)
        assertThat(threadTraceListItem.completionCostDetails())
            .contains(
                ThreadTraceListItem.CompletionCostDetails.builder()
                    .raw(
                        ThreadTraceListItem.CompletionCostDetails.Raw.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .build()
            )
        assertThat(threadTraceListItem.completionTokenDetails())
            .contains(
                ThreadTraceListItem.CompletionTokenDetails.builder()
                    .raw(
                        ThreadTraceListItem.CompletionTokenDetails.Raw.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .build()
            )
        assertThat(threadTraceListItem.completionTokens()).contains(0L)
        assertThat(threadTraceListItem.endTime())
            .contains(OffsetDateTime.parse("2025-01-15T12:00:01.500Z"))
        assertThat(threadTraceListItem.errorPreview()).contains("error_preview")
        assertThat(threadTraceListItem.firstTokenTime())
            .contains(OffsetDateTime.parse("2024-01-15T10:30:00.312Z"))
        assertThat(threadTraceListItem.inputsPreview()).contains("inputs_preview")
        assertThat(threadTraceListItem.latency()).contains(0.0)
        assertThat(threadTraceListItem.name()).contains("name")
        assertThat(threadTraceListItem.op()).contains(0.0)
        assertThat(threadTraceListItem.outputsPreview()).contains("outputs_preview")
        assertThat(threadTraceListItem.promptCost()).contains(0.0)
        assertThat(threadTraceListItem.promptCostDetails())
            .contains(
                ThreadTraceListItem.PromptCostDetails.builder()
                    .raw(
                        ThreadTraceListItem.PromptCostDetails.Raw.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .build()
            )
        assertThat(threadTraceListItem.promptTokenDetails())
            .contains(
                ThreadTraceListItem.PromptTokenDetails.builder()
                    .raw(
                        ThreadTraceListItem.PromptTokenDetails.Raw.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .build()
            )
        assertThat(threadTraceListItem.promptTokens()).contains(0L)
        assertThat(threadTraceListItem.startTime())
            .contains(OffsetDateTime.parse("2025-01-15T12:00:00.000Z"))
        assertThat(threadTraceListItem.threadId()).contains("d4e5f6a7-b8c9-4d5e-1f2a-3b4c5d6e7f8a")
        assertThat(threadTraceListItem.totalCost()).contains(0.0)
        assertThat(threadTraceListItem.totalTokens()).contains(0L)
        assertThat(threadTraceListItem.traceId()).contains("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val threadTraceListItem =
            ThreadTraceListItem.builder()
                .completionCost(0.0)
                .completionCostDetails(
                    ThreadTraceListItem.CompletionCostDetails.builder()
                        .raw(
                            ThreadTraceListItem.CompletionCostDetails.Raw.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .completionTokenDetails(
                    ThreadTraceListItem.CompletionTokenDetails.builder()
                        .raw(
                            ThreadTraceListItem.CompletionTokenDetails.Raw.builder()
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
                    ThreadTraceListItem.PromptCostDetails.builder()
                        .raw(
                            ThreadTraceListItem.PromptCostDetails.Raw.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .promptTokenDetails(
                    ThreadTraceListItem.PromptTokenDetails.builder()
                        .raw(
                            ThreadTraceListItem.PromptTokenDetails.Raw.builder()
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

        val roundtrippedThreadTraceListItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(threadTraceListItem),
                jacksonTypeRef<ThreadTraceListItem>(),
            )

        assertThat(roundtrippedThreadTraceListItem).isEqualTo(threadTraceListItem)
    }
}

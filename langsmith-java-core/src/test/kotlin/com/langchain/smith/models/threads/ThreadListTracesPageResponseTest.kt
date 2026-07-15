// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.threads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThreadListTracesPageResponseTest {

    @Test
    fun create() {
        val threadListTracesPageResponse =
            ThreadListTracesPageResponse.builder()
                .addItem(
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
                        .error("context deadline exceeded")
                        .errorPreview("error_preview")
                        .firstTokenTime(OffsetDateTime.parse("2024-01-15T10:30:00.312Z"))
                        .inputs(JsonValue.from(mapOf<String, Any>()))
                        .inputsPreview("inputs_preview")
                        .latency(0.0)
                        .name("name")
                        .op(0.0)
                        .outputs(JsonValue.from(mapOf<String, Any>()))
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
                )
                .nextCursor("eyJydW5zX2N1cnNvciI6Imx0KGN1cnNvciwiLi4uIikifQ==")
                .build()

        assertThat(threadListTracesPageResponse.items().getOrNull())
            .containsExactly(
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
                    .error("context deadline exceeded")
                    .errorPreview("error_preview")
                    .firstTokenTime(OffsetDateTime.parse("2024-01-15T10:30:00.312Z"))
                    .inputs(JsonValue.from(mapOf<String, Any>()))
                    .inputsPreview("inputs_preview")
                    .latency(0.0)
                    .name("name")
                    .op(0.0)
                    .outputs(JsonValue.from(mapOf<String, Any>()))
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
            )
        assertThat(threadListTracesPageResponse.nextCursor())
            .contains("eyJydW5zX2N1cnNvciI6Imx0KGN1cnNvciwiLi4uIikifQ==")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val threadListTracesPageResponse =
            ThreadListTracesPageResponse.builder()
                .addItem(
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
                        .error("context deadline exceeded")
                        .errorPreview("error_preview")
                        .firstTokenTime(OffsetDateTime.parse("2024-01-15T10:30:00.312Z"))
                        .inputs(JsonValue.from(mapOf<String, Any>()))
                        .inputsPreview("inputs_preview")
                        .latency(0.0)
                        .name("name")
                        .op(0.0)
                        .outputs(JsonValue.from(mapOf<String, Any>()))
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
                )
                .nextCursor("eyJydW5zX2N1cnNvciI6Imx0KGN1cnNvciwiLi4uIikifQ==")
                .build()

        val roundtrippedThreadListTracesPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(threadListTracesPageResponse),
                jacksonTypeRef<ThreadListTracesPageResponse>(),
            )

        assertThat(roundtrippedThreadListTracesPageResponse).isEqualTo(threadListTracesPageResponse)
    }
}

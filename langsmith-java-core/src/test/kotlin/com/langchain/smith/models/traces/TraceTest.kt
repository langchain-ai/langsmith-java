// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.traces

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import com.langchain.smith.models.runs.Run
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TraceTest {

    @Test
    fun create() {
        val trace =
            Trace.builder()
                .rootRun(
                    Run.builder()
                        .id("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                        .appPath("/app/chains/chat.py:invoke")
                        .attachments(
                            Run.Attachments.builder()
                                .putAdditionalProperty(
                                    "{\"output.png\"",
                                    JsonValue.from(
                                        "\"https://storage.example.com/bucket/key?X-Amz-Signature=abc\"}"
                                    ),
                                )
                                .build()
                        )
                        .completionCost(0.0003)
                        .completionCostDetails(
                            Run.CompletionCostDetails.builder()
                                .raw(
                                    Run.CompletionCostDetails.Raw.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .build()
                        )
                        .completionTokenDetails(
                            Run.CompletionTokenDetails.builder()
                                .raw(
                                    Run.CompletionTokenDetails.Raw.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .build()
                        )
                        .completionTokens(150L)
                        .dottedOrder("20240115T103000000000Z018e4c7ea9fb7ef0a5b66ea3a82e9327.")
                        .endTime(OffsetDateTime.parse("2024-01-15T10:30:01.500Z"))
                        .error("context deadline exceeded")
                        .errorPreview("error_preview")
                        .addEvent(
                            Run.Event.builder()
                                .kwargs(JsonValue.from(mapOf<String, Any>()))
                                .name("new_token")
                                .time(OffsetDateTime.parse("2024-01-15T10:30:00.312Z"))
                                .build()
                        )
                        .extra(
                            Run.Extra.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .feedbackStats(
                            Run.FeedbackStats.builder()
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
                        .firstTokenTime(OffsetDateTime.parse("2024-01-15T10:30:00.312Z"))
                        .inputs(
                            Run.Inputs.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .inputsPreview("inputs_preview")
                        .isInDataset(true)
                        .isRoot(true)
                        .latencySeconds(1.523)
                        .manifest(
                            Run.Manifest.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .metadata(
                            Run.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .name("ChatOpenAI")
                        .outputs(
                            Run.Outputs.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .outputsPreview("outputs_preview")
                        .addParentRunId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                        .addParentRunId("a1b2c3d4-e5f6-4a5b-8c9d-0e1f2a3b4c5d")
                        .priceModelId("e5f6a7b8-c9d0-4e1f-2a3b-4c5d6e7f8a9b")
                        .projectId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                        .promptCost(0.0002)
                        .promptCostDetails(
                            Run.PromptCostDetails.builder()
                                .raw(
                                    Run.PromptCostDetails.Raw.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .build()
                        )
                        .promptTokenDetails(
                            Run.PromptTokenDetails.builder()
                                .raw(
                                    Run.PromptTokenDetails.Raw.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .build()
                        )
                        .promptTokens(200L)
                        .referenceDatasetId("c3d4e5f6-a7b8-4c5d-0e1f-2a3b4c5d6e7f")
                        .referenceExampleId("b2c3d4e5-f6a7-4b5c-9d0e-1f2a3b4c5d6e")
                        .runType(Run.RunType.LLM)
                        .shareUrl(
                            "https://smith.langchain.com/public/4f7a1b2c-8d9e-4a0b-9c1d-2e3f4a5b6c7d/r"
                        )
                        .startTime(OffsetDateTime.parse("2024-01-15T10:30:00.000Z"))
                        .status(Run.Status.SUCCESS)
                        .addTag("production")
                        .addTag("gpt-4")
                        .threadEvaluationTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .threadId("d4e5f6a7-b8c9-4d5e-1f2a-3b4c5d6e7f8a")
                        .totalCost(0.000525)
                        .totalTokens(350L)
                        .traceId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                        .build()
                )
                .traceAggregates(
                    TraceAggregates.builder()
                        .firstTokenTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .totalCost(0.0)
                        .totalTokens(0L)
                        .build()
                )
                .build()

        assertThat(trace.rootRun())
            .contains(
                Run.builder()
                    .id("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                    .appPath("/app/chains/chat.py:invoke")
                    .attachments(
                        Run.Attachments.builder()
                            .putAdditionalProperty(
                                "{\"output.png\"",
                                JsonValue.from(
                                    "\"https://storage.example.com/bucket/key?X-Amz-Signature=abc\"}"
                                ),
                            )
                            .build()
                    )
                    .completionCost(0.0003)
                    .completionCostDetails(
                        Run.CompletionCostDetails.builder()
                            .raw(
                                Run.CompletionCostDetails.Raw.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                    .build()
                            )
                            .build()
                    )
                    .completionTokenDetails(
                        Run.CompletionTokenDetails.builder()
                            .raw(
                                Run.CompletionTokenDetails.Raw.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                    .build()
                            )
                            .build()
                    )
                    .completionTokens(150L)
                    .dottedOrder("20240115T103000000000Z018e4c7ea9fb7ef0a5b66ea3a82e9327.")
                    .endTime(OffsetDateTime.parse("2024-01-15T10:30:01.500Z"))
                    .error("context deadline exceeded")
                    .errorPreview("error_preview")
                    .addEvent(
                        Run.Event.builder()
                            .kwargs(JsonValue.from(mapOf<String, Any>()))
                            .name("new_token")
                            .time(OffsetDateTime.parse("2024-01-15T10:30:00.312Z"))
                            .build()
                    )
                    .extra(
                        Run.Extra.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .feedbackStats(
                        Run.FeedbackStats.builder()
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
                    .firstTokenTime(OffsetDateTime.parse("2024-01-15T10:30:00.312Z"))
                    .inputs(
                        Run.Inputs.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .inputsPreview("inputs_preview")
                    .isInDataset(true)
                    .isRoot(true)
                    .latencySeconds(1.523)
                    .manifest(
                        Run.Manifest.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .metadata(
                        Run.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .name("ChatOpenAI")
                    .outputs(
                        Run.Outputs.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .outputsPreview("outputs_preview")
                    .addParentRunId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                    .addParentRunId("a1b2c3d4-e5f6-4a5b-8c9d-0e1f2a3b4c5d")
                    .priceModelId("e5f6a7b8-c9d0-4e1f-2a3b-4c5d6e7f8a9b")
                    .projectId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                    .promptCost(0.0002)
                    .promptCostDetails(
                        Run.PromptCostDetails.builder()
                            .raw(
                                Run.PromptCostDetails.Raw.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                    .build()
                            )
                            .build()
                    )
                    .promptTokenDetails(
                        Run.PromptTokenDetails.builder()
                            .raw(
                                Run.PromptTokenDetails.Raw.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                    .build()
                            )
                            .build()
                    )
                    .promptTokens(200L)
                    .referenceDatasetId("c3d4e5f6-a7b8-4c5d-0e1f-2a3b4c5d6e7f")
                    .referenceExampleId("b2c3d4e5-f6a7-4b5c-9d0e-1f2a3b4c5d6e")
                    .runType(Run.RunType.LLM)
                    .shareUrl(
                        "https://smith.langchain.com/public/4f7a1b2c-8d9e-4a0b-9c1d-2e3f4a5b6c7d/r"
                    )
                    .startTime(OffsetDateTime.parse("2024-01-15T10:30:00.000Z"))
                    .status(Run.Status.SUCCESS)
                    .addTag("production")
                    .addTag("gpt-4")
                    .threadEvaluationTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .threadId("d4e5f6a7-b8c9-4d5e-1f2a-3b4c5d6e7f8a")
                    .totalCost(0.000525)
                    .totalTokens(350L)
                    .traceId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                    .build()
            )
        assertThat(trace.traceAggregates())
            .contains(
                TraceAggregates.builder()
                    .firstTokenTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .totalCost(0.0)
                    .totalTokens(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val trace =
            Trace.builder()
                .rootRun(
                    Run.builder()
                        .id("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                        .appPath("/app/chains/chat.py:invoke")
                        .attachments(
                            Run.Attachments.builder()
                                .putAdditionalProperty(
                                    "{\"output.png\"",
                                    JsonValue.from(
                                        "\"https://storage.example.com/bucket/key?X-Amz-Signature=abc\"}"
                                    ),
                                )
                                .build()
                        )
                        .completionCost(0.0003)
                        .completionCostDetails(
                            Run.CompletionCostDetails.builder()
                                .raw(
                                    Run.CompletionCostDetails.Raw.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .build()
                        )
                        .completionTokenDetails(
                            Run.CompletionTokenDetails.builder()
                                .raw(
                                    Run.CompletionTokenDetails.Raw.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .build()
                        )
                        .completionTokens(150L)
                        .dottedOrder("20240115T103000000000Z018e4c7ea9fb7ef0a5b66ea3a82e9327.")
                        .endTime(OffsetDateTime.parse("2024-01-15T10:30:01.500Z"))
                        .error("context deadline exceeded")
                        .errorPreview("error_preview")
                        .addEvent(
                            Run.Event.builder()
                                .kwargs(JsonValue.from(mapOf<String, Any>()))
                                .name("new_token")
                                .time(OffsetDateTime.parse("2024-01-15T10:30:00.312Z"))
                                .build()
                        )
                        .extra(
                            Run.Extra.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .feedbackStats(
                            Run.FeedbackStats.builder()
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
                        .firstTokenTime(OffsetDateTime.parse("2024-01-15T10:30:00.312Z"))
                        .inputs(
                            Run.Inputs.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .inputsPreview("inputs_preview")
                        .isInDataset(true)
                        .isRoot(true)
                        .latencySeconds(1.523)
                        .manifest(
                            Run.Manifest.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .metadata(
                            Run.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .name("ChatOpenAI")
                        .outputs(
                            Run.Outputs.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .outputsPreview("outputs_preview")
                        .addParentRunId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                        .addParentRunId("a1b2c3d4-e5f6-4a5b-8c9d-0e1f2a3b4c5d")
                        .priceModelId("e5f6a7b8-c9d0-4e1f-2a3b-4c5d6e7f8a9b")
                        .projectId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                        .promptCost(0.0002)
                        .promptCostDetails(
                            Run.PromptCostDetails.builder()
                                .raw(
                                    Run.PromptCostDetails.Raw.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .build()
                        )
                        .promptTokenDetails(
                            Run.PromptTokenDetails.builder()
                                .raw(
                                    Run.PromptTokenDetails.Raw.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .build()
                        )
                        .promptTokens(200L)
                        .referenceDatasetId("c3d4e5f6-a7b8-4c5d-0e1f-2a3b4c5d6e7f")
                        .referenceExampleId("b2c3d4e5-f6a7-4b5c-9d0e-1f2a3b4c5d6e")
                        .runType(Run.RunType.LLM)
                        .shareUrl(
                            "https://smith.langchain.com/public/4f7a1b2c-8d9e-4a0b-9c1d-2e3f4a5b6c7d/r"
                        )
                        .startTime(OffsetDateTime.parse("2024-01-15T10:30:00.000Z"))
                        .status(Run.Status.SUCCESS)
                        .addTag("production")
                        .addTag("gpt-4")
                        .threadEvaluationTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .threadId("d4e5f6a7-b8c9-4d5e-1f2a-3b4c5d6e7f8a")
                        .totalCost(0.000525)
                        .totalTokens(350L)
                        .traceId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                        .build()
                )
                .traceAggregates(
                    TraceAggregates.builder()
                        .firstTokenTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .totalCost(0.0)
                        .totalTokens(0L)
                        .build()
                )
                .build()

        val roundtrippedTrace =
            jsonMapper.readValue(jsonMapper.writeValueAsString(trace), jacksonTypeRef<Trace>())

        assertThat(roundtrippedTrace).isEqualTo(trace)
    }
}

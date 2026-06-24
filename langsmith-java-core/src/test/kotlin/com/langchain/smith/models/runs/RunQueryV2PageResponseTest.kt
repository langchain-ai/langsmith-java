// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunQueryV2PageResponseTest {

    @Test
    fun create() {
        val runQueryV2PageResponse =
            RunQueryV2PageResponse.builder()
                .addItem(
                    QueryRunResponse.builder()
                        .id("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                        .appPath("/app/chains/chat.py:invoke")
                        .attachments(
                            QueryRunResponse.Attachments.builder()
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
                            QueryRunResponse.CompletionCostDetails.builder()
                                .raw(
                                    QueryRunResponse.CompletionCostDetails.Raw.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .build()
                        )
                        .completionTokenDetails(
                            QueryRunResponse.CompletionTokenDetails.builder()
                                .raw(
                                    QueryRunResponse.CompletionTokenDetails.Raw.builder()
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
                            QueryRunResponse.Event.builder()
                                .kwargs(JsonValue.from(mapOf<String, Any>()))
                                .name("new_token")
                                .time(OffsetDateTime.parse("2024-01-15T10:30:00.312Z"))
                                .build()
                        )
                        .extra(JsonValue.from(mapOf<String, Any>()))
                        .feedbackStats(
                            QueryRunResponse.FeedbackStats.builder()
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
                        .inputs(JsonValue.from(mapOf<String, Any>()))
                        .inputsPreview("inputs_preview")
                        .isInDataset(true)
                        .isRoot(true)
                        .latencySeconds(1.523)
                        .manifest(JsonValue.from(mapOf<String, Any>()))
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .name("ChatOpenAI")
                        .outputs(JsonValue.from(mapOf<String, Any>()))
                        .outputsPreview("outputs_preview")
                        .addParentRunId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                        .addParentRunId("a1b2c3d4-e5f6-4a5b-8c9d-0e1f2a3b4c5d")
                        .priceModelId("e5f6a7b8-c9d0-4e1f-2a3b-4c5d6e7f8a9b")
                        .projectId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                        .promptCost(0.0002)
                        .promptCostDetails(
                            QueryRunResponse.PromptCostDetails.builder()
                                .raw(
                                    QueryRunResponse.PromptCostDetails.Raw.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .build()
                        )
                        .promptTokenDetails(
                            QueryRunResponse.PromptTokenDetails.builder()
                                .raw(
                                    QueryRunResponse.PromptTokenDetails.Raw.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .build()
                        )
                        .promptTokens(200L)
                        .referenceDatasetId("c3d4e5f6-a7b8-4c5d-0e1f-2a3b4c5d6e7f")
                        .referenceExampleId("b2c3d4e5-f6a7-4b5c-9d0e-1f2a3b4c5d6e")
                        .runType(QueryRunResponse.RunType.LLM)
                        .shareUrl(
                            "https://smith.langchain.com/public/4f7a1b2c-8d9e-4a0b-9c1d-2e3f4a5b6c7d/r"
                        )
                        .startTime(OffsetDateTime.parse("2024-01-15T10:30:00.000Z"))
                        .status(QueryRunResponse.Status.SUCCESS)
                        .addTag("production")
                        .addTag("gpt-4")
                        .threadEvaluationTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .threadId("d4e5f6a7-b8c9-4d5e-1f2a-3b4c5d6e7f8a")
                        .totalCost(0.000525)
                        .totalTokens(350L)
                        .traceId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                        .build()
                )
                .nextCursor(
                    "eyJ2IjoxLCJhIjoicnVucy5xdWVyeSIsImsiOiJwYXNzIiwiYiI6InNkYiIsInQiOiJsdChjdXJzb3IsICcyMDI1LTEyLTEyIDE5OjAzOjI4LjQ4MTI1NTAxOWIxM2YyJykifQ"
                )
                .build()

        assertThat(runQueryV2PageResponse.items().getOrNull())
            .containsExactly(
                QueryRunResponse.builder()
                    .id("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                    .appPath("/app/chains/chat.py:invoke")
                    .attachments(
                        QueryRunResponse.Attachments.builder()
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
                        QueryRunResponse.CompletionCostDetails.builder()
                            .raw(
                                QueryRunResponse.CompletionCostDetails.Raw.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                    .build()
                            )
                            .build()
                    )
                    .completionTokenDetails(
                        QueryRunResponse.CompletionTokenDetails.builder()
                            .raw(
                                QueryRunResponse.CompletionTokenDetails.Raw.builder()
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
                        QueryRunResponse.Event.builder()
                            .kwargs(JsonValue.from(mapOf<String, Any>()))
                            .name("new_token")
                            .time(OffsetDateTime.parse("2024-01-15T10:30:00.312Z"))
                            .build()
                    )
                    .extra(JsonValue.from(mapOf<String, Any>()))
                    .feedbackStats(
                        QueryRunResponse.FeedbackStats.builder()
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
                    .inputs(JsonValue.from(mapOf<String, Any>()))
                    .inputsPreview("inputs_preview")
                    .isInDataset(true)
                    .isRoot(true)
                    .latencySeconds(1.523)
                    .manifest(JsonValue.from(mapOf<String, Any>()))
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .name("ChatOpenAI")
                    .outputs(JsonValue.from(mapOf<String, Any>()))
                    .outputsPreview("outputs_preview")
                    .addParentRunId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                    .addParentRunId("a1b2c3d4-e5f6-4a5b-8c9d-0e1f2a3b4c5d")
                    .priceModelId("e5f6a7b8-c9d0-4e1f-2a3b-4c5d6e7f8a9b")
                    .projectId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                    .promptCost(0.0002)
                    .promptCostDetails(
                        QueryRunResponse.PromptCostDetails.builder()
                            .raw(
                                QueryRunResponse.PromptCostDetails.Raw.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                    .build()
                            )
                            .build()
                    )
                    .promptTokenDetails(
                        QueryRunResponse.PromptTokenDetails.builder()
                            .raw(
                                QueryRunResponse.PromptTokenDetails.Raw.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                    .build()
                            )
                            .build()
                    )
                    .promptTokens(200L)
                    .referenceDatasetId("c3d4e5f6-a7b8-4c5d-0e1f-2a3b4c5d6e7f")
                    .referenceExampleId("b2c3d4e5-f6a7-4b5c-9d0e-1f2a3b4c5d6e")
                    .runType(QueryRunResponse.RunType.LLM)
                    .shareUrl(
                        "https://smith.langchain.com/public/4f7a1b2c-8d9e-4a0b-9c1d-2e3f4a5b6c7d/r"
                    )
                    .startTime(OffsetDateTime.parse("2024-01-15T10:30:00.000Z"))
                    .status(QueryRunResponse.Status.SUCCESS)
                    .addTag("production")
                    .addTag("gpt-4")
                    .threadEvaluationTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .threadId("d4e5f6a7-b8c9-4d5e-1f2a-3b4c5d6e7f8a")
                    .totalCost(0.000525)
                    .totalTokens(350L)
                    .traceId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                    .build()
            )
        assertThat(runQueryV2PageResponse.nextCursor())
            .contains(
                "eyJ2IjoxLCJhIjoicnVucy5xdWVyeSIsImsiOiJwYXNzIiwiYiI6InNkYiIsInQiOiJsdChjdXJzb3IsICcyMDI1LTEyLTEyIDE5OjAzOjI4LjQ4MTI1NTAxOWIxM2YyJykifQ"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runQueryV2PageResponse =
            RunQueryV2PageResponse.builder()
                .addItem(
                    QueryRunResponse.builder()
                        .id("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                        .appPath("/app/chains/chat.py:invoke")
                        .attachments(
                            QueryRunResponse.Attachments.builder()
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
                            QueryRunResponse.CompletionCostDetails.builder()
                                .raw(
                                    QueryRunResponse.CompletionCostDetails.Raw.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .build()
                        )
                        .completionTokenDetails(
                            QueryRunResponse.CompletionTokenDetails.builder()
                                .raw(
                                    QueryRunResponse.CompletionTokenDetails.Raw.builder()
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
                            QueryRunResponse.Event.builder()
                                .kwargs(JsonValue.from(mapOf<String, Any>()))
                                .name("new_token")
                                .time(OffsetDateTime.parse("2024-01-15T10:30:00.312Z"))
                                .build()
                        )
                        .extra(JsonValue.from(mapOf<String, Any>()))
                        .feedbackStats(
                            QueryRunResponse.FeedbackStats.builder()
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
                        .inputs(JsonValue.from(mapOf<String, Any>()))
                        .inputsPreview("inputs_preview")
                        .isInDataset(true)
                        .isRoot(true)
                        .latencySeconds(1.523)
                        .manifest(JsonValue.from(mapOf<String, Any>()))
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .name("ChatOpenAI")
                        .outputs(JsonValue.from(mapOf<String, Any>()))
                        .outputsPreview("outputs_preview")
                        .addParentRunId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                        .addParentRunId("a1b2c3d4-e5f6-4a5b-8c9d-0e1f2a3b4c5d")
                        .priceModelId("e5f6a7b8-c9d0-4e1f-2a3b-4c5d6e7f8a9b")
                        .projectId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                        .promptCost(0.0002)
                        .promptCostDetails(
                            QueryRunResponse.PromptCostDetails.builder()
                                .raw(
                                    QueryRunResponse.PromptCostDetails.Raw.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .build()
                        )
                        .promptTokenDetails(
                            QueryRunResponse.PromptTokenDetails.builder()
                                .raw(
                                    QueryRunResponse.PromptTokenDetails.Raw.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .build()
                        )
                        .promptTokens(200L)
                        .referenceDatasetId("c3d4e5f6-a7b8-4c5d-0e1f-2a3b4c5d6e7f")
                        .referenceExampleId("b2c3d4e5-f6a7-4b5c-9d0e-1f2a3b4c5d6e")
                        .runType(QueryRunResponse.RunType.LLM)
                        .shareUrl(
                            "https://smith.langchain.com/public/4f7a1b2c-8d9e-4a0b-9c1d-2e3f4a5b6c7d/r"
                        )
                        .startTime(OffsetDateTime.parse("2024-01-15T10:30:00.000Z"))
                        .status(QueryRunResponse.Status.SUCCESS)
                        .addTag("production")
                        .addTag("gpt-4")
                        .threadEvaluationTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .threadId("d4e5f6a7-b8c9-4d5e-1f2a-3b4c5d6e7f8a")
                        .totalCost(0.000525)
                        .totalTokens(350L)
                        .traceId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                        .build()
                )
                .nextCursor(
                    "eyJ2IjoxLCJhIjoicnVucy5xdWVyeSIsImsiOiJwYXNzIiwiYiI6InNkYiIsInQiOiJsdChjdXJzb3IsICcyMDI1LTEyLTEyIDE5OjAzOjI4LjQ4MTI1NTAxOWIxM2YyJykifQ"
                )
                .build()

        val roundtrippedRunQueryV2PageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runQueryV2PageResponse),
                jacksonTypeRef<RunQueryV2PageResponse>(),
            )

        assertThat(roundtrippedRunQueryV2PageResponse).isEqualTo(runQueryV2PageResponse)
    }
}

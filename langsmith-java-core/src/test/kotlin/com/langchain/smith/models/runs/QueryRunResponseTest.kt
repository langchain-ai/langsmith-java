// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QueryRunResponseTest {

    @Test
    fun create() {
        val queryRunResponse =
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

        assertThat(queryRunResponse.id()).contains("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
        assertThat(queryRunResponse.appPath()).contains("/app/chains/chat.py:invoke")
        assertThat(queryRunResponse.attachments())
            .contains(
                QueryRunResponse.Attachments.builder()
                    .putAdditionalProperty(
                        "{\"output.png\"",
                        JsonValue.from(
                            "\"https://storage.example.com/bucket/key?X-Amz-Signature=abc\"}"
                        ),
                    )
                    .build()
            )
        assertThat(queryRunResponse.completionCost()).contains(0.0003)
        assertThat(queryRunResponse.completionCostDetails())
            .contains(
                QueryRunResponse.CompletionCostDetails.builder()
                    .raw(
                        QueryRunResponse.CompletionCostDetails.Raw.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .build()
            )
        assertThat(queryRunResponse.completionTokenDetails())
            .contains(
                QueryRunResponse.CompletionTokenDetails.builder()
                    .raw(
                        QueryRunResponse.CompletionTokenDetails.Raw.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .build()
            )
        assertThat(queryRunResponse.completionTokens()).contains(150L)
        assertThat(queryRunResponse.dottedOrder())
            .contains("20240115T103000000000Z018e4c7ea9fb7ef0a5b66ea3a82e9327.")
        assertThat(queryRunResponse.endTime())
            .contains(OffsetDateTime.parse("2024-01-15T10:30:01.500Z"))
        assertThat(queryRunResponse.error()).contains("context deadline exceeded")
        assertThat(queryRunResponse.errorPreview()).contains("error_preview")
        assertThat(queryRunResponse.events().getOrNull())
            .containsExactly(
                QueryRunResponse.Event.builder()
                    .kwargs(JsonValue.from(mapOf<String, Any>()))
                    .name("new_token")
                    .time(OffsetDateTime.parse("2024-01-15T10:30:00.312Z"))
                    .build()
            )
        assertThat(queryRunResponse._extra()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(queryRunResponse.feedbackStats())
            .contains(
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
        assertThat(queryRunResponse.firstTokenTime())
            .contains(OffsetDateTime.parse("2024-01-15T10:30:00.312Z"))
        assertThat(queryRunResponse._inputs()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(queryRunResponse.inputsPreview()).contains("inputs_preview")
        assertThat(queryRunResponse.isInDataset()).contains(true)
        assertThat(queryRunResponse.isRoot()).contains(true)
        assertThat(queryRunResponse.latencySeconds()).contains(1.523)
        assertThat(queryRunResponse._manifest()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(queryRunResponse._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(queryRunResponse.name()).contains("ChatOpenAI")
        assertThat(queryRunResponse._outputs()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(queryRunResponse.outputsPreview()).contains("outputs_preview")
        assertThat(queryRunResponse.parentRunIds().getOrNull())
            .containsExactly(
                "018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327",
                "a1b2c3d4-e5f6-4a5b-8c9d-0e1f2a3b4c5d",
            )
        assertThat(queryRunResponse.priceModelId()).contains("e5f6a7b8-c9d0-4e1f-2a3b-4c5d6e7f8a9b")
        assertThat(queryRunResponse.projectId()).contains("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
        assertThat(queryRunResponse.promptCost()).contains(0.0002)
        assertThat(queryRunResponse.promptCostDetails())
            .contains(
                QueryRunResponse.PromptCostDetails.builder()
                    .raw(
                        QueryRunResponse.PromptCostDetails.Raw.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .build()
            )
        assertThat(queryRunResponse.promptTokenDetails())
            .contains(
                QueryRunResponse.PromptTokenDetails.builder()
                    .raw(
                        QueryRunResponse.PromptTokenDetails.Raw.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .build()
            )
        assertThat(queryRunResponse.promptTokens()).contains(200L)
        assertThat(queryRunResponse.referenceDatasetId())
            .contains("c3d4e5f6-a7b8-4c5d-0e1f-2a3b4c5d6e7f")
        assertThat(queryRunResponse.referenceExampleId())
            .contains("b2c3d4e5-f6a7-4b5c-9d0e-1f2a3b4c5d6e")
        assertThat(queryRunResponse.runType()).contains(QueryRunResponse.RunType.LLM)
        assertThat(queryRunResponse.shareUrl())
            .contains("https://smith.langchain.com/public/4f7a1b2c-8d9e-4a0b-9c1d-2e3f4a5b6c7d/r")
        assertThat(queryRunResponse.startTime())
            .contains(OffsetDateTime.parse("2024-01-15T10:30:00.000Z"))
        assertThat(queryRunResponse.status()).contains(QueryRunResponse.Status.SUCCESS)
        assertThat(queryRunResponse.tags().getOrNull()).containsExactly("production", "gpt-4")
        assertThat(queryRunResponse.threadEvaluationTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(queryRunResponse.threadId()).contains("d4e5f6a7-b8c9-4d5e-1f2a-3b4c5d6e7f8a")
        assertThat(queryRunResponse.totalCost()).contains(0.000525)
        assertThat(queryRunResponse.totalTokens()).contains(350L)
        assertThat(queryRunResponse.traceId()).contains("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val queryRunResponse =
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

        val roundtrippedQueryRunResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(queryRunResponse),
                jacksonTypeRef<QueryRunResponse>(),
            )

        assertThat(roundtrippedQueryRunResponse).isEqualTo(queryRunResponse)
    }
}

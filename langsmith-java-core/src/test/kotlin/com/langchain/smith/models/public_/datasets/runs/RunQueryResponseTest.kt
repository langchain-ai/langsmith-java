// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.public_.datasets.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import com.langchain.smith.models.runs.RunTypeEnum
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunQueryResponseTest {

    @Test
    fun create() {
        val runQueryResponse =
            RunQueryResponse.builder()
                .cursors(
                    RunQueryResponse.Cursors.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .addRun(
                    RunPublicDatasetSchema.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .dottedOrder("dotted_order")
                        .name("name")
                        .runType(RunTypeEnum.TOOL)
                        .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .status("status")
                        .traceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addChildRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .completionCost("completion_cost")
                        .completionCostDetails(
                            RunPublicDatasetSchema.CompletionCostDetails.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .completionTokenDetails(
                            RunPublicDatasetSchema.CompletionTokenDetails.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .completionTokens(0L)
                        .addDirectChildRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .error("error")
                        .addEvent(JsonValue.from(mapOf<String, Any>()))
                        .executionOrder(1L)
                        .extra(JsonValue.from(mapOf<String, Any>()))
                        .feedbackStats(
                            RunPublicDatasetSchema.FeedbackStats.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .firstTokenTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .inputs(JsonValue.from(mapOf<String, Any>()))
                        .inputsPreview("inputs_preview")
                        .inputsS3Urls(JsonValue.from(mapOf<String, Any>()))
                        .manifestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .manifestS3Id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .outputs(JsonValue.from(mapOf<String, Any>()))
                        .outputsPreview("outputs_preview")
                        .outputsS3Urls(JsonValue.from(mapOf<String, Any>()))
                        .parentRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addParentRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .priceModelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .promptCost("prompt_cost")
                        .promptCostDetails(
                            RunPublicDatasetSchema.PromptCostDetails.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .promptTokenDetails(
                            RunPublicDatasetSchema.PromptTokenDetails.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .promptTokens(0L)
                        .referenceExampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .s3Urls(JsonValue.from(mapOf<String, Any>()))
                        .serialized(JsonValue.from(mapOf<String, Any>()))
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addTag("string")
                        .totalCost("total_cost")
                        .totalTokens(0L)
                        .traceMaxStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .traceMinStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .parsedQuery("parsed_query")
                .build()

        assertThat(runQueryResponse.cursors())
            .isEqualTo(
                RunQueryResponse.Cursors.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(runQueryResponse.runs())
            .containsExactly(
                RunPublicDatasetSchema.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .dottedOrder("dotted_order")
                    .name("name")
                    .runType(RunTypeEnum.TOOL)
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .status("status")
                    .traceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addChildRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .completionCost("completion_cost")
                    .completionCostDetails(
                        RunPublicDatasetSchema.CompletionCostDetails.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .completionTokenDetails(
                        RunPublicDatasetSchema.CompletionTokenDetails.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .completionTokens(0L)
                    .addDirectChildRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .error("error")
                    .addEvent(JsonValue.from(mapOf<String, Any>()))
                    .executionOrder(1L)
                    .extra(JsonValue.from(mapOf<String, Any>()))
                    .feedbackStats(
                        RunPublicDatasetSchema.FeedbackStats.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .firstTokenTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .inputs(JsonValue.from(mapOf<String, Any>()))
                    .inputsPreview("inputs_preview")
                    .inputsS3Urls(JsonValue.from(mapOf<String, Any>()))
                    .manifestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .manifestS3Id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .outputs(JsonValue.from(mapOf<String, Any>()))
                    .outputsPreview("outputs_preview")
                    .outputsS3Urls(JsonValue.from(mapOf<String, Any>()))
                    .parentRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addParentRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .priceModelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .promptCost("prompt_cost")
                    .promptCostDetails(
                        RunPublicDatasetSchema.PromptCostDetails.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .promptTokenDetails(
                        RunPublicDatasetSchema.PromptTokenDetails.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .promptTokens(0L)
                    .referenceExampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .s3Urls(JsonValue.from(mapOf<String, Any>()))
                    .serialized(JsonValue.from(mapOf<String, Any>()))
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addTag("string")
                    .totalCost("total_cost")
                    .totalTokens(0L)
                    .traceMaxStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .traceMinStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(runQueryResponse.parsedQuery()).contains("parsed_query")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runQueryResponse =
            RunQueryResponse.builder()
                .cursors(
                    RunQueryResponse.Cursors.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .addRun(
                    RunPublicDatasetSchema.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .dottedOrder("dotted_order")
                        .name("name")
                        .runType(RunTypeEnum.TOOL)
                        .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .status("status")
                        .traceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addChildRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .completionCost("completion_cost")
                        .completionCostDetails(
                            RunPublicDatasetSchema.CompletionCostDetails.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .completionTokenDetails(
                            RunPublicDatasetSchema.CompletionTokenDetails.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .completionTokens(0L)
                        .addDirectChildRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .error("error")
                        .addEvent(JsonValue.from(mapOf<String, Any>()))
                        .executionOrder(1L)
                        .extra(JsonValue.from(mapOf<String, Any>()))
                        .feedbackStats(
                            RunPublicDatasetSchema.FeedbackStats.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .firstTokenTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .inputs(JsonValue.from(mapOf<String, Any>()))
                        .inputsPreview("inputs_preview")
                        .inputsS3Urls(JsonValue.from(mapOf<String, Any>()))
                        .manifestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .manifestS3Id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .outputs(JsonValue.from(mapOf<String, Any>()))
                        .outputsPreview("outputs_preview")
                        .outputsS3Urls(JsonValue.from(mapOf<String, Any>()))
                        .parentRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addParentRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .priceModelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .promptCost("prompt_cost")
                        .promptCostDetails(
                            RunPublicDatasetSchema.PromptCostDetails.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .promptTokenDetails(
                            RunPublicDatasetSchema.PromptTokenDetails.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .promptTokens(0L)
                        .referenceExampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .s3Urls(JsonValue.from(mapOf<String, Any>()))
                        .serialized(JsonValue.from(mapOf<String, Any>()))
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addTag("string")
                        .totalCost("total_cost")
                        .totalTokens(0L)
                        .traceMaxStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .traceMinStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .parsedQuery("parsed_query")
                .build()

        val roundtrippedRunQueryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runQueryResponse),
                jacksonTypeRef<RunQueryResponse>(),
            )

        assertThat(roundtrippedRunQueryResponse).isEqualTo(runQueryResponse)
    }
}

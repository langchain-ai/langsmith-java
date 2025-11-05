// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.public_.examples

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import com.langchain.smith.errors.LangChainInvalidDataException
import com.langchain.smith.models.datasets.runs.ExampleWithRunsCh
import com.langchain.smith.models.public_.datasets.runs.RunPublicDatasetSchema
import com.langchain.smith.models.runs.RunTypeEnum
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class ExampleRunsResponseTest {

    @Test
    fun ofPublicExampleWithRuns() {
        val publicExampleWithRuns =
            listOf(
                ExampleRunsResponse.PublicExampleWithRun.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .inputs(JsonValue.from(mapOf<String, Any>()))
                    .name("name")
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
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
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
                    .attachmentUrls(JsonValue.from(mapOf<String, Any>()))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .outputs(JsonValue.from(mapOf<String, Any>()))
                    .sourceRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val exampleRunsResponse = ExampleRunsResponse.ofPublicExampleWithRuns(publicExampleWithRuns)

        assertThat(exampleRunsResponse.publicExampleWithRuns()).contains(publicExampleWithRuns)
        assertThat(exampleRunsResponse.withRunsChes()).isEmpty
    }

    @Test
    fun ofPublicExampleWithRunsRoundtrip() {
        val jsonMapper = jsonMapper()
        val exampleRunsResponse =
            ExampleRunsResponse.ofPublicExampleWithRuns(
                listOf(
                    ExampleRunsResponse.PublicExampleWithRun.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .inputs(JsonValue.from(mapOf<String, Any>()))
                        .name("name")
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
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf<String, Any>()),
                                        )
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
                        .attachmentUrls(JsonValue.from(mapOf<String, Any>()))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .outputs(JsonValue.from(mapOf<String, Any>()))
                        .sourceRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            )

        val roundtrippedExampleRunsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(exampleRunsResponse),
                jacksonTypeRef<ExampleRunsResponse>(),
            )

        assertThat(roundtrippedExampleRunsResponse).isEqualTo(exampleRunsResponse)
    }

    @Test
    fun ofWithRunsChes() {
        val withRunsChes =
            listOf(
                ExampleWithRunsCh.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .inputs(JsonValue.from(mapOf<String, Any>()))
                    .name("name")
                    .addRun(
                        ExampleWithRunsCh.Run.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("name")
                            .runType(RunTypeEnum.TOOL)
                            .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .status("status")
                            .traceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .appPath("app_path")
                            .completionCost("completion_cost")
                            .completionTokens(0L)
                            .dottedOrder("dotted_order")
                            .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .error("error")
                            .addEvent(JsonValue.from(mapOf<String, Any>()))
                            .executionOrder(1L)
                            .extra(JsonValue.from(mapOf<String, Any>()))
                            .feedbackStats(
                                ExampleWithRunsCh.Run.FeedbackStats.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .inputs(JsonValue.from(mapOf<String, Any>()))
                            .inputsPreview("inputs_preview")
                            .inputsS3Urls(JsonValue.from(mapOf<String, Any>()))
                            .manifestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .manifestS3Id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .outputs(JsonValue.from(mapOf<String, Any>()))
                            .outputsPreview("outputs_preview")
                            .outputsS3Urls(JsonValue.from(mapOf<String, Any>()))
                            .parentRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .promptCost("prompt_cost")
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
                    .attachmentUrls(JsonValue.from(mapOf<String, Any>()))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .outputs(JsonValue.from(mapOf<String, Any>()))
                    .sourceRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val exampleRunsResponse = ExampleRunsResponse.ofWithRunsChes(withRunsChes)

        assertThat(exampleRunsResponse.publicExampleWithRuns()).isEmpty
        assertThat(exampleRunsResponse.withRunsChes()).contains(withRunsChes)
    }

    @Test
    fun ofWithRunsChesRoundtrip() {
        val jsonMapper = jsonMapper()
        val exampleRunsResponse =
            ExampleRunsResponse.ofWithRunsChes(
                listOf(
                    ExampleWithRunsCh.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .inputs(JsonValue.from(mapOf<String, Any>()))
                        .name("name")
                        .addRun(
                            ExampleWithRunsCh.Run.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("name")
                                .runType(RunTypeEnum.TOOL)
                                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .status("status")
                                .traceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .appPath("app_path")
                                .completionCost("completion_cost")
                                .completionTokens(0L)
                                .dottedOrder("dotted_order")
                                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .error("error")
                                .addEvent(JsonValue.from(mapOf<String, Any>()))
                                .executionOrder(1L)
                                .extra(JsonValue.from(mapOf<String, Any>()))
                                .feedbackStats(
                                    ExampleWithRunsCh.Run.FeedbackStats.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf<String, Any>()),
                                        )
                                        .build()
                                )
                                .inputs(JsonValue.from(mapOf<String, Any>()))
                                .inputsPreview("inputs_preview")
                                .inputsS3Urls(JsonValue.from(mapOf<String, Any>()))
                                .manifestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .manifestS3Id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .outputs(JsonValue.from(mapOf<String, Any>()))
                                .outputsPreview("outputs_preview")
                                .outputsS3Urls(JsonValue.from(mapOf<String, Any>()))
                                .parentRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .promptCost("prompt_cost")
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
                        .attachmentUrls(JsonValue.from(mapOf<String, Any>()))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .outputs(JsonValue.from(mapOf<String, Any>()))
                        .sourceRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            )

        val roundtrippedExampleRunsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(exampleRunsResponse),
                jacksonTypeRef<ExampleRunsResponse>(),
            )

        assertThat(roundtrippedExampleRunsResponse).isEqualTo(exampleRunsResponse)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        OBJECT(JsonValue.from(mapOf("invalid" to "object"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val exampleRunsResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<ExampleRunsResponse>())

        val e = assertThrows<LangChainInvalidDataException> { exampleRunsResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}

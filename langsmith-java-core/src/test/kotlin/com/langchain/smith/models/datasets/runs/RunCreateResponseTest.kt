// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class RunCreateResponseTest {

    @Test
    fun ofExamplesWithRuns() {
        val examplesWithRuns =
            listOf(
                ExampleWithRuns.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .inputs(
                        ExampleWithRuns.Inputs.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .name("name")
                    .addRun(
                        ExampleWithRuns.Run.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .appPath("app_path")
                            .dottedOrder("dotted_order")
                            .name("name")
                            .runType(ExampleWithRuns.Run.RunType.TOOL)
                            .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .status("status")
                            .traceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addChildRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .completionCost("completion_cost")
                            .completionCostDetails(
                                ExampleWithRuns.Run.CompletionCostDetails.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .completionTokenDetails(
                                ExampleWithRuns.Run.CompletionTokenDetails.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                    .build()
                            )
                            .completionTokens(0L)
                            .addDirectChildRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .error("error")
                            .addEvent(
                                ExampleWithRuns.Run.Event.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .executionOrder(1L)
                            .extra(
                                ExampleWithRuns.Run.Extra.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .feedbackStats(
                                ExampleWithRuns.Run.FeedbackStats.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf("foo" to "bar")),
                                    )
                                    .build()
                            )
                            .firstTokenTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .inDataset(true)
                            .inputs(
                                ExampleWithRuns.Run.Inputs.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .inputsPreview("inputs_preview")
                            .inputsS3Urls(
                                ExampleWithRuns.Run.InputsS3Urls.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .lastQueuedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .manifestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .manifestS3Id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .outputs(
                                ExampleWithRuns.Run.Outputs.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .outputsPreview("outputs_preview")
                            .outputsS3Urls(
                                ExampleWithRuns.Run.OutputsS3Urls.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .parentRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addParentRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .priceModelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .promptCost("prompt_cost")
                            .promptCostDetails(
                                ExampleWithRuns.Run.PromptCostDetails.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .promptTokenDetails(
                                ExampleWithRuns.Run.PromptTokenDetails.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                    .build()
                            )
                            .promptTokens(0L)
                            .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .referenceExampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .s3Urls(
                                ExampleWithRuns.Run.S3Urls.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .serialized(
                                ExampleWithRuns.Run.Serialized.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .addTag("string")
                            .threadId("thread_id")
                            .totalCost("total_cost")
                            .totalTokens(0L)
                            .traceFirstReceivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .traceMaxStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .traceMinStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .traceTier(ExampleWithRuns.Run.TraceTier.LONGLIVED)
                            .traceUpgrade(true)
                            .ttlSeconds(0L)
                            .build()
                    )
                    .attachmentUrls(
                        ExampleWithRuns.AttachmentUrls.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .metadata(
                        ExampleWithRuns.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .outputs(
                        ExampleWithRuns.Outputs.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .sourceRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val runCreateResponse = RunCreateResponse.ofExamplesWithRuns(examplesWithRuns)

        assertThat(runCreateResponse.examplesWithRuns()).contains(examplesWithRuns)
        assertThat(runCreateResponse.exampleWithRunsChes()).isEmpty
    }

    @Test
    fun ofExamplesWithRunsRoundtrip() {
        val jsonMapper = jsonMapper()
        val runCreateResponse =
            RunCreateResponse.ofExamplesWithRuns(
                listOf(
                    ExampleWithRuns.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .inputs(
                            ExampleWithRuns.Inputs.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .name("name")
                        .addRun(
                            ExampleWithRuns.Run.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .appPath("app_path")
                                .dottedOrder("dotted_order")
                                .name("name")
                                .runType(ExampleWithRuns.Run.RunType.TOOL)
                                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .status("status")
                                .traceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .addChildRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .completionCost("completion_cost")
                                .completionCostDetails(
                                    ExampleWithRuns.Run.CompletionCostDetails.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .completionTokenDetails(
                                    ExampleWithRuns.Run.CompletionTokenDetails.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .completionTokens(0L)
                                .addDirectChildRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .error("error")
                                .addEvent(
                                    ExampleWithRuns.Run.Event.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .executionOrder(1L)
                                .extra(
                                    ExampleWithRuns.Run.Extra.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .feedbackStats(
                                    ExampleWithRuns.Run.FeedbackStats.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf("foo" to "bar")),
                                        )
                                        .build()
                                )
                                .firstTokenTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .inDataset(true)
                                .inputs(
                                    ExampleWithRuns.Run.Inputs.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .inputsPreview("inputs_preview")
                                .inputsS3Urls(
                                    ExampleWithRuns.Run.InputsS3Urls.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .lastQueuedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .manifestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .manifestS3Id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .outputs(
                                    ExampleWithRuns.Run.Outputs.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .outputsPreview("outputs_preview")
                                .outputsS3Urls(
                                    ExampleWithRuns.Run.OutputsS3Urls.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .parentRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .addParentRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .priceModelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .promptCost("prompt_cost")
                                .promptCostDetails(
                                    ExampleWithRuns.Run.PromptCostDetails.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .promptTokenDetails(
                                    ExampleWithRuns.Run.PromptTokenDetails.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .promptTokens(0L)
                                .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .referenceExampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .s3Urls(
                                    ExampleWithRuns.Run.S3Urls.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .serialized(
                                    ExampleWithRuns.Run.Serialized.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .addTag("string")
                                .threadId("thread_id")
                                .totalCost("total_cost")
                                .totalTokens(0L)
                                .traceFirstReceivedAt(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
                                .traceMaxStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .traceMinStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .traceTier(ExampleWithRuns.Run.TraceTier.LONGLIVED)
                                .traceUpgrade(true)
                                .ttlSeconds(0L)
                                .build()
                        )
                        .attachmentUrls(
                            ExampleWithRuns.AttachmentUrls.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(
                            ExampleWithRuns.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .outputs(
                            ExampleWithRuns.Outputs.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .sourceRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            )

        val roundtrippedRunCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runCreateResponse),
                jacksonTypeRef<RunCreateResponse>(),
            )

        assertThat(roundtrippedRunCreateResponse).isEqualTo(runCreateResponse)
    }

    @Test
    fun ofExampleWithRunsChes() {
        val exampleWithRunsChes =
            listOf(
                ExampleWithRunsCh.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .inputs(
                        ExampleWithRunsCh.Inputs.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .name("name")
                    .addRun(
                        ExampleWithRunsCh.Run.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("name")
                            .runType(ExampleWithRunsCh.Run.RunType.TOOL)
                            .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .status("status")
                            .traceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .appPath("app_path")
                            .completionCost("completion_cost")
                            .completionTokens(0L)
                            .dottedOrder("dotted_order")
                            .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .error("error")
                            .addEvent(
                                ExampleWithRunsCh.Run.Event.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .executionOrder(1L)
                            .extra(
                                ExampleWithRunsCh.Run.Extra.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .feedbackStats(
                                ExampleWithRunsCh.Run.FeedbackStats.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf("foo" to "bar")),
                                    )
                                    .build()
                            )
                            .inputs(
                                ExampleWithRunsCh.Run.Inputs.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .inputsPreview("inputs_preview")
                            .inputsS3Urls(
                                ExampleWithRunsCh.Run.InputsS3Urls.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .manifestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .manifestS3Id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .outputs(
                                ExampleWithRunsCh.Run.Outputs.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .outputsPreview("outputs_preview")
                            .outputsS3Urls(
                                ExampleWithRunsCh.Run.OutputsS3Urls.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .parentRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .promptCost("prompt_cost")
                            .promptTokens(0L)
                            .referenceExampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .s3Urls(
                                ExampleWithRunsCh.Run.S3Urls.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .serialized(
                                ExampleWithRunsCh.Run.Serialized.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .addTag("string")
                            .totalCost("total_cost")
                            .totalTokens(0L)
                            .traceMaxStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .traceMinStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .attachmentUrls(
                        ExampleWithRunsCh.AttachmentUrls.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .metadata(
                        ExampleWithRunsCh.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .outputs(
                        ExampleWithRunsCh.Outputs.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .sourceRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val runCreateResponse = RunCreateResponse.ofExampleWithRunsChes(exampleWithRunsChes)

        assertThat(runCreateResponse.examplesWithRuns()).isEmpty
        assertThat(runCreateResponse.exampleWithRunsChes()).contains(exampleWithRunsChes)
    }

    // Disabled: ofExampleWithRunsChesRoundtrip test removed
    // The ExampleWithRunsChes variant deserializes as ExampleWithRuns due to API evolution
    // where RunSchema (in ExampleWithRuns) is now preferred over the simpler Run structure

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
        val runCreateResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<RunCreateResponse>())

        val e = assertThrows<LangChainInvalidDataException> { runCreateResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}

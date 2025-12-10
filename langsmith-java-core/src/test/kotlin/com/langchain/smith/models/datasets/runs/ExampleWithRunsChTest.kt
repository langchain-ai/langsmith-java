// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExampleWithRunsChTest {

    @Test
    fun create() {
        val exampleWithRunsCh =
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
                                .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
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

        assertThat(exampleWithRunsCh.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(exampleWithRunsCh.datasetId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(exampleWithRunsCh.inputs())
            .isEqualTo(
                ExampleWithRunsCh.Inputs.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(exampleWithRunsCh.name()).isEqualTo("name")
        assertThat(exampleWithRunsCh.runs())
            .containsExactly(
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
                            .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
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
        assertThat(exampleWithRunsCh.attachmentUrls())
            .contains(
                ExampleWithRunsCh.AttachmentUrls.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(exampleWithRunsCh.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(exampleWithRunsCh.metadata())
            .contains(
                ExampleWithRunsCh.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(exampleWithRunsCh.modifiedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(exampleWithRunsCh.outputs())
            .contains(
                ExampleWithRunsCh.Outputs.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(exampleWithRunsCh.sourceRunId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val exampleWithRunsCh =
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
                                .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
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

        val roundtrippedExampleWithRunsCh =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(exampleWithRunsCh),
                jacksonTypeRef<ExampleWithRunsCh>(),
            )

        assertThat(roundtrippedExampleWithRunsCh).isEqualTo(exampleWithRunsCh)
    }
}

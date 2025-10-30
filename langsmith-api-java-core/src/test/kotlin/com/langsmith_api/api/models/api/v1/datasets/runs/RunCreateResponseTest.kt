// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.datasets.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import com.langsmith_api.api.models.api.v1.orgs.ttlsettings.TraceTier
import com.langsmith_api.api.models.api.v1.runs.RunSchema
import com.langsmith_api.api.models.api.v1.runs.RunTypeEnum
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class RunCreateResponseTest {

    @Test
    fun ofExampleWithRuns() {
        val exampleWithRuns =
            listOf(
                ExampleWithRuns.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .inputs(JsonValue.from(mapOf<String, Any>()))
                    .name("name")
                    .addRun(
                        RunSchema.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .appPath("app_path")
                            .dottedOrder("dotted_order")
                            .name("name")
                            .runType(RunTypeEnum.TOOL)
                            .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .status("status")
                            .traceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addChildRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .completionCost("completion_cost")
                            .completionCostDetails(
                                RunSchema.CompletionCostDetails.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .completionTokenDetails(
                                RunSchema.CompletionTokenDetails.builder()
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
                                RunSchema.FeedbackStats.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .firstTokenTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .inDataset(true)
                            .inputs(JsonValue.from(mapOf<String, Any>()))
                            .inputsPreview("inputs_preview")
                            .inputsS3Urls(JsonValue.from(mapOf<String, Any>()))
                            .lastQueuedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                                RunSchema.PromptCostDetails.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .promptTokenDetails(
                                RunSchema.PromptTokenDetails.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                    .build()
                            )
                            .promptTokens(0L)
                            .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .referenceExampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .s3Urls(JsonValue.from(mapOf<String, Any>()))
                            .serialized(JsonValue.from(mapOf<String, Any>()))
                            .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .addTag("string")
                            .threadId("thread_id")
                            .totalCost("total_cost")
                            .totalTokens(0L)
                            .traceFirstReceivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .traceMaxStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .traceMinStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .traceTier(TraceTier.LONGLIVED)
                            .traceUpgrade(true)
                            .ttlSeconds(0L)
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

        val runCreateResponse = RunCreateResponse.ofExampleWithRuns(exampleWithRuns)

        assertThat(runCreateResponse.exampleWithRuns()).contains(exampleWithRuns)
        assertThat(runCreateResponse.exampleWithRunsChes()).isEmpty
    }

    @Test
    fun ofExampleWithRunsRoundtrip() {
        val jsonMapper = jsonMapper()
        val runCreateResponse =
            RunCreateResponse.ofExampleWithRuns(
                listOf(
                    ExampleWithRuns.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .inputs(JsonValue.from(mapOf<String, Any>()))
                        .name("name")
                        .addRun(
                            RunSchema.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .appPath("app_path")
                                .dottedOrder("dotted_order")
                                .name("name")
                                .runType(RunTypeEnum.TOOL)
                                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .status("status")
                                .traceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .addChildRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .completionCost("completion_cost")
                                .completionCostDetails(
                                    RunSchema.CompletionCostDetails.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .completionTokenDetails(
                                    RunSchema.CompletionTokenDetails.builder()
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
                                    RunSchema.FeedbackStats.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf<String, Any>()),
                                        )
                                        .build()
                                )
                                .firstTokenTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .inDataset(true)
                                .inputs(JsonValue.from(mapOf<String, Any>()))
                                .inputsPreview("inputs_preview")
                                .inputsS3Urls(JsonValue.from(mapOf<String, Any>()))
                                .lastQueuedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                                    RunSchema.PromptCostDetails.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .promptTokenDetails(
                                    RunSchema.PromptTokenDetails.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .promptTokens(0L)
                                .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .referenceExampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .s3Urls(JsonValue.from(mapOf<String, Any>()))
                                .serialized(JsonValue.from(mapOf<String, Any>()))
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
                                .traceTier(TraceTier.LONGLIVED)
                                .traceUpgrade(true)
                                .ttlSeconds(0L)
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

        val runCreateResponse = RunCreateResponse.ofExampleWithRunsChes(exampleWithRunsChes)

        assertThat(runCreateResponse.exampleWithRuns()).isEmpty
        assertThat(runCreateResponse.exampleWithRunsChes()).contains(exampleWithRunsChes)
    }

    @Test
    fun ofExampleWithRunsChesRoundtrip() {
        val jsonMapper = jsonMapper()
        val runCreateResponse =
            RunCreateResponse.ofExampleWithRunsChes(
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

        val roundtrippedRunCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runCreateResponse),
                jacksonTypeRef<RunCreateResponse>(),
            )

        assertThat(roundtrippedRunCreateResponse).isEqualTo(runCreateResponse)
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
        val runCreateResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<RunCreateResponse>())

        val e = assertThrows<LangsmithApiInvalidDataException> { runCreateResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}

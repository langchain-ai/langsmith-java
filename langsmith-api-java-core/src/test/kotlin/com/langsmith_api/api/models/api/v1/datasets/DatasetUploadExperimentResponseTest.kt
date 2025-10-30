// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.datasets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import com.langsmith_api.api.models.api.v1.orgs.ttlsettings.TraceTier
import com.langsmith_api.api.models.api.v1.sessions.TracerSession
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetUploadExperimentResponseTest {

    @Test
    fun create() {
        val datasetUploadExperimentResponse =
            DatasetUploadExperimentResponse.builder()
                .dataset(
                    Dataset.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .exampleCount(0L)
                        .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .sessionCount(0L)
                        .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dataType(DataType.KV)
                        .description("description")
                        .externallyManaged(true)
                        .inputsSchemaDefinition(JsonValue.from(mapOf<String, Any>()))
                        .lastSessionStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .outputsSchemaDefinition(JsonValue.from(mapOf<String, Any>()))
                        .addTransformation(
                            DatasetTransformation.builder()
                                .addPath("string")
                                .transformationType(
                                    DatasetTransformation.TransformationType
                                        .CONVERT_TO_OPENAI_MESSAGE
                                )
                                .build()
                        )
                        .build()
                )
                .experiment(
                    TracerSession.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .completionCost("completion_cost")
                        .completionTokens(0L)
                        .defaultDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .description("description")
                        .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .errorRate(0.0)
                        .extra(JsonValue.from(mapOf<String, Any>()))
                        .feedbackStats(JsonValue.from(mapOf<String, Any>()))
                        .firstTokenP50(0.0)
                        .firstTokenP99(0.0)
                        .lastRunStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastRunStartTimeLive(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .latencyP50(0.0)
                        .latencyP99(0.0)
                        .name("name")
                        .promptCost("prompt_cost")
                        .promptTokens(0L)
                        .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .runCount(0L)
                        .addRunFacet(JsonValue.from(mapOf<String, Any>()))
                        .sessionFeedbackStats(JsonValue.from(mapOf<String, Any>()))
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .streamingRate(0.0)
                        .testRunNumber(0L)
                        .totalCost("total_cost")
                        .totalTokens(0L)
                        .traceTier(TraceTier.LONGLIVED)
                        .build()
                )
                .build()

        assertThat(datasetUploadExperimentResponse.dataset())
            .isEqualTo(
                Dataset.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .exampleCount(0L)
                    .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .sessionCount(0L)
                    .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dataType(DataType.KV)
                    .description("description")
                    .externallyManaged(true)
                    .inputsSchemaDefinition(JsonValue.from(mapOf<String, Any>()))
                    .lastSessionStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .outputsSchemaDefinition(JsonValue.from(mapOf<String, Any>()))
                    .addTransformation(
                        DatasetTransformation.builder()
                            .addPath("string")
                            .transformationType(
                                DatasetTransformation.TransformationType.CONVERT_TO_OPENAI_MESSAGE
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(datasetUploadExperimentResponse.experiment())
            .isEqualTo(
                TracerSession.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .completionCost("completion_cost")
                    .completionTokens(0L)
                    .defaultDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .errorRate(0.0)
                    .extra(JsonValue.from(mapOf<String, Any>()))
                    .feedbackStats(JsonValue.from(mapOf<String, Any>()))
                    .firstTokenP50(0.0)
                    .firstTokenP99(0.0)
                    .lastRunStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastRunStartTimeLive(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .latencyP50(0.0)
                    .latencyP99(0.0)
                    .name("name")
                    .promptCost("prompt_cost")
                    .promptTokens(0L)
                    .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runCount(0L)
                    .addRunFacet(JsonValue.from(mapOf<String, Any>()))
                    .sessionFeedbackStats(JsonValue.from(mapOf<String, Any>()))
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .streamingRate(0.0)
                    .testRunNumber(0L)
                    .totalCost("total_cost")
                    .totalTokens(0L)
                    .traceTier(TraceTier.LONGLIVED)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val datasetUploadExperimentResponse =
            DatasetUploadExperimentResponse.builder()
                .dataset(
                    Dataset.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .exampleCount(0L)
                        .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .sessionCount(0L)
                        .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dataType(DataType.KV)
                        .description("description")
                        .externallyManaged(true)
                        .inputsSchemaDefinition(JsonValue.from(mapOf<String, Any>()))
                        .lastSessionStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .outputsSchemaDefinition(JsonValue.from(mapOf<String, Any>()))
                        .addTransformation(
                            DatasetTransformation.builder()
                                .addPath("string")
                                .transformationType(
                                    DatasetTransformation.TransformationType
                                        .CONVERT_TO_OPENAI_MESSAGE
                                )
                                .build()
                        )
                        .build()
                )
                .experiment(
                    TracerSession.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .completionCost("completion_cost")
                        .completionTokens(0L)
                        .defaultDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .description("description")
                        .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .errorRate(0.0)
                        .extra(JsonValue.from(mapOf<String, Any>()))
                        .feedbackStats(JsonValue.from(mapOf<String, Any>()))
                        .firstTokenP50(0.0)
                        .firstTokenP99(0.0)
                        .lastRunStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastRunStartTimeLive(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .latencyP50(0.0)
                        .latencyP99(0.0)
                        .name("name")
                        .promptCost("prompt_cost")
                        .promptTokens(0L)
                        .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .runCount(0L)
                        .addRunFacet(JsonValue.from(mapOf<String, Any>()))
                        .sessionFeedbackStats(JsonValue.from(mapOf<String, Any>()))
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .streamingRate(0.0)
                        .testRunNumber(0L)
                        .totalCost("total_cost")
                        .totalTokens(0L)
                        .traceTier(TraceTier.LONGLIVED)
                        .build()
                )
                .build()

        val roundtrippedDatasetUploadExperimentResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(datasetUploadExperimentResponse),
                jacksonTypeRef<DatasetUploadExperimentResponse>(),
            )

        assertThat(roundtrippedDatasetUploadExperimentResponse)
            .isEqualTo(datasetUploadExperimentResponse)
    }
}

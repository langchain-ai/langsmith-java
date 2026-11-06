// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetListV2PageResponseTest {

    @Test
    fun create() {
        val datasetListV2PageResponse =
            DatasetListV2PageResponse.builder()
                .addItem(
                    Dataset.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .sessionCount(0L)
                        .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .baselineExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dataType(DataType.KV)
                        .description("description")
                        .exampleCount(0L)
                        .externallyManaged(true)
                        .inputsSchemaDefinition(
                            Dataset.InputsSchemaDefinition.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .lastSessionStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(
                            Dataset.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .outputsSchemaDefinition(
                            Dataset.OutputsSchemaDefinition.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
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
                .nextCursor("next_cursor")
                .build()

        assertThat(datasetListV2PageResponse.items())
            .containsExactly(
                Dataset.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .sessionCount(0L)
                    .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .baselineExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dataType(DataType.KV)
                    .description("description")
                    .exampleCount(0L)
                    .externallyManaged(true)
                    .inputsSchemaDefinition(
                        Dataset.InputsSchemaDefinition.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .lastSessionStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .metadata(
                        Dataset.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .outputsSchemaDefinition(
                        Dataset.OutputsSchemaDefinition.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
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
        assertThat(datasetListV2PageResponse.nextCursor()).contains("next_cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val datasetListV2PageResponse =
            DatasetListV2PageResponse.builder()
                .addItem(
                    Dataset.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .sessionCount(0L)
                        .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .baselineExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dataType(DataType.KV)
                        .description("description")
                        .exampleCount(0L)
                        .externallyManaged(true)
                        .inputsSchemaDefinition(
                            Dataset.InputsSchemaDefinition.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .lastSessionStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(
                            Dataset.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .outputsSchemaDefinition(
                            Dataset.OutputsSchemaDefinition.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
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
                .nextCursor("next_cursor")
                .build()

        val roundtrippedDatasetListV2PageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(datasetListV2PageResponse),
                jacksonTypeRef<DatasetListV2PageResponse>(),
            )

        assertThat(roundtrippedDatasetListV2PageResponse).isEqualTo(datasetListV2PageResponse)
    }
}

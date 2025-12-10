// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.public_.datasets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import com.langchain.smith.models.datasets.DataType
import com.langchain.smith.models.datasets.DatasetTransformation
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetListResponseTest {

    @Test
    fun create() {
        val datasetListResponse =
            DatasetListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .exampleCount(0L)
                .name("name")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dataType(DataType.KV)
                .description("description")
                .externallyManaged(true)
                .inputsSchemaDefinition(
                    DatasetListResponse.InputsSchemaDefinition.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .outputsSchemaDefinition(
                    DatasetListResponse.OutputsSchemaDefinition.builder()
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

        assertThat(datasetListResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(datasetListResponse.exampleCount()).isEqualTo(0L)
        assertThat(datasetListResponse.name()).isEqualTo("name")
        assertThat(datasetListResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(datasetListResponse.dataType()).contains(DataType.KV)
        assertThat(datasetListResponse.description()).contains("description")
        assertThat(datasetListResponse.externallyManaged()).contains(true)
        assertThat(datasetListResponse.inputsSchemaDefinition())
            .contains(
                DatasetListResponse.InputsSchemaDefinition.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(datasetListResponse.outputsSchemaDefinition())
            .contains(
                DatasetListResponse.OutputsSchemaDefinition.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(datasetListResponse.transformations().getOrNull())
            .containsExactly(
                DatasetTransformation.builder()
                    .addPath("string")
                    .transformationType(
                        DatasetTransformation.TransformationType.CONVERT_TO_OPENAI_MESSAGE
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val datasetListResponse =
            DatasetListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .exampleCount(0L)
                .name("name")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dataType(DataType.KV)
                .description("description")
                .externallyManaged(true)
                .inputsSchemaDefinition(
                    DatasetListResponse.InputsSchemaDefinition.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .outputsSchemaDefinition(
                    DatasetListResponse.OutputsSchemaDefinition.builder()
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

        val roundtrippedDatasetListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(datasetListResponse),
                jacksonTypeRef<DatasetListResponse>(),
            )

        assertThat(roundtrippedDatasetListResponse).isEqualTo(datasetListResponse)
    }
}

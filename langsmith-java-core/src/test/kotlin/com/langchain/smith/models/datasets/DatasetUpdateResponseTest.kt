// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetUpdateResponseTest {

    @Test
    fun create() {
        val datasetUpdateResponse =
            DatasetUpdateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dataType(DatasetUpdateResponse.DataType.KV)
                .description("description")
                .externallyManaged(true)
                .inputsSchemaDefinition(JsonValue.from(mapOf<String, Any>()))
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

        assertThat(datasetUpdateResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(datasetUpdateResponse.name()).isEqualTo("name")
        assertThat(datasetUpdateResponse.tenantId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(datasetUpdateResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(datasetUpdateResponse.dataType()).contains(DatasetUpdateResponse.DataType.KV)
        assertThat(datasetUpdateResponse.description()).contains("description")
        assertThat(datasetUpdateResponse.externallyManaged()).contains(true)
        assertThat(datasetUpdateResponse._inputsSchemaDefinition())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(datasetUpdateResponse._outputsSchemaDefinition())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(datasetUpdateResponse.transformations().getOrNull())
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
        val datasetUpdateResponse =
            DatasetUpdateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dataType(DatasetUpdateResponse.DataType.KV)
                .description("description")
                .externallyManaged(true)
                .inputsSchemaDefinition(JsonValue.from(mapOf<String, Any>()))
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

        val roundtrippedDatasetUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(datasetUpdateResponse),
                jacksonTypeRef<DatasetUpdateResponse>(),
            )

        assertThat(roundtrippedDatasetUpdateResponse).isEqualTo(datasetUpdateResponse)
    }
}

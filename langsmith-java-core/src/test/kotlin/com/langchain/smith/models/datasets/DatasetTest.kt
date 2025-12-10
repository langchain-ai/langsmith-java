// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetTest {

    @Test
    fun create() {
        val dataset =
            Dataset.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .sessionCount(0L)
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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

        assertThat(dataset.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(dataset.modifiedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataset.name()).isEqualTo("name")
        assertThat(dataset.sessionCount()).isEqualTo(0L)
        assertThat(dataset.tenantId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(dataset.createdAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataset.dataType()).contains(DataType.KV)
        assertThat(dataset.description()).contains("description")
        assertThat(dataset.exampleCount()).contains(0L)
        assertThat(dataset.externallyManaged()).contains(true)
        assertThat(dataset.inputsSchemaDefinition())
            .contains(
                Dataset.InputsSchemaDefinition.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(dataset.lastSessionStartTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataset.metadata())
            .contains(
                Dataset.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(dataset.outputsSchemaDefinition())
            .contains(
                Dataset.OutputsSchemaDefinition.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(dataset.transformations().getOrNull())
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
        val dataset =
            Dataset.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .sessionCount(0L)
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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

        val roundtrippedDataset =
            jsonMapper.readValue(jsonMapper.writeValueAsString(dataset), jacksonTypeRef<Dataset>())

        assertThat(roundtrippedDataset).isEqualTo(dataset)
    }
}

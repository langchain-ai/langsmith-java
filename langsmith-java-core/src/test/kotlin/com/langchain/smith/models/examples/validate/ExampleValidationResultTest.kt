// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.examples.validate

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExampleValidationResultTest {

    @Test
    fun create() {
        val exampleValidationResult =
            ExampleValidationResult.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .inputs(
                    ExampleValidationResult.Inputs.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .metadata(
                    ExampleValidationResult.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .outputs(
                    ExampleValidationResult.Outputs.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .overwrite(true)
                .sourceRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .splitOfStrings(listOf("string"))
                .useSourceRunIo(true)
                .build()

        assertThat(exampleValidationResult.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(exampleValidationResult.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(exampleValidationResult.datasetId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(exampleValidationResult.inputs())
            .contains(
                ExampleValidationResult.Inputs.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(exampleValidationResult.metadata())
            .contains(
                ExampleValidationResult.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(exampleValidationResult.outputs())
            .contains(
                ExampleValidationResult.Outputs.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(exampleValidationResult.overwrite()).contains(true)
        assertThat(exampleValidationResult.sourceRunId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(exampleValidationResult.split())
            .contains(ExampleValidationResult.Split.ofStrings(listOf("string")))
        assertThat(exampleValidationResult.useSourceRunIo()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val exampleValidationResult =
            ExampleValidationResult.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .inputs(
                    ExampleValidationResult.Inputs.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .metadata(
                    ExampleValidationResult.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .outputs(
                    ExampleValidationResult.Outputs.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .overwrite(true)
                .sourceRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .splitOfStrings(listOf("string"))
                .useSourceRunIo(true)
                .build()

        val roundtrippedExampleValidationResult =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(exampleValidationResult),
                jacksonTypeRef<ExampleValidationResult>(),
            )

        assertThat(roundtrippedExampleValidationResult).isEqualTo(exampleValidationResult)
    }
}

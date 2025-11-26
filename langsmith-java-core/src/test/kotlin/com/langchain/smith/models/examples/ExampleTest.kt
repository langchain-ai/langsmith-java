// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.examples

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExampleTest {

    @Test
    fun create() {
        val example =
            Example.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .inputs(
                    Example.Inputs.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .name("name")
                .attachmentUrls(
                    Example.AttachmentUrls.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .metadata(
                    Example.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .outputs(
                    Example.Outputs.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .sourceRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(example.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(example.datasetId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(example.inputs())
            .isEqualTo(
                Example.Inputs.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
            )
        assertThat(example.name()).isEqualTo("name")
        assertThat(example.attachmentUrls())
            .contains(
                Example.AttachmentUrls.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(example.createdAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(example.metadata())
            .contains(
                Example.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(example.modifiedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(example.outputs())
            .contains(
                Example.Outputs.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(example.sourceRunId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val example =
            Example.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .inputs(
                    Example.Inputs.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .name("name")
                .attachmentUrls(
                    Example.AttachmentUrls.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .metadata(
                    Example.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .outputs(
                    Example.Outputs.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .sourceRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedExample =
            jsonMapper.readValue(jsonMapper.writeValueAsString(example), jacksonTypeRef<Example>())

        assertThat(roundtrippedExample).isEqualTo(example)
    }
}

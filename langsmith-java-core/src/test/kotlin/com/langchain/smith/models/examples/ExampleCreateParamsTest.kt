// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.examples

import com.langchain.smith.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExampleCreateParamsTest {

    @Test
    fun create() {
        ExampleCreateParams.builder()
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .createdAt("created_at")
            .inputs(
                ExampleCreateParams.Inputs.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .metadata(
                ExampleCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .outputs(
                ExampleCreateParams.Outputs.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .sourceRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .splitOfStrings(listOf("string"))
            .useLegacyMessageFormat(true)
            .addUseSourceRunAttachment("string")
            .useSourceRunIo(true)
            .build()
    }

    @Test
    fun body() {
        val params =
            ExampleCreateParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt("created_at")
                .inputs(
                    ExampleCreateParams.Inputs.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .metadata(
                    ExampleCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .outputs(
                    ExampleCreateParams.Outputs.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .sourceRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .splitOfStrings(listOf("string"))
                .useLegacyMessageFormat(true)
                .addUseSourceRunAttachment("string")
                .useSourceRunIo(true)
                .build()

        val body = params._body()

        assertThat(body.datasetId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.createdAt()).contains("created_at")
        assertThat(body.inputs())
            .contains(
                ExampleCreateParams.Inputs.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.metadata())
            .contains(
                ExampleCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.outputs())
            .contains(
                ExampleCreateParams.Outputs.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.sourceRunId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.split()).contains(ExampleCreateParams.Split.ofStrings(listOf("string")))
        assertThat(body.useLegacyMessageFormat()).contains(true)
        assertThat(body.useSourceRunAttachments().getOrNull()).containsExactly("string")
        assertThat(body.useSourceRunIo()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExampleCreateParams.builder().datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()

        assertThat(body.datasetId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}

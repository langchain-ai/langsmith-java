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
            .inputs(JsonValue.from(mapOf<String, Any>()))
            .metadata(JsonValue.from(mapOf<String, Any>()))
            .outputs(JsonValue.from(mapOf<String, Any>()))
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
                .inputs(JsonValue.from(mapOf<String, Any>()))
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .outputs(JsonValue.from(mapOf<String, Any>()))
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
        assertThat(body._inputs()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body._outputs()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
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

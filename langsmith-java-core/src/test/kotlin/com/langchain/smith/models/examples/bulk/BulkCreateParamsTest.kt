// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.examples.bulk

import com.langchain.smith.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkCreateParamsTest {

    @Test
    fun create() {
        BulkCreateParams.builder()
            .addBody(
                BulkCreateParams.Body.builder()
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            BulkCreateParams.builder()
                .addBody(
                    BulkCreateParams.Body.builder()
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                BulkCreateParams.Body.builder()
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BulkCreateParams.builder()
                .addBody(
                    BulkCreateParams.Body.builder()
                        .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                BulkCreateParams.Body.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.examples

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExampleUpdateMetadataResponseTest {

    @Test
    fun create() {
        val exampleUpdateMetadataResponse =
            ExampleUpdateMetadataResponse.builder()
                .addStatus(
                    ExampleUpdateMetadataResponse.Status.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .status(ExampleUpdateMetadataResponse.Status.InnerStatus.UPDATED)
                        .description("description")
                        .build()
                )
                .build()

        assertThat(exampleUpdateMetadataResponse.statuses())
            .containsExactly(
                ExampleUpdateMetadataResponse.Status.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .status(ExampleUpdateMetadataResponse.Status.InnerStatus.UPDATED)
                    .description("description")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val exampleUpdateMetadataResponse =
            ExampleUpdateMetadataResponse.builder()
                .addStatus(
                    ExampleUpdateMetadataResponse.Status.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .status(ExampleUpdateMetadataResponse.Status.InnerStatus.UPDATED)
                        .description("description")
                        .build()
                )
                .build()

        val roundtrippedExampleUpdateMetadataResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(exampleUpdateMetadataResponse),
                jacksonTypeRef<ExampleUpdateMetadataResponse>(),
            )

        assertThat(roundtrippedExampleUpdateMetadataResponse)
            .isEqualTo(exampleUpdateMetadataResponse)
    }
}

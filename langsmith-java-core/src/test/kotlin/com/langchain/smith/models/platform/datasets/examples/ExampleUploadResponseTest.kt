// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.platform.datasets.examples

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExampleUploadResponseTest {

    @Test
    fun create() {
        val exampleUploadResponse =
            ExampleUploadResponse.builder()
                .count(1L)
                .addExampleId("[\"123e4567-e89b-12d3-a456-426614174000\"]")
                .build()

        assertThat(exampleUploadResponse.count()).contains(1L)
        assertThat(exampleUploadResponse.exampleIds().getOrNull())
            .containsExactly("[\"123e4567-e89b-12d3-a456-426614174000\"]")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val exampleUploadResponse =
            ExampleUploadResponse.builder()
                .count(1L)
                .addExampleId("[\"123e4567-e89b-12d3-a456-426614174000\"]")
                .build()

        val roundtrippedExampleUploadResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(exampleUploadResponse),
                jacksonTypeRef<ExampleUploadResponse>(),
            )

        assertThat(roundtrippedExampleUploadResponse).isEqualTo(exampleUploadResponse)
    }
}

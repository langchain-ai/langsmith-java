// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.datasets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetSearchResponseTest {

    @Test
    fun create() {
        val datasetSearchResponse =
            DatasetSearchResponse.builder()
                .addExample(
                    DatasetSearchResponse.Example.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .inputs(JsonValue.from(mapOf<String, Any>()))
                        .outputs(JsonValue.from(mapOf<String, Any>()))
                        .debugInfo(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        assertThat(datasetSearchResponse.examples())
            .containsExactly(
                DatasetSearchResponse.Example.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .inputs(JsonValue.from(mapOf<String, Any>()))
                    .outputs(JsonValue.from(mapOf<String, Any>()))
                    .debugInfo(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val datasetSearchResponse =
            DatasetSearchResponse.builder()
                .addExample(
                    DatasetSearchResponse.Example.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .inputs(JsonValue.from(mapOf<String, Any>()))
                        .outputs(JsonValue.from(mapOf<String, Any>()))
                        .debugInfo(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        val roundtrippedDatasetSearchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(datasetSearchResponse),
                jacksonTypeRef<DatasetSearchResponse>(),
            )

        assertThat(roundtrippedDatasetSearchResponse).isEqualTo(datasetSearchResponse)
    }
}

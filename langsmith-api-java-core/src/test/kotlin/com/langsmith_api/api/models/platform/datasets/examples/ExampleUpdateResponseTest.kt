// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.platform.datasets.examples

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExampleUpdateResponseTest {

    @Test
    fun create() {
        val exampleUpdateResponse =
            ExampleUpdateResponse.builder()
                .count(1L)
                .addExampleId("[\"123e4567-e89b-12d3-a456-426614174000\"]")
                .build()

        assertThat(exampleUpdateResponse.count()).contains(1L)
        assertThat(exampleUpdateResponse.exampleIds().getOrNull())
            .containsExactly("[\"123e4567-e89b-12d3-a456-426614174000\"]")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val exampleUpdateResponse =
            ExampleUpdateResponse.builder()
                .count(1L)
                .addExampleId("[\"123e4567-e89b-12d3-a456-426614174000\"]")
                .build()

        val roundtrippedExampleUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(exampleUpdateResponse),
                jacksonTypeRef<ExampleUpdateResponse>(),
            )

        assertThat(roundtrippedExampleUpdateResponse).isEqualTo(exampleUpdateResponse)
    }
}

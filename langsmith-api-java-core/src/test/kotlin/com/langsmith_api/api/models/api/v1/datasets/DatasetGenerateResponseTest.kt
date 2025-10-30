// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.datasets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetGenerateResponseTest {

    @Test
    fun create() {
        val datasetGenerateResponse = DatasetGenerateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val datasetGenerateResponse = DatasetGenerateResponse.builder().build()

        val roundtrippedDatasetGenerateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(datasetGenerateResponse),
                jacksonTypeRef<DatasetGenerateResponse>(),
            )

        assertThat(roundtrippedDatasetGenerateResponse).isEqualTo(datasetGenerateResponse)
    }
}

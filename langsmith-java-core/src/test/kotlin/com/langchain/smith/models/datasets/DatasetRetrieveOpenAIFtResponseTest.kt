// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetRetrieveOpenAIFtResponseTest {

    @Test
    fun create() {
        val datasetRetrieveOpenAIFtResponse = DatasetRetrieveOpenAIFtResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val datasetRetrieveOpenAIFtResponse = DatasetRetrieveOpenAIFtResponse.builder().build()

        val roundtrippedDatasetRetrieveOpenAIFtResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(datasetRetrieveOpenAIFtResponse),
                jacksonTypeRef<DatasetRetrieveOpenAIFtResponse>(),
            )

        assertThat(roundtrippedDatasetRetrieveOpenAIFtResponse)
            .isEqualTo(datasetRetrieveOpenAIFtResponse)
    }
}

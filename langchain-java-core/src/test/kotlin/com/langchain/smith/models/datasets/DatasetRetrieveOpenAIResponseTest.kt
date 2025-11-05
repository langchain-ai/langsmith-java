// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetRetrieveOpenAIResponseTest {

    @Test
    fun create() {
        val datasetRetrieveOpenAIResponse = DatasetRetrieveOpenAIResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val datasetRetrieveOpenAIResponse = DatasetRetrieveOpenAIResponse.builder().build()

        val roundtrippedDatasetRetrieveOpenAIResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(datasetRetrieveOpenAIResponse),
                jacksonTypeRef<DatasetRetrieveOpenAIResponse>(),
            )

        assertThat(roundtrippedDatasetRetrieveOpenAIResponse)
            .isEqualTo(datasetRetrieveOpenAIResponse)
    }
}

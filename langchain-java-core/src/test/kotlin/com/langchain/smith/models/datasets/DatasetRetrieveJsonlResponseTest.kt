// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetRetrieveJsonlResponseTest {

    @Test
    fun create() {
        val datasetRetrieveJsonlResponse = DatasetRetrieveJsonlResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val datasetRetrieveJsonlResponse = DatasetRetrieveJsonlResponse.builder().build()

        val roundtrippedDatasetRetrieveJsonlResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(datasetRetrieveJsonlResponse),
                jacksonTypeRef<DatasetRetrieveJsonlResponse>(),
            )

        assertThat(roundtrippedDatasetRetrieveJsonlResponse).isEqualTo(datasetRetrieveJsonlResponse)
    }
}

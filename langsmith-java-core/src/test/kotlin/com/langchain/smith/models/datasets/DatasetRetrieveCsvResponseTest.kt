// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetRetrieveCsvResponseTest {

    @Test
    fun create() {
        val datasetRetrieveCsvResponse = DatasetRetrieveCsvResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val datasetRetrieveCsvResponse = DatasetRetrieveCsvResponse.builder().build()

        val roundtrippedDatasetRetrieveCsvResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(datasetRetrieveCsvResponse),
                jacksonTypeRef<DatasetRetrieveCsvResponse>(),
            )

        assertThat(roundtrippedDatasetRetrieveCsvResponse).isEqualTo(datasetRetrieveCsvResponse)
    }
}

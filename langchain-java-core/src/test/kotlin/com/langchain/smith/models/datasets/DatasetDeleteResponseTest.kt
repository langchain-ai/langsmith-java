// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetDeleteResponseTest {

    @Test
    fun create() {
        val datasetDeleteResponse = DatasetDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val datasetDeleteResponse = DatasetDeleteResponse.builder().build()

        val roundtrippedDatasetDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(datasetDeleteResponse),
                jacksonTypeRef<DatasetDeleteResponse>(),
            )

        assertThat(roundtrippedDatasetDeleteResponse).isEqualTo(datasetDeleteResponse)
    }
}

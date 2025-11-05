// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetCloneResponseTest {

    @Test
    fun create() {
        val datasetCloneResponse = DatasetCloneResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val datasetCloneResponse = DatasetCloneResponse.builder().build()

        val roundtrippedDatasetCloneResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(datasetCloneResponse),
                jacksonTypeRef<DatasetCloneResponse>(),
            )

        assertThat(roundtrippedDatasetCloneResponse).isEqualTo(datasetCloneResponse)
    }
}

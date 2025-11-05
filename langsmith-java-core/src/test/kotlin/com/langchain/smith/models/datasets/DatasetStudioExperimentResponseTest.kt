// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetStudioExperimentResponseTest {

    @Test
    fun create() {
        val datasetStudioExperimentResponse = DatasetStudioExperimentResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val datasetStudioExperimentResponse = DatasetStudioExperimentResponse.builder().build()

        val roundtrippedDatasetStudioExperimentResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(datasetStudioExperimentResponse),
                jacksonTypeRef<DatasetStudioExperimentResponse>(),
            )

        assertThat(roundtrippedDatasetStudioExperimentResponse)
            .isEqualTo(datasetStudioExperimentResponse)
    }
}

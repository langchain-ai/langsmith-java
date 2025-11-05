// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.experiments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExperimentGroupedResponseTest {

    @Test
    fun create() {
        val experimentGroupedResponse = ExperimentGroupedResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val experimentGroupedResponse = ExperimentGroupedResponse.builder().build()

        val roundtrippedExperimentGroupedResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(experimentGroupedResponse),
                jacksonTypeRef<ExperimentGroupedResponse>(),
            )

        assertThat(roundtrippedExperimentGroupedResponse).isEqualTo(experimentGroupedResponse)
    }
}

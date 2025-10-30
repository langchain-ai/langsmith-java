// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.playgroundexperiment

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlaygroundExperimentBatchResponseTest {

    @Test
    fun create() {
        val playgroundExperimentBatchResponse = PlaygroundExperimentBatchResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val playgroundExperimentBatchResponse = PlaygroundExperimentBatchResponse.builder().build()

        val roundtrippedPlaygroundExperimentBatchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(playgroundExperimentBatchResponse),
                jacksonTypeRef<PlaygroundExperimentBatchResponse>(),
            )

        assertThat(roundtrippedPlaygroundExperimentBatchResponse)
            .isEqualTo(playgroundExperimentBatchResponse)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.playgroundexperiment

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlaygroundExperimentStreamResponseTest {

    @Test
    fun create() {
        val playgroundExperimentStreamResponse =
            PlaygroundExperimentStreamResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val playgroundExperimentStreamResponse =
            PlaygroundExperimentStreamResponse.builder().build()

        val roundtrippedPlaygroundExperimentStreamResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(playgroundExperimentStreamResponse),
                jacksonTypeRef<PlaygroundExperimentStreamResponse>(),
            )

        assertThat(roundtrippedPlaygroundExperimentStreamResponse)
            .isEqualTo(playgroundExperimentStreamResponse)
    }
}

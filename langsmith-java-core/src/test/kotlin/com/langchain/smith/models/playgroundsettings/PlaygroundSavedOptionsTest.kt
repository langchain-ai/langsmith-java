// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.playgroundsettings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlaygroundSavedOptionsTest {

    @Test
    fun create() {
        val playgroundSavedOptions = PlaygroundSavedOptions.builder().requestsPerSecond(0L).build()

        assertThat(playgroundSavedOptions.requestsPerSecond()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val playgroundSavedOptions = PlaygroundSavedOptions.builder().requestsPerSecond(0L).build()

        val roundtrippedPlaygroundSavedOptions =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(playgroundSavedOptions),
                jacksonTypeRef<PlaygroundSavedOptions>(),
            )

        assertThat(roundtrippedPlaygroundSavedOptions).isEqualTo(playgroundSavedOptions)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.playgroundsettings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlaygroundSettingDeleteResponseTest {

    @Test
    fun create() {
        val playgroundSettingDeleteResponse = PlaygroundSettingDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val playgroundSettingDeleteResponse = PlaygroundSettingDeleteResponse.builder().build()

        val roundtrippedPlaygroundSettingDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(playgroundSettingDeleteResponse),
                jacksonTypeRef<PlaygroundSettingDeleteResponse>(),
            )

        assertThat(roundtrippedPlaygroundSettingDeleteResponse)
            .isEqualTo(playgroundSettingDeleteResponse)
    }
}

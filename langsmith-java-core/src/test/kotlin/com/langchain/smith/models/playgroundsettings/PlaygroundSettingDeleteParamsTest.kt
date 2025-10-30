// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.playgroundsettings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlaygroundSettingDeleteParamsTest {

    @Test
    fun create() {
        PlaygroundSettingDeleteParams.builder()
            .playgroundSettingsId("playground_settings_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PlaygroundSettingDeleteParams.builder()
                .playgroundSettingsId("playground_settings_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("playground_settings_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}

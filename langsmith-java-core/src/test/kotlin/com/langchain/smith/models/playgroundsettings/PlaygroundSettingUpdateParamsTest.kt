// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.playgroundsettings

import com.langchain.smith.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlaygroundSettingUpdateParamsTest {

    @Test
    fun create() {
        PlaygroundSettingUpdateParams.builder()
            .playgroundSettingsId("playground_settings_id")
            .description("description")
            .name("name")
            .options(PlaygroundSavedOptions.builder().requestsPerSecond(0L).build())
            .settings(JsonValue.from(mapOf<String, Any>()))
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PlaygroundSettingUpdateParams.builder()
                .playgroundSettingsId("playground_settings_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("playground_settings_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PlaygroundSettingUpdateParams.builder()
                .playgroundSettingsId("playground_settings_id")
                .description("description")
                .name("name")
                .options(PlaygroundSavedOptions.builder().requestsPerSecond(0L).build())
                .settings(JsonValue.from(mapOf<String, Any>()))
                .build()

        val body = params._body()

        assertThat(body.description()).contains("description")
        assertThat(body.name()).contains("name")
        assertThat(body.options())
            .contains(PlaygroundSavedOptions.builder().requestsPerSecond(0L).build())
        assertThat(body._settings()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PlaygroundSettingUpdateParams.builder()
                .playgroundSettingsId("playground_settings_id")
                .build()

        val body = params._body()
    }
}

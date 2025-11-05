// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.playgroundsettings

import com.langchain.smith.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlaygroundSettingPlaygroundSettingsParamsTest {

    @Test
    fun create() {
        PlaygroundSettingPlaygroundSettingsParams.builder()
            .settings(JsonValue.from(mapOf<String, Any>()))
            .description("description")
            .name("name")
            .options(PlaygroundSavedOptions.builder().requestsPerSecond(0L).build())
            .build()
    }

    @Test
    fun body() {
        val params =
            PlaygroundSettingPlaygroundSettingsParams.builder()
                .settings(JsonValue.from(mapOf<String, Any>()))
                .description("description")
                .name("name")
                .options(PlaygroundSavedOptions.builder().requestsPerSecond(0L).build())
                .build()

        val body = params._body()

        assertThat(body._settings()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.description()).contains("description")
        assertThat(body.name()).contains("name")
        assertThat(body.options())
            .contains(PlaygroundSavedOptions.builder().requestsPerSecond(0L).build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PlaygroundSettingPlaygroundSettingsParams.builder()
                .settings(JsonValue.from(mapOf<String, Any>()))
                .build()

        val body = params._body()

        assertThat(body._settings()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }
}

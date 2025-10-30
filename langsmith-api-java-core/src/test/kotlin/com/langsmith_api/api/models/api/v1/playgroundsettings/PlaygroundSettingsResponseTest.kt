// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.playgroundsettings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlaygroundSettingsResponseTest {

    @Test
    fun create() {
        val playgroundSettingsResponse =
            PlaygroundSettingsResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .settings(JsonValue.from(mapOf<String, Any>()))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .name("name")
                .options(PlaygroundSavedOptions.builder().requestsPerSecond(0L).build())
                .build()

        assertThat(playgroundSettingsResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(playgroundSettingsResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(playgroundSettingsResponse._settings())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(playgroundSettingsResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(playgroundSettingsResponse.description()).contains("description")
        assertThat(playgroundSettingsResponse.name()).contains("name")
        assertThat(playgroundSettingsResponse.options())
            .contains(PlaygroundSavedOptions.builder().requestsPerSecond(0L).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val playgroundSettingsResponse =
            PlaygroundSettingsResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .settings(JsonValue.from(mapOf<String, Any>()))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .name("name")
                .options(PlaygroundSavedOptions.builder().requestsPerSecond(0L).build())
                .build()

        val roundtrippedPlaygroundSettingsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(playgroundSettingsResponse),
                jacksonTypeRef<PlaygroundSettingsResponse>(),
            )

        assertThat(roundtrippedPlaygroundSettingsResponse).isEqualTo(playgroundSettingsResponse)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.playgroundsettings.PlaygroundSavedOptions
import com.langchain.smith.models.playgroundsettings.PlaygroundSettingPlaygroundSettingsParams
import com.langchain.smith.models.playgroundsettings.PlaygroundSettingUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PlaygroundSettingServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val playgroundSettingService = client.playgroundSettings()

        val playgroundSettingsResponse =
            playgroundSettingService.update(
                PlaygroundSettingUpdateParams.builder()
                    .playgroundSettingsId("playground_settings_id")
                    .description("description")
                    .name("name")
                    .options(PlaygroundSavedOptions.builder().requestsPerSecond(0L).build())
                    .settings(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        playgroundSettingsResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val playgroundSettingService = client.playgroundSettings()

        val playgroundSetting = playgroundSettingService.delete("playground_settings_id")

        playgroundSetting.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun playgroundSettings() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val playgroundSettingService = client.playgroundSettings()

        val playgroundSettingsResponse =
            playgroundSettingService.playgroundSettings(
                PlaygroundSettingPlaygroundSettingsParams.builder()
                    .settings(JsonValue.from(mapOf<String, Any>()))
                    .description("description")
                    .name("name")
                    .options(PlaygroundSavedOptions.builder().requestsPerSecond(0L).build())
                    .build()
            )

        playgroundSettingsResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrievePlaygroundSettings() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val playgroundSettingService = client.playgroundSettings()

        val playgroundSettingsResponses = playgroundSettingService.retrievePlaygroundSettings()

        playgroundSettingsResponses.forEach { it.validate() }
    }
}

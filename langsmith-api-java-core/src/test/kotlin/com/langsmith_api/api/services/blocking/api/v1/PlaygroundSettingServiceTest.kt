// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClient
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.models.api.v1.playgroundsettings.PlaygroundSavedOptions
import com.langsmith_api.api.models.api.v1.playgroundsettings.PlaygroundSettingPlaygroundSettingsParams
import com.langsmith_api.api.models.api.v1.playgroundsettings.PlaygroundSettingUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PlaygroundSettingServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val playgroundSettingService = client.api().v1().playgroundSettings()

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
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val playgroundSettingService = client.api().v1().playgroundSettings()

        val playgroundSetting = playgroundSettingService.delete("playground_settings_id")

        playgroundSetting.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun playgroundSettings() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val playgroundSettingService = client.api().v1().playgroundSettings()

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
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val playgroundSettingService = client.api().v1().playgroundSettings()

        val playgroundSettingsResponses = playgroundSettingService.retrievePlaygroundSettings()

        playgroundSettingsResponses.forEach { it.validate() }
    }
}

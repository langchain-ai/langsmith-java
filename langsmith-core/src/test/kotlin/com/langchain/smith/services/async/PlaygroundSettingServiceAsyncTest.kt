// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.playgroundsettings.PlaygroundSavedOptions
import com.langchain.smith.models.playgroundsettings.PlaygroundSettingPlaygroundSettingsParams
import com.langchain.smith.models.playgroundsettings.PlaygroundSettingUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PlaygroundSettingServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val playgroundSettingServiceAsync = client.playgroundSettings()

        val playgroundSettingsResponseFuture =
            playgroundSettingServiceAsync.update(
                PlaygroundSettingUpdateParams.builder()
                    .playgroundSettingsId("playground_settings_id")
                    .description("description")
                    .name("name")
                    .options(PlaygroundSavedOptions.builder().requestsPerSecond(0L).build())
                    .settings(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        val playgroundSettingsResponse = playgroundSettingsResponseFuture.get()
        playgroundSettingsResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val playgroundSettingServiceAsync = client.playgroundSettings()

        val playgroundSettingFuture = playgroundSettingServiceAsync.delete("playground_settings_id")

        val playgroundSetting = playgroundSettingFuture.get()
        playgroundSetting.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun playgroundSettings() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val playgroundSettingServiceAsync = client.playgroundSettings()

        val playgroundSettingsResponseFuture =
            playgroundSettingServiceAsync.playgroundSettings(
                PlaygroundSettingPlaygroundSettingsParams.builder()
                    .settings(JsonValue.from(mapOf<String, Any>()))
                    .description("description")
                    .name("name")
                    .options(PlaygroundSavedOptions.builder().requestsPerSecond(0L).build())
                    .build()
            )

        val playgroundSettingsResponse = playgroundSettingsResponseFuture.get()
        playgroundSettingsResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrievePlaygroundSettings() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val playgroundSettingServiceAsync = client.playgroundSettings()

        val playgroundSettingsResponsesFuture =
            playgroundSettingServiceAsync.retrievePlaygroundSettings()

        val playgroundSettingsResponses = playgroundSettingsResponsesFuture.get()
        playgroundSettingsResponses.forEach { it.validate() }
    }
}

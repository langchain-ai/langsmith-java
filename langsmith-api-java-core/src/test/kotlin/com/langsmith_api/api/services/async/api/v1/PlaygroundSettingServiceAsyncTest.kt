// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.models.api.v1.playgroundsettings.PlaygroundSavedOptions
import com.langsmith_api.api.models.api.v1.playgroundsettings.PlaygroundSettingPlaygroundSettingsParams
import com.langsmith_api.api.models.api.v1.playgroundsettings.PlaygroundSettingUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PlaygroundSettingServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val playgroundSettingServiceAsync = client.api().v1().playgroundSettings()

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
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val playgroundSettingServiceAsync = client.api().v1().playgroundSettings()

        val playgroundSettingFuture = playgroundSettingServiceAsync.delete("playground_settings_id")

        val playgroundSetting = playgroundSettingFuture.get()
        playgroundSetting.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun playgroundSettings() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val playgroundSettingServiceAsync = client.api().v1().playgroundSettings()

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
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val playgroundSettingServiceAsync = client.api().v1().playgroundSettings()

        val playgroundSettingsResponsesFuture =
            playgroundSettingServiceAsync.retrievePlaygroundSettings()

        val playgroundSettingsResponses = playgroundSettingsResponsesFuture.get()
        playgroundSettingsResponses.forEach { it.validate() }
    }
}

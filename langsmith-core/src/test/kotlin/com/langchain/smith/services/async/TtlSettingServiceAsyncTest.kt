// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.orgs.ttlsettings.TraceTier
import com.langchain.smith.models.orgs.ttlsettings.UpsertTtlSettingsRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TtlSettingServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveTtlSettings() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val ttlSettingServiceAsync = client.ttlSettings()

        val ttlSettingsFuture = ttlSettingServiceAsync.retrieveTtlSettings()

        val ttlSettings = ttlSettingsFuture.get()
        ttlSettings.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateTtlSettings() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val ttlSettingServiceAsync = client.ttlSettings()

        val ttlSettingsFuture =
            ttlSettingServiceAsync.updateTtlSettings(
                UpsertTtlSettingsRequest.builder()
                    .defaultTraceTier(TraceTier.LONGLIVED)
                    .applyToAllProjects(true)
                    .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val ttlSettings = ttlSettingsFuture.get()
        ttlSettings.validate()
    }
}

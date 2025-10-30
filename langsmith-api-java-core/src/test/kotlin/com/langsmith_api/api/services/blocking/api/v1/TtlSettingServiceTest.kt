// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClient
import com.langsmith_api.api.models.api.v1.orgs.ttlsettings.TraceTier
import com.langsmith_api.api.models.api.v1.orgs.ttlsettings.UpsertTtlSettingsRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TtlSettingServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveTtlSettings() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val ttlSettingService = client.api().v1().ttlSettings()

        val ttlSettings = ttlSettingService.retrieveTtlSettings()

        ttlSettings.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateTtlSettings() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val ttlSettingService = client.api().v1().ttlSettings()

        val ttlSettings =
            ttlSettingService.updateTtlSettings(
                UpsertTtlSettingsRequest.builder()
                    .defaultTraceTier(TraceTier.LONGLIVED)
                    .applyToAllProjects(true)
                    .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        ttlSettings.validate()
    }
}

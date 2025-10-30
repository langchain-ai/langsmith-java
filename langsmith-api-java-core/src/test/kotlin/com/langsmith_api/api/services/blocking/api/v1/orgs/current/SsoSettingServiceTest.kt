// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.orgs.current

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClient
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.models.api.v1.orgs.current.ssosettings.SsoSettingSsoSettingsParams
import com.langsmith_api.api.models.api.v1.orgs.current.ssosettings.SsoSettingUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SsoSettingServiceTest {

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
        val ssoSettingService = client.api().v1().orgs().current().ssoSettings()

        val ssoProvider =
            ssoSettingService.update(
                SsoSettingUpdateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addDefaultWorkspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .defaultWorkspaceRoleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .metadataUrl("metadata_url")
                    .metadataXml("metadata_xml")
                    .build()
            )

        ssoProvider.validate()
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
        val ssoSettingService = client.api().v1().orgs().current().ssoSettings()

        val ssoProvider = ssoSettingService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        ssoProvider.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveSsoSettings() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val ssoSettingService = client.api().v1().orgs().current().ssoSettings()

        val ssoProviders = ssoSettingService.retrieveSsoSettings()

        ssoProviders.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun ssoSettings() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val ssoSettingService = client.api().v1().orgs().current().ssoSettings()

        val ssoProvider =
            ssoSettingService.ssoSettings(
                SsoSettingSsoSettingsParams.builder()
                    .addDefaultWorkspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .defaultWorkspaceRoleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .attributeMapping(
                        SsoSettingSsoSettingsParams.AttributeMapping.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .metadataUrl("metadata_url")
                    .metadataXml("metadata_xml")
                    .build()
            )

        ssoProvider.validate()
    }
}

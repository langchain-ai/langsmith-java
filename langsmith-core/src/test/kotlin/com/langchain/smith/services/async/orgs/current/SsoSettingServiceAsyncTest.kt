// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.orgs.current

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.orgs.current.ssosettings.SsoSettingSsoSettingsParams
import com.langchain.smith.models.orgs.current.ssosettings.SsoSettingUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SsoSettingServiceAsyncTest {

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
        val ssoSettingServiceAsync = client.orgs().current().ssoSettings()

        val ssoProviderFuture =
            ssoSettingServiceAsync.update(
                SsoSettingUpdateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addDefaultWorkspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .defaultWorkspaceRoleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .metadataUrl("metadata_url")
                    .metadataXml("metadata_xml")
                    .build()
            )

        val ssoProvider = ssoProviderFuture.get()
        ssoProvider.validate()
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
        val ssoSettingServiceAsync = client.orgs().current().ssoSettings()

        val ssoProviderFuture =
            ssoSettingServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val ssoProvider = ssoProviderFuture.get()
        ssoProvider.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveSsoSettings() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val ssoSettingServiceAsync = client.orgs().current().ssoSettings()

        val ssoProvidersFuture = ssoSettingServiceAsync.retrieveSsoSettings()

        val ssoProviders = ssoProvidersFuture.get()
        ssoProviders.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun ssoSettings() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val ssoSettingServiceAsync = client.orgs().current().ssoSettings()

        val ssoProviderFuture =
            ssoSettingServiceAsync.ssoSettings(
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

        val ssoProvider = ssoProviderFuture.get()
        ssoProvider.validate()
    }
}

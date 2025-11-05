// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.settings.SettingHandleParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SettingServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val settingService = client.settings()

        val appHubCrudTenantsTenant = settingService.list()

        appHubCrudTenantsTenant.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun handle() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val settingService = client.settings()

        val appHubCrudTenantsTenant =
            settingService.handle(
                SettingHandleParams.builder().tenantHandle("tenant_handle").build()
            )

        appHubCrudTenantsTenant.validate()
    }
}

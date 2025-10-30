// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClient
import com.langsmith_api.api.models.api.v1.settings.SettingHandleParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SettingServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val settingService = client.api().v1().settings()

        val appHubCrudTenantsTenant = settingService.list()

        appHubCrudTenantsTenant.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun handle() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val settingService = client.api().v1().settings()

        val appHubCrudTenantsTenant =
            settingService.handle(
                SettingHandleParams.builder().tenantHandle("tenant_handle").build()
            )

        appHubCrudTenantsTenant.validate()
    }
}

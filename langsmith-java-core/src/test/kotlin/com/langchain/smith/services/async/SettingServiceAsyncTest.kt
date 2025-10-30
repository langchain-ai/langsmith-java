// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.settings.SettingHandleParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SettingServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val settingServiceAsync = client.settings()

        val appHubCrudTenantsTenantFuture = settingServiceAsync.list()

        val appHubCrudTenantsTenant = appHubCrudTenantsTenantFuture.get()
        appHubCrudTenantsTenant.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun handle() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val settingServiceAsync = client.settings()

        val appHubCrudTenantsTenantFuture =
            settingServiceAsync.handle(
                SettingHandleParams.builder().tenantHandle("tenant_handle").build()
            )

        val appHubCrudTenantsTenant = appHubCrudTenantsTenantFuture.get()
        appHubCrudTenantsTenant.validate()
    }
}

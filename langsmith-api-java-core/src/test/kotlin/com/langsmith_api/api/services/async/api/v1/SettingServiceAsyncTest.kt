// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import com.langsmith_api.api.models.api.v1.settings.SettingHandleParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SettingServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val settingServiceAsync = client.api().v1().settings()

        val appHubCrudTenantsTenantFuture = settingServiceAsync.list()

        val appHubCrudTenantsTenant = appHubCrudTenantsTenantFuture.get()
        appHubCrudTenantsTenant.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun handle() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val settingServiceAsync = client.api().v1().settings()

        val appHubCrudTenantsTenantFuture =
            settingServiceAsync.handle(
                SettingHandleParams.builder().tenantHandle("tenant_handle").build()
            )

        val appHubCrudTenantsTenant = appHubCrudTenantsTenantFuture.get()
        appHubCrudTenantsTenant.validate()
    }
}

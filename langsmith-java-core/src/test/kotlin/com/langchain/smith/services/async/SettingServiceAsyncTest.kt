// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SettingServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val settingServiceAsync = client.settings()

        val appHubCrudTenantsTenantFuture = settingServiceAsync.list()

        val appHubCrudTenantsTenant = appHubCrudTenantsTenantFuture.get()
        appHubCrudTenantsTenant.validate()
    }
}

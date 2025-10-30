// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import com.langsmith_api.api.models.api.v1.tenants.TenantCreateParams
import com.langsmith_api.api.models.api.v1.tenants.TenantListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TenantServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val tenantServiceAsync = client.api().v1().tenants()

        val appSchemasTenantFuture =
            tenantServiceAsync.create(
                TenantCreateParams.builder()
                    .displayName("display_name")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .isPersonal(true)
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tenantHandle("tenant_handle")
                    .build()
            )

        val appSchemasTenant = appSchemasTenantFuture.get()
        appSchemasTenant.validate()
    }

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
        val tenantServiceAsync = client.api().v1().tenants()

        val tenantForUsersFuture =
            tenantServiceAsync.list(
                TenantListParams.builder().includeDeleted(true).skipCreate(true).build()
            )

        val tenantForUsers = tenantForUsersFuture.get()
        tenantForUsers.forEach { it.validate() }
    }
}
